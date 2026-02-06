package o;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.iA2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6974iA2<T> implements KF1<T>, Serializable {
    private static final long serialVersionUID = -3319417438027438040L;
    public final Set<T> X = new HashSet();

    public static <T> KF1<T> b() {
        return new C6974iA2();
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        return this.X.add(t);
    }
}
