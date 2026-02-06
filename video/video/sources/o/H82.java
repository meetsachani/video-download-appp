package o;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
public class H82 implements InterfaceC9612sw1, InterfaceC9825tp, KX0, Serializable, Cloneable {
    private static final long serialVersionUID = -8931271118676803261L;
    public final Object X;
    public Object Y;

    /* loaded from: classes4.dex */
    public static class a implements InterfaceC10098uw1, NS1 {
        public final H82 X;
        public boolean Y = true;
        public boolean Z = false;

        public a(H82 h82) {
            this.X = h82;
        }

        @Override // o.V71
        public Object getKey() {
            if (this.Z) {
                return this.X.getKey();
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // o.V71
        public Object getValue() {
            if (this.Z) {
                return this.X.getValue();
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // o.V71, java.util.Iterator
        public boolean hasNext() {
            return this.Y;
        }

        @Override // o.InterfaceC10098uw1, o.InterfaceC9127qw1
        public boolean hasPrevious() {
            return !this.Y;
        }

        @Override // o.V71, java.util.Iterator
        public Object next() {
            if (this.Y) {
                this.Y = false;
                this.Z = true;
                return this.X.getKey();
            }
            throw new NoSuchElementException("No next() entry in the iteration");
        }

        @Override // o.InterfaceC10098uw1, o.InterfaceC9127qw1
        public Object previous() {
            if (!this.Y) {
                this.Y = true;
                return this.X.getKey();
            }
            throw new NoSuchElementException("No previous() entry in the iteration");
        }

        @Override // o.V71, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // o.NS1
        public void reset() {
            this.Y = true;
        }

        @Override // o.V71
        public Object setValue(Object obj) {
            if (this.Z) {
                return this.X.d(obj);
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }

        public String toString() {
            if (this.Y) {
                return "Iterator[]";
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Iterator[");
            stringBuffer.append(getKey());
            stringBuffer.append("=");
            stringBuffer.append(getValue());
            stringBuffer.append(C6566gU0.g);
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends AbstractSet implements Serializable {
        private static final long serialVersionUID = -3689524741863047872L;
        public final H82 X;

        public b(H82 h82) {
            this.X = h82;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.X.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new E82(this.X.getValue(), false);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1;
        }
    }

    public H82() {
        this.X = null;
    }

    public boolean b(Object obj) {
        if (obj == null) {
            if (getKey() == null) {
                return true;
            }
            return false;
        }
        return obj.equals(getKey());
    }

    public boolean c(Object obj) {
        if (obj == null) {
            if (getValue() == null) {
                return true;
            }
            return false;
        }
        return obj.equals(getValue());
    }

    @Override // o.InterfaceC9612sw1
    public InterfaceC10098uw1 c2() {
        return new a(this);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public Object clone() {
        try {
            return (H82) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return b(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return c(obj);
    }

    public Object d(Object obj) {
        Object obj2 = this.Y;
        this.Y = obj;
        return obj2;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return Collections.singleton(new C2574Bo2(this, getKey()));
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() != 1) {
            return false;
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        if (b(entry.getKey()) && c(entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC9612sw1
    public Object firstKey() {
        return getKey();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        if (b(obj)) {
            return this.Y;
        }
        return null;
    }

    @Override // o.KX0
    public Object getKey() {
        return this.X;
    }

    @Override // o.KX0
    public Object getValue() {
        return this.Y;
    }

    @Override // java.util.Map
    public int hashCode() {
        int hashCode;
        int i = 0;
        if (getKey() == null) {
            hashCode = 0;
        } else {
            hashCode = getKey().hashCode();
        }
        if (getValue() != null) {
            i = getValue().hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return false;
    }

    @Override // o.InterfaceC9612sw1
    public Object j0(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public Set keySet() {
        return Collections.singleton(this.X);
    }

    @Override // o.InterfaceC9612sw1
    public Object lastKey() {
        return getKey();
    }

    @Override // o.InterfaceC9612sw1
    public Object n0(Object obj) {
        return null;
    }

    @Override // o.XT0
    public V71 p() {
        return new a(this);
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        if (b(obj)) {
            return d(obj2);
        }
        throw new IllegalArgumentException("Cannot put new key/value pair - Map is fixed size singleton");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        int size = map.size();
        if (size != 0) {
            if (size == 1) {
                Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                put(entry.getKey(), entry.getValue());
                return;
            }
            throw new IllegalArgumentException("The map size must be 0 or 1");
        }
    }

    @Override // o.InterfaceC9825tp
    public int q() {
        return 1;
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC9825tp
    public boolean s() {
        return true;
    }

    @Override // java.util.Map
    public int size() {
        return 1;
    }

    public String toString() {
        Object key;
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append('{');
        Object obj = "(this Map)";
        if (getKey() == this) {
            key = "(this Map)";
        } else {
            key = getKey();
        }
        stringBuffer.append(key);
        stringBuffer.append('=');
        if (getValue() != this) {
            obj = getValue();
        }
        stringBuffer.append(obj);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // java.util.Map
    public Collection values() {
        return new b(this);
    }

    public H82(Object obj, Object obj2) {
        this.X = obj;
        this.Y = obj2;
    }

    public H82(KX0 kx0) {
        this.X = kx0.getKey();
        this.Y = kx0.getValue();
    }

    public H82(Map.Entry entry) {
        this.X = entry.getKey();
        this.Y = entry.getValue();
    }

    public H82(Map map) {
        if (map.size() == 1) {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            this.X = entry.getKey();
            this.Y = entry.getValue();
            return;
        }
        throw new IllegalArgumentException("The map size must be 1");
    }
}
