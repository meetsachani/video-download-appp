package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ao  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0612Ao implements InterfaceC2299rT {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC2304rY A00;
    public InterfaceC2288rI A01;
    public C2275r5 A02;
    public final InterfaceC2289rJ A04;
    public final C0610Am A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC2288rI A03 = new C0613Ap(this);

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    static {
        A04();
        A07 = false;
    }

    public C0612Ao(C0610Am c0610Am, InterfaceC2304rY interfaceC2304rY, InterfaceC2289rJ interfaceC2289rJ) {
        this.A05 = c0610Am;
        this.A00 = interfaceC2304rY;
        this.A04 = interfaceC2289rJ;
    }

    public static C0612Ao A01() {
        return new C0612Ao(new C0610Am(), new C0615Ar(), null);
    }

    private void A05(AbstractC2291rL abstractC2291rL, InterfaceC2296rQ interfaceC2296rQ, InterfaceC0609Al interfaceC0609Al, InterfaceC2297rR interfaceC2297rR) {
        this.A02 = C2275r5.A01(this.A05, abstractC2291rL, interfaceC2296rQ, interfaceC0609Al, interfaceC2297rR);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(InterfaceC2274r4 interfaceC2274r4, C2300rU c2300rU) {
        C2275r5 c2275r5 = this.A02;
        if (c2275r5 != null && interfaceC2274r4 != null) {
            if (this.A05.A00 && c2300rU != null) {
                c2275r5.A07(interfaceC2274r4, c2300rU);
            } else {
                c2275r5.A06(interfaceC2274r4);
            }
        }
    }

    private void A07(InterfaceC2274r4 interfaceC2274r4, C2300rU c2300rU, C2293rN c2293rN) {
        C2275r5 c2275r5 = this.A02;
        if (c2275r5 != null && interfaceC2274r4 != null && c2293rN != null) {
            if (this.A05.A00 && c2300rU != null) {
                c2293rN.A02 = interfaceC2274r4.hashCode() + A02(0, 1, 27) + c2293rN.A08 + c2300rU;
                c2275r5.A08(interfaceC2274r4, c2300rU, c2293rN);
                return;
            }
            c2275r5.A09(interfaceC2274r4, c2293rN);
        }
    }

    public final void A08(View view) {
        A06(view != null ? C0608Ak.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C2293rN<?, ?> c2293rN) {
        A07(view != null ? C0608Ak.A00(view) : null, null, c2293rN);
    }

    public final void A0A(AbstractC2291rL abstractC2291rL, View view) {
        if (abstractC2291rL != null && view != null) {
            A05(abstractC2291rL, new C0614Aq(view, this.A00), new C04021u(null), null);
        }
    }
}
