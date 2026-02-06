package o;

import java.util.Objects;

/* loaded from: classes4.dex */
public class US0 {
    public final int a;
    public final int b;
    public final int c;

    public US0(int i, int i2, int i3) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (i3 >= 0 && i3 <= Math.min(i, i2)) {
                    this.a = i;
                    this.b = i2;
                    this.c = i3;
                    return;
                }
                throw new IllegalArgumentException("Invalid intersection of |A| and |B|: " + i3);
            }
            throw new IllegalArgumentException("Set size |B| is not positive: " + i2);
        }
        throw new IllegalArgumentException("Set size |A| is not positive: " + i);
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            US0 us0 = (US0) obj;
            if (this.a == us0.a && this.b == us0.b && this.c == us0.c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public String toString() {
        return "Size A: " + this.a + ", Size B: " + this.b + ", Intersection: " + this.c;
    }
}
