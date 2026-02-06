package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: assets/audience_network/classes2.dex */
public class GD implements InterfaceC1504dy {
    public final /* synthetic */ GB A00;

    public GD(GB gb) {
        this.A00 = gb;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1504dy
    public final void AIY() {
        boolean z;
        C0945No c0945No;
        InterfaceC1214Yh interfaceC1214Yh;
        ZU zu;
        InterfaceC1214Yh interfaceC1214Yh2;
        ZU zu2;
        ZU zu3;
        C0945No c0945No2;
        AbstractC1847jd abstractC1847jd;
        InterfaceC1215Yi A05;
        Intent intent;
        InterfaceC1215Yi interfaceC1215Yi;
        Intent intent2;
        Bundle bundle;
        InterfaceC1215Yi interfaceC1215Yi2;
        this.A00.A0B();
        z = this.A00.A0E;
        if (!z || this.A00.A01 == null) {
            c0945No = this.A00.A07;
            if (c0945No == null) {
                interfaceC1214Yh = this.A00.A0C;
                zu = this.A00.A0D;
                interfaceC1214Yh.A4j(zu.A81());
                interfaceC1214Yh2 = this.A00.A0C;
                zu2 = this.A00.A0D;
                interfaceC1214Yh2.A4j(zu2.A7w());
                return;
            }
            GB gb = this.A00;
            GB gb2 = this.A00;
            zu3 = this.A00.A0D;
            c0945No2 = this.A00.A07;
            abstractC1847jd = this.A00.A05;
            A05 = gb2.A05(zu3, c0945No2, Boolean.valueOf(abstractC1847jd.A1n()));
            gb.A04 = A05;
            intent = this.A00.A02;
            if (intent != null && this.A00.A00 != null) {
                interfaceC1215Yi = this.A00.A04;
                intent2 = this.A00.A02;
                bundle = this.A00.A03;
                interfaceC1215Yi.AAu(intent2, bundle, this.A00.A00);
            }
        } else if (this.A00.A01 instanceof MW) {
            this.A00.A04 = this.A00.A01;
            interfaceC1215Yi2 = this.A00.A04;
            ((MW) interfaceC1215Yi2).A0b();
        }
    }
}
