package o;

import java.util.Set;

/* renamed from: o.Zm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4927Zm<K, V> extends WT0<K, V> {
    K b0(Object obj);

    InterfaceC4927Zm<V, K> h();

    K l0(Object obj);

    @Override // java.util.Map, o.OK1
    V put(K k, V v);

    @Override // java.util.Map, o.UC0
    Set<V> values();
}
