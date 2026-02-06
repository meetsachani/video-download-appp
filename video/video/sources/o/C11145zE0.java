package o;

import androidx.appcompat.widget.SearchView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import o.C5962e32;
import o.NV0;

/* renamed from: o.zE0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11145zE0 {
    public static final NV0.a a = NV0.a.a(SearchView.z2, "g", W12.e, "t", "s", W12.i, "w", "lc", "lj", "ml", "hd", "d");
    public static final NV0.a b = NV0.a.a("p", "k");
    public static final NV0.a c = NV0.a.a(GoogleApiAvailabilityLight.e, "v");

    public static C10659xE0 a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        C9663t9 c9663t9;
        C9663t9 c9663t92;
        AE0 ae0;
        ArrayList arrayList = new ArrayList();
        AE0 ae02 = null;
        String str = null;
        C9420s9 c9420s9 = null;
        C10395w9 c10395w9 = null;
        C10395w9 c10395w92 = null;
        C9177r9 c9177r9 = null;
        C5962e32.b bVar = null;
        C5962e32.c cVar = null;
        C9177r9 c9177r92 = null;
        float f = 0.0f;
        boolean z = false;
        C9663t9 c9663t93 = null;
        while (nv0.j()) {
            AE0 ae03 = ae02;
            switch (nv0.s(a)) {
                case 0:
                    str = nv0.o();
                    ae02 = ae03;
                case 1:
                    c9663t92 = c9663t93;
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
                    ae02 = ae03;
                    c9663t93 = c9663t92;
                case 2:
                    c9663t93 = I9.h(nv0, c10624x51);
                    ae02 = ae03;
                case 3:
                    c9663t92 = c9663t93;
                    if (nv0.m() == 1) {
                        ae0 = AE0.LINEAR;
                    } else {
                        ae0 = AE0.RADIAL;
                    }
                    ae02 = ae0;
                    c9663t93 = c9663t92;
                case 4:
                    c10395w9 = I9.i(nv0, c10624x51);
                    ae02 = ae03;
                case 5:
                    c10395w92 = I9.i(nv0, c10624x51);
                    ae02 = ae03;
                case 6:
                    c9177r9 = I9.e(nv0, c10624x51);
                    ae02 = ae03;
                case 7:
                    c9663t92 = c9663t93;
                    bVar = C5962e32.b.values()[nv0.m() - 1];
                    ae02 = ae03;
                    c9663t93 = c9663t92;
                case 8:
                    c9663t92 = c9663t93;
                    cVar = C5962e32.c.values()[nv0.m() - 1];
                    ae02 = ae03;
                    c9663t93 = c9663t92;
                case 9:
                    c9663t92 = c9663t93;
                    f = (float) nv0.l();
                    ae02 = ae03;
                    c9663t93 = c9663t92;
                case 10:
                    z = nv0.k();
                    ae02 = ae03;
                case 11:
                    nv0.d();
                    while (nv0.j()) {
                        nv0.f();
                        String str2 = null;
                        C9177r9 c9177r93 = null;
                        while (nv0.j()) {
                            int s2 = nv0.s(c);
                            if (s2 != 0) {
                                C9663t9 c9663t94 = c9663t93;
                                if (s2 != 1) {
                                    nv0.t();
                                    nv0.u();
                                } else {
                                    c9177r93 = I9.e(nv0, c10624x51);
                                }
                                c9663t93 = c9663t94;
                            } else {
                                str2 = nv0.o();
                            }
                        }
                        C9663t9 c9663t95 = c9663t93;
                        nv0.i();
                        if (str2.equals(W12.e)) {
                            c9177r92 = c9177r93;
                        } else if (str2.equals("d") || str2.equals("g")) {
                            c10624x51.A(true);
                            arrayList.add(c9177r93);
                            c9663t93 = c9663t95;
                        }
                        c9663t93 = c9663t95;
                    }
                    c9663t92 = c9663t93;
                    nv0.h();
                    if (arrayList.size() == 1) {
                        arrayList.add((C9177r9) arrayList.get(0));
                    }
                    ae02 = ae03;
                    c9663t93 = c9663t92;
                    break;
                default:
                    nv0.t();
                    nv0.u();
                    ae02 = ae03;
            }
        }
        AE0 ae04 = ae02;
        C9663t9 c9663t96 = c9663t93;
        if (c9663t96 == null) {
            c9663t9 = new C9663t9(Collections.singletonList(new LX0(100)));
        } else {
            c9663t9 = c9663t96;
        }
        return new C10659xE0(str, ae04, c9420s9, c9663t9, c10395w9, c10395w92, c9177r9, bVar, cVar, f, arrayList, c9177r92, z);
    }
}
