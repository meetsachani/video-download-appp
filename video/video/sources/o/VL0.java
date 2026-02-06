package o;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class VL0<T> implements KF1<T>, Serializable {
    private static final long serialVersionUID = -89901658494523293L;
    public final T X;

    public VL0(T t) {
        this.X = t;
    }

    public static <T> KF1<T> c(T t) {
        if (t == null) {
            return C8618os1.b();
        }
        return new VL0(t);
    }

    public T b() {
        return this.X;
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        if (this.X == t) {
            return true;
        }
        return false;
    }
}
