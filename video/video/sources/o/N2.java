package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o.V0;

/* loaded from: classes4.dex */
public abstract class N2<K, V> extends V0<K, V> {
    public h o1;
    public h p1;
    public boolean q1;
    public transient ReferenceQueue<Object> r1;

    /* loaded from: classes4.dex */
    public static class a<K, V> {
        public final N2<K, V> X;
        public int Y;
        public b<K, V> Y0;
        public b<K, V> Z;
        public K Z0;
        public K a1;
        public V b1;
        public V c1;
        public int d1;

        public a(N2<K, V> n2) {
            int i;
            this.X = n2;
            if (n2.size() != 0) {
                i = n2.Z.length;
            } else {
                i = 0;
            }
            this.Y = i;
            this.d1 = n2.Z0;
        }

        public final void b() {
            if (this.X.Z0 == this.d1) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        public b<K, V> c() {
            b();
            return this.Y0;
        }

        public b<K, V> d() {
            b();
            if (e() && !hasNext()) {
                throw new NoSuchElementException();
            }
            b<K, V> bVar = this.Z;
            this.Y0 = bVar;
            this.Z = bVar.a();
            this.Z0 = this.a1;
            this.b1 = this.c1;
            this.a1 = null;
            this.c1 = null;
            return this.Y0;
        }

        public final boolean e() {
            if (this.a1 != null && this.c1 != null) {
                return false;
            }
            return true;
        }

        public boolean hasNext() {
            b();
            while (e()) {
                b<K, V> bVar = this.Z;
                int i = this.Y;
                while (bVar == null && i > 0) {
                    i--;
                    bVar = (b) this.X.Z[i];
                }
                this.Z = bVar;
                this.Y = i;
                if (bVar == null) {
                    this.Z0 = null;
                    this.b1 = null;
                    return false;
                }
                this.a1 = bVar.getKey();
                this.c1 = bVar.getValue();
                if (e()) {
                    this.Z = this.Z.a();
                }
            }
            return true;
        }

        public void remove() {
            b();
            if (this.Y0 != null) {
                this.X.remove(this.Z0);
                this.Y0 = null;
                this.Z0 = null;
                this.b1 = null;
                this.d1 = this.X.Z0;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes4.dex */
    public static class c<K, V> extends V0.a<K, V> {
        public c(V0<K, V> v0) {
            super(v0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return toArray(new Object[size()]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList(size());
            Iterator<Map.Entry<K, V>> it = iterator();
            while (it.hasNext()) {
                arrayList.add(new EZ(it.next()));
            }
            return (T[]) arrayList.toArray(tArr);
        }
    }

    /* loaded from: classes4.dex */
    public static class d<K, V> extends a<K, V> implements Iterator<Map.Entry<K, V>> {
        public d(N2<K, V> n2) {
            super(n2);
        }

        @Override // java.util.Iterator
        /* renamed from: f */
        public Map.Entry<K, V> next() {
            return d();
        }
    }

    /* loaded from: classes4.dex */
    public static class e<K> extends V0.f<K> {
        public e(V0<K, ?> v0) {
            super(v0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return toArray(new Object[size()]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList(size());
            Iterator<K> it = iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            return (T[]) arrayList.toArray(tArr);
        }
    }

    /* loaded from: classes4.dex */
    public static class f<K> extends a<K, Object> implements Iterator<K> {
        public f(N2<K, ?> n2) {
            super(n2);
        }

        @Override // java.util.Iterator
        public K next() {
            return d().getKey();
        }
    }

    /* loaded from: classes4.dex */
    public static class g<K, V> extends a<K, V> implements U71<K, V> {
        public g(N2<K, V> n2) {
            super(n2);
        }

        @Override // o.U71
        public K getKey() {
            b<K, V> c = c();
            if (c != null) {
                return c.getKey();
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // o.U71
        public V getValue() {
            b<K, V> c = c();
            if (c != null) {
                return c.getValue();
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // o.U71, java.util.Iterator
        public K next() {
            return d().getKey();
        }

        @Override // o.U71
        public V setValue(V v) {
            b<K, V> c = c();
            if (c != null) {
                return c.setValue(v);
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }
    }

    /* loaded from: classes4.dex */
    public enum h {
        HARD(0),
        SOFT(1),
        WEAK(2);
        
        public final int X;

        h(int i) {
            this.X = i;
        }

        public static h e(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return WEAK;
                    }
                    throw new IllegalArgumentException();
                }
                return SOFT;
            }
            return HARD;
        }
    }

    /* loaded from: classes4.dex */
    public static class i<V> extends V0.h<V> {
        public i(V0<?, V> v0) {
            super(v0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return toArray(new Object[size()]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList(size());
            Iterator<V> it = iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            return (T[]) arrayList.toArray(tArr);
        }
    }

    /* loaded from: classes4.dex */
    public static class j<V> extends a<Object, V> implements Iterator<V> {
        public j(N2<?, V> n2) {
            super(n2);
        }

        @Override // java.util.Iterator
        public V next() {
            return d().getValue();
        }
    }

    /* loaded from: classes4.dex */
    public static class k<T> extends SoftReference<T> {
        public final int a;

        public k(int i, T t, ReferenceQueue<? super T> referenceQueue) {
            super(t, referenceQueue);
            this.a = i;
        }

        public int hashCode() {
            return this.a;
        }
    }

    /* loaded from: classes4.dex */
    public static class l<T> extends WeakReference<T> {
        public final int a;

        public l(int i, T t, ReferenceQueue<? super T> referenceQueue) {
            super(t, referenceQueue);
            this.a = i;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public N2() {
    }

    @Override // o.V0
    public void C() {
        this.r1 = new ReferenceQueue<>();
    }

    @Override // o.V0
    public boolean D(Object obj, Object obj2) {
        if (this.o1 != h.HARD) {
            obj2 = ((Reference) obj2).get();
        }
        if (obj != obj2 && !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    @Override // o.V0
    /* renamed from: O */
    public b<K, V> k(V0.c<K, V> cVar, int i2, K k2, V v) {
        return new b<>(this, cVar, i2, k2, v);
    }

    public int P(Object obj, Object obj2) {
        int hashCode;
        int i2 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return hashCode ^ i2;
    }

    public boolean Q(h hVar) {
        if (this.o1 == hVar) {
            return true;
        }
        return false;
    }

    public boolean R(h hVar) {
        if (this.p1 == hVar) {
            return true;
        }
        return false;
    }

    public void S() {
        Reference<? extends Object> poll = this.r1.poll();
        while (poll != null) {
            T(poll);
            poll = this.r1.poll();
        }
    }

    public void T(Reference<?> reference) {
        int B = B(reference.hashCode(), this.Z.length);
        V0.c<K, V> cVar = null;
        for (V0.c<K, V> cVar2 = this.Z[B]; cVar2 != null; cVar2 = cVar2.X) {
            b bVar = (b) cVar2;
            if (bVar.d(reference)) {
                if (cVar == null) {
                    this.Z[B] = cVar2.X;
                } else {
                    cVar.X = cVar2.X;
                }
                this.Y--;
                bVar.c();
                return;
            }
            cVar = cVar2;
        }
    }

    public void W() {
        S();
    }

    public void X() {
        S();
    }

    @Override // o.V0, java.util.AbstractMap, java.util.Map, o.OK1
    public void clear() {
        super.clear();
        do {
        } while (this.r1.poll() != null);
    }

    @Override // o.V0, java.util.AbstractMap, java.util.Map, o.UC0
    public boolean containsKey(Object obj) {
        W();
        V0.c<K, V> z = z(obj);
        if (z == null || z.getValue() == null) {
            return false;
        }
        return true;
    }

    @Override // o.V0, java.util.AbstractMap, java.util.Map, o.UC0
    public boolean containsValue(Object obj) {
        W();
        if (obj == null) {
            return false;
        }
        return super.containsValue(obj);
    }

    @Override // o.V0, java.util.AbstractMap, java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.a1 == null) {
            this.a1 = new c(this);
        }
        return this.a1;
    }

    @Override // o.V0, java.util.AbstractMap, java.util.Map, o.UC0
    public V get(Object obj) {
        W();
        V0.c<K, V> z = z(obj);
        if (z == null) {
            return null;
        }
        return z.getValue();
    }

    @Override // o.V0, java.util.AbstractMap, java.util.Map, o.UC0
    public boolean isEmpty() {
        W();
        return super.isEmpty();
    }

    @Override // o.V0, java.util.AbstractMap, java.util.Map, o.UC0
    public Set<K> keySet() {
        if (this.b1 == null) {
            this.b1 = new e(this);
        }
        return this.b1;
    }

    @Override // o.V0
    public Iterator<Map.Entry<K, V>> l() {
        return new d(this);
    }

    @Override // o.V0
    public Iterator<K> m() {
        return new f(this);
    }

    @Override // o.V0
    public Iterator<V> n() {
        return new j(this);
    }

    @Override // o.V0, o.VT0
    public U71<K, V> p() {
        return new g(this);
    }

    @Override // o.V0, java.util.AbstractMap, java.util.Map, o.OK1
    public V put(K k2, V v) {
        if (k2 != null) {
            if (v != null) {
                X();
                return (V) super.put(k2, v);
            }
            throw new NullPointerException("null values not allowed");
        }
        throw new NullPointerException("null keys not allowed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.V0
    public void r(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.o1 = h.e(objectInputStream.readInt());
        this.p1 = h.e(objectInputStream.readInt());
        this.q1 = objectInputStream.readBoolean();
        this.X = objectInputStream.readFloat();
        int readInt = objectInputStream.readInt();
        C();
        V0.c<K, V>[] cVarArr = new V0.c[readInt];
        this.Z = cVarArr;
        this.Y0 = f(cVarArr.length, this.X);
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject == null) {
                return;
            }
            put(readObject, objectInputStream.readObject());
        }
    }

    @Override // o.V0, java.util.AbstractMap, java.util.Map, o.UC0
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        X();
        return (V) super.remove(obj);
    }

    @Override // o.V0, java.util.AbstractMap, java.util.Map, o.UC0
    public int size() {
        W();
        return super.size();
    }

    @Override // o.V0
    public void t(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.o1.X);
        objectOutputStream.writeInt(this.p1.X);
        objectOutputStream.writeBoolean(this.q1);
        objectOutputStream.writeFloat(this.X);
        objectOutputStream.writeInt(this.Z.length);
        U71<K, V> p = p();
        while (p.hasNext()) {
            objectOutputStream.writeObject(p.next());
            objectOutputStream.writeObject(p.getValue());
        }
        objectOutputStream.writeObject(null);
    }

    @Override // o.V0, java.util.AbstractMap, java.util.Map, o.UC0
    public Collection<V> values() {
        if (this.c1 == null) {
            this.c1 = new i(this);
        }
        return this.c1;
    }

    @Override // o.V0
    public V0.c<K, V> z(Object obj) {
        if (obj == null) {
            return null;
        }
        return super.z(obj);
    }

    public N2(h hVar, h hVar2, int i2, float f2, boolean z) {
        super(i2, f2);
        this.o1 = hVar;
        this.p1 = hVar2;
        this.q1 = z;
    }

    /* loaded from: classes4.dex */
    public static class b<K, V> extends V0.c<K, V> {
        public final N2<K, V> Z0;

        public b(N2<K, V> n2, V0.c<K, V> cVar, int i, K k, V v) {
            super(cVar, i, null, null);
            this.Z0 = n2;
            this.Z = e(n2.o1, k, i);
            this.Y0 = e(n2.p1, v, i);
        }

        public b<K, V> a() {
            return (b) this.X;
        }

        public void b() {
            this.Y0 = null;
        }

        public boolean d(Reference<?> reference) {
            boolean z;
            h hVar = this.Z0.o1;
            h hVar2 = h.HARD;
            if ((hVar != hVar2 && this.Z == reference) || (this.Z0.p1 != hVar2 && this.Y0 == reference)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.Z0.o1 != hVar2) {
                    ((Reference) this.Z).clear();
                }
                if (this.Z0.p1 != hVar2) {
                    ((Reference) this.Y0).clear();
                    return z;
                } else if (this.Z0.q1) {
                    b();
                }
            }
            return z;
        }

        public <T> Object e(h hVar, T t, int i) {
            if (hVar == h.HARD) {
                return t;
            }
            if (hVar == h.SOFT) {
                return new k(i, t, this.Z0.r1);
            }
            if (hVar == h.WEAK) {
                return new l(i, t, this.Z0.r1);
            }
            throw new Error();
        }

        @Override // o.V0.c, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null && this.Z0.D(key, this.Z) && this.Z0.E(value, getValue())) {
                return true;
            }
            return false;
        }

        @Override // o.V0.c, java.util.Map.Entry, o.JX0
        public K getKey() {
            if (this.Z0.o1 == h.HARD) {
                return (K) this.Z;
            }
            return (K) ((Reference) this.Z).get();
        }

        @Override // o.V0.c, java.util.Map.Entry, o.JX0
        public V getValue() {
            if (this.Z0.p1 == h.HARD) {
                return (V) this.Y0;
            }
            return (V) ((Reference) this.Y0).get();
        }

        @Override // o.V0.c, java.util.Map.Entry
        public int hashCode() {
            return this.Z0.P(getKey(), getValue());
        }

        @Override // o.V0.c, java.util.Map.Entry
        public V setValue(V v) {
            V value = getValue();
            if (this.Z0.p1 != h.HARD) {
                ((Reference) this.Y0).clear();
            }
            this.Y0 = e(this.Z0.p1, v, this.Y);
            return value;
        }

        public void c() {
        }
    }
}
