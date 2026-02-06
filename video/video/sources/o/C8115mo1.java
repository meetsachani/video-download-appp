package o;

import java.io.Serializable;

/* renamed from: o.mo1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8115mo1<E> implements InterfaceC8705pE<E>, Serializable {
    public static final InterfaceC8705pE X = new C8115mo1();
    private static final long serialVersionUID = 3518477308466486130L;

    public static <E> InterfaceC8705pE<E> b() {
        return X;
    }

    private Object readResolve() {
        return X;
    }

    @Override // o.InterfaceC8705pE
    public void a(E e) {
    }
}
