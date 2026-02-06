package o;

import java.util.Map;

/* renamed from: o.wr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10565wr implements DO1 {
    public final DO1 a;

    public C10565wr(DO1 do1) {
        this.a = do1;
    }

    public static void a(UT1[] ut1Arr, int i, int i2) {
        if (ut1Arr != null) {
            for (int i3 = 0; i3 < ut1Arr.length; i3++) {
                UT1 ut1 = ut1Arr[i3];
                ut1Arr[i3] = new UT1(ut1.c() + i, ut1.d() + i2);
            }
        }
    }

    @Override // o.DO1
    public QT1 c(C7120in c7120in) throws C9349rr1, UB, C2605Bx0 {
        return d(c7120in, null);
    }

    @Override // o.DO1
    public QT1 d(C7120in c7120in, Map<XV, ?> map) throws C9349rr1, UB, C2605Bx0 {
        int e = c7120in.e() / 2;
        int d = c7120in.d() / 2;
        try {
            try {
                try {
                    try {
                        return this.a.d(c7120in.a(0, 0, e, d), map);
                    } catch (C9349rr1 unused) {
                        QT1 d2 = this.a.d(c7120in.a(e, 0, e, d), map);
                        a(d2.f(), e, 0);
                        return d2;
                    }
                } catch (C9349rr1 unused2) {
                    QT1 d3 = this.a.d(c7120in.a(0, d, e, d), map);
                    a(d3.f(), 0, d);
                    return d3;
                }
            } catch (C9349rr1 unused3) {
                QT1 d4 = this.a.d(c7120in.a(e, d, e, d), map);
                a(d4.f(), e, d);
                return d4;
            }
        } catch (C9349rr1 unused4) {
            int i = e / 2;
            int i2 = d / 2;
            QT1 d5 = this.a.d(c7120in.a(i, i2, e, d), map);
            a(d5.f(), i, i2);
            return d5;
        }
    }

    @Override // o.DO1
    public void reset() {
        this.a.reset();
    }
}
