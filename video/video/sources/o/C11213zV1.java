package o;

/* renamed from: o.zV1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11213zV1 {
    public static final int i = Integer.MIN_VALUE;
    public int a = 0;
    public int b = 0;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    public int a() {
        if (this.g) {
            return this.a;
        }
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        if (this.g) {
            return this.b;
        }
        return this.a;
    }

    public void e(int i2, int i3) {
        this.h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.e = i2;
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f = i3;
            this.b = i3;
        }
    }

    public void f(boolean z) {
        if (z == this.g) {
            return;
        }
        this.g = z;
        if (this.h) {
            if (z) {
                int i2 = this.d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.e;
                }
                this.a = i2;
                int i3 = this.c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f;
                }
                this.b = i3;
                return;
            }
            int i4 = this.c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.e;
            }
            this.a = i4;
            int i5 = this.d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = this.f;
            }
            this.b = i5;
            return;
        }
        this.a = this.e;
        this.b = this.f;
    }

    public void g(int i2, int i3) {
        this.c = i2;
        this.d = i3;
        this.h = true;
        if (this.g) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.b = i3;
        }
    }
}
