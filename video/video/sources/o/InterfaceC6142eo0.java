package o;

import java.lang.Comparable;
import java.util.Collection;
import java.util.Locale;
import o.VH;

/* renamed from: o.eo0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6142eo0<I, K extends Comparable<K>, C extends VH<I, K, T>, T> {
    void d(Locale locale);

    String[] f(T t) throws XR;

    InterfaceC8348nm<T, K> h(K k);

    void i(I i, InterfaceC8348nm<T, K> interfaceC8348nm);

    InterfaceC8348nm<T, K> j(K k, InterfaceC8348nm<T, K> interfaceC8348nm);

    Collection<InterfaceC8348nm<T, K>> values();
}
