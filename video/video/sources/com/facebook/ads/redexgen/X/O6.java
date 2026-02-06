package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O6 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, 73, 72, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, 72, 97, 126, 115, 114, QC1.w};
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x00da */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A02(C1673gi c1673gi, C1079Sx c1079Sx, C05457l c05457l) {
        c1079Sx.A0d(new C1077Sv(c05457l.A2C().A01(), C1510e4.A04, C1510e4.A04, c05457l.A1D(), A00(17, 14, 113)));
        boolean A1g = c05457l.A1g();
        String A002 = A00(17, 14, 113);
        if (A1g) {
            C1075St c1075St = new C1075St(c05457l.A0x(), c05457l.A1D(), A002);
            c1075St.A04 = true;
            c1075St.A03 = A00(0, 5, 66);
            c1079Sx.A0Y(c1075St);
        }
        boolean A30 = C1123Up.A30(c1673gi, C1600fX.A03());
        C1075St c1075St2 = new C1075St(c05457l.A29().A0H().A09(), c05457l.A1D(), A00(17, 14, 113), c05457l.A29().A0H().A06());
        if (A1g && !A30) {
            c1079Sx.A0Y(c1075St2);
        } else {
            c1079Sx.A0b(c1075St2);
        }
        c1079Sx.A0d(new C1077Sv(c05457l.A29().A0H().A08(), O1.A00(c05457l.A29().A0H()), O1.A01(c05457l.A29().A0H()), c05457l.A1D(), A00(17, 14, 113)));
        O0.A00(c05457l, c1079Sx, A002);
        Iterator<String> it = c05457l.A29().A0K().A02().iterator();
        while (isDSL) {
            String url = it.next();
            c1079Sx.A0d(new C1077Sv(url, -1, -1, c05457l.A1D(), A00(17, 14, 113)));
        }
    }

    public static void A03(C1673gi c1673gi, C1079Sx c1079Sx, C05457l c05457l) {
        int i = 0;
        for (NR nr : c05457l.A2G()) {
            C1077Sv c1077Sv = new C1077Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), c05457l.A1D(), A00(5, 12, 118));
            if (i == 0) {
                c1079Sx.A0c(c1077Sv);
            } else {
                c1079Sx.A0d(c1077Sv);
            }
            O0.A00(c05457l, c1079Sx, A00(17, 14, 113));
            for (String str : nr.A0K().A02()) {
                c1079Sx.A0d(new C1077Sv(str, -1, -1, c05457l.A1D(), A00(5, 12, 118)));
            }
            if (!TextUtils.isEmpty(nr.A0H().A09())) {
                new C1075St(nr.A0H().A09(), c05457l.A1D(), A00(5, 12, 118), nr.A0H().A06()).A04 = false;
            }
            i++;
        }
    }
}
