package o;

import java.io.Serializable;

/* renamed from: o.bf2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5381bf2<T> implements InterfaceC3287Is2<T, String>, Serializable {
    public static final InterfaceC3287Is2<Object, String> X = new C5381bf2();
    private static final long serialVersionUID = 7511110693171758606L;

    public static <T> InterfaceC3287Is2<T, String> b() {
        return (InterfaceC3287Is2<T, String>) X;
    }

    private Object readResolve() {
        return X;
    }

    @Override // o.InterfaceC3287Is2
    /* renamed from: c */
    public String a(T t) {
        return String.valueOf(t);
    }
}
