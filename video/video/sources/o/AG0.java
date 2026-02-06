package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes4.dex */
public class AG0 extends U0 implements Serializable, Cloneable {
    private static final long serialVersionUID = -1788199231038721040L;

    public AG0() {
        super(16, 0.75f, 12);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        n(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        o(objectOutputStream);
    }

    @Override // o.U0, java.util.AbstractMap
    public Object clone() {
        return super.clone();
    }

    public AG0(int i) {
        super(i);
    }

    public AG0(int i, float f) {
        super(i, f);
    }

    public AG0(Map map) {
        super(map);
    }
}
