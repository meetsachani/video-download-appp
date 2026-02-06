package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0748Fx extends AbstractC1617fo {
    public final /* synthetic */ C4U A00;

    public C0748Fx(C4U c4u) {
        this.A00 = c4u;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1617fo
    public final void A03() {
        Y2 y2;
        Y2 y22;
        String str;
        C1618fp c1618fp;
        Y2 y23;
        AbstractC1847jd abstractC1847jd;
        VA va;
        String str2;
        AbstractC1847jd abstractC1847jd2;
        C1673gi c1673gi;
        C1673gi c1673gi2;
        AbstractC1847jd abstractC1847jd3;
        AbstractC1847jd abstractC1847jd4;
        y2 = this.A00.A04;
        if (!y2.A07()) {
            C4U c4u = this.A00;
            y22 = this.A00.A04;
            c4u.setImpressionRecordingFlag(y22);
            str = this.A00.A08;
            if (!TextUtils.isEmpty(str)) {
                C1330b9 c1330b9 = new C1330b9();
                c1618fp = this.A00.A07;
                C1330b9 A03 = c1330b9.A03(c1618fp);
                y23 = this.A00.A04;
                C1330b9 A02 = A03.A02(y23);
                abstractC1847jd = this.A00.A0D;
                Map<String, String> A05 = A02.A04(abstractC1847jd.A0z()).A05();
                va = this.A00.A0F;
                str2 = this.A00.A08;
                va.ABJ(str2, A05);
                abstractC1847jd2 = this.A00.A0D;
                C0937Ng A2A = abstractC1847jd2.A2A();
                c1673gi = this.A00.A0E;
                C0937Ng.A07(A2A, c1673gi);
                c1673gi2 = this.A00.A0E;
                c1673gi2.A0F().A3L();
                abstractC1847jd3 = this.A00.A0D;
                String A0y = abstractC1847jd3.A0y();
                abstractC1847jd4 = this.A00.A0D;
                AbstractC0957Oa.A02(A0y, AbstractC1193Xm.A00(abstractC1847jd4.A10()));
            }
        }
    }
}
