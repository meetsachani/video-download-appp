package o;

import java.util.Collection;

@Deprecated
/* renamed from: o.Yl1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4818Yl1<K, V> extends WT0<K, Object> {
    @Override // java.util.Map, o.UC0
    boolean containsValue(Object obj);

    @Override // java.util.Map, o.UC0
    Object get(Object obj);

    boolean p0(K k, V v);

    @Override // java.util.Map, o.OK1
    Object put(K k, Object obj);

    @Override // java.util.Map, o.UC0
    Object remove(Object obj);

    @Override // java.util.Map, o.UC0
    int size();

    @Override // java.util.Map, o.UC0
    Collection<Object> values();
}
