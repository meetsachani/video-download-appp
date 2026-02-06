package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.y10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10850y10 extends J1 implements Map, Serializable {
    private static final long serialVersionUID = 19698628745827L;
    public final Object Y;

    public C10850y10(Object obj) {
        super(new HashMap());
        this.Y = obj instanceof InterfaceC3189Hs2 ? C10193vK.c(obj) : obj;
    }

    public static Map a(Map map, Object obj) {
        if (obj instanceof InterfaceC3189Hs2) {
            obj = C10193vK.c(obj);
        }
        return new C10850y10(map, obj);
    }

    public static Map b(Map map, InterfaceC5399bk0 interfaceC5399bk0) {
        if (interfaceC5399bk0 != null) {
            return new C10850y10(map, C6624gk0.c(interfaceC5399bk0));
        }
        throw new IllegalArgumentException("Factory must not be null");
    }

    public static Map c(Map map, InterfaceC3189Hs2 interfaceC3189Hs2) {
        if (interfaceC3189Hs2 != null) {
            return new C10850y10(map, interfaceC3189Hs2);
        }
        throw new IllegalArgumentException("Transformer must not be null");
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
            Object obj2 = this.Y;
            if (obj2 instanceof InterfaceC3189Hs2) {
                return ((InterfaceC3189Hs2) obj2).a(obj);
            }
            return obj2;
        }
        return this.X.get(obj);
    }

    public C10850y10(Map map, Object obj) {
        super(map);
        this.Y = obj;
    }
}
