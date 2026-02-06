package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.Locale;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.gw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1687gw {
    public static byte[] A02;
    public static String[] A03 = {"lJVeP2IR7ua2", "jEDUnDrnc1QBGJRRXgI1zLNGeQAVlRB5", "4J1evWwVBwsv6j2jE3cxdE8l4EvJqUWx", "hbOpPbm2Lvz8WBi4M4lcAmyYP20RrxkZ", "42MJRsHMkke9vUn", "N1ePHibZvm11p1YoQp9n3cvTSohhnC86", "pzMHmXStxFGPpObuVYX1kVlrzXN", "JuJmyZjKd3poC4Sz8wRazc2gW2"};
    public static final String A04;
    public final SR A00;
    public final C1079Sx A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{81, 115, 100, 109, 110, 96, 101, 104, 111, 102, C3307Iz.V, 36, 101, C3307Iz.V, 96, 114, 114, 100, 117, 114, 60, C8077mf.H, 9, 0, 3, 13, 8, 5, 2, C8077mf.m, 76, 5, 1, 13, C8077mf.m, 9, 86, 76, 73, 31, 118, 84, 67, 74, 73, 71, 66, 79, 72, 65, 6, 75, 71, 84, 77, 83, 86, 28, 6, 3, 85, 86, 116, 99, 106, 105, 103, 98, 111, 104, 97, C3307Iz.Y, 112, 111, 98, 99, 105, 60, C3307Iz.Y, 35, 117, 50, 101, 48, 48, 96, 97, 98, 98, 123, 52, 110, 101, 100, 123, 103, 103, 51, 111, 123, 55, 100, 55, 101, 123, 100, 55, 100, 55, 51, 100, 50, 52, 53, 53, 51, 98, 55, 53, 34, C3307Iz.V, 34, 51, 36, 47, 106, 113, 116, 113, 112, 104, 113};
    }

    static {
        A02();
        A04 = C1687gw.class.getSimpleName();
    }

    public C1687gw(SR sr, C1669ge c1669ge) {
        this.A00 = sr;
        this.A00.A40(new C1689gy(this));
        this.A01 = new C1079Sx(c1669ge);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            Locale locale = Locale.US;
            SR sr = this.A00;
            if (A03[2].charAt(7) != 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "B9WAOcp3zNbG4sQr12bKZPkRro";
            strArr[6] = "6ENVq9NVFWRAnG6rhAVuoXedHs5";
            String.format(locale, A00(0, 20, 44), Integer.valueOf(sr.A6x().size()));
        }
        for (SU su : this.A00.A6x()) {
            switch (su.A9O()) {
                case A04:
                    A04(su.getUrl());
                    break;
                case A06:
                    A06(su.getUrl());
                    break;
                case A05:
                    A05(su.getUrl());
                    break;
            }
        }
        this.A01.A0X(new C1688gx(this), new C1072Sq(A00(81, 36, 123), A00(125, 7, 50)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 65), str);
        }
        C1077Sv c1077Sv = new C1077Sv(str, -1, -1, A00(81, 36, 123), A00(125, 7, 50));
        c1077Sv.A02 = A00(117, 8, 106);
        this.A01.A0c(c1077Sv);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 11), str);
        }
        C1075St c1075St = new C1075St(str, A00(81, 36, 123), A00(125, 7, 50));
        c1075St.A04 = true;
        c1075St.A02 = A00(117, 8, 106);
        this.A01.A0Y(c1075St);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 43), str);
        }
        C1075St c1075St = new C1075St(str, A00(81, 36, 123), A00(125, 7, 50));
        c1075St.A04 = false;
        c1075St.A02 = A00(117, 8, 106);
        this.A01.A0b(c1075St);
    }
}
