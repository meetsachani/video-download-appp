package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import o.Z;

/* loaded from: classes4.dex */
public abstract class E2<K, V> extends Z<K, V> {
    private static final long serialVersionUID = 5155253417231339498L;
    public transient j<K, V> Y;
    public volatile transient Collection<V> Y0;
    public volatile transient Set<K> Z;
    public volatile transient Set<Map.Entry<K, V>> Z0;
    public transient int a1;
    public transient int b1;

    /* loaded from: classes4.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes4.dex */
        public class a extends E2<K, V>.k<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: d */
            public Map.Entry<K, V> next() {
                return c();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            E2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            j<K, V> t;
            if (!(obj instanceof Map.Entry) || (t = E2.this.t(((Map.Entry) obj).getKey())) == null || !t.equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry) || !contains(obj)) {
                return false;
            }
            E2.this.remove(((Map.Entry) obj).getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return E2.this.size();
        }
    }

    /* loaded from: classes4.dex */
    public class c extends AbstractSet<K> {

        /* loaded from: classes4.dex */
        public class a extends E2<K, V>.k<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return c().getKey();
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            E2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return E2.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size = size();
            E2.this.remove(obj);
            if (size != size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return E2.this.size();
        }
    }

    /* loaded from: classes4.dex */
    public final class d extends E2<K, V>.g {
        public final E2<K, V>.e Z0;
        public j<K, V> a1;
        public int b1;

        /* loaded from: classes4.dex */
        public final class a extends E2<K, V>.k<Map.Entry<K, V>> {
            public final K Z0;
            public final int a1;
            public final int b1;
            public boolean c1;
            public j<K, V> d1;

            public a(j<K, V> jVar, K k, int i, int i2) {
                super();
                this.d1 = jVar;
                this.Y = E2.this.o(jVar);
                this.Z0 = k;
                this.a1 = i;
                this.b1 = i2;
            }

            @Override // o.E2.k
            public j<K, V> b(j<K, V> jVar) {
                return E2.this.E(jVar, this.d1);
            }

            @Override // java.util.Iterator
            /* renamed from: d */
            public Map.Entry<K, V> next() {
                j<K, V> c = c();
                if (this.c1) {
                    this.Y = null;
                }
                return c;
            }

            @Override // o.E2.k, java.util.Iterator
            public void remove() {
                boolean z;
                j<K, V> jVar = this.d1;
                int i = jVar.Z;
                if (this.Z == jVar) {
                    z = true;
                } else {
                    z = false;
                }
                super.remove();
                if (i != this.d1.Z || z) {
                    this.d1 = E2.this.O(this.Z0, this.a1, this.b1);
                }
                if (this.b1 >= this.d1.Z) {
                    this.c1 = true;
                }
            }
        }

        /* loaded from: classes4.dex */
        public final class b implements Iterator<Map.Entry<K, V>> {
            public final j<K, V> X;
            public int Y = 0;

            public b(j<K, V> jVar) {
                this.X = jVar;
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> next() {
                int i = this.Y;
                if (i == 0) {
                    this.Y = i + 1;
                    return this.X;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.Y == 0) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public void remove() {
                int i = this.Y;
                if (i == 1) {
                    this.Y = i + 1;
                    E2.this.G(this.X);
                    return;
                }
                throw new IllegalStateException();
            }
        }

        public d(E2<K, V>.e eVar) {
            super(eVar);
            this.b1 = 0;
            this.Z0 = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.E2.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            E2 e2 = E2.this;
            if (e2.b1 != this.b1) {
                this.a1 = e2.O(this.Z0.Z, this.Z0.Y0, this.Z0.Z0);
                this.b1 = E2.this.b1;
            }
            if (this.a1 != null) {
                int i = this.Z0.Z0;
                j<K, V> jVar = this.a1;
                if (i > jVar.Z) {
                    return new b(jVar);
                }
                return new a(jVar, this.Z0.Z, this.Z0.Y0, this.Z0.Z0);
            }
            return Collections.EMPTY_SET.iterator();
        }

        @Override // o.E2.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.Z0.r();
        }
    }

    /* loaded from: classes4.dex */
    public class e extends E2<K, V>.h {
        public final int Y0;
        public final K Z;
        public final int Z0;
        public K a1;
        public K b1;
        public transient int c1;
        public int d1;

        @Override // o.E2.h
        public Set<Map.Entry<K, V>> a() {
            return new d(this);
        }

        @Override // o.E2.h
        public SortedMap<K, V> b(K k, boolean z, K k2, boolean z2) {
            return new f(k, z, k2, z2);
        }

        @Override // o.E2.h
        public K c() {
            return this.a1;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterator<Map.Entry<K, V>> it = E2.this.entrySet().iterator();
            Set<K> keySet = keySet();
            while (it.hasNext()) {
                if (keySet.contains(it.next().getKey())) {
                    it.remove();
                }
            }
        }

        @Override // o.E2.h
        public K d() {
            return this.b1;
        }

        @Override // o.E2.h
        public boolean e(K k, boolean z) {
            return E2.this.f().g((K) this.Z, this.Y0, this.Z0, k);
        }

        @Override // o.E2.h
        public boolean f(K k) {
            return E2.this.f().g((K) this.Z, this.Y0, this.Z0, k);
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            j<K, V> w;
            K k;
            r();
            K k2 = this.a1;
            if (k2 == null) {
                w = E2.this.m();
            } else {
                w = E2.this.w(k2);
            }
            if (w != null) {
                k = w.getKey();
            } else {
                k = null;
            }
            if (w != null && E2.this.f().g((K) this.Z, this.Y0, this.Z0, k)) {
                return k;
            }
            throw new NoSuchElementException();
        }

        @Override // o.E2.h
        public boolean g(K k) {
            return f(k);
        }

        @Override // o.E2.h
        public boolean i(K k, boolean z) {
            return E2.this.f().g((K) this.Z, this.Y0, this.Z0, k);
        }

        @Override // o.E2.h
        public boolean j() {
            return false;
        }

        @Override // o.E2.h
        public boolean k() {
            return false;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            j<K, V> B;
            K k;
            r();
            K k2 = this.b1;
            if (k2 == null) {
                B = E2.this.A();
            } else {
                B = E2.this.B(k2);
            }
            if (B != null) {
                k = B.getKey();
            } else {
                k = null;
            }
            if (B != null && E2.this.f().g((K) this.Z, this.Y0, this.Z0, k)) {
                return k;
            }
            throw new NoSuchElementException();
        }

        public final int r() {
            Map.Entry<K, V> entry;
            K key;
            K key2;
            K key3;
            if (this.d1 == -1 || E2.this.b1 != this.c1) {
                Iterator<Map.Entry<K, V>> it = super.entrySet().iterator();
                this.d1 = 0;
                K k = null;
                if (it.hasNext()) {
                    entry = it.next();
                    this.d1 = 1;
                } else {
                    entry = null;
                }
                if (entry == null) {
                    key = null;
                } else {
                    key = entry.getKey();
                }
                this.a1 = key;
                if (key != null) {
                    j<K, V> F = E2.this.F((j) entry);
                    if (F == null) {
                        key3 = null;
                    } else {
                        key3 = F.getKey();
                    }
                    this.a1 = key3;
                }
                this.b1 = this.a1;
                while (it.hasNext()) {
                    this.d1++;
                    entry = it.next();
                }
                if (entry == null) {
                    key2 = null;
                } else {
                    key2 = entry.getKey();
                }
                this.b1 = key2;
                if (key2 != null) {
                    j<K, V> C = E2.this.C((j) entry);
                    if (C != null) {
                        k = C.getKey();
                    }
                    this.b1 = k;
                }
                this.c1 = E2.this.b1;
            }
            return this.d1;
        }

        public e(K k, int i, int i2) {
            super();
            this.a1 = null;
            this.b1 = null;
            this.c1 = 0;
            this.d1 = -1;
            this.Z = k;
            this.Y0 = i;
            this.Z0 = i2;
        }
    }

    /* loaded from: classes4.dex */
    public class f extends E2<K, V>.h {
        public final K Y0;
        public final K Z;
        public final boolean Z0;
        public final boolean a1;

        public f(E2 e2, K k, K k2) {
            this(k, true, k2, false);
        }

        @Override // o.E2.h
        public Set<Map.Entry<K, V>> a() {
            return new g(this);
        }

        @Override // o.E2.h
        public SortedMap<K, V> b(K k, boolean z, K k2, boolean z2) {
            return new f(k, z, k2, z2);
        }

        @Override // o.E2.h
        public K c() {
            return this.Z;
        }

        @Override // o.E2.h
        public K d() {
            return this.Y0;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            j<K, V> w;
            K k;
            K k2 = this.Z;
            if (k2 == null) {
                w = E2.this.m();
            } else if (this.Z0) {
                w = E2.this.k(k2);
            } else {
                w = E2.this.w(k2);
            }
            if (w != null) {
                k = w.getKey();
            } else {
                k = null;
            }
            if (w != null && (this.Y0 == null || i(k, false))) {
                return k;
            }
            throw new NoSuchElementException();
        }

        @Override // o.E2.h
        public boolean j() {
            return this.Z0;
        }

        @Override // o.E2.h
        public boolean k() {
            return this.a1;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            j<K, V> B;
            K k;
            K k2 = this.Y0;
            if (k2 == null) {
                B = E2.this.A();
            } else if (this.a1) {
                B = E2.this.n(k2);
            } else {
                B = E2.this.B(k2);
            }
            if (B != null) {
                k = B.getKey();
            } else {
                k = null;
            }
            if (B != null && (this.Z == null || e(k, false))) {
                return k;
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(K k, boolean z, K k2, boolean z2) {
            super();
            if (k == 0 && k2 == 0) {
                throw new IllegalArgumentException("must have a from or to!");
            }
            if (k != 0 && k2 != 0 && E2.this.f().compare(k, k2) > 0) {
                throw new IllegalArgumentException("fromKey > toKey");
            }
            this.Z = k;
            this.Z0 = z;
            this.Y0 = k2;
            this.a1 = z2;
        }
    }

    /* loaded from: classes4.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        public final E2<K, V>.h X;
        public transient int Y = -1;
        public transient int Z;

        /* loaded from: classes4.dex */
        public final class a extends E2<K, V>.k<Map.Entry<K, V>> {
            public final K Z0;

            @Override // java.util.Iterator
            /* renamed from: d */
            public Map.Entry<K, V> next() {
                j<K, V> jVar = this.Y;
                if (jVar != null && !Z.d(jVar.X, this.Z0)) {
                    return c();
                }
                throw new NoSuchElementException();
            }

            @Override // o.E2.k, java.util.Iterator
            public boolean hasNext() {
                j<K, V> jVar = this.Y;
                if (jVar != null && !Z.d(jVar.X, this.Z0)) {
                    return true;
                }
                return false;
            }

            public a(j<K, V> jVar, j<K, V> jVar2) {
                super(jVar);
                this.Z0 = jVar2 != null ? jVar2.getKey() : null;
            }
        }

        public g(E2<K, V>.h hVar) {
            if (hVar != null) {
                this.X = hVar;
                return;
            }
            throw new NullPointerException("delegate");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            j<K, V> t;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            if (!this.X.f(key) || (t = E2.this.t(key)) == null || !Z.d(t.getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return !iterator().hasNext();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            j<K, V> k;
            j<K, V> jVar;
            K c = this.X.c();
            K d = this.X.d();
            if (c == null) {
                k = E2.this.m();
            } else {
                k = E2.this.k(c);
            }
            if (d != null) {
                jVar = E2.this.k(d);
            } else {
                jVar = null;
            }
            return new a(k, jVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            j<K, V> t;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            if (!this.X.f(key) || (t = E2.this.t(key)) == null || !Z.d(t.getValue(), entry.getValue())) {
                return false;
            }
            E2.this.G(t);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            if (this.Y == -1 || this.Z != E2.this.b1) {
                this.Y = 0;
                Iterator<Map.Entry<K, V>> it = iterator();
                while (it.hasNext()) {
                    this.Y++;
                    it.next();
                }
                this.Z = E2.this.b1;
            }
            return this.Y;
        }
    }

    /* loaded from: classes4.dex */
    public abstract class h extends AbstractMap<K, V> implements SortedMap<K, V> {
        public volatile transient Set<Map.Entry<K, V>> X;

        public h() {
        }

        public abstract Set<Map.Entry<K, V>> a();

        public abstract SortedMap<K, V> b(K k, boolean z, K k2, boolean z2);

        public abstract K c();

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return E2.this.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (!f(E2.this.c(obj))) {
                return false;
            }
            return E2.this.containsKey(obj);
        }

        public abstract K d();

        public boolean e(K k, boolean z) {
            Object c = c();
            boolean j = j();
            int compare = E2.this.f().compare(k, c);
            if (!j && !z) {
                if (compare <= 0) {
                    return false;
                }
                return true;
            } else if (compare < 0) {
                return false;
            } else {
                return true;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            if (this.X == null) {
                this.X = a();
            }
            return this.X;
        }

        public boolean f(K k) {
            Object c = c();
            Object d = d();
            if ((c != null && !e(k, false)) || (d != null && !i(k, false))) {
                return false;
            }
            return true;
        }

        public boolean g(K k) {
            Object c = c();
            Object d = d();
            if ((c != null && !e(k, false)) || (d != null && !i(k, true))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            if (!f(E2.this.c(obj))) {
                return null;
            }
            return (V) E2.this.get(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(K k) {
            if (g(k)) {
                return b(c(), j(), k, k());
            }
            throw new IllegalArgumentException("ToKey is out of range: " + k);
        }

        public boolean i(K k, boolean z) {
            Object d = d();
            boolean k2 = k();
            int compare = E2.this.f().compare(k, d);
            if (!k2 && !z) {
                if (compare >= 0) {
                    return false;
                }
                return true;
            } else if (compare > 0) {
                return false;
            } else {
                return true;
            }
        }

        public abstract boolean j();

        public abstract boolean k();

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            if (f(k)) {
                return (V) E2.this.put(k, v);
            }
            throw new IllegalArgumentException("Key is out of range: " + k);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (!f(E2.this.c(obj))) {
                return null;
            }
            return (V) E2.this.remove(obj);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(K k, K k2) {
            if (g(k)) {
                if (g(k2)) {
                    return b(k, j(), k2, k());
                }
                throw new IllegalArgumentException("ToKey is out of range: " + k2);
            }
            throw new IllegalArgumentException("FromKey is out of range: " + k);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(K k) {
            if (g(k)) {
                return b(k, j(), d(), k());
            }
            throw new IllegalArgumentException("FromKey is out of range: " + k);
        }
    }

    /* loaded from: classes4.dex */
    public static class i<E> {
        public E a;

        public i() {
        }

        public E a() {
            return this.a;
        }

        public void b(E e) {
            this.a = e;
        }
    }

    /* loaded from: classes4.dex */
    public static class j<K, V> extends Z.a<K, V> {
        private static final long serialVersionUID = 4596023148184140013L;
        public j<K, V> Y0;
        public int Z;
        public j<K, V> Z0;
        public j<K, V> a1;
        public j<K, V> b1;

        public j(K k, V v, int i) {
            super(k, v);
            this.Z = i;
            this.Y0 = null;
            this.Z0 = this;
            this.a1 = null;
            this.b1 = this;
        }

        public boolean b() {
            if (this.X == null) {
                return true;
            }
            return false;
        }

        public boolean c() {
            return !d();
        }

        public boolean d() {
            if (this.Z0 != this && this.a1 != this) {
                return true;
            }
            return false;
        }

        @Override // o.Z.a
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.Z == -1) {
                sb.append("RootEntry(");
            } else {
                sb.append("Entry(");
            }
            sb.append("key=");
            sb.append(getKey());
            sb.append(" [");
            sb.append(this.Z);
            sb.append("], ");
            sb.append("value=");
            sb.append(getValue());
            sb.append(C6566gU0.h);
            j<K, V> jVar = this.Y0;
            if (jVar != null) {
                if (jVar.Z == -1) {
                    sb.append("parent=");
                    sb.append("ROOT");
                } else {
                    sb.append("parent=");
                    sb.append(this.Y0.getKey());
                    sb.append(" [");
                    sb.append(this.Y0.Z);
                    sb.append(C6566gU0.g);
                }
            } else {
                sb.append("parent=");
                sb.append("null");
            }
            sb.append(C6566gU0.h);
            j<K, V> jVar2 = this.Z0;
            if (jVar2 != null) {
                if (jVar2.Z == -1) {
                    sb.append("left=");
                    sb.append("ROOT");
                } else {
                    sb.append("left=");
                    sb.append(this.Z0.getKey());
                    sb.append(" [");
                    sb.append(this.Z0.Z);
                    sb.append(C6566gU0.g);
                }
            } else {
                sb.append("left=");
                sb.append("null");
            }
            sb.append(C6566gU0.h);
            j<K, V> jVar3 = this.a1;
            if (jVar3 != null) {
                if (jVar3.Z == -1) {
                    sb.append("right=");
                    sb.append("ROOT");
                } else {
                    sb.append("right=");
                    sb.append(this.a1.getKey());
                    sb.append(" [");
                    sb.append(this.a1.Z);
                    sb.append(C6566gU0.g);
                }
            } else {
                sb.append("right=");
                sb.append("null");
            }
            sb.append(C6566gU0.h);
            j<K, V> jVar4 = this.b1;
            if (jVar4 != null) {
                if (jVar4.Z == -1) {
                    sb.append("predecessor=");
                    sb.append("ROOT");
                } else {
                    sb.append("predecessor=");
                    sb.append(this.b1.getKey());
                    sb.append(" [");
                    sb.append(this.b1.Z);
                    sb.append(C6566gU0.g);
                }
            }
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* loaded from: classes4.dex */
    public class l extends E2<K, V>.k<K> implements InterfaceC9855tw1<K, V> {
        public j<K, V> Z0;

        public l() {
            super();
        }

        @Override // o.E2.k
        public j<K, V> c() {
            j<K, V> c = super.c();
            this.Z0 = c;
            return c;
        }

        public j<K, V> d() {
            int i = this.X;
            E2 e2 = E2.this;
            if (i == e2.b1) {
                j<K, V> jVar = this.Z0;
                if (jVar != null) {
                    this.Z0 = e2.F(jVar);
                    this.Y = this.Z;
                    this.Z = jVar;
                    return jVar;
                }
                throw new NoSuchElementException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // o.U71
        public K getKey() {
            j<K, V> jVar = this.Z;
            if (jVar != null) {
                return jVar.getKey();
            }
            throw new IllegalStateException();
        }

        @Override // o.U71
        public V getValue() {
            j<K, V> jVar = this.Z;
            if (jVar != null) {
                return jVar.getValue();
            }
            throw new IllegalStateException();
        }

        @Override // o.InterfaceC9855tw1, o.InterfaceC8877pw1
        public boolean hasPrevious() {
            if (this.Z0 != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, o.U71
        public K next() {
            return c().getKey();
        }

        @Override // o.InterfaceC9855tw1, o.InterfaceC8877pw1
        public K previous() {
            return d().getKey();
        }

        @Override // o.U71
        public V setValue(V v) {
            j<K, V> jVar = this.Z;
            if (jVar != null) {
                return jVar.setValue(v);
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes4.dex */
    public class m extends AbstractCollection<V> {

        /* loaded from: classes4.dex */
        public class a extends E2<K, V>.k<V> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public V next() {
                return c().getValue();
            }
        }

        public m() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            E2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return E2.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            Iterator<V> it = iterator();
            while (it.hasNext()) {
                if (Z.d(it.next(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return E2.this.size();
        }
    }

    public E2(AbstractC7061iX0<? super K> abstractC7061iX0) {
        super(abstractC7061iX0);
        this.Y = new j<>(null, null, -1);
        this.a1 = 0;
        this.b1 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.Y = new j<>(null, null, -1);
        int readInt = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public static boolean z(j<?, ?> jVar, j<?, ?> jVar2) {
        if (jVar != null && jVar.Z <= jVar2.Z && !jVar.b()) {
            return true;
        }
        return false;
    }

    public j<K, V> A() {
        return r(this.Y.Z0);
    }

    public j<K, V> B(K k2) {
        int i2 = i(k2);
        if (i2 == 0) {
            return null;
        }
        j<K, V> u = u(k2, i2);
        if (e(k2, u.X)) {
            return F(u);
        }
        int a2 = a(k2, u.X);
        if (AbstractC7061iX0.h(a2)) {
            j<K, V> jVar = new j<>(k2, null, a2);
            j(jVar, i2);
            y();
            j<K, V> F = F(jVar);
            G(jVar);
            this.b1 -= 2;
            return F;
        } else if (AbstractC7061iX0.e(a2)) {
            return null;
        } else {
            if (AbstractC7061iX0.d(a2)) {
                return F(u);
            }
            throw new IllegalStateException("invalid lookup: " + k2);
        }
    }

    public j<K, V> C(j<K, V> jVar) {
        if (jVar == null) {
            return m();
        }
        return D(jVar.b1, jVar, null);
    }

    public j<K, V> D(j<K, V> jVar, j<K, V> jVar2, j<K, V> jVar3) {
        j<K, V> jVar4;
        j<K, V> jVar5;
        if (jVar2 == null || jVar != jVar2.b1) {
            while (!jVar.Z0.b() && jVar2 != (jVar4 = jVar.Z0)) {
                if (z(jVar4, jVar)) {
                    return jVar.Z0;
                }
                jVar = jVar.Z0;
            }
        }
        if (jVar.b() || (jVar5 = jVar.a1) == null) {
            return null;
        }
        if (jVar2 != jVar5) {
            if (z(jVar5, jVar)) {
                return jVar.a1;
            }
            return D(jVar.a1, jVar2, jVar3);
        }
        while (true) {
            j<K, V> jVar6 = jVar.Y0;
            j<K, V> jVar7 = jVar6.a1;
            if (jVar == jVar7) {
                if (jVar == jVar3) {
                    return null;
                }
                jVar = jVar6;
            } else if (jVar == jVar3 || jVar7 == null) {
                return null;
            } else {
                if (jVar2 != jVar7 && z(jVar7, jVar6)) {
                    return jVar.Y0.a1;
                }
                j<K, V> jVar8 = jVar.Y0;
                j<K, V> jVar9 = jVar8.a1;
                if (jVar9 == jVar8) {
                    return null;
                }
                return D(jVar9, jVar2, jVar3);
            }
        }
    }

    public j<K, V> E(j<K, V> jVar, j<K, V> jVar2) {
        if (jVar == null) {
            return m();
        }
        return D(jVar.b1, jVar, jVar2);
    }

    public j<K, V> F(j<K, V> jVar) {
        j<K, V> jVar2;
        j<K, V> jVar3 = jVar.b1;
        if (jVar3 != null) {
            if (jVar3.a1 == jVar) {
                if (z(jVar3.Z0, jVar3)) {
                    return jVar.b1.Z0;
                }
                return r(jVar.b1.Z0);
            }
            while (true) {
                jVar2 = jVar3.Y0;
                if (jVar2 == null || jVar3 != jVar2.Z0) {
                    break;
                }
                jVar3 = jVar2;
            }
            if (jVar2 == null) {
                return null;
            }
            if (z(jVar2.Z0, jVar2)) {
                j<K, V> jVar4 = jVar3.Y0.Z0;
                j<K, V> jVar5 = this.Y;
                if (jVar4 == jVar5) {
                    if (jVar5.b()) {
                        return null;
                    }
                    return this.Y;
                }
                return jVar4;
            }
            return r(jVar3.Y0.Z0);
        }
        throw new IllegalArgumentException("must have come from somewhere!");
    }

    public V G(j<K, V> jVar) {
        if (jVar != this.Y) {
            if (jVar.d()) {
                I(jVar);
            } else {
                H(jVar);
            }
        }
        l();
        return jVar.a(null, null);
    }

    public final void H(j<K, V> jVar) {
        if (jVar != this.Y) {
            if (jVar.c()) {
                j<K, V> jVar2 = jVar.Y0;
                j<K, V> jVar3 = jVar.Z0;
                if (jVar3 == jVar) {
                    jVar3 = jVar.a1;
                }
                if (jVar2.Z0 == jVar) {
                    jVar2.Z0 = jVar3;
                } else {
                    jVar2.a1 = jVar3;
                }
                if (jVar3.Z > jVar2.Z) {
                    jVar3.Y0 = jVar2;
                    return;
                } else {
                    jVar3.b1 = jVar2;
                    return;
                }
            }
            throw new IllegalArgumentException(jVar + " is not an external Entry!");
        }
        throw new IllegalArgumentException("Cannot delete root Entry!");
    }

    public final void I(j<K, V> jVar) {
        if (jVar != this.Y) {
            if (jVar.d()) {
                j<K, V> jVar2 = jVar.b1;
                jVar2.Z = jVar.Z;
                j<K, V> jVar3 = jVar2.Y0;
                j<K, V> jVar4 = jVar2.Z0;
                if (jVar4 == jVar) {
                    jVar4 = jVar2.a1;
                }
                if (jVar2.b1 == jVar2 && jVar3 != jVar) {
                    jVar2.b1 = jVar3;
                }
                if (jVar3.Z0 == jVar2) {
                    jVar3.Z0 = jVar4;
                } else {
                    jVar3.a1 = jVar4;
                }
                if (jVar4.Z > jVar3.Z) {
                    jVar4.Y0 = jVar3;
                }
                j<K, V> jVar5 = jVar.Z0;
                if (jVar5.Y0 == jVar) {
                    jVar5.Y0 = jVar2;
                }
                j<K, V> jVar6 = jVar.a1;
                if (jVar6.Y0 == jVar) {
                    jVar6.Y0 = jVar2;
                }
                j<K, V> jVar7 = jVar.Y0;
                if (jVar7.Z0 == jVar) {
                    jVar7.Z0 = jVar2;
                } else {
                    jVar7.a1 = jVar2;
                }
                jVar2.Y0 = jVar7;
                j<K, V> jVar8 = jVar.Z0;
                jVar2.Z0 = jVar8;
                jVar2.a1 = jVar.a1;
                if (z(jVar8, jVar2)) {
                    jVar2.Z0.b1 = jVar2;
                }
                if (z(jVar2.a1, jVar2)) {
                    jVar2.a1.b1 = jVar2;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(jVar + " is not an internal Entry!");
        }
        throw new IllegalArgumentException("Cannot delete root Entry!");
    }

    public Map.Entry<K, V> J(K k2) {
        int i2 = i(k2);
        i<Map.Entry<K, V>> iVar = new i<>();
        if (L(this.Y.Z0, -1, k2, i2, iVar)) {
            return null;
        }
        return iVar.a();
    }

    public K K(K k2) {
        Map.Entry<K, V> J = J(k2);
        if (J == null) {
            return null;
        }
        return J.getKey();
    }

    public final boolean L(j<K, V> jVar, int i2, K k2, int i3, i<Map.Entry<K, V>> iVar) {
        int i4 = jVar.Z;
        if (i4 <= i2) {
            if (!jVar.b()) {
                iVar.b(jVar);
                return false;
            }
            return true;
        }
        if (!g(k2, i4, i3)) {
            if (L(jVar.Z0, jVar.Z, k2, i3, iVar)) {
                return L(jVar.a1, jVar.Z, k2, i3, iVar);
            }
        } else if (L(jVar.a1, jVar.Z, k2, i3, iVar)) {
            return L(jVar.Z0, jVar.Z, k2, i3, iVar);
        }
        return false;
    }

    public V N(K k2) {
        Map.Entry<K, V> J = J(k2);
        if (J == null) {
            return null;
        }
        return J.getValue();
    }

    public j<K, V> O(K k2, int i2, int i3) {
        j<K, V> jVar;
        j<K, V> jVar2 = this.Y;
        j<K, V> jVar3 = jVar2.Z0;
        while (true) {
            j<K, V> jVar4 = jVar3;
            jVar = jVar2;
            jVar2 = jVar4;
            int i4 = jVar2.Z;
            if (i4 <= jVar.Z || i3 <= i4) {
                break;
            } else if (!g(k2, i4 + i2, i2 + i3)) {
                jVar3 = jVar2.Z0;
            } else {
                jVar3 = jVar2.a1;
            }
        }
        if (jVar2.b()) {
            jVar2 = jVar;
        }
        if (jVar2.b()) {
            return null;
        }
        int i5 = i2 + i3;
        if (jVar2 == this.Y && i(jVar2.getKey()) < i5) {
            return null;
        }
        boolean g2 = g(k2, i5 - 1, i5);
        K k3 = jVar2.X;
        if (g2 != g(k3, i3 - 1, i(k3))) {
            return null;
        }
        int a2 = f().a(k2, i2, i3, jVar2.X, 0, i(jVar2.getKey()));
        if (a2 >= 0 && a2 < i3) {
            return null;
        }
        return jVar2;
    }

    @Override // o.InterfaceC10091uu2
    public SortedMap<K, V> O0(K k2) {
        return v(k2, 0, i(k2));
    }

    @Override // java.util.AbstractMap, java.util.Map, o.OK1
    public void clear() {
        j<K, V> jVar = this.Y;
        jVar.X = null;
        jVar.Z = -1;
        jVar.Y = null;
        jVar.Y0 = null;
        jVar.Z0 = jVar;
        jVar.a1 = null;
        jVar.b1 = jVar;
        this.a1 = 0;
        x();
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return f();
    }

    @Override // java.util.AbstractMap, java.util.Map, o.UC0
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        K c2 = c(obj);
        j<K, V> u = u(c2, i(c2));
        if (u.b() || !e(c2, u.X)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.Z0 == null) {
            this.Z0 = new b();
        }
        return this.Z0;
    }

    @Override // java.util.SortedMap, o.InterfaceC9369rw1
    public K firstKey() {
        if (size() != 0) {
            return m().getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractMap, java.util.Map, o.UC0
    public V get(Object obj) {
        j<K, V> t = t(obj);
        if (t != null) {
            return t.getValue();
        }
        return null;
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k2) {
        return new f(this, null, k2);
    }

    public j<K, V> j(j<K, V> jVar, int i2) {
        j<K, V> jVar2;
        int i3;
        j<K, V> jVar3 = this.Y;
        j<K, V> jVar4 = jVar3.Z0;
        while (true) {
            j<K, V> jVar5 = jVar4;
            jVar2 = jVar3;
            jVar3 = jVar5;
            int i4 = jVar3.Z;
            i3 = jVar.Z;
            if (i4 >= i3 || i4 <= jVar2.Z) {
                break;
            } else if (!g(jVar.X, i4, i2)) {
                jVar4 = jVar3.Z0;
            } else {
                jVar4 = jVar3.a1;
            }
        }
        jVar.b1 = jVar;
        if (!g(jVar.X, i3, i2)) {
            jVar.Z0 = jVar;
            jVar.a1 = jVar3;
        } else {
            jVar.Z0 = jVar3;
            jVar.a1 = jVar;
        }
        jVar.Y0 = jVar2;
        int i5 = jVar3.Z;
        if (i5 >= jVar.Z) {
            jVar3.Y0 = jVar;
        }
        int i6 = jVar2.Z;
        if (i5 <= i6) {
            jVar3.b1 = jVar;
        }
        if (jVar2 != this.Y && g(jVar.X, i6, i2)) {
            jVar2.a1 = jVar;
            return jVar;
        }
        jVar2.Z0 = jVar;
        return jVar;
    }

    @Override // o.InterfaceC9369rw1
    public K j0(K k2) {
        j<K, V> F;
        k2.getClass();
        j<K, V> t = t(k2);
        if (t == null || (F = F(t)) == null) {
            return null;
        }
        return F.getKey();
    }

    public j<K, V> k(K k2) {
        int i2 = i(k2);
        if (i2 == 0) {
            if (!this.Y.b()) {
                return this.Y;
            }
            return m();
        }
        j<K, V> u = u(k2, i2);
        if (!e(k2, u.X)) {
            int a2 = a(k2, u.X);
            if (AbstractC7061iX0.h(a2)) {
                j<K, V> jVar = new j<>(k2, null, a2);
                j(jVar, i2);
                y();
                j<K, V> C = C(jVar);
                G(jVar);
                this.b1 -= 2;
                return C;
            } else if (AbstractC7061iX0.e(a2)) {
                if (!this.Y.b()) {
                    return this.Y;
                }
                return m();
            } else if (!AbstractC7061iX0.d(a2)) {
                throw new IllegalStateException("invalid lookup: " + k2);
            }
        }
        return u;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap, o.UC0
    public Set<K> keySet() {
        if (this.Z == null) {
            this.Z = new c();
        }
        return this.Z;
    }

    public void l() {
        this.a1--;
        x();
    }

    @Override // java.util.SortedMap, o.InterfaceC9369rw1
    public K lastKey() {
        j<K, V> A = A();
        if (A != null) {
            return A.getKey();
        }
        throw new NoSuchElementException();
    }

    public j<K, V> m() {
        if (isEmpty()) {
            return null;
        }
        return o(this.Y);
    }

    public j<K, V> n(K k2) {
        int i2 = i(k2);
        if (i2 == 0) {
            if (this.Y.b()) {
                return null;
            }
            return this.Y;
        }
        j<K, V> u = u(k2, i2);
        if (!e(k2, u.X)) {
            int a2 = a(k2, u.X);
            if (AbstractC7061iX0.h(a2)) {
                j<K, V> jVar = new j<>(k2, null, a2);
                j(jVar, i2);
                y();
                j<K, V> F = F(jVar);
                G(jVar);
                this.b1 -= 2;
                return F;
            } else if (AbstractC7061iX0.e(a2)) {
                if (this.Y.b()) {
                    return null;
                }
                return this.Y;
            } else if (!AbstractC7061iX0.d(a2)) {
                throw new IllegalStateException("invalid lookup: " + k2);
            }
        }
        return u;
    }

    @Override // o.InterfaceC9369rw1
    public K n0(K k2) {
        j<K, V> C;
        k2.getClass();
        j<K, V> t = t(k2);
        if (t == null || (C = C(t)) == null) {
            return null;
        }
        return C.getKey();
    }

    public j<K, V> o(j<K, V> jVar) {
        while (true) {
            j<K, V> jVar2 = jVar.Z0;
            if (jVar2.b()) {
                jVar2 = jVar.a1;
            }
            if (jVar2.Z <= jVar.Z) {
                return jVar2;
            }
            jVar = jVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, o.OK1
    public V put(K k2, V v) {
        if (k2 != null) {
            int i2 = i(k2);
            if (i2 == 0) {
                if (this.Y.b()) {
                    y();
                } else {
                    x();
                }
                return this.Y.a(k2, v);
            }
            j<K, V> u = u(k2, i2);
            if (e(k2, u.X)) {
                if (u.b()) {
                    y();
                } else {
                    x();
                }
                return u.a(k2, v);
            }
            int a2 = a(k2, u.X);
            if (!AbstractC7061iX0.f(a2)) {
                if (AbstractC7061iX0.h(a2)) {
                    j(new j<>(k2, v, a2), i2);
                    y();
                    return null;
                } else if (AbstractC7061iX0.e(a2)) {
                    if (this.Y.b()) {
                        y();
                    } else {
                        x();
                    }
                    return this.Y.a(k2, v);
                } else if (AbstractC7061iX0.d(a2) && u != this.Y) {
                    x();
                    return u.a(k2, v);
                }
            }
            throw new IllegalArgumentException("Failed to put: " + k2 + B8.d + v + C6566gU0.h + a2);
        }
        throw new NullPointerException("Key cannot be null");
    }

    public j<K, V> r(j<K, V> jVar) {
        if (jVar.a1 == null) {
            return null;
        }
        while (true) {
            j<K, V> jVar2 = jVar.a1;
            if (jVar2.Z > jVar.Z) {
                jVar = jVar2;
            } else {
                return jVar2;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, o.UC0
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        K c2 = c(obj);
        int i2 = i(c2);
        j<K, V> jVar = this.Y;
        j<K, V> jVar2 = jVar.Z0;
        while (true) {
            j<K, V> jVar3 = jVar2;
            j<K, V> jVar4 = jVar;
            jVar = jVar3;
            int i3 = jVar.Z;
            if (i3 <= jVar4.Z) {
                break;
            } else if (!g(c2, i3, i2)) {
                jVar2 = jVar.Z0;
            } else {
                jVar2 = jVar.a1;
            }
        }
        if (jVar.b() || !e(c2, jVar.X)) {
            return null;
        }
        return G(jVar);
    }

    @Override // java.util.AbstractMap, java.util.Map, o.UC0
    public int size() {
        return this.a1;
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k2, K k3) {
        return new f(this, k2, k3);
    }

    public j<K, V> t(Object obj) {
        K c2 = c(obj);
        if (c2 == null) {
            return null;
        }
        j<K, V> u = u(c2, i(c2));
        if (u.b() || !e(c2, u.X)) {
            return null;
        }
        return u;
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k2) {
        return new f(this, k2, null);
    }

    public j<K, V> u(K k2, int i2) {
        j<K, V> jVar = this.Y;
        j<K, V> jVar2 = jVar.Z0;
        while (true) {
            j<K, V> jVar3 = jVar2;
            j<K, V> jVar4 = jVar;
            jVar = jVar3;
            int i3 = jVar.Z;
            if (i3 <= jVar4.Z) {
                return jVar;
            }
            if (!g(k2, i3, i2)) {
                jVar2 = jVar.Z0;
            } else {
                jVar2 = jVar.a1;
            }
        }
    }

    public final SortedMap<K, V> v(K k2, int i2, int i3) {
        int i4 = i2 + i3;
        if (i4 <= i(k2)) {
            if (i4 == 0) {
                return this;
            }
            return new e(k2, i2, i3);
        }
        throw new IllegalArgumentException(i2 + " + " + i3 + " > " + i(k2));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap, o.UC0
    public Collection<V> values() {
        if (this.Y0 == null) {
            this.Y0 = new m();
        }
        return this.Y0;
    }

    public j<K, V> w(K k2) {
        int i2 = i(k2);
        if (i2 == 0) {
            if (!this.Y.b()) {
                if (size() <= 1) {
                    return null;
                }
                return C(this.Y);
            }
            return m();
        }
        j<K, V> u = u(k2, i2);
        if (e(k2, u.X)) {
            return C(u);
        }
        int a2 = a(k2, u.X);
        if (AbstractC7061iX0.h(a2)) {
            j<K, V> jVar = new j<>(k2, null, a2);
            j(jVar, i2);
            y();
            j<K, V> C = C(jVar);
            G(jVar);
            this.b1 -= 2;
            return C;
        } else if (AbstractC7061iX0.e(a2)) {
            if (!this.Y.b()) {
                return m();
            }
            if (size() <= 1) {
                return null;
            }
            return C(m());
        } else if (AbstractC7061iX0.d(a2)) {
            return C(u);
        } else {
            throw new IllegalStateException("invalid lookup: " + k2);
        }
    }

    public final void x() {
        this.b1++;
    }

    public void y() {
        this.a1++;
        x();
    }

    @Override // o.InterfaceC9369rw1, o.VT0
    public InterfaceC9855tw1<K, V> p() {
        return new l();
    }

    /* loaded from: classes4.dex */
    public abstract class k<E> implements Iterator<E> {
        public int X;
        public j<K, V> Y;
        public j<K, V> Z;

        public k() {
            this.X = E2.this.b1;
            this.Y = E2.this.C(null);
        }

        public j<K, V> b(j<K, V> jVar) {
            return E2.this.C(jVar);
        }

        public j<K, V> c() {
            if (this.X == E2.this.b1) {
                j<K, V> jVar = this.Y;
                if (jVar != null) {
                    this.Y = b(jVar);
                    this.Z = jVar;
                    return jVar;
                }
                throw new NoSuchElementException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            j<K, V> jVar = this.Z;
            if (jVar != null) {
                int i = this.X;
                E2 e2 = E2.this;
                if (i == e2.b1) {
                    this.Z = null;
                    e2.G(jVar);
                    this.X = E2.this.b1;
                    return;
                }
                throw new ConcurrentModificationException();
            }
            throw new IllegalStateException();
        }

        public k(j<K, V> jVar) {
            this.X = E2.this.b1;
            this.Y = jVar;
        }
    }

    public E2(AbstractC7061iX0<? super K> abstractC7061iX0, Map<? extends K, ? extends V> map) {
        super(abstractC7061iX0);
        this.Y = new j<>(null, null, -1);
        this.a1 = 0;
        this.b1 = 0;
        putAll(map);
    }
}
