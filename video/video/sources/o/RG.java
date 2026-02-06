package o;

import java.util.Arrays;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class RG {
    public static final byte a = 0;
    public static final int b = 5;
    public static final int c = 32;
    public static final int d = 31;
    public static final int e = 1073741823;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 256;
    public static final int i = 255;
    public static final int j = 65536;
    public static final int k = 65535;

    public static Object a(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            if (i2 <= 256) {
                return new byte[i2];
            }
            if (i2 <= 65536) {
                return new short[i2];
            }
            return new int[i2];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int b(int i2, int i3) {
        return i2 & (~i3);
    }

    public static int c(int i2, int i3) {
        return i2 & i3;
    }

    public static int d(int i2, int i3, int i4) {
        return (i2 & (~i4)) | (i3 & i4);
    }

    public static int e(int i2) {
        int i3;
        if (i2 < 32) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        return i3 * (i2 + 1);
    }

    public static int f(@MB Object obj, @MB Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, @MB Object[] objArr2) {
        int i3;
        int i4;
        int d2 = EG0.d(obj);
        int i5 = d2 & i2;
        int h2 = h(obj3, i5);
        if (h2 == 0) {
            return -1;
        }
        int b2 = b(d2, i2);
        int i6 = -1;
        while (true) {
            i3 = h2 - 1;
            i4 = iArr[i3];
            if (b(i4, i2) != b2 || !C2593Bt1.a(obj, objArr[i3]) || (objArr2 != null && !C2593Bt1.a(obj2, objArr2[i3]))) {
                int c2 = c(i4, i2);
                if (c2 == 0) {
                    return -1;
                }
                i6 = i3;
                h2 = c2;
            }
        }
        int c3 = c(i4, i2);
        if (i6 == -1) {
            i(obj3, i5, c3);
            return i3;
        }
        iArr[i6] = d(iArr[i6], c3, i2);
        return i3;
    }

    public static void g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static int h(Object obj, int i2) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i2] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i2] & Xx2.Y0;
        }
        return ((int[]) obj)[i2];
    }

    public static void i(Object obj, int i2, int i3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static int j(int i2) {
        return Math.max(4, EG0.a(i2 + 1, 1.0d));
    }
}
