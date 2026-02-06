package o;

import java.util.Map;

/* renamed from: o.lW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7784lW {
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public final KP1 a = new KP1(LC0.f529o);

    public final void a(byte[] bArr, int i, int i2, int i3, int i4) throws UB {
        int i5;
        int i6 = i2 + i3;
        if (i4 == 0) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        int[] iArr = new int[i6 / i5];
        for (int i7 = 0; i7 < i6; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i5] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.a.a(iArr, i3 / i5);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i5];
                }
            }
        } catch (MP1 unused) {
            throw UB.a();
        }
    }

    public C9753tW b(C2469An c2469An) throws UB, C2605Bx0 {
        return c(c2469An, null);
    }

    public C9753tW c(C2469An c2469An, Map<XV, ?> map) throws C2605Bx0, UB {
        byte[] bArr;
        byte[] a = new C2567Bn(c2469An).a();
        a(a, 0, 10, 10, 0);
        int i = a[0] & C8077mf.q;
        if (i != 2 && i != 3 && i != 4) {
            if (i == 5) {
                a(a, 20, 68, 56, 1);
                a(a, 20, 68, 56, 2);
                bArr = new byte[78];
            } else {
                throw C2605Bx0.a();
            }
        } else {
            a(a, 20, 84, 40, 1);
            a(a, 20, 84, 40, 2);
            bArr = new byte[94];
        }
        System.arraycopy(a, 0, bArr, 0, 10);
        System.arraycopy(a, 20, bArr, 10, bArr.length - 10);
        return C5588cW.a(bArr, i);
    }
}
