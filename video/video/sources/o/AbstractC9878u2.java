package o;

/* renamed from: o.u2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC9878u2<K, V> extends I1<K, V> implements InterfaceC9369rw1<K, V> {
    public AbstractC9878u2() {
    }

    @Override // o.I1
    /* renamed from: c */
    public InterfaceC9369rw1<K, V> b() {
        return (InterfaceC9369rw1) super.b();
    }

    @Override // o.InterfaceC9369rw1
    public K firstKey() {
        return b().firstKey();
    }

    @Override // o.InterfaceC9369rw1
    public K j0(K k) {
        return b().j0(k);
    }

    @Override // o.InterfaceC9369rw1
    public K lastKey() {
        return b().lastKey();
    }

    @Override // o.InterfaceC9369rw1
    public K n0(K k) {
        return b().n0(k);
    }

    public AbstractC9878u2(InterfaceC9369rw1<K, V> interfaceC9369rw1) {
        super(interfaceC9369rw1);
    }

    @Override // o.AbstractC5951e1, o.VT0
    public InterfaceC9855tw1<K, V> p() {
        return b().p();
    }
}
