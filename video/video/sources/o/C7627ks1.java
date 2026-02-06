package o;

import java.io.Serializable;

/* renamed from: o.ks1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7627ks1 implements JF1, NF1, Serializable {
    private static final long serialVersionUID = -7625133768987126273L;
    public final JF1 X;

    public C7627ks1(JF1 jf1) {
        this.X = jf1;
    }

    public static JF1 b(JF1 jf1) {
        if (jf1 != null) {
            return new C7627ks1(jf1);
        }
        throw new IllegalArgumentException("Predicate must not be null");
    }

    @Override // o.NF1
    public JF1[] a() {
        return new JF1[]{this.X};
    }

    @Override // o.JF1
    public boolean evaluate(Object obj) {
        if (obj == null) {
            return true;
        }
        return this.X.evaluate(obj);
    }
}
