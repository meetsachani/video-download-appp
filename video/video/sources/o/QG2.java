package o;

import android.util.Range;
import java.util.Arrays;
import o.C3150Hj;

/* loaded from: classes.dex */
public abstract class QG2 {
    public static final Range<Integer> a = new Range<>(0, Integer.MAX_VALUE);
    public static final Range<Integer> b = new Range<>(0, Integer.MAX_VALUE);
    public static final C6276fL1 c;

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract QG2 a();

        public abstract a b(int i);

        public abstract a c(Range<Integer> range);

        public abstract a d(Range<Integer> range);

        public abstract a e(C6276fL1 c6276fL1);
    }

    static {
        C5548cL1 c5548cL1 = C5548cL1.c;
        c = C6276fL1.g(Arrays.asList(c5548cL1, C5548cL1.b, C5548cL1.a), C6879hn0.a(c5548cL1));
    }

    public static a a() {
        return new C3150Hj.b().e(c).d(a).c(b).b(-1);
    }

    public abstract int b();

    public abstract Range<Integer> c();

    public abstract Range<Integer> d();

    public abstract C6276fL1 e();

    public abstract a f();
}
