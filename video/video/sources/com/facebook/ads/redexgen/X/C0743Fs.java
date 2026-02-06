package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0743Fs extends AbstractC1617fo {
    public final /* synthetic */ VA A00;
    public final /* synthetic */ Y2 A01;
    public final /* synthetic */ C1511e5 A02;
    public final /* synthetic */ C0741Fq A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C0743Fs(C0741Fq c0741Fq, String str, C1511e5 c1511e5, VA va, Map map, Y2 y2) {
        this.A03 = c0741Fq;
        this.A04 = str;
        this.A02 = c1511e5;
        this.A00 = va;
        this.A05 = map;
        this.A01 = y2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1617fo
    public final void A03() {
        C1618fp c1618fp;
        SparseBooleanArray sparseBooleanArray;
        C1618fp c1618fp2;
        C0937Ng c0937Ng;
        C1673gi c1673gi;
        SparseBooleanArray sparseBooleanArray2;
        c1618fp = this.A03.A02;
        if (!c1618fp.A0Z() && !TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A05;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                VA va = this.A00;
                String str = this.A04;
                C1330b9 c1330b9 = new C1330b9(this.A05);
                c1618fp2 = this.A03.A03;
                va.ABJ(str, c1330b9.A03(c1618fp2).A02(this.A01).A05());
                c0937Ng = this.A03.A00;
                c1673gi = this.A03.A06;
                C0937Ng.A07(c0937Ng, c1673gi);
                sparseBooleanArray2 = this.A03.A05;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
