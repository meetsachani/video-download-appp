package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class P70<K, V> extends A0<K, V> implements Serializable {
    private static final long serialVersionUID = 721969328361808L;

    public P70() {
        super(new HashMap(), new HashMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = new HashMap();
        this.Y = new HashMap();
        putAll((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }

    @Override // o.A0
    public InterfaceC4927Zm<V, K> a(Map<V, K> map, Map<K, V> map2, InterfaceC4927Zm<K, V> interfaceC4927Zm) {
        return new P70(map, map2, interfaceC4927Zm);
    }

    public P70(Map<? extends K, ? extends V> map) {
        super(new HashMap(), new HashMap());
        putAll(map);
    }

    public P70(Map<K, V> map, Map<V, K> map2, InterfaceC4927Zm<V, K> interfaceC4927Zm) {
        super(map, map2, interfaceC4927Zm);
    }
}
