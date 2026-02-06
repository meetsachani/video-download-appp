package o;

import android.util.Range;
import android.util.Size;
import o.C9801tj;

/* renamed from: o.Qd2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4008Qd2 {
    public static final Range<Integer> a = new Range<>(0, 0);

    /* renamed from: o.Qd2$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract AbstractC4008Qd2 a();

        public abstract a b(N80 n80);

        public abstract a c(Range<Integer> range);

        public abstract a d(HJ hj);

        public abstract a e(Size size);
    }

    public static a a(Size size) {
        return new C9801tj.b().e(size).c(a).b(N80.n);
    }

    public abstract N80 b();

    public abstract Range<Integer> c();

    public abstract HJ d();

    public abstract Size e();

    public abstract a f();
}
