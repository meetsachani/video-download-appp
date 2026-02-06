package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.nB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8209nB2 extends J1 implements XT0, RA2, Serializable {
    private static final long serialVersionUID = 2737023427269031941L;

    public C8209nB2(Map map) {
        super(map);
    }

    public static Map a(Map map) {
        if (map instanceof RA2) {
            return map;
        }
        return new C8209nB2(map);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
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

    @Override // o.XT0
    public V71 p() {
        Map map = this.X;
        if (map instanceof XT0) {
            return C9188rB2.b(((XT0) map).p());
        }
        return C9188rB2.b(new C2626Cd0(map));
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
