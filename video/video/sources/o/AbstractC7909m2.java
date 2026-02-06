package o;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.1")
/* renamed from: o.m2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7909m2<K, V> extends AbstractMap<K, V> implements Map<K, V>, MW0 {
    public abstract Set<Map.Entry<K, V>> a();

    public /* bridge */ Set<Object> b() {
        return super.keySet();
    }

    public /* bridge */ int c() {
        return super.size();
    }

    public /* bridge */ Collection<Object> d() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public abstract V put(K k, V v);

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) d();
    }
}
