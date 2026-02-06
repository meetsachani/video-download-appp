package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class ZF1<K, V> extends AbstractC4981a1<K, V> implements Serializable {
    private static final long serialVersionUID = 7412622456128415156L;
    public final KF1<? super K> Y;
    public final KF1<? super V> Z;

    public ZF1(Map<K, V> map, KF1<? super K> kf1, KF1<? super V> kf12) {
        super(map);
        this.Y = kf1;
        this.Z = kf12;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue());
        }
    }

    public static <K, V> ZF1<K, V> e(Map<K, V> map, KF1<? super K> kf1, KF1<? super V> kf12) {
        return new ZF1<>(map, kf1, kf12);
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
        if (this.Z.evaluate(v)) {
            return v;
        }
        throw new IllegalArgumentException("Cannot set value - Predicate rejected it");
    }

    @Override // o.AbstractC4981a1
    public boolean d() {
        if (this.Z != null) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC4981a1, o.I1, java.util.Map, o.UC0
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public void f(K k, V v) {
        KF1<? super K> kf1 = this.Y;
        if (kf1 != null && !kf1.evaluate(k)) {
            throw new IllegalArgumentException("Cannot add key - Predicate rejected it");
        }
        KF1<? super V> kf12 = this.Z;
        if (kf12 != null && !kf12.evaluate(v)) {
            throw new IllegalArgumentException("Cannot add value - Predicate rejected it");
        }
    }

    @Override // o.I1, java.util.Map, o.OK1
    public V put(K k, V v) {
        f(k, v);
        return this.X.put(k, v);
    }

    @Override // o.I1, java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue());
        }
        super.putAll(map);
    }
}
