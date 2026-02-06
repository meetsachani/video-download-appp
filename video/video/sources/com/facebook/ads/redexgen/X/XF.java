package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import org.json.JSONArray;

/* loaded from: assets/audience_network/classes2.dex */
public enum XF {
    A07(0),
    A0G(1),
    A08(2),
    A0H(3),
    A09(4),
    A06(5),
    A0E(6),
    A0F(7),
    A0K(8),
    A0D(9),
    A0A(10),
    A0I(11),
    A0J(16),
    A0C(17),
    A0B(18);
    
    public static byte[] A01;
    public static String[] A02 = {"GbuBsSM1xhQoS8Y9reObCc9WG4REEdk3", "3inGwPOv", "kEgr1UstPMrvCW01nPyEnw", "sDtxFhHTxnkounG", "sPUJsFRJw3lzzMTWDdjyjiVEH8hW8JO7", "B8rHcVyybdzy0uHTSoedXLBdMJjc3Dyy", "NVuWY3VIAgTMV2CQJlZL2IdcLJ4", "cMObfoRVVv9ZpGW59yOoyGmNv0XOfBEh"};
    public static final XF[] A03;
    public static final String A04;
    public final int A00;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 23);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {88, 93, 70, 90, 81, 86, 80, 90, 92, 74, 122, 107, 107, 100, 122, Byte.MAX_VALUE, C3307Iz.c0, 58, 58, 53, C3307Iz.c0, C3307Iz.f0, 53, 60, 88, 110, Byte.MAX_VALUE, Byte.MAX_VALUE, 112, 106, 97, 104, 110, 104, 106, 98, 106, 97, 123, 112, 110, 107, 71, 68, 75, 75, 64, 87, 90, 81, 74, 90, 76, 75, 81, 64, 87, 86, 81, 76, 81, 76, 68, 73, 52, 32, 55, 35, C3307Iz.Z, 55, 60, 49, C3307Iz.c0, C3307Iz.e0, 49, 51, 34, 34, 59, 60, 53, C3307Iz.c0, 55, 55, 51, 60, 47, 42, C3307Iz.e0, 40, 48, 8, C8077mf.q, 13, 8, C8077mf.q, 4, C8077mf.H, C8077mf.A, 8, 5, 4, C8077mf.p, C8077mf.H, 0, 5, 93, 68, 72, 67, 69, 94, 80, 80, 82, 69, C8077mf.y, C8077mf.n, 0, C8077mf.m, 13, C8077mf.z, C8077mf.B, C8077mf.B, C8077mf.D, 13, 0, 17, C8077mf.r, 0, C8077mf.H, 10, C8077mf.m, C8077mf.r, 0, C8077mf.z, C8077mf.u, C8077mf.q, 0, 19, C8077mf.r, C8077mf.B, C8077mf.B, C8077mf.z, 17, C8077mf.B, 103, 98, 101, 96, 116, 106, 111, 77, 72, 79, 74, 94, 64, 69, 94, 87, 51, 3, C8077mf.n, C8077mf.C, 4, C8077mf.E, 8, C8077mf.u, C8077mf.p, 1, 2, C8077mf.H, 8, C8077mf.u, C8077mf.q, C8077mf.B, C8077mf.C, C8077mf.C, 2, 3, 47, 52, 51, 60, 51, ED2.a, 62, C3307Iz.X, 54, 53, C4715Xk.i, C4715Xk.i, 51, 52, C4715Xk.i, 57, C3307Iz.Y, C3307Iz.c0, 42, 32, 48, C3307Iz.f0, C3307Iz.c0};
        if (A02[5].charAt(26) != 'j') {
            throw new RuntimeException();
        }
        A02[5] = "gBI5PCJLXGTma8ivl9EUy8DAEVjXdNbR";
        A01 = bArr;
    }

    static {
        XF[] xfArr;
        A03();
        A03 = new XF[]{A0H, A09, A06, A0F, A0I, A0J, A0C, A0B};
        JSONArray jSONArray = new JSONArray();
        for (XF supportedCapability : A03) {
            jSONArray.put(supportedCapability.A00());
        }
        A04 = jSONArray.toString();
    }

    XF(int i) {
        this.A00 = i;
    }

    private final int A00() {
        return this.A00;
    }

    public static String A01() {
        return A04;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.A00);
    }
}
