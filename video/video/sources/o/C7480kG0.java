package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: o.kG0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7480kG0<E> extends E1<E> implements Serializable {
    private static final long serialVersionUID = -6561115435802554013L;

    public C7480kG0() {
        super(new HashMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        super.i(new HashMap(), objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        super.j(objectOutputStream);
    }

    public C7480kG0(Collection<? extends E> collection) {
        this();
        addAll(collection);
    }
}
