package o;

import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import o.NV0;

/* renamed from: o.d32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5720d32 {
    public static NV0.a a = NV0.a.a(SearchView.z2, "ind", "ks", "hd");

    public static C5235b32 a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        String str = null;
        int i = 0;
        boolean z = false;
        C10881y9 c10881y9 = null;
        while (nv0.j()) {
            int s = nv0.s(a);
            if (s != 0) {
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            nv0.u();
                        } else {
                            z = nv0.k();
                        }
                    } else {
                        c10881y9 = I9.k(nv0, c10624x51);
                    }
                } else {
                    i = nv0.m();
                }
            } else {
                str = nv0.o();
            }
        }
        return new C5235b32(str, i, c10881y9, z);
    }
}
