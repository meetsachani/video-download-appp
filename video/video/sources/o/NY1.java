package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public final class NY1 {
    public static final double a = 48.0d;
    public static final double b = 0.7d;
    public static final double c = 0.3d;
    public static final double d = 0.1d;
    public static final double e = 5.0d;
    public static final double f = 0.01d;
    public static final int g = -12417548;
    public static final int h = 4;

    /* loaded from: classes3.dex */
    public static class a implements Comparator<b> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return Double.compare(bVar2.b, bVar.b);
        }
    }

    /* loaded from: classes3.dex */
    public static class b {
        public final JG0 a;
        public final double b;

        public b(JG0 jg0, double d) {
            this.a = jg0;
            this.b = d;
        }
    }

    public static List<Integer> a(Map<Integer, Integer> map) {
        return d(map, 4, g, true);
    }

    public static List<Integer> b(Map<Integer, Integer> map, int i) {
        return d(map, i, g, true);
    }

    public static List<Integer> c(Map<Integer, Integer> map, int i, int i2) {
        return d(map, i, i2, true);
    }

    public static List<Integer> d(Map<Integer, Integer> map, int i, int i2, boolean z) {
        double d2;
        ArrayList<JG0> arrayList = new ArrayList();
        int[] iArr = new int[360];
        double d3 = 0.0d;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            JG0 b2 = JG0.b(entry.getKey().intValue());
            arrayList.add(b2);
            int floor = (int) Math.floor(b2.d());
            int intValue = entry.getValue().intValue();
            iArr[floor] = iArr[floor] + intValue;
            d3 += intValue;
        }
        double[] dArr = new double[360];
        for (int i3 = 0; i3 < 360; i3++) {
            double d4 = iArr[i3] / d3;
            for (int i4 = i3 - 14; i4 < i3 + 16; i4++) {
                int h2 = C8558od1.h(i4);
                dArr[h2] = dArr[h2] + d4;
            }
        }
        ArrayList<b> arrayList2 = new ArrayList();
        for (JG0 jg0 : arrayList) {
            double d5 = dArr[C8558od1.h((int) Math.round(jg0.d()))];
            if (!z || (jg0.c() >= 5.0d && d5 > 0.01d)) {
                double d6 = d5 * 100.0d * 0.7d;
                if (jg0.c() < 48.0d) {
                    d2 = 0.1d;
                } else {
                    d2 = 0.3d;
                }
                arrayList2.add(new b(jg0, d6 + ((jg0.c() - 48.0d) * d2)));
            }
        }
        Collections.sort(arrayList2, new a());
        ArrayList<JG0> arrayList3 = new ArrayList();
        for (int i5 = 90; i5 >= 15; i5--) {
            arrayList3.clear();
            for (b bVar : arrayList2) {
                JG0 jg02 = bVar.a;
                Iterator it = arrayList3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C8558od1.c(jg02.d(), ((JG0) it.next()).d()) < i5) {
                            break;
                        }
                    } else {
                        arrayList3.add(jg02);
                        break;
                    }
                }
                if (arrayList3.size() >= i) {
                    break;
                }
            }
            if (arrayList3.size() >= i) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty()) {
            arrayList4.add(Integer.valueOf(i2));
            return arrayList4;
        }
        for (JG0 jg03 : arrayList3) {
            arrayList4.add(Integer.valueOf(jg03.k()));
        }
        return arrayList4;
    }
}
