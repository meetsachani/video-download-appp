package o;

import android.graphics.PointF;
import java.util.List;

/* renamed from: o.z9  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11124z9 implements H9<PointF, PointF> {
    public final C9177r9 a;
    public final C9177r9 b;

    public C11124z9(C9177r9 c9177r9, C9177r9 c9177r92) {
        this.a = c9177r9;
        this.b = c9177r92;
    }

    @Override // o.H9
    public AbstractC7840ll<PointF, PointF> a() {
        return new C4775Ya2(this.a.a(), this.b.a());
    }

    @Override // o.H9
    public List<LX0<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // o.H9
    public boolean c() {
        if (this.a.c() && this.b.c()) {
            return true;
        }
        return false;
    }
}
