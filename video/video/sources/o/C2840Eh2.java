package o;

import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C9050qf;

/* renamed from: o.Eh2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2840Eh2 {
    public static final String e = "SupportedOutputSizesCollector";
    public final int a;
    public final int b;
    public final Rational c;
    public final boolean d;

    public C2840Eh2(InterfaceC6918hx interfaceC6918hx, Rational rational) {
        this.a = interfaceC6918hx.f();
        this.b = interfaceC6918hx.g();
        this.c = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.d = z;
    }

    public static Size a(Size size, int i, int i2, int i3) {
        if (size != null && e(i, i2, i3)) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    public static Rational b(Size size, List<Size> list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : C2742Dh2.l(list)) {
            if (C9050qf.a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    public static boolean e(int i, int i2, int i3) {
        boolean z;
        int c = C10589wx.c(i);
        if (1 == i2) {
            z = true;
        } else {
            z = false;
        }
        int b = C10589wx.b(c, i3, z);
        if (b != 90 && b != 270) {
            return false;
        }
        return true;
    }

    public final Rational c(InterfaceC6040eN0 interfaceC6040eN0, List<Size> list) {
        if (interfaceC6040eN0.G()) {
            return C2742Dh2.n(interfaceC6040eN0.I(), this.d);
        }
        Size d = d(interfaceC6040eN0);
        if (d != null) {
            return b(d, list);
        }
        return null;
    }

    public final Size d(InterfaceC6040eN0 interfaceC6040eN0) {
        return a(interfaceC6040eN0.d0(null), interfaceC6040eN0.N(0), this.b, this.a);
    }

    public List<Size> f(List<Size> list, InterfaceC6743hD2<?> interfaceC6743hD2) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new C8474oH(true));
        ArrayList arrayList2 = new ArrayList();
        InterfaceC6040eN0 interfaceC6040eN0 = (InterfaceC6040eN0) interfaceC6743hD2;
        Size n = interfaceC6040eN0.n(null);
        Size size = (Size) arrayList.get(0);
        if (n == null || W82.a(size) < W82.a(n)) {
            n = size;
        }
        Size d = d(interfaceC6040eN0);
        Size size2 = W82.c;
        int a = W82.a(size2);
        if (W82.a(n) < a) {
            size2 = W82.a;
        } else if (d != null && W82.a(d) < a) {
            size2 = d;
        }
        for (Size size3 : arrayList) {
            if (W82.a(size3) <= W82.a(n) && W82.a(size3) >= W82.a(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (!arrayList2.isEmpty()) {
            Rational c = c(interfaceC6040eN0, arrayList2);
            if (d == null) {
                d = interfaceC6040eN0.W(null);
            }
            ArrayList arrayList3 = new ArrayList();
            new HashMap();
            if (c == null) {
                arrayList3.addAll(arrayList2);
                if (d != null) {
                    C2742Dh2.q(arrayList3, d, true);
                    return arrayList3;
                }
            } else {
                Map<Rational, List<Size>> o2 = C2742Dh2.o(arrayList2);
                if (d != null) {
                    for (Rational rational : o2.keySet()) {
                        C2742Dh2.q(o2.get(rational), d, true);
                    }
                }
                ArrayList<Rational> arrayList4 = new ArrayList(o2.keySet());
                Collections.sort(arrayList4, new C9050qf.a(c, this.c));
                for (Rational rational2 : arrayList4) {
                    for (Size size4 : o2.get(rational2)) {
                        if (!arrayList3.contains(size4)) {
                            arrayList3.add(size4);
                        }
                    }
                }
            }
            return arrayList3;
        }
        throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + n + "\ninitial size list: " + arrayList);
    }
}
