package o;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.Comparator;

/* renamed from: o.qf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9050qf {
    public static final Rational a = new Rational(4, 3);
    public static final Rational b = new Rational(3, 4);
    public static final Rational c = new Rational(16, 9);
    public static final Rational d = new Rational(9, 16);
    public static final int e = 16;

    /* renamed from: o.qf$a */
    /* loaded from: classes.dex */
    public static final class a implements Comparator<Rational> {
        public final Rational X;
        public final RectF Y;
        public final Rational Z;

        public a(Rational rational, Rational rational2) {
            this.X = rational;
            this.Z = rational2 == null ? new Rational(4, 3) : rational2;
            this.Y = d(rational);
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF d = d(rational);
            RectF d2 = d(rational2);
            boolean e = e(d, this.Y);
            boolean e2 = e(d2, this.Y);
            if (e && e2) {
                return (int) Math.signum(b(d) - b(d2));
            }
            if (e) {
                return -1;
            }
            if (e2) {
                return 1;
            }
            return -((int) Math.signum(c(d, this.Y) - c(d2, this.Y)));
        }

        public final float b(RectF rectF) {
            return rectF.width() * rectF.height();
        }

        public final float c(RectF rectF, RectF rectF2) {
            float width;
            float height;
            if (rectF.width() < rectF2.width()) {
                width = rectF.width();
            } else {
                width = rectF2.width();
            }
            if (rectF.height() < rectF2.height()) {
                height = rectF.height();
            } else {
                height = rectF2.height();
            }
            return width * height;
        }

        public final RectF d(Rational rational) {
            if (rational.floatValue() == this.Z.floatValue()) {
                return new RectF(0.0f, 0.0f, this.Z.getNumerator(), this.Z.getDenominator());
            }
            if (rational.floatValue() > this.Z.floatValue()) {
                return new RectF(0.0f, 0.0f, this.Z.getNumerator(), (rational.getDenominator() * this.Z.getNumerator()) / rational.getNumerator());
            }
            return new RectF(0.0f, 0.0f, (rational.getNumerator() * this.Z.getDenominator()) / rational.getDenominator(), this.Z.getDenominator());
        }

        public final boolean e(RectF rectF, RectF rectF2) {
            if (rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height()) {
                return true;
            }
            return false;
        }
    }

    public static boolean a(Size size, Rational rational) {
        return b(size, rational, W82.c);
    }

    public static boolean b(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (W82.a(size) < W82.a(size2)) {
            return false;
        }
        return c(size, rational);
    }

    public static boolean c(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i = width % 16;
        if (i == 0 && height % 16 == 0) {
            if (!d(Math.max(0, height - 16), width, rational) && !d(Math.max(0, width - 16), height, rational2)) {
                return false;
            }
            return true;
        } else if (i == 0) {
            return d(height, width, rational);
        } else {
            if (height % 16 != 0) {
                return false;
            }
            return d(width, height, rational2);
        }
    }

    public static boolean d(int i, int i2, Rational rational) {
        boolean z;
        if (i2 % 16 == 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.a(z);
        double numerator = (i * rational.getNumerator()) / rational.getDenominator();
        if (numerator > Math.max(0, i2 - 16) && numerator < i2 + 16) {
            return true;
        }
        return false;
    }
}
