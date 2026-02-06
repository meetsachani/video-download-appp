package o;

import o.HJ;

/* renamed from: o.Gl2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3063Gl2<T> extends CO1 {
    public static final HJ.a<String> w = HJ.a.a("camerax.core.target.name", String.class);
    public static final HJ.a<Class<?>> x = HJ.a.a("camerax.core.target.class", Class.class);

    /* renamed from: o.Gl2$a */
    /* loaded from: classes.dex */
    public interface a<T, B> {
        B k(String str);

        B q(Class<T> cls);
    }

    default Class<T> e() {
        return (Class) j(x);
    }

    default Class<T> e0(Class<T> cls) {
        return (Class) h(x, cls);
    }

    default String j0() {
        return (String) j(w);
    }

    default String v(String str) {
        return (String) h(w, str);
    }
}
