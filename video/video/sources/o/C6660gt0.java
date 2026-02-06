package o;

import java.util.List;
import o.C4086Qy1;

@Deprecated
/* renamed from: o.gt0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6660gt0 implements YH0 {
    public final YH0 a;
    public final List<C3031Gd2> b;

    public C6660gt0(YH0 yh0, List<C3031Gd2> list) {
        this.a = yh0;
        this.b = list;
    }

    @Override // o.YH0
    public C4086Qy1.a<WH0> a() {
        return new C6903ht0(this.a.a(), this.b);
    }

    @Override // o.YH0
    public C4086Qy1.a<WH0> b(VH0 vh0, @InterfaceC11300zs1 UH0 uh0) {
        return new C6903ht0(this.a.b(vh0, uh0), this.b);
    }
}
