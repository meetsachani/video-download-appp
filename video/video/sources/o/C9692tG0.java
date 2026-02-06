package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: o.tG0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9692tG0<E> extends S1<E> implements Serializable {
    private static final long serialVersionUID = 20150610;

    public C9692tG0() {
        super(new HashMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        B(new HashMap());
        super.i(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        super.j(objectOutputStream);
    }

    public C9692tG0(Collection<? extends E> collection) {
        this();
        addAll(collection);
    }
}
