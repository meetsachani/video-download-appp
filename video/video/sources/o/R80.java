package o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class R80 {
    public static final String d = "DynamicRangeResolver";
    public final C7641kw a;
    public final V80 b;
    public final boolean c;

    /* loaded from: classes.dex */
    public static final class a {
        public static N80 a(C7641kw c7641kw) {
            Long l = (Long) c7641kw.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l != null) {
                return P80.b(l.longValue());
            }
            return null;
        }
    }

    public R80(C7641kw c7641kw) {
        this.a = c7641kw;
        this.b = V80.a(c7641kw);
        int[] iArr = (int[]) c7641kw.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (iArr[i] == 18) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.c = z;
    }

    public static boolean a(N80 n80, N80 n802) {
        C10907yF1.o(n802.e(), "Fully specified range is not actually fully specified.");
        if (n80.b() == 2 && n802.b() == 1) {
            return false;
        }
        if (n80.b() != 2 && n80.b() != 0 && n80.b() != n802.b()) {
            return false;
        }
        if (n80.a() == 0 || n80.a() == n802.a()) {
            return true;
        }
        return false;
    }

    public static boolean b(N80 n80, N80 n802, Set<N80> set) {
        if (!set.contains(n802)) {
            C7433k41.a(d, String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", n80, n802));
            return false;
        }
        return a(n80, n802);
    }

    public static N80 c(N80 n80, Collection<N80> collection, Set<N80> set) {
        if (n80.b() == 1) {
            return null;
        }
        for (N80 n802 : collection) {
            C10907yF1.m(n802, "Fully specified DynamicRange cannot be null.");
            int b = n802.b();
            C10907yF1.o(n802.e(), "Fully specified DynamicRange must have fully defined encoding.");
            if (b != 1 && b(n80, n802, set)) {
                return n802;
            }
        }
        return null;
    }

    public static boolean e(N80 n80) {
        return Objects.equals(n80, N80.m);
    }

    public static boolean f(N80 n80) {
        if (n80.b() != 2) {
            if (n80.b() == 0 || n80.a() != 0) {
                if (n80.b() != 0 || n80.a() == 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static void j(Set<N80> set, N80 n80, V80 v80) {
        C10907yF1.o(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set<N80> b = v80.b(n80);
        if (!b.isEmpty()) {
            HashSet hashSet = new HashSet(set);
            set.retainAll(b);
            if (set.isEmpty()) {
                throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", n80, TextUtils.join("\n  ", b), TextUtils.join("\n  ", hashSet)));
            }
        }
    }

    public boolean d() {
        return this.c;
    }

    public Map<InterfaceC6743hD2<?>, N80> g(List<AbstractC8324ng> list, List<InterfaceC6743hD2<?>> list2, List<Integer> list3) {
        LinkedHashSet<N80> linkedHashSet = new LinkedHashSet();
        for (AbstractC8324ng abstractC8324ng : list) {
            linkedHashSet.add(abstractC8324ng.c());
        }
        Set<N80> c = this.b.c();
        HashSet hashSet = new HashSet(c);
        for (N80 n80 : linkedHashSet) {
            j(hashSet, n80, this.b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Integer num : list3) {
            InterfaceC6743hD2<?> interfaceC6743hD2 = list2.get(num.intValue());
            N80 P = interfaceC6743hD2.P();
            if (e(P)) {
                arrayList3.add(interfaceC6743hD2);
            } else if (f(P)) {
                arrayList2.add(interfaceC6743hD2);
            } else {
                arrayList.add(interfaceC6743hD2);
            }
        }
        HashMap hashMap = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<InterfaceC6743hD2<?>> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (InterfaceC6743hD2<?> interfaceC6743hD22 : arrayList4) {
            N80 i = i(c, linkedHashSet, linkedHashSet2, interfaceC6743hD22, hashSet);
            hashMap.put(interfaceC6743hD22, i);
            if (!linkedHashSet.contains(i)) {
                linkedHashSet2.add(i);
            }
        }
        return hashMap;
    }

    public final N80 h(N80 n80, Set<N80> set, Set<N80> set2, Set<N80> set3, String str) {
        N80 n802;
        String str2;
        if (n80.e()) {
            if (!set.contains(n80)) {
                return null;
            }
            return n80;
        }
        int b = n80.b();
        int a2 = n80.a();
        if (b == 1 && a2 == 0) {
            N80 n803 = N80.n;
            if (!set.contains(n803)) {
                return null;
            }
            return n803;
        }
        N80 c = c(n80, set2, set);
        if (c != null) {
            C7433k41.a(d, String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, n80, c));
            return c;
        }
        N80 c2 = c(n80, set3, set);
        if (c2 != null) {
            C7433k41.a(d, String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, n80, c2));
            return c2;
        }
        N80 n804 = N80.n;
        if (b(n80, n804, set)) {
            C7433k41.a(d, String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, n80, n804));
            return n804;
        }
        if (b == 2 && (a2 == 10 || a2 == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                n802 = a.a(this.a);
                if (n802 != null) {
                    linkedHashSet.add(n802);
                }
            } else {
                n802 = null;
            }
            linkedHashSet.add(N80.p);
            N80 c3 = c(n80, linkedHashSet, set);
            if (c3 != null) {
                if (c3.equals(n802)) {
                    str2 = "recommended";
                } else {
                    str2 = "required";
                }
                C7433k41.a(d, String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", str, str2, n80, c3));
                return c3;
            }
        }
        for (N80 n805 : set) {
            C10907yF1.o(n805.e(), "Candidate dynamic range must be fully specified.");
            if (!n805.equals(N80.n) && a(n80, n805)) {
                C7433k41.a(d, String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, n80, n805));
                return n805;
            }
        }
        return null;
    }

    public final N80 i(Set<N80> set, Set<N80> set2, Set<N80> set3, InterfaceC6743hD2<?> interfaceC6743hD2, Set<N80> set4) {
        N80 P = interfaceC6743hD2.P();
        N80 h = h(P, set4, set2, set3, interfaceC6743hD2.j0());
        if (h != null) {
            j(set4, h, this.b);
            return h;
        }
        throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", interfaceC6743hD2.j0(), P, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
    }
}
