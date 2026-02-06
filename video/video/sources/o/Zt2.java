package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class Zt2 extends D1 implements V92, Serializable {
    private static final long serialVersionUID = -7740146511091606676L;

    public Zt2() {
        super(new TreeMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        super.i(new TreeMap((Comparator) objectInputStream.readObject()), objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(comparator());
        super.j(objectOutputStream);
    }

    @Override // o.V92
    public Comparator comparator() {
        return ((SortedMap) k()).comparator();
    }

    @Override // o.V92
    public Object first() {
        return ((SortedMap) k()).firstKey();
    }

    @Override // o.V92
    public Object last() {
        return ((SortedMap) k()).lastKey();
    }

    public Zt2(Comparator comparator) {
        super(new TreeMap(comparator));
    }

    public Zt2(Collection collection) {
        this();
        addAll(collection);
    }
}
