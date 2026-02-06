package o;

import java.util.Arrays;

/* renamed from: o.g00  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6434g00 {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final byte[] d;

    public C6434g00(CharSequence charSequence, int i, int i2) {
        this.a = charSequence;
        this.c = i;
        this.b = i2;
        byte[] bArr = new byte[i * i2];
        this.d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final void a(int i) {
        j(this.b - 1, 0, i, 1);
        j(this.b - 1, 1, i, 2);
        j(this.b - 1, 2, i, 3);
        j(0, this.c - 2, i, 4);
        j(0, this.c - 1, i, 5);
        j(1, this.c - 1, i, 6);
        j(2, this.c - 1, i, 7);
        j(3, this.c - 1, i, 8);
    }

    public final void b(int i) {
        j(this.b - 3, 0, i, 1);
        j(this.b - 2, 0, i, 2);
        j(this.b - 1, 0, i, 3);
        j(0, this.c - 4, i, 4);
        j(0, this.c - 3, i, 5);
        j(0, this.c - 2, i, 6);
        j(0, this.c - 1, i, 7);
        j(1, this.c - 1, i, 8);
    }

    public final void c(int i) {
        j(this.b - 3, 0, i, 1);
        j(this.b - 2, 0, i, 2);
        j(this.b - 1, 0, i, 3);
        j(0, this.c - 2, i, 4);
        j(0, this.c - 1, i, 5);
        j(1, this.c - 1, i, 6);
        j(2, this.c - 1, i, 7);
        j(3, this.c - 1, i, 8);
    }

    public final void d(int i) {
        j(this.b - 1, 0, i, 1);
        j(this.b - 1, this.c - 1, i, 2);
        j(0, this.c - 3, i, 3);
        j(0, this.c - 2, i, 4);
        j(0, this.c - 1, i, 5);
        j(1, this.c - 3, i, 6);
        j(1, this.c - 2, i, 7);
        j(1, this.c - 1, i, 8);
    }

    public final boolean e(int i, int i2) {
        if (this.d[(i2 * this.c) + i] == 1) {
            return true;
        }
        return false;
    }

    public final byte[] f() {
        return this.d;
    }

    public final int g() {
        return this.c;
    }

    public final int h() {
        return this.b;
    }

    public final boolean i(int i, int i2) {
        if (this.d[(i2 * this.c) + i] >= 0) {
            return true;
        }
        return false;
    }

    public final void j(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        boolean z = true;
        if ((this.a.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        l(i2, i, z);
    }

    public final void k() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.b && i3 == 0) {
                a(i4);
                i4++;
            }
            if (i5 == this.b - 2 && i3 == 0 && this.c % 4 != 0) {
                b(i4);
                i4++;
            }
            if (i5 == this.b - 2 && i3 == 0 && this.c % 8 == 4) {
                c(i4);
                i4++;
            }
            if (i5 == this.b + 4 && i3 == 2 && this.c % 8 == 0) {
                d(i4);
                i4++;
            }
            while (true) {
                if (i5 < this.b && i3 >= 0 && !i(i3, i5)) {
                    m(i5, i3, i4);
                    i4++;
                }
                int i6 = i5 - 2;
                int i7 = i3 + 2;
                if (i6 < 0 || i7 >= this.c) {
                    break;
                }
                i5 = i6;
                i3 = i7;
            }
            int i8 = i5 - 1;
            int i9 = i3 + 5;
            while (true) {
                if (i8 >= 0 && i9 < this.c && !i(i9, i8)) {
                    m(i8, i9, i4);
                    i4++;
                }
                int i10 = i8 + 2;
                int i11 = i9 - 2;
                i = this.b;
                if (i10 >= i || i11 < 0) {
                    break;
                }
                i8 = i10;
                i9 = i11;
            }
            i5 = i8 + 5;
            i3 = i9 - 1;
            if (i5 >= i && i3 >= (i2 = this.c)) {
                break;
            }
        }
        if (!i(i2 - 1, i - 1)) {
            l(this.c - 1, this.b - 1, true);
            l(this.c - 2, this.b - 2, true);
        }
    }

    public final void l(int i, int i2, boolean z) {
        this.d[(i2 * this.c) + i] = z ? (byte) 1 : (byte) 0;
    }

    public final void m(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        j(i4, i5, i3, 1);
        int i6 = i2 - 1;
        j(i4, i6, i3, 2);
        int i7 = i - 1;
        j(i7, i5, i3, 3);
        j(i7, i6, i3, 4);
        j(i7, i2, i3, 5);
        j(i, i5, i3, 6);
        j(i, i6, i3, 7);
        j(i, i2, i3, 8);
    }
}
