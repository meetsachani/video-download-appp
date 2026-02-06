package o;

import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import o.C6460g32;
import o.NV0;

/* renamed from: o.h32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6703h32 {
    public static final NV0.a a = NV0.a.a("s", W12.i, W12.e, SearchView.z2, "m", "hd");

    public static C6460g32 a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        String str = null;
        C6460g32.a aVar = null;
        C9177r9 c9177r9 = null;
        C9177r9 c9177r92 = null;
        C9177r9 c9177r93 = null;
        boolean z = false;
        while (nv0.j()) {
            int s = nv0.s(a);
            if (s != 0) {
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    nv0.u();
                                } else {
                                    z = nv0.k();
                                }
                            } else {
                                aVar = C6460g32.a.g(nv0.m());
                            }
                        } else {
                            str = nv0.o();
                        }
                    } else {
                        c9177r93 = I9.f(nv0, c10624x51, false);
                    }
                } else {
                    c9177r92 = I9.f(nv0, c10624x51, false);
                }
            } else {
                c9177r9 = I9.f(nv0, c10624x51, false);
            }
        }
        return new C6460g32(str, aVar, c9177r9, c9177r92, c9177r93, z);
    }
}
