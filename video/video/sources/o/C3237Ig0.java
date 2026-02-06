package o;

/* renamed from: o.Ig0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3237Ig0 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;

    public C3237Ig0(String str, int i, int i2) {
        this.b = str;
        this.a = i;
        this.c = i2;
        this.d = -1;
    }

    public boolean a(int i) {
        int i2;
        int i3 = this.c;
        if (i3 == 7 || i == 7 || i3 == i || (i2 = this.d) == i) {
            return true;
        }
        if ((i3 == 4 || i2 == 4) && i == 3) {
            return true;
        }
        if ((i3 == 9 || i2 == 9) && i == 8) {
            return true;
        }
        if ((i3 == 12 || i2 == 12) && i == 11) {
            return true;
        }
        return false;
    }

    public C3237Ig0(String str, int i, int i2, int i3) {
        this.b = str;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }
}
