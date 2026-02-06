package o;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Predicate;

/* renamed from: o.qP0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8993qP0<K, C> extends AbstractC8162n0<C> {
    private static final long serialVersionUID = -5512610452568370038L;
    public final InterfaceC3287Is2<C, K> Y;
    public final boolean Y0;
    public final InterfaceC4818Yl1<K, C> Z;

    public C8993qP0(Collection<C> collection, InterfaceC3287Is2<C, K> interfaceC3287Is2, InterfaceC4818Yl1<K, C> interfaceC4818Yl1, boolean z) {
        super(collection);
        this.Y = interfaceC3287Is2;
        this.Z = interfaceC4818Yl1;
        this.Y0 = z;
        j();
    }

    public static <K, C> C8993qP0<K, C> i(Collection<C> collection, InterfaceC3287Is2<C, K> interfaceC3287Is2) {
        return new C8993qP0<>(collection, interfaceC3287Is2, C6876hm1.i(new HashMap()), false);
    }

    public static <K, C> C8993qP0<K, C> l(Collection<C> collection, InterfaceC3287Is2<C, K> interfaceC3287Is2) {
        return new C8993qP0<>(collection, interfaceC3287Is2, C6876hm1.i(new HashMap()), true);
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean add(C c) {
        boolean add = super.add(c);
        if (add) {
            f(c);
        }
        return add;
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends C> collection) {
        boolean z = false;
        for (C c : collection) {
            z |= add(c);
        }
        return z;
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public void clear() {
        super.clear();
        this.Z.clear();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.Z.containsKey(this.Y.a(obj));
    }

    @Override // o.AbstractC8162n0, java.util.Collection, o.InterfaceC2958Fk
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void f(C c) {
        K a = this.Y.a(c);
        if (this.Y0 && this.Z.containsKey(a)) {
            throw new IllegalArgumentException("Duplicate key in uniquely indexed collection.");
        }
        this.Z.put(a, c);
    }

    public C h(K k) {
        Collection collection = (Collection) this.Z.get(k);
        if (collection == null) {
            return null;
        }
        return (C) collection.iterator().next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        this.Z.clear();
        for (Object obj : d()) {
            f(obj);
        }
    }

    public final void k(C c) {
        this.Z.remove(this.Y.a(c));
    }

    public Collection<C> p(K k) {
        return (Collection) this.Z.get(k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        boolean remove = super.remove(obj);
        if (remove) {
            k(obj);
        }
        return remove;
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeIf(Predicate<? super C> predicate) {
        boolean z = false;
        if (predicate == null) {
            return false;
        }
        Iterator<C> it = iterator();
        while (it.hasNext()) {
            if (predicate.test((C) it.next())) {
                it.remove();
                z = true;
            }
        }
        if (z) {
            j();
        }
        return z;
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean retainAll = super.retainAll(collection);
        if (retainAll) {
            j();
        }
        return retainAll;
    }
}
