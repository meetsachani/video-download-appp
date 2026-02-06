package o;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.G12;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* loaded from: classes3.dex */
public abstract class X0 implements G12 {
    public final InterfaceC8331nh2<String> a = new c(this, null);
    public final G12 b = new b(this, null);

    /* loaded from: classes3.dex */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C3645Mk1.n((String) X0.this.a.get(), runnable).start();
        }
    }

    /* loaded from: classes3.dex */
    public final class b extends X2 {

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    X0.this.m();
                    b.this.u();
                } catch (Throwable th) {
                    b.this.t(th);
                }
            }
        }

        /* renamed from: o.X0$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0243b implements Runnable {
            public RunnableC0243b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    X0.this.l();
                    b.this.v();
                } catch (Throwable th) {
                    b.this.t(th);
                }
            }
        }

        public b() {
        }

        @Override // o.X2
        public final void m() {
            C3645Mk1.q(X0.this.j(), X0.this.a).execute(new a());
        }

        @Override // o.X2
        public final void n() {
            C3645Mk1.q(X0.this.j(), X0.this.a).execute(new RunnableC0243b());
        }

        @Override // o.X2
        public String toString() {
            return X0.this.toString();
        }

        public /* synthetic */ b(X0 x0, a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public final class c implements InterfaceC8331nh2<String> {
        public c() {
        }

        @Override // o.InterfaceC8331nh2
        /* renamed from: a */
        public String get() {
            String k = X0.this.k();
            String valueOf = String.valueOf(X0.this.state());
            StringBuilder sb = new StringBuilder(String.valueOf(k).length() + 1 + valueOf.length());
            sb.append(k);
            sb.append(C4500Ve2.b);
            sb.append(valueOf);
            return sb.toString();
        }

        public /* synthetic */ c(X0 x0, a aVar) {
            this();
        }
    }

    @Override // o.G12
    public final void a(G12.a aVar, Executor executor) {
        this.b.a(aVar, executor);
    }

    @Override // o.G12
    public final void b(long j, TimeUnit timeUnit) throws TimeoutException {
        this.b.b(j, timeUnit);
    }

    @Override // o.G12
    public final void c(long j, TimeUnit timeUnit) throws TimeoutException {
        this.b.c(j, timeUnit);
    }

    @Override // o.G12
    public final void d() {
        this.b.d();
    }

    @Override // o.G12
    @InterfaceC6181ey
    public final G12 e() {
        this.b.e();
        return this;
    }

    @Override // o.G12
    public final void f() {
        this.b.f();
    }

    @Override // o.G12
    public final Throwable g() {
        return this.b.g();
    }

    @Override // o.G12
    @InterfaceC6181ey
    public final G12 h() {
        this.b.h();
        return this;
    }

    @Override // o.G12
    public final boolean isRunning() {
        return this.b.isRunning();
    }

    public Executor j() {
        return new a();
    }

    public String k() {
        return getClass().getSimpleName();
    }

    public abstract void l() throws Exception;

    public abstract void m() throws Exception;

    @Override // o.G12
    public final G12.b state() {
        return this.b.state();
    }

    public String toString() {
        String k = k();
        String valueOf = String.valueOf(state());
        StringBuilder sb = new StringBuilder(String.valueOf(k).length() + 3 + valueOf.length());
        sb.append(k);
        sb.append(" [");
        sb.append(valueOf);
        sb.append(C6566gU0.g);
        return sb.toString();
    }
}
