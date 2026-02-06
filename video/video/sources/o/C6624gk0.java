package o;

import java.io.Serializable;

/* renamed from: o.gk0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6624gk0 implements InterfaceC3189Hs2, Serializable {
    private static final long serialVersionUID = -6817674502475353160L;
    public final InterfaceC5399bk0 X;

    public C6624gk0(InterfaceC5399bk0 interfaceC5399bk0) {
        this.X = interfaceC5399bk0;
    }

    public static InterfaceC3189Hs2 c(InterfaceC5399bk0 interfaceC5399bk0) {
        if (interfaceC5399bk0 != null) {
            return new C6624gk0(interfaceC5399bk0);
        }
        throw new IllegalArgumentException("Factory must not be null");
    }

    @Override // o.InterfaceC3189Hs2
    public Object a(Object obj) {
        return this.X.a();
    }

    public InterfaceC5399bk0 b() {
        return this.X;
    }
}
