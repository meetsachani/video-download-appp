package o;

import android.graphics.Path;
import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import java.util.Collections;
import o.NV0;

/* loaded from: classes.dex */
public class U22 {
    public static final NV0.a a = NV0.a.a(SearchView.z2, "c", W12.e, "fillEnabled", "r", "hd");

    public static T22 a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        Path.FillType fillType;
        C9663t9 c9663t9 = null;
        String str = null;
        C8928q9 c8928q9 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (nv0.j()) {
            int s = nv0.s(a);
            if (s != 0) {
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    nv0.t();
                                    nv0.u();
                                } else {
                                    z2 = nv0.k();
                                }
                            } else {
                                i = nv0.m();
                            }
                        } else {
                            z = nv0.k();
                        }
                    } else {
                        c9663t9 = I9.h(nv0, c10624x51);
                    }
                } else {
                    c8928q9 = I9.c(nv0, c10624x51);
                }
            } else {
                str = nv0.o();
            }
        }
        if (c9663t9 == null) {
            c9663t9 = new C9663t9(Collections.singletonList(new LX0(100)));
        }
        C9663t9 c9663t92 = c9663t9;
        if (i == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new T22(str, z, fillType, c8928q9, c9663t92, z2);
    }
}
