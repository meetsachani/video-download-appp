package o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import o.V0;

/* renamed from: o.p1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8653p1<K, V> extends V0<K, V> implements InterfaceC9369rw1<K, V> {
    public transient c<K, V> o1;

    /* renamed from: o.p1$a */
    /* loaded from: classes4.dex */
    public static class a<K, V> extends d<K, V> implements InterfaceC8877pw1<Map.Entry<K, V>>, MS1<Map.Entry<K, V>> {
        public a(AbstractC8653p1<K, V> abstractC8653p1) {
            super(abstractC8653p1);
        }

        @Override // java.util.Iterator
        /* renamed from: e */
        public Map.Entry<K, V> next() {
            return super.c();
        }

        @Override // o.InterfaceC8877pw1
        /* renamed from: f */
        public Map.Entry<K, V> previous() {
            return super.d();
        }
    }

    /* renamed from: o.p1$b */
    /* loaded from: classes4.dex */
    public static class b<K> extends d<K, Object> implements InterfaceC8877pw1<K>, MS1<K> {
        public b(AbstractC8653p1<K, ?> abstractC8653p1) {
            super(abstractC8653p1);
        }

        @Override // java.util.Iterator
        public K next() {
            return super.c().getKey();
        }

        @Override // o.InterfaceC8877pw1
        public K previous() {
            return super.d().getKey();
        }
    }

    /* renamed from: o.p1$c */
    /* loaded from: classes4.dex */
    public static class c<K, V> extends V0.c<K, V> {
        public c<K, V> Z0;
        public c<K, V> a1;

        public c(V0.c<K, V> cVar, int i, Object obj, V v) {
            super(cVar, i, obj, v);
        }
    }

    /* renamed from: o.p1$d */
    /* loaded from: classes4.dex */
    public static abstract class d<K, V> {
        public final AbstractC8653p1<K, V> X;
        public c<K, V> Y;
        public int Y0;
        public c<K, V> Z;

        public d(AbstractC8653p1<K, V> abstractC8653p1) {
            this.X = abstractC8653p1;
            this.Z = abstractC8653p1.o1.a1;
            this.Y0 = abstractC8653p1.Z0;
        }

        public c<K, V> b() {
            return this.Y;
        }

        public c<K, V> c() {
            AbstractC8653p1<K, V> abstractC8653p1 = this.X;
            if (abstractC8653p1.Z0 == this.Y0) {
                c<K, V> cVar = this.Z;
                if (cVar != abstractC8653p1.o1) {
                    this.Y = cVar;
                    this.Z = cVar.a1;
                    return cVar;
                }
                throw new NoSuchElementException("No next() entry in the iteration");
            }
            throw new ConcurrentModificationException();
        }

        public c<K, V> d() {
            AbstractC8653p1<K, V> abstractC8653p1 = this.X;
            if (abstractC8653p1.Z0 == this.Y0) {
                c<K, V> cVar = this.Z.Z0;
                if (cVar != abstractC8653p1.o1) {
                    this.Z = cVar;
                    this.Y = cVar;
                    return cVar;
                }
                throw new NoSuchElementException("No previous() entry in the iteration");
            }
            throw new ConcurrentModificationException();
        }

        public boolean hasNext() {
            if (this.Z != this.X.o1) {
                return true;
            }
            return false;
        }

        public boolean hasPrevious() {
            if (this.Z.Z0 != this.X.o1) {
                return true;
            }
            return false;
        }

        public void remove() {
            c<K, V> cVar = this.Y;
            if (cVar != null) {
                AbstractC8653p1<K, V> abstractC8653p1 = this.X;
                if (abstractC8653p1.Z0 == this.Y0) {
                    abstractC8653p1.remove(cVar.getKey());
                    this.Y = null;
                    this.Y0 = this.X.Z0;
                    return;
                }
                throw new ConcurrentModificationException();
            }
            throw new IllegalStateException("remove() can only be called once after next()");
        }

        public void reset() {
            this.Y = null;
            this.Z = this.X.o1.a1;
        }

        public String toString() {
            if (this.Y != null) {
                return "Iterator[" + this.Y.getKey() + "=" + this.Y.getValue() + C6566gU0.g;
            }
            return "Iterator[]";
        }
    }

    /* renamed from: o.p1$e */
    /* loaded from: classes4.dex */
    public static class e<K, V> extends d<K, V> implements InterfaceC9855tw1<K, V>, MS1<K> {
        public e(AbstractC8653p1<K, V> abstractC8653p1) {
            super(abstractC8653p1);
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

        @Override // o.InterfaceC9855tw1, o.InterfaceC8877pw1
        public K previous() {
            return super.d().getKey();
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

    /* renamed from: o.p1$f */
    /* loaded from: classes4.dex */
    public static class f<V> extends d<Object, V> implements InterfaceC8877pw1<V>, MS1<V> {
        public f(AbstractC8653p1<?, V> abstractC8653p1) {
            super(abstractC8653p1);
        }

        @Override // java.util.Iterator
        public V next() {
            return super.c().getValue();
        }

        @Override // o.InterfaceC8877pw1
        public V previous() {
            return super.d().getValue();
        }
    }

    public AbstractC8653p1() {
    }

    @Override // o.V0
    public void C() {
        c<K, V> k = k(null, -1, null, null);
        this.o1 = k;
        k.a1 = k;
        k.Z0 = k;
    }

    @Override // o.V0
    public void F(V0.c<K, V> cVar, int i, V0.c<K, V> cVar2) {
        c cVar3 = (c) cVar;
        c<K, V> cVar4 = cVar3.Z0;
        cVar4.a1 = cVar3.a1;
        cVar3.a1.Z0 = cVar4;
        cVar3.a1 = null;
        cVar3.Z0 = null;
        super.F(cVar, i, cVar2);
    }

    @Override // o.V0
    /* renamed from: J */
    public c<K, V> k(V0.c<K, V> cVar, int i, K k, V v) {
        return new c<>(cVar, i, j(k), v);
    }

    public c<K, V> K(c<K, V> cVar) {
        return cVar.a1;
    }

    public c<K, V> L(c<K, V> cVar) {
        return cVar.Z0;
    }

    public c<K, V> N(int i) {
        if (i >= 0) {
            int i2 = this.Y;
            if (i < i2) {
                if (i < i2 / 2) {
                    c<K, V> cVar = this.o1.a1;
                    for (int i3 = 0; i3 < i; i3++) {
                        cVar = cVar.a1;
                    }
                    return cVar;
                }
                c<K, V> cVar2 = this.o1;
                while (i2 > i) {
                    cVar2 = cVar2.Z0;
                    i2--;
                }
                return cVar2;
            }
            throw new IndexOutOfBoundsException("Index " + i + " is invalid for size " + this.Y);
        }
        throw new IndexOutOfBoundsException("Index " + i + " is less than zero");
    }

    @Override // o.V0
    /* renamed from: O */
    public c<K, V> z(Object obj) {
        return (c) super.z(obj);
    }

    @Override // o.V0
    public void c(V0.c<K, V> cVar, int i) {
        c<K, V> cVar2 = (c) cVar;
        c<K, V> cVar3 = this.o1;
        cVar2.a1 = cVar3;
        cVar2.Z0 = cVar3.Z0;
        cVar3.Z0.a1 = cVar2;
        cVar3.Z0 = cVar2;
        this.Z[i] = cVar2;
    }

    @Override // o.V0, java.util.AbstractMap, java.util.Map, o.OK1
    public void clear() {
        super.clear();
        c<K, V> cVar = this.o1;
        cVar.a1 = cVar;
        cVar.Z0 = cVar;
    }

    @Override // o.V0, java.util.AbstractMap, java.util.Map, o.UC0
    public boolean containsValue(Object obj) {
        if (obj == null) {
            c<K, V> cVar = this.o1;
            do {
                cVar = cVar.a1;
                if (cVar == this.o1) {
                    return false;
                }
            } while (cVar.getValue() != null);
            return true;
        }
        c<K, V> cVar2 = this.o1;
        do {
            cVar2 = cVar2.a1;
            if (cVar2 == this.o1) {
                return false;
            }
        } while (!E(obj, cVar2.getValue()));
        return true;
    }

    @Override // o.InterfaceC9369rw1
    public K firstKey() {
        if (this.Y != 0) {
            return this.o1.a1.getKey();
        }
        throw new NoSuchElementException("Map is empty");
    }

    @Override // o.InterfaceC9369rw1
    public K j0(Object obj) {
        c<K, V> cVar;
        c<K, V> z = z(obj);
        if (z != null && (cVar = z.Z0) != this.o1) {
            return cVar.getKey();
        }
        return null;
    }

    @Override // o.V0
    public Iterator<Map.Entry<K, V>> l() {
        if (size() == 0) {
            return C6333fb0.b();
        }
        return new a(this);
    }

    @Override // o.InterfaceC9369rw1
    public K lastKey() {
        if (this.Y != 0) {
            return this.o1.Z0.getKey();
        }
        throw new NoSuchElementException("Map is empty");
    }

    @Override // o.V0
    public Iterator<K> m() {
        if (size() == 0) {
            return C6333fb0.b();
        }
        return new b(this);
    }

    @Override // o.V0
    public Iterator<V> n() {
        if (size() == 0) {
            return C6333fb0.b();
        }
        return new f(this);
    }

    @Override // o.InterfaceC9369rw1
    public K n0(Object obj) {
        c<K, V> cVar;
        c<K, V> z = z(obj);
        if (z != null && (cVar = z.a1) != this.o1) {
            return cVar.getKey();
        }
        return null;
    }

    public AbstractC8653p1(int i, float f2, int i2) {
        super(i, f2, i2);
    }

    @Override // o.V0, o.VT0
    public InterfaceC9855tw1<K, V> p() {
        if (this.Y == 0) {
            return C6831hb0.b();
        }
        return new e(this);
    }

    public AbstractC8653p1(int i) {
        super(i);
    }

    public AbstractC8653p1(int i, float f2) {
        super(i, f2);
    }

    public AbstractC8653p1(Map<? extends K, ? extends V> map) {
        super(map);
    }
}
