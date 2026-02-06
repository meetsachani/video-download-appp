package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzft {
    public byte[] a;
    public int b;
    public int c;
    public int d = 0;

    public zzft(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i2;
        j();
    }

    public final int a(int i) {
        int i2;
        int i3;
        this.d += i;
        int i4 = 0;
        while (true) {
            i2 = this.d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.d = i5;
            byte[] bArr = this.a;
            int i6 = this.c;
            i4 |= (bArr[i6] & 255) << i5;
            if (true != k(i6 + 1)) {
                i3 = 1;
            }
            this.c = i6 + i3;
        }
        byte[] bArr2 = this.a;
        int i7 = this.c;
        int i8 = i4 | ((bArr2[i7] & 255) >> (8 - i2));
        int i9 = 32 - i;
        if (i2 == 8) {
            this.d = 0;
            if (true != k(i7 + 1)) {
                i3 = 1;
            }
            this.c = i7 + i3;
        }
        int i10 = ((-1) >>> i9) & i8;
        j();
        return i10;
    }

    public final int b() {
        int i = i();
        int i2 = i % 2;
        int i3 = 1;
        int i4 = i + 1;
        if (i2 == 0) {
            i3 = -1;
        }
        return i3 * (i4 / 2);
    }

    public final int c() {
        return i();
    }

    public final void d() {
        int i = this.d;
        if (i > 0) {
            f(8 - i);
        }
    }

    public final void e() {
        int i = 1;
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 == 8) {
            this.d = 0;
            int i3 = this.c;
            if (true == k(i3 + 1)) {
                i = 2;
            }
            this.c = i3 + i;
        }
        j();
    }

    public final void f(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = this.d + (i - (i3 * 8));
        this.d = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.c) {
                if (k(i2)) {
                    this.c++;
                    i2 += 2;
                }
            } else {
                j();
                return;
            }
        }
    }

    public final boolean g(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.b) {
                break;
            } else if (k(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.b;
        if (i4 < i6) {
            return true;
        }
        if (i4 == i6 && i5 == 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        int i = this.a[this.c] & (128 >> this.d);
        e();
        if (i != 0) {
            return true;
        }
        return false;
    }

    public final int i() {
        int i = 0;
        int i2 = 0;
        while (!h()) {
            i2++;
        }
        int i3 = 1 << i2;
        if (i2 > 0) {
            i = a(i2);
        }
        return (i3 - 1) + i;
    }

    public final void j() {
        int i;
        int i2 = this.c;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.d == 0))) {
            z = true;
        }
        zzdc.f(z);
    }

    public final boolean k(int i) {
        if (i >= 2 && i < this.b) {
            byte[] bArr = this.a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
