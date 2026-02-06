package o;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o.AbstractC4253Sp2;
import o.C8068mc2;
import o.InterfaceC8148mw2;

/* loaded from: classes.dex */
public class SK {
    public static final boolean a = false;

    /* loaded from: classes.dex */
    public static class a {
        public String a;
        public String b;
        public HashMap<String, String> c;

        public a(String str, String str2, HashMap<String, String> hashMap) {
            this.a = str;
            this.b = str2;
            this.c = hashMap;
        }

        public String a() {
            return this.a;
        }

        public HashMap<String, String> b() {
            return this.c;
        }

        public String c() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements c {
        public float a;
        public float b;
        public float c;
        public String e;
        public String f;
        public float h;
        public float i;
        public boolean d = false;
        public float g = 0.0f;

        public b(float f, float f2, float f3, String str, String str2) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.e = str == null ? "" : str;
            this.f = str2 == null ? "" : str2;
            this.i = f2;
            this.h = f;
        }

        public ArrayList<String> a() {
            ArrayList<String> arrayList = new ArrayList<>();
            int i = (int) this.h;
            int i2 = (int) this.i;
            int i3 = i;
            while (i <= i2) {
                arrayList.add(this.e + i3 + this.f);
                i3 += (int) this.c;
                i++;
            }
            return arrayList;
        }

        @Override // o.SK.c
        public float value() {
            float f = this.g;
            if (f >= this.i) {
                this.d = true;
            }
            if (!this.d) {
                this.g = f + this.c;
            }
            return this.g;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        float value();
    }

    /* loaded from: classes.dex */
    public static class d implements c {
        public float a;
        public float b;
        public float c;
        public boolean d = false;

        public d(float f, float f2) {
            this.a = f;
            this.b = f2;
            this.c = f;
        }

        @Override // o.SK.c
        public float value() {
            if (!this.d) {
                this.c += this.b;
            }
            return this.c;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public HashMap<String, Integer> a = new HashMap<>();
        public HashMap<String, c> b = new HashMap<>();
        public HashMap<String, ArrayList<String>> c = new HashMap<>();

        public float a(Object obj) {
            if (obj instanceof C3382Js) {
                String f = ((C3382Js) obj).f();
                if (this.b.containsKey(f)) {
                    return this.b.get(f).value();
                }
                if (this.a.containsKey(f)) {
                    return this.a.get(f).floatValue();
                }
                return 0.0f;
            } else if (obj instanceof C2990Fs) {
                return ((C2990Fs) obj).k();
            } else {
                return 0.0f;
            }
        }

        public ArrayList<String> b(String str) {
            if (this.c.containsKey(str)) {
                return this.c.get(str);
            }
            return null;
        }

        public void c(String str, float f, float f2) {
            if (this.b.containsKey(str) && (this.b.get(str) instanceof g)) {
                return;
            }
            this.b.put(str, new d(f, f2));
        }

        public void d(String str, float f, float f2, float f3, String str2, String str3) {
            if (this.b.containsKey(str) && (this.b.get(str) instanceof g)) {
                return;
            }
            b bVar = new b(f, f2, f3, str2, str3);
            this.b.put(str, bVar);
            this.c.put(str, bVar.a());
        }

        public void e(String str, int i) {
            this.a.put(str, Integer.valueOf(i));
        }

        public void f(String str, ArrayList<String> arrayList) {
            this.c.put(str, arrayList);
        }

        public void g(String str, float f) {
            this.b.put(str, new g(f));
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        NONE,
        SHOW_ALL,
        UNKNOWN
    }

    /* loaded from: classes.dex */
    public static class g implements c {
        public float a;

        public g(float f) {
            this.a = f;
        }

        @Override // o.SK.c
        public float value() {
            return this.a;
        }
    }

    public static void A(C8068mc2 c8068mc2, e eVar, C3088Gs c3088Gs) throws C3284Is {
        ArrayList<String> C0 = c3088Gs.C0();
        if (C0 != null) {
            Iterator<String> it = C0.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C2783Ds b0 = c3088Gs.b0(next);
                if (b0 instanceof C2990Fs) {
                    eVar.e(next, b0.l());
                } else if (b0 instanceof C3088Gs) {
                    C3088Gs c3088Gs2 = (C3088Gs) b0;
                    if (c3088Gs2.z0("from") && c3088Gs2.z0("to")) {
                        eVar.d(next, eVar.a(c3088Gs2.b0("from")), eVar.a(c3088Gs2.b0("to")), 1.0f, c3088Gs2.y0("prefix"), c3088Gs2.y0("postfix"));
                    } else if (c3088Gs2.z0("from") && c3088Gs2.z0("step")) {
                        eVar.c(next, eVar.a(c3088Gs2.b0("from")), eVar.a(c3088Gs2.b0("step")));
                    } else if (c3088Gs2.z0("ids")) {
                        C2587Bs f0 = c3088Gs2.f0("ids");
                        ArrayList<String> arrayList = new ArrayList<>();
                        for (int i = 0; i < f0.size(); i++) {
                            arrayList.add(f0.v0(i));
                        }
                        eVar.f(next, arrayList);
                    } else if (c3088Gs2.z0("tag")) {
                        eVar.f(next, c8068mc2.p(c3088Gs2.w0("tag")));
                    }
                }
            }
        }
    }

    public static void B(C8068mc2 c8068mc2, e eVar, String str, C3088Gs c3088Gs) throws C3284Is {
        C(c8068mc2, eVar, c8068mc2.f(str), c3088Gs);
    }

