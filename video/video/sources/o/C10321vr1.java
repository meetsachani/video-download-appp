package o;

import java.io.Serializable;

/* renamed from: o.vr1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10321vr1 implements JF1, Serializable {
    public static final JF1 X = new C10321vr1();
    private static final long serialVersionUID = 7533784454832764388L;

    public static JF1 b() {
        return X;
    }

    @Override // o.JF1
    public boolean evaluate(Object obj) {
        if (obj != null) {
            return true;
        }
        return false;
    }
}
