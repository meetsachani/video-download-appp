package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;

/* renamed from: com.facebook.ads.redexgen.X.Mc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0908Mc implements XN {
    public static byte[] A01;
    public final /* synthetic */ MW A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{36, 48, 49, 42, C3307Iz.Y, C3307Iz.a0, C3307Iz.d0, C3307Iz.Y, C3307Iz.f0};
    }

    public C0908Mc(MW mw) {
        this.A00 = mw;
    }

    @Override // com.facebook.ads.redexgen.X.XN
    public final void ADS() {
        boolean z;
        boolean z2;
        z = this.A00.A0C;
        if (!z) {
            z2 = this.A00.A0B;
            if (!z2) {
                this.A00.A0V(false, A00(0, 9, 123));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.XN
    public final void AFV(float f) {
    }
}
