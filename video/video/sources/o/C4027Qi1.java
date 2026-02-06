package o;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C2672Co2;
import o.InterfaceC4245Sn2;

/* renamed from: o.Qi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4027Qi1<T> implements InterfaceC4245Sn2<T> {

    /* renamed from: o.Qi1$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC4245Sn2.b<T> {
        public static final int f = 1;
        public static final int g = 2;
        public static final int h = 3;
        public final c a = new c();
        public final Handler b = new Handler(Looper.getMainLooper());
        public Runnable c = new RunnableC0225a();
        public final /* synthetic */ InterfaceC4245Sn2.b d;

        /* renamed from: o.Qi1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0225a implements Runnable {
            public RunnableC0225a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d a = a.this.a.a();
                while (a != null) {
                    int i = a.b;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                Log.e("ThreadUtil", "Unsupported message, what=" + a.b);
                            } else {
                                a.this.d.b(a.c, a.d);
                            }
                        } else {
                            a.this.d.a(a.c, (C2672Co2.a) a.h);
                        }
                    } else {
                        a.this.d.c(a.c, a.d);
                    }
                    a = a.this.a.a();
                }
            }
        }

        public a(InterfaceC4245Sn2.b bVar) {
            this.d = bVar;
        }

        @Override // o.InterfaceC4245Sn2.b
        public void a(int i, C2672Co2.a<T> aVar) {
            d(d.c(2, i, aVar));
        }

        @Override // o.InterfaceC4245Sn2.b
        public void b(int i, int i2) {
            d(d.a(3, i, i2));
        }

        @Override // o.InterfaceC4245Sn2.b
        public void c(int i, int i2) {
            d(d.a(1, i, i2));
        }

        public final void d(d dVar) {
            this.a.c(dVar);
            this.b.post(this.c);
        }
    }

    /* renamed from: o.Qi1$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC4245Sn2.a<T> {
        public static final int g = 1;
        public static final int h = 2;
        public static final int i = 3;
        public static final int j = 4;
        public final c a = new c();
        public final Executor b = AsyncTask.THREAD_POOL_EXECUTOR;
        public AtomicBoolean c = new AtomicBoolean(false);
        public Runnable d = new a();
        public final /* synthetic */ InterfaceC4245Sn2.a e;

        /* renamed from: o.Qi1$b$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    d a = b.this.a.a();
                    if (a == null) {
                        b.this.c.set(false);
                        return;
                    }
                    int i = a.b;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    Log.e("ThreadUtil", "Unsupported message, what=" + a.b);
                                } else {
                                    b.this.e.a((C2672Co2.a) a.h);
                                }
                            } else {
                                b.this.e.c(a.c, a.d);
                            }
                        } else {
                            b.this.a.b(2);
                            b.this.a.b(3);
                            b.this.e.b(a.c, a.d, a.e, a.f, a.g);
                        }
                    } else {
                        b.this.a.b(1);
                        b.this.e.d(a.c);
                    }
                }
            }
        }

        public b(InterfaceC4245Sn2.a aVar) {
            this.e = aVar;
        }

        @Override // o.InterfaceC4245Sn2.a
        public void a(C2672Co2.a<T> aVar) {
            f(d.c(4, 0, aVar));
        }

        @Override // o.InterfaceC4245Sn2.a
        public void b(int i2, int i3, int i4, int i5, int i6) {
            g(d.b(2, i2, i3, i4, i5, i6, null));
        }

        @Override // o.InterfaceC4245Sn2.a
        public void c(int i2, int i3) {
            f(d.a(3, i2, i3));
        }

        @Override // o.InterfaceC4245Sn2.a
        public void d(int i2) {
            g(d.c(1, i2, null));
        }

        public final void e() {
            if (this.c.compareAndSet(false, true)) {
                this.b.execute(this.d);
            }
        }

        public final void f(d dVar) {
            this.a.c(dVar);
            e();
        }

        public final void g(d dVar) {
            this.a.d(dVar);
            e();
        }
    }

    /* renamed from: o.Qi1$c */
    /* loaded from: classes.dex */
    public static class c {
        public d a;
        public final Object b = new Object();

        public d a() {
            synchronized (this.b) {
                try {
                    d dVar = this.a;
                    if (dVar == null) {
                        return null;
                    }
                    this.a = dVar.a;
                    return dVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b(int i) {
            d dVar;
            synchronized (this.b) {
                while (true) {
                    try {
                        dVar = this.a;
                        if (dVar == null || dVar.b != i) {
                            break;
                        }
                        this.a = dVar.a;
                        dVar.d();
                    } finally {
                    }
                }
                if (dVar != null) {
                    d dVar2 = dVar.a;
                    while (dVar2 != null) {
                        d dVar3 = dVar2.a;
                        if (dVar2.b == i) {
                            dVar.a = dVar3;
                            dVar2.d();
                        } else {
                            dVar = dVar2;
                        }
                        dVar2 = dVar3;
                    }
                }
            }
        }

        public void c(d dVar) {
            synchronized (this.b) {
                try {
                    d dVar2 = this.a;
                    if (dVar2 == null) {
                        this.a = dVar;
                        return;
                    }
                    while (true) {
                        d dVar3 = dVar2.a;
                        if (dVar3 != null) {
                            dVar2 = dVar3;
                        } else {
                            dVar2.a = dVar;
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void d(d dVar) {
            synchronized (this.b) {
                dVar.a = this.a;
                this.a = dVar;
            }
        }
    }

    /* renamed from: o.Qi1$d */
    /* loaded from: classes.dex */
    public static class d {
        public static d i;
        public static final Object j = new Object();
        public d a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public Object h;

        public static d a(int i2, int i3, int i4) {
            return b(i2, i3, i4, 0, 0, 0, null);
        }

        public static d b(int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
            d dVar;
            synchronized (j) {
                try {
                    dVar = i;
                    if (dVar == null) {
                        dVar = new d();
                    } else {
                        i = dVar.a;
                        dVar.a = null;
                    }
                    dVar.b = i2;
                    dVar.c = i3;
                    dVar.d = i4;
                    dVar.e = i5;
                    dVar.f = i6;
                    dVar.g = i7;
                    dVar.h = obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dVar;
        }

        public static d c(int i2, int i3, Object obj) {
            return b(i2, i3, 0, 0, 0, 0, obj);
        }

        public void d() {
            this.a = null;
            this.g = 0;
            this.f = 0;
            this.e = 0;
            this.d = 0;
            this.c = 0;
            this.b = 0;
            this.h = null;
            synchronized (j) {
                try {
                    d dVar = i;
                    if (dVar != null) {
                        this.a = dVar;
                    }
                    i = this;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // o.InterfaceC4245Sn2
    public InterfaceC4245Sn2.a<T> a(InterfaceC4245Sn2.a<T> aVar) {
        return new b(aVar);
    }

    @Override // o.InterfaceC4245Sn2
    public InterfaceC4245Sn2.b<T> b(InterfaceC4245Sn2.b<T> bVar) {
        return new a(bVar);
    }
}
