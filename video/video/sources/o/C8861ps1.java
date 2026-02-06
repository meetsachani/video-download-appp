package o;

import java.io.Serializable;

/* renamed from: o.ps1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8861ps1 implements JF1, Serializable {
    public static final JF1 X = new C8861ps1();
    private static final long serialVersionUID = 7533784454832764388L;

    public static JF1 b() {
        return X;
    }

    @Override // o.JF1
    public boolean evaluate(Object obj) {
        if (obj == null) {
            return true;
        }
        return false;
    }
}
