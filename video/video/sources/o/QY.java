package o;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class QY<T> implements InterfaceC6600ge0<T>, Serializable {
    public static final QY X = new QY();
    public static final int Y = -1;
    private static final long serialVersionUID = 825802648423525485L;

    public static <T> QY<T> c() {
        return X;
    }

    private Object readResolve() {
        return X;
    }

    @Override // o.InterfaceC6600ge0
    public int a(T t) {
        if (t == null) {
            return -1;
        }
        return t.hashCode();
    }

    @Override // o.InterfaceC6600ge0
    public boolean b(T t, T t2) {
        if (t != t2) {
            if (t == null || !t.equals(t2)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
