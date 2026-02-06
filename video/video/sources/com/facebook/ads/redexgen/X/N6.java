package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* loaded from: assets/audience_network/classes2.dex */
public final class N6 {
    public static N1 A00;

    public final N1 A00(final C1673gi c1673gi, AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (N5.A00[adPlacementType.ordinal()]) {
            case 1:
                return new AnonymousClass81();
            case 2:
                if (C1123Up.A1O(c1673gi)) {
                    return new AnonymousClass80();
                }
                return new AnonymousClass81();
            case 3:
                return new C1869jz();
            case 4:
                return new C1864ju(c1673gi);
            case 5:
                return new C1864ju(c1673gi) { // from class: com.facebook.ads.redexgen.X.7z
                    @Override // com.facebook.ads.redexgen.X.C1864ju, com.facebook.ads.redexgen.X.N1
                    public final AdPlacementType A8k() {
                        return AdPlacementType.NATIVE_BANNER;
                    }
                };
            case 6:
                return new C05567w();
            default:
                return null;
        }
    }
}
