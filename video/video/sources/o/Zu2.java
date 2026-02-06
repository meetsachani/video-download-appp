package o;

@Deprecated
/* loaded from: classes2.dex */
public final class Zu2 {
    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static boolean b(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * Xu2.A) + i3;
            if (i6 >= i && i6 < i2 && bArr[i6] == 71) {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            } else {
                i4 = 0;
            }
        }
        return false;
    }

    public static long c(C3012Fy1 c3012Fy1, int i, int i2) {
        c3012Fy1.Y(i);
        if (c3012Fy1.a() < 5) {
            return C10323vs.b;
        }
        int s = c3012Fy1.s();
        if ((8388608 & s) != 0 || ((2096896 & s) >> 8) != i2 || (s & 32) == 0 || c3012Fy1.L() < 7 || c3012Fy1.a() < 7 || (c3012Fy1.L() & 16) != 16) {
            return C10323vs.b;
        }
        byte[] bArr = new byte[6];
        c3012Fy1.n(bArr, 0, 6);
        return d(bArr);
    }

    public static long d(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
