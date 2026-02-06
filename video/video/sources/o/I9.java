package o;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class I9 {
    public static <T> List<LX0<T>> a(NV0 nv0, float f, C10624x51 c10624x51, GE2<T> ge2) throws IOException {
        return OX0.a(nv0, c10624x51, f, ge2, false);
    }

    public static <T> List<LX0<T>> b(NV0 nv0, C10624x51 c10624x51, GE2<T> ge2) throws IOException {
        return OX0.a(nv0, c10624x51, 1.0f, ge2, false);
    }

    public static C8928q9 c(NV0 nv0, C10624x51 c10624x51) throws IOException {
        return new C8928q9(b(nv0, c10624x51, C6011eG.a));
    }

    public static A9 d(NV0 nv0, C10624x51 c10624x51) throws IOException {
        return new A9(a(nv0, C6006eE2.e(), c10624x51, P40.a));
    }

    public static C9177r9 e(NV0 nv0, C10624x51 c10624x51) throws IOException {
        return f(nv0, c10624x51, true);
    }

    public static C9177r9 f(NV0 nv0, C10624x51 c10624x51, boolean z) throws IOException {
        float f;
        if (z) {
            f = C6006eE2.e();
        } else {
            f = 1.0f;
        }
        return new C9177r9(a(nv0, f, c10624x51, C11068yv0.a));
    }

    public static C9420s9 g(NV0 nv0, C10624x51 c10624x51, int i) throws IOException {
        return new C9420s9(b(nv0, c10624x51, new C9441sE0(i)));
    }

    public static C9663t9 h(NV0 nv0, C10624x51 c10624x51) throws IOException {
        return new C9663t9(b(nv0, c10624x51, PR0.a));
    }

    public static C10395w9 i(NV0 nv0, C10624x51 c10624x51) throws IOException {
        return new C10395w9(OX0.a(nv0, c10624x51, C6006eE2.e(), SD1.a, true));
    }

    public static C10638x9 j(NV0 nv0, C10624x51 c10624x51) throws IOException {
        return new C10638x9(b(nv0, c10624x51, VX1.a));
    }

    public static C10881y9 k(NV0 nv0, C10624x51 c10624x51) throws IOException {
        return new C10881y9(a(nv0, C6006eE2.e(), c10624x51, S22.a));
    }
}
