package com.facebook.ads.redexgen.X;

import java.util.Comparator;
import o.C10901yE;

/* renamed from: com.facebook.ads.redexgen.X.Ki */
/* loaded from: assets/audience_network/classes2.dex */
public class C0862Ki {
    public static String[] A02 = {"qTeBguUhuyM1MFes5Wth7HwI8JVW0esL", "wy2OEDVCsbs7Li1HpnMScgVTk8nNd5Di", "4", "CU9fduzhq9VQNbJmZcJcyCUxTgO6nbWs", "5", "s", "JcGduWYdz", "iAKvMVZDfF33p8y0i7fbnjg8iQoR6jrx"};
    public static final Comparator<C0862Ki> A03 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Kh
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C0862Ki.A01((C0862Ki) obj, (C0862Ki) obj2);
        }
    };
    public final int A00;
    public final C0863Kj A01;

    public C0862Ki(C0863Kj c0863Kj, int i) {
        this.A01 = c0863Kj;
        this.A00 = i;
    }

    public static /* synthetic */ int A01(C0862Ki c0862Ki, C0862Ki c0862Ki2) {
        return Integer.compare(c0862Ki.A01.A00, c0862Ki2.A01.A00);
    }

    public static /* synthetic */ Comparator A03() {
        Comparator<C0862Ki> comparator = A03;
        if (A02[1].charAt(25) != '8') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = C10901yE.i;
        strArr[5] = "u";
        return comparator;
    }
}
