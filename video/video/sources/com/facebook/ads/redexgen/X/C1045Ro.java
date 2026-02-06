package com.facebook.ads.redexgen.X;

import android.content.Intent;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.Ro  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1045Ro {
    public static byte[] A07;
    public static String[] A08 = {"WrVVpIlV0mVOOesXyJjac9RJgGDEsYiy", "55KqVxwk4ItPenJ0PbzoYHpl7VLiDDoF", "", "85Uc86a0UVsoWW8LIwye7frNycSrKuPv", "TRaam", "0wWSnm1p2XMm3vcxH", "", "BPzoua9RAnM56oYN7Gpf0cmvKga9OU"};
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AudienceNetworkActivity A04;
    public final AudienceNetworkActivityApi A05;
    public final C1673gi A06;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 82);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-78, -19, -7, -9, -72, -16, -21, -19, -17, -20, -7, -7, -11, -72, -21, -18, -3, -72, -21, -18, -4, -17, -6, -7, -4, -2, -13, -8, -15, -72, -48, -45, C2638Cg0.n7, -45, -35, -46, -23, C2638Cg0.x7, C2638Cg0.z7, -23, -36, C2638Cg0.A7, C2638Cg0.B7, C2638Cg0.E7, -36, -34, -45, C2638Cg0.n7, -47, -23, -48, -42, C2638Cg0.E7, C2638Cg0.C7, 28, 40, C3307Iz.Y, -25, 31, C8077mf.D, 28, C8077mf.H, C8077mf.E, 40, 40, 36, -25, C8077mf.D, C8077mf.G, C3307Iz.d0, -25, 34, C3307Iz.Z, C3307Iz.e0, C8077mf.H, C3307Iz.c0, C3307Iz.d0, C3307Iz.e0, 34, C3307Iz.e0, 34, C8077mf.D, C3307Iz.X, -25, C8077mf.D, 28, C3307Iz.e0, 34, 47, 34, C3307Iz.e0, 50, C8077mf.B, C8077mf.G, C8077mf.H, C3307Iz.d0, C3307Iz.e0, C3307Iz.c0, 40, 50, C8077mf.H, C8077mf.G, C8077mf.r, 28, C8077mf.D, -37, 19, C8077mf.p, C8077mf.r, C8077mf.u, C8077mf.q, 28, 28, C8077mf.B, -37, C8077mf.p, 17, 32, -37, C8077mf.z, C8077mf.E, C3307Iz.V, C8077mf.u, 31, 32, C3307Iz.V, C8077mf.z, C3307Iz.V, C8077mf.z, C8077mf.p, C8077mf.C, -37, 17, C8077mf.z, 32, C8077mf.D, C8077mf.z, 32, 32, C8077mf.u, 17, C3307Iz.f0, 58, 56, -7, 49, C3307Iz.d0, C3307Iz.f0, 48, C3307Iz.e0, 58, 58, 54, -7, C3307Iz.d0, 47, 62, -7, 52, 57, ED2.a, 48, C4715Xk.i, 62, ED2.a, 52, ED2.a, 52, C3307Iz.d0, 55, -7, 48, C4715Xk.i, C4715Xk.i, 58, C4715Xk.i, C2638Cg0.E7, -27, -29, -92, -36, -41, C2638Cg0.E7, -37, C2638Cg0.n7, -27, -27, C2638Cg0.C7, -92, -41, C2638Cg0.B7, -23, -92, -33, -28, -22, -37, -24, -23, -22, -33, -22, -33, -41, -30, -92, -36, -33, -28, -33, -23, -34, -43, -41, C2638Cg0.E7, -22, -33, -20, -33, -22, -17, -4, 8, 6, C2638Cg0.u7, -1, -6, -4, -2, -5, 8, 8, 4, C2638Cg0.u7, -6, -3, C8077mf.n, C2638Cg0.u7, 2, 7, 13, -2, C8077mf.m, C8077mf.n, 13, 2, 13, 2, -6, 5, C2638Cg0.u7, 2, 6, 9, C8077mf.m, -2, C8077mf.n, C8077mf.n, 2, 8, 7, C2638Cg0.u7, 5, 8, 0, 0, -2, -3, C8077mf.p, 31, C8077mf.p, C8077mf.A, C8077mf.G};
    }

    static {
        A01();
    }

    public C1045Ro(AudienceNetworkActivityApi audienceNetworkActivityApi, C1673gi c1673gi, AudienceNetworkActivity audienceNetworkActivity) {
        this.A05 = audienceNetworkActivityApi;
        this.A06 = c1673gi;
        this.A04 = audienceNetworkActivity;
    }

    private final void A02(boolean z) {
        this.A03 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean A03(WK wk) {
        if (wk != WK.A0I && wk != WK.A0H) {
            WK wk2 = WK.A08;
            String[] strArr = A08;
            if (strArr[3].charAt(18) == strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "QK9lt";
            strArr2[5] = "71ldustRCfnIbk6ZF";
            if (wk != wk2 && wk != WK.A05 && wk != WK.A0G) {
                WK wk3 = WK.A0J;
                String[] strArr3 = A08;
                if (strArr3[6].length() != strArr3[2].length()) {
                    String[] strArr4 = A08;
                    strArr4[4] = "n7dEG";
                    strArr4[5] = "EMW1RUsZodH5Xcp8C";
                    if (wk != wk3) {
                        return false;
                    }
                } else {
                    String[] strArr5 = A08;
                    strArr5[6] = "";
                    strArr5[2] = "";
                    if (wk == wk3) {
                    }
                }
            }
        }
        return true;
    }

    public final void A04(WK wk, String str) {
        boolean z = !this.A03 || C1123Up.A23(this.A06);
        boolean shouldCallOnDestroy = this.A02;
        if (!shouldCallOnDestroy && z) {
            boolean shouldCallOnDestroy2 = A03(wk);
            if (shouldCallOnDestroy2) {
                A09(EnumC1566ez.A03.A03(), str);
            } else {
                A09(A00(54, 48, 103), str);
            }
            this.A02 = true;
        }
    }

    public final void A05(WK wk, String str) {
        if (A03(wk)) {
            A09(EnumC1566ez.A09.A03(), str);
        } else {
            A09(A00(C3503Kz.e0, 35, 121), str);
        }
    }

    public final void A06(WK wk, String str) {
        if (A03(wk)) {
            A09(EnumC1566ez.A05.A03(), str);
        } else {
            A09(A00(102, 39, 91), str);
        }
        A02(true);
        A04(wk, str);
    }

    public final void A07(WK wk, String str) {
        if (C1123Up.A1x(this.A06) && !this.A01 && !this.A00) {
            InterfaceC0899Lt A0F = this.A06.A0F();
            String[] strArr = A08;
            if (strArr[3].charAt(18) == strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "ERQ6CJuvlb3tCwq1OYCzpUpdhNPz9IsE";
            strArr2[0] = "fdli8mgwNbZyMwMFsZ54k8DyiigEG2Sx";
            A0F.ACd();
            A05(wk, str);
        }
    }

    public final void A08(String str, UL ul, String str2) {
        Intent intent = new Intent(str + A00(0, 1, 38) + str2);
        if (ul != null) {
            intent.putExtra(A00(268, 5, 87), ul);
        }
        P2.A00(this.A04).A07(intent);
    }

    public final void A09(String str, String str2) {
        if (A00(221, 47, 71).equals(str) || EnumC1566ez.A0A.A03().equals(str)) {
            this.A01 = true;
        }
        boolean equals = A00(C3503Kz.e0, 35, 121).equals(str);
        if (A08[7].length() == 29) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "q8Yu3i76ZTlYqxP4qtQeXX4gnui9AJbb";
        strArr[0] = "UYbwc2QJiguNdyXAgiRTefqPyIZvniQg";
        if (equals || EnumC1566ez.A09.A03().equals(str)) {
            this.A00 = true;
        }
        if (A00(1, 53, 56).equals(str)) {
            this.A05.finish(9);
        } else if (A00(176, 45, 36).equals(str)) {
            this.A05.finish(10);
        } else {
            A08(str, null, str2);
        }
    }
}
