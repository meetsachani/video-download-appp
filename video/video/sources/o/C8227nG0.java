package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o.TN0;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.nG0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8227nG0<K, V> extends AbstractMap<K, V> implements InterfaceC4626Wm<K, V>, Serializable {
    public static final int l1 = -1;
    public static final int m1 = -2;
    public transient K[] X;
    public transient V[] Y;
    public transient int Y0;
    public transient int Z;
    public transient int[] Z0;
    public transient int[] a1;
    public transient int[] b1;
    public transient int[] c1;
    public transient int d1;
    public transient int e1;
    public transient int[] f1;
    public transient int[] g1;
    public transient Set<K> h1;
    public transient Set<V> i1;
    public transient Set<Map.Entry<K, V>> j1;
    @MB
    @SY0
    @InterfaceC7537kU1
    public transient InterfaceC4626Wm<V, K> k1;

    /* renamed from: o.nG0$a */
    /* loaded from: classes3.dex */
    public final class a extends M1<K, V> {
        @InterfaceC7894ly1
        public final K X;
        public int Y;

        public a(int i) {
            this.X = (K) C2491As1.a(C8227nG0.this.X[i]);
            this.Y = i;
        }

        public void a() {
            int i = this.Y;
            if (i != -1) {
                C8227nG0 c8227nG0 = C8227nG0.this;
                if (i <= c8227nG0.Z && C2593Bt1.a(c8227nG0.X[i], this.X)) {
                    return;
                }
            }
            this.Y = C8227nG0.this.t(this.X);
        }

        @Override // o.M1, java.util.Map.Entry
        @InterfaceC7894ly1
        public K getKey() {
            return this.X;
        }

        @Override // o.M1, java.util.Map.Entry
        @InterfaceC7894ly1
        public V getValue() {
            a();
            int i = this.Y;
            if (i == -1) {
                return (V) C2491As1.b();
            }
            return (V) C2491As1.a(C8227nG0.this.Y[i]);
        }

        @Override // o.M1, java.util.Map.Entry
        @InterfaceC7894ly1
        public V setValue(@InterfaceC7894ly1 V v) {
            a();
            int i = this.Y;
            if (i == -1) {
                C8227nG0.this.put(this.X, v);
                return (V) C2491As1.b();
            }
            V v2 = (V) C2491As1.a(C8227nG0.this.Y[i]);
            if (!C2593Bt1.a(v2, v)) {
                C8227nG0.this.K(this.Y, v, false);
                return v2;
            }
            return v;
        }
    }

    /* renamed from: o.nG0$b */
    /* loaded from: classes3.dex */
    public static final class b<K, V> extends M1<V, K> {
        public final C8227nG0<K, V> X;
        @InterfaceC7894ly1
        public final V Y;
        public int Z;

        public b(C8227nG0<K, V> c8227nG0, int i) {
            this.X = c8227nG0;
            this.Y = (V) C2491As1.a(c8227nG0.Y[i]);
            this.Z = i;
        }

        private void a() {
            int i = this.Z;
            if (i != -1) {
                C8227nG0<K, V> c8227nG0 = this.X;
                if (i <= c8227nG0.Z && C2593Bt1.a(this.Y, c8227nG0.Y[i])) {
                    return;
                }
            }
            this.Z = this.X.v(this.Y);
        }

        @Override // o.M1, java.util.Map.Entry
        @InterfaceC7894ly1
        public V getKey() {
            return this.Y;
        }

        @Override // o.M1, java.util.Map.Entry
        @InterfaceC7894ly1
        public K getValue() {
            a();
            int i = this.Z;
            if (i == -1) {
                return (K) C2491As1.b();
            }
            return (K) C2491As1.a(this.X.X[i]);
        }

        @Override // o.M1, java.util.Map.Entry
        @InterfaceC7894ly1
        public K setValue(@InterfaceC7894ly1 K k) {
            a();
            int i = this.Z;
            if (i == -1) {
                this.X.D(this.Y, k, false);
                return (K) C2491As1.b();
            }
            K k2 = (K) C2491As1.a(this.X.X[i]);
            if (!C2593Bt1.a(k2, k)) {
                this.X.J(this.Z, k, false);
                return k2;
            }
            return k;
        }
    }

    /* renamed from: o.nG0$c */
    /* loaded from: classes3.dex */
    public final class c extends h<K, V, Map.Entry<K, V>> {
        public c() {
            super(C8227nG0.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int t = C8227nG0.this.t(key);
                if (t != -1 && C2593Bt1.a(value, C8227nG0.this.Y[t])) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.C8227nG0.h
        /* renamed from: e */
        public Map.Entry<K, V> d(int i) {
            return new a(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @InterfaceC6181ey
        public boolean remove(@MB Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int d = EG0.d(key);
                int u = C8227nG0.this.u(key, d);
                if (u != -1 && C2593Bt1.a(value, C8227nG0.this.Y[u])) {
                    C8227nG0.this.G(u, d);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: o.nG0$d */
    /* loaded from: classes3.dex */
    public static class d<K, V> extends AbstractMap<V, K> implements InterfaceC4626Wm<V, K>, Serializable {
        public final C8227nG0<K, V> X;
        public transient Set<Map.Entry<V, K>> Y;

        public d(C8227nG0<K, V> c8227nG0) {
            this.X = c8227nG0;
        }

        @InterfaceC11149zF0("serialization")
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.X.k1 = this;
        }

        @Override // o.InterfaceC4626Wm
        @InterfaceC6181ey
        @MB
        public K J3(@InterfaceC7894ly1 V v, @InterfaceC7894ly1 K k) {
            return this.X.D(v, k, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            return this.X.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@MB Object obj) {
            return this.X.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.Y;
            if (set == null) {
                e eVar = new e(this.X);
                this.Y = eVar;
                return eVar;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public K get(@MB Object obj) {
            return this.X.x(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.X.values();
        }

        @Override // o.InterfaceC4626Wm
        public InterfaceC4626Wm<K, V> m5() {
            return this.X;
        }

        @Override // java.util.AbstractMap, java.util.Map, o.InterfaceC4626Wm
        @InterfaceC6181ey
        @MB
        public K put(@InterfaceC7894ly1 V v, @InterfaceC7894ly1 K k) {
            return this.X.D(v, k, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @InterfaceC6181ey
        @MB
        public K remove(@MB Object obj) {
            return this.X.I(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.X.Z;
        }

        @Override // java.util.AbstractMap, java.util.Map, o.InterfaceC4626Wm
        public Set<K> values() {
            return this.X.keySet();
        }
    }

    /* renamed from: o.nG0$e */
    /* loaded from: classes3.dex */
    public static class e<K, V> extends h<K, V, Map.Entry<V, K>> {
        public e(C8227nG0<K, V> c8227nG0) {
            super(c8227nG0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int v = this.X.v(key);
                if (v != -1 && C2593Bt1.a(this.X.X[v], value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.C8227nG0.h
        /* renamed from: e */
        public Map.Entry<V, K> d(int i) {
            return new b(this.X, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@MB Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int d = EG0.d(key);
                int w = this.X.w(key, d);
                if (w != -1 && C2593Bt1.a(this.X.X[w], value)) {
                    this.X.H(w, d);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: o.nG0$f */
    /* loaded from: classes3.dex */
    public final class f extends h<K, V, K> {
        public f() {
            super(C8227nG0.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            return C8227nG0.this.containsKey(obj);
        }

        @Override // o.C8227nG0.h
        @InterfaceC7894ly1
        public K d(int i) {
            return (K) C2491As1.a(C8227nG0.this.X[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@MB Object obj) {
            int d = EG0.d(obj);
            int u = C8227nG0.this.u(obj, d);
            if (u != -1) {
                C8227nG0.this.G(u, d);
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.nG0$g */
    /* loaded from: classes3.dex */
    public final class g extends h<K, V, V> {
        public g() {
            super(C8227nG0.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            return C8227nG0.this.containsValue(obj);
        }

        @Override // o.C8227nG0.h
        @InterfaceC7894ly1
        public V d(int i) {
            return (V) C2491As1.a(C8227nG0.this.Y[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@MB Object obj) {
            int d = EG0.d(obj);
            int w = C8227nG0.this.w(obj, d);
            if (w != -1) {
                C8227nG0.this.H(w, d);
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.nG0$h */
    /* loaded from: classes3.dex */
    public static abstract class h<K, V, T> extends AbstractSet<T> {
        public final C8227nG0<K, V> X;

        /* renamed from: o.nG0$h$a */
        /* loaded from: classes3.dex */
        public class a implements Iterator<T> {
            public int X;
            public int Y = -1;
            public int Y0;
            public int Z;

            public a() {
                this.X = h.this.X.d1;
                C8227nG0<K, V> c8227nG0 = h.this.X;
                this.Z = c8227nG0.Y0;
                this.Y0 = c8227nG0.Z;
            }

            public final void b() {
                if (h.this.X.Y0 == this.Z) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                if (this.X != -2 && this.Y0 > 0) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            @InterfaceC7894ly1
            public T next() {
                if (hasNext()) {
                    T t = (T) h.this.d(this.X);
                    this.Y = this.X;
                    this.X = h.this.X.g1[this.X];
                    this.Y0--;
                    return t;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                b();
                if (this.Y != -1) {
                    z = true;
                } else {
                    z = false;
                }
                C5037aF.e(z);
                h.this.X.E(this.Y);
                int i = this.X;
                C8227nG0<K, V> c8227nG0 = h.this.X;
                if (i == c8227nG0.Z) {
                    this.X = this.Y;
                }
                this.Y = -1;
                this.Z = c8227nG0.Y0;
            }
        }

        public h(C8227nG0<K, V> c8227nG0) {
            this.X = c8227nG0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.X.clear();
        }

        @InterfaceC7894ly1
        public abstract T d(int i);

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.X.Z;
        }
    }

    public C8227nG0(int i) {
        y(i);
    }

    public static <K, V> C8227nG0<K, V> g() {
        return i(16);
    }

    public static <K, V> C8227nG0<K, V> i(int i) {
        return new C8227nG0<>(i);
    }

    public static <K, V> C8227nG0<K, V> j(Map<? extends K, ? extends V> map) {
        C8227nG0<K, V> i = i(map.size());
        i.putAll(map);
        return i;
    }

    public static int[] k(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public static int[] o(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    @InterfaceC11149zF0
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int h2 = C9634t12.h(objectInputStream);
        y(16);
        C9634t12.c(this, objectInputStream, h2);
    }

    @InterfaceC11149zF0
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C9634t12.i(this, objectOutputStream);
    }

    public final void A(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        int f2 = f(i2);
        int[] iArr = this.c1;
        int[] iArr2 = this.a1;
        iArr[i] = iArr2[f2];
        iArr2[f2] = i;
    }

    public final void B(int i, int i2) {
        int i3;
        int i4;
        if (i == i2) {
            return;
        }
        int i5 = this.f1[i];
        int i6 = this.g1[i];
        L(i5, i2);
        L(i2, i6);
        K[] kArr = this.X;
        K k = kArr[i];
        V[] vArr = this.Y;
        V v = vArr[i];
        kArr[i2] = k;
        vArr[i2] = v;
        int f2 = f(EG0.d(k));
        int[] iArr = this.Z0;
        int i7 = iArr[f2];
        if (i7 == i) {
            iArr[f2] = i2;
        } else {
            int i8 = this.b1[i7];
            while (true) {
                i3 = i7;
                i7 = i8;
                if (i7 == i) {
                    break;
                }
                i8 = this.b1[i7];
            }
            this.b1[i3] = i2;
        }
        int[] iArr2 = this.b1;
        iArr2[i2] = iArr2[i];
        iArr2[i] = -1;
        int f3 = f(EG0.d(v));
        int[] iArr3 = this.a1;
        int i9 = iArr3[f3];
        if (i9 == i) {
            iArr3[f3] = i2;
        } else {
            int i10 = this.c1[i9];
            while (true) {
                i4 = i9;
                i9 = i10;
                if (i9 == i) {
                    break;
                }
                i10 = this.c1[i9];
            }
            this.c1[i4] = i2;
        }
        int[] iArr4 = this.c1;
        iArr4[i2] = iArr4[i];
        iArr4[i] = -1;
    }

    @MB
    public V C(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v, boolean z) {
        boolean z2;
        int d2 = EG0.d(k);
        int u = u(k, d2);
        if (u != -1) {
            V v2 = this.Y[u];
            if (C2593Bt1.a(v2, v)) {
                return v;
            }
            K(u, v, z);
            return v2;
        }
        int d3 = EG0.d(v);
        int w = w(v, d3);
        if (z) {
            if (w != -1) {
                H(w, d3);
            }
        } else {
            if (w == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C10664xF1.u(z2, "Value already present: %s", v);
        }
        n(this.Z + 1);
        K[] kArr = this.X;
        int i = this.Z;
        kArr[i] = k;
        this.Y[i] = v;
        z(i, d2);
        A(this.Z, d3);
        L(this.e1, this.Z);
        L(this.Z, -2);
        this.Z++;
        this.Y0++;
        return null;
    }

    @InterfaceC6181ey
    @MB
    public K D(@InterfaceC7894ly1 V v, @InterfaceC7894ly1 K k, boolean z) {
        boolean z2;
        int i;
        int d2 = EG0.d(v);
        int w = w(v, d2);
        if (w != -1) {
            K k2 = this.X[w];
            if (C2593Bt1.a(k2, k)) {
                return k;
            }
            J(w, k, z);
            return k2;
        }
        int i2 = this.e1;
        int d3 = EG0.d(k);
        int u = u(k, d3);
        if (z) {
            if (u != -1) {
                i2 = this.f1[u];
                G(u, d3);
            }
        } else {
            if (u == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C10664xF1.u(z2, "Key already present: %s", k);
        }
        n(this.Z + 1);
        K[] kArr = this.X;
        int i3 = this.Z;
        kArr[i3] = k;
        this.Y[i3] = v;
        z(i3, d3);
        A(this.Z, d2);
        if (i2 == -2) {
            i = this.d1;
        } else {
            i = this.g1[i2];
        }
        L(i2, this.Z);
        L(this.Z, i);
        this.Z++;
        this.Y0++;
        return null;
    }

    public void E(int i) {
        G(i, EG0.d(this.X[i]));
    }

    public final void F(int i, int i2, int i3) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        l(i, i2);
        m(i, i3);
        L(this.f1[i], this.g1[i]);
        B(this.Z - 1, i);
        K[] kArr = this.X;
        int i4 = this.Z;
        kArr[i4 - 1] = null;
        this.Y[i4 - 1] = null;
        this.Z = i4 - 1;
        this.Y0++;
    }

    public void G(int i, int i2) {
        F(i, i2, EG0.d(this.Y[i]));
    }

    public void H(int i, int i2) {
        F(i, EG0.d(this.X[i]), i2);
    }

    @MB
    public K I(@MB Object obj) {
        int d2 = EG0.d(obj);
        int w = w(obj, d2);
        if (w == -1) {
            return null;
        }
        K k = this.X[w];
        H(w, d2);
        return k;
    }

    public final void J(int i, @InterfaceC7894ly1 K k, boolean z) {
        boolean z2;
        int i2;
        if (i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.d(z2);
        int d2 = EG0.d(k);
        int u = u(k, d2);
        int i3 = this.e1;
        if (u != -1) {
            if (z) {
                i3 = this.f1[u];
                i2 = this.g1[u];
                G(u, d2);
                if (i == this.Z) {
                    i = u;
                }
            } else {
                String valueOf = String.valueOf(k);
                StringBuilder sb = new StringBuilder(valueOf.length() + 28);
                sb.append("Key already present in map: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            i2 = -2;
        }
        if (i3 == i) {
            i3 = this.f1[i];
        } else if (i3 == this.Z) {
            i3 = u;
        }
        if (i2 == i) {
            u = this.g1[i];
        } else if (i2 != this.Z) {
            u = i2;
        }
        L(this.f1[i], this.g1[i]);
        l(i, EG0.d(this.X[i]));
        this.X[i] = k;
        z(i, EG0.d(k));
        L(i3, i);
        L(i, u);
    }

    @Override // o.InterfaceC4626Wm
    @InterfaceC6181ey
    @MB
    public V J3(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
        return C(k, v, true);
    }

    public final void K(int i, @InterfaceC7894ly1 V v, boolean z) {
        boolean z2;
        if (i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.d(z2);
        int d2 = EG0.d(v);
        int w = w(v, d2);
        if (w != -1) {
            if (z) {
                H(w, d2);
                if (i == this.Z) {
                    i = w;
                }
            } else {
                String valueOf = String.valueOf(v);
                StringBuilder sb = new StringBuilder(valueOf.length() + 30);
                sb.append("Value already present in map: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        m(i, EG0.d(this.Y[i]));
        this.Y[i] = v;
        A(i, d2);
    }

    public final void L(int i, int i2) {
        if (i == -2) {
            this.d1 = i2;
        } else {
            this.g1[i] = i2;
        }
        if (i2 == -2) {
            this.e1 = i;
        } else {
            this.f1[i2] = i;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.X, 0, this.Z, (Object) null);
        Arrays.fill(this.Y, 0, this.Z, (Object) null);
        Arrays.fill(this.Z0, -1);
        Arrays.fill(this.a1, -1);
        Arrays.fill(this.b1, 0, this.Z, -1);
        Arrays.fill(this.c1, 0, this.Z, -1);
        Arrays.fill(this.f1, 0, this.Z, -1);
        Arrays.fill(this.g1, 0, this.Z, -1);
        this.Z = 0;
        this.d1 = -2;
        this.e1 = -2;
        this.Y0++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@MB Object obj) {
        if (t(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@MB Object obj) {
        if (v(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.j1;
        if (set == null) {
            c cVar = new c();
            this.j1 = cVar;
            return cVar;
        }
        return set;
    }

    public final int f(int i) {
        return i & (this.Z0.length - 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @MB
    public V get(@MB Object obj) {
        int t = t(obj);
        if (t == -1) {
            return null;
        }
        return this.Y[t];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.h1;
        if (set == null) {
            f fVar = new f();
            this.h1 = fVar;
            return fVar;
        }
        return set;
    }

    public final void l(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        int f2 = f(i2);
        int[] iArr = this.Z0;
        int i3 = iArr[f2];
        if (i3 == i) {
            int[] iArr2 = this.b1;
            iArr[f2] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.b1[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 != -1) {
                if (i3 == i) {
                    int[] iArr3 = this.b1;
                    iArr3[i5] = iArr3[i];
                    iArr3[i] = -1;
                    return;
                }
                i4 = this.b1[i3];
            } else {
                String valueOf = String.valueOf(this.X[i]);
                StringBuilder sb = new StringBuilder(valueOf.length() + 32);
                sb.append("Expected to find entry with key ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            }
        }
    }

    public final void m(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        int f2 = f(i2);
        int[] iArr = this.a1;
        int i3 = iArr[f2];
        if (i3 == i) {
            int[] iArr2 = this.c1;
            iArr[f2] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.c1[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 != -1) {
                if (i3 == i) {
                    int[] iArr3 = this.c1;
                    iArr3[i5] = iArr3[i];
                    iArr3[i] = -1;
                    return;
                }
                i4 = this.c1[i3];
            } else {
                String valueOf = String.valueOf(this.Y[i]);
                StringBuilder sb = new StringBuilder(valueOf.length() + 34);
                sb.append("Expected to find entry with value ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            }
        }
    }

    @Override // o.InterfaceC4626Wm
    public InterfaceC4626Wm<V, K> m5() {
        InterfaceC4626Wm<V, K> interfaceC4626Wm = this.k1;
        if (interfaceC4626Wm == null) {
            d dVar = new d(this);
            this.k1 = dVar;
            return dVar;
        }
        return interfaceC4626Wm;
    }

    public final void n(int i) {
        int[] iArr = this.b1;
        if (iArr.length < i) {
            int f2 = TN0.b.f(iArr.length, i);
            this.X = (K[]) Arrays.copyOf(this.X, f2);
            this.Y = (V[]) Arrays.copyOf(this.Y, f2);
            this.b1 = o(this.b1, f2);
            this.c1 = o(this.c1, f2);
            this.f1 = o(this.f1, f2);
            this.g1 = o(this.g1, f2);
        }
        if (this.Z0.length < i) {
            int a2 = EG0.a(i, 1.0d);
            this.Z0 = k(a2);
            this.a1 = k(a2);
            for (int i2 = 0; i2 < this.Z; i2++) {
                int f3 = f(EG0.d(this.X[i2]));
                int[] iArr2 = this.b1;
                int[] iArr3 = this.Z0;
                iArr2[i2] = iArr3[f3];
                iArr3[f3] = i2;
                int f4 = f(EG0.d(this.Y[i2]));
                int[] iArr4 = this.c1;
                int[] iArr5 = this.a1;
                iArr4[i2] = iArr5[f4];
                iArr5[f4] = i2;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, o.InterfaceC4626Wm
    @InterfaceC6181ey
    @MB
    public V put(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
        return C(k, v, false);
    }

    public int r(@MB Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[f(i)];
        while (i2 != -1) {
            if (C2593Bt1.a(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @InterfaceC6181ey
    @MB
    public V remove(@MB Object obj) {
        int d2 = EG0.d(obj);
        int u = u(obj, d2);
        if (u == -1) {
            return null;
        }
        V v = this.Y[u];
        G(u, d2);
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.Z;
    }

    public int t(@MB Object obj) {
        return u(obj, EG0.d(obj));
    }

    public int u(@MB Object obj, int i) {
        return r(obj, i, this.Z0, this.b1, this.X);
    }

    public int v(@MB Object obj) {
        return w(obj, EG0.d(obj));
    }

    public int w(@MB Object obj, int i) {
        return r(obj, i, this.a1, this.c1, this.Y);
    }

    @MB
    public K x(@MB Object obj) {
        int v = v(obj);
        if (v == -1) {
            return null;
        }
        return this.X[v];
    }

    public void y(int i) {
        C5037aF.b(i, "expectedSize");
        int a2 = EG0.a(i, 1.0d);
        this.Z = 0;
        this.X = (K[]) new Object[i];
        this.Y = (V[]) new Object[i];
        this.Z0 = k(a2);
        this.a1 = k(a2);
        this.b1 = k(i);
        this.c1 = k(i);
        this.d1 = -2;
        this.e1 = -2;
        this.f1 = k(i);
        this.g1 = k(i);
    }

    public final void z(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        int f2 = f(i2);
        int[] iArr = this.b1;
        int[] iArr2 = this.Z0;
        iArr[i] = iArr2[f2];
        iArr2[f2] = i;
    }

    @Override // java.util.AbstractMap, java.util.Map, o.InterfaceC4626Wm
    public Set<V> values() {
        Set<V> set = this.i1;
        if (set == null) {
            g gVar = new g();
            this.i1 = gVar;
            return gVar;
        }
        return set;
    }
}
