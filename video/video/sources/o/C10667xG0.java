package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: o.xG0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10667xG0<K, V> extends AbstractC5474c3<K, V> implements Serializable {
    public static final int b1 = 16;
    public static final int c1 = 3;
    private static final long serialVersionUID = 20151118;
    public final int a1;

    public C10667xG0() {
        this(16, 3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        f(new HashMap());
        c(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        d(objectOutputStream);
    }

    @Override // o.AbstractC5474c3
    /* renamed from: j */
    public HashSet<V> h() {
        return new HashSet<>(this.a1);
    }

    public C10667xG0(int i) {
        this(16, i);
    }

    public C10667xG0(int i, int i2) {
        super(new HashMap(i));
        this.a1 = i2;
    }

    public C10667xG0(InterfaceC7846lm1<? extends K, ? extends V> interfaceC7846lm1) {
        this(interfaceC7846lm1.size(), 3);
        super.f0(interfaceC7846lm1);
    }

    public C10667xG0(Map<? extends K, ? extends V> map) {
        this(map.size(), 3);
        super.putAll(map);
    }
}
