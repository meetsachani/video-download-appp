package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,111:1\n350#2,6:112\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n*L\n108#1:112,6\n*E\n"})
/* renamed from: o.un1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10062un1<K, V> implements InterfaceC9819tn1<K, V> {
    @NotNull
    public final Map<K, V> X;
    @NotNull
    public final HA0<K, V> Y;

    /* JADX WARN: Multi-variable type inference failed */
    public C10062un1(@NotNull Map<K, V> map, @NotNull HA0<? super K, ? extends V> ha0) {
        C6562gT0.p(map, "map");
        C6562gT0.p(ha0, JT.d);
        this.X = map;
        this.Y = ha0;
    }

    @Override // o.InterfaceC6722h81
    public V N3(K k) {
        Map<K, V> V = V();
        V v = V.get(k);
        if (v == null && !V.containsKey(k)) {
            return this.Y.invoke(k);
        }
        return v;
    }

    @Override // o.InterfaceC9819tn1, o.InterfaceC6722h81
    @NotNull
    public Map<K, V> V() {
        return this.X;
    }

    @NotNull
    public Set<Map.Entry<K, V>> a() {
        return V().entrySet();
    }

    @NotNull
    public Set<K> b() {
        return V().keySet();
    }

    public int c() {
        return V().size();
    }

    @Override // java.util.Map
    public void clear() {
        V().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return V().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return V().containsValue(obj);
    }

    @NotNull
    public Collection<V> d() {
        return V().values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return V().equals(obj);
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return V().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return V().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return V().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return b();
    }

    @Override // java.util.Map
    @Nullable
    public V put(K k, V v) {
        return V().put(k, v);
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        C6562gT0.p(map, "from");
        V().putAll(map);
    }

    @Override // java.util.Map
    @Nullable
    public V remove(Object obj) {
        return V().remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    @NotNull
    public String toString() {
        return V().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return d();
    }
}
