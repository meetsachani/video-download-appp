package o;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: o.tx1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9859tx1 implements DO1, InterfaceC11033ym1 {
    public static QT1[] e(C7120in c7120in, Map<XV, ?> map, boolean z) throws C9349rr1, C2605Bx0, UB {
        ArrayList arrayList = new ArrayList();
        C9131qx1 c = I20.c(c7120in, map, z);
        for (UT1[] ut1Arr : c.b()) {
            C9753tW i = C10348vx1.i(c.a(), ut1Arr[4], ut1Arr[5], ut1Arr[6], ut1Arr[7], h(ut1Arr), f(ut1Arr));
            QT1 qt1 = new QT1(i.j(), i.g(), ut1Arr, EnumC3839Ok.PDF_417);
            qt1.j(ST1.ERROR_CORRECTION_LEVEL, i.b());
            C10102ux1 c10102ux1 = (C10102ux1) i.f();
            if (c10102ux1 != null) {
                qt1.j(ST1.PDF417_EXTRA_METADATA, c10102ux1);
            }
            arrayList.add(qt1);
        }
        return (QT1[]) arrayList.toArray(new QT1[arrayList.size()]);
    }

    public static int f(UT1[] ut1Arr) {
        return Math.max(Math.max(g(ut1Arr[0], ut1Arr[4]), (g(ut1Arr[6], ut1Arr[2]) * 17) / 18), Math.max(g(ut1Arr[1], ut1Arr[5]), (g(ut1Arr[7], ut1Arr[3]) * 17) / 18));
    }

    public static int g(UT1 ut1, UT1 ut12) {
        if (ut1 != null && ut12 != null) {
            return (int) Math.abs(ut1.c() - ut12.c());
        }
        return 0;
    }

    public static int h(UT1[] ut1Arr) {
        return Math.min(Math.min(i(ut1Arr[0], ut1Arr[4]), (i(ut1Arr[6], ut1Arr[2]) * 17) / 18), Math.min(i(ut1Arr[1], ut1Arr[5]), (i(ut1Arr[7], ut1Arr[3]) * 17) / 18));
    }

    public static int i(UT1 ut1, UT1 ut12) {
        if (ut1 != null && ut12 != null) {
            return (int) Math.abs(ut1.c() - ut12.c());
        }
        return Integer.MAX_VALUE;
    }

    @Override // o.InterfaceC11033ym1
    public QT1[] a(C7120in c7120in) throws C9349rr1 {
        return b(c7120in, null);
    }

    @Override // o.InterfaceC11033ym1
    public QT1[] b(C7120in c7120in, Map<XV, ?> map) throws C9349rr1 {
        try {
            return e(c7120in, map, true);
        } catch (C2605Bx0 | UB unused) {
            throw C9349rr1.a();
        }
    }

    @Override // o.DO1
    public QT1 c(C7120in c7120in) throws C9349rr1, C2605Bx0, UB {
        return d(c7120in, null);
    }

    @Override // o.DO1
    public QT1 d(C7120in c7120in, Map<XV, ?> map) throws C9349rr1, C2605Bx0, UB {
        QT1 qt1;
        QT1[] e = e(c7120in, map, false);
        if (e != null && e.length != 0 && (qt1 = e[0]) != null) {
            return qt1;
        }
        throw C9349rr1.a();
    }

    @Override // o.DO1
    public void reset() {
    }
}
