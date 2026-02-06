package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
public class V0<K, V> extends AbstractMap<K, V> implements WT0<K, V> {
    public static final String d1 = "No next() entry in the iteration";
    public static final String e1 = "No previous() entry in the iteration";
    public static final String f1 = "remove() can only be called once after next()";
    public static final String g1 = "getKey() can only be called after next() and before remove()";
    public static final String h1 = "getValue() can only be called after next() and before remove()";
    public static final String i1 = "setValue() can only be called after next() and before remove()";
    public static final int j1 = 16;
    public static final int k1 = 12;
    public static final float l1 = 0.75f;
    public static final int m1 = 1073741824;
    public static final Object n1 = new Object();
    public transient float X;
    public transient int Y;
    public transient int Y0;
    public transient c<K, V>[] Z;
    public transient int Z0;
    public transient a<K, V> a1;
    public transient f<K> b1;
    public transient h<V> c1;

    /* loaded from: classes4.dex */
    public static class a<K, V> extends AbstractSet<Map.Entry<K, V>> {
        public final V0<K, V> X;

        public a(V0<K, V> v0) {
            this.X = v0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                c<K, V> z = this.X.z(entry.getKey());
                if (z != null && z.equals(entry)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return this.X.l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry) || !contains(obj)) {
                return false;
            }
            this.X.remove(((Map.Entry) obj).getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.X.size();
        }
    }

    /* loaded from: classes4.dex */
    public static class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>> {
        public b(V0<K, V> v0) {
            super(v0);
        }

        @Override // java.util.Iterator
        /* renamed from: d */
        public Map.Entry<K, V> next() {
            return super.c();
        }
    }

    /* loaded from: classes4.dex */
    public static class c<K, V> implements Map.Entry<K, V>, JX0<K, V> {
        public c<K, V> X;
        public int Y;
        public Object Y0;
        public Object Z;

