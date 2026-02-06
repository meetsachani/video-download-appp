package com.facebook.ads.redexgen.X;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.q7  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2231q7 implements AnonymousClass24 {
    public final C2236qC A00;
    @Deprecated
    public final AW A01;
    public final C2234qA A02;
    public final AnonymousClass32 A03;
    @Deprecated
    public final C2233q9 A04;
    public final C2226q2 A05;
    public final String A06;
    public static String[] A07 = {"wAM8vtdO0lmHfSdh0aX8JSKdnwpCp9D2", "", "J6SB4ddL0FfEeVIHYuGnUGetWM2QRdUO", "0HTq7SjPEUFdYYph8tikUta3pLjb69Rn", "wGA6vSFg01QHk42FD2L8p637KRkqAXcn", "9eG6h6QaFREs2gWO0", "Z5vutuZNVsi2rK7c87KXUNl8wBJYnGEL", "V2BGt2aUfGoyLxnwwGFsOMeTNor3H3xe"};
    public static final C2231q7 A09 = new C04262u().A05();
    public static final AnonymousClass23<C2231q7> A08 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qE
        @Override // com.facebook.ads.redexgen.X.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            C2231q7 A00;
            A00 = C2231q7.A00(bundle);
            return A00;
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C2231q7 A00(Bundle bundle) {
        String str = (String) AbstractC04543y.A01(bundle.getString(A02(0), ""));
        Bundle bundle2 = bundle.getBundle(A02(1));
        C2234qA A6f = bundle2 == null ? C2234qA.A07 : C2234qA.A06.A6f(bundle2);
        Bundle bundle3 = bundle.getBundle(A02(2));
        C2226q2 A6f2 = bundle3 == null ? C2226q2.A0Z : C2226q2.A0Y.A6f(bundle3);
        Bundle bundle4 = bundle.getBundle(A02(3));
        return new C2231q7(str, bundle4 == null ? AW.A00 : C2236qC.A05.A6f(bundle4), null, A6f, A6f2);
    }

    public C2231q7(String str, AW aw, C2233q9 c2233q9, C2234qA c2234qA, C2226q2 c2226q2) {
        this.A06 = str;
        this.A03 = c2233q9;
        this.A04 = c2233q9;
        this.A02 = c2234qA;
        this.A05 = c2226q2;
        this.A00 = aw;
        this.A01 = aw;
    }

    public static String A02(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2231q7) {
            C2231q7 c2231q7 = (C2231q7) obj;
            if (C5C.A1E(this.A06, c2231q7.A06)) {
                C2236qC c2236qC = this.A00;
                C2236qC c2236qC2 = c2231q7.A00;
                String[] strArr = A07;
                if (strArr[7].charAt(22) != strArr[2].charAt(22)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A07;
                strArr2[7] = "WE1TlvFnuMEFfhCqOSZQGPel0cAOxnij";
                strArr2[2] = "QIjSvgjDyRqWUwkha5pDZVewjWBdao8T";
                if (c2236qC.equals(c2236qC2) && C5C.A1E(this.A03, c2231q7.A03) && C5C.A1E(this.A02, c2231q7.A02) && C5C.A1E(this.A05, c2231q7.A05)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A06.hashCode();
        int i = result * 31;
        int result2 = this.A03 != null ? this.A03.hashCode() : 0;
        int hashCode = (((i + result2) * 31) + this.A02.hashCode()) * 31;
        C2236qC c2236qC = this.A00;
        String[] strArr = A07;
        String str = strArr[4];
        String str2 = strArr[3];
        int charAt = str.charAt(31);
        int result3 = str2.charAt(31);
        if (charAt != result3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "oKnJE1KY80M0C2djBAWfSHeSjkObNKTB";
        strArr2[2] = "bdrBBUaZbF1SVnsIGw0ZL6eMFfyDgZAn";
        int result4 = c2236qC.hashCode();
        return ((hashCode + result4) * 31) + this.A05.hashCode();
    }
}
