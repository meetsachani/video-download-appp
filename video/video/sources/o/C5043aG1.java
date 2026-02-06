package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

/* renamed from: o.aG1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5043aG1 extends Z0 implements Serializable {
    private static final long serialVersionUID = 7412622456128415156L;
    public final JF1 Y;
    public final JF1 Z;

    public C5043aG1(Map map, JF1 jf1, JF1 jf12) {
        super(map);
        this.Y = jf1;
        this.Z = jf12;
        for (Map.Entry entry : map.entrySet()) {
            d(entry.getKey(), entry.getValue());
        }
    }

    public static Map c(Map map, JF1 jf1, JF1 jf12) {
        return new C5043aG1(map, jf1, jf12);
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
        if (this.Z.evaluate(obj)) {
            return obj;
        }
        throw new IllegalArgumentException("Cannot set value - Predicate rejected it");
    }

    @Override // o.Z0
    public boolean b() {
        if (this.Z != null) {
            return true;
        }
        return false;
    }

    public void d(Object obj, Object obj2) {
        JF1 jf1 = this.Y;
        if (jf1 != null && !jf1.evaluate(obj)) {
            throw new IllegalArgumentException("Cannot add key - Predicate rejected it");
        }
        JF1 jf12 = this.Z;
        if (jf12 != null && !jf12.evaluate(obj2)) {
            throw new IllegalArgumentException("Cannot add value - Predicate rejected it");
        }
    }

    @Override // o.J1, java.util.Map
    public Object put(Object obj, Object obj2) {
        d(obj, obj2);
        return this.X.put(obj, obj2);
    }

    @Override // o.J1, java.util.Map
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            d(entry.getKey(), entry.getValue());
        }
        this.X.putAll(map);
    }
}
