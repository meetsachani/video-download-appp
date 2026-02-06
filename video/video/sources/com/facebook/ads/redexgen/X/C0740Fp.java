package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0740Fp extends AbstractC1021Qq<FY> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC1208Yb A04;
    public InterfaceC1214Yh A05;
    public String A06;
    public List<C1511e5> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC1847jd A0A;
    public final C1079Sx A0B;
    public final C1673gi A0C;
    public final VA A0D;
    public final Y2 A0E;
    public final C0749Fy A0F;
    public final C1618fp A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C0740Fp(C1673gi c1673gi, List<C1511e5> list, AbstractC1847jd abstractC1847jd, VA va, C1079Sx c1079Sx, C1618fp c1618fp, Y2 y2, InterfaceC1214Yh interfaceC1214Yh, String str, int i, int i2, int i3, int i4, C0749Fy c0749Fy, AbstractC1208Yb abstractC1208Yb) {
        this.A0C = c1673gi;
        this.A0D = va;
        this.A0B = c1079Sx;
        this.A0G = c1618fp;
        this.A0E = y2;
        this.A05 = interfaceC1214Yh;
        this.A0A = abstractC1847jd;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A06 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0F = c0749Fy;
        this.A04 = abstractC1208Yb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1021Qq
    /* renamed from: A00 */
    public final FY A0F(ViewGroup viewGroup, int i) {
        return new FY(AbstractC1443cy.A00(new C1389c6(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0P(this.A04).A0U(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1021Qq
    /* renamed from: A01 */
    public final void A0K(FY fy, int i) {
        fy.A0q(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            fy.AJF();
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1021Qq
    public final int A0B() {
        return this.A07.size();
    }
}
