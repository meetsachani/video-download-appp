package o;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.AbstractC8779pX0;
import o.C10000uX0;

/* renamed from: o.Qk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4035Qk1 implements InterfaceC8148mw2 {
    public static final int U = 0;
    public static final int V = 1;
    public static final int W = 2;
    public static final int X = 3;
    public static final int Y = 4;
    public static final int Z = 5;
    public static final int a0 = 0;
    public static final int b0 = 1;
    public static final int c0 = 2;
    public static final int d0 = 3;
    public static final int e0 = 4;
    public static final int f0 = 5;
    public static final int g0 = 6;
    public static final int h0 = 1;
    public static final int i0 = 2;
    public static final String j0 = "MotionController";
    public static final boolean k0 = false;
    public static final boolean l0 = false;
    public static final int m0 = 0;
    public static final int n0 = 1;
    public static final int o0 = 2;
    public static final int p0 = 3;
    public static final int q0 = 4;
    public static final int r0 = 5;
    public static final int s0 = -1;
    public static final int t0 = -2;
    public static final int u0 = -3;
    public String[] A;
    public int[] B;
    public HashMap<String, AbstractC2977Fo2> H;
    public HashMap<String, AbstractC4678Xa2> I;
    public HashMap<String, AbstractC8779pX0> J;
    public C6629gl1[] K;
    public C4035Qk1 S;
    public String[] T;
    public C10054ul1 i;
    public String j;
    public String k;
    public AS[] q;
    public AS r;
    public float v;
    public float w;
    public int[] x;
    public double[] y;
    public double[] z;
    public C10704xP1 h = new C10704xP1();
    public int l = 0;
    public C7599kl1 m = new C7599kl1();
    public C7599kl1 n = new C7599kl1();

    /* renamed from: o  reason: collision with root package name */
    public C4329Tk1 f591o = new C4329Tk1();
    public C4329Tk1 p = new C4329Tk1();
    public float s = Float.NaN;
    public float t = 0.0f;
    public float u = 1.0f;
    public int C = 4;
    public float[] D = new float[4];
    public ArrayList<C7599kl1> E = new ArrayList<>();
    public float[] F = new float[1];
    public ArrayList<AbstractC5404bl1> G = new ArrayList<>();
    public int L = -1;
    public int M = -1;
    public C10054ul1 N = null;
    public int O = -1;
    public float P = Float.NaN;
    public InterfaceC7914m30 Q = null;
    public boolean R = false;

    /* renamed from: o.Qk1$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC7914m30 {
        public float a;
        public final /* synthetic */ C6725h90 b;

        public a(C6725h90 c6725h90) {
            this.b = c6725h90;
        }

        @Override // o.InterfaceC7914m30
        public float a() {
            return (float) this.b.b(this.a);
        }

        @Override // o.InterfaceC7914m30
        public float getInterpolation(float f) {
            this.a = f;
            return (float) this.b.a(f);
        }
    }

    public C4035Qk1(C10054ul1 c10054ul1) {
        g0(c10054ul1);
    }

    public static InterfaceC7914m30 A(int i, String str, int i2) {
        if (i != -1) {
            return null;
        }
        return new a(C6725h90.c(str));
    }

    public C7599kl1 B(int i) {
        return this.E.get(i);
    }

    public int C(int i, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<AbstractC5404bl1> it = this.G.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            AbstractC5404bl1 next = it.next();
            int i4 = next.k;
            if (i4 == i || i != -1) {
                iArr[i3] = 0;
                iArr[i3 + 1] = i4;
                int i5 = next.h;
                iArr[i3 + 2] = i5;
                double d = i5 / 100.0f;
                this.q[0].d(d, this.y);
                this.m.n(d, this.x, this.y, fArr, 0);
                iArr[i3 + 3] = Float.floatToIntBits(fArr[0]);
                int i6 = i3 + 4;
                iArr[i6] = Float.floatToIntBits(fArr[1]);
                if (next instanceof C6131el1) {
                    C6131el1 c6131el1 = (C6131el1) next;
                    iArr[i3 + 5] = c6131el1.I;
                    iArr[i3 + 6] = Float.floatToIntBits(c6131el1.E);
                    i6 = i3 + 7;
                    iArr[i6] = Float.floatToIntBits(c6131el1.F);
                }
                int i7 = i6 + 1;
                iArr[i3] = i7 - i3;
                i2++;
                i3 = i7;
            }
        }
        return i2;
    }

    public float D(int i, float f, float f2) {
        C7599kl1 c7599kl1 = this.n;
        float f3 = c7599kl1.a1;
        C7599kl1 c7599kl12 = this.m;
        float f4 = c7599kl12.a1;
        float f5 = f3 - f4;
        float f6 = c7599kl1.b1;
        float f7 = c7599kl12.b1;
        float f8 = f6 - f7;
        float f9 = f4 + (c7599kl12.c1 / 2.0f);
        float f10 = f7 + (c7599kl12.d1 / 2.0f);
        float hypot = (float) Math.hypot(f5, f8);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f11 = f - f9;
        float f12 = f2 - f10;
        if (((float) Math.hypot(f11, f12)) == 0.0f) {
            return 0.0f;
        }
        float f13 = (f11 * f5) + (f12 * f8);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return 0.0f;
                            }
                            return f12 / f8;
                        }
                        return f11 / f8;
                    }
                    return f12 / f5;
                }
                return f11 / f5;
            }
            return (float) Math.sqrt((hypot * hypot) - (f13 * f13));
        }
        return f13 / hypot;
    }

    public int E(int[] iArr, float[] fArr) {
        Iterator<AbstractC5404bl1> it = this.G.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            AbstractC5404bl1 next = it.next();
            int i3 = next.h;
            iArr[i] = (next.k * 1000) + i3;
            double d = i3 / 100.0f;
            this.q[0].d(d, this.y);
            this.m.n(d, this.x, this.y, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }

    public float F() {
        return this.s;
    }

    public double[] G(double d) {
        this.q[0].d(d, this.y);
        AS as = this.r;
        if (as != null) {
            double[] dArr = this.y;
            if (dArr.length > 0) {
                as.d(d, dArr);
            }
        }
        return this.y;
    }

    public C6131el1 H(int i, int i2, float f, float f2) {
        int i3;
        int i4;
        float f3;
        float f4;
        C2599Bv0 c2599Bv0 = new C2599Bv0();
        C7599kl1 c7599kl1 = this.m;
        float f5 = c7599kl1.a1;
        c2599Bv0.b = f5;
        float f6 = c7599kl1.b1;
        c2599Bv0.d = f6;
        c2599Bv0.c = f5 + c7599kl1.c1;
        c2599Bv0.a = f6 + c7599kl1.d1;
        C2599Bv0 c2599Bv02 = new C2599Bv0();
        C7599kl1 c7599kl12 = this.n;
        float f7 = c7599kl12.a1;
        c2599Bv02.b = f7;
        float f8 = c7599kl12.b1;
        c2599Bv02.d = f8;
        c2599Bv02.c = f7 + c7599kl12.c1;
        c2599Bv02.a = f8 + c7599kl12.d1;
        Iterator<AbstractC5404bl1> it = this.G.iterator();
        while (it.hasNext()) {
            AbstractC5404bl1 next = it.next();
            if (next instanceof C6131el1) {
                C6131el1 c6131el1 = (C6131el1) next;
                i3 = i;
                i4 = i2;
                f3 = f;
                f4 = f2;
                if (c6131el1.B(i3, i4, c2599Bv0, c2599Bv02, f3, f4)) {
                    return c6131el1;
                }
            } else {
                i3 = i;
                i4 = i2;
                f3 = f;
                f4 = f2;
            }
            i = i3;
            i2 = i4;
            f = f3;
            f2 = f4;
        }
        return null;
    }

    public void I(float f, int i, int i2, float f2, float f3, float[] fArr) {
        AbstractC4678Xa2 abstractC4678Xa2;
        AbstractC4678Xa2 abstractC4678Xa22;
        AbstractC4678Xa2 abstractC4678Xa23;
        AbstractC4678Xa2 abstractC4678Xa24;
        AbstractC4678Xa2 abstractC4678Xa25;
        AbstractC8779pX0 abstractC8779pX0;
        AbstractC8779pX0 abstractC8779pX02;
        AbstractC8779pX0 abstractC8779pX03;
        AbstractC8779pX0 abstractC8779pX04;
        float o2 = o(f, this.F);
        HashMap<String, AbstractC4678Xa2> hashMap = this.I;
        AbstractC8779pX0 abstractC8779pX05 = null;
        if (hashMap == null) {
            abstractC4678Xa2 = null;
        } else {
            abstractC4678Xa2 = hashMap.get("translationX");
        }
        HashMap<String, AbstractC4678Xa2> hashMap2 = this.I;
        if (hashMap2 == null) {
            abstractC4678Xa22 = null;
        } else {
            abstractC4678Xa22 = hashMap2.get("translationY");
        }
        HashMap<String, AbstractC4678Xa2> hashMap3 = this.I;
        if (hashMap3 == null) {
            abstractC4678Xa23 = null;
        } else {
            abstractC4678Xa23 = hashMap3.get("rotationZ");
        }
        HashMap<String, AbstractC4678Xa2> hashMap4 = this.I;
        if (hashMap4 == null) {
            abstractC4678Xa24 = null;
        } else {
            abstractC4678Xa24 = hashMap4.get("scaleX");
        }
        HashMap<String, AbstractC4678Xa2> hashMap5 = this.I;
        if (hashMap5 == null) {
            abstractC4678Xa25 = null;
        } else {
            abstractC4678Xa25 = hashMap5.get("scaleY");
        }
        HashMap<String, AbstractC8779pX0> hashMap6 = this.J;
        if (hashMap6 == null) {
            abstractC8779pX0 = null;
        } else {
            abstractC8779pX0 = hashMap6.get("translationX");
        }
        HashMap<String, AbstractC8779pX0> hashMap7 = this.J;
        if (hashMap7 == null) {
            abstractC8779pX02 = null;
        } else {
            abstractC8779pX02 = hashMap7.get("translationY");
        }
        HashMap<String, AbstractC8779pX0> hashMap8 = this.J;
        if (hashMap8 == null) {
            abstractC8779pX03 = null;
        } else {
            abstractC8779pX03 = hashMap8.get("rotationZ");
        }
        HashMap<String, AbstractC8779pX0> hashMap9 = this.J;
        if (hashMap9 == null) {
            abstractC8779pX04 = null;
        } else {
            abstractC8779pX04 = hashMap9.get("scaleX");
        }
        HashMap<String, AbstractC8779pX0> hashMap10 = this.J;
        if (hashMap10 != null) {
            abstractC8779pX05 = hashMap10.get("scaleY");
        }
        OE2 oe2 = new OE2();
        oe2.b();
        oe2.d(abstractC4678Xa23, o2);
        oe2.h(abstractC4678Xa2, abstractC4678Xa22, o2);
        oe2.f(abstractC4678Xa24, abstractC4678Xa25, o2);
        oe2.c(abstractC8779pX03, o2);
        oe2.g(abstractC8779pX0, abstractC8779pX02, o2);
        oe2.e(abstractC8779pX04, abstractC8779pX05, o2);
        AS as = this.r;
        if (as != null) {
            double[] dArr = this.y;
            if (dArr.length > 0) {
                double d = o2;
                as.d(d, dArr);
                this.r.g(d, this.z);
                this.m.z(f2, f3, fArr, this.x, this.z, this.y);
            }
            oe2.a(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.q != null) {
            double o3 = o(o2, this.F);
            this.q[0].g(o3, this.z);
            this.q[0].d(o3, this.y);
            float f4 = this.F[0];
            while (true) {
                double[] dArr2 = this.z;
                if (i3 < dArr2.length) {
                    dArr2[i3] = dArr2[i3] * f4;
                    i3++;
                } else {
                    this.m.z(f2, f3, fArr, this.x, dArr2, this.y);
                    oe2.a(f2, f3, i, i2, fArr);
                    return;
                }
            }
        } else {
            C7599kl1 c7599kl1 = this.n;
            float f5 = c7599kl1.a1;
            C7599kl1 c7599kl12 = this.m;
            float f6 = f5 - c7599kl12.a1;
            float f7 = c7599kl1.b1 - c7599kl12.b1;
            float f8 = (c7599kl1.c1 - c7599kl12.c1) + f6;
            float f9 = f7 + (c7599kl1.d1 - c7599kl12.d1);
            fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
            fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
            oe2.b();
            oe2.d(abstractC4678Xa23, o2);
            oe2.h(abstractC4678Xa2, abstractC4678Xa22, o2);
            oe2.f(abstractC4678Xa24, abstractC4678Xa25, o2);
            oe2.c(abstractC8779pX03, o2);
            oe2.g(abstractC8779pX0, abstractC8779pX02, o2);
            oe2.e(abstractC8779pX04, abstractC8779pX05, o2);
            oe2.a(f2, f3, i, i2, fArr);
        }
    }

    public final float J() {
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float f3 = 0.0f;
        while (i < 100) {
            float f4 = i * f2;
            double d3 = f4;
            C6725h90 c6725h90 = this.m.Y;
            Iterator<C7599kl1> it = this.E.iterator();
            float f5 = Float.NaN;
            float f6 = 0.0f;
            while (it.hasNext()) {
                C7599kl1 next = it.next();
                C6725h90 c6725h902 = next.Y;
                if (c6725h902 != null) {
                    float f7 = next.Y0;
                    if (f7 < f4) {
                        c6725h90 = c6725h902;
                        f6 = f7;
                    } else if (Float.isNaN(f5)) {
                        f5 = next.Y0;
                    }
                }
            }
            if (c6725h90 != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                d3 = (((float) c6725h90.a((f4 - f6) / f)) * (f5 - f6)) + f6;
            }
            double d4 = d3;
            this.q[0].d(d4, this.y);
            int i2 = i;
            this.m.n(d4, this.x, this.y, fArr, 0);
            if (i2 > 0) {
                f3 += (float) Math.hypot(d2 - fArr[1], d - fArr[0]);
            }
            d = fArr[0];
            d2 = fArr[1];
            i = i2 + 1;
        }
        return f3;
    }

    public float K() {
        return this.m.d1;
    }

    public float L() {
        return this.m.c1;
    }

    public float M() {
        return this.m.a1;
    }

    public float N() {
        return this.m.b1;
    }

    public int O() {
        return this.M;
    }

    public C10054ul1 P() {
        return this.i;
    }

    public final void Q(C7599kl1 c7599kl1) {
        Iterator<C7599kl1> it = this.E.iterator();
        C7599kl1 c7599kl12 = null;
        while (it.hasNext()) {
            C7599kl1 next = it.next();
            if (c7599kl1.Z0 == next.Z0) {
                c7599kl12 = next;
            }
        }
        if (c7599kl12 != null) {
            this.E.remove(c7599kl12);
        }
        int binarySearch = Collections.binarySearch(this.E, c7599kl1);
        if (binarySearch == 0) {
            C5521cE2.f("MotionController", " KeyPath position \"" + c7599kl1.Z0 + "\" outside of range");
        }
        this.E.add((-binarySearch) - 1, c7599kl1);
    }

    public boolean R(C10054ul1 c10054ul1, float f, long j, C8049mX0 c8049mX0) {
        C10054ul1 c10054ul12;
        float f2;
        C10054ul1 c10054ul13 = c10054ul1;
        float o2 = o(f, null);
        int i = this.O;
        if (i != -1) {
            float f3 = 1.0f / i;
            float floor = ((float) Math.floor(o2 / f3)) * f3;
            float f4 = (o2 % f3) / f3;
            if (!Float.isNaN(this.P)) {
                f4 = (f4 + this.P) % 1.0f;
            }
            InterfaceC7914m30 interfaceC7914m30 = this.Q;
            if (interfaceC7914m30 != null) {
                f2 = interfaceC7914m30.getInterpolation(f4);
            } else if (f4 > 0.5d) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            o2 = (f2 * f3) + floor;
        }
        float f5 = o2;
        HashMap<String, AbstractC4678Xa2> hashMap = this.I;
        if (hashMap != null) {
            for (AbstractC4678Xa2 abstractC4678Xa2 : hashMap.values()) {
                abstractC4678Xa2.h(c10054ul13, f5);
            }
        }
        AS[] asArr = this.q;
        if (asArr != null) {
            double d = f5;
            asArr[0].d(d, this.y);
            this.q[0].g(d, this.z);
            AS as = this.r;
            if (as != null) {
                double[] dArr = this.y;
                if (dArr.length > 0) {
                    as.d(d, dArr);
                    this.r.g(d, this.z);
                }
            }
            if (!this.R) {
                this.m.A(f5, c10054ul13, this.x, this.y, this.z, null);
                f5 = f5;
                c10054ul13 = c10054ul13;
            }
            if (this.M != -1) {
                if (this.N == null) {
                    this.N = c10054ul13.n().f(this.M);
                }
                if (this.N != null) {
                    float w = (c10054ul12.w() + this.N.h()) / 2.0f;
                    float l = (this.N.l() + this.N.q()) / 2.0f;
                    if (c10054ul13.q() - c10054ul13.l() > 0 && c10054ul13.h() - c10054ul13.w() > 0) {
                        c10054ul13.N(l - c10054ul13.l());
                        c10054ul13.O(w - c10054ul13.w());
                    }
                }
            }
            int i2 = 1;
            while (true) {
                AS[] asArr2 = this.q;
                if (i2 >= asArr2.length) {
                    break;
                }
                asArr2[i2].e(d, this.D);
                this.m.k1.get(this.A[i2 - 1]).w(c10054ul13, this.D);
                i2++;
            }
            C4329Tk1 c4329Tk1 = this.f591o;
            if (c4329Tk1.Y == 0) {
                if (f5 <= 0.0f) {
                    c10054ul13.b0(c4329Tk1.Z);
                } else if (f5 >= 1.0f) {
                    c10054ul13.b0(this.p.Z);
                } else if (this.p.Z != c4329Tk1.Z) {
                    c10054ul13.b0(4);
                }
            }
            if (this.K != null) {
                int i3 = 0;
                while (true) {
                    C6629gl1[] c6629gl1Arr = this.K;
                    if (i3 >= c6629gl1Arr.length) {
                        break;
                    }
                    c6629gl1Arr[i3].v(f5, c10054ul13);
                    i3++;
                }
            }
        } else {
            C7599kl1 c7599kl1 = this.m;
            float f6 = c7599kl1.a1;
            C7599kl1 c7599kl12 = this.n;
            float f7 = f6 + ((c7599kl12.a1 - f6) * f5);
            float f8 = c7599kl1.b1;
            float f9 = f8 + ((c7599kl12.b1 - f8) * f5);
            float f10 = c7599kl1.c1;
            float f11 = f10 + ((c7599kl12.c1 - f10) * f5);
            float f12 = c7599kl1.d1;
            float f13 = f7 + 0.5f;
            float f14 = f9 + 0.5f;
            c10054ul13.G((int) f13, (int) f14, (int) (f13 + f11), (int) (f14 + f12 + ((c7599kl12.d1 - f12) * f5)));
        }
        HashMap<String, AbstractC8779pX0> hashMap2 = this.J;
        if (hashMap2 != null) {
            for (AbstractC8779pX0 abstractC8779pX0 : hashMap2.values()) {
                if (abstractC8779pX0 instanceof AbstractC8779pX0.d) {
                    double[] dArr2 = this.z;
                    ((AbstractC8779pX0.d) abstractC8779pX0).l(c10054ul13, f5, dArr2[0], dArr2[1]);
                } else {
                    abstractC8779pX0.h(c10054ul13, f5);
                }
            }
        }
        return false;
    }

    public String S() {
        return this.i.m();
    }

    public void T(C10054ul1 c10054ul1, C6131el1 c6131el1, float f, float f2, String[] strArr, float[] fArr) {
        C2599Bv0 c2599Bv0 = new C2599Bv0();
        C7599kl1 c7599kl1 = this.m;
        float f3 = c7599kl1.a1;
        c2599Bv0.b = f3;
        float f4 = c7599kl1.b1;
        c2599Bv0.d = f4;
        c2599Bv0.c = f3 + c7599kl1.c1;
        c2599Bv0.a = f4 + c7599kl1.d1;
        C2599Bv0 c2599Bv02 = new C2599Bv0();
        C7599kl1 c7599kl12 = this.n;
        float f5 = c7599kl12.a1;
        c2599Bv02.b = f5;
        float f6 = c7599kl12.b1;
        c2599Bv02.d = f6;
        c2599Bv02.c = f5 + c7599kl12.c1;
        c2599Bv02.a = f6 + c7599kl12.d1;
        c6131el1.C(c10054ul1, c2599Bv0, c2599Bv02, f, f2, strArr, fArr);
    }

    public final void U(C7599kl1 c7599kl1) {
        c7599kl1.y(this.i.E(), this.i.F(), this.i.D(), this.i.k());
    }

    public void V(C10704xP1 c10704xP1, C10704xP1 c10704xP12, int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    int i4 = c10704xP1.b + c10704xP1.c;
                    c10704xP12.b = i2 - (((c10704xP1.a + c10704xP1.d) + c10704xP1.b()) / 2);
                    c10704xP12.d = (i4 - c10704xP1.a()) / 2;
                    c10704xP12.c = c10704xP12.b + c10704xP1.b();
                    c10704xP12.a = c10704xP12.d + c10704xP1.a();
                    return;
                }
                int i5 = c10704xP1.b + c10704xP1.c;
                c10704xP12.b = ((c10704xP1.a() / 2) + c10704xP1.d) - (i5 / 2);
                c10704xP12.d = i3 - ((i5 + c10704xP1.a()) / 2);
                c10704xP12.c = c10704xP12.b + c10704xP1.b();
                c10704xP12.a = c10704xP12.d + c10704xP1.a();
                return;
            }
            int i6 = c10704xP1.b + c10704xP1.c;
            c10704xP12.b = i2 - (((c10704xP1.d + c10704xP1.a) + c10704xP1.b()) / 2);
            c10704xP12.d = (i6 - c10704xP1.a()) / 2;
            c10704xP12.c = c10704xP12.b + c10704xP1.b();
            c10704xP12.a = c10704xP12.d + c10704xP1.a();
            return;
        }
        int i7 = c10704xP1.b + c10704xP1.c;
        c10704xP12.b = ((c10704xP1.d + c10704xP1.a) - c10704xP1.b()) / 2;
        c10704xP12.d = i3 - ((i7 + c10704xP1.a()) / 2);
        c10704xP12.c = c10704xP12.b + c10704xP1.b();
        c10704xP12.a = c10704xP12.d + c10704xP1.a();
    }

    public void W(C10054ul1 c10054ul1) {
        C7599kl1 c7599kl1 = this.m;
        c7599kl1.Y0 = 0.0f;
        c7599kl1.Z0 = 0.0f;
        this.R = true;
        c7599kl1.y(c10054ul1.E(), c10054ul1.F(), c10054ul1.D(), c10054ul1.k());
        this.n.y(c10054ul1.E(), c10054ul1.F(), c10054ul1.D(), c10054ul1.k());
        this.f591o.r(c10054ul1);
        this.p.r(c10054ul1);
    }

    public void X(int i) {
        this.m.Z = i;
    }

    public void Y(C10054ul1 c10054ul1) {
        C7599kl1 c7599kl1 = this.n;
        c7599kl1.Y0 = 1.0f;
        c7599kl1.Z0 = 1.0f;
        U(c7599kl1);
        this.n.y(c10054ul1.l(), c10054ul1.w(), c10054ul1.D(), c10054ul1.k());
        this.n.e(c10054ul1);
        this.p.r(c10054ul1);
    }

    public void Z(String str) {
        this.j = str;
        this.m.X = str;
    }

    @Override // o.InterfaceC8148mw2
    public int a(String str) {
        return 0;
    }

    public void a0(int i) {
        this.L = i;
    }

    @Override // o.InterfaceC8148mw2
    public boolean b(int i, int i2) {
        if (i != 509) {
            if (i != 610) {
                if (i == 704) {
                    return true;
                }
                return false;
            }
            this.O = i2;
            return true;
        }
        a0(i2);
        return true;
    }

    public void b0(float f) {
        this.t = f;
    }

    @Override // o.InterfaceC8148mw2
    public boolean c(int i, float f) {
        if (602 == i) {
            this.P = f;
            return true;
        } else if (600 == i) {
            this.s = f;
            return true;
        } else {
            return false;
        }
    }

    public void c0(float f) {
        this.u = f;
    }

    @Override // o.InterfaceC8148mw2
    public boolean d(int i, boolean z) {
        return false;
    }

    public void d0(C10054ul1 c10054ul1) {
        C7599kl1 c7599kl1 = this.m;
        c7599kl1.Y0 = 0.0f;
        c7599kl1.Z0 = 0.0f;
        c7599kl1.y(c10054ul1.E(), c10054ul1.F(), c10054ul1.D(), c10054ul1.k());
        this.m.e(c10054ul1);
        this.f591o.r(c10054ul1);
        C5933dw2 m = c10054ul1.C().m();
        if (m != null) {
            m.g(this);
        }
    }

    @Override // o.InterfaceC8148mw2
    public boolean e(int i, String str) {
        if (705 != i && 611 != i) {
            if (605 != i) {
                return false;
            }
            this.m.h1 = str;
            return true;
        }
        this.Q = A(-1, str, 0);
        return true;
    }

    public void e0(C6763hI2 c6763hI2, C10054ul1 c10054ul1, int i, int i2, int i3) {
        C7599kl1 c7599kl1 = this.m;
        c7599kl1.Y0 = 0.0f;
        c7599kl1.Z0 = 0.0f;
        C10704xP1 c10704xP1 = new C10704xP1();
        if (i != 1) {
            if (i == 2) {
                int i4 = c6763hI2.b + c6763hI2.d;
                c10704xP1.b = i3 - (((c6763hI2.c + c6763hI2.e) + c6763hI2.c()) / 2);
                c10704xP1.d = (i4 - c6763hI2.b()) / 2;
                c10704xP1.c = c10704xP1.b + c6763hI2.c();
                c10704xP1.a = c10704xP1.d + c6763hI2.b();
            }
        } else {
            int i5 = c6763hI2.b + c6763hI2.d;
            c10704xP1.b = ((c6763hI2.c + c6763hI2.e) - c6763hI2.c()) / 2;
            c10704xP1.d = i2 - ((i5 + c6763hI2.b()) / 2);
            c10704xP1.c = c10704xP1.b + c6763hI2.c();
            c10704xP1.a = c10704xP1.d + c6763hI2.b();
        }
        this.m.y(c10704xP1.b, c10704xP1.d, c10704xP1.b(), c10704xP1.a());
        this.f591o.s(c10704xP1, c10054ul1, i, c6763hI2.a);
    }

    public void f(AbstractC5404bl1 abstractC5404bl1) {
        this.G.add(abstractC5404bl1);
    }

    public void f0(int i) {
        this.M = i;
        this.N = null;
    }

    public void g(ArrayList<AbstractC5404bl1> arrayList) {
        this.G.addAll(arrayList);
    }

    public void g0(C10054ul1 c10054ul1) {
        this.i = c10054ul1;
    }

    public void h(float[] fArr, int i) {
        float f;
        float f2 = 1.0f / (i - 1);
        HashMap<String, AbstractC4678Xa2> hashMap = this.I;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, AbstractC4678Xa2> hashMap2 = this.I;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, AbstractC8779pX0> hashMap3 = this.J;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, AbstractC8779pX0> hashMap4 = this.J;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i2 = 0; i2 < i; i2++) {
            float f3 = i2 * f2;
            float f4 = this.u;
            float f5 = 0.0f;
            if (f4 != 1.0f) {
                float f6 = this.t;
                if (f3 < f6) {
                    f3 = 0.0f;
                }
                if (f3 > f6 && f3 < 1.0d) {
                    f3 = Math.min((f3 - f6) * f4, 1.0f);
                }
            }
            double d = f3;
            C6725h90 c6725h90 = this.m.Y;
            Iterator<C7599kl1> it = this.E.iterator();
            float f7 = Float.NaN;
            while (it.hasNext()) {
                C7599kl1 next = it.next();
                C6725h90 c6725h902 = next.Y;
                if (c6725h902 != null) {
                    float f8 = next.Y0;
                    if (f8 < f3) {
                        c6725h90 = c6725h902;
                        f5 = f8;
                    } else if (Float.isNaN(f7)) {
                        f7 = next.Y0;
                    }
                }
            }
            if (c6725h90 != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                d = (((float) c6725h90.a((f3 - f5) / f)) * (f7 - f5)) + f5;
            }
            this.q[0].d(d, this.y);
            AS as = this.r;
            if (as != null) {
                double[] dArr = this.y;
                if (dArr.length > 0) {
                    as.d(d, dArr);
                }
            }
            this.m.m(this.x, this.y, fArr, i2 * 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h0(int i, int i2, float f, long j) {
        ArrayList arrayList;
        int i3;
        String[] strArr;
        boolean z;
        C7599kl1 c7599kl1;
        int i4;
        int i5;
        NT nt;
        int i6;
        AbstractC4678Xa2 f2;
        NT nt2;
        int i7;
        Integer num;
        int i8;
        AbstractC4678Xa2 f3;
        NT nt3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        i0();
        int i9 = this.L;
        if (i9 != -1) {
            C7599kl1 c7599kl12 = this.m;
            if (c7599kl12.g1 == -1) {
                c7599kl12.g1 = i9;
            }
        }
        this.f591o.j(this.p, hashSet2);
        ArrayList<AbstractC5404bl1> arrayList2 = this.G;
        if (arrayList2 != null) {
            Iterator<AbstractC5404bl1> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                AbstractC5404bl1 next = it.next();
                if (next instanceof C6131el1) {
                    C6131el1 c6131el1 = (C6131el1) next;
                    Q(new C7599kl1(i, i2, c6131el1, this.m, this.n));
                    int i10 = c6131el1.y;
                    if (i10 != -1) {
                        this.l = i10;
                    }
                } else if (next instanceof C5889dl1) {
                    next.i(hashSet3);
                } else if (next instanceof C6374fl1) {
                    next.i(hashSet);
                } else if (next instanceof C6629gl1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((C6629gl1) next);
                } else {
                    next.q(hashMap);
                    next.i(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.K = (C6629gl1[]) arrayList.toArray(new C6629gl1[0]);
        }
        int i11 = 1;
        if (!hashSet2.isEmpty()) {
            this.I = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    C10000uX0.b bVar = new C10000uX0.b();
                    String str = next2.split(",")[i11];
                    i8 = i11;
                    Iterator<AbstractC5404bl1> it3 = this.G.iterator();
                    while (it3.hasNext()) {
                        AbstractC5404bl1 next3 = it3.next();
                        HashMap<String, NT> hashMap2 = next3.l;
                        if (hashMap2 != null && (nt3 = hashMap2.get(str)) != null) {
                            bVar.a(next3.h, nt3);
                        }
                    }
                    f3 = AbstractC4678Xa2.e(next2, bVar);
                } else {
                    i8 = i11;
                    f3 = AbstractC4678Xa2.f(next2, j);
                }
                if (f3 != null) {
                    f3.i(next2);
                    this.I.put(next2, f3);
                }
                i11 = i8;
            }
            i3 = i11;
            ArrayList<AbstractC5404bl1> arrayList3 = this.G;
            if (arrayList3 != null) {
                Iterator<AbstractC5404bl1> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    AbstractC5404bl1 next4 = it4.next();
                    if (next4 instanceof C5646cl1) {
                        next4.f(this.I);
                    }
                }
            }
            this.f591o.e(this.I, 0);
            this.p.e(this.I, 100);
            for (String str2 : this.I.keySet()) {
                if (hashMap.containsKey(str2) && (num = hashMap.get(str2)) != null) {
                    i7 = num.intValue();
                } else {
                    i7 = 0;
                }
                AbstractC4678Xa2 abstractC4678Xa2 = this.I.get(str2);
                if (abstractC4678Xa2 != null) {
                    abstractC4678Xa2.j(i7);
                }
            }
        } else {
            i3 = 1;
        }
        if (!hashSet.isEmpty()) {
            if (this.H == null) {
                this.H = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.H.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        C10000uX0.b bVar2 = new C10000uX0.b();
                        String str3 = next5.split(",")[i3];
                        Iterator<AbstractC5404bl1> it6 = this.G.iterator();
                        while (it6.hasNext()) {
                            AbstractC5404bl1 next6 = it6.next();
                            HashMap<String, NT> hashMap3 = next6.l;
                            if (hashMap3 != null && (nt2 = hashMap3.get(str3)) != null) {
                                bVar2.a(next6.h, nt2);
                            }
                        }
                        f2 = AbstractC4678Xa2.e(next5, bVar2);
                    } else {
                        f2 = AbstractC4678Xa2.f(next5, j);
                    }
                    if (f2 != null) {
                        f2.i(next5);
                    }
                }
            }
            ArrayList<AbstractC5404bl1> arrayList4 = this.G;
            if (arrayList4 != null) {
                Iterator<AbstractC5404bl1> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    AbstractC5404bl1 next7 = it7.next();
                    if (next7 instanceof C6374fl1) {
                        ((C6374fl1) next7).v(this.H);
                    }
                }
            }
            for (String str4 : this.H.keySet()) {
                if (hashMap.containsKey(str4)) {
                    i6 = hashMap.get(str4).intValue();
                } else {
                    i6 = 0;
                }
                this.H.get(str4).f(i6);
            }
        }
        int size = this.E.size();
        int i12 = size + 2;
        C7599kl1[] c7599kl1Arr = new C7599kl1[i12];
        c7599kl1Arr[0] = this.m;
        c7599kl1Arr[size + 1] = this.n;
        if (this.E.size() > 0 && this.l == AbstractC5404bl1.m) {
            this.l = 0;
        }
        Iterator<C7599kl1> it8 = this.E.iterator();
        int i13 = i3;
        while (it8.hasNext()) {
            c7599kl1Arr[i13] = it8.next();
            i13++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.n.k1.keySet()) {
            if (this.m.k1.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.A = strArr2;
        this.B = new int[strArr2.length];
        int i14 = 0;
        while (true) {
            strArr = this.A;
            if (i14 >= strArr.length) {
                break;
            }
            String str6 = strArr[i14];
            this.B[i14] = 0;
            int i15 = 0;
            while (true) {
                if (i15 >= i12) {
                    break;
                }
                if (c7599kl1Arr[i15].k1.containsKey(str6) && (nt = c7599kl1Arr[i15].k1.get(str6)) != null) {
                    int[] iArr = this.B;
                    iArr[i14] = iArr[i14] + nt.r();
                    break;
                }
                i15++;
            }
            i14++;
        }
        if (c7599kl1Arr[0].g1 != -1) {
            z = i3;
        } else {
            z = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i16 = i3; i16 < i12; i16++) {
            c7599kl1Arr[i16].j(c7599kl1Arr[i16 - 1], zArr, this.A, z);
        }
        int i17 = 0;
        for (int i18 = i3; i18 < length; i18++) {
            if (zArr[i18]) {
                i17++;
            }
        }
        this.x = new int[i17];
        int i19 = 2;
        int max = Math.max(2, i17);
        this.y = new double[max];
        this.z = new double[max];
        int i20 = 0;
        for (int i21 = i3; i21 < length; i21++) {
            if (zArr[i21]) {
                this.x[i20] = i21;
                i20++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[i3] = this.x.length;
        iArr2[0] = i12;
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance(cls, iArr2);
        double[] dArr2 = new double[i12];
        for (int i22 = 0; i22 < i12; i22++) {
            c7599kl1Arr[i22].l(dArr[i22], this.x);
            dArr2[i22] = c7599kl1Arr[i22].Y0;
        }
        int i23 = 0;
        while (true) {
            int[] iArr3 = this.x;
            if (i23 >= iArr3.length) {
                break;
            }
            if (iArr3[i23] < C7599kl1.B1.length) {
                String str7 = C7599kl1.B1[this.x[i23]] + " [";
                for (int i24 = 0; i24 < i12; i24++) {
                    str7 = str7 + dArr[i24][i23];
                }
            }
            i23++;
        }
        this.q = new AS[this.A.length + 1];
        int i25 = 0;
        while (true) {
            String[] strArr3 = this.A;
            if (i25 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i25];
            int i26 = 0;
            int i27 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i26 < i12) {
                if (c7599kl1Arr[i26].t(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i12];
                        int[] iArr4 = new int[i19];
                        iArr4[i3] = c7599kl1Arr[i26].r(str8);
                        i5 = 0;
                        iArr4[0] = i12;
                        dArr4 = (double[][]) Array.newInstance(cls, iArr4);
                    } else {
                        i5 = 0;
                    }
                    C7599kl1 c7599kl13 = c7599kl1Arr[i26];
                    i4 = i25;
                    dArr3[i27] = c7599kl13.Y0;
                    c7599kl13.q(str8, dArr4[i27], i5);
                    i27++;
                } else {
                    i4 = i25;
                }
                i26++;
                i25 = i4;
                i19 = 2;
            }
            int i28 = i25 + 1;
            this.q[i28] = AS.a(this.l, Arrays.copyOf(dArr3, i27), (double[][]) Arrays.copyOf(dArr4, i27));
            i25 = i28;
            i19 = 2;
        }
        this.q[0] = AS.a(this.l, dArr2, dArr);
        if (c7599kl1Arr[0].g1 != -1) {
            int[] iArr5 = new int[i12];
            double[] dArr5 = new double[i12];
            int[] iArr6 = new int[2];
            iArr6[i3] = 2;
            iArr6[0] = i12;
            double[][] dArr6 = (double[][]) Array.newInstance(cls, iArr6);
            for (int i29 = 0; i29 < i12; i29++) {
                iArr5[i29] = c7599kl1Arr[i29].g1;
                dArr5[i29] = c7599kl1.Y0;
                double[] dArr7 = dArr6[i29];
                dArr7[0] = c7599kl1.a1;
                dArr7[i3] = c7599kl1.b1;
            }
            this.r = AS.b(iArr5, dArr5, dArr6);
        }
        this.J = new HashMap<>();
        if (this.G != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f4 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                AbstractC8779pX0 d = AbstractC8779pX0.d(next8);
                if (d != null) {
                    if (d.k() && Float.isNaN(f4)) {
                        f4 = J();
                    }
                    d.i(next8);
                    this.J.put(next8, d);
                }
            }
            Iterator<AbstractC5404bl1> it10 = this.G.iterator();
            while (it10.hasNext()) {
                AbstractC5404bl1 next9 = it10.next();
                if (next9 instanceof C5889dl1) {
                    ((C5889dl1) next9).v(this.J);
                }
            }
            for (AbstractC8779pX0 abstractC8779pX0 : this.J.values()) {
                abstractC8779pX0.j(f4);
            }
        }
    }

    public int i(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h = this.q[0].h();
        if (iArr != null) {
            Iterator<C7599kl1> it = this.E.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().l1;
                i++;
            }
        }
        int i2 = 0;
        for (double d : h) {
            this.q[0].d(d, this.y);
            this.m.m(this.x, this.y, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    public final void i0() {
        C4035Qk1 c4035Qk1 = this.S;
        if (c4035Qk1 == null) {
            return;
        }
        this.m.B(c4035Qk1, c4035Qk1.m);
        C7599kl1 c7599kl1 = this.n;
        C4035Qk1 c4035Qk12 = this.S;
        c7599kl1.B(c4035Qk12, c4035Qk12.n);
    }

    public int j(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] h = this.q[0].h();
        if (iArr != null) {
            Iterator<C7599kl1> it = this.E.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().l1;
                i++;
            }
        }
        if (iArr2 != null) {
            Iterator<C7599kl1> it2 = this.E.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                iArr2[i2] = (int) (it2.next().Z0 * 100.0f);
                i2++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < h.length; i4++) {
            this.q[0].d(h[i4], this.y);
            this.m.n(h[i4], this.x, this.y, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    public void j0(C4035Qk1 c4035Qk1) {
        this.S = c4035Qk1;
    }

    public void k(float[] fArr, int i) {
        AbstractC4678Xa2 abstractC4678Xa2;
        AbstractC4678Xa2 abstractC4678Xa22;
        AbstractC8779pX0 abstractC8779pX0;
        float f;
        int i2 = i;
        float f2 = 1.0f;
        float f3 = 1.0f / (i2 - 1);
        HashMap<String, AbstractC4678Xa2> hashMap = this.I;
        AbstractC8779pX0 abstractC8779pX02 = null;
        if (hashMap == null) {
            abstractC4678Xa2 = null;
        } else {
            abstractC4678Xa2 = hashMap.get("translationX");
        }
        HashMap<String, AbstractC4678Xa2> hashMap2 = this.I;
        if (hashMap2 == null) {
            abstractC4678Xa22 = null;
        } else {
            abstractC4678Xa22 = hashMap2.get("translationY");
        }
        HashMap<String, AbstractC8779pX0> hashMap3 = this.J;
        if (hashMap3 == null) {
            abstractC8779pX0 = null;
        } else {
            abstractC8779pX0 = hashMap3.get("translationX");
        }
        HashMap<String, AbstractC8779pX0> hashMap4 = this.J;
        if (hashMap4 != null) {
            abstractC8779pX02 = hashMap4.get("translationY");
        }
        int i3 = 0;
        while (i3 < i2) {
            float f4 = i3 * f3;
            float f5 = this.u;
            float f6 = 0.0f;
            if (f5 != f2) {
                float f7 = this.t;
                if (f4 < f7) {
                    f4 = 0.0f;
                }
                if (f4 > f7 && f4 < 1.0d) {
                    f4 = Math.min((f4 - f7) * f5, f2);
                }
            }
            double d = f4;
            C6725h90 c6725h90 = this.m.Y;
            Iterator<C7599kl1> it = this.E.iterator();
            float f8 = Float.NaN;
            while (it.hasNext()) {
                C7599kl1 next = it.next();
                C6725h90 c6725h902 = next.Y;
                if (c6725h902 != null) {
                    float f9 = next.Y0;
                    if (f9 < f4) {
                        f6 = f9;
                        c6725h90 = c6725h902;
                    } else if (Float.isNaN(f8)) {
                        f8 = next.Y0;
                    }
                }
            }
            if (c6725h90 != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                d = (((float) c6725h90.a((f4 - f6) / f)) * (f8 - f6)) + f6;
            }
            this.q[0].d(d, this.y);
            AS as = this.r;
            if (as != null) {
                double[] dArr = this.y;
                if (dArr.length > 0) {
                    as.d(d, dArr);
                }
            }
            int i4 = i3 * 2;
            this.m.n(d, this.x, this.y, fArr, i4);
            if (abstractC8779pX0 != null) {
                fArr[i4] = fArr[i4] + abstractC8779pX0.a(f4);
            } else if (abstractC4678Xa2 != null) {
                fArr[i4] = fArr[i4] + abstractC4678Xa2.a(f4);
            }
            if (abstractC8779pX02 != null) {
                int i5 = i4 + 1;
                fArr[i5] = fArr[i5] + abstractC8779pX02.a(f4);
            } else if (abstractC4678Xa22 != null) {
                int i6 = i4 + 1;
                fArr[i6] = fArr[i6] + abstractC4678Xa22.a(f4);
            }
            i3++;
            i2 = i;
            f2 = 1.0f;
        }
    }

    public void l(float f, float[] fArr, int i) {
        this.q[0].d(o(f, null), this.y);
        this.m.s(this.x, this.y, fArr, i);
    }

    public void m(float[] fArr, int i) {
        float f = 1.0f / (i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            this.q[0].d(o(i2 * f, null), this.y);
            this.m.s(this.x, this.y, fArr, i2 * 8);
        }
    }

    public final float o(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.u;
            if (f4 != 1.0d) {
                float f5 = this.t;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && f < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        C6725h90 c6725h90 = this.m.Y;
        Iterator<C7599kl1> it = this.E.iterator();
        float f6 = Float.NaN;
        while (it.hasNext()) {
            C7599kl1 next = it.next();
            C6725h90 c6725h902 = next.Y;
            if (c6725h902 != null) {
                float f7 = next.Y0;
                if (f7 < f) {
                    c6725h90 = c6725h902;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.Y0;
                }
            }
        }
        if (c6725h90 != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (f - f2) / f8;
            f = (((float) c6725h90.a(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) c6725h90.b(d);
            }
        }
        return f;
    }

    public String p() {
        return this.m.h1;
    }

    public int q(String str, float[] fArr, int i) {
        AbstractC4678Xa2 abstractC4678Xa2 = this.I.get(str);
        if (abstractC4678Xa2 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = abstractC4678Xa2.a(i2 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void r(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.q[0].d(d, dArr);
        this.q[0].g(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.m.o(d, this.x, dArr, fArr, dArr2, fArr2);
    }

    public float s() {
        return this.v;
    }

    public float t() {
        return this.w;
    }

    public String toString() {
        return " start: x: " + this.m.a1 + " y: " + this.m.b1 + " end: x: " + this.n.a1 + " y: " + this.n.b1;
    }

    public void u(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float o2 = o(f, this.F);
        AS[] asArr = this.q;
        int i = 0;
        if (asArr != null) {
            double d = o2;
            asArr[0].g(d, this.z);
            this.q[0].d(d, this.y);
            float f4 = this.F[0];
            while (true) {
                dArr = this.z;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * f4;
                i++;
            }
            AS as = this.r;
            if (as != null) {
                double[] dArr2 = this.y;
                if (dArr2.length > 0) {
                    as.d(d, dArr2);
                    this.r.g(d, this.z);
                    this.m.z(f2, f3, fArr, this.x, this.z, this.y);
                    return;
                }
                return;
            }
            this.m.z(f2, f3, fArr, this.x, dArr, this.y);
            return;
        }
        C7599kl1 c7599kl1 = this.n;
        float f5 = c7599kl1.a1;
        C7599kl1 c7599kl12 = this.m;
        float f6 = f5 - c7599kl12.a1;
        float f7 = c7599kl1.b1 - c7599kl12.b1;
        float f8 = (c7599kl1.c1 - c7599kl12.c1) + f6;
        float f9 = (c7599kl1.d1 - c7599kl12.d1) + f7;
        fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
        fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
    }

    public int v() {
        int i = this.m.Z;
        Iterator<C7599kl1> it = this.E.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().Z);
        }
        return Math.max(i, this.n.Z);
    }

    public float w() {
        return this.n.d1;
    }

    public float x() {
        return this.n.c1;
    }

    public float y() {
        return this.n.a1;
    }

    public float z() {
        return this.n.b1;
    }

    public void n(boolean z) {
    }
}
