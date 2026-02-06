package o;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.mc2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8068mc2 {
    public static final int k = -1;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final Integer f805o = 0;
    public VP a;
    public boolean b = true;
    public HashMap<Object, TP1> c = new HashMap<>();
    public HashMap<Object, C9210rH0> d = new HashMap<>();
    public HashMap<String, ArrayList<String>> e = new HashMap<>();
    public final QK f;
    public int g;
    public ArrayList<Object> h;
    public ArrayList<UK> i;
    public boolean j;

    /* renamed from: o.mc2$a */
    /* loaded from: classes.dex */
    public enum a {
        SPREAD,
        SPREAD_INSIDE,
        PACKED;
        
        public static Map<String, a> Y0 = new HashMap();
        public static Map<String, Integer> Z0 = new HashMap();

        static {
            a aVar;
            a aVar2;
            Y0.put("packed", aVar2);
            Y0.put("spread_inside", aVar);
            Y0.put("spread", r0);
            Z0.put("packed", 2);
            Z0.put("spread_inside", 1);
            Z0.put("spread", 0);
        }

        public static a g(String str) {
            if (Y0.containsKey(str)) {
                return Y0.get(str);
            }
            return null;
        }

        public static int h(String str) {
            if (Z0.containsKey(str)) {
                return Z0.get(str).intValue();
            }
            return -1;
        }
    }

    /* renamed from: o.mc2$b */
    /* loaded from: classes.dex */
    public enum b {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        TOP_TO_BASELINE,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BOTTOM_TO_BASELINE,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    /* renamed from: o.mc2$c */
    /* loaded from: classes.dex */
    public enum c {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    /* renamed from: o.mc2$d */
    /* loaded from: classes.dex */
    public enum d {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        HORIZONTAL_FLOW,
        VERTICAL_FLOW,
        GRID,
        ROW,
        COLUMN,
        FLOW
    }

    /* renamed from: o.mc2$e */
    /* loaded from: classes.dex */
    public enum e {
        NONE,
        CHAIN,
        ALIGNED;
        
        public static Map<String, e> Y0 = new HashMap();
        public static Map<String, Integer> Z0 = new HashMap();

        static {
            e eVar;
            e eVar2;
            Y0.put("none", r0);
            Y0.put("chain", eVar);
            Y0.put("aligned", eVar2);
            Z0.put("none", 0);
            Z0.put("chain", 3);
            Z0.put("aligned", 2);
        }

        public static e g(String str) {
            if (Y0.containsKey(str)) {
                return Y0.get(str);
            }
            return null;
        }

        public static int h(String str) {
            if (Z0.containsKey(str)) {
                return Z0.get(str).intValue();
            }
            return -1;
        }
    }

    public C8068mc2() {
        QK qk = new QK(this);
        this.f = qk;
        this.g = 0;
        this.h = new ArrayList<>();
        this.i = new ArrayList<>();
        this.j = true;
        Integer num = f805o;
        qk.c(num);
        this.c.put(num, qk);
    }

    public boolean A() {
        return !this.b;
    }

    public void B(Object obj, Object obj2) {
        QK f = f(obj);
        if (f != null) {
            f.z0(obj2);
        }
    }

    public TP1 C(Object obj) {
        return this.c.get(obj);
    }

    public void D() {
        for (Object obj : this.c.keySet()) {
            this.c.get(obj).a().R0();
        }
        this.c.clear();
        this.c.put(f805o, this.f);
        this.d.clear();
        this.e.clear();
        this.h.clear();
        this.j = true;
    }

    public boolean E(int i) {
        return this.f.G().t(i);
    }

    public boolean F(int i) {
        return this.f.Y().t(i);
    }

    public void G(VP vp) {
        this.a = vp;
    }

    public C8068mc2 H(C9640t30 c9640t30) {
        this.f.t0(c9640t30);
        return this;
    }

    @Deprecated
    public void I(boolean z) {
        this.b = z;
    }

    public void J(boolean z) {
        this.b = !z;
    }

    public void K(String str, String str2) {
        ArrayList<String> arrayList;
        QK f = f(str);
        if (f != null) {
            f.w0(str2);
            if (!this.e.containsKey(str2)) {
                arrayList = new ArrayList<>();
                this.e.put(str2, arrayList);
            } else {
                arrayList = this.e.get(str2);
            }
            arrayList.add(str);
        }
    }

    public C8068mc2 L(C9640t30 c9640t30) {
        this.f.A0(c9640t30);
        return this;
    }

    public C5768dF2 M() {
        return (C5768dF2) u(null, d.VERTICAL_CHAIN);
    }

    public C5768dF2 N(Object... objArr) {
        C5768dF2 c5768dF2 = (C5768dF2) u(null, d.VERTICAL_CHAIN);
        c5768dF2.P0(objArr);
        return c5768dF2;
    }

    public C10174vF0 O(Object obj) {
        return s(obj, 1);
    }

    public C8068mc2 P(C9640t30 c9640t30) {
        return L(c9640t30);
    }

    public void a(VK vk) {
        C9210rH0 c9210rH0;
        C9696tH0 R0;
        C9696tH0 R02;
        vk.q2();
        this.f.Y().j(this, vk, 0);
        this.f.G().j(this, vk, 1);
        for (Object obj : this.d.keySet()) {
            C9696tH0 R03 = this.d.get(obj).R0();
            if (R03 != null) {
                TP1 tp1 = this.c.get(obj);
                if (tp1 == null) {
                    tp1 = f(obj);
                }
                tp1.b(R03);
            }
        }
        for (Object obj2 : this.c.keySet()) {
            TP1 tp12 = this.c.get(obj2);
            if (tp12 != this.f && (tp12.d() instanceof C9210rH0) && (R02 = ((C9210rH0) tp12.d()).R0()) != null) {
                TP1 tp13 = this.c.get(obj2);
                if (tp13 == null) {
                    tp13 = f(obj2);
                }
                tp13.b(R02);
            }
        }
        for (Object obj3 : this.c.keySet()) {
            TP1 tp14 = this.c.get(obj3);
            if (tp14 != this.f) {
                UK a2 = tp14.a();
                a2.k1(tp14.getKey().toString());
                a2.T1(null);
                if (tp14.d() instanceof C10174vF0) {
                    tp14.apply();
                }
                vk.a(a2);
            } else {
                tp14.b(vk);
            }
        }
        for (Object obj4 : this.d.keySet()) {
            C9210rH0 c9210rH02 = this.d.get(obj4);
            if (c9210rH02.R0() != null) {
                Iterator<Object> it = c9210rH02.o0.iterator();
                while (it.hasNext()) {
                    c9210rH02.R0().a(this.c.get(it.next()).a());
                }
                c9210rH02.apply();
            } else {
                c9210rH02.apply();
            }
        }
        for (Object obj5 : this.c.keySet()) {
            TP1 tp15 = this.c.get(obj5);
            if (tp15 != this.f && (tp15.d() instanceof C9210rH0) && (R0 = (c9210rH0 = (C9210rH0) tp15.d()).R0()) != null) {
                Iterator<Object> it2 = c9210rH0.o0.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    TP1 tp16 = this.c.get(next);
                    if (tp16 != null) {
                        R0.a(tp16.a());
                    } else if (next instanceof TP1) {
                        R0.a(((TP1) next).a());
                    } else {
                        PrintStream printStream = System.out;
                        printStream.println("couldn't find reference for " + next);
                    }
                }
                tp15.apply();
            }
        }
        for (Object obj6 : this.c.keySet()) {
            TP1 tp17 = this.c.get(obj6);
            tp17.apply();
            UK a3 = tp17.a();
            if (a3 != null && obj6 != null) {
                a3.f625o = obj6.toString();
            }
        }
    }

    public C4521Vk b(Object obj, c cVar) {
        QK f = f(obj);
        if (f.d() == null || !(f.d() instanceof C4521Vk)) {
            C4521Vk c4521Vk = new C4521Vk(this);
            c4521Vk.U0(cVar);
            f.s0(c4521Vk);
        }
        return (C4521Vk) f.d();
    }

    public void c(Object obj) {
        this.h.add(obj);
        this.j = true;
    }

    public C8437o8 d(Object... objArr) {
        C8437o8 c8437o8 = (C8437o8) u(null, d.ALIGN_HORIZONTALLY);
        c8437o8.P0(objArr);
        return c8437o8;
    }

    public C8681p8 e(Object... objArr) {
        C8681p8 c8681p8 = (C8681p8) u(null, d.ALIGN_VERTICALLY);
        c8681p8.P0(objArr);
        return c8681p8;
    }

    public QK f(Object obj) {
        TP1 tp1 = this.c.get(obj);
        if (tp1 == null) {
            tp1 = h(obj);
            this.c.put(obj, tp1);
            tp1.c(obj);
        }
        if (tp1 instanceof QK) {
            return (QK) tp1;
        }
        return null;
    }

    public int g(Object obj) {
        if (obj instanceof Float) {
            return Math.round(((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public QK h(Object obj) {
        return new QK(this);
    }

    public final String i() {
        StringBuilder sb = new StringBuilder();
        sb.append("__HELPER_KEY_");
        int i = this.g;
        this.g = i + 1;
        sb.append(i);
        sb.append("__");
        return sb.toString();
    }

    public void j() {
        for (Object obj : this.c.keySet()) {
            QK f = f(obj);
            if (f != null) {
                f.z0(obj);
            }
        }
    }

    public VP k() {
        return this.a;
    }

    public C9854tw0 l(Object obj, boolean z) {
        C9854tw0 c9854tw0;
        QK f = f(obj);
        if (f.d() == null || !(f.d() instanceof C9854tw0)) {
            if (z) {
                c9854tw0 = new C9854tw0(this, d.VERTICAL_FLOW);
            } else {
                c9854tw0 = new C9854tw0(this, d.HORIZONTAL_FLOW);
            }
            f.s0(c9854tw0);
        }
        return (C9854tw0) f.d();
    }

    public RE0 m(Object obj, String str) {
        QK f = f(obj);
        if (f.d() == null || !(f.d() instanceof RE0)) {
            d dVar = d.GRID;
            if (str.charAt(0) == 'r') {
                dVar = d.ROW;
            } else if (str.charAt(0) == 'c') {
                dVar = d.COLUMN;
            }
            f.s0(new RE0(this, dVar));
        }
        return (RE0) f.d();
    }

    public C9854tw0 n() {
        return (C9854tw0) u(null, d.HORIZONTAL_FLOW);
    }

    public C9854tw0 o(Object... objArr) {
        C9854tw0 c9854tw0 = (C9854tw0) u(null, d.HORIZONTAL_FLOW);
        c9854tw0.P0(objArr);
        return c9854tw0;
    }

    public ArrayList<String> p(String str) {
        if (this.e.containsKey(str)) {
            return this.e.get(str);
        }
        return null;
    }

    public C9854tw0 q() {
        return (C9854tw0) u(null, d.VERTICAL_FLOW);
    }

    public C9854tw0 r(Object... objArr) {
        C9854tw0 c9854tw0 = (C9854tw0) u(null, d.VERTICAL_FLOW);
        c9854tw0.P0(objArr);
        return c9854tw0;
    }

    public C10174vF0 s(Object obj, int i) {
        QK f = f(obj);
        if (f.d() == null || !(f.d() instanceof C10174vF0)) {
            C10174vF0 c10174vF0 = new C10174vF0(this);
            c10174vF0.h(i);
            c10174vF0.c(obj);
            f.s0(c10174vF0);
        }
        return (C10174vF0) f.d();
    }

    public C8068mc2 t(C9640t30 c9640t30) {
        return H(c9640t30);
    }

    public C9210rH0 u(Object obj, d dVar) {
        if (obj == null) {
            obj = i();
        }
        C9210rH0 c9210rH0 = this.d.get(obj);
        if (c9210rH0 == null) {
            switch (dVar.ordinal()) {
                case 0:
                    c9210rH0 = new C7245jI0(this);
                    break;
                case 1:
                    c9210rH0 = new C5768dF2(this);
                    break;
                case 2:
                    c9210rH0 = new C8437o8(this);
                    break;
                case 3:
                    c9210rH0 = new C8681p8(this);
                    break;
                case 4:
                    c9210rH0 = new C4521Vk(this);
                    break;
                case 5:
                default:
                    c9210rH0 = new C9210rH0(this, dVar);
                    break;
                case 6:
                case 7:
                    c9210rH0 = new C9854tw0(this, dVar);
                    break;
                case 8:
                case 9:
                case 10:
                    c9210rH0 = new RE0(this, dVar);
                    break;
            }
            c9210rH0.c(obj);
            this.d.put(obj, c9210rH0);
        }
        return c9210rH0;
    }

    public C7245jI0 v() {
        return (C7245jI0) u(null, d.HORIZONTAL_CHAIN);
    }

    public C7245jI0 w(Object... objArr) {
        C7245jI0 c7245jI0 = (C7245jI0) u(null, d.HORIZONTAL_CHAIN);
        c7245jI0.P0(objArr);
        return c7245jI0;
    }

    public C10174vF0 x(Object obj) {
        return s(obj, 0);
    }

    public boolean y(UK uk) {
        if (this.j) {
            this.i.clear();
            Iterator<Object> it = this.h.iterator();
            while (it.hasNext()) {
                UK a2 = this.c.get(it.next()).a();
                if (a2 != null) {
                    this.i.add(a2);
                }
            }
            this.j = false;
        }
        return this.i.contains(uk);
    }

    @Deprecated
    public boolean z() {
        return this.b;
    }
}
