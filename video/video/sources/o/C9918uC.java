package o;

import android.graphics.PointF;
import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import o.NV0;

/* renamed from: o.uC  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9918uC {
    public static final NV0.a a = NV0.a.a(SearchView.z2, "p", "s", "hd", "d");

    public static C9675tC a(NV0 nv0, C10624x51 c10624x51, int i) throws IOException {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        boolean z3 = false;
        String str = null;
        H9<PointF, PointF> h9 = null;
        C10395w9 c10395w9 = null;
        while (nv0.j()) {
            int s = nv0.s(a);
            if (s != 0) {
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                nv0.t();
                                nv0.u();
                            } else if (nv0.m() == 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z3 = nv0.k();
                        }
                    } else {
                        c10395w9 = I9.i(nv0, c10624x51);
                    }
                } else {
                    h9 = C10149v9.b(nv0, c10624x51);
                }
            } else {
                str = nv0.o();
            }
        }
        return new C9675tC(str, h9, c10395w9, z2, z3);
    }
}
