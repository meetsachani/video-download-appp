package o;

import java.io.Serializable;

/* renamed from: o.ur1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10078ur1<T> implements KF1<T>, Serializable {
    public static final KF1 X = new C10078ur1();
    private static final long serialVersionUID = 7533784454832764388L;

    public static <T> KF1<T> b() {
        return X;
    }

    private Object readResolve() {
        return X;
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        if (t != null) {
            return true;
        }
        return false;
    }
}
