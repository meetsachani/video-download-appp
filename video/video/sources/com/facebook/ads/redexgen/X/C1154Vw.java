package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.ED2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.Vw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1154Vw extends N2 {
    public static byte[] A01;
    public final /* synthetic */ UK A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, 112, 101, QC1.w, 103, 116, 49, 112, 117, 98, 49, 124, 112, Byte.MAX_VALUE, 112, 118, 116, 99, 49, 101, 121, 116, QC1.w, 99, 49, 126, 102, Byte.MAX_VALUE, 49, QC1.w, 124, 97, 99, 116, 98, 98, QC1.w, 126, Byte.MAX_VALUE, 98, ED2.a};
    }

    public C1154Vw(UK uk) {
        this.A00 = uk;
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A0B(C1864ju c1864ju) {
        this.A00.A1d(c1864ju);
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A0C() {
        InterfaceC1103Tv interfaceC1103Tv;
        InterfaceC1103Tv interfaceC1103Tv2;
        interfaceC1103Tv = this.A00.A0I;
        if (interfaceC1103Tv != null) {
            interfaceC1103Tv2 = this.A00.A0I;
            interfaceC1103Tv2.ACm();
        }
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A0F(N1 n1) {
        C05407g c05407g;
        C05407g c05407g2;
        c05407g = this.A00.A0B;
        if (c05407g != null) {
            c05407g2 = this.A00.A0B;
            c05407g2.A0M();
        }
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A0G(C1145Vm c1145Vm) {
        long j;
        InterfaceC1103Tv interfaceC1103Tv;
        InterfaceC1103Tv interfaceC1103Tv2;
        InterfaceC0899Lt A0F = this.A00.A16().A0F();
        j = this.A00.A00;
        A0F.A3N(Y1.A01(j), c1145Vm.A03().getErrorCode(), c1145Vm.A04());
        interfaceC1103Tv = this.A00.A0I;
        if (interfaceC1103Tv != null) {
            interfaceC1103Tv2 = this.A00.A0I;
            interfaceC1103Tv2.ADp(c1145Vm);
        }
    }
}
