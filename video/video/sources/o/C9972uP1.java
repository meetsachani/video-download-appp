package o;

import android.util.Size;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import o.C5548cL1;
import o.InterfaceC2426Ac0;

/* renamed from: o.uP1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9972uP1 implements InterfaceC7235jF2 {
    public static final String e = "RecorderVideoCapabilities";
    public final InterfaceC11235zc0 b;
    public final Map<N80, a> c = new HashMap();
    public final Map<N80, a> d = new HashMap();

    /* renamed from: o.uP1$a */
    /* loaded from: classes.dex */
    public static class a {
        public final Map<C5548cL1, VG2> a = new LinkedHashMap();
        public final TreeMap<Size, C5548cL1> b = new TreeMap<>(new C8474oH());
        public final VG2 c;
        public final VG2 d;

        public a(InterfaceC11235zc0 interfaceC11235zc0) {
            for (C5548cL1 c5548cL1 : C5548cL1.b()) {
                InterfaceC2426Ac0 d = d(c5548cL1, interfaceC11235zc0);
                if (d != null) {
                    C7433k41.a(C9972uP1.e, "profiles = " + d);
                    VG2 h = h(d);
                    if (h == null) {
                        C7433k41.p(C9972uP1.e, "EncoderProfiles of quality " + c5548cL1 + " has no video validated profiles.");
                    } else {
                        InterfaceC2426Ac0.c k = h.k();
                        this.b.put(new Size(k.k(), k.h()), c5548cL1);
                        this.a.put(c5548cL1, h);
                    }
                }
            }
            if (this.a.isEmpty()) {
                C7433k41.c(C9972uP1.e, "No supported EncoderProfiles");
                this.d = null;
                this.c = null;
                return;
            }
            ArrayDeque arrayDeque = new ArrayDeque(this.a.values());
            this.c = (VG2) arrayDeque.peekFirst();
            this.d = (VG2) arrayDeque.peekLast();
        }

        public static void a(C5548cL1 c5548cL1) {
            boolean a = C5548cL1.a(c5548cL1);
            C10907yF1.b(a, "Unknown quality: " + c5548cL1);
        }

        public VG2 b(Size size) {
            C5548cL1 c = c(size);
            C7433k41.a(C9972uP1.e, "Using supported quality of " + c + " for size " + size);
            if (c != C5548cL1.g) {
                VG2 e = e(c);
                if (e != null) {
                    return e;
                }
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
            }
            return null;
        }

        public C5548cL1 c(Size size) {
            Map.Entry<Size, C5548cL1> ceilingEntry = this.b.ceilingEntry(size);
            if (ceilingEntry != null) {
                return ceilingEntry.getValue();
            }
            Map.Entry<Size, C5548cL1> floorEntry = this.b.floorEntry(size);
            if (floorEntry != null) {
                return floorEntry.getValue();
            }
            return C5548cL1.g;
        }

        public final InterfaceC2426Ac0 d(C5548cL1 c5548cL1, InterfaceC11235zc0 interfaceC11235zc0) {
            C10907yF1.o(c5548cL1 instanceof C5548cL1.b, "Currently only support ConstantQuality");
            return interfaceC11235zc0.b(((C5548cL1.b) c5548cL1).d());
        }

        public VG2 e(C5548cL1 c5548cL1) {
            a(c5548cL1);
            if (c5548cL1 == C5548cL1.f) {
                return this.c;
            }
            if (c5548cL1 == C5548cL1.e) {
                return this.d;
            }
            return this.a.get(c5548cL1);
        }

        public List<C5548cL1> f() {
            return new ArrayList(this.a.keySet());
        }

        public boolean g(C5548cL1 c5548cL1) {
            a(c5548cL1);
            if (e(c5548cL1) != null) {
                return true;
            }
            return false;
        }

        public final VG2 h(InterfaceC2426Ac0 interfaceC2426Ac0) {
            if (interfaceC2426Ac0.b().isEmpty()) {
                return null;
            }
            return VG2.i(interfaceC2426Ac0);
        }
    }

    public C9972uP1(InterfaceC6918hx interfaceC6918hx, InterfaceC6490gB0<InterfaceC2426Ac0.c, InterfaceC2426Ac0.c> interfaceC6490gB0) {
        InterfaceC11235zc0 w = interfaceC6918hx.w();
        this.b = new C6531gL1(new YS1(n(interfaceC6918hx) ? new C2457Ak(w, interfaceC6490gB0) : w, interfaceC6918hx.m()), interfaceC6918hx, V20.c());
        for (N80 n80 : interfaceC6918hx.a()) {
            a aVar = new a(new Q80(this.b, n80));
            if (!aVar.f().isEmpty()) {
                this.c.put(n80, aVar);
            }
        }
    }

    public static boolean g(N80 n80, N80 n802) {
        C10907yF1.o(m(n802), "Fully specified range is not actually fully specified.");
        if (n80.a() == 0 || n80.a() == n802.a()) {
            return true;
        }
        return false;
    }

    public static boolean h(N80 n80, N80 n802) {
        C10907yF1.o(m(n802), "Fully specified range is not actually fully specified.");
        int b = n80.b();
        if (b == 0) {
            return true;
        }
        int b2 = n802.b();
        if ((b == 2 && b2 != 1) || b == b2) {
            return true;
        }
        return false;
    }

    public static boolean i(N80 n80, Set<N80> set) {
        if (m(n80)) {
            return set.contains(n80);
        }
        for (N80 n802 : set) {
            if (g(n80, n802) && h(n80, n802)) {
                return true;
            }
        }
        return false;
    }

    public static C9972uP1 j(InterfaceC6420fx interfaceC6420fx) {
        return new C9972uP1((InterfaceC6918hx) interfaceC6420fx, C2457Ak.e);
    }

    public static boolean m(N80 n80) {
        if (n80.b() != 0 && n80.b() != 2 && n80.a() != 0) {
            return true;
        }
        return false;
    }

    public static boolean n(InterfaceC6918hx interfaceC6918hx) {
        for (N80 n80 : interfaceC6918hx.a()) {
            Integer valueOf = Integer.valueOf(n80.b());
            int a2 = n80.a();
            if (valueOf.equals(3) && a2 == 10) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC7235jF2
    public Set<N80> a() {
        return this.c.keySet();
    }

    @Override // o.InterfaceC7235jF2
    public List<C5548cL1> b(N80 n80) {
        a l = l(n80);
        if (l == null) {
            return new ArrayList();
        }
        return l.f();
    }

    @Override // o.InterfaceC7235jF2
    public boolean c(C5548cL1 c5548cL1, N80 n80) {
        a l = l(n80);
        if (l != null && l.g(c5548cL1)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC7235jF2
    public VG2 d(C5548cL1 c5548cL1, N80 n80) {
        a l = l(n80);
        if (l == null) {
            return null;
        }
        return l.e(c5548cL1);
    }

    @Override // o.InterfaceC7235jF2
    public VG2 e(Size size, N80 n80) {
        a l = l(n80);
        if (l == null) {
            return null;
        }
        return l.b(size);
    }

    @Override // o.InterfaceC7235jF2
    public C5548cL1 f(Size size, N80 n80) {
        a l = l(n80);
        if (l == null) {
            return C5548cL1.g;
        }
        return l.c(size);
    }

    public final a k(N80 n80) {
        if (!i(n80, a())) {
            return null;
        }
        return new a(new Q80(this.b, n80));
    }

    public final a l(N80 n80) {
        if (m(n80)) {
            return this.c.get(n80);
        }
        if (this.d.containsKey(n80)) {
            return this.d.get(n80);
        }
        a k = k(n80);
        this.d.put(n80, k);
        return k;
    }
}
