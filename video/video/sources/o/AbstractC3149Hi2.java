package o;

import android.util.Size;
import java.util.Map;

/* renamed from: o.Hi2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3149Hi2 {
    public static AbstractC3149Hi2 a(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        return new C2551Bj(size, map, size2, map2, size3, map3, map4);
    }

    public abstract Size b();

    public Size c(int i) {
        return d().get(Integer.valueOf(i));
    }

    public abstract Map<Integer, Size> d();

    public abstract Size e();

    public abstract Size f();

    public Size g(int i) {
        return h().get(Integer.valueOf(i));
    }

    public abstract Map<Integer, Size> h();

    public Size i(int i) {
        return j().get(Integer.valueOf(i));
    }

    public abstract Map<Integer, Size> j();

    public Size k(int i) {
        return l().get(Integer.valueOf(i));
    }

    public abstract Map<Integer, Size> l();
}
