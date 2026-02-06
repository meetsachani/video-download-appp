package o;

import java.io.Serializable;

/* renamed from: o.Ns2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3777Ns2 implements JF1, Serializable {
    private static final long serialVersionUID = -2407966402920578741L;
    public final InterfaceC3189Hs2 X;

    public C3777Ns2(InterfaceC3189Hs2 interfaceC3189Hs2) {
        this.X = interfaceC3189Hs2;
    }

    public static JF1 b(InterfaceC3189Hs2 interfaceC3189Hs2) {
        if (interfaceC3189Hs2 != null) {
            return new C3777Ns2(interfaceC3189Hs2);
        }
        throw new IllegalArgumentException("The transformer to call must not be null");
    }

    public InterfaceC3189Hs2 c() {
        return this.X;
    }

    @Override // o.JF1
    public boolean evaluate(Object obj) {
        String name;
        Object a = this.X.a(obj);
        if (!(a instanceof Boolean)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Transformer must return an instanceof Boolean, it was a ");
            if (a == null) {
                name = "null object";
            } else {
                name = a.getClass().getName();
            }
            stringBuffer.append(name);
            throw new PB0(stringBuffer.toString());
        }
        return ((Boolean) a).booleanValue();
    }
}
