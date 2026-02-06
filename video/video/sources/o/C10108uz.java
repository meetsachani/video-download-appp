package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

/* renamed from: o.uz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10108uz extends U0 implements Serializable, Cloneable {
    private static final long serialVersionUID = -7074655917369299456L;

    public C10108uz() {
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

    @Override // o.U0
    public Object g(Object obj) {
        if (obj != null) {
            char[] charArray = obj.toString().toCharArray();
            for (int length = charArray.length - 1; length >= 0; length--) {
                charArray[length] = Character.toLowerCase(Character.toUpperCase(charArray[length]));
            }
            return new String(charArray);
        }
        return U0.n1;
    }

    public C10108uz(int i) {
        super(i);
    }

    public C10108uz(int i, float f) {
        super(i, f);
    }

    public C10108uz(Map map) {
        super(map);
    }
}
