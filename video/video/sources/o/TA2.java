package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class TA2 extends P implements RA2, Serializable {
    private static final long serialVersionUID = -1873799975157099624L;

    public TA2(InterfaceC3056Gk interfaceC3056Gk) {
        super(interfaceC3056Gk);
    }

    public static InterfaceC3056Gk f(InterfaceC3056Gk interfaceC3056Gk) {
        if (interfaceC3056Gk instanceof RA2) {
            return interfaceC3056Gk;
        }
        return new TA2(interfaceC3056Gk);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Collection) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
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

    @Override // o.P, o.InterfaceC3056Gk
    public boolean v(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o.P, o.InterfaceC3056Gk
    public boolean x(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o.P, o.InterfaceC3056Gk
    public Set y() {
        return DB2.f(e().y());
    }
}
