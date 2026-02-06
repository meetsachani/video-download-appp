package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.UUID;
import o.C10997yd1;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.CK1;
import o.ED2;
import o.InterfaceC8148mw2;
import o.QC1;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.No  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0945No implements Serializable {
    public static byte[] A0Q = null;
    public static String[] A0R = {"ctorgdsQQ2U4B6CI8kOgnWnGWE5Hgfx0", "OfZzAcfvUxmyP", "hRr0xuGBslycC2aIRO91", "oYy00yp7m", "vkVvrMYFy", "Q6DpYSl0Gg7lXNb5sJ12E0KBmjRKKzYP", "aB5DzfiXC0YdMCjW8pZWdkroLLRV865X", ""};
    public static final EnumC0946Np A0S;
    public static final EnumC1334bD A0T;
    public static final long serialVersionUID = -5352540123250859603L;
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final EnumC0946Np A0D;
    public final EnumC1334bD A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0Q, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0Q = new byte[]{70, 97, 124, 123, 110, 99, 99, 62, C8077mf.G, 19, C8077mf.z, C8077mf.E, 28, C8077mf.y, 82, 34, C8077mf.H, 19, C8077mf.m, 19, C8077mf.r, C8077mf.H, C8077mf.A, 91, 103, 106, 114, C3307Iz.c0, 88, Byte.MAX_VALUE, 100, 121, 110, C3307Iz.c0, 124, 98, 103, 103, C3307Iz.c0, 106, 126, Byte.MAX_VALUE, 100, 102, 106, Byte.MAX_VALUE, 98, 104, 106, 103, 103, 114, C3307Iz.c0, 100, 123, 110, 101, C3307Iz.c0, 98, 101, C3307Iz.c0, 80, QC1.w, 110, 104, QC1.w, 86, QC1.w, 2, 62, 51, C3307Iz.c0, 51, 48, 62, 55, 114, 51, 54, C3307Iz.e0, C8077mf.D, 8, C8077mf.H, 13, C8077mf.E, C8077mf.D, C8077mf.E, 95, 47, 19, C8077mf.H, 6, 93, 82, 87, 91, 80, 74, 97, 74, 81, 85, 91, 80, 122, 109, C8077mf.y, C8077mf.x, C8077mf.G, C8077mf.r, 8, C3307Iz.f0, C8077mf.u, C8077mf.G, C8077mf.B, C8077mf.u, C8077mf.D, C3307Iz.f0, 5, C8077mf.x, 9, 5, 58, 49, 62, C4715Xk.i, 51, 58, 0, 58, 49, 59, 0, 60, 62, C3307Iz.e0, 59, 8, 3, C8077mf.n, C8077mf.q, 1, 8, 50, 4, 3, C8077mf.C, 31, 2, 50, C8077mf.p, C8077mf.n, 31, 9, C8077mf.C, C8077mf.E, C8077mf.r, C8077mf.E, C8077mf.n, C8077mf.A, C8077mf.G, C3307Iz.V, 10, C8077mf.E, 6, 10, 66, 69, 88, 95, 74, 69, 72, 78, 116, 66, 79, 107, 108, 118, 112, 109, 93, 97, 99, 112, 102, 93, 107, 97, 109, 108, 93, 119, 112, 110, 122, 96, 76, 99, Byte.MAX_VALUE, 114, 106, 114, 113, Byte.MAX_VALUE, 118, 76, 97, 118, 126, 124, 103, 118, 76, 117, 124, 97, 126, 114, 103, C8077mf.A, 13, C3307Iz.V, C8077mf.p, C8077mf.u, 31, 7, 31, 28, C8077mf.u, C8077mf.E, C3307Iz.V, 8, 76, C3307Iz.V, 28, 31, C8077mf.r, C8077mf.r, C8077mf.E, C8077mf.n, C3307Iz.V, 17, 8, C8077mf.E, C8077mf.n, C8077mf.u, 31, 7, C3307Iz.V, C8077mf.G, C8077mf.u, C8077mf.A, C8077mf.G, C8077mf.y, 31, 28, C8077mf.u, C8077mf.E, 68, 94, 114, 93, 65, 76, 84, 76, 79, 65, 72, 114, 91, 31, 114, 79, 76, 67, 67, 72, 95, 114, 66, 91, 72, 95, 65, 76, 84, 114, 72, 67, 76, 79, 65, 72, 73, 118, 107, 112, 124, 119, 109, QC1.w, 109, 112, 118, 119, 92, 64, 77, 85, 2, 75, 67, 67, 75, 64, 73, 2, 79, 67, 65, 83, 79, 66, 90, 66, 65, 79, 70, 124, 64, 87, 66, 124, 87, 70, 91, 87, 121, 101, 104, 112, 104, 107, 101, 108, 86, 109, 104, 125, 104, C8077mf.A, C8077mf.m, 6, C8077mf.H, 6, 5, C8077mf.m, 2, 56, 2, 9, 3, 56, 4, 6, C8077mf.y, 3, 56, 3, 2, C8077mf.x, 4, 51, 47, 34, 58, 34, C3307Iz.V, 47, C3307Iz.Y, 28, 42, C3307Iz.e0, 55, 49, C3307Iz.d0, 28, 32, 34, 49, C3307Iz.Z, 28, C3307Iz.Z, C3307Iz.Y, 48, 32, 42, 54, 59, 35, 59, 56, 54, ED2.a, 5, 52, C3307Iz.f0, 62, 5, C3307Iz.f0, 51, 55, ED2.a, 55, C3307Iz.c0, C3307Iz.Y, 62, C3307Iz.Y, C3307Iz.X, C3307Iz.c0, 34, C8077mf.B, 53, 34, 35, 34, 52, C3307Iz.f0, 32, C3307Iz.a0, C8077mf.B, 34, C3307Iz.a0, C3307Iz.Y, C3307Iz.X, C3307Iz.c0, 34, 35, C3307Iz.Y, 58, 55, 47, 55, 52, 58, 51, 9, C3307Iz.X, C4715Xk.i, ED2.a, C3307Iz.Y, C3307Iz.Y, 55, 52, 58, 51, 9, C3307Iz.X, 51, 53, 57, 56, 50, C3307Iz.X, 83, 79, 66, 90, 66, 65, 79, 70, 124, 85, 17, 124, 65, 66, 77, 77, 70, 81, 124, 76, 85, 70, 81, 79, 66, 90, 124, 71, 70, 79, 66, 90, 95, 93, 74, 76, 78, 76, 71, 70, 65, 72, 112, 66, 74, 91, 71, 64, 75, 110, 108, 123, 114, 113, Byte.MAX_VALUE, 122, 119, 112, 121, 65, 110, 114, Byte.MAX_VALUE, 103, Byte.MAX_VALUE, 124, 114, 123, 65, 125, 113, 112, 106, 123, 112, 106, 65, 123, 112, Byte.MAX_VALUE, 124, 114, 123, 122, C8077mf.n, C8077mf.E, 9, 31, C8077mf.n, C8077mf.D, C8077mf.E, C8077mf.D, C3307Iz.V, C8077mf.p, C8077mf.u, 31, 7, C3307Iz.V, 10, C8077mf.E, 6, 10, 4, 28, C8077mf.H, 7, 7, C8077mf.z, C8077mf.y, C8077mf.E, C8077mf.u, 40, 4, C8077mf.u, C8077mf.x, C8077mf.B, C8077mf.C, 19, 4, C8077mf.C, C8077mf.D, 6, C8077mf.m, C8077mf.C, 2, 53, C8077mf.C, 9, C8077mf.B, C8077mf.q, C8077mf.q, 4, 53, C8077mf.p, 31, C8077mf.B, C8077mf.m, C8077mf.H, 3, 5, 4, 42, C3307Iz.a0, 53, 56, 42, 49, 6, 42, 58, C3307Iz.c0, 60, 60, 55, 6, C3307Iz.e0, 60, C3307Iz.V, C3307Iz.e0, C8077mf.p, C8077mf.y, 8, C8077mf.r, C8077mf.u, C8077mf.m, C8077mf.m, C8077mf.D, C8077mf.C, C8077mf.A, C8077mf.H, 36, 8, C8077mf.H, C8077mf.B, C8077mf.x, C8077mf.y, 31, 8, 9, C8077mf.p, C8077mf.y, 111, 112, 125, 124, 118, 70, 117, 124, QC1.w, 125, 112, 119, 126, 70, 105, 117, QC1.w, 96, QC1.w, 123, 117, 124, 70, 124, 119, QC1.w, 123, 117, 124, 125, 99, 124, 113, 112, 122, 74, 121, 112, 116, 113, 124, 123, 114, 74, 101, 121, 116, 108, 116, 119, 121, 112, 74, 96, 123, 102, 126, 124, 101, 101, 116, 119, 121, 112, 74, 97, 124, QC1.w, 112, 102, 116, 115, 78, 103, QC1.w, 116, 102, 78, 101, QC1.w, 124, 116, 126, 100, 101, 78, QC1.w, Byte.MAX_VALUE, 78, 124, QC1.w, 125, 125, QC1.w, 98, 116, 114, 126, Byte.MAX_VALUE, 117, 98};
    }

    static {
        A09();
        A0T = EnumC1334bD.A04;
        A0S = EnumC0946Np.A03;
    }

    public C0945No(String str, String str2, int i, String str3, String str4, EnumC1334bD enumC1334bD, int i2, boolean z, boolean z2, EnumC0946Np enumC0946Np, boolean z3, String str5, boolean z4, boolean z5, int i3, String str6, String str7, int i4, String str8, boolean z6, boolean z7, int i5, boolean z8, int i6, String str9) {
        if (z3) {
            this.A0I = UUID.randomUUID().toString();
            this.A0H = XB.A00(str).buildUpon().appendQueryParameter(A04(C10997yd1.t1, 11, 28), this.A0I).appendQueryParameter(A04(92, 12, 9), str5).build().toString();
        } else {
            this.A0H = str;
            this.A0I = null;
        }
        this.A0G = str2;
        this.A0A = i;
        this.A0J = str3;
        this.A0F = str4;
        this.A0E = enumC1334bD;
        this.A0C = i2;
        this.A0L = z;
        this.A06 = z2;
        this.A0D = enumC0946Np;
        this.A0M = z3;
        this.A08 = z4;
        this.A07 = z5;
        this.A01 = i3;
        this.A05 = str6;
        this.A04 = str7;
        this.A0B = i4;
        this.A0K = str8;
        this.A0P = z6;
        this.A0O = z7;
        this.A09 = i5;
        this.A0N = z8;
        this.A00 = i6;
        this.A03 = str9;
    }

    public static int A00(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A04(340, 13, 62));
        if (optJSONObject != null) {
            String A04 = A04(CK1.s, 26, 97);
            boolean has = optJSONObject.has(A04);
            if (A0R[7].length() == 9) {
                throw new RuntimeException();
            }
            A0R[1] = "DEIp";
            if (has) {
                return optJSONObject.optInt(A04);
            }
        }
        String A042 = A04(569, 17, 64);
        if (jSONObject.has(A042)) {
            return jSONObject.optInt(A042);
        }
        if (A0R[7].length() != 9) {
            A0R[1] = "AI76RAj";
            return jSONObject.optInt(A04(626, 19, 76), 0);
        }
        throw new RuntimeException();
    }

    public static int A01(JSONObject jSONObject, JSONObject jSONObject2) {
        int playableSkippableTimeInSecs = jSONObject2.optInt(A04(399, 17, 109));
        int playableNTDTime = A00(jSONObject);
        if (playableSkippableTimeInSecs > 0 && playableSkippableTimeInSecs < playableNTDTime) {
            return playableNTDTime - playableSkippableTimeInSecs;
        }
        return 0;
    }

    public static C0945No A02(JSONObject jSONObject) {
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject(A04(340, 13, 62));
        if (optJSONObject == null) {
            return null;
        }
        EnumC0946Np A00 = EnumC0946Np.A00(optJSONObject.optString(A04(499, 17, 24), A0S.name()));
        String precachingMethodStr = A04(648, 30, 46);
        boolean optBoolean = optJSONObject.optBoolean(precachingMethodStr, false);
        String precachingMethodStr2 = A04(645, 3, 75);
        String optString = optJSONObject.optString(precachingMethodStr2);
        String precachingMethodStr3 = A04(177, 19, 53);
        String optString2 = optJSONObject.optString(precachingMethodStr3);
        int A002 = A00(jSONObject);
        String A07 = A07(optJSONObject);
        String A05 = A05(optJSONObject);
        EnumC1334bD A03 = A03(optJSONObject);
        int optInt = optJSONObject.optInt(A04(717, 32, 38), 5000);
        if (!optBoolean) {
            String precachingMethodStr4 = A04(C3503Kz.a0, 17, 90);
            if (optJSONObject.optBoolean(precachingMethodStr4, true)) {
                z = true;
                String precachingMethodStr5 = A04(122, 15, 104);
                boolean optBoolean2 = optJSONObject.optBoolean(precachingMethodStr5);
                String precachingMethodStr6 = A04(196, 25, 36);
                boolean optBoolean3 = optJSONObject.optBoolean(precachingMethodStr6);
                String precachingMethodStr7 = A04(104, 2, 46);
                String optString3 = jSONObject.optString(precachingMethodStr7);
                String precachingMethodStr8 = A04(416, 25, 112);
                boolean optBoolean4 = optJSONObject.optBoolean(precachingMethodStr8, false);
                String precachingMethodStr9 = A04(678, 39, 34);
                int optInt2 = optJSONObject.optInt(precachingMethodStr9, 5);
                String optString4 = jSONObject.optString(A04(375, 24, 116), A04(68, 11, 101));
                String optString5 = jSONObject.optString(A04(353, 22, 80), A04(308, 15, 27));
                String precachingMethodStr10 = A04(586, 22, 93);
                int optInt3 = optJSONObject.optInt(precachingMethodStr10, 2000);
                String A08 = A08(optJSONObject);
                String precachingMethodStr11 = A04(260, 37, 26);
                boolean optBoolean5 = optJSONObject.optBoolean(precachingMethodStr11, true);
                String precachingMethodStr12 = A04(221, 39, 73);
                boolean optBoolean6 = optJSONObject.optBoolean(precachingMethodStr12, true);
                String precachingMethodStr13 = A04(467, 32, 20);
                int optInt4 = optJSONObject.optInt(precachingMethodStr13, 3000);
                String precachingMethodStr14 = A04(516, 35, 41);
                boolean isVideoLeadingPlayableEnabled = optJSONObject.optBoolean(precachingMethodStr14, true);
                return new C0945No(optString, optString2, A002, A07, A05, A03, optInt, z, optBoolean2, A00, optBoolean3, optString3, optBoolean, optBoolean4, optInt2, optString4, optString5, optInt3, A08, optBoolean5, optBoolean6, optInt4, isVideoLeadingPlayableEnabled, A01(jSONObject, optJSONObject), A06(optJSONObject));
            }
        }
        z = false;
        String precachingMethodStr52 = A04(122, 15, 104);
        boolean optBoolean22 = optJSONObject.optBoolean(precachingMethodStr52);
        String precachingMethodStr62 = A04(196, 25, 36);
        boolean optBoolean32 = optJSONObject.optBoolean(precachingMethodStr62);
        String precachingMethodStr72 = A04(104, 2, 46);
        String optString32 = jSONObject.optString(precachingMethodStr72);
        String precachingMethodStr82 = A04(416, 25, 112);
        boolean optBoolean42 = optJSONObject.optBoolean(precachingMethodStr82, false);
        String precachingMethodStr92 = A04(678, 39, 34);
        int optInt22 = optJSONObject.optInt(precachingMethodStr92, 5);
        String optString42 = jSONObject.optString(A04(375, 24, 116), A04(68, 11, 101));
        String optString52 = jSONObject.optString(A04(353, 22, 80), A04(308, 15, 27));
        String precachingMethodStr102 = A04(586, 22, 93);
        int optInt32 = optJSONObject.optInt(precachingMethodStr102, 2000);
        String A082 = A08(optJSONObject);
        String precachingMethodStr112 = A04(260, 37, 26);
        boolean optBoolean52 = optJSONObject.optBoolean(precachingMethodStr112, true);
        String precachingMethodStr122 = A04(221, 39, 73);
        boolean optBoolean62 = optJSONObject.optBoolean(precachingMethodStr122, true);
        String precachingMethodStr132 = A04(467, 32, 20);
        int optInt42 = optJSONObject.optInt(precachingMethodStr132, 3000);
        String precachingMethodStr142 = A04(516, 35, 41);
        boolean isVideoLeadingPlayableEnabled2 = optJSONObject.optBoolean(precachingMethodStr142, true);
        return new C0945No(optString, optString2, A002, A07, A05, A03, optInt, z, optBoolean22, A00, optBoolean32, optString32, optBoolean, optBoolean42, optInt22, optString42, optString52, optInt32, A082, optBoolean52, optBoolean62, optInt42, isVideoLeadingPlayableEnabled2, A01(jSONObject, optJSONObject), A06(optJSONObject));
    }

    public static EnumC1334bD A03(JSONObject jSONObject) {
        int orientation = jSONObject.optInt(A04(297, 11, 46), A0T.A04());
        return EnumC1334bD.A00(orientation);
    }

    public static String A05(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A04(C3503Kz.n0, 12, 73));
        String A04 = A04(23, 45, 60);
        return optJSONObject == null ? A04 : optJSONObject.optString(A04(106, 16, 70), A04);
    }

    public static String A06(JSONObject jSONObject) {
        String optString = jSONObject.optString(A04(323, 17, 20));
        return (optString == null || optString.isEmpty()) ? A04(0, 7, 56) : optString;
    }

    public static String A07(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A04(C3503Kz.n0, 12, 73));
        String A04 = A04(79, 13, 72);
        return optJSONObject == null ? A04 : optJSONObject.optString(A04(551, 18, 73), A04);
    }

    public static String A08(JSONObject jSONObject) {
        String optString = jSONObject.optString(A04(InterfaceC8148mw2.e.x, 18, 110));
        return (optString == null || optString.isEmpty()) ? A04(7, 16, 69) : optString;
    }

    public final int A0A() {
        return this.A00;
    }

    public final int A0B() {
        return this.A09;
    }

    public final int A0C() {
        return this.A0A;
    }

    public final int A0D() {
        return this.A0B;
    }

    public final int A0E() {
        return this.A01;
    }

    public final int A0F() {
        return this.A0C;
    }

    public final EnumC0946Np A0G() {
        return this.A0D;
    }

    public final EnumC1334bD A0H() {
        return this.A0E;
    }

    public final String A0I() {
        return this.A02;
    }

    public final String A0J() {
        return this.A0F;
    }

    public final String A0K() {
        return this.A0G;
    }

    public final String A0L() {
        return this.A0H;
    }

    public final String A0M() {
        return this.A03;
    }

    public final String A0N() {
        return this.A04;
    }

    public final String A0O() {
        return this.A05;
    }

    public final String A0P() {
        return this.A0I;
    }

    public final String A0Q() {
        return this.A0J;
    }

    public final String A0R() {
        return this.A0K;
    }

    public final void A0S(int i) {
        this.A00 = i;
    }

    public final void A0T(String str) {
        this.A02 = str;
    }

    public final void A0U(boolean z) {
        this.A06 = z;
    }

    public final boolean A0V() {
        return this.A06;
    }

    public final boolean A0W() {
        return this.A0L;
    }

    public final boolean A0X() {
        return this.A07;
    }

    public final boolean A0Y() {
        return this.A0M;
    }

    public final boolean A0Z() {
        return this.A0O;
    }

    public final boolean A0a() {
        return this.A0P;
    }

    public final boolean A0b() {
        return this.A0N;
    }

    public final boolean A0c() {
        return this.A08;
    }
}
