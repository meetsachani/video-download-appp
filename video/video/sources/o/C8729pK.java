package o;

import java.io.Serializable;

/* renamed from: o.pK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8729pK implements InterfaceC5399bk0, Serializable {
    public static final InterfaceC5399bk0 Y = new C8729pK(null);
    private static final long serialVersionUID = -3520677225766901240L;
    public final Object X;

    public C8729pK(Object obj) {
        this.X = obj;
    }

    public static InterfaceC5399bk0 c(Object obj) {
        if (obj == null) {
            return Y;
        }
        return new C8729pK(obj);
    }

    @Override // o.InterfaceC5399bk0
    public Object a() {
        return this.X;
    }

    public Object b() {
        return this.X;
    }
}
