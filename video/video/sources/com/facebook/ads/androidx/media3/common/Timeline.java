package com.facebook.ads.androidx.media3.common;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.ads.redexgen.X.AR;
import com.facebook.ads.redexgen.X.AS;
import com.facebook.ads.redexgen.X.AbstractC04543y;
import com.facebook.ads.redexgen.X.AnonymousClass22;
import com.facebook.ads.redexgen.X.AnonymousClass23;
import com.facebook.ads.redexgen.X.AnonymousClass24;
import com.facebook.ads.redexgen.X.AnonymousClass43;
import com.facebook.ads.redexgen.X.BP;
import com.facebook.ads.redexgen.X.C2207pj;
import com.facebook.ads.redexgen.X.C2209pl;
import com.facebook.ads.redexgen.X.C2K;
import com.facebook.ads.redexgen.X.C5C;
import o.C10323vs;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class Timeline implements AnonymousClass24 {
    public static String[] A00 = {"u1TV1j0aFj13GJQ9ixTagHG8KyMgbnog", "4GMeFBxldVuonExwkIPaDDi9I59L728Z", "hqD1wOYcZTmehOTQOtlNc0UQ2KV4ETaI", "yejsGunEYiKaKfUzobCfCtheJf3zEEcL", "wYd9LRHFlTpJXE3VqmNr3ySXFdmyeGzN", "VCegaKN739XbWKUaP5Uwy30Zmvr6QTeK", "Cr3igiuAIuu", "x89DN52UD2fFRZn9rQXfWzGYhaiJYHE1"};
    public static final Timeline A02 = new AS();
    public static final String A05 = C5C.A0h(0);
    public static final String A03 = C5C.A0h(1);
    public static final String A04 = C5C.A0h(2);
    public static final AnonymousClass23<Timeline> A01 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pq
        @Override // com.facebook.ads.redexgen.X.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            Timeline A022;
            A022 = Timeline.A02(bundle);
            return A022;
        }
    };

    public abstract int A06();

    public abstract int A07();

    public abstract int A0A(Object obj);

    public abstract C2209pl A0I(int i, C2209pl c2209pl, boolean z);

    public abstract C2207pj A0L(int i, C2207pj c2207pj, long j);

    public abstract Object A0M(int i);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    public static AR A02(Bundle bundle) {
        BP A042 = A04(C2207pj.A0J, AnonymousClass43.A00(bundle, A05));
        BP A043 = A04(C2209pl.A08, AnonymousClass43.A00(bundle, A03));
        int[] intArray = bundle.getIntArray(A04);
        if (intArray == null) {
            intArray = A05(A042.size());
        }
        return new AR(A042, A043, intArray);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.23 != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.24> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.24> */
    public static <T extends AnonymousClass24> BP<T> A04(AnonymousClass23<T> anonymousClass23, IBinder iBinder) {
        if (iBinder == null) {
            return BP.A03();
        }
        C2K c2k = new C2K();
        BP<Bundle> A002 = AnonymousClass22.A00(iBinder);
        for (int i = 0; i < A002.size(); i++) {
            c2k.A04(anonymousClass23.A6f(A002.get(i)));
        }
        return c2k.A05();
    }

    public static int[] A05(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
            int i3 = A00[1].charAt(20);
            if (i3 == 50) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[2] = "bm1hpxiL8T70YPoy7qoC4X3DFFhRRvrI";
            strArr[4] = "ZU2doOYnXTdq2XyitRV5O0BVNSu1NLTL";
        }
        return iArr;
    }

    public int A08(int i, int i2, boolean z) {
        switch (i2) {
            case 0:
                if (i == A0C(z)) {
                    return -1;
                }
                return i + 1;
            case 1:
                return i;
            case 2:
                int A0C = A0C(z);
                String[] strArr = A00;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    throw new RuntimeException();
                }
                A00[1] = "R0HEAX03GiDQUcMP0CiDD2yYG3qNGv8H";
                if (i == A0C) {
                    return A0B(z);
                }
                return i + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A09(int i, C2209pl c2209pl, C2207pj c2207pj, int i2, boolean z) {
        int i3 = A0H(i, c2209pl).A00;
        int windowIndex = A0K(i3, c2207pj).A01;
        if (windowIndex == i) {
            int nextWindowIndex = A08(i3, i2, z);
            if (nextWindowIndex == -1) {
                return -1;
            }
            int windowIndex2 = A0K(nextWindowIndex, c2207pj).A00;
            return windowIndex2;
        }
        int windowIndex3 = i + 1;
        return windowIndex3;
    }

    public int A0B(boolean z) {
        return A0N() ? -1 : 0;
    }

    public int A0C(boolean z) {
        if (A0N()) {
            return -1;
        }
        return A07() - 1;
    }

    @Deprecated
    public final Pair<Object, Long> A0D(C2207pj c2207pj, C2209pl c2209pl, int i, long j) {
        return A0E(c2207pj, c2209pl, i, j);
    }

    public final Pair<Object, Long> A0E(C2207pj c2207pj, C2209pl c2209pl, int i, long j) {
        return (Pair) AbstractC04543y.A01(A0G(c2207pj, c2209pl, i, j, 0L));
    }

    @Deprecated
    public final Pair<Object, Long> A0F(C2207pj c2207pj, C2209pl c2209pl, int i, long j, long j2) {
        return A0G(c2207pj, c2209pl, i, j, j2);
    }

    public final Pair<Object, Long> A0G(C2207pj c2207pj, C2209pl c2209pl, int i, long j, long j2) {
        AbstractC04543y.A00(i, 0, A07());
        A0L(i, c2207pj, j2);
        if (j == C10323vs.b) {
            j = c2207pj.A05();
            if (j == C10323vs.b) {
                return null;
            }
        }
        int i2 = c2207pj.A00;
        A0H(i2, c2209pl);
        while (i2 < c2207pj.A01 && c2209pl.A02 != j && A0H(i2 + 1, c2209pl).A02 <= j) {
            i2++;
        }
        A0I(i2, c2209pl, true);
        long j3 = j - c2209pl.A02;
        if (c2209pl.A01 != C10323vs.b) {
            long j4 = c2209pl.A01;
            if (A00[1].charAt(20) == '2') {
                throw new RuntimeException();
            }
            A00[1] = "slEcDLMOMSnRw8lzrIQwxe9jf9tcgTic";
            j3 = Math.min(j3, j4 - 1);
        }
        return Pair.create(AbstractC04543y.A01(c2209pl.A04), Long.valueOf(Math.max(0L, j3)));
    }

    public final C2209pl A0H(int i, C2209pl c2209pl) {
        return A0I(i, c2209pl, false);
    }

    public C2209pl A0J(Object obj, C2209pl c2209pl) {
        return A0I(A0A(obj), c2209pl, true);
    }

    public final C2207pj A0K(int i, C2207pj c2207pj) {
        return A0L(i, c2207pj, 0L);
    }

    public final boolean A0N() {
        return A07() == 0;
    }

    public final boolean A0O(int i, C2209pl c2209pl, C2207pj c2207pj, int i2, boolean z) {
        return A09(i, c2209pl, c2207pj, i2, z) == -1;
    }

    public final boolean equals(Object obj) {
        int A0C;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Timeline) {
            Timeline timeline = (Timeline) obj;
            if (timeline.A07() == A07() && timeline.A06() == A06()) {
                C2207pj c2207pj = new C2207pj();
                C2209pl c2209pl = new C2209pl();
                C2207pj window = new C2207pj();
                C2209pl otherPeriod = new C2209pl();
                for (int i = 0; i < A07(); i++) {
                    if (!A0K(i, c2207pj).equals(timeline.A0K(i, window))) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < A06(); i2++) {
                    boolean equals = A0I(i2, c2209pl, true).equals(timeline.A0I(i2, otherPeriod, true));
                    if (A00[6].length() != 11) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A00;
                    strArr[7] = "LCXdoHEXleHtD1UyLVprjOGqC7qnADXU";
                    strArr[0] = "np8LEsRhRemsbbWWIjAQc1GjKbBRdfRS";
                    if (!equals) {
                        return false;
                    }
                }
                int A0B = A0B(true);
                if (A0B == timeline.A0B(true) && (A0C = A0C(true)) == timeline.A0C(true)) {
                    while (A0B != A0C) {
                        int A08 = A08(A0B, 0, true);
                        if (A08 != timeline.A08(A0B, 0, true)) {
                            return false;
                        }
                        A0B = A08;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        C2207pj c2207pj = new C2207pj();
        C2209pl c2209pl = new C2209pl();
        int result = 7 * 31;
        int i = result + A07();
        for (int i2 = 0; i2 < A07(); i2++) {
            C2207pj window = A0K(i2, c2207pj);
            i = (i * 31) + window.hashCode();
        }
        int result2 = i * 31;
        int i3 = result2 + A06();
        for (int i4 = 0; i4 < A06(); i4++) {
            i3 = (i3 * 31) + A0I(i4, c2209pl, true).hashCode();
        }
        int A0B = A0B(true);
        while (A0B != -1) {
            int windowIndex = i3 * 31;
            i3 = windowIndex + A0B;
            A0B = A08(A0B, 0, true);
        }
        return i3;
    }
}
