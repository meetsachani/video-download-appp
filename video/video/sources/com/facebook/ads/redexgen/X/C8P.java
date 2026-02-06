package com.facebook.ads.redexgen.X;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.8P  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C8P extends AbstractC2162oz implements InterfaceC0837Jj {
    public long A00;
    public InterfaceC0837Jj A01;

    @Override // com.facebook.ads.redexgen.X.AbstractC2162oz
    public abstract void A0B();

    @Override // com.facebook.ads.redexgen.X.AbstractC05025u
    public final void A0A() {
        super.A0A();
        this.A01 = null;
    }

    public final void A0C(long j, InterfaceC0837Jj interfaceC0837Jj, long j2) {
        super.A01 = j;
        this.A01 = interfaceC0837Jj;
        if (j2 == Long.MAX_VALUE) {
            j2 = super.A01;
        }
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Jj
    public final List<C2192pT> A7X(long j) {
        return ((InterfaceC0837Jj) AbstractC04543y.A01(this.A01)).A7X(j - this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Jj
    public final long A83(int i) {
        return ((InterfaceC0837Jj) AbstractC04543y.A01(this.A01)).A83(i) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Jj
    public final int A84() {
        return ((InterfaceC0837Jj) AbstractC04543y.A01(this.A01)).A84();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Jj
    public final int A8a(long j) {
        return ((InterfaceC0837Jj) AbstractC04543y.A01(this.A01)).A8a(j - this.A00);
    }
}
