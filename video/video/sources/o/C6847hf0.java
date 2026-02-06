package o;

import java.io.Serializable;

/* renamed from: o.hf0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6847hf0<E> implements InterfaceC8705pE<E>, Serializable {
    public static final InterfaceC8705pE X = new C6847hf0();
    private static final long serialVersionUID = 7179106032121985545L;

    public static <E> InterfaceC8705pE<E> b() {
        return X;
    }

    private Object readResolve() {
        return X;
    }

    @Override // o.InterfaceC8705pE
    public void a(E e) {
        throw new OB0("ExceptionClosure invoked");
    }
}
