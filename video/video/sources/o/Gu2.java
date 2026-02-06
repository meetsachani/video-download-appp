package o;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class Gu2 implements JF1, Serializable {
    public static final JF1 X = new Gu2();
    private static final long serialVersionUID = 3374767158756189740L;

    public static JF1 b() {
        return X;
    }

    @Override // o.JF1
    public boolean evaluate(Object obj) {
        return true;
    }
}
