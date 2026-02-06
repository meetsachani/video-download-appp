package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class VA2 extends Y implements RA2 {
    public VA2 Y;

    public VA2(InterfaceC5167an interfaceC5167an) {
        super(interfaceC5167an);
    }

    public static InterfaceC5167an b(InterfaceC5167an interfaceC5167an) {
        if (interfaceC5167an instanceof RA2) {
            return interfaceC5167an;
        }
        return new VA2(interfaceC5167an);
    }

    @Override // o.J1, java.util.Map
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.J1, java.util.Map
    public Set entrySet() {
        return C5267bB2.f(super.entrySet());
    }

    @Override // o.Y, o.InterfaceC5167an, o.InterfaceC8634ow1, o.X92
    public InterfaceC5167an h() {
        if (this.Y == null) {
            VA2 va2 = new VA2(a().h());
            this.Y = va2;
            va2.Y = this;
        }
        return this.Y;
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
        return C9188rB2.b(a().p());
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
