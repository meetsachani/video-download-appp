package o;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public class PG<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object e1 = new Object();
    @InterfaceC5299bJ2
    public static final double f1 = 0.001d;
    public static final int g1 = 9;
    @MB
    public transient Object X;
    @MB
    @InterfaceC5299bJ2
    public transient int[] Y;
    @MB
    @InterfaceC5299bJ2
    public transient Object[] Y0;
    @MB
    @InterfaceC5299bJ2
    public transient Object[] Z;
    public transient int Z0;
    public transient int a1;
    @MB
    public transient Set<K> b1;
    @MB
    public transient Set<Map.Entry<K, V>> c1;
    @MB
    public transient Collection<V> d1;

    /* loaded from: classes3.dex */
    public class a extends PG<K, V>.e<K> {
        public a() {
            super(PG.this, null);
        }

        @Override // o.PG.e
        @InterfaceC7894ly1
        public K c(int i) {
            return (K) PG.this.L(i);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends PG<K, V>.e<Map.Entry<K, V>> {
        public b() {
            super(PG.this, null);
        }

        @Override // o.PG.e
        /* renamed from: e */
        public Map.Entry<K, V> c(int i) {
            return new g(i);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends PG<K, V>.e<V> {
        public c() {
            super(PG.this, null);
        }

        @Override // o.PG.e
        @InterfaceC7894ly1
        public V c(int i) {
            return (V) PG.this.g0(i);
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            PG.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            Map<K, V> B = PG.this.B();
            if (B != null) {
                return B.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int I = PG.this.I(entry.getKey());
                if (I != -1 && C2593Bt1.a(PG.this.g0(I), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return PG.this.D();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@MB Object obj) {
            int G;
            int f;
            Map<K, V> B = PG.this.B();
            if (B != null) {
                return B.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (PG.this.P() || (f = RG.f(entry.getKey(), entry.getValue(), (G = PG.this.G()), PG.this.T(), PG.this.R(), PG.this.S(), PG.this.W())) == -1) {
                return false;
            }
            PG.this.O(f, G);
            PG.e(PG.this);
            PG.this.H();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return PG.this.size();
        }
    }

    /* loaded from: classes3.dex */
    public class f extends AbstractSet<K> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            PG.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            return PG.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return PG.this.N();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@MB Object obj) {
            Map<K, V> B = PG.this.B();
            if (B != null) {
                return B.keySet().remove(obj);
            }
            if (PG.this.Q(obj) != PG.e1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return PG.this.size();
        }
    }

    /* loaded from: classes3.dex */
    public final class g extends M1<K, V> {
        @InterfaceC7894ly1
        public final K X;
        public int Y;

        public g(int i) {
            this.X = (K) PG.this.L(i);
            this.Y = i;
        }

        public final void a() {
            int i = this.Y;
            if (i != -1 && i < PG.this.size() && C2593Bt1.a(this.X, PG.this.L(this.Y))) {
                return;
            }
            this.Y = PG.this.I(this.X);
        }

        @Override // o.M1, java.util.Map.Entry
        @InterfaceC7894ly1
        public K getKey() {
            return this.X;
        }

        @Override // o.M1, java.util.Map.Entry
        @InterfaceC7894ly1
        public V getValue() {
            Map<K, V> B = PG.this.B();
            if (B != null) {
                return (V) C2491As1.a(B.get(this.X));
            }
            a();
            int i = this.Y;
            if (i != -1) {
                return (V) PG.this.g0(i);
            }
            return (V) C2491As1.b();
        }

        @Override // o.M1, java.util.Map.Entry
        @InterfaceC7894ly1
        public V setValue(@InterfaceC7894ly1 V v) {
            Map<K, V> B = PG.this.B();
            if (B != null) {
                return (V) C2491As1.a(B.put(this.X, v));
            }
            a();
            int i = this.Y;
            if (i != -1) {
                V v2 = (V) PG.this.g0(i);
                PG.this.e0(this.Y, v);
                return v2;
            }
            PG.this.put(this.X, v);
            return (V) C2491As1.b();
        }
    }

    /* loaded from: classes3.dex */
    public class h extends AbstractCollection<V> {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            PG.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return PG.this.h0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return PG.this.size();
        }
    }

    public PG() {
        J(3);
    }

    public static <K, V> PG<K, V> A(int i) {
        return new PG<>(i);
    }

    public static /* synthetic */ int e(PG pg) {
        int i = pg.a1;
        pg.a1 = i - 1;
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            J(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(readInt);
        throw new InvalidObjectException(sb.toString());
    }

    public static <K, V> PG<K, V> v() {
        return new PG<>();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> D = D();
        while (D.hasNext()) {
            Map.Entry<K, V> next = D.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    @MB
    @InterfaceC5299bJ2
    public Map<K, V> B() {
        Object obj = this.X;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int C(int i) {
        return R()[i];
    }

    public Iterator<Map.Entry<K, V>> D() {
        Map<K, V> B = B();
        if (B != null) {
            return B.entrySet().iterator();
        }
        return new b();
    }

    public int E() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public int F(int i) {
        int i2 = i + 1;
        if (i2 < this.a1) {
            return i2;
        }
        return -1;
    }

    public final int G() {
        return (1 << (this.Z0 & 31)) - 1;
    }

    public void H() {
        this.Z0 += 32;
    }

    public final int I(@MB Object obj) {
        if (P()) {
            return -1;
        }
        int d2 = EG0.d(obj);
        int G = G();
        int h2 = RG.h(T(), d2 & G);
        if (h2 == 0) {
            return -1;
        }
        int b2 = RG.b(d2, G);
        do {
            int i = h2 - 1;
            int C = C(i);
            if (RG.b(C, G) == b2 && C2593Bt1.a(obj, L(i))) {
                return i;
            }
            h2 = RG.c(C, G);
        } while (h2 != 0);
        return -1;
    }

    public void J(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "Expected size must be >= 0");
        this.Z0 = C7775lT0.g(i, 1, 1073741823);
    }

    public void K(int i, @InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v, int i2, int i3) {
        a0(i, RG.d(i2, 0, i3));
        d0(i, k);
        e0(i, v);
    }

    public final K L(int i) {
        return (K) S()[i];
    }

    public Iterator<K> N() {
        Map<K, V> B = B();
        if (B != null) {
            return B.keySet().iterator();
        }
        return new a();
    }

    public void O(int i, int i2) {
        Object T = T();
        int[] R = R();
        Object[] S = S();
        Object[] W = W();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj = S[i3];
            S[i] = obj;
            W[i] = W[i3];
            S[i3] = null;
            W[i3] = null;
            R[i] = R[i3];
            R[i3] = 0;
            int d2 = EG0.d(obj) & i2;
            int h2 = RG.h(T, d2);
            if (h2 == size) {
                RG.i(T, d2, i + 1);
                return;
            }
            while (true) {
                int i4 = h2 - 1;
                int i5 = R[i4];
                int c2 = RG.c(i5, i2);
                if (c2 == size) {
                    R[i4] = RG.d(i5, i + 1, i2);
                    return;
                }
                h2 = c2;
            }
        } else {
            S[i] = null;
            W[i] = null;
            R[i] = 0;
        }
    }

    @InterfaceC5299bJ2
    public boolean P() {
        if (this.X == null) {
            return true;
        }
        return false;
    }

    public final Object Q(@MB Object obj) {
        if (P()) {
            return e1;
        }
        int G = G();
        int f2 = RG.f(obj, null, G, T(), R(), S(), null);
        if (f2 == -1) {
            return e1;
        }
        V g0 = g0(f2);
        O(f2, G);
        this.a1--;
        H();
        return g0;
    }

    public final int[] R() {
        int[] iArr = this.Y;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] S() {
        Object[] objArr = this.Z;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object T() {
        Object obj = this.X;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] W() {
        Object[] objArr = this.Y0;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void X(int i) {
        this.Y = Arrays.copyOf(R(), i);
        this.Z = Arrays.copyOf(S(), i);
        this.Y0 = Arrays.copyOf(W(), i);
    }

    public final void Y(int i) {
        int min;
        int length = R().length;
        if (i > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            X(min);
        }
    }

    @InterfaceC6181ey
    public final int Z(int i, int i2, int i3, int i4) {
        Object a2 = RG.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            RG.i(a2, i3 & i5, i4 + 1);
        }
        Object T = T();
        int[] R = R();
        for (int i6 = 0; i6 <= i; i6++) {
            int h2 = RG.h(T, i6);
            while (h2 != 0) {
                int i7 = h2 - 1;
                int i8 = R[i7];
                int b2 = RG.b(i8, i) | i6;
                int i9 = b2 & i5;
                int h3 = RG.h(a2, i9);
                RG.i(a2, i9, h2);
                R[i7] = RG.d(b2, h3, i5);
                h2 = RG.c(i8, i);
            }
        }
        this.X = a2;
        c0(i5);
        return i5;
    }

    public final void a0(int i, int i2) {
        R()[i] = i2;
    }

    public final void c0(int i) {
        this.Z0 = RG.d(this.Z0, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (P()) {
            return;
        }
        H();
        Map<K, V> B = B();
        if (B != null) {
            this.Z0 = C7775lT0.g(size(), 3, 1073741823);
            B.clear();
            this.X = null;
            this.a1 = 0;
            return;
        }
        Arrays.fill(S(), 0, this.a1, (Object) null);
        Arrays.fill(W(), 0, this.a1, (Object) null);
        RG.g(T());
        Arrays.fill(R(), 0, this.a1, 0);
        this.a1 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@MB Object obj) {
        Map<K, V> B = B();
        if (B != null) {
            return B.containsKey(obj);
        }
        if (I(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@MB Object obj) {
        Map<K, V> B = B();
        if (B != null) {
            return B.containsValue(obj);
        }
        for (int i = 0; i < this.a1; i++) {
            if (C2593Bt1.a(obj, g0(i))) {
                return true;
            }
        }
        return false;
    }

    public final void d0(int i, K k) {
        S()[i] = k;
    }

    public final void e0(int i, V v) {
        W()[i] = v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.c1;
        if (set == null) {
            Set<Map.Entry<K, V>> w = w();
            this.c1 = w;
            return w;
        }
        return set;
    }

    public void f0() {
        if (!P()) {
            Map<K, V> B = B();
            if (B != null) {
                Map<K, V> x = x(size());
                x.putAll(B);
                this.X = x;
                return;
            }
            int i = this.a1;
            if (i < R().length) {
                X(i);
            }
            int j = RG.j(i);
            int G = G();
            if (j < G) {
                Z(G, j, 0, 0);
            }
        }
    }

    public final V g0(int i) {
        return (V) W()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    @MB
    public V get(@MB Object obj) {
        Map<K, V> B = B();
        if (B != null) {
            return B.get(obj);
        }
        int I = I(obj);
        if (I == -1) {
            return null;
        }
        o(I);
        return g0(I);
    }

    public Iterator<V> h0() {
        Map<K, V> B = B();
        if (B != null) {
            return B.values().iterator();
        }
        return new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.b1;
        if (set == null) {
            Set<K> y = y();
            this.b1 = y;
            return y;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @InterfaceC6181ey
    @MB
    public V put(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
        if (P()) {
            t();
        }
        Map<K, V> B = B();
        if (B != null) {
            return B.put(k, v);
        }
        int[] R = R();
        Object[] S = S();
        Object[] W = W();
        int i = this.a1;
        int i2 = i + 1;
        int d2 = EG0.d(k);
        int G = G();
        int i3 = d2 & G;
        int h2 = RG.h(T(), i3);
        if (h2 == 0) {
            if (i2 > G) {
                G = Z(G, RG.e(G), d2, i);
            } else {
                RG.i(T(), i3, i2);
            }
        } else {
            int b2 = RG.b(d2, G);
            int i4 = 0;
            while (true) {
                int i5 = h2 - 1;
                int i6 = R[i5];
                if (RG.b(i6, G) == b2 && C2593Bt1.a(k, S[i5])) {
                    V v2 = (V) W[i5];
                    W[i5] = v;
                    o(i5);
                    return v2;
                }
                int c2 = RG.c(i6, G);
                i4++;
                if (c2 == 0) {
                    if (i4 >= 9) {
                        return u().put(k, v);
                    }
                    if (i2 > G) {
                        G = Z(G, RG.e(G), d2, i);
                    } else {
                        R[i5] = RG.d(i6, i2, G);
                    }
                } else {
                    k = k;
                    v = v;
                    h2 = c2;
                }
            }
        }
        int i7 = G;
        Y(i2);
        K(i, k, v, d2, i7);
        this.a1 = i2;
        H();
        return null;
    }

    public int r(int i, int i2) {
        return i - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @InterfaceC6181ey
    @MB
    public V remove(@MB Object obj) {
        Map<K, V> B = B();
        if (B != null) {
            return B.remove(obj);
        }
        V v = (V) Q(obj);
        if (v == e1) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> B = B();
        if (B != null) {
            return B.size();
        }
        return this.a1;
    }

    @InterfaceC6181ey
    public int t() {
        C10664xF1.h0(P(), "Arrays already allocated");
        int i = this.Z0;
        int j = RG.j(i);
        this.X = RG.a(j);
        c0(j - 1);
        this.Y = new int[i];
        this.Z = new Object[i];
        this.Y0 = new Object[i];
        return i;
    }

    @InterfaceC6181ey
    @InterfaceC5299bJ2
    public Map<K, V> u() {
        Map<K, V> x = x(G() + 1);
        int E = E();
        while (E >= 0) {
            x.put(L(E), g0(E));
            E = F(E);
        }
        this.X = x;
        this.Y = null;
        this.Z = null;
        this.Y0 = null;
        H();
        return x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.d1;
        if (collection == null) {
            Collection<V> z = z();
            this.d1 = z;
            return z;
        }
        return collection;
    }

    public Set<Map.Entry<K, V>> w() {
        return new d();
    }

    public Map<K, V> x(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public Set<K> y() {
        return new f();
    }

    public Collection<V> z() {
        return new h();
    }

    public PG(int i) {
        J(i);
    }

    /* loaded from: classes3.dex */
    public abstract class e<T> implements Iterator<T> {
        public int X;
        public int Y;
        public int Z;

        public e() {
            this.X = PG.this.Z0;
            this.Y = PG.this.E();
            this.Z = -1;
        }

        public final void b() {
            if (PG.this.Z0 == this.X) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @InterfaceC7894ly1
        public abstract T c(int i);

        public void d() {
            this.X += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        @InterfaceC7894ly1
        public T next() {
            b();
            if (hasNext()) {
                int i = this.Y;
                this.Z = i;
                T c = c(i);
                this.Y = PG.this.F(this.Y);
                return c;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            b();
            if (this.Z >= 0) {
                z = true;
            } else {
                z = false;
            }
            C5037aF.e(z);
            d();
            PG pg = PG.this;
            pg.remove(pg.L(this.Z));
            this.Y = PG.this.r(this.Y, this.Z);
            this.Z = -1;
        }

        public /* synthetic */ e(PG pg, a aVar) {
            this();
        }
    }

    public void o(int i) {
    }
}
