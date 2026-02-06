package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.Cu0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2694Cu0 extends J1 implements Map, InterfaceC9825tp, Serializable {
    private static final long serialVersionUID = 7450927208116179316L;

    public C2694Cu0(Map map) {
        super(map);
    }

    public static Map a(Map map) {
        return new C2694Cu0(map);
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
        throw new UnsupportedOperationException("Map is fixed size");
    }

    @Override // o.J1, java.util.Map
    public Set entrySet() {
        return DB2.f(this.X.entrySet());
    }

    @Override // o.J1, java.util.Map
    public Set keySet() {
        return DB2.f(this.X.keySet());
    }

    @Override // o.J1, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (this.X.containsKey(obj)) {
            return this.X.put(obj, obj2);
        }
        throw new IllegalArgumentException("Cannot put new key/value pair - Map is fixed size");
    }

    @Override // o.J1, java.util.Map
    public void putAll(Map map) {
        for (Object obj : map.keySet()) {
            if (!map.containsKey(obj)) {
                throw new IllegalArgumentException("Cannot put new key/value pair - Map is fixed size");
            }
        }
        this.X.putAll(map);
    }

    @Override // o.InterfaceC9825tp
    public int q() {
        return size();
    }

    @Override // o.J1, java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Map is fixed size");
    }

    @Override // o.InterfaceC9825tp
    public boolean s() {
        return true;
    }

    @Override // o.J1, java.util.Map
    public Collection values() {
        return C5024aB2.e(this.X.values());
    }
}
