package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.yB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10892yB2 extends AbstractC10121v2 implements RA2, Serializable {
    private static final long serialVersionUID = 8136428161720526266L;

    public C10892yB2(InterfaceC9612sw1 interfaceC9612sw1) {
        super(interfaceC9612sw1);
    }

    public static InterfaceC9612sw1 b(InterfaceC9612sw1 interfaceC9612sw1) {
        if (interfaceC9612sw1 instanceof RA2) {
            return interfaceC9612sw1;
        }
        return new C10892yB2(interfaceC9612sw1);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }

    @Override // o.AbstractC10121v2, o.InterfaceC9612sw1
    public InterfaceC10098uw1 c2() {
        return AB2.b(a().c2());
    }

    @Override // o.J1, java.util.Map
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.J1, java.util.Map
    public Set entrySet() {
        return C5267bB2.f(super.entrySet());
    }

    @Override // o.J1, java.util.Map
    public Set keySet() {
        return DB2.f(super.keySet());
    }

    @Override // o.AbstractC10121v2, o.XT0
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
