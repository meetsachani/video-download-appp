package o;

import java.util.Collection;
import java.util.Map;

/* renamed from: o.Zl1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4925Zl1 extends Map {
    @Override // java.util.AbstractMap, java.util.Map, o.InterfaceC4925Zl1
    boolean containsValue(Object obj);

    @Override // java.util.Map
    Object get(Object obj);

    @Override // java.util.AbstractMap, java.util.Map, o.InterfaceC4925Zl1
    Object put(Object obj, Object obj2);

    @Override // java.util.Map
    Object remove(Object obj);

    @Override // java.util.Map, o.InterfaceC4925Zl1
    Object remove(Object obj, Object obj2);

    @Override // java.util.Map
    int size();

    @Override // java.util.AbstractMap, java.util.Map, o.InterfaceC4925Zl1
    Collection values();
}
