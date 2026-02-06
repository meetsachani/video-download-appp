package o;

import android.util.Rational;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class UH2 {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public int a;
    public Rational b;
    public int c;
    public int d;

    /* loaded from: classes.dex */
    public static final class a {
        public static final int e = 0;
        public static final int f = 1;
        public final Rational b;
        public final int c;
        public int a = 1;
        public int d = 0;

        public a(Rational rational, int i) {
            this.b = rational;
            this.c = i;
        }

        public UH2 a() {
            C10907yF1.m(this.b, "The crop aspect ratio must be set.");
            return new UH2(this.a, this.b, this.c, this.d);
        }

        public a b(int i) {
            this.d = i;
            return this;
        }

        public a c(int i) {
            this.a = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public UH2(int i, Rational rational, int i2, int i3) {
        this.a = i;
        this.b = rational;
        this.c = i2;
        this.d = i3;
    }

    public Rational a() {
        return this.b;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.a;
    }
}
