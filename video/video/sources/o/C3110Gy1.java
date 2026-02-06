package o;

@Deprecated
/* renamed from: o.Gy1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3110Gy1 {
    public byte[] a;
    public int b;
    public int c;
    public int d;

    public C3110Gy1(byte[] bArr, int i, int i2) {
        i(bArr, i, i2);
    }

    public final void a() {
        boolean z;
        int i;
        int i2 = this.c;
        if (i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.d == 0))) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
    }

    public boolean b(int i) {
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
            } else if (j(i2)) {
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

    public boolean c() {
        boolean z;
        int i = this.c;
        int i2 = this.d;
        int i3 = 0;
        while (this.c < this.b && !d()) {
            i3++;
        }
        if (this.c == this.b) {
            z = true;
        } else {
            z = false;
        }
        this.c = i;
        this.d = i2;
        if (z || !b((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public boolean d() {
        boolean z;
        if ((this.a[this.c] & (128 >> this.d)) != 0) {
            z = true;
        } else {
            z = false;
        }
        k();
        return z;
    }

    public int e(int i) {
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
            if (!j(i6 + 1)) {
                i3 = 1;
            }
            this.c = i6 + i3;
        }
        byte[] bArr2 = this.a;
        int i7 = this.c;
        int i8 = ((-1) >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.d = 0;
            if (!j(i7 + 1)) {
                i3 = 1;
            }
            this.c = i7 + i3;
        }
        a();
        return i8;
    }

    public final int f() {
        int i = 0;
        int i2 = 0;
        while (!d()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = e(i2);
        }
        return i3 + i;
    }

    public int g() {
        int i;
        int f = f();
        if (f % 2 == 0) {
            i = -1;
        } else {
            i = 1;
        }
        return i * ((f + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i2;
        this.d = 0;
        a();
    }

    public final boolean j(int i) {
        if (2 <= i && i < this.b) {
            byte[] bArr = this.a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void k() {
        int i = 1;
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 == 8) {
            this.d = 0;
            int i3 = this.c;
            if (j(i3 + 1)) {
                i = 2;
            }
            this.c = i3 + i;
        }
        a();
    }

    public void l(int i) {
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
                if (j(i2)) {
                    this.c++;
                    i2 += 2;
                }
            } else {
                a();
                return;
            }
        }
    }
}
