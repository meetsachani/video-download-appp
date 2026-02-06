package o;

import java.io.Serializable;

/* renamed from: o.xQ0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10707xQ0 implements KF1<Object>, Serializable {
    private static final long serialVersionUID = -6682656911025165584L;
    public final Class<?> X;

    public C10707xQ0(Class<?> cls) {
        this.X = cls;
    }

    public static KF1<Object> c(Class<?> cls) {
        if (cls != null) {
            return new C10707xQ0(cls);
        }
        throw new NullPointerException("The type to check instanceof must not be null");
    }

    public Class<?> b() {
        return this.X;
    }

    @Override // o.KF1
    public boolean evaluate(Object obj) {
        return this.X.isInstance(obj);
    }
}
