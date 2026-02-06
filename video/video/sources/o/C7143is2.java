package o;

import java.util.Set;

/* renamed from: o.is2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7143is2<E> extends C7871ls2<E> implements InterfaceC2958Fk<E> {
    private static final long serialVersionUID = 5421170911299074185L;

    public C7143is2(InterfaceC2958Fk<E> interfaceC2958Fk, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        super(interfaceC2958Fk, interfaceC3287Is2);
    }

    public static <E> InterfaceC2958Fk<E> l(InterfaceC2958Fk<E> interfaceC2958Fk, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        C7143is2 c7143is2 = new C7143is2(interfaceC2958Fk, interfaceC3287Is2);
        if (interfaceC2958Fk.size() > 0) {
            Object[] array = interfaceC2958Fk.toArray();
            interfaceC2958Fk.clear();
            for (Object obj : array) {
                c7143is2.d().add(interfaceC3287Is2.a(obj));
            }
        }
        return c7143is2;
    }

    public static <E> InterfaceC2958Fk<E> p(InterfaceC2958Fk<E> interfaceC2958Fk, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        return new C7143is2(interfaceC2958Fk, interfaceC3287Is2);
    }

    @Override // o.InterfaceC2958Fk
    public int I(Object obj) {
        return k().I(obj);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj != this && !d().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return d().hashCode();
    }

    public InterfaceC2958Fk<E> k() {
        return (InterfaceC2958Fk) d();
    }

    @Override // o.InterfaceC2958Fk
    public boolean v(Object obj, int i) {
        return k().v(obj, i);
    }

    @Override // o.InterfaceC2958Fk
    public boolean x(E e, int i) {
        return k().x(f(e), i);
    }

    @Override // o.InterfaceC2958Fk
    public Set<E> y() {
        return C11058ys2.l(k().y(), this.Y);
    }
}
