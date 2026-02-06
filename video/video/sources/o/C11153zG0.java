package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

/* renamed from: o.zG0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C11153zG0<K, V> extends V0<K, V> implements Serializable, Cloneable {
    private static final long serialVersionUID = -1788199231038721040L;

    public C11153zG0() {
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
    public C11153zG0<K, V> i() {
        return (C11153zG0) super.clone();
    }

    public C11153zG0(int i) {
        super(i);
    }

    public C11153zG0(int i, float f) {
        super(i, f);
    }

    public C11153zG0(Map<? extends K, ? extends V> map) {
        super(map);
    }
}
