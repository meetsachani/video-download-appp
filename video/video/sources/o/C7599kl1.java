package o;

import java.util.Arrays;
import java.util.HashMap;
import o.C10054ul1;

/* renamed from: o.kl1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7599kl1 implements Comparable<C7599kl1> {
    public static final int A1 = 2;
    public static String[] B1 = {"position", "x", C5738d80.b, "width", "height", "pathRotate"};
    public static final String p1 = "MotionPaths";
    public static final boolean q1 = false;
    public static final boolean r1 = false;
    public static final int s1 = 0;
    public static final int t1 = 1;
    public static final int u1 = 2;
    public static final int v1 = 3;
    public static final int w1 = 4;
    public static final int x1 = 5;
    public static final int y1 = 1;
    public static final int z1 = 0;
    public String X;
    public C6725h90 Y;
    public float Y0;
    public int Z;
    public float Z0;
    public float a1;
    public float b1;
    public float c1;
    public float d1;
    public float e1;
    public float f1;
    public int g1;
    public String h1;
    public float i1;
    public C4035Qk1 j1;
    public HashMap<String, NT> k1;
    public int l1;
    public int m1;
    public double[] n1;
    public double[] o1;

    public C7599kl1() {
        this.Z = 0;
        this.e1 = Float.NaN;
        this.f1 = Float.NaN;
        this.g1 = -1;
        this.h1 = null;
        this.i1 = Float.NaN;
        this.j1 = null;
        this.k1 = new HashMap<>();
        this.l1 = 0;
        this.n1 = new double[18];
        this.o1 = new double[18];
    }

    public static float C(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    public static float D(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f5 - f3) * f) + ((f6 - f4) * f2) + f4;
    }

    public void A(float f, C10054ul1 c10054ul1, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f2;
        float f3 = this.a1;
        float f4 = this.b1;
        float f5 = this.c1;
        float f6 = this.d1;
        if (iArr.length != 0 && this.n1.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.n1 = new double[i];
            this.o1 = new double[i];
        }
        Arrays.fill(this.n1, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            double[] dArr4 = this.n1;
            int i3 = iArr[i2];
            dArr4[i3] = dArr[i2];
            this.o1[i3] = dArr2[i2];
        }
        float f7 = Float.NaN;
        int i4 = 0;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (true) {
            double[] dArr5 = this.n1;
            if (i4 >= dArr5.length) {
                break;
            }
            double d = 0.0d;
            if (Double.isNaN(dArr5[i4]) && (dArr3 == null || dArr3[i4] == 0.0d)) {
                f2 = f7;
            } else {
                if (dArr3 != null) {
                    d = dArr3[i4];
                }
                if (!Double.isNaN(this.n1[i4])) {
                    d = this.n1[i4] + d;
                }
                f2 = f7;
                float f12 = (float) d;
                float f13 = (float) this.o1[i4];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                    f7 = f12;
                                }
                            } else {
                                f7 = f2;
                                f11 = f13;
                                f6 = f12;
                            }
                        } else {
                            f7 = f2;
                            f10 = f13;
                            f5 = f12;
                        }
                    } else {
                        f7 = f2;
                        f9 = f13;
                        f4 = f12;
                    }
                } else {
                    f7 = f2;
                    f8 = f13;
                    f3 = f12;
                }
                i4++;
            }
            f7 = f2;
            i4++;
        }
        float f14 = f7;
        C4035Qk1 c4035Qk1 = this.j1;
        if (c4035Qk1 != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            c4035Qk1.r(f, fArr, fArr2);
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr2[0];
            float f18 = fArr2[1];
            double d2 = f15;
            double d3 = f3;
            double d4 = f4;
            f3 = (float) ((d2 + (Math.sin(d4) * d3)) - (f5 / 2.0f));
            f4 = (float) ((f16 - (Math.cos(d4) * d3)) - (f6 / 2.0f));
            double d5 = f17;
            double d6 = f8;
            double d7 = f9;
            float sin = (float) (d5 + (Math.sin(d4) * d6) + (Math.cos(d4) * d3 * d7));
            float cos = (float) ((f18 - (d6 * Math.cos(d4))) + (Math.sin(d4) * d3 * d7));
            if (dArr2.length >= 2) {
                dArr2[0] = sin;
                dArr2[1] = cos;
            }
            if (!Float.isNaN(f14)) {
                c10054ul1.R((float) (f14 + Math.toDegrees(Math.atan2(cos, sin))));
            }
        } else if (!Float.isNaN(f14)) {
            c10054ul1.R(((float) (f14 + Math.toDegrees(Math.atan2(f9 + (f11 / 2.0f), f8 + (f10 / 2.0f))))) + 0.0f);
        }
        float f19 = f3 + 0.5f;
        float f20 = f4 + 0.5f;
        c10054ul1.G((int) f19, (int) f20, (int) (f19 + f5), (int) (f20 + f6));
    }

    public void B(C4035Qk1 c4035Qk1, C7599kl1 c7599kl1) {
        double d = ((this.a1 + (this.c1 / 2.0f)) - c7599kl1.a1) - (c7599kl1.c1 / 2.0f);
        double d2 = ((this.b1 + (this.d1 / 2.0f)) - c7599kl1.b1) - (c7599kl1.d1 / 2.0f);
        this.j1 = c4035Qk1;
        this.a1 = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.i1)) {
            this.b1 = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.b1 = (float) Math.toRadians(this.i1);
        }
    }

    public void e(C10054ul1 c10054ul1) {
        UK uk;
        this.Y = C6725h90.c(c10054ul1.i.c);
        C10054ul1.a aVar = c10054ul1.i;
        this.g1 = aVar.d;
        this.h1 = aVar.a;
        this.e1 = aVar.h;
        this.Z = aVar.e;
        this.m1 = aVar.b;
        this.f1 = c10054ul1.j.d;
        UK2 uk2 = c10054ul1.h;
        if (uk2 != null && (uk = uk2.a) != null) {
            this.i1 = uk.K;
        }
        for (String str : c10054ul1.j()) {
            NT i = c10054ul1.i(str);
            if (i != null && i.q()) {
                this.k1.put(str, i);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(C7599kl1 c7599kl1) {
        return Float.compare(this.Z0, c7599kl1.Z0);
    }

    public void h(C4035Qk1 c4035Qk1) {
        c4035Qk1.G(this.f1);
    }

    public final boolean i(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f - f2) <= 1.0E-6f) {
                return false;
            }
            return true;
        } else if (Float.isNaN(f) == Float.isNaN(f2)) {
            return false;
        } else {
            return true;
        }
    }

    public void j(C7599kl1 c7599kl1, boolean[] zArr, String[] strArr, boolean z) {
        boolean z2;
        boolean i = i(this.a1, c7599kl1.a1);
        boolean i2 = i(this.b1, c7599kl1.b1);
        boolean z3 = false;
        zArr[0] = zArr[0] | i(this.Z0, c7599kl1.Z0);
        boolean z4 = zArr[1];
        if (!i && !i2 && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        zArr[1] = z4 | z2;
        boolean z5 = zArr[2];
        if (i || i2 || z) {
            z3 = true;
        }
        zArr[2] = z5 | z3;
        zArr[3] = zArr[3] | i(this.c1, c7599kl1.c1);
        zArr[4] = i(this.d1, c7599kl1.d1) | zArr[4];
    }

    public void l(double[] dArr, int[] iArr) {
        float[] fArr = {this.Z0, this.a1, this.b1, this.c1, this.d1, this.e1};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[i2];
                i++;
            }
        }
    }

    public void m(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.c1;
        float f2 = this.d1;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 3) {
                if (i3 == 4) {
                    f2 = f3;
                }
            } else {
                f = f3;
            }
        }
        fArr[i] = f;
        fArr[i + 1] = f2;
    }

    public void n(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.a1;
        float f2 = this.b1;
        float f3 = this.c1;
        float f4 = this.d1;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            f4 = f5;
                        }
                    } else {
                        f3 = f5;
                    }
                } else {
                    f2 = f5;
                }
            } else {
                f = f5;
            }
        }
        C4035Qk1 c4035Qk1 = this.j1;
        if (c4035Qk1 != null) {
            float[] fArr2 = new float[2];
            c4035Qk1.r(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = f6;
            double d3 = f;
            double d4 = f2;
            f = (float) ((d2 + (Math.sin(d4) * d3)) - (f3 / 2.0f));
            f2 = (float) ((f7 - (d3 * Math.cos(d4))) - (f4 / 2.0f));
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    public void o(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float f2 = this.a1;
        float f3 = this.b1;
        float f4 = this.c1;
        float f5 = this.d1;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            f5 = f10;
                            f9 = f11;
                        }
                    } else {
                        f4 = f10;
                        f7 = f11;
                    }
                } else {
                    f3 = f10;
                    f8 = f11;
                }
            } else {
                f2 = f10;
                f6 = f11;
            }
        }
        float f12 = (f7 / 2.0f) + f6;
        float f13 = (f9 / 2.0f) + f8;
        C4035Qk1 c4035Qk1 = this.j1;
        if (c4035Qk1 != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            c4035Qk1.r(d, fArr3, fArr4);
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr4[0];
            float f17 = fArr4[1];
            f = 2.0f;
            double d2 = f2;
            double d3 = f3;
            f2 = (float) ((f14 + (Math.sin(d3) * d2)) - (f4 / 2.0f));
            f3 = (float) ((f15 - (Math.cos(d3) * d2)) - (f5 / 2.0f));
            double d4 = f6;
            double d5 = f8;
            f13 = (float) ((f17 - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f12 = (float) (f16 + (Math.sin(d3) * d4) + (Math.cos(d3) * d5));
        } else {
            f = 2.0f;
        }
        fArr[0] = f2 + (f4 / f) + 0.0f;
        fArr[1] = f3 + (f5 / f) + 0.0f;
        fArr2[0] = f12;
        fArr2[1] = f13;
    }

    public void p(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.a1;
        float f2 = this.b1;
        float f3 = this.c1;
        float f4 = this.d1;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            f4 = f5;
                        }
                    } else {
                        f3 = f5;
                    }
                } else {
                    f2 = f5;
                }
            } else {
                f = f5;
            }
        }
        C4035Qk1 c4035Qk1 = this.j1;
        if (c4035Qk1 != null) {
            float[] fArr2 = new float[2];
            c4035Qk1.r(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = f6;
            double d3 = f;
            double d4 = f2;
            f = (float) ((d2 + (Math.sin(d4) * d3)) - (f3 / 2.0f));
            f2 = (float) ((f7 - (d3 * Math.cos(d4))) - (f4 / 2.0f));
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    public int q(String str, double[] dArr, int i) {
        NT nt = this.k1.get(str);
        int i2 = 0;
        if (nt == null) {
            return 0;
        }
        if (nt.r() == 1) {
            dArr[i] = nt.n();
            return 1;
        }
        int r = nt.r();
        float[] fArr = new float[r];
        nt.o(fArr);
        while (i2 < r) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return r;
    }

    public int r(String str) {
        NT nt = this.k1.get(str);
        if (nt == null) {
            return 0;
        }
        return nt.r();
    }

    public void s(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.a1;
        float f2 = this.b1;
        float f3 = this.c1;
        float f4 = this.d1;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            f4 = f5;
                        }
                    } else {
                        f3 = f5;
                    }
                } else {
                    f2 = f5;
                }
            } else {
                f = f5;
            }
        }
        C4035Qk1 c4035Qk1 = this.j1;
        if (c4035Qk1 != null) {
            float s = c4035Qk1.s();
            double d = f;
            double d2 = f2;
            f2 = (float) ((this.j1.t() - (d * Math.cos(d2))) - (f4 / 2.0f));
            f = (float) ((s + (Math.sin(d2) * d)) - (f3 / 2.0f));
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i] = f + 0.0f;
        fArr[i + 1] = f2 + 0.0f;
        fArr[i + 2] = f6 + 0.0f;
        fArr[i + 3] = f2 + 0.0f;
        fArr[i + 4] = f6 + 0.0f;
        fArr[i + 5] = f7 + 0.0f;
        fArr[i + 6] = f + 0.0f;
        fArr[i + 7] = f7 + 0.0f;
    }

    public boolean t(String str) {
        return this.k1.containsKey(str);
    }

    public void u(C6131el1 c6131el1, C7599kl1 c7599kl1, C7599kl1 c7599kl12) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = c6131el1.h / 100.0f;
        this.Y0 = f7;
        this.Z = c6131el1.B;
        if (Float.isNaN(c6131el1.C)) {
            f = f7;
        } else {
            f = c6131el1.C;
        }
        if (Float.isNaN(c6131el1.D)) {
            f2 = f7;
        } else {
            f2 = c6131el1.D;
        }
        float f8 = c7599kl12.c1;
        float f9 = c7599kl1.c1;
        float f10 = c7599kl12.d1;
        float f11 = c7599kl1.d1;
        this.Z0 = this.Y0;
        float f12 = c7599kl1.a1;
        float f13 = c7599kl1.b1;
        float f14 = f7;
        float f15 = (c7599kl12.a1 + (f8 / 2.0f)) - ((f9 / 2.0f) + f12);
        float f16 = (c7599kl12.b1 + (f10 / 2.0f)) - (f13 + (f11 / 2.0f));
        float f17 = ((f8 - f9) * f) / 2.0f;
        this.a1 = (int) ((f12 + (f15 * f14)) - f17);
        float f18 = ((f10 - f11) * f2) / 2.0f;
        this.b1 = (int) ((f13 + (f16 * f14)) - f18);
        this.c1 = (int) (f9 + f3);
        this.d1 = (int) (f11 + f4);
        if (Float.isNaN(c6131el1.E)) {
            f5 = f14;
        } else {
            f5 = c6131el1.E;
        }
        float f19 = 0.0f;
        if (Float.isNaN(c6131el1.H)) {
            f6 = 0.0f;
        } else {
            f6 = c6131el1.H;
        }
        if (!Float.isNaN(c6131el1.F)) {
            f14 = c6131el1.F;
        }
        if (!Float.isNaN(c6131el1.G)) {
            f19 = c6131el1.G;
        }
        this.l1 = 0;
        this.a1 = (int) (((c7599kl1.a1 + (f5 * f15)) + (f19 * f16)) - f17);
        this.b1 = (int) (((c7599kl1.b1 + (f15 * f6)) + (f16 * f14)) - f18);
        this.Y = C6725h90.c(c6131el1.z);
        this.g1 = c6131el1.A;
    }

    public void v(C6131el1 c6131el1, C7599kl1 c7599kl1, C7599kl1 c7599kl12) {
        float f;
        float f2;
        float f3;
        float f4 = c6131el1.h / 100.0f;
        this.Y0 = f4;
        this.Z = c6131el1.B;
        if (Float.isNaN(c6131el1.C)) {
            f = f4;
        } else {
            f = c6131el1.C;
        }
        if (Float.isNaN(c6131el1.D)) {
            f2 = f4;
        } else {
            f2 = c6131el1.D;
        }
        float f5 = c7599kl12.c1 - c7599kl1.c1;
        float f6 = c7599kl12.d1 - c7599kl1.d1;
        this.Z0 = this.Y0;
        if (!Float.isNaN(c6131el1.E)) {
            f4 = c6131el1.E;
        }
        float f7 = c7599kl1.a1;
        float f8 = c7599kl1.c1;
        float f9 = c7599kl1.b1;
        float f10 = c7599kl1.d1;
        float f11 = f4;
        float f12 = c7599kl12.a1 + (c7599kl12.c1 / 2.0f);
        float f13 = f12 - ((f8 / 2.0f) + f7);
        float f14 = (c7599kl12.b1 + (c7599kl12.d1 / 2.0f)) - ((f10 / 2.0f) + f9);
        float f15 = f13 * f11;
        float f16 = f5 * f;
        float f17 = f16 / 2.0f;
        this.a1 = (int) ((f7 + f15) - f17);
        float f18 = f14 * f11;
        float f19 = f6 * f2;
        float f20 = f19 / 2.0f;
        this.b1 = (int) ((f9 + f18) - f20);
        this.c1 = (int) (f8 + f16);
        this.d1 = (int) (f10 + f19);
        if (Float.isNaN(c6131el1.F)) {
            f3 = 0.0f;
        } else {
            f3 = c6131el1.F;
        }
        this.l1 = 1;
        this.a1 = ((int) ((c7599kl1.a1 + f15) - f17)) + ((-f14) * f3);
        this.b1 = ((int) ((c7599kl1.b1 + f18) - f20)) + (f13 * f3);
        this.h1 = this.h1;
        this.Y = C6725h90.c(c6131el1.z);
        this.g1 = c6131el1.A;
    }

    public void w(int i, int i2, C6131el1 c6131el1, C7599kl1 c7599kl1, C7599kl1 c7599kl12) {
        float f;
        float f2;
        float f3;
        float min;
        float f4;
        float f5;
        float f6 = c6131el1.h / 100.0f;
        this.Y0 = f6;
        this.Z = c6131el1.B;
        this.l1 = c6131el1.I;
        if (Float.isNaN(c6131el1.C)) {
            f = f6;
        } else {
            f = c6131el1.C;
        }
        if (Float.isNaN(c6131el1.D)) {
            f2 = f6;
        } else {
            f2 = c6131el1.D;
        }
        float f7 = c7599kl12.c1;
        float f8 = c7599kl1.c1;
        float f9 = c7599kl12.d1;
        float f10 = c7599kl1.d1;
        this.Z0 = this.Y0;
        this.c1 = (int) (f8 + ((f7 - f8) * f));
        this.d1 = (int) (f10 + ((f9 - f10) * f2));
        int i3 = c6131el1.I;
        if (i3 != 1) {
            if (i3 != 2) {
                if (Float.isNaN(c6131el1.E)) {
                    f5 = f6;
                } else {
                    f5 = c6131el1.E;
                }
                float f11 = c7599kl12.a1;
                float f12 = c7599kl1.a1;
                this.a1 = (f5 * (f11 - f12)) + f12;
                if (!Float.isNaN(c6131el1.F)) {
                    f6 = c6131el1.F;
                }
                float f13 = c7599kl12.b1;
                float f14 = c7599kl1.b1;
                this.b1 = (f6 * (f13 - f14)) + f14;
            } else {
                if (Float.isNaN(c6131el1.E)) {
                    float f15 = c7599kl12.a1;
                    float f16 = c7599kl1.a1;
                    min = ((f15 - f16) * f6) + f16;
                } else {
                    min = Math.min(f2, f) * c6131el1.E;
                }
                this.a1 = min;
                if (Float.isNaN(c6131el1.F)) {
                    float f17 = c7599kl12.b1;
                    float f18 = c7599kl1.b1;
                    f4 = (f6 * (f17 - f18)) + f18;
                } else {
                    f4 = c6131el1.F;
                }
                this.b1 = f4;
            }
        } else {
            if (Float.isNaN(c6131el1.E)) {
                f3 = f6;
            } else {
                f3 = c6131el1.E;
            }
            float f19 = c7599kl12.a1;
            float f20 = c7599kl1.a1;
            this.a1 = (f3 * (f19 - f20)) + f20;
            if (!Float.isNaN(c6131el1.F)) {
                f6 = c6131el1.F;
            }
            float f21 = c7599kl12.b1;
            float f22 = c7599kl1.b1;
            this.b1 = (f6 * (f21 - f22)) + f22;
        }
        this.h1 = c7599kl1.h1;
        this.Y = C6725h90.c(c6131el1.z);
        this.g1 = c6131el1.A;
    }

    public void x(int i, int i2, C6131el1 c6131el1, C7599kl1 c7599kl1, C7599kl1 c7599kl12) {
        float f;
        float f2;
        float f3 = c6131el1.h / 100.0f;
        this.Y0 = f3;
        this.Z = c6131el1.B;
        if (Float.isNaN(c6131el1.C)) {
            f = f3;
        } else {
            f = c6131el1.C;
        }
        if (Float.isNaN(c6131el1.D)) {
            f2 = f3;
        } else {
            f2 = c6131el1.D;
        }
        float f4 = c7599kl12.c1;
        float f5 = c7599kl1.c1;
        float f6 = c7599kl12.d1;
        float f7 = c7599kl1.d1;
        this.Z0 = this.Y0;
        float f8 = c7599kl1.a1;
        float f9 = c7599kl1.b1;
        float f10 = c7599kl12.a1 + (f4 / 2.0f);
        float f11 = c7599kl12.b1 + (f6 / 2.0f);
        float f12 = (f4 - f5) * f;
        this.a1 = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f3)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f2;
        this.b1 = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f3)) - (f13 / 2.0f));
        this.c1 = (int) (f5 + f12);
        this.d1 = (int) (f7 + f13);
        this.l1 = 2;
        if (!Float.isNaN(c6131el1.E)) {
            this.a1 = (int) (c6131el1.E * (i - ((int) this.c1)));
        }
        if (!Float.isNaN(c6131el1.F)) {
            this.b1 = (int) (c6131el1.F * (i2 - ((int) this.d1)));
        }
        this.h1 = this.h1;
        this.Y = C6725h90.c(c6131el1.z);
        this.g1 = c6131el1.A;
    }

    public void y(float f, float f2, float f3, float f4) {
        this.a1 = f;
        this.b1 = f2;
        this.c1 = f3;
        this.d1 = f4;
    }

    public void z(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            int i2 = iArr[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            f6 = f7;
                        }
                    } else {
                        f4 = f7;
                    }
                } else {
                    f5 = f7;
                }
            } else {
                f3 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    public C7599kl1(int i, int i2, C6131el1 c6131el1, C7599kl1 c7599kl1, C7599kl1 c7599kl12) {
        this.Z = 0;
        this.e1 = Float.NaN;
        this.f1 = Float.NaN;
        this.g1 = -1;
        this.h1 = null;
        this.i1 = Float.NaN;
        this.j1 = null;
        this.k1 = new HashMap<>();
        this.l1 = 0;
        this.n1 = new double[18];
        this.o1 = new double[18];
        if (c7599kl1.h1 != null) {
            w(i, i2, c6131el1, c7599kl1, c7599kl12);
            return;
        }
        int i3 = c6131el1.I;
        if (i3 == 1) {
            v(c6131el1, c7599kl1, c7599kl12);
        } else if (i3 != 2) {
            u(c6131el1, c7599kl1, c7599kl12);
        } else {
            x(i, i2, c6131el1, c7599kl1, c7599kl12);
        }
    }
}
