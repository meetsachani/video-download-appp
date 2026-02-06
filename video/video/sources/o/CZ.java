package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class CZ implements InterfaceC3056Gk {
    public Map X = null;
    public int Y = 0;
    public int Z = 0;

    /* loaded from: classes4.dex */
    public static class a implements Iterator {
        public CZ X;
        public Iterator Y;
        public int Y0;
        public Object Z = null;

        public a(CZ cz, Iterator it) {
            this.Y0 = 0;
            this.X = cz;
            this.Y = it;
            this.Y0 = cz.j();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.Y.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.X.j() == this.Y0) {
                Object next = this.Y.next();
                this.Z = next;
                return next;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.X.j() == this.Y0) {
                this.Y.remove();
                this.X.v(this.Z, 1);
                this.Y0++;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    public CZ() {
    }

    @Override // o.InterfaceC3056Gk
    public int I(Object obj) {
        Integer v = C6479g81.v(this.X, obj);
        if (v != null) {
            return v.intValue();
        }
        return 0;
    }

    @Override // o.InterfaceC3056Gk, java.util.Collection
    public boolean add(Object obj) {
        return x(obj, 1);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        while (true) {
            boolean z = false;
            for (Object obj : collection) {
                boolean add = add(obj);
                if (z || add) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Collection
    public void clear() {
        this.Z++;
        this.X.clear();
        this.Y = 0;
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.X.containsKey(obj);
    }

    @Override // o.InterfaceC3056Gk, java.util.Collection
    public boolean containsAll(Collection collection) {
        return f(new C7723lG0(collection));
    }

    public int e() {
        int size = h().size();
        this.Y = size;
        return size;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC3056Gk)) {
            return false;
        }
        InterfaceC3056Gk interfaceC3056Gk = (InterfaceC3056Gk) obj;
        if (interfaceC3056Gk.size() != size()) {
            return false;
        }
        for (Object obj2 : this.X.keySet()) {
            if (interfaceC3056Gk.I(obj2) != I(obj2)) {
                return false;
            }
        }
        return true;
    }

    public boolean f(InterfaceC3056Gk interfaceC3056Gk) {
        boolean z;
        while (true) {
            boolean z2 = true;
            for (Object obj : interfaceC3056Gk.y()) {
                if (I(obj) >= interfaceC3056Gk.I(obj)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2 || !z) {
                    z2 = false;
                }
            }
            return z2;
        }
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : y()) {
            for (int I = I(obj); I > 0; I--) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.X.hashCode();
    }

    public Map i() {
        return this.X;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // o.InterfaceC3056Gk, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a(this, h().iterator());
    }

    public final int j() {
        return this.Z;
    }

    public boolean k(InterfaceC3056Gk interfaceC3056Gk) {
        C7723lG0 c7723lG0 = new C7723lG0();
        for (Object obj : y()) {
            int I = I(obj);
            int I2 = interfaceC3056Gk.I(obj);
            if (1 <= I2 && I2 <= I) {
                c7723lG0.x(obj, I - I2);
            } else {
                c7723lG0.x(obj, I);
            }
        }
        if (!c7723lG0.isEmpty()) {
            return removeAll(c7723lG0);
        }
        return false;
    }

    public void l(Map map) {
        if (map != null && map.isEmpty()) {
            this.X = map;
            return;
        }
        throw new IllegalArgumentException("The map must be non-null and empty");
    }

    @Override // o.InterfaceC3056Gk, java.util.Collection
    public boolean remove(Object obj) {
        return v(obj, I(obj));
    }

    @Override // o.InterfaceC3056Gk, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection == null) {
            return false;
        }
        while (true) {
            boolean z = false;
            for (Object obj : collection) {
                boolean v = v(obj, 1);
                if (z || v) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // o.InterfaceC3056Gk, java.util.Collection
    public boolean retainAll(Collection collection) {
        return k(new C7723lG0(collection));
    }

    @Override // o.InterfaceC3056Gk, java.util.Collection
    public int size() {
        return this.Y;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return h().toArray();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C6566gU0.f);
        Iterator it = y().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            stringBuffer.append(I(next));
            stringBuffer.append(":");
            stringBuffer.append(next);
            if (it.hasNext()) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(C6566gU0.g);
        return stringBuffer.toString();
    }

    @Override // o.InterfaceC3056Gk
    public boolean v(Object obj, int i) {
        boolean z = true;
        this.Z++;
        int I = I(obj);
        if (i <= 0) {
            return false;
        }
        if (I > i) {
            this.X.put(obj, new Integer(I - i));
            this.Y -= i;
            return true;
        }
        if (this.X.remove(obj) == null) {
            z = false;
        }
        this.Y -= I;
        return z;
    }

    @Override // o.InterfaceC3056Gk
    public boolean x(Object obj, int i) {
        this.Z++;
        if (i > 0) {
            int I = I(obj) + i;
            this.X.put(obj, new Integer(I));
            this.Y += i;
            if (I == i) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC3056Gk
    public Set y() {
        return DB2.f(this.X.keySet());
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return h().toArray(objArr);
    }

    public CZ(Map map) {
        l(map);
    }
}
