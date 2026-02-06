package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import o.C10861y4;
import o.C7729lH2;
import o.G4;
import o.SL1;

/* renamed from: o.d70  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5734d70 extends ViewGroup implements InterfaceC3101Gv1 {
    public static final String J1 = "DrawerLayout";
    public static final int L1 = 0;
    public static final int M1 = 1;
    public static final int N1 = 2;
    public static final int O1 = 0;
    public static final int P1 = 1;
    public static final int Q1 = 2;
    public static final int R1 = 3;
    public static final int S1 = 64;
    public static final int T1 = -1728053248;
    public static final int U1 = 160;
    public static final int V1 = 400;
    public static final boolean W1 = false;
    public static final boolean X1 = true;
    public static final float Y1 = 1.0f;
    public static final boolean a2;
    public static final boolean b2;
    public static final String c2 = "androidx.drawerlayout.widget.DrawerLayout";
    public static boolean d2;
    public boolean A1;
    public Drawable B1;
    public Drawable C1;
    public Drawable D1;
    public Drawable E1;
    public final ArrayList<View> F1;
    public Rect G1;
    public Matrix H1;
    public final G4 I1;
    public final d Y0;
    public float Z0;
    public int a1;
    public int b1;
    public float c1;
    public Paint d1;
    public final C7729lH2 e1;
    public final C7729lH2 f1;
    public final i g1;
    public final i h1;
    public int i1;
    public boolean j1;
    public boolean k1;
    public int l1;
    public int m1;
    public int n1;
    public int o1;
    public boolean p1;
    public e q1;
    public List<e> r1;
    public float s1;
    public float t1;
    public Drawable u1;
    public Drawable v1;
    public Drawable w1;
    public CharSequence x1;
    public CharSequence y1;
    public Object z1;
    public static final int[] K1 = {16843828};
    public static final int[] Z1 = {16842931};

    /* renamed from: o.d70$a */
    /* loaded from: classes.dex */
    public class a implements G4 {
        public a() {
        }

        @Override // o.G4
        public boolean a(View view, G4.a aVar) {
            if (C5734d70.this.D(view) && C5734d70.this.r(view) != 2) {
                C5734d70.this.f(view);
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.d70$b */
    /* loaded from: classes.dex */
    public class b implements View.OnApplyWindowInsetsListener {
        public b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            boolean z;
            C5734d70 c5734d70 = (C5734d70) view;
            if (windowInsets.getSystemWindowInsetTop() > 0) {
                z = true;
            } else {
                z = false;
            }
            c5734d70.S(windowInsets, z);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: o.d70$c */
    /* loaded from: classes.dex */
    public class c extends Q3 {
        public final Rect d = new Rect();

        public c() {
        }

        @Override // o.Q3
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View p = C5734d70.this.p();
                if (p != null) {
                    CharSequence s = C5734d70.this.s(C5734d70.this.t(p));
                    if (s != null) {
                        text.add(s);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // o.Q3
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(C5734d70.c2);
        }

        @Override // o.Q3
        public void g(View view, C10861y4 c10861y4) {
            if (C5734d70.a2) {
                super.g(view, c10861y4);
            } else {
                C10861y4 R0 = C10861y4.R0(c10861y4);
                super.g(view, R0);
                c10861y4.c2(view);
                ViewParent q0 = C6516gH2.q0(view);
                if (q0 instanceof View) {
                    c10861y4.R1((View) q0);
                }
                o(c10861y4, R0);
                R0.U0();
                n(c10861y4, (ViewGroup) view);
            }
            c10861y4.k1(C5734d70.c2);
            c10861y4.y1(false);
            c10861y4.z1(false);
            c10861y4.W0(C10861y4.a.f);
            c10861y4.W0(C10861y4.a.g);
        }

        @Override // o.Q3
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!C5734d70.a2 && !C5734d70.A(view)) {
                return false;
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        public final void n(C10861y4 c10861y4, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (C5734d70.A(childAt)) {
                    c10861y4.c(childAt);
                }
            }
        }

        public final void o(C10861y4 c10861y4, C10861y4 c10861y42) {
            Rect rect = this.d;
            c10861y42.t(rect);
            c10861y4.f1(rect);
            c10861y4.r2(c10861y42.N0());
            c10861y4.P1(c10861y42.S());
            c10861y4.k1(c10861y42.y());
            c10861y4.p1(c10861y42.D());
            c10861y4.v1(c10861y42.x0());
            c10861y4.z1(c10861y42.A0());
            c10861y4.b1(c10861y42.p0());
            c10861y4.a2(c10861y42.J0());
            c10861y4.a(c10861y42.p());
        }
    }

    /* renamed from: o.d70$d */
    /* loaded from: classes.dex */
    public static final class d extends Q3 {
        @Override // o.Q3
        public void g(View view, C10861y4 c10861y4) {
            super.g(view, c10861y4);
            if (!C5734d70.A(view)) {
                c10861y4.R1(null);
            }
        }
    }

    /* renamed from: o.d70$e */
    /* loaded from: classes.dex */
    public interface e {
        void a(View view);

        void b(View view);

        void c(int i);

        void d(View view, float f);
    }

    /* renamed from: o.d70$i */
    /* loaded from: classes.dex */
    public class i extends C7729lH2.c {
        public final int a;
        public C7729lH2 b;
        public final Runnable c = new a();

        /* renamed from: o.d70$i$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.o();
            }
        }

        public i(int i) {
            this.a = i;
        }

        @Override // o.C7729lH2.c
        public int a(View view, int i, int i2) {
            if (C5734d70.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = C5734d70.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // o.C7729lH2.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // o.C7729lH2.c
        public int d(View view) {
            if (C5734d70.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // o.C7729lH2.c
        public void f(int i, int i2) {
            View n;
            if ((i & 1) == 1) {
                n = C5734d70.this.n(3);
            } else {
                n = C5734d70.this.n(5);
            }
            if (n != null && C5734d70.this.r(n) == 0) {
                this.b.d(n, i2);
            }
        }

        @Override // o.C7729lH2.c
        public boolean g(int i) {
            return false;
        }

        @Override // o.C7729lH2.c
        public void h(int i, int i2) {
            C5734d70.this.postDelayed(this.c, 160L);
        }

        @Override // o.C7729lH2.c
        public void i(View view, int i) {
            ((f) view.getLayoutParams()).c = false;
            n();
        }

        @Override // o.C7729lH2.c
        public void j(int i) {
            C5734d70.this.b0(i, this.b.z());
        }

        @Override // o.C7729lH2.c
        public void k(View view, int i, int i2, int i3, int i4) {
            float width;
            int i5;
            int width2 = view.getWidth();
            if (C5734d70.this.c(view, 3)) {
                width = i + width2;
            } else {
                width = C5734d70.this.getWidth() - i;
            }
            float f = width / width2;
            C5734d70.this.Y(view, f);
            if (f == 0.0f) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            view.setVisibility(i5);
            C5734d70.this.invalidate();
        }

        @Override // o.C7729lH2.c
        public void l(View view, float f, float f2) {
            int i;
            float u = C5734d70.this.u(view);
            int width = view.getWidth();
            if (C5734d70.this.c(view, 3)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 <= 0 && (i2 != 0 || u <= 0.5f)) {
                    i = -width;
                } else {
                    i = 0;
                }
            } else {
                int width2 = C5734d70.this.getWidth();
                if (f < 0.0f || (f == 0.0f && u > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.b.V(i, view.getTop());
            C5734d70.this.invalidate();
        }

        @Override // o.C7729lH2.c
        public boolean m(View view, int i) {
            if (C5734d70.this.E(view) && C5734d70.this.c(view, this.a) && C5734d70.this.r(view) == 0) {
                return true;
            }
            return false;
        }

        public final void n() {
            int i = 3;
            if (this.a == 3) {
                i = 5;
            }
            View n = C5734d70.this.n(i);
            if (n != null) {
                C5734d70.this.f(n);
            }
        }

        public void o() {
            boolean z;
            View n;
            int width;
            int B = this.b.B();
            int i = 0;
            if (this.a == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                n = C5734d70.this.n(3);
                if (n != null) {
                    i = -n.getWidth();
                }
                width = i + B;
            } else {
                n = C5734d70.this.n(5);
                width = C5734d70.this.getWidth() - B;
            }
            if (n != null) {
                if (((z && n.getLeft() < width) || (!z && n.getLeft() > width)) && C5734d70.this.r(n) == 0) {
                    this.b.X(n, width, n.getTop());
                    ((f) n.getLayoutParams()).c = true;
                    C5734d70.this.invalidate();
                    n();
                    C5734d70.this.b();
                }
            }
        }

        public void p() {
            C5734d70.this.removeCallbacks(this.c);
        }

        public void q(C7729lH2 c7729lH2) {
            this.b = c7729lH2;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = true;
        a2 = true;
        b2 = true;
        if (i2 < 29) {
            z = false;
        }
        d2 = z;
    }

    public C5734d70(Context context) {
        this(context, null);
    }

    public static boolean A(View view) {
        if (C6516gH2.Z(view) != 4 && C6516gH2.Z(view) != 2) {
            return true;
        }
        return false;
    }

    public static String w(int i2) {
        if ((i2 & 3) == 3) {
            return "LEFT";
        }
        if ((i2 & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i2);
    }

    public static boolean x(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    public boolean B(View view) {
        if (((f) view.getLayoutParams()).a == 0) {
            return true;
        }
        return false;
    }

    public boolean C(int i2) {
        View n = n(i2);
        if (n != null) {
            return D(n);
        }
        return false;
    }

    public boolean D(View view) {
        if (E(view)) {
            if ((((f) view.getLayoutParams()).d & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean E(View view) {
        int d3 = JE0.d(((f) view.getLayoutParams()).a, C6516gH2.e0(view));
        if ((d3 & 3) != 0 || (d3 & 5) != 0) {
            return true;
        }
        return false;
    }

    public boolean F(int i2) {
        View n = n(i2);
        if (n != null) {
            return G(n);
        }
        return false;
    }

    public boolean G(View view) {
        if (E(view)) {
            if (((f) view.getLayoutParams()).b > 0.0f) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean H(float f2, float f3, View view) {
        if (this.G1 == null) {
            this.G1 = new Rect();
        }
        view.getHitRect(this.G1);
        return this.G1.contains((int) f2, (int) f3);
    }

    public final void I(Drawable drawable, int i2) {
        if (drawable != null && D60.h(drawable)) {
            D60.m(drawable, i2);
        }
    }

    public void J(View view, float f2) {
        float u = u(view);
        float width = view.getWidth();
        int i2 = ((int) (width * f2)) - ((int) (u * width));
        if (!c(view, 3)) {
            i2 = -i2;
        }
        view.offsetLeftAndRight(i2);
        Y(view, f2);
    }

    public void K(int i2) {
        L(i2, true);
    }

    public void L(int i2, boolean z) {
        View n = n(i2);
        if (n != null) {
            N(n, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i2));
    }

    public void M(View view) {
        N(view, true);
    }

    public void N(View view, boolean z) {
        if (E(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.k1) {
                fVar.b = 1.0f;
                fVar.d = 1;
                a0(view, true);
                Z(view);
            } else if (z) {
                fVar.d |= 2;
                if (c(view, 3)) {
                    this.e1.X(view, 0, view.getTop());
                } else {
                    this.f1.X(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                J(view, 1.0f);
                b0(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void O(e eVar) {
        List<e> list;
        if (eVar == null || (list = this.r1) == null) {
            return;
        }
        list.remove(eVar);
    }

    public final Drawable P() {
        int e0 = C6516gH2.e0(this);
        if (e0 == 0) {
            Drawable drawable = this.B1;
            if (drawable != null) {
                I(drawable, e0);
                return this.B1;
            }
        } else {
            Drawable drawable2 = this.C1;
            if (drawable2 != null) {
                I(drawable2, e0);
                return this.C1;
            }
        }
        return this.D1;
    }

    public final Drawable Q() {
        int e0 = C6516gH2.e0(this);
        if (e0 == 0) {
            Drawable drawable = this.C1;
            if (drawable != null) {
                I(drawable, e0);
                return this.C1;
            }
        } else {
            Drawable drawable2 = this.B1;
            if (drawable2 != null) {
                I(drawable2, e0);
                return this.B1;
            }
        }
        return this.E1;
    }

    public final void R() {
        if (b2) {
            return;
        }
        this.v1 = P();
        this.w1 = Q();
    }

    public void S(Object obj, boolean z) {
        boolean z2;
        this.z1 = obj;
        this.A1 = z;
        if (!z && getBackground() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        requestLayout();
    }

    public void T(int i2, int i3) {
        View n;
        C7729lH2 c7729lH2;
        int d3 = JE0.d(i3, C6516gH2.e0(this));
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 == 8388613) {
                        this.o1 = i2;
                    }
                } else {
                    this.n1 = i2;
                }
            } else {
                this.m1 = i2;
            }
        } else {
            this.l1 = i2;
        }
        if (i2 != 0) {
            if (d3 == 3) {
                c7729lH2 = this.e1;
            } else {
                c7729lH2 = this.f1;
            }
            c7729lH2.c();
        }
        if (i2 != 1) {
            if (i2 == 2 && (n = n(d3)) != null) {
                M(n);
                return;
            }
            return;
        }
        View n2 = n(d3);
        if (n2 != null) {
            f(n2);
        }
    }

    public void U(int i2, View view) {
        if (E(view)) {
            T(i2, ((f) view.getLayoutParams()).a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void V(int i2, int i3) {
        W(C10201vM.l(getContext(), i2), i3);
    }

    public void W(Drawable drawable, int i2) {
        if (!b2) {
            if ((i2 & JE0.b) == 8388611) {
                this.B1 = drawable;
            } else if ((i2 & 8388613) == 8388613) {
                this.C1 = drawable;
            } else if ((i2 & 3) == 3) {
                this.D1 = drawable;
            } else if ((i2 & 5) == 5) {
                this.E1 = drawable;
            } else {
                return;
            }
            R();
            invalidate();
        }
    }

    public void X(int i2, CharSequence charSequence) {
        int d3 = JE0.d(i2, C6516gH2.e0(this));
        if (d3 == 3) {
            this.x1 = charSequence;
        } else if (d3 == 5) {
            this.y1 = charSequence;
        }
    }

    public void Y(View view, float f2) {
        f fVar = (f) view.getLayoutParams();
        if (f2 == fVar.b) {
            return;
        }
        fVar.b = f2;
        l(view, f2);
    }

    public final void Z(View view) {
        C10861y4.a aVar = C10861y4.a.z;
        C6516gH2.y1(view, aVar.b());
        if (D(view) && r(view) != 2) {
            C6516gH2.B1(view, aVar, null, this.I1);
        }
    }

    public void a(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.r1 == null) {
            this.r1 = new ArrayList();
        }
        this.r1.add(eVar);
    }

    public final void a0(View view, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((!z && !E(childAt)) || (z && childAt == view)) {
                C6516gH2.a2(childAt, 1);
            } else {
                C6516gH2.a2(childAt, 4);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (E(childAt)) {
                if (D(childAt)) {
                    childAt.addFocusables(arrayList, i2, i3);
                    z = true;
                }
            } else {
                this.F1.add(childAt);
            }
        }
        if (!z) {
            int size = this.F1.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = this.F1.get(i5);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i2, i3);
                }
            }
        }
        this.F1.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (o() == null && !E(view)) {
            C6516gH2.a2(view, 1);
        } else {
            C6516gH2.a2(view, 4);
        }
        if (!a2) {
            C6516gH2.I1(view, this.Y0);
        }
    }

    public void b() {
        if (!this.p1) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.p1 = true;
        }
    }

    public void b0(int i2, View view) {
        int i3;
        int F = this.e1.F();
        int F2 = this.f1.F();
        if (F != 1 && F2 != 1) {
            i3 = 2;
            if (F != 2 && F2 != 2) {
                i3 = 0;
            }
        } else {
            i3 = 1;
        }
        if (view != null && i2 == 0) {
            float f2 = ((f) view.getLayoutParams()).b;
            if (f2 == 0.0f) {
                j(view);
            } else if (f2 == 1.0f) {
                k(view);
            }
        }
        if (i3 != this.i1) {
            this.i1 = i3;
            List<e> list = this.r1;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.r1.get(size).c(i3);
                }
            }
        }
    }

    public boolean c(View view, int i2) {
        if ((t(view) & i2) == i2) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof f) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC3101Gv1
    public void close() {
        d(JE0.b);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f2 = Math.max(f2, ((f) getChildAt(i2).getLayoutParams()).b);
        }
        this.c1 = f2;
        boolean o2 = this.e1.o(true);
        boolean o3 = this.f1.o(true);
        if (!o2 && !o3) {
            return;
        }
        C6516gH2.u1(this);
    }

    public void d(int i2) {
        e(i2, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.c1 > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                for (int i2 = childCount - 1; i2 >= 0; i2--) {
                    View childAt = getChildAt(i2);
                    if (H(x, y, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int i2;
        int height = getHeight();
        boolean B = B(view);
        int width = getWidth();
        int save = canvas.save();
        int i3 = 0;
        if (B) {
            int childCount = getChildCount();
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i4) {
                            i4 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i4, 0, width, getHeight());
            i3 = i4;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f2 = this.c1;
        if (f2 > 0.0f && B) {
            this.d1.setColor((this.b1 & C6516gH2.x) | (((int) ((((-16777216) & i2) >>> 24) * f2)) << 24));
            canvas.drawRect(i3, 0.0f, width, getHeight(), this.d1);
            return drawChild;
        } else if (this.v1 != null && c(view, 3)) {
            int intrinsicWidth = this.v1.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.e1.B(), 1.0f));
            this.v1.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.v1.setAlpha((int) (max * 255.0f));
            this.v1.draw(canvas);
            return drawChild;
        } else {
            if (this.w1 != null && c(view, 5)) {
                int intrinsicWidth2 = this.w1.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f1.B(), 1.0f));
                this.w1.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.w1.setAlpha((int) (max2 * 255.0f));
                this.w1.draw(canvas);
            }
            return drawChild;
        }
    }

    public void e(int i2, boolean z) {
        View n = n(i2);
        if (n != null) {
            g(n, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i2));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z) {
        if (E(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.k1) {
                fVar.b = 0.0f;
                fVar.d = 0;
            } else if (z) {
                fVar.d |= 4;
                if (c(view, 3)) {
                    this.e1.X(view, -view.getWidth(), view.getTop());
                } else {
                    this.f1.X(view, getWidth(), view.getTop());
                }
            } else {
                J(view, 0.0f);
                b0(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (b2) {
            return this.Z0;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.u1;
    }

    public void h() {
        i(false);
    }

    public void i(boolean z) {
        boolean X;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f fVar = (f) childAt.getLayoutParams();
            if (E(childAt) && (!z || fVar.c)) {
                int width = childAt.getWidth();
                if (c(childAt, 3)) {
                    X = this.e1.X(childAt, -width, childAt.getTop());
                } else {
                    X = this.f1.X(childAt, getWidth(), childAt.getTop());
                }
                z2 |= X;
                fVar.c = false;
            }
        }
        this.g1.p();
        this.h1.p();
        if (z2) {
            invalidate();
        }
    }

    @Override // o.InterfaceC3101Gv1
    public boolean isOpen() {
        return C(JE0.b);
    }

    public void j(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.d & 1) == 1) {
            fVar.d = 0;
            List<e> list = this.r1;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.r1.get(size).b(view);
                }
            }
            a0(view, false);
            Z(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    public void k(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.d & 1) == 0) {
            fVar.d = 1;
            List<e> list = this.r1;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.r1.get(size).a(view);
                }
            }
            a0(view, true);
            Z(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void l(View view, float f2) {
        List<e> list = this.r1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.r1.get(size).d(view, f2);
            }
        }
    }

    public final boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v = v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v);
            v.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    public View n(int i2) {
        int d3 = JE0.d(i2, C6516gH2.e0(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((t(childAt) & 7) == d3) {
                return childAt;
            }
        }
        return null;
    }

    public View o() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((f) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k1 = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        if (this.A1 && this.u1 != null) {
            Object obj = this.z1;
            if (obj != null) {
                i2 = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                this.u1.setBounds(0, 0, getWidth(), i2);
                this.u1.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View v;
        int actionMasked = motionEvent.getActionMasked();
        boolean W = this.e1.W(motionEvent) | this.f1.W(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.e1.f(3)) {
                        this.g1.p();
                        this.h1.p();
                    }
                }
                z = false;
            }
            i(true);
            this.p1 = false;
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.s1 = x;
            this.t1 = y;
            if (this.c1 > 0.0f && (v = this.e1.v((int) x, (int) y)) != null && B(v)) {
                z = true;
            } else {
                z = false;
            }
            this.p1 = false;
        }
        if (W || z || y() || this.p1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4 && z()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            View p = p();
            if (p != null && r(p) == 0) {
                h();
            }
            if (p != null) {
                return true;
            }
            return false;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        WindowInsets rootWindowInsets;
        int i6;
        float f2;
        int i7;
        boolean z2;
        int i8;
        boolean z3 = true;
        this.j1 = true;
        int i9 = i4 - i2;
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i11 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i11, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i11, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f3 = measuredWidth;
                        i7 = (-measuredWidth) + ((int) (fVar.b * f3));
                        f2 = (measuredWidth + i7) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i9 - i6) / f4;
                        i7 = i9 - ((int) (fVar.b * f4));
                    }
                    if (f2 != fVar.b) {
                        z2 = z3;
                    } else {
                        z2 = false;
                    }
                    int i12 = fVar.a & 112;
                    if (i12 != 16) {
                        if (i12 != 80) {
                            int i13 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                            childAt.layout(i7, i13, measuredWidth + i7, measuredHeight + i13);
                        } else {
                            int i14 = i5 - i3;
                            childAt.layout(i7, (i14 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i14 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        }
                    } else {
                        int i15 = i5 - i3;
                        int i16 = (i15 - measuredHeight) / 2;
                        int i17 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i16 < i17) {
                            i16 = i17;
                        } else {
                            int i18 = i16 + measuredHeight;
                            int i19 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i18 > i15 - i19) {
                                i16 = (i15 - i19) - measuredHeight;
                            }
                        }
                        childAt.layout(i7, i16, measuredWidth + i7, measuredHeight + i16);
                    }
                    if (z2) {
                        Y(childAt, f2);
                    }
                    if (fVar.b > 0.0f) {
                        i8 = 0;
                    } else {
                        i8 = 4;
                    }
                    if (childAt.getVisibility() != i8) {
                        childAt.setVisibility(i8);
                    }
                }
            }
            i10++;
            z3 = true;
        }
        if (d2 && (rootWindowInsets = getRootWindowInsets()) != null) {
            C9246rQ0 n = RL2.L(rootWindowInsets).n();
            C7729lH2 c7729lH2 = this.e1;
            c7729lH2.S(Math.max(c7729lH2.A(), n.a));
            C7729lH2 c7729lH22 = this.f1;
            c7729lH22.S(Math.max(c7729lH22.A(), n.c));
        }
        this.j1 = false;
        this.k1 = false;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        boolean z;
        int t;
        boolean z2;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.z1 != null && C6516gH2.Y(this)) {
            z = true;
        } else {
            z = false;
        }
        int e0 = C6516gH2.e0(this);
        int childCount = getChildCount();
        boolean z3 = false;
        boolean z4 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z) {
                    int d3 = JE0.d(fVar.a, e0);
                    if (C6516gH2.Y(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.z1;
                        if (d3 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (d3 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.z1;
                        if (d3 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (d3 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else if (E(childAt)) {
                    if (b2) {
                        float V = C6516gH2.V(childAt);
                        float f2 = this.Z0;
                        if (V != f2) {
                            C6516gH2.W1(childAt, f2);
                        }
                    }
                    if ((t(childAt) & 7) == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((z2 && z3) || (!z2 && z4)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(t) + " but this " + J1 + " already has a drawer view along that edge");
                    }
                    if (z2) {
                        z3 = true;
                    } else {
                        z4 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i2, this.a1 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i3, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View n;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        int i2 = gVar.Z;
        if (i2 != 0 && (n = n(i2)) != null) {
            M(n);
        }
        int i3 = gVar.Y0;
        if (i3 != 3) {
            T(i3, 3);
        }
        int i4 = gVar.Z0;
        if (i4 != 3) {
            T(i4, 5);
        }
        int i5 = gVar.a1;
        if (i5 != 3) {
            T(i5, JE0.b);
        }
        int i6 = gVar.b1;
        if (i6 != 3) {
            T(i6, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        R();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            f fVar = (f) getChildAt(i2).getLayoutParams();
            int i3 = fVar.d;
            boolean z2 = true;
            if (i3 == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i3 != 2) {
                z2 = false;
            }
            if (z || z2) {
                gVar.Z = fVar.a;
                break;
            }
        }
        gVar.Y0 = this.l1;
        gVar.Z0 = this.m1;
        gVar.a1 = this.n1;
        gVar.b1 = this.o1;
        return gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.e1.M(motionEvent);
        this.f1.M(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z = false;
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    i(true);
                    this.p1 = false;
                }
            } else {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                View v = this.e1.v((int) x, (int) y);
                if (v != null && B(v)) {
                    float f2 = x - this.s1;
                    float f3 = y - this.t1;
                    int E = this.e1.E();
                    if ((f2 * f2) + (f3 * f3) < E * E) {
                        View o2 = o();
                        if (o2 != null) {
                        }
                    }
                }
                z = true;
                i(z);
            }
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.s1 = x2;
            this.t1 = y2;
            this.p1 = false;
        }
        return true;
    }

    @Override // o.InterfaceC3101Gv1
    public void open() {
        K(JE0.b);
    }

    public View p() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (E(childAt) && G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int e0 = C6516gH2.e0(this);
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 8388611) {
                    if (i2 == 8388613) {
                        int i7 = this.o1;
                        if (i7 != 3) {
                            return i7;
                        }
                        if (e0 == 0) {
                            i6 = this.m1;
                        } else {
                            i6 = this.l1;
                        }
                        if (i6 != 3) {
                            return i6;
                        }
                        return 0;
                    }
                    return 0;
                }
                int i8 = this.n1;
                if (i8 != 3) {
                    return i8;
                }
                if (e0 == 0) {
                    i5 = this.l1;
                } else {
                    i5 = this.m1;
                }
                if (i5 != 3) {
                    return i5;
                }
                return 0;
            }
            int i9 = this.m1;
            if (i9 != 3) {
                return i9;
            }
            if (e0 == 0) {
                i4 = this.o1;
            } else {
                i4 = this.n1;
            }
            if (i4 != 3) {
                return i4;
            }
            return 0;
        }
        int i10 = this.l1;
        if (i10 != 3) {
            return i10;
        }
        if (e0 == 0) {
            i3 = this.n1;
        } else {
            i3 = this.o1;
        }
        if (i3 != 3) {
            return i3;
        }
        return 0;
    }

    public int r(View view) {
        if (E(view)) {
            return q(((f) view.getLayoutParams()).a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.j1) {
            super.requestLayout();
        }
    }

    public CharSequence s(int i2) {
        int d3 = JE0.d(i2, C6516gH2.e0(this));
        if (d3 == 3) {
            return this.x1;
        }
        if (d3 == 5) {
            return this.y1;
        }
        return null;
    }

    public void setDrawerElevation(float f2) {
        this.Z0 = f2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (E(childAt)) {
                C6516gH2.W1(childAt, this.Z0);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.q1;
        if (eVar2 != null) {
            O(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.q1 = eVar;
    }

    public void setDrawerLockMode(int i2) {
        T(i2, 3);
        T(i2, 5);
    }

    public void setScrimColor(int i2) {
        this.b1 = i2;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.u1 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i2) {
        this.u1 = new ColorDrawable(i2);
        invalidate();
    }

    public int t(View view) {
        return JE0.d(((f) view.getLayoutParams()).a, C6516gH2.e0(this));
    }

    public float u(View view) {
        return ((f) view.getLayoutParams()).b;
    }

    public final MotionEvent v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.H1 == null) {
                this.H1 = new Matrix();
            }
            matrix.invert(this.H1);
            obtain.transform(this.H1);
        }
        return obtain;
    }

    public final boolean y() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((f) getChildAt(i2).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        if (p() != null) {
            return true;
        }
        return false;
    }

    public C5734d70(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, SL1.a.drawerLayoutStyle);
    }

    public C5734d70(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.Y0 = new d();
        this.b1 = -1728053248;
        this.d1 = new Paint();
        this.k1 = true;
        this.l1 = 3;
        this.m1 = 3;
        this.n1 = 3;
        this.o1 = 3;
        this.B1 = null;
        this.C1 = null;
        this.D1 = null;
        this.E1 = null;
        this.I1 = new a();
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.a1 = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        i iVar = new i(3);
        this.g1 = iVar;
        i iVar2 = new i(5);
        this.h1 = iVar2;
        C7729lH2 p = C7729lH2.p(this, 1.0f, iVar);
        this.e1 = p;
        p.T(1);
        p.U(f3);
        iVar.q(p);
        C7729lH2 p2 = C7729lH2.p(this, 1.0f, iVar2);
        this.f1 = p2;
        p2.T(2);
        p2.U(f3);
        iVar2.q(p2);
        setFocusableInTouchMode(true);
        C6516gH2.a2(this, 1);
        C6516gH2.I1(this, new c());
        setMotionEventSplittingEnabled(false);
        if (C6516gH2.Y(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(com.facebook.internal.q0.q1);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(K1);
            try {
                this.u1 = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, SL1.j.g, i2, 0);
        try {
            int i3 = SL1.j.h;
            if (obtainStyledAttributes2.hasValue(i3)) {
                this.Z0 = obtainStyledAttributes2.getDimension(i3, 0.0f);
            } else {
                this.Z0 = getResources().getDimension(SL1.c.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.F1 = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setStatusBarBackground(int i2) {
        this.u1 = i2 != 0 ? C10201vM.l(getContext(), i2) : null;
        invalidate();
    }

    /* renamed from: o.d70$f */
    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {
        public static final int e = 1;
        public static final int f = 2;
        public static final int g = 4;
        public int a;
        public float b;
        public boolean c;
        public int d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5734d70.Z1);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public f(int i, int i2) {
            super(i, i2);
            this.a = 0;
        }

        public f(int i, int i2, int i3) {
            this(i, i2);
            this.a = i3;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.a = 0;
            this.a = fVar.a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* renamed from: o.d70$g */
    /* loaded from: classes.dex */
    public static class g extends J {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public int Y0;
        public int Z;
        public int Z0;
        public int a1;
        public int b1;

        /* renamed from: o.d70$g$a */
        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = 0;
            this.Z = parcel.readInt();
            this.Y0 = parcel.readInt();
            this.Z0 = parcel.readInt();
            this.a1 = parcel.readInt();
            this.b1 = parcel.readInt();
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.Z);
            parcel.writeInt(this.Y0);
            parcel.writeInt(this.Z0);
            parcel.writeInt(this.a1);
            parcel.writeInt(this.b1);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
            this.Z = 0;
        }
    }

    /* renamed from: o.d70$h */
    /* loaded from: classes.dex */
    public static abstract class h implements e {
        @Override // o.C5734d70.e
        public void a(View view) {
        }

        @Override // o.C5734d70.e
        public void b(View view) {
        }

        @Override // o.C5734d70.e
        public void c(int i) {
        }

        @Override // o.C5734d70.e
        public void d(View view, float f) {
        }
    }
}
