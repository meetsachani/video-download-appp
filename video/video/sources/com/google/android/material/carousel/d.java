package com.google.android.material.carousel;

import com.google.android.material.carousel.a;
import com.google.android.material.carousel.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C5600ca;
import o.C9293rd1;
import o.HT1;
import o.InterfaceC5670cr1;
import o.InterfaceC8157mz;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class d {
    public static final int h = -1;
    public final c a;
    public final List<c> b;
    public final List<c> c;
    public final float[] d;
    public final float[] e;
    public final float f;
    public final float g;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.EnumC0121a.values().length];
            a = iArr;
            try {
                iArr[a.EnumC0121a.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public d(@InterfaceC5670cr1 c cVar, List<c> list, List<c> list2) {
        this.a = cVar;
        this.b = Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(list2);
        float f = list.get(list.size() - 1).d().a - cVar.d().a;
        this.f = f;
        float f2 = cVar.k().a - list2.get(list2.size() - 1).k().a;
        this.g = f2;
        this.d = m(f, list, true);
        this.e = m(f2, list2, false);
    }

    public static int b(c cVar, float f) {
        for (int j = cVar.j(); j < cVar.h().size(); j++) {
            if (f == cVar.h().get(j).c) {
                return j;
            }
        }
        return cVar.h().size() - 1;
    }

    public static int c(c cVar) {
        for (int i = 0; i < cVar.h().size(); i++) {
            if (!cVar.h().get(i).e) {
                return i;
            }
        }
        return -1;
    }

    public static int d(c cVar, float f) {
        for (int c = cVar.c() - 1; c >= 0; c--) {
            if (f == cVar.h().get(c).c) {
                return c;
            }
        }
        return 0;
    }

    public static int e(c cVar) {
        for (int size = cVar.h().size() - 1; size >= 0; size--) {
            if (!cVar.h().get(size).e) {
                return size;
            }
        }
        return -1;
    }

    public static d f(InterfaceC8157mz interfaceC8157mz, c cVar, float f, float f2, float f3, a.EnumC0121a enumC0121a) {
        return new d(cVar, p(interfaceC8157mz, cVar, f, f2, enumC0121a), n(interfaceC8157mz, cVar, f, f3, enumC0121a));
    }

    public static float[] m(float f, List<c> list, boolean z) {
        float f2;
        float f3;
        int size = list.size();
        float[] fArr = new float[size];
        for (int i = 1; i < size; i++) {
            int i2 = i - 1;
            c cVar = list.get(i2);
            c cVar2 = list.get(i);
            if (z) {
                f2 = cVar2.d().a - cVar.d().a;
            } else {
                f2 = cVar.k().a - cVar2.k().a;
            }
            float f4 = f2 / f;
            if (i == size - 1) {
                f3 = 1.0f;
            } else {
                f3 = fArr[i2] + f4;
            }
            fArr[i] = f3;
        }
        return fArr;
    }

    public static List<c> n(InterfaceC8157mz interfaceC8157mz, c cVar, float f, float f2, a.EnumC0121a enumC0121a) {
        int b;
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        int e = e(cVar);
        if (interfaceC8157mz.g()) {
            b = interfaceC8157mz.a();
        } else {
            b = interfaceC8157mz.b();
        }
        int i2 = b;
        if (!r(interfaceC8157mz, cVar) && e != -1) {
            int j = e - cVar.j();
            float f3 = cVar.d().b - (cVar.d().d / 2.0f);
            if (j <= 0 && cVar.i().f > 0.0f) {
                arrayList.add(x(cVar, (f3 - cVar.i().f) - f2, i2));
                return arrayList;
            }
            float f4 = 0.0f;
            int i3 = 0;
            while (i3 < j) {
                c cVar2 = (c) arrayList.get(arrayList.size() - 1);
                int i4 = e - i3;
                float f5 = f4 + cVar.h().get(i4).f;
                int i5 = i4 + 1;
                if (i5 < cVar.h().size()) {
                    i = d(cVar2, cVar.h().get(i5).c) + 1;
                } else {
                    i = 0;
                }
                int i6 = i2;
                c t = t(cVar2, e, i, f3 - f5, cVar.c() + i3 + 1, cVar.j() + i3 + 1, i6);
                if (i3 == j - 1 && f2 > 0.0f) {
                    t = u(t, f2, i6, false, f, enumC0121a);
                    i6 = i6;
                }
                arrayList.add(t);
                i3++;
                i2 = i6;
                f4 = f5;
            }
        } else if (f2 > 0.0f) {
            arrayList.add(u(cVar, f2, i2, false, f, enumC0121a));
        }
        return arrayList;
    }

    public static float[] o(List<c> list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i = 1;
        while (i < size) {
            float f3 = fArr[i];
            if (f <= f3) {
                return new float[]{C5600ca.b(0.0f, 1.0f, f2, f3, f), (float) (i - 1), i};
            }
            i++;
            f2 = f3;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    public static List<c> p(InterfaceC8157mz interfaceC8157mz, c cVar, float f, float f2, a.EnumC0121a enumC0121a) {
        int b;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        int c = c(cVar);
        if (interfaceC8157mz.g()) {
            b = interfaceC8157mz.a();
        } else {
            b = interfaceC8157mz.b();
        }
        int i = b;
        if (!q(cVar) && c != -1) {
            int c2 = cVar.c() - c;
            float f3 = cVar.d().b - (cVar.d().d / 2.0f);
            if (c2 <= 0 && cVar.b().f > 0.0f) {
                arrayList.add(x(cVar, f3 + cVar.b().f + f2, i));
                return arrayList;
            }
            float f4 = 0.0f;
            for (int i2 = 0; i2 < c2; i2++) {
                c cVar2 = (c) arrayList.get(arrayList.size() - 1);
                int i3 = c + i2;
                int size = cVar.h().size() - 1;
                f4 += cVar.h().get(i3).f;
                int i4 = i3 - 1;
                if (i4 >= 0) {
                    size = b(cVar2, cVar.h().get(i4).c) - 1;
                }
                int i5 = i;
                c t = t(cVar2, c, size, f3 + f4, (cVar.c() - i2) - 1, (cVar.j() - i2) - 1, i5);
                i = i5;
                if (i2 == c2 - 1 && f2 > 0.0f) {
                    t = u(t, f2, i, true, f, enumC0121a);
                }
                arrayList.add(t);
            }
        } else if (f2 > 0.0f) {
            arrayList.add(u(cVar, f2, i, true, f, enumC0121a));
        }
        return arrayList;
    }

    public static boolean q(c cVar) {
        if (cVar.b().b - (cVar.b().d / 2.0f) >= 0.0f && cVar.b() == cVar.e()) {
            return true;
        }
        return false;
    }

    public static boolean r(InterfaceC8157mz interfaceC8157mz, c cVar) {
        int b = interfaceC8157mz.b();
        if (interfaceC8157mz.g()) {
            b = interfaceC8157mz.a();
        }
        if (cVar.i().b + (cVar.i().d / 2.0f) <= b && cVar.i() == cVar.l()) {
            return true;
        }
        return false;
    }

    public static c s(List<c> list, float f, float[] fArr) {
        float[] o2 = o(list, f, fArr);
        return c.o(list.get((int) o2[1]), list.get((int) o2[2]), o2[0]);
    }

    public static c t(c cVar, int i, int i2, float f, int i3, int i4, int i5) {
        boolean z;
        ArrayList arrayList = new ArrayList(cVar.h());
        arrayList.add(i2, (c.C0122c) arrayList.remove(i));
        c.b bVar = new c.b(cVar.g(), i5);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            c.C0122c c0122c = (c.C0122c) arrayList.get(i6);
            float f2 = c0122c.d;
            float f3 = f + (f2 / 2.0f);
            if (i6 >= i3 && i6 <= i4) {
                z = true;
            } else {
                z = false;
            }
            bVar.e(f3, c0122c.c, f2, z, c0122c.e, c0122c.f);
            f += c0122c.d;
        }
        return bVar.i();
    }

    @InterfaceC5670cr1
    public static c u(@InterfaceC5670cr1 c cVar, float f, int i, boolean z, float f2, a.EnumC0121a enumC0121a) {
        if (a.a[enumC0121a.ordinal()] != 1) {
            return w(cVar, f, i, z);
        }
        return v(cVar, f, i, z, f2);
    }

    public static c v(c cVar, float f, int i, boolean z, float f2) {
        float f3;
        boolean z2;
        float f4;
        float f5;
        ArrayList arrayList = new ArrayList(cVar.h());
        c.b bVar = new c.b(cVar.g(), i);
        float m = f / cVar.m();
        if (z) {
            f3 = f;
        } else {
            f3 = 0.0f;
        }
        float f6 = f3;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            c.C0122c c0122c = (c.C0122c) arrayList.get(i2);
            if (c0122c.e) {
                bVar.e(c0122c.b, c0122c.c, c0122c.d, false, true, c0122c.f);
            } else {
                if (i2 >= cVar.c() && i2 <= cVar.j()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                float f7 = c0122c.d - m;
                float b = com.google.android.material.carousel.a.b(f7, cVar.g(), f2);
                float f8 = (f7 / 2.0f) + f6;
                float abs = Math.abs(f8 - c0122c.b);
                float f9 = c0122c.f;
                if (z) {
                    f4 = abs;
                } else {
                    f4 = 0.0f;
                }
                if (z) {
                    f5 = 0.0f;
                } else {
                    f5 = abs;
                }
                bVar.f(f8, b, f7, z2, false, f9, f4, f5);
                f6 += f7;
            }
        }
        return bVar.i();
    }

    @InterfaceC5670cr1
    public static c w(@InterfaceC5670cr1 c cVar, float f, int i, boolean z) {
        int size;
        float f2;
        float f3;
        float f4;
        boolean z2;
        float min;
        ArrayList arrayList = new ArrayList(cVar.h());
        c.b bVar = new c.b(cVar.g(), i);
        boolean z3 = true;
        if (z) {
            size = 0;
        } else {
            size = arrayList.size() - 1;
        }
        int i2 = 0;
        while (i2 < arrayList.size()) {
            c.C0122c c0122c = (c.C0122c) arrayList.get(i2);
            if (c0122c.e && i2 == size) {
                bVar.e(c0122c.b, c0122c.c, c0122c.d, false, true, c0122c.f);
            } else {
                float f5 = c0122c.b;
                if (z) {
                    f2 = f5 + f;
                } else {
                    f2 = f5 - f;
                }
                if (z) {
                    f3 = f;
                } else {
                    f3 = 0.0f;
                }
                if (z) {
                    f4 = 0.0f;
                } else {
                    f4 = f;
                }
                if (i2 >= cVar.c() && i2 <= cVar.j()) {
                    z2 = z3;
                } else {
                    z2 = false;
                }
                float f6 = f2;
                float f7 = c0122c.c;
                float f8 = c0122c.d;
                boolean z4 = c0122c.e;
                if (z) {
                    min = Math.max(0.0f, ((f8 / 2.0f) + f6) - i);
                } else {
                    min = Math.min(0.0f, f6 - (f8 / 2.0f));
                }
                bVar.f(f6, f7, f8, z2, z4, Math.abs(min), f3, f4);
            }
            i2++;
            z3 = true;
        }
        return bVar.i();
    }

    public static c x(c cVar, float f, int i) {
        return t(cVar, 0, 0, f, cVar.c(), cVar.j(), i);
    }

    public final c a(List<c> list, float f, float[] fArr) {
        float[] o2 = o(list, f, fArr);
        if (o2[0] >= 0.5f) {
            return list.get((int) o2[2]);
        }
        return list.get((int) o2[1]);
    }

    public c g() {
        return this.a;
    }

    public c h() {
        List<c> list = this.c;
        return list.get(list.size() - 1);
    }

    public Map<Integer, c> i(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int i6;
        float g = this.a.g();
        HashMap hashMap = new HashMap();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = -1;
            if (i7 >= i) {
                break;
            }
            if (z) {
                i6 = (i - i7) - 1;
            } else {
                i6 = i7;
            }
            float f = i6 * g;
            if (!z) {
                i9 = 1;
            }
            if (f * i9 > i3 - this.g || i7 >= i - this.c.size()) {
                Integer valueOf = Integer.valueOf(i6);
                List<c> list = this.c;
                hashMap.put(valueOf, list.get(C9293rd1.e(i8, 0, list.size() - 1)));
                i8++;
            }
            i7++;
        }
        int i10 = 0;
        for (int i11 = i - 1; i11 >= 0; i11--) {
            if (z) {
                i4 = (i - i11) - 1;
            } else {
                i4 = i11;
            }
            float f2 = i4 * g;
            if (z) {
                i5 = -1;
            } else {
                i5 = 1;
            }
            if (f2 * i5 < i2 + this.f || i11 < this.b.size()) {
                Integer valueOf2 = Integer.valueOf(i4);
                List<c> list2 = this.b;
                hashMap.put(valueOf2, list2.get(C9293rd1.e(i10, 0, list2.size() - 1)));
                i10++;
            }
        }
        return hashMap;
    }

    @InterfaceC5670cr1
    public c j(float f, float f2, float f3) {
        return k(f, f2, f3, false);
    }

    public c k(float f, float f2, float f3, boolean z) {
        float b;
        List<c> list;
        float[] fArr;
        float f4 = this.f + f2;
        float f5 = f3 - this.g;
        float f6 = l().b().g;
        float f7 = h().b().h;
        if (this.f == f6) {
            f4 += f6;
        }
        if (this.g == f7) {
            f5 -= f7;
        }
        if (f < f4) {
            b = C5600ca.b(1.0f, 0.0f, f2, f4, f);
            list = this.b;
            fArr = this.d;
        } else if (f > f5) {
            b = C5600ca.b(0.0f, 1.0f, f5, f3, f);
            list = this.c;
            fArr = this.e;
        } else {
            return this.a;
        }
        if (z) {
            return a(list, b, fArr);
        }
        return s(list, b, fArr);
    }

    public c l() {
        List<c> list = this.b;
        return list.get(list.size() - 1);
    }
}
