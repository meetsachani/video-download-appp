package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.nH */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2057nH implements AnonymousClass24 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;
    public static String[] A04 = {"0EeRaofkOnG82pPuB", "jcjJv", "T4n", "y6LXg9kPowsRJwalOEx6K", "cypgHvauDeb", "sGCac32Lryl6ta5A9qPel0ZSNDpSTc", "mAWrtqCYM7sM8yItQ0fM", "xdW2EE8FfL1ekapcbmlM6yOkR5Ux1S1"};
    public static final String A06 = C5C.A0h(0);
    public static final String A07 = C5C.A0h(1);
    public static final String A08 = C5C.A0h(2);
    public static final AnonymousClass23<C2057nH> A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.nI
        @Override // com.facebook.ads.redexgen.X.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C2057nH.A00(bundle);
        }
    };

    public C2057nH(int i, int[] iArr, int i2) {
        this.A00 = i;
        this.A03 = Arrays.copyOf(iArr, iArr.length);
        this.A01 = iArr.length;
        this.A02 = i2;
        Arrays.sort(this.A03);
    }

    public static /* synthetic */ C2057nH A00(Bundle bundle) {
        int i = bundle.getInt(A06, -1);
        int[] tracks = bundle.getIntArray(A07);
        int trackType = bundle.getInt(A08, -1);
        AbstractC04543y.A07(i >= 0 && trackType >= 0);
        AbstractC04543y.A01(tracks);
        return new C2057nH(i, tracks, trackType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        String[] strArr = A04;
        if (strArr[5].length() != strArr[0].length()) {
            A04[6] = "RoyHwRFBbL3TyB1YuYs";
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2057nH c2057nH = (C2057nH) obj;
            if (this.A00 == c2057nH.A00 && Arrays.equals(this.A03, c2057nH.A03) && this.A02 == c2057nH.A02) {
                return true;
            }
            return false;
        }
        throw new RuntimeException();
    }

    public final int hashCode() {
        int hash = this.A02;
        return (((this.A00 * 31) + Arrays.hashCode(this.A03)) * 31) + hash;
    }
}
