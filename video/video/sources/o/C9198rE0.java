package o;

import java.util.List;

/* renamed from: o.rE0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9198rE0 extends MX0<C8706pE0> {
    public final C8706pE0 i;

    public C9198rE0(List<LX0<C8706pE0>> list) {
        super(list);
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C8706pE0 c8706pE0 = list.get(i2).b;
            if (c8706pE0 != null) {
                i = Math.max(i, c8706pE0.f());
            }
        }
        this.i = new C8706pE0(new float[i], new int[i]);
    }

    @Override // o.AbstractC7840ll
    /* renamed from: r */
    public C8706pE0 i(LX0<C8706pE0> lx0, float f) {
        this.i.g(lx0.b, lx0.c, f);
        return this.i;
    }
}
