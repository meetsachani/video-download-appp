package o;

@Deprecated
/* renamed from: o.jJ2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7251jJ2 {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;

    public C7251jJ2(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.length;
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

    public int b() {
        return ((this.b - this.c) * 8) - this.d;
    }

    public int c() {
        return (this.c * 8) + this.d;
    }

    public boolean d() {
        boolean z;
        if ((((this.a[this.c] & 255) >> this.d) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        h(1);
        return z;
    }

    public int e(int i) {
        int i2 = this.c;
        int min = Math.min(i, 8 - this.d);
        int i3 = i2 + 1;
        int i4 = ((this.a[i2] & 255) >> this.d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        h(i);
        return i5;
    }

    public void f() {
        this.c = 0;
        this.d = 0;
    }

    public void g(int i) {
        int i2 = i / 8;
        this.c = i2;
        this.d = i - (i2 * 8);
        a();
    }

    public void h(int i) {
        int i2 = i / 8;
        int i3 = this.c + i2;
        this.c = i3;
        int i4 = this.d + (i - (i2 * 8));
        this.d = i4;
        if (i4 > 7) {
            this.c = i3 + 1;
            this.d = i4 - 8;
        }
        a();
    }
}
