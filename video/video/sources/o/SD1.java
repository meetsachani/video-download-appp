package o;

import android.graphics.PointF;
import java.io.IOException;
import o.NV0;

/* loaded from: classes.dex */
public class SD1 implements GE2<PointF> {
    public static final SD1 a = new SD1();

    @Override // o.GE2
    /* renamed from: b */
    public PointF a(NV0 nv0, float f) throws IOException {
        NV0.b q = nv0.q();
        if (q == NV0.b.BEGIN_ARRAY) {
            return C5347bW0.e(nv0, f);
        }
        if (q == NV0.b.BEGIN_OBJECT) {
            return C5347bW0.e(nv0, f);
        }
        if (q == NV0.b.NUMBER) {
            PointF pointF = new PointF(((float) nv0.l()) * f, ((float) nv0.l()) * f);
            while (nv0.j()) {
                nv0.u();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + q);
    }
}
