package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class OC0 implements InterfaceC11033ym1 {
    public static final int b = 100;
    public static final int c = 4;
    public final DO1 a;

    public OC0(DO1 do1) {
        this.a = do1;
    }

    public static QT1 d(QT1 qt1, int i, int i2) {
        UT1[] f = qt1.f();
        if (f == null) {
            return qt1;
        }
        UT1[] ut1Arr = new UT1[f.length];
        for (int i3 = 0; i3 < f.length; i3++) {
            UT1 ut1 = f[i3];
            if (ut1 != null) {
                ut1Arr[i3] = new UT1(ut1.c() + i, ut1.d() + i2);
            }
        }
        QT1 qt12 = new QT1(qt1.g(), qt1.d(), qt1.c(), ut1Arr, qt1.b(), qt1.h());
        qt12.i(qt1.e());
        return qt12;
    }

    @Override // o.InterfaceC11033ym1
    public QT1[] a(C7120in c7120in) throws C9349rr1 {
        return b(c7120in, null);
    }

    @Override // o.InterfaceC11033ym1
    public QT1[] b(C7120in c7120in, Map<XV, ?> map) throws C9349rr1 {
        ArrayList arrayList = new ArrayList();
        c(c7120in, map, arrayList, 0, 0, 0);
        if (!arrayList.isEmpty()) {
            return (QT1[]) arrayList.toArray(new QT1[arrayList.size()]);
        }
        throw C9349rr1.a();
    }

    public final void c(C7120in c7120in, Map<XV, ?> map, List<QT1> list, int i, int i2, int i3) {
        int i4;
        if (i3 <= 4) {
            try {
                QT1 d = this.a.d(c7120in, map);
                Iterator<QT1> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().g().equals(d.g())) {
                            break;
                        }
                    } else {
                        list.add(d(d, i, i2));
                        break;
                    }
                }
                UT1[] f = d.f();
                if (f != null && f.length != 0) {
                    int e = c7120in.e();
                    int d2 = c7120in.d();
                    float f2 = e;
                    float f3 = d2;
                    float f4 = 0.0f;
                    float f5 = 0.0f;
                    for (UT1 ut1 : f) {
                        if (ut1 != null) {
                            float c2 = ut1.c();
                            float d3 = ut1.d();
                            if (c2 < f2) {
                                f2 = c2;
                            }
                            if (d3 < f3) {
                                f3 = d3;
                            }
                            if (c2 > f4) {
                                f4 = c2;
                            }
                            if (d3 > f5) {
                                f5 = d3;
                            }
                        }
                    }
                    if (f2 > 100.0f) {
                        i4 = 0;
                        c(c7120in.a(0, 0, (int) f2, d2), map, list, i, i2, i3 + 1);
                    } else {
                        i4 = 0;
                    }
                    if (f3 > 100.0f) {
                        c(c7120in.a(i4, i4, e, (int) f3), map, list, i, i2, i3 + 1);
                    }
                    if (f4 < e - 100) {
                        int i5 = (int) f4;
                        c(c7120in.a(i5, 0, e - i5, d2), map, list, i + i5, i2, i3 + 1);
                    }
                    if (f5 < d2 - 100) {
                        int i6 = (int) f5;
                        c(c7120in.a(0, i6, e, d2 - i6), map, list, i, i2 + i6, i3 + 1);
                    }
                }
            } catch (FO1 unused) {
            }
        }
    }
}
