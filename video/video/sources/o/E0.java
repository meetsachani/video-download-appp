package o;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;
import o.G12;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* loaded from: classes3.dex */
public abstract class E0 implements G12 {
    public static final Logger b = Logger.getLogger(E0.class.getName());
    public final G12 a = new a();

    /* loaded from: classes3.dex */
    public class a extends X2 {

        /* renamed from: o.E0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0177a implements InterfaceC8331nh2<String> {
            public C0177a() {
            }

            @Override // o.InterfaceC8331nh2
            /* renamed from: a */
            public String get() {
                return E0.this.l();
            }
        }

        /* loaded from: classes3.dex */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    E0.this.n();
                    a.this.u();
                    if (a.this.isRunning()) {
                        E0.this.k();
                    }
                    E0.this.m();
                    a.this.v();
                } catch (Throwable th) {
                    a.this.t(th);
                }
            }
        }

        public a() {
        }

        @Override // o.X2
        public final void m() {
            C3645Mk1.q(E0.this.j(), new C0177a()).execute(new b());
        }

        @Override // o.X2
        public void n() {
            E0.this.o();
        }

        @Override // o.X2
        public String toString() {
            return E0.this.toString();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Executor {
        public b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C3645Mk1.n(E0.this.l(), runnable).start();
        }
    }

    public static /* synthetic */ Logger i() {
        return b;
    }

    @Override // o.G12
    public final void a(G12.a aVar, Executor executor) {
        this.a.a(aVar, executor);
    }

    @Override // o.G12
    public final void b(long j, TimeUnit timeUnit) throws TimeoutException {
        this.a.b(j, timeUnit);
    }

    @Override // o.G12
    public final void c(long j, TimeUnit timeUnit) throws TimeoutException {
        this.a.c(j, timeUnit);
    }

    @Override // o.G12
    public final void d() {
        this.a.d();
    }

    @Override // o.G12
    @InterfaceC6181ey
    public final G12 e() {
        this.a.e();
        return this;
    }

    @Override // o.G12
    public final void f() {
        this.a.f();
    }

    @Override // o.G12
    public final Throwable g() {
        return this.a.g();
    }

    @Override // o.G12
    @InterfaceC6181ey
    public final G12 h() {
        this.a.h();
        return this;
    }

    @Override // o.G12
    public final boolean isRunning() {
        return this.a.isRunning();
    }

    public Executor j() {
        return new b();
    }

    public abstract void k() throws Exception;

    public String l() {
        return getClass().getSimpleName();
    }

    @Override // o.G12
    public final G12.b state() {
        return this.a.state();
    }

    public String toString() {
        String l = l();
        String valueOf = String.valueOf(state());
        StringBuilder sb = new StringBuilder(String.valueOf(l).length() + 3 + valueOf.length());
        sb.append(l);
        sb.append(" [");
        sb.append(valueOf);
        sb.append(C6566gU0.g);
        return sb.toString();
    }

    public void m() throws Exception {
    }

    public void n() throws Exception {
    }

    @InterfaceC4238Sm
    public void o() {
    }
}
