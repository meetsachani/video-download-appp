package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: o.bQ1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5326bQ1 extends M2 implements Serializable {
    private static final long serialVersionUID = 1555089888138299607L;

    public C5326bQ1() {
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

    public C5326bQ1(int i, int i2) {
        super(i, i2, 16, 0.75f, false);
    }

    public C5326bQ1(int i, int i2, boolean z) {
        super(i, i2, 16, 0.75f, z);
    }

    public C5326bQ1(int i, int i2, int i3, float f) {
        super(i, i2, i3, f, false);
    }

    public C5326bQ1(int i, int i2, int i3, float f, boolean z) {
        super(i, i2, i3, f, z);
    }
}
