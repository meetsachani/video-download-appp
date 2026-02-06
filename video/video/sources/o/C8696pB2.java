package o;

import java.util.Map;

/* renamed from: o.pB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8696pB2 extends K1 implements RA2 {
    public C8696pB2(Object obj, Object obj2) {
        super(obj, obj2);
    }

    @Override // o.K1, java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("setValue() is not supported");
    }

    public C8696pB2(KX0 kx0) {
        super(kx0.getKey(), kx0.getValue());
    }

    public C8696pB2(Map.Entry entry) {
        super(entry.getKey(), entry.getValue());
    }
}
