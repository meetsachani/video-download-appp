package o;

import java.io.IOException;
import java.util.ArrayList;
import o.NV0;

/* renamed from: o.Tw0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4373Tw0 {
    public static final NV0.a a = NV0.a.a("ch", "size", "w", "style", "fFamily", "data");
    public static final NV0.a b = NV0.a.a("shapes");

    public static C4276Sw0 a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        ArrayList arrayList = new ArrayList();
        nv0.f();
        double d = 0.0d;
        String str = null;
        String str2 = null;
        char c = 0;
        double d2 = 0.0d;
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
                                    nv0.f();
                                    while (nv0.j()) {
                                        if (nv0.s(b) != 0) {
                                            nv0.t();
                                            nv0.u();
                                        } else {
                                            nv0.d();
                                            while (nv0.j()) {
                                                arrayList.add((V22) C7019iM.a(nv0, c10624x51));
                                            }
                                            nv0.h();
                                        }
                                    }
                                    nv0.i();
                                }
                            } else {
                                str2 = nv0.o();
                            }
                        } else {
                            str = nv0.o();
                        }
                    } else {
                        d = nv0.l();
                    }
                } else {
                    d2 = nv0.l();
                }
            } else {
                c = nv0.o().charAt(0);
            }
        }
        nv0.i();
        return new C4276Sw0(arrayList, c, d2, d, str, str2);
    }
}
