package o;

import java.util.HashMap;
import java.util.HashSet;
import o.InterfaceC8148mw2;

/* renamed from: o.el1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6131el1 extends AbstractC5404bl1 {
    public static final String L = "KeyPosition";
    public static final float M = 20.0f;
    public static final int N = 2;
    public static final int O = 1;
    public static final int P = 0;
    public static final int Q = 2;
    public int A;
    public int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    public float J;
    public float K;
    public int y;
    public String z;

    public C6131el1() {
        int i = AbstractC5404bl1.m;
        this.y = i;
        this.z = null;
        this.A = i;
        this.B = 0;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = 0;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.k = 2;
    }

    public float A() {
        return this.K;
    }

    public boolean B(int i, int i2, C2599Bv0 c2599Bv0, C2599Bv0 c2599Bv02, float f, float f2) {
        x(i, i2, c2599Bv0.a(), c2599Bv0.b(), c2599Bv02.a(), c2599Bv02.b());
        if (Math.abs(f - this.J) < 20.0f && Math.abs(f2 - this.K) < 20.0f) {
            return true;
        }
        return false;
    }

    public void C(C10054ul1 c10054ul1, C2599Bv0 c2599Bv0, C2599Bv0 c2599Bv02, float f, float f2, String[] strArr, float[] fArr) {
        int i = this.I;
        if (i != 1) {
            if (i != 2) {
                D(c2599Bv0, c2599Bv02, f, f2, strArr, fArr);
                return;
            } else {
                F(c10054ul1, c2599Bv0, c2599Bv02, f, f2, strArr, fArr);
                return;
            }
        }
        E(c2599Bv0, c2599Bv02, f, f2, strArr, fArr);
    }

    public void D(C2599Bv0 c2599Bv0, C2599Bv0 c2599Bv02, float f, float f2, String[] strArr, float[] fArr) {
        float a = c2599Bv0.a();
        float b = c2599Bv0.b();
        float a2 = c2599Bv02.a() - a;
        float b2 = c2599Bv02.b() - b;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = (f - a) / a2;
                fArr[1] = (f2 - b) / b2;
                return;
            }
            fArr[1] = (f - a) / a2;
            fArr[0] = (f2 - b) / b2;
            return;
        }
        strArr[0] = "percentX";
        fArr[0] = (f - a) / a2;
        strArr[1] = "percentY";
        fArr[1] = (f2 - b) / b2;
    }

    public void E(C2599Bv0 c2599Bv0, C2599Bv0 c2599Bv02, float f, float f2, String[] strArr, float[] fArr) {
        float a = c2599Bv0.a();
        float b = c2599Bv0.b();
        float a2 = c2599Bv02.a() - a;
        float b2 = c2599Bv02.b() - b;
        float hypot = (float) Math.hypot(a2, b2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f3 = a2 / hypot;
        float f4 = b2 / hypot;
        float f5 = f2 - b;
        float f6 = f - a;
        float f7 = ((f3 * f5) - (f6 * f4)) / hypot;
        float f8 = ((f3 * f6) + (f4 * f5)) / hypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f8;
                fArr[1] = f7;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f8;
        fArr[1] = f7;
    }

    public void F(C10054ul1 c10054ul1, C2599Bv0 c2599Bv0, C2599Bv0 c2599Bv02, float f, float f2, String[] strArr, float[] fArr) {
        c2599Bv0.a();
        c2599Bv0.b();
        c2599Bv02.a();
        c2599Bv02.b();
        C10054ul1 n = c10054ul1.n();
        int D = n.D();
        int k = n.k();
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f / D;
                fArr[1] = f2 / k;
                return;
            }
            fArr[1] = f / D;
            fArr[0] = f2 / k;
            return;
        }
        strArr[0] = "percentX";
        fArr[0] = f / D;
        strArr[1] = "percentY";
        fArr[1] = f2 / k;
    }

    @Override // o.InterfaceC8148mw2
    public int a(String str) {
        return InterfaceC8148mw2.g.a(str);
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean b(int i, int i2) {
        if (i != 100) {
            if (i != 508) {
                if (i != 510) {
                    return super.b(i, i2);
                }
                this.I = i2;
                return true;
            }
            this.y = i2;
            return true;
        }
        this.h = i2;
        return true;
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean c(int i, float f) {
        switch (i) {
            case InterfaceC8148mw2.g.k /* 503 */:
                this.C = f;
                return true;
            case InterfaceC8148mw2.g.l /* 504 */:
                this.D = f;
                return true;
            case InterfaceC8148mw2.g.m /* 505 */:
                this.C = f;
                this.D = f;
                return true;
            case InterfaceC8148mw2.g.n /* 506 */:
                this.E = f;
                return true;
            case InterfaceC8148mw2.g.f816o /* 507 */:
                this.F = f;
                return true;
            default:
                return super.c(i, f);
        }
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean e(int i, String str) {
        if (i != 501) {
            return super.e(i, str);
        }
        this.z = str.toString();
        return true;
    }

    @Override // o.AbstractC5404bl1
    /* renamed from: g */
    public AbstractC5404bl1 clone() {
        return new C6131el1().h(this);
    }

    @Override // o.AbstractC5404bl1
    public AbstractC5404bl1 h(AbstractC5404bl1 abstractC5404bl1) {
        super.h(abstractC5404bl1);
        C6131el1 c6131el1 = (C6131el1) abstractC5404bl1;
        this.z = c6131el1.z;
        this.A = c6131el1.A;
        this.B = c6131el1.B;
        this.C = c6131el1.C;
        this.D = Float.NaN;
        this.E = c6131el1.E;
        this.F = c6131el1.F;
        this.G = c6131el1.G;
        this.H = c6131el1.H;
        this.J = c6131el1.J;
        this.K = c6131el1.K;
        return this;
    }

    public final void v(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = 0.0f;
        if (Float.isNaN(this.E)) {
            f5 = 0.0f;
        } else {
            f5 = this.E;
        }
        if (Float.isNaN(this.H)) {
            f6 = 0.0f;
        } else {
            f6 = this.H;
        }
        if (Float.isNaN(this.F)) {
            f7 = 0.0f;
        } else {
            f7 = this.F;
        }
        if (!Float.isNaN(this.G)) {
            f10 = this.G;
        }
        this.J = (int) (f + (f5 * f8) + (f10 * f9));
        this.K = (int) (f2 + (f8 * f6) + (f9 * f7));
    }

    public final void w(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = this.E;
        float f8 = this.F;
        this.J = f + (f5 * f7) + ((-f6) * f8);
        this.K = f2 + (f6 * f7) + (f5 * f8);
    }

    public void x(int i, int i2, float f, float f2, float f3, float f4) {
        int i3 = this.I;
        if (i3 != 1) {
            if (i3 != 2) {
                v(f, f2, f3, f4);
                return;
            } else {
                y(i, i2);
                return;
            }
        }
        w(f, f2, f3, f4);
    }

    public final void y(int i, int i2) {
        float f = this.E;
        float f2 = 0;
        this.J = (i * f) + f2;
        this.K = (i2 * f) + f2;
    }

    public float z() {
        return this.J;
    }

    @Override // o.AbstractC5404bl1
    public void f(HashMap<String, AbstractC4678Xa2> hashMap) {
    }

    @Override // o.AbstractC5404bl1
    public void i(HashSet<String> hashSet) {
    }
}
