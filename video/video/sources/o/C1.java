package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1761#2,3:154\n1740#2,3:157\n295#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
@InterfaceC6480g82(version = "1.1")
/* loaded from: classes3.dex */
public abstract class C1<K, V> implements Map<K, V>, GW0 {
    @NotNull
    public static final a Z = new a(null);
    @Nullable
    public volatile Set<? extends K> X;
    @Nullable
    public volatile Collection<? extends V> Y;

    @InterfaceC8303na2({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final boolean a(@NotNull Map.Entry<?, ?> entry, @Nullable Object obj) {
            C6562gT0.p(entry, W12.i);
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (!C6562gT0.g(entry.getKey(), entry2.getKey()) || !C6562gT0.g(entry.getValue(), entry2.getValue())) {
                return false;
            }
            return true;
        }

        public final int b(@NotNull Map.Entry<?, ?> entry) {
            int i;
            C6562gT0.p(entry, W12.i);
            Object key = entry.getKey();
            int i2 = 0;
            if (key != null) {
                i = key.hashCode();
            } else {
                i = 0;
            }
            Object value = entry.getValue();
            if (value != null) {
                i2 = value.hashCode();
            }
            return i ^ i2;
        }

        @NotNull
        public final String c(@NotNull Map.Entry<?, ?> entry) {
            C6562gT0.p(entry, W12.i);
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            return sb.toString();
        }

        public a() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends Y2<K> {
        public final /* synthetic */ C1<K, V> Y;

        /* loaded from: classes3.dex */
        public static final class a implements Iterator<K>, GW0 {
            public final /* synthetic */ Iterator<Map.Entry<K, V>> X;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.X = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.X.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.X.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(C1<K, ? extends V> c1) {
            this.Y = c1;
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.Y.containsKey(obj);
        }

        @Override // o.AbstractC7901m0
        public int e() {
            return this.Y.size();
        }

        @Override // o.Y2, o.AbstractC7901m0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this.Y.entrySet().iterator());
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends AbstractC7901m0<V> {
        public final /* synthetic */ C1<K, V> X;

        /* loaded from: classes3.dex */
        public static final class a implements Iterator<V>, GW0 {
            public final /* synthetic */ Iterator<Map.Entry<K, V>> X;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.X = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.X.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.X.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(C1<K, ? extends V> c1) {
            this.X = c1;
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.X.containsValue(obj);
        }

        @Override // o.AbstractC7901m0
        public int e() {
            return this.X.size();
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new a(this.X.entrySet().iterator());
        }
    }

    public static final CharSequence k(C1 c1, Map.Entry entry) {
        C6562gT0.p(entry, "it");
        return c1.j(entry);
    }

    public final boolean b(@Nullable Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        C6562gT0.n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v = get(key);
        if (!C6562gT0.g(value, v)) {
            return false;
        }
        if (v == null) {
            C6562gT0.n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
            if (!containsKey(key)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public abstract Set<Map.Entry<K, V>> c();

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (g(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> entrySet = entrySet();
        if (entrySet != null && entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (C6562gT0.g(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public Set<K> d() {
        if (this.X == null) {
            this.X = new b(this);
        }
        Set set = (Set<? extends K>) this.X;
        C6562gT0.m(set);
        return set;
    }

    public int e() {
        return entrySet().size();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return c();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if (entrySet != null && entrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (!b((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public Collection<V> f() {
        if (this.Y == null) {
            this.Y = new c(this);
        }
        Collection collection = (Collection<? extends V>) this.Y;
        C6562gT0.m(collection);
        return collection;
    }

    public final Map.Entry<K, V> g(K k) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C6562gT0.g(((Map.Entry) obj).getKey(), k)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Map.Entry) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        Map.Entry<K, V> g = g(obj);
        if (g != null) {
            return g.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    public final String i(Object obj) {
        if (obj == this) {
            return "(this Map)";
        }
        return String.valueOf(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final String j(Map.Entry<? extends K, ? extends V> entry) {
        return i(entry.getKey()) + '=' + i(entry.getValue());
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return d();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return e();
    }

    @NotNull
    public String toString() {
        return C10662xF.p3(entrySet(), C6566gU0.h, "{", "}", 0, null, new HA0() { // from class: o.B1
            @Override // o.HA0
            public final Object invoke(Object obj) {
                CharSequence k;
                k = C1.k(C1.this, (Map.Entry) obj);
                return k;
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return f();
    }
}
