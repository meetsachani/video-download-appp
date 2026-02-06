package o;

import java.util.Set;

/* renamed from: o.ys2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C11058ys2<E> extends C7871ls2<E> implements Set<E> {
    private static final long serialVersionUID = 306127383500410386L;

    public C11058ys2(Set<E> set, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        super(set, interfaceC3287Is2);
    }

    public static <E> Set<E> k(Set<E> set, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        C11058ys2 c11058ys2 = new C11058ys2(set, interfaceC3287Is2);
        if (set.size() > 0) {
            Object[] array = set.toArray();
            set.clear();
            for (Object obj : array) {
                c11058ys2.d().add(interfaceC3287Is2.a(obj));
            }
        }
        return c11058ys2;
    }

    public static <E> C11058ys2<E> l(Set<E> set, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        return new C11058ys2<>(set, interfaceC3287Is2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj != this && !d().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return d().hashCode();
    }
}
