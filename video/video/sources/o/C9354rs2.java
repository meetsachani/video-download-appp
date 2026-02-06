package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: o.rs2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9354rs2<K, V> extends AbstractC4981a1<K, V> implements Serializable {
    private static final long serialVersionUID = 7023152376788900464L;
    public final InterfaceC3287Is2<? super K, ? extends K> Y;
    public final InterfaceC3287Is2<? super V, ? extends V> Z;

    public C9354rs2(Map<K, V> map, InterfaceC3287Is2<? super K, ? extends K> interfaceC3287Is2, InterfaceC3287Is2<? super V, ? extends V> interfaceC3287Is22) {
        super(map);
        this.Y = interfaceC3287Is2;
        this.Z = interfaceC3287Is22;
    }

    public static <K, V> C9354rs2<K, V> i(Map<K, V> map, InterfaceC3287Is2<? super K, ? extends K> interfaceC3287Is2, InterfaceC3287Is2<? super V, ? extends V> interfaceC3287Is22) {
        C9354rs2<K, V> c9354rs2 = new C9354rs2<>(map, interfaceC3287Is2, interfaceC3287Is22);
        if (map.size() > 0) {
            Map<K, V> f = c9354rs2.f(map);
            c9354rs2.clear();
            c9354rs2.b().putAll(f);
        }
        return c9354rs2;
    }

    public static <K, V> C9354rs2<K, V> j(Map<K, V> map, InterfaceC3287Is2<? super K, ? extends K> interfaceC3287Is2, InterfaceC3287Is2<? super V, ? extends V> interfaceC3287Is22) {
        return new C9354rs2<>(map, interfaceC3287Is2, interfaceC3287Is22);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }

    @Override // o.AbstractC4981a1
    public V c(V v) {
        return this.Z.a(v);
    }

    @Override // o.AbstractC4981a1
    public boolean d() {
        if (this.Z != null) {
            return true;
        }
        return false;
    }

    public K e(K k) {
        InterfaceC3287Is2<? super K, ? extends K> interfaceC3287Is2 = this.Y;
        if (interfaceC3287Is2 == null) {
            return k;
        }
        return interfaceC3287Is2.a(k);
    }

    @Override // o.AbstractC4981a1, o.I1, java.util.Map, o.UC0
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<K, V> f(Map<? extends K, ? extends V> map) {
        if (map.isEmpty()) {
            return map;
        }
        H01 h01 = new H01(map.size());
        for (Map.Entry entry : map.entrySet()) {
            h01.put(e(entry.getKey()), g(entry.getValue()));
        }
        return h01;
    }

    public V g(V v) {
        InterfaceC3287Is2<? super V, ? extends V> interfaceC3287Is2 = this.Z;
        if (interfaceC3287Is2 == null) {
            return v;
        }
        return interfaceC3287Is2.a(v);
    }

    @Override // o.I1, java.util.Map, o.OK1
    public V put(K k, V v) {
        return b().put(e(k), g(v));
    }

    @Override // o.I1, java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        b().putAll(f(map));
    }
}
