package o;

import java.io.Serializable;

/* renamed from: o.oo1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8602oo1<T> implements InterfaceC3287Is2<T, T>, Serializable {
    public static final InterfaceC3287Is2 X = new C8602oo1();
    private static final long serialVersionUID = 2133891748318574490L;

    public static <T> InterfaceC3287Is2<T, T> b() {
        return X;
    }

    private Object readResolve() {
        return X;
    }

    @Override // o.InterfaceC3287Is2
    public T a(T t) {
        return t;
    }
}
