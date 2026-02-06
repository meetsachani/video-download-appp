package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network/classes2.dex */
public class C3 implements InterfaceC1918ko {
    public final /* synthetic */ CC A00;

    public C3(final CC val$separatorMatcher) {
        this.A00 = val$separatorMatcher;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.2R] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1918ko
    /* renamed from: A00 */
    public final C2R AAl(C1919kp splitter, final CharSequence toSplit) {
        return new AbstractC0646Bw(splitter, toSplit) { // from class: com.facebook.ads.redexgen.X.2R
            @Override // com.facebook.ads.redexgen.X.AbstractC0646Bw
            public final int A04(int separatorPosition) {
                return separatorPosition + 1;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0646Bw
            public final int A05(int start) {
                return C3.this.A00.A08(this.A03, start);
            }
        };
    }
}
