package o;

import java.io.Serializable;

/* renamed from: o.Ks2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3483Ks2<E> implements InterfaceC8705pE<E>, Serializable {
    private static final long serialVersionUID = -5194992589193388969L;
    public final InterfaceC3287Is2<? super E, ?> X;

    public C3483Ks2(InterfaceC3287Is2<? super E, ?> interfaceC3287Is2) {
        this.X = interfaceC3287Is2;
    }

    public static <E> InterfaceC8705pE<E> c(InterfaceC3287Is2<? super E, ?> interfaceC3287Is2) {
        if (interfaceC3287Is2 == null) {
            return C8115mo1.b();
        }
        return new C3483Ks2(interfaceC3287Is2);
    }

    @Override // o.InterfaceC8705pE
    public void a(E e) {
        this.X.a(e);
    }

    public InterfaceC3287Is2<? super E, ?> b() {
        return this.X;
    }
}
