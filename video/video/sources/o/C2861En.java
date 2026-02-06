package o;

/* renamed from: o.En  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2861En {
    public final byte[] a;
    public int b;
    public int c;

    public C2861En(byte[] bArr) {
        this.a = bArr;
    }

    public int a() {
        return ((this.a.length - this.b) * 8) - this.c;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public int d(int i) {
        int i2;
        if (i > 0 && i <= 32 && i <= a()) {
            int i3 = this.c;
            int i4 = 0;
            if (i3 > 0) {
                int i5 = 8 - i3;
                if (i < i5) {
                    i2 = i;
                } else {
                    i2 = i5;
                }
                int i6 = i5 - i2;
                byte[] bArr = this.a;
                int i7 = this.b;
                int i8 = (((255 >> (8 - i2)) << i6) & bArr[i7]) >> i6;
                i -= i2;
                int i9 = i3 + i2;
                this.c = i9;
                if (i9 == 8) {
                    this.c = 0;
                    this.b = i7 + 1;
                }
                i4 = i8;
            }
            if (i > 0) {
                while (i >= 8) {
                    int i10 = i4 << 8;
                    byte[] bArr2 = this.a;
                    int i11 = this.b;
                    i4 = (bArr2[i11] & 255) | i10;
                    this.b = i11 + 1;
                    i -= 8;
                }
                if (i > 0) {
                    int i12 = 8 - i;
                    int i13 = ((((255 >> i12) << i12) & this.a[this.b]) >> i12) | (i4 << i);
                    this.c += i;
                    return i13;
                }
            }
            return i4;
        }
        throw new IllegalArgumentException(String.valueOf(i));
    }
}
