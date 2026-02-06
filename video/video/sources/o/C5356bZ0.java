package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

/* renamed from: o.bZ0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5356bZ0 extends J1 implements Map, Serializable {
    private static final long serialVersionUID = 7990956402564206740L;
    public final InterfaceC3189Hs2 Y;

    public C5356bZ0(Map map, InterfaceC5399bk0 interfaceC5399bk0) {
        super(map);
        if (interfaceC5399bk0 != null) {
            this.Y = C6624gk0.c(interfaceC5399bk0);
            return;
        }
        throw new IllegalArgumentException("Factory must not be null");
    }

    public static Map a(Map map, InterfaceC5399bk0 interfaceC5399bk0) {
        return new C5356bZ0(map, interfaceC5399bk0);
    }

    public static Map b(Map map, InterfaceC3189Hs2 interfaceC3189Hs2) {
        return new C5356bZ0(map, interfaceC3189Hs2);
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
    public Object get(Object obj) {
        if (!this.X.containsKey(obj)) {
            Object a = this.Y.a(obj);
            this.X.put(obj, a);
            return a;
        }
        return this.X.get(obj);
    }

    public C5356bZ0(Map map, InterfaceC3189Hs2 interfaceC3189Hs2) {
        super(map);
        if (interfaceC3189Hs2 != null) {
            this.Y = interfaceC3189Hs2;
            return;
        }
        throw new IllegalArgumentException("Factory must not be null");
    }
}
