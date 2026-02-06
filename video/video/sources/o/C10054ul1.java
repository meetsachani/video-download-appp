package o;

import java.util.Set;
import o.InterfaceC8148mw2;

/* renamed from: o.ul1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10054ul1 implements InterfaceC8148mw2 {
    public static final int A = 0;
    public static final int B = 0;
    public static final int C = -1;
    public static final int D = -1;
    public static final int E = -2;
    public static final int F = Integer.MIN_VALUE;
    public static final int G = 1;
    public static final int m = 0;
    public static final int n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f888o = -1;
    public static final int p = -2;
    public static final int q = 0;
    public static final int r = 4;
    public static final int s = -3;
    public static final int t = -4;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 3;
    public static final int y = 4;
    public static final int z = -1;
    public UK2 h;
    public a i;
    public b j;
    public float k;
    public float l;

    /* renamed from: o.ul1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static final int n = -2;

        /* renamed from: o  reason: collision with root package name */
        public static final int f889o = -1;
        public static final int p = -3;
        public String a = null;
        public int b = 0;
        public String c = null;
        public int d = -1;
        public int e = 0;
        public float f = Float.NaN;
        public int g = -1;
        public float h = Float.NaN;
        public float i = Float.NaN;
        public int j = -1;
        public String k = null;
        public int l = -3;
        public int m = -1;
    }

    /* renamed from: o.ul1$b */
    /* loaded from: classes.dex */
    public static class b {
        public int a = 4;
        public int b = 0;
        public float c = 1.0f;
        public float d = Float.NaN;
    }

    public C10054ul1() {
        this.h = new UK2();
        this.i = new a();
        this.j = new b();
    }

    public float A(int i) {
        switch (i) {
            case 303:
                return this.h.p;
            case 304:
                return this.h.k;
            case 305:
                return this.h.l;
            case 306:
                return this.h.m;
            case 307:
            default:
                return Float.NaN;
            case 308:
                return this.h.h;
            case 309:
                return this.h.i;
            case 310:
                return this.h.j;
            case 311:
                return this.h.n;
            case 312:
                return this.h.f626o;
            case 313:
                return this.h.f;
            case 314:
                return this.h.g;
            case 315:
                return this.k;
            case InterfaceC8148mw2.a.q /* 316 */:
                return this.l;
        }
    }

    public int B() {
        return this.j.a;
    }

    public UK2 C() {
        return this.h;
    }

    public int D() {
        UK2 uk2 = this.h;
        return uk2.d - uk2.b;
    }

    public int E() {
        return this.h.b;
    }

    public int F() {
        return this.h.c;
    }

    public void G(int i, int i2, int i3, int i4) {
        H(i, i2, i3, i4);
    }

    public void H(int i, int i2, int i3, int i4) {
        if (this.h == null) {
            this.h = new UK2((UK) null);
        }
        UK2 uk2 = this.h;
        uk2.c = i2;
        uk2.b = i;
        uk2.d = i3;
        uk2.e = i4;
    }

    public void I(String str, int i, float f) {
        this.h.x(str, i, f);
    }

    public void J(String str, int i, int i2) {
        this.h.y(str, i, i2);
    }

    public void K(String str, int i, String str2) {
        this.h.z(str, i, str2);
    }

    public void L(String str, int i, boolean z2) {
        this.h.A(str, i, z2);
    }

    public void M(BS bs, float[] fArr) {
        this.h.x(bs.b, 901, fArr[0]);
    }

    public void N(float f) {
        this.h.f = f;
    }

    public void O(float f) {
        this.h.g = f;
    }

    public void P(float f) {
        this.h.h = f;
    }

    public void Q(float f) {
        this.h.i = f;
    }

    public void R(float f) {
        this.h.j = f;
    }

    public void S(float f) {
        this.h.n = f;
    }

    public void T(float f) {
        this.h.f626o = f;
    }

    public void U(float f) {
        this.h.k = f;
    }

    public void V(float f) {
        this.h.l = f;
    }

    public void W(float f) {
        this.h.m = f;
    }

    public boolean X(int i, float f) {
        switch (i) {
            case 303:
                this.h.p = f;
                return true;
            case 304:
                this.h.k = f;
                return true;
            case 305:
                this.h.l = f;
                return true;
            case 306:
                this.h.m = f;
                return true;
            case 307:
            default:
                return false;
            case 308:
                this.h.h = f;
                return true;
            case 309:
                this.h.i = f;
                return true;
            case 310:
                this.h.j = f;
                return true;
            case 311:
                this.h.n = f;
                return true;
            case 312:
                this.h.f626o = f;
                return true;
            case 313:
                this.h.f = f;
                return true;
            case 314:
                this.h.g = f;
                return true;
            case 315:
                this.k = f;
                return true;
            case InterfaceC8148mw2.a.q /* 316 */:
                this.l = f;
                return true;
        }
    }

    public boolean Y(int i, float f) {
        switch (i) {
            case 600:
                this.i.f = f;
                return true;
            case 601:
                this.i.h = f;
                return true;
            case InterfaceC8148mw2.e.r /* 602 */:
                this.i.i = f;
                return true;
            default:
                return false;
        }
    }

    public boolean Z(int i, int i2) {
        switch (i) {
            case InterfaceC8148mw2.e.v /* 606 */:
                this.i.b = i2;
                return true;
            case InterfaceC8148mw2.e.w /* 607 */:
                this.i.d = i2;
                return true;
            case InterfaceC8148mw2.e.x /* 608 */:
                this.i.e = i2;
                return true;
            case InterfaceC8148mw2.e.y /* 609 */:
                this.i.g = i2;
                return true;
            case InterfaceC8148mw2.e.z /* 610 */:
                this.i.j = i2;
                return true;
            case InterfaceC8148mw2.e.A /* 611 */:
                this.i.l = i2;
                return true;
            case InterfaceC8148mw2.e.B /* 612 */:
                this.i.m = i2;
                return true;
            default:
                return false;
        }
    }

    @Override // o.InterfaceC8148mw2
    public int a(String str) {
        int a2 = InterfaceC8148mw2.a.a(str);
        if (a2 != -1) {
            return a2;
        }
        return InterfaceC8148mw2.e.a(str);
    }

    public boolean a0(int i, String str) {
        if (i != 603) {
            if (i != 604) {
                return false;
            }
            this.i.k = str;
            return true;
        }
        this.i.c = str;
        return true;
    }

    @Override // o.InterfaceC8148mw2
    public boolean b(int i, int i2) {
        if (X(i, i2)) {
            return true;
        }
        return Z(i, i2);
    }

    public void b0(int i) {
        this.j.a = i;
    }

    @Override // o.InterfaceC8148mw2
    public boolean c(int i, float f) {
        if (X(i, f)) {
            return true;
        }
        return Y(i, f);
    }

    public void c0(InterfaceC8148mw2 interfaceC8148mw2) {
        if (this.h.m() != null) {
            this.h.m().g(interfaceC8148mw2);
        }
    }

    @Override // o.InterfaceC8148mw2
    public boolean d(int i, boolean z2) {
        return false;
    }

    @Override // o.InterfaceC8148mw2
    public boolean e(int i, String str) {
        if (i == 605) {
            this.i.a = str;
            return true;
        }
        return a0(i, str);
    }

    public C10054ul1 f(int i) {
        return null;
    }

    public float g() {
        return this.h.p;
    }

    public int h() {
        return this.h.e;
    }

    public NT i(String str) {
        return this.h.h(str);
    }

    public Set<String> j() {
        return this.h.i();
    }

    public int k() {
        UK2 uk2 = this.h;
        return uk2.e - uk2.c;
    }

    public int l() {
        return this.h.b;
    }

    public String m() {
        return this.h.l();
    }

    public C10054ul1 n() {
        return null;
    }

    public float o() {
        return this.h.f;
    }

    public float p() {
        return this.h.g;
    }

    public int q() {
        return this.h.d;
    }

    public float r() {
        return this.h.h;
    }

    public float s() {
        return this.h.i;
    }

    public float t() {
        return this.h.j;
    }

    public String toString() {
        return this.h.b + C6566gU0.h + this.h.c + C6566gU0.h + this.h.d + C6566gU0.h + this.h.e;
    }

    public float u() {
        return this.h.n;
    }

    public float v() {
        return this.h.f626o;
    }

    public int w() {
        return this.h.c;
    }

    public float x() {
        return this.h.k;
    }

    public float y() {
        return this.h.l;
    }

    public float z() {
        return this.h.m;
    }

    public C10054ul1(UK2 uk2) {
        this.h = new UK2();
        this.i = new a();
        this.j = new b();
        this.h = uk2;
    }
}
