package o;

import java.io.IOException;
import o.NV0;

/* loaded from: classes.dex */
public class VX1 implements GE2<UX1> {
    public static final VX1 a = new VX1();

    @Override // o.GE2
    /* renamed from: b */
    public UX1 a(NV0 nv0, float f) throws IOException {
        boolean z;
        if (nv0.q() == NV0.b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            nv0.d();
        }
        float l = (float) nv0.l();
        float l2 = (float) nv0.l();
        while (nv0.j()) {
            nv0.u();
        }
        if (z) {
            nv0.h();
        }
        return new UX1((l / 100.0f) * f, (l2 / 100.0f) * f);
    }
}
