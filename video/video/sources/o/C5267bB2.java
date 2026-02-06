package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.bB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5267bB2 extends AbstractC4989a3 implements RA2 {

    /* renamed from: o.bB2$a */
    /* loaded from: classes4.dex */
    public static final class a extends O1 {
        public a(Map.Entry entry) {
            super(entry);
        }

        @Override // o.O1, java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.bB2$b */
    /* loaded from: classes4.dex */
    public static final class b extends C7176j1 {
        public b(Iterator it) {
            super(it);
        }

        @Override // o.C7176j1, java.util.Iterator
        public Object next() {
            return new a((Map.Entry) this.X.next());
        }

        @Override // o.C7176j1, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C5267bB2(Set set) {
        super(set);
    }

    public static Set f(Set set) {
        if (set instanceof RA2) {
            return set;
        }
        return new C5267bB2(set);
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

    @Override // o.AbstractC8405o0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new b(this.X.iterator());
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

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public Object[] toArray() {
        Object[] array = this.X.toArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = new a((Map.Entry) array[i]);
        }
        return array;
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        Object[] array = this.X.toArray(objArr.length > 0 ? (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 0) : objArr);
        for (int i = 0; i < array.length; i++) {
            array[i] = new a((Map.Entry) array[i]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }
}
