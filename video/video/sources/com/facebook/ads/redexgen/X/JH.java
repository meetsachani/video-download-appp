package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.UUID;
import o.C2638Cg0;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class JH {
    public static byte[] A00;
    public static String[] A01 = {"f", "wBzTr9isyWuzk0Was82fzP", "sjHXZ8xDB", "rmj8ZpQPq6N", "k0JnkexrU5JvppKLiAvWnmQe", "wOTrIZh22Rcriy8Kptm38zvp", "MO9vm10BV89BFpJ5cx5aSl", "G2cEiJ7mV"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 26);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {-68, -33, -33, -44, -83, -32, -37, C2638Cg0.E7, C2638Cg0.p7, -32, -43, C2638Cg0.n7, -20, 5, 10, C8077mf.n, 7, 7, 6, 9, C8077mf.m, -4, -5, -73, 7, 10, 10, -1, -73, 13, -4, 9, 10, 0, 6, 5, -47, -73};
        String[] strArr = A01;
        if (strArr[2].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "tjOAGVDnT";
        strArr2[7] = "ur6F1gHbb";
        A00 = bArr;
    }

    static {
        A03();
    }

    public static JG A00(byte[] bArr) {
        C04774v c04774v = new C04774v(bArr);
        if (c04774v.A0A() < 32) {
            return null;
        }
        c04774v.A0f(0);
        if (c04774v.A0C() == c04774v.A07() + 4 && c04774v.A0C() == 1886614376) {
            int dataSize = AbstractC0822Iu.A01(c04774v.A0C());
            if (dataSize > 1) {
                AbstractC04624g.A07(A01(0, 12, 82), A01(12, 26, 125) + dataSize);
                return null;
            }
            UUID uuid = new UUID(c04774v.A0P(), c04774v.A0P());
            if (dataSize == 1) {
                c04774v.A0g(c04774v.A0L() * 16);
            }
            int atomType = c04774v.A0L();
            String[] strArr = A01;
            if (strArr[2].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[6] = "Op4nBnIC0DPoqkcvuw04qL";
            if (atomType != c04774v.A07()) {
                return null;
            }
            byte[] bArr2 = new byte[atomType];
            c04774v.A0k(bArr2, 0, atomType);
            return new JG(uuid, dataSize, bArr2);
        }
        return null;
    }

    public static UUID A02(byte[] bArr) {
        UUID uuid;
        JG parsedAtom = A00(bArr);
        if (parsedAtom != null) {
            uuid = parsedAtom.A01;
            return uuid;
        }
        return null;
    }
}
