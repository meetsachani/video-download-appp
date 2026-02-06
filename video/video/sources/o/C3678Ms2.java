package o;

import java.io.Serializable;

/* renamed from: o.Ms2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3678Ms2<T> implements KF1<T>, Serializable {
    private static final long serialVersionUID = -2407966402920578741L;
    public final InterfaceC3287Is2<? super T, Boolean> X;

    public C3678Ms2(InterfaceC3287Is2<? super T, Boolean> interfaceC3287Is2) {
        this.X = interfaceC3287Is2;
    }

    public static <T> KF1<T> c(InterfaceC3287Is2<? super T, Boolean> interfaceC3287Is2) {
        if (interfaceC3287Is2 != null) {
            return new C3678Ms2(interfaceC3287Is2);
        }
        throw new NullPointerException("The transformer to call must not be null");
    }

    public InterfaceC3287Is2<? super T, Boolean> b() {
        return this.X;
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        Boolean a = this.X.a(t);
        if (a != null) {
            return a.booleanValue();
        }
        throw new OB0("Transformer must return an instanceof Boolean, it was a null object");
    }
}
