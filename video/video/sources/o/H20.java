package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class H20 {
    public final C2469An a;
    public final RK2 b;

    /* loaded from: classes3.dex */
    public static final class b {
        public final UT1 a;
        public final UT1 b;
        public final int c;

        public UT1 a() {
            return this.a;
        }

        public UT1 b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public String toString() {
            return this.a + RemoteSettings.i + this.b + '/' + this.c;
        }

        public b(UT1 ut1, UT1 ut12, int i) {
            this.a = ut1;
            this.b = ut12;
            this.c = i;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Serializable, Comparator<b> {
        public c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return bVar.c() - bVar2.c();
        }
    }

    public H20(C2469An c2469An) throws C9349rr1 {
        this.a = c2469An;
        this.b = new RK2(c2469An);
    }

    public static int d(UT1 ut1, UT1 ut12) {
        return C9044qd1.c(UT1.b(ut1, ut12));
    }

    public static void e(Map<UT1, Integer> map, UT1 ut1) {
        Integer num = map.get(ut1);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(ut1, Integer.valueOf(i));
    }

    public static C2469An g(C2469An c2469An, UT1 ut1, UT1 ut12, UT1 ut13, UT1 ut14, int i, int i2) throws C9349rr1 {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return SE0.b().c(c2469An, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, ut1.c(), ut1.d(), ut14.c(), ut14.d(), ut13.c(), ut13.d(), ut12.c(), ut12.d());
    }

    public final UT1 a(UT1 ut1, UT1 ut12, UT1 ut13, UT1 ut14, int i) {
        float f = i;
        float d = d(ut1, ut12) / f;
        float d2 = d(ut13, ut14);
        UT1 ut15 = new UT1(ut14.c() + (((ut14.c() - ut13.c()) / d2) * d), ut14.d() + (d * ((ut14.d() - ut13.d()) / d2)));
        float d3 = d(ut1, ut13) / f;
        float d4 = d(ut12, ut14);
        UT1 ut16 = new UT1(ut14.c() + (((ut14.c() - ut12.c()) / d4) * d3), ut14.d() + (d3 * ((ut14.d() - ut12.d()) / d4)));
        if (!f(ut15)) {
            if (!f(ut16)) {
                return null;
            }
        } else if (!f(ut16) || Math.abs(h(ut13, ut15).c() - h(ut12, ut15).c()) <= Math.abs(h(ut13, ut16).c() - h(ut12, ut16).c())) {
            return ut15;
        }
        return ut16;
    }

    public final UT1 b(UT1 ut1, UT1 ut12, UT1 ut13, UT1 ut14, int i, int i2) {
        float d = d(ut1, ut12) / i;
        float d2 = d(ut13, ut14);
        UT1 ut15 = new UT1(ut14.c() + (((ut14.c() - ut13.c()) / d2) * d), ut14.d() + (d * ((ut14.d() - ut13.d()) / d2)));
        float d3 = d(ut1, ut13) / i2;
        float d4 = d(ut12, ut14);
        UT1 ut16 = new UT1(ut14.c() + (((ut14.c() - ut12.c()) / d4) * d3), ut14.d() + (d3 * ((ut14.d() - ut12.d()) / d4)));
        if (!f(ut15)) {
            if (!f(ut16)) {
                return null;
            }
        } else if (!f(ut16) || Math.abs(i - h(ut13, ut15).c()) + Math.abs(i2 - h(ut12, ut15).c()) <= Math.abs(i - h(ut13, ut16).c()) + Math.abs(i2 - h(ut12, ut16).c())) {
            return ut15;
        }
        return ut16;
    }

    public K20 c() throws C9349rr1 {
        UT1 ut1;
        UT1 ut12;
        C2469An g;
        UT1[] c2 = this.b.c();
        UT1 ut13 = c2[0];
        UT1 ut14 = c2[1];
        UT1 ut15 = c2[2];
        UT1 ut16 = c2[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(h(ut13, ut14));
        arrayList.add(h(ut13, ut15));
        arrayList.add(h(ut14, ut16));
        arrayList.add(h(ut15, ut16));
        UT1 ut17 = null;
        Collections.sort(arrayList, new c());
        b bVar = (b) arrayList.get(0);
        b bVar2 = (b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        e(hashMap, bVar.a());
        e(hashMap, bVar.b());
        e(hashMap, bVar2.a());
        e(hashMap, bVar2.b());
        UT1 ut18 = null;
        UT1 ut19 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            UT1 ut110 = (UT1) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                ut18 = ut110;
            } else if (ut17 == null) {
                ut17 = ut110;
            } else {
                ut19 = ut110;
            }
        }
        if (ut17 != null && ut18 != null && ut19 != null) {
            UT1[] ut1Arr = {ut17, ut18, ut19};
            UT1.e(ut1Arr);
            UT1 ut111 = ut1Arr[0];
            UT1 ut112 = ut1Arr[1];
            UT1 ut113 = ut1Arr[2];
            if (!hashMap.containsKey(ut13)) {
                ut14 = ut13;
            } else if (hashMap.containsKey(ut14)) {
                if (!hashMap.containsKey(ut15)) {
                    ut14 = ut15;
                } else {
                    ut14 = ut16;
                }
            }
            int c3 = h(ut113, ut14).c();
            int c4 = h(ut111, ut14).c();
            if ((c3 & 1) == 1) {
                c3++;
            }
            int i = c3 + 2;
            if ((c4 & 1) == 1) {
                c4++;
            }
            int i2 = c4 + 2;
            if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
                ut1 = ut113;
                UT1 b2 = b(ut112, ut111, ut1, ut14, i, i2);
                ut111 = ut111;
                if (b2 != null) {
                    ut14 = b2;
                }
                int c5 = h(ut1, ut14).c();
                int c6 = h(ut111, ut14).c();
                if ((c5 & 1) == 1) {
                    c5++;
                }
                int i3 = c5;
                if ((c6 & 1) == 1) {
                    c6++;
                }
                ut12 = ut112;
                g = g(this.a, ut1, ut12, ut111, ut14, i3, c6);
            } else {
                ut1 = ut113;
                UT1 a2 = a(ut112, ut111, ut1, ut14, Math.min(i2, i));
                if (a2 != null) {
                    ut14 = a2;
                }
                int max = Math.max(h(ut1, ut14).c(), h(ut111, ut14).c());
                int i4 = max + 1;
                if ((i4 & 1) == 1) {
                    i4 = max + 2;
                }
                int i5 = i4;
                ut12 = ut112;
                g = g(this.a, ut1, ut12, ut111, ut14, i5, i5);
            }
            return new K20(g, new UT1[]{ut1, ut12, ut111, ut14});
        }
        throw C9349rr1.a();
    }

    public final boolean f(UT1 ut1) {
        if (ut1.c() >= 0.0f && ut1.c() < this.a.m() && ut1.d() > 0.0f && ut1.d() < this.a.i()) {
            return true;
        }
        return false;
    }

    public final b h(UT1 ut1, UT1 ut12) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int c2 = (int) ut1.c();
        int d = (int) ut1.d();
        int c3 = (int) ut12.c();
        int d2 = (int) ut12.d();
        int i6 = 0;
        int i7 = 1;
        if (Math.abs(d2 - d) > Math.abs(c3 - c2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            d = c2;
            c2 = d;
            d2 = c3;
            c3 = d2;
        }
        int abs = Math.abs(c3 - c2);
        int abs2 = Math.abs(d2 - d);
        int i8 = (-abs) / 2;
        if (d < d2) {
            i = 1;
        } else {
            i = -1;
        }
        if (c2 >= c3) {
            i7 = -1;
        }
        C2469An c2469An = this.a;
        if (z) {
            i2 = d;
        } else {
            i2 = c2;
        }
        if (z) {
            i3 = c2;
        } else {
            i3 = d;
        }
        boolean f = c2469An.f(i2, i3);
        while (c2 != c3) {
            C2469An c2469An2 = this.a;
            if (z) {
                i4 = d;
            } else {
                i4 = c2;
            }
            if (z) {
                i5 = c2;
            } else {
                i5 = d;
            }
            boolean f2 = c2469An2.f(i4, i5);
            if (f2 != f) {
                i6++;
                f = f2;
            }
            i8 += abs2;
            if (i8 > 0) {
                if (d == d2) {
                    break;
                }
                d += i;
                i8 -= abs;
            }
            c2 += i7;
        }
        return new b(ut1, ut12, i6);
    }
}
