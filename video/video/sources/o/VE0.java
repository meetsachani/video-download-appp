package o;

import java.util.ArrayList;
import java.util.Iterator;
import o.C5163am;
import o.MK;
import o.UK;

/* loaded from: classes.dex */
public class VE0 {
    public static final boolean a = false;
    public static final boolean b = false;
    public static final boolean c = true;

    public static VK2 a(UK uk, int i, ArrayList<VK2> arrayList, VK2 vk2) {
        int i2;
        int m2;
        if (i == 0) {
            i2 = uk.S0;
        } else {
            i2 = uk.T0;
        }
        int i3 = 0;
        if (i2 != -1 && (vk2 == null || i2 != vk2.f())) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                VK2 vk22 = arrayList.get(i4);
                if (vk22.f() == i2) {
                    if (vk2 != null) {
                        vk2.m(i, vk22);
                        arrayList.remove(vk2);
                    }
                    vk2 = vk22;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return vk2;
        }
        if (vk2 == null) {
            if ((uk instanceof C9696tH0) && (m2 = ((C9696tH0) uk).m2(i)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    VK2 vk23 = arrayList.get(i5);
                    if (vk23.f() == m2) {
                        vk2 = vk23;
                        break;
                    }
                    i5++;
                }
            }
            if (vk2 == null) {
                vk2 = new VK2(i);
            }
            arrayList.add(vk2);
        }
        if (vk2.a(uk)) {
            if (uk instanceof C9445sF0) {
                C9445sF0 c9445sF0 = (C9445sF0) uk;
                MK m22 = c9445sF0.m2();
                if (c9445sF0.o2() == 0) {
                    i3 = 1;
                }
                m22.d(i3, arrayList, vk2);
            }
            if (i == 0) {
                uk.S0 = vk2.f();
                uk.Q.d(i, arrayList, vk2);
                uk.S.d(i, arrayList, vk2);
            } else {
                uk.T0 = vk2.f();
                uk.R.d(i, arrayList, vk2);
                uk.U.d(i, arrayList, vk2);
                uk.T.d(i, arrayList, vk2);
            }
            uk.X.d(i, arrayList, vk2);
        }
        return vk2;
    }

