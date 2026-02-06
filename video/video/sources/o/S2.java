package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;

/* loaded from: classes4.dex */
public abstract class S2 extends AbstractC8405o0 implements Serializable {
    private static final long serialVersionUID = 6249888059822088500L;

    public S2(Collection collection) {
        super(collection);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Collection) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }
}
