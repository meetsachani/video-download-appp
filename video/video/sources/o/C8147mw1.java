package o;

import java.io.Serializable;

/* renamed from: o.mw1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8147mw1 implements JF1, NF1, Serializable {
    private static final long serialVersionUID = -8791518325735182855L;
    public final JF1 X;
    public final JF1 Y;

    public C8147mw1(JF1 jf1, JF1 jf12) {
        this.X = jf1;
        this.Y = jf12;
    }

    public static JF1 b(JF1 jf1, JF1 jf12) {
        if (jf1 != null && jf12 != null) {
            return new C8147mw1(jf1, jf12);
        }
        throw new IllegalArgumentException("Predicate must not be null");
    }

    @Override // o.NF1
    public JF1[] a() {
        return new JF1[]{this.X, this.Y};
    }

    @Override // o.JF1
    public boolean evaluate(Object obj) {
        if (!this.X.evaluate(obj) && !this.Y.evaluate(obj)) {
            return false;
        }
        return true;
    }
}
