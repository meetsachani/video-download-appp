package o;

import java.io.Serializable;

/* renamed from: o.vf0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10272vf0<I, O> implements InterfaceC3287Is2<I, O>, Serializable {
    public static final InterfaceC3287Is2 X = new C10272vf0();
    private static final long serialVersionUID = 7179106032121985545L;

    public static <I, O> InterfaceC3287Is2<I, O> b() {
        return X;
    }

    private Object readResolve() {
        return X;
    }

    @Override // o.InterfaceC3287Is2
    public O a(I i) {
        throw new OB0("ExceptionTransformer invoked");
    }
}
