package o;

import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import o.NV0;

/* loaded from: classes.dex */
public class FR1 {
    public static final NV0.a a = NV0.a.a(SearchView.z2, "c", W12.e, "tr", "hd");

    public static DR1 a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        String str = null;
        C9177r9 c9177r9 = null;
        C9177r9 c9177r92 = null;
        F9 f9 = null;
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
                            f9 = G9.h(nv0, c10624x51);
                        }
                    } else {
                        c9177r92 = I9.f(nv0, c10624x51, false);
                    }
                } else {
                    c9177r9 = I9.f(nv0, c10624x51, false);
                }
            } else {
                str = nv0.o();
            }
        }
        return new DR1(str, c9177r9, c9177r92, f9, z);
    }
}
