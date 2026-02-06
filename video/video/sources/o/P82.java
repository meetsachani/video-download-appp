package o;

import android.util.SizeF;

/* loaded from: classes.dex */
public final class P82 {
    public final float a;
    public final float b;

    /* loaded from: classes.dex */
    public static final class a {
        public static SizeF a(P82 p82) {
            C10907yF1.l(p82);
            return new SizeF(p82.b(), p82.a());
        }

        public static P82 b(SizeF sizeF) {
            C10907yF1.l(sizeF);
            return new P82(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public P82(float f, float f2) {
        this.a = C10907yF1.d(f, "width");
        this.b = C10907yF1.d(f2, "height");
    }

    public static P82 d(SizeF sizeF) {
        return a.b(sizeF);
    }

    public float a() {
        return this.b;
    }

    public float b() {
        return this.a;
    }

    public SizeF c() {
        return a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P82)) {
            return false;
        }
        P82 p82 = (P82) obj;
        if (p82.a == this.a && p82.b == this.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.a) ^ Float.floatToIntBits(this.b);
    }

    public String toString() {
        return this.a + "x" + this.b;
    }
}
