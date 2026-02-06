package o;

import java.io.Serializable;

/* renamed from: o.sf0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9543sf0<T> implements KF1<T>, Serializable {
    public static final KF1 X = new C9543sf0();
    private static final long serialVersionUID = 7179106032121985545L;

    public static <T> KF1<T> b() {
        return X;
    }

    private Object readResolve() {
        return X;
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        throw new OB0("ExceptionPredicate invoked");
    }
}
