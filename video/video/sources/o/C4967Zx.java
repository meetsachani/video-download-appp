package o;

import android.os.Handler;
import java.util.UUID;
import java.util.concurrent.Executor;
import o.HJ;
import o.InterfaceC3063Gl2;
import o.InterfaceC3981Pw;
import o.InterfaceC5207ax;
import o.InterfaceC6986iD2;

/* renamed from: o.Zx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4967Zx implements InterfaceC3063Gl2<C4860Yx> {
    public static final HJ.a<InterfaceC5207ax.a> L = HJ.a.a("camerax.core.appConfig.cameraFactoryProvider", InterfaceC5207ax.a.class);
    public static final HJ.a<InterfaceC3981Pw.a> M = HJ.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", InterfaceC3981Pw.a.class);
    public static final HJ.a<InterfaceC6986iD2.c> N = HJ.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", InterfaceC6986iD2.c.class);
    public static final HJ.a<Executor> O = HJ.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);
    public static final HJ.a<Handler> P = HJ.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);
    public static final HJ.a<Integer> Q = HJ.a.a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);
    public static final HJ.a<C2898Ex> R = HJ.a.a("camerax.core.appConfig.availableCamerasLimiter", C2898Ex.class);
    public final C5932dw1 K;

    /* renamed from: o.Zx$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC3063Gl2.a<C4860Yx, a> {
        public final C2569Bn1 a;

        public a() {
            this(C2569Bn1.u0());
        }

        public static a e(C4967Zx c4967Zx) {
            return new a(C2569Bn1.v0(c4967Zx));
        }

        private InterfaceC3849Om1 f() {
            return this.a;
        }

        public C4967Zx c() {
            return new C4967Zx(C5932dw1.t0(this.a));
        }

        public a g(C2898Ex c2898Ex) {
            f().h0(C4967Zx.R, c2898Ex);
            return this;
        }

        public a h(Executor executor) {
            f().h0(C4967Zx.O, executor);
            return this;
        }

        public a l(InterfaceC5207ax.a aVar) {
            f().h0(C4967Zx.L, aVar);
            return this;
        }

        public a m(InterfaceC3981Pw.a aVar) {
            f().h0(C4967Zx.M, aVar);
            return this;
        }

        public a o(int i) {
            f().h0(C4967Zx.Q, Integer.valueOf(i));
            return this;
        }

        public a p(Handler handler) {
            f().h0(C4967Zx.P, handler);
            return this;
        }

        @Override // o.InterfaceC3063Gl2.a
        /* renamed from: r */
        public a q(Class<C4860Yx> cls) {
            f().h0(InterfaceC3063Gl2.x, cls);
            if (f().h(InterfaceC3063Gl2.w, null) == null) {
                k(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @Override // o.InterfaceC3063Gl2.a
        /* renamed from: s */
        public a k(String str) {
            f().h0(InterfaceC3063Gl2.w, str);
            return this;
        }

        public a u(InterfaceC6986iD2.c cVar) {
            f().h0(C4967Zx.N, cVar);
            return this;
        }

        public a(C2569Bn1 c2569Bn1) {
            this.a = c2569Bn1;
            Class cls = (Class) c2569Bn1.h(InterfaceC3063Gl2.x, null);
            if (cls != null && !cls.equals(C4860Yx.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            q(C4860Yx.class);
        }
    }

    /* renamed from: o.Zx$b */
    /* loaded from: classes.dex */
    public interface b {
        C4967Zx getCameraXConfig();
    }

    public C4967Zx(C5932dw1 c5932dw1) {
        this.K = c5932dw1;
    }

    @Override // o.CO1
    public HJ d() {
        return this.K;
    }

    public C2898Ex r0(C2898Ex c2898Ex) {
        return (C2898Ex) this.K.h(R, c2898Ex);
    }

    public Executor s0(Executor executor) {
        return (Executor) this.K.h(O, executor);
    }

    public InterfaceC5207ax.a t0(InterfaceC5207ax.a aVar) {
        return (InterfaceC5207ax.a) this.K.h(L, aVar);
    }

    public InterfaceC3981Pw.a u0(InterfaceC3981Pw.a aVar) {
        return (InterfaceC3981Pw.a) this.K.h(M, aVar);
    }

    public int v0() {
        return ((Integer) this.K.h(Q, 3)).intValue();
    }

    public Handler w0(Handler handler) {
        return (Handler) this.K.h(P, handler);
    }

    public InterfaceC6986iD2.c x0(InterfaceC6986iD2.c cVar) {
        return (InterfaceC6986iD2.c) this.K.h(N, cVar);
    }
}
