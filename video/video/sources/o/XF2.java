package o;

import android.view.Surface;
import java.util.Objects;
import java.util.concurrent.Executor;
import o.C3051Gi2;
import o.C3679Mt;
import o.InterfaceC11231zb0;

/* loaded from: classes.dex */
public final class XF2 {
    public static final String n = "VideoEncoderSession";
    public final Executor a;
    public final Executor b;
    public final InterfaceC3119Hb0 c;
    public InterfaceC11231zb0 d = null;
    public Surface e = null;
    public C3051Gi2 f = null;
    public Executor g = null;
    public InterfaceC11231zb0.c.a h = null;
    public c i = c.NOT_INITIALIZED;
    public InterfaceFutureC8411o11<Void> j = C7221jC0.f(new IllegalStateException("Cannot close the encoder before configuring."));
    public C3679Mt.a<Void> k = null;
    public InterfaceFutureC8411o11<InterfaceC11231zb0> l = C7221jC0.f(new IllegalStateException("Cannot close the encoder before configuring."));
    public C3679Mt.a<InterfaceC11231zb0> m = null;

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.PENDING_RELEASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.RELEASED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    public XF2(InterfaceC3119Hb0 interfaceC3119Hb0, Executor executor, Executor executor2) {
        this.a = executor2;
        this.b = executor;
        this.c = interfaceC3119Hb0;
    }

    public static /* synthetic */ Object a(XF2 xf2, C3051Gi2 c3051Gi2, EnumC5905dp2 enumC5905dp2, VG2 vg2, AbstractC3242Ih1 abstractC3242Ih1, C3679Mt.a aVar) {
        xf2.j(c3051Gi2, enumC5905dp2, vg2, abstractC3242Ih1, aVar);
        return "ConfigureVideoEncoderFuture " + xf2;
    }

    public static /* synthetic */ Object d(XF2 xf2, C3679Mt.a aVar) {
        xf2.k = aVar;
        return "ReleasedFuture " + xf2;
    }

    public static /* synthetic */ Object f(XF2 xf2, C3679Mt.a aVar) {
        xf2.m = aVar;
        return "ReadyToReleaseFuture " + xf2;
    }

