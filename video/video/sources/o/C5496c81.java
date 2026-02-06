package o;

import java.io.Serializable;
import java.util.Map;

/* renamed from: o.c81  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5496c81<I, O> implements InterfaceC3287Is2<I, O>, Serializable {
    private static final long serialVersionUID = 862391807045468939L;
    public final Map<? super I, ? extends O> X;

    public C5496c81(Map<? super I, ? extends O> map) {
        this.X = map;
    }

    public static <I, O> InterfaceC3287Is2<I, O> c(Map<? super I, ? extends O> map) {
        if (map == null) {
            return C9950uK.d();
        }
        return new C5496c81(map);
    }

    @Override // o.InterfaceC3287Is2
    public O a(I i) {
        return this.X.get(i);
    }

    public Map<? super I, ? extends O> b() {
        return this.X;
    }
}
