package o;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public final class JE {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", C2638Cg0.W4, "B", "C"};
    public static final int c = 1;
    public static final int d = 32;
    public static final int e = 15;
    public static final int f = 0;

    public static String a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static List<byte[]> b(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static String c(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        char c2;
        String str = b[i];
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i3);
        if (z) {
            c2 = 'H';
        } else {
            c2 = 'L';
        }
        StringBuilder sb = new StringBuilder(TD2.M("hvc1.%s%d.%X.%c%d", str, valueOf, valueOf2, Character.valueOf(c2), Integer.valueOf(i4)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static byte[] d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    public static int e(byte[] bArr, int i) {
        int length = bArr.length - a.length;
        while (i <= length) {
            if (g(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static Pair<Integer, Integer> f(byte[] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        C3012Fy1 c3012Fy1 = new C3012Fy1(bArr);
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 3;
            if (i3 < bArr.length) {
                if (c3012Fy1.O() == 1 && (bArr[i3] & 240) == 32) {
                    z = true;
                    break;
                }
                c3012Fy1.Y(c3012Fy1.f() - 2);
                i2++;
            } else {
                z = false;
                break;
            }
        }
        C9542sf.b(z, "Invalid input: VOL not found.");
        C2903Ey1 c2903Ey1 = new C2903Ey1(bArr);
        c2903Ey1.s((i2 + 4) * 8);
        c2903Ey1.s(1);
        c2903Ey1.s(8);
        if (c2903Ey1.g()) {
            c2903Ey1.s(4);
            c2903Ey1.s(3);
        }
        if (c2903Ey1.h(4) == 15) {
            c2903Ey1.s(8);
            c2903Ey1.s(8);
        }
        if (c2903Ey1.g()) {
            c2903Ey1.s(2);
            c2903Ey1.s(1);
            if (c2903Ey1.g()) {
                c2903Ey1.s(79);
            }
        }
        if (c2903Ey1.h(2) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9542sf.b(z2, "Only supports rectangular video object layer shape.");
        C9542sf.a(c2903Ey1.g());
        int h = c2903Ey1.h(16);
        C9542sf.a(c2903Ey1.g());
        if (c2903Ey1.g()) {
            if (h > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            C9542sf.a(z3);
            for (int i4 = h - 1; i4 > 0; i4 >>= 1) {
                i++;
            }
            c2903Ey1.s(i);
        }
        C9542sf.a(c2903Ey1.g());
        int h2 = c2903Ey1.h(13);
        C9542sf.a(c2903Ey1.g());
        int h3 = c2903Ey1.h(13);
        C9542sf.a(c2903Ey1.g());
        c2903Ey1.s(1);
        return Pair.create(Integer.valueOf(h2), Integer.valueOf(h3));
    }

    public static boolean g(byte[] bArr, int i) {
        if (bArr.length - i <= a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = a;
            if (i2 < bArr2.length) {
                if (bArr[i + i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            } else {
                return true;
            }
        }
    }

    public static Pair<Integer, Integer> h(byte[] bArr) {
        C3012Fy1 c3012Fy1 = new C3012Fy1(bArr);
        c3012Fy1.Y(9);
        int L = c3012Fy1.L();
        c3012Fy1.Y(20);
        return Pair.create(Integer.valueOf(c3012Fy1.P()), Integer.valueOf(L));
    }

    public static boolean i(List<byte[]> list) {
        if (list.size() != 1 || list.get(0).length != 1 || list.get(0)[0] != 1) {
            return false;
        }
        return true;
    }

    @InterfaceC11300zs1
    public static byte[][] j(byte[] bArr) {
        int length;
        if (!g(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            arrayList.add(Integer.valueOf(i));
            i = e(bArr, i + a.length);
        } while (i != -1);
        byte[][] bArr2 = new byte[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            if (i2 < arrayList.size() - 1) {
                length = ((Integer) arrayList.get(i2 + 1)).intValue();
            } else {
                length = bArr.length;
            }
            int i3 = length - intValue;
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, intValue, bArr3, 0, i3);
            bArr2[i2] = bArr3;
        }
        return bArr2;
    }
}
