package o;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* renamed from: o.eT0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6064eT0<T> extends ThreadPoolExecutor implements Spliterator<T>, AutoCloseable {
    public final BlockingQueue<C10344vw1<T>> X;
    public final BlockingQueue<C10344vw1<NR>> Y;
    public InterfaceC7664l11<Long, NR> Y0;
    public ConcurrentNavigableMap<Long, T> Z;
    public M4<T> Z0;
    public final SortedSet<Long> a1;
    public final boolean b1;
    public final Locale c1;
    public Throwable d1;

    public C6064eT0(boolean z, Locale locale) {
        super(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
        this.X = new LinkedBlockingQueue();
        this.Y = new LinkedBlockingQueue();
        this.Z = null;
        this.Y0 = null;
        this.Z0 = null;
        this.a1 = new ConcurrentSkipListSet();
        this.b1 = z;
        this.c1 = (Locale) C11304zt1.t(locale, Locale.getDefault());
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th != null) {
            if (th.getCause() != null) {
                this.d1 = th.getCause();
            } else {
                this.d1 = th;
            }
            shutdownNow();
        }
    }

    public int characteristics() {
        if (this.Z0 != null) {
            return 4368;
        }
        return 4352;
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        C2695Cu1.a(this);
    }

    public long estimateSize() {
        int size;
        if (this.Z0 == null) {
            size = this.X.size();
        } else {
            size = this.Z.size();
        }
        return size;
    }

    public final boolean f() {
        h();
        boolean z = false;
        while (!z && !l()) {
            if (this.Z0 == null) {
                if (this.X.isEmpty()) {
                    Thread.yield();
                }
                z = true;
            } else {
                if (this.Z.isEmpty()) {
                    Thread.yield();
                }
                z = true;
            }
            h();
        }
        if (this.Z0 == null) {
            if (this.X.isEmpty()) {
                return false;
            }
            return true;
        } else if (this.Z.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public void h() {
        Throwable th = this.d1;
        if (th != null) {
            if (th instanceof NR) {
                NR nr = (NR) th;
                throw new RuntimeException(String.format(ResourceBundle.getBundle(UI0.k, this.c1).getString("parsing.error.linenumber"), Long.valueOf(nr.b()), M80.a(",", C4206Se.G2(nr.a()))), nr);
            }
            throw new RuntimeException(this.d1);
        }
    }

    public void i() throws InterruptedException {
        shutdown();
        awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        M4<T> m4 = this.Z0;
        if (m4 != null) {
            m4.d(true);
            this.Z0.join();
        }
        if (this.d1 == null) {
            return;
        }
        throw new RejectedExecutionException();
    }

    public List<NR> j() {
        if (this.Y0 == null) {
            return (List) this.Y.stream().filter(new Predicate() { // from class: o.aT0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return Objects.nonNull((C10344vw1) obj);
                }
            }).map(new Function() { // from class: o.bT0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (NR) ((C10344vw1) obj).a();
                }
            }).collect(Collectors.toList());
        }
        final LinkedList linkedList = new LinkedList();
        synchronized (this.Y0) {
            this.Y0.keySet().stream().sorted().forEach(new Consumer() { // from class: o.cT0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    linkedList.addAll(C6064eT0.this.Y0.get((InterfaceC7664l11<Long, NR>) ((Long) obj)));
                }
            });
        }
        return linkedList;
    }

    public Throwable k() {
        return this.d1;
    }

    public final boolean l() {
        if (isTerminated()) {
            M4<T> m4 = this.Z0;
            if (m4 == null || !m4.isAlive()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void m() {
        prestartAllCoreThreads();
        if (this.b1) {
            this.Z = new ConcurrentSkipListMap();
            this.Y0 = new C11242ze();
            M4<T> m4 = new M4<>(this.X, this.Y, this.a1, this.Z, this.Y0);
            this.Z0 = m4;
            m4.start();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        M4<T> m4 = this.Z0;
        if (m4 != null) {
            m4.d(true);
            try {
                this.Z0.join();
            } catch (InterruptedException unused) {
            }
        }
        return super.shutdownNow();
    }

    public boolean tryAdvance(Consumer<? super T> consumer) {
        T t = (Object) null;
        if (f()) {
            if (this.Z0 == null) {
                C10344vw1<T> poll = this.X.poll();
                if (poll != null) {
                    t = poll.a();
                }
            } else {
                Map.Entry<Long, T> pollFirstEntry = this.Z.pollFirstEntry();
                if (pollFirstEntry != null) {
                    t = pollFirstEntry.getValue();
                }
            }
            if (t != null) {
                consumer.accept(t);
            }
        }
        if (t != null) {
            return true;
        }
        return false;
    }

    public Spliterator<T> trySplit() {
        ArrayList arrayList;
        if (f()) {
            if (l()) {
                if (this.Z0 == null) {
                    return this.X.stream().map(new Function() { // from class: o.dT0
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((C10344vw1) obj).a();
                        }
                    }).spliterator();
                }
                return this.Z.values().spliterator();
            }
            int i = 0;
            if (this.Z0 == null) {
                int size = this.X.size();
                arrayList = new ArrayList(size);
                while (i < size) {
                    C10344vw1<T> poll = this.X.poll();
                    if (poll != null) {
                        arrayList.add(poll.a());
                    }
                    i++;
                }
            } else {
                int size2 = this.Z.size();
                arrayList = new ArrayList(size2);
                while (i < size2) {
                    Map.Entry<Long, T> pollFirstEntry = this.Z.pollFirstEntry();
                    if (pollFirstEntry != null) {
                        arrayList.add(pollFirstEntry.getValue());
                    }
                    i++;
                }
            }
            return arrayList.spliterator();
        }
        return null;
    }
}
