package o;

import java.io.Serializable;

/* renamed from: o.be0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5375be0<T> implements KF1<T>, Serializable {
    private static final long serialVersionUID = 5633766978029907089L;
    public final T X;
    public final InterfaceC6600ge0<T> Y;

    public C5375be0(T t) {
        this(t, null);
    }

    public static <T> KF1<T> b(T t) {
        if (t == null) {
            return C8618os1.b();
        }
        return new C5375be0(t);
    }

    public static <T> KF1<T> c(T t, InterfaceC6600ge0<T> interfaceC6600ge0) {
        if (t == null) {
            return C8618os1.b();
        }
        return new C5375be0(t, interfaceC6600ge0);
    }

    public Object d() {
        return this.X;
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        InterfaceC6600ge0<T> interfaceC6600ge0 = this.Y;
        if (interfaceC6600ge0 != null) {
            return interfaceC6600ge0.b(this.X, t);
        }
        return this.X.equals(t);
    }

    public C5375be0(T t, InterfaceC6600ge0<T> interfaceC6600ge0) {
        this.X = t;
        this.Y = interfaceC6600ge0;
    }
}
