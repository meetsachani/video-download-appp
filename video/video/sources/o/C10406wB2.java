package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.wB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10406wB2 extends AbstractC9635t2 implements RA2 {
    public C10406wB2 Y;

    public C10406wB2(InterfaceC8634ow1 interfaceC8634ow1) {
        super(interfaceC8634ow1);
    }

    public static InterfaceC8634ow1 c(InterfaceC8634ow1 interfaceC8634ow1) {
        if (interfaceC8634ow1 instanceof RA2) {
            return interfaceC8634ow1;
        }
        return new C10406wB2(interfaceC8634ow1);
    }

    @Override // o.AbstractC9635t2, o.InterfaceC9612sw1
    public InterfaceC10098uw1 c2() {
        return AB2.b(b().c2());
    }

    @Override // o.J1, java.util.Map
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC9635t2, o.InterfaceC8634ow1
    public InterfaceC8634ow1 e1() {
        if (this.Y == null) {
            C10406wB2 c10406wB2 = new C10406wB2(b().e1());
            this.Y = c10406wB2;
            c10406wB2.Y = this;
        }
        return this.Y;
    }

    @Override // o.J1, java.util.Map
    public Set entrySet() {
        return C5267bB2.f(super.entrySet());
    }

    @Override // o.Y, o.InterfaceC5167an, o.InterfaceC8634ow1, o.X92
    public InterfaceC5167an h() {
        return e1();
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

    @Override // o.J1, java.util.Map
    public Collection values() {
        return C5024aB2.e(super.values());
    }
}
