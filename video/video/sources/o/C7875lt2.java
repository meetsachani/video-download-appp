package o;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o.C5373bd2;
import o.InterfaceC8148mw2;
import o.UK;

/* renamed from: o.lt2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7875lt2 implements InterfaceC8148mw2 {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    public static final int J = 6;
    public static final int K = -1;
    public static final int L = -2;
    public static final boolean z = false;
    public HashMap<Integer, HashMap<String, a>> h = new HashMap<>();
    public HashMap<String, c> i = new HashMap<>();
    public C5933dw2 j = new C5933dw2();
    public int k = 0;
    public String l = null;
    public C6725h90 m = null;
    public int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f799o = 400;
    public float p = 0.0f;
    public b q = null;
    public final VP r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean y;

    /* renamed from: o.lt2$a */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public String b;
        public int c;
        public float d;
        public float e;

        public a(String str, int i, int i2, float f, float f2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = f;
            this.e = f2;
        }
    }

    /* renamed from: o.lt2$b */
    /* loaded from: classes.dex */
    public static class b {
        public static final int A = 6;
        public static final int D = 0;
        public static final int E = 1;
        public static final int F = 2;
        public static final int G = 3;
        public static final int H = 4;
        public static final int I = 5;
        public static final int J = 6;
        public static final int K = 7;
        public static final int M = 0;
        public static final int N = 1;
        public static final int P = 0;
        public static final int Q = 1;
        public static final int R = 2;
        public static final int S = 3;
        public static final int T = 4;
        public static final int U = 5;
        public static final int V = 6;
        public static final int W = 7;
        public static final int Y = 0;
        public static final int Z = 1;
        public static final int a0 = 2;
        public static final int b0 = 3;
        public static final int u = 0;
        public static final int v = 1;
        public static final int w = 2;
        public static final int x = 3;
        public static final int y = 4;
        public static final int z = 5;
        public String a;
        public int b;
        public InterfaceC4890Zc2 c;
        public String d;
        public String e;
        public boolean f = true;
        public int g = 0;
        public float h = 1.0f;
        public float i = 10.0f;
        public int j = 0;
        public float k = 4.0f;
        public float l = 1.2f;
        public int m = 0;
        public float n = 1.0f;

        /* renamed from: o  reason: collision with root package name */
        public float f800o = 400.0f;
        public float p = 10.0f;
        public float q = 0.01f;
        public float r = 0.0f;
        public int s = 0;
        public long t;
        public static final String[] B = {C9698tH2.l, "left", C5445bv2.n0, "bottom", "middle", "start", "end"};
        public static final float[][] C = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
        public static final String[] L = {"up", "down", "left", C5445bv2.n0, "start", "end", "clockwise", "anticlockwise"};
        public static final String[] O = {"velocity", "spring"};
        public static final String[] X = {"autocomplete", "toStart", "toEnd", "stop", C6725h90.i, "decelerateComplete", "neverCompleteStart", "neverCompleteEnd"};
        public static final String[] c0 = {C6725h90.n, "bounceStart", "bounceEnd", "bounceBoth"};
        public static final float[][] d0 = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

        public void a(float f, float f2, long j, float f3) {
            C6335fb2 c6335fb2;
            C5373bd2 c5373bd2;
            C5373bd2.a aVar;
            this.t = j;
            float abs = Math.abs(f2);
            float f4 = this.k;
            if (abs > f4) {
                f2 = Math.signum(f2) * f4;
            }
            float f5 = f2;
            float b = b(f, f5, f3);
            this.r = b;
            if (b == f) {
                this.c = null;
            } else if (this.m == 4 && this.j == 0) {
                InterfaceC4890Zc2 interfaceC4890Zc2 = this.c;
                if (interfaceC4890Zc2 instanceof C5373bd2.a) {
                    aVar = (C5373bd2.a) interfaceC4890Zc2;
                } else {
                    aVar = new C5373bd2.a();
                    this.c = aVar;
                }
                aVar.e(f, this.r, f5);
            } else if (this.j == 0) {
                InterfaceC4890Zc2 interfaceC4890Zc22 = this.c;
                if (interfaceC4890Zc22 instanceof C5373bd2) {
                    c5373bd2 = (C5373bd2) interfaceC4890Zc22;
                } else {
                    c5373bd2 = new C5373bd2();
                    this.c = c5373bd2;
                }
                c5373bd2.f(f, this.r, f5, f3, this.l, this.k);
            } else {
                InterfaceC4890Zc2 interfaceC4890Zc23 = this.c;
                if (interfaceC4890Zc23 instanceof C6335fb2) {
                    c6335fb2 = (C6335fb2) interfaceC4890Zc23;
                } else {
                    c6335fb2 = new C6335fb2();
                    this.c = c6335fb2;
                }
                c6335fb2.h(f, this.r, f5, this.n, this.f800o, this.p, this.q, this.s);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public float b(float f, float f2, float f3) {
            float abs = (((Math.abs(f2) * 0.5f) * f2) / this.l) + f;
            switch (this.m) {
                case 1:
                    if (f < 1.0f) {
                        return 0.0f;
                    }
                    return 1.0f;
                case 2:
                    if (f <= 0.0f) {
                        return 0.0f;
                    }
                    return 1.0f;
                case 3:
                    return Float.NaN;
                case 4:
                    return Math.max(0.0f, Math.min(1.0f, abs));
                case 5:
                    if (abs > 0.2f && abs < 0.8f) {
                        return abs;
                    }
                    if (abs <= 0.5f) {
                        return 0.0f;
                    }
                    return 1.0f;
                case 6:
                    return 1.0f;
                case 7:
                    break;
                default:
                    if (abs > 0.5d) {
                        return 1.0f;
                    }
                    break;
            }
            return 0.0f;
        }

        public float[] c() {
            return d0[this.g];
        }

        public float d() {
            return this.h;
        }

        public float[] e() {
            return C[this.b];
        }

        public float f(long j) {
            float interpolation = this.c.getInterpolation(((float) (j - this.t)) * 1.0E-9f);
            if (this.c.d()) {
                return this.r;
            }
            return interpolation;
        }

        public boolean g(float f) {
            InterfaceC4890Zc2 interfaceC4890Zc2;
            if (this.m == 3 || (interfaceC4890Zc2 = this.c) == null || interfaceC4890Zc2.d()) {
                return false;
            }
            return true;
        }

        public void h() {
            if (this.j == 0) {
                PrintStream printStream = System.out;
                printStream.println("velocity = " + this.c.a());
                PrintStream printStream2 = System.out;
                printStream2.println("mMaxAcceleration = " + this.l);
                PrintStream printStream3 = System.out;
                printStream3.println("mMaxVelocity = " + this.k);
                return;
            }
            PrintStream printStream4 = System.out;
            printStream4.println("mSpringMass          = " + this.n);
            PrintStream printStream5 = System.out;
            printStream5.println("mSpringStiffness     = " + this.f800o);
            PrintStream printStream6 = System.out;
            printStream6.println("mSpringDamping       = " + this.p);
            PrintStream printStream7 = System.out;
            printStream7.println("mSpringStopThreshold = " + this.q);
            PrintStream printStream8 = System.out;
            printStream8.println("mSpringBoundary      = " + this.s);
        }

        public void i(String str) {
            this.a = str;
        }

        public void j(int i) {
            this.b = i;
        }

        public void k(int i) {
            this.j = i;
        }

        public void l(int i) {
            boolean z2;
            this.g = i;
            if (i < 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f = z2;
        }

        public void m(float f) {
            if (Float.isNaN(f)) {
                return;
            }
            this.h = f;
        }

        public void n(float f) {
            if (Float.isNaN(f)) {
                return;
            }
            this.i = f;
        }

        public void o(String str) {
            this.e = str;
        }

        public void p(float f) {
            if (Float.isNaN(f)) {
                return;
            }
            this.l = f;
        }

        public void q(float f) {
            if (Float.isNaN(f)) {
                return;
            }
            this.k = f;
        }

        public void r(int i) {
            this.m = i;
        }

        public void s(String str) {
            this.d = str;
        }

        public void t(int i) {
            this.s = i;
        }

        public void u(float f) {
            if (Float.isNaN(f)) {
                return;
            }
            this.p = f;
        }

        public void v(float f) {
            if (Float.isNaN(f)) {
                return;
            }
            this.n = f;
        }

        public void w(float f) {
            if (Float.isNaN(f)) {
                return;
            }
            this.f800o = f;
        }

        public void x(float f) {
            if (Float.isNaN(f)) {
                return;
            }
            this.q = f;
        }
    }

    /* renamed from: o.lt2$c */
    /* loaded from: classes.dex */
    public static class c {
        public C4035Qk1 d;
        public boolean e = true;
        public C8049mX0 i = new C8049mX0();
        public int j = -1;
        public int k = -1;
        public UK2 a = new UK2();
        public UK2 b = new UK2();
        public UK2 c = new UK2();
        public C10054ul1 f = new C10054ul1(this.a);
        public C10054ul1 g = new C10054ul1(this.b);
        public C10054ul1 h = new C10054ul1(this.c);

        public c() {
            C4035Qk1 c4035Qk1 = new C4035Qk1(this.f);
            this.d = c4035Qk1;
            c4035Qk1.d0(this.f);
            this.d.Y(this.g);
        }

        public UK2 a(int i) {
            if (i == 0) {
                return this.a;
            }
            if (i == 1) {
                return this.b;
            }
            return this.c;
        }

        public String b() {
            return this.d.p();
        }

        public void c(int i, int i2, float f, C7875lt2 c7875lt2) {
            this.j = i2;
            this.k = i;
            if (this.e) {
                this.d.h0(i, i2, 1.0f, System.nanoTime());
                this.e = false;
            }
            UK2.p(i, i2, this.c, this.a, this.b, c7875lt2, f);
            this.c.q = f;
            this.d.R(this.h, f, System.nanoTime(), this.i);
        }

        public void d(C5933dw2 c5933dw2) {
            C5646cl1 c5646cl1 = new C5646cl1();
            c5933dw2.g(c5646cl1);
            this.d.f(c5646cl1);
        }

        public void e(C5933dw2 c5933dw2, NT[] ntArr) {
            C5646cl1 c5646cl1 = new C5646cl1();
            c5933dw2.g(c5646cl1);
            if (ntArr != null) {
                for (int i = 0; i < ntArr.length; i++) {
                    c5646cl1.l.put(ntArr[i].k(), ntArr[i]);
                }
            }
            this.d.f(c5646cl1);
        }

        public void f(C5933dw2 c5933dw2) {
            C5889dl1 c5889dl1 = new C5889dl1();
            c5933dw2.g(c5889dl1);
            this.d.f(c5889dl1);
        }

        public void g(C5933dw2 c5933dw2) {
            C6131el1 c6131el1 = new C6131el1();
            c5933dw2.g(c6131el1);
            this.d.f(c6131el1);
        }

        public void h(c cVar) {
            this.d.j0(cVar.d);
        }

        public void i(UK uk, int i) {
            if (i == 0) {
                this.a.F(uk);
                C10054ul1 c10054ul1 = this.f;
                c10054ul1.c0(c10054ul1);
                this.d.d0(this.f);
                this.e = true;
            } else if (i == 1) {
                this.b.F(uk);
                this.d.Y(this.g);
                this.e = true;
            }
            this.k = -1;
        }
    }

    public C7875lt2(VP vp) {
        this.r = vp;
    }

    public static MS0 L(int i, final String str) {
        switch (i) {
            case -1:
                return new MS0() { // from class: o.Vs2
                    @Override // o.MS0
                    public final float getInterpolation(float f) {
                        return C7875lt2.i(str, f);
                    }
                };
            case 0:
                return new MS0() { // from class: o.Ws2
                    @Override // o.MS0
                    public final float getInterpolation(float f) {
                        return C7875lt2.f(f);
                    }
                };
            case 1:
                return new MS0() { // from class: o.Xs2
                    @Override // o.MS0
                    public final float getInterpolation(float f) {
                        return C7875lt2.m(f);
                    }
                };
            case 2:
                return new MS0() { // from class: o.Ys2
                    @Override // o.MS0
                    public final float getInterpolation(float f) {
                        return C7875lt2.k(f);
                    }
                };
            case 3:
                return new MS0() { // from class: o.Zs2
                    @Override // o.MS0
                    public final float getInterpolation(float f) {
                        return C7875lt2.j(f);
                    }
                };
            case 4:
                return new MS0() { // from class: o.ct2
                    @Override // o.MS0
                    public final float getInterpolation(float f) {
                        return C7875lt2.g(f);
                    }
                };
            case 5:
                return new MS0() { // from class: o.bt2
                    @Override // o.MS0
                    public final float getInterpolation(float f) {
                        return C7875lt2.l(f);
                    }
                };
            case 6:
                return new MS0() { // from class: o.at2
                    @Override // o.MS0
                    public final float getInterpolation(float f) {
                        return C7875lt2.h(f);
                    }
                };
            default:
                return null;
        }
    }

    public static /* synthetic */ float f(float f) {
        return (float) C6725h90.c(C6725h90.k).a(f);
    }

    public static /* synthetic */ float g(float f) {
        return (float) C6725h90.c("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").a(f);
    }

    public static /* synthetic */ float h(float f) {
        return (float) C6725h90.c(C6725h90.m).a(f);
    }

    public static /* synthetic */ float i(String str, float f) {
        return (float) C6725h90.c(str).a(f);
    }

    public static /* synthetic */ float j(float f) {
        return (float) C6725h90.c(C6725h90.l).a(f);
    }

    public static /* synthetic */ float k(float f) {
        return (float) C6725h90.c(C6725h90.i).a(f);
    }

    public static /* synthetic */ float l(float f) {
        return (float) C6725h90.c(C6725h90.n).a(f);
    }

    public static /* synthetic */ float m(float f) {
        return (float) C6725h90.c(C6725h90.j).a(f);
    }

    public void A(UK2 uk2, float[] fArr, float[] fArr2, float[] fArr3) {
        a aVar;
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            HashMap<String, a> hashMap = this.h.get(Integer.valueOf(i2));
            if (hashMap != null && (aVar = hashMap.get(uk2.a.f625o)) != null) {
                fArr[i] = aVar.d;
                fArr2[i] = aVar.e;
                fArr3[i] = aVar.a;
                i++;
            }
        }
    }

    public a B(String str, int i) {
        a aVar;
        while (i <= 100) {
            HashMap<String, a> hashMap = this.h.get(Integer.valueOf(i));
            if (hashMap != null && (aVar = hashMap.get(str)) != null) {
                return aVar;
            }
            i++;
        }
        return null;
    }

    public a C(String str, int i) {
        a aVar;
        while (i >= 0) {
            HashMap<String, a> hashMap = this.h.get(Integer.valueOf(i));
            if (hashMap != null && (aVar = hashMap.get(str)) != null) {
                return aVar;
            }
            i--;
        }
        return null;
    }

    public int D() {
        return this.n;
    }

    public UK2 E(String str) {
        c cVar = this.i.get(str);
        if (cVar == null) {
            return null;
        }
        return cVar.b;
    }

    public UK2 F(UK uk) {
        return U(uk.f625o, null, 1).b;
    }

    public UK2 G(String str) {
        c cVar = this.i.get(str);
        if (cVar == null) {
            return null;
        }
        return cVar.c;
    }

    public UK2 H(UK uk) {
        return U(uk.f625o, null, 2).c;
    }

    public int I() {
        return this.x;
    }

    public int J() {
        return this.w;
    }

    public MS0 K() {
        return L(this.k, this.l);
    }

    public int M(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.i.get(str).d.j(fArr, iArr, iArr2);
    }

    public C4035Qk1 N(String str) {
        return U(str, null, 0).d;
    }

    public int O(UK2 uk2) {
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            HashMap<String, a> hashMap = this.h.get(Integer.valueOf(i2));
            if (hashMap != null && hashMap.get(uk2.a.f625o) != null) {
                i++;
            }
        }
        return i;
    }

    public float[] P(String str) {
        float[] fArr = new float[124];
        this.i.get(str).d.k(fArr, 62);
        return fArr;
    }

    public UK2 Q(String str) {
        c cVar = this.i.get(str);
        if (cVar == null) {
            return null;
        }
        return cVar.a;
    }

    public UK2 R(UK uk) {
        return U(uk.f625o, null, 0).a;
    }

    public float S(long j) {
        b bVar = this.q;
        if (bVar != null) {
            return bVar.f(j);
        }
        return 0.0f;
    }

    public final c T(String str) {
        return this.i.get(str);
    }

    public c U(String str, UK uk, int i) {
        c cVar = this.i.get(str);
        if (cVar == null) {
            cVar = new c();
            this.j.g(cVar.d);
            cVar.f.c0(cVar.d);
            this.i.put(str, cVar);
            if (uk != null) {
                cVar.i(uk, i);
            }
        }
        return cVar;
    }

    public boolean V() {
        if (this.q != null) {
            return true;
        }
        return false;
    }

    public boolean W() {
        if (this.h.size() > 0) {
            return true;
        }
        return false;
    }

    public void X(int i, int i2, float f) {
        if (this.y) {
            v(f);
        }
        C6725h90 c6725h90 = this.m;
        if (c6725h90 != null) {
            f = (float) c6725h90.a(f);
        }
        for (String str : this.i.keySet()) {
            this.i.get(str).c(i, i2, f, this);
        }
    }

    public boolean Y() {
        return this.i.isEmpty();
    }

    public boolean Z(float f, float f2) {
        b bVar = this.q;
        if (bVar == null) {
            return false;
        }
        String str = bVar.e;
        if (str == null) {
            return true;
        }
        c cVar = this.i.get(str);
        if (cVar == null) {
            System.err.println("mLimitBoundsTo target is null");
            return false;
        }
        UK2 a2 = cVar.a(2);
        if (f < a2.b || f >= a2.d || f2 < a2.c || f2 >= a2.e) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC8148mw2
    public int a(String str) {
        return 0;
    }

    public boolean a0(float f) {
        return this.q.g(f);
    }

    @Override // o.InterfaceC8148mw2
    public boolean b(int i, int i2) {
        return false;
    }

    public void b0() {
        this.q = null;
        this.j.h();
    }

    @Override // o.InterfaceC8148mw2
    public boolean c(int i, float f) {
        if (i == 706) {
            this.p = f;
            return false;
        }
        return false;
    }

    public void c0(float f, long j, float f2, float f3) {
        float f4;
        b bVar = this.q;
        if (bVar != null) {
            float[] fArr = new float[2];
            float[] c2 = this.q.c();
            float[] e = this.q.e();
            this.i.get(bVar.a).d.u(f, e[0], e[1], fArr);
            if (Math.abs((c2[0] * fArr[0]) + (c2[1] * fArr[1])) < 0.01d) {
                fArr[0] = 0.01f;
                fArr[1] = 0.01f;
            }
            if (c2[0] != 0.0f) {
                f4 = f2 / fArr[0];
            } else {
                f4 = f3 / fArr[1];
            }
            this.q.a(f, f4 * this.q.d(), j, this.f799o * 0.001f);
        }
    }

    @Override // o.InterfaceC8148mw2
    public boolean d(int i, boolean z2) {
        return false;
    }

    public void d0(C5933dw2 c5933dw2) {
        c5933dw2.f(this.j);
        c5933dw2.g(this);
    }

    @Override // o.InterfaceC8148mw2
    public boolean e(int i, String str) {
        if (i == 705) {
            this.l = str;
            this.m = C6725h90.c(str);
            return false;
        }
        return false;
    }

    public void e0(VK vk, int i) {
        boolean z2;
        UK.b[] bVarArr = vk.b0;
        UK.b bVar = bVarArr[0];
        UK.b bVar2 = UK.b.WRAP_CONTENT;
        boolean z3 = true;
        if (bVar == bVar2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.y = z2;
        if (bVarArr[1] != bVar2) {
            z3 = false;
        }
        this.y = z2 | z3;
        if (i == 0) {
            int m0 = vk.m0();
            this.s = m0;
            this.w = m0;
            int D2 = vk.D();
            this.t = D2;
            this.x = D2;
        } else {
            this.u = vk.m0();
            this.v = vk.D();
        }
        ArrayList<UK> m2 = vk.m2();
        int size = m2.size();
        c[] cVarArr = new c[size];
        for (int i2 = 0; i2 < size; i2++) {
            UK uk = m2.get(i2);
            c U = U(uk.f625o, null, i);
            cVarArr[i2] = U;
            U.i(uk, i);
            String b2 = U.b();
            if (b2 != null) {
                U.h(U(b2, null, i));
            }
        }
        u();
    }

    public void n(int i, String str, String str2, int i2) {
        U(str, null, i).a(i).c(str2, i2);
    }

    public void o(int i, String str, String str2, float f) {
        U(str, null, i).a(i).d(str2, f);
    }

    public void p(String str, C5933dw2 c5933dw2) {
        U(str, null, 0).d(c5933dw2);
    }

    public void q(String str, C5933dw2 c5933dw2, NT[] ntArr) {
        U(str, null, 0).e(c5933dw2, ntArr);
    }

    public void r(String str, C5933dw2 c5933dw2) {
        U(str, null, 0).f(c5933dw2);
    }

    public void s(String str, int i, int i2, float f, float f2) {
        C5933dw2 c5933dw2 = new C5933dw2();
        c5933dw2.b(InterfaceC8148mw2.g.r, 2);
        c5933dw2.b(100, i);
        c5933dw2.a(InterfaceC8148mw2.g.n, f);
        c5933dw2.a(InterfaceC8148mw2.g.f816o, f2);
        U(str, null, 0).g(c5933dw2);
        a aVar = new a(str, i, i2, f, f2);
        HashMap<String, a> hashMap = this.h.get(Integer.valueOf(i));
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.h.put(Integer.valueOf(i), hashMap);
        }
        hashMap.put(str, aVar);
    }

    public void t(String str, C5933dw2 c5933dw2) {
        U(str, null, 0).g(c5933dw2);
    }

    public void u() {
        boolean z2;
        float f;
        float f2;
        float f3 = this.p;
        if (f3 != 0.0f) {
            if (f3 < 0.0d) {
                z2 = true;
            } else {
                z2 = false;
            }
            float abs = Math.abs(f3);
            Iterator<String> it = this.i.keySet().iterator();
            do {
                f = Float.MAX_VALUE;
                f2 = -3.4028235E38f;
                if (!it.hasNext()) {
                    for (String str : this.i.keySet()) {
                        C4035Qk1 c4035Qk1 = this.i.get(str).d;
                        float y = c4035Qk1.y() + c4035Qk1.z();
                        f = Math.min(f, y);
                        f2 = Math.max(f2, y);
                    }
                    for (String str2 : this.i.keySet()) {
                        C4035Qk1 c4035Qk12 = this.i.get(str2).d;
                        float y2 = c4035Qk12.y() + c4035Qk12.z();
                        float f4 = f2 - f;
                        float f5 = abs - (((y2 - f) * abs) / f4);
                        if (z2) {
                            f5 = abs - (((f2 - y2) / f4) * abs);
                        }
                        c4035Qk12.c0(1.0f / (1.0f - abs));
                        c4035Qk12.b0(f5);
                    }
                    return;
                }
            } while (Float.isNaN(this.i.get(it.next()).d.F()));
            for (String str3 : this.i.keySet()) {
                float F2 = this.i.get(str3).d.F();
                if (!Float.isNaN(F2)) {
                    f = Math.min(f, F2);
                    f2 = Math.max(f2, F2);
                }
            }
            for (String str4 : this.i.keySet()) {
                C4035Qk1 c4035Qk13 = this.i.get(str4).d;
                float F3 = c4035Qk13.F();
                if (!Float.isNaN(F3)) {
                    float f6 = 1.0f / (1.0f - abs);
                    float f7 = f2 - f;
                    float f8 = abs - (((F3 - f) * abs) / f7);
                    if (z2) {
                        f8 = abs - (((f2 - F3) / f7) * abs);
                    }
                    c4035Qk13.c0(f6);
                    c4035Qk13.b0(f8);
                }
            }
        }
    }

    public final void v(float f) {
        int i = this.s;
        this.w = (int) (i + 0.5f + ((this.u - i) * f));
        int i2 = this.t;
        this.x = (int) (i2 + 0.5f + ((this.v - i2) * f));
    }

    public void w() {
        this.i.clear();
    }

    public boolean x(String str) {
        return this.i.containsKey(str);
    }

    public b y() {
        b bVar = new b();
        this.q = bVar;
        return bVar;
    }

    public float z(float f, int i, int i2, float f2, float f3) {
        c cVar;
        float abs;
        float d;
        Iterator<c> it = this.i.values().iterator();
        if (it.hasNext()) {
            cVar = it.next();
        } else {
            cVar = null;
        }
        b bVar = this.q;
        if (bVar != null && cVar != null) {
            String str = bVar.a;
            if (str == null) {
                float[] c2 = bVar.c();
                int i3 = cVar.j;
                float f4 = i3;
                float f5 = i3;
                float f6 = c2[0];
                if (f6 != 0.0f) {
                    abs = (f2 * Math.abs(f6)) / f4;
                } else {
                    abs = (f3 * Math.abs(c2[1])) / f5;
                }
                d = this.q.d();
            } else {
                c cVar2 = this.i.get(str);
                float[] c3 = this.q.c();
                float[] e = this.q.e();
                float[] fArr = new float[2];
                cVar2.c(i, i2, f, this);
                cVar2.d.u(f, e[0], e[1], fArr);
                float f7 = c3[0];
                if (f7 != 0.0f) {
                    abs = (f2 * Math.abs(f7)) / fArr[0];
                } else {
                    abs = (f3 * Math.abs(c3[1])) / fArr[1];
                }
                d = this.q.d();
            }
            return abs * d;
        } else if (cVar != null) {
            return (-f3) / cVar.j;
        } else {
            return 1.0f;
        }
    }
}
