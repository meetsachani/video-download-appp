package o;

import java.io.Serializable;

/* renamed from: o.ws2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10572ws2 implements JF1, NF1, Serializable {
    private static final long serialVersionUID = -5596090919668315834L;
    public final InterfaceC3189Hs2 X;
    public final JF1 Y;

    public C10572ws2(InterfaceC3189Hs2 interfaceC3189Hs2, JF1 jf1) {
        this.X = interfaceC3189Hs2;
        this.Y = jf1;
    }

    public static JF1 b(InterfaceC3189Hs2 interfaceC3189Hs2, JF1 jf1) {
        if (interfaceC3189Hs2 != null) {
            if (jf1 != null) {
                return new C10572ws2(interfaceC3189Hs2, jf1);
            }
            throw new IllegalArgumentException("The predicate to call must not be null");
        }
        throw new IllegalArgumentException("The transformer to call must not be null");
    }

    @Override // o.NF1
    public JF1[] a() {
        return new JF1[]{this.Y};
    }

    public InterfaceC3189Hs2 c() {
        return this.X;
    }

    @Override // o.JF1
    public boolean evaluate(Object obj) {
        return this.Y.evaluate(this.X.a(obj));
    }
}
