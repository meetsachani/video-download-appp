package o;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: o.eL1 */
/* loaded from: classes.dex */
public class C6033eL1 {
    public static final Map<C5548cL1, Range<Integer>> b;
    public static final Map<Integer, Rational> c;
    public final Map<a, List<Size>> a = new HashMap();

    /* renamed from: o.eL1$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public static a c(C5548cL1 c5548cL1, int i) {
            return new C7104ij(c5548cL1, i);
        }

        public abstract int a();

        public abstract C5548cL1 b();
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(C5548cL1.d, Range.create(2160, 4319));
        hashMap.put(C5548cL1.c, Range.create(Integer.valueOf((int) FC.u), 1439));
        hashMap.put(C5548cL1.b, Range.create(720, 1079));
        hashMap.put(C5548cL1.a, Range.create(Integer.valueOf((int) C10997yd1.o2), Integer.valueOf((int) C8920q7.E)));
        HashMap hashMap2 = new HashMap();
        c = hashMap2;
        hashMap2.put(0, C9050qf.a);
        hashMap2.put(1, C9050qf.c);
    }

    public C6033eL1(List<Size> list, Map<C5548cL1, Size> map) {
        for (C5548cL1 c5548cL1 : b.keySet()) {
            this.a.put(a.c(c5548cL1, -1), new ArrayList());
            for (Integer num : c.keySet()) {
                this.a.put(a.c(c5548cL1, num.intValue()), new ArrayList());
            }
        }
        b(map);
        c(list);
        h(map);
    }

    public static /* synthetic */ int a(int i, Size size, Size size2) {
        return Math.abs(W82.a(size) - i) - Math.abs(W82.a(size2) - i);
    }

    public static Integer d(Size size) {
        for (Map.Entry<Integer, Rational> entry : c.entrySet()) {
            if (C9050qf.b(size, entry.getValue(), W82.b)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static C5548cL1 e(Size size) {
        for (Map.Entry<C5548cL1, Range<Integer>> entry : b.entrySet()) {
            if (entry.getValue().contains((Range<Integer>) Integer.valueOf(size.getHeight()))) {
                return entry.getKey();
            }
        }
        return null;
    }

    public final void b(Map<C5548cL1, Size> map) {
        for (Map.Entry<C5548cL1, Size> entry : map.entrySet()) {
            List<Size> f = f(entry.getKey(), -1);
            Objects.requireNonNull(f);
            f.add(entry.getValue());
        }
    }

    public final void c(List<Size> list) {
        Integer d;
        for (Size size : list) {
            C5548cL1 e = e(size);
            if (e != null && (d = d(size)) != null) {
                List<Size> f = f(e, d.intValue());
                Objects.requireNonNull(f);
                f.add(size);
            }
        }
    }

    public final List<Size> f(C5548cL1 c5548cL1, int i) {
        return this.a.get(a.c(c5548cL1, i));
    }

    public List<Size> g(C5548cL1 c5548cL1, int i) {
        List<Size> f = f(c5548cL1, i);
        if (f != null) {
            return new ArrayList(f);
        }
        return new ArrayList(0);
    }

    public final void h(Map<C5548cL1, Size> map) {
        for (Map.Entry<a, List<Size>> entry : this.a.entrySet()) {
            Size size = map.get(entry.getKey().b());
            if (size != null) {
                final int a2 = W82.a(size);
                Collections.sort(entry.getValue(), new Comparator() { // from class: o.dL1
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return C6033eL1.a(a2, (Size) obj, (Size) obj2);
                    }
                });
            }
        }
    }
}
