package o;

/* renamed from: o.cZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5597cZ extends SE0 {
    @Override // o.SE0
    public C2469An c(C2469An c2469An, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws C9349rr1 {
        return d(c2469An, i, i2, OC1.b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    @Override // o.SE0
    public C2469An d(C2469An c2469An, int i, int i2, OC1 oc1) throws C9349rr1 {
        if (i > 0 && i2 > 0) {
            C2469An c2469An2 = new C2469An(i, i2);
            int i3 = i * 2;
            float[] fArr = new float[i3];
            for (int i4 = 0; i4 < i2; i4++) {
                float f = i4 + 0.5f;
                for (int i5 = 0; i5 < i3; i5 += 2) {
                    fArr[i5] = (i5 / 2) + 0.5f;
                    fArr[i5 + 1] = f;
                }
                oc1.f(fArr);
                SE0.a(c2469An, fArr);
                for (int i6 = 0; i6 < i3; i6 += 2) {
                    try {
                        if (c2469An.f((int) fArr[i6], (int) fArr[i6 + 1])) {
                            c2469An2.q(i6 / 2, i4);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw C9349rr1.a();
                    }
                }
            }
            return c2469An2;
        }
        throw C9349rr1.a();
    }
}
