package o;

import java.util.Set;

/* loaded from: classes4.dex */
public abstract class X<K, V> extends I1<K, V> implements InterfaceC4927Zm<K, V> {
    public X(InterfaceC4927Zm<K, V> interfaceC4927Zm) {
        super(interfaceC4927Zm);
    }

    @Override // o.InterfaceC4927Zm
    public K b0(Object obj) {
        return b().b0(obj);
    }

    @Override // o.I1
    /* renamed from: c */
    public InterfaceC4927Zm<K, V> b() {
        return (InterfaceC4927Zm) super.b();
    }

    public InterfaceC4927Zm<V, K> h() {
        return b().h();
    }

    public K l0(Object obj) {
        return b().l0(obj);
    }

    @Override // o.AbstractC5951e1, o.VT0
    public U71<K, V> p() {
        return b().p();
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<V> values() {
        return b().values();
    }
}
