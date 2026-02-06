package o;

import java.util.List;
import java.util.Map;

/* renamed from: o.ck  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5640ck implements DO1 {
    @Override // o.DO1
    public QT1 c(C7120in c7120in) throws C9349rr1, C2605Bx0 {
        return d(c7120in, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065 A[LOOP:0: B:34:0x0063->B:35:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    @Override // o.DO1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public QT1 d(C7120in c7120in, Map<XV, ?> map) throws C9349rr1, C2605Bx0 {
        UT1[] ut1Arr;
        C9349rr1 c9349rr1;
        UT1[] ut1Arr2;
        C2605Bx0 c2605Bx0;
        UT1[] ut1Arr3;
        List<byte[]> a;
        String b;
        VT1 vt1;
        C5398bk b2;
        G20 g20 = new G20(c7120in.b());
        C9753tW c9753tW = null;
        try {
            b2 = g20.b(false);
            ut1Arr = b2.b();
        } catch (C2605Bx0 e) {
            e = e;
            ut1Arr = null;
        } catch (C9349rr1 e2) {
            e = e2;
            ut1Arr = null;
        }
        try {
            c2605Bx0 = null;
            c9753tW = new C7298jW().c(b2);
            ut1Arr2 = ut1Arr;
            c9349rr1 = null;
        } catch (C2605Bx0 e3) {
            e = e3;
            c2605Bx0 = e;
            ut1Arr2 = ut1Arr;
            c9349rr1 = null;
            if (c9753tW == null) {
            }
            if (map != null) {
                while (r14 < r0) {
                }
            }
            QT1 qt1 = new QT1(c9753tW.j(), c9753tW.g(), c9753tW.e(), ut1Arr3, EnumC3839Ok.AZTEC, System.currentTimeMillis());
            a = c9753tW.a();
            if (a != null) {
            }
            b = c9753tW.b();
            if (b != null) {
            }
            return qt1;
        } catch (C9349rr1 e4) {
            e = e4;
            UT1[] ut1Arr4 = ut1Arr;
            c9349rr1 = e;
            ut1Arr2 = ut1Arr4;
            c2605Bx0 = null;
            if (c9753tW == null) {
            }
            if (map != null) {
            }
            QT1 qt12 = new QT1(c9753tW.j(), c9753tW.g(), c9753tW.e(), ut1Arr3, EnumC3839Ok.AZTEC, System.currentTimeMillis());
            a = c9753tW.a();
            if (a != null) {
            }
            b = c9753tW.b();
            if (b != null) {
            }
            return qt12;
        }
        if (c9753tW == null) {
            try {
                C5398bk b3 = g20.b(true);
                UT1[] b4 = b3.b();
                c9753tW = new C7298jW().c(b3);
                ut1Arr3 = b4;
            } catch (C2605Bx0 | C9349rr1 e5) {
                if (c9349rr1 == null) {
                    if (c2605Bx0 != null) {
                        throw c2605Bx0;
                    }
                    throw e5;
                }
                throw c9349rr1;
            }
        } else {
            ut1Arr3 = ut1Arr2;
        }
        if (map != null && (vt1 = (VT1) map.get(XV.NEED_RESULT_POINT_CALLBACK)) != null) {
            for (UT1 ut1 : ut1Arr3) {
                vt1.a(ut1);
            }
        }
        QT1 qt122 = new QT1(c9753tW.j(), c9753tW.g(), c9753tW.e(), ut1Arr3, EnumC3839Ok.AZTEC, System.currentTimeMillis());
        a = c9753tW.a();
        if (a != null) {
            qt122.j(ST1.BYTE_SEGMENTS, a);
        }
        b = c9753tW.b();
        if (b != null) {
            qt122.j(ST1.ERROR_CORRECTION_LEVEL, b);
        }
        return qt122;
    }

    @Override // o.DO1
    public void reset() {
    }
}
