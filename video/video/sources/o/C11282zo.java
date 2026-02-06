package o;

import java.io.IOException;
import o.NV0;

/* renamed from: o.zo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11282zo {
    public static final NV0.a a = NV0.a.a("ef");
    public static final NV0.a b = NV0.a.a("ty", "v");

    public static C11039yo a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        nv0.f();
        C11039yo c11039yo = null;
        while (true) {
            boolean z = false;
            while (nv0.j()) {
                int s = nv0.s(b);
                if (s != 0) {
                    if (s != 1) {
                        nv0.t();
                        nv0.u();
                    } else if (z) {
                        c11039yo = new C11039yo(I9.e(nv0, c10624x51));
                    } else {
                        nv0.u();
                    }
                } else if (nv0.m() == 0) {
                    z = true;
                }
            }
            nv0.i();
            return c11039yo;
        }
    }

    public static C11039yo b(NV0 nv0, C10624x51 c10624x51) throws IOException {
        C11039yo c11039yo = null;
        while (nv0.j()) {
            if (nv0.s(a) != 0) {
                nv0.t();
                nv0.u();
            } else {
                nv0.d();
                while (nv0.j()) {
                    C11039yo a2 = a(nv0, c10624x51);
                    if (a2 != null) {
                        c11039yo = a2;
                    }
                }
                nv0.h();
            }
        }
        return c11039yo;
    }
}
