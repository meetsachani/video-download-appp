package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C3307Iz;
import o.C8077mf;
import o.ED2;

@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
/* renamed from: com.facebook.ads.redexgen.X.mE  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2005mE extends AbstractC0822Iu {
    public static byte[] A03;
    public static String[] A04 = {"GA2pmS7X4ROGOgByNCdi18taC", "aAh4RNygY6pz4IdlAQ9iIXEvCFWWkzLF", "JuodTrkofMpjka010", "J1Lmlws0eqmUUC5GC3jhEdxTYojxk4jf", "6Ya7uqSvo", "3XyRCMiSsp8rG7f8J4q6xkUhsqnZzFaE", "VspF2Q", "vTSdivoAe22KROlTGGoK4NP8GmV"};
    public final long A00;
    public final List<C2005mE> A01;
    public final List<C2004mD> A02;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 84);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{68, 7, C8077mf.m, 10, C8077mf.r, 5, 13, 10, 1, C8077mf.z, C8077mf.A, 94, 68, 105, C3307Iz.X, C3307Iz.d0, 40, ED2.a, C3307Iz.d0, 58, 115, 105};
    }

    static {
        A05();
    }

    public C2005mE(int i, long j) {
        super(i);
        this.A00 = j;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final C2005mE A06(int i) {
        int size = this.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2005mE c2005mE = this.A01.get(i2);
            int i3 = A04[7].length();
            if (i3 == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "n49CDGF4gSULbNzRfDOXSmTNWTogkE10";
            strArr[3] = "P3Agw1JJwclCkyu9DcuVtuUqOjxfkaYK";
            C2005mE c2005mE2 = c2005mE;
            int childrenSize = ((AbstractC0822Iu) c2005mE2).A00;
            if (childrenSize == i) {
                return c2005mE2;
            }
        }
        if (A04[4].length() != 14) {
            String[] strArr2 = A04;
            strArr2[1] = "eWhxbLiQvYVwUHrDqb1spRuVxj0ikF7I";
            strArr2[3] = "G0JrlMiW26lgTwAQcPtVzhOkcvjPkvCh";
            return null;
        }
        throw new RuntimeException();
    }

    public final C2004mD A07(int i) {
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2004mD c2004mD = this.A02.get(i2);
            String[] strArr = A04;
            String str = strArr[2];
            String str2 = strArr[0];
            int i3 = str.length();
            int childrenSize = str2.length();
            if (i3 == childrenSize) {
                throw new RuntimeException();
            }
            A04[5] = "r5cbbIuLaeCnR7fWkiITKmUfsEKVcSuB";
            int childrenSize2 = ((AbstractC0822Iu) c2004mD).A00;
            if (childrenSize2 == i) {
                return c2004mD;
            }
        }
        return null;
    }

    public final void A08(C2005mE c2005mE) {
        this.A01.add(c2005mE);
    }

    public final void A09(C2004mD c2004mD) {
        this.A02.add(c2004mD);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0822Iu
    public final String toString() {
        return AbstractC0822Iu.A02(super.A00) + A04(13, 9, 29) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 48) + Arrays.toString(this.A01.toArray());
    }
}
