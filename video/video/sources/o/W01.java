package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
public class W01 extends J1 implements InterfaceC9612sw1, Serializable {
    private static final long serialVersionUID = 2728177751851003750L;
    public final List Y;

    /* loaded from: classes4.dex */
    public static class a extends AbstractSet {
        public final W01 X;
        public final List Y;
        public Set Z;

        public a(W01 w01, List list) {
            this.X = w01;
            this.Y = list;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return d().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return d().containsAll(collection);
        }

        public final Set d() {
            if (this.Z == null) {
                this.Z = this.X.V().entrySet();
            }
            return this.Z;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return d().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return d().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.X.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new c(this.X, this.Y);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry) || !d().contains(obj)) {
                return false;
            }
            this.X.remove(((Map.Entry) obj).getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.X.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return d().toString();
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends AbstractSet {
        public final W01 X;

        public b(W01 w01) {
            this.X = w01;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.X.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new Y01(this, this.X.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.X.size();
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends C7176j1 {
        public final W01 Y;
        public Object Z;

        public c(W01 w01, List list) {
            super(list.iterator());
            this.Z = null;
            this.Y = w01;
        }

        @Override // o.C7176j1, java.util.Iterator
        public Object next() {
            Object next = super.next();
            this.Z = next;
            return new d(this.Y, next);
        }

        @Override // o.C7176j1, java.util.Iterator
        public void remove() {
            super.remove();
            this.Y.V().remove(this.Z);
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends K1 {
        public final W01 Z;

        public d(W01 w01, Object obj) {
            super(obj, null);
            this.Z = w01;
        }

        @Override // o.AbstractC7662l1, o.KX0
        public Object getValue() {
            return this.Z.get(this.X);
        }

        @Override // o.K1, java.util.Map.Entry
        public Object setValue(Object obj) {
            return this.Z.V().put(this.X, obj);
        }
    }

    /* loaded from: classes4.dex */
    public static class e implements InterfaceC10098uw1, NS1 {
        public final W01 X;
        public ListIterator Y;
        public Object Z = null;
        public boolean Y0 = false;

        public e(W01 w01) {
            this.X = w01;
            this.Y = w01.Y.listIterator();
        }

        @Override // o.V71
        public Object getKey() {
            if (this.Y0) {
                return this.Z;
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // o.V71
        public Object getValue() {
            if (this.Y0) {
                return this.X.get(this.Z);
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // o.V71, java.util.Iterator
        public boolean hasNext() {
            return this.Y.hasNext();
        }

        @Override // o.InterfaceC10098uw1, o.InterfaceC9127qw1
        public boolean hasPrevious() {
            return this.Y.hasPrevious();
        }

        @Override // o.V71, java.util.Iterator
        public Object next() {
            Object next = this.Y.next();
            this.Z = next;
            this.Y0 = true;
            return next;
        }

        @Override // o.InterfaceC10098uw1, o.InterfaceC9127qw1
        public Object previous() {
            Object previous = this.Y.previous();
            this.Z = previous;
            this.Y0 = true;
            return previous;
        }

        @Override // o.V71, java.util.Iterator
        public void remove() {
            if (this.Y0) {
                this.Y.remove();
                this.X.X.remove(this.Z);
                this.Y0 = false;
                return;
            }
            throw new IllegalStateException("remove() can only be called once after next()");
        }

        @Override // o.NS1
        public void reset() {
            this.Y = this.X.Y.listIterator();
            this.Z = null;
            this.Y0 = false;
        }

        @Override // o.V71
        public Object setValue(Object obj) {
            if (this.Y0) {
                return this.X.X.put(this.Z, obj);
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }

        public String toString() {
            if (this.Y0) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Iterator[");
                stringBuffer.append(getKey());
                stringBuffer.append("=");
                stringBuffer.append(getValue());
                stringBuffer.append(C6566gU0.g);
                return stringBuffer.toString();
            }
            return "Iterator[]";
        }
    }

    /* loaded from: classes4.dex */
    public static class f extends AbstractList {
        public final W01 X;

        public f(W01 w01) {
            this.X = w01;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.X.containsValue(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            return this.X.d(i);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return new Z01(this, this.X.entrySet().iterator());
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i) {
            return this.X.i(i);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i, Object obj) {
            return this.X.j(i, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.size();
        }
    }

    public W01() {
        this(new HashMap());
    }

    public static InterfaceC9612sw1 b(Map map) {
        return new W01(map);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }

    public List a() {
        return f();
    }

    public Object c(int i) {
        return this.Y.get(i);
    }

    @Override // o.InterfaceC9612sw1
    public InterfaceC10098uw1 c2() {
        return new e(this);
    }

    @Override // o.J1, java.util.Map
    public void clear() {
        V().clear();
        this.Y.clear();
    }

    public Object d(int i) {
        return get(this.Y.get(i));
    }

    public int e(Object obj) {
        return this.Y.indexOf(obj);
    }

    @Override // o.J1, java.util.Map
    public Set entrySet() {
        return new a(this, this.Y);
    }

    public List f() {
        return C6978iB2.f(this.Y);
    }

    @Override // o.InterfaceC9612sw1
    public Object firstKey() {
        if (size() != 0) {
            return this.Y.get(0);
        }
        throw new NoSuchElementException("Map is empty");
    }

    public Object g(int i, Object obj, Object obj2) {
        Map V = V();
        if (V.containsKey(obj)) {
            Object remove = V.remove(obj);
            int indexOf = this.Y.indexOf(obj);
            this.Y.remove(indexOf);
            if (indexOf < i) {
                i--;
            }
            this.Y.add(i, obj);
            V.put(obj, obj2);
            return remove;
        }
        this.Y.add(i, obj);
        V.put(obj, obj2);
        return null;
    }

    public Object i(int i) {
        return remove(c(i));
    }

    public Object j(int i, Object obj) {
        return put(this.Y.get(i), obj);
    }

    @Override // o.InterfaceC9612sw1
    public Object j0(Object obj) {
        int indexOf = this.Y.indexOf(obj);
        if (indexOf > 0) {
            return this.Y.get(indexOf - 1);
        }
        return null;
    }

    public List k() {
        return new f(this);
    }

    @Override // o.J1, java.util.Map
    public Set keySet() {
        return new b(this);
    }

    @Override // o.InterfaceC9612sw1
    public Object lastKey() {
        if (size() != 0) {
            return this.Y.get(size() - 1);
        }
        throw new NoSuchElementException("Map is empty");
    }

    @Override // o.InterfaceC9612sw1
    public Object n0(Object obj) {
        int indexOf = this.Y.indexOf(obj);
        if (indexOf >= 0 && indexOf < size() - 1) {
            return this.Y.get(indexOf + 1);
        }
        return null;
    }

    @Override // o.XT0
    public V71 p() {
        return c2();
    }

    @Override // o.J1, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (V().containsKey(obj)) {
            return V().put(obj, obj2);
        }
        Object put = V().put(obj, obj2);
        this.Y.add(obj);
        return put;
    }

    @Override // o.J1, java.util.Map
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // o.J1, java.util.Map
    public Object remove(Object obj) {
        Object remove = V().remove(obj);
        this.Y.remove(obj);
        return remove;
    }

    @Override // o.J1
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (z) {
                z = false;
            } else {
                stringBuffer.append(C6566gU0.h);
            }
            if (key == this) {
                key = "(this Map)";
            }
            stringBuffer.append(key);
            stringBuffer.append('=');
            if (value == this) {
                value = "(this Map)";
            }
            stringBuffer.append(value);
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // o.J1, java.util.Map
    public Collection values() {
        return new f(this);
    }

    public W01(Map map) {
        super(map);
        ArrayList arrayList = new ArrayList();
        this.Y = arrayList;
        arrayList.addAll(V().keySet());
    }
}
