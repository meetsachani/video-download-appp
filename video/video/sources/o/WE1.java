package o;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class WE1 {
    public static final Bitmap.Config e = Bitmap.Config.RGB_565;
    public final int a;
    public final int b;
    public final Bitmap.Config c;
    public final int d;

    /* loaded from: classes.dex */
    public static class a {
        public final int a;
        public final int b;
        public Bitmap.Config c;
        public int d;

        public a(int i) {
            this(i, i);
        }

        public WE1 a() {
            return new WE1(this.a, this.b, this.c, this.d);
        }

        public Bitmap.Config b() {
            return this.c;
        }

        public a c(Bitmap.Config config) {
            this.c = config;
            return this;
        }

        public a d(int i) {
            if (i > 0) {
                this.d = i;
                return this;
            }
            throw new IllegalArgumentException("Weight must be > 0");
        }

        public a(int i, int i2) {
            this.d = 1;
            if (i <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if (i2 > 0) {
                this.a = i;
                this.b = i2;
                return;
            }
            throw new IllegalArgumentException("Height must be > 0");
        }
    }

    public WE1(int i, int i2, Bitmap.Config config, int i3) {
        this.c = (Bitmap.Config) C10175vF1.f(config, "Config must not be null");
        this.a = i;
        this.b = i2;
        this.d = i3;
    }

    public Bitmap.Config a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WE1) {
            WE1 we1 = (WE1) obj;
            if (this.b == we1.b && this.a == we1.a && this.d == we1.d && this.c == we1.c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d;
    }

    public String toString() {
        return "PreFillSize{width=" + this.a + ", height=" + this.b + ", config=" + this.c + ", weight=" + this.d + '}';
    }
}
