package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class R70<K, V> extends A0<K, V> implements Serializable {
    private static final long serialVersionUID = 721969328361810L;

    public R70() {
        super(new LinkedHashMap(), new LinkedHashMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = new LinkedHashMap();
        this.Y = new LinkedHashMap();
        putAll((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }

    @Override // o.A0
    public InterfaceC4927Zm<V, K> a(Map<V, K> map, Map<K, V> map2, InterfaceC4927Zm<K, V> interfaceC4927Zm) {
        return new R70(map, map2, interfaceC4927Zm);
    }

    public R70(Map<? extends K, ? extends V> map) {
        super(new LinkedHashMap(), new LinkedHashMap());
        putAll(map);
    }

    public R70(Map<K, V> map, Map<V, K> map2, InterfaceC4927Zm<V, K> interfaceC4927Zm) {
        super(map, map2, interfaceC4927Zm);
    }
}
