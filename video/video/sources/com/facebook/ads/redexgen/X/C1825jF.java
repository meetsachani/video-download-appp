package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.jF  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1825jF implements SM {
    public final /* synthetic */ AbstractC1847jd A00;
    public final /* synthetic */ InterfaceC0950Nt A01;
    public final /* synthetic */ C0951Nu A02;
    public final /* synthetic */ C1673gi A03;
    public final /* synthetic */ boolean A04;

    public C1825jF(C0951Nu c0951Nu, C1673gi c1673gi, boolean z, AbstractC1847jd abstractC1847jd, InterfaceC0950Nt interfaceC0950Nt) {
        this.A02 = c0951Nu;
        this.A03 = c1673gi;
        this.A04 = z;
        this.A00 = abstractC1847jd;
        this.A01 = interfaceC0950Nt;
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACx() {
        ArrayList arrayList;
        if (C1123Up.A1q(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(AbstractC1458dD.A01(this.A03, this.A00, 1, new C1826jG(this)));
            return;
        }
        this.A01.ACp();
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACy() {
        this.A01.ACo(AdError.CACHE_ERROR);
    }
}
