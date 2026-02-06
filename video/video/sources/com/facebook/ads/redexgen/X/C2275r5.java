package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.r5  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2275r5 {
    public static C2275r5 A03;
    public static InterfaceC2303rX A04;
    public static byte[] A05;
    public static String[] A06 = {"5DKKU3xZINN65fryyoBt5QQPLIMTkohn", "LFzimA69beWaSFXyztzupLxdNfHOQ", "XSuolM5aqTyza3oApgyv2R2QmsMDCJc3", "zWK24MgLV", "4", "qJClZMWv8", "0fmkfxUqb1vnRdlz6H0UDHtVT1WIbpOa", "oRXxD"};
    public final C0610Am A00;
    public final C2287rH A01;
    public final C2285rF A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A06[4].length() == 19) {
                throw new RuntimeException();
            }
            A06[6] = "At1Zr1oMV19x7NxsOWFoG9shzyjt72Ks";
            copyOfRange[i4] = (byte) ((b - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-89, -74, -87, -91, -72, -87};
    }

    static {
        A03();
        A03 = null;
        A04 = null;
    }

    public C2275r5(C0610Am c0610Am, AbstractC2291rL abstractC2291rL, C2285rF c2285rF, C2287rH c2287rH) {
        this.A00 = c0610Am;
        this.A01 = c2287rH;
        this.A02 = c2285rF;
        abstractC2291rL.A03(new C0607Aj(c2285rF));
    }

    public static AbstractC2302rW A00(int i) {
        if (0 == 0) {
            return null;
        }
        throw new NullPointerException(A02(0, 6, 61));
    }

    public static C2275r5 A01(C0610Am c0610Am, AbstractC2291rL abstractC2291rL, InterfaceC2296rQ interfaceC2296rQ, InterfaceC0609Al interfaceC0609Al, InterfaceC2297rR interfaceC2297rR) {
        C2275r5 c2275r5 = A03;
        if (c2275r5 != null) {
            return c2275r5;
        }
        C2287rH c2287rH = new C2287rH(c0610Am);
        CK ck = CK.A00;
        Handler handler = new Handler(Looper.getMainLooper());
        A00(100);
        return new C2275r5(c0610Am, abstractC2291rL, new C2285rF(c0610Am, interfaceC2296rQ, ck, interfaceC0609Al, c2287rH, interfaceC2297rR, handler, null), c2287rH);
    }

    public final void A04(InterfaceC2290rK interfaceC2290rK) {
        this.A02.A0H(interfaceC2290rK);
    }

    public final void A05(InterfaceC2288rI interfaceC2288rI) {
        this.A02.A0I(interfaceC2288rI);
    }

    public final void A06(InterfaceC2274r4 interfaceC2274r4) {
        A07(interfaceC2274r4, null);
    }

    public final void A07(InterfaceC2274r4 interfaceC2274r4, C2300rU c2300rU) {
        if (this.A00.A00 && c2300rU != null) {
            this.A01.A06(interfaceC2274r4, c2300rU);
        } else {
            this.A01.A05(interfaceC2274r4);
        }
    }

    public final void A08(InterfaceC2274r4 interfaceC2274r4, C2300rU c2300rU, C2293rN c2293rN) {
        if (this.A00.A00 && c2300rU != null) {
            this.A01.A07(interfaceC2274r4, c2300rU, c2293rN);
        } else {
            this.A01.A08(interfaceC2274r4, c2293rN);
        }
    }

    public final void A09(InterfaceC2274r4 interfaceC2274r4, C2293rN c2293rN) {
        A08(interfaceC2274r4, null, c2293rN);
    }
}
