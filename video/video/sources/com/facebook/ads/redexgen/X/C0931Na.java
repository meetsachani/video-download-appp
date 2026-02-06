package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import java.io.Serializable;
import java.util.Arrays;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Na  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0931Na implements Serializable {
    public static byte[] A0A = null;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final long serialVersionUID = 8946536326456653736L;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0A = new byte[]{110, 125, 126, 125, -126, 125, -111, 121, -118, -72, -118, -68, -117, -116, -77, C2638Cg0.v7, C2638Cg0.o7, C2638Cg0.v7, -60, C2638Cg0.v7, -13, -113, -46, -94, -46, -93, -46, -91, Byte.MIN_VALUE, C2638Cg0.r7, C2638Cg0.r7, -111, -115, -107, -115, C2638Cg0.r7, C2638Cg0.r7, C2638Cg0.o7, C2638Cg0.q7, C2638Cg0.q7, -60, C2638Cg0.y7, -45, -66, C2638Cg0.q7, C2638Cg0.z7, C2638Cg0.x7, C2638Cg0.z7, -47, C8077mf.B, C8077mf.G, C8077mf.y, C8077mf.C, C3307Iz.X, 34, C3307Iz.X, 40, C8077mf.z, 35, C8077mf.B, C3307Iz.e0, 19, C8077mf.A, 35, 32, 35, C3307Iz.Y, C8077mf.E, C3307Iz.d0, C8077mf.C, C8077mf.A, C8077mf.E, C3307Iz.Z, 36, C3307Iz.Z, 42, C8077mf.p, 31, C8077mf.n, 10, C8077mf.p, C8077mf.D, C8077mf.A, C8077mf.D, C8077mf.G, 10, C8077mf.D, C3307Iz.V, C8077mf.r, C8077mf.G, 10, C8077mf.B, C8077mf.r, C8077mf.q, C8077mf.x, C8077mf.n, 17, 34, C8077mf.q, 13, C8077mf.u, C3307Iz.Z, 28, C8077mf.q, C8077mf.E, C8077mf.A, 17, 13, 17, C8077mf.G, C8077mf.D, C8077mf.G, 32, -16, 1, -18, -20, 1, -14, 5, 1, -20, -16, -4, -7, -4, -1, 32, 49, C8077mf.H, 28, 49, 34, 53, 49, 28, 32, C3307Iz.d0, C3307Iz.a0, C3307Iz.d0, 47, 28, C3307Iz.d0, 51, 34, 47, 28, 42, 34, C3307Iz.V, C3307Iz.Y, C8077mf.H, 28, C8077mf.H, C8077mf.m, C8077mf.G, C8077mf.u, C8077mf.G, C8077mf.y, C8077mf.p, 8, C8077mf.n, C8077mf.B, C8077mf.y, C8077mf.B, C8077mf.E, C3307Iz.a0, C8077mf.H, C3307Iz.a0, C3307Iz.V, C8077mf.D, C8077mf.x, C8077mf.B, 36, C3307Iz.V, 36, C3307Iz.Z};
    }

    static {
        A03();
        A0B = Color.parseColor(A02(14, 7, 76));
        A0C = Color.parseColor(A02(7, 7, 18));
        A0D = Color.parseColor(A02(21, 7, 40));
        String A02 = A02(28, 9, 25);
        A0E = Color.parseColor(A02);
        A0F = Color.parseColor(A02(0, 7, 7));
        A0G = Color.parseColor(A02);
    }

    public C0931Na(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A05 = i6;
        this.A07 = i7;
        this.A08 = i8;
        this.A09 = i9;
        this.A06 = i10;
    }

    public static int A00(JSONObject jSONObject, String str, int i) {
        if (jSONObject != null && jSONObject.has(str)) {
            return Color.parseColor(jSONObject.optString(str));
        }
        return i;
    }

    public static C0931Na A01(JSONObject jSONObject) {
        return new C0931Na(A00(jSONObject, A02(37, 12, 27), A0B), A00(jSONObject, A02(57, 10, 112), A0C), A00(jSONObject, A02(C3503Kz.l0, 14, 101), -16777216), A00(jSONObject, A02(49, 8, 114), A0D), A00(jSONObject, A02(67, 9, 116), A0E), A00(jSONObject, A02(76, 20, 103), -1), A00(jSONObject, A02(113, 14, 73), -1), A00(jSONObject, A02(127, 25, 121), A0G), A00(jSONObject, A02(C10997yd1.t1, 11, 113), -16777216), A00(jSONObject, A02(96, 17, 106), A0E));
    }

    public final int A04() {
        return this.A06;
    }

    public final int A05(boolean z) {
        if (z) {
            return -1;
        }
        return this.A00;
    }

    public final int A06(boolean z) {
        if (z) {
            return -1;
        }
        return this.A01;
    }

    public final int A07(boolean z) {
        if (z) {
            return -1;
        }
        return this.A02;
    }

    public final int A08(boolean z) {
        return z ? A0F : this.A03;
    }

    public final int A09(boolean z) {
        return z ? this.A05 : this.A04;
    }

    public final int A0A(boolean z) {
        return z ? this.A08 : this.A07;
    }

    public final int A0B(boolean z) {
        if (z) {
            return -1;
        }
        return this.A09;
    }
}
