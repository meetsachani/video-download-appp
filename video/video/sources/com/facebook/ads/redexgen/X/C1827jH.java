package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.jH  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1827jH implements InterfaceC0950Nt {
    public static String[] A07 = {"LaTcnwnUfzgLTffZJQ1IPucRbglpEgMo", "12hOZJfgSqwHBnuTqXHxpHxEQ0NbZO7A", "Dr9pHE3G5odEHWCsCqxBSNpdFpwa86Mh", "MDWd5GjifHIGoqp8wS2KmhLcZ8", "Ozio236b3SA3ZtX", "C3UkekSSOdUqAnfYGByVev7l4a4YpLBv", "Q070rE4WAmrDPncHn0R1JG2tySYrh7TO", ""};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1847jd A01;
    public final /* synthetic */ C1839jT A02;
    public final /* synthetic */ InterfaceC0950Nt A03;
    public final /* synthetic */ C0951Nu A04;
    public final /* synthetic */ C1673gi A05;
    public final /* synthetic */ EnumSet A06;

    public C1827jH(C0951Nu c0951Nu, C1673gi c1673gi, AbstractC1847jd abstractC1847jd, C1839jT c1839jT, int i, InterfaceC0950Nt interfaceC0950Nt, EnumSet enumSet) {
        this.A04 = c0951Nu;
        this.A05 = c1673gi;
        this.A01 = abstractC1847jd;
        this.A02 = c1839jT;
        this.A00 = i;
        this.A03 = interfaceC0950Nt;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 < this.A02.A23()) {
            this.A04.A0A(this.A05, this.A06, this.A02, this.A02.A27(this.A00 + 1), this.A00 + 1, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0950Nt
    public final void ACo(AdError adError) {
        if (this.A00 == 0) {
            this.A03.ACo(adError);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0950Nt
    public final void ACp() {
        this.A05.A01().AJE(this.A01.A2E(), this.A02.A28());
        if (this.A00 == this.A02.A25()) {
            InterfaceC0950Nt interfaceC0950Nt = this.A03;
            String[] strArr = A07;
            if (strArr[5].charAt(13) != strArr[6].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "Mfrds6r17BKRZSfVfcuH4MZ0YR";
            strArr2[4] = "cdrsota1fCopt7F";
            interfaceC0950Nt.ACp();
        }
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0950Nt
    public final void AHY() {
        if (this.A00 == 0) {
            this.A03.AHY();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0950Nt
    public final void AKX() {
        if (this.A00 == 0) {
            this.A03.AKX();
        }
    }
}
