package o;

import java.io.Serializable;

/* renamed from: o.sE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9440sE implements InterfaceC3189Hs2, Serializable {
    private static final long serialVersionUID = 478466901448617286L;
    public final InterfaceC8948qE X;

    public C9440sE(InterfaceC8948qE interfaceC8948qE) {
        this.X = interfaceC8948qE;
    }

    public static InterfaceC3189Hs2 c(InterfaceC8948qE interfaceC8948qE) {
        if (interfaceC8948qE != null) {
            return new C9440sE(interfaceC8948qE);
        }
        throw new IllegalArgumentException("Closure must not be null");
    }

    @Override // o.InterfaceC3189Hs2
    public Object a(Object obj) {
        this.X.a(obj);
        return obj;
    }

    public InterfaceC8948qE b() {
        return this.X;
    }
}
