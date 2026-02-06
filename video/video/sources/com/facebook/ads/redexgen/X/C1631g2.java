package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o.C3307Iz;
import o.C4715Xk;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.g2  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1631g2 {
    public static byte[] A07;
    public static String[] A08 = {"H9a6GPEeuBppqgml", "UMFfHf9K0rtxTnfS4GQ", "HJf7oQJhMr6BjfdBAkNXb1VX0FlaYu0s", "mblZ", "lDa8BWO3GNKgBVoNV1FydEibnHhzaqpi", "BpHqCYEOVY5", "fQPNbuq5zM2Vt99anBRO7vAhC8TCHPEC", "oGui3UnSaV6fb7qd5azTuEEp3mm97meQ"};
    public InterfaceC1622ft A05;
    public int A04 = 60000;
    public int A03 = 100;
    public int A00 = 10000;
    public int A02 = 8000;
    public int A01 = 3;
    public Map<String, String> A06 = new HashMap();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 100);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{4, 40, 49, 32, 36, 60, 36, 105, 59, C3307Iz.d0, C4715Xk.i, 59, 32, C3307Iz.d0, 58, 105, 36, 60, 58, C4715Xk.i, 105, C3307Iz.c0, C3307Iz.d0, 105, C3307Iz.c0, C3307Iz.d0, C4715Xk.i, 62, C3307Iz.d0, C3307Iz.d0, C3307Iz.Z, 105, QC1.w, 105, 40, C3307Iz.Z, C3307Iz.e0, 105, QC1.w, 113};
        if (A08[3].length() != 4) {
            throw new RuntimeException();
        }
        A08[4] = "ylxMzgRnic8ELdWNUfQitMVfYj0C1DI2";
    }

    static {
        A01();
    }

    public final C1631g2 A02(int i) {
        this.A00 = i;
        return this;
    }

    public final C1631g2 A03(int i) {
        if (i >= 1 && i <= 18) {
            this.A01 = i;
            return this;
        }
        throw new IllegalArgumentException(A00(0, 40, 45));
    }

    public final C1631g2 A04(int i) {
        this.A02 = i;
        return this;
    }

    public final C1631g2 A05(int i) {
        this.A03 = i;
        return this;
    }

    public final C1631g2 A06(int i) {
        this.A04 = i;
        return this;
    }

    public final C1631g2 A07(InterfaceC1622ft interfaceC1622ft) {
        this.A05 = interfaceC1622ft;
        return this;
    }

    public final C1631g2 A08(Map<String, String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final C1632g3 A09() {
        return new C1632g3(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}
