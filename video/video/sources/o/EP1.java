package o;

import android.graphics.PointF;
import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import o.NV0;

/* loaded from: classes.dex */
public class EP1 {
    public static final NV0.a a = NV0.a.a(SearchView.z2, "p", "s", "r", "hd");

    public static DP1 a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        String str = null;
        H9<PointF, PointF> h9 = null;
        C10395w9 c10395w9 = null;
        C9177r9 c9177r9 = null;
        boolean z = false;
        while (nv0.j()) {
            int s = nv0.s(a);
            if (s != 0) {
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                nv0.u();
                            } else {
                                z = nv0.k();
                            }
                        } else {
                            c9177r9 = I9.e(nv0, c10624x51);
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
        return new DP1(str, h9, c10395w9, c9177r9, z);
    }
}
