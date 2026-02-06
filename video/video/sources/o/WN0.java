package o;

import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import o.AbstractC6044eO0;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class WN0<K extends Enum<K>, V> extends AbstractC6044eO0.c<K, V> {
    public final transient EnumMap<K, V> a1;

    /* loaded from: classes3.dex */
    public static class b<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final EnumMap<K, V> X;

        public b(EnumMap<K, V> enumMap) {
            this.X = enumMap;
        }

        public Object readResolve() {
            return new WN0(this.X);
        }
    }

    public static <K extends Enum<K>, V> AbstractC6044eO0<K, V> I(EnumMap<K, V> enumMap) {
        int size = enumMap.size();
        if (size != 0) {
            if (size != 1) {
                return new WN0(enumMap);
            }
            Map.Entry entry = (Map.Entry) C5098aU0.z(enumMap.entrySet());
            return AbstractC6044eO0.v((Enum) entry.getKey(), entry.getValue());
        }
        return AbstractC6044eO0.u();
    }

    @Override // o.AbstractC6044eO0.c
    public AbstractC6237fB2<Map.Entry<K, V>> H() {
        return C7935m81.I0(this.a1.entrySet().iterator());
    }

    @Override // o.AbstractC6044eO0, java.util.Map
    public boolean containsKey(@MB Object obj) {
        return this.a1.containsKey(obj);
    }

    @Override // o.AbstractC6044eO0, java.util.Map
    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WN0) {
            obj = ((WN0) obj).a1;
        }
        return this.a1.equals(obj);
    }

    @Override // o.AbstractC6044eO0, java.util.Map
    @MB
    public V get(@MB Object obj) {
        return this.a1.get(obj);
    }

    @Override // o.AbstractC6044eO0
    public boolean o() {
        return false;
    }

    @Override // o.AbstractC6044eO0
    public AbstractC6237fB2<K> r() {
        return C7052iU0.e0(this.a1.keySet().iterator());
    }

    @Override // java.util.Map
    public int size() {
        return this.a1.size();
    }

    @Override // o.AbstractC6044eO0
    public Object writeReplace() {
        return new b(this.a1);
    }

    public WN0(EnumMap<K, V> enumMap) {
        this.a1 = enumMap;
        C10664xF1.d(!enumMap.isEmpty());
    }
}
