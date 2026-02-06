package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network/classes2.dex */
public class A4 implements InterfaceC04413l {
    public final C05979y A00;
    public final C2120oJ A01;
    public final InterfaceC04403k[] A02;

    public A4(InterfaceC04403k... interfaceC04403kArr) {
        this(interfaceC04403kArr, new C05979y(), new C2120oJ());
    }

    public A4(InterfaceC04403k[] interfaceC04403kArr, C05979y c05979y, C2120oJ c2120oJ) {
        this.A02 = new InterfaceC04403k[interfaceC04403kArr.length + 2];
        System.arraycopy(interfaceC04403kArr, 0, this.A02, 0, interfaceC04403kArr.length);
        this.A00 = c05979y;
        this.A01 = c2120oJ;
        this.A02[interfaceC04403kArr.length] = c05979y;
        this.A02[interfaceC04403kArr.length + 1] = c2120oJ;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04413l
    public final C2221px A4F(C2221px c2221px) {
        this.A01.A02(c2221px.A01);
        this.A01.A01(c2221px.A00);
        return c2221px;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04413l
    public final boolean A4G(boolean z) {
        this.A00.A0D(z);
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04413l
    public final InterfaceC04403k[] A6z() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04413l
    public final long A8U(long j) {
        return this.A01.A00(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04413l
    public final long A98() {
        return this.A00.A0C();
    }
}
