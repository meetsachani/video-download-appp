package o;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.jA2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7215jA2 implements JF1, Serializable {
    private static final long serialVersionUID = -3319417438027438040L;
    public final Set X = new HashSet();

    public static JF1 b() {
        return new C7215jA2();
    }

    @Override // o.JF1
    public boolean evaluate(Object obj) {
        return this.X.add(obj);
    }
}
