package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import o.C8409o1;

/* loaded from: classes4.dex */
public class G01 extends C8409o1 implements Serializable, Cloneable {
    private static final long serialVersionUID = 9077234323521161066L;

    /* loaded from: classes4.dex */
    public static class a extends AbstractList {
        public final G01 X;

        public a(G01 g01) {
            this.X = g01;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.X.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean containsAll(Collection collection) {
            return this.X.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            return this.X.L(i);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            return this.X.O(obj);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return C5752dB2.b(this.X.keySet().iterator());
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            return this.X.O(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return C7219jB2.b(super.listIterator());
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i, int i2) {
            return C6978iB2.f(super.subList(i, i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            return this.X.keySet().toArray();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i) {
            return C7219jB2.b(super.listIterator(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] objArr) {
            return this.X.keySet().toArray(objArr);
        }
    }

    public G01() {
        super(16, 0.75f, 12);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        n(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        o(objectOutputStream);
    }

    public List K() {
        return new a(this);
    }

    public Object L(int i) {
        return J(i).getKey();
    }

    public Object N(int i) {
        return J(i).getValue();
    }

    public int O(Object obj) {
        Object g = g(obj);
        C8409o1.c cVar = this.o1.a1;
        int i = 0;
        while (cVar != this.o1) {
            if (B(g, cVar.Z)) {
                return i;
            }
            cVar = cVar.a1;
            i++;
        }
        return -1;
    }

    public Object P(int i) {
        return remove(L(i));
    }

    @Override // o.U0, java.util.AbstractMap
    public Object clone() {
        return super.clone();
    }

    public G01(int i) {
        super(i);
    }

    public G01(int i, float f) {
        super(i, f);
    }

    public G01(Map map) {
        super(map);
    }
}
