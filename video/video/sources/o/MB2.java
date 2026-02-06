package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;

/* loaded from: classes4.dex */
public final class MB2 extends AbstractC8661p3 implements RA2, Serializable {
    private static final long serialVersionUID = -725356885467962424L;

    public MB2(SortedSet sortedSet) {
        super(sortedSet);
    }

    public static SortedSet h(SortedSet sortedSet) {
        if (sortedSet instanceof RA2) {
            return sortedSet;
        }
        return new MB2(sortedSet);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Collection) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8661p3, java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return new MB2(f().headSet(obj));
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return C5752dB2.b(d().iterator());
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8661p3, java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return new MB2(f().subSet(obj, obj2));
    }

    @Override // o.AbstractC8661p3, java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return new MB2(f().tailSet(obj));
    }
}
