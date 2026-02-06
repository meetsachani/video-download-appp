package o;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import o.AbstractC6044eO0;
import o.C10856y22;
import o.M71;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.m81  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7935m81 {

    /* renamed from: o.m81$A */
    /* loaded from: classes3.dex */
    public static abstract class A<K, V> extends AbstractMap<K, V> {

        /* renamed from: o.m81$A$a */
        /* loaded from: classes3.dex */
        public class a extends s<K, V> {
            public a() {
            }

            @Override // o.C7935m81.s
            public Map<K, V> i() {
                return A.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return A.this.a();
            }
        }

        public abstract Iterator<Map.Entry<K, V>> a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            C7052iU0.h(a());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();
    }

    /* renamed from: o.m81$B */
    /* loaded from: classes3.dex */
    public static class B<K, V> extends C10856y22.k<K> {
        @GJ2
        public final Map<K, V> X;

        public B(Map<K, V> map) {
            this.X = (Map) C10664xF1.E(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            return i().containsKey(obj);
        }

        public Map<K, V> i() {
            return this.X;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return i().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return C7935m81.S(i().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@MB Object obj) {
            if (contains(obj)) {
                i().remove(obj);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i().size();
        }
    }

    /* renamed from: o.m81$C */
    /* loaded from: classes3.dex */
    public static class C<K, V> implements M71<K, V> {
        public final Map<K, V> a;
        public final Map<K, V> b;
        public final Map<K, V> c;
        public final Map<K, M71.a<V>> d;

        public C(Map<K, V> map, Map<K, V> map2, Map<K, V> map3, Map<K, M71.a<V>> map4) {
            this.a = C7935m81.K0(map);
            this.b = C7935m81.K0(map2);
            this.c = C7935m81.K0(map3);
            this.d = C7935m81.K0(map4);
        }

        @Override // o.M71
        public Map<K, V> a() {
            return this.b;
        }

        @Override // o.M71
        public Map<K, V> b() {
            return this.a;
        }

        @Override // o.M71
        public Map<K, M71.a<V>> c() {
            return this.d;
        }

        @Override // o.M71
        public Map<K, V> d() {
            return this.c;
        }

        @Override // o.M71
        public boolean e() {
            if (this.a.isEmpty() && this.b.isEmpty() && this.d.isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // o.M71
        public boolean equals(@MB Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof M71) {
                M71 m71 = (M71) obj;
                if (b().equals(m71.b()) && a().equals(m71.a()) && d().equals(m71.d()) && c().equals(m71.c())) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.M71
        public int hashCode() {
            return C2593Bt1.b(b(), a(), d(), c());
        }

        public String toString() {
            if (e()) {
                return "equal";
            }
            StringBuilder sb = new StringBuilder("not equal");
            if (!this.a.isEmpty()) {
                sb.append(": only on left=");
                sb.append(this.a);
            }
            if (!this.b.isEmpty()) {
                sb.append(": only on right=");
                sb.append(this.b);
            }
            if (!this.d.isEmpty()) {
                sb.append(": value differences=");
                sb.append(this.d);
            }
            return sb.toString();
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.m81$D */
    /* loaded from: classes3.dex */
    public static final class D<K, V> extends AbstractC8413o2<K, V> {
        public final NavigableSet<K> X;
        public final YA0<? super K, V> Y;

        public D(NavigableSet<K> navigableSet, YA0<? super K, V> ya0) {
            this.X = (NavigableSet) C10664xF1.E(navigableSet);
            this.Y = (YA0) C10664xF1.E(ya0);
        }

        @Override // o.C7935m81.A
        public Iterator<Map.Entry<K, V>> a() {
            return C7935m81.m(this.X, this.Y);
        }

        @Override // o.AbstractC8413o2
        public Iterator<Map.Entry<K, V>> b() {
            return descendingMap().entrySet().iterator();
        }

        @Override // o.C7935m81.A, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.SortedMap
        @MB
        public Comparator<? super K> comparator() {
            return this.X.comparator();
        }

        @Override // o.AbstractC8413o2, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return C7935m81.k(this.X.descendingSet(), this.Y);
        }

        @Override // o.AbstractC8413o2, java.util.AbstractMap, java.util.Map
        @MB
        public V get(@MB Object obj) {
            if (C7232jF.j(this.X, obj)) {
                return this.Y.apply(obj);
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@InterfaceC7894ly1 K k, boolean z) {
            return C7935m81.k(this.X.headSet(k, z), this.Y);
        }

        @Override // o.AbstractC8413o2, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return C7935m81.l0(this.X);
        }

        @Override // o.C7935m81.A, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.X.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@InterfaceC7894ly1 K k, boolean z, @InterfaceC7894ly1 K k2, boolean z2) {
            return C7935m81.k(this.X.subSet(k, z, k2, z2), this.Y);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@InterfaceC7894ly1 K k, boolean z) {
            return C7935m81.k(this.X.tailSet(k, z), this.Y);
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.m81$E */
    /* loaded from: classes3.dex */
    public static class E<K, V> extends G<K, V> implements NavigableSet<K> {
        public E(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        @MB
        public K ceiling(@InterfaceC7894ly1 K k) {
            return j().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return j().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        @MB
        public K floor(@InterfaceC7894ly1 K k) {
            return j().floorKey(k);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@InterfaceC7894ly1 K k, boolean z) {
            return j().headMap(k, z).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        @MB
        public K higher(@InterfaceC7894ly1 K k) {
            return j().higherKey(k);
        }

        @Override // o.C7935m81.G
        /* renamed from: k */
        public NavigableMap<K, V> j() {
            return (NavigableMap) this.X;
        }

        @Override // java.util.NavigableSet
        @MB
        public K lower(@InterfaceC7894ly1 K k) {
            return j().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        @MB
        public K pollFirst() {
            return (K) C7935m81.T(j().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @MB
        public K pollLast() {
            return (K) C7935m81.T(j().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@InterfaceC7894ly1 K k, boolean z, @InterfaceC7894ly1 K k2, boolean z2) {
            return j().subMap(k, z, k2, z2).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@InterfaceC7894ly1 K k, boolean z) {
            return j().tailMap(k, z).navigableKeySet();
        }

        @Override // o.C7935m81.G, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(@InterfaceC7894ly1 K k) {
            return headSet(k, false);
        }

        @Override // o.C7935m81.G, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // o.C7935m81.G, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(@InterfaceC7894ly1 K k) {
            return tailSet(k, true);
        }
    }

    /* renamed from: o.m81$F */
    /* loaded from: classes3.dex */
    public static class F<K, V> extends C7950o<K, V> implements SortedMap<K, V> {
        public F(SortedSet<K> sortedSet, YA0<? super K, V> ya0) {
            super(sortedSet, ya0);
        }

        @Override // java.util.SortedMap
        @MB
        public Comparator<? super K> comparator() {
            return d().comparator();
        }

        @Override // o.C7935m81.C7950o
        /* renamed from: e */
        public SortedSet<K> d() {
            return (SortedSet) super.d();
        }

        @Override // java.util.SortedMap
        @InterfaceC7894ly1
        public K firstKey() {
            return d().first();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@InterfaceC7894ly1 K k) {
            return C7935m81.l(d().headSet(k), this.Z0);
        }

        @Override // o.C7935m81.R, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return C7935m81.n0(d());
        }

        @Override // java.util.SortedMap
        @InterfaceC7894ly1
        public K lastKey() {
            return d().last();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 K k2) {
            return C7935m81.l(d().subSet(k, k2), this.Z0);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@InterfaceC7894ly1 K k) {
            return C7935m81.l(d().tailSet(k), this.Z0);
        }
    }

    /* renamed from: o.m81$G */
    /* loaded from: classes3.dex */
    public static class G<K, V> extends B<K, V> implements SortedSet<K> {
        public G(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        @MB
        public Comparator<? super K> comparator() {
            return i().comparator();
        }

        @Override // java.util.SortedSet
        @InterfaceC7894ly1
        public K first() {
            return i().firstKey();
        }

        public SortedSet<K> headSet(@InterfaceC7894ly1 K k) {
            return new G(i().headMap(k));
        }

        @Override // o.C7935m81.B
        /* renamed from: j */
        public SortedMap<K, V> i() {
            return (SortedMap) super.i();
        }

        @Override // java.util.SortedSet
        @InterfaceC7894ly1
        public K last() {
            return i().lastKey();
        }

        public SortedSet<K> subSet(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 K k2) {
            return new G(i().subMap(k, k2));
        }

        public SortedSet<K> tailSet(@InterfaceC7894ly1 K k) {
            return new G(i().tailMap(k));
        }
    }

    /* renamed from: o.m81$H */
    /* loaded from: classes3.dex */
    public static class H<K, V> extends C<K, V> implements InterfaceC5361ba2<K, V> {
        public H(SortedMap<K, V> sortedMap, SortedMap<K, V> sortedMap2, SortedMap<K, V> sortedMap3, SortedMap<K, M71.a<V>> sortedMap4) {
            super(sortedMap, sortedMap2, sortedMap3, sortedMap4);
        }

        @Override // o.C7935m81.C, o.M71
        public SortedMap<K, V> a() {
            return (SortedMap) super.a();
        }

        @Override // o.C7935m81.C, o.M71
        public SortedMap<K, V> b() {
            return (SortedMap) super.b();
        }

        @Override // o.C7935m81.C, o.M71
        public SortedMap<K, M71.a<V>> c() {
            return (SortedMap) super.c();
        }

        @Override // o.C7935m81.C, o.M71
        public SortedMap<K, V> d() {
            return (SortedMap) super.d();
        }
    }

    /* renamed from: o.m81$I */
    /* loaded from: classes3.dex */
    public static class I<K, V1, V2> extends A<K, V2> {
        public final Map<K, V1> X;
        public final t<? super K, ? super V1, V2> Y;

        public I(Map<K, V1> map, t<? super K, ? super V1, V2> tVar) {
            this.X = (Map) C10664xF1.E(map);
            this.Y = (t) C10664xF1.E(tVar);
        }

        @Override // o.C7935m81.A
        public Iterator<Map.Entry<K, V2>> a() {
            return C7052iU0.c0(this.X.entrySet().iterator(), C7935m81.g(this.Y));
        }

        @Override // o.C7935m81.A, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            return this.X.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V2 get(@MB Object obj) {
            V1 v1 = this.X.get(obj);
            if (v1 == null && !this.X.containsKey(obj)) {
                return null;
            }
            return this.Y.a(obj, (Object) C2491As1.a(v1));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.X.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V2 remove(@MB Object obj) {
            if (this.X.containsKey(obj)) {
                return this.Y.a(obj, (Object) C2491As1.a(this.X.remove(obj)));
            }
            return null;
        }

        @Override // o.C7935m81.A, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.X.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new Q(this);
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.m81$J */
    /* loaded from: classes3.dex */
    public static class J<K, V1, V2> extends K<K, V1, V2> implements NavigableMap<K, V2> {
        public J(NavigableMap<K, V1> navigableMap, t<? super K, ? super V1, V2> tVar) {
            super(navigableMap, tVar);
        }

        @Override // o.C7935m81.K
        /* renamed from: c */
        public NavigableMap<K, V1> b() {
            return (NavigableMap) super.b();
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V2> ceilingEntry(@InterfaceC7894ly1 K k) {
            return g(b().ceilingEntry(k));
        }

        @Override // java.util.NavigableMap
        @MB
        public K ceilingKey(@InterfaceC7894ly1 K k) {
            return b().ceilingKey(k);
        }

        @Override // o.C7935m81.K, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: d */
        public NavigableMap<K, V2> headMap(@InterfaceC7894ly1 K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return b().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> descendingMap() {
            return C7935m81.y0(b().descendingMap(), this.Y);
        }

        @Override // o.C7935m81.K, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: e */
        public NavigableMap<K, V2> subMap(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // o.C7935m81.K, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: f */
        public NavigableMap<K, V2> tailMap(@InterfaceC7894ly1 K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V2> firstEntry() {
            return g(b().firstEntry());
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V2> floorEntry(@InterfaceC7894ly1 K k) {
            return g(b().floorEntry(k));
        }

        @Override // java.util.NavigableMap
        @MB
        public K floorKey(@InterfaceC7894ly1 K k) {
            return b().floorKey(k);
        }

        @MB
        public final Map.Entry<K, V2> g(@MB Map.Entry<K, V1> entry) {
            if (entry == null) {
                return null;
            }
            return C7935m81.A0(this.Y, entry);
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V2> higherEntry(@InterfaceC7894ly1 K k) {
            return g(b().higherEntry(k));
        }

        @Override // java.util.NavigableMap
        @MB
        public K higherKey(@InterfaceC7894ly1 K k) {
            return b().higherKey(k);
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V2> lastEntry() {
            return g(b().lastEntry());
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V2> lowerEntry(@InterfaceC7894ly1 K k) {
            return g(b().lowerEntry(k));
        }

        @Override // java.util.NavigableMap
        @MB
        public K lowerKey(@InterfaceC7894ly1 K k) {
            return b().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return b().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V2> pollFirstEntry() {
            return g(b().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V2> pollLastEntry() {
            return g(b().pollLastEntry());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> headMap(@InterfaceC7894ly1 K k, boolean z) {
            return C7935m81.y0(b().headMap(k, z), this.Y);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> subMap(@InterfaceC7894ly1 K k, boolean z, @InterfaceC7894ly1 K k2, boolean z2) {
            return C7935m81.y0(b().subMap(k, z, k2, z2), this.Y);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(@InterfaceC7894ly1 K k, boolean z) {
            return C7935m81.y0(b().tailMap(k, z), this.Y);
        }
    }

    /* renamed from: o.m81$K */
    /* loaded from: classes3.dex */
    public static class K<K, V1, V2> extends I<K, V1, V2> implements SortedMap<K, V2> {
        public K(SortedMap<K, V1> sortedMap, t<? super K, ? super V1, V2> tVar) {
            super(sortedMap, tVar);
        }

        public SortedMap<K, V1> b() {
            return (SortedMap) this.X;
        }

        @Override // java.util.SortedMap
        @MB
        public Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedMap
        @InterfaceC7894ly1
        public K firstKey() {
            return b().firstKey();
        }

        public SortedMap<K, V2> headMap(@InterfaceC7894ly1 K k) {
            return C7935m81.z0(b().headMap(k), this.Y);
        }

        @Override // java.util.SortedMap
        @InterfaceC7894ly1
        public K lastKey() {
            return b().lastKey();
        }

        public SortedMap<K, V2> subMap(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 K k2) {
            return C7935m81.z0(b().subMap(k, k2), this.Y);
        }

        public SortedMap<K, V2> tailMap(@InterfaceC7894ly1 K k) {
            return C7935m81.z0(b().tailMap(k), this.Y);
        }
    }

    /* renamed from: o.m81$L */
    /* loaded from: classes3.dex */
    public static class L<K, V> extends AbstractC9862ty0<K, V> implements InterfaceC4626Wm<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        public final Map<K, V> X;
        public final InterfaceC4626Wm<? extends K, ? extends V> Y;
        @MB
        public transient Set<V> Y0;
        @MB
        @InterfaceC7537kU1
        public InterfaceC4626Wm<V, K> Z;

        public L(InterfaceC4626Wm<? extends K, ? extends V> interfaceC4626Wm, @MB InterfaceC4626Wm<V, K> interfaceC4626Wm2) {
            this.X = Collections.unmodifiableMap(interfaceC4626Wm);
            this.Y = interfaceC4626Wm;
            this.Z = interfaceC4626Wm2;
        }

        @Override // o.InterfaceC4626Wm
        @MB
        public V J3(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC9862ty0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public Map<K, V> L5() {
            return this.X;
        }

        @Override // o.InterfaceC4626Wm
        public InterfaceC4626Wm<V, K> m5() {
            InterfaceC4626Wm<V, K> interfaceC4626Wm = this.Z;
            if (interfaceC4626Wm == null) {
                L l = new L(this.Y.m5(), this);
                this.Z = l;
                return l;
            }
            return interfaceC4626Wm;
        }

        @Override // o.AbstractC9862ty0, java.util.Map, o.InterfaceC4626Wm
        public Set<V> values() {
            Set<V> set = this.Y0;
            if (set == null) {
                Set<V> unmodifiableSet = Collections.unmodifiableSet(this.Y.values());
                this.Y0 = unmodifiableSet;
                return unmodifiableSet;
            }
            return set;
        }
    }

    /* renamed from: o.m81$M */
    /* loaded from: classes3.dex */
    public static class M<K, V> extends AbstractC4473Ux0<Map.Entry<K, V>> {
        public final Collection<Map.Entry<K, V>> X;

        public M(Collection<Map.Entry<K, V>> collection) {
            this.X = collection;
        }

        @Override // o.AbstractC4473Ux0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public Collection<Map.Entry<K, V>> L5() {
            return this.X;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
        public Iterator<Map.Entry<K, V>> iterator() {
            return C7935m81.I0(this.X.iterator());
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return V5();
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) W5(tArr);
        }
    }

    /* renamed from: o.m81$N */
    /* loaded from: classes3.dex */
    public static class N<K, V> extends M<K, V> implements Set<Map.Entry<K, V>> {
        public N(Set<Map.Entry<K, V>> set) {
            super(set);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@MB Object obj) {
            return C10856y22.g(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return C10856y22.k(this);
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.m81$O */
    /* loaded from: classes3.dex */
    public static class O<K, V> extends AbstractC3109Gy0<K, V> implements NavigableMap<K, V>, Serializable {
        public final NavigableMap<K, ? extends V> X;
        @MB
        public transient O<K, V> Y;

        public O(NavigableMap<K, ? extends V> navigableMap) {
            this.X = navigableMap;
        }

        @Override // o.AbstractC3109Gy0, o.AbstractC9862ty0
        /* renamed from: W5 */
        public SortedMap<K, V> M5() {
            return Collections.unmodifiableSortedMap(this.X);
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> ceilingEntry(@InterfaceC7894ly1 K k) {
            return C7935m81.M0(this.X.ceilingEntry(k));
        }

        @Override // java.util.NavigableMap
        @MB
        public K ceilingKey(@InterfaceC7894ly1 K k) {
            return this.X.ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return C10856y22.O(this.X.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            O<K, V> o2 = this.Y;
            if (o2 == null) {
                O<K, V> o3 = new O<>(this.X.descendingMap(), this);
                this.Y = o3;
                return o3;
            }
            return o2;
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> firstEntry() {
            return C7935m81.M0(this.X.firstEntry());
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> floorEntry(@InterfaceC7894ly1 K k) {
            return C7935m81.M0(this.X.floorEntry(k));
        }

        @Override // java.util.NavigableMap
        @MB
        public K floorKey(@InterfaceC7894ly1 K k) {
            return this.X.floorKey(k);
        }

        @Override // o.AbstractC3109Gy0, java.util.SortedMap
        public SortedMap<K, V> headMap(@InterfaceC7894ly1 K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> higherEntry(@InterfaceC7894ly1 K k) {
            return C7935m81.M0(this.X.higherEntry(k));
        }

        @Override // java.util.NavigableMap
        @MB
        public K higherKey(@InterfaceC7894ly1 K k) {
            return this.X.higherKey(k);
        }

        @Override // o.AbstractC9862ty0, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> lastEntry() {
            return C7935m81.M0(this.X.lastEntry());
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> lowerEntry(@InterfaceC7894ly1 K k) {
            return C7935m81.M0(this.X.lowerEntry(k));
        }

        @Override // java.util.NavigableMap
        @MB
        public K lowerKey(@InterfaceC7894ly1 K k) {
            return this.X.lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return C10856y22.O(this.X.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        @MB
        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        @MB
        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC3109Gy0, java.util.SortedMap
        public SortedMap<K, V> subMap(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // o.AbstractC3109Gy0, java.util.SortedMap
        public SortedMap<K, V> tailMap(@InterfaceC7894ly1 K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@InterfaceC7894ly1 K k, boolean z) {
            return C7935m81.L0(this.X.headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@InterfaceC7894ly1 K k, boolean z, @InterfaceC7894ly1 K k2, boolean z2) {
            return C7935m81.L0(this.X.subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@InterfaceC7894ly1 K k, boolean z) {
            return C7935m81.L0(this.X.tailMap(k, z));
        }

        public O(NavigableMap<K, ? extends V> navigableMap, O<K, V> o2) {
            this.X = navigableMap;
            this.Y = o2;
        }
    }

    /* renamed from: o.m81$P */
    /* loaded from: classes3.dex */
    public static class P<V> implements M71.a<V> {
        @InterfaceC7894ly1
        public final V a;
        @InterfaceC7894ly1
        public final V b;

        public P(@InterfaceC7894ly1 V v, @InterfaceC7894ly1 V v2) {
            this.a = v;
            this.b = v2;
        }

        public static <V> M71.a<V> c(@InterfaceC7894ly1 V v, @InterfaceC7894ly1 V v2) {
            return new P(v, v2);
        }

        @Override // o.M71.a
        @InterfaceC7894ly1
        public V a() {
            return this.a;
        }

        @Override // o.M71.a
        @InterfaceC7894ly1
        public V b() {
            return this.b;
        }

        @Override // o.M71.a
        public boolean equals(@MB Object obj) {
            if (obj instanceof M71.a) {
                M71.a aVar = (M71.a) obj;
                if (C2593Bt1.a(this.a, aVar.a()) && C2593Bt1.a(this.b, aVar.b())) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.M71.a
        public int hashCode() {
            return C2593Bt1.b(this.a, this.b);
        }

        public String toString() {
            String valueOf = String.valueOf(this.a);
            String valueOf2 = String.valueOf(this.b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 4 + valueOf2.length());
            sb.append(C9811tl1.c);
            sb.append(valueOf);
            sb.append(C6566gU0.h);
            sb.append(valueOf2);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.m81$Q */
    /* loaded from: classes3.dex */
    public static class Q<K, V> extends AbstractCollection<V> {
        @GJ2
        public final Map<K, V> X;

        public Q(Map<K, V> map) {
            this.X = (Map) C10664xF1.E(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@MB Object obj) {
            return d().containsValue(obj);
        }

        public final Map<K, V> d() {
            return this.X;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return d().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return C7935m81.O0(d().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@MB Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : d().entrySet()) {
                    if (C2593Bt1.a(obj, entry.getValue())) {
                        d().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C10664xF1.E(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet u = C10856y22.u();
                for (Map.Entry<K, V> entry : d().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        u.add(entry.getKey());
                    }
                }
                return d().keySet().removeAll(u);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C10664xF1.E(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet u = C10856y22.u();
                for (Map.Entry<K, V> entry : d().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        u.add(entry.getKey());
                    }
                }
                return d().keySet().retainAll(u);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return d().size();
        }
    }

    @InterfaceC10420wF0
    /* renamed from: o.m81$R */
    /* loaded from: classes3.dex */
    public static abstract class R<K, V> extends AbstractMap<K, V> {
        @MB
        public transient Set<Map.Entry<K, V>> X;
        @MB
        public transient Set<K> Y;
        @MB
        public transient Collection<V> Z;

        public abstract Set<Map.Entry<K, V>> a();

        public Set<K> b() {
            return new B(this);
        }

        public Collection<V> c() {
            return new Q(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.X;
            if (set == null) {
                Set<Map.Entry<K, V>> a = a();
                this.X = a;
                return a;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.Y;
            if (set == null) {
                Set<K> b = b();
                this.Y = b;
                return b;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.Z;
            if (collection == null) {
                Collection<V> c = c();
                this.Z = c;
                return c;
            }
            return collection;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V1, V2] */
    /* renamed from: o.m81$a  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C7936a<V1, V2> implements YA0<V1, V2> {
        public final /* synthetic */ t X;
        public final /* synthetic */ Object Y;

        public C7936a(t tVar, Object obj) {
            this.X = tVar;
            this.Y = obj;
        }

        @Override // o.YA0
        @InterfaceC7894ly1
        public V2 apply(@InterfaceC7894ly1 V1 v1) {
            return (V2) this.X.a(this.Y, v1);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* renamed from: o.m81$b  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C7937b<K, V1, V2> implements YA0<Map.Entry<K, V1>, V2> {
        public final /* synthetic */ t X;

        public C7937b(t tVar) {
            this.X = tVar;
        }

        @Override // o.YA0
        @InterfaceC7894ly1
        /* renamed from: a */
        public V2 apply(Map.Entry<K, V1> entry) {
            return (V2) this.X.a(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V2] */
    /* renamed from: o.m81$c  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C7938c<K, V2> extends M1<K, V2> {
        public final /* synthetic */ Map.Entry X;
        public final /* synthetic */ t Y;

        public C7938c(Map.Entry entry, t tVar) {
            this.X = entry;
            this.Y = tVar;
        }

        @Override // o.M1, java.util.Map.Entry
        @InterfaceC7894ly1
        public K getKey() {
            return (K) this.X.getKey();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.M1, java.util.Map.Entry
        @InterfaceC7894ly1
        public V2 getValue() {
            return (V2) this.Y.a(this.X.getKey(), this.X.getValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* renamed from: o.m81$d  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C7939d<K, V1, V2> implements YA0<Map.Entry<K, V1>, Map.Entry<K, V2>> {
        public final /* synthetic */ t X;

        public C7939d(t tVar) {
            this.X = tVar;
        }

        @Override // o.YA0
        /* renamed from: a */
        public Map.Entry<K, V2> apply(Map.Entry<K, V1> entry) {
            return C7935m81.A0(this.X, entry);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: o.m81$e  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C7940e<K, V> extends AbstractC8375ns2<Map.Entry<K, V>, K> {
        public C7940e(Iterator it) {
            super(it);
        }

        @Override // o.AbstractC8375ns2
        @InterfaceC7894ly1
        /* renamed from: c */
        public K b(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: o.m81$f  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C7941f<K, V> extends AbstractC8375ns2<Map.Entry<K, V>, V> {
        public C7941f(Iterator it) {
            super(it);
        }

        @Override // o.AbstractC8375ns2
        @InterfaceC7894ly1
        /* renamed from: c */
        public V b(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: o.m81$g  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C7942g<K, V> extends AbstractC8375ns2<K, Map.Entry<K, V>> {
        public final /* synthetic */ YA0 Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7942g(Iterator it, YA0 ya0) {
            super(it);
            this.Y = ya0;
        }

        @Override // o.AbstractC8375ns2
        /* renamed from: c */
        public Map.Entry<K, V> b(@InterfaceC7894ly1 K k) {
            return C7935m81.O(k, this.Y.apply(k));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.m81$h  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C7943h<E> extends AbstractC2804Dy0<E> {
        public final /* synthetic */ Set X;

        public C7943h(Set set) {
            this.X = set;
        }

        @Override // o.AbstractC2804Dy0, o.AbstractC4473Ux0
        /* renamed from: Y5 */
        public Set<E> M5() {
            return this.X;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean add(@InterfaceC7894ly1 E e) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.m81$i  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C7944i<E> extends AbstractC3305Iy0<E> {
        public final /* synthetic */ SortedSet X;

        public C7944i(SortedSet sortedSet) {
            this.X = sortedSet;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean add(@InterfaceC7894ly1 E e) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC3305Iy0, o.AbstractC2804Dy0
        /* renamed from: b6 */
        public SortedSet<E> Y5() {
            return this.X;
        }

        @Override // o.AbstractC3305Iy0, java.util.SortedSet
        public SortedSet<E> headSet(@InterfaceC7894ly1 E e) {
            return C7935m81.n0(super.headSet(e));
        }

        @Override // o.AbstractC3305Iy0, java.util.SortedSet
        public SortedSet<E> subSet(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2) {
            return C7935m81.n0(super.subSet(e, e2));
        }

        @Override // o.AbstractC3305Iy0, java.util.SortedSet
        public SortedSet<E> tailSet(@InterfaceC7894ly1 E e) {
            return C7935m81.n0(super.tailSet(e));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.m81$j  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C7945j<E> extends AbstractC11080yy0<E> {
        public final /* synthetic */ NavigableSet X;

        public C7945j(NavigableSet navigableSet) {
            this.X = navigableSet;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean add(@InterfaceC7894ly1 E e) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC11080yy0, o.AbstractC3305Iy0
        /* renamed from: d6 */
        public NavigableSet<E> b6() {
            return this.X;
        }

        @Override // o.AbstractC11080yy0, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return C7935m81.l0(super.descendingSet());
        }

        @Override // o.AbstractC3305Iy0, java.util.SortedSet
        public SortedSet<E> headSet(@InterfaceC7894ly1 E e) {
            return C7935m81.n0(super.headSet(e));
        }

        @Override // o.AbstractC3305Iy0, java.util.SortedSet
        public SortedSet<E> subSet(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2) {
            return C7935m81.n0(super.subSet(e, e2));
        }

        @Override // o.AbstractC3305Iy0, java.util.SortedSet
        public SortedSet<E> tailSet(@InterfaceC7894ly1 E e) {
            return C7935m81.n0(super.tailSet(e));
        }

        @Override // o.AbstractC11080yy0, java.util.NavigableSet
        public NavigableSet<E> headSet(@InterfaceC7894ly1 E e, boolean z) {
            return C7935m81.l0(super.headSet(e, z));
        }

        @Override // o.AbstractC11080yy0, java.util.NavigableSet
        public NavigableSet<E> subSet(@InterfaceC7894ly1 E e, boolean z, @InterfaceC7894ly1 E e2, boolean z2) {
            return C7935m81.l0(super.subSet(e, z, e2, z2));
        }

        @Override // o.AbstractC11080yy0, java.util.NavigableSet
        public NavigableSet<E> tailSet(@InterfaceC7894ly1 E e, boolean z) {
            return C7935m81.l0(super.tailSet(e, z));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: o.m81$k  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C7946k<K, V> extends M1<K, V> {
        public final /* synthetic */ Map.Entry X;

        public C7946k(Map.Entry entry) {
            this.X = entry;
        }

        @Override // o.M1, java.util.Map.Entry
        @InterfaceC7894ly1
        public K getKey() {
            return (K) this.X.getKey();
        }

        @Override // o.M1, java.util.Map.Entry
        @InterfaceC7894ly1
        public V getValue() {
            return (V) this.X.getValue();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: o.m81$l  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C7947l<K, V> extends AbstractC6237fB2<Map.Entry<K, V>> {
        public final /* synthetic */ Iterator X;

        public C7947l(Iterator it) {
            this.X = it;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            return C7935m81.H0((Map.Entry) this.X.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.X.hasNext();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* renamed from: o.m81$m  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C7948m<K, V1, V2> implements t<K, V1, V2> {
        public final /* synthetic */ YA0 a;

        public C7948m(YA0 ya0) {
            this.a = ya0;
        }

        @Override // o.C7935m81.t
        @InterfaceC7894ly1
        public V2 a(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V1 v1) {
            return (V2) this.a.apply(v1);
        }
    }

    /* renamed from: o.m81$n  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC7949n<K, V> extends R<K, V> {
        public final Map<K, V> Y0;
        public final IF1<? super Map.Entry<K, V>> Z0;

        public AbstractC7949n(Map<K, V> map, IF1<? super Map.Entry<K, V>> if1) {
            this.Y0 = map;
            this.Z0 = if1;
        }

        @Override // o.C7935m81.R
        public Collection<V> c() {
            return new z(this, this.Y0, this.Z0);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            if (this.Y0.containsKey(obj) && d(obj, this.Y0.get(obj))) {
                return true;
            }
            return false;
        }

        public boolean d(@MB Object obj, @InterfaceC7894ly1 V v) {
            return this.Z0.apply(C7935m81.O(obj, v));
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V get(@MB Object obj) {
            V v = this.Y0.get(obj);
            if (v != null && d(obj, v)) {
                return v;
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V put(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
            C10664xF1.d(d(k, v));
            return this.Y0.put(k, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                C10664xF1.d(d(entry.getKey(), entry.getValue()));
            }
            this.Y0.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V remove(@MB Object obj) {
            if (containsKey(obj)) {
                return this.Y0.remove(obj);
            }
            return null;
        }
    }

    /* renamed from: o.m81$o  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static class C7950o<K, V> extends R<K, V> {
        public final Set<K> Y0;
        public final YA0<? super K, V> Z0;

        /* renamed from: o.m81$o$a */
        /* loaded from: classes3.dex */
        public class a extends s<K, V> {
            public a() {
            }

            @Override // o.C7935m81.s
            public Map<K, V> i() {
                return C7950o.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return C7935m81.m(C7950o.this.d(), C7950o.this.Z0);
            }
        }

        public C7950o(Set<K> set, YA0<? super K, V> ya0) {
            this.Y0 = (Set) C10664xF1.E(set);
            this.Z0 = (YA0) C10664xF1.E(ya0);
        }

        @Override // o.C7935m81.R
        public Set<Map.Entry<K, V>> a() {
            return new a();
        }

        @Override // o.C7935m81.R
        public Set<K> b() {
            return C7935m81.m0(d());
        }

        @Override // o.C7935m81.R
        public Collection<V> c() {
            return C7232jF.m(this.Y0, this.Z0);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            return d().contains(obj);
        }

        public Set<K> d() {
            return this.Y0;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V get(@MB Object obj) {
            if (C7232jF.j(d(), obj)) {
                return this.Z0.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V remove(@MB Object obj) {
            if (d().remove(obj)) {
                return this.Z0.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return d().size();
        }
    }

    /* renamed from: o.m81$p  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C7951p<A, B> extends AbstractC7264jN<A, B> implements Serializable {
        private static final long serialVersionUID = 0;
        public final InterfaceC4626Wm<A, B> Z;

        public C7951p(InterfaceC4626Wm<A, B> interfaceC4626Wm) {
            this.Z = (InterfaceC4626Wm) C10664xF1.E(interfaceC4626Wm);
        }

        public static <X, Y> Y o(InterfaceC4626Wm<X, Y> interfaceC4626Wm, X x) {
            boolean z;
            Y y = interfaceC4626Wm.get(x);
            if (y != null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.u(z, "No non-null mapping present for input: %s", x);
            return y;
        }

        @Override // o.AbstractC7264jN, o.YA0
        public boolean equals(@MB Object obj) {
            if (obj instanceof C7951p) {
                return this.Z.equals(((C7951p) obj).Z);
            }
            return false;
        }

        @Override // o.AbstractC7264jN
        public A g(B b) {
            return (A) o(this.Z.m5(), b);
        }

        @Override // o.AbstractC7264jN
        public B h(A a) {
            return (B) o(this.Z, a);
        }

        public int hashCode() {
            return this.Z.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.Z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 18);
            sb.append("Maps.asConverter(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.m81$q  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC7952q<K, V> extends AbstractC9862ty0<K, V> implements NavigableMap<K, V> {
        @MB
        public transient Comparator<? super K> X;
        @MB
        public transient Set<Map.Entry<K, V>> Y;
        @MB
        public transient NavigableSet<K> Z;

        /* renamed from: o.m81$q$a */
        /* loaded from: classes3.dex */
        public class a extends s<K, V> {
            public a() {
            }

            @Override // o.C7935m81.s
            public Map<K, V> i() {
                return AbstractC7952q.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return AbstractC7952q.this.X5();
            }
        }

        private static <T> AbstractC10587ww1<T> Z5(Comparator<T> comparator) {
            return AbstractC10587ww1.h(comparator).E();
        }

        @Override // o.AbstractC9862ty0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public final Map<K, V> L5() {
            return Y5();
        }

        public Set<Map.Entry<K, V>> W5() {
            return new a();
        }

        public abstract Iterator<Map.Entry<K, V>> X5();

        public abstract NavigableMap<K, V> Y5();

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> ceilingEntry(@InterfaceC7894ly1 K k) {
            return Y5().floorEntry(k);
        }

        @Override // java.util.NavigableMap
        @MB
        public K ceilingKey(@InterfaceC7894ly1 K k) {
            return Y5().floorKey(k);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.X;
            if (comparator == null) {
                Comparator<? super K> comparator2 = Y5().comparator();
                if (comparator2 == null) {
                    comparator2 = AbstractC10587ww1.z();
                }
                AbstractC10587ww1 Z5 = Z5(comparator2);
                this.X = Z5;
                return Z5;
            }
            return comparator;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return Y5().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return Y5();
        }

        @Override // o.AbstractC9862ty0, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.Y;
            if (set == null) {
                Set<Map.Entry<K, V>> W5 = W5();
                this.Y = W5;
                return W5;
            }
            return set;
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> firstEntry() {
            return Y5().lastEntry();
        }

        @Override // java.util.SortedMap
        @InterfaceC7894ly1
        public K firstKey() {
            return Y5().lastKey();
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> floorEntry(@InterfaceC7894ly1 K k) {
            return Y5().ceilingEntry(k);
        }

        @Override // java.util.NavigableMap
        @MB
        public K floorKey(@InterfaceC7894ly1 K k) {
            return Y5().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@InterfaceC7894ly1 K k, boolean z) {
            return Y5().tailMap(k, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> higherEntry(@InterfaceC7894ly1 K k) {
            return Y5().lowerEntry(k);
        }

        @Override // java.util.NavigableMap
        @MB
        public K higherKey(@InterfaceC7894ly1 K k) {
            return Y5().lowerKey(k);
        }

        @Override // o.AbstractC9862ty0, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> lastEntry() {
            return Y5().firstEntry();
        }

        @Override // java.util.SortedMap
        @InterfaceC7894ly1
        public K lastKey() {
            return Y5().firstKey();
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> lowerEntry(@InterfaceC7894ly1 K k) {
            return Y5().higherEntry(k);
        }

        @Override // java.util.NavigableMap
        @MB
        public K lowerKey(@InterfaceC7894ly1 K k) {
            return Y5().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.Z;
            if (navigableSet == null) {
                E e = new E(this);
                this.Z = e;
                return e;
            }
            return navigableSet;
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> pollFirstEntry() {
            return Y5().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> pollLastEntry() {
            return Y5().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@InterfaceC7894ly1 K k, boolean z, @InterfaceC7894ly1 K k2, boolean z2) {
            return Y5().subMap(k2, z2, k, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@InterfaceC7894ly1 K k, boolean z) {
            return Y5().headMap(k, z).descendingMap();
        }

        @Override // o.AbstractC2510Ay0
        public String toString() {
            return V5();
        }

        @Override // o.AbstractC9862ty0, java.util.Map, o.InterfaceC4626Wm
        public Collection<V> values() {
            return new Q(this);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(@InterfaceC7894ly1 K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(@InterfaceC7894ly1 K k) {
            return tailMap(k, true);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.m81$r  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static abstract class EnumC7953r implements YA0<Map.Entry<?, ?>, Object> {
        public static final EnumC7953r X = new a("KEY", 0);
        public static final EnumC7953r Y = new b("VALUE", 1);
        public static final /* synthetic */ EnumC7953r[] Z = e();

        /* renamed from: o.m81$r$a */
        /* loaded from: classes3.dex */
        public enum a extends EnumC7953r {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // o.YA0
            @MB
            /* renamed from: g */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* renamed from: o.m81$r$b */
        /* loaded from: classes3.dex */
        public enum b extends EnumC7953r {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // o.YA0
            @MB
            /* renamed from: g */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        public EnumC7953r(String str, int i) {
        }

        public static /* synthetic */ EnumC7953r[] e() {
            return new EnumC7953r[]{X, Y};
        }

        public static EnumC7953r valueOf(String str) {
            return (EnumC7953r) Enum.valueOf(EnumC7953r.class, str);
        }

        public static EnumC7953r[] values() {
            return (EnumC7953r[]) Z.clone();
        }

        public /* synthetic */ EnumC7953r(String str, int i, C7940e c7940e) {
            this(str, i);
        }
    }

    /* renamed from: o.m81$s */
    /* loaded from: classes3.dex */
    public static abstract class s<K, V> extends C10856y22.k<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object p0 = C7935m81.p0(i(), key);
                if (C2593Bt1.a(p0, entry.getValue()) && (p0 != null || i().containsKey(key))) {
                    return true;
                }
            }
            return false;
        }

        public abstract Map<K, V> i();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return i().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@MB Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return i().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // o.C10856y22.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C10664xF1.E(collection));
            } catch (UnsupportedOperationException unused) {
                return C10856y22.J(this, collection.iterator());
            }
        }

        @Override // o.C10856y22.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C10664xF1.E(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet y = C10856y22.y(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        y.add(((Map.Entry) obj).getKey());
                    }
                }
                return i().keySet().retainAll(y);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i().size();
        }
    }

    /* renamed from: o.m81$t */
    /* loaded from: classes3.dex */
    public interface t<K, V1, V2> {
        V2 a(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V1 v1);
    }

    /* renamed from: o.m81$u */
    /* loaded from: classes3.dex */
    public static final class u<K, V> extends v<K, V> implements InterfaceC4626Wm<K, V> {
        @InterfaceC7537kU1
        public final InterfaceC4626Wm<V, K> b1;

        /* renamed from: o.m81$u$a */
        /* loaded from: classes3.dex */
        public class a implements IF1<Map.Entry<V, K>> {
            public final /* synthetic */ IF1 X;

            public a(IF1 if1) {
                this.X = if1;
            }

            @Override // o.IF1
            /* renamed from: a */
            public boolean apply(Map.Entry<V, K> entry) {
                return this.X.apply(C7935m81.O(entry.getValue(), entry.getKey()));
            }
        }

        public u(InterfaceC4626Wm<K, V> interfaceC4626Wm, IF1<? super Map.Entry<K, V>> if1) {
            super(interfaceC4626Wm, if1);
            this.b1 = new u(interfaceC4626Wm.m5(), g(if1), this);
        }

        public static <K, V> IF1<Map.Entry<V, K>> g(IF1<? super Map.Entry<K, V>> if1) {
            return new a(if1);
        }

        @Override // o.InterfaceC4626Wm
        @MB
        public V J3(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
            C10664xF1.d(d(k, v));
            return i().J3(k, v);
        }

        public InterfaceC4626Wm<K, V> i() {
            return (InterfaceC4626Wm) this.Y0;
        }

        @Override // o.InterfaceC4626Wm
        public InterfaceC4626Wm<V, K> m5() {
            return this.b1;
        }

        @Override // o.C7935m81.R, java.util.AbstractMap, java.util.Map
        public Set<V> values() {
            return this.b1.keySet();
        }

        public u(InterfaceC4626Wm<K, V> interfaceC4626Wm, IF1<? super Map.Entry<K, V>> if1, InterfaceC4626Wm<V, K> interfaceC4626Wm2) {
            super(interfaceC4626Wm, if1);
            this.b1 = interfaceC4626Wm2;
        }
    }

    /* renamed from: o.m81$v */
    /* loaded from: classes3.dex */
    public static class v<K, V> extends AbstractC7949n<K, V> {
        public final Set<Map.Entry<K, V>> a1;

        /* renamed from: o.m81$v$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC2804Dy0<Map.Entry<K, V>> {

            /* renamed from: o.m81$v$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0306a extends AbstractC8375ns2<Map.Entry<K, V>, Map.Entry<K, V>> {

                /* renamed from: o.m81$v$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public class C0307a extends AbstractC10105uy0<K, V> {
                    public final /* synthetic */ Map.Entry X;

                    public C0307a(Map.Entry entry) {
                        this.X = entry;
                    }

                    @Override // o.AbstractC10105uy0, o.AbstractC2510Ay0
                    /* renamed from: M5 */
                    public Map.Entry<K, V> L5() {
                        return this.X;
                    }

                    @Override // o.AbstractC10105uy0, java.util.Map.Entry
                    @InterfaceC7894ly1
                    public V setValue(@InterfaceC7894ly1 V v) {
                        C10664xF1.d(v.this.d(getKey(), v));
                        return (V) super.setValue(v);
                    }
                }

                public C0306a(Iterator it) {
                    super(it);
                }

                @Override // o.AbstractC8375ns2
                /* renamed from: c */
                public Map.Entry<K, V> b(Map.Entry<K, V> entry) {
                    return new C0307a(entry);
                }
            }

            public a() {
            }

            @Override // o.AbstractC2804Dy0, o.AbstractC4473Ux0
            /* renamed from: Y5 */
            public Set<Map.Entry<K, V>> M5() {
                return v.this.a1;
            }

            @Override // o.AbstractC4473Ux0, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
            public Iterator<Map.Entry<K, V>> iterator() {
                return new C0306a(v.this.a1.iterator());
            }

            public /* synthetic */ a(v vVar, C7940e c7940e) {
                this();
            }
        }

        /* renamed from: o.m81$v$b */
        /* loaded from: classes3.dex */
        public class b extends B<K, V> {
            public b() {
                super(v.this);
            }

            @Override // o.C7935m81.B, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@MB Object obj) {
                if (v.this.containsKey(obj)) {
                    v.this.Y0.remove(obj);
                    return true;
                }
                return false;
            }

            @Override // o.C10856y22.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                v vVar = v.this;
                return v.e(vVar.Y0, vVar.Z0, collection);
            }

            @Override // o.C10856y22.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                v vVar = v.this;
                return v.f(vVar.Y0, vVar.Z0, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return C10608x11.s(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) C10608x11.s(iterator()).toArray(tArr);
            }
        }

        public v(Map<K, V> map, IF1<? super Map.Entry<K, V>> if1) {
            super(map, if1);
            this.a1 = C10856y22.i(map.entrySet(), this.Z0);
        }

        public static <K, V> boolean e(Map<K, V> map, IF1<? super Map.Entry<K, V>> if1, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (if1.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public static <K, V> boolean f(Map<K, V> map, IF1<? super Map.Entry<K, V>> if1, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (if1.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // o.C7935m81.R
        public Set<Map.Entry<K, V>> a() {
            return new a(this, null);
        }

        @Override // o.C7935m81.R
        public Set<K> b() {
            return new b();
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.m81$w */
    /* loaded from: classes3.dex */
    public static class w<K, V> extends AbstractC8413o2<K, V> {
        public final NavigableMap<K, V> X;
        public final IF1<? super Map.Entry<K, V>> Y;
        public final Map<K, V> Z;

        /* renamed from: o.m81$w$a */
        /* loaded from: classes3.dex */
        public class a extends E<K, V> {
            public a(NavigableMap navigableMap) {
                super(navigableMap);
            }

            @Override // o.C10856y22.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return v.e(w.this.X, w.this.Y, collection);
            }

            @Override // o.C10856y22.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return v.f(w.this.X, w.this.Y, collection);
            }
        }

        public w(NavigableMap<K, V> navigableMap, IF1<? super Map.Entry<K, V>> if1) {
            this.X = (NavigableMap) C10664xF1.E(navigableMap);
            this.Y = if1;
            this.Z = new v(navigableMap, if1);
        }

        @Override // o.C7935m81.A
        public Iterator<Map.Entry<K, V>> a() {
            return C7052iU0.y(this.X.entrySet().iterator(), this.Y);
        }

        @Override // o.AbstractC8413o2
        public Iterator<Map.Entry<K, V>> b() {
            return C7052iU0.y(this.X.descendingMap().entrySet().iterator(), this.Y);
        }

        @Override // o.C7935m81.A, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.Z.clear();
        }

        @Override // java.util.SortedMap
        @MB
        public Comparator<? super K> comparator() {
            return this.X.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            return this.Z.containsKey(obj);
        }

        @Override // o.AbstractC8413o2, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return C7935m81.y(this.X.descendingMap(), this.Y);
        }

        @Override // o.C7935m81.A, java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return this.Z.entrySet();
        }

        @Override // o.AbstractC8413o2, java.util.AbstractMap, java.util.Map
        @MB
        public V get(@MB Object obj) {
            return this.Z.get(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@InterfaceC7894ly1 K k, boolean z) {
            return C7935m81.y(this.X.headMap(k, z), this.Y);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return !C5098aU0.c(this.X.entrySet(), this.Y);
        }

        @Override // o.AbstractC8413o2, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return new a(this);
        }

        @Override // o.AbstractC8413o2, java.util.NavigableMap
        @MB
        public Map.Entry<K, V> pollFirstEntry() {
            return (Map.Entry) C5098aU0.I(this.X.entrySet(), this.Y);
        }

        @Override // o.AbstractC8413o2, java.util.NavigableMap
        @MB
        public Map.Entry<K, V> pollLastEntry() {
            return (Map.Entry) C5098aU0.I(this.X.descendingMap().entrySet(), this.Y);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V put(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
            return this.Z.put(k, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.Z.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V remove(@MB Object obj) {
            return this.Z.remove(obj);
        }

        @Override // o.C7935m81.A, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.Z.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@InterfaceC7894ly1 K k, boolean z, @InterfaceC7894ly1 K k2, boolean z2) {
            return C7935m81.y(this.X.subMap(k, z, k2, z2), this.Y);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@InterfaceC7894ly1 K k, boolean z) {
            return C7935m81.y(this.X.tailMap(k, z), this.Y);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
            return new z(this, this.X, this.Y);
        }
    }

    /* renamed from: o.m81$x */
    /* loaded from: classes3.dex */
    public static class x<K, V> extends v<K, V> implements SortedMap<K, V> {

        /* renamed from: o.m81$x$a */
        /* loaded from: classes3.dex */
        public class a extends v<K, V>.b implements SortedSet<K> {
            public a() {
                super();
            }

            @Override // java.util.SortedSet
            @MB
            public Comparator<? super K> comparator() {
                return x.this.j().comparator();
            }

            @Override // java.util.SortedSet
            @InterfaceC7894ly1
            public K first() {
                return (K) x.this.firstKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> headSet(@InterfaceC7894ly1 K k) {
                return (SortedSet) x.this.headMap(k).keySet();
            }

            @Override // java.util.SortedSet
            @InterfaceC7894ly1
            public K last() {
                return (K) x.this.lastKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> subSet(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 K k2) {
                return (SortedSet) x.this.subMap(k, k2).keySet();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> tailSet(@InterfaceC7894ly1 K k) {
                return (SortedSet) x.this.tailMap(k).keySet();
            }
        }

        public x(SortedMap<K, V> sortedMap, IF1<? super Map.Entry<K, V>> if1) {
            super(sortedMap, if1);
        }

        @Override // java.util.SortedMap
        @MB
        public Comparator<? super K> comparator() {
            return j().comparator();
        }

        @Override // java.util.SortedMap
        @InterfaceC7894ly1
        public K firstKey() {
            return keySet().iterator().next();
        }

        @Override // o.C7935m81.v, o.C7935m81.R
        /* renamed from: g */
        public SortedSet<K> b() {
            return new a();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@InterfaceC7894ly1 K k) {
            return new x(j().headMap(k), this.Z0);
        }

        @Override // o.C7935m81.R, java.util.AbstractMap, java.util.Map
        /* renamed from: i */
        public SortedSet<K> keySet() {
            return (SortedSet) super.keySet();
        }

        public SortedMap<K, V> j() {
            return (SortedMap) this.Y0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.SortedMap
        @InterfaceC7894ly1
        public K lastKey() {
            SortedMap<K, V> j = j();
            while (true) {
                K lastKey = j.lastKey();
                if (d(lastKey, C2491As1.a(this.Y0.get(lastKey)))) {
                    return lastKey;
                }
                j = j().headMap(lastKey);
            }
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 K k2) {
            return new x(j().subMap(k, k2), this.Z0);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@InterfaceC7894ly1 K k) {
            return new x(j().tailMap(k), this.Z0);
        }
    }

    /* renamed from: o.m81$y */
    /* loaded from: classes3.dex */
    public static class y<K, V> extends AbstractC7949n<K, V> {
        public final IF1<? super K> a1;

        public y(Map<K, V> map, IF1<? super K> if1, IF1<? super Map.Entry<K, V>> if12) {
            super(map, if12);
            this.a1 = if1;
        }

        @Override // o.C7935m81.R
        public Set<Map.Entry<K, V>> a() {
            return C10856y22.i(this.Y0.entrySet(), this.Z0);
        }

        @Override // o.C7935m81.R
        public Set<K> b() {
            return C10856y22.i(this.Y0.keySet(), this.a1);
        }

        @Override // o.C7935m81.AbstractC7949n, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            if (this.Y0.containsKey(obj) && this.a1.apply(obj)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.m81$z */
    /* loaded from: classes3.dex */
    public static final class z<K, V> extends Q<K, V> {
        public final Map<K, V> Y;
        public final IF1<? super Map.Entry<K, V>> Z;

        public z(Map<K, V> map, Map<K, V> map2, IF1<? super Map.Entry<K, V>> if1) {
            super(map);
            this.Y = map2;
            this.Z = if1;
        }

        @Override // o.C7935m81.Q, java.util.AbstractCollection, java.util.Collection
        public boolean remove(@MB Object obj) {
            Iterator<Map.Entry<K, V>> it = this.Y.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.Z.apply(next) && C2593Bt1.a(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // o.C7935m81.Q, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.Y.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.Z.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // o.C7935m81.Q, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.Y.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.Z.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return C10608x11.s(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C10608x11.s(iterator()).toArray(tArr);
        }
    }

    public static <K, V> InterfaceC4626Wm<K, V> A(InterfaceC4626Wm<K, V> interfaceC4626Wm, IF1<? super Map.Entry<K, V>> if1) {
        C10664xF1.E(interfaceC4626Wm);
        C10664xF1.E(if1);
        if (interfaceC4626Wm instanceof u) {
            return E((u) interfaceC4626Wm, if1);
        }
        return new u(interfaceC4626Wm, if1);
    }

    public static <V2, K, V1> Map.Entry<K, V2> A0(t<? super K, ? super V1, V2> tVar, Map.Entry<K, V1> entry) {
        C10664xF1.E(tVar);
        C10664xF1.E(entry);
        return new C7938c(entry, tVar);
    }

    public static <K, V> Map<K, V> B(AbstractC7949n<K, V> abstractC7949n, IF1<? super Map.Entry<K, V>> if1) {
        return new v(abstractC7949n.Y0, C7985mG1.e(abstractC7949n.Z0, if1));
    }

    public static <K, V1, V2> Map<K, V2> B0(Map<K, V1> map, YA0<? super V1, V2> ya0) {
        return x0(map, i(ya0));
    }

    @InterfaceC11149zF0
    public static <K, V> NavigableMap<K, V> C(w<K, V> wVar, IF1<? super Map.Entry<K, V>> if1) {
        return new w(wVar.X, C7985mG1.e(wVar.Y, if1));
    }

    @InterfaceC11149zF0
    public static <K, V1, V2> NavigableMap<K, V2> C0(NavigableMap<K, V1> navigableMap, YA0<? super V1, V2> ya0) {
        return y0(navigableMap, i(ya0));
    }

    public static <K, V> SortedMap<K, V> D(x<K, V> xVar, IF1<? super Map.Entry<K, V>> if1) {
        return new x(xVar.j(), C7985mG1.e(xVar.Z0, if1));
    }

    public static <K, V1, V2> SortedMap<K, V2> D0(SortedMap<K, V1> sortedMap, YA0<? super V1, V2> ya0) {
        return z0(sortedMap, i(ya0));
    }

    public static <K, V> InterfaceC4626Wm<K, V> E(u<K, V> uVar, IF1<? super Map.Entry<K, V>> if1) {
        return new u(uVar.i(), C7985mG1.e(uVar.Z0, if1));
    }

    @InterfaceC6181ey
    public static <K, V> AbstractC6044eO0<K, V> E0(Iterable<V> iterable, YA0<? super V, K> ya0) {
        return F0(iterable.iterator(), ya0);
    }

    public static <K, V> Map<K, V> F(Map<K, V> map, IF1<? super K> if1) {
        C10664xF1.E(if1);
        IF1 U = U(if1);
        if (map instanceof AbstractC7949n) {
            return B((AbstractC7949n) map, U);
        }
        return new y((Map) C10664xF1.E(map), if1, U);
    }

    @InterfaceC6181ey
    public static <K, V> AbstractC6044eO0<K, V> F0(Iterator<V> it, YA0<? super V, K> ya0) {
        C10664xF1.E(ya0);
        AbstractC6044eO0.b b = AbstractC6044eO0.b();
        while (it.hasNext()) {
            V next = it.next();
            b.i(ya0.apply(next), next);
        }
        try {
            return b.d();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    @InterfaceC11149zF0
    public static <K, V> NavigableMap<K, V> G(NavigableMap<K, V> navigableMap, IF1<? super K> if1) {
        return y(navigableMap, U(if1));
    }

    public static <K, V> InterfaceC4626Wm<K, V> G0(InterfaceC4626Wm<? extends K, ? extends V> interfaceC4626Wm) {
        return new L(interfaceC4626Wm, null);
    }

    public static <K, V> SortedMap<K, V> H(SortedMap<K, V> sortedMap, IF1<? super K> if1) {
        return z(sortedMap, U(if1));
    }

    public static <K, V> Map.Entry<K, V> H0(Map.Entry<? extends K, ? extends V> entry) {
        C10664xF1.E(entry);
        return new C7946k(entry);
    }

    public static <K, V> InterfaceC4626Wm<K, V> I(InterfaceC4626Wm<K, V> interfaceC4626Wm, IF1<? super K> if1) {
        C10664xF1.E(if1);
        return A(interfaceC4626Wm, U(if1));
    }

    public static <K, V> AbstractC6237fB2<Map.Entry<K, V>> I0(Iterator<Map.Entry<K, V>> it) {
        return new C7947l(it);
    }

    public static <K, V> Map<K, V> J(Map<K, V> map, IF1<? super V> if1) {
        return x(map, Q0(if1));
    }

    public static <K, V> Set<Map.Entry<K, V>> J0(Set<Map.Entry<K, V>> set) {
        return new N(Collections.unmodifiableSet(set));
    }

    @InterfaceC11149zF0
    public static <K, V> NavigableMap<K, V> K(NavigableMap<K, V> navigableMap, IF1<? super V> if1) {
        return y(navigableMap, Q0(if1));
    }

    public static <K, V> Map<K, V> K0(Map<K, ? extends V> map) {
        if (map instanceof SortedMap) {
            return Collections.unmodifiableSortedMap((SortedMap) map);
        }
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> SortedMap<K, V> L(SortedMap<K, V> sortedMap, IF1<? super V> if1) {
        return z(sortedMap, Q0(if1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC11149zF0
    public static <K, V> NavigableMap<K, V> L0(NavigableMap<K, ? extends V> navigableMap) {
        C10664xF1.E(navigableMap);
        if (navigableMap instanceof O) {
            return navigableMap;
        }
        return new O(navigableMap);
    }

    public static <K, V> InterfaceC4626Wm<K, V> M(InterfaceC4626Wm<K, V> interfaceC4626Wm, IF1<? super V> if1) {
        return A(interfaceC4626Wm, Q0(if1));
    }

    @MB
    public static <K, V> Map.Entry<K, V> M0(@MB Map.Entry<K, ? extends V> entry) {
        if (entry == null) {
            return null;
        }
        return H0(entry);
    }

    @InterfaceC11149zF0
    public static AbstractC6044eO0<String, String> N(Properties properties) {
        AbstractC6044eO0.b b = AbstractC6044eO0.b();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            Object nextElement = propertyNames.nextElement();
            Objects.requireNonNull(nextElement);
            String str = (String) nextElement;
            String property = properties.getProperty(str);
            Objects.requireNonNull(property);
            b.i(str, property);
        }
        return b.d();
    }

    public static <V> YA0<Map.Entry<?, V>, V> N0() {
        return EnumC7953r.Y;
    }

    @InterfaceC10420wF0(serializable = true)
    public static <K, V> Map.Entry<K, V> O(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v2) {
        return new VN0(k, v2);
    }

    public static <K, V> Iterator<V> O0(Iterator<Map.Entry<K, V>> it) {
        return new C7941f(it);
    }

    @InterfaceC10420wF0(serializable = true)
    public static <K extends Enum<K>, V> AbstractC6044eO0<K, V> P(Map<K, ? extends V> map) {
        if (map instanceof WN0) {
            return (WN0) map;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return AbstractC6044eO0.u();
        }
        Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        C5037aF.a(key, value);
        EnumMap enumMap = new EnumMap(key.getDeclaringClass());
        enumMap.put((EnumMap) key, (K) value);
        while (it.hasNext()) {
            Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            C5037aF.a(key2, value2);
            enumMap.put((EnumMap) key2, (K) value2);
        }
        return WN0.I(enumMap);
    }

    @MB
    public static <V> V P0(@MB Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public static <E> AbstractC6044eO0<E, Integer> Q(Collection<E> collection) {
        AbstractC6044eO0.b bVar = new AbstractC6044eO0.b(collection.size());
        int i = 0;
        for (E e : collection) {
            bVar.i(e, Integer.valueOf(i));
            i++;
        }
        return bVar.d();
    }

    public static <V> IF1<Map.Entry<?, V>> Q0(IF1<? super V> if1) {
        return C7985mG1.h(if1, N0());
    }

    public static <K> YA0<Map.Entry<K, ?>, K> R() {
        return EnumC7953r.X;
    }

    public static <K, V> Iterator<K> S(Iterator<Map.Entry<K, V>> it) {
        return new C7940e(it);
    }

    @MB
    public static <K> K T(@MB Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static <K> IF1<Map.Entry<K, ?>> U(IF1<? super K> if1) {
        return C7985mG1.h(if1, R());
    }

    public static <K, V> ConcurrentMap<K, V> V() {
        return new ConcurrentHashMap();
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> W(Class<K> cls) {
        return new EnumMap<>((Class) C10664xF1.E(cls));
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> X(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    public static <K, V> HashMap<K, V> Y() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> Z(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> HashMap<K, V> a0(int i) {
        return new HashMap<>(o(i));
    }

    public static <K, V> IdentityHashMap<K, V> b0() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> c0() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> d0(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    public static <K, V> LinkedHashMap<K, V> e0(int i) {
        return new LinkedHashMap<>(o(i));
    }

    public static <A, B> AbstractC7264jN<A, B> f(InterfaceC4626Wm<A, B> interfaceC4626Wm) {
        return new C7951p(interfaceC4626Wm);
    }

    public static <K extends Comparable, V> TreeMap<K, V> f0() {
        return new TreeMap<>();
    }

    public static <K, V1, V2> YA0<Map.Entry<K, V1>, Map.Entry<K, V2>> g(t<? super K, ? super V1, V2> tVar) {
        C10664xF1.E(tVar);
        return new C7939d(tVar);
    }

    public static <C, K extends C, V> TreeMap<K, V> g0(@MB Comparator<C> comparator) {
        return new TreeMap<>((Comparator<? super K>) comparator);
    }

    public static <K, V1, V2> YA0<Map.Entry<K, V1>, V2> h(t<? super K, ? super V1, V2> tVar) {
        C10664xF1.E(tVar);
        return new C7937b(tVar);
    }

    public static <K, V> TreeMap<K, V> h0(SortedMap<K, ? extends V> sortedMap) {
        return new TreeMap<>((SortedMap) sortedMap);
    }

    public static <K, V1, V2> t<K, V1, V2> i(YA0<? super V1, V2> ya0) {
        C10664xF1.E(ya0);
        return new C7948m(ya0);
    }

    public static <E> Comparator<? super E> i0(@MB Comparator<? super E> comparator) {
        if (comparator != null) {
            return comparator;
        }
        return AbstractC10587ww1.z();
    }

    public static <K, V> Map<K, V> j(Set<K> set, YA0<? super K, V> ya0) {
        return new C7950o(set, ya0);
    }

    public static <K, V> void j0(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry<? extends K, ? extends V> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    @InterfaceC11149zF0
    public static <K, V> NavigableMap<K, V> k(NavigableSet<K> navigableSet, YA0<? super K, V> ya0) {
        return new D(navigableSet, ya0);
    }

    public static <K, V> boolean k0(Collection<Map.Entry<K, V>> collection, @MB Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return collection.remove(H0((Map.Entry) obj));
    }

    public static <K, V> SortedMap<K, V> l(SortedSet<K> sortedSet, YA0<? super K, V> ya0) {
        return new F(sortedSet, ya0);
    }

    @InterfaceC11149zF0
    public static <E> NavigableSet<E> l0(NavigableSet<E> navigableSet) {
        return new C7945j(navigableSet);
    }

    public static <K, V> Iterator<Map.Entry<K, V>> m(Set<K> set, YA0<? super K, V> ya0) {
        return new C7942g(set.iterator(), ya0);
    }

    public static <E> Set<E> m0(Set<E> set) {
        return new C7943h(set);
    }

    public static <K, V1, V2> YA0<V1, V2> n(t<? super K, V1, V2> tVar, @InterfaceC7894ly1 K k) {
        C10664xF1.E(tVar);
        return new C7936a(tVar, k);
    }

    public static <E> SortedSet<E> n0(SortedSet<E> sortedSet) {
        return new C7944i(sortedSet);
    }

    public static int o(int i) {
        if (i < 3) {
            C5037aF.b(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static boolean o0(Map<?, ?> map, @MB Object obj) {
        C10664xF1.E(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <K, V> boolean p(Collection<Map.Entry<K, V>> collection, @MB Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return collection.contains(H0((Map.Entry) obj));
    }

    @MB
    public static <V> V p0(Map<?, V> map, @MB Object obj) {
        C10664xF1.E(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static boolean q(Map<?, ?> map, @MB Object obj) {
        return C7052iU0.q(S(map.entrySet().iterator()), obj);
    }

    @MB
    public static <V> V q0(Map<?, V> map, @MB Object obj) {
        C10664xF1.E(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static boolean r(Map<?, ?> map, @MB Object obj) {
        return C7052iU0.q(O0(map.entrySet().iterator()), obj);
    }

    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> r0(NavigableMap<K, V> navigableMap, PN1<K> pn1) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (navigableMap.comparator() != null && navigableMap.comparator() != AbstractC10587ww1.z() && pn1.q() && pn1.r()) {
            if (navigableMap.comparator().compare(pn1.y(), pn1.J()) <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            C10664xF1.e(z3, "map is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (pn1.q() && pn1.r()) {
            K y2 = pn1.y();
            EnumC6886hp x2 = pn1.x();
            EnumC6886hp enumC6886hp = EnumC6886hp.CLOSED;
            if (x2 == enumC6886hp) {
                z2 = true;
            } else {
                z2 = false;
            }
            K J2 = pn1.J();
            if (pn1.I() == enumC6886hp) {
                z4 = true;
            }
            return navigableMap.subMap(y2, z2, J2, z4);
        } else if (pn1.q()) {
            K y3 = pn1.y();
            if (pn1.x() == EnumC6886hp.CLOSED) {
                z4 = true;
            }
            return navigableMap.tailMap(y3, z4);
        } else if (pn1.r()) {
            K J3 = pn1.J();
            if (pn1.I() == EnumC6886hp.CLOSED) {
                z4 = true;
            }
            return navigableMap.headMap(J3, z4);
        } else {
            return (NavigableMap) C10664xF1.E(navigableMap);
        }
    }

    public static <K, V> M71<K, V> s(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        if (map instanceof SortedMap) {
            return u((SortedMap) map, map2);
        }
        return t(map, map2, AbstractC6843he0.c());
    }

    public static <K, V> InterfaceC4626Wm<K, V> s0(InterfaceC4626Wm<K, V> interfaceC4626Wm) {
        return C9069qj2.g(interfaceC4626Wm, null);
    }

    public static <K, V> M71<K, V> t(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, AbstractC6843he0<? super V> abstractC6843he0) {
        C10664xF1.E(abstractC6843he0);
        LinkedHashMap c0 = c0();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        LinkedHashMap c02 = c0();
        LinkedHashMap c03 = c0();
        v(map, map2, abstractC6843he0, c0, linkedHashMap, c02, c03);
        return new C(c0, linkedHashMap, c02, c03);
    }

    @InterfaceC11149zF0
    public static <K, V> NavigableMap<K, V> t0(NavigableMap<K, V> navigableMap) {
        return C9069qj2.o(navigableMap);
    }

    public static <K, V> InterfaceC5361ba2<K, V> u(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
        C10664xF1.E(sortedMap);
        C10664xF1.E(map);
        Comparator i0 = i0(sortedMap.comparator());
        TreeMap g0 = g0(i0);
        TreeMap g02 = g0(i0);
        g02.putAll(map);
        TreeMap g03 = g0(i0);
        TreeMap g04 = g0(i0);
        v(sortedMap, map, AbstractC6843he0.c(), g0, g02, g03, g04);
        return new H(g0, g02, g03, g04);
    }

    public static <K, V> AbstractC6044eO0<K, V> u0(Iterable<K> iterable, YA0<? super K, V> ya0) {
        return v0(iterable.iterator(), ya0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void v(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, AbstractC6843he0<? super V> abstractC6843he0, Map<K, V> map3, Map<K, V> map4, Map<K, V> map5, Map<K, M71.a<V>> map6) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (map2.containsKey(key)) {
                Object obj = (Object) C2491As1.a(map4.remove(key));
                if (abstractC6843he0.d(value, obj)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, P.c(value, obj));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    public static <K, V> AbstractC6044eO0<K, V> v0(Iterator<K> it, YA0<? super K, V> ya0) {
        C10664xF1.E(ya0);
        AbstractC6044eO0.b b = AbstractC6044eO0.b();
        while (it.hasNext()) {
            K next = it.next();
            b.i(next, ya0.apply(next));
        }
        return b.c();
    }

    public static boolean w(Map<?, ?> map, @MB Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static String w0(Map<?, ?> map) {
        StringBuilder f = C7232jF.f(map.size());
        f.append('{');
        boolean z2 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z2) {
                f.append(C6566gU0.h);
            }
            f.append(entry.getKey());
            f.append('=');
            f.append(entry.getValue());
            z2 = false;
        }
        f.append('}');
        return f.toString();
    }

    public static <K, V> Map<K, V> x(Map<K, V> map, IF1<? super Map.Entry<K, V>> if1) {
        C10664xF1.E(if1);
        if (map instanceof AbstractC7949n) {
            return B((AbstractC7949n) map, if1);
        }
        return new v((Map) C10664xF1.E(map), if1);
    }

    public static <K, V1, V2> Map<K, V2> x0(Map<K, V1> map, t<? super K, ? super V1, V2> tVar) {
        return new I(map, tVar);
    }

    @InterfaceC11149zF0
    public static <K, V> NavigableMap<K, V> y(NavigableMap<K, V> navigableMap, IF1<? super Map.Entry<K, V>> if1) {
        C10664xF1.E(if1);
        if (navigableMap instanceof w) {
            return C((w) navigableMap, if1);
        }
        return new w((NavigableMap) C10664xF1.E(navigableMap), if1);
    }

    @InterfaceC11149zF0
    public static <K, V1, V2> NavigableMap<K, V2> y0(NavigableMap<K, V1> navigableMap, t<? super K, ? super V1, V2> tVar) {
        return new J(navigableMap, tVar);
    }

    public static <K, V> SortedMap<K, V> z(SortedMap<K, V> sortedMap, IF1<? super Map.Entry<K, V>> if1) {
        C10664xF1.E(if1);
        if (sortedMap instanceof x) {
            return D((x) sortedMap, if1);
        }
        return new x((SortedMap) C10664xF1.E(sortedMap), if1);
    }

    public static <K, V1, V2> SortedMap<K, V2> z0(SortedMap<K, V1> sortedMap, t<? super K, ? super V1, V2> tVar) {
        return new K(sortedMap, tVar);
    }
}
