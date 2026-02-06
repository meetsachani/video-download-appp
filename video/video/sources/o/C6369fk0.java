package o;

import java.io.Serializable;

/* renamed from: o.fk0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6369fk0<I, O> implements InterfaceC3287Is2<I, O>, Serializable {
    private static final long serialVersionUID = -6817674502475353160L;
    public final InterfaceC5641ck0<? extends O> X;

    public C6369fk0(InterfaceC5641ck0<? extends O> interfaceC5641ck0) {
        this.X = interfaceC5641ck0;
    }

    public static <I, O> InterfaceC3287Is2<I, O> b(InterfaceC5641ck0<? extends O> interfaceC5641ck0) {
        if (interfaceC5641ck0 != null) {
            return new C6369fk0(interfaceC5641ck0);
        }
        throw new NullPointerException("Factory must not be null");
    }

    @Override // o.InterfaceC3287Is2
    public O a(I i) {
        return this.X.a();
    }

    public InterfaceC5641ck0<? extends O> c() {
        return this.X;
    }
}
