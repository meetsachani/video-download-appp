package o;

import java.io.Serializable;

/* renamed from: o.yQ0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10950yQ0 implements JF1, Serializable {
    private static final long serialVersionUID = -6682656911025165584L;
    public final Class X;

    public C10950yQ0(Class cls) {
        this.X = cls;
    }

    public static JF1 b(Class cls) {
        if (cls != null) {
            return new C10950yQ0(cls);
        }
        throw new IllegalArgumentException("The type to check instanceof must not be null");
    }

    public Class c() {
        return this.X;
    }

    @Override // o.JF1
    public boolean evaluate(Object obj) {
        return this.X.isInstance(obj);
    }
}
