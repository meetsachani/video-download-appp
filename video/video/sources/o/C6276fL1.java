package o;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.C6879hn0;
import o.InterfaceC2426Ac0;

/* renamed from: o.fL1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6276fL1 {
    public static final String c = "QualitySelector";
    public final List<C5548cL1> a;
    public final C6879hn0 b;

    public C6276fL1(List<C5548cL1> list, C6879hn0 c6879hn0) {
        boolean z;
        if (list.isEmpty() && c6879hn0 == C6879hn0.f) {
            z = false;
        } else {
            z = true;
        }
        C10907yF1.b(z, "No preferred quality and fallback strategy.");
        this.a = Collections.unmodifiableList(new ArrayList(list));
        this.b = c6879hn0;
    }

    public static void b(List<C5548cL1> list) {
        for (C5548cL1 c5548cL1 : list) {
            boolean a = C5548cL1.a(c5548cL1);
            C10907yF1.b(a, "qualities contain invalid quality: " + c5548cL1);
        }
    }

    public static void c(C5548cL1 c5548cL1) {
        boolean a = C5548cL1.a(c5548cL1);
        C10907yF1.b(a, "Invalid quality: " + c5548cL1);
    }

    public static C6276fL1 d(C5548cL1 c5548cL1) {
        return e(c5548cL1, C6879hn0.f);
    }

    public static C6276fL1 e(C5548cL1 c5548cL1, C6879hn0 c6879hn0) {
        C10907yF1.m(c5548cL1, "quality cannot be null");
        C10907yF1.m(c6879hn0, "fallbackStrategy cannot be null");
        c(c5548cL1);
        return new C6276fL1(Collections.singletonList(c5548cL1), c6879hn0);
    }

    public static C6276fL1 f(List<C5548cL1> list) {
        return g(list, C6879hn0.f);
    }

    public static C6276fL1 g(List<C5548cL1> list, C6879hn0 c6879hn0) {
        C10907yF1.m(list, "qualities cannot be null");
        C10907yF1.m(c6879hn0, "fallbackStrategy cannot be null");
        C10907yF1.b(!list.isEmpty(), "qualities cannot be empty");
        b(list);
        return new C6276fL1(list, c6879hn0);
    }

    public static Size i(VG2 vg2) {
        InterfaceC2426Ac0.c k = vg2.k();
        return new Size(k.k(), k.h());
    }

    public static Map<C5548cL1, Size> j(InterfaceC7235jF2 interfaceC7235jF2, N80 n80) {
        HashMap hashMap = new HashMap();
        for (C5548cL1 c5548cL1 : interfaceC7235jF2.b(n80)) {
            VG2 d = interfaceC7235jF2.d(c5548cL1, n80);
            Objects.requireNonNull(d);
            hashMap.put(c5548cL1, i(d));
        }
        return hashMap;
    }

    public static Size k(InterfaceC6420fx interfaceC6420fx, C5548cL1 c5548cL1) {
        c(c5548cL1);
        VG2 d = C7033iP1.J(interfaceC6420fx).d(c5548cL1, N80.n);
        if (d != null) {
            return i(d);
        }
        return null;
    }

    @Deprecated
    public static List<C5548cL1> l(InterfaceC6420fx interfaceC6420fx) {
        return C7033iP1.J(interfaceC6420fx).b(N80.n);
    }

    @Deprecated
    public static boolean m(InterfaceC6420fx interfaceC6420fx, C5548cL1 c5548cL1) {
        return C7033iP1.J(interfaceC6420fx).c(c5548cL1, N80.n);
    }

    public final void a(List<C5548cL1> list, Set<C5548cL1> set) {
        C5548cL1 e;
        if (!list.isEmpty() && !set.containsAll(list)) {
            C7433k41.a(c, "Select quality by fallbackStrategy = " + this.b);
            C6879hn0 c6879hn0 = this.b;
            if (c6879hn0 != C6879hn0.f) {
                C10907yF1.o(c6879hn0 instanceof C6879hn0.b, "Currently only support type RuleStrategy");
                C6879hn0.b bVar = (C6879hn0.b) this.b;
                List<C5548cL1> b = C5548cL1.b();
                boolean z = false;
                if (bVar.e() == C5548cL1.f) {
                    e = b.get(0);
                } else if (bVar.e() == C5548cL1.e) {
                    e = b.get(b.size() - 1);
                } else {
                    e = bVar.e();
                }
                int indexOf = b.indexOf(e);
                if (indexOf != -1) {
                    z = true;
                }
                C10907yF1.n(z);
                ArrayList arrayList = new ArrayList();
                for (int i = indexOf - 1; i >= 0; i--) {
                    C5548cL1 c5548cL1 = b.get(i);
                    if (list.contains(c5548cL1)) {
                        arrayList.add(c5548cL1);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = indexOf + 1; i2 < b.size(); i2++) {
                    C5548cL1 c5548cL12 = b.get(i2);
                    if (list.contains(c5548cL12)) {
                        arrayList2.add(c5548cL12);
                    }
                }
                C7433k41.a(c, "sizeSortedQualities = " + b + ", fallback quality = " + e + ", largerQualities = " + arrayList + ", smallerQualities = " + arrayList2);
                int f = bVar.f();
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                if (f == 4) {
                                    set.addAll(arrayList2);
                                    return;
                                }
                                throw new AssertionError("Unhandled fallback strategy: " + this.b);
                            }
                            set.addAll(arrayList2);
                            set.addAll(arrayList);
                            return;
                        }
                        set.addAll(arrayList);
                        return;
                    }
                    set.addAll(arrayList);
                    set.addAll(arrayList2);
                }
            }
        }
    }

    public List<C5548cL1> h(List<C5548cL1> list) {
        if (list.isEmpty()) {
            C7433k41.p(c, "No supported quality on the device.");
            return new ArrayList();
        }
        C7433k41.a(c, "supportedQualities = " + list);
        Set<C5548cL1> linkedHashSet = new LinkedHashSet<>();
        Iterator<C5548cL1> it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C5548cL1 next = it.next();
            if (next == C5548cL1.f) {
                linkedHashSet.addAll(list);
                break;
            } else if (next == C5548cL1.e) {
                ArrayList arrayList = new ArrayList(list);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            } else if (list.contains(next)) {
                linkedHashSet.add(next);
            } else {
                C7433k41.p(c, "quality is not supported and will be ignored: " + next);
            }
        }
        a(list, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public String toString() {
        return "QualitySelector{preferredQualities=" + this.a + ", fallbackStrategy=" + this.b + "}";
    }
}
