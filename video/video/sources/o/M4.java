package o;

import java.util.SortedSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public class M4<T> extends Thread {
    public final BlockingQueue<C10344vw1<T>> X;
    public final BlockingQueue<C10344vw1<NR>> Y;
    public final ConcurrentMap<Long, T> Y0;
    public final SortedSet<Long> Z;
    public boolean Z0 = false;
    public final InterfaceC7664l11<Long, NR> a1;

    public M4(BlockingQueue<C10344vw1<T>> blockingQueue, BlockingQueue<C10344vw1<NR>> blockingQueue2, SortedSet<Long> sortedSet, ConcurrentMap<Long, T> concurrentMap, InterfaceC7664l11<Long, NR> interfaceC7664l11) {
        this.X = blockingQueue;
        this.Y = blockingQueue2;
        this.Z = sortedSet;
        this.Y0 = concurrentMap;
        this.a1 = interfaceC7664l11;
    }

    public static /* synthetic */ boolean a(M4 m4, C10344vw1 c10344vw1) {
        return m4.Z.first().equals(Long.valueOf(c10344vw1.b()));
    }

    public static /* synthetic */ boolean b(M4 m4, C10344vw1 c10344vw1) {
        return m4.Z.first().equals(Long.valueOf(c10344vw1.b()));
    }

    public final synchronized boolean c() {
        return this.Z0;
    }

    public synchronized void d(boolean z) {
        this.Z0 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x003b -> B:56:0x003c). Please submit an issue!!! */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        C10344vw1<T> c10344vw1;
        while (true) {
            if (c() && this.X.isEmpty() && this.Y.isEmpty()) {
                return;
            }
            if (!this.Z.isEmpty()) {
                c10344vw1 = this.X.stream().filter(new Predicate() { // from class: o.K4
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return M4.b(M4.this, (C10344vw1) obj);
                    }
                }).findAny().orElse(null);
                while (c10344vw1 != null) {
                    this.X.remove(c10344vw1);
                    SortedSet<Long> sortedSet = this.Z;
                    sortedSet.remove(sortedSet.first());
                    this.Y0.put(Long.valueOf(c10344vw1.b()), c10344vw1.a());
                    if (!this.Z.isEmpty()) {
                        c10344vw1 = this.X.stream().filter(new Predicate() { // from class: o.L4
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return M4.a(M4.this, (C10344vw1) obj);
                            }
                        }).findAny().orElse(null);
                    }
                }
                while (!this.Y.isEmpty()) {
                    C10344vw1<NR> poll = this.Y.poll();
                    if (poll != null) {
                        synchronized (this.a1) {
                            this.a1.put(Long.valueOf(poll.b()), poll.a());
                        }
                    }
                }
                Thread.yield();
            }
            c10344vw1 = null;
            while (c10344vw1 != null) {
            }
            while (!this.Y.isEmpty()) {
            }
            Thread.yield();
        }
    }
}
