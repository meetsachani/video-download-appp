package o;

import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import java.util.ArrayList;
import o.NV0;

/* loaded from: classes.dex */
public class W22 {
    public static final NV0.a a = NV0.a.a(SearchView.z2, "hd", "it");

    public static V22 a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (nv0.j()) {
            int s = nv0.s(a);
            if (s != 0) {
                if (s != 1) {
                    if (s != 2) {
                        nv0.u();
                    } else {
                        nv0.d();
                        while (nv0.j()) {
                            InterfaceC6776hM a2 = C7019iM.a(nv0, c10624x51);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        nv0.h();
                    }
                } else {
                    z = nv0.k();
                }
            } else {
                str = nv0.o();
            }
        }
        return new V22(str, arrayList, z);
    }
}
