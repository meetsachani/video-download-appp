package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.oK  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2121oK implements InterfaceC05788v {
    public static byte[] A01;
    public static String[] A02 = {"", "W3zKx7uimPBnuqB79eRuk71Lq6Q9Tdtq", "pdw5IcOEDsyx", "PznYxCtiabQ1XXQUVp9BfEAYIGk6ZsUE", "E1k4hPJKfb0MvebzJOZYusmHHBWvORO7", "bmueFxdYYt0nqn8p", "GRfRtgnBgmJZB0Qq", "VS7ML1wDeymmTLeKFRcttz7uEm3bVRGQ"};
    public final /* synthetic */ AnonymousClass12 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A02[4] = "fuFs1gweK6T0kCx4bj1F2DHsk5QuVwMS";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{47, C8077mf.E, 10, 7, 1, 78, C8077mf.G, 7, 0, 5, 78, C8077mf.m, 28, 28, 1, 28, 32, 8, 9, 4, C8077mf.n, C3307Iz.f0, 2, 9, 8, C8077mf.p, C3307Iz.d0, C8077mf.B, 9, 4, 2, ED2.a, 8, 3, 9, 8, 31, 8, 31, 55, 54, C8077mf.m, 52, C4715Xk.i, C4715Xk.i, 40, C8077mf.B, C8077mf.C, 32, C8077mf.z, 28, C8077mf.u, 2, 7};
    }

    static {
        A01();
    }

    public C2121oK(AnonymousClass12 anonymousClass12) {
        this.A00 = anonymousClass12;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05788v
    public final void AD6(Exception exc) {
        AbstractC04624g.A08(A00(16, 23, 101), A00(0, 16, 102), exc);
        AnonymousClass12.A06(this.A00).A0D(exc);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05788v
    public final void AD7(C05758r c05758r) {
        AnonymousClass12.A06(this.A00).A0B(c05758r);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05788v
    public final void AD8(C05758r c05758r) {
        AnonymousClass12.A06(this.A00).A0C(c05758r);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05788v
    public final void AF2() {
        AnonymousClass12.A05(this.A00);
        if (0 != 0) {
            AnonymousClass12.A05(this.A00);
            throw new NullPointerException(A00(46, 8, 127));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05788v
    public final void AF3() {
        AnonymousClass12.A05(this.A00);
        if (0 != 0) {
            AnonymousClass12.A05(this.A00);
            throw new NullPointerException(A00(39, 7, 80));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05788v
    public final void AFN(long j) {
        AnonymousClass12.A06(this.A00).A03(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05788v
    public final void AFO() {
        this.A00.A26();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05788v
    public final void AFy(boolean z) {
        AnonymousClass12.A06(this.A00).A0I(z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05788v
    public final void AGJ(int i, long j, long j2) {
        AnonymousClass12.A06(this.A00).A01(i, j, j2);
    }
}
