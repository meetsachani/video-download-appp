package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.im2 */
/* loaded from: classes3.dex */
public final class C7119im2 {
    public final JG0 a;
    public JG0 b;
    public List<JG0> c;
    public List<JG0> d;
    public Map<JG0, Double> e;

    public C7119im2() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ Double a(C7119im2 c7119im2, JG0 jg0) {
        return c7119im2.i().get(jg0);
    }

    public static boolean k(double d, double d2, double d3) {
        if (d2 < d3) {
            if (d2 > d || d > d3) {
                return false;
            }
            return true;
        } else if (d2 > d && d > d3) {
            return false;
        } else {
            return true;
        }
    }

    public static double l(JG0 jg0) {
        double[] l = C9448sG.l(jg0.k());
        return ((Math.pow(Math.hypot(l[1], l[2]), 1.07d) * 0.02d) * Math.cos(Math.toRadians(C8558od1.g(C8558od1.g(Math.toDegrees(Math.atan2(l[2], l[1]))) - 50.0d)))) - 0.5d;
    }

    public List<JG0> b() {
        return c(5, 12);
    }

    public List<JG0> c(int i, int i2) {
        boolean z;
        int round = (int) Math.round(this.a.d());
        JG0 jg0 = f().get(round);
        double h = h(jg0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(jg0);
        double d = 0.0d;
        double d2 = 0.0d;
        int i3 = 0;
        while (i3 < 360) {
            double h2 = h(f().get(C8558od1.h(round + i3)));
            d2 += Math.abs(h2 - h);
            i3++;
            h = h2;
        }
        double d3 = d2 / i2;
        double h3 = h(jg0);
        int i4 = 1;
        while (true) {
            if (arrayList.size() >= i2) {
                break;
            }
            JG0 jg02 = f().get(C8558od1.h(round + i4));
            double h4 = h(jg02);
            d += Math.abs(h4 - h3);
            if (d >= arrayList.size() * d3) {
                z = true;
            } else {
                z = false;
            }
            int i5 = 1;
            while (z && arrayList.size() < i2) {
                arrayList.add(jg02);
                int i6 = i4;
                if (d >= (arrayList.size() + i5) * d3) {
                    z = true;
                } else {
                    z = false;
                }
                i5++;
                i4 = i6;
            }
            i4++;
            if (i4 > 360) {
                while (arrayList.size() < i2) {
                    arrayList.add(jg02);
                }
            } else {
                h3 = h4;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.a);
        int floor = (int) Math.floor((i - 1.0d) / 2.0d);
        for (int i7 = 1; i7 < floor + 1; i7++) {
            int i8 = 0 - i7;
            while (i8 < 0) {
                i8 += arrayList.size();
            }
            if (i8 >= arrayList.size()) {
                i8 %= arrayList.size();
            }
            arrayList2.add(0, (JG0) arrayList.get(i8));
        }
        int i9 = i - floor;
        for (int i10 = 1; i10 < i9; i10++) {
            int i11 = i10;
            while (i11 < 0) {
                i11 += arrayList.size();
            }
            if (i11 >= arrayList.size()) {
                i11 %= arrayList.size();
            }
            arrayList2.add((JG0) arrayList.get(i11));
        }
        return arrayList2;
    }

    public final JG0 d() {
        return g().get(0);
    }

    public JG0 e() {
        double d;
        double d2;
        double d3;
        JG0 jg0 = this.b;
        if (jg0 != null) {
            return jg0;
        }
        double d4 = d().d();
        double doubleValue = i().get(d()).doubleValue();
        double d5 = j().d();
        double doubleValue2 = i().get(j()).doubleValue() - doubleValue;
        boolean k = k(this.a.d(), d4, d5);
        if (k) {
            d = d5;
        } else {
            d = d4;
        }
        if (k) {
            d2 = d4;
        } else {
            d2 = d5;
        }
        JG0 jg02 = f().get((int) Math.round(this.a.d()));
        double d6 = 1.0d;
        double h = 1.0d - h(this.a);
        double d7 = 1000.0d;
        double d8 = 0.0d;
        while (d8 <= 360.0d) {
            double g = C8558od1.g((d6 * d8) + d);
            if (!k(g, d, d2)) {
                d3 = d6;
            } else {
                d3 = d6;
                JG0 jg03 = f().get((int) Math.round(g));
                double abs = Math.abs(h - ((i().get(jg03).doubleValue() - doubleValue) / doubleValue2));
                if (abs < d7) {
                    jg02 = jg03;
                    d7 = abs;
                }
            }
            d8 += d3;
            d6 = d3;
        }
        this.b = jg02;
        return jg02;
    }

    public final List<JG0> f() {
        List<JG0> list = this.d;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            arrayList.add(JG0.a(d, this.a.c(), this.a.e()));
        }
        List<JG0> unmodifiableList = Collections.unmodifiableList(arrayList);
        this.d = unmodifiableList;
        return unmodifiableList;
    }

    public final List<JG0> g() {
        List<JG0> list = this.c;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(f());
        arrayList.add(this.a);
        Collections.sort(arrayList, Comparator.comparing(new Function() { // from class: o.gm2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C7119im2.a(C7119im2.this, (JG0) obj);
            }
        }, new Comparator() { // from class: o.hm2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Double) obj).compareTo((Double) obj2);
            }
        }));
        this.c = arrayList;
        return arrayList;
    }

    public double h(JG0 jg0) {
        double doubleValue = i().get(j()).doubleValue() - i().get(d()).doubleValue();
        double doubleValue2 = i().get(jg0).doubleValue() - i().get(d()).doubleValue();
        if (doubleValue == 0.0d) {
            return 0.5d;
        }
        return doubleValue2 / doubleValue;
    }

    public final Map<JG0, Double> i() {
        Map<JG0, Double> map = this.e;
        if (map != null) {
            return map;
        }
        ArrayList<JG0> arrayList = new ArrayList(f());
        arrayList.add(this.a);
        HashMap hashMap = new HashMap();
        for (JG0 jg0 : arrayList) {
            hashMap.put(jg0, Double.valueOf(l(jg0)));
        }
        this.e = hashMap;
        return hashMap;
    }

    public final JG0 j() {
        return g().get(g().size() - 1);
    }

    public C7119im2(JG0 jg0) {
        this.a = jg0;
    }
}
