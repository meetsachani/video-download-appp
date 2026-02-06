package o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.AbstractC6265fI2;
import o.AbstractC7490kI2;
import o.PH2;

/* renamed from: o.Vk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4523Vk1 {
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 3;
    public static final int R = 4;
    public static final int S = 5;
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    public static final int W = 3;
    public static final int X = 4;
    public static final int Y = 5;
    public static final int Z = 6;
    public static final int a0 = 1;
    public static final int b0 = 2;
    public static final String c0 = "MotionController";
    public static final boolean d0 = false;
    public static final boolean e0 = false;
    public static final int f0 = 0;
    public static final int g0 = 1;
    public static final int h0 = 2;
    public static final int i0 = 3;
    public static final int j0 = 4;
    public static final int k0 = 5;
    public static final int l0 = -1;
    public static final int m0 = -2;
    public static final int n0 = -3;
    public HashMap<String, AbstractC7490kI2> B;
    public HashMap<String, AbstractC6265fI2> C;
    public HashMap<String, PH2> D;
    public IX0[] E;
    public int F;
    public int G;
    public View H;
    public int I;
    public float J;
    public Interpolator K;
    public boolean L;
    public String[] M;
    public View b;
    public int c;
    public String e;
    public AS[] k;
    public AS l;
    public float p;
    public float q;
    public int[] r;
    public double[] s;
    public double[] t;
    public String[] u;
    public int[] v;
    public Rect a = new Rect();
    public boolean d = false;
    public int f = -1;
    public C7356jl1 g = new C7356jl1();
    public C7356jl1 h = new C7356jl1();
    public C4232Sk1 i = new C4232Sk1();
    public C4232Sk1 j = new C4232Sk1();
    public float m = Float.NaN;
    public float n = 0.0f;

    /* renamed from: o  reason: collision with root package name */
    public float f648o = 1.0f;
    public int w = 4;
    public float[] x = new float[4];
    public ArrayList<C7356jl1> y = new ArrayList<>();
    public float[] z = new float[1];
    public ArrayList<AbstractC6818hX0> A = new ArrayList<>();

    /* renamed from: o.Vk1$a */
    /* loaded from: classes.dex */
    public class a implements Interpolator {
        public final /* synthetic */ C6725h90 a;

        public a(C6725h90 c6725h90) {
            this.a = c6725h90;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.a.a(f);
        }
    }

    public C4523Vk1(View view) {
        int i = AbstractC6818hX0.f;
        this.F = i;
        this.G = i;
        this.H = null;
        this.I = i;
        this.J = Float.NaN;
        this.K = null;
        this.L = false;
        Z(view);
    }

    public static Interpolator v(Context context, int i, String str, int i2) {
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 5) {
                                    return null;
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new a(C6725h90.c(str));
        }
        return AnimationUtils.loadInterpolator(context, i2);
    }

    public double[] A(double d) {
        this.k[0].d(d, this.s);
        AS as = this.l;
        if (as != null) {
            double[] dArr = this.s;
            if (dArr.length > 0) {
                as.d(d, dArr);
            }
        }
        return this.s;
    }

    public FX0 B(int i, int i2, float f, float f2) {
        int i3;
        int i4;
        float f3;
        float f4;
        RectF rectF = new RectF();
        C7356jl1 c7356jl1 = this.g;
        float f5 = c7356jl1.Z0;
        rectF.left = f5;
        float f6 = c7356jl1.a1;
        rectF.top = f6;
        rectF.right = f5 + c7356jl1.b1;
        rectF.bottom = f6 + c7356jl1.c1;
        RectF rectF2 = new RectF();
        C7356jl1 c7356jl12 = this.h;
        float f7 = c7356jl12.Z0;
        rectF2.left = f7;
        float f8 = c7356jl12.a1;
        rectF2.top = f8;
        rectF2.right = f7 + c7356jl12.b1;
        rectF2.bottom = f8 + c7356jl12.c1;
        Iterator<AbstractC6818hX0> it = this.A.iterator();
        while (it.hasNext()) {
            AbstractC6818hX0 next = it.next();
            if (next instanceof FX0) {
                FX0 fx0 = (FX0) next;
                i3 = i;
                i4 = i2;
                f3 = f;
                f4 = f2;
                if (fx0.r(i3, i4, rectF, rectF2, f3, f4)) {
                    return fx0;
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

    public void C(float f, int i, int i2, float f2, float f3, float[] fArr) {
        AbstractC6265fI2 abstractC6265fI2;
        AbstractC6265fI2 abstractC6265fI22;
        AbstractC6265fI2 abstractC6265fI23;
        AbstractC6265fI2 abstractC6265fI24;
        AbstractC6265fI2 abstractC6265fI25;
        PH2 ph2;
        PH2 ph22;
        PH2 ph23;
        PH2 ph24;
        float j = j(f, this.z);
        HashMap<String, AbstractC6265fI2> hashMap = this.C;
        PH2 ph25 = null;
        if (hashMap == null) {
            abstractC6265fI2 = null;
        } else {
            abstractC6265fI2 = hashMap.get("translationX");
        }
        HashMap<String, AbstractC6265fI2> hashMap2 = this.C;
        if (hashMap2 == null) {
            abstractC6265fI22 = null;
        } else {
            abstractC6265fI22 = hashMap2.get("translationY");
        }
        HashMap<String, AbstractC6265fI2> hashMap3 = this.C;
        if (hashMap3 == null) {
            abstractC6265fI23 = null;
        } else {
            abstractC6265fI23 = hashMap3.get(AbstractC6818hX0.i);
        }
        HashMap<String, AbstractC6265fI2> hashMap4 = this.C;
        if (hashMap4 == null) {
            abstractC6265fI24 = null;
        } else {
            abstractC6265fI24 = hashMap4.get("scaleX");
        }
        HashMap<String, AbstractC6265fI2> hashMap5 = this.C;
        if (hashMap5 == null) {
            abstractC6265fI25 = null;
        } else {
            abstractC6265fI25 = hashMap5.get("scaleY");
        }
        HashMap<String, PH2> hashMap6 = this.D;
        if (hashMap6 == null) {
            ph2 = null;
        } else {
            ph2 = hashMap6.get("translationX");
        }
        HashMap<String, PH2> hashMap7 = this.D;
        if (hashMap7 == null) {
            ph22 = null;
        } else {
            ph22 = hashMap7.get("translationY");
        }
        HashMap<String, PH2> hashMap8 = this.D;
        if (hashMap8 == null) {
            ph23 = null;
        } else {
            ph23 = hashMap8.get(AbstractC6818hX0.i);
        }
        HashMap<String, PH2> hashMap9 = this.D;
        if (hashMap9 == null) {
            ph24 = null;
        } else {
            ph24 = hashMap9.get("scaleX");
        }
        HashMap<String, PH2> hashMap10 = this.D;
        if (hashMap10 != null) {
            ph25 = hashMap10.get("scaleY");
        }
        OE2 oe2 = new OE2();
        oe2.b();
        oe2.d(abstractC6265fI23, j);
        oe2.h(abstractC6265fI2, abstractC6265fI22, j);
        oe2.f(abstractC6265fI24, abstractC6265fI25, j);
        oe2.c(ph23, j);
        oe2.g(ph2, ph22, j);
        oe2.e(ph24, ph25, j);
        AS as = this.l;
        if (as != null) {
            double[] dArr = this.s;
            if (dArr.length > 0) {
                double d = j;
                as.d(d, dArr);
                this.l.g(d, this.t);
                this.g.A(f2, f3, fArr, this.r, this.t, this.s);
            }
            oe2.a(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.k != null) {
            double j2 = j(j, this.z);
            this.k[0].g(j2, this.t);
            this.k[0].d(j2, this.s);
            float f4 = this.z[0];
            while (true) {
                double[] dArr2 = this.t;
                if (i3 < dArr2.length) {
                    dArr2[i3] = dArr2[i3] * f4;
                    i3++;
                } else {
                    this.g.A(f2, f3, fArr, this.r, dArr2, this.s);
                    oe2.a(f2, f3, i, i2, fArr);
                    return;
                }
            }
        } else {
            C7356jl1 c7356jl1 = this.h;
            float f5 = c7356jl1.Z0;
            C7356jl1 c7356jl12 = this.g;
            float f6 = f5 - c7356jl12.Z0;
            float f7 = c7356jl1.a1 - c7356jl12.a1;
            float f8 = (c7356jl1.b1 - c7356jl12.b1) + f6;
            float f9 = f7 + (c7356jl1.c1 - c7356jl12.c1);
            fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
            fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
            oe2.b();
            oe2.d(abstractC6265fI23, j);
            oe2.h(abstractC6265fI2, abstractC6265fI22, j);
            oe2.f(abstractC6265fI24, abstractC6265fI25, j);
            oe2.c(ph23, j);
            oe2.g(ph2, ph22, j);
            oe2.e(ph24, ph25, j);
            oe2.a(f2, f3, i, i2, fArr);
        }
    }

    public final float D() {
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
            C6725h90 c6725h90 = this.g.X;
            Iterator<C7356jl1> it = this.y.iterator();
            float f5 = Float.NaN;
            float f6 = 0.0f;
            while (it.hasNext()) {
                C7356jl1 next = it.next();
                C6725h90 c6725h902 = next.X;
                if (c6725h902 != null) {
                    float f7 = next.Z;
                    if (f7 < f4) {
                        c6725h90 = c6725h902;
                        f6 = f7;
                    } else if (Float.isNaN(f5)) {
                        f5 = next.Z;
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
            this.k[0].d(d4, this.s);
            int i2 = i;
            this.g.n(d4, this.r, this.s, fArr, 0);
            if (i2 > 0) {
                f3 += (float) Math.hypot(d2 - fArr[1], d - fArr[0]);
            }
            d = fArr[0];
            d2 = fArr[1];
            i = i2 + 1;
        }
        return f3;
    }

    public float E() {
        return this.g.c1;
    }

    public float F() {
        return this.g.b1;
    }

    public float G() {
        return this.g.Z0;
    }

    public float H() {
        return this.g.a1;
    }

    public int I() {
        return this.G;
    }

    public View J() {
        return this.b;
    }

    public final void K(C7356jl1 c7356jl1) {
        int binarySearch = Collections.binarySearch(this.y, c7356jl1);
        if (binarySearch == 0) {
            Log.e("MotionController", " KeyPath position \"" + c7356jl1.Y0 + "\" outside of range");
        }
        this.y.add((-binarySearch) - 1, c7356jl1);
    }

    public boolean L(View view, float f, long j, C8049mX0 c8049mX0) {
        AbstractC7490kI2.d dVar;
        boolean z;
        View view2;
        View view3;
        float f2;
        float f3;
        double d;
        View view4;
        float f4;
        View view5 = view;
        float j2 = j(f, null);
        int i = this.I;
        if (i != AbstractC6818hX0.f) {
            float f5 = 1.0f / i;
            float floor = ((float) Math.floor(j2 / f5)) * f5;
            float f6 = (j2 % f5) / f5;
            if (!Float.isNaN(this.J)) {
                f6 = (f6 + this.J) % 1.0f;
            }
            Interpolator interpolator = this.K;
            if (interpolator != null) {
                f4 = interpolator.getInterpolation(f6);
            } else if (f6 > 0.5d) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            j2 = (f4 * f5) + floor;
        }
        HashMap<String, AbstractC6265fI2> hashMap = this.C;
        if (hashMap != null) {
            for (AbstractC6265fI2 abstractC6265fI2 : hashMap.values()) {
                abstractC6265fI2.m(view5, j2);
            }
        }
        HashMap<String, AbstractC7490kI2> hashMap2 = this.B;
        if (hashMap2 != null) {
            AbstractC7490kI2.d dVar2 = null;
            boolean z2 = false;
            for (AbstractC7490kI2 abstractC7490kI2 : hashMap2.values()) {
                if (abstractC7490kI2 instanceof AbstractC7490kI2.d) {
                    dVar2 = (AbstractC7490kI2.d) abstractC7490kI2;
                } else {
                    z2 |= abstractC7490kI2.j(view5, j2, j, c8049mX0);
                    view5 = view;
                }
            }
            z = z2;
            dVar = dVar2;
        } else {
            dVar = null;
            z = false;
        }
        AS[] asArr = this.k;
        if (asArr != null) {
            double d2 = j2;
            asArr[0].d(d2, this.s);
            this.k[0].g(d2, this.t);
            AS as = this.l;
            if (as != null) {
                double[] dArr = this.s;
                if (dArr.length > 0) {
                    as.d(d2, dArr);
                    this.l.g(d2, this.t);
                }
            }
            if (!this.L) {
                float f7 = j2;
                f2 = 1.0f;
                d = d2;
                f3 = 0.0f;
                this.g.B(f7, view, this.r, this.s, this.t, null, this.d);
                j2 = f7;
                view3 = view;
                this.d = false;
            } else {
                view3 = view;
                f2 = 1.0f;
                f3 = 0.0f;
                d = d2;
            }
            if (this.G != AbstractC6818hX0.f) {
                if (this.H == null) {
                    this.H = ((View) view3.getParent()).findViewById(this.G);
                }
                if (this.H != null) {
                    float top = (view4.getTop() + this.H.getBottom()) / 2.0f;
                    float left = (this.H.getLeft() + this.H.getRight()) / 2.0f;
                    if (view3.getRight() - view3.getLeft() > 0 && view3.getBottom() - view3.getTop() > 0) {
                        view3.setPivotX(left - view3.getLeft());
                        view3.setPivotY(top - view3.getTop());
                    }
                }
            }
            HashMap<String, AbstractC6265fI2> hashMap3 = this.C;
            if (hashMap3 != null) {
                for (AbstractC6265fI2 abstractC6265fI22 : hashMap3.values()) {
                    if (abstractC6265fI22 instanceof AbstractC6265fI2.d) {
                        double[] dArr2 = this.t;
                        if (dArr2.length > 1) {
                            ((AbstractC6265fI2.d) abstractC6265fI22).n(view3, j2, dArr2[0], dArr2[1]);
                        }
                    }
                    view3 = view;
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.t;
                view2 = view;
                float f8 = j2;
                j2 = f8;
                z |= dVar.k(view2, c8049mX0, f8, j, dArr3[0], dArr3[1]);
            } else {
                view2 = view;
            }
            int i2 = 1;
            while (true) {
                AS[] asArr2 = this.k;
                if (i2 >= asArr2.length) {
                    break;
                }
                asArr2[i2].e(d, this.x);
                C9008qT.b(this.g.j1.get(this.u[i2 - 1]), view2, this.x);
                i2++;
            }
            C4232Sk1 c4232Sk1 = this.i;
            if (c4232Sk1.Y == 0) {
                if (j2 <= f3) {
                    view2.setVisibility(c4232Sk1.Z);
                } else if (j2 >= f2) {
                    view2.setVisibility(this.j.Z);
                } else if (this.j.Z != c4232Sk1.Z) {
                    view2.setVisibility(0);
                }
            }
            if (this.E != null) {
                int i3 = 0;
                while (true) {
                    IX0[] ix0Arr = this.E;
                    if (i3 >= ix0Arr.length) {
                        break;
                    }
                    ix0Arr[i3].A(j2, view2);
                    i3++;
                }
            }
        } else {
            view2 = view;
            C7356jl1 c7356jl1 = this.g;
            float f9 = c7356jl1.Z0;
            C7356jl1 c7356jl12 = this.h;
            float f10 = f9 + ((c7356jl12.Z0 - f9) * j2);
            float f11 = c7356jl1.a1;
            float f12 = f11 + ((c7356jl12.a1 - f11) * j2);
            float f13 = c7356jl1.b1;
            float f14 = c7356jl12.b1;
            float f15 = c7356jl1.c1;
            float f16 = c7356jl12.c1;
            float f17 = f10 + 0.5f;
            int i4 = (int) f17;
            float f18 = f12 + 0.5f;
            int i5 = (int) f18;
            int i6 = (int) (f17 + ((f14 - f13) * j2) + f13);
            int i7 = (int) (f18 + ((f16 - f15) * j2) + f15);
            int i8 = i6 - i4;
            int i9 = i7 - i5;
            if (f14 != f13 || f16 != f15 || this.d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
                this.d = false;
            }
            view2.layout(i4, i5, i6, i7);
        }
        HashMap<String, PH2> hashMap4 = this.D;
        if (hashMap4 != null) {
            for (PH2 ph2 : hashMap4.values()) {
                if (ph2 instanceof PH2.d) {
                    double[] dArr4 = this.t;
                    ((PH2.d) ph2).n(view2, j2, dArr4[0], dArr4[1]);
                } else {
                    ph2.m(view2, j2);
                }
            }
        }
        return z;
    }

    public String M() {
        return this.b.getContext().getResources().getResourceEntryName(this.b.getId());
    }

    public void N(View view, FX0 fx0, float f, float f2, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        C7356jl1 c7356jl1 = this.g;
        float f3 = c7356jl1.Z0;
        rectF.left = f3;
        float f4 = c7356jl1.a1;
        rectF.top = f4;
        rectF.right = f3 + c7356jl1.b1;
        rectF.bottom = f4 + c7356jl1.c1;
        RectF rectF2 = new RectF();
        C7356jl1 c7356jl12 = this.h;
        float f5 = c7356jl12.Z0;
        rectF2.left = f5;
        float f6 = c7356jl12.a1;
        rectF2.top = f6;
        rectF2.right = f5 + c7356jl12.b1;
        rectF2.bottom = f6 + c7356jl12.c1;
        fx0.s(view, rectF, rectF2, f, f2, strArr, fArr);
    }

    public final void O(C7356jl1 c7356jl1) {
        c7356jl1.z((int) this.b.getX(), (int) this.b.getY(), this.b.getWidth(), this.b.getHeight());
    }

    public void P() {
        this.d = true;
    }

    public void Q(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    int i4 = rect.left + rect.right;
                    rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
                    rect2.top = (i4 - rect.height()) / 2;
                    rect2.right = rect2.left + rect.width();
                    rect2.bottom = rect2.top + rect.height();
                    return;
                }
                int i5 = rect.left + rect.right;
                rect2.left = ((rect.height() / 2) + rect.top) - (i5 / 2);
                rect2.top = i3 - ((i5 + rect.height()) / 2);
                rect2.right = rect2.left + rect.width();
                rect2.bottom = rect2.top + rect.height();
                return;
            }
            int i6 = rect.left + rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i6 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.top = i3 - ((i7 + rect.height()) / 2);
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    public void R(View view) {
        C7356jl1 c7356jl1 = this.g;
        c7356jl1.Z = 0.0f;
        c7356jl1.Y0 = 0.0f;
        this.L = true;
        c7356jl1.z(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.h.z(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.i.u(view);
        this.j.u(view);
    }

    public void S(int i) {
        this.g.Y = i;
    }

    public void T(Rect rect, androidx.constraintlayout.widget.e eVar, int i, int i2) {
        C4523Vk1 c4523Vk1;
        int i3 = eVar.e;
        if (i3 != 0) {
            c4523Vk1 = this;
            c4523Vk1.Q(rect, this.a, i3, i, i2);
            rect = c4523Vk1.a;
        } else {
            c4523Vk1 = this;
        }
        C7356jl1 c7356jl1 = c4523Vk1.h;
        c7356jl1.Z = 1.0f;
        c7356jl1.Y0 = 1.0f;
        O(c7356jl1);
        c4523Vk1.h.z(rect.left, rect.top, rect.width(), rect.height());
        c4523Vk1.h.e(eVar.q0(c4523Vk1.c));
        c4523Vk1.j.t(rect, eVar, i3, c4523Vk1.c);
    }

    public void U(int i) {
        this.F = i;
    }

    public void V(View view) {
        C7356jl1 c7356jl1 = this.g;
        c7356jl1.Z = 0.0f;
        c7356jl1.Y0 = 0.0f;
        c7356jl1.z(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.i.u(view);
    }

    public void W(Rect rect, androidx.constraintlayout.widget.e eVar, int i, int i2) {
        C4523Vk1 c4523Vk1;
        Rect rect2;
        int i3 = eVar.e;
        if (i3 != 0) {
            c4523Vk1 = this;
            rect2 = rect;
            c4523Vk1.Q(rect2, this.a, i3, i, i2);
        } else {
            c4523Vk1 = this;
            rect2 = rect;
        }
        C7356jl1 c7356jl1 = c4523Vk1.g;
        c7356jl1.Z = 0.0f;
        c7356jl1.Y0 = 0.0f;
        O(c7356jl1);
        c4523Vk1.g.z(rect2.left, rect2.top, rect2.width(), rect2.height());
        e.a q0 = eVar.q0(c4523Vk1.c);
        c4523Vk1.g.e(q0);
        c4523Vk1.m = q0.d.g;
        c4523Vk1.i.t(rect2, eVar, i3, c4523Vk1.c);
        c4523Vk1.G = q0.f.i;
        e.c cVar = q0.d;
        c4523Vk1.I = cVar.k;
        c4523Vk1.J = cVar.j;
        Context context = c4523Vk1.b.getContext();
        e.c cVar2 = q0.d;
        c4523Vk1.K = v(context, cVar2.m, cVar2.l, cVar2.n);
    }

    public void X(C6520gI2 c6520gI2, View view, int i, int i2, int i3) {
        C7356jl1 c7356jl1 = this.g;
        c7356jl1.Z = 0.0f;
        c7356jl1.Y0 = 0.0f;
        Rect rect = new Rect();
        if (i != 1) {
            if (i == 2) {
                int i4 = c6520gI2.b + c6520gI2.d;
                rect.left = i3 - (((c6520gI2.c + c6520gI2.e) + c6520gI2.c()) / 2);
                rect.top = (i4 - c6520gI2.b()) / 2;
                rect.right = rect.left + c6520gI2.c();
                rect.bottom = rect.top + c6520gI2.b();
            }
        } else {
            int i5 = c6520gI2.b + c6520gI2.d;
            rect.left = ((c6520gI2.c + c6520gI2.e) - c6520gI2.c()) / 2;
            rect.top = i2 - ((i5 + c6520gI2.b()) / 2);
            rect.right = rect.left + c6520gI2.c();
            rect.bottom = rect.top + c6520gI2.b();
        }
        this.g.z(rect.left, rect.top, rect.width(), rect.height());
        this.i.s(rect, view, i, c6520gI2.a);
    }

    public void Y(int i) {
        this.G = i;
        this.H = null;
    }

    public void Z(View view) {
        this.b = view;
        this.c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.e = ((ConstraintLayout.b) layoutParams).a();
        }
    }

    public void a(AbstractC6818hX0 abstractC6818hX0) {
        this.A.add(abstractC6818hX0);
    }

    public void a0(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        boolean z;
        C7356jl1 c7356jl1;
        C7356jl1[] c7356jl1Arr;
        androidx.constraintlayout.widget.a aVar;
        int i3;
        AbstractC7490kI2 i4;
        androidx.constraintlayout.widget.a aVar2;
        int i5;
        Integer num;
        AbstractC6265fI2 l;
        androidx.constraintlayout.widget.a aVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i6 = this.F;
        if (i6 != AbstractC6818hX0.f) {
            this.g.f1 = i6;
        }
        this.i.l(this.j, hashSet2);
        ArrayList<AbstractC6818hX0> arrayList2 = this.A;
        if (arrayList2 != null) {
            Iterator<AbstractC6818hX0> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                AbstractC6818hX0 next = it.next();
                if (next instanceof EX0) {
                    EX0 ex0 = (EX0) next;
                    K(new C7356jl1(i, i2, ex0, this.g, this.h));
                    int i7 = ex0.D;
                    if (i7 != AbstractC6818hX0.f) {
                        this.f = i7;
                    }
                } else if (next instanceof C8536oX0) {
                    next.d(hashSet3);
                } else if (next instanceof HX0) {
                    next.d(hashSet);
                } else if (next instanceof IX0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((IX0) next);
                } else {
                    next.i(hashMap);
                    next.d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i8 = 0;
        if (arrayList != null) {
            this.E = (IX0[]) arrayList.toArray(new IX0[0]);
        }
        char c = 1;
        if (!hashSet2.isEmpty()) {
            this.C = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[1];
                    Iterator<AbstractC6818hX0> it3 = this.A.iterator();
                    while (it3.hasNext()) {
                        AbstractC6818hX0 next3 = it3.next();
                        HashMap<String, androidx.constraintlayout.widget.a> hashMap2 = next3.e;
                        if (hashMap2 != null && (aVar3 = hashMap2.get(str)) != null) {
                            sparseArray.append(next3.a, aVar3);
                        }
                    }
                    l = AbstractC6265fI2.k(next2, sparseArray);
                } else {
                    l = AbstractC6265fI2.l(next2);
                }
                if (l != null) {
                    l.i(next2);
                    this.C.put(next2, l);
                }
            }
            ArrayList<AbstractC6818hX0> arrayList3 = this.A;
            if (arrayList3 != null) {
                Iterator<AbstractC6818hX0> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    AbstractC6818hX0 next4 = it4.next();
                    if (next4 instanceof C7788lX0) {
                        next4.a(this.C);
                    }
                }
            }
            this.i.e(this.C, 0);
            this.j.e(this.C, 100);
            for (String str2 : this.C.keySet()) {
                if (hashMap.containsKey(str2) && (num = hashMap.get(str2)) != null) {
                    i5 = num.intValue();
                } else {
                    i5 = 0;
                }
                AbstractC6265fI2 abstractC6265fI2 = this.C.get(str2);
                if (abstractC6265fI2 != null) {
                    abstractC6265fI2.j(i5);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.B == null) {
                this.B = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.B.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<AbstractC6818hX0> it6 = this.A.iterator();
                        while (it6.hasNext()) {
                            AbstractC6818hX0 next6 = it6.next();
                            HashMap<String, androidx.constraintlayout.widget.a> hashMap3 = next6.e;
                            if (hashMap3 != null && (aVar2 = hashMap3.get(str3)) != null) {
                                sparseArray2.append(next6.a, aVar2);
                            }
                        }
                        i4 = AbstractC7490kI2.h(next5, sparseArray2);
                    } else {
                        i4 = AbstractC7490kI2.i(next5, j);
                    }
                    if (i4 != null) {
                        i4.e(next5);
                        this.B.put(next5, i4);
                    }
                }
            }
            ArrayList<AbstractC6818hX0> arrayList4 = this.A;
            if (arrayList4 != null) {
                Iterator<AbstractC6818hX0> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    AbstractC6818hX0 next7 = it7.next();
                    if (next7 instanceof HX0) {
                        ((HX0) next7).W(this.B);
                    }
                }
            }
            for (String str4 : this.B.keySet()) {
                if (hashMap.containsKey(str4)) {
                    i3 = hashMap.get(str4).intValue();
                } else {
                    i3 = 0;
                }
                this.B.get(str4).f(i3);
            }
        }
        int size = this.y.size();
        int i9 = size + 2;
        C7356jl1[] c7356jl1Arr2 = new C7356jl1[i9];
        c7356jl1Arr2[0] = this.g;
        c7356jl1Arr2[size + 1] = this.h;
        if (this.y.size() > 0 && this.f == -1) {
            this.f = 0;
        }
        Iterator<C7356jl1> it8 = this.y.iterator();
        int i10 = 1;
        while (it8.hasNext()) {
            c7356jl1Arr2[i10] = it8.next();
            i10++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.h.j1.keySet()) {
            if (this.g.j1.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.u = strArr2;
        this.v = new int[strArr2.length];
        int i11 = 0;
        while (true) {
            strArr = this.u;
            if (i11 >= strArr.length) {
                break;
            }
            String str6 = strArr[i11];
            this.v[i11] = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= i9) {
                    break;
                }
                if (c7356jl1Arr2[i12].j1.containsKey(str6) && (aVar = c7356jl1Arr2[i12].j1.get(str6)) != null) {
                    int[] iArr = this.v;
                    iArr[i11] = iArr[i11] + aVar.p();
                    break;
                }
                i12++;
            }
            i11++;
        }
        if (c7356jl1Arr2[0].f1 != AbstractC6818hX0.f) {
            z = true;
        } else {
            z = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i13 = 1; i13 < i9; i13++) {
            c7356jl1Arr2[i13].j(c7356jl1Arr2[i13 - 1], zArr, this.u, z);
        }
        int i14 = 0;
        for (int i15 = 1; i15 < length; i15++) {
            if (zArr[i15]) {
                i14++;
            }
        }
        this.r = new int[i14];
        int i16 = 2;
        int max = Math.max(2, i14);
        this.s = new double[max];
        this.t = new double[max];
        int i17 = 0;
        for (int i18 = 1; i18 < length; i18++) {
            if (zArr[i18]) {
                this.r[i17] = i18;
                i17++;
            }
        }
        int[] iArr2 = {i9, this.r.length};
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance(cls, iArr2);
        double[] dArr2 = new double[i9];
        for (int i19 = 0; i19 < i9; i19++) {
            c7356jl1Arr2[i19].l(dArr[i19], this.r);
            dArr2[i19] = c7356jl1Arr2[i19].Z;
        }
        int i20 = 0;
        while (true) {
            int[] iArr3 = this.r;
            if (i20 >= iArr3.length) {
                break;
            }
            if (iArr3[i20] < C7356jl1.A1.length) {
                String str7 = C7356jl1.A1[this.r[i20]] + " [";
                for (int i21 = 0; i21 < i9; i21++) {
                    str7 = str7 + dArr[i21][i20];
                }
            }
            i20++;
        }
        this.k = new AS[this.u.length + 1];
        int i22 = 0;
        while (true) {
            String[] strArr3 = this.u;
            if (i22 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i22];
            int i23 = i8;
            int i24 = i23;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i23 < i9) {
                char c2 = c;
                if (c7356jl1Arr2[i23].t(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i9];
                        int[] iArr4 = new int[i16];
                        iArr4[c2] = c7356jl1Arr2[i23].r(str8);
                        iArr4[i8] = i9;
                        dArr4 = (double[][]) Array.newInstance(cls, iArr4);
                    }
                    C7356jl1 c7356jl12 = c7356jl1Arr2[i23];
                    c7356jl1Arr = c7356jl1Arr2;
                    dArr3[i24] = c7356jl12.Z;
                    c7356jl12.q(str8, dArr4[i24], 0);
                    i24++;
                } else {
                    c7356jl1Arr = c7356jl1Arr2;
                }
                i23++;
                c = c2;
                c7356jl1Arr2 = c7356jl1Arr;
                i16 = 2;
                i8 = 0;
            }
            i22++;
            this.k[i22] = AS.a(this.f, Arrays.copyOf(dArr3, i24), (double[][]) Arrays.copyOf(dArr4, i24));
            c = c;
            c7356jl1Arr2 = c7356jl1Arr2;
            i16 = 2;
            i8 = 0;
        }
        C7356jl1[] c7356jl1Arr3 = c7356jl1Arr2;
        char c3 = c;
        this.k[0] = AS.a(this.f, dArr2, dArr);
        if (c7356jl1Arr3[0].f1 != AbstractC6818hX0.f) {
            int[] iArr5 = new int[i9];
            double[] dArr5 = new double[i9];
            int[] iArr6 = new int[2];
            iArr6[c3] = 2;
            iArr6[0] = i9;
            double[][] dArr6 = (double[][]) Array.newInstance(cls, iArr6);
            for (int i25 = 0; i25 < i9; i25++) {
                iArr5[i25] = c7356jl1Arr3[i25].f1;
                dArr5[i25] = c7356jl1.Z;
                double[] dArr7 = dArr6[i25];
                dArr7[0] = c7356jl1.Z0;
                dArr7[c3] = c7356jl1.a1;
            }
            this.l = AS.b(iArr5, dArr5, dArr6);
        }
        this.D = new HashMap<>();
        if (this.A != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f2 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                PH2 l2 = PH2.l(next8);
                if (l2 != null) {
                    if (l2.k() && Float.isNaN(f2)) {
                        f2 = D();
                    }
                    l2.i(next8);
                    this.D.put(next8, l2);
                }
            }
            Iterator<AbstractC6818hX0> it10 = this.A.iterator();
            while (it10.hasNext()) {
                AbstractC6818hX0 next9 = it10.next();
                if (next9 instanceof C8536oX0) {
                    ((C8536oX0) next9).a0(this.D);
                }
            }
            for (PH2 ph2 : this.D.values()) {
                ph2.j(f2);
            }
        }
    }

    public void b(ArrayList<AbstractC6818hX0> arrayList) {
        this.A.addAll(arrayList);
    }

    public void b0(C4523Vk1 c4523Vk1) {
        this.g.C(c4523Vk1, c4523Vk1.g);
        this.h.C(c4523Vk1, c4523Vk1.h);
    }

    public void c(float[] fArr, int i) {
        float f;
        float f2 = 1.0f / (i - 1);
        HashMap<String, AbstractC6265fI2> hashMap = this.C;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, AbstractC6265fI2> hashMap2 = this.C;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, PH2> hashMap3 = this.D;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, PH2> hashMap4 = this.D;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i2 = 0; i2 < i; i2++) {
            float f3 = i2 * f2;
            float f4 = this.f648o;
            float f5 = 0.0f;
            if (f4 != 1.0f) {
                float f6 = this.n;
                if (f3 < f6) {
                    f3 = 0.0f;
                }
                if (f3 > f6 && f3 < 1.0d) {
                    f3 = Math.min((f3 - f6) * f4, 1.0f);
                }
            }
            double d = f3;
            C6725h90 c6725h90 = this.g.X;
            Iterator<C7356jl1> it = this.y.iterator();
            float f7 = Float.NaN;
            while (it.hasNext()) {
                C7356jl1 next = it.next();
                C6725h90 c6725h902 = next.X;
                if (c6725h902 != null) {
                    float f8 = next.Z;
                    if (f8 < f3) {
                        c6725h90 = c6725h902;
                        f5 = f8;
                    } else if (Float.isNaN(f7)) {
                        f7 = next.Z;
                    }
                }
            }
            if (c6725h90 != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                d = (((float) c6725h90.a((f3 - f5) / f)) * (f7 - f5)) + f5;
            }
            this.k[0].d(d, this.s);
            AS as = this.l;
            if (as != null) {
                double[] dArr = this.s;
                if (dArr.length > 0) {
                    as.d(d, dArr);
                }
            }
            this.g.m(this.r, this.s, fArr, i2 * 2);
        }
    }

    public int d(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h = this.k[0].h();
        if (iArr != null) {
            Iterator<C7356jl1> it = this.y.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().k1;
                i++;
            }
        }
        int i2 = 0;
        for (double d : h) {
            this.k[0].d(d, this.s);
            this.g.m(this.r, this.s, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    public int e(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h = this.k[0].h();
        if (iArr != null) {
            Iterator<C7356jl1> it = this.y.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().k1;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < h.length; i3++) {
            this.k[0].d(h[i3], this.s);
            this.g.n(h[i3], this.r, this.s, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    public void f(float[] fArr, int i) {
        AbstractC6265fI2 abstractC6265fI2;
        AbstractC6265fI2 abstractC6265fI22;
        PH2 ph2;
        float f;
        int i2 = i;
        float f2 = 1.0f;
        float f3 = 1.0f / (i2 - 1);
        HashMap<String, AbstractC6265fI2> hashMap = this.C;
        PH2 ph22 = null;
        if (hashMap == null) {
            abstractC6265fI2 = null;
        } else {
            abstractC6265fI2 = hashMap.get("translationX");
        }
        HashMap<String, AbstractC6265fI2> hashMap2 = this.C;
        if (hashMap2 == null) {
            abstractC6265fI22 = null;
        } else {
            abstractC6265fI22 = hashMap2.get("translationY");
        }
        HashMap<String, PH2> hashMap3 = this.D;
        if (hashMap3 == null) {
            ph2 = null;
        } else {
            ph2 = hashMap3.get("translationX");
        }
        HashMap<String, PH2> hashMap4 = this.D;
        if (hashMap4 != null) {
            ph22 = hashMap4.get("translationY");
        }
        int i3 = 0;
        while (i3 < i2) {
            float f4 = i3 * f3;
            float f5 = this.f648o;
            float f6 = 0.0f;
            if (f5 != f2) {
                float f7 = this.n;
                if (f4 < f7) {
                    f4 = 0.0f;
                }
                if (f4 > f7 && f4 < 1.0d) {
                    f4 = Math.min((f4 - f7) * f5, f2);
                }
            }
            double d = f4;
            C6725h90 c6725h90 = this.g.X;
            Iterator<C7356jl1> it = this.y.iterator();
            float f8 = Float.NaN;
            while (it.hasNext()) {
                C7356jl1 next = it.next();
                C6725h90 c6725h902 = next.X;
                if (c6725h902 != null) {
                    float f9 = next.Z;
                    if (f9 < f4) {
                        f6 = f9;
                        c6725h90 = c6725h902;
                    } else if (Float.isNaN(f8)) {
                        f8 = next.Z;
                    }
                }
            }
            if (c6725h90 != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                d = (((float) c6725h90.a((f4 - f6) / f)) * (f8 - f6)) + f6;
            }
            this.k[0].d(d, this.s);
            AS as = this.l;
            if (as != null) {
                double[] dArr = this.s;
                if (dArr.length > 0) {
                    as.d(d, dArr);
                }
            }
            int i4 = i3 * 2;
            this.g.n(d, this.r, this.s, fArr, i4);
            if (ph2 != null) {
                fArr[i4] = fArr[i4] + ph2.a(f4);
            } else if (abstractC6265fI2 != null) {
                fArr[i4] = fArr[i4] + abstractC6265fI2.a(f4);
            }
            if (ph22 != null) {
                int i5 = i4 + 1;
                fArr[i5] = fArr[i5] + ph22.a(f4);
            } else if (abstractC6265fI22 != null) {
                int i6 = i4 + 1;
                fArr[i6] = fArr[i6] + abstractC6265fI22.a(f4);
            }
            i3++;
            i2 = i;
            f2 = 1.0f;
        }
    }

    public void g(float f, float[] fArr, int i) {
        this.k[0].d(j(f, null), this.s);
        this.g.s(this.r, this.s, fArr, i);
    }

    public void h(float[] fArr, int i) {
        float f = 1.0f / (i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            this.k[0].d(j(i2 * f, null), this.s);
            this.g.s(this.r, this.s, fArr, i2 * 8);
        }
    }

    public void i(boolean z) {
        float f;
        if ("button".equals(AV.k(this.b)) && this.E != null) {
            int i = 0;
            while (true) {
                IX0[] ix0Arr = this.E;
                if (i < ix0Arr.length) {
                    IX0 ix0 = ix0Arr[i];
                    if (z) {
                        f = -100.0f;
                    } else {
                        f = 100.0f;
                    }
                    ix0.A(f, this.b);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final float j(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f648o;
            if (f4 != 1.0d) {
                float f5 = this.n;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && f < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        C6725h90 c6725h90 = this.g.X;
        Iterator<C7356jl1> it = this.y.iterator();
        float f6 = Float.NaN;
        while (it.hasNext()) {
            C7356jl1 next = it.next();
            C6725h90 c6725h902 = next.X;
            if (c6725h902 != null) {
                float f7 = next.Z;
                if (f7 < f) {
                    c6725h90 = c6725h902;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.Z;
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

    public int k() {
        return this.g.g1;
    }

    public int l(String str, float[] fArr, int i) {
        AbstractC6265fI2 abstractC6265fI2 = this.C.get(str);
        if (abstractC6265fI2 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = abstractC6265fI2.a(i2 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void m(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.k[0].d(d, dArr);
        this.k[0].g(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.g.o(d, this.r, dArr, fArr, dArr2, fArr2);
    }

    public float n() {
        return this.p;
    }

    public float o() {
        return this.q;
    }

    public void p(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float j = j(f, this.z);
        AS[] asArr = this.k;
        int i = 0;
        if (asArr != null) {
            double d = j;
            asArr[0].g(d, this.t);
            this.k[0].d(d, this.s);
            float f4 = this.z[0];
            while (true) {
                dArr = this.t;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * f4;
                i++;
            }
            AS as = this.l;
            if (as != null) {
                double[] dArr2 = this.s;
                if (dArr2.length > 0) {
                    as.d(d, dArr2);
                    this.l.g(d, this.t);
                    this.g.A(f2, f3, fArr, this.r, this.t, this.s);
                    return;
                }
                return;
            }
            this.g.A(f2, f3, fArr, this.r, dArr, this.s);
            return;
        }
        C7356jl1 c7356jl1 = this.h;
        float f5 = c7356jl1.Z0;
        C7356jl1 c7356jl12 = this.g;
        float f6 = f5 - c7356jl12.Z0;
        float f7 = c7356jl1.a1 - c7356jl12.a1;
        float f8 = (c7356jl1.b1 - c7356jl12.b1) + f6;
        float f9 = (c7356jl1.c1 - c7356jl12.c1) + f7;
        fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
        fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
    }

    public int q() {
        int i = this.g.Y;
        Iterator<C7356jl1> it = this.y.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().Y);
        }
        return Math.max(i, this.h.Y);
    }

    public float r() {
        return this.h.c1;
    }

    public float s() {
        return this.h.b1;
    }

    public float t() {
        return this.h.Z0;
    }

    public String toString() {
        return " start: x: " + this.g.Z0 + " y: " + this.g.a1 + " end: x: " + this.h.Z0 + " y: " + this.h.a1;
    }

    public float u() {
        return this.h.a1;
    }

    public C7356jl1 w(int i) {
        return this.y.get(i);
    }

    public int x(int i, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<AbstractC6818hX0> it = this.A.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            AbstractC6818hX0 next = it.next();
            int i4 = next.d;
            if (i4 == i || i != -1) {
                iArr[i3] = 0;
                iArr[i3 + 1] = i4;
                int i5 = next.a;
                iArr[i3 + 2] = i5;
                double d = i5 / 100.0f;
                this.k[0].d(d, this.s);
                this.g.n(d, this.r, this.s, fArr, 0);
                iArr[i3 + 3] = Float.floatToIntBits(fArr[0]);
                int i6 = i3 + 4;
                iArr[i6] = Float.floatToIntBits(fArr[1]);
                if (next instanceof EX0) {
                    EX0 ex0 = (EX0) next;
                    iArr[i3 + 5] = ex0.O;
                    iArr[i3 + 6] = Float.floatToIntBits(ex0.K);
                    i6 = i3 + 7;
                    iArr[i6] = Float.floatToIntBits(ex0.L);
                }
                int i7 = i6 + 1;
                iArr[i3] = i7 - i3;
                i2++;
                i3 = i7;
            }
        }
        return i2;
    }

    public float y(int i, float f, float f2) {
        C7356jl1 c7356jl1 = this.h;
        float f3 = c7356jl1.Z0;
        C7356jl1 c7356jl12 = this.g;
        float f4 = c7356jl12.Z0;
        float f5 = f3 - f4;
        float f6 = c7356jl1.a1;
        float f7 = c7356jl12.a1;
        float f8 = f6 - f7;
        float f9 = f4 + (c7356jl12.b1 / 2.0f);
        float f10 = f7 + (c7356jl12.c1 / 2.0f);
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

    public int z(int[] iArr, float[] fArr) {
        Iterator<AbstractC6818hX0> it = this.A.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            AbstractC6818hX0 next = it.next();
            int i3 = next.a;
            iArr[i] = (next.d * 1000) + i3;
            double d = i3 / 100.0f;
            this.k[0].d(d, this.s);
            this.g.n(d, this.r, this.s, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }
}
