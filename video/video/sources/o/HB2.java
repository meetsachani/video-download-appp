package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes4.dex */
public final class HB2 extends AbstractC7184j3 implements RA2 {
    public HB2 Y;

    public HB2(X92 x92) {
        super(x92);
    }

    public static X92 d(X92 x92) {
        if (x92 instanceof RA2) {
            return x92;
        }
        return new HB2(x92);
    }

    @Override // o.AbstractC7184j3, o.X92
    public X92 Z4() {
        if (this.Y == null) {
            HB2 hb2 = new HB2(c().Z4());
            this.Y = hb2;
            hb2.Y = this;
        }
        return this.Y;
    }

    @Override // o.AbstractC9635t2, o.InterfaceC9612sw1
    public InterfaceC10098uw1 c2() {
        return AB2.b(c().c2());
    }

    @Override // o.J1, java.util.Map
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC9635t2, o.InterfaceC8634ow1
    public InterfaceC8634ow1 e1() {
        return Z4();
    }

    @Override // o.J1, java.util.Map
    public Set entrySet() {
        return C5267bB2.f(super.entrySet());
    }

    @Override // o.Y, o.InterfaceC5167an, o.InterfaceC8634ow1, o.X92
    public InterfaceC5167an h() {
        return Z4();
    }

    @Override // o.AbstractC7184j3, java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return JB2.b(c().headMap(obj));
    }

    @Override // o.J1, java.util.Map
    public Set keySet() {
        return DB2.f(super.keySet());
    }

    @Override // o.Y, o.InterfaceC5167an
    public Object l0(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.Y, o.InterfaceC5167an, o.XT0
    public V71 p() {
        return c2();
    }

    @Override // o.J1, java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // o.J1, java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // o.J1, java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC7184j3, java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return JB2.b(c().subMap(obj, obj2));
    }

    @Override // o.AbstractC7184j3, java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return JB2.b(c().tailMap(obj));
    }

    @Override // o.J1, java.util.Map
    public Collection values() {
        return C5024aB2.e(super.values());
    }
}
