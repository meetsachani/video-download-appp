package o;

import java.io.Serializable;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class FQ implements Serializable {
    public int X;

    public FQ(int i) {
        this.X = i;
    }

    public void a(int i) {
        this.X += i;
    }

    public int b(int i) {
        int i2 = this.X + i;
        this.X = i2;
        return i2;
    }

    public int c() {
        return this.X;
    }

    public int d(int i) {
        int i2 = this.X;
        this.X = i;
        return i2;
    }

    public void e(int i) {
        this.X = i;
    }

    public boolean equals(@MB Object obj) {
        if ((obj instanceof FQ) && ((FQ) obj).X == this.X) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.X;
    }

    public String toString() {
        return Integer.toString(this.X);
    }
}
