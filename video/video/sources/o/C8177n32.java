package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C4820Ym;
import o.C8774pV1;

/* renamed from: o.n32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8177n32 {
    public static final float[] A(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        int i2;
        float f8;
        float f9;
        float f10;
        long d;
        float min = Math.min(f, f2);
        float t = C5075aO1.t(f2 - f, 0.0f);
        float t2 = C5075aO1.t(f - f2, 0.0f);
        float f11 = 2;
        float f12 = t / f11;
        float f13 = t2 / f11;
        float j = C5764dE2.j() * min * C5764dE2.l(f3, 1.0f, f4);
        float f14 = (f11 * t2) + (f11 * t) + j;
        float f15 = j / 4;
        float f16 = f12 + f15;
        float f17 = f16 + t2;
        float f18 = f17 + f15;
        float f19 = f18 + t;
        float f20 = f19 + f15;
        float f21 = f20 + t2;
        float f22 = f21 + f15;
        float[] fArr = {0.0f, f12, f16, f17, f18, f19, f20, f21, f22, f22 + f12, f14};
        int i3 = i * 2;
        float f23 = f14 / i3;
        float f24 = f5 * f14;
        float[] fArr2 = new float[i * 4];
        long d2 = C7638kv0.d(f13, f12);
        float f25 = -f13;
        long d3 = C7638kv0.d(f25, f12);
        float f26 = -f12;
        long d4 = C7638kv0.d(f25, f26);
        long d5 = C7638kv0.d(f13, f26);
        float f27 = f12;
        int i4 = 0;
        float f28 = 0.0f;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i3) {
            float f29 = f24 % f14;
            if (f29 < f28) {
                i5 = 0;
            }
            while (true) {
                int i7 = (i5 + 1) % 11;
                float f30 = fArr[i7];
                if (f29 >= f30) {
                    f27 = fArr[(i7 + 1) % 11];
                    i5 = i7;
                    f28 = f30;
                } else {
                    float f31 = (f29 - f28) / (f27 - f28);
                    if (z) {
                        i2 = i4;
                        f8 = min * f3;
                    } else {
                        i2 = i4;
                        f8 = min;
                    }
                    switch (i5) {
                        case 0:
                            f9 = f12;
                            float f32 = f8;
                            f10 = f13;
                            d = C7638kv0.d(f32, f31 * f9);
                            break;
                        case 1:
                            f9 = f12;
                            float f33 = f8;
                            f10 = f13;
                            d = UD1.n(C5764dE2.o(f33, (f31 * C5764dE2.i()) / f11, 0L, 4, null), d2);
                            break;
                        case 2:
                            f9 = f12;
                            float f34 = f8;
                            f10 = f13;
                            d = C7638kv0.d(f10 - (f31 * t2), f34);
                            break;
                        case 3:
                            f9 = f12;
                            float f35 = f8;
                            f10 = f13;
                            d = UD1.n(C5764dE2.o(f35, (C5764dE2.i() / f11) + ((f31 * C5764dE2.i()) / f11), 0L, 4, null), d3);
                            break;
                        case 4:
                            f9 = f12;
                            float f36 = f8;
                            f10 = f13;
                            d = C7638kv0.d(-f36, f9 - (f31 * t));
                            break;
                        case 5:
                            f9 = f12;
                            float f37 = f8;
                            f10 = f13;
                            d = UD1.n(C5764dE2.o(f37, C5764dE2.i() + ((f31 * C5764dE2.i()) / f11), 0L, 4, null), d4);
                            break;
                        case 6:
                            f9 = f12;
                            float f38 = f8;
                            f10 = f13;
                            d = C7638kv0.d(f25 + (f31 * t2), -f38);
                            break;
                        case 7:
                            f9 = f12;
                            float f39 = f8;
                            f10 = f13;
                            d = UD1.n(C5764dE2.o(f39, (C5764dE2.i() * 1.5f) + ((f31 * C5764dE2.i()) / f11), 0L, 4, null), d5);
                            break;
                        default:
                            f9 = f12;
                            d = C7638kv0.d(f8, f26 + (f31 * f12));
                            f10 = f13;
                            break;
                    }
                    int i8 = i6 + 1;
                    fArr2[i6] = UD1.j(d) + f6;
                    i6 += 2;
                    fArr2[i8] = UD1.k(d) + f7;
                    f24 += f23;
                    z = !z;
                    f13 = f10;
                    i4 = i2 + 1;
                    f12 = f9;
                }
            }
        }
        return fArr2;
    }

    public static final C8774pV1 B(C8774pV1.a aVar, float f, float f2, XP xp, List<XP> list, float f3, float f4) {
        C6562gT0.p(aVar, "<this>");
        C6562gT0.p(xp, "rounding");
        float f5 = 2;
        float f6 = f / f5;
        float f7 = f3 - f6;
        float f8 = f2 / f5;
        float f9 = f4 - f8;
        float f10 = f6 + f3;
        float f11 = f8 + f4;
        return C9017qV1.l(new float[]{f10, f11, f7, f11, f7, f9, f10, f9}, xp, list, f3, f4);
    }

    public static /* synthetic */ C8774pV1 C(C8774pV1.a aVar, float f, float f2, XP xp, List list, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 2.0f;
        }
        if ((i & 2) != 0) {
            f2 = 2.0f;
        }
        if ((i & 4) != 0) {
            xp = XP.d;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            f3 = 0.0f;
        }
        if ((i & 32) != 0) {
            f4 = 0.0f;
        }
        return B(aVar, f, f2, xp, list, f3, f4);
    }

    public static final C8774pV1 D(C8774pV1.a aVar, int i) {
        C6562gT0.p(aVar, "<this>");
        return L(aVar, i, 0.0f, 0.0f, null, null, null, 0.0f, 0.0f, C9680tD0.l, null);
    }

    public static final C8774pV1 E(C8774pV1.a aVar, int i, float f) {
        C6562gT0.p(aVar, "<this>");
        return L(aVar, i, f, 0.0f, null, null, null, 0.0f, 0.0f, 252, null);
    }

    public static final C8774pV1 F(C8774pV1.a aVar, int i, float f, float f2) {
        C6562gT0.p(aVar, "<this>");
        return L(aVar, i, f, f2, null, null, null, 0.0f, 0.0f, 248, null);
    }

    public static final C8774pV1 G(C8774pV1.a aVar, int i, float f, float f2, XP xp) {
        C6562gT0.p(aVar, "<this>");
        C6562gT0.p(xp, "rounding");
        return L(aVar, i, f, f2, xp, null, null, 0.0f, 0.0f, 240, null);
    }

    public static final C8774pV1 H(C8774pV1.a aVar, int i, float f, float f2, XP xp, XP xp2) {
        C6562gT0.p(aVar, "<this>");
        C6562gT0.p(xp, "rounding");
        return L(aVar, i, f, f2, xp, xp2, null, 0.0f, 0.0f, 224, null);
    }

    public static final C8774pV1 I(C8774pV1.a aVar, int i, float f, float f2, XP xp, XP xp2, List<XP> list) {
        C6562gT0.p(aVar, "<this>");
        C6562gT0.p(xp, "rounding");
        return L(aVar, i, f, f2, xp, xp2, list, 0.0f, 0.0f, CK1.x, null);
    }

    public static final C8774pV1 J(C8774pV1.a aVar, int i, float f, float f2, XP xp, XP xp2, List<XP> list, float f3) {
        C6562gT0.p(aVar, "<this>");
        C6562gT0.p(xp, "rounding");
        return L(aVar, i, f, f2, xp, xp2, list, f3, 0.0f, 128, null);
    }

    public static final C8774pV1 K(C8774pV1.a aVar, int i, float f, float f2, XP xp, XP xp2, List<XP> list, float f3, float f4) {
        C6562gT0.p(aVar, "<this>");
        C6562gT0.p(xp, "rounding");
        if (f > 0.0f && f2 > 0.0f) {
            if (f2 < f) {
                if (list == null && xp2 != null) {
                    C11197zR0 W1 = C5075aO1.W1(0, i);
                    list = new ArrayList<>();
                    Iterator<Integer> it = W1.iterator();
                    while (it.hasNext()) {
                        ((AbstractC8515oR0) it).nextInt();
                        C9444sF.q0(list, C8222nF.O(xp, xp2));
                    }
                }
                return C9017qV1.l(M(i, f, f2, f3, f4), xp, list, f3, f4);
            }
            throw new IllegalArgumentException("innerRadius must be less than radius");
        }
        throw new IllegalArgumentException("Star radii must both be greater than 0");
    }

    public static /* synthetic */ C8774pV1 L(C8774pV1.a aVar, int i, float f, float f2, XP xp, XP xp2, List list, float f3, float f4, int i2, Object obj) {
        float f5;
        float f6;
        XP xp3;
        XP xp4;
        float f7;
        float f8;
        if ((i2 & 2) != 0) {
            f5 = 1.0f;
        } else {
            f5 = f;
        }
        if ((i2 & 4) != 0) {
            f6 = 0.5f;
        } else {
            f6 = f2;
        }
        if ((i2 & 8) != 0) {
            xp3 = XP.d;
        } else {
            xp3 = xp;
        }
        List list2 = null;
        if ((i2 & 16) != 0) {
            xp4 = null;
        } else {
            xp4 = xp2;
        }
        if ((i2 & 32) == 0) {
            list2 = list;
        }
        if ((i2 & 64) != 0) {
            f7 = 0.0f;
        } else {
            f7 = f3;
        }
        if ((i2 & 128) != 0) {
            f8 = 0.0f;
        } else {
            f8 = f4;
        }
        return K(aVar, i, f5, f6, xp3, xp4, list2, f7, f8);
    }

    public static final float[] M(int i, float f, float f2, float f3, float f4) {
        float[] fArr = new float[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f5 = i;
            long o2 = C5764dE2.o(f, (C5764dE2.i() / f5) * 2 * i3, 0L, 4, null);
            fArr[i2] = UD1.j(o2) + f3;
            fArr[i2 + 1] = UD1.k(o2) + f4;
            long o3 = C5764dE2.o(f2, (C5764dE2.i() / f5) * ((i3 * 2) + 1), 0L, 4, null);
            int i4 = i2 + 3;
            fArr[i2 + 2] = UD1.j(o3) + f3;
            i2 += 4;
            fArr[i4] = UD1.k(o3) + f4;
        }
        return fArr;
    }

    public static final C8774pV1 a(C8774pV1.a aVar) {
        C6562gT0.p(aVar, "<this>");
        return f(aVar, 0, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static final C8774pV1 b(C8774pV1.a aVar, int i) {
        C6562gT0.p(aVar, "<this>");
        return f(aVar, i, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final C8774pV1 c(C8774pV1.a aVar, int i, float f) {
        C6562gT0.p(aVar, "<this>");
        return f(aVar, i, f, 0.0f, 0.0f, 12, null);
    }

    public static final C8774pV1 d(C8774pV1.a aVar, int i, float f, float f2) {
        C6562gT0.p(aVar, "<this>");
        return f(aVar, i, f, f2, 0.0f, 8, null);
    }

    public static final C8774pV1 e(C8774pV1.a aVar, int i, float f, float f2, float f3) {
        C6562gT0.p(aVar, "<this>");
        if (i >= 3) {
            return C9017qV1.m(i, f / ((float) Math.cos(C5764dE2.i() / i)), f2, f3, new XP(f, 0.0f, 2, null), null, 32, null);
        }
        throw new IllegalArgumentException("Circle must have at least three vertices");
    }

    public static /* synthetic */ C8774pV1 f(C8774pV1.a aVar, int i, float f, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        if ((i2 & 2) != 0) {
            f = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f3 = 0.0f;
        }
        return e(aVar, i, f, f2, f3);
    }

    public static final C8774pV1 g(C8774pV1.a aVar) {
        C6562gT0.p(aVar, "<this>");
        return m(aVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, null);
    }

    public static final C8774pV1 h(C8774pV1.a aVar, float f) {
        C6562gT0.p(aVar, "<this>");
        return m(aVar, f, 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
    }

    public static final C8774pV1 i(C8774pV1.a aVar, float f, float f2) {
        C6562gT0.p(aVar, "<this>");
        return m(aVar, f, f2, 0.0f, 0.0f, 0.0f, 28, null);
    }

    public static final C8774pV1 j(C8774pV1.a aVar, float f, float f2, float f3) {
        C6562gT0.p(aVar, "<this>");
        return m(aVar, f, f2, f3, 0.0f, 0.0f, 24, null);
    }

    public static final C8774pV1 k(C8774pV1.a aVar, float f, float f2, float f3, float f4) {
        C6562gT0.p(aVar, "<this>");
        return m(aVar, f, f2, f3, f4, 0.0f, 16, null);
    }

    public static final C8774pV1 l(C8774pV1.a aVar, float f, float f2, float f3, float f4, float f5) {
        C6562gT0.p(aVar, "<this>");
        if (f > 0.0f && f2 > 0.0f) {
            float f6 = 2;
            float f7 = f / f6;
            float f8 = f2 / f6;
            float f9 = f7 + f4;
            float f10 = f8 + f5;
            float f11 = (-f7) + f4;
            float f12 = (-f8) + f5;
            return C9017qV1.n(new float[]{f9, f10, f11, f10, f11, f12, f9, f12}, new XP(Math.min(f7, f8), f3), null, f4, f5, 4, null);
        }
        throw new IllegalArgumentException("Pill shapes must have positive width and height");
    }

    public static /* synthetic */ C8774pV1 m(C8774pV1.a aVar, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        float f6;
        float f7;
        float f8;
        float f9;
        C8774pV1.a aVar2;
        float f10;
        if ((i & 1) != 0) {
            f = 2.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 16) != 0) {
            f6 = 0.0f;
            f9 = f3;
            f7 = f4;
            f10 = f;
            f8 = f2;
            aVar2 = aVar;
        } else {
            f6 = f5;
            f7 = f4;
            f8 = f2;
            f9 = f3;
            aVar2 = aVar;
            f10 = f;
        }
        return l(aVar2, f10, f8, f9, f7, f6);
    }

    public static final C8774pV1 n(C8774pV1.a aVar) {
        C6562gT0.p(aVar, "<this>");
        return z(aVar, 0.0f, 0.0f, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2047, null);
    }

    public static final C8774pV1 o(C8774pV1.a aVar, float f) {
        C6562gT0.p(aVar, "<this>");
        return z(aVar, f, 0.0f, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2046, null);
    }

    public static final C8774pV1 p(C8774pV1.a aVar, float f, float f2) {
        C6562gT0.p(aVar, "<this>");
        return z(aVar, f, f2, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2044, null);
    }

    public static final C8774pV1 q(C8774pV1.a aVar, float f, float f2, int i) {
        C6562gT0.p(aVar, "<this>");
        return z(aVar, f, f2, i, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2040, null);
    }

    public static final C8774pV1 r(C8774pV1.a aVar, float f, float f2, int i, float f3) {
        C6562gT0.p(aVar, "<this>");
        return z(aVar, f, f2, i, f3, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2032, null);
    }

    public static final C8774pV1 s(C8774pV1.a aVar, float f, float f2, int i, float f3, XP xp) {
        C6562gT0.p(aVar, "<this>");
        C6562gT0.p(xp, "rounding");
        return z(aVar, f, f2, i, f3, xp, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2016, null);
    }

    public static final C8774pV1 t(C8774pV1.a aVar, float f, float f2, int i, float f3, XP xp, XP xp2) {
        C6562gT0.p(aVar, "<this>");
        C6562gT0.p(xp, "rounding");
        return z(aVar, f, f2, i, f3, xp, xp2, null, 0.0f, 0.0f, 0.0f, 0.0f, 1984, null);
    }

    public static final C8774pV1 u(C8774pV1.a aVar, float f, float f2, int i, float f3, XP xp, XP xp2, List<XP> list) {
        C6562gT0.p(aVar, "<this>");
        C6562gT0.p(xp, "rounding");
        return z(aVar, f, f2, i, f3, xp, xp2, list, 0.0f, 0.0f, 0.0f, 0.0f, 1920, null);
    }

    public static final C8774pV1 v(C8774pV1.a aVar, float f, float f2, int i, float f3, XP xp, XP xp2, List<XP> list, float f4) {
        C6562gT0.p(aVar, "<this>");
        C6562gT0.p(xp, "rounding");
        return z(aVar, f, f2, i, f3, xp, xp2, list, f4, 0.0f, 0.0f, 0.0f, C4820Ym.b.f, null);
    }

    public static final C8774pV1 w(C8774pV1.a aVar, float f, float f2, int i, float f3, XP xp, XP xp2, List<XP> list, float f4, float f5) {
        C6562gT0.p(aVar, "<this>");
        C6562gT0.p(xp, "rounding");
        return z(aVar, f, f2, i, f3, xp, xp2, list, f4, f5, 0.0f, 0.0f, I3.g, null);
    }

    public static final C8774pV1 x(C8774pV1.a aVar, float f, float f2, int i, float f3, XP xp, XP xp2, List<XP> list, float f4, float f5, float f6) {
        C6562gT0.p(aVar, "<this>");
        C6562gT0.p(xp, "rounding");
        return z(aVar, f, f2, i, f3, xp, xp2, list, f4, f5, f6, 0.0f, 1024, null);
    }

    public static final C8774pV1 y(C8774pV1.a aVar, float f, float f2, int i, float f3, XP xp, XP xp2, List<XP> list, float f4, float f5, float f6, float f7) {
        List<XP> list2;
        C6562gT0.p(aVar, "<this>");
        C6562gT0.p(xp, "rounding");
        if (f <= 0.0f || f2 <= 0.0f) {
            throw new IllegalArgumentException("Pill shapes must have positive width and height");
        }
        if (f3 > 0.0f && f3 <= 1.0f) {
            if (list != null || xp2 == null) {
                list2 = list;
            } else {
                C11197zR0 W1 = C5075aO1.W1(0, i);
                list2 = new ArrayList<>();
                Iterator<Integer> it = W1.iterator();
                while (it.hasNext()) {
                    ((AbstractC8515oR0) it).nextInt();
                    C9444sF.q0(list2, C8222nF.O(xp, xp2));
                }
            }
            return C9017qV1.l(A(i, f, f2, f3, f4, f5, f6, f7), xp, list2, f6, f7);
        }
        throw new IllegalArgumentException("innerRadius must be between 0 and 1");
    }

    public static /* synthetic */ C8774pV1 z(C8774pV1.a aVar, float f, float f2, int i, float f3, XP xp, XP xp2, List list, float f4, float f5, float f6, float f7, int i2, Object obj) {
        float f8;
        float f9;
        float f10;
        float f11;
        XP xp3;
        List list2;
        float f12;
        XP xp4;
        float f13;
        int i3;
        C8774pV1.a aVar2;
        float f14;
        if ((i2 & 1) != 0) {
            f = 2.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            i = 8;
        }
        if ((i2 & 8) != 0) {
            f3 = 0.5f;
        }
        if ((i2 & 16) != 0) {
            xp = XP.d;
        }
        if ((i2 & 32) != 0) {
            xp2 = null;
        }
        if ((i2 & 64) != 0) {
            list = null;
        }
        if ((i2 & 128) != 0) {
            f4 = 0.5f;
        }
        if ((i2 & 256) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 512) != 0) {
            f6 = 0.0f;
        }
        if ((i2 & 1024) != 0) {
            f8 = 0.0f;
            f11 = f5;
            f9 = f6;
            list2 = list;
            f10 = f4;
            xp4 = xp;
            xp3 = xp2;
            i3 = i;
            f12 = f3;
            f14 = f;
            f13 = f2;
            aVar2 = aVar;
        } else {
            f8 = f7;
            f9 = f6;
            f10 = f4;
            f11 = f5;
            xp3 = xp2;
            list2 = list;
            f12 = f3;
            xp4 = xp;
            f13 = f2;
            i3 = i;
            aVar2 = aVar;
            f14 = f;
        }
        return y(aVar2, f14, f13, i3, f12, xp4, xp3, list2, f10, f11, f9, f8);
    }
}
