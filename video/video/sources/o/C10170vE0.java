package o;

import android.graphics.Path;
import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import java.util.Collections;
import o.NV0;

/* renamed from: o.vE0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10170vE0 {
    public static final NV0.a a = NV0.a.a(SearchView.z2, "g", W12.e, "t", "s", W12.i, "r", "hd");
    public static final NV0.a b = NV0.a.a("p", "k");

    public static C9684tE0 a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        AE0 ae0;
        Path.FillType fillType;
        C9663t9 c9663t9 = null;
        Path.FillType fillType2 = Path.FillType.WINDING;
        String str = null;
        AE0 ae02 = null;
        C9420s9 c9420s9 = null;
        C10395w9 c10395w9 = null;
        C10395w9 c10395w92 = null;
        boolean z = false;
        while (nv0.j()) {
            switch (nv0.s(a)) {
                case 0:
                    str = nv0.o();
                    break;
                case 1:
                    nv0.f();
                    int i = -1;
                    while (nv0.j()) {
                        int s = nv0.s(b);
                        if (s != 0) {
                            if (s != 1) {
                                nv0.t();
                                nv0.u();
                            } else {
                                c9420s9 = I9.g(nv0, c10624x51, i);
                            }
                        } else {
                            i = nv0.m();
                        }
                    }
                    nv0.i();
                    break;
                case 2:
                    c9663t9 = I9.h(nv0, c10624x51);
                    break;
                case 3:
                    if (nv0.m() == 1) {
                        ae0 = AE0.LINEAR;
                    } else {
                        ae0 = AE0.RADIAL;
                    }
                    ae02 = ae0;
                    break;
                case 4:
                    c10395w9 = I9.i(nv0, c10624x51);
                    break;
                case 5:
                    c10395w92 = I9.i(nv0, c10624x51);
                    break;
                case 6:
                    if (nv0.m() == 1) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    fillType2 = fillType;
                    break;
                case 7:
                    z = nv0.k();
                    break;
                default:
                    nv0.t();
                    nv0.u();
                    break;
            }
        }
        if (c9663t9 == null) {
            c9663t9 = new C9663t9(Collections.singletonList(new LX0(100)));
        }
        return new C9684tE0(str, ae02, fillType2, c9420s9, c9663t9, c10395w9, c10395w92, null, null, z);
    }
}
