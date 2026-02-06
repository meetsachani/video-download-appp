package o;

import java.io.Serializable;

/* renamed from: o.oK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8486oK<T> implements InterfaceC5641ck0<T>, Serializable {
    public static final InterfaceC5641ck0 Y = new C8486oK(null);
    private static final long serialVersionUID = -3520677225766901240L;
    public final T X;

    public C8486oK(T t) {
        this.X = t;
    }

    public static <T> InterfaceC5641ck0<T> b(T t) {
        if (t == null) {
            return Y;
        }
        return new C8486oK(t);
    }

    @Override // o.InterfaceC5641ck0
    public T a() {
        return this.X;
    }

    public T c() {
        return this.X;
    }
}
