package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.al  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1306al {
    public static byte[] A02;
    public boolean A00 = true;
    public final M3 A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 85);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{13, C8077mf.D, C8077mf.D, C3307Iz.e0, 66, C8077mf.r, 59, 57, C8077mf.q, 59, 58, 64, 49, 58, 64, C8077mf.B, 59, C3307Iz.e0, 48, 49, 48, 6, C8077mf.x, C3307Iz.V, C3307Iz.V, 52, 73, 31, 66, 52, 55, C8077mf.B, 73, 56, 65, 71, C8077mf.B, 65, 55, 13, -52, C2638Cg0.E7, C2638Cg0.E7, -20, 1, -35, -16, -2, -5, -6, -7, -2, -16, -48, -7, -17, C2638Cg0.s7, 34, C8077mf.E, C8077mf.y, C8077mf.r, -44, -44, C8077mf.u, C3307Iz.V, C8077mf.D, C8077mf.q, 32, C8077mf.y, C8077mf.E, C8077mf.D, -44, -43, -52, C3307Iz.Z, 32, C8077mf.H, C3307Iz.X, -52, C3307Iz.Z, -52, -52, C8077mf.y, C8077mf.u, -52, -44, C2638Cg0.y7, 35, C8077mf.y, C8077mf.D, C8077mf.r, C8077mf.E, 35, C2638Cg0.B7, 28, 17, C8077mf.H, C8077mf.u, C8077mf.E, C8077mf.H, C8077mf.C, 13, C8077mf.D, C8077mf.q, 17, -52, 40, 40, -52, C2638Cg0.y7, 35, C8077mf.y, C8077mf.D, C8077mf.r, C8077mf.E, 35, C2638Cg0.B7, 28, 17, C8077mf.H, C8077mf.u, C8077mf.E, C8077mf.H, C8077mf.C, 13, C8077mf.D, C8077mf.q, 17, C2638Cg0.B7, 32, C8077mf.y, C8077mf.C, C8077mf.y, C8077mf.D, 19, -52, 40, 40, -52, C2638Cg0.y7, C8077mf.r, C8077mf.E, C8077mf.q, C3307Iz.V, C8077mf.C, 17, C8077mf.D, 32, -52, -52, -52, -52, -52, -52, -52, 40, 40, -52, C2638Cg0.y7, C8077mf.r, C8077mf.E, C8077mf.q, C3307Iz.V, C8077mf.C, 17, C8077mf.D, 32, C2638Cg0.B7, C8077mf.p, C8077mf.E, C8077mf.r, C3307Iz.X, -52, 40, 40, -52, C2638Cg0.y7, C8077mf.r, C8077mf.E, C8077mf.q, C3307Iz.V, C8077mf.C, 17, C8077mf.D, 32, C2638Cg0.B7, C8077mf.p, C8077mf.E, C8077mf.r, C3307Iz.X, C2638Cg0.B7, C8077mf.q, C8077mf.x, C8077mf.y, C8077mf.B, C8077mf.r, C8077mf.H, 17, C8077mf.D, -52, -52, -52, -52, -52, -52, -52, 40, 40, -52, C8077mf.r, C8077mf.E, C8077mf.q, C3307Iz.V, C8077mf.C, 17, C8077mf.D, 32, C2638Cg0.B7, C8077mf.p, C8077mf.E, C8077mf.r, C3307Iz.X, C2638Cg0.B7, C8077mf.q, C8077mf.x, C8077mf.y, C8077mf.B, C8077mf.r, C8077mf.H, 17, C8077mf.D, C2638Cg0.B7, C8077mf.B, 17, C8077mf.D, 19, 32, C8077mf.x, -52, -24, -52, -35, -43, -52, C3307Iz.Z, -52, -52, -52, -52, C8077mf.H, 17, 32, C3307Iz.V, C8077mf.H, C8077mf.D, -25, -52, -52, C3307Iz.a0, -52, -52, 34, 13, C8077mf.H, -52, C8077mf.D, 34, 32, C8077mf.y, C8077mf.C, C8077mf.y, C8077mf.D, 19, C8077mf.m, C8077mf.m, 13, C8077mf.D, C8077mf.m, 32, -52, -23, -52, 35, C8077mf.y, C8077mf.D, C8077mf.r, C8077mf.E, 35, C2638Cg0.B7, 28, 17, C8077mf.H, C8077mf.u, C8077mf.E, C8077mf.H, C8077mf.C, 13, C8077mf.D, C8077mf.q, 17, C2638Cg0.B7, 32, C8077mf.y, C8077mf.C, C8077mf.y, C8077mf.D, 19, -25, -52, -52, C8077mf.y, C8077mf.u, -52, -44, C8077mf.D, 34, 32, C8077mf.y, C8077mf.C, C8077mf.y, C8077mf.D, 19, C8077mf.m, C8077mf.m, 13, C8077mf.D, C8077mf.m, 32, C2638Cg0.B7, C8077mf.H, 17, 31, 28, C8077mf.E, C8077mf.D, 31, 17, -15, C8077mf.D, C8077mf.r, -52, -22, -52, -36, -43, -52, C3307Iz.Z, -52, -52, -52, -52, C8077mf.q, C8077mf.E, C8077mf.D, 31, C8077mf.E, C8077mf.B, 17, C2638Cg0.B7, C8077mf.B, C8077mf.E, 19, -44, -45, -19, -6, -6, 13, 34, -2, 17, 31, 28, C8077mf.E, C8077mf.D, 31, 17, -15, C8077mf.D, C8077mf.r, -26, -45, -52, -41, -52, C8077mf.D, 34, 32, C8077mf.y, C8077mf.C, C8077mf.y, C8077mf.D, 19, C8077mf.m, C8077mf.m, 13, C8077mf.D, C8077mf.m, 32, C2638Cg0.B7, C8077mf.H, 17, 31, 28, C8077mf.E, C8077mf.D, 31, 17, -15, C8077mf.D, C8077mf.r, -43, -25, -52, -52, C3307Iz.a0, -52, -52, C8077mf.y, C8077mf.u, -52, -44, C8077mf.D, 34, 32, C8077mf.y, C8077mf.C, C8077mf.y, C8077mf.D, 19, C8077mf.m, C8077mf.m, 13, C8077mf.D, C8077mf.m, 32, C2638Cg0.B7, C8077mf.r, C8077mf.E, C8077mf.C, -17, C8077mf.E, C8077mf.D, 32, 17, C8077mf.D, 32, -8, C8077mf.E, 13, C8077mf.r, 17, C8077mf.r, -15, 34, 17, C8077mf.D, 32, -1, 32, 13, C8077mf.H, 32, -52, -22, -52, -36, -43, -52, C3307Iz.Z, -52, -52, -52, -52, C8077mf.q, C8077mf.E, C8077mf.D, 31, C8077mf.E, C8077mf.B, 17, C2638Cg0.B7, C8077mf.B, C8077mf.E, 19, -44, -45, -19, -6, -6, 13, 34, -16, C8077mf.E, C8077mf.C, -17, C8077mf.E, C8077mf.D, 32, 17, C8077mf.D, 32, -8, C8077mf.E, 13, C8077mf.r, 17, C8077mf.r, -26, -45, -52, -41, -52, C8077mf.D, 34, 32, C8077mf.y, C8077mf.C, C8077mf.y, C8077mf.D, 19, C8077mf.m, C8077mf.m, 13, C8077mf.D, C8077mf.m, 32, C2638Cg0.B7, C8077mf.r, C8077mf.E, C8077mf.C, -17, C8077mf.E, C8077mf.D, 32, 17, C8077mf.D, 32, -8, C8077mf.E, 13, C8077mf.r, 17, C8077mf.r, -15, 34, 17, C8077mf.D, 32, -1, 32, 13, C8077mf.H, 32, -43, -25, -52, -52, C3307Iz.a0, -52, -52, C8077mf.y, C8077mf.u, -52, -44, C8077mf.D, 34, 32, C8077mf.y, C8077mf.C, C8077mf.y, C8077mf.D, 19, C8077mf.m, C8077mf.m, 13, C8077mf.D, C8077mf.m, 32, C2638Cg0.B7, C8077mf.B, C8077mf.E, 13, C8077mf.r, -15, 34, 17, C8077mf.D, 32, -15, C8077mf.D, C8077mf.r, -52, -22, -52, -36, -43, -52, C3307Iz.Z, -52, -52, -52, -52, C8077mf.q, C8077mf.E, C8077mf.D, 31, C8077mf.E, C8077mf.B, 17, C2638Cg0.B7, C8077mf.B, C8077mf.E, 19, -44, -45, -19, -6, -6, 13, 34, -8, C8077mf.E, 13, C8077mf.r, -15, 34, 17, C8077mf.D, 32, -15, C8077mf.D, C8077mf.r, -26, -45, -52, -41, -52, C8077mf.D, 34, 32, C8077mf.y, C8077mf.C, C8077mf.y, C8077mf.D, 19, C8077mf.m, C8077mf.m, 13, C8077mf.D, C8077mf.m, 32, C2638Cg0.B7, C8077mf.B, C8077mf.E, 13, C8077mf.r, -15, 34, 17, C8077mf.D, 32, -15, C8077mf.D, C8077mf.r, -43, -25, -52, -52, C3307Iz.a0, C3307Iz.a0, -52, C8077mf.q, 13, 32, C8077mf.q, C8077mf.x, -44, 17, C8077mf.H, C8077mf.H, -43, -52, C3307Iz.Z, -52, -52, C8077mf.q, C8077mf.E, C8077mf.D, 31, C8077mf.E, C8077mf.B, 17, C2638Cg0.B7, C8077mf.B, C8077mf.E, 19, -44, -45, 13, C8077mf.D, C8077mf.m, C8077mf.D, 13, 34, C8077mf.y, 19, 13, 32, C8077mf.y, C8077mf.E, C8077mf.D, C8077mf.m, 32, C8077mf.y, C8077mf.C, C8077mf.y, C8077mf.D, 19, C8077mf.m, 17, C8077mf.H, C8077mf.H, C8077mf.E, C8077mf.H, -26, -45, -52, -41, -52, 17, C8077mf.H, C8077mf.H, C2638Cg0.B7, C8077mf.C, 17, 31, 31, 13, 19, 17, -43, -25, C3307Iz.a0, C3307Iz.a0, -43, -44, -43, -43, -25};
    }

    public C1306al(M3 m3) {
        this.A01 = m3;
    }

    public static long A00(String str, String str2) {
        String substring = str.substring(str2.length());
        if (TextUtils.isEmpty(substring)) {
            return -1L;
        }
        try {
            long parseLong = Long.parseLong(substring);
            if (parseLong < 0) {
                return -1L;
            }
            return parseLong;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void A03() {
        if (!this.A00) {
            return;
        }
        if (this.A01.canGoBack() || this.A01.canGoForward()) {
            this.A00 = false;
        } else {
            this.A01.A0I(A01(57, 693, 87));
        }
    }

    public final void A04(String str) {
        if (!this.A00) {
            return;
        }
        String A01 = A01(40, 17, 54);
        if (str.startsWith(A01)) {
            this.A01.A0M(A00(str, A01));
            return;
        }
        String A012 = A01(0, 22, 119);
        if (str.startsWith(A012)) {
            this.A01.A0K(A00(str, A012));
            return;
        }
        String A013 = A01(22, 18, 126);
        if (!str.startsWith(A013)) {
            return;
        }
        this.A01.A0L(A00(str, A013));
    }

    public final void A05(boolean z) {
        this.A00 = z;
    }
}
