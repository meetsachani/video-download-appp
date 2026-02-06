package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.AbstractC3069Gn0;

/* renamed from: o.qV1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9017qV1 {
    public static final C8774pV1 a(int i) {
        return m(i, 0.0f, 0.0f, 0.0f, null, null, 62, null);
    }

    public static final C8774pV1 b(int i, float f) {
        return m(i, f, 0.0f, 0.0f, null, null, 60, null);
    }

    public static final C8774pV1 c(int i, float f, float f2) {
        return m(i, f, f2, 0.0f, null, null, 56, null);
    }

    public static final C8774pV1 d(int i, float f, float f2, float f3) {
        return m(i, f, f2, f3, null, null, 48, null);
    }

    public static final C8774pV1 e(int i, float f, float f2, float f3, XP xp) {
        C6562gT0.p(xp, "rounding");
        return m(i, f, f2, f3, xp, null, 32, null);
    }

    public static final C8774pV1 f(int i, float f, float f2, float f3, XP xp, List<XP> list) {
        C6562gT0.p(xp, "rounding");
        return l(p(i, f, f2, f3), xp, list, f2, f3);
    }

    public static final C8774pV1 g(C8774pV1 c8774pV1) {
        C6562gT0.p(c8774pV1, "source");
        return new C8774pV1(c8774pV1.j(), c8774pV1.g(), c8774pV1.h());
    }

    public static final C8774pV1 h(float[] fArr) {
        C6562gT0.p(fArr, "vertices");
        return n(fArr, null, null, 0.0f, 0.0f, 30, null);
    }

    public static final C8774pV1 i(float[] fArr, XP xp) {
        C6562gT0.p(fArr, "vertices");
        C6562gT0.p(xp, "rounding");
        return n(fArr, xp, null, 0.0f, 0.0f, 28, null);
    }

    public static final C8774pV1 j(float[] fArr, XP xp, List<XP> list) {
        C6562gT0.p(fArr, "vertices");
        C6562gT0.p(xp, "rounding");
        return n(fArr, xp, list, 0.0f, 0.0f, 24, null);
    }

    public static final C8774pV1 k(float[] fArr, XP xp, List<XP> list, float f) {
        C6562gT0.p(fArr, "vertices");
        C6562gT0.p(xp, "rounding");
        return n(fArr, xp, list, f, 0.0f, 16, null);
    }

    public static final C8774pV1 l(float[] fArr, XP xp, List<XP> list, float f, float f2) {
        long o2;
        C4180Rx1 a;
        XP xp2;
        XP xp3;
        Float valueOf = Float.valueOf(1.0f);
        C6562gT0.p(fArr, "vertices");
        C6562gT0.p(xp, "rounding");
        if (fArr.length >= 6) {
            int i = 2;
            int i2 = 1;
            if (fArr.length % 2 != 1) {
                if (list != null && list.size() * 2 != fArr.length) {
                    throw new IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
                }
                ArrayList arrayList = new ArrayList();
                int length = fArr.length / 2;
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                int i4 = 0;
                while (i4 < length) {
                    if (list != null && (xp3 = list.get(i4)) != null) {
                        xp2 = xp3;
                    } else {
                        xp2 = xp;
                    }
                    int i5 = (((i4 + length) - i2) % length) * 2;
                    int i6 = i4 + 1;
                    int i7 = (i6 % length) * 2;
                    int i8 = i4 * 2;
                    arrayList2.add(new C7297jV1(C7638kv0.d(fArr[i5], fArr[i5 + i2]), C7638kv0.d(fArr[i8], fArr[i8 + i2]), C7638kv0.d(fArr[i7], fArr[i7 + 1]), xp2, null));
                    i4 = i6;
                    i2 = i2;
                }
                int i9 = i2;
                C11197zR0 W1 = C5075aO1.W1(0, length);
                ArrayList arrayList3 = new ArrayList(C8466oF.b0(W1, 10));
                Iterator<Integer> it = W1.iterator();
                while (it.hasNext()) {
                    int nextInt = ((AbstractC8515oR0) it).nextInt();
                    int i10 = (nextInt + 1) % length;
                    float l = ((C7297jV1) arrayList2.get(nextInt)).l() + ((C7297jV1) arrayList2.get(i10)).l();
                    float k = ((C7297jV1) arrayList2.get(nextInt)).k() + ((C7297jV1) arrayList2.get(i10)).k();
                    int i11 = nextInt * 2;
                    int i12 = i10 * 2;
                    float e = C5764dE2.e(fArr[i11] - fArr[i12], fArr[i11 + 1] - fArr[i12 + 1]);
                    if (l > e) {
                        a = C6670gv2.a(Float.valueOf(e / l), Float.valueOf(0.0f));
                    } else if (k > e) {
                        a = C6670gv2.a(valueOf, Float.valueOf((e - l) / (k - l)));
                    } else {
                        a = C6670gv2.a(valueOf, valueOf);
                    }
                    arrayList3.add(a);
                }
                for (int i13 = 0; i13 < length; i13++) {
                    C4725Xm1 c4725Xm1 = new C4725Xm1(2);
                    for (int i14 = 0; i14 < 2; i14++) {
                        C4180Rx1 c4180Rx1 = (C4180Rx1) arrayList3.get((((i13 + length) - 1) + i14) % length);
                        c4725Xm1.X((((C7297jV1) arrayList2.get(i13)).l() * ((Number) c4180Rx1.a()).floatValue()) + ((((C7297jV1) arrayList2.get(i13)).k() - ((C7297jV1) arrayList2.get(i13)).l()) * ((Number) c4180Rx1.b()).floatValue()));
                    }
                    arrayList.add(((C7297jV1) arrayList2.get(i13)).g(c4725Xm1.s(0), c4725Xm1.s(i9)));
                }
                ArrayList arrayList4 = new ArrayList();
                while (i3 < length) {
                    int i15 = i3 + 1;
                    int i16 = i15 % length;
                    int i17 = i3 * 2;
                    long d = C7638kv0.d(fArr[i17], fArr[i17 + i9]);
                    int i18 = (((i3 + length) - i9) % length) * i;
                    long d2 = C7638kv0.d(fArr[i18], fArr[i18 + i9]);
                    int i19 = i16 * 2;
                    arrayList4.add(new AbstractC3069Gn0.a((List) arrayList.get(i3), d, ((C7297jV1) arrayList2.get(i3)).c(), UD1.a(UD1.m(d, d2), UD1.m(C7638kv0.d(fArr[i19], fArr[i19 + i9]), d)), null));
                    arrayList4.add(new AbstractC3069Gn0.b(C7979mF.k(C6302fS.b.b(((C6302fS) C10662xF.s3((List) arrayList.get(i3))).h(), ((C6302fS) C10662xF.s3((List) arrayList.get(i3))).i(), ((C6302fS) C10662xF.E2((List) arrayList.get(i16))).f(), ((C6302fS) C10662xF.E2((List) arrayList.get(i16))).g()))));
                    i3 = i15;
                    i = 2;
                }
                if (f == Float.MIN_VALUE || f2 == Float.MIN_VALUE) {
                    o2 = o(fArr);
                } else {
                    o2 = C7638kv0.d(f, f2);
                }
                return new C8774pV1(arrayList4, Float.intBitsToFloat((int) (o2 >> 32)), Float.intBitsToFloat((int) (o2 & 4294967295L)));
            }
            throw new IllegalArgumentException("The vertices array should have even size");
        }
        throw new IllegalArgumentException("Polygons must have at least 3 vertices");
    }

    public static /* synthetic */ C8774pV1 m(int i, float f, float f2, float f3, XP xp, List list, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            xp = XP.d;
        }
        if ((i2 & 32) != 0) {
            list = null;
        }
        List list2 = list;
        return f(i, f, f2, f3, xp, list2);
    }

    public static /* synthetic */ C8774pV1 n(float[] fArr, XP xp, List list, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            xp = XP.d;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            f = Float.MIN_VALUE;
        }
        if ((i & 16) != 0) {
            f2 = Float.MIN_VALUE;
        }
        return l(fArr, xp, list, f, f2);
    }

    public static final long o(float[] fArr) {
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        while (i < fArr.length) {
            int i2 = i + 1;
            f += fArr[i];
            i += 2;
            f2 += fArr[i2];
        }
        float f3 = 2;
        return C7638kv0.d((f / fArr.length) / f3, (f2 / fArr.length) / f3);
    }

    public static final float[] p(int i, float f, float f2, float f3) {
        float[] fArr = new float[i * 2];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float f4 = f;
            long n = UD1.n(C5764dE2.o(f4, (C5764dE2.i() / i) * 2 * i2, 0L, 4, null), C7638kv0.d(f2, f3));
            int i4 = i3 + 1;
            fArr[i3] = UD1.j(n);
            i3 += 2;
            fArr[i4] = UD1.k(n);
            i2++;
            f = f4;
        }
        return fArr;
    }
}
