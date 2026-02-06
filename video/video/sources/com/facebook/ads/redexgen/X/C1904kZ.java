package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.kZ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1904kZ implements InterfaceC0903Lx {
    public final InterfaceC0900Lu A00;

    public C1904kZ(InterfaceC0900Lu interfaceC0900Lu) {
        this.A00 = interfaceC0900Lu;
    }

    public final InterfaceC0900Lu A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0903Lx
    public final C8J ACL() {
        return new C8J(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0903Lx
    public final C1908kd ACM() {
        return new C1908kd(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0903Lx
    public final C1908kd ACN(String str) {
        return new C1908kd(this, str);
    }
}
