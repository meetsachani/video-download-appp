package o;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import o.C3679Mt;

/* loaded from: classes.dex */
public class S01<V> implements InterfaceFutureC8411o11<List<V>> {
    public List<? extends InterfaceFutureC8411o11<? extends V>> X;
    public List<V> Y;
    public final AtomicInteger Y0;
    public final boolean Z;
    public final InterfaceFutureC8411o11<List<V>> Z0 = C3679Mt.a(new a());
    public C3679Mt.a<List<V>> a1;

    /* loaded from: classes.dex */
    public class a implements C3679Mt.c<List<V>> {
        public a() {
        }

        @Override // o.C3679Mt.c
        public Object a(C3679Mt.a<List<V>> aVar) {
            boolean z;
            if (S01.this.a1 == null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.o(z, "The result can only set once!");
            S01.this.a1 = aVar;
            return "ListFuture[" + this + C6566gU0.g;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            S01 s01 = S01.this;
            s01.Y = null;
            s01.X = null;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ int X;
        public final /* synthetic */ InterfaceFutureC8411o11 Y;

        public c(int i, InterfaceFutureC8411o11 interfaceFutureC8411o11) {
            this.X = i;
            this.Y = interfaceFutureC8411o11;
        }

        @Override // java.lang.Runnable
        public void run() {
            S01.this.e(this.X, this.Y);
        }
    }

    public S01(List<? extends InterfaceFutureC8411o11<? extends V>> list, boolean z, Executor executor) {
        this.X = (List) C10907yF1.l(list);
        this.Y = new ArrayList(list.size());
        this.Z = z;
        this.Y0 = new AtomicInteger(list.size());
        d(executor);
    }

    public final void a() throws InterruptedException {
        List<? extends InterfaceFutureC8411o11<? extends V>> list = this.X;
        if (list != null && !isDone()) {
            for (InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11 : list) {
                while (!interfaceFutureC8411o11.isDone()) {
                    try {
                        interfaceFutureC8411o11.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.Z) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    /* renamed from: b */
    public List<V> get() throws InterruptedException, ExecutionException {
        a();
        return this.Z0.get();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: c */
    public List<V> get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.Z0.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        List<? extends InterfaceFutureC8411o11<? extends V>> list = this.X;
        if (list != null) {
            for (InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11 : list) {
                interfaceFutureC8411o11.cancel(z);
            }
        }
        return this.Z0.cancel(z);
    }

    public final void d(Executor executor) {
        h4(new b(), C5211ay.b());
        if (this.X.isEmpty()) {
            this.a1.c(new ArrayList(this.Y));
            return;
        }
        for (int i = 0; i < this.X.size(); i++) {
            this.Y.add(null);
        }
        List<? extends InterfaceFutureC8411o11<? extends V>> list = this.X;
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11 = list.get(i2);
            interfaceFutureC8411o11.h4(new c(i2, interfaceFutureC8411o11), executor);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(int i, Future<? extends V> future) {
        C3679Mt.a<List<V>> aVar;
        ArrayList arrayList;
        List<V> list = this.Y;
        if (!isDone() && list != 0) {
            boolean z = true;
            try {
                try {
                    try {
                        try {
                            try {
                                C10907yF1.o(future.isDone(), "Tried to set value from future which is not done");
                                list.set(i, C7221jC0.e(future));
                                int decrementAndGet = this.Y0.decrementAndGet();
                                if (decrementAndGet < 0) {
                                    z = false;
                                }
                                C10907yF1.o(z, "Less than 0 remaining futures");
                                if (decrementAndGet == 0) {
                                    List<V> list2 = this.Y;
                                    if (list2 != null) {
                                        this.a1.c(new ArrayList(list2));
                                        return;
                                    } else {
                                        C10907yF1.n(isDone());
                                        return;
                                    }
                                }
                                return;
                            } catch (RuntimeException e) {
                                if (this.Z) {
                                    this.a1.f(e);
                                }
                                int decrementAndGet2 = this.Y0.decrementAndGet();
                                if (decrementAndGet2 < 0) {
                                    z = false;
                                }
                                C10907yF1.o(z, "Less than 0 remaining futures");
                                if (decrementAndGet2 == 0) {
                                    List<V> list3 = this.Y;
                                    if (list3 != null) {
                                        aVar = this.a1;
                                        arrayList = new ArrayList(list3);
                                        aVar.c(arrayList);
                                        return;
                                    }
                                    C10907yF1.n(isDone());
                                    return;
                                }
                                return;
                            }
                        } catch (Error e2) {
                            this.a1.f(e2);
                            int decrementAndGet3 = this.Y0.decrementAndGet();
                            if (decrementAndGet3 < 0) {
                                z = false;
                            }
                            C10907yF1.o(z, "Less than 0 remaining futures");
                            if (decrementAndGet3 == 0) {
                                List<V> list4 = this.Y;
                                if (list4 != null) {
                                    aVar = this.a1;
                                    arrayList = new ArrayList(list4);
                                    aVar.c(arrayList);
                                    return;
                                }
                                C10907yF1.n(isDone());
                                return;
                            }
                            return;
                        }
                    } catch (CancellationException unused) {
                        if (this.Z) {
                            cancel(false);
                        }
                        int decrementAndGet4 = this.Y0.decrementAndGet();
                        if (decrementAndGet4 < 0) {
                            z = false;
                        }
                        C10907yF1.o(z, "Less than 0 remaining futures");
                        if (decrementAndGet4 == 0) {
                            List<V> list5 = this.Y;
                            if (list5 != null) {
                                aVar = this.a1;
                                arrayList = new ArrayList(list5);
                                aVar.c(arrayList);
                                return;
                            }
                            C10907yF1.n(isDone());
                            return;
                        }
                        return;
                    }
                } catch (ExecutionException e3) {
                    if (this.Z) {
                        this.a1.f(e3.getCause());
                    }
                    int decrementAndGet5 = this.Y0.decrementAndGet();
                    if (decrementAndGet5 < 0) {
                        z = false;
                    }
                    C10907yF1.o(z, "Less than 0 remaining futures");
                    if (decrementAndGet5 == 0) {
                        List<V> list6 = this.Y;
                        if (list6 != null) {
                            aVar = this.a1;
                            arrayList = new ArrayList(list6);
                            aVar.c(arrayList);
                            return;
                        }
                        C10907yF1.n(isDone());
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                int decrementAndGet6 = this.Y0.decrementAndGet();
                if (decrementAndGet6 < 0) {
                    z = false;
                }
                C10907yF1.o(z, "Less than 0 remaining futures");
                if (decrementAndGet6 == 0) {
                    List<V> list7 = this.Y;
                    if (list7 != null) {
                        this.a1.c(new ArrayList(list7));
                    } else {
                        C10907yF1.n(isDone());
                    }
                }
                throw th;
            }
        }
        C10907yF1.o(this.Z, "Future was done before all dependencies completed");
    }

    @Override // o.InterfaceFutureC8411o11
    public void h4(Runnable runnable, Executor executor) {
        this.Z0.h4(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.Z0.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.Z0.isDone();
    }
}
