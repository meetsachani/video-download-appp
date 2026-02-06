package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.C2638Cg0;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class WA {
    public static byte[] A0C;
    public static String[] A0D = {"u7auSF2QbA7keT455OtLfVATNnMuonV2", "9Ni6xyVwZaeKacoBimRjslH6Dei", "NGE2fLmKrMN6Gw2Fz9z7jAXvyfAydpGl", "srT3S5MN", "jMoNZ8Vk", "oZZQeSbHWWSZcPAQallJMC7N5h2", "GNfhbJ55AYf3nQ2lY9fIFOrmofPjrLRg", "qccEv4BxkjzqCatZiOtTgryF8DF84JXr"};
    public int A00;
    public T8 A01;
    public EnumC1148Vq A02;
    public C1194Xn A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final U3 A09;
    public final AdPlacementType A0A;
    public final C1152Vu A0B;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{-34, -95, -105, -102, -75, -101, -82, -90, -101, -88, -97, -101, -92, -103, -101, -75, -86, -81, -90, -101, -52, C2638Cg0.A7, -22, -35, -48, -37, C2638Cg0.B7, -35, -33, -44, C2638Cg0.E7, -46, -22, C2638Cg0.z7, C2638Cg0.B7, C2638Cg0.E7, -47, -44, -46, -22, -41, -52, -34, -33, -22, -32, -37, C2638Cg0.A7, -52, -33, -48, -22, -33, -44, C2638Cg0.n7, -48, C8077mf.m, C8077mf.u, 13, 40, C8077mf.u, 13, -29, -22, -27, 0, -11, -22, -18, -26, 0, -11, -16, -20, -26, -17, -105, -96, -99, -103, -94, -88, -77, -90, -103, -91, -87, -103, -89, -88, -77, -99, -104, -109, -97, -96, -96, -111, C2638Cg0.s7, C2638Cg0.t7, C2638Cg0.z7, -48, -32, C2638Cg0.q7, C2638Cg0.s7, -32, C2638Cg0.w7, C2638Cg0.s7, -74, C2638Cg0.v7, C2638Cg0.s7, C2638Cg0.r7, -78, -48, -71, -70, -65, C2638Cg0.s7, -60, -9, -12, -8, -10, -9, 3, -74, -79, -77, -82, C2638Cg0.w7, C2638Cg0.s7, C2638Cg0.u7, C2638Cg0.q7, -32, C2638Cg0.u7, C2638Cg0.y7, C2638Cg0.q7, -56, -92, -82, -70, -88, -80, -89, -81, -92, -70, -100, -97, -70, -96, -77, -85, -96, -83, -92, -96, -87, -98, -96, 4, 0, C8077mf.B, C8077mf.m, -2, C8077mf.n, 13, C8077mf.m, 2, -4, 13, -2, -3, -34, -45, -27, -26, -15, -27, -45, -24, -41, -42, -15, -34, C2638Cg0.C7, -43, -45, -34, -41, -28, -21, -29, -11, -41, C2638Cg0.B7, -23, -11, -24, -37, -25, -21, -37, -23, -22, -37, C2638Cg0.B7, -77, -81, -92, -90, -88, -80, -88, -79, -73, C2638Cg0.q7, -84, -89, C2638Cg0.z7, C2638Cg0.w7, -65, C2638Cg0.p7, C2638Cg0.r7, C2638Cg0.x7, C2638Cg0.r7, -52, -46, -35, -46, -41, C2638Cg0.z7, C2638Cg0.r7, C8077mf.y, 8, C8077mf.x, C8077mf.B, 8, C8077mf.z, C8077mf.A, 34, C8077mf.A, C8077mf.n, C8077mf.r, 8, -4, -3, -22, -20, -12, 8, -3, -5, -22, -20, -18, -7, -22, -14, -11, -15, -26, -7, -22, 4, -18, -23, C2638Cg0.t7, -73, C2638Cg0.s7, C2638Cg0.t7, -47, -65, C2638Cg0.p7, -74, -73, -13, -27, -32, -16, -28};
    }

    static {
        A02();
    }

    public WA(T8 t8, String str, C1194Xn c1194Xn, EnumC1148Vq enumC1148Vq, int i, C1152Vu c1152Vu, String str2, String str3, String str4, U3 u3) {
        this.A01 = t8;
        this.A06 = str;
        this.A03 = c1194Xn;
        this.A02 = enumC1148Vq;
        this.A00 = i;
        this.A0B = c1152Vu;
        this.A0A = enumC1148Vq.A05(this.A01);
        this.A07 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A09 = u3;
    }

    private long A00() {
        SharedPreferences A00 = WN.A00(this.A01);
        String A01 = A01(0, 0, 79);
        String A012 = A01(173, 17, 68);
        String lastSavedLocale = A00.getString(A012, A01);
        if (lastSavedLocale == null) {
            return 0L;
        }
        if (lastSavedLocale.equals(Locale.getDefault().toString())) {
            return AbstractC0964Oh.A00(this.A01.A02()).A09();
        }
        A00.edit().putString(A012, Locale.getDefault().toString()).apply();
        return 0L;
    }

    private void A03(Map<String, String> params, String str, String str2) {
        params.put(str, str2);
    }

    public final int A04() {
        return this.A00;
    }

    public final U3 A05() {
        return this.A09;
    }

    public final AdPlacementType A06() {
        return this.A0A;
    }

    public final EnumC1148Vq A07() {
        return this.A02;
    }

    public final C1194Xn A08() {
        return this.A03;
    }

    public final String A09() {
        return this.A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0155, code lost:
        if (r4.A9G() != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0157, code lost:
        A03(r3, A01(98, 10, 51), r8.A09.A9G());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x016c, code lost:
        if (r8.A00 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x016e, code lost:
        A03(r3, A01(com.facebook.internal.C2372q.m, 17, 72), java.lang.String.valueOf(r8.A00));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0181, code lost:
        r4 = r8.A08;
        r2 = com.facebook.ads.redexgen.X.WA.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0193, code lost:
        if (r2[1].length() == r2[5].length()) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0195, code lost:
        if (r4 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0197, code lost:
        A03(r3, A01(138, 22, 13), java.lang.String.valueOf(r8.A08));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01aa, code lost:
        A03(r3, A01(160, 13, 107), java.lang.String.valueOf(com.facebook.ads.redexgen.X.YC.A02(r8.A01)));
        A03(r3, A01(233, 12, 117), com.facebook.ads.redexgen.X.Y1.A06(java.lang.System.currentTimeMillis()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01dc, code lost:
        if (r8.A0B.A06() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e4, code lost:
        if (r8.A0B.A04() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01e6, code lost:
        A03(r3, A01(56, 6, 123), r8.A0B.A04());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01f8, code lost:
        r4 = r8.A0B.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0202, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0204, code lost:
        A03(r3, A01(62, 14, 83), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0213, code lost:
        if (r8.A07 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0215, code lost:
        A03(r3, A01(245, 11, 91), r8.A07);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0224, code lost:
        A03(r3, A01(76, 17, 6), java.util.UUID.randomUUID().toString());
        r4 = com.facebook.ads.redexgen.X.Y1.A07(A00());
        r2 = com.facebook.ads.redexgen.X.WA.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0250, code lost:
        if (r2[3].length() == r2[4].length()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0257, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0258, code lost:
        r2 = com.facebook.ads.redexgen.X.WA.A0D;
        r2[2] = "uWxLBVxijt65dRlk9T2Hn2WYlcbw5EIA";
        r2[6] = "gJEIMXTCWTN9wPxeCuHJDhMtmXZzR3hI";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0264, code lost:
        if (r4 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026c, code lost:
        if (r4.A9G() != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0270, code lost:
        r2 = com.facebook.ads.redexgen.X.WA.A0D;
        r2[2] = "NkXVy20xQPZxPDFffPbPKKxnGzq6Q1tn";
        r2[6] = "9D5jR9gI4cGNuuYNFYJ1hn06wNsfKLn7";
        A03(r3, A01(20, 36, 61), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x028b, code lost:
        if (r8.A05 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x028d, code lost:
        A03(r3, A01(108, 11, 35), r8.A05);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029e, code lost:
        if (r8.A04 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02a0, code lost:
        A03(r3, A01(2, 18, 8), r8.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02ae, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, String> A0A(Map<String, String> map) {
        String A01;
        HashMap hashMap = new HashMap(map);
        A03(hashMap, A01(125, 4, 31), SZ.A00().A03());
        if (SZ.A00().A04()) {
            A01 = A01(0, 1, 96);
        } else {
            A01 = A01(1, 1, 34);
        }
        A03(hashMap, A01(129, 9, 51), A01);
        A03(hashMap, A01(93, 5, 2), String.valueOf(this.A09.AAa()));
        String idfaFlag = A01(207, 12, 21);
        A03(hashMap, idfaFlag, this.A06);
        if (this.A0A != AdPlacementType.UNKNOWN) {
            A03(hashMap, A01(219, 14, 48), this.A0A.toString().toLowerCase());
        }
        if (this.A03 != null) {
            A03(hashMap, A01(276, 5, 78), String.valueOf(this.A03.A01()));
            A03(hashMap, A01(119, 6, 97), String.valueOf(this.A03.A00()));
        }
        EnumC1148Vq enumC1148Vq = this.A02;
        String[] strArr = A0D;
        String idfaFlag2 = strArr[3];
        if (idfaFlag2.length() == strArr[4].length()) {
            String[] strArr2 = A0D;
            strArr2[1] = "MtgCRt6raT7lLAmxmnhZWRhCoK6";
            strArr2[5] = "TefOAifnH3N8w6fQm3K3ucYxLzr";
            if (enumC1148Vq != null) {
                String valueOf = String.valueOf(this.A02.A04());
                String[] strArr3 = A0D;
                String idfaFlag3 = strArr3[1];
                if (idfaFlag3.length() == strArr3[5].length()) {
                    String[] strArr4 = A0D;
                    strArr4[2] = "oEScE6GwBx0T7gd10O4WpCDAWbiGO08C";
                    strArr4[6] = "F3x5JK4fAwlkZj0maRZJGdAXlKAKJxnY";
                    A03(hashMap, A01(256, 11, 87), valueOf);
                }
            }
            if (this.A09.isTestMode(this.A01)) {
                A03(hashMap, A01(267, 9, 36), A01(1, 1, 34));
            }
            U3 u3 = this.A09;
            String[] strArr5 = A0D;
            if (strArr5[2].charAt(1) != strArr5[6].charAt(1)) {
                String[] strArr6 = A0D;
                strArr6[1] = "P1GrzNsZRgJooEVm5vEQxHxZ4Z0";
                strArr6[5] = "F8cEJY3nZiqqQFAmyopMZkDj7B2";
            }
        }
        throw new RuntimeException();
    }
}
