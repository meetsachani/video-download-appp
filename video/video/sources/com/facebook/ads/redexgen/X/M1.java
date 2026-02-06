package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class M1 extends AbstractC1021Qq<C0741Fq> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC1214Yh A03;
    public C1618fp A04;
    public String A05;
    public List<C1511e5> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC1847jd A08;
    public final C1079Sx A09;
    public final C1673gi A0A;
    public final VA A0B;
    public final UK A0C;
    public final Y2 A0D;
    public final C6X A0E;
    public final DZ A0F;

    public M1(C1673gi c1673gi, List<C1511e5> list, AbstractC1847jd abstractC1847jd, VA va, UK uk, InterfaceC1214Yh interfaceC1214Yh, String str, C6X c6x, DZ dz) {
        this.A0A = c1673gi;
        this.A0B = va;
        this.A0C = uk;
        this.A09 = uk.A14();
        this.A04 = uk.A1G();
        this.A0D = uk.A1E();
        this.A03 = interfaceC1214Yh;
        this.A08 = abstractC1847jd;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c6x;
        this.A0F = dz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1021Qq
    /* renamed from: A00 */
    public final C0741Fq A0F(ViewGroup viewGroup, int i) {
        return new C0741Fq(AbstractC1353bW.A00(new C1389c6(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0R(this.A0F).A0N(this.A0C).A0U(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1021Qq
    /* renamed from: A01 */
    public final void A0K(C0741Fq c0741Fq, int i) {
        c0741Fq.A0q(this.A04);
        c0741Fq.A0p(this.A06.get(i), this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1021Qq
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i, int i2, int i3) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C1618fp c1618fp) {
        this.A04 = c1618fp;
    }
}
