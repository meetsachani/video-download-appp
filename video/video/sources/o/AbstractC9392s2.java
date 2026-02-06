package o;

/* renamed from: o.s2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC9392s2<K, V> extends X<K, V> implements InterfaceC8390nw1<K, V> {
    public AbstractC9392s2(InterfaceC8390nw1<K, V> interfaceC8390nw1) {
        super(interfaceC8390nw1);
    }

    @Override // o.X
    /* renamed from: d */
    public InterfaceC8390nw1<K, V> c() {
        return (InterfaceC8390nw1) super.b();
    }

    @Override // o.InterfaceC9369rw1
    public K firstKey() {
        return c().firstKey();
    }

    @Override // o.InterfaceC9369rw1
    public K j0(K k) {
        return c().j0(k);
    }

    @Override // o.InterfaceC9369rw1
    public K lastKey() {
        return c().lastKey();
    }

    @Override // o.InterfaceC9369rw1
    public K n0(K k) {
        return c().n0(k);
    }

    @Override // o.X, o.InterfaceC4927Zm
    public InterfaceC8390nw1<V, K> h() {
        return c().h();
    }

    @Override // o.X, o.AbstractC5951e1, o.VT0
    public InterfaceC9855tw1<K, V> p() {
        return c().p();
    }
}
