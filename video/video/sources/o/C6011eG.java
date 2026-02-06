package o;

import android.graphics.Color;
import java.io.IOException;
import o.NV0;

/* renamed from: o.eG  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6011eG implements GE2<Integer> {
    public static final C6011eG a = new C6011eG();

    @Override // o.GE2
    /* renamed from: b */
    public Integer a(NV0 nv0, float f) throws IOException {
        boolean z;
        double d;
        if (nv0.q() == NV0.b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            nv0.d();
        }
        double l = nv0.l();
        double l2 = nv0.l();
        double l3 = nv0.l();
        if (nv0.q() == NV0.b.NUMBER) {
            d = nv0.l();
        } else {
            d = 1.0d;
        }
        if (z) {
            nv0.h();
        }
        if (l <= 1.0d && l2 <= 1.0d && l3 <= 1.0d) {
            l *= 255.0d;
            l2 *= 255.0d;
            l3 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) l, (int) l2, (int) l3));
    }
}