    public static void C(C8068mc2 c8068mc2, e eVar, QK qk, C3088Gs c3088Gs) throws C3284Is {
        if (qk.Y() == null) {
            qk.A0(C9640t30.s());
        }
        if (qk.G() == null) {
            qk.t0(C9640t30.s());
        }
        ArrayList<String> C0 = c3088Gs.C0();
        if (C0 != null) {
            Iterator<String> it = C0.iterator();
            while (it.hasNext()) {
                a(c8068mc2, eVar, qk, c3088Gs, it.next());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bc, code lost:
        if (r3.equals("hChain") == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void D(C3088Gs c3088Gs, C8068mc2 c8068mc2, e eVar) throws C3284Is {
        boolean z;
        ArrayList<String> C0 = c3088Gs.C0();
        if (C0 != null) {
            Iterator<String> it = C0.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C2783Ds b0 = c3088Gs.b0(next);
                next.getClass();
                char c2 = 2;
                switch (next.hashCode()) {
                    case -1824489883:
                        if (next.equals("Helpers")) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    case 1875016085:
                        if (next.equals("Generate")) {
                            z = true;
                            break;
                        }
                        z = true;
                        break;
                    case 1921490263:
                        if (next.equals("Variables")) {
                            z = true;
                            break;
                        }
                        z = true;
                        break;
                    default:
                        z = true;
                        break;
                }
                switch (z) {
                    case false:
                        if (!(b0 instanceof C2587Bs)) {
                            break;
                        } else {
                            u(c8068mc2, eVar, (C2587Bs) b0);
                            break;
                        }
                    case true:
                        if (!(b0 instanceof C3088Gs)) {
                            break;
                        } else {
                            p(c8068mc2, eVar, (C3088Gs) b0);
                            break;
                        }
                    case true:
                        if (!(b0 instanceof C3088Gs)) {
                            break;
                        } else {
                            A(c8068mc2, eVar, (C3088Gs) b0);
                            break;
                        }
                    default:
                        if (b0 instanceof C3088Gs) {
                            C3088Gs c3088Gs2 = (C3088Gs) b0;
                            String c3 = c(c3088Gs2);
                            if (c3 != null) {
                                switch (c3.hashCode()) {
                                    case -1785507558:
                                        if (c3.equals("vGuideline")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -1354837162:
                                        if (c3.equals("column")) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -1252464839:
                                        break;
                                    case -851656725:
                                        if (c3.equals("vChain")) {
                                            c2 = 3;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -333143113:
                                        if (c3.equals("barrier")) {
                                            c2 = 4;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 113114:
                                        if (c3.equals("row")) {
                                            c2 = 5;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 3181382:
                                        if (c3.equals("grid")) {
                                            c2 = 6;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 98238902:
                                        if (c3.equals("hFlow")) {
                                            c2 = 7;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 111168196:
                                        if (c3.equals("vFlow")) {
                                            c2 = '\b';
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 965681512:
                                        if (c3.equals("hGuideline")) {
                                            c2 = '\t';
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    default:
                                        c2 = 65535;
                                        break;
                                }
                                switch (c2) {
                                    case 0:
                                        s(1, c8068mc2, next, c3088Gs2);
                                        continue;
                                    case 1:
                                    case 5:
                                    case 6:
                                        q(c3, c8068mc2, next, eVar, c3088Gs2);
                                        continue;
                                    case 2:
                                    case 3:
                                        g(c3, c8068mc2, next, eVar, c3088Gs2);
                                        continue;
                                    case 4:
                                        e(c8068mc2, next, c3088Gs2);
                                        continue;
                                    case 7:
                                    case '\b':
                                        o(c3, c8068mc2, next, eVar, c3088Gs2);
                                        continue;
                                    case '\t':
                                        s(0, c8068mc2, next, c3088Gs2);
                                        continue;
                                }
                            } else {
                                B(c8068mc2, eVar, next, c3088Gs2);
                                break;
                            }
                        } else if (!(b0 instanceof C2990Fs)) {
                            break;
                        } else {
                            eVar.e(next, b0.l());
                            break;
                        }
                }
            }
        }
    }

    public static float E(C8068mc2 c8068mc2, float f2) {
        return c8068mc2.k().a(f2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0168, code lost:
        if (r8.equals("visible") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(C8068mc2 c8068mc2, e eVar, QK qk, C3088Gs c3088Gs, String str) throws C3284Is {
        char c2;
        QK f2;
        str.getClass();
        char c3 = 2;
        switch (str.hashCode()) {
            case -1448775240:
                if (str.equals("centerVertically")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1364013995:
                if (str.equals(C5445bv2.m0)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1068318794:
                if (str.equals("motion")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c2 = C8206nB.d;
                    break;
                }
                c2 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -247669061:
                if (str.equals("hRtlBias")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -61505906:
                if (str.equals("vWeight")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 98116417:
                if (str.equals("hBias")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 111045711:
                if (str.equals("vBias")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 113126854:
                if (str.equals("width")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 398344448:
                if (str.equals("hWeight")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 1404070310:
                if (str.equals("centerHorizontally")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                String w0 = c3088Gs.w0(str);
                boolean equals = w0.equals(androidx.constraintlayout.widget.e.W1);
                Object obj = w0;
                if (equals) {
                    obj = C8068mc2.f805o;
                }
                QK f3 = c8068mc2.f(obj);
                qk.H0(f3);
                qk.q(f3);
                return;
            case 1:
                String w02 = c3088Gs.w0(str);
                if (w02.equals(androidx.constraintlayout.widget.e.W1)) {
                    f2 = c8068mc2.f(C8068mc2.f805o);
                } else {
                    f2 = c8068mc2.f(w02);
                }
                qk.D0(f2);
                qk.C(f2);
                qk.H0(f2);
                qk.q(f2);
                return;
            case 2:
                k(c3088Gs, qk, str);
                return;
            case 3:
                qk.n0(eVar.a(c3088Gs.b0(str)));
                return;
            case 4:
                qk.o0(eVar.a(c3088Gs.b0(str)));
                return;
            case 5:
                qk.p0(eVar.a(c3088Gs.b0(str)));
                return;
            case 6:
                qk.I0(E(c8068mc2, eVar.a(c3088Gs.b0(str))));
                return;
            case 7:
                qk.J0(E(c8068mc2, eVar.a(c3088Gs.b0(str))));
                return;
            case '\b':
                qk.K0(E(c8068mc2, eVar.a(c3088Gs.b0(str))));
                return;
            case '\t':
                qk.t0(m(c3088Gs, str, c8068mc2, c8068mc2.k()));
                return;
            case '\n':
                x(c3088Gs.b0(str), qk);
                return;
            case 11:
                qk.i0(eVar.a(c3088Gs.b0(str)));
                return;
            case '\f':
                qk.j0(eVar.a(c3088Gs.b0(str)));
                return;
            case '\r':
                qk.q0(eVar.a(c3088Gs.b0(str)));
                return;
            case 14:
                qk.r0(eVar.a(c3088Gs.b0(str)));
                return;
            case 15:
                float a2 = eVar.a(c3088Gs.b0(str));
                if (c8068mc2.A()) {
                    a2 = 1.0f - a2;
                }
                qk.a0(a2);
                return;
            case 16:
                qk.y0(eVar.a(c3088Gs.b0(str)));
                return;
            case 17:
                qk.g(eVar.a(c3088Gs.b0(str)));
                return;
            case 18:
                qk.a0(eVar.a(c3088Gs.b0(str)));
                return;
            case 19:
                qk.M0(eVar.a(c3088Gs.b0(str)));
                return;
            case 20:
                qk.A0(m(c3088Gs, str, c8068mc2, c8068mc2.k()));
                return;
            case 21:
                qk.v0(eVar.a(c3088Gs.b0(str)));
                return;
            case 22:
                String w03 = c3088Gs.w0(str);
                boolean equals2 = w03.equals(androidx.constraintlayout.widget.e.W1);
                Object obj2 = w03;
                if (equals2) {
                    obj2 = C8068mc2.f805o;
                }
                QK f4 = c8068mc2.f(obj2);
                qk.D0(f4);
                qk.C(f4);
                return;
            case 23:
                String w04 = c3088Gs.w0(str);
                w04.getClass();
                switch (w04.hashCode()) {
                    case -1901805651:
                        if (w04.equals("invisible")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 3178655:
                        if (w04.equals("gone")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 466743410:
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                        qk.N0(4);
                        qk.g(0.0f);
                        return;
                    case 1:
                        qk.N0(8);
                        return;
                    case 2:
                        qk.N0(0);
                        return;
                    default:
                        return;
                }
            default:
                i(c8068mc2, eVar, c3088Gs, qk, str);
                return;
        }
    }

    public static int b(String str, String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static String c(C3088Gs c3088Gs) throws C3284Is {
        Iterator<String> it = c3088Gs.C0().iterator();
        while (it.hasNext()) {
            if (it.next().equals("type")) {
                return c3088Gs.w0("type");
            }
        }
        return null;
    }

    public static void d(C3088Gs c3088Gs, String str, C3088Gs c3088Gs2) throws C3284Is {
        if (!c3088Gs.z0(str)) {
            c3088Gs.F0(str, c3088Gs2);
            return;
        }
        C3088Gs r0 = c3088Gs.r0(str);
        Iterator<String> it = c3088Gs2.C0().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!next.equals("clear")) {
                r0.F0(next, c3088Gs2.b0(next));
            } else {
                C2587Bs f0 = c3088Gs2.f0("clear");
                for (int i = 0; i < f0.size(); i++) {
                    String x0 = f0.x0(i);
                    if (x0 != null) {
                        char c2 = 65535;
                        switch (x0.hashCode()) {
                            case -1727069561:
                                if (x0.equals("transforms")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case -1606703562:
                                if (x0.equals("constraints")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 414334925:
                                if (x0.equals("dimensions")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c2) {
                            case 0:
                                r0.K0("visibility");
                                r0.K0("alpha");
                                r0.K0("pivotX");
                                r0.K0("pivotY");
                                r0.K0("rotationX");
                                r0.K0("rotationY");
                                r0.K0("rotationZ");
                                r0.K0("scaleX");
                                r0.K0("scaleY");
                                r0.K0("translationX");
                                r0.K0("translationY");
                                break;
                            case 1:
                                r0.K0("start");
                                r0.K0("end");
                                r0.K0(C9698tH2.l);
                                r0.K0("bottom");
                                r0.K0("baseline");
                                r0.K0(C5445bv2.m0);
                                r0.K0("centerHorizontally");
                                r0.K0("centerVertically");
                                break;
                            case 2:
                                r0.K0("width");
                                r0.K0("height");
                                break;
                            default:
                                r0.K0(x0);
                                break;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00af, code lost:
        if (r2.equals(o.C9698tH2.l) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(C8068mc2 c8068mc2, String str, C3088Gs c3088Gs) throws C3284Is {
        boolean z;
        boolean A = c8068mc2.A();
        C4521Vk b2 = c8068mc2.b(str, C8068mc2.c.END);
        ArrayList<String> C0 = c3088Gs.C0();
        if (C0 != null) {
            Iterator<String> it = C0.iterator();
            while (it.hasNext()) {
                String next = it.next();
                next.getClass();
                char c2 = 2;
                switch (next.hashCode()) {
                    case -1081309778:
                        if (next.equals("margin")) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    case -962590849:
                        if (next.equals("direction")) {
                            z = true;
                            break;
                        }
                        z = true;
                        break;
                    case -567445985:
                        if (next.equals("contains")) {
                            z = true;
                            break;
                        }
                        z = true;
                        break;
                    default:
                        z = true;
                        break;
                }
                switch (z) {
                    case false:
                        float m0 = c3088Gs.m0(next);
                        if (Float.isNaN(m0)) {
                            break;
                        } else {
                            b2.f0(Float.valueOf(E(c8068mc2, m0)));
                            break;
                        }
                    case true:
                        String w0 = c3088Gs.w0(next);
                        w0.getClass();
                        switch (w0.hashCode()) {
                            case -1383228885:
                                if (w0.equals("bottom")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 100571:
                                if (w0.equals("end")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 115029:
                                break;
                            case 3317767:
                                if (w0.equals("left")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 108511772:
                                if (w0.equals(C5445bv2.n0)) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 109757538:
                                if (w0.equals("start")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                b2.U0(C8068mc2.c.BOTTOM);
                                continue;
                            case 1:
                                if (!A) {
                                    b2.U0(C8068mc2.c.RIGHT);
                                    break;
                                } else {
                                    b2.U0(C8068mc2.c.LEFT);
                                    continue;
                                }
                            case 2:
                                b2.U0(C8068mc2.c.TOP);
                                continue;
                            case 3:
                                b2.U0(C8068mc2.c.LEFT);
                                continue;
                            case 4:
                                b2.U0(C8068mc2.c.RIGHT);
                                continue;
                            case 5:
                                if (!A) {
                                    b2.U0(C8068mc2.c.LEFT);
                                    break;
                                } else {
                                    b2.U0(C8068mc2.c.RIGHT);
                                    continue;
                                }
                        }
                    case true:
                        C2587Bs j0 = c3088Gs.j0(next);
                        if (j0 != null) {
                            for (int i = 0; i < j0.size(); i++) {
                                b2.P0(c8068mc2.f(j0.Y(i).f()));
                            }
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(int i, C8068mc2 c8068mc2, e eVar, C2587Bs c2587Bs) throws C3284Is {
        C4575Vz M;
        String f2;
        if (i == 0) {
            M = c8068mc2.v();
        } else {
            M = c8068mc2.M();
        }
        C2783Ds Y = c2587Bs.Y(1);
        if (Y instanceof C2587Bs) {
            C2587Bs c2587Bs2 = (C2587Bs) Y;
            if (c2587Bs2.size() >= 1) {
                for (int i2 = 0; i2 < c2587Bs2.size(); i2++) {
                    M.P0(c2587Bs2.v0(i2));
                }
                if (c2587Bs.size() > 2) {
                    C2783Ds Y2 = c2587Bs.Y(2);
                    if (Y2 instanceof C3088Gs) {
                        C3088Gs c3088Gs = (C3088Gs) Y2;
                        Iterator<String> it = c3088Gs.C0().iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            next.getClass();
                            if (!next.equals("style")) {
                                i(c8068mc2, eVar, c3088Gs, M, next);
                            } else {
                                C2783Ds b0 = c3088Gs.b0(next);
                                if (b0 instanceof C2587Bs) {
                                    C2587Bs c2587Bs3 = (C2587Bs) b0;
                                    if (c2587Bs3.size() > 1) {
                                        f2 = c2587Bs3.v0(0);
                                        M.n(c2587Bs3.getFloat(1));
                                        f2.getClass();
                                        if (f2.equals("packed")) {
                                            if (!f2.equals("spread_inside")) {
                                                M.e1(C8068mc2.a.SPREAD);
                                            } else {
                                                M.e1(C8068mc2.a.SPREAD_INSIDE);
                                            }
                                        } else {
                                            M.e1(C8068mc2.a.PACKED);
                                        }
                                    }
                                }
                                f2 = b0.f();
                                f2.getClass();
                                if (f2.equals("packed")) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(String str, C8068mc2 c8068mc2, String str2, e eVar, C3088Gs c3088Gs) throws C3284Is {
        C4575Vz M;
        int i;
        C2587Bs c2587Bs;
        int i2;
        int i3;
        float f2;
        String str3;
        float f3;
        float f4;
        float f5;
        float f6;
        String f7;
        int i4 = 0;
        if (str.charAt(0) == 'h') {
            M = c8068mc2.v();
        } else {
            M = c8068mc2.M();
        }
        C4575Vz c4575Vz = M;
        c4575Vz.c(str2);
        Iterator<String> it = c3088Gs.C0().iterator();
        while (it.hasNext()) {
            String next = it.next();
            next.getClass();
            int i5 = 6;
            int i6 = 3;
            int i7 = 2;
            int i8 = 1;
            int i9 = -1;
            switch (next.hashCode()) {
                case -1383228885:
                    if (next.equals("bottom")) {
                        i9 = i4;
                        break;
                    }
                    break;
                case -567445985:
                    if (next.equals("contains")) {
                        i9 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (next.equals("end")) {
                        i9 = 2;
                        break;
                    }
                    break;
                case 115029:
                    if (next.equals(C9698tH2.l)) {
                        i9 = 3;
                        break;
                    }
                    break;
                case 3317767:
                    if (next.equals("left")) {
                        i9 = 4;
                        break;
                    }
                    break;
                case 108511772:
                    if (next.equals(C5445bv2.n0)) {
                        i9 = 5;
                        break;
                    }
                    break;
                case 109757538:
                    if (next.equals("start")) {
                        i9 = 6;
                        break;
                    }
                    break;
                case 109780401:
                    if (next.equals("style")) {
                        i9 = 7;
                        break;
                    }
                    break;
            }
            switch (i9) {
                case 0:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    i(c8068mc2, eVar, c3088Gs, c4575Vz, next);
                    continue;
                    i4 = 0;
                case 1:
                    C2783Ds b0 = c3088Gs.b0(next);
                    if (b0 instanceof C2587Bs) {
                        C2587Bs c2587Bs2 = (C2587Bs) b0;
                        if (c2587Bs2.size() >= 1) {
                            int i10 = i4;
                            while (i10 < c2587Bs2.size()) {
                                C2783Ds Y = c2587Bs2.Y(i10);
                                if (Y instanceof C2587Bs) {
                                    C2587Bs c2587Bs3 = (C2587Bs) Y;
                                    if (c2587Bs3.size() > 0) {
                                        String f8 = c2587Bs3.Y(i4).f();
                                        int size = c2587Bs3.size();
                                        if (size != i7) {
                                            if (size != i6) {
                                                if (size != 4) {
                                                    if (size != i5) {
                                                        i = i10;
                                                        c2587Bs = c2587Bs2;
                                                        i3 = i8;
                                                        str3 = f8;
                                                        f2 = Float.NaN;
                                                        f3 = Float.NaN;
                                                    } else {
                                                        float f9 = c2587Bs3.getFloat(i8);
                                                        float E = E(c8068mc2, c2587Bs3.getFloat(i7));
                                                        float E2 = E(c8068mc2, c2587Bs3.getFloat(i6));
                                                        float E3 = E(c8068mc2, c2587Bs3.getFloat(4));
                                                        int i11 = i7;
                                                        f6 = E;
                                                        c2587Bs = c2587Bs2;
                                                        f2 = f9;
                                                        i2 = i11;
                                                        i3 = i8;
                                                        f3 = E2;
                                                        i = i10;
                                                        str3 = f8;
                                                        f4 = E(c8068mc2, c2587Bs3.getFloat(5));
                                                        f5 = E3;
                                                        i6 = 3;
                                                    }
                                                } else {
                                                    float f10 = c2587Bs3.getFloat(i8);
                                                    float E4 = E(c8068mc2, c2587Bs3.getFloat(i7));
                                                    i6 = 3;
                                                    C2587Bs c2587Bs4 = c2587Bs2;
                                                    f2 = f10;
                                                    c2587Bs = c2587Bs4;
                                                    i3 = i8;
                                                    f3 = E(c8068mc2, c2587Bs3.getFloat(3));
                                                    f5 = Float.NaN;
                                                    i2 = i7;
                                                    f6 = E4;
                                                    i = i10;
                                                    str3 = f8;
                                                    f4 = Float.NaN;
                                                }
                                            } else {
                                                C2587Bs c2587Bs5 = c2587Bs2;
                                                f2 = c2587Bs3.getFloat(i8);
                                                c2587Bs = c2587Bs5;
                                                i = i10;
                                                i3 = i8;
                                                f3 = E(c8068mc2, c2587Bs3.getFloat(i7));
                                                str3 = f8;
                                                f4 = Float.NaN;
                                                i2 = i7;
                                                f6 = f3;
                                                f5 = Float.NaN;
                                            }
                                            c4575Vz.U0(str3, f2, f6, f3, f5, f4);
                                        } else {
                                            float f11 = c2587Bs3.getFloat(i8);
                                            C2587Bs c2587Bs6 = c2587Bs2;
                                            f2 = f11;
                                            c2587Bs = c2587Bs6;
                                            i = i10;
                                            i3 = i8;
                                            str3 = f8;
                                            f3 = Float.NaN;
                                        }
                                        f5 = f3;
                                        f4 = f5;
                                        i2 = i7;
                                        f6 = f4;
                                        c4575Vz.U0(str3, f2, f6, f3, f5, f4);
                                    } else {
                                        i = i10;
                                        c2587Bs = c2587Bs2;
                                        i2 = i7;
                                        i3 = i8;
                                    }
                                } else {
                                    i = i10;
                                    c2587Bs = c2587Bs2;
                                    i2 = i7;
                                    i3 = i8;
                                    c4575Vz.P0(Y.f());
                                }
                                i10 = i + 1;
                                c2587Bs2 = c2587Bs;
                                i7 = i2;
                                i8 = i3;
                                i4 = 0;
                                i5 = 6;
                            }
                            break;
                        }
                    }
                    System.err.println(str2 + " contains should be an array \"" + b0.f() + AbstractC4253Sp2.b.x1);
                    return;
                case 7:
                    C2783Ds b02 = c3088Gs.b0(next);
                    if (b02 instanceof C2587Bs) {
                        C2587Bs c2587Bs7 = (C2587Bs) b02;
                        if (c2587Bs7.size() > 1) {
                            f7 = c2587Bs7.v0(i4);
                            c4575Vz.n(c2587Bs7.getFloat(1));
                            f7.getClass();
                            if (f7.equals("packed")) {
                                if (!f7.equals("spread_inside")) {
                                    c4575Vz.e1(C8068mc2.a.SPREAD);
                                    break;
                                } else {
                                    c4575Vz.e1(C8068mc2.a.SPREAD_INSIDE);
                                    break;
                                }
                            } else {
                                c4575Vz.e1(C8068mc2.a.PACKED);
                                break;
                            }
                        }
                    }
                    f7 = b02.f();
                    f7.getClass();
                    if (f7.equals("packed")) {
                    }
            }
            i4 = 0;
        }
    }

    public static long h(String str) {
        if (str.startsWith("#")) {
            String substring = str.substring(1);
            if (substring.length() == 6) {
                substring = "FF" + substring;
            }
            return Long.parseLong(substring, 16);
        }
        return -1L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(C8068mc2 c8068mc2, e eVar, C3088Gs c3088Gs, QK qk, String str) throws C3284Is {
        QK f2;
        char c2;
        float f3;
        float f4;
        QK f5;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        boolean z;
        char c8;
        boolean z2;
        char c9;
        char c10;
        boolean A = c8068mc2.A();
        boolean z3 = !A;
        C2587Bs j0 = c3088Gs.j0(str);
        if (j0 != null && j0.size() > 1) {
            String v0 = j0.v0(0);
            String x0 = j0.x0(1);
            float f6 = 0.0f;
            if (j0.size() > 2) {
                f3 = E(c8068mc2, eVar.a(j0.t0(2)));
            } else {
                f3 = 0.0f;
            }
            if (j0.size() > 3) {
                f4 = E(c8068mc2, eVar.a(j0.t0(3)));
            } else {
                f4 = 0.0f;
            }
            if (v0.equals(androidx.constraintlayout.widget.e.W1)) {
                f5 = c8068mc2.f(C8068mc2.f805o);
            } else {
                f5 = c8068mc2.f(v0);
            }
            str.getClass();
            float f7 = f3;
            switch (str.hashCode()) {
                case -1720785339:
                    if (str.equals("baseline")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1498085729:
                    if (str.equals("circular")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1383228885:
                    if (str.equals("bottom")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 100571:
                    if (str.equals("end")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 115029:
                    if (str.equals(C9698tH2.l)) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 108511772:
                    if (str.equals(C5445bv2.n0)) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    c4 = true;
                    c5 = 2;
                    x0.getClass();
                    switch (x0.hashCode()) {
                        case -1720785339:
                            if (x0.equals("baseline")) {
                                c6 = 0;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case -1383228885:
                            if (x0.equals("bottom")) {
                                c6 = 1;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 115029:
                            if (x0.equals(C9698tH2.l)) {
                                c6 = 2;
                                break;
                            }
                            c6 = 65535;
                            break;
                        default:
                            c6 = 65535;
                            break;
                    }
                    switch (c6) {
                        case 0:
                            c8068mc2.c(qk.getKey());
                            c8068mc2.c(f5.getKey());
                            qk.k(f5);
                            break;
                        case 1:
                            c8068mc2.c(qk.getKey());
                            qk.l(f5);
                            break;
                        case 2:
                            c8068mc2.c(qk.getKey());
                            qk.m(f5);
                            break;
                    }
                    z = c4;
                    z2 = false;
                    if (z2) {
                        x0.getClass();
                        switch (x0.hashCode()) {
                            case 100571:
                                if (x0.equals("end")) {
                                    c9 = 0;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            case 3317767:
                                if (x0.equals("left")) {
                                    c9 = c4;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            case 108511772:
                                if (x0.equals(C5445bv2.n0)) {
                                    c9 = c5;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            case 109757538:
                                if (x0.equals("start")) {
                                    c9 = 3;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            default:
                                c9 = 65535;
                                break;
                        }
                        switch (c9) {
                            case 0:
                                c10 = A;
                                break;
                            case 1:
                            default:
                                c10 = c4;
                                break;
                            case 2:
                                c10 = false;
                                break;
                            case 3:
                                c10 = z3;
                                break;
                        }
                        if (z) {
                            if (c10) {
                                qk.c0(f5);
                            } else {
                                qk.d0(f5);
                            }
                        } else if (c10) {
                            qk.l0(f5);
                        } else {
                            qk.m0(f5);
                        }
                    }
                    qk.f0(Float.valueOf(f7)).h0(Float.valueOf(f4));
                    return;
                case 1:
                    c4 = true;
                    float a2 = eVar.a(j0.Y(1));
                    c5 = 2;
                    if (j0.size() > 2) {
                        f6 = E(c8068mc2, eVar.a(j0.t0(2)));
                    }
                    qk.u(f5, a2, f6);
                    z = c4;
                    z2 = false;
                    if (z2) {
                    }
                    qk.f0(Float.valueOf(f7)).h0(Float.valueOf(f4));
                    return;
                case 2:
                    x0.getClass();
                    switch (x0.hashCode()) {
                        case -1720785339:
                            if (x0.equals("baseline")) {
                                c7 = 0;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -1383228885:
                            if (x0.equals("bottom")) {
                                c7 = 1;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 115029:
                            if (x0.equals(C9698tH2.l)) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        default:
                            c7 = 65535;
                            break;
                    }
                    switch (c7) {
                        case 0:
                            c8068mc2.c(f5.getKey());
                            qk.p(f5);
                            break;
                        case 1:
                            qk.q(f5);
                            break;
                        case 2:
                            qk.r(f5);
                            break;
                    }
                    c4 = true;
                    c5 = 2;
                    z = c4;
                    z2 = false;
                    if (z2) {
                    }
                    qk.f0(Float.valueOf(f7)).h0(Float.valueOf(f4));
                    return;
                case 3:
                    z = A;
                    c4 = true;
                    c5 = 2;
                    z2 = true;
                    if (z2) {
                    }
                    qk.f0(Float.valueOf(f7)).h0(Float.valueOf(f4));
                    return;
                case 4:
                    x0.getClass();
                    switch (x0.hashCode()) {
                        case -1720785339:
                            if (x0.equals("baseline")) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -1383228885:
                            if (x0.equals("bottom")) {
                                c8 = 1;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 115029:
                            if (x0.equals(C9698tH2.l)) {
                                c8 = 2;
                                break;
                            }
                            c8 = 65535;
                            break;
                        default:
                            c8 = 65535;
                            break;
                    }
                    switch (c8) {
                        case 0:
                            c8068mc2.c(f5.getKey());
                            qk.F0(f5);
                            break;
                        case 1:
                            qk.G0(f5);
                            break;
                        case 2:
                            qk.H0(f5);
                            break;
                    }
                    c4 = true;
                    c5 = 2;
                    z = c4;
                    z2 = false;
                    if (z2) {
                    }
                    qk.f0(Float.valueOf(f7)).h0(Float.valueOf(f4));
                    return;
                case 5:
                    z = true;
                    c4 = true;
                    c5 = 2;
                    z2 = true;
                    if (z2) {
                    }
                    qk.f0(Float.valueOf(f7)).h0(Float.valueOf(f4));
                    return;
                case 6:
                    z = false;
                    c4 = true;
                    c5 = 2;
                    z2 = true;
                    if (z2) {
                    }
                    qk.f0(Float.valueOf(f7)).h0(Float.valueOf(f4));
                    return;
                case 7:
                    z = z3;
                    c4 = true;
                    c5 = 2;
                    z2 = true;
                    if (z2) {
                    }
                    qk.f0(Float.valueOf(f7)).h0(Float.valueOf(f4));
                    return;
                default:
                    c4 = true;
                    c5 = 2;
                    z = c4;
                    z2 = false;
                    if (z2) {
                    }
                    qk.f0(Float.valueOf(f7)).h0(Float.valueOf(f4));
                    return;
            }
        }
        String y0 = c3088Gs.y0(str);
        if (y0 != null) {
            if (y0.equals(androidx.constraintlayout.widget.e.W1)) {
                f2 = c8068mc2.f(C8068mc2.f805o);
            } else {
                f2 = c8068mc2.f(y0);
            }
            str.getClass();
            switch (str.hashCode()) {
                case -1720785339:
                    if (str.equals("baseline")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1383228885:
                    if (str.equals("bottom")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100571:
                    if (str.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 115029:
                    if (str.equals(C9698tH2.l)) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    c8068mc2.c(qk.getKey());
                    c8068mc2.c(f2.getKey());
                    qk.k(f2);
                    return;
                case 1:
                    qk.q(f2);
                    return;
                case 2:
                    if (!A) {
                        qk.m0(f2);
                        return;
                    } else {
                        qk.c0(f2);
                        return;
                    }
                case 3:
                    qk.H0(f2);
                    return;
                case 4:
                    if (!A) {
                        qk.c0(f2);
                        return;
                    } else {
                        qk.m0(f2);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public static void j(TP tp, C3088Gs c3088Gs) throws C3284Is {
        ArrayList<String> C0 = c3088Gs.C0();
        if (C0 != null) {
            Iterator<String> it = C0.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C3088Gs r0 = c3088Gs.r0(next);
                String y0 = r0.y0("Extends");
                if (y0 != null && !y0.isEmpty()) {
                    String b2 = tp.b(y0);
                    if (b2 != null) {
                        C3088Gs d2 = C3186Hs.d(b2);
                        ArrayList<String> C02 = r0.C0();
                        if (C02 != null) {
                            Iterator<String> it2 = C02.iterator();
                            while (it2.hasNext()) {
                                String next2 = it2.next();
                                C2783Ds b0 = r0.b0(next2);
                                if (b0 instanceof C3088Gs) {
                                    d(d2, next2, (C3088Gs) b0);
                                }
                            }
                            tp.d(next, d2.Q());
                        }
                    }
                } else {
                    tp.d(next, r0.Q());
                }
            }
        }
    }

    public static void k(C3088Gs c3088Gs, QK qk, String str) throws C3284Is {
        ArrayList<String> C0;
        C3088Gs s0 = c3088Gs.s0(str);
        if (s0 != null && (C0 = s0.C0()) != null) {
            Iterator<String> it = C0.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C2783Ds b0 = s0.b0(next);
                if (b0 instanceof C2990Fs) {
                    qk.f(next, b0.k());
                } else if (b0 instanceof C3382Js) {
                    long h = h(b0.f());
                    if (h != -1) {
                        qk.e(next, (int) h);
                    }
                }
            }
        }
    }

    public static void l(String str, ArrayList<a> arrayList) throws C3284Is {
        C3088Gs d2 = C3186Hs.d(str);
        ArrayList<String> C0 = d2.C0();
        if (C0 != null && C0.size() > 0) {
            String str2 = C0.get(0);
            C2783Ds b0 = d2.b0(str2);
            str2.getClass();
            if (str2.equals("Design") && (b0 instanceof C3088Gs)) {
                C3088Gs c3088Gs = (C3088Gs) b0;
                ArrayList<String> C02 = c3088Gs.C0();
                for (int i = 0; i < C02.size(); i++) {
                    String str3 = C02.get(i);
                    C3088Gs c3088Gs2 = (C3088Gs) c3088Gs.b0(str3);
                    System.out.printf("element found " + str3 + "", new Object[0]);
                    String y0 = c3088Gs2.y0("type");
                    if (y0 != null) {
                        HashMap hashMap = new HashMap();
                        int size = c3088Gs2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            C2881Es c2881Es = (C2881Es) c3088Gs2.Y(i);
                            String f2 = c2881Es.f();
                            String f3 = c2881Es.O0().f();
                            if (f3 != null) {
                                hashMap.put(f2, f3);
                            }
                        }
                        arrayList.add(new a(str2, y0, hashMap));
                    }
                }
            }
        }
    }

    public static C9640t30 m(C3088Gs c3088Gs, String str, C8068mc2 c8068mc2, VP vp) throws C3284Is {
        C2783Ds b0 = c3088Gs.b0(str);
        C9640t30 k = C9640t30.k(0);
        if (b0 instanceof C3382Js) {
            return n(b0.f());
        }
        if (b0 instanceof C2990Fs) {
            return C9640t30.k(c8068mc2.g(Float.valueOf(vp.a(c3088Gs.l0(str)))));
        }
        if (b0 instanceof C3088Gs) {
            C3088Gs c3088Gs2 = (C3088Gs) b0;
            String y0 = c3088Gs2.y0("value");
            if (y0 != null) {
                k = n(y0);
            }
            C2783Ds u0 = c3088Gs2.u0("min");
            if (u0 != null) {
                if (u0 instanceof C2990Fs) {
                    k.z(c8068mc2.g(Float.valueOf(vp.a(((C2990Fs) u0).k()))));
                } else if (u0 instanceof C3382Js) {
                    k.A(C9640t30.j);
                }
            }
            C2783Ds u02 = c3088Gs2.u0("max");
            if (u02 != null) {
                if (u02 instanceof C2990Fs) {
                    k.x(c8068mc2.g(Float.valueOf(vp.a(((C2990Fs) u02).k()))));
                    return k;
                } else if (u02 instanceof C3382Js) {
                    k.y(C9640t30.j);
                }
            }
        }
        return k;
    }

    public static C9640t30 n(String str) {
        C9640t30 k = C9640t30.k(0);
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    c2 = 0;
                    break;
                }
                break;
            case -995424086:
                if (str.equals(androidx.constraintlayout.widget.e.W1)) {
                    c2 = 1;
                    break;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return C9640t30.r(C9640t30.j);
            case 1:
                return C9640t30.m();
            case 2:
                return C9640t30.r(C9640t30.k);
            case 3:
                return C9640t30.s();
            default:
                if (str.endsWith("%")) {
                    return C9640t30.n(0, Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f).E(0);
                }
                if (str.contains(":")) {
                    return C9640t30.o(str).F(C9640t30.k);
                }
                return k;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(10:57|(2:59|(9:61|(1:63)(1:75)|64|65|(1:67)|68|(1:70)|71|72))|76|64|65|(0)|68|(0)|71|72) */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0247 A[Catch: NumberFormatException -> 0x025d, TryCatch #1 {NumberFormatException -> 0x025d, blocks: (B:112:0x0238, B:114:0x0247, B:115:0x024e, B:117:0x0256, B:179:0x03b3, B:181:0x03c2, B:182:0x03c9, B:184:0x03d1), top: B:216:0x0238 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0256 A[Catch: NumberFormatException -> 0x025d, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x025d, blocks: (B:112:0x0238, B:114:0x0247, B:115:0x024e, B:117:0x0256, B:179:0x03b3, B:181:0x03c2, B:182:0x03c9, B:184:0x03d1), top: B:216:0x0238 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c2 A[Catch: NumberFormatException -> 0x025d, TryCatch #1 {NumberFormatException -> 0x025d, blocks: (B:112:0x0238, B:114:0x0247, B:115:0x024e, B:117:0x0256, B:179:0x03b3, B:181:0x03c2, B:182:0x03c9, B:184:0x03d1), top: B:216:0x0238 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03d1 A[Catch: NumberFormatException -> 0x025d, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x025d, blocks: (B:112:0x0238, B:114:0x0247, B:115:0x024e, B:117:0x0256, B:179:0x03b3, B:181:0x03c2, B:182:0x03c9, B:184:0x03d1), top: B:216:0x0238 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0429  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void o(String str, C8068mc2 c8068mc2, String str2, e eVar, C3088Gs c3088Gs) throws C3284Is {
        boolean z;
        int i;
        float f2;
        int i2;
        String f3;
        String str3;
        String str4;
        Float valueOf;
        Float f4;
        Float f5;
        String f6;
        String str5;
        String str6;
        float l;
        float f7;
        float f8;
        float f9;
        Float valueOf2;
        Float f10;
        Float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16 = 0.5f;
        Float valueOf3 = Float.valueOf(0.5f);
        int i3 = 0;
        if (str.charAt(0) == 'v') {
            z = true;
        } else {
            z = false;
        }
        C9854tw0 l2 = c8068mc2.l(str2, z);
        Iterator<String> it = c3088Gs.C0().iterator();
        while (it.hasNext()) {
            String next = it.next();
            next.getClass();
            int i4 = 4;
            char c2 = 65535;
            switch (next.hashCode()) {
                case -1254185091:
                    if (next.equals("hAlign")) {
                        i = i3;
                        break;
                    }
                    i = -1;
                    break;
                case -1237307863:
                    if (next.equals("hStyle")) {
                        i = 1;
                        break;
                    }
                    i = -1;
                    break;
                case -1198076529:
                    if (next.equals("hFlowBias")) {
                        i = 2;
                        break;
                    }
                    i = -1;
                    break;
                case -853376977:
                    if (next.equals("vAlign")) {
                        i = 3;
                        break;
                    }
                    i = -1;
                    break;
                case -836499749:
                    if (next.equals("vStyle")) {
                        i = 4;
                        break;
                    }
                    i = -1;
                    break;
                case -806339567:
                    if (next.equals("padding")) {
                        i = 5;
                        break;
                    }
                    i = -1;
                    break;
                case -732635235:
                    if (next.equals("vFlowBias")) {
                        i = 6;
                        break;
                    }
                    i = -1;
                    break;
                case -567445985:
                    if (next.equals("contains")) {
                        i = 7;
                        break;
                    }
                    i = -1;
                    break;
                case -488900360:
                    if (next.equals("maxElement")) {
                        i = 8;
                        break;
                    }
                    i = -1;
                    break;
                case 3169614:
                    if (next.equals("hGap")) {
                        i = 9;
                        break;
                    }
                    i = -1;
                    break;
                case 3575610:
                    if (next.equals("type")) {
                        i = 10;
                        break;
                    }
                    i = -1;
                    break;
                case 3586688:
                    if (next.equals("vGap")) {
                        i = 11;
                        break;
                    }
                    i = -1;
                    break;
                case 3657802:
                    if (next.equals("wrap")) {
                        i = 12;
                        break;
                    }
                    i = -1;
                    break;
                default:
                    i = -1;
                    break;
            }
            switch (i) {
                case 0:
                    f2 = f16;
                    String f17 = c3088Gs.b0(next).f();
                    f17.getClass();
                    if (!f17.equals("end")) {
                        if (!f17.equals("start")) {
                            l2.z1(2);
                            i2 = 0;
                            break;
                        } else {
                            i2 = 0;
                            l2.z1(0);
                            break;
                        }
                    } else {
                        i2 = 0;
                        l2.z1(1);
                        break;
                    }
                case 1:
                    f2 = f16;
                    C2783Ds b0 = c3088Gs.b0(next);
                    if (b0 instanceof C2587Bs) {
                        C2587Bs c2587Bs = (C2587Bs) b0;
                        if (c2587Bs.size() > 1) {
                            str3 = c2587Bs.v0(0);
                            f3 = c2587Bs.v0(1);
                            if (c2587Bs.size() <= 2) {
                                str4 = "";
                            } else {
                                str4 = c2587Bs.v0(2);
                            }
                            if (!f3.equals("")) {
                                l2.B1(C8068mc2.a.h(f3));
                            }
                            if (!str3.equals("")) {
                                l2.w1(C8068mc2.a.h(str3));
                            }
                            if (!str4.equals("")) {
                                l2.D1(C8068mc2.a.h(str4));
                            }
                            i2 = 0;
                            break;
                        }
                    }
                    f3 = b0.f();
                    str3 = "";
                    str4 = str3;
                    if (!f3.equals("")) {
                    }
                    if (!str3.equals("")) {
                    }
                    if (!str4.equals("")) {
                    }
                    i2 = 0;
                case 2:
                    f2 = f16;
                    C2783Ds b02 = c3088Gs.b0(next);
                    if (b02 instanceof C2587Bs) {
                        C2587Bs c2587Bs2 = (C2587Bs) b02;
                        if (c2587Bs2.size() > 1) {
                            f4 = Float.valueOf(c2587Bs2.getFloat(0));
                            valueOf = Float.valueOf(c2587Bs2.getFloat(1));
                            if (c2587Bs2.size() > 2) {
                                f5 = Float.valueOf(c2587Bs2.getFloat(2));
                            } else {
                                f5 = valueOf3;
                            }
                            l2.a0(valueOf.floatValue());
                            if (f4.floatValue() != f2) {
                                l2.v1(f4.floatValue());
                            }
                            if (f5.floatValue() != f2) {
                                l2.C1(f5.floatValue());
                            }
                            i2 = 0;
                            break;
                        }
                    }
                    valueOf = Float.valueOf(b02.k());
                    f4 = valueOf3;
                    f5 = f4;
                    l2.a0(valueOf.floatValue());
                    if (f4.floatValue() != f2) {
                    }
                    if (f5.floatValue() != f2) {
                    }
                    i2 = 0;
                case 3:
                    f2 = f16;
                    String f18 = c3088Gs.b0(next).f();
                    f18.getClass();
                    switch (f18.hashCode()) {
                        case -1720785339:
                            if (f18.equals("baseline")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -1383228885:
                            if (f18.equals("bottom")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 115029:
                            if (f18.equals(C9698tH2.l)) {
                                c2 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                            l2.M1(3);
                            break;
                        case 1:
                            l2.M1(1);
                            break;
                        case 2:
                            l2.M1(0);
                            break;
                        default:
                            l2.M1(2);
                            break;
                    }
                    i2 = 0;
                    break;
                case 4:
                    f2 = f16;
                    C2783Ds b03 = c3088Gs.b0(next);
                    if (b03 instanceof C2587Bs) {
                        C2587Bs c2587Bs3 = (C2587Bs) b03;
                        if (c2587Bs3.size() > 1) {
                            str5 = c2587Bs3.v0(0);
                            f6 = c2587Bs3.v0(1);
                            if (c2587Bs3.size() <= 2) {
                                str6 = "";
                            } else {
                                str6 = c2587Bs3.v0(2);
                            }
                            if (!f6.equals("")) {
                                l2.O1(C8068mc2.a.h(f6));
                            }
                            if (!str5.equals("")) {
                                l2.y1(C8068mc2.a.h(str5));
                            }
                            if (!str6.equals("")) {
                                l2.F1(C8068mc2.a.h(str6));
                            }
                            i2 = 0;
                            break;
                        }
                    }
                    f6 = b03.f();
                    str5 = "";
                    str6 = str5;
                    if (!f6.equals("")) {
                    }
                    if (!str5.equals("")) {
                    }
                    if (!str6.equals("")) {
                    }
                    i2 = 0;
                case 5:
                    f2 = f16;
                    C2783Ds b04 = c3088Gs.b0(next);
                    if (b04 instanceof C2587Bs) {
                        C2587Bs c2587Bs4 = (C2587Bs) b04;
                        if (c2587Bs4.size() > 1) {
                            l = c2587Bs4.getInt(0);
                            f9 = c2587Bs4.getInt(1);
                            if (c2587Bs4.size() > 2) {
                                f8 = c2587Bs4.getInt(2);
                                try {
                                    f7 = ((C2587Bs) b04).getInt(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    f7 = 0.0f;
                                }
                            } else {
                                f8 = l;
                                f7 = f9;
                            }
                            l2.J1(Math.round(E(c8068mc2, l)));
                            l2.L1(Math.round(E(c8068mc2, f9)));
                            l2.K1(Math.round(E(c8068mc2, f8)));
                            l2.I1(Math.round(E(c8068mc2, f7)));
                            i2 = 0;
                            break;
                        }
                    }
                    l = b04.l();
                    f7 = l;
                    f8 = f7;
                    f9 = f8;
                    l2.J1(Math.round(E(c8068mc2, l)));
                    l2.L1(Math.round(E(c8068mc2, f9)));
                    l2.K1(Math.round(E(c8068mc2, f8)));
                    l2.I1(Math.round(E(c8068mc2, f7)));
                    i2 = 0;
                case 6:
                    f2 = f16;
                    C2783Ds b05 = c3088Gs.b0(next);
                    if (b05 instanceof C2587Bs) {
                        C2587Bs c2587Bs5 = (C2587Bs) b05;
                        if (c2587Bs5.size() > 1) {
                            f10 = Float.valueOf(c2587Bs5.getFloat(0));
                            valueOf2 = Float.valueOf(c2587Bs5.getFloat(1));
                            if (c2587Bs5.size() > 2) {
                                f11 = Float.valueOf(c2587Bs5.getFloat(2));
                            } else {
                                f11 = valueOf3;
                            }
                            l2.M0(valueOf2.floatValue());
                            if (f10.floatValue() != f2) {
                                l2.x1(f10.floatValue());
                            }
                            if (f11.floatValue() != f2) {
                                l2.E1(f11.floatValue());
                            }
                            i2 = 0;
                            break;
                        }
                    }
                    valueOf2 = Float.valueOf(b05.k());
                    f10 = valueOf3;
                    f11 = f10;
                    l2.M0(valueOf2.floatValue());
                    if (f10.floatValue() != f2) {
                    }
                    if (f11.floatValue() != f2) {
                    }
                    i2 = 0;
                case 7:
                    C2783Ds b06 = c3088Gs.b0(next);
                    if (b06 instanceof C2587Bs) {
                        C2587Bs c2587Bs6 = (C2587Bs) b06;
                        if (c2587Bs6.size() >= 1) {
                            int i5 = i3;
                            while (i5 < c2587Bs6.size()) {
                                C2783Ds Y = c2587Bs6.Y(i5);
                                float f19 = f16;
                                if (Y instanceof C2587Bs) {
                                    C2587Bs c2587Bs7 = (C2587Bs) Y;
                                    if (c2587Bs7.size() > 0) {
                                        String f20 = c2587Bs7.Y(i3).f();
                                        int size = c2587Bs7.size();
                                        if (size != 2) {
                                            if (size != 3) {
                                                if (size != i4) {
                                                    f12 = Float.NaN;
                                                    f13 = Float.NaN;
                                                } else {
                                                    f15 = c2587Bs7.getFloat(1);
                                                    float E = E(c8068mc2, c2587Bs7.getFloat(2));
                                                    f13 = E(c8068mc2, c2587Bs7.getFloat(3));
                                                    f14 = E;
                                                }
                                            } else {
                                                f15 = c2587Bs7.getFloat(1);
                                                f13 = E(c8068mc2, c2587Bs7.getFloat(2));
                                                f14 = f13;
                                            }
                                            f12 = f15;
                                            l2.U0(f20, f12, f14, f13);
                                        } else {
                                            f12 = c2587Bs7.getFloat(1);
                                            f13 = Float.NaN;
                                        }
                                        f14 = f13;
                                        l2.U0(f20, f12, f14, f13);
                                    }
                                } else {
                                    l2.P0(Y.f());
                                }
                                i5++;
                                f16 = f19;
                                i3 = 0;
                                i4 = 4;
                            }
                            f2 = f16;
                            i2 = i3;
                            break;
                        }
                    }
                    System.err.println(str2 + " contains should be an array \"" + b06.f() + AbstractC4253Sp2.b.x1);
                    return;
                case 8:
                    l2.G1(c3088Gs.b0(next).l());
                    f2 = f16;
                    i2 = i3;
                    break;
                case 9:
                    l2.A1(c3088Gs.b0(next).l());
                    f2 = f16;
                    i2 = i3;
                    break;
                case 10:
                    if (c3088Gs.b0(next).f().equals("hFlow")) {
                        l2.H1(i3);
                    } else {
                        l2.H1(1);
                    }
                    f2 = f16;
                    i2 = i3;
                    break;
                case 11:
                    l2.N1(c3088Gs.b0(next).l());
                    f2 = f16;
                    i2 = i3;
                    break;
                case 12:
                    l2.P1(C8068mc2.e.h(c3088Gs.b0(next).f()));
                    f2 = f16;
                    i2 = i3;
                    break;
                default:
                    a(c8068mc2, eVar, c8068mc2.f(str2), c3088Gs, next);
                    f2 = f16;
                    i2 = i3;
                    break;
            }
            i3 = i2;
            f16 = f2;
        }
    }

    public static void p(C8068mc2 c8068mc2, e eVar, C3088Gs c3088Gs) throws C3284Is {
        ArrayList<String> C0 = c3088Gs.C0();
        if (C0 != null) {
            Iterator<String> it = C0.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C2783Ds b0 = c3088Gs.b0(next);
                ArrayList<String> b2 = eVar.b(next);
                if (b2 != null && (b0 instanceof C3088Gs)) {
                    Iterator<String> it2 = b2.iterator();
                    while (it2.hasNext()) {
                        B(c8068mc2, eVar, it2.next(), (C3088Gs) b0);
                    }
                }
            }
        }
    }

    public static void q(String str, C8068mc2 c8068mc2, String str2, e eVar, C3088Gs c3088Gs) throws C3284Is {
        float l;
        float f2;
        float f3;
        float f4;
        RE0 m = c8068mc2.m(str2, str);
        Iterator<String> it = c3088Gs.C0().iterator();
        while (it.hasNext()) {
            String next = it.next();
            next.getClass();
            int i = 0;
            char c2 = 65535;
            switch (next.hashCode()) {
                case -1439500848:
                    if (next.equals("orientation")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -806339567:
                    if (next.equals("padding")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -567445985:
                    if (next.equals("contains")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 3169614:
                    if (next.equals("hGap")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 3506649:
                    if (next.equals("rows")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 3586688:
                    if (next.equals("vGap")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 97513095:
                    if (next.equals("flags")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 109497044:
                    if (next.equals("skips")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 109638249:
                    if (next.equals("spans")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case 144441793:
                    if (next.equals("rowWeights")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case 949721053:
                    if (next.equals("columns")) {
                        c2 = '\n';
                        break;
                    }
                    break;
                case 2033353925:
                    if (next.equals("columnWeights")) {
                        c2 = 11;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    m.n1(c3088Gs.b0(next).l());
                    break;
                case 1:
                    C2783Ds b0 = c3088Gs.b0(next);
                    if (b0 instanceof C2587Bs) {
                        C2587Bs c2587Bs = (C2587Bs) b0;
                        if (c2587Bs.size() > 1) {
                            l = c2587Bs.getInt(0);
                            f4 = c2587Bs.getInt(1);
                            if (c2587Bs.size() > 2) {
                                f3 = c2587Bs.getInt(2);
                                try {
                                    f2 = ((C2587Bs) b0).getInt(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    f2 = 0.0f;
                                }
                            } else {
                                f2 = f4;
                                f3 = l;
                            }
                            m.q1(Math.round(E(c8068mc2, l)));
                            m.r1(Math.round(E(c8068mc2, f4)));
                            m.p1(Math.round(E(c8068mc2, f3)));
                            m.o1(Math.round(E(c8068mc2, f2)));
                            break;
                        }
                    }
                    l = b0.l();
                    f2 = l;
                    f3 = f2;
                    f4 = f3;
                    m.q1(Math.round(E(c8068mc2, l)));
                    m.r1(Math.round(E(c8068mc2, f4)));
                    m.p1(Math.round(E(c8068mc2, f3)));
                    m.o1(Math.round(E(c8068mc2, f2)));
                case 2:
                    C2587Bs j0 = c3088Gs.j0(next);
                    if (j0 == null) {
                        break;
                    } else {
                        while (i < j0.size()) {
                            m.P0(c8068mc2.f(j0.Y(i).f()));
                            i++;
                        }
                        break;
                    }
                case 3:
                    m.m1(E(c8068mc2, c3088Gs.b0(next).k()));
                    break;
                case 4:
                    int l2 = c3088Gs.b0(next).l();
                    if (l2 <= 0) {
                        break;
                    } else {
                        m.t1(l2);
                        break;
                    }
                case 5:
                    m.w1(E(c8068mc2, c3088Gs.b0(next).k()));
                    break;
                case 6:
                    String str3 = "";
                    try {
                        C2783Ds b02 = c3088Gs.b0(next);
                        if (b02 instanceof C2990Fs) {
                            i = b02.l();
                        } else {
                            str3 = b02.f();
                        }
                    } catch (Exception e2) {
                        System.err.println("Error parsing grid flags " + e2);
                    }
                    if (str3 != null && !str3.isEmpty()) {
                        m.l1(str3);
                        break;
                    } else {
                        m.k1(i);
                        break;
                    }
                case 7:
                    String f5 = c3088Gs.b0(next).f();
                    if (f5 != null && f5.contains(":")) {
                        m.u1(f5);
                        break;
                    }
                    break;
                case '\b':
                    String f6 = c3088Gs.b0(next).f();
                    if (f6 != null && f6.contains(":")) {
                        m.v1(f6);
                        break;
                    }
                    break;
                case '\t':
                    String f7 = c3088Gs.b0(next).f();
                    if (f7 != null && f7.contains(",")) {
                        m.s1(f7);
                        break;
                    }
                    break;
                case '\n':
                    int l3 = c3088Gs.b0(next).l();
                    if (l3 <= 0) {
                        break;
                    } else {
                        m.j1(l3);
                        break;
                    }
                case 11:
                    String f8 = c3088Gs.b0(next).f();
                    if (f8 != null && f8.contains(",")) {
                        m.i1(f8);
                        break;
                    }
                    break;
                default:
                    a(c8068mc2, eVar, c8068mc2.f(str2), c3088Gs, next);
                    break;
            }
        }
    }

    public static void r(int i, C8068mc2 c8068mc2, C2587Bs c2587Bs) throws C3284Is {
        C3088Gs c3088Gs;
        String y0;
        C2783Ds Y = c2587Bs.Y(1);
        if (!(Y instanceof C3088Gs) || (y0 = (c3088Gs = (C3088Gs) Y).y0("id")) == null) {
            return;
        }
        s(i, c8068mc2, y0, c3088Gs);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void s(int i, C8068mc2 c8068mc2, String str, C3088Gs c3088Gs) throws C3284Is {
        boolean z;
        String next;
        char c2;
        char c3;
        ArrayList<String> C0 = c3088Gs.C0();
        if (C0 == null) {
            return;
        }
        QK f2 = c8068mc2.f(str);
        if (i == 0) {
            c8068mc2.x(str);
        } else {
            c8068mc2.O(str);
        }
        if (c8068mc2.A() && i != 0) {
            z = false;
        } else {
            z = true;
        }
        C10174vF0 c10174vF0 = (C10174vF0) f2.d();
        Iterator<String> it = C0.iterator();
        float f3 = 0.0f;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            while (it.hasNext()) {
                next = it.next();
                next.getClass();
                switch (next.hashCode()) {
                    case -678927291:
                        if (next.equals("percent")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 100571:
                        if (next.equals("end")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3317767:
                        if (next.equals("left")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 108511772:
                        if (next.equals(C5445bv2.n0)) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 109757538:
                        if (next.equals("start")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        C2587Bs j0 = c3088Gs.j0(next);
                        if (j0 == null) {
                            f3 = c3088Gs.l0(next);
                            z2 = true;
                            z3 = true;
                        } else {
                            if (j0.size() > 1) {
                                String v0 = j0.v0(0);
                                float f4 = j0.getFloat(1);
                                v0.getClass();
                                switch (v0.hashCode()) {
                                    case 100571:
                                        if (v0.equals("end")) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3317767:
                                        if (v0.equals("left")) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 108511772:
                                        if (v0.equals(C5445bv2.n0)) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 109757538:
                                        if (v0.equals("start")) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    default:
                                        c3 = 65535;
                                        break;
                                }
                                switch (c3) {
                                    case 0:
                                        z3 = !z;
                                        f3 = f4;
                                        break;
                                    case 1:
                                        z3 = true;
                                        f3 = f4;
                                        z2 = true;
                                        break;
                                    case 2:
                                        z3 = false;
                                        f3 = f4;
                                        break;
                                    case 3:
                                        z3 = z;
                                        f3 = f4;
                                        break;
                                    default:
                                        f3 = f4;
                                        break;
                                }
                            }
                            z2 = true;
                        }
                    case 1:
                        f3 = E(c8068mc2, c3088Gs.l0(next));
                        z3 = !z;
                    case 3:
                        f3 = E(c8068mc2, c3088Gs.l0(next));
                        z3 = false;
                    case 4:
                        f3 = E(c8068mc2, c3088Gs.l0(next));
                        z3 = z;
                }
            }
            if (z2) {
                if (z3) {
                    c10174vF0.g(f3);
                    return;
                } else {
                    c10174vF0.g(1.0f - f3);
                    return;
                }
            } else if (z3) {
                c10174vF0.i(Float.valueOf(f3));
                return;
            } else {
                c10174vF0.e(Float.valueOf(f3));
                return;
            }
            f3 = E(c8068mc2, c3088Gs.l0(next));
        }
    }

    public static void t(TP tp, C3088Gs c3088Gs) {
        String y0 = c3088Gs.y0("export");
        if (y0 != null) {
            tp.f(y0);
        }
    }

    public static void u(C8068mc2 c8068mc2, e eVar, C2587Bs c2587Bs) throws C3284Is {
        for (int i = 0; i < c2587Bs.size(); i++) {
            C2783Ds Y = c2587Bs.Y(i);
            if (Y instanceof C2587Bs) {
                C2587Bs c2587Bs2 = (C2587Bs) Y;
                if (c2587Bs2.size() > 1) {
                    String v0 = c2587Bs2.v0(0);
                    v0.getClass();
                    char c2 = 65535;
                    switch (v0.hashCode()) {
                        case -1785507558:
                            if (v0.equals("vGuideline")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -1252464839:
                            if (v0.equals("hChain")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case -851656725:
                            if (v0.equals("vChain")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 965681512:
                            if (v0.equals("hGuideline")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                            r(1, c8068mc2, c2587Bs2);
                            continue;
                        case 1:
                            f(0, c8068mc2, eVar, c2587Bs2);
                            continue;
                        case 2:
                            f(1, c8068mc2, eVar, c2587Bs2);
                            continue;
                        case 3:
                            r(0, c8068mc2, c2587Bs2);
                            continue;
                    }
                }
            }
        }
    }

    public static void v(String str, C8068mc2 c8068mc2, e eVar) throws C3284Is {
        try {
            D(C3186Hs.d(str), c8068mc2, eVar);
        } catch (C3284Is e2) {
            PrintStream printStream = System.err;
            printStream.println("Error parsing JSON " + e2);
        }
    }

    public static void w(String str, C7875lt2 c7875lt2, int i) {
        C3088Gs s0;
        try {
            C3088Gs d2 = C3186Hs.d(str);
            ArrayList<String> C0 = d2.C0();
            if (C0 != null) {
                Iterator<String> it = C0.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    C2783Ds b0 = d2.b0(next);
                    if ((b0 instanceof C3088Gs) && (s0 = ((C3088Gs) b0).s0("custom")) != null) {
                        Iterator<String> it2 = s0.C0().iterator();
                        while (it2.hasNext()) {
                            String next2 = it2.next();
                            C2783Ds b02 = s0.b0(next2);
                            if (b02 instanceof C2990Fs) {
                                c7875lt2.o(i, next, next2, b02.k());
                            } else if (b02 instanceof C3382Js) {
                                long h = h(b02.f());
                                if (h != -1) {
                                    c7875lt2.n(i, next, next2, (int) h);
                                }
                            }
                        }
                    }
                }
            }
        } catch (C3284Is e2) {
            PrintStream printStream = System.err;
            printStream.println("Error parsing JSON " + e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void x(C2783Ds c2783Ds, QK qk) throws C3284Is {
        char c2;
        if (c2783Ds instanceof C3088Gs) {
            C3088Gs c3088Gs = (C3088Gs) c2783Ds;
            C5933dw2 c5933dw2 = new C5933dw2();
            ArrayList<String> C0 = c3088Gs.C0();
            if (C0 == null) {
                return;
            }
            Iterator<String> it = C0.iterator();
            while (it.hasNext()) {
                String next = it.next();
                next.getClass();
                switch (next.hashCode()) {
                    case -1897525331:
                        if (next.equals("stagger")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1310311125:
                        if (next.equals("easing")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1285003983:
                        if (next.equals("quantize")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -791482387:
                        if (next.equals("pathArc")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -236944793:
                        if (next.equals("relativeTo")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        c5933dw2.a(600, c3088Gs.l0(next));
                        break;
                    case 1:
                        c5933dw2.c(InterfaceC8148mw2.e.s, c3088Gs.w0(next));
                        break;
                    case 2:
                        C2783Ds b0 = c3088Gs.b0(next);
                        if (b0 instanceof C2587Bs) {
                            C2587Bs c2587Bs = (C2587Bs) b0;
                            int size = c2587Bs.size();
                            if (size <= 0) {
                                break;
                            } else {
                                c5933dw2.b(InterfaceC8148mw2.e.z, c2587Bs.getInt(0));
                                if (size <= 1) {
                                    break;
                                } else {
                                    c5933dw2.c(InterfaceC8148mw2.e.A, c2587Bs.v0(1));
                                    if (size <= 2) {
                                        break;
                                    } else {
                                        c5933dw2.a(InterfaceC8148mw2.e.r, c2587Bs.getFloat(2));
                                        break;
                                    }
                                }
                            }
                        } else {
                            c5933dw2.b(InterfaceC8148mw2.e.z, c3088Gs.n0(next));
                            break;
                        }
                    case 3:
                        String w0 = c3088Gs.w0(next);
                        int b2 = b(w0, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                        if (b2 == -1) {
                            System.err.println(c3088Gs.p() + " pathArc = '" + w0 + "'");
                            break;
                        } else {
                            c5933dw2.b(InterfaceC8148mw2.e.w, b2);
                            break;
                        }
                    case 4:
                        c5933dw2.c(InterfaceC8148mw2.e.u, c3088Gs.w0(next));
                        break;
                }
            }
            qk.l0 = c5933dw2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void y(TP tp, String str) {
        char c2;
        try {
            C3088Gs d2 = C3186Hs.d(str);
            ArrayList<String> C0 = d2.C0();
            if (C0 != null) {
                Iterator<String> it = C0.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    C2783Ds b0 = d2.b0(next);
                    if (b0 instanceof C3088Gs) {
                        C3088Gs c3088Gs = (C3088Gs) b0;
                        int hashCode = next.hashCode();
                        if (hashCode != -2137403731) {
                            if (hashCode != -241441378) {
                                if (hashCode == 1101852654 && next.equals("ConstraintSets")) {
                                    c2 = 0;
                                    if (c2 == 0) {
                                        if (c2 != 1) {
                                            if (c2 == 2) {
                                                t(tp, c3088Gs);
                                            }
                                        } else {
                                            z(tp, c3088Gs);
                                        }
                                    } else {
                                        j(tp, c3088Gs);
                                    }
                                }
                                c2 = 65535;
                                if (c2 == 0) {
                                }
                            } else {
                                if (next.equals(InterfaceC8148mw2.h.a)) {
                                    c2 = 1;
                                    if (c2 == 0) {
                                    }
                                }
                                c2 = 65535;
                                if (c2 == 0) {
                                }
                            }
                        } else {
                            if (next.equals("Header")) {
                                c2 = 2;
                                if (c2 == 0) {
                                }
                            }
                            c2 = 65535;
                            if (c2 == 0) {
                            }
                        }
                    }
                }
            }
        } catch (C3284Is e2) {
            System.err.println("Error parsing JSON " + e2);
        }
    }

    public static void z(TP tp, C3088Gs c3088Gs) throws C3284Is {
        ArrayList<String> C0 = c3088Gs.C0();
        if (C0 != null) {
            Iterator<String> it = C0.iterator();
            while (it.hasNext()) {
                String next = it.next();
                tp.c(next, c3088Gs.r0(next).Q());
            }
        }
    }
}
