package o;

import android.util.Range;
import androidx.camera.core.m;
import o.C3597Ly;
import o.HJ;
import o.InterfaceC3063Gl2;
import o.InterfaceC6986iD2;
import o.InterfaceC7470kD2;
import o.T12;

/* renamed from: o.hD2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6743hD2<T extends androidx.camera.core.m> extends InterfaceC3063Gl2<T>, InterfaceC7470kD2, InterfaceC5070aN0 {
    public static final HJ.a<Boolean> G;
    public static final HJ.a<Boolean> H;
    public static final HJ.a<InterfaceC6986iD2.b> I;
    public static final HJ.a<T12> z = HJ.a.a("camerax.core.useCase.defaultSessionConfig", T12.class);
    public static final HJ.a<C3597Ly> A = HJ.a.a("camerax.core.useCase.defaultCaptureConfig", C3597Ly.class);
    public static final HJ.a<T12.d> B = HJ.a.a("camerax.core.useCase.sessionConfigUnpacker", T12.d.class);
    public static final HJ.a<C3597Ly.b> C = HJ.a.a("camerax.core.useCase.captureConfigUnpacker", C3597Ly.b.class);
    public static final HJ.a<Integer> D = HJ.a.a("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);
    public static final HJ.a<C2898Ex> E = HJ.a.a("camerax.core.useCase.cameraSelector", C2898Ex.class);
    public static final HJ.a<Range<Integer>> F = HJ.a.a("camerax.core.useCase.targetFrameRate", Range.class);

    /* renamed from: o.hD2$a */
    /* loaded from: classes.dex */
    public interface a<T extends androidx.camera.core.m, C extends InterfaceC6743hD2<T>, B> extends InterfaceC3063Gl2.a<T, B>, InterfaceC10288vj0<T>, InterfaceC7470kD2.a<B> {
        B a(boolean z);

        B b(C2898Ex c2898Ex);

        B d(T12.d dVar);

        B i(C3597Ly.b bVar);

        B j(T12 t12);

        B n(boolean z);

        C t();

        B v(C3597Ly c3597Ly);

        B x(InterfaceC6986iD2.b bVar);

        B y(int i);
    }

    static {
        Class cls = Boolean.TYPE;
        G = HJ.a.a("camerax.core.useCase.zslDisabled", cls);
        H = HJ.a.a("camerax.core.useCase.highResolutionDisabled", cls);
        I = HJ.a.a("camerax.core.useCase.captureType", InterfaceC6986iD2.b.class);
    }

    default Range<Integer> E(Range<Integer> range) {
        return (Range) h(F, range);
    }

    default C2898Ex F(C2898Ex c2898Ex) {
        return (C2898Ex) h(E, c2898Ex);
    }

    default int H(int i) {
        return ((Integer) h(D, Integer.valueOf(i))).intValue();
    }

    default C3597Ly.b K(C3597Ly.b bVar) {
        return (C3597Ly.b) h(C, bVar);
    }

    default C3597Ly.b S() {
        return (C3597Ly.b) j(C);
    }

    default boolean U(boolean z2) {
        return ((Boolean) h(H, Boolean.valueOf(z2))).booleanValue();
    }

    default T12 Y() {
        return (T12) j(z);
    }

    default boolean Z(boolean z2) {
        return ((Boolean) h(G, Boolean.valueOf(z2))).booleanValue();
    }

    default int a0() {
        return ((Integer) j(D)).intValue();
    }

    default C2898Ex b() {
        return (C2898Ex) j(E);
    }

    default T12.d b0() {
        return (T12.d) j(B);
    }

    default InterfaceC6986iD2.b g0() {
        return (InterfaceC6986iD2.b) j(I);
    }

    default C3597Ly i0() {
        return (C3597Ly) j(A);
    }

    default C3597Ly q(C3597Ly c3597Ly) {
        return (C3597Ly) h(A, c3597Ly);
    }

    default Range<Integer> s() {
        return (Range) j(F);
    }

    default T12.d y(T12.d dVar) {
        return (T12.d) h(B, dVar);
    }

    default T12 z(T12 t12) {
        return (T12) h(z, t12);
    }
}
