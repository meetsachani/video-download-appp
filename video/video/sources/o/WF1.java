package o;

import java.util.Collection;

/* loaded from: classes4.dex */
public class WF1 extends S2 {
    private static final long serialVersionUID = -5259182142076705162L;
    public final JF1 Y;

    public WF1(Collection collection, JF1 jf1) {
        super(collection);
        if (jf1 != null) {
            this.Y = jf1;
            for (Object obj : collection) {
                f(obj);
            }
            return;
        }
        throw new IllegalArgumentException("Predicate must not be null");
    }

    public static Collection e(Collection collection, JF1 jf1) {
        return new WF1(collection, jf1);
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        f(obj);
        return d().add(obj);
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        for (Object obj : collection) {
            f(obj);
        }
        return d().addAll(collection);
    }

    public void f(Object obj) {
        if (this.Y.evaluate(obj)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Cannot add Object '");
        stringBuffer.append(obj);
        stringBuffer.append("' - Predicate rejected it");
        throw new IllegalArgumentException(stringBuffer.toString());
    }
}
