package o;

/* renamed from: o.kV1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7540kV1 extends ZP {
    public float a;

    public C7540kV1() {
        this.a = -1.0f;
    }

    @Override // o.ZP
    public void b(@InterfaceC5670cr1 C4992a32 c4992a32, float f, float f2, float f3) {
        float f4 = f3 * f2;
        c4992a32.r(0.0f, f4, 180.0f, 180.0f - f);
        float f5 = f4 * 2.0f;
        c4992a32.a(0.0f, 0.0f, f5, f5, 180.0f, f);
    }

    @Deprecated
    public C7540kV1(float f) {
        this.a = f;
    }
}
