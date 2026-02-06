package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

/* renamed from: o.tz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9865tz<K, V> extends V0<K, V> implements Serializable, Cloneable {
    private static final long serialVersionUID = -7074655917369299456L;

    public C9865tz() {
        super(16, 0.75f, 12);
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
    /* renamed from: J */
    public C9865tz<K, V> i() {
        return (C9865tz) super.clone();
    }

    @Override // o.V0
    public Object j(Object obj) {
        if (obj != null) {
            char[] charArray = obj.toString().toCharArray();
            for (int length = charArray.length - 1; length >= 0; length--) {
                charArray[length] = Character.toLowerCase(Character.toUpperCase(charArray[length]));
            }
            return new String(charArray);
        }
        return V0.n1;
    }

    public C9865tz(int i) {
        super(i);
    }

    public C9865tz(int i, float f) {
        super(i, f);
    }

    public C9865tz(Map<? extends K, ? extends V> map) {
        super(map);
    }
}
