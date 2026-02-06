package o;

/* loaded from: classes3.dex */
public final class VE {
    public static final int f = -1;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public int e = -1;

    public VE(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.a;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.b - this.a;
    }

    public boolean g() {
        return h(this.e);
    }

    public boolean h(int i) {
        if (i != -1 && this.c == (i % 3) * 3) {
            return true;
        }
        return false;
    }

    public void i(int i) {
        this.e = i;
    }

    public void j() {
        this.e = ((this.d / 30) * 3) + (this.c / 3);
    }

    public String toString() {
        return this.e + "|" + this.d;
    }
}
