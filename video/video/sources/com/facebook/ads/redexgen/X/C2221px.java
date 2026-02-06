package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.Arrays;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.px */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2221px implements AnonymousClass24 {
    public static byte[] A03;
    public static String[] A04 = {"UnBMZo2POSkJfz8F5ORuhqz31kXq7ERt", "GIL9xJe6rQGrNyWVB8WflXUexCYVOXiL", "1YJSMghIf03NGeOR9kmJ9bGOSAOIDk9h", "FbkWhL7EvytxWPK79enAjrYaTxkw07sQ", "DvmeNztcauqB3GuZI4NFBZAXEAF", "3h1K0W52WnqAecgG5ddVr1SgL8ZiRxH3", "SzBXc", "YkLyJW6tcdkoyMoq5nPmYT201JvYdNzP"};
    public static final AnonymousClass23<C2221px> A05;
    public static final C2221px A06;
    public static final String A07;
    public static final String A08;
    public final float A00;
    public final float A01;
    public final int A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{109, 81, 92, 68, 95, 92, 94, 86, 109, 92, 79, 92, 80, 88, 73, 88, 79, 78, C8077mf.y, 78, 77, 88, 88, 89, 0, C8077mf.B, 19, C8077mf.q, 91, 17, C8077mf.G, 77, 84, 73, 94, 85, 0, C8077mf.B, 19, C8077mf.q, 91, C8077mf.x};
    }

    static {
        A02();
        A06 = new C2221px(1.0f);
        A08 = C5C.A0h(0);
        A07 = C5C.A0h(1);
        A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.py
            @Override // com.facebook.ads.redexgen.X.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                return C2221px.A00(bundle);
            }
        };
    }

    public C2221px(float f) {
        this(f, 1.0f);
    }

    public C2221px(float f, float f2) {
        AbstractC04543y.A07(f > 0.0f);
        AbstractC04543y.A07(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = Math.round(1000.0f * f);
    }

    public static /* synthetic */ C2221px A00(Bundle bundle) {
        float f = bundle.getFloat(A08, 1.0f);
        float pitch = bundle.getFloat(A07, 1.0f);
        return new C2221px(f, pitch);
    }

    public final long A03(long j) {
        return this.A02 * j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2221px c2221px = (C2221px) obj;
        if (this.A01 == c2221px.A01) {
            float f = this.A00;
            float f2 = c2221px.A00;
            if (A04[7].charAt(19) == 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "pC9U2";
            strArr[4] = "3ca7HvojzYBlvf3WwnTfkyYQmWq";
            if (f == f2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = Float.floatToRawIntBits(this.A01);
        return (((17 * 31) + result) * 31) + Float.floatToRawIntBits(this.A00);
    }

    public final String toString() {
        return C5C.A0n(A01(0, 42, 46), Float.valueOf(this.A01), Float.valueOf(this.A00));
    }
}
