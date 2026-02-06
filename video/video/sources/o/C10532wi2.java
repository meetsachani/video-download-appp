package o;

import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: o.wi2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10532wi2 implements InterfaceC8822pi2 {
    public static final String Y0 = "SurfaceProcessor";
    public final InterfaceC8579oi2 X;
    public final Executor Y;
    public final InterfaceC10929yL<Throwable> Z;

    public C10532wi2(AbstractC4078Qw abstractC4078Qw) {
        InterfaceC8579oi2 e = abstractC4078Qw.e();
        Objects.requireNonNull(e);
        this.X = e;
        this.Y = abstractC4078Qw.c();
        this.Z = abstractC4078Qw.b();
    }

    public static /* synthetic */ void d(C10532wi2 c10532wi2, InterfaceC7588ki2 interfaceC7588ki2) {
        c10532wi2.getClass();
        try {
            c10532wi2.X.b(interfaceC7588ki2);
        } catch (C7993mI1 e) {
            C7433k41.d(Y0, "Failed to setup SurfaceProcessor output.", e);
            c10532wi2.Z.accept(e);
        }
    }

    public static /* synthetic */ void e(C10532wi2 c10532wi2, C3051Gi2 c3051Gi2) {
        c10532wi2.getClass();
        try {
            c10532wi2.X.a(c3051Gi2);
        } catch (C7993mI1 e) {
            C7433k41.d(Y0, "Failed to setup SurfaceProcessor input.", e);
            c10532wi2.Z.accept(e);
        }
    }

    @Override // o.InterfaceC8579oi2
    public void a(final C3051Gi2 c3051Gi2) {
        this.Y.execute(new Runnable() { // from class: o.ui2
            @Override // java.lang.Runnable
            public final void run() {
                C10532wi2.e(C10532wi2.this, c3051Gi2);
            }
        });
    }

    @Override // o.InterfaceC8579oi2
    public void b(final InterfaceC7588ki2 interfaceC7588ki2) {
        this.Y.execute(new Runnable() { // from class: o.vi2
            @Override // java.lang.Runnable
            public final void run() {
                C10532wi2.d(C10532wi2.this, interfaceC7588ki2);
            }
        });
    }

    @Override // o.InterfaceC8822pi2
    public InterfaceFutureC8411o11<Void> c(int i, int i2) {
        return C7221jC0.f(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    public Executor f() {
        return this.Y;
    }

    public InterfaceC8579oi2 h() {
        return this.X;
    }

    @Override // o.InterfaceC8822pi2
    public void g() {
    }
}
