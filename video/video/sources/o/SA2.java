package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

/* loaded from: classes4.dex */
public final class SA2<E> extends O<E> implements QA2 {
    private static final long serialVersionUID = -1873799975157099624L;

    public SA2(InterfaceC2958Fk<? extends E> interfaceC2958Fk) {
        super(interfaceC2958Fk);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> InterfaceC2958Fk<E> h(InterfaceC2958Fk<? extends E> interfaceC2958Fk) {
        if (interfaceC2958Fk instanceof QA2) {
            return interfaceC2958Fk;
        }
        return new SA2(interfaceC2958Fk);
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
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return C5994eB2.b(d().iterator());
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.O, o.InterfaceC2958Fk
    public boolean v(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o.O, o.InterfaceC2958Fk
    public boolean x(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o.O, o.InterfaceC2958Fk
    public Set<E> y() {
        return CB2.h(d().y());
    }
}
