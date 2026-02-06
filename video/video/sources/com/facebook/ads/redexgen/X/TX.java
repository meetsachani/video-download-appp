package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;
import o.CK1;
import o.FF0;
import o.InterfaceC8148mw2;

/* loaded from: assets/audience_network/classes2.dex */
public final class TX {
    public static SparseIntArray A00;
    public static Executor A01;
    public static boolean A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"7RJhgfAHrbCmdmvJO272XvW7u1fNB6AD", "SRAGcoTEjCaoOjv1TM3aABjegfXmDbQ2", "TJJTsgNcbEXqB1u8vE3MpXQkjlg70u98", "t1ySRzXu9XpLihhV0EPpMNwY8xH1TItL", "3rsqEGuQmw5YOXxTuvx2sfjKNK9b", "ZMUzhorUr0JjW6bP", "tg0Wl7kwCnCjIdXfhu7KKTsHjGWToUDr", "3JMITBtDsKuz"};
    public static final List<Integer> A06;
    public static final List<TY> A07;
    public static final AtomicBoolean A08;
    public static final AtomicInteger A09;
    public static final AtomicReference<TV> A0A;
    public static final AtomicReference<TW> A0B;
    public static final AtomicReference<Boolean> A0C;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{117, 105, -86, -83, -83, -78, -67, -78, -72, -73, -86, -75, -110, -73, -81, -72, 105, -122, 105, C2638Cg0.x7, -65, C8077mf.n, 4, C8077mf.u, C8077mf.u, 0, 6, 4, -65, -36, -65, -43, C2638Cg0.v7, 28, C8077mf.H, C8077mf.m, C8077mf.G, 34, C8077mf.C, C8077mf.p, -20, C8077mf.B, 13, C8077mf.p, C2638Cg0.v7, -26, C2638Cg0.v7, -46, -91, C2638Cg0.r7, -48, -119, -42, -126, C2638Cg0.z7, -47, C2638Cg0.v7, -126, -90, C2638Cg0.u7, -60, -41, C2638Cg0.v7, -126, -89, C2638Cg0.n7, C2638Cg0.u7, -48, -42, -112, -126, -91, -47, -48, -42, C2638Cg0.u7, C2638Cg0.B7, -42, -126, C2638Cg0.x7, -43, -126, -48, -41, C2638Cg0.z7, C2638Cg0.z7, -112, -74, -30, -24, C2638Cg0.C7, -25, C2638Cg0.n7, -27, -83, -109, -46, -13, -16, 3, -11, -82, -15, 0, -17, 1, -10, -82, -16, -13, -15, -17, 3, 1, -13, -82, -3, -12, -82, -13, 4, -13, -4, 2, -82, 5, -9, 2, -10, -82, 1, 3, -16, 2, 7, -2, -13, -82, C2638Cg0.x7, -82, -56, -5, -26, -24, -24, -25, -24, -25, -93, -20, -15, -80, -16, -24, -16, -14, -11, -4, -93, -17, -14, -22, -93, -17, -20, -16, -20, -9, -92, -93, C2638Cg0.A7, -28, -10, -9, -93, -24, -7, -24, -15, -9, -67, -93, -12, C3307Iz.Z, C8077mf.u, C8077mf.x, 31, 35, C8077mf.B, C8077mf.H, C8077mf.G, C2638Cg0.A7, -13, C8077mf.x, 17, 36, C8077mf.z, C2638Cg0.A7, -12, C3307Iz.X, C8077mf.x, C8077mf.G, 35, C2638Cg0.A7, C3307Iz.Y, C8077mf.B, 35, C8077mf.A, C2638Cg0.A7, 34, 36, 17, 35, 40, 31, C8077mf.x, C2638Cg0.A7, -20, C2638Cg0.A7, -123, -72, -93, -91, -80, -76, -87, -81, -82, 96, -92, -75, -78, -87, -82, -89, 96, -84, -81, -89, -89, -87, -82, -89, 96, -92, -91, -94, -75, -89, 96, -91, -74, -91, -82, -76, 110, C2638Cg0.v7, -4, -25, -23, -12, -8, -19, -13, -14, -92, -9, -20, -13, -7, -16, -24, -92, -14, -13, -8, -92, -20, -27, -12, -12, -23, -14, -92, -20, -23, -10, -23, -78, -122, -126, -127, -75, -92, -87, -91, -82, -93, -91, -114, -91, -76, -73, -81, -78, -85, -20, 17, 9, C8077mf.u, C2638Cg0.r7, -25, 8, 5, C8077mf.B, 10, C2638Cg0.r7, -24, C8077mf.C, 8, 17, C8077mf.A, C2638Cg0.r7, C8077mf.D, C8077mf.n, C8077mf.A, C8077mf.m, C2638Cg0.r7, C8077mf.z, C8077mf.B, 5, C8077mf.A, 28, 19, 8, C2638Cg0.r7, -32, C2638Cg0.r7, -99, -72, -72, 105, -74, -86, -73, C2638Cg0.q7, 105, -82, -65, -82, -73, -67, -68, 105, -72, -81, 105, -68, -66, -85, -67, C2638Cg0.q7, -71, -82, 105, -84, -72, -83, -82, -125, 105, -8, -6, -11, -6, -9, 10, -9, -11, 2, 5, -3, -3, -1, 4, -3, -90, -77, -72, -93, -88, -87, -72, -87, -89, -72, -83, -77, -78, -93, -69, -77, -93, -73, -83, -85, -78, -91, -80, -93, -88, -91, -72, -91, -93, -80, -77, -85, -85, -83, -78, -85, -6, -8, -6, -1, -4, -60, C2638Cg0.s7, -65, -52, C2638Cg0.A7, C2638Cg0.u7, C2638Cg0.u7, C2638Cg0.v7, C2638Cg0.z7, C2638Cg0.u7, C2638Cg0.A7, -43, C2638Cg0.w7, -36, -47, C2638Cg0.C7, -16, -23, -23, -32, -25, C8077mf.m, C8077mf.u, 5, 1, C8077mf.B, 3, C8077mf.p, C8077mf.m, 6, 3, C8077mf.z, C8077mf.m, 17, C8077mf.r, -80, -89, -74, -71, -79, -76, -83};
    }

    static {
        A04();
        A00 = new SparseIntArray();
        A03 = false;
        A0B = new AtomicReference<>();
        A0A = new AtomicReference<>();
        A01 = Executors.newSingleThreadExecutor();
        A06 = Arrays.asList(10, 50, 100, 1000);
        A07 = Collections.synchronizedList(new ArrayList());
        A09 = new AtomicInteger();
        A08 = new AtomicBoolean();
        A0C = new AtomicReference<>(false);
        A02 = false;
    }

    public static int A00(String str, int i, T8 t8) {
        if ((A01(462, 7, 5).equals(str) && AbstractC1085Td.A20 == i) || A01(InterfaceC8148mw2.c.t, 5, 90).equals(str) || A01(CK1.p, 6, 62).equals(str)) {
            return 200;
        }
        if (A01(386, 36, 7).equals(str)) {
            return 50;
        }
        if (A01(371, 15, 89).equals(str)) {
            return AbstractC1125Ur.A05(t8);
        }
        return -1;
    }

    public static /* synthetic */ List A02() {
        List<TY> list = A07;
        if (A05[0].charAt(12) != 'b') {
            String[] strArr = A05;
            strArr[6] = "zk7JrRKdkqRVNKieaZlWPGFPyzHfiD6w";
            strArr[3] = "fyoGHU5IjzPGh6SPmUkkru2DTQYQg6uC";
            return list;
        }
        throw new RuntimeException();
    }

    public static void A05(T8 t8, int i, int i2) {
        t8.A08().ABC(A01(427, 10, 35), AbstractC1085Td.A2Z, new C1086Te(A01(338, 33, 12) + i, A01(87, 9, 54) + i2));
    }

    @Deprecated
    public static void A06(T8 t8, String str, int i, C1086Te c1086Te) {
        if (t8 == null) {
            A0F(new RuntimeException(A01(48, 39, 37)));
            return;
        }
        T7.A01(t8.A02());
        if (A02 && c1086Te.A01() == 0) {
            A0D(new RuntimeException(A01(96, 44, 81) + str + A01(31, 16, 108) + i, c1086Te));
        }
        try {
            if (A0J(t8, str, i, Math.random(), c1086Te)) {
                A09(t8, str, i, c1086Te);
            }
        } catch (Throwable th) {
            if (A05[7].length() == 7) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "Wr4fCxMFDWkIVvnx3dc83TKhQDpVGTp5";
            strArr[3] = "OVQSbEPH5m9BJKnAfFJqQw5cDphpT4wi";
            A0F(th);
        }
    }

    @Deprecated
    public static void A07(T8 t8, String str, int i, C1086Te c1086Te) {
        try {
            c1086Te.A05(2);
            c1086Te.A0A(false);
            c1086Te.A06(1);
            if (AbstractC1125Ur.A0Q(t8)) {
                c1086Te.A08(true);
            } else {
                c1086Te.A08(false);
            }
            A06(t8, str, i, c1086Te);
        } catch (Throwable t) {
            A0F(t);
        }
    }

    @Deprecated
    public static void A08(T8 t8, String str, int i, C1086Te c1086Te) {
        try {
            c1086Te.A05(2);
            c1086Te.A08(false);
            A06(t8, str, i, c1086Te);
        } catch (Throwable th) {
            String[] strArr = A05;
            if (strArr[2].charAt(18) != strArr[1].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "lrlTLjNTeannl0YPXC3Gfh7JwXVpOQq4";
            strArr2[1] = "kBSf974kPIRKP3U3j132aDHcl1k5alA0";
            A0F(th);
        }
    }

    public static void A09(T8 t8, String str, int i, C1086Te c1086Te) {
        synchronized (TX.class) {
            if (!A03) {
                int A012 = AbstractC1125Ur.A01(t8);
                int threshold = A09.getAndIncrement();
                if (threshold < A012 - 1) {
                    A07.add(new TY(str, i, c1086Te));
                } else if (A09.get() == A012) {
                    A07.add(new TY(A01(427, 10, 35), AbstractC1085Td.A2W, new C1086Te(A01(C3503Kz.d0, 42, 70) + str + A01(47, 1, 91) + i)));
                }
            } else {
                A0A(t8, str, i, c1086Te, true);
            }
        }
    }

    public static void A0A(T8 t8, String str, int i, C1086Te c1086Te, boolean z) {
        TW tw = A0B.get();
        boolean z2 = tw != null && tw.AAi();
        boolean z3 = A08.get();
        String[] strArr = A05;
        if (strArr[6].charAt(6) == strArr[3].charAt(6)) {
            throw new RuntimeException();
        }
        A05[0] = "wcUF0zMFhzDc2LBIPX26ddygqjW04ktX";
        if (z3 || z2) {
            int A012 = c1086Te.A01();
            String A013 = A01(289, 17, 3);
            String A014 = A01(31, 16, 108);
            if (A012 == 0) {
                Log.e(A013, A01(FF0.q, 37, 114) + str + A014 + i, c1086Te);
            } else {
                Log.i(A013, A01(306, 32, 102) + str + A014 + i + A01(19, 12, 98) + c1086Te.getMessage() + A01(0, 19, 12) + c1086Te.A03());
            }
        }
        C1570f3 c1570f3 = new C1570f3(t8, str, i, c1086Te, tw);
        if (z) {
            A01.execute(c1570f3);
        } else {
            c1570f3.run();
        }
    }

    public static void A0C(C1669ge c1669ge, TW tw, TV tv, boolean z) {
        A0A.set(tv);
        A0B.set(tw);
        A08.set(z);
        synchronized (TX.class) {
            if (!A03) {
                A03 = true;
                A01.execute(new C1571f4(c1669ge));
            }
        }
    }

    public static void A0D(RuntimeException runtimeException) {
        if (A02) {
            new Handler(Looper.getMainLooper()).post(new TU(runtimeException));
        }
    }

    @Deprecated
    public static void A0E(Throwable th) {
        if (A02) {
            A0D(new RuntimeException(A01(256, 33, 71), th));
        }
    }

    public static void A0F(Throwable th) {
        Log.e(A01(289, 17, 3), A01(219, 37, 3), th);
        if (A02) {
            A0D(new RuntimeException(th));
        }
    }

    public static boolean A0H(T8 t8) {
        Boolean shouldSkipFunnelEventsForSession = A0C.get();
        return (shouldSkipFunnelEventsForSession == null || !shouldSkipFunnelEventsForSession.booleanValue()) && AbstractC1125Ur.A0A(t8) != 0;
    }

    public static boolean A0I(T8 t8) {
        Boolean shouldSkipFunnelEventsForSession = A0C.get();
        if (shouldSkipFunnelEventsForSession != null && shouldSkipFunnelEventsForSession.booleanValue()) {
            return false;
        }
        double funnelEventLogProbability = 1.0d / AbstractC1125Ur.A0A(t8);
        return t8.A09().A00() <= funnelEventLogProbability;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017b, code lost:
        com.facebook.ads.redexgen.X.TX.A0C.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0185, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0186, code lost:
        if (r0 <= 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0188, code lost:
        r7 = 1.0d / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018a, code lost:
        if (r11 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018c, code lost:
        r7 = r7 * r2;
        r2 = com.facebook.ads.redexgen.X.TX.A05;
        r1 = r2[6];
        r2 = r2[3];
        r1 = r1.charAt(6);
        r0 = r2.charAt(6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x019e, code lost:
        if (r1 == r0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a0, code lost:
        r2 = com.facebook.ads.redexgen.X.TX.A05;
        r2[5] = "ov2u4VJ7e4Jf0Cpe";
        r2[4] = "3S8vDNMGZoIrI2ECoHj3stfewtnb";
        r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ae, code lost:
        if (r0 > 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b0, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01b2, code lost:
        r2 = com.facebook.ads.redexgen.X.TX.A05;
        r2[2] = "J7AbISTAh4tNpjUdhq3A9LORixiN2LjD";
        r2[1] = "NK4gpNISnoGezA2FzC3Uh9mHyAzfRHIK";
        r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c0, code lost:
        if (r0 > 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c3, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c5, code lost:
        r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c7, code lost:
        if (r0 > 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c9, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01cf, code lost:
        r7 = 1.0d - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01da, code lost:
        if (com.facebook.ads.redexgen.X.TX.A05[7].length() == 7) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01dc, code lost:
        com.facebook.ads.redexgen.X.TX.A05[0] = "IU4RZwbJxJdQMYPPezGzztuufFdsMCjm";
        r0 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e5, code lost:
        if (r0 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01e7, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01e9, code lost:
        r0 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01eb, code lost:
        if (r0 < 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:?, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:?, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
        if (r6 == 2) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0161, code lost:
        if (r6 == 2) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0163, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0164, code lost:
        r0 = com.facebook.ads.redexgen.X.TX.A0C.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016c, code lost:
        if (r0 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0172, code lost:
        if (r0.booleanValue() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0174, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0175, code lost:
        r0 = com.facebook.ads.redexgen.X.AbstractC1125Ur.A0A(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0179, code lost:
        if (r0 != 0) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0J(T8 t8, String str, int i, double d, C1086Te c1086Te) {
        double d2;
        boolean z;
        int additionalDebugLoggingSamplingPercentage;
        try {
            int A042 = AbstractC1125Ur.A04(t8);
            if (A042 < 1) {
                return false;
            }
            HashMap<String, Integer> blackListEventsHashMap = AbstractC1125Ur.A0M(t8);
            String str2 = str + A01(47, 1, 91) + i;
            boolean contains = blackListEventsHashMap.keySet().contains(str2);
            String[] strArr = A05;
            String str3 = strArr[5];
            String str4 = strArr[4];
            int length = str3.length();
            int additionalDebugLoggingSamplingPercentage2 = str4.length();
            if (length != additionalDebugLoggingSamplingPercentage2) {
                String[] strArr2 = A05;
                strArr2[5] = "Da1Avoa7PC9D4jtB";
                strArr2[4] = "iedDIpQY7PrwfrxyH9GARbotTLh4";
                if (contains) {
                    Integer num = blackListEventsHashMap.get(str2);
                    int additionalDebugLoggingSamplingPercentage3 = num != null ? num.intValue() : -1;
                    if (additionalDebugLoggingSamplingPercentage3 == 0) {
                        return false;
                    }
                    if (additionalDebugLoggingSamplingPercentage3 > 0) {
                        return d <= 1.0d / ((double) additionalDebugLoggingSamplingPercentage3);
                    }
                    int additionalDebugLoggingSamplingPercentage4 = AbstractC1125Ur.A03(t8);
                    if (additionalDebugLoggingSamplingPercentage4 < 1) {
                        return false;
                    }
                    d2 = (A042 * additionalDebugLoggingSamplingPercentage4) / 10000.0d;
                } else if (!c1086Te.A0B()) {
                    d2 = 0.0d;
                } else {
                    d2 = A042 / 100.0d;
                }
                double ipcValidationEventLogProbability = t8.A09().A00();
                if (A01(InterfaceC8148mw2.c.t, 5, 90).equals(str)) {
                    if (t8.A05().AAO()) {
                        return true;
                    }
                    int additionalDebugLoggingSamplingPercentage5 = AbstractC1125Ur.A06(t8);
                    if (additionalDebugLoggingSamplingPercentage5 == 0) {
                        return false;
                    }
                    if (additionalDebugLoggingSamplingPercentage5 > 0) {
                        double d3 = 1.0d / additionalDebugLoggingSamplingPercentage5;
                        if (contains) {
                            int additionalDebugLoggingSamplingPercentage6 = (ipcValidationEventLogProbability > (d3 * d2) ? 1 : (ipcValidationEventLogProbability == (d3 * d2) ? 0 : -1));
                            return additionalDebugLoggingSamplingPercentage6 <= 0;
                        }
                        int additionalDebugLoggingSamplingPercentage7 = (ipcValidationEventLogProbability > d3 ? 1 : (ipcValidationEventLogProbability == d3 ? 0 : -1));
                        return additionalDebugLoggingSamplingPercentage7 <= 0;
                    }
                }
                if (A01(462, 7, 5).equals(str)) {
                    int additionalDebugLoggingSamplingPercentage8 = AbstractC1085Td.A20;
                    if (additionalDebugLoggingSamplingPercentage8 == i) {
                        if (!A08.get()) {
                            additionalDebugLoggingSamplingPercentage = AbstractC1125Ur.A0E(t8);
                        } else {
                            additionalDebugLoggingSamplingPercentage = 1;
                        }
                        if (additionalDebugLoggingSamplingPercentage == 0) {
                            return false;
                        }
                        if (additionalDebugLoggingSamplingPercentage > 0) {
                            double d4 = 1.0d / additionalDebugLoggingSamplingPercentage;
                            if (contains) {
                                int additionalDebugLoggingSamplingPercentage9 = (ipcValidationEventLogProbability > (d4 * d2) ? 1 : (ipcValidationEventLogProbability == (d4 * d2) ? 0 : -1));
                                return additionalDebugLoggingSamplingPercentage9 <= 0;
                            }
                            int additionalDebugLoggingSamplingPercentage10 = (ipcValidationEventLogProbability > d4 ? 1 : (ipcValidationEventLogProbability == d4 ? 0 : -1));
                            return additionalDebugLoggingSamplingPercentage10 <= 0;
                        }
                    }
                }
                if (A01(437, 5, 44).equals(str)) {
                    return true;
                }
                if (A01(CK1.p, 6, 62).equals(str)) {
                    if ((!AbstractC1125Ur.A0S(t8) || !c1086Te.A0C()) && c1086Te.A00() != 1) {
                        int A002 = c1086Te.A00();
                        if (A05[7].length() != 7) {
                            String[] strArr3 = A05;
                            strArr3[2] = "6ijQ6X2zmPYfQQU2WY3EqOEmj8b0STeR";
                            strArr3[1] = "v2LtmjlgYOVyMOqq5T34ZrqwCCOH8Ygu";
                        } else {
                            String[] strArr4 = A05;
                            strArr4[2] = "wTzk43rUxJxbc4jkjq3CyWQqu78IUc7I";
                            strArr4[1] = "zVF5buGMjKYPgcPHAX3soMXKkjG8wJtb";
                        }
                    }
                    return true;
                }
                if (A01(448, 14, 101).equals(str)) {
                    if (t8.A05().AAO()) {
                        return true;
                    }
                    z = true;
                    int additionalDebugLoggingSamplingPercentage11 = AbstractC1125Ur.A0B(t8);
                    if (additionalDebugLoggingSamplingPercentage11 == 0) {
                        return false;
                    }
                    if (additionalDebugLoggingSamplingPercentage11 > 0) {
                        double d5 = 1.0d / additionalDebugLoggingSamplingPercentage11;
                        String[] strArr5 = A05;
                        String str5 = strArr5[6];
                        String str6 = strArr5[3];
                        int charAt = str5.charAt(6);
                        int additionalDebugLoggingSamplingPercentage12 = str6.charAt(6);
                        if (charAt != additionalDebugLoggingSamplingPercentage12) {
                            String[] strArr6 = A05;
                            strArr6[2] = "IV4whqvlQLD0BGXZPQ3YwVprPZOrPfbL";
                            strArr6[1] = "vZNpMhzuAfXWQcU0qp3zVw8qbcOKNKfo";
                            if (contains) {
                                int additionalDebugLoggingSamplingPercentage13 = (ipcValidationEventLogProbability > (d5 * d2) ? 1 : (ipcValidationEventLogProbability == (d5 * d2) ? 0 : -1));
                                return additionalDebugLoggingSamplingPercentage13 <= 0;
                            }
                            int i2 = (ipcValidationEventLogProbability > d5 ? 1 : (ipcValidationEventLogProbability == d5 ? 0 : -1));
                            if (A05[7].length() != 7) {
                                String[] strArr7 = A05;
                                strArr7[2] = "6LkwaBQPiPnxYF7a6l3NxmTSXnPItWFw";
                                strArr7[1] = "XjU0i6EyUZ5pzK8FIO3t5mLCTCszmPw2";
                                if (i2 <= 0) {
                                    return true;
                                }
                            } else if (i2 <= 0) {
                                return true;
                            }
                            return false;
                        }
                    }
                } else {
                    z = true;
                }
                int additionalDebugLoggingSamplingPercentage14 = (d > (1.0d - d2) ? 1 : (d == (1.0d - d2) ? 0 : -1));
                if (additionalDebugLoggingSamplingPercentage14 >= 0) {
                    return z;
                }
                return false;
            }
            throw new RuntimeException();
        } catch (Throwable t) {
            A0F(t);
            return false;
        }
    }

    public static boolean A0K(T8 t8, String str, int i, C1086Te c1086Te) {
        if (AbstractC1125Ur.A0P(t8)) {
            int customLimit = A00.get(i);
            int eventsLimit = AbstractC1125Ur.A00(t8);
            if (c1086Te.A02() != -1) {
                eventsLimit = c1086Te.A02();
            } else {
                int currentCounter = A00(str, i, t8);
                if (eventsLimit < currentCounter) {
                    eventsLimit = currentCounter;
                }
            }
            if (customLimit >= eventsLimit) {
                if (A06.contains(Integer.valueOf(customLimit)) && c1086Te.A0D()) {
                    A05(t8, i, customLimit);
                }
                A00.put(i, customLimit + 1);
                return true;
            }
            A00.put(i, customLimit + 1);
            return false;
        }
        return true;
    }
}
