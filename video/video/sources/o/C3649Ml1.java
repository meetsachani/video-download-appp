package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: o.Ml1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3649Ml1 extends C10574wt0 {
    public static final C10817xt0[] i = new C10817xt0[0];
    public static final float j = 180.0f;
    public static final float k = 9.0f;
    public static final float l = 0.05f;
    public static final float m = 0.5f;

    /* renamed from: o.Ml1$b */
    /* loaded from: classes3.dex */
    public static final class b implements Serializable, Comparator<C10085ut0> {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C10085ut0 c10085ut0, C10085ut0 c10085ut02) {
            double i = c10085ut02.i() - c10085ut0.i();
            if (i < 0.0d) {
                return -1;
            }
            if (i > 0.0d) {
                return 1;
            }
            return 0;
        }
    }

    public C3649Ml1(C2469An c2469An) {
        super(c2469An);
    }

    public C10817xt0[] r(Map<XV, ?> map) throws C9349rr1 {
        boolean z;
        if (map != null && map.containsKey(XV.TRY_HARDER)) {
            z = true;
        } else {
            z = false;
        }
        C2469An k2 = k();
        int i2 = k2.i();
        int m2 = k2.m();
        int i3 = ((i2 * 3) / 388 < 3 || z) ? 3 : 3;
        int[] iArr = new int[5];
        for (int i4 = i3 - 1; i4 < i2; i4 += i3) {
            b(iArr);
            int i5 = 0;
            for (int i6 = 0; i6 < m2; i6++) {
                if (k2.f(i6, i4)) {
                    if ((i5 & 1) == 1) {
                        i5++;
                    }
                    iArr[i5] = iArr[i5] + 1;
                } else if ((i5 & 1) == 0) {
                    if (i5 == 4) {
                        if (C10574wt0.h(iArr) && m(iArr, i4, i6)) {
                            b(iArr);
                            i5 = 0;
                        } else {
                            q(iArr);
                            i5 = 3;
                        }
                    } else {
                        i5++;
                        iArr[i5] = iArr[i5] + 1;
                    }
                } else {
                    iArr[i5] = iArr[i5] + 1;
                }
            }
            if (C10574wt0.h(iArr)) {
                m(iArr, i4, m2);
            }
        }
        C10085ut0[][] s = s();
        ArrayList arrayList = new ArrayList();
        for (C10085ut0[] c10085ut0Arr : s) {
            UT1.e(c10085ut0Arr);
            arrayList.add(new C10817xt0(c10085ut0Arr));
        }
        if (arrayList.isEmpty()) {
            return i;
        }
        return (C10817xt0[]) arrayList.toArray(new C10817xt0[arrayList.size()]);
    }

    public final C10085ut0[][] s() throws C9349rr1 {
        List<C10085ut0> l2 = l();
        int size = l2.size();
        if (size >= 3) {
            if (size == 3) {
                return new C10085ut0[][]{new C10085ut0[]{l2.get(0), l2.get(1), l2.get(2)}};
            }
            Collections.sort(l2, new b());
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < size - 2; i2++) {
                C10085ut0 c10085ut0 = l2.get(i2);
                if (c10085ut0 != null) {
                    for (int i3 = i2 + 1; i3 < size - 1; i3++) {
                        C10085ut0 c10085ut02 = l2.get(i3);
                        if (c10085ut02 != null) {
                            float i4 = (c10085ut0.i() - c10085ut02.i()) / Math.min(c10085ut0.i(), c10085ut02.i());
                            if (Math.abs(c10085ut0.i() - c10085ut02.i()) <= 0.5f || i4 < 0.05f) {
                                for (int i5 = i3 + 1; i5 < size; i5++) {
                                    C10085ut0 c10085ut03 = l2.get(i5);
                                    if (c10085ut03 != null) {
                                        float i6 = (c10085ut02.i() - c10085ut03.i()) / Math.min(c10085ut02.i(), c10085ut03.i());
                                        if (Math.abs(c10085ut02.i() - c10085ut03.i()) <= 0.5f || i6 < 0.05f) {
                                            C10085ut0[] c10085ut0Arr = {c10085ut0, c10085ut02, c10085ut03};
                                            UT1.e(c10085ut0Arr);
                                            C10817xt0 c10817xt0 = new C10817xt0(c10085ut0Arr);
                                            float b2 = UT1.b(c10817xt0.b(), c10817xt0.a());
                                            float b3 = UT1.b(c10817xt0.c(), c10817xt0.a());
                                            float b4 = UT1.b(c10817xt0.b(), c10817xt0.c());
                                            float i7 = (b2 + b4) / (c10085ut0.i() * 2.0f);
                                            if (i7 <= 180.0f && i7 >= 9.0f && Math.abs((b2 - b4) / Math.min(b2, b4)) < 0.1f) {
                                                float sqrt = (float) Math.sqrt((b2 * b2) + (b4 * b4));
                                                if (Math.abs((b3 - sqrt) / Math.min(b3, sqrt)) < 0.1f) {
                                                    arrayList.add(c10085ut0Arr);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return (C10085ut0[][]) arrayList.toArray(new C10085ut0[arrayList.size()]);
            }
            throw C9349rr1.a();
        }
        throw C9349rr1.a();
    }

    public C3649Ml1(C2469An c2469An, VT1 vt1) {
        super(c2469An, vt1);
    }
}
