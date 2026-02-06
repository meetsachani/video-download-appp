package o;

import java.io.Serializable;

/* renamed from: o.vK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10193vK implements InterfaceC3189Hs2, Serializable {
    public static final InterfaceC3189Hs2 Y = new C10193vK(null);
    private static final long serialVersionUID = 6374440726369055124L;
    public final Object X;

    public C10193vK(Object obj) {
        this.X = obj;
    }

    public static InterfaceC3189Hs2 c(Object obj) {
        if (obj == null) {
            return Y;
        }
        return new C10193vK(obj);
    }

    @Override // o.InterfaceC3189Hs2
    public Object a(Object obj) {
        return this.X;
    }

    public Object b() {
        return this.X;
    }
}
