package o;

/* loaded from: classes3.dex */
public abstract class SE0 {
    public static SE0 a = new C5597cZ();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(C2469An c2469An, float[] fArr) throws C9349rr1 {
        int m = c2469An.m();
        int i = c2469An.i();
        boolean z = true;
        for (int i2 = 0; i2 < fArr.length && z; i2 += 2) {
            int i3 = (int) fArr[i2];
            int i4 = i2 + 1;
            int i5 = (int) fArr[i4];
            if (i3 >= -1 && i3 <= m && i5 >= -1 && i5 <= i) {
                if (i3 == -1) {
                    fArr[i2] = 0.0f;
                } else if (i3 == m) {
                    fArr[i2] = m - 1;
                } else {
                    z = false;
                    if (i5 != -1) {
                        fArr[i4] = 0.0f;
                    } else if (i5 == i) {
                        fArr[i4] = i - 1;
                    }
                    z = true;
                }
                z = true;
                if (i5 != -1) {
                }
                z = true;
            } else {
                throw C9349rr1.a();
            }
        }
        boolean z2 = true;
        for (int length = fArr.length - 2; length >= 0 && z2; length -= 2) {
            int i6 = (int) fArr[length];
            int i7 = length + 1;
            int i8 = (int) fArr[i7];
            if (i6 >= -1 && i6 <= m && i8 >= -1 && i8 <= i) {
                if (i6 == -1) {
                    fArr[length] = 0.0f;
                } else if (i6 == m) {
                    fArr[length] = m - 1;
                } else {
                    z2 = false;
                    if (i8 != -1) {
                        fArr[i7] = 0.0f;
                    } else if (i8 == i) {
                        fArr[i7] = i - 1;
                    }
                    z2 = true;
                }
                z2 = true;
                if (i8 != -1) {
                }
                z2 = true;
            } else {
                throw C9349rr1.a();
            }
        }
    }

    public static SE0 b() {
        return a;
    }

    public static void e(SE0 se0) {
        a = se0;
    }

    public abstract C2469An c(C2469An c2469An, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws C9349rr1;

    public abstract C2469An d(C2469An c2469An, int i, int i2, OC1 oc1) throws C9349rr1;
}
