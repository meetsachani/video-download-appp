package o;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class WL0 implements JF1, Serializable {
    private static final long serialVersionUID = -89901658494523293L;
    public final Object X;

    public WL0(Object obj) {
        this.X = obj;
    }

    public static JF1 b(Object obj) {
        if (obj == null) {
            return C8861ps1.X;
        }
        return new WL0(obj);
    }

    public Object c() {
        return this.X;
    }

    @Override // o.JF1
    public boolean evaluate(Object obj) {
        if (this.X == obj) {
            return true;
        }
        return false;
    }
}
