package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

/* renamed from: o.ss2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9597ss2 extends Z0 implements Serializable {
    private static final long serialVersionUID = 7023152376788900464L;
    public final InterfaceC3189Hs2 Y;
    public final InterfaceC3189Hs2 Z;

    public C9597ss2(Map map, InterfaceC3189Hs2 interfaceC3189Hs2, InterfaceC3189Hs2 interfaceC3189Hs22) {
        super(map);
        this.Y = interfaceC3189Hs2;
        this.Z = interfaceC3189Hs22;
    }

    public static Map c(Map map, InterfaceC3189Hs2 interfaceC3189Hs2, InterfaceC3189Hs2 interfaceC3189Hs22) {
        return new C9597ss2(map, interfaceC3189Hs2, interfaceC3189Hs22);
    }

    public static Map d(Map map, InterfaceC3189Hs2 interfaceC3189Hs2, InterfaceC3189Hs2 interfaceC3189Hs22) {
        C9597ss2 c9597ss2 = new C9597ss2(map, interfaceC3189Hs2, interfaceC3189Hs22);
        if (map.size() > 0) {
            Map f = c9597ss2.f(map);
            c9597ss2.clear();
            c9597ss2.V().putAll(f);
        }
        return c9597ss2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }

    @Override // o.Z0
    public Object a(Object obj) {
        return this.Z.a(obj);
    }

    @Override // o.Z0
    public boolean b() {
        if (this.Z != null) {
            return true;
        }
        return false;
    }

    public Object e(Object obj) {
        InterfaceC3189Hs2 interfaceC3189Hs2 = this.Y;
        if (interfaceC3189Hs2 == null) {
            return obj;
        }
        return interfaceC3189Hs2.a(obj);
    }

    public Map f(Map map) {
        if (map.isEmpty()) {
            return map;
        }
        G01 g01 = new G01(map.size());
        for (Map.Entry entry : map.entrySet()) {
            g01.put(e(entry.getKey()), g(entry.getValue()));
        }
        return g01;
    }

    public Object g(Object obj) {
        InterfaceC3189Hs2 interfaceC3189Hs2 = this.Z;
        if (interfaceC3189Hs2 == null) {
            return obj;
        }
        return interfaceC3189Hs2.a(obj);
    }

    @Override // o.J1, java.util.Map
    public Object put(Object obj, Object obj2) {
        return V().put(e(obj), g(obj2));
    }

    @Override // o.J1, java.util.Map
    public void putAll(Map map) {
        V().putAll(f(map));
    }
}
