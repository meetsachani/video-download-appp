package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.bF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5280bF<E> extends O<E> {
    private static final long serialVersionUID = -2560033712679053143L;

    public C5280bF(InterfaceC2958Fk<E> interfaceC2958Fk) {
        super(interfaceC2958Fk);
    }

    public static <E> InterfaceC2958Fk<E> h(InterfaceC2958Fk<E> interfaceC2958Fk) {
        return new C5280bF(interfaceC2958Fk);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        e((Collection) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(d());
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean add(E e) {
        return x(e, 1);
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        while (true) {
            boolean z = false;
            for (E e : collection) {
                boolean x = x(e, 1);
                if (z || x) {
                    z = true;
                }
            }
            return z;
        }
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

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return v(obj, 1);
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        if (collection != null) {
            while (true) {
                boolean z = false;
                for (Object obj : collection) {
                    boolean v = v(obj, I(obj));
                    if (z || v) {
                        z = true;
                    }
                }
                return z;
            }
        }
        return d().removeAll(null);
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        if (collection != null) {
            Iterator<E> it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        return d().retainAll(null);
    }

    @Override // o.O, o.InterfaceC2958Fk
    public boolean x(E e, int i) {
        d().x(e, i);
        return true;
    }
}
