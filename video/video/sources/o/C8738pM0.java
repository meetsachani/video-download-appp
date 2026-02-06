package o;

import androidx.camera.core.c;
import o.HJ;

/* renamed from: o.pM0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8738pM0 implements InterfaceC6743hD2<androidx.camera.core.c>, InterfaceC6040eN0, InterfaceC9085qn2 {
    public static final HJ.a<Integer> L = HJ.a.a("camerax.core.imageAnalysis.backpressureStrategy", c.b.class);
    public static final HJ.a<Integer> M = HJ.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);
    public static final HJ.a<InterfaceC8742pN0> N = HJ.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", InterfaceC8742pN0.class);
    public static final HJ.a<Integer> O = HJ.a.a("camerax.core.imageAnalysis.outputImageFormat", c.e.class);
    public static final HJ.a<Boolean> P = HJ.a.a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);
    public static final HJ.a<Boolean> Q = HJ.a.a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);
    public final C5932dw1 K;

    public C8738pM0(C5932dw1 c5932dw1) {
        this.K = c5932dw1;
    }

    @Override // o.CO1
    public HJ d() {
        return this.K;
    }

    public int r0() {
        return ((Integer) j(L)).intValue();
    }

    public int s0(int i) {
        return ((Integer) h(L, Integer.valueOf(i))).intValue();
    }

    @Override // o.InterfaceC5070aN0
    public int t() {
        return 35;
    }

    public int t0() {
        return ((Integer) j(M)).intValue();
    }

    public int u0(int i) {
        return ((Integer) h(M, Integer.valueOf(i))).intValue();
    }

    public InterfaceC8742pN0 v0() {
        return (InterfaceC8742pN0) h(N, null);
    }

    public Boolean w0(Boolean bool) {
        return (Boolean) h(P, bool);
    }

    public int x0(int i) {
        return ((Integer) h(O, Integer.valueOf(i))).intValue();
    }

    public Boolean y0(Boolean bool) {
        return (Boolean) h(Q, bool);
    }
}
