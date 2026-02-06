package o;

import android.util.Range;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.C8089mi;

/* renamed from: o.Gh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3044Gh {
    public static final int a = -1;
    public static final int b = 2;
    public static final int c = -1;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = -1;
    public static final int h = 5;
    public static final Range<Integer> i = new Range<>(0, Integer.MAX_VALUE);
    public static final Range<Integer> j = new Range<>(0, Integer.MAX_VALUE);
    public static final AbstractC3044Gh k = a().c(0).a();

    /* renamed from: o.Gh$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract AbstractC3044Gh a();

        public abstract a b(Range<Integer> range);

        public abstract a c(int i);

        public abstract a d(Range<Integer> range);

        public abstract a e(int i);

        public abstract a f(int i);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Gh$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Gh$c */
    /* loaded from: classes.dex */
    public @interface c {
    }

    public static a a() {
        return new C8089mi.b().f(-1).e(-1).c(-1).b(i).d(j);
    }

    public abstract Range<Integer> b();

    public abstract int c();

    public abstract Range<Integer> d();

    public abstract int e();

    public abstract int f();

    public abstract a g();
}
