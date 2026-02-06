package com.facebook.ads.redexgen.X;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nG  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2056nG extends AbstractC0707Eh<C2056nG> implements Comparable<C2056nG> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(List<C2056nG> list, List<C2056nG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C2056nG(int i, C2205pg c2205pg, int i2, C05889i c05889i, int i3, String str) {
        super(i, c2205pg, i2);
        List<String> list;
        int A00;
        int i4 = 0;
        this.A08 = C05879h.A0S(i3, false);
        int i5 = super.A02.A0H & (~((C2201pc) c05889i).A00);
        this.A06 = (i5 & 1) != 0;
        this.A07 = (i5 & 2) != 0;
        int i6 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (c05889i.A0K.isEmpty()) {
            list = C1840jW.A03("");
        } else {
            list = c05889i.A0K;
        }
        int bestLanguageIndex = 0;
        while (true) {
            if (bestLanguageIndex >= list.size()) {
                break;
            }
            int A02 = C05879h.A02(super.A02, list.get(bestLanguageIndex), c05889i.A0P);
            if (A02 > 0) {
                i6 = bestLanguageIndex;
                bestLanguageScore = A02;
                break;
            }
            bestLanguageIndex++;
        }
        this.A00 = i6;
        this.A01 = bestLanguageScore;
        A00 = C05879h.A00(super.A02.A0E, ((C2201pc) c05889i).A0C);
        this.A02 = A00;
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = C05879h.A02(super.A02, str, C05879h.A0K(str) == null);
        boolean z = this.A01 > 0 || (c05889i.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (C05879h.A0S(i3, c05889i.A0B) && z) {
            i4 = 1;
        }
        this.A04 = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(C2056nG c2056nG) {
        AbstractC2094ns A06 = AbstractC2094ns.A01().A09(this.A08, c2056nG.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c2056nG.A00), AbstractC2244qK.A03().A06()).A06(this.A01, c2056nG.A01).A06(this.A02, c2056nG.A02).A09(this.A06, c2056nG.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c2056nG.A07), this.A01 == 0 ? AbstractC2244qK.A03() : AbstractC2244qK.A03().A06()).A06(this.A03, c2056nG.A03);
        if (this.A02 == 0) {
            A06 = A06.A0A(this.A05, c2056nG.A05);
        }
        return A06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static BP<C2056nG> A02(int i, C2205pg c2205pg, C05889i c05889i, int[] iArr, String str) {
        C2K A01 = BP.A01();
        for (int i2 = 0; i2 < c2205pg.A01; i2++) {
            A01.A04(new C2056nG(i, c2205pg, i2, c05889i, iArr[i2], str));
        }
        return A01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC0707Eh
    /* renamed from: A03 */
    public final boolean A09(C2056nG c2056nG) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0707Eh
    public final int A08() {
        return this.A04;
    }
}
