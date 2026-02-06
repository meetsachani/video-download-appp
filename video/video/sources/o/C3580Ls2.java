package o;

import java.io.Serializable;

/* renamed from: o.Ls2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3580Ls2 implements InterfaceC8948qE, Serializable {
    private static final long serialVersionUID = -5194992589193388969L;
    public final InterfaceC3189Hs2 X;

    public C3580Ls2(InterfaceC3189Hs2 interfaceC3189Hs2) {
        this.X = interfaceC3189Hs2;
    }

    public static InterfaceC8948qE b(InterfaceC3189Hs2 interfaceC3189Hs2) {
        if (interfaceC3189Hs2 == null) {
            return C8358no1.X;
        }
        return new C3580Ls2(interfaceC3189Hs2);
    }

    @Override // o.InterfaceC8948qE
    public void a(Object obj) {
        this.X.a(obj);
    }

    public InterfaceC3189Hs2 c() {
        return this.X;
    }
}
