package o;

import android.graphics.PointF;
import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import o.C10660xE1;
import o.NV0;

/* renamed from: o.yE1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10903yE1 {
    public static final NV0.a a = NV0.a.a(SearchView.z2, "sy", "pt", "p", "r", "or", BU0.f, "ir", "is", "hd", "d");

    public static C10660xE1 a(NV0 nv0, C10624x51 c10624x51, int i) throws IOException {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = false;
        boolean z3 = z;
        String str = null;
        C10660xE1.a aVar = null;
        C9177r9 c9177r9 = null;
        H9<PointF, PointF> h9 = null;
        C9177r9 c9177r92 = null;
        C9177r9 c9177r93 = null;
        C9177r9 c9177r94 = null;
        C9177r9 c9177r95 = null;
        C9177r9 c9177r96 = null;
        while (nv0.j()) {
            switch (nv0.s(a)) {
                case 0:
                    str = nv0.o();
                    break;
                case 1:
                    aVar = C10660xE1.a.g(nv0.m());
                    break;
                case 2:
                    c9177r9 = I9.f(nv0, c10624x51, false);
                    break;
                case 3:
                    h9 = C10149v9.b(nv0, c10624x51);
                    break;
                case 4:
                    c9177r92 = I9.f(nv0, c10624x51, false);
                    break;
                case 5:
                    c9177r94 = I9.e(nv0, c10624x51);
                    break;
                case 6:
                    c9177r96 = I9.f(nv0, c10624x51, false);
                    break;
                case 7:
                    c9177r93 = I9.e(nv0, c10624x51);
                    break;
                case 8:
                    c9177r95 = I9.f(nv0, c10624x51, false);
                    break;
                case 9:
                    z2 = nv0.k();
                    break;
                case 10:
                    if (nv0.m() == 3) {
                        z3 = true;
                        break;
                    } else {
                        z3 = false;
                        break;
                    }
                default:
                    nv0.t();
                    nv0.u();
                    break;
            }
        }
        return new C10660xE1(str, aVar, c9177r9, h9, c9177r92, c9177r93, c9177r94, c9177r95, c9177r96, z2, z3);
    }
}
