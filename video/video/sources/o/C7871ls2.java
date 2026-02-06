package o;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: o.ls2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7871ls2<E> extends AbstractC8162n0<E> {
    private static final long serialVersionUID = 8692300188161871514L;
    public final InterfaceC3287Is2<? super E, ? extends E> Y;

    public C7871ls2(Collection<E> collection, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        super(collection);
        if (interfaceC3287Is2 != null) {
            this.Y = interfaceC3287Is2;
            return;
        }
        throw new NullPointerException("Transformer must not be null");
    }

    public static <E> C7871ls2<E> i(Collection<E> collection, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        C7871ls2<E> c7871ls2 = new C7871ls2<>(collection, interfaceC3287Is2);
        if (collection.size() > 0) {
            Object[] array = collection.toArray();
            collection.clear();
            for (Object obj : array) {
                c7871ls2.d().add(interfaceC3287Is2.a(obj));
            }
        }
        return c7871ls2;
    }

    public static <E> C7871ls2<E> j(Collection<E> collection, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        return new C7871ls2<>(collection, interfaceC3287Is2);
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean add(E e) {
        return d().add(f(e));
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        return d().addAll(h(collection));
    }

    public E f(E e) {
        return this.Y.a(e);
    }

    public Collection<E> h(Collection<? extends E> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (E e : collection) {
            arrayList.add(f(e));
        }
        return arrayList;
    }
}
