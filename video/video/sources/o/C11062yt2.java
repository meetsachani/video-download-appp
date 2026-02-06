package o;

import java.lang.reflect.Array;
import o.C7875lt2;
import o.InterfaceC8148mw2;

/* renamed from: o.yt2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11062yt2 {
    public static int a(String str, String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(str)) {
                return i;
            }
        }
        return 0;
    }

    public static void b(C5933dw2 c5933dw2, int i, String str, String... strArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equals(str)) {
                c5933dw2.b(i, i2);
            }
        }
    }

    public static void c(C3088Gs c3088Gs, C7875lt2 c7875lt2) throws C3284Is {
        c7875lt2.b0();
        String y0 = c3088Gs.y0(InterfaceC8148mw2.h.e);
        C5933dw2 c5933dw2 = new C5933dw2();
        boolean z = true;
        boolean z2 = false;
        if (y0 != null) {
            char c = 65535;
            switch (y0.hashCode()) {
                case -1857024520:
                    if (y0.equals("startVertical")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1007052250:
                    if (y0.equals("startHorizontal")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3145837:
                    if (y0.equals("flip")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3387192:
                    if (y0.equals("none")) {
                        c = 3;
                        break;
                    }
                    break;
                case 92611485:
                    if (y0.equals("above")) {
                        c = 4;
                        break;
                    }
                    break;
                case 93621297:
                    if (y0.equals("below")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    c5933dw2.b(509, 1);
                    break;
                case 1:
                    c5933dw2.b(509, 2);
                    break;
                case 2:
                    c5933dw2.b(509, 3);
                    break;
                case 3:
                    c5933dw2.b(509, 0);
                    break;
                case 4:
                    c5933dw2.b(509, 5);
                    break;
                case 5:
                    c5933dw2.b(509, 4);
                    break;
            }
            z2 = true;
        }
        String y02 = c3088Gs.y0("interpolator");
        if (y02 != null) {
            c5933dw2.c(InterfaceC8148mw2.h.f817o, y02);
            z2 = true;
        }
        float m0 = c3088Gs.m0(InterfaceC8148mw2.h.h);
        if (!Float.isNaN(m0)) {
            c5933dw2.a(InterfaceC8148mw2.h.p, m0);
        } else {
            z = z2;
        }
        if (z) {
            c7875lt2.d0(c5933dw2);
        }
        C3088Gs s0 = c3088Gs.s0("onSwipe");
        if (s0 != null) {
            i(s0, c7875lt2);
        }
        g(c3088Gs, c7875lt2);
    }

    @Deprecated
    public static void d(C3088Gs c3088Gs, C7875lt2 c7875lt2, VP vp) throws C3284Is {
        c(c3088Gs, c7875lt2);
    }

    public static void e(C3088Gs c3088Gs, C7875lt2 c7875lt2) throws C3284Is {
        C2587Bs j0;
        NT[][] ntArr;
        NT[] ntArr2;
        C3088Gs c3088Gs2;
        int i;
        String[] strArr;
        C2587Bs j02 = c3088Gs.j0("target");
        if (j02 != null && (j0 = c3088Gs.j0("frames")) != null) {
            String y0 = c3088Gs.y0("transitionEasing");
            String[] strArr2 = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha"};
            int[] iArr = {311, 312, 304, 305, 306, 308, 309, 310, 303};
            boolean[] zArr = {false, false, true, true, true, false, false, false, false};
            int size = j0.size();
            C5933dw2[] c5933dw2Arr = new C5933dw2[size];
            for (int i2 = 0; i2 < j0.size(); i2++) {
                c5933dw2Arr[i2] = new C5933dw2();
            }
            int i3 = 0;
            for (int i4 = 9; i3 < i4; i4 = 9) {
                String str = strArr2[i3];
                int i5 = iArr[i3];
                boolean z = zArr[i3];
                C2587Bs j03 = c3088Gs.j0(str);
                if (j03 != null && j03.size() != size) {
                    throw new C3284Is("incorrect size for " + str + " array, not matching targets array!", c3088Gs);
                }
                if (j03 != null) {
                    int i6 = 0;
                    while (i6 < size) {
                        float f = j03.getFloat(i6);
                        String[] strArr3 = strArr2;
                        if (z) {
                            f = c7875lt2.r.a(f);
                        }
                        c5933dw2Arr[i6].a(i5, f);
                        i6++;
                        strArr2 = strArr3;
                    }
                    strArr = strArr2;
                } else {
                    strArr = strArr2;
                    float m0 = c3088Gs.m0(str);
                    if (!Float.isNaN(m0)) {
                        if (z) {
                            m0 = c7875lt2.r.a(m0);
                        }
                        for (int i7 = 0; i7 < size; i7++) {
                            c5933dw2Arr[i7].a(i5, m0);
                        }
                    }
                }
                i3++;
                strArr2 = strArr;
            }
            int i8 = 0;
            C2783Ds u0 = c3088Gs.u0("custom");
            if (u0 != null && (u0 instanceof C3088Gs)) {
                C3088Gs c3088Gs3 = (C3088Gs) u0;
                int size2 = c3088Gs3.size();
                ntArr = (NT[][]) Array.newInstance(NT.class, j0.size(), size2);
                int i9 = 0;
                while (i9 < size2) {
                    C2881Es c2881Es = (C2881Es) c3088Gs3.Y(i9);
                    String f2 = c2881Es.f();
                    if (c2881Es.O0() instanceof C2587Bs) {
                        C2587Bs c2587Bs = (C2587Bs) c2881Es.O0();
                        int size3 = c2587Bs.size();
                        if (size3 == size && size3 > 0) {
                            int i10 = i8;
                            if (c2587Bs.Y(i10) instanceof C2990Fs) {
                                int i11 = i10;
                                while (i11 < size) {
                                    ntArr[i11][i9] = new NT(f2, 901, c2587Bs.Y(i11).k());
                                    i11++;
                                    c3088Gs3 = c3088Gs3;
                                }
                            } else {
                                c3088Gs2 = c3088Gs3;
                                int i12 = 0;
                                while (i12 < size) {
                                    long h = SK.h(c2587Bs.Y(i12).f());
                                    if (h != -1) {
                                        i = i12;
                                        ntArr[i12][i9] = new NT(f2, 902, (int) h);
                                    } else {
                                        i = i12;
                                    }
                                    i12 = i + 1;
                                }
                            }
                        }
                        c3088Gs2 = c3088Gs3;
                    } else {
                        c3088Gs2 = c3088Gs3;
                        C2783Ds O0 = c2881Es.O0();
                        if (O0 instanceof C2990Fs) {
                            float k = O0.k();
                            for (int i13 = 0; i13 < size; i13++) {
                                ntArr[i13][i9] = new NT(f2, 901, k);
                            }
                        } else {
                            long h2 = SK.h(O0.f());
                            if (h2 != -1) {
                                int i14 = 0;
                                while (i14 < size) {
                                    ntArr[i14][i9] = new NT(f2, 902, (int) h2);
                                    i14++;
                                    size2 = size2;
                                    h2 = h2;
                                }
                            }
                        }
                    }
                    i9++;
                    size2 = size2;
                    c3088Gs3 = c3088Gs2;
                    i8 = 0;
                }
            } else {
                ntArr = null;
            }
            String y02 = c3088Gs.y0("curveFit");
            for (int i15 = 0; i15 < j02.size(); i15++) {
                for (int i16 = 0; i16 < size; i16++) {
                    String v0 = j02.v0(i15);
                    C5933dw2 c5933dw2 = c5933dw2Arr[i16];
                    if (y02 != null) {
                        c5933dw2.b(InterfaceC8148mw2.g.p, a(y02, "spline", C6725h90.l));
                    }
                    c5933dw2.e(InterfaceC8148mw2.g.i, y0);
                    c5933dw2.b(100, j0.getInt(i16));
                    if (ntArr != null) {
                        ntArr2 = ntArr[i16];
                    } else {
                        ntArr2 = null;
                    }
                    c7875lt2.q(v0, c5933dw2, ntArr2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(C3088Gs c3088Gs, C7875lt2 c7875lt2) throws C3284Is {
        int[] iArr;
        C2587Bs f0 = c3088Gs.f0("target");
        C2587Bs f02 = c3088Gs.f0("frames");
        String y0 = c3088Gs.y0("transitionEasing");
        String[] strArr = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha", InterfaceC8148mw2.c.Q, InterfaceC8148mw2.c.R, InterfaceC8148mw2.c.S};
        int[] iArr2 = {311, 312, 304, 305, 306, 308, 309, 310, 403, InterfaceC8148mw2.c.u, InterfaceC8148mw2.c.v, InterfaceC8148mw2.c.w};
        int[] iArr3 = {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 2, 0};
        int size = f02.size();
        C5933dw2[] c5933dw2Arr = new C5933dw2[size];
        for (int i = 0; i < size; i++) {
            c5933dw2Arr[i] = new C5933dw2();
        }
        boolean z = false;
        for (int i2 = 0; i2 < 12; i2++) {
            if (c3088Gs.z0(strArr[i2]) && iArr3[i2] == 1) {
                z = true;
            }
        }
        int i3 = 0;
        for (int i4 = 12; i3 < i4; i4 = 12) {
            String str = strArr[i3];
            int i5 = iArr2[i3];
            int i6 = iArr3[i3];
            C2587Bs j0 = c3088Gs.j0(str);
            String[] strArr2 = strArr;
            if (j0 != null && j0.size() != size) {
                throw new C3284Is("incorrect size for $attrName array, not matching targets array!", c3088Gs);
            }
            if (j0 != null) {
                int i7 = 0;
                while (i7 < size) {
                    float f = j0.getFloat(i7);
                    int[] iArr4 = iArr2;
                    if (i6 == 1) {
                        f = c7875lt2.r.a(f);
                    } else if (i6 == 2 && z) {
                        f = c7875lt2.r.a(f);
                    }
                    c5933dw2Arr[i7].a(i5, f);
                    i7++;
                    iArr2 = iArr4;
                }
                iArr = iArr2;
            } else {
                iArr = iArr2;
                float m0 = c3088Gs.m0(str);
                if (!Float.isNaN(m0)) {
                    if (i6 == 1) {
                        m0 = c7875lt2.r.a(m0);
                    } else if (i6 == 2 && z) {
                        m0 = c7875lt2.r.a(m0);
                    }
                    for (int i8 = 0; i8 < size; i8++) {
                        c5933dw2Arr[i8].a(i5, m0);
                    }
                }
            }
            i3++;
            strArr = strArr2;
            iArr2 = iArr;
        }
        String y02 = c3088Gs.y0("curveFit");
        String y03 = c3088Gs.y0("easing");
        String y04 = c3088Gs.y0("waveShape");
        String y05 = c3088Gs.y0(InterfaceC8148mw2.c.P);
        for (int i9 = 0; i9 < f0.size(); i9++) {
            for (int i10 = 0; i10 < size; i10++) {
                String v0 = f0.v0(i9);
                C5933dw2 c5933dw2 = c5933dw2Arr[i10];
                if (y02 != null) {
                    if (!y02.equals(C6725h90.l)) {
                        if (y02.equals("spline")) {
                            c5933dw2.b(401, 0);
                        }
                    } else {
                        c5933dw2.b(401, 1);
                        c5933dw2.e(InterfaceC8148mw2.g.i, y0);
                        if (y03 != null) {
                            c5933dw2.c(InterfaceC8148mw2.c.r, y03);
                        }
                        if (y04 != null) {
                            c5933dw2.c(421, y04);
                        }
                        if (y05 == null) {
                            c5933dw2.c(InterfaceC8148mw2.c.t, y05);
                        }
                        c5933dw2.b(100, f02.getInt(i10));
                        c7875lt2.r(v0, c5933dw2);
                    }
                }
                c5933dw2.e(InterfaceC8148mw2.g.i, y0);
                if (y03 != null) {
                }
                if (y04 != null) {
                }
                if (y05 == null) {
                }
                c5933dw2.b(100, f02.getInt(i10));
                c7875lt2.r(v0, c5933dw2);
            }
        }
    }

    public static void g(C3088Gs c3088Gs, C7875lt2 c7875lt2) throws C3284Is {
        C3088Gs s0 = c3088Gs.s0(C10243vX0.f);
        if (s0 != null) {
            C2587Bs j0 = s0.j0("KeyPositions");
            if (j0 != null) {
                for (int i = 0; i < j0.size(); i++) {
                    C2783Ds Y = j0.Y(i);
                    if (Y instanceof C3088Gs) {
                        h((C3088Gs) Y, c7875lt2);
                    }
                }
            }
            C2587Bs j02 = s0.j0("KeyAttributes");
            if (j02 != null) {
                for (int i2 = 0; i2 < j02.size(); i2++) {
                    C2783Ds Y2 = j02.Y(i2);
                    if (Y2 instanceof C3088Gs) {
                        e((C3088Gs) Y2, c7875lt2);
                    }
                }
            }
            C2587Bs j03 = s0.j0("KeyCycles");
            if (j03 != null) {
                for (int i3 = 0; i3 < j03.size(); i3++) {
                    C2783Ds Y3 = j03.Y(i3);
                    if (Y3 instanceof C3088Gs) {
                        f((C3088Gs) Y3, c7875lt2);
                    }
                }
            }
        }
    }

    public static void h(C3088Gs c3088Gs, C7875lt2 c7875lt2) throws C3284Is {
        C5933dw2 c5933dw2 = new C5933dw2();
        C2587Bs f0 = c3088Gs.f0("target");
        C2587Bs f02 = c3088Gs.f0("frames");
        C2587Bs j0 = c3088Gs.j0("percentX");
        C2587Bs j02 = c3088Gs.j0("percentY");
        C2587Bs j03 = c3088Gs.j0("percentWidth");
        C2587Bs j04 = c3088Gs.j0("percentHeight");
        String y0 = c3088Gs.y0(InterfaceC8148mw2.h.e);
        String y02 = c3088Gs.y0("transitionEasing");
        String y03 = c3088Gs.y0("curveFit");
        String y04 = c3088Gs.y0("type");
        if (y04 == null) {
            y04 = "parentRelative";
        }
        if (j0 == null || f02.size() == j0.size()) {
            if (j02 == null || f02.size() == j02.size()) {
                int i = 0;
                while (i < f0.size()) {
                    String v0 = f0.v0(i);
                    int a = a(y04, "deltaRelative", "pathRelative", "parentRelative");
                    c5933dw2.h();
                    c5933dw2.b(InterfaceC8148mw2.g.r, a);
                    if (y03 != null) {
                        b(c5933dw2, InterfaceC8148mw2.g.p, y03, "spline", C6725h90.l);
                    }
                    c5933dw2.e(InterfaceC8148mw2.g.i, y02);
                    if (y0 != null) {
                        b(c5933dw2, 509, y0, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                    }
                    int i2 = 0;
                    while (i2 < f02.size()) {
                        c5933dw2.b(100, f02.getInt(i2));
                        j(c5933dw2, InterfaceC8148mw2.g.n, j0, i2);
                        j(c5933dw2, InterfaceC8148mw2.g.f816o, j02, i2);
                        j(c5933dw2, InterfaceC8148mw2.g.k, j03, i2);
                        j(c5933dw2, InterfaceC8148mw2.g.l, j04, i2);
                        c7875lt2.t(v0, c5933dw2);
                        i2++;
                        y04 = y04;
                    }
                    i++;
                    y04 = y04;
                }
            }
        }
    }

    public static void i(C2685Cs c2685Cs, C7875lt2 c7875lt2) {
        String y0 = c2685Cs.y0("anchor");
        int a = a(c2685Cs.y0("side"), C7875lt2.b.B);
        int a2 = a(c2685Cs.y0("direction"), C7875lt2.b.L);
        float m0 = c2685Cs.m0("scale");
        float m02 = c2685Cs.m0("threshold");
        float m03 = c2685Cs.m0("maxVelocity");
        float m04 = c2685Cs.m0("maxAccel");
        String y02 = c2685Cs.y0("limitBounds");
        int a3 = a(c2685Cs.y0("mode"), C7875lt2.b.O);
        int a4 = a(c2685Cs.y0("touchUp"), C7875lt2.b.X);
        float m05 = c2685Cs.m0("springMass");
        float m06 = c2685Cs.m0("springStiffness");
        float m07 = c2685Cs.m0("springDamping");
        float m08 = c2685Cs.m0("stopThreshold");
        int a5 = a(c2685Cs.y0("springBoundary"), C7875lt2.b.c0);
        String y03 = c2685Cs.y0("around");
        C7875lt2.b y = c7875lt2.y();
        y.i(y0);
        y.j(a);
        y.l(a2);
        y.m(m0);
        y.n(m02);
        y.q(m03);
        y.p(m04);
        y.o(y02);
        y.k(a3);
        y.r(a4);
        y.v(m05);
        y.w(m06);
        y.u(m07);
        y.x(m08);
        y.t(a5);
        y.s(y03);
    }

    public static void j(C5933dw2 c5933dw2, int i, C2587Bs c2587Bs, int i2) throws C3284Is {
        if (c2587Bs != null) {
            c5933dw2.a(i, c2587Bs.getFloat(i2));
        }
    }
}
