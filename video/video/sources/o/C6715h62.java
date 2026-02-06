package o;

import java.util.Arrays;
import java.util.Comparator;

@InterfaceC5116aa0
@InterfaceC10420wF0
/* renamed from: o.h62  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6715h62 {
    public static final byte a = 64;

    /* renamed from: o.h62$a */
    /* loaded from: classes3.dex */
    public enum a implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: g */
        public int compare(byte[] bArr, byte[] bArr2) {
            int min = Math.min(bArr.length, bArr2.length);
            for (int i = 0; i < min; i++) {
                int b = C6715h62.b(bArr[i], bArr2[i]);
                if (b != 0) {
                    return b;
                }
            }
            return bArr.length - bArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }
    }

    public static byte a(long j) {
        boolean z;
        byte b = (byte) j;
        if (b == j) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "Out of range: %s", j);
        return b;
    }

    public static int b(byte b, byte b2) {
        return b - b2;
    }

    public static String c(String str, byte... bArr) {
        C10664xF1.E(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 5);
        sb.append((int) bArr[0]);
        for (int i = 1; i < bArr.length; i++) {
            sb.append(str);
            sb.append((int) bArr[i]);
        }
        return sb.toString();
    }

    public static Comparator<byte[]> d() {
        return a.INSTANCE;
    }

    public static byte e(byte... bArr) {
        boolean z;
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        byte b = bArr[0];
        for (int i = 1; i < bArr.length; i++) {
            byte b2 = bArr[i];
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    public static byte f(byte... bArr) {
        boolean z;
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        byte b = bArr[0];
        for (int i = 1; i < bArr.length; i++) {
            byte b2 = bArr[i];
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    public static byte g(long j) {
        if (j > 127) {
            return Byte.MAX_VALUE;
        }
        if (j < -128) {
            return Byte.MIN_VALUE;
        }
        return (byte) j;
    }

    public static void h(byte[] bArr) {
        C10664xF1.E(bArr);
        i(bArr, 0, bArr.length);
    }

    public static void i(byte[] bArr, int i, int i2) {
        C10664xF1.E(bArr);
        C10664xF1.f0(i, i2, bArr.length);
        Arrays.sort(bArr, i, i2);
        C9351rs.n(bArr, i, i2);
    }
}
