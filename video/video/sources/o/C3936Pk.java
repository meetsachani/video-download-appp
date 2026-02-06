package o;

import java.lang.reflect.Array;

/* renamed from: o.Pk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3936Pk {
    public final C4130Rk[] a;
    public int b;
    public final int c;
    public final int d;

    public C3936Pk(int i, int i2) {
        C4130Rk[] c4130RkArr = new C4130Rk[i];
        this.a = c4130RkArr;
        int length = c4130RkArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.a[i3] = new C4130Rk(((i2 + 4) * 17) + 1);
        }
        this.d = i2 * 17;
        this.c = i;
        this.b = -1;
    }

    public C4130Rk a() {
        return this.a[this.b];
    }

    public byte[][] b() {
        return c(1, 1);
    }

    public byte[][] c(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, this.c * i2, this.d * i);
        int i3 = this.c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.a[i4 / i2].b(i);
        }
        return bArr;
    }

    public void d(int i, int i2, byte b) {
        this.a[i2].c(i, b);
    }

    public void e() {
        this.b++;
    }
}
