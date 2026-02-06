package o;

import android.view.View;
import androidx.constraintlayout.widget.e;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: o.jl1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7356jl1 implements Comparable<C7356jl1> {
    public static String[] A1 = {"position", "x", C5738d80.b, "width", "height", "pathRotate"};
    public static final String o1 = "MotionPaths";
    public static final boolean p1 = false;
    public static final boolean q1 = false;
    public static final int r1 = 0;
    public static final int s1 = 1;
    public static final int t1 = 2;
    public static final int u1 = 3;
    public static final int v1 = 4;
    public static final int w1 = 5;
    public static final int x1 = 1;
    public static final int y1 = 0;
    public static final int z1 = 2;
    public C6725h90 X;
    public float Y0;
    public float Z;
    public float Z0;
    public float a1;
    public float b1;
    public float c1;
    public int f1;
    public int g1;
    public float h1;
    public C4523Vk1 i1;
    public LinkedHashMap<String, androidx.constraintlayout.widget.a> j1;
    public int k1;
    public int l1;
    public double[] m1;
    public double[] n1;
    public int Y = 0;
    public float d1 = Float.NaN;
    public float e1 = Float.NaN;

    public C7356jl1() {
        int i = AbstractC6818hX0.f;
        this.f1 = i;
        this.g1 = i;
        this.h1 = Float.NaN;
        this.i1 = null;
        this.j1 = new LinkedHashMap<>();
        this.k1 = 0;
        this.m1 = new double[18];
        this.n1 = new double[18];
    }

    public static float D(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    public static float E(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f5 - f3) * f) + ((f6 - f4) * f2) + f4;
    }

    public void A(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
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

    public void B(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f2;
        float f3 = this.Z0;
        float f4 = this.a1;
        float f5 = this.b1;
        float f6 = this.c1;
        if (iArr.length != 0 && this.m1.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.m1 = new double[i];
            this.n1 = new double[i];
        }
        Arrays.fill(this.m1, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            double[] dArr4 = this.m1;
            int i3 = iArr[i2];
            dArr4[i3] = dArr[i2];
            this.n1[i3] = dArr2[i2];
        }
        float f7 = Float.NaN;
        int i4 = 0;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (true) {
            double[] dArr5 = this.m1;
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
                if (!Double.isNaN(this.m1[i4])) {
                    d = this.m1[i4] + d;
                }
                f2 = f7;
                float f12 = (float) d;
                float f13 = (float) this.n1[i4];
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
        C4523Vk1 c4523Vk1 = this.i1;
        if (c4523Vk1 != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            c4523Vk1.m(f, fArr, fArr2);
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
                view.setRotation((float) (f14 + Math.toDegrees(Math.atan2(cos, sin))));
            }
        } else if (!Float.isNaN(f14)) {
            view.setRotation(f14 + ((float) Math.toDegrees(Math.atan2(f9 + (f11 / 2.0f), f8 + (f10 / 2.0f)))) + 0.0f);
        }
        if (view instanceof InterfaceC8872pv0) {
            ((InterfaceC8872pv0) view).a(f3, f4, f5 + f3, f6 + f4);
            return;
        }
        float f19 = f3 + 0.5f;
        int i5 = (int) f19;
        float f20 = f4 + 0.5f;
        int i6 = (int) f20;
        int i7 = (int) (f19 + f5);
        int i8 = (int) (f20 + f6);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (i9 != view.getMeasuredWidth() || i10 != view.getMeasuredHeight() || z) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view.layout(i5, i6, i7, i8);
    }

    public void C(C4523Vk1 c4523Vk1, C7356jl1 c7356jl1) {
        double d = ((this.Z0 + (this.b1 / 2.0f)) - c7356jl1.Z0) - (c7356jl1.b1 / 2.0f);
        double d2 = ((this.a1 + (this.c1 / 2.0f)) - c7356jl1.a1) - (c7356jl1.c1 / 2.0f);
        this.i1 = c4523Vk1;
        this.Z0 = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.h1)) {
            this.a1 = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.a1 = (float) Math.toRadians(this.h1);
        }
    }

    public void e(e.a aVar) {
        this.X = C6725h90.c(aVar.d.d);
        e.c cVar = aVar.d;
        this.f1 = cVar.e;
        this.g1 = cVar.b;
        this.d1 = cVar.i;
        this.Y = cVar.f;
        this.l1 = cVar.c;
        this.e1 = aVar.c.e;
        this.h1 = aVar.e.D;
        for (String str : aVar.g.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.g.get(str);
            if (aVar2 != null && aVar2.n()) {
                this.j1.put(str, aVar2);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(C7356jl1 c7356jl1) {
        return Float.compare(this.Y0, c7356jl1.Y0);
    }

    public void h(C4523Vk1 c4523Vk1) {
        c4523Vk1.A(this.e1);
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

    public void j(C7356jl1 c7356jl1, boolean[] zArr, String[] strArr, boolean z) {
        boolean i = i(this.Z0, c7356jl1.Z0);
        boolean i2 = i(this.a1, c7356jl1.a1);
        zArr[0] = zArr[0] | i(this.Y0, c7356jl1.Y0);
        boolean z2 = i | i2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | i(this.b1, c7356jl1.b1);
        zArr[4] = i(this.c1, c7356jl1.c1) | zArr[4];
    }

    public void l(double[] dArr, int[] iArr) {
        float[] fArr = {this.Y0, this.Z0, this.a1, this.b1, this.c1, this.d1};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[i2];
                i++;
            }
        }
    }

    public void m(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.b1;
        float f2 = this.c1;
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
        float f = this.Z0;
        float f2 = this.a1;
        float f3 = this.b1;
        float f4 = this.c1;
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
        C4523Vk1 c4523Vk1 = this.i1;
        if (c4523Vk1 != null) {
            float[] fArr2 = new float[2];
            c4523Vk1.m(d, fArr2, new float[2]);
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
        float f2 = this.Z0;
        float f3 = this.a1;
        float f4 = this.b1;
        float f5 = this.c1;
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
        C4523Vk1 c4523Vk1 = this.i1;
        if (c4523Vk1 != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            c4523Vk1.m(d, fArr3, fArr4);
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
        float f = this.Z0;
        float f2 = this.a1;
        float f3 = this.b1;
        float f4 = this.c1;
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
        C4523Vk1 c4523Vk1 = this.i1;
        if (c4523Vk1 != null) {
            float[] fArr2 = new float[2];
            c4523Vk1.m(d, fArr2, new float[2]);
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
        androidx.constraintlayout.widget.a aVar = this.j1.get(str);
        int i2 = 0;
        if (aVar == null) {
            return 0;
        }
        if (aVar.p() == 1) {
            dArr[i] = aVar.k();
            return 1;
        }
        int p = aVar.p();
        float[] fArr = new float[p];
        aVar.l(fArr);
        while (i2 < p) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return p;
    }

    public int r(String str) {
        androidx.constraintlayout.widget.a aVar = this.j1.get(str);
        if (aVar == null) {
            return 0;
        }
        return aVar.p();
    }

    public void s(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.Z0;
        float f2 = this.a1;
        float f3 = this.b1;
        float f4 = this.c1;
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
        C4523Vk1 c4523Vk1 = this.i1;
        if (c4523Vk1 != null) {
            float n = c4523Vk1.n();
            double d = f;
            double d2 = f2;
            f2 = (float) ((this.i1.o() - (d * Math.cos(d2))) - (f4 / 2.0f));
            f = (float) ((n + (Math.sin(d2) * d)) - (f3 / 2.0f));
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
        return this.j1.containsKey(str);
    }

    public void u(EX0 ex0, C7356jl1 c7356jl1, C7356jl1 c7356jl12) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9 = ex0.a / 100.0f;
        this.Z = f9;
        this.Y = ex0.H;
        if (Float.isNaN(ex0.I)) {
            f = f9;
        } else {
            f = ex0.I;
        }
        if (Float.isNaN(ex0.J)) {
            f2 = f9;
        } else {
            f2 = ex0.J;
        }
        float f10 = c7356jl12.b1;
        float f11 = c7356jl1.b1;
        float f12 = f10 - f11;
        float f13 = c7356jl12.c1;
        float f14 = c7356jl1.c1;
        float f15 = f13 - f14;
        this.Y0 = this.Z;
        float f16 = (f11 / 2.0f) + c7356jl1.Z0;
        float f17 = c7356jl1.a1 + (f14 / 2.0f);
        float f18 = f9;
        float f19 = c7356jl12.Z0 + (f10 / 2.0f);
        float f20 = c7356jl12.a1 + (f13 / 2.0f);
        if (f16 > f19) {
            f16 = f19;
            f19 = f16;
        }
        if (f17 <= f20) {
            f17 = f20;
            f20 = f17;
        }
        float f21 = f19 - f16;
        float f22 = f17 - f20;
        float f23 = (f12 * f) / 2.0f;
        this.Z0 = (int) ((f3 + (f21 * f18)) - f23);
        float f24 = (f15 * f2) / 2.0f;
        this.a1 = (int) ((f4 + (f22 * f18)) - f24);
        this.b1 = (int) (f11 + f5);
        this.c1 = (int) (f14 + f6);
        if (Float.isNaN(ex0.K)) {
            f7 = f18;
        } else {
            f7 = ex0.K;
        }
        float f25 = 0.0f;
        if (Float.isNaN(ex0.N)) {
            f8 = 0.0f;
        } else {
            f8 = ex0.N;
        }
        if (!Float.isNaN(ex0.L)) {
            f18 = ex0.L;
        }
        if (!Float.isNaN(ex0.M)) {
            f25 = ex0.M;
        }
        this.k1 = 0;
        this.Z0 = (int) (((c7356jl1.Z0 + (f7 * f21)) + (f25 * f22)) - f23);
        this.a1 = (int) (((c7356jl1.a1 + (f21 * f8)) + (f22 * f18)) - f24);
        this.X = C6725h90.c(ex0.F);
        this.f1 = ex0.G;
    }

    public void v(EX0 ex0, C7356jl1 c7356jl1, C7356jl1 c7356jl12) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = ex0.a / 100.0f;
        this.Z = f7;
        this.Y = ex0.H;
        if (Float.isNaN(ex0.I)) {
            f = f7;
        } else {
            f = ex0.I;
        }
        if (Float.isNaN(ex0.J)) {
            f2 = f7;
        } else {
            f2 = ex0.J;
        }
        float f8 = c7356jl12.b1;
        float f9 = c7356jl1.b1;
        float f10 = c7356jl12.c1;
        float f11 = c7356jl1.c1;
        this.Y0 = this.Z;
        float f12 = c7356jl1.Z0;
        float f13 = c7356jl1.a1;
        float f14 = f7;
        float f15 = (c7356jl12.Z0 + (f8 / 2.0f)) - ((f9 / 2.0f) + f12);
        float f16 = (c7356jl12.a1 + (f10 / 2.0f)) - (f13 + (f11 / 2.0f));
        float f17 = ((f8 - f9) * f) / 2.0f;
        this.Z0 = (int) ((f12 + (f15 * f14)) - f17);
        float f18 = ((f10 - f11) * f2) / 2.0f;
        this.a1 = (int) ((f13 + (f16 * f14)) - f18);
        this.b1 = (int) (f9 + f3);
        this.c1 = (int) (f11 + f4);
        if (Float.isNaN(ex0.K)) {
            f5 = f14;
        } else {
            f5 = ex0.K;
        }
        float f19 = 0.0f;
        if (Float.isNaN(ex0.N)) {
            f6 = 0.0f;
        } else {
            f6 = ex0.N;
        }
        if (!Float.isNaN(ex0.L)) {
            f14 = ex0.L;
        }
        if (!Float.isNaN(ex0.M)) {
            f19 = ex0.M;
        }
        this.k1 = 0;
        this.Z0 = (int) (((c7356jl1.Z0 + (f5 * f15)) + (f19 * f16)) - f17);
        this.a1 = (int) (((c7356jl1.a1 + (f15 * f6)) + (f16 * f14)) - f18);
        this.X = C6725h90.c(ex0.F);
        this.f1 = ex0.G;
    }

    public void w(EX0 ex0, C7356jl1 c7356jl1, C7356jl1 c7356jl12) {
        float f;
        float f2;
        float f3;
        float f4 = ex0.a / 100.0f;
        this.Z = f4;
        this.Y = ex0.H;
        if (Float.isNaN(ex0.I)) {
            f = f4;
        } else {
            f = ex0.I;
        }
        if (Float.isNaN(ex0.J)) {
            f2 = f4;
        } else {
            f2 = ex0.J;
        }
        float f5 = c7356jl12.b1 - c7356jl1.b1;
        float f6 = c7356jl12.c1 - c7356jl1.c1;
        this.Y0 = this.Z;
        if (!Float.isNaN(ex0.K)) {
            f4 = ex0.K;
        }
        float f7 = c7356jl1.Z0;
        float f8 = c7356jl1.b1;
        float f9 = c7356jl1.a1;
        float f10 = c7356jl1.c1;
        float f11 = f4;
        float f12 = c7356jl12.Z0 + (c7356jl12.b1 / 2.0f);
        float f13 = f12 - ((f8 / 2.0f) + f7);
        float f14 = (c7356jl12.a1 + (c7356jl12.c1 / 2.0f)) - ((f10 / 2.0f) + f9);
        float f15 = f13 * f11;
        float f16 = f5 * f;
        float f17 = f16 / 2.0f;
        this.Z0 = (int) ((f7 + f15) - f17);
        float f18 = f14 * f11;
        float f19 = f6 * f2;
        float f20 = f19 / 2.0f;
        this.a1 = (int) ((f9 + f18) - f20);
        this.b1 = (int) (f8 + f16);
        this.c1 = (int) (f10 + f19);
        if (Float.isNaN(ex0.L)) {
            f3 = 0.0f;
        } else {
            f3 = ex0.L;
        }
        this.k1 = 1;
        this.Z0 = ((int) ((c7356jl1.Z0 + f15) - f17)) + ((-f14) * f3);
        this.a1 = ((int) ((c7356jl1.a1 + f18) - f20)) + (f13 * f3);
        this.g1 = this.g1;
        this.X = C6725h90.c(ex0.F);
        this.f1 = ex0.G;
    }

    public void x(int i, int i2, EX0 ex0, C7356jl1 c7356jl1, C7356jl1 c7356jl12) {
        float f;
        float f2;
        float min;
        float f3;
        float f4;
        float f5 = ex0.a / 100.0f;
        this.Z = f5;
        this.Y = ex0.H;
        this.k1 = ex0.O;
        if (Float.isNaN(ex0.I)) {
            f = f5;
        } else {
            f = ex0.I;
        }
        if (Float.isNaN(ex0.J)) {
            f2 = f5;
        } else {
            f2 = ex0.J;
        }
        float f6 = c7356jl12.b1;
        float f7 = c7356jl1.b1;
        float f8 = c7356jl12.c1;
        float f9 = c7356jl1.c1;
        this.Y0 = this.Z;
        this.b1 = (int) (f7 + ((f6 - f7) * f));
        this.c1 = (int) (f9 + ((f8 - f9) * f2));
        if (ex0.O != 2) {
            if (Float.isNaN(ex0.K)) {
                f4 = f5;
            } else {
                f4 = ex0.K;
            }
            float f10 = c7356jl12.Z0;
            float f11 = c7356jl1.Z0;
            this.Z0 = (f4 * (f10 - f11)) + f11;
            if (!Float.isNaN(ex0.L)) {
                f5 = ex0.L;
            }
            float f12 = c7356jl12.a1;
            float f13 = c7356jl1.a1;
            this.a1 = (f5 * (f12 - f13)) + f13;
        } else {
            if (Float.isNaN(ex0.K)) {
                float f14 = c7356jl12.Z0;
                float f15 = c7356jl1.Z0;
                min = ((f14 - f15) * f5) + f15;
            } else {
                min = Math.min(f2, f) * ex0.K;
            }
            this.Z0 = min;
            if (Float.isNaN(ex0.L)) {
                float f16 = c7356jl12.a1;
                float f17 = c7356jl1.a1;
                f3 = (f5 * (f16 - f17)) + f17;
            } else {
                f3 = ex0.L;
            }
            this.a1 = f3;
        }
        this.g1 = c7356jl1.g1;
        this.X = C6725h90.c(ex0.F);
        this.f1 = ex0.G;
    }

    public void y(int i, int i2, EX0 ex0, C7356jl1 c7356jl1, C7356jl1 c7356jl12) {
        float f;
        float f2;
        float f3 = ex0.a / 100.0f;
        this.Z = f3;
        this.Y = ex0.H;
        if (Float.isNaN(ex0.I)) {
            f = f3;
        } else {
            f = ex0.I;
        }
        if (Float.isNaN(ex0.J)) {
            f2 = f3;
        } else {
            f2 = ex0.J;
        }
        float f4 = c7356jl12.b1;
        float f5 = c7356jl1.b1;
        float f6 = c7356jl12.c1;
        float f7 = c7356jl1.c1;
        this.Y0 = this.Z;
        float f8 = c7356jl1.Z0;
        float f9 = c7356jl1.a1;
        float f10 = c7356jl12.Z0 + (f4 / 2.0f);
        float f11 = c7356jl12.a1 + (f6 / 2.0f);
        float f12 = (f4 - f5) * f;
        this.Z0 = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f3)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f2;
        this.a1 = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f3)) - (f13 / 2.0f));
        this.b1 = (int) (f5 + f12);
        this.c1 = (int) (f7 + f13);
        this.k1 = 2;
        if (!Float.isNaN(ex0.K)) {
            this.Z0 = (int) (ex0.K * (i - ((int) this.b1)));
        }
        if (!Float.isNaN(ex0.L)) {
            this.a1 = (int) (ex0.L * (i2 - ((int) this.c1)));
        }
        this.g1 = this.g1;
        this.X = C6725h90.c(ex0.F);
        this.f1 = ex0.G;
    }

    public void z(float f, float f2, float f3, float f4) {
        this.Z0 = f;
        this.a1 = f2;
        this.b1 = f3;
        this.c1 = f4;
    }

    public C7356jl1(int i, int i2, EX0 ex0, C7356jl1 c7356jl1, C7356jl1 c7356jl12) {
        int i3 = AbstractC6818hX0.f;
        this.f1 = i3;
        this.g1 = i3;
        this.h1 = Float.NaN;
        this.i1 = null;
        this.j1 = new LinkedHashMap<>();
        this.k1 = 0;
        this.m1 = new double[18];
        this.n1 = new double[18];
        if (c7356jl1.g1 != AbstractC6818hX0.f) {
            x(i, i2, ex0, c7356jl1, c7356jl12);
            return;
        }
        int i4 = ex0.O;
        if (i4 == 1) {
            w(ex0, c7356jl1, c7356jl12);
        } else if (i4 == 2) {
            y(i, i2, ex0, c7356jl1, c7356jl12);
        } else if (i4 != 3) {
            v(ex0, c7356jl1, c7356jl12);
        } else {
            u(ex0, c7356jl1, c7356jl12);
        }
    }
}
