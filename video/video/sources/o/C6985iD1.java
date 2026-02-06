package o;

/* renamed from: o.iD1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6985iD1 extends AbstractC6220f71 {
    public static final int h = 2;
    public final byte[] c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public C6985iD1(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 <= i && i4 + i6 <= i2) {
            this.c = bArr;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            if (z) {
                n(i5, i6);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    @Override // o.AbstractC6220f71
    public AbstractC6220f71 a(int i, int i2, int i3, int i4) {
        return new C6985iD1(this.c, this.d, this.e, this.f + i, this.g + i2, i3, i4, false);
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

    public int k() {
        return b() / 2;
    }

    public int l() {
        return e() / 2;
    }

    public int[] m() {
        int e = e() / 2;
        int b = b() / 2;
        int[] iArr = new int[e * b];
        byte[] bArr = this.c;
        int i = (this.g * this.d) + this.f;
        for (int i2 = 0; i2 < b; i2++) {
            int i3 = i2 * e;
            for (int i4 = 0; i4 < e; i4++) {
                iArr[i3 + i4] = ((bArr[(i4 << 1) + i] & 255) * 65793) | (-16777216);
            }
            i += this.d << 1;
        }
        return iArr;
    }

    public final void n(int i, int i2) {
        byte[] bArr = this.c;
        int i3 = (this.g * this.d) + this.f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.d;
        }
    }
}
