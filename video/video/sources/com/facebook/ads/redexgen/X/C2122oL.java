package com.facebook.ads.redexgen.X;

import java.math.RoundingMode;
import o.C3062Gl1;
import o.C6418fw1;
import o.G;
import o.O70;

/* renamed from: com.facebook.ads.redexgen.X.oL  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2122oL implements C9F {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public C2122oL(C9Q c9q) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        i = c9q.A02;
        this.A02 = i;
        i2 = c9q.A01;
        this.A01 = i2;
        i3 = c9q.A05;
        this.A05 = i3;
        i4 = c9q.A04;
        this.A04 = i4;
        i5 = c9q.A03;
        this.A03 = i5;
        i6 = c9q.A00;
        this.A00 = i6;
    }

    public static int A00(int i) {
        switch (i) {
            case 5:
                return o.I3.a;
            case 6:
            case 18:
                return o.I3.b;
            case 7:
                return O70.a;
            case 8:
                return O70.b;
            case 9:
                return C3062Gl1.b;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return o.I3.c;
            case 15:
                return 8000;
            case 16:
                return G.i;
            case 17:
                return o.M3.c;
            case 20:
                return C6418fw1.b;
        }
    }

    private final int A01(int i) {
        int A00 = A00(i);
        int maxByteRate = this.A03;
        return AbstractC0616As.A02((maxByteRate * A00) / 1000000);
    }

    private final int A02(int i, int i2) {
        int bufferSizeUs;
        int i3 = this.A04;
        if (i == 5) {
            int bufferSizeUs2 = this.A00;
            i3 *= bufferSizeUs2;
        }
        if (i2 != -1) {
            bufferSizeUs = AbstractC0998Pr.A00(i2, 8, RoundingMode.CEILING);
        } else {
            bufferSizeUs = A00(i);
        }
        return AbstractC0616As.A02((i3 * bufferSizeUs) / 1000000);
    }

    public static int A03(int i, int i2, int i3) {
        return AbstractC0616As.A02(((i * i2) * i3) / 1000000);
    }

    private final int A04(int i, int i2, int i3) {
        int maxAppBufferSize = this.A05 * i;
        int targetBufferSize = this.A02;
        int minAppBufferSize = A03(targetBufferSize, i2, i3);
        int targetBufferSize2 = this.A01;
        return C5C.A07(maxAppBufferSize, minAppBufferSize, A03(targetBufferSize2, i2, i3));
    }

    private final int A05(int i, int i2, int i3, int i4, int i5, int i6) {
        switch (i3) {
            case 0:
                return A04(i, i5, i4);
            case 1:
                return A01(i2);
            case 2:
                return A02(i2, i6);
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9F
    public final int A75(int i, int i2, int i3, int i4, int i5, int i6, double d) {
        int bufferSize = A05(i, i2, i3, i4, i5, i6);
        return (((Math.max(i, (int) (bufferSize * d)) + i4) - 1) / i4) * i4;
    }
}
