package o;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

@Deprecated
/* loaded from: classes2.dex */
public final class R11 implements T11 {
    public static final String d = "ExoPlayer:Loader:";
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final c i = i(false, C10323vs.b);
    public static final c j = i(true, C10323vs.b);
    public static final c k = new c(2, C10323vs.b);
    public static final c l = new c(3, C10323vs.b);
    public final ExecutorService a;
    @InterfaceC11300zs1
    public d<? extends e> b;
    @InterfaceC11300zs1
    public IOException c;

    /* loaded from: classes2.dex */
    public interface b<T extends e> {
        void M(T t, long j, long j2, boolean z);

        c N(T t, long j, long j2, IOException iOException, int i);

        void t(T t, long j, long j2);
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public final int a;
        public final long b;

        public boolean c() {
            int i = this.a;
            if (i == 0 || i == 1) {
                return true;
            }
            return false;
        }

        public c(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes2.dex */
    public final class d<T extends e> extends Handler implements Runnable {
        public static final String f1 = "LoadTask";
        public static final int g1 = 0;
        public static final int h1 = 1;
        public static final int i1 = 2;
        public static final int j1 = 3;
        public final int X;
        public final T Y;
        @InterfaceC11300zs1
        public b<T> Y0;
        public final long Z;
        @InterfaceC11300zs1
        public IOException Z0;
        public int a1;
        @InterfaceC11300zs1
        public Thread b1;
        public boolean c1;
        public volatile boolean d1;

        public d(Looper looper, T t, b<T> bVar, int i, long j) {
            super(looper);
            this.Y = t;
            this.Y0 = bVar;
            this.X = i;
            this.Z = j;
        }

        public void a(boolean z) {
            this.d1 = z;
            this.Z0 = null;
            if (hasMessages(0)) {
                this.c1 = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.c1 = true;
                        this.Y.c();
                        Thread thread = this.b1;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) C9542sf.g(this.Y0)).M(this.Y, elapsedRealtime, elapsedRealtime - this.Z, true);
                this.Y0 = null;
            }
        }

        public final void b() {
            this.Z0 = null;
            R11.this.a.execute((Runnable) C9542sf.g(R11.this.b));
        }

        public final void c() {
            R11.this.b = null;
        }

        public final long d() {
            return Math.min((this.a1 - 1) * 1000, 5000);
        }

        public void e(int i) throws IOException {
            IOException iOException = this.Z0;
            if (iOException != null && this.a1 > i) {
                throw iOException;
            }
        }

        public void f(long j) {
            boolean z;
            if (R11.this.b == null) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            R11.this.b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long d;
            if (!this.d1) {
                int i = message.what;
                if (i == 0) {
                    b();
                } else if (i != 3) {
                    c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.Z;
                    b bVar = (b) C9542sf.g(this.Y0);
                    if (this.c1) {
                        bVar.M(this.Y, elapsedRealtime, j, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            IOException iOException = (IOException) message.obj;
                            this.Z0 = iOException;
                            int i3 = this.a1 + 1;
                            this.a1 = i3;
                            c N = bVar.N(this.Y, elapsedRealtime, j, iOException, i3);
                            if (N.a == 3) {
                                R11.this.c = this.Z0;
                                return;
                            } else if (N.a != 2) {
                                if (N.a == 1) {
                                    this.a1 = 1;
                                }
                                if (N.b != C10323vs.b) {
                                    d = N.b;
                                } else {
                                    d = d();
                                }
                                f(d);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    try {
                        bVar.t(this.Y, elapsedRealtime, j);
                    } catch (RuntimeException e) {
                        I31.e(f1, "Unexpected exception handling load completed", e);
                        R11.this.c = new h(e);
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.c1;
                    this.b1 = Thread.currentThread();
                }
                if (!z) {
                    C7624kr2.a("load:" + this.Y.getClass().getSimpleName());
                    try {
                        this.Y.a();
                        C7624kr2.c();
                    } catch (Throwable th) {
                        C7624kr2.c();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.b1 = null;
                    Thread.interrupted();
                }
                if (!this.d1) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e) {
                if (!this.d1) {
                    obtainMessage(2, e).sendToTarget();
                }
            } catch (Exception e2) {
                if (!this.d1) {
                    I31.e(f1, "Unexpected exception loading stream", e2);
                    obtainMessage(2, new h(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                if (!this.d1) {
                    I31.e(f1, "OutOfMemory error loading stream", e3);
                    obtainMessage(2, new h(e3)).sendToTarget();
                }
            } catch (Error e4) {
                if (!this.d1) {
                    I31.e(f1, "Unexpected error loading stream", e4);
                    obtainMessage(3, e4).sendToTarget();
                }
                throw e4;
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        void a() throws IOException;

        void c();
    }

    /* loaded from: classes2.dex */
    public interface f {
        void l();
    }

    /* loaded from: classes2.dex */
    public static final class g implements Runnable {
        public final f X;

        public g(f fVar) {
            this.X = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.l();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends IOException {
        public h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public R11(String str) {
        this.a = TD2.k1(d + str);
    }

    public static c i(boolean z, long j2) {
        return new c(z ? 1 : 0, j2);
    }

    @Override // o.T11
    public void a(int i2) throws IOException {
        IOException iOException = this.c;
        if (iOException == null) {
            d<? extends e> dVar = this.b;
            if (dVar != null) {
                if (i2 == Integer.MIN_VALUE) {
                    i2 = dVar.X;
                }
                dVar.e(i2);
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // o.T11
    public void b() throws IOException {
        a(Integer.MIN_VALUE);
    }

    public void g() {
        ((d) C9542sf.k(this.b)).a(false);
    }

    public void h() {
        this.c = null;
    }

    public boolean j() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public void l() {
        m(null);
    }

    public void m(@InterfaceC11300zs1 f fVar) {
        d<? extends e> dVar = this.b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.a.execute(new g(fVar));
        }
        this.a.shutdown();
    }

    public <T extends e> long n(T t, b<T> bVar, int i2) {
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d((Looper) C9542sf.k(Looper.myLooper()), t, bVar, i2, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }
}
