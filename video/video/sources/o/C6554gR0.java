package o;

import java.util.NoSuchElementException;

@Deprecated
/* renamed from: o.gR0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6554gR0 {
    public static final int f = 16;
    public int a = 0;
    public int b = -1;
    public int c = 0;
    public int[] d;
    public int e;

    public C6554gR0() {
        int[] iArr = new int[16];
        this.d = iArr;
        this.e = iArr.length - 1;
    }

    public void a(int i) {
        if (this.c == this.d.length) {
            d();
        }
        int i2 = (this.b + 1) & this.e;
        this.b = i2;
        this.d[i2] = i;
        this.c++;
    }

    public int b() {
        return this.d.length;
    }

    public void c() {
        this.a = 0;
        this.b = -1;
        this.c = 0;
    }

    public final void d() {
        int[] iArr = this.d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i = this.a;
            int i2 = length2 - i;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.d, 0, iArr2, i2, i);
            this.a = 0;
            this.b = this.c - 1;
            this.d = iArr2;
            this.e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    public boolean e() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public int f() {
        int i = this.c;
        if (i != 0) {
            int[] iArr = this.d;
            int i2 = this.a;
            int i3 = iArr[i2];
            this.a = (i2 + 1) & this.e;
            this.c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    public int g() {
        return this.c;
    }
}
