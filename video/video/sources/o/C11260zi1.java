package o;

import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import o.C10774xi1;
import o.NV0;

/* renamed from: o.zi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11260zi1 {
    public static final NV0.a a = NV0.a.a(SearchView.z2, "mm", "hd");

    public static C10774xi1 a(NV0 nv0) throws IOException {
        String str = null;
        boolean z = false;
        C10774xi1.a aVar = null;
        while (nv0.j()) {
            int s = nv0.s(a);
            if (s != 0) {
                if (s != 1) {
                    if (s != 2) {
                        nv0.t();
                        nv0.u();
                    } else {
                        z = nv0.k();
                    }
                } else {
                    aVar = C10774xi1.a.g(nv0.m());
                }
            } else {
                str = nv0.o();
            }
        }
        return new C10774xi1(str, aVar, z);
    }
}
