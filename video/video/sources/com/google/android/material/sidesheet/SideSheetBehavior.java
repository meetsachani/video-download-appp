package com.google.android.material.sidesheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;
import o.AbstractC5247b62;
import o.AbstractC8911q42;
import o.C10861y4;
import o.C4297Tc1;
import o.C4394Uc1;
import o.C4889Zc1;
import o.C5600ca;
import o.C6516gH2;
import o.C7025iN1;
import o.C7729lH2;
import o.C8055mZ0;
import o.C8827pk;
import o.C9293rd1;
import o.C9646t42;
import o.G4;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8424o42;
import o.J;
import o.KE0;
import o.MU1;
import o.O22;
import o.PL0;
import o.UE;

/* loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements InterfaceC8424o42<AbstractC5247b62> {
    public static final int v1 = 500;
    public static final float w1 = 0.5f;
    public static final float x1 = 0.1f;
    public static final int y1 = -1;
    public AbstractC8911q42 X;
    public float Y;
    @InterfaceC11300zs1
    public ColorStateList Y0;
    @InterfaceC11300zs1
    public C4394Uc1 Z;
    public O22 Z0;
    public final SideSheetBehavior<V>.d a1;
    public float b1;
    public boolean c1;
    public int d1;
    public int e1;
    @InterfaceC11300zs1
    public C7729lH2 f1;
    public boolean g1;
    public float h1;
    public int i1;
    public int j1;
    public int k1;
    public int l1;
    @InterfaceC11300zs1
    public WeakReference<V> m1;
    @InterfaceC11300zs1
    public WeakReference<View> n1;
    @PL0
    public int o1;
    @InterfaceC11300zs1
    public VelocityTracker p1;
    @InterfaceC11300zs1
    public C4889Zc1 q1;
    public int r1;
    @InterfaceC5670cr1
    public final Set<AbstractC5247b62> s1;
    public final C7729lH2.c t1;
    public static final int u1 = C7025iN1.m.side_sheet_accessibility_pane_title;
    public static final int z1 = C7025iN1.n.Widget_Material3_SideSheet;

    /* loaded from: classes3.dex */
    public class a extends C7729lH2.c {
        public a() {
        }

        @Override // o.C7729lH2.c
        public int a(@InterfaceC5670cr1 View view, int i, int i2) {
            return C9293rd1.e(i, SideSheetBehavior.this.X.g(), SideSheetBehavior.this.X.f());
        }

        @Override // o.C7729lH2.c
        public int b(@InterfaceC5670cr1 View view, int i, int i2) {
            return view.getTop();
        }

        @Override // o.C7729lH2.c
        public int d(@InterfaceC5670cr1 View view) {
            return SideSheetBehavior.this.i1 + SideSheetBehavior.this.t0();
        }

        @Override // o.C7729lH2.c
        public void j(int i) {
            if (i == 1 && SideSheetBehavior.this.c1) {
                SideSheetBehavior.this.V0(1);
            }
        }

        @Override // o.C7729lH2.c
        public void k(@InterfaceC5670cr1 View view, int i, int i2, int i3, int i4) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View o0 = SideSheetBehavior.this.o0();
            if (o0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) o0.getLayoutParams()) != null) {
                SideSheetBehavior.this.X.p(marginLayoutParams, view.getLeft(), view.getRight());
                o0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.g0(view, i);
        }

        @Override // o.C7729lH2.c
        public void l(@InterfaceC5670cr1 View view, float f, float f2) {
            int c0 = SideSheetBehavior.this.c0(view, f, f2);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.a1(view, c0, sideSheetBehavior.Z0());
        }

        @Override // o.C7729lH2.c
        public boolean m(@InterfaceC5670cr1 View view, int i) {
            if (SideSheetBehavior.this.d1 == 1 || SideSheetBehavior.this.m1 == null || SideSheetBehavior.this.m1.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.V0(5);
            if (SideSheetBehavior.this.m1 != null && SideSheetBehavior.this.m1.get() != null) {
                ((View) SideSheetBehavior.this.m1.get()).requestLayout();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends J {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public final int Z;

        /* loaded from: classes3.dex */
        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            @InterfaceC11300zs1
            /* renamed from: a */
            public c createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @InterfaceC5670cr1
            /* renamed from: b */
            public c createFromParcel(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @InterfaceC5670cr1
            /* renamed from: c */
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(@InterfaceC5670cr1 Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.Z);
        }

        public c(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = parcel.readInt();
        }

        public c(Parcelable parcelable, @InterfaceC5670cr1 SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.Z = sideSheetBehavior.d1;
        }
    }

    /* loaded from: classes3.dex */
    public class d {
        public int a;
        public boolean b;
        public final Runnable c = new Runnable() { // from class: o.a62
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.d.a(SideSheetBehavior.d.this);
            }
        };

        public d() {
        }

        public static /* synthetic */ void a(d dVar) {
            dVar.b = false;
            if (SideSheetBehavior.this.f1 != null && SideSheetBehavior.this.f1.o(true)) {
                dVar.b(dVar.a);
            } else if (SideSheetBehavior.this.d1 == 2) {
                SideSheetBehavior.this.V0(dVar.a);
            }
        }

        public void b(int i) {
            if (SideSheetBehavior.this.m1 != null && SideSheetBehavior.this.m1.get() != null) {
                this.a = i;
                if (!this.b) {
                    ((View) SideSheetBehavior.this.m1.get()).postOnAnimation(this.c);
                    this.b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
        this.a1 = new d();
        this.c1 = true;
        this.d1 = 5;
        this.e1 = 5;
        this.h1 = 0.1f;
        this.o1 = -1;
        this.s1 = new LinkedHashSet();
        this.t1 = new a();
    }

    private void M0(V v, C10861y4.a aVar, int i) {
        C6516gH2.B1(v, aVar, null, e0(i));
    }

    public static /* synthetic */ boolean N(SideSheetBehavior sideSheetBehavior, int i, View view, G4.a aVar) {
        sideSheetBehavior.c(i);
        return true;
    }

    public static /* synthetic */ void O(SideSheetBehavior sideSheetBehavior, int i) {
        V v = sideSheetBehavior.m1.get();
        if (v != null) {
            sideSheetBehavior.a1(v, i, false);
        }
    }

    private void O0(@InterfaceC5670cr1 V v, Runnable runnable) {
        if (I0(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static /* synthetic */ void P(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.X.o(marginLayoutParams, C5600ca.c(i, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    private void T0(int i) {
        AbstractC8911q42 abstractC8911q42 = this.X;
        if (abstractC8911q42 == null || abstractC8911q42.j() != i) {
            if (i == 0) {
                this.X = new MU1(this);
                if (this.Z0 != null && !D0()) {
                    O22.b w = this.Z0.w();
                    w.P(0.0f).C(0.0f);
                    d1(w.m());
                }
            } else if (i == 1) {
                this.X = new C8055mZ0(this);
                if (this.Z0 != null && !C0()) {
                    O22.b w2 = this.Z0.w();
                    w2.K(0.0f).x(0.0f);
                    d1(w2.m());
                }
            } else {
                throw new IllegalArgumentException("Invalid sheet edge position value: " + i + ". Must be 0 or 1" + UE.h);
            }
        }
    }

    private boolean W0() {
        if (this.f1 != null) {
            if (this.c1 || this.d1 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1(View view, int i, boolean z) {
        if (J0(view, i, z)) {
            V0(2);
            this.a1.b(i);
            return;
        }
        V0(i);
    }

    private void b1() {
        V v;
        WeakReference<V> weakReference = this.m1;
        if (weakReference != null && (v = weakReference.get()) != null) {
            C6516gH2.y1(v, 262144);
            C6516gH2.y1(v, 1048576);
            if (this.d1 != 5) {
                M0(v, C10861y4.a.z, 5);
            }
            if (this.d1 != 3) {
                M0(v, C10861y4.a.x, 3);
            }
        }
    }

    private G4 e0(final int i) {
        return new G4() { // from class: o.Y52
            @Override // o.G4
            public final boolean a(View view, G4.a aVar) {
                return SideSheetBehavior.N(SideSheetBehavior.this, i, view, aVar);
            }
        };
    }

    private void f0(@InterfaceC5670cr1 Context context) {
        if (this.Z0 == null) {
            return;
        }
        C4394Uc1 c4394Uc1 = new C4394Uc1(this.Z0);
        this.Z = c4394Uc1;
        c4394Uc1.i0(context);
        ColorStateList colorStateList = this.Y0;
        if (colorStateList != null) {
            this.Z.y0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.Z.setTint(typedValue.data);
    }

    @InterfaceC5670cr1
    public static <V extends View> SideSheetBehavior<V> j0(@InterfaceC5670cr1 V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.g) {
            CoordinatorLayout.c f = ((CoordinatorLayout.g) layoutParams).f();
            if (f instanceof SideSheetBehavior) {
                return (SideSheetBehavior) f;
            }
            throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private int l0(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    @InterfaceC11300zs1
    public final CoordinatorLayout.g A0() {
        V v;
        WeakReference<V> weakReference = this.m1;
        if (weakReference != null && (v = weakReference.get()) != null && (v.getLayoutParams() instanceof CoordinatorLayout.g)) {
            return (CoordinatorLayout.g) v.getLayoutParams();
        }
        return null;
    }

    public float B0() {
        VelocityTracker velocityTracker = this.p1;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.Y);
        return this.p1.getXVelocity();
    }

    public final boolean C0() {
        CoordinatorLayout.g A0 = A0();
        if (A0 != null && ((ViewGroup.MarginLayoutParams) A0).leftMargin > 0) {
            return true;
        }
        return false;
    }

    public final boolean D0() {
        CoordinatorLayout.g A0 = A0();
        if (A0 != null && ((ViewGroup.MarginLayoutParams) A0).rightMargin > 0) {
            return true;
        }
        return false;
    }

    public void E0() {
        c(5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void F(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 Parcelable parcelable) {
        c cVar = (c) parcelable;
        if (cVar.a() != null) {
            super.F(coordinatorLayout, v, cVar.a());
        }
        int i = cVar.Z;
        i = (i == 1 || i == 2) ? 5 : 5;
        this.d1 = i;
        this.e1 = i;
    }

    public boolean F0() {
        return this.c1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @InterfaceC5670cr1
    public Parcelable G(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v) {
        return new c(super.G(coordinatorLayout, v), (SideSheetBehavior<?>) this);
    }

    public final boolean G0(@InterfaceC5670cr1 MotionEvent motionEvent) {
        if (!W0() || b0(this.r1, motionEvent.getX()) <= this.f1.E()) {
            return false;
        }
        return true;
    }

    public final boolean H0(float f) {
        return this.X.k(f);
    }

    public final boolean I0(@InterfaceC5670cr1 V v) {
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && v.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    public final boolean J0(View view, int i, boolean z) {
        int v0 = v0(i);
        C7729lH2 z0 = z0();
        if (z0 != null) {
            if (z) {
                if (z0.V(v0, view.getTop())) {
                    return true;
                }
                return false;
            } else if (z0.X(view, v0, view.getTop())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final void K0(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout) {
        int i;
        View findViewById;
        if (this.n1 == null && (i = this.o1) != -1 && (findViewById = coordinatorLayout.findViewById(i)) != null) {
            this.n1 = new WeakReference<>(findViewById);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean L(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.d1 == 1 && actionMasked == 0) {
            return true;
        }
        if (W0()) {
            this.f1.M(motionEvent);
        }
        if (actionMasked == 0) {
            N0();
        }
        if (this.p1 == null) {
            this.p1 = VelocityTracker.obtain();
        }
        this.p1.addMovement(motionEvent);
        if (W0() && actionMasked == 2 && !this.g1 && G0(motionEvent)) {
            this.f1.d(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.g1;
    }

    @Override // o.InterfaceC8424o42
    /* renamed from: L0 */
    public void a(@InterfaceC5670cr1 AbstractC5247b62 abstractC5247b62) {
        this.s1.remove(abstractC5247b62);
    }

    public final void N0() {
        VelocityTracker velocityTracker = this.p1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.p1 = null;
        }
    }

    public void P0(@InterfaceC11300zs1 View view) {
        this.o1 = -1;
        if (view == null) {
            d0();
            return;
        }
        this.n1 = new WeakReference<>(view);
        WeakReference<V> weakReference = this.m1;
        if (weakReference != null) {
            V v = weakReference.get();
            if (v.isLaidOut()) {
                v.requestLayout();
            }
        }
    }

    public void Q0(@PL0 int i) {
        this.o1 = i;
        d0();
        WeakReference<V> weakReference = this.m1;
        if (weakReference != null) {
            V v = weakReference.get();
            if (i != -1 && v.isLaidOut()) {
                v.requestLayout();
            }
        }
    }

    public void R0(boolean z) {
        this.c1 = z;
    }

    public void S0(float f) {
        this.h1 = f;
    }

    public final void U0(@InterfaceC5670cr1 V v, int i) {
        int i2;
        if (Gravity.getAbsoluteGravity(((CoordinatorLayout.g) v.getLayoutParams()).c, i) == 3) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        T0(i2);
    }

    public void V0(int i) {
        V v;
        if (this.d1 != i) {
            this.d1 = i;
            if (i == 3 || i == 5) {
                this.e1 = i;
            }
            WeakReference<V> weakReference = this.m1;
            if (weakReference == null || (v = weakReference.get()) == null) {
                return;
            }
            e1(v);
            for (AbstractC5247b62 abstractC5247b62 : this.s1) {
                abstractC5247b62.a(v, i);
            }
            b1();
        }
    }

    public boolean X0(@InterfaceC5670cr1 View view, float f) {
        return this.X.n(view, f);
    }

    public final boolean Y0(@InterfaceC5670cr1 V v) {
        if ((v.isShown() || C6516gH2.L(v) != null) && this.c1) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC8424o42
    /* renamed from: Z */
    public void g(@InterfaceC5670cr1 AbstractC5247b62 abstractC5247b62) {
        this.s1.add(abstractC5247b62);
    }

    @HT1({HT1.a.Y})
    public boolean Z0() {
        return true;
    }

    public final int a0(int i, V v) {
        int i2 = this.d1;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 == 5) {
                    return this.X.e();
                }
                throw new IllegalStateException("Unexpected value: " + this.d1);
            }
            return 0;
        }
        return i - this.X.h(v);
    }

    @Override // o.InterfaceC5015a91
    public void b() {
        C4889Zc1 c4889Zc1 = this.q1;
        if (c4889Zc1 == null) {
            return;
        }
        c4889Zc1.f();
    }

    public final float b0(float f, float f2) {
        return Math.abs(f - f2);
    }

    @Override // o.InterfaceC8424o42
    public void c(final int i) {
        String str;
        if (i != 1 && i != 2) {
            WeakReference<V> weakReference = this.m1;
            if (weakReference != null && weakReference.get() != null) {
                O0(this.m1.get(), new Runnable() { // from class: o.X52
                    @Override // java.lang.Runnable
                    public final void run() {
                        SideSheetBehavior.O(SideSheetBehavior.this, i);
                    }
                });
                return;
            } else {
                V0(i);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("STATE_");
        if (i == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        sb.append(str);
        sb.append(" should not be set externally.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final int c0(@InterfaceC5670cr1 View view, float f, float f2) {
        if (H0(f)) {
            return 3;
        }
        if (X0(view, f)) {
            if (!this.X.m(f, f2) && !this.X.l(view)) {
                return 3;
            }
            return 5;
        } else if (f != 0.0f && C9646t42.a(f, f2)) {
            return 5;
        } else {
            int left = view.getLeft();
            if (Math.abs(left - p0()) < Math.abs(left - this.X.e())) {
                return 3;
            }
            return 5;
        }
    }

    public final void c1() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.m1;
        if (weakReference != null && weakReference.get() != null) {
            V v = this.m1.get();
            View o0 = o0();
            if (o0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) o0.getLayoutParams()) != null) {
                this.X.o(marginLayoutParams, (int) ((this.i1 * v.getScaleX()) + this.l1));
                o0.requestLayout();
            }
        }
    }

    @Override // o.InterfaceC5015a91
    public void d(@InterfaceC5670cr1 C8827pk c8827pk) {
        C4889Zc1 c4889Zc1 = this.q1;
        if (c4889Zc1 == null) {
            return;
        }
        c4889Zc1.j(c8827pk);
    }

    public final void d0() {
        WeakReference<View> weakReference = this.n1;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.n1 = null;
    }

    public final void d1(@InterfaceC5670cr1 O22 o22) {
        C4394Uc1 c4394Uc1 = this.Z;
        if (c4394Uc1 != null) {
            c4394Uc1.setShapeAppearanceModel(o22);
        }
    }

    @Override // o.InterfaceC5015a91
    public void e(@InterfaceC5670cr1 C8827pk c8827pk) {
        C4889Zc1 c4889Zc1 = this.q1;
        if (c4889Zc1 == null) {
            return;
        }
        c4889Zc1.l(c8827pk, q0());
        c1();
    }

    public final void e1(@InterfaceC5670cr1 View view) {
        int i;
        if (this.d1 == 5) {
            i = 4;
        } else {
            i = 0;
        }
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    @Override // o.InterfaceC5015a91
    public void f() {
        C4889Zc1 c4889Zc1 = this.q1;
        if (c4889Zc1 == null) {
            return;
        }
        C8827pk c2 = c4889Zc1.c();
        if (c2 != null && Build.VERSION.SDK_INT >= 34) {
            this.q1.h(c2, q0(), new b(), n0());
        } else {
            c(5);
        }
    }

    public final void g0(@InterfaceC5670cr1 View view, int i) {
        if (!this.s1.isEmpty()) {
            float b2 = this.X.b(i);
            for (AbstractC5247b62 abstractC5247b62 : this.s1) {
                abstractC5247b62.b(view, b2);
            }
        }
    }

    @Override // o.InterfaceC8424o42
    public int getState() {
        return this.d1;
    }

    public final void h0(View view) {
        if (C6516gH2.L(view) == null) {
            C6516gH2.L1(view, view.getResources().getString(u1));
        }
    }

    public void i0() {
        c(3);
    }

    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public C4889Zc1 k0() {
        return this.q1;
    }

    public int m0() {
        return this.i1;
    }

    @InterfaceC11300zs1
    public final ValueAnimator.AnimatorUpdateListener n0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View o0 = o0();
        if (o0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) o0.getLayoutParams()) == null) {
            return null;
        }
        final int c2 = this.X.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: o.Z52
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.P(SideSheetBehavior.this, marginLayoutParams, c2, o0, valueAnimator);
            }
        };
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void o(@InterfaceC5670cr1 CoordinatorLayout.g gVar) {
        super.o(gVar);
        this.m1 = null;
        this.f1 = null;
        this.q1 = null;
    }

    @InterfaceC11300zs1
    public View o0() {
        WeakReference<View> weakReference = this.n1;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int p0() {
        return this.X.d();
    }

    @KE0
    public final int q0() {
        AbstractC8911q42 abstractC8911q42 = this.X;
        if (abstractC8911q42 == null || abstractC8911q42.j() == 0) {
            return 5;
        }
        return 3;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r() {
        super.r();
        this.m1 = null;
        this.f1 = null;
        this.q1 = null;
    }

    public float r0() {
        return this.h1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 MotionEvent motionEvent) {
        C7729lH2 c7729lH2;
        if (!Y0(v)) {
            this.g1 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            N0();
        }
        if (this.p1 == null) {
            this.p1 = VelocityTracker.obtain();
        }
        this.p1.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.g1) {
                this.g1 = false;
                return false;
            }
        } else {
            this.r1 = (int) motionEvent.getX();
        }
        if (!this.g1 && (c7729lH2 = this.f1) != null && c7729lH2.W(motionEvent)) {
            return true;
        }
        return false;
    }

    public float s0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean t(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, int i) {
        int i2;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.m1 == null) {
            this.m1 = new WeakReference<>(v);
            this.q1 = new C4889Zc1(v);
            C4394Uc1 c4394Uc1 = this.Z;
            if (c4394Uc1 != null) {
                v.setBackground(c4394Uc1);
                C4394Uc1 c4394Uc12 = this.Z;
                float f = this.b1;
                if (f == -1.0f) {
                    f = v.getElevation();
                }
                c4394Uc12.x0(f);
            } else {
                ColorStateList colorStateList = this.Y0;
                if (colorStateList != null) {
                    C6516gH2.R1(v, colorStateList);
                }
            }
            e1(v);
            b1();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
            h0(v);
        }
        U0(v, i);
        if (this.f1 == null) {
            this.f1 = C7729lH2.q(coordinatorLayout, this.t1);
        }
        int h = this.X.h(v);
        coordinatorLayout.N(v, i);
        this.j1 = coordinatorLayout.getWidth();
        this.k1 = this.X.i(coordinatorLayout);
        this.i1 = v.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        if (marginLayoutParams != null) {
            i2 = this.X.a(marginLayoutParams);
        } else {
            i2 = 0;
        }
        this.l1 = i2;
        C6516gH2.j1(v, a0(h, v));
        K0(coordinatorLayout);
        for (AbstractC5247b62 abstractC5247b62 : this.s1) {
            if (abstractC5247b62 instanceof AbstractC5247b62) {
                abstractC5247b62.c(v);
            }
        }
        return true;
    }

    public int t0() {
        return this.l1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean u(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(l0(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, -1, marginLayoutParams.width), l0(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, -1, marginLayoutParams.height));
        return true;
    }

    @HT1({HT1.a.Y})
    public int u0() {
        return this.e1;
    }

    public int v0(int i) {
        if (i != 3) {
            if (i == 5) {
                return this.X.e();
            }
            throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i);
        }
        return p0();
    }

    public int w0() {
        return this.k1;
    }

    public int x0() {
        return this.j1;
    }

    public int y0() {
        return 500;
    }

    @InterfaceC11300zs1
    public C7729lH2 z0() {
        return this.f1;
    }

    public SideSheetBehavior(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a1 = new d();
        this.c1 = true;
        this.d1 = 5;
        this.e1 = 5;
        this.h1 = 0.1f;
        this.o1 = -1;
        this.s1 = new LinkedHashSet();
        this.t1 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7025iN1.o.hb);
        int i = C7025iN1.o.lb;
        if (obtainStyledAttributes.hasValue(i)) {
            this.Y0 = C4297Tc1.a(context, obtainStyledAttributes, i);
        }
        if (obtainStyledAttributes.hasValue(C7025iN1.o.ob)) {
            this.Z0 = O22.e(context, attributeSet, 0, z1).m();
        }
        int i2 = C7025iN1.o.nb;
        if (obtainStyledAttributes.hasValue(i2)) {
            Q0(obtainStyledAttributes.getResourceId(i2, -1));
        }
        f0(context);
        this.b1 = obtainStyledAttributes.getDimension(C7025iN1.o.kb, -1.0f);
        R0(obtainStyledAttributes.getBoolean(C7025iN1.o.mb, true));
        obtainStyledAttributes.recycle();
        this.Y = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
