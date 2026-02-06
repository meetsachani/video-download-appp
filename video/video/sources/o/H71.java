package o;

import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o.MW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,747:1\n1#2:748\n*E\n"})
/* loaded from: classes3.dex */
public final class H71<K, V> implements Map<K, V>, Serializable, MW0 {
    @NotNull
    public static final a i1 = new a(null);
    public static final int j1 = -1640531527;
    public static final int k1 = 8;
    public static final int l1 = 2;
    public static final int m1 = -1;
    @NotNull
    public static final H71 n1;
    @NotNull
    public K[] X;
    @Nullable
    public V[] Y;
    @NotNull
    public int[] Y0;
    @NotNull
    public int[] Z;
    public int Z0;
    public int a1;
    public int b1;
    public int c1;
    public int d1;
    @Nullable
    public K71<K> e1;
    @Nullable
    public L71<V> f1;
    @Nullable
    public J71<K, V> g1;
    public boolean h1;

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final int c(int i) {
            return Integer.highestOneBit(C5075aO1.u(i, 1) * 3);
        }

        public final int d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }

        @NotNull
        public final H71 e() {
            return H71.n1;
        }

        public a() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, JW0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull H71<K, V> h71) {
            super(h71);
            C6562gT0.p(h71, "map");
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: i */
        public c<K, V> next() {
            b();
            if (c() < e().a1) {
                int c = c();
                g(c + 1);
                h(c);
                c<K, V> cVar = new c<>(e(), d());
                f();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void j(@NotNull StringBuilder sb) {
            C6562gT0.p(sb, "sb");
            if (c() < e().a1) {
                int c = c();
                g(c + 1);
                h(c);
                Object obj = e().X[d()];
                if (obj == e()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = e().Y;
                C6562gT0.m(objArr);
                Object obj2 = objArr[d()];
                if (obj2 == e()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                f();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int k() {
            int i;
            if (c() < e().a1) {
                int c = c();
                g(c + 1);
                h(c);
                Object obj = e().X[d()];
                int i2 = 0;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] objArr = e().Y;
                C6562gT0.m(objArr);
                Object obj2 = objArr[d()];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                }
                int i3 = i ^ i2;
                f();
                return i3;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, MW0.a {
        @NotNull
        public final H71<K, V> X;
        public final int Y;
        public final int Z;

        public c(@NotNull H71<K, V> h71, int i) {
            C6562gT0.p(h71, "map");
            this.X = h71;
            this.Y = i;
            this.Z = h71.c1;
        }

        private final void a() {
            if (this.X.c1 == this.Z) {
                return;
            }
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (C6562gT0.g(entry.getKey(), getKey()) && C6562gT0.g(entry.getValue(), getValue())) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            a();
            return (K) this.X.X[this.Y];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            a();
            Object[] objArr = this.X.Y;
            C6562gT0.m(objArr);
            return (V) objArr[this.Y];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i;
            K key = getKey();
            int i2 = 0;
            if (key != null) {
                i = key.hashCode();
            } else {
                i = 0;
            }
            V value = getValue();
            if (value != null) {
                i2 = value.hashCode();
            }
            return i ^ i2;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            a();
            this.X.n();
            Object[] k = this.X.k();
            int i = this.Y;
            V v2 = (V) k[i];
            k[i] = v;
            return v2;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    @InterfaceC8303na2({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,747:1\n1#2:748\n*E\n"})
    /* loaded from: classes3.dex */
    public static class d<K, V> {
        @NotNull
        public final H71<K, V> X;
        public int Y;
        public int Y0;
        public int Z;

        public d(@NotNull H71<K, V> h71) {
            C6562gT0.p(h71, "map");
            this.X = h71;
            this.Z = -1;
            this.Y0 = h71.c1;
            f();
        }

        public final void b() {
            if (this.X.c1 == this.Y0) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        public final int c() {
            return this.Y;
        }

        public final int d() {
            return this.Z;
        }

        @NotNull
        public final H71<K, V> e() {
            return this.X;
        }

        public final void f() {
            while (this.Y < this.X.a1) {
                int[] iArr = this.X.Z;
                int i = this.Y;
                if (iArr[i] < 0) {
                    this.Y = i + 1;
                } else {
                    return;
                }
            }
        }

        public final void g(int i) {
            this.Y = i;
        }

        public final void h(int i) {
            this.Z = i;
        }

        public final boolean hasNext() {
            if (this.Y < this.X.a1) {
                return true;
            }
            return false;
        }

        public final void remove() {
            b();
            if (this.Z != -1) {
                this.X.n();
                this.X.Q(this.Z);
                this.Z = -1;
                this.Y0 = this.X.c1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
    }

    /* loaded from: classes3.dex */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, JW0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull H71<K, V> h71) {
            super(h71);
            C6562gT0.p(h71, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            b();
            if (c() < e().a1) {
                int c = c();
                g(c + 1);
                h(c);
                K k = (K) e().X[d()];
                f();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes3.dex */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, JW0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull H71<K, V> h71) {
            super(h71);
            C6562gT0.p(h71, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            b();
            if (c() < e().a1) {
                int c = c();
                g(c + 1);
                h(c);
                Object[] objArr = e().Y;
                C6562gT0.m(objArr);
                V v = (V) objArr[d()];
                f();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        H71 h71 = new H71(0);
        h71.h1 = true;
        n1 = h71;
    }

    public H71(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.X = kArr;
        this.Y = vArr;
        this.Z = iArr;
        this.Y0 = iArr2;
        this.Z0 = i;
        this.a1 = i2;
        this.b1 = i1.d(C());
    }

    private final void N() {
        this.c1++;
    }

    private final void v(int i) {
        V[] vArr;
        if (i >= 0) {
            if (i > A()) {
                int e2 = AbstractC8896q1.X.e(A(), i);
                this.X = (K[]) N01.e(this.X, e2);
                V[] vArr2 = this.Y;
                if (vArr2 != null) {
                    vArr = (V[]) N01.e(vArr2, e2);
                } else {
                    vArr = null;
                }
                this.Y = vArr;
                int[] copyOf = Arrays.copyOf(this.Z, e2);
                C6562gT0.o(copyOf, "copyOf(...)");
                this.Z = copyOf;
                int c2 = i1.c(e2);
                if (c2 > C()) {
                    O(c2);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void w(int i) {
        if (W(i)) {
            o(true);
        } else {
            v(this.a1 + i);
        }
    }

    private final Object writeReplace() {
        if (this.h1) {
            return new C11095z12(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int A() {
        return this.X.length;
    }

    @NotNull
    public Set<Map.Entry<K, V>> B() {
        J71<K, V> j71 = this.g1;
        if (j71 == null) {
            J71<K, V> j712 = new J71<>(this);
            this.g1 = j712;
            return j712;
        }
        return j71;
    }

    public final int C() {
        return this.Y0.length;
    }

    @NotNull
    public Set<K> D() {
        K71<K> k71 = this.e1;
        if (k71 == null) {
            K71<K> k712 = new K71<>(this);
            this.e1 = k712;
            return k712;
        }
        return k71;
    }

    public int E() {
        return this.d1;
    }

    @NotNull
    public Collection<V> F() {
        L71<V> l71 = this.f1;
        if (l71 == null) {
            L71<V> l712 = new L71<>(this);
            this.f1 = l712;
            return l712;
        }
        return l71;
    }

    public final int G(K k) {
        int i;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        return (i * (-1640531527)) >>> this.b1;
    }

    public final boolean H() {
        return this.h1;
    }

    @NotNull
    public final e<K, V> I() {
        return new e<>(this);
    }

    public final boolean J(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        w(collection.size());
        for (Map.Entry<? extends K, ? extends V> entry : collection) {
            if (K(entry)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean K(Map.Entry<? extends K, ? extends V> entry) {
        int j = j(entry.getKey());
        V[] k = k();
        if (j >= 0) {
            k[j] = entry.getValue();
            return true;
        }
        int i = (-j) - 1;
        if (!C6562gT0.g(entry.getValue(), k[i])) {
            k[i] = entry.getValue();
            return true;
        }
        return false;
    }

    public final boolean L(int i) {
        int G = G(this.X[i]);
        int i2 = this.Z0;
        while (true) {
            int[] iArr = this.Y0;
            if (iArr[G] == 0) {
                iArr[G] = i + 1;
                this.Z[i] = G;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            int i3 = G - 1;
            if (G == 0) {
                G = C() - 1;
            } else {
                G = i3;
            }
        }
    }

    public final void O(int i) {
        N();
        int i2 = 0;
        if (this.a1 > size()) {
            o(false);
        }
        this.Y0 = new int[i];
        this.b1 = i1.d(i);
        while (i2 < this.a1) {
            int i3 = i2 + 1;
            if (L(i2)) {
                i2 = i3;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    public final boolean P(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        C6562gT0.p(entry, DefaultsXmlParser.a);
        n();
        int y = y(entry.getKey());
        if (y < 0) {
            return false;
        }
        V[] vArr = this.Y;
        C6562gT0.m(vArr);
        if (!C6562gT0.g(vArr[y], entry.getValue())) {
            return false;
        }
        Q(y);
        return true;
    }

    public final void Q(int i) {
        N01.f(this.X, i);
        V[] vArr = this.Y;
        if (vArr != null) {
            N01.f(vArr, i);
        }
        R(this.Z[i]);
        this.Z[i] = -1;
        this.d1 = size() - 1;
        N();
    }

    public final void R(int i) {
        int B = C5075aO1.B(this.Z0 * 2, C() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            int i4 = i - 1;
            if (i == 0) {
                i = C() - 1;
            } else {
                i = i4;
            }
            i2++;
            if (i2 > this.Z0) {
                this.Y0[i3] = 0;
                return;
            }
            int[] iArr = this.Y0;
            int i5 = iArr[i];
            if (i5 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i5 < 0) {
                iArr[i3] = -1;
            } else {
                int i6 = i5 - 1;
                if (((G(this.X[i6]) - i) & (C() - 1)) >= i2) {
                    this.Y0[i3] = i5;
                    this.Z[i6] = i3;
                }
                B--;
            }
            i3 = i;
            i2 = 0;
            B--;
        } while (B >= 0);
        this.Y0[i3] = -1;
    }

    public final boolean S(K k) {
        n();
        int y = y(k);
        if (y < 0) {
            return false;
        }
        Q(y);
        return true;
    }

    public final boolean T(V v) {
        n();
        int z = z(v);
        if (z < 0) {
            return false;
        }
        Q(z);
        return true;
    }

    public final boolean W(int i) {
        int A = A();
        int i2 = this.a1;
        int i3 = A - i2;
        int size = i2 - size();
        if (i3 < i && i3 + size >= i && size >= A() / 4) {
            return true;
        }
        return false;
    }

    @NotNull
    public final f<K, V> X() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        n();
        int i = this.a1 - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.Z;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.Y0[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        N01.g(this.X, 0, this.a1);
        V[] vArr = this.Y;
        if (vArr != null) {
            N01.g(vArr, 0, this.a1);
        }
        this.d1 = 0;
        this.a1 = 0;
        N();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (y(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (z(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return B();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj != this) {
            if (!(obj instanceof Map) || !u((Map) obj)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        int y = y(obj);
        if (y < 0) {
            return null;
        }
        V[] vArr = this.Y;
        C6562gT0.m(vArr);
        return vArr[y];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> x = x();
        int i = 0;
        while (x.hasNext()) {
            i += x.k();
        }
        return i;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final int j(K k) {
        n();
        while (true) {
            int G = G(k);
            int B = C5075aO1.B(this.Z0 * 2, C() / 2);
            int i = 0;
            while (true) {
                int i2 = this.Y0[G];
                if (i2 <= 0) {
                    if (this.a1 >= A()) {
                        w(1);
                    } else {
                        int i3 = this.a1;
                        int i4 = i3 + 1;
                        this.a1 = i4;
                        this.X[i3] = k;
                        this.Z[i3] = G;
                        this.Y0[G] = i4;
                        this.d1 = size() + 1;
                        N();
                        if (i > this.Z0) {
                            this.Z0 = i;
                        }
                        return i3;
                    }
                } else if (C6562gT0.g(this.X[i2 - 1], k)) {
                    return -i2;
                } else {
                    i++;
                    if (i > B) {
                        O(C() * 2);
                        break;
                    }
                    int i5 = G - 1;
                    if (G == 0) {
                        G = C() - 1;
                    } else {
                        G = i5;
                    }
                }
            }
        }
    }

    public final V[] k() {
        V[] vArr = this.Y;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) N01.d(A());
        this.Y = vArr2;
        return vArr2;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return D();
    }

    @NotNull
    public final Map<K, V> l() {
        n();
        this.h1 = true;
        if (size() > 0) {
            return this;
        }
        H71 h71 = n1;
        C6562gT0.n(h71, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return h71;
    }

    public final void n() {
        if (!this.h1) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void o(boolean z) {
        int i;
        V[] vArr = this.Y;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.a1;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.Z;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.X;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.Y0[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        N01.g(this.X, i3, i);
        if (vArr != null) {
            N01.g(vArr, i3, this.a1);
        }
        this.a1 = i3;
    }

    @Override // java.util.Map
    @Nullable
    public V put(K k, V v) {
        n();
        int j = j(k);
        V[] k2 = k();
        if (j < 0) {
            int i = (-j) - 1;
            V v2 = k2[i];
            k2[i] = v;
            return v2;
        }
        k2[j] = v;
        return null;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        C6562gT0.p(map, "from");
        n();
        J(map.entrySet());
    }

    public final boolean r(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!t((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V remove(Object obj) {
        n();
        int y = y(obj);
        if (y < 0) {
            return null;
        }
        V[] vArr = this.Y;
        C6562gT0.m(vArr);
        V v = vArr[y];
        Q(y);
        return v;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return E();
    }

    public final boolean t(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        C6562gT0.p(entry, DefaultsXmlParser.a);
        int y = y(entry.getKey());
        if (y < 0) {
            return false;
        }
        V[] vArr = this.Y;
        C6562gT0.m(vArr);
        return C6562gT0.g(vArr[y], entry.getValue());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b<K, V> x = x();
        int i = 0;
        while (x.hasNext()) {
            if (i > 0) {
                sb.append(C6566gU0.h);
            }
            x.j(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "toString(...)");
        return sb2;
    }

    public final boolean u(Map<?, ?> map) {
        if (size() == map.size() && r(map.entrySet())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return F();
    }

    @NotNull
    public final b<K, V> x() {
        return new b<>(this);
    }

    public final int y(K k) {
        int G = G(k);
        int i = this.Z0;
        while (true) {
            int i2 = this.Y0[G];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (C6562gT0.g(this.X[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = G - 1;
            if (G == 0) {
                G = C() - 1;
            } else {
                G = i4;
            }
        }
    }

    public final int z(V v) {
        int i = this.a1;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.Z[i] >= 0) {
                V[] vArr = this.Y;
                C6562gT0.m(vArr);
                if (C6562gT0.g(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    public H71() {
        this(8);
    }

    public H71(int i) {
        this(N01.d(i), null, new int[i], new int[i1.c(i)], 2, 0);
    }
}
