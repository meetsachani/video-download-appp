package o;

import java.util.Map;

/* loaded from: classes4.dex */
public final class EZ<K, V> extends L1<K, V> {
    public EZ(K k, V v) {
        super(k, v);
    }

    public EZ(JX0<? extends K, ? extends V> jx0) {
        super(jx0.getKey(), jx0.getValue());
    }

    public EZ(Map.Entry<? extends K, ? extends V> entry) {
        super(entry.getKey(), entry.getValue());
    }
}
