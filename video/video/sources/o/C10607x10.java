package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.x10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10607x10<K, V> extends I1<K, V> implements Serializable {
    private static final long serialVersionUID = 19698628745827L;
    public final InterfaceC3287Is2<? super K, ? extends V> Y;

    public C10607x10(V v) {
        this(C9950uK.b(v));
    }

    public static <K, V> Map<K, V> c(Map<K, V> map, InterfaceC3287Is2<? super K, ? extends V> interfaceC3287Is2) {
        if (interfaceC3287Is2 != null) {
            return new C10607x10(map, interfaceC3287Is2);
        }
        throw new IllegalArgumentException("Transformer must not be null");
    }

    public static <K, V> C10607x10<K, V> d(Map<K, V> map, V v) {
        return new C10607x10<>(map, C9950uK.b(v));
    }

    public static <K, V> C10607x10<K, V> e(Map<K, V> map, InterfaceC5641ck0<? extends V> interfaceC5641ck0) {
        if (interfaceC5641ck0 != null) {
            return new C10607x10<>(map, C6369fk0.b(interfaceC5641ck0));
        }
        throw new IllegalArgumentException("Factory must not be null");
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
        V v = this.X.get(obj);
        if (v == null && !this.X.containsKey(obj)) {
            return this.Y.a(obj);
        }
        return v;
    }

    public C10607x10(InterfaceC3287Is2<? super K, ? extends V> interfaceC3287Is2) {
        this(new HashMap(), interfaceC3287Is2);
    }

    public C10607x10(Map<K, V> map, InterfaceC3287Is2<? super K, ? extends V> interfaceC3287Is2) {
        super(map);
        if (interfaceC3287Is2 != null) {
            this.Y = interfaceC3287Is2;
            return;
        }
        throw new NullPointerException("Transformer must not be null.");
    }
}
