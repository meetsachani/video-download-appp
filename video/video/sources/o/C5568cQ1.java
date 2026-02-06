package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import o.N2;

/* renamed from: o.cQ1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5568cQ1<K, V> extends N2<K, V> implements Serializable {
    private static final long serialVersionUID = 1555089888138299607L;

    public C5568cQ1() {
        super(N2.h.HARD, N2.h.SOFT, 16, 0.75f, false);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        r(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        t(objectOutputStream);
    }

    public C5568cQ1(N2.h hVar, N2.h hVar2) {
        super(hVar, hVar2, 16, 0.75f, false);
    }

    public C5568cQ1(N2.h hVar, N2.h hVar2, boolean z) {
        super(hVar, hVar2, 16, 0.75f, z);
    }

    public C5568cQ1(N2.h hVar, N2.h hVar2, int i, float f) {
        super(hVar, hVar2, i, f, false);
    }

    public C5568cQ1(N2.h hVar, N2.h hVar2, int i, float f, boolean z) {
        super(hVar, hVar2, i, f, z);
    }
}
