package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
import o.E1;

/* renamed from: o.au2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5198au2<E> extends E1<E> implements U92<E>, Serializable {
    private static final long serialVersionUID = -7740146511091606676L;

    public C5198au2() {
        super(new TreeMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        super.i(new TreeMap((Comparator) objectInputStream.readObject()), objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(comparator());
        super.j(objectOutputStream);
    }

    @Override // o.E1, o.InterfaceC2958Fk, java.util.Collection
    public boolean add(E e) {
        if (comparator() == null && !(e instanceof Comparable)) {
            e.getClass();
            throw new IllegalArgumentException("Objects of type " + e.getClass() + " cannot be added to a naturally ordered TreeBag as it does not implement Comparable");
        }
        return super.add(e);
    }

    @Override // o.U92
    public Comparator<? super E> comparator() {
        return k().comparator();
    }

    @Override // o.U92
    public E first() {
        return k().firstKey();
    }

    @Override // o.U92
    public E last() {
        return k().lastKey();
    }

    @Override // o.E1
    /* renamed from: p */
    public SortedMap<E, E1.b> k() {
        return (SortedMap) super.k();
    }

    public C5198au2(Comparator<? super E> comparator) {
        super(new TreeMap(comparator));
    }

    public C5198au2(Collection<? extends E> collection) {
        this();
        addAll(collection);
    }
}
