package o;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class Fu2<T> implements KF1<T>, Serializable {
    public static final KF1 X = new Fu2();
    private static final long serialVersionUID = 3374767158756189740L;

    public static <T> KF1<T> b() {
        return X;
    }

    private Object readResolve() {
        return X;
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        return true;
    }
}
