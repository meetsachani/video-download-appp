package o;

import androidx.appcompat.widget.SearchView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import o.C5962e32;
import o.NV0;

/* renamed from: o.f32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6205f32 {
    public static final NV0.a a = NV0.a.a(SearchView.z2, "c", "w", W12.e, "lc", "lj", "ml", "hd", "d");
    public static final NV0.a b = NV0.a.a(GoogleApiAvailabilityLight.e, "v");

    public static C5962e32 a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        C5962e32.b bVar = null;
        C5962e32.c cVar = null;
        Object obj = null;
        C8928q9 c8928q9 = null;
        C9177r9 c9177r9 = null;
        String str2 = null;
        float f = 0.0f;
        boolean z = false;
        C9663t9 c9663t9 = null;
        while (nv0.j()) {
            switch (nv0.s(a)) {
                case 0:
                    str = nv0.o();
                    break;
                case 1:
                    c8928q9 = I9.c(nv0, c10624x51);
                    break;
                case 2:
                    c9177r9 = I9.e(nv0, c10624x51);
                    break;
                case 3:
                    c9663t9 = I9.h(nv0, c10624x51);
                    break;
                case 4:
                    bVar = C5962e32.b.values()[nv0.m() - 1];
                    break;
                case 5:
                    cVar = C5962e32.c.values()[nv0.m() - 1];
                    break;
                case 6:
                    f = (float) nv0.l();
                    break;
                case 7:
                    z = nv0.k();
                    break;
                case 8:
                    nv0.d();
                    while (nv0.j()) {
                        nv0.f();
                        String str3 = str2;
                        Object obj2 = str3;
                        while (nv0.j()) {
                            int s = nv0.s(b);
                            if (s != 0) {
                                if (s != 1) {
                                    nv0.t();
                                    nv0.u();
                                } else {
                                    obj2 = I9.e(nv0, c10624x51);
                                }
                            } else {
                                str3 = nv0.o();
                            }
                            obj2 = obj2;
                        }
                        nv0.i();
                        str3.getClass();
                        char c = 65535;
                        switch (str3.hashCode()) {
                            case 100:
                                if (str3.equals("d")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 103:
                                if (str3.equals("g")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 111:
                                if (str3.equals(W12.e)) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                c10624x51.A(true);
                                arrayList.add(obj2);
                                break;
                            case 2:
                                obj = obj2;
                                break;
                        }
                        str2 = null;
                    }
                    nv0.h();
                    if (arrayList.size() == 1) {
                        arrayList.add((C9177r9) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    nv0.u();
                    continue;
            }
            str2 = null;
        }
        if (c9663t9 == null) {
            c9663t9 = new C9663t9(Collections.singletonList(new LX0(100)));
        }
        if (bVar == null) {
            bVar = C5962e32.b.BUTT;
        }
        if (cVar == null) {
            cVar = C5962e32.c.MITER;
        }
        return new C5962e32(str, obj, arrayList, c8928q9, c9663t9, c9177r9, bVar, cVar, f, z);
    }
}
