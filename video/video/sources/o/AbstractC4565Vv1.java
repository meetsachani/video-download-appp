package o;

import java.io.Serializable;

/* renamed from: o.Vv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4565Vv1<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static <T> AbstractC4565Vv1<T> a() {
        return L.j();
    }

    public static <T> AbstractC4565Vv1<T> b(T t) {
        if (t == null) {
            return a();
        }
        return new QG1(t);
    }

    public static <T> AbstractC4565Vv1<T> e(T t) {
        return new QG1(C10907yF1.l(t));
    }

    public abstract T c();

    public abstract boolean d();

    public abstract boolean equals(Object obj);

    public abstract T f(T t);

    public abstract T g(InterfaceC8575oh2<? extends T> interfaceC8575oh2);

    public abstract AbstractC4565Vv1<T> h(AbstractC4565Vv1<? extends T> abstractC4565Vv1);

    public abstract int hashCode();

    public abstract T i();

    public abstract String toString();
}
