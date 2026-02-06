package o;

import java.util.Map;

/* renamed from: o.oB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8452oB2<K, V> extends L1<K, V> implements QA2 {
    public C8452oB2(K k, V v) {
        super(k, v);
    }

    @Override // o.L1, o.AbstractC7419k1, java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("setValue() is not supported");
    }

    public C8452oB2(JX0<? extends K, ? extends V> jx0) {
        super(jx0.getKey(), jx0.getValue());
    }

    public C8452oB2(Map.Entry<? extends K, ? extends V> entry) {
        super(entry.getKey(), entry.getValue());
    }
}
