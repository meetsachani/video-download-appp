package o;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class PF1 implements InterfaceC3189Hs2, Serializable {
    private static final long serialVersionUID = 5278818408044349346L;
    public final JF1 X;

    public PF1(JF1 jf1) {
        this.X = jf1;
    }

    public static InterfaceC3189Hs2 b(JF1 jf1) {
        if (jf1 != null) {
            return new PF1(jf1);
        }
        throw new IllegalArgumentException("Predicate must not be null");
    }

    @Override // o.InterfaceC3189Hs2
    public Object a(Object obj) {
        if (this.X.evaluate(obj)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public JF1 c() {
        return this.X;
    }
}
