package o;

/* renamed from: o.hW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6814hW extends AbstractC7057iW {
    public static final int d = 10;
    public final int b;
    public final int c;

    public C6814hW(int i, int i2, int i3) throws C2605Bx0 {
        super(i);
        if (i2 >= 0 && i2 <= 10 && i3 >= 0 && i3 <= 10) {
            this.b = i2;
            this.c = i3;
            return;
        }
        throw C2605Bx0.a();
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return (this.b * 10) + this.c;
    }

    public boolean e() {
        if (this.b != 10 && this.c != 10) {
            return false;
        }
        return true;
    }

    public boolean f() {
        if (this.b == 10) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.c == 10) {
            return true;
        }
        return false;
    }
}