    public static VK2 b(ArrayList<VK2> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            VK2 vk2 = arrayList.get(i2);
            if (i == vk2.f()) {
                return vk2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x039c A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(VK vk, C5163am.b bVar) {
        VK2 vk2;
        boolean z;
        VK2 vk22;
        ArrayList<UK> m2 = vk.m2();
        int size = m2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            UK uk = m2.get(i2);
            if (!d(vk.H(), vk.j0(), uk.H(), uk.j0()) || (uk instanceof C3785Nv0)) {
                return false;
            }
        }
        C3641Mj1 c3641Mj1 = vk.H1;
        if (c3641Mj1 != null) {
            c3641Mj1.L++;
        }
        int i3 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i3 < size) {
            UK uk2 = m2.get(i3);
            if (!d(vk.H(), vk.j0(), uk2.H(), uk2.j0())) {
                VK.S2(i, uk2, bVar, vk.g2, C5163am.a.k);
            }
            boolean z2 = uk2 instanceof C9445sF0;
            if (z2) {
                C9445sF0 c9445sF0 = (C9445sF0) uk2;
                if (c9445sF0.o2() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(c9445sF0);
                }
                if (c9445sF0.o2() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c9445sF0);
                }
            }
            if (uk2 instanceof C9696tH0) {
                if (uk2 instanceof C4327Tk) {
                    C4327Tk c4327Tk = (C4327Tk) uk2;
                    if (c4327Tk.s2() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(c4327Tk);
                    }
                    if (c4327Tk.s2() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(c4327Tk);
                    }
                } else {
                    C9696tH0 c9696tH0 = (C9696tH0) uk2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(c9696tH0);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(c9696tH0);
                }
            }
            if (uk2.Q.f == null && uk2.S.f == null && !z2 && !(uk2 instanceof C4327Tk)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(uk2);
            }
            if (uk2.R.f == null && uk2.T.f == null && uk2.U.f == null && !z2 && !(uk2 instanceof C4327Tk)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(uk2);
            }
            i3++;
            i = 0;
        }
        ArrayList<VK2> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((C9445sF0) it.next(), 0, arrayList7, null);
            }
        }
        VK2 vk23 = null;
        int i4 = 0;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C9696tH0 c9696tH02 = (C9696tH0) it2.next();
                VK2 a2 = a(c9696tH02, i4, arrayList7, vk23);
                c9696tH02.l2(arrayList7, i4, a2);
                a2.c(arrayList7);
                vk23 = null;
                i4 = 0;
            }
        }
        MK r = vk.r(MK.a.LEFT);
        if (r.e() != null) {
            Iterator<MK> it3 = r.e().iterator();
            while (it3.hasNext()) {
                a(it3.next().d, 0, arrayList7, null);
            }
        }
        MK r2 = vk.r(MK.a.RIGHT);
        if (r2.e() != null) {
            Iterator<MK> it4 = r2.e().iterator();
            while (it4.hasNext()) {
                a(it4.next().d, 0, arrayList7, null);
            }
        }
        MK r3 = vk.r(MK.a.CENTER);
        if (r3.e() != null) {
            Iterator<MK> it5 = r3.e().iterator();
            while (it5.hasNext()) {
                a(it5.next().d, 0, arrayList7, null);
            }
        }
        VK2 vk24 = null;
        if (arrayList5 != null) {
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                a((UK) it6.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                a((C9445sF0) it7.next(), 1, arrayList7, null);
            }
        }
        int i5 = 1;
        if (arrayList4 != null) {
            Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                C9696tH0 c9696tH03 = (C9696tH0) it8.next();
                VK2 a3 = a(c9696tH03, i5, arrayList7, vk24);
                c9696tH03.l2(arrayList7, i5, a3);
                a3.c(arrayList7);
                vk24 = null;
                i5 = 1;
            }
        }
        MK r4 = vk.r(MK.a.TOP);
        if (r4.e() != null) {
            Iterator<MK> it9 = r4.e().iterator();
            while (it9.hasNext()) {
                a(it9.next().d, 1, arrayList7, null);
            }
        }
        MK r5 = vk.r(MK.a.BASELINE);
        if (r5.e() != null) {
            Iterator<MK> it10 = r5.e().iterator();
            while (it10.hasNext()) {
                a(it10.next().d, 1, arrayList7, null);
            }
        }
        MK r6 = vk.r(MK.a.BOTTOM);
        if (r6.e() != null) {
            Iterator<MK> it11 = r6.e().iterator();
            while (it11.hasNext()) {
                a(it11.next().d, 1, arrayList7, null);
            }
        }
        MK r7 = vk.r(MK.a.CENTER);
        if (r7.e() != null) {
            Iterator<MK> it12 = r7.e().iterator();
            while (it12.hasNext()) {
                a(it12.next().d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it13 = arrayList6.iterator();
            while (it13.hasNext()) {
                a((UK) it13.next(), 1, arrayList7, null);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            UK uk3 = m2.get(i6);
            if (uk3.Q0()) {
                VK2 b2 = b(arrayList7, uk3.S0);
                VK2 b3 = b(arrayList7, uk3.T0);
                if (b2 != null && b3 != null) {
                    b2.m(0, b3);
                    b3.o(2);
                    arrayList7.remove(b2);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (vk.H() == UK.b.WRAP_CONTENT) {
            Iterator<VK2> it14 = arrayList7.iterator();
            vk2 = null;
            int i7 = 0;
            while (it14.hasNext()) {
                VK2 next = it14.next();
                if (next.g() != 1) {
                    next.n(false);
                    int l = next.l(vk.J2(), 0);
                    if (l > i7) {
                        vk2 = next;
                        i7 = l;
                    }
                }
            }
            if (vk2 != null) {
                vk.E1(UK.b.FIXED);
                vk.d2(i7);
                vk2.n(true);
                if (vk.j0() != UK.b.WRAP_CONTENT) {
                    Iterator<VK2> it15 = arrayList7.iterator();
                    VK2 vk25 = null;
                    int i8 = 0;
                    while (it15.hasNext()) {
                        VK2 next2 = it15.next();
                        if (next2.g() != 0) {
                            next2.n(false);
                            int l2 = next2.l(vk.J2(), 1);
                            if (l2 > i8) {
                                vk25 = next2;
                                i8 = l2;
                            }
                        }
                    }
                    z = true;
                    if (vk25 != null) {
                        vk.Z1(UK.b.FIXED);
                        vk.z1(i8);
                        vk25.n(true);
                        vk22 = vk25;
                        if (vk2 != null && vk22 == null) {
                            return false;
                        }
                        return z;
                    }
                } else {
                    z = true;
                }
                vk22 = null;
                if (vk2 != null) {
                }
                return z;
            }
        }
        vk2 = null;
        if (vk.j0() != UK.b.WRAP_CONTENT) {
        }
        vk22 = null;
        if (vk2 != null) {
        }
        return z;
    }

    public static boolean d(UK.b bVar, UK.b bVar2, UK.b bVar3, UK.b bVar4) {
        boolean z;
        boolean z2;
        UK.b bVar5;
        UK.b bVar6;
        UK.b bVar7 = UK.b.FIXED;
        if (bVar3 != bVar7 && bVar3 != (bVar6 = UK.b.WRAP_CONTENT) && (bVar3 != UK.b.MATCH_PARENT || bVar == bVar6)) {
            z = false;
        } else {
            z = true;
        }
        if (bVar4 != bVar7 && bVar4 != (bVar5 = UK.b.WRAP_CONTENT) && (bVar4 != UK.b.MATCH_PARENT || bVar2 == bVar5)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }
}
