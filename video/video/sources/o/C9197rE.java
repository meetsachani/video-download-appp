package o;

import java.io.Serializable;

/* renamed from: o.rE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9197rE<T> implements InterfaceC3287Is2<T, T>, Serializable {
    private static final long serialVersionUID = 478466901448617286L;
    public final InterfaceC8705pE<? super T> X;

    public C9197rE(InterfaceC8705pE<? super T> interfaceC8705pE) {
        this.X = interfaceC8705pE;
    }

    public static <T> InterfaceC3287Is2<T, T> b(InterfaceC8705pE<? super T> interfaceC8705pE) {
        if (interfaceC8705pE != null) {
            return new C9197rE(interfaceC8705pE);
        }
        throw new NullPointerException("Closure must not be null");
    }

    @Override // o.InterfaceC3287Is2
    public T a(T t) {
        this.X.a(t);
        return t;
    }

    public InterfaceC8705pE<? super T> c() {
        return this.X;
    }
}
