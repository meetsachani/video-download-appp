package o;

import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import o.NV0;

/* renamed from: o.oV1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8531oV1 {
    public static final NV0.a a = NV0.a.a(SearchView.z2, "r", "hd");

    public static C8044mV1 a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        boolean z = false;
        String str = null;
        C9177r9 c9177r9 = null;
        while (nv0.j()) {
            int s = nv0.s(a);
            if (s != 0) {
                if (s != 1) {
                    if (s != 2) {
                        nv0.u();
                    } else {
                        z = nv0.k();
                    }
                } else {
                    c9177r9 = I9.f(nv0, c10624x51, true);
                }
            } else {
                str = nv0.o();
            }
        }
        if (z) {
            return null;
        }
        return new C8044mV1(str, c9177r9);
    }
}
