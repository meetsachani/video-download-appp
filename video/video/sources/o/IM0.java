package o;

import o.C2598Bv;
import o.C3597Ly;

/* loaded from: classes.dex */
public final class IM0 extends C6412fv {
    public static final IM0 c = new IM0(new KM0());
    public final KM0 b;

    public IM0(KM0 km0) {
        this.b = km0;
    }

    @Override // o.C6412fv, o.C3597Ly.b
    public void a(InterfaceC6743hD2<?> interfaceC6743hD2, C3597Ly.a aVar) {
        super.a(interfaceC6743hD2, aVar);
        if (interfaceC6743hD2 instanceof BM0) {
            BM0 bm0 = (BM0) interfaceC6743hD2;
            C2598Bv.a aVar2 = new C2598Bv.a();
            if (bm0.F0()) {
                this.b.a(bm0.v0(), aVar2);
            }
            aVar.e(aVar2.build());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
