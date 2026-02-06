package o;

import java.io.Serializable;

/* renamed from: o.kf0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7574kf0<T> implements InterfaceC5641ck0<T>, Serializable {
    public static final InterfaceC5641ck0 X = new C7574kf0();
    private static final long serialVersionUID = 7179106032121985545L;

    public static <T> InterfaceC5641ck0<T> b() {
        return X;
    }

    private Object readResolve() {
        return X;
    }

    @Override // o.InterfaceC5641ck0
    public T a() {
        throw new OB0("ExceptionFactory invoked");
    }
}