    public static /* synthetic */ void g(final XF2 xf2, C3679Mt.a aVar, C3051Gi2 c3051Gi2, final Surface surface) {
        Executor executor;
        xf2.getClass();
        int i = b.a[xf2.i.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("State " + xf2.i + " is not handled");
                    }
                } else {
                    if (xf2.h != null && (executor = xf2.g) != null) {
                        executor.execute(new Runnable() { // from class: o.WF2
                            @Override // java.lang.Runnable
                            public final void run() {
                                XF2.this.h.a(surface);
                            }
                        });
                    }
                    C7433k41.p(n, "Surface is updated in READY state: " + surface);
                    return;
                }
            } else if (c3051Gi2.s()) {
                C7433k41.a(n, "Not provide surface, " + Objects.toString(c3051Gi2, "EMPTY") + " is already serviced.");
                aVar.c(null);
                xf2.h();
                return;
            } else {
                xf2.e = surface;
                C7433k41.a(n, "provide surface: " + surface);
                c3051Gi2.t(surface, xf2.b, new InterfaceC10929yL() { // from class: o.VF2
                    @Override // o.InterfaceC10929yL
                    public final void accept(Object obj) {
                        XF2.this.o((C3051Gi2.g) obj);
                    }
                });
                xf2.i = c.READY;
                aVar.c(xf2.d);
                return;
            }
        }
        C7433k41.a(n, "Not provide surface in " + xf2.i);
        aVar.c(null);
    }

    public final void h() {
        int i = b.a[this.i.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i == 5) {
                    C7433k41.a(n, "closeInternal in RELEASED state, No-op");
                    return;
                }
                throw new IllegalStateException("State " + this.i + " is not handled");
            }
            C7433k41.a(n, "closeInternal in " + this.i + " state");
            this.i = c.PENDING_RELEASE;
            return;
        }
        r();
    }

    public InterfaceFutureC8411o11<InterfaceC11231zb0> i(final C3051Gi2 c3051Gi2, final EnumC5905dp2 enumC5905dp2, final AbstractC3242Ih1 abstractC3242Ih1, final VG2 vg2) {
        if (b.a[this.i.ordinal()] != 1) {
            return C7221jC0.f(new IllegalStateException("configure() shouldn't be called in " + this.i));
        }
        this.i = c.INITIALIZING;
        this.f = c3051Gi2;
        C7433k41.a(n, "Create VideoEncoderSession: " + this);
        this.j = C3679Mt.a(new C3679Mt.c() { // from class: o.SF2
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return XF2.d(XF2.this, aVar);
            }
        });
        this.l = C3679Mt.a(new C3679Mt.c() { // from class: o.TF2
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return XF2.f(XF2.this, aVar);
            }
        });
        InterfaceFutureC8411o11 a2 = C3679Mt.a(new C3679Mt.c() { // from class: o.UF2
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return XF2.a(XF2.this, c3051Gi2, enumC5905dp2, vg2, abstractC3242Ih1, aVar);
            }
        });
        C7221jC0.b(a2, new a(), this.b);
        return C7221jC0.i(a2);
    }

    public final void j(final C3051Gi2 c3051Gi2, EnumC5905dp2 enumC5905dp2, VG2 vg2, AbstractC3242Ih1 abstractC3242Ih1, final C3679Mt.a<InterfaceC11231zb0> aVar) {
        N80 n2 = c3051Gi2.n();
        try {
            InterfaceC11231zb0 a2 = this.c.a(this.a, C10422wF2.c(C10422wF2.d(abstractC3242Ih1, n2, vg2), enumC5905dp2, abstractC3242Ih1.d(), c3051Gi2.p(), n2, c3051Gi2.o()));
            this.d = a2;
            InterfaceC11231zb0.b a3 = a2.a();
            if (!(a3 instanceof InterfaceC11231zb0.c)) {
                aVar.f(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            } else {
                ((InterfaceC11231zb0.c) a3).e(this.b, new InterfaceC11231zb0.c.a() { // from class: o.QF2
                    @Override // o.InterfaceC11231zb0.c.a
                    public final void a(Surface surface) {
                        XF2.g(XF2.this, aVar, c3051Gi2, surface);
                    }
                });
            }
        } catch (C8279nT0 e) {
            C7433k41.d(n, "Unable to initialize video encoder.", e);
            aVar.f(e);
        }
    }

    public Surface k() {
        if (this.i != c.READY) {
            return null;
        }
        return this.e;
    }

    public InterfaceFutureC8411o11<InterfaceC11231zb0> l() {
        return C7221jC0.i(this.l);
    }

    public InterfaceC11231zb0 m() {
        return this.d;
    }

    public boolean n(C3051Gi2 c3051Gi2) {
        int i = b.a[this.i.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4 && i != 5) {
                    throw new IllegalStateException("State " + this.i + " is not handled");
                }
            } else if (this.f == c3051Gi2) {
                return true;
            }
        }
        return false;
    }

    public final void o(C3051Gi2.g gVar) {
        C7433k41.a(n, "Surface can be closed: " + gVar.b().hashCode());
        Surface b2 = gVar.b();
        if (b2 == this.e) {
            this.e = null;
            this.m.c(this.d);
            h();
            return;
        }
        b2.release();
    }

    public void p(Executor executor, InterfaceC11231zb0.c.a aVar) {
        this.g = executor;
        this.h = aVar;
    }

    public InterfaceFutureC8411o11<Void> q() {
        h();
        return C7221jC0.i(this.j);
    }

    public void r() {
        int i = b.a[this.i.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                if (i == 5) {
                    C7433k41.a(n, "terminateNow in " + this.i + ", No-op");
                    return;
                }
                throw new IllegalStateException("State " + this.i + " is not handled");
            }
            this.i = c.RELEASED;
            this.m.c(this.d);
            this.f = null;
            if (this.d != null) {
                C7433k41.a(n, "VideoEncoder is releasing: " + this.d);
                this.d.g();
                this.d.e().h4(new Runnable() { // from class: o.RF2
                    @Override // java.lang.Runnable
                    public final void run() {
                        XF2.this.k.c(null);
                    }
                }, this.b);
                this.d = null;
                return;
            }
            C7433k41.p(n, "There's no VideoEncoder to release! Finish release completer.");
            this.k.c(null);
            return;
        }
        this.i = c.RELEASED;
    }

    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }

    /* loaded from: classes.dex */
    public class a implements XB0<InterfaceC11231zb0> {
        public a() {
        }

        @Override // o.XB0
        public void b(Throwable th) {
            C7433k41.q(XF2.n, "VideoEncoder configuration failed.", th);
            XF2.this.r();
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(InterfaceC11231zb0 interfaceC11231zb0) {
        }
    }
}
