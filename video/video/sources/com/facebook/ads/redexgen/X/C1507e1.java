package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.e1  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1507e1 implements InterfaceC1622ft {
    public static byte[] A01;
    public final C1669ge A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{82, C3307Iz.Z, 76, 72, C3307Iz.Z, 90, 101, 101, 102, C3307Iz.Z, 88, 101, Byte.MAX_VALUE, 126, 99, 100, 109, C3307Iz.Z, 94, 101, 97, 111, 100, C8077mf.n, 10, 28, C8077mf.m, 84, C8077mf.B, C8077mf.H, 28, C8077mf.A, 13};
    }

    public C1507e1(C1669ge c1669ge) {
        this.A00 = c1669ge;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1622ft
    public final Map<String, String> A6g(boolean z) {
        HashMap hashMap = new HashMap();
        if (!SZ.A00().A04()) {
            hashMap.put(A00(0, 23, 64), UG.A00().A01(this.A00, true).A04());
        }
        hashMap.put(A00(23, 10, 51), UJ.A06(new C1096To(this.A00), this.A00, z));
        return hashMap;
    }
}
