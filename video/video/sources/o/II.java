package o;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class II implements Collection {
    public a X;
    public Collection[] Y;

    /* loaded from: classes4.dex */
    public interface a {
        boolean a(II ii, Collection[] collectionArr, Collection collection);

        boolean c(II ii, Collection[] collectionArr, Object obj);

        boolean d(II ii, Collection[] collectionArr, Object obj);
    }

    public II() {
        this.Y = new Collection[0];
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        a aVar = this.X;
        if (aVar != null) {
            return aVar.c(this, this.Y, obj);
        }
        throw new UnsupportedOperationException("add() is not supported on CompositeCollection without a CollectionMutator strategy");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        a aVar = this.X;
        if (aVar != null) {
            return aVar.a(this, this.Y, collection);
        }
        throw new UnsupportedOperationException("addAll() is not supported on CompositeCollection without a CollectionMutator strategy");
    }

    @Override // java.util.Collection
    public void clear() {
        int i = 0;
        while (true) {
            Collection[] collectionArr = this.Y;
            if (i < collectionArr.length) {
                collectionArr[i].clear();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        for (int length = this.Y.length - 1; length >= 0; length--) {
            if (this.Y[length].contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public void d(Collection collection) {
        f(new Collection[]{collection});
    }

    public void e(Collection collection, Collection collection2) {
        f(new Collection[]{collection, collection2});
    }

    public void f(Collection[] collectionArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(this.Y));
        arrayList.addAll(Arrays.asList(collectionArr));
        this.Y = (Collection[]) arrayList.toArray(new Collection[arrayList.size()]);
    }

    public Collection h() {
        return C6978iB2.f(Arrays.asList(this.Y));
    }

    public void i(Collection collection) {
        ArrayList arrayList = new ArrayList(this.Y.length);
        arrayList.addAll(Arrays.asList(this.Y));
        arrayList.remove(collection);
        this.Y = (Collection[]) arrayList.toArray(new Collection[arrayList.size()]);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        for (int length = this.Y.length - 1; length >= 0; length--) {
            if (!this.Y[length].isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        if (this.Y.length == 0) {
            return C4482Va0.Y;
        }
        C5583cU0 c5583cU0 = new C5583cU0();
        int i = 0;
        while (true) {
            Collection[] collectionArr = this.Y;
            if (i < collectionArr.length) {
                c5583cU0.b(collectionArr[i].iterator());
                i++;
            } else {
                return c5583cU0;
            }
        }
    }

    public void j(a aVar) {
        this.X = aVar;
    }

    public Collection k() {
        return new ArrayList(this);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        a aVar = this.X;
        if (aVar != null) {
            return aVar.d(this, this.Y, obj);
        }
        throw new UnsupportedOperationException("remove() is not supported on CompositeCollection without a CollectionMutator strategy");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection.size() == 0) {
            return false;
        }
        boolean z = false;
        for (int length = this.Y.length - 1; length >= 0; length--) {
            if (!this.Y[length].removeAll(collection) && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean z = false;
        for (int length = this.Y.length - 1; length >= 0; length--) {
            if (!this.Y[length].retainAll(collection) && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection
    public int size() {
        int i = 0;
        for (int length = this.Y.length - 1; length >= 0; length--) {
            i += this.Y[length].size();
        }
        return i;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    public II(Collection collection) {
        this();
        d(collection);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            Collection[] collectionArr = this.Y;
            if (i >= collectionArr.length) {
                break;
            }
            for (Object obj : collectionArr[i]) {
                objArr[i2] = obj;
                i2++;
            }
            i++;
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    public II(Collection[] collectionArr) {
        this();
        f(collectionArr);
    }
}
