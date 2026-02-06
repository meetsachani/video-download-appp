package o;

import java.io.Serializable;

/* renamed from: o.ln0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7849ln0<T> implements KF1<T>, Serializable {
    public static final KF1 X = new C7849ln0();
    private static final long serialVersionUID = 7533784454832764388L;

    public static <T> KF1<T> b() {
        return X;
    }

    private Object readResolve() {
        return X;
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        return false;
    }
}
