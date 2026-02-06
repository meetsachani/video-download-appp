package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

/* renamed from: o.aZ0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5113aZ0<K, V> extends I1<K, V> implements Serializable {
    private static final long serialVersionUID = 7990956402564206740L;
    public final InterfaceC3287Is2<? super K, ? extends V> Y;

    public C5113aZ0(Map<K, V> map, InterfaceC5641ck0<? extends V> interfaceC5641ck0) {
        super(map);
        if (interfaceC5641ck0 != null) {
            this.Y = C6369fk0.b(interfaceC5641ck0);
            return;
        }
        throw new NullPointerException("Factory must not be null");
    }

    public static <K, V> C5113aZ0<K, V> c(Map<K, V> map, InterfaceC5641ck0<? extends V> interfaceC5641ck0) {
        return new C5113aZ0<>(map, interfaceC5641ck0);
    }

    public static <V, K> C5113aZ0<K, V> d(Map<K, V> map, InterfaceC3287Is2<? super K, ? extends V> interfaceC3287Is2) {
        return new C5113aZ0<>(map, interfaceC3287Is2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }

    @Override // o.I1, java.util.Map, o.UC0
    public V get(Object obj) {
        if (!this.X.containsKey(obj)) {
            V a = this.Y.a(obj);
            this.X.put(obj, a);
            return a;
        }
        return this.X.get(obj);
    }

    public C5113aZ0(Map<K, V> map, InterfaceC3287Is2<? super K, ? extends V> interfaceC3287Is2) {
        super(map);
        if (interfaceC3287Is2 != null) {
            this.Y = interfaceC3287Is2;
            return;
        }
        throw new NullPointerException("Factory must not be null");
    }
}
