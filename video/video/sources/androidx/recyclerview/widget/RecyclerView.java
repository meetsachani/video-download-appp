package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.C0371a;
import androidx.recyclerview.widget.C0375e;
import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o.BE1;
import o.C10861y4;
import o.C10907yF1;
import o.C4500Ve2;
import o.C4717Xk1;
import o.C6516gH2;
import o.C7139ir2;
import o.C7486kH2;
import o.C7956m90;
import o.C8982qM1;
import o.C9584sp1;
import o.C9811tl1;
import o.InterfaceC8849pp1;
import o.InterfaceC9092qp1;
import o.J;
import o.Q3;
import o.R3;
import o.UE;
import o.WY1;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements WY1, InterfaceC8849pp1, InterfaceC9092qp1 {
    public static final boolean A2 = false;
    public static final float C2 = 0.015f;
    public static final float D2 = 0.35f;
    public static final float L2 = 4.0f;
    public static final boolean M2 = false;
    public static final int N2 = 0;
    public static final int O2 = 1;
    public static final int P2 = 1;
    public static final int Q2 = -1;
    public static final long R2 = -1;
    public static final int S2 = -1;
    public static final int T2 = 0;
    public static final int U2 = 1;
    public static final int V2 = Integer.MIN_VALUE;
    public static final int W2 = 2000;
    public static final String X2 = "RV Scroll";
    public static final String Y2 = "RV OnLayout";
    public static final String Z2 = "RV FullInvalidate";
    public static final String a3 = "RV PartialInvalidate";
    public static final String b3 = "RV OnBindView";
    public static final String c3 = "RV Prefetch";
    public static final String d3 = "RV Nested Prefetch";
    public static final String e3 = "RV CreateView";
    public static final Class<?>[] f3;
    public static final int g3 = -1;
    public static final int h3 = 0;
    public static final int i3 = 1;
    public static final int j3 = 2;
    public static final long k3 = Long.MAX_VALUE;
    public static final Interpolator l3;
    public static final E m3;
    public static final String y2 = "RecyclerView";
    public static final boolean z2 = false;
    public boolean A1;
    public final AccessibilityManager B1;
    public List<r> C1;
    public boolean D1;
    public boolean E1;
    public int F1;
    public int G1;
    public l H1;
    public EdgeEffect I1;
    public EdgeEffect J1;
    public EdgeEffect K1;
    public EdgeEffect L1;
    public m M1;
    public int N1;
    public int O1;
    public VelocityTracker P1;
    public int Q1;
    public int R1;
    public int S1;
    public int T1;
    public int U1;
    public s V1;
    public final int W1;
    public final int X1;
    public final float Y0;
    public float Y1;
    public final z Z0;
    public float Z1;
    public final x a1;
    public boolean a2;
    public A b1;
    public final G b2;
    public C0371a c1;
    public androidx.recyclerview.widget.l c2;
    public C0375e d1;
    public l.b d2;
    public final androidx.recyclerview.widget.D e1;
    public final D e2;
    public boolean f1;
    public u f2;
    public final Runnable g1;
    public List<u> g2;
    public final Rect h1;
    public boolean h2;
    public final Rect i1;
    public boolean i2;
    public final RectF j1;
    public m.c j2;
    public AbstractC0370h k1;
    public boolean k2;
    public p l1;
    public androidx.recyclerview.widget.v l2;
    public y m1;
    public k m2;
    public final List<y> n1;
    public final int[] n2;
    public final ArrayList<o> o1;
    public C9584sp1 o2;
    public final ArrayList<t> p1;
    public final int[] p2;
    public t q1;
    public final int[] q2;
    public boolean r1;
    public final int[] r2;
    public boolean s1;
    public final List<H> s2;
    public boolean t1;
    public Runnable t2;
    public boolean u1;
    public boolean u2;
    public int v1;
    public int v2;
    public boolean w1;
    public int w2;
    public boolean x1;
    public final D.b x2;
    public boolean y1;
    public int z1;
    public static final int[] B2 = {16843830};
    public static final float E2 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean F2 = false;
    public static final boolean G2 = true;
    public static final boolean H2 = true;
    public static final boolean I2 = true;
    public static final boolean J2 = false;
    public static final boolean K2 = false;

    /* loaded from: classes.dex */
    public static class B implements t {
        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void e(boolean z) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class C {
        public RecyclerView b;
        public p c;
        public boolean d;
        public boolean e;
        public View f;
        public boolean h;
        public int a = -1;
        public final a g = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {
            public static final int h = Integer.MIN_VALUE;
            public int a;
            public int b;
            public int c;
            public int d;
            public Interpolator e;
            public boolean f;
            public int g;

            public a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public int a() {
                return this.c;
            }

            public int b() {
                return this.a;
            }

            public int c() {
                return this.b;
            }

            public Interpolator d() {
                return this.e;
            }

            public boolean e() {
                if (this.d >= 0) {
                    return true;
                }
                return false;
            }

            public void f(int i) {
                this.d = i;
            }

            public void g(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.U0(i);
                    this.f = false;
                } else if (this.f) {
                    m();
                    recyclerView.b2.e(this.a, this.b, this.c, this.e);
                    int i2 = this.g + 1;
                    this.g = i2;
                    if (i2 > 10) {
                        Log.e(RecyclerView.y2, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                } else {
                    this.g = 0;
                }
            }

            public void h(int i) {
                this.f = true;
                this.c = i;
            }

            public void i(int i) {
                this.f = true;
                this.a = i;
            }

            public void j(int i) {
                this.f = true;
                this.b = i;
            }

            public void k(Interpolator interpolator) {
                this.f = true;
                this.e = interpolator;
            }

            public void l(int i, int i2, int i3, Interpolator interpolator) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
                this.f = true;
            }

            public final void m() {
                if (this.e != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.c >= 1) {
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }

            public a(int i, int i2, int i3) {
                this(i, i2, i3, null);
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF c(int i);
        }

        public PointF a(int i) {
            p e = e();
            if (e instanceof b) {
                return ((b) e).c(i);
            }
            Log.w(RecyclerView.y2, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i) {
            return this.b.l1.O(i);
        }

        public int c() {
            return this.b.l1.V();
        }

        public int d(View view) {
            return this.b.u0(view);
        }

        public p e() {
            return this.c;
        }

        public int f() {
            return this.a;
        }

        @Deprecated
        public void g(int i) {
            this.b.M1(i);
        }

        public boolean h() {
            return this.d;
        }

        public boolean i() {
            return this.e;
        }

        public void j(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void k(int i, int i2) {
            PointF a2;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                s();
            }
            if (this.d && this.f == null && this.c != null && (a2 = a(this.a)) != null) {
                float f = a2.x;
                if (f != 0.0f || a2.y != 0.0f) {
                    recyclerView.L1((int) Math.signum(f), (int) Math.signum(a2.y), null);
                }
            }
            this.d = false;
            View view = this.f;
            if (view != null) {
                if (d(view) == this.a) {
                    p(this.f, recyclerView.e2, this.g);
                    this.g.g(recyclerView);
                    s();
                } else {
                    Log.e(RecyclerView.y2, "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                m(i, i2, recyclerView.e2, this.g);
                boolean e = this.g.e();
                this.g.g(recyclerView);
                if (e && this.e) {
                    this.d = true;
                    recyclerView.b2.d();
                }
            }
        }

        public void l(View view) {
            if (d(view) == f()) {
                this.f = view;
            }
        }

        public abstract void m(int i, int i2, D d, a aVar);

        public abstract void n();

        public abstract void o();

        public abstract void p(View view, D d, a aVar);

        public void q(int i) {
            this.a = i;
        }

        public void r(RecyclerView recyclerView, p pVar) {
            recyclerView.b2.f();
            if (this.h) {
                Log.w(RecyclerView.y2, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.b = recyclerView;
            this.c = pVar;
            int i = this.a;
            if (i != -1) {
                recyclerView.e2.a = i;
                this.e = true;
                this.d = true;
                this.f = b(f());
                n();
                this.b.b2.d();
                this.h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final void s() {
            if (!this.e) {
                return;
            }
            this.e = false;
            o();
            this.b.e2.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            this.c.A1(this);
            this.c = null;
            this.b = null;
        }
    }

    /* loaded from: classes.dex */
    public static class D {
        public static final int r = 1;
        public static final int s = 2;
        public static final int t = 4;
        public SparseArray<Object> b;
        public int m;
        public long n;

        /* renamed from: o  reason: collision with root package name */
        public int f53o;
        public int p;
        public int q;
        public int a = -1;
        public int c = 0;
        public int d = 0;
        public int e = 1;
        public int f = 0;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public boolean l = false;

        public void a(int i) {
            if ((this.e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.e));
        }

        public boolean b() {
            return this.g;
        }

        public <T> T c(int i) {
            SparseArray<Object> sparseArray = this.b;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i);
        }

        public int d() {
            if (this.h) {
                return this.c - this.d;
            }
            return this.f;
        }

        public int e() {
            return this.p;
        }

        public int f() {
            return this.q;
        }

        public int g() {
            return this.a;
        }

        public boolean h() {
            if (this.a != -1) {
                return true;
            }
            return false;
        }

        public boolean i() {
            return this.j;
        }

        public boolean j() {
            return this.h;
        }

        public void k(AbstractC0370h abstractC0370h) {
            this.e = 1;
            this.f = abstractC0370h.g();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void l(int i, Object obj) {
            if (this.b == null) {
                this.b = new SparseArray<>();
            }
            this.b.put(i, obj);
        }

        public void m(int i) {
            SparseArray<Object> sparseArray = this.b;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i);
        }

        public boolean n() {
            return this.l;
        }

        public boolean o() {
            return this.k;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.a + ", mData=" + this.b + ", mItemCount=" + this.f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.d + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class E extends l {
        @Override // androidx.recyclerview.widget.RecyclerView.l
        public EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class F {
        public abstract View a(x xVar, int i, int i2);
    }

    /* loaded from: classes.dex */
    public class G implements Runnable {
        public int X;
        public int Y;
        public Interpolator Y0;
        public OverScroller Z;
        public boolean Z0;
        public boolean a1;

        public G() {
            Interpolator interpolator = RecyclerView.l3;
            this.Y0 = interpolator;
            this.Z0 = false;
            this.a1 = false;
            this.Z = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i, int i2) {
            boolean z;
            int height;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }

        public void b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.Y = 0;
            this.X = 0;
            Interpolator interpolator = this.Y0;
            Interpolator interpolator2 = RecyclerView.l3;
            if (interpolator != interpolator2) {
                this.Y0 = interpolator2;
                this.Z = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.Z.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        public final void c() {
            RecyclerView.this.removeCallbacks(this);
            C6516gH2.w1(RecyclerView.this, this);
        }

        public void d() {
            if (this.Z0) {
                this.a1 = true;
            } else {
                c();
            }
        }

        public void e(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.l3;
            }
            if (this.Y0 != interpolator) {
                this.Y0 = interpolator;
                this.Z = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.Y = 0;
            this.X = 0;
            RecyclerView.this.setScrollState(2);
            this.Z.startScroll(0, 0, i, i2, i4);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.Z.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.l1 == null) {
                f();
                return;
            }
            this.a1 = false;
            this.Z0 = true;
            recyclerView.I();
            OverScroller overScroller = this.Z;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.X;
                this.X = currX;
                this.Y = currY;
                int F = RecyclerView.this.F(i4);
                int H = RecyclerView.this.H(currY - this.Y);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.r2;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.f(F, H, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.r2;
                    F -= iArr2[0];
                    H -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.E(F, H);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.k1 != null) {
                    int[] iArr3 = recyclerView3.r2;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.L1(F, H, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.r2;
                    int i5 = iArr4[0];
                    int i6 = iArr4[1];
                    F -= i5;
                    H -= i6;
                    C c = recyclerView4.l1.g;
                    if (c != null && !c.h() && c.i()) {
                        int d = RecyclerView.this.e2.d();
                        if (d == 0) {
                            c.s();
                        } else if (c.f() >= d) {
                            c.q(d - 1);
                            c.k(i5, i6);
                        } else {
                            c.k(i5, i6);
                        }
                    }
                    i2 = i6;
                    i = i5;
                } else {
                    i = 0;
                    i2 = 0;
                }
                int i7 = F;
                int i8 = H;
                if (!RecyclerView.this.o1.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.r2;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.a(i, i2, i7, i8, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.r2;
                int i9 = i7 - iArr6[0];
                int i10 = i8 - iArr6[1];
                if (i != 0 || i2 != 0) {
                    recyclerView6.U(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z = true;
                } else {
                    z = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!overScroller.isFinished() && ((!z && i9 == 0) || (!z2 && i10 == 0))) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                C c2 = RecyclerView.this.l1.g;
                if ((c2 == null || !c2.h()) && z3) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i9 < 0) {
                            i3 = -currVelocity;
                        } else if (i9 > 0) {
                            i3 = currVelocity;
                        } else {
                            i3 = 0;
                        }
                        if (i10 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i10 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.h(i3, currVelocity);
                    }
                    if (RecyclerView.I2) {
                        RecyclerView.this.d2.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.l lVar = recyclerView7.c2;
                    if (lVar != null) {
                        lVar.f(recyclerView7, i, i2);
                    }
                }
            }
            C c3 = RecyclerView.this.l1.g;
            if (c3 != null && c3.h()) {
                c3.k(0, 0);
            }
            this.Z0 = false;
            if (this.a1) {
                c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.g(1);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class H {
        public static final int A = 256;
        public static final int B = 512;
        public static final int C = 1024;
        public static final int D = 2048;
        public static final int E = 4096;
        public static final int F = -1;
        public static final int G = 8192;
        public static final List<Object> H = Collections.EMPTY_LIST;
        public static final int t = 1;
        public static final int u = 2;
        public static final int v = 4;
        public static final int w = 8;
        public static final int x = 16;
        public static final int y = 32;
        public static final int z = 128;
        public final View a;
        public WeakReference<RecyclerView> b;
        public int j;
        public RecyclerView r;
        public AbstractC0370h<? extends H> s;
        public int c = -1;
        public int d = -1;
        public long e = -1;
        public int f = -1;
        public int g = -1;
        public H h = null;
        public H i = null;
        public List<Object> k = null;
        public List<Object> l = null;
        public int m = 0;
        public x n = null;

        /* renamed from: o  reason: collision with root package name */
        public boolean f54o = false;
        public int p = 0;
        public int q = -1;

        public H(View view) {
            if (view != null) {
                this.a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public boolean A() {
            if (this.n != null) {
                return true;
            }
            return false;
        }

        public boolean B() {
            if ((this.j & 256) != 0) {
                return true;
            }
            return false;
        }

        public boolean C() {
            if ((this.j & 2) != 0) {
                return true;
            }
            return false;
        }

        public boolean D() {
            if ((this.j & 2) != 0) {
                return true;
            }
            return false;
        }

        public void E(int i, boolean z2) {
            if (this.d == -1) {
                this.d = this.c;
            }
            if (this.g == -1) {
                this.g = this.c;
            }
            if (z2) {
                this.g += i;
            }
            this.c += i;
            if (this.a.getLayoutParams() != null) {
                ((q) this.a.getLayoutParams()).c = true;
            }
        }

        public void F(RecyclerView recyclerView) {
            int i = this.q;
            if (i != -1) {
                this.p = i;
            } else {
                this.p = C6516gH2.Z(this.a);
            }
            recyclerView.O1(this, 4);
        }

        public void G(RecyclerView recyclerView) {
            recyclerView.O1(this, this.p);
            this.p = 0;
        }

        public void H() {
            this.j = 0;
            this.c = -1;
            this.d = -1;
            this.e = -1L;
            this.g = -1;
            this.m = 0;
            this.h = null;
            this.i = null;
            d();
            this.p = 0;
            this.q = -1;
            RecyclerView.A(this);
        }

        public void I() {
            if (this.d == -1) {
                this.d = this.c;
            }
        }

        public void J(int i, int i2) {
            this.j = (i & i2) | (this.j & (~i2));
        }

        public final void K(boolean z2) {
            int i;
            int i2 = this.m;
            if (z2) {
                i = i2 - 1;
            } else {
                i = i2 + 1;
            }
            this.m = i;
            if (i < 0) {
                this.m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z2 && i == 1) {
                this.j |= 16;
            } else if (z2 && i == 0) {
                this.j &= -17;
            }
        }

        public void L(x xVar, boolean z2) {
            this.n = xVar;
            this.f54o = z2;
        }

        public boolean M() {
            if ((this.j & 16) != 0) {
                return true;
            }
            return false;
        }

        public boolean N() {
            if ((this.j & 128) != 0) {
                return true;
            }
            return false;
        }

        public void O() {
            this.j &= -129;
        }

        public void P() {
            this.n.P(this);
        }

        public boolean Q() {
            if ((this.j & 32) != 0) {
                return true;
            }
            return false;
        }

        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.j) == 0) {
                g();
                this.k.add(obj);
            }
        }

        public void b(int i) {
            this.j = i | this.j;
        }

        public void c() {
            this.d = -1;
            this.g = -1;
        }

        public void d() {
            List<Object> list = this.k;
            if (list != null) {
                list.clear();
            }
            this.j &= -1025;
        }

        public void e() {
            this.j &= -33;
        }

        public void f() {
            this.j &= -257;
        }

        public final void g() {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = Collections.unmodifiableList(arrayList);
            }
        }

        public boolean h() {
            if ((this.j & 16) == 0 && C6516gH2.R0(this.a)) {
                return true;
            }
            return false;
        }

        public void i(int i, int i2, boolean z2) {
            b(8);
            E(i2, z2);
            this.c = i;
        }

        public final int j() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.q0(this);
        }

        @Deprecated
        public final int k() {
            return m();
        }

        public final AbstractC0370h<? extends H> l() {
            return this.s;
        }

        public final int m() {
            RecyclerView recyclerView;
            AbstractC0370h adapter;
            int q0;
            if (this.s == null || (recyclerView = this.r) == null || (adapter = recyclerView.getAdapter()) == null || (q0 = this.r.q0(this)) == -1) {
                return -1;
            }
            return adapter.f(this.s, this, q0);
        }

        public final long n() {
            return this.e;
        }

        public final int o() {
            return this.f;
        }

        public final int p() {
            int i = this.g;
            if (i == -1) {
                return this.c;
            }
            return i;
        }

        public final int q() {
            return this.d;
        }

        @Deprecated
        public final int r() {
            int i = this.g;
            if (i == -1) {
                return this.c;
            }
            return i;
        }

        public List<Object> s() {
            if ((this.j & 1024) == 0) {
                List<Object> list = this.k;
                if (list != null && list.size() != 0) {
                    return this.l;
                }
                return H;
            }
            return H;
        }

        public boolean t(int i) {
            if ((i & this.j) != 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
            if (A()) {
                sb.append(" scrap ");
                if (this.f54o) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb.append(str);
            }
            if (x()) {
                sb.append(" invalid");
            }
            if (!w()) {
                sb.append(" unbound");
            }
            if (D()) {
                sb.append(" update");
            }
            if (z()) {
                sb.append(" removed");
            }
            if (N()) {
                sb.append(" ignored");
            }
            if (B()) {
                sb.append(" tmpDetached");
            }
            if (!y()) {
                sb.append(" not recyclable(" + this.m + C9811tl1.d);
            }
            if (u()) {
                sb.append(" undefined adapter position");
            }
            if (this.a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public boolean u() {
            if ((this.j & 512) == 0 && !x()) {
                return false;
            }
            return true;
        }

        public boolean v() {
            if (this.a.getParent() != null && this.a.getParent() != this.r) {
                return true;
            }
            return false;
        }

        public boolean w() {
            if ((this.j & 1) != 0) {
                return true;
            }
            return false;
        }

        public boolean x() {
            if ((this.j & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean y() {
            if ((this.j & 16) == 0 && !C6516gH2.R0(this.a)) {
                return true;
            }
            return false;
        }

        public boolean z() {
            if ((this.j & 8) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public class RunnableC0363a implements Runnable {
        public RunnableC0363a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.u1 && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.r1) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.x1) {
                    recyclerView2.w1 = true;
                } else {
                    recyclerView2.I();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public class RunnableC0364b implements Runnable {
        public RunnableC0364b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.M1;
            if (mVar != null) {
                mVar.x();
            }
            RecyclerView.this.k2 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public class animation.InterpolatorC0365c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public class C0366d implements D.b {
        public C0366d() {
        }

        @Override // androidx.recyclerview.widget.D.b
        public void a(H h, m.d dVar, m.d dVar2) {
            RecyclerView.this.t(h, dVar, dVar2);
        }

        @Override // androidx.recyclerview.widget.D.b
        public void b(H h) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.l1.J1(h.a, recyclerView.a1);
        }

        @Override // androidx.recyclerview.widget.D.b
        public void c(H h, m.d dVar, m.d dVar2) {
            RecyclerView.this.a1.P(h);
            RecyclerView.this.v(h, dVar, dVar2);
        }

        @Override // androidx.recyclerview.widget.D.b
        public void d(H h, m.d dVar, m.d dVar2) {
            h.K(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.D1) {
                if (recyclerView.M1.b(h, h, dVar, dVar2)) {
                    RecyclerView.this.m1();
                }
            } else if (recyclerView.M1.d(h, dVar, dVar2)) {
                RecyclerView.this.m1();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public class C0367e implements C0375e.b {
        public C0367e() {
        }

        @Override // androidx.recyclerview.widget.C0375e.b
        public View a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.C0375e.b
        public void addView(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.M(view);
        }

        @Override // androidx.recyclerview.widget.C0375e.b
        public void b(View view) {
            H x0 = RecyclerView.x0(view);
            if (x0 != null) {
                x0.F(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0375e.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C0375e.b
        public H d(View view) {
            return RecyclerView.x0(view);
        }

        @Override // androidx.recyclerview.widget.C0375e.b
        public void e(int i) {
            H x0;
            View a = a(i);
            if (a != null && (x0 = RecyclerView.x0(a)) != null) {
                if (x0.B() && !x0.N()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + x0 + RecyclerView.this.b0());
                }
                x0.b(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.C0375e.b
        public void f() {
            int c = c();
            for (int i = 0; i < c; i++) {
                View a = a(i);
                RecyclerView.this.N(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C0375e.b
        public int g(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C0375e.b
        public void h(View view) {
            H x0 = RecyclerView.x0(view);
            if (x0 != null) {
                x0.G(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0375e.b
        public void i(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.N(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.C0375e.b
        public void j(View view, int i, ViewGroup.LayoutParams layoutParams) {
            H x0 = RecyclerView.x0(view);
            if (x0 != null) {
                if (!x0.B() && !x0.N()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + x0 + RecyclerView.this.b0());
                }
                x0.f();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public class C0368f implements C0371a.InterfaceC0040a {
        public C0368f() {
        }

        @Override // androidx.recyclerview.widget.C0371a.InterfaceC0040a
        public void a(int i, int i2) {
            RecyclerView.this.c1(i, i2);
            RecyclerView.this.h2 = true;
        }

        @Override // androidx.recyclerview.widget.C0371a.InterfaceC0040a
        public void b(C0371a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0371a.InterfaceC0040a
        public void c(C0371a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0371a.InterfaceC0040a
        public void d(int i, int i2) {
            RecyclerView.this.d1(i, i2, false);
            RecyclerView.this.h2 = true;
        }

        @Override // androidx.recyclerview.widget.C0371a.InterfaceC0040a
        public void e(int i, int i2, Object obj) {
            RecyclerView.this.c2(i, i2, obj);
            RecyclerView.this.i2 = true;
        }

        @Override // androidx.recyclerview.widget.C0371a.InterfaceC0040a
        public H f(int i) {
            H o0 = RecyclerView.this.o0(i, true);
            if (o0 == null || RecyclerView.this.d1.n(o0.a)) {
                return null;
            }
            return o0;
        }

        @Override // androidx.recyclerview.widget.C0371a.InterfaceC0040a
        public void g(int i, int i2) {
            RecyclerView.this.b1(i, i2);
            RecyclerView.this.h2 = true;
        }

        @Override // androidx.recyclerview.widget.C0371a.InterfaceC0040a
        public void h(int i, int i2) {
            RecyclerView.this.d1(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.h2 = true;
            recyclerView.e2.d += i2;
        }

        public void i(C0371a.b bVar) {
            int i = bVar.a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            return;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        recyclerView.l1.o1(recyclerView, bVar.b, bVar.d, 1);
                        return;
                    }
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.l1.r1(recyclerView2, bVar.b, bVar.d, bVar.c);
                    return;
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.l1.p1(recyclerView3, bVar.b, bVar.d);
                return;
            }
            RecyclerView recyclerView4 = RecyclerView.this;
            recyclerView4.l1.m1(recyclerView4, bVar.b, bVar.d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0369g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AbstractC0370h.a.values().length];
            a = iArr;
            try {
                iArr[AbstractC0370h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AbstractC0370h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0370h<VH extends H> {
        public final i a = new i();
        public boolean b = false;
        public a c = a.ALLOW;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$h$a */
        /* loaded from: classes.dex */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public void A(RecyclerView recyclerView) {
        }

        public boolean B(VH vh) {
            return false;
        }

        public void C(VH vh) {
        }

        public void D(VH vh) {
        }

        public void E(VH vh) {
        }

        public void F(j jVar) {
            this.a.registerObserver(jVar);
        }

        public void G(boolean z) {
            if (!k()) {
                this.b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void H(a aVar) {
            this.c = aVar;
            this.a.h();
        }

        public void I(j jVar) {
            this.a.unregisterObserver(jVar);
        }

        public final void c(VH vh, int i) {
            boolean z;
            if (vh.s == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                vh.c = i;
                if (l()) {
                    vh.e = h(i);
                }
                vh.J(1, 519);
                C7139ir2.b(RecyclerView.b3);
            }
            vh.s = this;
            y(vh, i, vh.s());
            if (z) {
                vh.d();
                ViewGroup.LayoutParams layoutParams = vh.a.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).c = true;
                }
                C7139ir2.d();
            }
        }

        public boolean d() {
            int i = C0369g.a[this.c.ordinal()];
            if (i == 1 || (i == 2 && g() <= 0)) {
                return false;
            }
            return true;
        }

        public final VH e(ViewGroup viewGroup, int i) {
            try {
                C7139ir2.b(RecyclerView.e3);
                VH z = z(viewGroup, i);
                if (z.a.getParent() == null) {
                    z.f = i;
                    return z;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C7139ir2.d();
            }
        }

        public int f(AbstractC0370h<? extends H> abstractC0370h, H h, int i) {
            if (abstractC0370h == this) {
                return i;
            }
            return -1;
        }

        public abstract int g();

        public long h(int i) {
            return -1L;
        }

        public int i(int i) {
            return 0;
        }

        public final a j() {
            return this.c;
        }

        public final boolean k() {
            return this.a.a();
        }

        public final boolean l() {
            return this.b;
        }

        public final void m() {
            this.a.b();
        }

        public final void n(int i) {
            this.a.d(i, 1);
        }

        public final void o(int i, Object obj) {
            this.a.e(i, 1, obj);
        }

        public final void p(int i) {
            this.a.f(i, 1);
        }

        public final void q(int i, int i2) {
            this.a.c(i, i2);
        }

        public final void r(int i, int i2) {
            this.a.d(i, i2);
        }

        public final void s(int i, int i2, Object obj) {
            this.a.e(i, i2, obj);
        }

        public final void t(int i, int i2) {
            this.a.f(i, i2);
        }

        public final void u(int i, int i2) {
            this.a.g(i, i2);
        }

        public final void v(int i) {
            this.a.g(i, 1);
        }

        public void w(RecyclerView recyclerView) {
        }

        public abstract void x(VH vh, int i);

        public void y(VH vh, int i, List<Object> list) {
            x(vh, i);
        }

        public abstract VH z(ViewGroup viewGroup, int i);
    }

    /* loaded from: classes.dex */
    public static class i extends Observable<j> {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i, i2, 1);
            }
        }

        public void d(int i, int i2) {
            e(i, i2, null);
        }

        public void e(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i, i2, obj);
            }
        }

        public void f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i, i2);
            }
        }

        public void g(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f(i, i2);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).g();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public void a() {
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2, Object obj) {
            b(i, i2);
        }

        public void d(int i, int i2) {
        }

        public void e(int i, int i2, int i3) {
        }

        public void f(int i, int i2) {
        }

        public void g() {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        int a(int i, int i2);
    }

    /* loaded from: classes.dex */
    public static class l {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        public EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {
        public static final int g = 2;
        public static final int h = 8;
        public static final int i = 4;
        public static final int j = 2048;
        public static final int k = 4096;
        public c a = null;
        public ArrayList<b> b = new ArrayList<>();
        public long c = 120;
        public long d = 120;
        public long e = 250;
        public long f = 250;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        /* loaded from: classes.dex */
        public interface b {
            void a();
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(H h);
        }

        /* loaded from: classes.dex */
        public static class d {
            public int a;
            public int b;
            public int c;
            public int d;
            public int e;

            public d a(H h) {
                return b(h, 0);
            }

            public d b(H h, int i) {
                View view = h.a;
                this.a = view.getLeft();
                this.b = view.getTop();
                this.c = view.getRight();
                this.d = view.getBottom();
                return this;
            }
        }

        public static int e(H h2) {
            int i2 = h2.j;
            int i3 = i2 & 14;
            if (h2.x()) {
                return 4;
            }
            if ((i2 & 4) == 0) {
                int q = h2.q();
                int j2 = h2.j();
                if (q != -1 && j2 != -1 && q != j2) {
                    return i3 | 2048;
                }
            }
            return i3;
        }

        public void A(c cVar) {
            this.a = cVar;
        }

        public void B(long j2) {
            this.e = j2;
        }

        public void C(long j2) {
            this.d = j2;
        }

        public abstract boolean a(H h2, d dVar, d dVar2);

        public abstract boolean b(H h2, H h3, d dVar, d dVar2);

        public abstract boolean c(H h2, d dVar, d dVar2);

        public abstract boolean d(H h2, d dVar, d dVar2);

        public boolean f(H h2) {
            return true;
        }

        public boolean g(H h2, List<Object> list) {
            return f(h2);
        }

        public final void h(H h2) {
            t(h2);
            c cVar = this.a;
            if (cVar != null) {
                cVar.a(h2);
            }
        }

        public final void i(H h2) {
            u(h2);
        }

        public final void j() {
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.b.get(i2).a();
            }
            this.b.clear();
        }

        public abstract void k(H h2);

        public abstract void l();

        public long m() {
            return this.c;
        }

        public long n() {
            return this.f;
        }

        public long o() {
            return this.e;
        }

        public long p() {
            return this.d;
        }

        public abstract boolean q();

        public final boolean r(b bVar) {
            boolean q = q();
            if (bVar != null) {
                if (!q) {
                    bVar.a();
                    return q;
                }
                this.b.add(bVar);
            }
            return q;
        }

        public d s() {
            return new d();
        }

        public void t(H h2) {
        }

        public void u(H h2) {
        }

        public d v(D d2, H h2) {
            return s().a(h2);
        }

        public d w(D d2, H h2, int i2, List<Object> list) {
            return s().a(h2);
        }

        public abstract void x();

        public void y(long j2) {
            this.c = j2;
        }

        public void z(long j2) {
            this.f = j2;
        }
    }

    /* loaded from: classes.dex */
    public class n implements m.c {
        public n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.c
        public void a(H h) {
            h.K(true);
            if (h.h != null && h.i == null) {
                h.h = null;
            }
            h.i = null;
            if (!h.M() && !RecyclerView.this.x1(h.a) && h.B()) {
                RecyclerView.this.removeDetachedView(h.a, false);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {
        @Deprecated
        public void f(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void g(Rect rect, View view, RecyclerView recyclerView, D d) {
            f(rect, ((q) view.getLayoutParams()).d(), recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, D d) {
            h(canvas, recyclerView);
        }

        @Deprecated
        public void j(Canvas canvas, RecyclerView recyclerView) {
        }

        public void k(Canvas canvas, RecyclerView recyclerView, D d) {
            j(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public interface r {
        void b(View view);

        void d(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class s {
        public abstract boolean a(int i, int i2);
    }

    /* loaded from: classes.dex */
    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z);
    }

    /* loaded from: classes.dex */
    public static abstract class u {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface v {
    }

    /* loaded from: classes.dex */
    public static class w {
        public static final int d = 5;
        public SparseArray<a> a = new SparseArray<>();
        public int b = 0;
        public Set<AbstractC0370h<?>> c = Collections.newSetFromMap(new IdentityHashMap());

        /* loaded from: classes.dex */
        public static class a {
            public final ArrayList<H> a = new ArrayList<>();
            public int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public void a() {
            this.b++;
        }

        public void b(AbstractC0370h<?> abstractC0370h) {
            this.c.add(abstractC0370h);
        }

        public void c() {
            for (int i = 0; i < this.a.size(); i++) {
                a valueAt = this.a.valueAt(i);
                Iterator<H> it = valueAt.a.iterator();
                while (it.hasNext()) {
                    BE1.b(it.next().a);
                }
                valueAt.a.clear();
            }
        }

        public void d() {
            this.b--;
        }

        public void e(AbstractC0370h<?> abstractC0370h, boolean z) {
            this.c.remove(abstractC0370h);
            if (this.c.size() == 0 && !z) {
                for (int i = 0; i < this.a.size(); i++) {
                    SparseArray<a> sparseArray = this.a;
                    ArrayList<H> arrayList = sparseArray.get(sparseArray.keyAt(i)).a;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        BE1.b(arrayList.get(i2).a);
                    }
                }
            }
        }

        public void f(int i, long j) {
            a j2 = j(i);
            j2.d = m(j2.d, j);
        }

        public void g(int i, long j) {
            a j2 = j(i);
            j2.c = m(j2.c, j);
        }

        public H h(int i) {
            a aVar = this.a.get(i);
            if (aVar != null && !aVar.a.isEmpty()) {
                ArrayList<H> arrayList = aVar.a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!arrayList.get(size).v()) {
                        return arrayList.remove(size);
                    }
                }
                return null;
            }
            return null;
        }

        public int i(int i) {
            return j(i).a.size();
        }

        public final a j(int i) {
            a aVar = this.a.get(i);
            if (aVar == null) {
                a aVar2 = new a();
                this.a.put(i, aVar2);
                return aVar2;
            }
            return aVar;
        }

        public void k(AbstractC0370h<?> abstractC0370h, AbstractC0370h<?> abstractC0370h2, boolean z) {
            if (abstractC0370h != null) {
                d();
            }
            if (!z && this.b == 0) {
                c();
            }
            if (abstractC0370h2 != null) {
                a();
            }
        }

        public void l(H h) {
            int o2 = h.o();
            ArrayList<H> arrayList = j(o2).a;
            if (this.a.get(o2).b <= arrayList.size()) {
                BE1.b(h.a);
                return;
            }
            h.H();
            arrayList.add(h);
        }

        public long m(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return ((j / 4) * 3) + (j2 / 4);
        }

        public void n(int i, int i2) {
            a j = j(i);
            j.b = i2;
            ArrayList<H> arrayList = j.a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        public int o() {
            int i = 0;
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                ArrayList<H> arrayList = this.a.valueAt(i2).a;
                if (arrayList != null) {
                    i += arrayList.size();
                }
            }
            return i;
        }

        public boolean p(int i, long j, long j2) {
            long j3 = j(i).d;
            if (j3 != 0 && j + j3 >= j2) {
                return false;
            }
            return true;
        }

        public boolean q(int i, long j, long j2) {
            long j3 = j(i).c;
            if (j3 != 0 && j + j3 >= j2) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public final class x {
        public static final int j = 2;
        public final ArrayList<H> a;
        public ArrayList<H> b;
        public final ArrayList<H> c;
        public final List<H> d;
        public int e;
        public int f;
        public w g;
        public F h;

        public x() {
            ArrayList<H> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList<>();
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public void A() {
            v();
        }

        public void B() {
            for (int i = 0; i < this.c.size(); i++) {
                BE1.b(this.c.get(i).a);
            }
            C(RecyclerView.this.k1);
        }

        public final void C(AbstractC0370h<?> abstractC0370h) {
            D(abstractC0370h, false);
        }

        public final void D(AbstractC0370h<?> abstractC0370h, boolean z) {
            w wVar = this.g;
            if (wVar != null) {
                wVar.e(abstractC0370h, z);
            }
        }

        public void E(View view) {
            H x0 = RecyclerView.x0(view);
            x0.n = null;
            x0.f54o = false;
            x0.e();
            I(x0);
        }

        public void F() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                G(size);
            }
            this.c.clear();
            if (RecyclerView.I2) {
                RecyclerView.this.d2.b();
            }
        }

        public void G(int i) {
            a(this.c.get(i), true);
            this.c.remove(i);
        }

        public void H(View view) {
            H x0 = RecyclerView.x0(view);
            if (x0.B()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (x0.A()) {
                x0.P();
            } else if (x0.Q()) {
                x0.e();
            }
            I(x0);
            if (RecyclerView.this.M1 != null && !x0.y()) {
                RecyclerView.this.M1.k(x0);
            }
        }

        public void I(H h) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            boolean z4 = true;
            if (!h.A() && h.a.getParent() == null) {
                if (!h.B()) {
                    if (!h.N()) {
                        boolean h2 = h.h();
                        AbstractC0370h abstractC0370h = RecyclerView.this.k1;
                        if (abstractC0370h != null && h2 && abstractC0370h.B(h)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z && !h.y()) {
                            z4 = false;
                        } else {
                            if (this.f > 0 && !h.t(526)) {
                                int size = this.c.size();
                                if (size >= this.f && size > 0) {
                                    G(0);
                                    size--;
                                }
                                if (RecyclerView.I2 && size > 0 && !RecyclerView.this.d2.d(h.c)) {
                                    int i = size - 1;
                                    while (i >= 0) {
                                        if (!RecyclerView.this.d2.d(this.c.get(i).c)) {
                                            break;
                                        }
                                        i--;
                                    }
                                    size = i + 1;
                                }
                                this.c.add(size, h);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                a(h, true);
                            } else {
                                z4 = false;
                            }
                            z3 = z2;
                        }
                        RecyclerView.this.e1.q(h);
                        if (!z3 && !z4 && h2) {
                            BE1.b(h.a);
                            h.s = null;
                            h.r = null;
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.b0());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + h + RecyclerView.this.b0());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(h.A());
            sb.append(" isAttached:");
            if (h.a.getParent() != null) {
                z3 = true;
            }
            sb.append(z3);
            sb.append(RecyclerView.this.b0());
            throw new IllegalArgumentException(sb.toString());
        }

        public void J(View view) {
            H x0 = RecyclerView.x0(view);
            if (!x0.t(12) && x0.C() && !RecyclerView.this.y(x0)) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                x0.L(this, true);
                this.b.add(x0);
            } else if (x0.x() && !x0.z() && !RecyclerView.this.k1.l()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.b0());
            } else {
                x0.L(this, false);
                this.a.add(x0);
            }
        }

        public void K(w wVar) {
            C(RecyclerView.this.k1);
            w wVar2 = this.g;
            if (wVar2 != null) {
                wVar2.d();
            }
            this.g = wVar;
            if (wVar != null && RecyclerView.this.getAdapter() != null) {
                this.g.a();
            }
            v();
        }

        public void L(F f) {
            this.h = f;
        }

        public void M(int i) {
            this.e = i;
            Q();
        }

        public final boolean N(H h, int i, int i2, long j2) {
            h.s = null;
            h.r = RecyclerView.this;
            int o2 = h.o();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j2 != Long.MAX_VALUE && !this.g.p(o2, nanoTime, j2)) {
                return false;
            }
            RecyclerView.this.k1.c(h, i);
            this.g.f(h.o(), RecyclerView.this.getNanoTime() - nanoTime);
            b(h);
            if (RecyclerView.this.e2.j()) {
                h.g = i2;
                return true;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x0220 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0204  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public H O(int i, boolean z, long j2) {
            H h;
            boolean z2;
            H h2;
            boolean z3;
            boolean N;
            ViewGroup.LayoutParams layoutParams;
            q qVar;
            RecyclerView i0;
            F f;
            View a;
            if (i >= 0 && i < RecyclerView.this.e2.d()) {
                boolean z4 = true;
                if (RecyclerView.this.e2.j()) {
                    h = i(i);
                    if (h != null) {
                        z2 = true;
                        if (h == null && (h = n(i, z)) != null) {
                            if (R(h)) {
                                if (!z) {
                                    h.b(4);
                                    if (h.A()) {
                                        RecyclerView.this.removeDetachedView(h.a, false);
                                        h.P();
                                    } else if (h.Q()) {
                                        h.e();
                                    }
                                    I(h);
                                }
                                h = null;
                            } else {
                                z2 = true;
                            }
                        }
                        if (h == null) {
                            int n = RecyclerView.this.c1.n(i);
                            if (n >= 0 && n < RecyclerView.this.k1.g()) {
                                int i2 = RecyclerView.this.k1.i(n);
                                if (RecyclerView.this.k1.l() && (h = m(RecyclerView.this.k1.h(n), i2, z)) != null) {
                                    h.c = n;
                                    z2 = true;
                                }
                                if (h == null && (f = this.h) != null && (a = f.a(this, i, i2)) != null) {
                                    h = RecyclerView.this.w0(a);
                                    if (h != null) {
                                        if (h.N()) {
                                            throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view." + RecyclerView.this.b0());
                                        }
                                    } else {
                                        throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder" + RecyclerView.this.b0());
                                    }
                                }
                                if (h == null) {
                                    H h3 = j().h(i2);
                                    if (h3 != null) {
                                        h3.H();
                                        if (RecyclerView.F2) {
                                            s(h3);
                                        }
                                    }
                                    h = h3;
                                }
                                if (h == null) {
                                    long nanoTime = RecyclerView.this.getNanoTime();
                                    if (j2 != Long.MAX_VALUE && !this.g.q(i2, nanoTime, j2)) {
                                        return null;
                                    }
                                    RecyclerView recyclerView = RecyclerView.this;
                                    h = recyclerView.k1.e(recyclerView, i2);
                                    if (RecyclerView.I2 && (i0 = RecyclerView.i0(h.a)) != null) {
                                        h.b = new WeakReference<>(i0);
                                    }
                                    this.g.g(i2, RecyclerView.this.getNanoTime() - nanoTime);
                                }
                            } else {
                                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + n + ").state:" + RecyclerView.this.e2.d() + RecyclerView.this.b0());
                            }
                        }
                        h2 = h;
                        z3 = z2;
                        if (z3 && !RecyclerView.this.e2.j() && h2.t(8192)) {
                            h2.J(0, 8192);
                            if (RecyclerView.this.e2.k) {
                                RecyclerView recyclerView2 = RecyclerView.this;
                                RecyclerView.this.r1(h2, recyclerView2.M1.w(recyclerView2.e2, h2, m.e(h2) | 4096, h2.s()));
                            }
                        }
                        if (!RecyclerView.this.e2.j() && h2.w()) {
                            h2.g = i;
                        } else if (h2.w() || h2.D() || h2.x()) {
                            N = N(h2, RecyclerView.this.c1.n(i), i, j2);
                            layoutParams = h2.a.getLayoutParams();
                            if (layoutParams == null) {
                                qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                                h2.a.setLayoutParams(qVar);
                            } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                                qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                                h2.a.setLayoutParams(qVar);
                            } else {
                                qVar = (q) layoutParams;
                            }
                            qVar.a = h2;
                            if (z3 || !N) {
                                z4 = false;
                            }
                            qVar.d = z4;
                            return h2;
                        }
                        N = false;
                        layoutParams = h2.a.getLayoutParams();
                        if (layoutParams == null) {
                        }
                        qVar.a = h2;
                        if (z3) {
                        }
                        z4 = false;
                        qVar.d = z4;
                        return h2;
                    }
                } else {
                    h = null;
                }
                z2 = false;
                if (h == null) {
                    if (R(h)) {
                    }
                }
                if (h == null) {
                }
                h2 = h;
                z3 = z2;
                if (z3) {
                    h2.J(0, 8192);
                    if (RecyclerView.this.e2.k) {
                    }
                }
                if (!RecyclerView.this.e2.j()) {
                }
                if (h2.w()) {
                }
                N = N(h2, RecyclerView.this.c1.n(i), i, j2);
                layoutParams = h2.a.getLayoutParams();
                if (layoutParams == null) {
                }
                qVar.a = h2;
                if (z3) {
                }
                z4 = false;
                qVar.d = z4;
                return h2;
            }
            throw new IndexOutOfBoundsException("Invalid item position " + i + C9811tl1.c + i + "). Item count:" + RecyclerView.this.e2.d() + RecyclerView.this.b0());
        }

        public void P(H h) {
            if (h.f54o) {
                this.b.remove(h);
            } else {
                this.a.remove(h);
            }
            h.n = null;
            h.f54o = false;
            h.e();
        }

        public void Q() {
            int i;
            p pVar = RecyclerView.this.l1;
            if (pVar != null) {
                i = pVar.m;
            } else {
                i = 0;
            }
            this.f = this.e + i;
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
                G(size);
            }
        }

        public boolean R(H h) {
            if (h.z()) {
                return RecyclerView.this.e2.j();
            }
            int i = h.c;
            if (i >= 0 && i < RecyclerView.this.k1.g()) {
                if (!RecyclerView.this.e2.j() && RecyclerView.this.k1.i(h.c) != h.o()) {
                    return false;
                }
                if (RecyclerView.this.k1.l() && h.n() != RecyclerView.this.k1.h(h.c)) {
                    return false;
                }
                return true;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + h + RecyclerView.this.b0());
        }

        public void S(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                H h = this.c.get(size);
                if (h != null && (i3 = h.c) >= i && i3 < i4) {
                    h.b(2);
                    G(size);
                }
            }
        }

        public void a(H h, boolean z) {
            Q3 q3;
            RecyclerView.A(h);
            View view = h.a;
            androidx.recyclerview.widget.v vVar = RecyclerView.this.l2;
            if (vVar != null) {
                Q3 n = vVar.n();
                if (n instanceof v.a) {
                    q3 = ((v.a) n).n(view);
                } else {
                    q3 = null;
                }
                C6516gH2.I1(view, q3);
            }
            if (z) {
                h(h);
            }
            h.s = null;
            h.r = null;
            j().l(h);
        }

        public final void b(H h) {
            if (RecyclerView.this.P0()) {
                View view = h.a;
                if (C6516gH2.Z(view) == 0) {
                    C6516gH2.a2(view, 1);
                }
                androidx.recyclerview.widget.v vVar = RecyclerView.this.l2;
                if (vVar != null) {
                    Q3 n = vVar.n();
                    if (n instanceof v.a) {
                        ((v.a) n).o(view);
                    }
                    C6516gH2.I1(view, n);
                }
            }
        }

        public void c(View view, int i) {
            q qVar;
            H x0 = RecyclerView.x0(view);
            if (x0 != null) {
                int n = RecyclerView.this.c1.n(i);
                if (n >= 0 && n < RecyclerView.this.k1.g()) {
                    N(x0, n, i, Long.MAX_VALUE);
                    ViewGroup.LayoutParams layoutParams = x0.a.getLayoutParams();
                    if (layoutParams == null) {
                        qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                        x0.a.setLayoutParams(qVar);
                    } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                        qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                        x0.a.setLayoutParams(qVar);
                    } else {
                        qVar = (q) layoutParams;
                    }
                    boolean z = true;
                    qVar.c = true;
                    qVar.a = x0;
                    if (x0.a.getParent() != null) {
                        z = false;
                    }
                    qVar.d = z;
                    return;
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + n + ").state:" + RecyclerView.this.e2.d() + RecyclerView.this.b0());
            }
            throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.b0());
        }

        public void d() {
            this.a.clear();
            F();
        }

        public void e() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                this.c.get(i).c();
            }
            int size2 = this.a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.a.get(i2).c();
            }
            ArrayList<H> arrayList = this.b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.b.get(i3).c();
                }
            }
        }

        public void f() {
            this.a.clear();
            ArrayList<H> arrayList = this.b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int g(int i) {
            if (i >= 0 && i < RecyclerView.this.e2.d()) {
                if (!RecyclerView.this.e2.j()) {
                    return i;
                }
                return RecyclerView.this.c1.n(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.e2.d() + RecyclerView.this.b0());
        }

        public void h(H h) {
            y yVar = RecyclerView.this.m1;
            if (yVar != null) {
                yVar.a(h);
            }
            int size = RecyclerView.this.n1.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.n1.get(i).a(h);
            }
            AbstractC0370h abstractC0370h = RecyclerView.this.k1;
            if (abstractC0370h != null) {
                abstractC0370h.E(h);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.e2 != null) {
                recyclerView.e1.q(h);
            }
        }

        public H i(int i) {
            int size;
            int n;
            ArrayList<H> arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    H h = this.b.get(i2);
                    if (!h.Q() && h.p() == i) {
                        h.b(32);
                        return h;
                    }
                }
                if (RecyclerView.this.k1.l() && (n = RecyclerView.this.c1.n(i)) > 0 && n < RecyclerView.this.k1.g()) {
                    long h2 = RecyclerView.this.k1.h(n);
                    for (int i3 = 0; i3 < size; i3++) {
                        H h3 = this.b.get(i3);
                        if (!h3.Q() && h3.n() == h2) {
                            h3.b(32);
                            return h3;
                        }
                    }
                }
            }
            return null;
        }

        public w j() {
            if (this.g == null) {
                this.g = new w();
                v();
            }
            return this.g;
        }

        public int k() {
            return this.a.size();
        }

        public List<H> l() {
            return this.d;
        }

        public H m(long j2, int i, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                H h = this.a.get(size);
                if (h.n() == j2 && !h.Q()) {
                    if (i == h.o()) {
                        h.b(32);
                        if (h.z() && !RecyclerView.this.e2.j()) {
                            h.J(2, 14);
                        }
                        return h;
                    } else if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(h.a, false);
                        E(h.a);
                    }
                }
            }
            int size2 = this.c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                H h2 = this.c.get(size2);
                if (h2.n() == j2 && !h2.v()) {
                    if (i == h2.o()) {
                        if (!z) {
                            this.c.remove(size2);
                        }
                        return h2;
                    } else if (!z) {
                        G(size2);
                        return null;
                    }
                }
            }
        }

        public H n(int i, boolean z) {
            View e;
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                H h = this.a.get(i2);
                if (!h.Q() && h.p() == i && !h.x() && (RecyclerView.this.e2.h || !h.z())) {
                    h.b(32);
                    return h;
                }
            }
            if (!z && (e = RecyclerView.this.d1.e(i)) != null) {
                H x0 = RecyclerView.x0(e);
                RecyclerView.this.d1.s(e);
                int m = RecyclerView.this.d1.m(e);
                if (m != -1) {
                    RecyclerView.this.d1.d(m);
                    J(e);
                    x0.b(8224);
                    return x0;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + x0 + RecyclerView.this.b0());
            }
            int size2 = this.c.size();
            for (int i3 = 0; i3 < size2; i3++) {
                H h2 = this.c.get(i3);
                if (!h2.x() && h2.p() == i && !h2.v()) {
                    if (!z) {
                        this.c.remove(i3);
                    }
                    return h2;
                }
            }
            return null;
        }

        public View o(int i) {
            return this.a.get(i).a;
        }

        public View p(int i) {
            return q(i, false);
        }

        public View q(int i, boolean z) {
            return O(i, z, Long.MAX_VALUE).a;
        }

        public final void r(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    r((ViewGroup) childAt, true);
                }
            }
            if (!z) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }

        public final void s(H h) {
            View view = h.a;
            if (view instanceof ViewGroup) {
                r((ViewGroup) view, false);
            }
        }

        public void t() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                q qVar = (q) this.c.get(i).a.getLayoutParams();
                if (qVar != null) {
                    qVar.c = true;
                }
            }
        }

        public void u() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                H h = this.c.get(i);
                if (h != null) {
                    h.b(6);
                    h.a(null);
                }
            }
            AbstractC0370h abstractC0370h = RecyclerView.this.k1;
            if (abstractC0370h != null && abstractC0370h.l()) {
                return;
            }
            F();
        }

        public final void v() {
            if (this.g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.k1 != null && recyclerView.isAttachedToWindow()) {
                    this.g.b(RecyclerView.this.k1);
                }
            }
        }

        public void w(int i, int i2) {
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                H h = this.c.get(i3);
                if (h != null && h.c >= i) {
                    h.E(i2, false);
                }
            }
        }

        public void x(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.c.size();
            for (int i7 = 0; i7 < size; i7++) {
                H h = this.c.get(i7);
                if (h != null && (i6 = h.c) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        h.E(i2 - i, false);
                    } else {
                        h.E(i3, false);
                    }
                }
            }
        }

        public void y(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                H h = this.c.get(size);
                if (h != null) {
                    int i4 = h.c;
                    if (i4 >= i3) {
                        h.E(-i2, z);
                    } else if (i4 >= i) {
                        h.b(8);
                        G(size);
                    }
                }
            }
        }

        public void z(AbstractC0370h<?> abstractC0370h, AbstractC0370h<?> abstractC0370h2, boolean z) {
            d();
            D(abstractC0370h, true);
            j().k(abstractC0370h, abstractC0370h2, z);
            v();
        }
    }

    /* loaded from: classes.dex */
    public interface y {
        void a(H h);
    }

    /* loaded from: classes.dex */
    public class z extends j {
        public z() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.x(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.e2.g = true;
            recyclerView.p1(true);
            if (!RecyclerView.this.c1.q()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i, int i2, Object obj) {
            RecyclerView.this.x(null);
            if (RecyclerView.this.c1.s(i, i2, obj)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i, int i2) {
            RecyclerView.this.x(null);
            if (RecyclerView.this.c1.t(i, i2)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i, int i2, int i3) {
            RecyclerView.this.x(null);
            if (RecyclerView.this.c1.u(i, i2, i3)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i, int i2) {
            RecyclerView.this.x(null);
            if (RecyclerView.this.c1.v(i, i2)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            AbstractC0370h abstractC0370h;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.b1 != null && (abstractC0370h = recyclerView.k1) != null && abstractC0370h.d()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void h() {
            if (RecyclerView.H2) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.s1 && recyclerView.r1) {
                    C6516gH2.w1(recyclerView, recyclerView.g1);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.A1 = true;
            recyclerView2.requestLayout();
        }
    }

    static {
        Class cls = Integer.TYPE;
        f3 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        l3 = new animation.InterpolatorC0365c();
        m3 = new E();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static void A(H h) {
        WeakReference<RecyclerView> weakReference = h.b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView != h.a) {
                    ViewParent parent = recyclerView.getParent();
                    if (parent instanceof View) {
                        recyclerView = (View) parent;
                    } else {
                        recyclerView = null;
                    }
                } else {
                    return;
                }
            }
            h.b = null;
        }
    }

    private float E0(int i2) {
        double log = Math.log((Math.abs(i2) * 0.35f) / (this.Y0 * 0.015f));
        float f = E2;
        return (float) (this.Y0 * 0.015f * Math.exp((f / (f - 1.0d)) * log));
    }

    private boolean X1(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.I1;
        if (edgeEffect != null && C7956m90.d(edgeEffect) != 0.0f && !canScrollHorizontally(-1)) {
            C7956m90.j(this.I1, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z3 = true;
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.K1;
        if (edgeEffect2 != null && C7956m90.d(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            C7956m90.j(this.K1, 0.0f, motionEvent.getY() / getHeight());
            z3 = true;
        }
        EdgeEffect edgeEffect3 = this.J1;
        if (edgeEffect3 != null && C7956m90.d(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            C7956m90.j(this.J1, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        }
        EdgeEffect edgeEffect4 = this.L1;
        if (edgeEffect4 != null && C7956m90.d(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
            C7956m90.j(this.L1, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z3;
    }

    private C9584sp1 getScrollingChildHelper() {
        if (this.o2 == null) {
            this.o2 = new C9584sp1(this);
        }
        return this.o2;
    }

    public static RecyclerView i0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView i0 = i0(viewGroup.getChildAt(i2));
            if (i0 != null) {
                return i0;
            }
        }
        return null;
    }

    private int v1(int i2, float f) {
        float width = f / getWidth();
        float height = i2 / getHeight();
        EdgeEffect edgeEffect = this.J1;
        float f2 = 0.0f;
        if (edgeEffect != null && C7956m90.d(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.J1.onRelease();
            } else {
                float f4 = -C7956m90.j(this.J1, -height, width);
                if (C7956m90.d(this.J1) == 0.0f) {
                    this.J1.onRelease();
                }
                f2 = f4;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.L1;
            if (edgeEffect2 != null && C7956m90.d(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.L1.onRelease();
                } else {
                    float j2 = C7956m90.j(this.L1, height, 1.0f - width);
                    if (C7956m90.d(this.L1) == 0.0f) {
                        this.L1.onRelease();
                    }
                    f2 = j2;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    public static H x0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).a;
    }

    public static void z0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    public final int A0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public void A1(r rVar) {
        List<r> list = this.C1;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    public void B() {
        int j2 = this.d1.j();
        for (int i2 = 0; i2 < j2; i2++) {
            H x0 = x0(this.d1.i(i2));
            if (!x0.N()) {
                x0.c();
            }
        }
        this.a1.e();
    }

    public final String B0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(UE.h)) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    public void B1(t tVar) {
        this.p1.remove(tVar);
        if (this.q1 == tVar) {
            this.q1 = null;
        }
    }

    public void C() {
        List<r> list = this.C1;
        if (list != null) {
            list.clear();
        }
    }

    public Rect C0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.c) {
            return qVar.b;
        }
        if (this.e2.j() && (qVar.f() || qVar.h())) {
            return qVar.b;
        }
        Rect rect = qVar.b;
        rect.set(0, 0, 0, 0);
        int size = this.o1.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.h1.set(0, 0, 0, 0);
            this.o1.get(i2).g(this.h1, view, this, this.e2);
            int i4 = rect.left;
            Rect rect2 = this.h1;
            rect.left = i4 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.c = false;
        return rect;
    }

    public void C1(u uVar) {
        List<u> list = this.g2;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public void D() {
        List<u> list = this.g2;
        if (list != null) {
            list.clear();
        }
    }

    public o D0(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            return this.o1.get(i2);
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public void D1(y yVar) {
        this.n1.remove(yVar);
    }

    public void E(int i2, int i4) {
        boolean z3;
        EdgeEffect edgeEffect = this.I1;
        if (edgeEffect != null && !edgeEffect.isFinished() && i2 > 0) {
            this.I1.onRelease();
            z3 = this.I1.isFinished();
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.K1;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.K1.onRelease();
            z3 |= this.K1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.J1.onRelease();
            z3 |= this.J1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L1;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.L1.onRelease();
            z3 |= this.L1.isFinished();
        }
        if (z3) {
            C6516gH2.u1(this);
        }
    }

    public void E1() {
        H h;
        int g = this.d1.g();
        for (int i2 = 0; i2 < g; i2++) {
            View f = this.d1.f(i2);
            H w0 = w0(f);
            if (w0 != null && (h = w0.i) != null) {
                View view = h.a;
                int left = f.getLeft();
                int top = f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public int F(int i2) {
        return G(i2, this.I1, this.K1, getWidth());
    }

    public final void F0(long j2, H h, H h2) {
        int g = this.d1.g();
        for (int i2 = 0; i2 < g; i2++) {
            H x0 = x0(this.d1.f(i2));
            if (x0 != h && r0(x0) == j2) {
                AbstractC0370h abstractC0370h = this.k1;
                if (abstractC0370h != null && abstractC0370h.l()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + x0 + " \n View Holder 2:" + h + b0());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + x0 + " \n View Holder 2:" + h + b0());
            }
        }
        Log.e(y2, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + h2 + " cannot be found but it is necessary for " + h + b0());
    }

    public final void F1(View view, View view2) {
        View view3;
        boolean z3;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.h1.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.c) {
                Rect rect = qVar.b;
                Rect rect2 = this.h1;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.h1);
            offsetRectIntoDescendantCoords(view, this.h1);
        }
        p pVar = this.l1;
        Rect rect3 = this.h1;
        boolean z4 = !this.u1;
        if (view2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        pVar.Q1(this, view, rect3, z4, z3);
    }

    public final int G(int i2, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i4) {
        if (i2 > 0 && edgeEffect != null && C7956m90.d(edgeEffect) != 0.0f) {
            int round = Math.round(((-i4) / 4.0f) * C7956m90.j(edgeEffect, ((-i2) * 4.0f) / i4, 0.5f));
            if (round != i2) {
                edgeEffect.finish();
            }
            return i2 - round;
        } else if (i2 < 0 && edgeEffect2 != null && C7956m90.d(edgeEffect2) != 0.0f) {
            float f = i4;
            int round2 = Math.round((f / 4.0f) * C7956m90.j(edgeEffect2, (i2 * 4.0f) / f, 0.5f));
            if (round2 != i2) {
                edgeEffect2.finish();
            }
            return i2 - round2;
        } else {
            return i2;
        }
    }

    public boolean G0() {
        return this.s1;
    }

    public final void G1() {
        D d = this.e2;
        d.n = -1L;
        d.m = -1;
        d.f53o = -1;
    }

    public int H(int i2) {
        return G(i2, this.J1, this.L1, getHeight());
    }

    public boolean H0() {
        if (this.u1 && !this.D1 && !this.c1.q()) {
            return false;
        }
        return true;
    }

    public final void H1() {
        VelocityTracker velocityTracker = this.P1;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        g(0);
        t1();
    }

    public void I() {
        if (this.u1 && !this.D1) {
            if (this.c1.q()) {
                if (this.c1.p(4) && !this.c1.p(11)) {
                    C7139ir2.b(a3);
                    W1();
                    g1();
                    this.c1.x();
                    if (!this.w1) {
                        if (I0()) {
                            P();
                        } else {
                            this.c1.j();
                        }
                    }
                    Y1(true);
                    h1();
                    C7139ir2.d();
                    return;
                } else if (this.c1.q()) {
                    C7139ir2.b(Z2);
                    P();
                    C7139ir2.d();
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        C7139ir2.b(Z2);
        P();
        C7139ir2.d();
    }

    public final boolean I0() {
        int g = this.d1.g();
        for (int i2 = 0; i2 < g; i2++) {
            H x0 = x0(this.d1.f(i2));
            if (x0 != null && !x0.N() && x0.C()) {
                return true;
            }
        }
        return false;
    }

    public final void I1() {
        View view;
        long j2;
        int j4;
        H h = null;
        if (this.a2 && hasFocus() && this.k1 != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            h = f0(view);
        }
        if (h == null) {
            G1();
            return;
        }
        D d = this.e2;
        if (this.k1.l()) {
            j2 = h.n();
        } else {
            j2 = -1;
        }
        d.n = j2;
        D d2 = this.e2;
        if (this.D1) {
            j4 = -1;
        } else if (h.z()) {
            j4 = h.d;
        } else {
            j4 = h.j();
        }
        d2.m = j4;
        this.e2.f53o = A0(h.a);
    }

    public final void J(Context context, String str, AttributeSet attributeSet, int i2, int i4) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String B0 = B0(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(B0, false, classLoader).asSubclass(p.class);
                    try {
                        constructor = asSubclass.getConstructor(f3);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i4)};
                    } catch (NoSuchMethodException e) {
                        objArr = null;
                        try {
                            constructor = asSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + B0, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((p) constructor.newInstance(objArr));
                } catch (ClassCastException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + B0, e4);
                } catch (ClassNotFoundException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + B0, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + B0, e6);
                } catch (InstantiationException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + B0, e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + B0, e8);
                }
            }
        }
    }

    public void J0() {
        this.c1 = new C0371a(new C0368f());
    }

    public void J1() {
        int j2 = this.d1.j();
        for (int i2 = 0; i2 < j2; i2++) {
            H x0 = x0(this.d1.i(i2));
            if (!x0.N()) {
                x0.I();
            }
        }
    }

    public void K(int i2, int i4) {
        setMeasuredDimension(p.v(i2, getPaddingLeft() + getPaddingRight(), C6516gH2.k0(this)), p.v(i4, getPaddingTop() + getPaddingBottom(), C6516gH2.j0(this)));
    }

    public final void K0() {
        if (C6516gH2.a0(this) == 0) {
            C6516gH2.c2(this, 8);
        }
    }

    public boolean K1(int i2, int i4, MotionEvent motionEvent, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        I();
        if (this.k1 != null) {
            int[] iArr = this.r2;
            iArr[0] = 0;
            iArr[1] = 0;
            L1(i2, i4, iArr);
            int[] iArr2 = this.r2;
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            i8 = i2 - i10;
            i9 = i4 - i11;
            i7 = i11;
            i6 = i10;
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        if (!this.o1.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.r2;
        iArr3[0] = 0;
        iArr3[1] = 0;
        a(i6, i7, i8, i9, this.p2, i5, iArr3);
        int[] iArr4 = this.r2;
        int i12 = iArr4[0];
        int i13 = i8 - i12;
        int i14 = iArr4[1];
        int i15 = i9 - i14;
        if (i12 == 0 && i14 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        int i16 = this.S1;
        int[] iArr5 = this.p2;
        int i17 = iArr5[0];
        this.S1 = i16 - i17;
        int i18 = this.T1;
        int i19 = iArr5[1];
        this.T1 = i18 - i19;
        int[] iArr6 = this.q2;
        iArr6[0] = iArr6[0] + i17;
        iArr6[1] = iArr6[1] + i19;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C4717Xk1.l(motionEvent, 8194)) {
                q1(motionEvent.getX(), i13, motionEvent.getY(), i15);
            }
            E(i2, i4);
        }
        if (i6 != 0 || i7 != 0) {
            U(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z3 || i6 != 0 || i7 != 0) {
            return true;
        }
        return false;
    }

    public final boolean L(int i2, int i4) {
        h0(this.n2);
        int[] iArr = this.n2;
        if (iArr[0] == i2 && iArr[1] == i4) {
            return false;
        }
        return true;
    }

    public final void L0() {
        this.d1 = new C0375e(new C0367e());
    }

    public void L1(int i2, int i4, int[] iArr) {
        int i5;
        int i6;
        W1();
        g1();
        C7139ir2.b(X2);
        c0(this.e2);
        if (i2 != 0) {
            i5 = this.l1.U1(i2, this.a1, this.e2);
        } else {
            i5 = 0;
        }
        if (i4 != 0) {
            i6 = this.l1.W1(i4, this.a1, this.e2);
        } else {
            i6 = 0;
        }
        C7139ir2.d();
        E1();
        h1();
        Y1(false);
        if (iArr != null) {
            iArr[0] = i5;
            iArr[1] = i6;
        }
    }

    public void M(View view) {
        H x0 = x0(view);
        e1(view);
        AbstractC0370h abstractC0370h = this.k1;
        if (abstractC0370h != null && x0 != null) {
            abstractC0370h.C(x0);
        }
        List<r> list = this.C1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.C1.get(size).d(view);
            }
        }
    }

    public void M0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C8982qM1.b.a), resources.getDimensionPixelSize(C8982qM1.b.c), resources.getDimensionPixelOffset(C8982qM1.b.b));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + b0());
    }

    public void M1(int i2) {
        if (this.x1) {
            return;
        }
        Z1();
        p pVar = this.l1;
        if (pVar == null) {
            Log.e(y2, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        pVar.V1(i2);
        awakenScrollBars();
    }

    public void N(View view) {
        H x0 = x0(view);
        f1(view);
        AbstractC0370h abstractC0370h = this.k1;
        if (abstractC0370h != null && x0 != null) {
            abstractC0370h.D(x0);
        }
        List<r> list = this.C1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.C1.get(size).b(view);
            }
        }
    }

    public void N0() {
        this.L1 = null;
        this.J1 = null;
        this.K1 = null;
        this.I1 = null;
    }

    public final void N1(AbstractC0370h<?> abstractC0370h, boolean z3, boolean z4) {
        AbstractC0370h abstractC0370h2 = this.k1;
        if (abstractC0370h2 != null) {
            abstractC0370h2.I(this.Z0);
            this.k1.A(this);
        }
        if (!z3 || z4) {
            w1();
        }
        this.c1.z();
        AbstractC0370h<?> abstractC0370h3 = this.k1;
        this.k1 = abstractC0370h;
        if (abstractC0370h != null) {
            abstractC0370h.F(this.Z0);
            abstractC0370h.w(this);
        }
        p pVar = this.l1;
        if (pVar != null) {
            pVar.Z0(abstractC0370h3, this.k1);
        }
        this.a1.z(abstractC0370h3, this.k1, z3);
        this.e2.g = true;
    }

    public final void O() {
        int i2 = this.z1;
        this.z1 = 0;
        if (i2 != 0 && P0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            R3.k(obtain, i2);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    public void O0() {
        if (this.o1.size() == 0) {
            return;
        }
        p pVar = this.l1;
        if (pVar != null) {
            pVar.n("Cannot invalidate item decorations during a scroll or layout");
        }
        V0();
        requestLayout();
    }

    public boolean O1(H h, int i2) {
        if (R0()) {
            h.q = i2;
            this.s2.add(h);
            return false;
        }
        C6516gH2.a2(h.a, i2);
        return true;
    }

    public void P() {
        boolean z3;
        if (this.k1 == null) {
            Log.w(y2, "No adapter attached; skipping layout");
        } else if (this.l1 == null) {
            Log.e(y2, "No layout manager attached; skipping layout");
        } else {
            this.e2.j = false;
            if (this.u2 && (this.v2 != getWidth() || this.w2 != getHeight())) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.v2 = 0;
            this.w2 = 0;
            this.u2 = false;
            if (this.e2.e == 1) {
                Q();
                this.l1.Y1(this);
                R();
            } else if (!this.c1.r() && !z3 && this.l1.D0() == getWidth() && this.l1.j0() == getHeight()) {
                this.l1.Y1(this);
            } else {
                this.l1.Y1(this);
                R();
            }
            S();
        }
    }

    public boolean P0() {
        AccessibilityManager accessibilityManager = this.B1;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            return true;
        }
        return false;
    }

    public final boolean P1(EdgeEffect edgeEffect, int i2, int i4) {
        if (i2 > 0) {
            return true;
        }
        if (E0(-i2) < C7956m90.d(edgeEffect) * i4) {
            return true;
        }
        return false;
    }

    public final void Q() {
        boolean z3 = true;
        this.e2.a(1);
        c0(this.e2);
        this.e2.j = false;
        W1();
        this.e1.f();
        g1();
        o1();
        I1();
        D d = this.e2;
        d.i = (d.k && this.i2) ? false : false;
        this.i2 = false;
        this.h2 = false;
        d.h = d.l;
        d.f = this.k1.g();
        h0(this.n2);
        if (this.e2.k) {
            int g = this.d1.g();
            for (int i2 = 0; i2 < g; i2++) {
                H x0 = x0(this.d1.f(i2));
                if (!x0.N() && (!x0.x() || this.k1.l())) {
                    this.e1.e(x0, this.M1.w(this.e2, x0, m.e(x0), x0.s()));
                    if (this.e2.i && x0.C() && !x0.z() && !x0.N() && !x0.x()) {
                        this.e1.c(r0(x0), x0);
                    }
                }
            }
        }
        if (this.e2.l) {
            J1();
            D d2 = this.e2;
            boolean z4 = d2.g;
            d2.g = false;
            this.l1.s1(this.a1, d2);
            this.e2.g = z4;
            for (int i4 = 0; i4 < this.d1.g(); i4++) {
                H x02 = x0(this.d1.f(i4));
                if (!x02.N() && !this.e1.i(x02)) {
                    int e = m.e(x02);
                    boolean t2 = x02.t(8192);
                    if (!t2) {
                        e |= 4096;
                    }
                    m.d w2 = this.M1.w(this.e2, x02, e, x02.s());
                    if (t2) {
                        r1(x02, w2);
                    } else {
                        this.e1.a(x02, w2);
                    }
                }
            }
            B();
        } else {
            B();
        }
        h1();
        Y1(false);
        this.e2.e = 2;
    }

    public boolean Q0() {
        m mVar = this.M1;
        if (mVar != null && mVar.q()) {
            return true;
        }
        return false;
    }

    public boolean Q1(AccessibilityEvent accessibilityEvent) {
        int i2;
        int i4 = 0;
        if (!R0()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i2 = R3.d(accessibilityEvent);
        } else {
            i2 = 0;
        }
        if (i2 != 0) {
            i4 = i2;
        }
        this.z1 |= i4;
        return true;
    }

    public final void R() {
        boolean z3;
        W1();
        g1();
        this.e2.a(6);
        this.c1.k();
        this.e2.f = this.k1.g();
        this.e2.d = 0;
        if (this.b1 != null && this.k1.d()) {
            Parcelable parcelable = this.b1.Z;
            if (parcelable != null) {
                this.l1.x1(parcelable);
            }
            this.b1 = null;
        }
        D d = this.e2;
        d.h = false;
        this.l1.s1(this.a1, d);
        D d2 = this.e2;
        d2.g = false;
        if (d2.k && this.M1 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        d2.k = z3;
        d2.e = 4;
        h1();
        Y1(false);
    }

    public boolean R0() {
        if (this.F1 > 0) {
            return true;
        }
        return false;
    }

    public void R1(int i2, int i4) {
        S1(i2, i4, null);
    }

    public final void S() {
        RecyclerView recyclerView;
        this.e2.a(4);
        W1();
        g1();
        D d = this.e2;
        d.e = 1;
        if (d.k) {
            for (int g = this.d1.g() - 1; g >= 0; g--) {
                H x0 = x0(this.d1.f(g));
                if (!x0.N()) {
                    long r0 = r0(x0);
                    m.d v2 = this.M1.v(this.e2, x0);
                    H g2 = this.e1.g(r0);
                    if (g2 != null && !g2.N()) {
                        boolean h = this.e1.h(g2);
                        boolean h2 = this.e1.h(x0);
                        if (h && g2 == x0) {
                            this.e1.d(x0, v2);
                        } else {
                            m.d n2 = this.e1.n(g2);
                            this.e1.d(x0, v2);
                            m.d m2 = this.e1.m(x0);
                            if (n2 == null) {
                                F0(r0, x0, g2);
                            } else {
                                u(g2, x0, n2, m2, h, h2);
                            }
                        }
                    } else {
                        this.e1.d(x0, v2);
                    }
                }
            }
            recyclerView = this;
            recyclerView.e1.o(recyclerView.x2);
        } else {
            recyclerView = this;
        }
        recyclerView.l1.I1(recyclerView.a1);
        D d2 = recyclerView.e2;
        d2.c = d2.f;
        recyclerView.D1 = false;
        recyclerView.E1 = false;
        d2.k = false;
        d2.l = false;
        recyclerView.l1.h = false;
        ArrayList<H> arrayList = recyclerView.a1.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = recyclerView.l1;
        if (pVar.n) {
            pVar.m = 0;
            pVar.n = false;
            recyclerView.a1.Q();
        }
        recyclerView.l1.t1(recyclerView.e2);
        h1();
        Y1(false);
        recyclerView.e1.f();
        int[] iArr = recyclerView.n2;
        if (L(iArr[0], iArr[1])) {
            U(0, 0);
        }
        s1();
        G1();
    }

    @Deprecated
    public boolean S0() {
        return isLayoutSuppressed();
    }

    public void S1(int i2, int i4, Interpolator interpolator) {
        T1(i2, i4, interpolator, Integer.MIN_VALUE);
    }

    public void T(int i2) {
        p pVar = this.l1;
        if (pVar != null) {
            pVar.z1(i2);
        }
        k1(i2);
        u uVar = this.f2;
        if (uVar != null) {
            uVar.a(this, i2);
        }
        List<u> list = this.g2;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.g2.get(size).a(this, i2);
            }
        }
    }

    public final boolean T0(View view, View view2, int i2) {
        int i4;
        int i5;
        if (view2 == null || view2 == this || view2 == view || e0(view2) == null) {
            return false;
        }
        if (view == null || e0(view) == null) {
            return true;
        }
        this.h1.set(0, 0, view.getWidth(), view.getHeight());
        this.i1.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.h1);
        offsetDescendantRectToMyCoords(view2, this.i1);
        char c = 65535;
        if (this.l1.m0() == 1) {
            i4 = -1;
        } else {
            i4 = 1;
        }
        Rect rect = this.h1;
        int i6 = rect.left;
        Rect rect2 = this.i1;
        int i7 = rect2.left;
        if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
            i5 = 1;
        } else {
            int i8 = rect.right;
            int i9 = rect2.right;
            if ((i8 > i9 || i6 >= i9) && i6 > i7) {
                i5 = -1;
            } else {
                i5 = 0;
            }
        }
        int i10 = rect.top;
        int i11 = rect2.top;
        if ((i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            if ((i12 <= i13 && i10 < i13) || i10 <= i11) {
                c = 0;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 17) {
                    if (i2 != 33) {
                        if (i2 != 66) {
                            if (i2 == 130) {
                                if (c <= 0) {
                                    return false;
                                }
                                return true;
                            }
                            throw new IllegalArgumentException("Invalid direction: " + i2 + b0());
                        } else if (i5 <= 0) {
                            return false;
                        } else {
                            return true;
                        }
                    } else if (c >= 0) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (i5 >= 0) {
                    return false;
                } else {
                    return true;
                }
            } else if (c <= 0 && (c != 0 || i5 * i4 <= 0)) {
                return false;
            } else {
                return true;
            }
        } else if (c >= 0 && (c != 0 || i5 * i4 >= 0)) {
            return false;
        } else {
            return true;
        }
    }

    public void T1(int i2, int i4, Interpolator interpolator, int i5) {
        U1(i2, i4, interpolator, i5, false);
    }

    public void U(int i2, int i4) {
        this.G1++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i4);
        l1(i2, i4);
        u uVar = this.f2;
        if (uVar != null) {
            uVar.b(this, i2, i4);
        }
        List<u> list = this.g2;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.g2.get(size).b(this, i2, i4);
            }
        }
        this.G1--;
    }

    public void U0(int i2) {
        if (this.l1 == null) {
            return;
        }
        setScrollState(2);
        this.l1.V1(i2);
        awakenScrollBars();
    }

    public void U1(int i2, int i4, Interpolator interpolator, int i5, boolean z3) {
        p pVar = this.l1;
        if (pVar == null) {
            Log.e(y2, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.x1) {
            int i6 = 0;
            if (!pVar.s()) {
                i2 = 0;
            }
            if (!this.l1.t()) {
                i4 = 0;
            }
            if (i2 == 0 && i4 == 0) {
                return;
            }
            if (i5 != Integer.MIN_VALUE && i5 <= 0) {
                scrollBy(i2, i4);
                return;
            }
            if (z3) {
                if (i2 != 0) {
                    i6 = 1;
                }
                if (i4 != 0) {
                    i6 |= 2;
                }
                d(i6, 1);
            }
            this.b2.e(i2, i4, i5, interpolator);
        }
    }

    public void V() {
        int i2;
        for (int size = this.s2.size() - 1; size >= 0; size--) {
            H h = this.s2.get(size);
            if (h.a.getParent() == this && !h.N() && (i2 = h.q) != -1) {
                C6516gH2.a2(h.a, i2);
                h.q = -1;
            }
        }
        this.s2.clear();
    }

    public void V0() {
        int j2 = this.d1.j();
        for (int i2 = 0; i2 < j2; i2++) {
            ((q) this.d1.i(i2).getLayoutParams()).c = true;
        }
        this.a1.t();
    }

    public void V1(int i2) {
        if (this.x1) {
            return;
        }
        p pVar = this.l1;
        if (pVar == null) {
            Log.e(y2, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.j2(this, this.e2, i2);
        }
    }

    public final boolean W(MotionEvent motionEvent) {
        t tVar = this.q1;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return g0(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.q1 = null;
        }
        return true;
    }

    public void W0() {
        int j2 = this.d1.j();
        for (int i2 = 0; i2 < j2; i2++) {
            H x0 = x0(this.d1.i(i2));
            if (x0 != null && !x0.N()) {
                x0.b(6);
            }
        }
        V0();
        this.a1.u();
    }

    public void W1() {
        int i2 = this.v1 + 1;
        this.v1 = i2;
        if (i2 == 1 && !this.x1) {
            this.w1 = false;
        }
    }

    public void X() {
        if (this.L1 != null) {
            return;
        }
        EdgeEffect a = this.H1.a(this, 3);
        this.L1 = a;
        if (this.f1) {
            a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void X0(int i2, int i4) {
        Y0(i2, i4, null, 1);
    }

    public void Y() {
        if (this.I1 != null) {
            return;
        }
        EdgeEffect a = this.H1.a(this, 0);
        this.I1 = a;
        if (this.f1) {
            a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void Y0(int i2, int i4, MotionEvent motionEvent, int i5) {
        int i6;
        float y3;
        float x2;
        int i7;
        int i8;
        int i9;
        p pVar = this.l1;
        if (pVar == null) {
            Log.e(y2, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.x1) {
        } else {
            int[] iArr = this.r2;
            int i10 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean s2 = pVar.s();
            boolean t2 = this.l1.t();
            if (t2) {
                i6 = s2 | 2;
            } else {
                i6 = s2;
            }
            if (motionEvent == null) {
                y3 = getHeight() / 2.0f;
            } else {
                y3 = motionEvent.getY();
            }
            if (motionEvent == null) {
                x2 = getWidth() / 2.0f;
            } else {
                x2 = motionEvent.getX();
            }
            int u1 = i2 - u1(i2, y3);
            int v1 = i4 - v1(i4, x2);
            d(i6, i5);
            if (s2 != 0) {
                i7 = u1;
            } else {
                i7 = 0;
            }
            if (t2) {
                i8 = v1;
            } else {
                i8 = 0;
            }
            if (f(i7, i8, this.r2, this.p2, i5)) {
                int[] iArr2 = this.r2;
                u1 -= iArr2[0];
                v1 -= iArr2[1];
            }
            if (s2 != 0) {
                i9 = u1;
            } else {
                i9 = 0;
            }
            if (t2) {
                i10 = v1;
            }
            K1(i9, i10, motionEvent, i5);
            androidx.recyclerview.widget.l lVar = this.c2;
            if (lVar != null && (u1 != 0 || v1 != 0)) {
                lVar.f(this, u1, v1);
            }
            g(i5);
        }
    }

    public void Y1(boolean z3) {
        if (this.v1 < 1) {
            this.v1 = 1;
        }
        if (!z3 && !this.x1) {
            this.w1 = false;
        }
        if (this.v1 == 1) {
            if (z3 && this.w1 && !this.x1 && this.l1 != null && this.k1 != null) {
                P();
            }
            if (!this.x1) {
                this.w1 = false;
            }
        }
        this.v1--;
    }

    public void Z() {
        if (this.K1 != null) {
            return;
        }
        EdgeEffect a = this.H1.a(this, 2);
        this.K1 = a;
        if (this.f1) {
            a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void Z0(int i2) {
        int g = this.d1.g();
        for (int i4 = 0; i4 < g; i4++) {
            this.d1.f(i4).offsetLeftAndRight(i2);
        }
    }

    public void Z1() {
        setScrollState(0);
        a2();
    }

    @Override // o.InterfaceC9092qp1
    public final void a(int i2, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        getScrollingChildHelper().e(i2, i4, i5, i6, iArr, i7, iArr2);
    }

    public void a0() {
        if (this.J1 != null) {
            return;
        }
        EdgeEffect a = this.H1.a(this, 1);
        this.J1 = a;
        if (this.f1) {
            a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void a1(int i2) {
        int g = this.d1.g();
        for (int i4 = 0; i4 < g; i4++) {
            this.d1.f(i4).offsetTopAndBottom(i2);
        }
    }

    public final void a2() {
        this.b2.f();
        p pVar = this.l1;
        if (pVar != null) {
            pVar.m2();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i4) {
        p pVar = this.l1;
        if (pVar != null && pVar.a1(this, arrayList, i2, i4)) {
            return;
        }
        super.addFocusables(arrayList, i2, i4);
    }

    @Override // o.InterfaceC8849pp1
    public boolean b(int i2) {
        return getScrollingChildHelper().l(i2);
    }

    public String b0() {
        return C4500Ve2.b + super.toString() + ", adapter:" + this.k1 + ", layout:" + this.l1 + ", context:" + getContext();
    }

    public void b1(int i2, int i4) {
        int j2 = this.d1.j();
        for (int i5 = 0; i5 < j2; i5++) {
            H x0 = x0(this.d1.i(i5));
            if (x0 != null && !x0.N() && x0.c >= i2) {
                x0.E(i4, false);
                this.e2.g = true;
            }
        }
        this.a1.w(i2, i4);
        requestLayout();
    }

    public void b2(AbstractC0370h abstractC0370h, boolean z3) {
        setLayoutFrozen(false);
        N1(abstractC0370h, true, z3);
        p1(true);
        requestLayout();
    }

    public final void c0(D d) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.b2.Z;
            d.p = overScroller.getFinalX() - overScroller.getCurrX();
            d.q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        d.p = 0;
        d.q = 0;
    }

    public void c1(int i2, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int j2 = this.d1.j();
        if (i2 < i4) {
            i7 = -1;
            i6 = i2;
            i5 = i4;
        } else {
            i5 = i2;
            i6 = i4;
            i7 = 1;
        }
        for (int i9 = 0; i9 < j2; i9++) {
            H x0 = x0(this.d1.i(i9));
            if (x0 != null && (i8 = x0.c) >= i6 && i8 <= i5) {
                if (i8 == i2) {
                    x0.E(i4 - i2, false);
                } else {
                    x0.E(i7, false);
                }
                this.e2.g = true;
            }
        }
        this.a1.x(i2, i4);
        requestLayout();
    }

    public void c2(int i2, int i4, Object obj) {
        int i5;
        int j2 = this.d1.j();
        int i6 = i2 + i4;
        for (int i7 = 0; i7 < j2; i7++) {
            View i8 = this.d1.i(i7);
            H x0 = x0(i8);
            if (x0 != null && !x0.N() && (i5 = x0.c) >= i2 && i5 < i6) {
                x0.b(2);
                x0.a(obj);
                ((q) i8.getLayoutParams()).c = true;
            }
        }
        this.a1.S(i2, i4);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof q) && this.l1.u((q) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View, o.WY1
    public int computeHorizontalScrollExtent() {
        p pVar = this.l1;
        if (pVar == null || !pVar.s()) {
            return 0;
        }
        return this.l1.y(this.e2);
    }

    @Override // android.view.View, o.WY1
    public int computeHorizontalScrollOffset() {
        p pVar = this.l1;
        if (pVar == null || !pVar.s()) {
            return 0;
        }
        return this.l1.z(this.e2);
    }

    @Override // android.view.View, o.WY1
    public int computeHorizontalScrollRange() {
        p pVar = this.l1;
        if (pVar == null || !pVar.s()) {
            return 0;
        }
        return this.l1.A(this.e2);
    }

    @Override // android.view.View, o.WY1
    public int computeVerticalScrollExtent() {
        p pVar = this.l1;
        if (pVar == null || !pVar.t()) {
            return 0;
        }
        return this.l1.B(this.e2);
    }

    @Override // android.view.View, o.WY1
    public int computeVerticalScrollOffset() {
        p pVar = this.l1;
        if (pVar == null || !pVar.t()) {
            return 0;
        }
        return this.l1.C(this.e2);
    }

    @Override // android.view.View, o.WY1
    public int computeVerticalScrollRange() {
        p pVar = this.l1;
        if (pVar == null || !pVar.t()) {
            return 0;
        }
        return this.l1.D(this.e2);
    }

    @Override // o.InterfaceC8849pp1
    public boolean d(int i2, int i4) {
        return getScrollingChildHelper().s(i2, i4);
    }

    public View d0(float f, float f2) {
        for (int g = this.d1.g() - 1; g >= 0; g--) {
            View f4 = this.d1.f(g);
            float translationX = f4.getTranslationX();
            float translationY = f4.getTranslationY();
            if (f >= f4.getLeft() + translationX && f <= f4.getRight() + translationX && f2 >= f4.getTop() + translationY && f2 <= f4.getBottom() + translationY) {
                return f4;
            }
        }
        return null;
    }

    public void d1(int i2, int i4, boolean z3) {
        int i5 = i2 + i4;
        int j2 = this.d1.j();
        for (int i6 = 0; i6 < j2; i6++) {
            H x0 = x0(this.d1.i(i6));
            if (x0 != null && !x0.N()) {
                int i7 = x0.c;
                if (i7 >= i5) {
                    x0.E(-i4, z3);
                    this.e2.g = true;
                } else if (i7 >= i2) {
                    x0.i(i2 - 1, -i4, z3);
                    this.e2.g = true;
                }
            }
        }
        this.a1.y(i2, i4, z3);
        requestLayout();
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean dispatchNestedFling(float f, float f2, boolean z3) {
        return getScrollingChildHelper().a(f, f2, z3);
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean dispatchNestedPreScroll(int i2, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i4, iArr, iArr2);
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean dispatchNestedScroll(int i2, int i4, int i5, int i6, int[] iArr) {
        return getScrollingChildHelper().f(i2, i4, i5, i6, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        int i4;
        super.draw(canvas);
        int size = this.o1.size();
        boolean z6 = false;
        for (int i5 = 0; i5 < size; i5++) {
            this.o1.get(i5).k(canvas, this, this.e2);
        }
        EdgeEffect edgeEffect = this.I1;
        boolean z7 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f1) {
                i4 = getPaddingBottom();
            } else {
                i4 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i4, 0.0f);
            EdgeEffect edgeEffect2 = this.I1;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect3 = this.J1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.J1;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z5 = true;
            } else {
                z5 = false;
            }
            z3 |= z5;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.K1;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f1) {
                i2 = getPaddingTop();
            } else {
                i2 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i2, -width);
            EdgeEffect edgeEffect6 = this.K1;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z4 = true;
            } else {
                z4 = false;
            }
            z3 |= z4;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.L1;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.L1;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z6 = true;
            }
            z3 |= z6;
            canvas.restoreToCount(save4);
        }
        if (z3 || this.M1 == null || this.o1.size() <= 0 || !this.M1.q()) {
            z7 = z3;
        }
        if (z7) {
            C6516gH2.u1(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    @Override // o.InterfaceC8849pp1
    public boolean e(int i2, int i4, int i5, int i6, int[] iArr, int i7) {
        return getScrollingChildHelper().g(i2, i4, i5, i6, iArr, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View e0(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        return null;
    }

    public void e1(View view) {
    }

    @Override // o.InterfaceC8849pp1
    public boolean f(int i2, int i4, int[] iArr, int[] iArr2, int i5) {
        return getScrollingChildHelper().d(i2, i4, iArr, iArr2, i5);
    }

    public H f0(View view) {
        View e0 = e0(view);
        if (e0 == null) {
            return null;
        }
        return w0(e0);
    }

    public void f1(View view) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        boolean z3;
        View view2;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        View l1 = this.l1.l1(view, i2);
        if (l1 != null) {
            return l1;
        }
        boolean z7 = true;
        if (this.k1 != null && this.l1 != null && !R0() && !this.x1) {
            z3 = true;
        } else {
            z3 = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.l1.t()) {
                if (i2 == 2) {
                    i5 = 130;
                } else {
                    i5 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i5) == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (J2) {
                    i2 = i5;
                }
            } else {
                z4 = false;
            }
            if (!z4 && this.l1.s()) {
                if (this.l1.m0() == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (i2 == 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z5 ^ z6) {
                    i4 = 66;
                } else {
                    i4 = 17;
                }
                if (focusFinder.findNextFocus(this, view, i4) != null) {
                    z7 = false;
                }
                if (J2) {
                    i2 = i4;
                }
                z4 = z7;
            }
            if (z4) {
                I();
                if (e0(view) == null) {
                    return null;
                }
                W1();
                this.l1.e1(view, i2, this.a1, this.e2);
                Y1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (findNextFocus == null && z3) {
                I();
                if (e0(view) == null) {
                    return null;
                }
                W1();
                view2 = this.l1.e1(view, i2, this.a1, this.e2);
                Y1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i2);
            }
            F1(view2, null);
            return view;
        } else if (T0(view, view2, i2)) {
            return view2;
        } else {
            return super.focusSearch(view, i2);
        }
    }

    @Override // o.InterfaceC8849pp1
    public void g(int i2) {
        getScrollingChildHelper().u(i2);
    }

    public final boolean g0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.p1.size();
        for (int i2 = 0; i2 < size; i2++) {
            t tVar = this.p1.get(i2);
            if (tVar.c(this, motionEvent) && action != 3) {
                this.q1 = tVar;
                return true;
            }
        }
        return false;
    }

    public void g1() {
        this.F1++;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.l1;
        if (pVar != null) {
            return pVar.P();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + b0());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.l1;
        if (pVar != null) {
            return pVar.Q(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + b0());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0370h getAdapter() {
        return this.k1;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.l1;
        if (pVar != null) {
            return pVar.S();
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i4) {
        k kVar = this.m2;
        if (kVar == null) {
            return super.getChildDrawingOrder(i2, i4);
        }
        return kVar.a(i2, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1;
    }

    public androidx.recyclerview.widget.v getCompatAccessibilityDelegate() {
        return this.l2;
    }

    public l getEdgeEffectFactory() {
        return this.H1;
    }

    public m getItemAnimator() {
        return this.M1;
    }

    public int getItemDecorationCount() {
        return this.o1.size();
    }

    public p getLayoutManager() {
        return this.l1;
    }

    public int getMaxFlingVelocity() {
        return this.X1;
    }

    public int getMinFlingVelocity() {
        return this.W1;
    }

    public long getNanoTime() {
        if (I2) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.V1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.a2;
    }

    public w getRecycledViewPool() {
        return this.a1.j();
    }

    public int getScrollState() {
        return this.N1;
    }

    public void h(int i2, int i4) {
        if (i2 < 0) {
            Y();
            if (this.I1.isFinished()) {
                this.I1.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            Z();
            if (this.K1.isFinished()) {
                this.K1.onAbsorb(i2);
            }
        }
        if (i4 < 0) {
            a0();
            if (this.J1.isFinished()) {
                this.J1.onAbsorb(-i4);
            }
        } else if (i4 > 0) {
            X();
            if (this.L1.isFinished()) {
                this.L1.onAbsorb(i4);
            }
        }
        if (i2 == 0 && i4 == 0) {
            return;
        }
        C6516gH2.u1(this);
    }

    public final void h0(int[] iArr) {
        int g = this.d1.g();
        if (g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < g; i5++) {
            H x0 = x0(this.d1.f(i5));
            if (!x0.N()) {
                int p2 = x0.p();
                if (p2 < i2) {
                    i2 = p2;
                }
                if (p2 > i4) {
                    i4 = p2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i4;
    }

    public void h1() {
        i1(true);
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public void i1(boolean z3) {
        int i2 = this.F1 - 1;
        this.F1 = i2;
        if (i2 < 1) {
            this.F1 = 0;
            if (z3) {
                O();
                V();
            }
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.r1;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.x1;
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    public final View j0() {
        H k0;
        D d = this.e2;
        int i2 = d.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int d2 = d.d();
        for (int i4 = i2; i4 < d2; i4++) {
            H k02 = k0(i4);
            if (k02 == null) {
                break;
            } else if (k02.a.hasFocusable()) {
                return k02.a;
            }
        }
        int min = Math.min(d2, i2);
        while (true) {
            min--;
            if (min < 0 || (k0 = k0(min)) == null) {
                return null;
            }
            if (k0.a.hasFocusable()) {
                return k0.a;
            }
        }
    }

    public final void j1(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.O1) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.O1 = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.S1 = x2;
            this.Q1 = x2;
            int y3 = (int) (motionEvent.getY(i2) + 0.5f);
            this.T1 = y3;
            this.R1 = y3;
        }
    }

    public H k0(int i2) {
        H h = null;
        if (this.D1) {
            return null;
        }
        int j2 = this.d1.j();
        for (int i4 = 0; i4 < j2; i4++) {
            H x0 = x0(this.d1.i(i4));
            if (x0 != null && !x0.z() && q0(x0) == i2) {
                if (this.d1.n(x0.a)) {
                    h = x0;
                } else {
                    return x0;
                }
            }
        }
        return h;
    }

    public void k1(int i2) {
    }

    public H l0(long j2) {
        AbstractC0370h abstractC0370h = this.k1;
        H h = null;
        if (abstractC0370h != null && abstractC0370h.l()) {
            int j4 = this.d1.j();
            for (int i2 = 0; i2 < j4; i2++) {
                H x0 = x0(this.d1.i(i2));
                if (x0 != null && !x0.z() && x0.n() == j2) {
                    if (this.d1.n(x0.a)) {
                        h = x0;
                    } else {
                        return x0;
                    }
                }
            }
        }
        return h;
    }

    public void l1(int i2, int i4) {
    }

    public final void m(H h) {
        boolean z3;
        View view = h.a;
        if (view.getParent() == this) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.a1.P(w0(view));
        if (h.B()) {
            this.d1.c(view, -1, view.getLayoutParams(), true);
        } else if (!z3) {
            this.d1.b(view, true);
        } else {
            this.d1.k(view);
        }
    }

    public H m0(int i2) {
        return o0(i2, false);
    }

    public void m1() {
        if (!this.k2 && this.r1) {
            C6516gH2.w1(this, this.t2);
            this.k2 = true;
        }
    }

    public void n(o oVar) {
        o(oVar, -1);
    }

    @Deprecated
    public H n0(int i2) {
        return o0(i2, false);
    }

    public final boolean n1() {
        if (this.M1 != null && this.l1.n2()) {
            return true;
        }
        return false;
    }

    public void o(o oVar, int i2) {
        p pVar = this.l1;
        if (pVar != null) {
            pVar.n("Cannot add item decoration during a scroll  or layout");
        }
        if (this.o1.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.o1.add(oVar);
        } else {
            this.o1.add(i2, oVar);
        }
        V0();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public H o0(int i2, boolean z3) {
        int j2 = this.d1.j();
        H h = null;
        for (int i4 = 0; i4 < j2; i4++) {
            H x0 = x0(this.d1.i(i4));
            if (x0 != null && !x0.z()) {
                if (z3) {
                    if (x0.c != i2) {
                        continue;
                    }
                    if (!this.d1.n(x0.a)) {
                        h = x0;
                    } else {
                        return x0;
                    }
                } else {
                    if (x0.p() != i2) {
                        continue;
                    }
                    if (!this.d1.n(x0.a)) {
                    }
                }
            }
        }
        return h;
    }

    public final void o1() {
        boolean z3;
        boolean z4;
        boolean z5;
        if (this.D1) {
            this.c1.z();
            if (this.E1) {
                this.l1.n1(this);
            }
        }
        if (n1()) {
            this.c1.x();
        } else {
            this.c1.k();
        }
        boolean z6 = true;
        if (!this.h2 && !this.i2) {
            z3 = false;
        } else {
            z3 = true;
        }
        D d = this.e2;
        if (this.u1 && this.M1 != null && (((z5 = this.D1) || z3 || this.l1.h) && (!z5 || this.k1.l()))) {
            z4 = true;
        } else {
            z4 = false;
        }
        d.k = z4;
        D d2 = this.e2;
        if (!d2.k || !z3 || this.D1 || !n1()) {
            z6 = false;
        }
        d2.l = z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r1 >= 30.0f) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        this.F1 = 0;
        boolean z3 = true;
        this.r1 = true;
        if (!this.u1 || isLayoutRequested()) {
            z3 = false;
        }
        this.u1 = z3;
        this.a1.A();
        p pVar = this.l1;
        if (pVar != null) {
            pVar.K(this);
        }
        this.k2 = false;
        if (I2) {
            ThreadLocal<androidx.recyclerview.widget.l> threadLocal = androidx.recyclerview.widget.l.Z0;
            androidx.recyclerview.widget.l lVar = threadLocal.get();
            this.c2 = lVar;
            if (lVar == null) {
                this.c2 = new androidx.recyclerview.widget.l();
                Display U = C6516gH2.U(this);
                if (!isInEditMode() && U != null) {
                    f = U.getRefreshRate();
                }
                f = 60.0f;
                androidx.recyclerview.widget.l lVar2 = this.c2;
                lVar2.Z = 1.0E9f / f;
                threadLocal.set(lVar2);
            }
            this.c2.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.l lVar;
        super.onDetachedFromWindow();
        m mVar = this.M1;
        if (mVar != null) {
            mVar.l();
        }
        Z1();
        this.r1 = false;
        p pVar = this.l1;
        if (pVar != null) {
            pVar.L(this, this.a1);
        }
        this.s2.clear();
        removeCallbacks(this.t2);
        this.e1.j();
        this.a1.B();
        BE1.c(this);
        if (I2 && (lVar = this.c2) != null) {
            lVar.j(this);
            this.c2 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.o1.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.o1.get(i2).i(canvas, this, this.e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.l1 != null && !this.x1 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.l1.t()) {
                    f = -motionEvent.getAxisValue(9);
                } else {
                    f = 0.0f;
                }
                if (this.l1.s()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (f == 0.0f || f2 != 0.0f) {
                        Y0((int) (f2 * this.Y1), (int) (f * this.Z1), motionEvent, 1);
                    }
                }
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                Y0((int) (f2 * this.Y1), (int) (f * this.Z1), motionEvent, 1);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.l1.t()) {
                        f = -axisValue;
                        f2 = 0.0f;
                        if (f == 0.0f) {
                        }
                        Y0((int) (f2 * this.Y1), (int) (f * this.Z1), motionEvent, 1);
                    } else if (this.l1.s()) {
                        f2 = axisValue;
                        f = 0.0f;
                        if (f == 0.0f) {
                        }
                        Y0((int) (f2 * this.Y1), (int) (f * this.Z1), motionEvent, 1);
                    }
                }
                f = 0.0f;
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                Y0((int) (f2 * this.Y1), (int) (f * this.Z1), motionEvent, 1);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (this.x1) {
            return false;
        }
        this.q1 = null;
        if (g0(motionEvent)) {
            z();
            return true;
        }
        p pVar = this.l1;
        if (pVar == null) {
            return false;
        }
        boolean s2 = pVar.s();
        boolean t2 = this.l1.t();
        if (this.P1 == null) {
            this.P1 = VelocityTracker.obtain();
        }
        this.P1.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                j1(motionEvent);
                            }
                        } else {
                            this.O1 = motionEvent.getPointerId(actionIndex);
                            int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.S1 = x2;
                            this.Q1 = x2;
                            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.T1 = y3;
                            this.R1 = y3;
                        }
                    } else {
                        z();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.O1);
                    if (findPointerIndex < 0) {
                        Log.e(y2, "Error processing scroll; pointer index for id " + this.O1 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.N1 != 1) {
                        int i2 = x3 - this.Q1;
                        int i4 = y4 - this.R1;
                        if (s2 && Math.abs(i2) > this.U1) {
                            this.S1 = x3;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (t2 && Math.abs(i4) > this.U1) {
                            this.T1 = y4;
                            z3 = true;
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.P1.clear();
                g(0);
            }
        } else {
            if (this.y1) {
                this.y1 = false;
            }
            this.O1 = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.S1 = x4;
            this.Q1 = x4;
            int y5 = (int) (motionEvent.getY() + 0.5f);
            this.T1 = y5;
            this.R1 = y5;
            if (X1(motionEvent) || this.N1 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                g(1);
            }
            int[] iArr = this.q2;
            iArr[1] = 0;
            iArr[0] = 0;
            int i5 = s2;
            if (t2) {
                i5 = (s2 ? 1 : 0) | 2;
            }
            d(i5, 0);
        }
        if (this.N1 != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i2, int i4, int i5, int i6) {
        C7139ir2.b(Y2);
        P();
        C7139ir2.d();
        this.u1 = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i4) {
        p pVar = this.l1;
        if (pVar == null) {
            K(i2, i4);
            return;
        }
        boolean z3 = false;
        if (pVar.J0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i4);
            this.l1.u1(this.a1, this.e2, i2, i4);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z3 = true;
            }
            this.u2 = z3;
            if (!z3 && this.k1 != null) {
                if (this.e2.e == 1) {
                    Q();
                }
                this.l1.a2(i2, i4);
                this.e2.j = true;
                R();
                this.l1.d2(i2, i4);
                if (this.l1.h2()) {
                    this.l1.a2(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.e2.j = true;
                    R();
                    this.l1.d2(i2, i4);
                }
                this.v2 = getMeasuredWidth();
                this.w2 = getMeasuredHeight();
            }
        } else if (this.s1) {
            this.l1.u1(this.a1, this.e2, i2, i4);
        } else {
            if (this.A1) {
                W1();
                g1();
                o1();
                h1();
                D d = this.e2;
                if (d.l) {
                    d.h = true;
                } else {
                    this.c1.k();
                    this.e2.h = false;
                }
                this.A1 = false;
                Y1(false);
            } else if (this.e2.l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0370h abstractC0370h = this.k1;
            if (abstractC0370h != null) {
                this.e2.f = abstractC0370h.g();
            } else {
                this.e2.f = 0;
            }
            W1();
            this.l1.u1(this.a1, this.e2, i2, i4);
            Y1(false);
            this.e2.h = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (R0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof A)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        A a = (A) parcelable;
        this.b1 = a;
        super.onRestoreInstanceState(a.a());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        A a = new A(super.onSaveInstanceState());
        A a2 = this.b1;
        if (a2 != null) {
            a.b(a2);
            return a;
        }
        p pVar = this.l1;
        if (pVar != null) {
            a.Z = pVar.y1();
            return a;
        }
        a.Z = null;
        return a;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i4, int i5, int i6) {
        super.onSizeChanged(i2, i4, i5, i6);
        if (i2 == i5 && i4 == i6) {
            return;
        }
        N0();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        int i2;
        int i4;
        int i5;
        int i6;
        boolean z3;
        if (this.x1 || this.y1) {
            return false;
        }
        if (W(motionEvent)) {
            z();
            return true;
        }
        p pVar = this.l1;
        if (pVar == null) {
            return false;
        }
        boolean s2 = pVar.s();
        boolean t2 = this.l1.t();
        if (this.P1 == null) {
            this.P1 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.q2;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.q2;
        obtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                j1(motionEvent);
                            }
                        } else {
                            this.O1 = motionEvent.getPointerId(actionIndex);
                            int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.S1 = x2;
                            this.Q1 = x2;
                            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.T1 = y3;
                            this.R1 = y3;
                        }
                    } else {
                        z();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.O1);
                    if (findPointerIndex < 0) {
                        Log.e(y2, "Error processing scroll; pointer index for id " + this.O1 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    int i7 = this.S1 - x3;
                    int i8 = this.T1 - y4;
                    if (this.N1 != 1) {
                        if (s2) {
                            if (i7 > 0) {
                                i7 = Math.max(0, i7 - this.U1);
                            } else {
                                i7 = Math.min(0, i7 + this.U1);
                            }
                            if (i7 != 0) {
                                z3 = true;
                                if (t2) {
                                    if (i8 > 0) {
                                        i8 = Math.max(0, i8 - this.U1);
                                    } else {
                                        i8 = Math.min(0, i8 + this.U1);
                                    }
                                    if (i8 != 0) {
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    setScrollState(1);
                                }
                            }
                        }
                        z3 = false;
                        if (t2) {
                        }
                        if (z3) {
                        }
                    }
                    if (this.N1 == 1) {
                        int[] iArr3 = this.r2;
                        iArr3[0] = 0;
                        iArr3[1] = 0;
                        int u1 = i7 - u1(i7, motionEvent.getY());
                        int v1 = i8 - v1(i8, motionEvent.getX());
                        if (s2) {
                            i2 = u1;
                        } else {
                            i2 = 0;
                        }
                        if (t2) {
                            i4 = v1;
                        } else {
                            i4 = 0;
                        }
                        if (f(i2, i4, this.r2, this.p2, 0)) {
                            int[] iArr4 = this.r2;
                            u1 -= iArr4[0];
                            v1 -= iArr4[1];
                            int[] iArr5 = this.q2;
                            int i9 = iArr5[0];
                            int[] iArr6 = this.p2;
                            iArr5[0] = i9 + iArr6[0];
                            iArr5[1] = iArr5[1] + iArr6[1];
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        int[] iArr7 = this.p2;
                        this.S1 = x3 - iArr7[0];
                        this.T1 = y4 - iArr7[1];
                        if (s2) {
                            i5 = u1;
                        } else {
                            i5 = 0;
                        }
                        if (t2) {
                            i6 = v1;
                        } else {
                            i6 = 0;
                        }
                        if (K1(i5, i6, motionEvent, 0)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        androidx.recyclerview.widget.l lVar = this.c2;
                        if (lVar != null && (u1 != 0 || v1 != 0)) {
                            lVar.f(this, u1, v1);
                        }
                    }
                }
            } else {
                this.P1.addMovement(obtain);
                this.P1.computeCurrentVelocity(1000, this.X1);
                if (s2) {
                    f = -this.P1.getXVelocity(this.O1);
                } else {
                    f = 0.0f;
                }
                if (t2) {
                    f2 = -this.P1.getYVelocity(this.O1);
                } else {
                    f2 = 0.0f;
                }
                if ((f == 0.0f && f2 == 0.0f) || !p0((int) f, (int) f2)) {
                    setScrollState(0);
                }
                H1();
                obtain.recycle();
                return true;
            }
        } else {
            this.O1 = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.S1 = x4;
            this.Q1 = x4;
            int y5 = (int) (motionEvent.getY() + 0.5f);
            this.T1 = y5;
            this.R1 = y5;
            int i10 = s2;
            if (t2) {
                i10 = (s2 ? 1 : 0) | 2;
            }
            d(i10, 0);
        }
        this.P1.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    public void p(r rVar) {
        if (this.C1 == null) {
            this.C1 = new ArrayList();
        }
        this.C1.add(rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean p0(int i2, int i4) {
        int i5;
        int i6;
        float f;
        float f2;
        boolean z3;
        p pVar = this.l1;
        if (pVar == null) {
            Log.e(y2, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.x1) {
            return false;
        } else {
            int s2 = pVar.s();
            boolean t2 = this.l1.t();
            if (s2 == 0 || Math.abs(i2) < this.W1) {
                i2 = 0;
            }
            if (!t2 || Math.abs(i4) < this.W1) {
                i4 = 0;
            }
            if (i2 == 0 && i4 == 0) {
                return false;
            }
            if (i2 != 0) {
                EdgeEffect edgeEffect = this.I1;
                if (edgeEffect != null && C7956m90.d(edgeEffect) != 0.0f) {
                    int i7 = -i2;
                    if (P1(this.I1, i7, getWidth())) {
                        this.I1.onAbsorb(i7);
                        i2 = 0;
                    }
                    i5 = i2;
                    i2 = 0;
                } else {
                    EdgeEffect edgeEffect2 = this.K1;
                    if (edgeEffect2 != null && C7956m90.d(edgeEffect2) != 0.0f) {
                        if (P1(this.K1, i2, getWidth())) {
                            this.K1.onAbsorb(i2);
                            i2 = 0;
                        }
                        i5 = i2;
                        i2 = 0;
                    }
                }
                if (i4 != 0) {
                    EdgeEffect edgeEffect3 = this.J1;
                    if (edgeEffect3 != null && C7956m90.d(edgeEffect3) != 0.0f) {
                        int i8 = -i4;
                        if (P1(this.J1, i8, getHeight())) {
                            this.J1.onAbsorb(i8);
                            i4 = 0;
                        }
                        i6 = 0;
                    } else {
                        EdgeEffect edgeEffect4 = this.L1;
                        if (edgeEffect4 != null && C7956m90.d(edgeEffect4) != 0.0f) {
                            if (P1(this.L1, i4, getHeight())) {
                                this.L1.onAbsorb(i4);
                                i4 = 0;
                            }
                            i6 = 0;
                        }
                    }
                    if (i5 == 0 || i4 != 0) {
                        int i9 = this.X1;
                        i5 = Math.max(-i9, Math.min(i5, i9));
                        int i10 = this.X1;
                        i4 = Math.max(-i10, Math.min(i4, i10));
                        this.b2.b(i5, i4);
                    }
                    if (i2 != 0 && i6 == 0) {
                        if (i5 == 0 && i4 == 0) {
                            return false;
                        }
                        return true;
                    }
                    f = i2;
                    f2 = i6;
                    if (!dispatchNestedPreFling(f, f2)) {
                        if (s2 == 0 && !t2) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        dispatchNestedFling(f, f2, z3);
                        s sVar = this.V1;
                        if (sVar != null && sVar.a(i2, i6)) {
                            return true;
                        }
                        if (z3) {
                            if (t2) {
                                s2 = (s2 == true ? 1 : 0) | 2;
                            }
                            d(s2, 1);
                            int i11 = this.X1;
                            int max = Math.max(-i11, Math.min(i2, i11));
                            int i12 = this.X1;
                            this.b2.b(max, Math.max(-i12, Math.min(i6, i12)));
                            return true;
                        }
                    }
                    return false;
                }
                i6 = i4;
                i4 = 0;
                if (i5 == 0) {
                }
                int i92 = this.X1;
                i5 = Math.max(-i92, Math.min(i5, i92));
                int i102 = this.X1;
                i4 = Math.max(-i102, Math.min(i4, i102));
                this.b2.b(i5, i4);
                if (i2 != 0) {
                }
                f = i2;
                f2 = i6;
                if (!dispatchNestedPreFling(f, f2)) {
                }
                return false;
            }
            i5 = 0;
            if (i4 != 0) {
            }
            i6 = i4;
            i4 = 0;
            if (i5 == 0) {
            }
            int i922 = this.X1;
            i5 = Math.max(-i922, Math.min(i5, i922));
            int i1022 = this.X1;
            i4 = Math.max(-i1022, Math.min(i4, i1022));
            this.b2.b(i5, i4);
            if (i2 != 0) {
            }
            f = i2;
            f2 = i6;
            if (!dispatchNestedPreFling(f, f2)) {
            }
            return false;
        }
    }

    public void p1(boolean z3) {
        this.E1 = z3 | this.E1;
        this.D1 = true;
        W0();
    }

    public void q(t tVar) {
        this.p1.add(tVar);
    }

    public int q0(H h) {
        if (!h.t(524) && h.w()) {
            return this.c1.f(h.c);
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q1(float f, float f2, float f4, float f5) {
        boolean z3;
        boolean z4 = true;
        if (f2 < 0.0f) {
            Y();
            C7956m90.j(this.I1, (-f2) / getWidth(), 1.0f - (f4 / getHeight()));
        } else if (f2 > 0.0f) {
            Z();
            C7956m90.j(this.K1, f2 / getWidth(), f4 / getHeight());
        } else {
            z3 = false;
            if (f5 >= 0.0f) {
                a0();
                C7956m90.j(this.J1, (-f5) / getHeight(), f / getWidth());
            } else if (f5 > 0.0f) {
                X();
                C7956m90.j(this.L1, f5 / getHeight(), 1.0f - (f / getWidth()));
            } else {
                z4 = z3;
            }
            if (z4 && f2 == 0.0f && f5 == 0.0f) {
                return;
            }
            C6516gH2.u1(this);
        }
        z3 = true;
        if (f5 >= 0.0f) {
        }
        if (z4) {
        }
        C6516gH2.u1(this);
    }

    public void r(u uVar) {
        if (this.g2 == null) {
            this.g2 = new ArrayList();
        }
        this.g2.add(uVar);
    }

    public long r0(H h) {
        if (this.k1.l()) {
            return h.n();
        }
        return h.c;
    }

    public void r1(H h, m.d dVar) {
        h.J(0, 8192);
        if (this.e2.i && h.C() && !h.z() && !h.N()) {
            this.e1.c(r0(h), h);
        }
        this.e1.e(h, dVar);
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z3) {
        H x0 = x0(view);
        if (x0 != null) {
            if (x0.B()) {
                x0.f();
            } else if (!x0.N()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + x0 + b0());
            }
        }
        view.clearAnimation();
        N(view);
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.l1.w1(this, this.e2, view, view2) && view2 != null) {
            F1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.l1.P1(this, view, rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        int size = this.p1.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.p1.get(i2).e(z3);
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.v1 == 0 && !this.x1) {
            super.requestLayout();
        } else {
            this.w1 = true;
        }
    }

    public void s(y yVar) {
        boolean z3;
        if (yVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C10907yF1.b(z3, "'listener' arg cannot be null.");
        this.n1.add(yVar);
    }

    public int s0(View view) {
        H x0 = x0(view);
        if (x0 != null) {
            return x0.j();
        }
        return -1;
    }

    public final void s1() {
        H h;
        View findViewById;
        if (this.a2 && this.k1 != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (K2 && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                        if (this.d1.g() == 0) {
                            requestFocus();
                            return;
                        }
                    } else if (!this.d1.n(focusedChild)) {
                        return;
                    }
                }
                View view = null;
                if (this.e2.n != -1 && this.k1.l()) {
                    h = l0(this.e2.n);
                } else {
                    h = null;
                }
                if (h != null && !this.d1.n(h.a) && h.a.hasFocusable()) {
                    view = h.a;
                } else if (this.d1.g() > 0) {
                    view = j0();
                }
                if (view != null) {
                    int i2 = this.e2.f53o;
                    if (i2 != -1 && (findViewById = view.findViewById(i2)) != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i4) {
        p pVar = this.l1;
        if (pVar == null) {
            Log.e(y2, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.x1) {
            boolean s2 = pVar.s();
            boolean t2 = this.l1.t();
            if (!s2 && !t2) {
                return;
            }
            if (!s2) {
                i2 = 0;
            }
            if (!t2) {
                i4 = 0;
            }
            K1(i2, i4, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i4) {
        Log.w(y2, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (Q1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.v vVar) {
        this.l2 = vVar;
        C6516gH2.I1(this, vVar);
    }

    public void setAdapter(AbstractC0370h abstractC0370h) {
        setLayoutFrozen(false);
        N1(abstractC0370h, false, true);
        p1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        boolean z3;
        if (kVar == this.m2) {
            return;
        }
        this.m2 = kVar;
        if (kVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        setChildrenDrawingOrderEnabled(z3);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.f1) {
            N0();
        }
        this.f1 = z3;
        super.setClipToPadding(z3);
        if (this.u1) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        C10907yF1.l(lVar);
        this.H1 = lVar;
        N0();
    }

    public void setHasFixedSize(boolean z3) {
        this.s1 = z3;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.M1;
        if (mVar2 != null) {
            mVar2.l();
            this.M1.A(null);
        }
        this.M1 = mVar;
        if (mVar != null) {
            mVar.A(this.j2);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.a1.M(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z3) {
        suppressLayout(z3);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.l1) {
            return;
        }
        Z1();
        if (this.l1 != null) {
            m mVar = this.M1;
            if (mVar != null) {
                mVar.l();
            }
            this.l1.H1(this.a1);
            this.l1.I1(this.a1);
            this.a1.d();
            if (this.r1) {
                this.l1.L(this, this.a1);
            }
            this.l1.f2(null);
            this.l1 = null;
        } else {
            this.a1.d();
        }
        this.d1.o();
        this.l1 = pVar;
        if (pVar != null) {
            if (pVar.b == null) {
                pVar.f2(this);
                if (this.r1) {
                    this.l1.K(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.b.b0());
            }
        }
        this.a1.Q();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public void setNestedScrollingEnabled(boolean z3) {
        getScrollingChildHelper().p(z3);
    }

    public void setOnFlingListener(s sVar) {
        this.V1 = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.f2 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.a2 = z3;
    }

    public void setRecycledViewPool(w wVar) {
        this.a1.K(wVar);
    }

    @Deprecated
    public void setRecyclerListener(y yVar) {
        this.m1 = yVar;
    }

    public void setScrollState(int i2) {
        if (i2 == this.N1) {
            return;
        }
        this.N1 = i2;
        if (i2 != 2) {
            a2();
        }
        T(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w(y2, "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                this.U1 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.U1 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(F f) {
        this.a1.L(f);
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().r(i2);
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public void stopNestedScroll() {
        getScrollingChildHelper().t();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z3) {
        if (z3 != this.x1) {
            x("Do not suppressLayout in layout or scroll");
            if (!z3) {
                this.x1 = false;
                if (this.w1 && this.l1 != null && this.k1 != null) {
                    requestLayout();
                }
                this.w1 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.x1 = true;
            this.y1 = true;
            Z1();
        }
    }

    public void t(H h, m.d dVar, m.d dVar2) {
        h.K(false);
        if (this.M1.a(h, dVar, dVar2)) {
            m1();
        }
    }

    public long t0(View view) {
        H x0;
        AbstractC0370h abstractC0370h = this.k1;
        if (abstractC0370h == null || !abstractC0370h.l() || (x0 = x0(view)) == null) {
            return -1L;
        }
        return x0.n();
    }

    public final void t1() {
        boolean z3;
        EdgeEffect edgeEffect = this.I1;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = this.I1.isFinished();
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.J1;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 |= this.J1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K1;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 |= this.K1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L1;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 |= this.L1.isFinished();
        }
        if (z3) {
            C6516gH2.u1(this);
        }
    }

    public final void u(H h, H h2, m.d dVar, m.d dVar2, boolean z3, boolean z4) {
        h.K(false);
        if (z3) {
            m(h);
        }
        if (h != h2) {
            if (z4) {
                m(h2);
            }
            h.h = h2;
            m(h);
            this.a1.P(h);
            h2.K(false);
            h2.i = h;
        }
        if (this.M1.b(h, h2, dVar, dVar2)) {
            m1();
        }
    }

    public int u0(View view) {
        H x0 = x0(view);
        if (x0 != null) {
            return x0.p();
        }
        return -1;
    }

    public final int u1(int i2, float f) {
        float height = f / getHeight();
        float width = i2 / getWidth();
        EdgeEffect edgeEffect = this.I1;
        float f2 = 0.0f;
        if (edgeEffect != null && C7956m90.d(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.I1.onRelease();
            } else {
                float f4 = -C7956m90.j(this.I1, -width, 1.0f - height);
                if (C7956m90.d(this.I1) == 0.0f) {
                    this.I1.onRelease();
                }
                f2 = f4;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.K1;
            if (edgeEffect2 != null && C7956m90.d(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.K1.onRelease();
                } else {
                    float j2 = C7956m90.j(this.K1, width, height);
                    if (C7956m90.d(this.K1) == 0.0f) {
                        this.K1.onRelease();
                    }
                    f2 = j2;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    public void v(H h, m.d dVar, m.d dVar2) {
        m(h);
        h.K(false);
        if (this.M1.c(h, dVar, dVar2)) {
            m1();
        }
    }

    @Deprecated
    public int v0(View view) {
        return s0(view);
    }

    public void w(String str) {
        if (!R0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + b0());
            }
            throw new IllegalStateException(str + b0());
        }
    }

    public H w0(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return x0(view);
    }

    public void w1() {
        m mVar = this.M1;
        if (mVar != null) {
            mVar.l();
        }
        p pVar = this.l1;
        if (pVar != null) {
            pVar.H1(this.a1);
            this.l1.I1(this.a1);
        }
        this.a1.d();
    }

    public void x(String str) {
        if (R0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + b0());
            }
            throw new IllegalStateException(str);
        } else if (this.G1 > 0) {
            Log.w(y2, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + b0()));
        }
    }

    public boolean x1(View view) {
        W1();
        boolean r2 = this.d1.r(view);
        if (r2) {
            H x0 = x0(view);
            this.a1.P(x0);
            this.a1.I(x0);
        }
        Y1(!r2);
        return r2;
    }

    public boolean y(H h) {
        m mVar = this.M1;
        if (mVar != null && !mVar.g(h, h.s())) {
            return false;
        }
        return true;
    }

    public void y0(View view, Rect rect) {
        z0(view, rect);
    }

    public void y1(o oVar) {
        boolean z3;
        p pVar = this.l1;
        if (pVar != null) {
            pVar.n("Cannot remove item decoration during a scroll  or layout");
        }
        this.o1.remove(oVar);
        if (this.o1.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            setWillNotDraw(z3);
        }
        V0();
        requestLayout();
    }

    public final void z() {
        H1();
        setScrollState(0);
    }

    public void z1(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            y1(D0(i2));
            return;
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8982qM1.a.g);
    }

    /* loaded from: classes.dex */
    public static class A extends J {
        public static final Parcelable.Creator<A> CREATOR = new a();
        public Parcelable Z;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<A> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public A createFromParcel(Parcel parcel) {
                return new A(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public A createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new A(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public A[] newArray(int i) {
                return new A[i];
            }
        }

        public A(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        public void b(A a2) {
            this.Z = a2.Z;
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.Z, 0);
        }

        public A(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.Z0 = new z();
        this.a1 = new x();
        this.e1 = new androidx.recyclerview.widget.D();
        this.g1 = new RunnableC0363a();
        this.h1 = new Rect();
        this.i1 = new Rect();
        this.j1 = new RectF();
        this.n1 = new ArrayList();
        this.o1 = new ArrayList<>();
        this.p1 = new ArrayList<>();
        this.v1 = 0;
        this.D1 = false;
        this.E1 = false;
        this.F1 = 0;
        this.G1 = 0;
        this.H1 = m3;
        this.M1 = new h();
        this.N1 = 0;
        this.O1 = -1;
        this.Y1 = Float.MIN_VALUE;
        this.Z1 = Float.MIN_VALUE;
        this.a2 = true;
        this.b2 = new G();
        this.d2 = I2 ? new l.b() : null;
        this.e2 = new D();
        this.h2 = false;
        this.i2 = false;
        this.j2 = new n();
        this.k2 = false;
        this.n2 = new int[2];
        this.p2 = new int[2];
        this.q2 = new int[2];
        this.r2 = new int[2];
        this.s2 = new ArrayList();
        this.t2 = new RunnableC0364b();
        this.v2 = 0;
        this.w2 = 0;
        this.x2 = new C0366d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.U1 = viewConfiguration.getScaledTouchSlop();
        this.Y1 = C7486kH2.f(viewConfiguration, context);
        this.Z1 = C7486kH2.k(viewConfiguration, context);
        this.W1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.X1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Y0 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.M1.A(this.j2);
        J0();
        L0();
        K0();
        if (C6516gH2.Z(this) == 0) {
            C6516gH2.a2(this, 1);
        }
        this.B1 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.v(this));
        int[] iArr = C8982qM1.d.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        C6516gH2.G1(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        String string = obtainStyledAttributes.getString(C8982qM1.d.j);
        if (obtainStyledAttributes.getInt(C8982qM1.d.d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1 = obtainStyledAttributes.getBoolean(C8982qM1.d.c, true);
        boolean z3 = obtainStyledAttributes.getBoolean(C8982qM1.d.e, false);
        this.t1 = z3;
        if (z3) {
            M0((StateListDrawable) obtainStyledAttributes.getDrawable(C8982qM1.d.h), obtainStyledAttributes.getDrawable(C8982qM1.d.i), (StateListDrawable) obtainStyledAttributes.getDrawable(C8982qM1.d.f), obtainStyledAttributes.getDrawable(C8982qM1.d.g));
        }
        obtainStyledAttributes.recycle();
        J(context, string, attributeSet, i2, 0);
        int[] iArr2 = B2;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        C6516gH2.G1(this, context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
        boolean z4 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z4);
        BE1.h(this, true);
    }

    /* loaded from: classes.dex */
    public static class q extends ViewGroup.MarginLayoutParams {
        public H a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public int a() {
            return this.a.j();
        }

        public int b() {
            return this.a.m();
        }

        @Deprecated
        public int c() {
            return this.a.m();
        }

        public int d() {
            return this.a.p();
        }

        @Deprecated
        public int e() {
            return this.a.r();
        }

        public boolean f() {
            return this.a.C();
        }

        public boolean g() {
            return this.a.z();
        }

        public boolean h() {
            return this.a.x();
        }

        public boolean i() {
            return this.a.D();
        }

        public q(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.l1;
        if (pVar != null) {
            return pVar.R(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + b0());
    }

    /* loaded from: classes.dex */
    public static abstract class p {
        public C0375e a;
        public RecyclerView b;
        public final C.b c;
        public final C.b d;
        public androidx.recyclerview.widget.C e;
        public androidx.recyclerview.widget.C f;
        public C g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public int m;
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public int f55o;
        public int p;
        public int q;
        public int r;

        /* loaded from: classes.dex */
        public class a implements C.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.C.b
            public View a(int i) {
                return p.this.U(i);
            }

            @Override // androidx.recyclerview.widget.C.b
            public int b(View view) {
                return p.this.d0(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C.b
            public int c() {
                return p.this.s0();
            }

            @Override // androidx.recyclerview.widget.C.b
            public int d() {
                return p.this.D0() - p.this.t0();
            }

            @Override // androidx.recyclerview.widget.C.b
            public int e(View view) {
                return p.this.g0(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements C.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.C.b
            public View a(int i) {
                return p.this.U(i);
            }

            @Override // androidx.recyclerview.widget.C.b
            public int b(View view) {
                return p.this.h0(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C.b
            public int c() {
                return p.this.v0();
            }

            @Override // androidx.recyclerview.widget.C.b
            public int d() {
                return p.this.j0() - p.this.q0();
            }

            @Override // androidx.recyclerview.widget.C.b
            public int e(View view) {
                return p.this.b0(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(int i, int i2);
        }

        /* loaded from: classes.dex */
        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public p() {
            a aVar = new a();
            this.c = aVar;
            b bVar = new b();
            this.d = bVar;
            this.e = new androidx.recyclerview.widget.C(aVar);
            this.f = new androidx.recyclerview.widget.C(bVar);
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = true;
            this.l = true;
        }

        public static boolean P0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i) {
                    return false;
                }
                return true;
            } else if (size < i) {
                return false;
            } else {
                return true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
            if (r5 == 1073741824) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int W(int i, int i2, int i3, int i4, boolean z) {
            int max = Math.max(0, i - i3);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 != Integer.MIN_VALUE) {
                            if (i2 != 0) {
                            }
                        }
                        i4 = max;
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i2 = 1073741824;
            } else {
                if (i4 < 0) {
                    if (i4 != -1) {
                        if (i4 == -2) {
                            if (i2 != Integer.MIN_VALUE && i2 != 1073741824) {
                                i4 = max;
                                i2 = 0;
                            } else {
                                i4 = max;
                                i2 = Integer.MIN_VALUE;
                            }
                        }
                        i2 = 0;
                        i4 = 0;
                    }
                    i4 = max;
                }
                i2 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
            if (r3 >= 0) goto L4;
         */
        @Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int X(int i, int i2, int i3, boolean z) {
            int i4 = i - i2;
            int i5 = 0;
            int max = Math.max(0, i4);
            if (!z) {
                if (i3 < 0) {
                    if (i3 == -1) {
                        i3 = max;
                    } else {
                        if (i3 == -2) {
                            i5 = Integer.MIN_VALUE;
                            i3 = max;
                        }
                        i3 = 0;
                    }
                }
                i5 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i3, i5);
        }

        public static int v(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i2, i3);
                }
                return size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        public static d x0(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8982qM1.d.a, i, i2);
            dVar.a = obtainStyledAttributes.getInt(C8982qM1.d.b, 1);
            dVar.b = obtainStyledAttributes.getInt(C8982qM1.d.l, 1);
            dVar.c = obtainStyledAttributes.getBoolean(C8982qM1.d.k, false);
            dVar.d = obtainStyledAttributes.getBoolean(C8982qM1.d.m, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public int A(D d2) {
            return 0;
        }

        public int A0(x xVar, D d2) {
            return 0;
        }

        public void A1(C c2) {
            if (this.g == c2) {
                this.g = null;
            }
        }

        public int B(D d2) {
            return 0;
        }

        public int B0(View view) {
            return ((q) view.getLayoutParams()).b.top;
        }

        public boolean B1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return C1(recyclerView.a1, recyclerView.e2, i, bundle);
        }

        public int C(D d2) {
            return 0;
        }

        public void C0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((q) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.j1;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean C1(x xVar, D d2, int i, Bundle bundle) {
            int i2;
            int s0;
            int i3;
            int i4;
            if (this.b == null) {
                return false;
            }
            int j0 = j0();
            int D0 = D0();
            Rect rect = new Rect();
            if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
                j0 = rect.height();
                D0 = rect.width();
            }
            if (i != 4096) {
                if (i != 8192) {
                    i4 = 0;
                    i3 = 0;
                } else {
                    if (this.b.canScrollVertically(-1)) {
                        i2 = -((j0 - v0()) - q0());
                    } else {
                        i2 = 0;
                    }
                    if (this.b.canScrollHorizontally(-1)) {
                        s0 = -((D0 - s0()) - t0());
                        i3 = i2;
                        i4 = s0;
                    }
                    i3 = i2;
                    i4 = 0;
                }
            } else {
                if (this.b.canScrollVertically(1)) {
                    i2 = (j0 - v0()) - q0();
                } else {
                    i2 = 0;
                }
                if (this.b.canScrollHorizontally(1)) {
                    s0 = (D0 - s0()) - t0();
                    i3 = i2;
                    i4 = s0;
                }
                i3 = i2;
                i4 = 0;
            }
            if (i3 == 0 && i4 == 0) {
                return false;
            }
            this.b.U1(i4, i3, null, Integer.MIN_VALUE, true);
            return true;
        }

        public int D(D d2) {
            return 0;
        }

        public int D0() {
            return this.q;
        }

        public boolean D1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return E1(recyclerView.a1, recyclerView.e2, view, i, bundle);
        }

        public void E(x xVar) {
            for (int V = V() - 1; V >= 0; V--) {
                T1(xVar, V, U(V));
            }
        }

        public int E0() {
            return this.f55o;
        }

        public boolean E1(x xVar, D d2, View view, int i, Bundle bundle) {
            return false;
        }

        public void F(View view, x xVar) {
            T1(xVar, this.a.m(view), view);
        }

        public boolean F0() {
            int V = V();
            for (int i = 0; i < V; i++) {
                ViewGroup.LayoutParams layoutParams = U(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void F1(Runnable runnable) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                C6516gH2.w1(recyclerView, runnable);
            }
        }

        public void G(int i, x xVar) {
            T1(xVar, i, U(i));
        }

        public boolean G0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && recyclerView.hasFocus()) {
                return true;
            }
            return false;
        }

        public void G1() {
            for (int V = V() - 1; V >= 0; V--) {
                this.a.q(V);
            }
        }

        public void H(View view) {
            int m = this.a.m(view);
            if (m >= 0) {
                J(m, view);
            }
        }

        public void H0(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
                H x0 = RecyclerView.x0(view);
                x0.b(128);
                this.b.e1.q(x0);
                return;
            }
            throw new IllegalArgumentException("View should be fully attached to be ignored" + this.b.b0());
        }

        public void H1(x xVar) {
            for (int V = V() - 1; V >= 0; V--) {
                if (!RecyclerView.x0(U(V)).N()) {
                    K1(V, xVar);
                }
            }
        }

        public void I(int i) {
            J(i, U(i));
        }

        public boolean I0() {
            return this.i;
        }

        public void I1(x xVar) {
            int k = xVar.k();
            for (int i = k - 1; i >= 0; i--) {
                View o2 = xVar.o(i);
                H x0 = RecyclerView.x0(o2);
                if (!x0.N()) {
                    x0.K(false);
                    if (x0.B()) {
                        this.b.removeDetachedView(o2, false);
                    }
                    m mVar = this.b.M1;
                    if (mVar != null) {
                        mVar.k(x0);
                    }
                    x0.K(true);
                    xVar.E(o2);
                }
            }
            xVar.f();
            if (k > 0) {
                this.b.invalidate();
            }
        }

        public final void J(int i, View view) {
            this.a.d(i);
        }

        public boolean J0() {
            return this.j;
        }

        public void J1(View view, x xVar) {
            N1(view);
            xVar.H(view);
        }

        public void K(RecyclerView recyclerView) {
            this.i = true;
            b1(recyclerView);
        }

        public boolean K0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && recyclerView.isFocused()) {
                return true;
            }
            return false;
        }

        public void K1(int i, x xVar) {
            View U = U(i);
            O1(i);
            xVar.H(U);
        }

        public void L(RecyclerView recyclerView, x xVar) {
            this.i = false;
            d1(recyclerView, xVar);
        }

        public final boolean L0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int s0 = s0();
            int v0 = v0();
            int D0 = D0() - t0();
            int j0 = j0() - q0();
            Rect rect = this.b.h1;
            c0(focusedChild, rect);
            if (rect.left - i >= D0 || rect.right - i <= s0 || rect.top - i2 >= j0 || rect.bottom - i2 <= v0) {
                return false;
            }
            return true;
        }

        public boolean L1(Runnable runnable) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void M(View view) {
            m mVar = this.b.M1;
            if (mVar != null) {
                mVar.k(RecyclerView.x0(view));
            }
        }

        public final boolean M0() {
            return this.l;
        }

        public void M1(View view) {
            this.b.removeDetachedView(view, false);
        }

        public View N(View view) {
            View e0;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (e0 = recyclerView.e0(view)) == null || this.a.n(e0)) {
                return null;
            }
            return e0;
        }

        public boolean N0(x xVar, D d2) {
            return false;
        }

        public void N1(View view) {
            this.a.p(view);
        }

        public View O(int i) {
            int V = V();
            for (int i2 = 0; i2 < V; i2++) {
                View U = U(i2);
                H x0 = RecyclerView.x0(U);
                if (x0 != null && x0.p() == i && !x0.N() && (this.b.e2.j() || !x0.z())) {
                    return U;
                }
            }
            return null;
        }

        public boolean O0() {
            return this.k;
        }

        public void O1(int i) {
            if (U(i) != null) {
                this.a.q(i);
            }
        }

        public abstract q P();

        public boolean P1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return Q1(recyclerView, view, rect, z, false);
        }

        public q Q(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public boolean Q0() {
            C c2 = this.g;
            if (c2 != null && c2.i()) {
                return true;
            }
            return false;
        }

        public boolean Q1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] Y = Y(view, rect);
            int i = Y[0];
            int i2 = Y[1];
            if ((z2 && !L0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.R1(i, i2);
            }
            return true;
        }

        public q R(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof q) {
                return new q((q) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new q((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new q(layoutParams);
        }

        public boolean R0(View view, boolean z, boolean z2) {
            boolean z3;
            if (this.e.b(view, 24579) && this.f.b(view, 24579)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z) {
                return z3;
            }
            return !z3;
        }

        public void R1() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int S() {
            return -1;
        }

        public void S0(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((q) view.getLayoutParams()).b;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void S1() {
            this.h = true;
        }

        public int T(View view) {
            return ((q) view.getLayoutParams()).b.bottom;
        }

        public void T0(View view, int i, int i2, int i3, int i4) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public final void T1(x xVar, int i, View view) {
            H x0 = RecyclerView.x0(view);
            if (x0.N()) {
                return;
            }
            if (x0.x() && !x0.z() && !this.b.k1.l()) {
                O1(i);
                xVar.I(x0);
                return;
            }
            I(i);
            xVar.J(view);
            this.b.e1.k(x0);
        }

        public View U(int i) {
            C0375e c0375e = this.a;
            if (c0375e != null) {
                return c0375e.f(i);
            }
            return null;
        }

        public void U0(View view, int i, int i2) {
            q qVar = (q) view.getLayoutParams();
            Rect C0 = this.b.C0(view);
            int i3 = i + C0.left + C0.right;
            int i4 = i2 + C0.top + C0.bottom;
            int W = W(D0(), E0(), s0() + t0() + i3, ((ViewGroup.MarginLayoutParams) qVar).width, s());
            int W2 = W(j0(), k0(), v0() + q0() + i4, ((ViewGroup.MarginLayoutParams) qVar).height, t());
            if (g2(view, W, W2, qVar)) {
                view.measure(W, W2);
            }
        }

        public int U1(int i, x xVar, D d2) {
            return 0;
        }

        public int V() {
            C0375e c0375e = this.a;
            if (c0375e != null) {
                return c0375e.g();
            }
            return 0;
        }

        public void V0(View view, int i, int i2) {
            q qVar = (q) view.getLayoutParams();
            Rect C0 = this.b.C0(view);
            int i3 = i + C0.left + C0.right;
            int i4 = i2 + C0.top + C0.bottom;
            int W = W(D0(), E0(), s0() + t0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) qVar).width, s());
            int W2 = W(j0(), k0(), v0() + q0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) qVar).height, t());
            if (g2(view, W, W2, qVar)) {
                view.measure(W, W2);
            }
        }

        public void V1(int i) {
        }

        public void W0(int i, int i2) {
            View U = U(i);
            if (U != null) {
                I(i);
                p(U, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.b.toString());
        }

        public int W1(int i, x xVar, D d2) {
            return 0;
        }

        public void X0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.Z0(i);
            }
        }

        @Deprecated
        public void X1(boolean z) {
            this.j = z;
        }

        public final int[] Y(View view, Rect rect) {
            int s0 = s0();
            int v0 = v0();
            int D0 = D0() - t0();
            int j0 = j0() - q0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - s0;
            int min = Math.min(0, i);
            int i2 = top - v0;
            int min2 = Math.min(0, i2);
            int i3 = width - D0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - j0);
            if (m0() == 1) {
                if (max == 0) {
                    max = Math.max(min, i3);
                }
            } else {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            return new int[]{max, min2};
        }

        public void Y0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.a1(i);
            }
        }

        public void Y1(RecyclerView recyclerView) {
            a2(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public boolean Z() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && recyclerView.f1) {
                return true;
            }
            return false;
        }

        public void Z0(AbstractC0370h abstractC0370h, AbstractC0370h abstractC0370h2) {
        }

        public final void Z1(boolean z) {
            if (z != this.l) {
                this.l = z;
                this.m = 0;
                RecyclerView recyclerView = this.b;
                if (recyclerView != null) {
                    recyclerView.a1.Q();
                }
            }
        }

        public int a0(x xVar, D d2) {
            return -1;
        }

        public boolean a1(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        public void a2(int i, int i2) {
            this.q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f55o = mode;
            if (mode == 0 && !RecyclerView.G2) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.p = mode2;
            if (mode2 == 0 && !RecyclerView.G2) {
                this.r = 0;
            }
        }

        public int b0(View view) {
            return view.getBottom() + T(view);
        }

        public void b1(RecyclerView recyclerView) {
        }

        public void b2(int i, int i2) {
            this.b.setMeasuredDimension(i, i2);
        }

        public void c0(View view, Rect rect) {
            RecyclerView.z0(view, rect);
        }

        @Deprecated
        public void c1(RecyclerView recyclerView) {
        }

        public void c2(Rect rect, int i, int i2) {
            b2(v(i, rect.width() + s0() + t0(), p0()), v(i2, rect.height() + v0() + q0(), o0()));
        }

        public int d0(View view) {
            return view.getLeft() - n0(view);
        }

        public void d1(RecyclerView recyclerView, x xVar) {
            c1(recyclerView);
        }

        public void d2(int i, int i2) {
            int V = V();
            if (V == 0) {
                this.b.K(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < V; i7++) {
                View U = U(i7);
                Rect rect = this.b.h1;
                c0(U, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.b.h1.set(i6, i4, i3, i5);
            c2(this.b.h1, i, i2);
        }

        public int e0(View view) {
            Rect rect = ((q) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public View e1(View view, int i, x xVar, D d2) {
            return null;
        }

        public void e2(boolean z) {
            this.k = z;
        }

        public int f() {
            AbstractC0370h abstractC0370h;
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                abstractC0370h = recyclerView.getAdapter();
            } else {
                abstractC0370h = null;
            }
            if (abstractC0370h != null) {
                return abstractC0370h.g();
            }
            return 0;
        }

        public int f0(View view) {
            Rect rect = ((q) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void f1(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            g1(recyclerView.a1, recyclerView.e2, accessibilityEvent);
        }

        public void f2(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.q = 0;
                this.r = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.d1;
                this.q = recyclerView.getWidth();
                this.r = recyclerView.getHeight();
            }
            this.f55o = 1073741824;
            this.p = 1073741824;
        }

        public int g0(View view) {
            return view.getRight() + y0(view);
        }

        public void g1(x xVar, D d2, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                AbstractC0370h abstractC0370h = this.b.k1;
                if (abstractC0370h != null) {
                    accessibilityEvent.setItemCount(abstractC0370h.g());
                }
            }
        }

        public boolean g2(View view, int i, int i2, q qVar) {
            if (!view.isLayoutRequested() && this.k && P0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && P0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) qVar).height)) {
                return false;
            }
            return true;
        }

        public void h(View view) {
            i(view, -1);
        }

        public int h0(View view) {
            return view.getTop() - B0(view);
        }

        public void h1(x xVar, D d2, C10861y4 c10861y4) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                c10861y4.a(8192);
                c10861y4.Z1(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                c10861y4.a(4096);
                c10861y4.Z1(true);
            }
            c10861y4.m1(C10861y4.f.h(z0(xVar, d2), a0(xVar, d2), N0(xVar, d2), A0(xVar, d2)));
        }

        public boolean h2() {
            return false;
        }

        public void i(View view, int i) {
            l(view, i, true);
        }

        public View i0() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void i1(C10861y4 c10861y4) {
            RecyclerView recyclerView = this.b;
            h1(recyclerView.a1, recyclerView.e2, c10861y4);
        }

        public boolean i2(View view, int i, int i2, q qVar) {
            if (this.k && P0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && P0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) qVar).height)) {
                return false;
            }
            return true;
        }

        public void j(View view) {
            k(view, -1);
        }

        public int j0() {
            return this.r;
        }

        public void j1(View view, C10861y4 c10861y4) {
            H x0 = RecyclerView.x0(view);
            if (x0 != null && !x0.z() && !this.a.n(x0.a)) {
                RecyclerView recyclerView = this.b;
                k1(recyclerView.a1, recyclerView.e2, view, c10861y4);
            }
        }

        public void j2(RecyclerView recyclerView, D d2, int i) {
            Log.e(RecyclerView.y2, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void k(View view, int i) {
            l(view, i, false);
        }

        public int k0() {
            return this.p;
        }

        public void k2(C c2) {
            C c3 = this.g;
            if (c3 != null && c2 != c3 && c3.i()) {
                this.g.s();
            }
            this.g = c2;
            c2.r(this.b, this);
        }

        public final void l(View view, int i, boolean z) {
            H x0 = RecyclerView.x0(view);
            if (!z && !x0.z()) {
                this.b.e1.p(x0);
            } else {
                this.b.e1.b(x0);
            }
            q qVar = (q) view.getLayoutParams();
            if (!x0.Q() && !x0.A()) {
                if (view.getParent() == this.b) {
                    int m = this.a.m(view);
                    if (i == -1) {
                        i = this.a.g();
                    }
                    if (m != -1) {
                        if (m != i) {
                            this.b.l1.W0(m, i);
                        }
                    } else {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.b0());
                    }
                } else {
                    this.a.a(view, i, false);
                    qVar.c = true;
                    C c2 = this.g;
                    if (c2 != null && c2.i()) {
                        this.g.l(view);
                    }
                }
            } else {
                if (x0.A()) {
                    x0.P();
                } else {
                    x0.e();
                }
                this.a.c(view, i, view.getLayoutParams(), false);
            }
            if (qVar.d) {
                x0.a.invalidate();
                qVar.d = false;
            }
        }

        public int l0(View view) {
            return RecyclerView.x0(view).o();
        }

        public View l1(View view, int i) {
            return null;
        }

        public void l2(View view) {
            H x0 = RecyclerView.x0(view);
            x0.O();
            x0.H();
            x0.b(4);
        }

        public void m(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.w(str);
            }
        }

        public int m0() {
            return C6516gH2.e0(this.b);
        }

        public void m1(RecyclerView recyclerView, int i, int i2) {
        }

        public void m2() {
            C c2 = this.g;
            if (c2 != null) {
                c2.s();
            }
        }

        public void n(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.x(str);
            }
        }

        public int n0(View view) {
            return ((q) view.getLayoutParams()).b.left;
        }

        public void n1(RecyclerView recyclerView) {
        }

        public boolean n2() {
            return false;
        }

        public void o(View view) {
            p(view, -1);
        }

        public int o0() {
            return C6516gH2.j0(this.b);
        }

        public void o1(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void p(View view, int i) {
            q(view, i, (q) view.getLayoutParams());
        }

        public int p0() {
            return C6516gH2.k0(this.b);
        }

        public void p1(RecyclerView recyclerView, int i, int i2) {
        }

        public void q(View view, int i, q qVar) {
            H x0 = RecyclerView.x0(view);
            if (x0.z()) {
                this.b.e1.b(x0);
            } else {
                this.b.e1.p(x0);
            }
            this.a.c(view, i, qVar, x0.z());
        }

        public int q0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void q1(RecyclerView recyclerView, int i, int i2) {
        }

        public void r(View view, Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.C0(view));
            }
        }

        public int r0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return C6516gH2.o0(recyclerView);
            }
            return 0;
        }

        public void r1(RecyclerView recyclerView, int i, int i2, Object obj) {
            q1(recyclerView, i, i2);
        }

        public boolean s() {
            return false;
        }

        public int s0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void s1(x xVar, D d2) {
            Log.e(RecyclerView.y2, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public boolean t() {
            return false;
        }

        public int t0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void t1(D d2) {
        }

        public boolean u(q qVar) {
            return qVar != null;
        }

        public int u0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return C6516gH2.p0(recyclerView);
            }
            return 0;
        }

        public void u1(x xVar, D d2, int i, int i2) {
            this.b.K(i, i2);
        }

        public int v0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        @Deprecated
        public boolean v1(RecyclerView recyclerView, View view, View view2) {
            if (!Q0() && !recyclerView.R0()) {
                return false;
            }
            return true;
        }

        public void w(int i, int i2, D d2, c cVar) {
        }

        public int w0(View view) {
            return ((q) view.getLayoutParams()).d();
        }

        public boolean w1(RecyclerView recyclerView, D d2, View view, View view2) {
            return v1(recyclerView, view, view2);
        }

        public void x(int i, c cVar) {
        }

        public void x1(Parcelable parcelable) {
        }

        public int y(D d2) {
            return 0;
        }

        public int y0(View view) {
            return ((q) view.getLayoutParams()).b.right;
        }

        public Parcelable y1() {
            return null;
        }

        public int z(D d2) {
            return 0;
        }

        public int z0(x xVar, D d2) {
            return -1;
        }

        public void z1(int i) {
        }

        public void k1(x xVar, D d2, View view, C10861y4 c10861y4) {
        }
    }
}
