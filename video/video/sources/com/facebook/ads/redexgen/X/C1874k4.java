package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.k4  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1874k4 implements SM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass81 A01;
    public final /* synthetic */ AnonymousClass81 A02;
    public final /* synthetic */ C1105Tx A03;

    public C1874k4(AnonymousClass81 anonymousClass81, int i, C1105Tx c1105Tx, AnonymousClass81 anonymousClass812) {
        this.A01 = anonymousClass81;
        this.A00 = i;
        this.A03 = c1105Tx;
        this.A02 = anonymousClass812;
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACx() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACy() {
        N9 n9;
        n9 = this.A01.A00;
        n9.AEN(this.A02, C1145Vm.A00(AdErrorType.NO_FILL));
    }
}
