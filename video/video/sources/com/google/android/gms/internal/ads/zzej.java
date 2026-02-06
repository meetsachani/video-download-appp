package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzej {
    public byte[] a;
    public int b;
    public int c;
    public int d;

    public zzej(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }

    public final int a() {
        return ((this.d - this.b) * 8) - this.c;
    }

    public final int b() {
        boolean z;
        if (this.c == 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        return this.b;
    }

    public final int c() {
        return (this.b * 8) + this.c;
    }

    public final int d(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.a;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.a;
        int i6 = this.b;
        int i7 = i3 | ((bArr2[i6] & 255) >> (8 - i2));
        int i8 = 32 - i;
        if (i2 == 8) {
            this.c = 0;
            this.b = i6 + 1;
        }
        int i9 = ((-1) >>> i8) & i7;
        q();
        return i9;
    }

    public final long e(int i) {
        if (i <= 32) {
            int d = d(i);
            String str = zzeu.a;
            return 4294967295L & d;
        }
        int d2 = d(i - 32);
        int d3 = d(32);
        String str2 = zzeu.a;
        return (4294967295L & d3) | ((d2 & 4294967295L) << 32);
    }

    public final void f() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        this.b++;
        q();
    }

    public final void g(int i, int i2) {
        int i3;
        int min = Math.min(8 - this.c, 14);
        int i4 = this.c;
        int i5 = (8 - i4) - min;
        byte[] bArr = this.a;
        int i6 = this.b;
        byte b = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr[i6]);
        bArr[i6] = b;
        int i7 = 14 - min;
        int i8 = i & 16383;
        bArr[i6] = (byte) (b | ((i8 >>> i7) << i5));
        int i9 = i6 + 1;
        while (i7 > 8) {
            i7 -= 8;
            this.a[i9] = (byte) (i8 >>> i7);
            i9++;
        }
        byte[] bArr2 = this.a;
        byte b2 = (byte) (bArr2[i9] & ((1 << i3) - 1));
        bArr2[i9] = b2;
        bArr2[i9] = (byte) (((i8 & ((1 << i7) - 1)) << (8 - i7)) | b2);
        n(14);
        q();
    }

    public final void h(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 0;
        while (true) {
            i3 = i2 >> 3;
            if (i4 >= i3) {
                break;
            }
            byte[] bArr2 = this.a;
            int i5 = this.b;
            int i6 = i5 + 1;
            this.b = i6;
            byte b = bArr2[i5];
            int i7 = this.c;
            byte b2 = (byte) (b << i7);
            bArr[i4] = b2;
            bArr[i4] = (byte) (((bArr2[i6] & 255) >> (8 - i7)) | b2);
            i4++;
        }
        int i8 = i2 & 7;
        if (i8 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i8));
        bArr[i3] = b3;
        int i9 = this.c;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.a;
            int i10 = this.b;
            this.b = i10 + 1;
            b3 = (byte) (b3 | ((bArr3[i10] & 255) << i9));
            bArr[i3] = b3;
            i9 -= 8;
        }
        int i11 = i9 + i8;
        this.c = i11;
        byte[] bArr4 = this.a;
        int i12 = this.b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b3);
        if (i11 == 8) {
            this.c = 0;
            this.b = i12 + 1;
        }
        q();
    }

    public final void i(byte[] bArr, int i, int i2) {
        boolean z;
        if (this.c == 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        System.arraycopy(this.a, this.b, bArr, 0, i2);
        this.b += i2;
        q();
    }

    public final void j(zzek zzekVar) {
        k(zzekVar.n(), zzekVar.x());
        l(zzekVar.w() * 8);
    }

    public final void k(byte[] bArr, int i) {
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = i;
    }

    public final void l(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        q();
    }

    public final void m() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        q();
    }

    public final void n(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = this.c + (i - (i2 * 8));
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        q();
    }

    public final void o(int i) {
        boolean z;
        if (this.c == 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        this.b += i;
        q();
    }

    public final boolean p() {
        int i = this.a[this.b] & (128 >> this.c);
        m();
        if (i != 0) {
            return true;
        }
        return false;
    }

    public final void q() {
        int i;
        int i2 = this.b;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.d) || (i2 == i && this.c == 0))) {
            z = true;
        }
        zzdc.f(z);
    }

    public zzej() {
        this.a = zzeu.b;
    }
}
