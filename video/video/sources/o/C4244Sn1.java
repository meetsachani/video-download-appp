package o;

/* renamed from: o.Sn1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4244Sn1<T> extends AbstractC11237zc2<T> {
    public C4244Sn1(Object obj, boolean z) {
        super(obj, z);
    }

    public static <T> C4244Sn1<T> k(Throwable th) {
        return new C4244Sn1<>(th, true);
    }

    public static <T> C4244Sn1<T> l(T t) {
        return new C4244Sn1<>(t, false);
    }

    public void i(Throwable th) {
        g(th);
    }

    public void j(T t) {
        f(t);
    }
}
