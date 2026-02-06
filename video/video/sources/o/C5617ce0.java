package o;

import java.io.Serializable;

/* renamed from: o.ce0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5617ce0 implements JF1, Serializable {
    private static final long serialVersionUID = 5633766978029907089L;
    public final Object X;

    public C5617ce0(Object obj) {
        this.X = obj;
    }

    public static JF1 b(Object obj) {
        if (obj == null) {
            return C8861ps1.X;
        }
        return new C5617ce0(obj);
    }

    public Object c() {
        return this.X;
    }

    @Override // o.JF1
    public boolean evaluate(Object obj) {
        return this.X.equals(obj);
    }
}
