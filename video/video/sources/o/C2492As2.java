package o;

import java.util.Comparator;

/* renamed from: o.As2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2492As2<E> extends C7143is2<E> implements U92<E> {
    private static final long serialVersionUID = -251737742649401930L;

    public C2492As2(U92<E> u92, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        super(u92, interfaceC3287Is2);
    }

    public static <E> C2492As2<E> B(U92<E> u92, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        return new C2492As2<>(u92, interfaceC3287Is2);
    }

    public static <E> C2492As2<E> w(U92<E> u92, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        C2492As2<E> c2492As2 = new C2492As2<>(u92, interfaceC3287Is2);
        if (u92.size() > 0) {
            Object[] array = u92.toArray();
            u92.clear();
            for (Object obj : array) {
                c2492As2.d().add(interfaceC3287Is2.a(obj));
            }
        }
        return c2492As2;
    }

    @Override // o.U92
    public Comparator<? super E> comparator() {
        return r().comparator();
    }

    @Override // o.U92
    public E first() {
        return r().first();
    }

    @Override // o.U92
    public E last() {
        return r().last();
    }

    public U92<E> r() {
        return (U92) d();
    }
}
