package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

/* renamed from: o.Gs2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3091Gs2<J, K, U, V> extends C5709d1<K, V> implements OK1<J, U>, Serializable {
    private static final long serialVersionUID = 5966875321133456994L;
    public final InterfaceC3287Is2<? super J, ? extends K> Y;
    public final InterfaceC3287Is2<? super U, ? extends V> Z;

    public C3091Gs2(Map<K, V> map, InterfaceC3287Is2<? super J, ? extends K> interfaceC3287Is2, InterfaceC3287Is2<? super U, ? extends V> interfaceC3287Is22) {
        super(map);
        if (interfaceC3287Is2 != null) {
            this.Y = interfaceC3287Is2;
            if (interfaceC3287Is22 != null) {
                this.Z = interfaceC3287Is22;
                return;
            }
            throw new NullPointerException("ValueTransformer must not be null.");
        }
        throw new NullPointerException("KeyTransformer must not be null.");
    }

    public static <J, K, U, V> C3091Gs2<J, K, U, V> f(Map<K, V> map, InterfaceC3287Is2<? super J, ? extends K> interfaceC3287Is2, InterfaceC3287Is2<? super U, ? extends V> interfaceC3287Is22) {
        return new C3091Gs2<>(map, interfaceC3287Is2, interfaceC3287Is22);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(a());
    }

    public V b(U u) {
        return this.Z.a(u);
    }

    public K c(J j) {
        return this.Y.a(j);
    }

    @Override // o.OK1
    public void clear() {
        a().clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<K, V> d(Map<? extends J, ? extends U> map) {
        if (map.isEmpty()) {
            return map;
        }
        H01 h01 = new H01(map.size());
        for (Map.Entry entry : map.entrySet()) {
            h01.put(c(entry.getKey()), e(entry.getValue()));
        }
        return h01;
    }

    public V e(U u) {
        return this.Z.a(u);
    }

    @Override // o.OK1
    public V put(J j, U u) {
        return a().put(c(j), e(u));
    }

    @Override // o.OK1
    public void putAll(Map<? extends J, ? extends U> map) {
        a().putAll(d(map));
    }
}
