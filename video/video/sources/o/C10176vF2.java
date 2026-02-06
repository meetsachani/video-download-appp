package o;

import java.util.Objects;
import o.HJ;
import o.InterfaceC9694tG2;

/* renamed from: o.vF2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10176vF2<T extends InterfaceC9694tG2> implements InterfaceC6743hD2<C9204rF2<T>>, InterfaceC6040eN0, InterfaceC9085qn2 {
    public static final HJ.a<InterfaceC9694tG2> L = HJ.a.a("camerax.video.VideoCapture.videoOutput", InterfaceC9694tG2.class);
    public static final HJ.a<InterfaceC6490gB0<IF2, NF2>> M = HJ.a.a("camerax.video.VideoCapture.videoEncoderInfoFinder", InterfaceC6490gB0.class);
    public final C5932dw1 K;

    public C10176vF2(C5932dw1 c5932dw1) {
        this.K = c5932dw1;
    }

    @Override // o.CO1
    public HJ d() {
        return this.K;
    }

    public InterfaceC6490gB0<IF2, NF2> r0() {
        InterfaceC6490gB0<IF2, NF2> interfaceC6490gB0 = (InterfaceC6490gB0) j(M);
        Objects.requireNonNull(interfaceC6490gB0);
        return interfaceC6490gB0;
    }

    public T s0() {
        return (T) j(L);
    }

    @Override // o.InterfaceC5070aN0
    public int t() {
        return 34;
    }
}
