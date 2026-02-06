package o;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import o.NV0;

/* renamed from: o.v9  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10149v9 {
    public static final NV0.a a = NV0.a.a("k", "x", C5738d80.b);

    public static C9906u9 a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (nv0.q() == NV0.b.BEGIN_ARRAY) {
            nv0.d();
            while (nv0.j()) {
                arrayList.add(C7898lz1.a(nv0, c10624x51));
            }
            nv0.h();
            OX0.b(arrayList);
        } else {
            arrayList.add(new LX0(C5347bW0.e(nv0, C6006eE2.e())));
        }
        return new C9906u9(arrayList);
    }

    public static H9<PointF, PointF> b(NV0 nv0, C10624x51 c10624x51) throws IOException {
        nv0.f();
        C9906u9 c9906u9 = null;
        C9177r9 c9177r9 = null;
        boolean z = false;
        C9177r9 c9177r92 = null;
        while (nv0.q() != NV0.b.END_OBJECT) {
            int s = nv0.s(a);
            if (s != 0) {
                if (s != 1) {
                    if (s != 2) {
                        nv0.t();
                        nv0.u();
                    } else if (nv0.q() == NV0.b.STRING) {
                        nv0.u();
                        z = true;
                    } else {
                        c9177r9 = I9.e(nv0, c10624x51);
                    }
                } else if (nv0.q() == NV0.b.STRING) {
                    nv0.u();
                    z = true;
                } else {
                    c9177r92 = I9.e(nv0, c10624x51);
                }
            } else {
                c9906u9 = a(nv0, c10624x51);
            }
        }
        nv0.i();
        if (z) {
            c10624x51.a("Lottie doesn't support expressions.");
        }
        if (c9906u9 != null) {
            return c9906u9;
        }
        return new C11124z9(c9177r92, c9177r9);
    }
}
