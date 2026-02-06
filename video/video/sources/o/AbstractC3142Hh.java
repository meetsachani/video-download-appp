package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.Hh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3142Hh {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final double g = 0.0d;
    public static final Set<Integer> h = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Hh$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    public static AbstractC3142Hh g(int i, Throwable th, double d2) {
        return new C8332ni(i, d2, th);
    }

    public double a() {
        if (c() == 1) {
            return 0.0d;
        }
        return b();
    }

    public abstract double b();

    public abstract int c();

    public abstract Throwable d();

    public boolean e() {
        if (c() == 0) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return h.contains(Integer.valueOf(c()));
    }
}
