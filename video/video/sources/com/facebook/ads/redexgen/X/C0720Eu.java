package com.facebook.ads.redexgen.X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Eu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0720Eu implements InterfaceC1550ej {
    public final C1673gi A01;
    public final VA A02;
    public final C1547eg A03;
    public final C0710Ek A04;
    public final String A07;
    public final E4 A06 = new E4() { // from class: com.facebook.ads.redexgen.X.4P
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.UN
        /* renamed from: A00 */
        public final void A03(C4B c4b) {
            Boolean bool;
            C1673gi c1673gi;
            bool = C0720Eu.this.A00;
            if (bool.booleanValue()) {
                return;
            }
            c1673gi = C0720Eu.this.A01;
            c1673gi.A0F().AJ2();
            C0720Eu.this.A08();
        }
    };
    public final EA A05 = new EA() { // from class: com.facebook.ads.redexgen.X.4O
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.UN
        /* renamed from: A00 */
        public final void A03(C4K c4k) {
            Boolean bool;
            C1673gi c1673gi;
            bool = C0720Eu.this.A00;
            if (!bool.booleanValue()) {
                c1673gi = C0720Eu.this.A01;
                c1673gi.A0F().AJ0();
                C0720Eu.this.A08();
            }
            C0720Eu.this.A00 = true;
        }
    };
    public Boolean A00 = false;

    public C0720Eu(C1673gi c1673gi, VA va, C0710Ek c0710Ek, String str, boolean z, EF ef, Map<String, String> extraParams) {
        this.A01 = c1673gi;
        this.A02 = va;
        this.A07 = str;
        this.A04 = c0710Ek;
        this.A03 = new C1547eg(c0710Ek, str, z, extraParams);
        if (C1123Up.A2B(this.A01)) {
            this.A01.A0F().AIx();
            ef.A0m(this);
            return;
        }
        this.A01.A0F().AIy();
        this.A04.getEventBus().A03(this.A06, this.A05);
    }

    public final void A07() {
        F1 f1 = new F1(this);
        if (this.A04.A0q()) {
            Y4.A00(f1);
        } else {
            this.A04.getStateHandler().post(f1);
        }
    }

    public final synchronized void A08() {
        if (!this.A00.booleanValue()) {
            this.A02.ABy(this.A07, this.A03.A06());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1550ej
    public final void AEk() {
        this.A01.A0F().AJ1();
        A08();
    }
}
