package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;

/* loaded from: classes4.dex */
public class WP1 extends M2 implements Serializable {
    private static final long serialVersionUID = -1266190134568365852L;

    public WP1() {
        super(0, 1, 16, 0.75f, false);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        n(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        o(objectOutputStream);
    }

    @Override // o.M2, o.U0
    public boolean B(Object obj, Object obj2) {
        if (this.o1 > 0) {
            obj2 = ((Reference) obj2).get();
        }
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    @Override // o.U0
    public boolean C(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    @Override // o.M2
    public int I(Object obj, Object obj2) {
        return System.identityHashCode(obj) ^ System.identityHashCode(obj2);
    }

    @Override // o.U0
    public int y(Object obj) {
        return System.identityHashCode(obj);
    }

    public WP1(int i, int i2) {
        super(i, i2, 16, 0.75f, false);
    }

    public WP1(int i, int i2, boolean z) {
        super(i, i2, 16, 0.75f, z);
    }

    public WP1(int i, int i2, int i3, float f) {
        super(i, i2, i3, f, false);
    }

    public WP1(int i, int i2, int i3, float f, boolean z) {
        super(i, i2, i3, f, z);
    }
}
