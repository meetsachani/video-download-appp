package o;

import java.util.concurrent.Executor;
import o.HJ;

/* loaded from: classes.dex */
public final class BM0 implements InterfaceC6743hD2<androidx.camera.core.f>, InterfaceC6040eN0, FT0 {
    public static final HJ.a<Integer> L;
    public static final HJ.a<Integer> M;
    public static final HJ.a<InterfaceC3108Gy> N;
    public static final HJ.a<Integer> O;
    public static final HJ.a<Integer> P;
    public static final HJ.a<InterfaceC8742pN0> Q;
    public static final HJ.a<Boolean> R;
    public static final HJ.a<Integer> S;
    public static final HJ.a<Integer> T;
    public final C5932dw1 K;

    static {
        Class cls = Integer.TYPE;
        L = HJ.a.a("camerax.core.imageCapture.captureMode", cls);
        M = HJ.a.a("camerax.core.imageCapture.flashMode", cls);
        N = HJ.a.a("camerax.core.imageCapture.captureBundle", InterfaceC3108Gy.class);
        O = HJ.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
        P = HJ.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        Q = HJ.a.a("camerax.core.imageCapture.imageReaderProxyProvider", InterfaceC8742pN0.class);
        R = HJ.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        S = HJ.a.a("camerax.core.imageCapture.flashType", cls);
        T = HJ.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
    }

    public BM0(C5932dw1 c5932dw1) {
        this.K = c5932dw1;
    }

    public InterfaceC8742pN0 A0() {
        return (InterfaceC8742pN0) h(Q, null);
    }

    public int B0() {
        return ((Integer) j(T)).intValue();
    }

    public int C0(int i) {
        return ((Integer) h(T, Integer.valueOf(i))).intValue();
    }

    public int D0() {
        return ((Integer) j(P)).intValue();
    }

    public int E0(int i) {
        return ((Integer) h(P, Integer.valueOf(i))).intValue();
    }

    public boolean F0() {
        return g(L);
    }

    public boolean G0() {
        return ((Boolean) h(R, Boolean.FALSE)).booleanValue();
    }

    @Override // o.FT0
    public Executor X(Executor executor) {
        return (Executor) h(FT0.v, executor);
    }

    @Override // o.CO1
    public HJ d() {
        return this.K;
    }

    @Override // o.FT0
    public Executor f0() {
        return (Executor) j(FT0.v);
    }

    public Integer r0() {
        return (Integer) j(O);
    }

    public Integer s0(Integer num) {
        return (Integer) h(O, num);
    }

    @Override // o.InterfaceC5070aN0
    public int t() {
        return ((Integer) j(InterfaceC5070aN0.h)).intValue();
    }

    public InterfaceC3108Gy t0() {
        return (InterfaceC3108Gy) j(N);
    }

    public InterfaceC3108Gy u0(InterfaceC3108Gy interfaceC3108Gy) {
        return (InterfaceC3108Gy) h(N, interfaceC3108Gy);
    }

    public int v0() {
        return ((Integer) j(L)).intValue();
    }

    public int w0() {
        return ((Integer) j(M)).intValue();
    }

    public int x0(int i) {
        return ((Integer) h(M, Integer.valueOf(i))).intValue();
    }

    public int y0() {
        return ((Integer) j(S)).intValue();
    }

    public int z0(int i) {
        return ((Integer) h(S, Integer.valueOf(i))).intValue();
    }
}
