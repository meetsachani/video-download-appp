package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public class W7 extends AbstractRunnableC1160Wc {
    public static byte[] A07;
    public final /* synthetic */ long A00;
    public final /* synthetic */ W6 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 82);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{C8077mf.y, C3307Iz.V, 31, -32, C8077mf.B, 19, C8077mf.y, C8077mf.A, C8077mf.x, C3307Iz.V, C3307Iz.V, C8077mf.G, -32, C8077mf.G, 19, C3307Iz.Y, 19, 32, 19, -32, 34, 36, C3307Iz.V, 40, C8077mf.E, C8077mf.z, C8077mf.A, 36, -32, -5, 32, C3307Iz.X, C3307Iz.Y, 19, C8077mf.H, C8077mf.H, 4, C8077mf.A, C8077mf.B, C8077mf.A, 36, 36, C8077mf.A, 36, 2, 36, C3307Iz.V, 40, C8077mf.E, C8077mf.z, C8077mf.A, 36, -74, C2638Cg0.q7, C2638Cg0.o7, -127, -68, C2638Cg0.p7, C2638Cg0.t7, C2638Cg0.u7, -76, -70, C2638Cg0.s7, -76, C2638Cg0.o7, -127, -74, C2638Cg0.q7, C2638Cg0.p7, C2638Cg0.u7, -72, C2638Cg0.p7, C2638Cg0.u7, C2638Cg0.r7, C2638Cg0.s7, C2638Cg0.q7, C2638Cg0.v7, -68, -73, -72, C2638Cg0.s7, -127, -100, C2638Cg0.p7, C2638Cg0.t7, C2638Cg0.u7, -76, -65, -65, -91, -72, -71, -72, C2638Cg0.s7, C2638Cg0.s7, -72, C2638Cg0.s7, -93, C2638Cg0.s7, C2638Cg0.q7, C2638Cg0.v7, -68, -73, -72, C2638Cg0.s7};
    }

    public W7(W6 w6, boolean z, String str, String str2, String str3, long j, boolean z2) {
        this.A01 = w6;
        this.A06 = z;
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A00 = j;
        this.A05 = z2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        boolean fb4aResult;
        fb4aResult = this.A01.A03(A00(0, 52, 96), this.A06, this.A02, this.A04, this.A03, this.A00);
        if (fb4aResult) {
            return;
        }
        boolean fb4aResult2 = this.A05;
        if (fb4aResult2) {
            this.A01.A03(A00(52, 53, 1), this.A06, this.A02, this.A04, this.A03, this.A00);
        }
    }
}
