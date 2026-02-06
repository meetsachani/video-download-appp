package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import o.InterfaceC6135em1;

/* renamed from: o.sB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9431sB2<E> extends AbstractC6198f2<E> implements QA2 {
    private static final long serialVersionUID = 20150611;

    public C9431sB2(InterfaceC6135em1<? extends E> interfaceC6135em1) {
        super(interfaceC6135em1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> InterfaceC6135em1<E> h(InterfaceC6135em1<? extends E> interfaceC6135em1) {
        if (interfaceC6135em1 instanceof QA2) {
            return interfaceC6135em1;
        }
        return new C9431sB2(interfaceC6135em1);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        e((Collection) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(d());
    }

    @Override // o.AbstractC6198f2, o.InterfaceC6135em1
    public int R(E e, int i) {
        throw new UnsupportedOperationException();
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

    @Override // o.AbstractC6198f2, o.InterfaceC6135em1
    public Set<InterfaceC6135em1.a<E>> entrySet() {
        return CB2.h(d().entrySet());
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

    @Override // o.AbstractC6198f2, o.InterfaceC6135em1
    public int v(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6198f2, o.InterfaceC6135em1
    public int x(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6198f2, o.InterfaceC6135em1
    public Set<E> y() {
        return CB2.h(d().y());
    }
}
