package o;

import o.InterfaceC8148mw2;

/* renamed from: o.qN1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8986qN1 extends AbstractC6220f71 {
    public final byte[] c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public C8986qN1(int i, int i2, int[] iArr) {
        super(i, i2);
        this.d = i;
        this.e = i2;
        this.f = 0;
        this.g = 0;
        int i3 = i * i2;
        this.c = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = iArr[i4];
            this.c[i4] = (byte) (((((i5 >> 16) & 255) + ((i5 >> 7) & InterfaceC8148mw2.g.r)) + (i5 & 255)) / 4);
        }
    }

    @Override // o.AbstractC6220f71
    public AbstractC6220f71 a(int i, int i2, int i3, int i4) {
        return new C8986qN1(this.c, this.d, this.e, this.f + i, this.g + i2, i3, i4);
    }

    @Override // o.AbstractC6220f71
    public byte[] c() {
        int e = e();
        int b = b();
        int i = this.d;
        if (e == i && b == this.e) {
            return this.c;
        }
        int i2 = e * b;
        byte[] bArr = new byte[i2];
        int i3 = (this.g * i) + this.f;
        if (e == i) {
            System.arraycopy(this.c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < b; i4++) {
            System.arraycopy(this.c, i3, bArr, i4 * e, e);
            i3 += this.d;
        }
        return bArr;
    }

    @Override // o.AbstractC6220f71
    public byte[] d(int i, byte[] bArr) {
        if (i >= 0 && i < b()) {
            int e = e();
            if (bArr == null || bArr.length < e) {
                bArr = new byte[e];
            }
            System.arraycopy(this.c, ((i + this.g) * this.d) + this.f, bArr, 0, e);
            return bArr;
        }
        throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
    }

    @Override // o.AbstractC6220f71
    public boolean g() {
        return true;
    }

    public C8986qN1(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i5 + i3 <= i && i6 + i4 <= i2) {
            this.c = bArr;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }
}
