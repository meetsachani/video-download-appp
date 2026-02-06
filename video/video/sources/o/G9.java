package o;

import android.graphics.PointF;
import java.io.IOException;
import o.NV0;

/* loaded from: classes.dex */
public class G9 {
    public static final NV0.a a = NV0.a.a("a", "p", "s", "rz", "r", W12.e, "so", "eo", "sk", "sa", "rx", "ry");
    public static final NV0.a b = NV0.a.a("k");

    public static void a(C9177r9 c9177r9, C10624x51 c10624x51) {
        Float valueOf = Float.valueOf(0.0f);
        if (c9177r9.b().isEmpty()) {
            c9177r9.b().add(new LX0(c10624x51, valueOf, valueOf, null, 0.0f, Float.valueOf(c10624x51.f())));
        } else if (((LX0) c9177r9.b().get(0)).b == 0) {
            c9177r9.b().set(0, new LX0(c10624x51, valueOf, valueOf, null, 0.0f, Float.valueOf(c10624x51.f())));
        }
    }

    public static boolean b(C9906u9 c9906u9) {
        if (c9906u9 != null) {
            if (!c9906u9.c() || !c9906u9.b().get(0).b.equals(0.0f, 0.0f)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean c(H9<PointF, PointF> h9) {
        if (h9 != null) {
            if ((h9 instanceof C11124z9) || !h9.c() || !h9.b().get(0).b.equals(0.0f, 0.0f)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean d(C9177r9 c9177r9) {
        if (c9177r9 != null) {
            if (!c9177r9.c() || ((Float) ((LX0) c9177r9.b().get(0)).b).floatValue() != 0.0f) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean e(C10638x9 c10638x9) {
        if (c10638x9 != null) {
            if (!c10638x9.c() || !((UX1) ((LX0) c10638x9.b().get(0)).b).a(1.0f, 1.0f)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean f(C9177r9 c9177r9) {
        if (c9177r9 != null) {
            if (!c9177r9.c() || ((Float) ((LX0) c9177r9.b().get(0)).b).floatValue() != 0.0f) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean g(C9177r9 c9177r9) {
        if (c9177r9 != null) {
            if (!c9177r9.c() || ((Float) ((LX0) c9177r9.b().get(0)).b).floatValue() != 0.0f) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static F9 h(NV0 nv0, C10624x51 c10624x51) throws IOException {
        boolean z;
        C9906u9 c9906u9;
        H9<PointF, PointF> h9;
        C9177r9 c9177r9;
        C10638x9 c10638x9;
        C9177r9 c9177r92;
        C9177r9 c9177r93;
        C9177r9 c9177r94;
        C9177r9 c9177r95;
        C9177r9 c9177r96;
        if (nv0.q() == NV0.b.BEGIN_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            nv0.f();
        }
        C9906u9 c9906u92 = null;
        H9<PointF, PointF> h92 = null;
        C9177r9 c9177r97 = null;
        C10638x9 c10638x92 = null;
        C9177r9 c9177r98 = null;
        C9177r9 c9177r99 = null;
        C9177r9 c9177r910 = null;
        C9177r9 c9177r911 = null;
        C9177r9 c9177r912 = null;
        C9663t9 c9663t9 = null;
        C9177r9 c9177r913 = null;
        C9177r9 c9177r914 = null;
        while (nv0.j()) {
            switch (nv0.s(a)) {
                case 0:
                    nv0.f();
                    while (nv0.j()) {
                        if (nv0.s(b) != 0) {
                            nv0.t();
                            nv0.u();
                        } else {
                            c9906u92 = C10149v9.a(nv0, c10624x51);
                        }
                    }
                    nv0.i();
                    break;
                case 1:
                    h92 = C10149v9.b(nv0, c10624x51);
                    break;
                case 2:
                    c10638x92 = I9.j(nv0, c10624x51);
                    break;
                case 3:
                    c9177r912 = I9.f(nv0, c10624x51, false);
                    a(c9177r912, c10624x51);
                    break;
                case 4:
                    c9177r97 = I9.f(nv0, c10624x51, false);
                    a(c9177r97, c10624x51);
                    break;
                case 5:
                    c9663t9 = I9.h(nv0, c10624x51);
                    break;
                case 6:
                    c9177r913 = I9.f(nv0, c10624x51, false);
                    break;
                case 7:
                    c9177r914 = I9.f(nv0, c10624x51, false);
                    break;
                case 8:
                    c9177r98 = I9.f(nv0, c10624x51, false);
                    break;
                case 9:
                    c9177r99 = I9.f(nv0, c10624x51, false);
                    break;
                case 10:
                    c9177r910 = I9.f(nv0, c10624x51, false);
                    a(c9177r910, c10624x51);
                    break;
                case 11:
                    c9177r911 = I9.f(nv0, c10624x51, false);
                    a(c9177r911, c10624x51);
                    break;
                default:
                    nv0.t();
                    nv0.u();
                    break;
            }
        }
        if (z) {
            nv0.i();
        }
        if (b(c9906u92)) {
            c9906u9 = null;
        } else {
            c9906u9 = c9906u92;
        }
        if (c(h92)) {
            h9 = null;
        } else {
            h9 = h92;
        }
        if (d(c9177r97)) {
            c9177r9 = null;
        } else {
            c9177r9 = c9177r97;
        }
        if (e(c10638x92)) {
            c10638x9 = null;
        } else {
            c10638x9 = c10638x92;
        }
        if (g(c9177r98)) {
            c9177r92 = null;
        } else {
            c9177r92 = c9177r98;
        }
        if (f(c9177r99)) {
            c9177r93 = null;
        } else {
            c9177r93 = c9177r99;
        }
        if (d(c9177r910)) {
            c9177r94 = null;
        } else {
            c9177r94 = c9177r910;
        }
        if (d(c9177r911)) {
            c9177r95 = null;
        } else {
            c9177r95 = c9177r911;
        }
        if (d(c9177r912)) {
            c9177r96 = null;
        } else {
            c9177r96 = c9177r912;
        }
        return new F9(c9906u9, h9, c10638x9, c9177r9, c9663t9, c9177r913, c9177r914, c9177r92, c9177r93, c9177r94, c9177r95, c9177r96);
    }
}
