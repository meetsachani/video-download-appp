package o;

import android.graphics.PointF;
import java.util.List;

/* renamed from: o.u9  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9906u9 implements H9<PointF, PointF> {
    public final List<LX0<PointF>> a;

    public C9906u9(List<LX0<PointF>> list) {
        this.a = list;
    }

    @Override // o.H9
    public AbstractC7840ll<PointF, PointF> a() {
        if (this.a.get(0).i()) {
            return new TD1(this.a);
        }
        return new C7655kz1(this.a);
    }

    @Override // o.H9
    public List<LX0<PointF>> b() {
        return this.a;
    }

    @Override // o.H9
    public boolean c() {
        if (this.a.size() != 1 || !this.a.get(0).i()) {
            return false;
        }
        return true;
    }
}
