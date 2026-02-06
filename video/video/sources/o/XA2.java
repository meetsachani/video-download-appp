package o;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class XA2 extends S2 implements InterfaceC7856lp {
    private static final long serialVersionUID = -7112672385450340330L;

    public XA2(InterfaceC7856lp interfaceC7856lp) {
        super(interfaceC7856lp);
    }

    public static InterfaceC7856lp e(InterfaceC7856lp interfaceC7856lp) {
        return new XA2(interfaceC7856lp);
    }

    public static InterfaceC7856lp f(Collection collection) {
        if (collection != null) {
            for (int i = 0; i < 1000 && !(collection instanceof InterfaceC7856lp); i++) {
                if (collection instanceof AbstractC8405o0) {
                    collection = ((AbstractC8405o0) collection).X;
                } else if (!(collection instanceof C3349Jj2)) {
                    break;
                } else {
                    collection = ((C3349Jj2) collection).X;
                }
            }
            if (collection instanceof InterfaceC7856lp) {
                return new XA2((InterfaceC7856lp) collection);
            }
            throw new IllegalArgumentException("The collection is not a bounded collection");
        }
        throw new IllegalArgumentException("The collection must not be null");
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return C5752dB2.b(d().iterator());
    }

    @Override // o.InterfaceC7856lp
    public int q() {
        return ((InterfaceC7856lp) this.X).q();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC7856lp
    public boolean s() {
        return ((InterfaceC7856lp) this.X).s();
    }
}
