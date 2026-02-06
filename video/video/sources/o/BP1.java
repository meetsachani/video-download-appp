package o;

/* loaded from: classes.dex */
public class BP1 {
    public int a;
    public int b;
    public int c;
    public int d;

    public boolean a(int i, int i2) {
        int i3;
        int i4 = this.a;
        if (i >= i4 && i < i4 + this.c && i2 >= (i3 = this.b) && i2 < i3 + this.d) {
            return true;
        }
        return false;
    }

    public int b() {
        return (this.a + this.c) / 2;
    }

    public int c() {
        return (this.b + this.d) / 2;
    }

    public void d(int i, int i2) {
        this.a -= i;
        this.b -= i2;
        this.c += i * 2;
        this.d += i2 * 2;
    }

    public boolean e(BP1 bp1) {
        int i;
        int i2;
        int i3 = this.a;
        int i4 = bp1.a;
        if (i3 >= i4 && i3 < i4 + bp1.c && (i = this.b) >= (i2 = bp1.b) && i < i2 + bp1.d) {
            return true;
        }
        return false;
    }

    public void f(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
