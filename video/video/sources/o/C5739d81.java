package o;

import java.io.Serializable;
import java.util.Map;

/* renamed from: o.d81  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5739d81 implements InterfaceC3189Hs2, Serializable {
    private static final long serialVersionUID = 862391807045468939L;
    public final Map X;

    public C5739d81(Map map) {
        this.X = map;
    }

    public static InterfaceC3189Hs2 b(Map map) {
        if (map == null) {
            return C10193vK.Y;
        }
        return new C5739d81(map);
    }

    @Override // o.InterfaceC3189Hs2
    public Object a(Object obj) {
        return this.X.get(obj);
    }

    public Map c() {
        return this.X;
    }
}
