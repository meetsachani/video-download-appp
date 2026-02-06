package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import o.N2;

/* loaded from: classes4.dex */
public class VP1<K, V> extends N2<K, V> implements Serializable {
    private static final long serialVersionUID = -1266190134568365852L;

    public VP1() {
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

    @Override // o.V0
    public int A(Object obj) {
        return System.identityHashCode(obj);
    }

    @Override // o.N2, o.V0
    public boolean D(Object obj, Object obj2) {
        if (!Q(N2.h.HARD)) {
            obj2 = ((Reference) obj2).get();
        }
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    @Override // o.V0
    public boolean E(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    @Override // o.N2
    public int P(Object obj, Object obj2) {
        return System.identityHashCode(obj) ^ System.identityHashCode(obj2);
    }

    public VP1(N2.h hVar, N2.h hVar2) {
        super(hVar, hVar2, 16, 0.75f, false);
    }

    public VP1(N2.h hVar, N2.h hVar2, boolean z) {
        super(hVar, hVar2, 16, 0.75f, z);
    }

    public VP1(N2.h hVar, N2.h hVar2, int i, float f) {
        super(hVar, hVar2, i, f, false);
    }

    public VP1(N2.h hVar, N2.h hVar2, int i, float f, boolean z) {
        super(hVar, hVar2, i, f, z);
    }
}
