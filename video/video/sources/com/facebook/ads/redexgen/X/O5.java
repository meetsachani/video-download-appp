package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.Arrays;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O5 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{C8077mf.m, 77, 81, 72, 73, 93, 90, 64, 81, 70, 71, 64, 93, 64, 93, 85, 88};
    }

    public static void A02(C1673gi c1673gi, AbstractC1847jd abstractC1847jd, boolean z, O3 o3) {
        if (!C1123Up.A2E(c1673gi)) {
            C1079Sx c1079Sx = new C1079Sx(c1673gi);
            C0945No A07 = abstractC1847jd.A29().A0H().A07();
            c1079Sx.A0e(new VI(abstractC1847jd.A2E(), c1673gi.A0A()));
            if (A07 == null) {
                o3.AFF(AdError.CACHE_ERROR);
                return;
            } else if (A07.A0Y()) {
                o3.AFG();
                return;
            } else {
                C1075St c1075St = new C1075St(A07.A0L(), abstractC1847jd.A1D(), abstractC1847jd.A10());
                c1075St.A04 = true;
                c1075St.A03 = A00(0, 5, 86);
                switch (O2.A00[A07.A0G().ordinal()]) {
                    case 1:
                    case 2:
                        c1079Sx.A0Y(c1075St);
                        break;
                }
                c1079Sx.A0c(new C1077Sv(abstractC1847jd.A2C().A01(), -1, -1, abstractC1847jd.A1D(), abstractC1847jd.A10()));
                c1079Sx.A0c(new C1077Sv(A07.A0K(), -1, -1, abstractC1847jd.A1D(), abstractC1847jd.A10()));
                O0.A00(abstractC1847jd, c1079Sx, A00(5, 12, 71));
                c1079Sx.A0X(new C1820jA(c1673gi, o3, c1079Sx, A07, z), new C1072Sq(abstractC1847jd.A1D(), abstractC1847jd.A10()));
                return;
            }
        }
        o3.AFG();
    }
}
