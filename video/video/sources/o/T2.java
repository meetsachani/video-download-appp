package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class T2<E> extends AbstractC9145r1<E> {
    private static final long serialVersionUID = 2684959196747496299L;

    public T2(List<E> list) {
        super(list);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        e((Collection) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(d());
    }
}
