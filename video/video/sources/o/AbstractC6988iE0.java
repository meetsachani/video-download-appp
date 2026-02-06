package o;

import android.location.GnssStatus;
import android.location.GpsStatus;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: o.iE0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6988iE0 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.iE0$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    public static AbstractC6988iE0 n(GnssStatus gnssStatus) {
        return new C7229jE0(gnssStatus);
    }

    public static AbstractC6988iE0 o(GpsStatus gpsStatus) {
        return new C8463oE0(gpsStatus);
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public abstract float c(int i);

    public abstract float d(int i);

    public abstract int e(int i);

    public abstract float f(int i);

    public abstract int g();

    public abstract int h(int i);

    public abstract boolean i(int i);

    public abstract boolean j(int i);

    public abstract boolean k(int i);

    public abstract boolean l(int i);

    public abstract boolean m(int i);

    /* renamed from: o.iE0$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public void c() {
        }

        public void d() {
        }

        public void a(int i) {
        }

        public void b(AbstractC6988iE0 abstractC6988iE0) {
        }
    }
}