        public c(c<K, V> cVar, int i, Object obj, V v) {
            this.X = cVar;
            this.Y = i;
            this.Z = obj;
            this.Y0 = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (getKey() != null ? getKey().equals(entry.getKey()) : entry.getKey() == null) {
                if (getValue() != null ? getValue().equals(entry.getValue()) : entry.getValue() == null) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry, o.JX0
        public K getKey() {
            K k = (K) this.Z;
            if (k == V0.n1) {
                return null;
            }
            return k;
        }

        @Override // java.util.Map.Entry, o.JX0
        public V getValue() {
            return (V) this.Y0;
        }

        @Override // java.util.Map.Entry
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

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) this.Y0;
            this.Y0 = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class d<K, V> {
        public final V0<K, V> X;
        public int Y;
        public c<K, V> Y0;
        public c<K, V> Z;
        public int Z0;

        public d(V0<K, V> v0) {
            this.X = v0;
            c<K, V>[] cVarArr = v0.Z;
            int length = cVarArr.length;
            c<K, V> cVar = null;
            while (length > 0 && cVar == null) {
                length--;
                cVar = cVarArr[length];
            }
            this.Y0 = cVar;
            this.Y = length;
            this.Z0 = v0.Z0;
        }

        public c<K, V> b() {
            return this.Z;
        }

        public c<K, V> c() {
            V0<K, V> v0 = this.X;
            if (v0.Z0 == this.Z0) {
                c<K, V> cVar = this.Y0;
                if (cVar != null) {
                    c<K, V>[] cVarArr = v0.Z;
                    int i = this.Y;
                    c<K, V> cVar2 = cVar.X;
                    while (cVar2 == null && i > 0) {
                        i--;
                        cVar2 = cVarArr[i];
                    }
                    this.Y0 = cVar2;
                    this.Y = i;
                    this.Z = cVar;
                    return cVar;
                }
                throw new NoSuchElementException("No next() entry in the iteration");
            }
            throw new ConcurrentModificationException();
        }

        public boolean hasNext() {
            if (this.Y0 != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            c<K, V> cVar = this.Z;
            if (cVar != null) {
                V0<K, V> v0 = this.X;
                if (v0.Z0 == this.Z0) {
                    v0.remove(cVar.getKey());
                    this.Z = null;
                    this.Z0 = this.X.Z0;
                    return;
                }
                throw new ConcurrentModificationException();
            }
            throw new IllegalStateException("remove() can only be called once after next()");
        }

        public String toString() {
            if (this.Z != null) {
                return "Iterator[" + this.Z.getKey() + "=" + this.Z.getValue() + C6566gU0.g;
            }
            return "Iterator[]";
        }
    }

    /* loaded from: classes4.dex */
    public static class e<K, V> extends d<K, V> implements U71<K, V> {
        public e(V0<K, V> v0) {
            super(v0);
        }

        @Override // o.U71
        public K getKey() {
            c<K, V> b = b();
            if (b != null) {
                return b.getKey();
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // o.U71
        public V getValue() {
            c<K, V> b = b();
            if (b != null) {
                return b.getValue();
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // o.U71, java.util.Iterator
        public K next() {
            return super.c().getKey();
        }

        @Override // o.U71
        public V setValue(V v) {
            c<K, V> b = b();
            if (b != null) {
                return b.setValue(v);
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }
    }

    /* loaded from: classes4.dex */
    public static class f<K> extends AbstractSet<K> {
        public final V0<K, ?> X;

        public f(V0<K, ?> v0) {
            this.X = v0;
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
        public Iterator<K> iterator() {
            return this.X.m();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean containsKey = this.X.containsKey(obj);
            this.X.remove(obj);
            return containsKey;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.X.size();
        }
    }

    /* loaded from: classes4.dex */
    public static class g<K> extends d<K, Object> implements Iterator<K> {
        public g(V0<K, ?> v0) {
            super(v0);
        }

        @Override // java.util.Iterator
        public K next() {
            return super.c().getKey();
        }
    }

    /* loaded from: classes4.dex */
    public static class h<V> extends AbstractCollection<V> {
        public final V0<?, V> X;

        public h(V0<?, V> v0) {
            this.X = v0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.X.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return this.X.n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.X.size();
        }
    }

    /* loaded from: classes4.dex */
    public static class i<V> extends d<Object, V> implements Iterator<V> {
        public i(V0<?, V> v0) {
            super(v0);
        }

        @Override // java.util.Iterator
        public V next() {
            return super.c().getValue();
        }
    }

    public V0() {
    }

    public int A(Object obj) {
        int hashCode = obj.hashCode();
        int i2 = hashCode + (~(hashCode << 9));
        int i3 = i2 ^ (i2 >>> 14);
        int i4 = i3 + (i3 << 4);
        return i4 ^ (i4 >>> 10);
    }

    public int B(int i2, int i3) {
        return i2 & (i3 - 1);
    }

    public boolean D(Object obj, Object obj2) {
        if (obj != obj2 && !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public boolean E(Object obj, Object obj2) {
        if (obj != obj2 && !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public void F(c<K, V> cVar, int i2, c<K, V> cVar2) {
        if (cVar2 == null) {
            this.Z[i2] = cVar.X;
        } else {
            cVar2.X = cVar.X;
        }
    }

    public void G(c<K, V> cVar, int i2, c<K, V> cVar2) {
        this.Z0++;
        F(cVar, i2, cVar2);
        this.Y--;
        o(cVar);
    }

    public void H(c<K, V> cVar, int i2, int i3, K k, V v) {
        cVar.X = this.Z[i2];
        cVar.Y = i3;
        cVar.Z = k;
        cVar.Y0 = v;
    }

    public void I(c<K, V> cVar, V v) {
        cVar.setValue(v);
    }

    public final void b(Map<? extends K, ? extends V> map) {
        int size = map.size();
        if (size != 0) {
            u(e((int) (((this.Y + size) / this.X) + 1.0f)));
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void c(c<K, V> cVar, int i2) {
        this.Z[i2] = cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map, o.OK1
    public void clear() {
        this.Z0++;
        c<K, V>[] cVarArr = this.Z;
        for (int length = cVarArr.length - 1; length >= 0; length--) {
            cVarArr[length] = null;
        }
        this.Y = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map, o.UC0
    public boolean containsKey(Object obj) {
        Object j = j(obj);
        int A = A(j);
        c<K, V>[] cVarArr = this.Z;
        for (c<K, V> cVar = cVarArr[B(A, cVarArr.length)]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == A && D(j, cVar.Z)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, o.UC0
    public boolean containsValue(Object obj) {
        c<K, V>[] cVarArr;
        c<K, V>[] cVarArr2;
        if (obj == null) {
            for (c<K, V> cVar : this.Z) {
                for (; cVar != null; cVar = cVar.X) {
                    if (cVar.getValue() == null) {
                        return true;
                    }
                }
            }
        } else {
            for (c<K, V> cVar2 : this.Z) {
                for (; cVar2 != null; cVar2 = cVar2.X) {
                    if (E(obj, cVar2.getValue())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void d(int i2, int i3, K k, V v) {
        this.Z0++;
        c(k(this.Z[i2], i3, k, v), i2);
        this.Y++;
        g();
    }

    public int e(int i2) {
        if (i2 > 1073741824) {
            return 1073741824;
        }
        int i3 = 1;
        while (i3 < i2) {
            i3 <<= 1;
        }
        if (i3 > 1073741824) {
            return 1073741824;
        }
        return i3;
    }

    @Override // java.util.AbstractMap, java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.a1 == null) {
            this.a1 = new a<>(this);
        }
        return this.a1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() != size()) {
            return false;
        }
        U71<K, V> p = p();
        while (p.hasNext()) {
            try {
                K next = p.next();
                V value = p.getValue();
                if (value == null) {
                    if (map.get(next) != null || !map.containsKey(next)) {
                        return false;
                    }
                } else if (!value.equals(map.get(next))) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        return true;
    }

    public int f(int i2, float f2) {
        return (int) (i2 * f2);
    }

    public void g() {
        int length;
        if (this.Y >= this.Y0 && (length = this.Z.length * 2) <= 1073741824) {
            u(length);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, o.UC0
    public V get(Object obj) {
        Object j = j(obj);
        int A = A(j);
        c<K, V>[] cVarArr = this.Z;
        for (c<K, V> cVar = cVarArr[B(A, cVarArr.length)]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == A && D(j, cVar.Z)) {
                return cVar.getValue();
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        Iterator<Map.Entry<K, V>> l = l();
        int i2 = 0;
        while (l.hasNext()) {
            i2 += l.next().hashCode();
        }
        return i2;
    }

    @Override // java.util.AbstractMap
    /* renamed from: i */
    public V0<K, V> clone() {
        try {
            V0<K, V> v0 = (V0) super.clone();
            v0.Z = new c[this.Z.length];
            v0.a1 = null;
            v0.b1 = null;
            v0.c1 = null;
            v0.Z0 = 0;
            v0.Y = 0;
            v0.C();
            v0.putAll(this);
            return v0;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, o.UC0
    public boolean isEmpty() {
        if (this.Y == 0) {
            return true;
        }
        return false;
    }

    public Object j(Object obj) {
        if (obj == null) {
            return n1;
        }
        return obj;
    }

    public c<K, V> k(c<K, V> cVar, int i2, K k, V v) {
        return new c<>(cVar, i2, j(k), v);
    }

    @Override // java.util.AbstractMap, java.util.Map, o.UC0
    public Set<K> keySet() {
        if (this.b1 == null) {
            this.b1 = new f<>(this);
        }
        return this.b1;
    }

    public Iterator<Map.Entry<K, V>> l() {
        if (size() == 0) {
            return C4579Wa0.b();
        }
        return new b(this);
    }

    public Iterator<K> m() {
        if (size() == 0) {
            return C4579Wa0.b();
        }
        return new g(this);
    }

    public Iterator<V> n() {
        if (size() == 0) {
            return C4579Wa0.b();
        }
        return new i(this);
    }

    public void o(c<K, V> cVar) {
        cVar.X = null;
        cVar.Z = null;
        cVar.Y0 = null;
    }

    public U71<K, V> p() {
        if (this.Y == 0) {
            return C5605cb0.b();
        }
        return new e(this);
    }

    @Override // java.util.AbstractMap, java.util.Map, o.OK1
    public V put(K k, V v) {
        Object j = j(k);
        int A = A(j);
        int B = B(A, this.Z.length);
        for (c<K, V> cVar = this.Z[B]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == A && D(j, cVar.Z)) {
                V value = cVar.getValue();
                I(cVar, v);
                return value;
            }
        }
        d(B, A, k, v);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        b(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.X = objectInputStream.readFloat();
        int readInt = objectInputStream.readInt();
        int readInt2 = objectInputStream.readInt();
        C();
        this.Y0 = f(readInt, this.X);
        this.Z = new c[readInt];
        for (int i2 = 0; i2 < readInt2; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, o.UC0
    public V remove(Object obj) {
        Object j = j(obj);
        int A = A(j);
        int B = B(A, this.Z.length);
        c<K, V> cVar = null;
        for (c<K, V> cVar2 = this.Z[B]; cVar2 != null; cVar2 = cVar2.X) {
            if (cVar2.Y == A && D(j, cVar2.Z)) {
                V value = cVar2.getValue();
                G(cVar2, B, cVar);
                return value;
            }
            cVar = cVar2;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, o.UC0
    public int size() {
        return this.Y;
    }

    public void t(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeFloat(this.X);
        objectOutputStream.writeInt(this.Z.length);
        objectOutputStream.writeInt(this.Y);
        U71<K, V> p = p();
        while (p.hasNext()) {
            objectOutputStream.writeObject(p.next());
            objectOutputStream.writeObject(p.getValue());
        }
    }

    @Override // java.util.AbstractMap
    public String toString() {
        if (size() == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(size() * 32);
        sb.append('{');
        U71<K, V> p = p();
        boolean hasNext = p.hasNext();
        while (hasNext) {
            K next = p.next();
            V value = p.getValue();
            if (next == this) {
                next = "(this Map)";
            }
            sb.append(next);
            sb.append('=');
            if (value == this) {
                value = "(this Map)";
            }
            sb.append(value);
            hasNext = p.hasNext();
            if (hasNext) {
                sb.append(',');
                sb.append(' ');
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void u(int i2) {
        c<K, V>[] cVarArr = this.Z;
        int length = cVarArr.length;
        if (i2 <= length) {
            return;
        }
        if (this.Y == 0) {
            this.Y0 = f(i2, this.X);
            this.Z = new c[i2];
            return;
        }
        c<K, V>[] cVarArr2 = new c[i2];
        this.Z0++;
        for (int i3 = length - 1; i3 >= 0; i3--) {
            c<K, V> cVar = cVarArr[i3];
            if (cVar != null) {
                cVarArr[i3] = null;
                while (true) {
                    c<K, V> cVar2 = cVar.X;
                    int B = B(cVar.Y, i2);
                    cVar.X = cVarArr2[B];
                    cVarArr2[B] = cVar;
                    if (cVar2 == null) {
                        break;
                    }
                    cVar = cVar2;
                }
            }
        }
        this.Y0 = f(i2, this.X);
        this.Z = cVarArr2;
    }

    public int v(c<K, V> cVar) {
        return cVar.Y;
    }

    @Override // java.util.AbstractMap, java.util.Map, o.UC0
    public Collection<V> values() {
        if (this.c1 == null) {
            this.c1 = new h<>(this);
        }
        return this.c1;
    }

    public K w(c<K, V> cVar) {
        return cVar.getKey();
    }

    public c<K, V> x(c<K, V> cVar) {
        return cVar.X;
    }

    public V y(c<K, V> cVar) {
        return cVar.getValue();
    }

    public c<K, V> z(Object obj) {
        Object j = j(obj);
        int A = A(j);
        c<K, V>[] cVarArr = this.Z;
        for (c<K, V> cVar = cVarArr[B(A, cVarArr.length)]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == A && D(j, cVar.Z)) {
                return cVar;
            }
        }
        return null;
    }

    public V0(int i2, float f2, int i3) {
        this.X = f2;
        this.Z = new c[i2];
        this.Y0 = i3;
        C();
    }

    public V0(int i2) {
        this(i2, 0.75f);
    }

    public V0(int i2, float f2) {
        if (i2 >= 0) {
            if (f2 > 0.0f && !Float.isNaN(f2)) {
                this.X = f2;
                int e2 = e(i2);
                this.Y0 = f(e2, f2);
                this.Z = new c[e2];
                C();
                return;
            }
            throw new IllegalArgumentException("Load factor must be greater than 0");
        }
        throw new IllegalArgumentException("Initial capacity must be a non negative number");
    }

    public V0(Map<? extends K, ? extends V> map) {
        this(Math.max(map.size() * 2, 16), 0.75f);
        b(map);
    }

    public void C() {
    }
}
