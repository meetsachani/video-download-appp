package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;

/* loaded from: assets/audience_network/classes2.dex */
public final class A7 extends AbstractC2127oQ {
    public int[] A00;
    public int[] A01;

    @Override // com.facebook.ads.redexgen.X.AbstractC2127oQ
    public final C04383i A09(C04383i c04383i) throws C04393j {
        int[] iArr = this.A01;
        if (iArr == null) {
            return C04383i.A05;
        }
        if (c04383i.A02 == 2) {
            int i = c04383i.A01 != iArr.length ? 1 : 0;
            int i2 = 0;
            while (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 < c04383i.A01) {
                    i |= i3 != i2 ? 1 : 0;
                    i2++;
                } else {
                    throw new C04393j(c04383i);
                }
            }
            if (i != 0) {
                return new C04383i(c04383i.A03, iArr.length, 2);
            }
            return C04383i.A05;
        }
        throw new C04393j(c04383i);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2127oQ
    public final void A0A() {
        this.A00 = this.A01;
    }

    public final void A0C(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04403k
    public final void AHH(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC04543y.A01(this.A00);
        int position = byteBuffer.position();
        int outputSize = byteBuffer.limit();
        int position2 = outputSize - position;
        ByteBuffer A00 = A00(this.A06.A00 * (position2 / this.A05.A00));
        while (position < outputSize) {
            for (int i : iArr) {
                A00.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.A05.A00;
        }
        byteBuffer.position(outputSize);
        A00.flip();
    }
}
