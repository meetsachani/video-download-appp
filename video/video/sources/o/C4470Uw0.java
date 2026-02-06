package o;

import java.io.IOException;
import o.NV0;

/* renamed from: o.Uw0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4470Uw0 {
    public static final NV0.a a = NV0.a.a("fFamily", "fName", "fStyle", "ascent");

    public static C3982Pw0 a(NV0 nv0) throws IOException {
        nv0.f();
        String str = null;
        String str2 = null;
        float f = 0.0f;
        String str3 = null;
        while (nv0.j()) {
            int s = nv0.s(a);
            if (s != 0) {
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            nv0.t();
                            nv0.u();
                        } else {
                            f = (float) nv0.l();
                        }
                    } else {
                        str2 = nv0.o();
                    }
                } else {
                    str3 = nv0.o();
                }
            } else {
                str = nv0.o();
            }
        }
        nv0.i();
        return new C3982Pw0(str, str3, str2, f);
    }
}
