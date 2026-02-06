package o;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C9050qf;

/* renamed from: o.Dh2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2742Dh2 {
    public static final String g = "SupportedOutputSizesCollector";
    public final InterfaceC6918hx a;
    public final int b;
    public final int c;
    public final Rational d;
    public final boolean e;
    public final C2840Eh2 f;

    public C2742Dh2(InterfaceC6918hx interfaceC6918hx, Size size) {
        Rational i;
        this.a = interfaceC6918hx;
        this.b = interfaceC6918hx.f();
        this.c = interfaceC6918hx.g();
        if (size != null) {
            i = h(size);
        } else {
            i = i(interfaceC6918hx);
        }
        this.d = i;
        boolean z = true;
        if (i != null && i.getNumerator() < i.getDenominator()) {
            z = false;
        }
        this.e = z;
        this.f = new C2840Eh2(interfaceC6918hx, i);
    }

    public static void d(LinkedHashMap<Rational, List<Size>> linkedHashMap, Size size) {
        int a = W82.a(size);
        for (Rational rational : linkedHashMap.keySet()) {
            List<Size> list = linkedHashMap.get(rational);
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (W82.a(size2) <= a) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    public static void f(LinkedHashMap<Rational, List<Size>> linkedHashMap, WS1 ws1) {
        if (ws1 != null) {
            for (Rational rational : linkedHashMap.keySet()) {
                g(linkedHashMap.get(rational), ws1);
            }
        }
    }

    public static void g(List<Size> list, WS1 ws1) {
        if (!list.isEmpty()) {
            int b = ws1.b();
            if (!ws1.equals(WS1.c)) {
                Size a = ws1.a();
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b != 4) {
                                    return;
                                }
                                r(list, a, false);
                                return;
                            }
                            r(list, a, true);
                            return;
                        }
                        q(list, a, false);
                        return;
                    }
                    q(list, a, true);
                    return;
                }
                s(list, a);
            }
        }
    }

    public static List<Rational> l(List<Size> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C9050qf.a);
        arrayList.add(C9050qf.c);
        for (Size size : list) {
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C9050qf.a(size, (Rational) it.next())) {
                            break;
                        }
                    } else {
                        arrayList.add(rational);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public static Rational n(int i, boolean z) {
        if (i == -1) {
            return null;
        }
        if (i != 0) {
            if (i != 1) {
                C7433k41.c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
                return null;
            } else if (z) {
                return C9050qf.c;
            } else {
                return C9050qf.d;
            }
        } else if (z) {
            return C9050qf.a;
        } else {
            return C9050qf.b;
        }
    }

    public static Map<Rational, List<Size>> o(List<Size> list) {
        HashMap hashMap = new HashMap();
        for (Rational rational : l(list)) {
            hashMap.put(rational, new ArrayList());
        }
        for (Size size : list) {
            for (Rational rational2 : hashMap.keySet()) {
                if (C9050qf.a(size, rational2)) {
                    ((List) hashMap.get(rational2)).add(size);
                }
            }
        }
        return hashMap;
    }

    public static void q(List<Size> list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void r(List<Size> list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void s(List<Size> list, Size size) {
        boolean contains = list.contains(size);
        list.clear();
        if (contains) {
            list.add(size);
        }
    }

    public final LinkedHashMap<Rational, List<Size>> a(List<Size> list, C8807pf c8807pf) {
        return b(o(list), c8807pf);
    }

    public final LinkedHashMap<Rational, List<Size>> b(Map<Rational, List<Size>> map, C8807pf c8807pf) {
        Rational n = n(c8807pf.b(), this.e);
        if (c8807pf.a() == 0) {
            Rational n2 = n(c8807pf.b(), this.e);
            Iterator it = new ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                Rational rational = (Rational) it.next();
                if (!rational.equals(n2)) {
                    map.remove(rational);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new C9050qf.a(n, this.d));
        LinkedHashMap<Rational, List<Size>> linkedHashMap = new LinkedHashMap<>();
        for (Rational rational2 : arrayList) {
            linkedHashMap.put(rational2, map.get(rational2));
        }
        return linkedHashMap;
    }

    public final List<Size> c(List<Size> list, US1 us1, int i) {
        if (us1.a() == 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            arrayList.addAll(this.a.j(i));
            Collections.sort(arrayList, new C8474oH(true));
            return arrayList;
        }
        return list;
    }

    public final List<Size> e(List<Size> list, SS1 ss1, int i) {
        if (ss1 == null) {
            return list;
        }
        int c = C10589wx.c(i);
        int i2 = this.b;
        boolean z = true;
        if (this.c != 1) {
            z = false;
        }
        List<Size> a = ss1.a(new ArrayList(list), C10589wx.b(c, i2, z));
        if (list.containsAll(a)) {
            return a;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    public final Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final Rational i(InterfaceC6918hx interfaceC6918hx) {
        List<Size> n = interfaceC6918hx.n(256);
        if (n.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(n, new C8474oH());
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final List<Size> j(int i, InterfaceC6040eN0 interfaceC6040eN0) {
        Size[] sizeArr;
        List<Pair<Integer, Size[]>> p = interfaceC6040eN0.p(null);
        if (p != null) {
            for (Pair<Integer, Size[]> pair : p) {
                if (((Integer) pair.first).intValue() == i) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    public final List<Size> k(InterfaceC6743hD2<?> interfaceC6743hD2) {
        int t = interfaceC6743hD2.t();
        List<Size> j = j(t, (InterfaceC6040eN0) interfaceC6743hD2);
        if (j == null) {
            j = this.a.n(t);
        }
        ArrayList arrayList = new ArrayList(j);
        Collections.sort(arrayList, new C8474oH(true));
        if (arrayList.isEmpty()) {
            C7433k41.p("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + t + UE.h);
        }
        return arrayList;
    }

    public List<Size> m(InterfaceC6743hD2<?> interfaceC6743hD2) {
        InterfaceC6040eN0 interfaceC6040eN0 = (InterfaceC6040eN0) interfaceC6743hD2;
        List<Size> R = interfaceC6040eN0.R(null);
        if (R != null) {
            return R;
        }
        if (interfaceC6040eN0.T(null) == null) {
            return this.f.f(k(interfaceC6743hD2), interfaceC6743hD2);
        }
        return p(interfaceC6743hD2);
    }

    public final List<Size> p(InterfaceC6743hD2<?> interfaceC6743hD2) {
        US1 r = ((InterfaceC6040eN0) interfaceC6743hD2).r();
        List<Size> k = k(interfaceC6743hD2);
        if (!interfaceC6743hD2.U(false)) {
            k = c(k, r, interfaceC6743hD2.t());
        }
        LinkedHashMap<Rational, List<Size>> a = a(k, r.b());
        InterfaceC6040eN0 interfaceC6040eN0 = (InterfaceC6040eN0) interfaceC6743hD2;
        Size n = interfaceC6040eN0.n(null);
        if (n != null) {
            d(a, n);
        }
        f(a, r.d());
        ArrayList arrayList = new ArrayList();
        for (List<Size> list : a.values()) {
            for (Size size : list) {
                if (!arrayList.contains(size)) {
                    arrayList.add(size);
                }
            }
        }
        return e(arrayList, r.c(), interfaceC6040eN0.N(0));
    }
}
