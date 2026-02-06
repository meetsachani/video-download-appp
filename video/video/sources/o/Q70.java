package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class Q70 extends AbstractC11088z0 implements Serializable {
    private static final long serialVersionUID = 721969328361808L;

    public Q70() {
        super(new HashMap(), new HashMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X[0] = new HashMap();
        this.X[1] = new HashMap();
        putAll((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X[0]);
    }

    @Override // o.AbstractC11088z0
    public InterfaceC5167an a(Map map, Map map2, InterfaceC5167an interfaceC5167an) {
        return new Q70(map, map2, interfaceC5167an);
    }

    public Q70(Map map) {
        super(new HashMap(), new HashMap());
        putAll(map);
    }

    public Q70(Map map, Map map2, InterfaceC5167an interfaceC5167an) {
        super(map, map2, interfaceC5167an);
    }
}
