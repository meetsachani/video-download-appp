package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.C10861y4;
import o.C10920yI2;
import o.C4297Tc1;
import o.C4394Uc1;
import o.C5418bp;
import o.C5660cp;
import o.C5985e91;
import o.C6516gH2;
import o.C7025iN1;
import o.C7729lH2;
import o.C8827pk;
import o.C9246rQ0;
import o.C9293rd1;
import o.C9489sQ0;
import o.ES1;
import o.G4;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC2501Av0;
import o.InterfaceC3329Je2;
import o.InterfaceC5015a91;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.J;
import o.O22;
import o.PK1;
import o.RL2;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements InterfaceC5015a91 {
    public static final int A2 = -1;
    @InterfaceC5056aJ2
    public static final int B2 = 1;
    public static final int C2 = C7025iN1.n.Widget_Design_BottomSheet_Modal;
    public static final int g2 = 1;
    public static final int h2 = 2;
    public static final int i2 = 3;
    public static final int j2 = 4;
    public static final int k2 = 5;
    public static final int l2 = 6;
    public static final int m2 = -1;
    public static final int n2 = 1;
    public static final int o2 = 2;
    public static final int p2 = 4;
    public static final int q2 = 8;
    public static final int r2 = -1;
    public static final int s2 = 0;
    public static final String t2 = "BottomSheetBehavior";
    @InterfaceC5056aJ2
    public static final int u2 = 500;
    public static final float v2 = 0.5f;
    public static final float w2 = 0.1f;
    public static final int x2 = 500;
    public static final int y2 = -1;
    public static final int z2 = 0;
    public int A1;
    public float B1;
    public int C1;
    public float D1;
    public boolean E1;
    public boolean F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public int J1;
    public int K1;
    @InterfaceC11300zs1
    public C7729lH2 L1;
    public boolean M1;
    public int N1;
    public boolean O1;
    public float P1;
    public int Q1;
    public int R1;
    public int S1;
    @InterfaceC11300zs1
    public WeakReference<V> T1;
    @InterfaceC11300zs1
    public WeakReference<View> U1;
    @InterfaceC11300zs1
    public WeakReference<View> V1;
    @InterfaceC11300zs1
    public WeakReference<View> W1;
    public int X;
    @InterfaceC5670cr1
    public final ArrayList<g> X1;
    public boolean Y;
    public float Y0;
    @InterfaceC11300zs1
    public VelocityTracker Y1;
    public boolean Z;
    public int Z0;
    @InterfaceC11300zs1
    public C5985e91 Z1;
    public int a1;
    public int a2;
    public boolean b1;
    public int b2;
    public int c1;
    public boolean c2;
    public int d1;
    @InterfaceC11300zs1
    public Map<View, Integer> d2;
    public C4394Uc1 e1;
    @InterfaceC5056aJ2
    public final SparseIntArray e2;
    @InterfaceC11300zs1
    public ColorStateList f1;
    public final C7729lH2.c f2;
    public int g1;
    public int h1;
    public int i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public int r1;
    public int s1;
    public boolean t1;
    public O22 u1;
    public boolean v1;
    public final BottomSheetBehavior<V>.l w1;
    @InterfaceC11300zs1
    public ValueAnimator x1;
    public int y1;
    public int z1;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ View X;
        public final /* synthetic */ int Y;

        public a(View view, int i) {
            this.X = view;
            this.Y = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.I1(this.X, this.Y, false);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.A1(5);
            WeakReference<V> weakReference = BottomSheetBehavior.this.T1;
            if (weakReference != null && weakReference.get() != null) {
                BottomSheetBehavior.this.T1.get().requestLayout();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@InterfaceC5670cr1 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.e1 != null) {
                BottomSheetBehavior.this.e1.z0(floatValue);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements C10920yI2.e {
        public final /* synthetic */ boolean a;

        public d(boolean z) {
            this.a = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
        @Override // o.C10920yI2.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RL2 a(View view, RL2 rl2, C10920yI2.f fVar) {
            boolean z;
            int i;
            int i2;
            C9246rQ0 f = rl2.f(RL2.p.i());
            C9246rQ0 f2 = rl2.f(RL2.p.f());
            BottomSheetBehavior.this.s1 = f.b;
            boolean s = C10920yI2.s(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.k1) {
                BottomSheetBehavior.this.r1 = rl2.o();
                paddingBottom = fVar.d + BottomSheetBehavior.this.r1;
            }
            if (BottomSheetBehavior.this.l1) {
                if (s) {
                    i2 = fVar.c;
                } else {
                    i2 = fVar.a;
                }
                paddingLeft = i2 + f.a;
            }
            if (BottomSheetBehavior.this.m1) {
                if (s) {
                    i = fVar.a;
                } else {
                    i = fVar.c;
                }
                paddingRight = i + f.c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z2 = true;
            if (BottomSheetBehavior.this.o1) {
                int i3 = marginLayoutParams.leftMargin;
                int i4 = f.a;
                if (i3 != i4) {
                    marginLayoutParams.leftMargin = i4;
                    z = true;
                    if (BottomSheetBehavior.this.p1) {
                        int i5 = marginLayoutParams.rightMargin;
                        int i6 = f.c;
                        if (i5 != i6) {
                            marginLayoutParams.rightMargin = i6;
                            z = true;
                        }
                    }
                    if (BottomSheetBehavior.this.q1) {
                        int i7 = marginLayoutParams.topMargin;
                        int i8 = f.b;
                        if (i7 != i8) {
                            marginLayoutParams.topMargin = i8;
                            if (z2) {
                                view.setLayoutParams(marginLayoutParams);
                            }
                            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                            if (this.a) {
                                BottomSheetBehavior.this.i1 = f2.d;
                            }
                            if (!BottomSheetBehavior.this.k1 || this.a) {
                                BottomSheetBehavior.this.N1(false);
                                return rl2;
                            }
                            return rl2;
                        }
                    }
                    z2 = z;
                    if (z2) {
                    }
                    view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                    if (this.a) {
                    }
                    if (!BottomSheetBehavior.this.k1) {
                    }
                    BottomSheetBehavior.this.N1(false);
                    return rl2;
                }
            }
            z = false;
            if (BottomSheetBehavior.this.p1) {
            }
            if (BottomSheetBehavior.this.q1) {
            }
            z2 = z;
            if (z2) {
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.a) {
            }
            if (!BottomSheetBehavior.this.k1) {
            }
            BottomSheetBehavior.this.N1(false);
            return rl2;
        }
    }

    /* loaded from: classes3.dex */
    public class e extends C7729lH2.c {
        public long a;

        public e() {
        }

        @Override // o.C7729lH2.c
        public int a(@InterfaceC5670cr1 View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // o.C7729lH2.c
        public int b(@InterfaceC5670cr1 View view, int i, int i2) {
            return C9293rd1.e(i, BottomSheetBehavior.this.A0(), e(view));
        }

        @Override // o.C7729lH2.c
        public int e(@InterfaceC5670cr1 View view) {
            if (BottomSheetBehavior.this.p0()) {
                return BottomSheetBehavior.this.S1;
            }
            return BottomSheetBehavior.this.C1;
        }

        @Override // o.C7729lH2.c
        public void j(int i) {
            if (i == 1 && BottomSheetBehavior.this.G1) {
                BottomSheetBehavior.this.A1(1);
            }
        }

        @Override // o.C7729lH2.c
        public void k(@InterfaceC5670cr1 View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.v0(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r7.b.D1(r0, (r9 * 100.0f) / r10.S1) != false) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
            if (r9 > r7.b.A1) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.b.A0()) < java.lang.Math.abs(r8.getTop() - r7.b.A1)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
            if (r7.b.G1() == false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
            if (java.lang.Math.abs(r9 - r7.b.z1) < java.lang.Math.abs(r9 - r7.b.C1)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x010d, code lost:
            if (r7.b.G1() != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0127, code lost:
            if (r7.b.G1() == false) goto L6;
         */
        @Override // o.C7729lH2.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void l(@InterfaceC5670cr1 View view, float f, float f2) {
            int i = 6;
            if (f2 < 0.0f) {
                if (!BottomSheetBehavior.this.Y) {
                    int top = view.getTop();
                    long uptimeMillis = SystemClock.uptimeMillis() - this.a;
                    if (BottomSheetBehavior.this.G1()) {
                    }
                }
                i = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.E1 && bottomSheetBehavior.F1(view, f2)) {
                    if ((Math.abs(f) < Math.abs(f2) && f2 > BottomSheetBehavior.this.Z0) || n(view)) {
                        i = 5;
                    } else {
                        if (!BottomSheetBehavior.this.Y) {
                        }
                        i = 3;
                    }
                } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                    if (!BottomSheetBehavior.this.Y) {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.A1) < Math.abs(top2 - BottomSheetBehavior.this.C1)) {
                        }
                    }
                    i = 4;
                } else {
                    int top3 = view.getTop();
                    if (!BottomSheetBehavior.this.Y) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i2 = bottomSheetBehavior2.A1;
                        if (top3 < i2) {
                            if (top3 >= Math.abs(top3 - bottomSheetBehavior2.C1)) {
                            }
                            i = 3;
                        } else {
                            if (Math.abs(top3 - i2) < Math.abs(top3 - BottomSheetBehavior.this.C1)) {
                            }
                            i = 4;
                        }
                    }
                }
            }
            BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
            bottomSheetBehavior3.I1(view, i, bottomSheetBehavior3.H1());
        }

        @Override // o.C7729lH2.c
        public boolean m(@InterfaceC5670cr1 View view, int i) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.J1;
            if (i2 == 1 || bottomSheetBehavior.c2) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.a2 == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.W1;
                if (weakReference != null) {
                    view2 = weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.a = SystemClock.uptimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.T1;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }

        public final boolean n(@InterfaceC5670cr1 View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (top > (bottomSheetBehavior.S1 + bottomSheetBehavior.A0()) / 2) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public class f implements G4 {
        public final /* synthetic */ int a;

        public f(int i) {
            this.a = i;
        }

        @Override // o.G4
        public boolean a(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 G4.a aVar) {
            BottomSheetBehavior.this.c(this.a);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class g {
        public void a(@InterfaceC5670cr1 View view) {
        }

        public abstract void b(@InterfaceC5670cr1 View view, float f);

        public abstract void c(@InterfaceC5670cr1 View view, int i);
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface h {
    }

    /* loaded from: classes3.dex */
    public static class i extends J {
        public static final Parcelable.Creator<i> CREATOR = new a();
        public int Y0;
        public final int Z;
        public boolean Z0;
        public boolean a1;
        public boolean b1;

        /* loaded from: classes3.dex */
        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.Creator
            @InterfaceC11300zs1
            /* renamed from: a */
            public i createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
                return new i(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @InterfaceC5670cr1
            /* renamed from: b */
            public i createFromParcel(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @InterfaceC5670cr1
            /* renamed from: c */
            public i[] newArray(int i) {
                return new i[i];
            }
        }

        public i(@InterfaceC5670cr1 Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.Z);
            parcel.writeInt(this.Y0);
            parcel.writeInt(this.Z0 ? 1 : 0);
            parcel.writeInt(this.a1 ? 1 : 0);
            parcel.writeInt(this.b1 ? 1 : 0);
        }

        public i(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = parcel.readInt();
            this.Y0 = parcel.readInt();
            this.Z0 = parcel.readInt() == 1;
            this.a1 = parcel.readInt() == 1;
            this.b1 = parcel.readInt() == 1;
        }

        public i(Parcelable parcelable, @InterfaceC5670cr1 BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.Z = bottomSheetBehavior.J1;
            this.Y0 = bottomSheetBehavior.a1;
            this.Z0 = bottomSheetBehavior.Y;
            this.a1 = bottomSheetBehavior.E1;
            this.b1 = bottomSheetBehavior.F1;
        }

        @Deprecated
        public i(Parcelable parcelable, int i) {
            super(parcelable);
            this.Z = i;
        }
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface j {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface k {
    }

    public BottomSheetBehavior() {
        this.X = 0;
        this.Y = true;
        this.Z = false;
        this.g1 = -1;
        this.h1 = -1;
        this.w1 = new l(this, null);
        this.B1 = 0.5f;
        this.D1 = -1.0f;
        this.G1 = true;
        this.H1 = true;
        this.J1 = 4;
        this.K1 = 4;
        this.P1 = 0.1f;
        this.X1 = new ArrayList<>();
        this.b2 = -1;
        this.e2 = new SparseIntArray();
        this.f2 = new e();
    }

    private void d1() {
        this.a2 = -1;
        this.b2 = -1;
        VelocityTracker velocityTracker = this.Y1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.Y1 = null;
        }
    }

    @InterfaceC5670cr1
    public static <V extends View> BottomSheetBehavior<V> x0(@InterfaceC5670cr1 V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.g) {
            CoordinatorLayout.c f2 = ((CoordinatorLayout.g) layoutParams).f();
            if (f2 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f2;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public int A0() {
        int i3;
        if (this.Y) {
            return this.z1;
        }
        int i4 = this.y1;
        if (this.n1) {
            i3 = 0;
        } else {
            i3 = this.s1;
        }
        return Math.max(i4, i3);
    }

    public void A1(int i3) {
        V v;
        if (this.J1 != i3) {
            this.J1 = i3;
            if (i3 == 4 || i3 == 3 || i3 == 6 || (this.E1 && i3 == 5)) {
                this.K1 = i3;
            }
            WeakReference<V> weakReference = this.T1;
            if (weakReference == null || (v = weakReference.get()) == null) {
                return;
            }
            if (i3 == 3) {
                M1(true);
            } else if (i3 == 6 || i3 == 5 || i3 == 4) {
                M1(false);
            }
            L1(i3, true);
            for (int i4 = 0; i4 < this.X1.size(); i4++) {
                this.X1.get(i4).c(v, i3);
            }
            J1();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 View view, int i3, int i4, int i5, int i6, int i7, @InterfaceC5670cr1 int[] iArr) {
    }

    @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
    public float B0() {
        return this.B1;
    }

    public void B1(boolean z) {
        this.Z = z;
    }

    public float C0() {
        return this.P1;
    }

    public final void C1(@InterfaceC5670cr1 View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 29 && !T0() && !this.b1) {
            z = true;
        } else {
            z = false;
        }
        if (!this.k1 && !this.l1 && !this.m1 && !this.o1 && !this.p1 && !this.q1 && !z) {
            return;
        }
        C10920yI2.h(view, new d(z));
    }

    @HT1({HT1.a.Y})
    public int D0() {
        return this.K1;
    }

    @HT1({HT1.a.Y})
    public boolean D1(long j3, @InterfaceC2501Av0(from = 0.0d, to = 100.0d) float f2) {
        return false;
    }

    public C4394Uc1 E0() {
        return this.e1;
    }

    public final boolean E1() {
        if (this.L1 != null) {
            if (this.G1 || this.J1 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void F(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 Parcelable parcelable) {
        i iVar = (i) parcelable;
        super.F(coordinatorLayout, v, iVar.a());
        e1(iVar);
        int i3 = iVar.Z;
        if (i3 != 1 && i3 != 2) {
            this.J1 = i3;
            this.K1 = i3;
            return;
        }
        this.J1 = 4;
        this.K1 = 4;
    }

    @PK1
    public int F0() {
        return this.h1;
    }

    public boolean F1(@InterfaceC5670cr1 View view, float f2) {
        if (this.F1) {
            return true;
        }
        if (!V0() || view.getTop() < this.C1) {
            return false;
        }
        if (Math.abs((view.getTop() + (f2 * this.P1)) - this.C1) / m0() > 0.5f) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @InterfaceC5670cr1
    public Parcelable G(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v) {
        return new i(super.G(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    @PK1
    public int G0() {
        return this.g1;
    }

    @HT1({HT1.a.Y})
    public boolean G1() {
        return false;
    }

    public int H0() {
        if (this.b1) {
            return -1;
        }
        return this.a1;
    }

    @HT1({HT1.a.Y})
    public boolean H1() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean I(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2, int i3, int i4) {
        this.N1 = 0;
        this.O1 = false;
        if ((i3 & 2) == 0) {
            return false;
        }
        return true;
    }

    @InterfaceC5056aJ2
    public int I0() {
        return this.c1;
    }

    public final void I1(View view, int i3, boolean z) {
        int M0 = M0(i3);
        C7729lH2 c7729lH2 = this.L1;
        if (c7729lH2 != null && (!z ? c7729lH2.X(view, view.getLeft(), M0) : c7729lH2.V(view.getLeft(), M0))) {
            A1(2);
            L1(i3, true);
            this.w1.c(i3);
            return;
        }
        A1(i3);
    }

    public int J0() {
        return this.X;
    }

    public final void J1() {
        WeakReference<V> weakReference = this.T1;
        if (weakReference != null) {
            K1(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.U1;
        if (weakReference2 != null) {
            K1(weakReference2.get(), 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r4.getTop() <= r2.A1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.z1) < java.lang.Math.abs(r3 - r2.C1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
        if (G1() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.C1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.A1) < java.lang.Math.abs(r3 - r2.C1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
        r0 = 6;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void K(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 View view, int i3) {
        WeakReference<View> weakReference;
        int i4 = 3;
        if (v.getTop() == A0()) {
            A1(3);
        } else if (X0() && ((weakReference = this.W1) == null || view != weakReference.get() || !this.O1)) {
        } else {
            if (this.N1 > 0) {
                if (!this.Y) {
                }
                I1(v, i4, false);
                this.O1 = false;
            }
            if (this.E1 && F1(v, N0())) {
                i4 = 5;
            } else if (this.N1 == 0) {
                int top = v.getTop();
                if (!this.Y) {
                    int i5 = this.A1;
                    if (top < i5) {
                        if (top >= Math.abs(top - this.C1)) {
                        }
                    }
                }
            } else {
                if (!this.Y) {
                    int top2 = v.getTop();
                }
                i4 = 4;
            }
            I1(v, i4, false);
            this.O1 = false;
        }
    }

    public int K0() {
        return this.Z0;
    }

    public final void K1(View view, int i3) {
        if (view != null) {
            q0(view, i3);
            int i4 = 6;
            if (!this.Y && this.J1 != 6) {
                this.e2.put(i3, g0(view, C7025iN1.m.bottomsheet_action_expand_halfway, 6));
            }
            if (this.E1 && V0() && this.J1 != 5) {
                c1(view, C10861y4.a.z, 5);
            }
            int i5 = this.J1;
            if (i5 != 3) {
                if (i5 != 4) {
                    if (i5 != 6) {
                        return;
                    }
                    c1(view, C10861y4.a.y, 4);
                    c1(view, C10861y4.a.x, 3);
                    return;
                }
                if (this.Y) {
                    i4 = 3;
                }
                c1(view, C10861y4.a.x, i4);
                return;
            }
            if (this.Y) {
                i4 = 4;
            }
            c1(view, C10861y4.a.y, i4);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean L(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.J1 == 1 && actionMasked == 0) {
            return true;
        }
        if (E1()) {
            this.L1.M(motionEvent);
        }
        if (actionMasked == 0) {
            d1();
        }
        if (this.Y1 == null) {
            this.Y1 = VelocityTracker.obtain();
        }
        this.Y1.addMovement(motionEvent);
        if (E1() && actionMasked == 2 && !this.M1 && Math.abs(this.b2 - motionEvent.getY()) > this.L1.E()) {
            this.L1.d(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.M1;
    }

    public boolean L0() {
        return this.F1;
    }

    public final void L1(int i3, boolean z) {
        boolean R0;
        ValueAnimator valueAnimator;
        if (i3 != 2 && this.v1 != (R0 = R0()) && this.e1 != null) {
            this.v1 = R0;
            float f2 = 1.0f;
            if (z && (valueAnimator = this.x1) != null) {
                if (valueAnimator.isRunning()) {
                    this.x1.reverse();
                    return;
                }
                float H = this.e1.H();
                if (R0) {
                    f2 = l0();
                }
                this.x1.setFloatValues(H, f2);
                this.x1.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.x1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.x1.cancel();
            }
            C4394Uc1 c4394Uc1 = this.e1;
            if (this.v1) {
                f2 = l0();
            }
            c4394Uc1.z0(f2);
        }
    }

    public final int M0(int i3) {
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 5) {
                    if (i3 == 6) {
                        return this.A1;
                    }
                    throw new IllegalArgumentException("Invalid state to get top offset: " + i3);
                }
                return this.S1;
            }
            return this.C1;
        }
        return A0();
    }

    public final void M1(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.T1;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.d2 == null) {
                        this.d2 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    if (childAt != this.T1.get()) {
                        if (z) {
                            this.d2.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.Z) {
                                childAt.setImportantForAccessibility(4);
                            }
                        } else if (this.Z && (map = this.d2) != null && map.containsKey(childAt)) {
                            childAt.setImportantForAccessibility(this.d2.get(childAt).intValue());
                        }
                    }
                }
                if (!z) {
                    this.d2 = null;
                } else if (this.Z) {
                    this.T1.get().sendAccessibilityEvent(8);
                }
            }
        }
    }

    public final float N0() {
        VelocityTracker velocityTracker = this.Y1;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.Y0);
        return this.Y1.getYVelocity(this.a2);
    }

    public final void N1(boolean z) {
        V v;
        if (this.T1 != null) {
            i0();
            if (this.J1 == 4 && (v = this.T1.get()) != null) {
                if (z) {
                    c(4);
                } else {
                    v.requestLayout();
                }
            }
        }
    }

    public final boolean O0() {
        WeakReference<V> weakReference = this.T1;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.T1.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean P0() {
        return this.G1;
    }

    public boolean Q0() {
        return this.H1;
    }

    public final boolean R0() {
        if (this.J1 == 3) {
            if (this.t1 || O0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean S0() {
        return this.Y;
    }

    public boolean T0() {
        return this.j1;
    }

    public boolean U0() {
        return this.E1;
    }

    @HT1({HT1.a.Y})
    public boolean V0() {
        return true;
    }

    public final boolean W0(V v) {
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && v.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    @HT1({HT1.a.Y})
    public boolean X0() {
        return true;
    }

    public boolean Y0() {
        return this.t1;
    }

    public final boolean Z0(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, int i3, int i4) {
        View view;
        WeakReference<View> weakReference = this.V1;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (view != null && coordinatorLayout.G(view, i3, i4)) {
            return true;
        }
        return false;
    }

    public final boolean a1(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, int i3, int i4) {
        View view;
        WeakReference<View> weakReference = this.W1;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (view != null && coordinatorLayout.G(view, i3, i4)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC5015a91
    public void b() {
        C5985e91 c5985e91 = this.Z1;
        if (c5985e91 == null) {
            return;
        }
        c5985e91.f();
    }

    public void b1(@InterfaceC5670cr1 g gVar) {
        this.X1.remove(gVar);
    }

    public void c(int i3) {
        String str;
        int i4;
        if (i3 != 1 && i3 != 2) {
            if (!this.E1 && i3 == 5) {
                Log.w(t2, "Cannot set state: " + i3);
                return;
            }
            if (i3 == 6 && this.Y && M0(i3) <= this.z1) {
                i4 = 3;
            } else {
                i4 = i3;
            }
            WeakReference<V> weakReference = this.T1;
            if (weakReference != null && weakReference.get() != null) {
                V v = this.T1.get();
                f1(v, new a(v, i4));
                return;
            }
            A1(i3);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("STATE_");
        if (i3 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        sb.append(str);
        sb.append(" should not be set externally.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void c1(View view, C10861y4.a aVar, int i3) {
        C6516gH2.B1(view, aVar, null, r0(i3));
    }

    @Override // o.InterfaceC5015a91
    public void d(@InterfaceC5670cr1 C8827pk c8827pk) {
        C5985e91 c5985e91 = this.Z1;
        if (c5985e91 == null) {
            return;
        }
        c5985e91.j(c8827pk);
    }

    @Override // o.InterfaceC5015a91
    public void e(@InterfaceC5670cr1 C8827pk c8827pk) {
        C5985e91 c5985e91 = this.Z1;
        if (c5985e91 == null) {
            return;
        }
        c5985e91.l(c8827pk);
    }

    public final void e1(@InterfaceC5670cr1 i iVar) {
        int i3 = this.X;
        if (i3 != 0) {
            if (i3 == -1 || (i3 & 1) == 1) {
                this.a1 = iVar.Y0;
            }
            if (i3 == -1 || (i3 & 2) == 2) {
                this.Y = iVar.Z0;
            }
            if (i3 == -1 || (i3 & 4) == 4) {
                this.E1 = iVar.a1;
            }
            if (i3 != -1 && (i3 & 8) != 8) {
                return;
            }
            this.F1 = iVar.b1;
        }
    }

    @Override // o.InterfaceC5015a91
    public void f() {
        C5985e91 c5985e91 = this.Z1;
        if (c5985e91 == null) {
            return;
        }
        C8827pk c2 = c5985e91.c();
        int i3 = 4;
        if (c2 != null && Build.VERSION.SDK_INT >= 34) {
            if (this.E1) {
                this.Z1.h(c2, new b());
                return;
            }
            this.Z1.i(c2, null);
            c(4);
            return;
        }
        if (this.E1) {
            i3 = 5;
        }
        c(i3);
    }

    public final void f1(V v, Runnable runnable) {
        if (W0(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    public final int g0(View view, @InterfaceC3329Je2 int i3, int i4) {
        return C6516gH2.c(view, view.getResources().getString(i3), r0(i4));
    }

    public void g1(@InterfaceC11300zs1 View view) {
        WeakReference<View> weakReference;
        if (view == null && (weakReference = this.U1) != null) {
            q0(weakReference.get(), 1);
            this.U1 = null;
            return;
        }
        this.U1 = new WeakReference<>(view);
        K1(view, 1);
    }

    public int getState() {
        return this.J1;
    }

    public void h0(@InterfaceC5670cr1 g gVar) {
        if (!this.X1.contains(gVar)) {
            this.X1.add(gVar);
        }
    }

    @Deprecated
    public void h1(g gVar) {
        Log.w(t2, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.X1.clear();
        if (gVar != null) {
            this.X1.add(gVar);
        }
    }

    public final void i0() {
        int m0 = m0();
        if (this.Y) {
            this.C1 = Math.max(this.S1 - m0, this.z1);
        } else {
            this.C1 = this.S1 - m0;
        }
    }

    public void i1(@InterfaceC11300zs1 com.google.android.material.bottomsheet.c cVar) {
        WeakReference<View> weakReference;
        if (cVar != null) {
            weakReference = new WeakReference<>(cVar);
        } else {
            weakReference = null;
        }
        this.V1 = weakReference;
    }

    @ES1(31)
    public final float j0(float f2, @InterfaceC11300zs1 RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float a2 = C5660cp.a(roundedCorner);
            if (a2 > 0.0f && f2 > 0.0f) {
                return a2 / f2;
            }
        }
        return 0.0f;
    }

    public void j1(boolean z) {
        this.G1 = z;
    }

    public final void k0() {
        this.A1 = (int) (this.S1 * (1.0f - this.B1));
    }

    public void k1(boolean z) {
        this.H1 = z;
    }

    public final float l0() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.e1 != null && (weakReference = this.T1) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            V v = this.T1.get();
            if (O0() && (rootWindowInsets = v.getRootWindowInsets()) != null) {
                return Math.max(j0(this.e1.b0(), C5418bp.a(rootWindowInsets, 0)), j0(this.e1.c0(), C5418bp.a(rootWindowInsets, 1)));
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public void l1(int i3) {
        if (i3 >= 0) {
            this.y1 = i3;
            L1(this.J1, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public final int m0() {
        int i3;
        if (this.b1) {
            return Math.min(Math.max(this.c1, this.S1 - ((this.R1 * 9) / 16)), this.Q1) + this.r1;
        }
        if (!this.j1 && !this.k1 && (i3 = this.i1) > 0) {
            return Math.max(this.a1, i3 + this.d1);
        }
        return this.a1 + this.r1;
    }

    public void m1(boolean z) {
        int i3;
        if (this.Y == z) {
            return;
        }
        this.Y = z;
        if (this.T1 != null) {
            i0();
        }
        if (this.Y && this.J1 == 6) {
            i3 = 3;
        } else {
            i3 = this.J1;
        }
        A1(i3);
        L1(this.J1, true);
        J1();
    }

    public float n0() {
        WeakReference<V> weakReference = this.T1;
        if (weakReference != null && weakReference.get() != null) {
            return o0(this.T1.get().getTop());
        }
        return -1.0f;
    }

    public void n1(boolean z) {
        this.j1 = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void o(@InterfaceC5670cr1 CoordinatorLayout.g gVar) {
        super.o(gVar);
        this.T1 = null;
        this.L1 = null;
        this.Z1 = null;
    }

    public final float o0(int i3) {
        float f2;
        float f3;
        int i4 = this.C1;
        if (i3 <= i4 && i4 != A0()) {
            int i5 = this.C1;
            f2 = i5 - i3;
            f3 = i5 - A0();
        } else {
            int i6 = this.C1;
            f2 = i6 - i3;
            f3 = this.S1 - i6;
        }
        return f2 / f3;
    }

    public void o1(@InterfaceC2501Av0(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f2) {
        if (f2 > 0.0f && f2 < 1.0f) {
            this.B1 = f2;
            if (this.T1 != null) {
                k0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public final boolean p0() {
        if (U0() && V0()) {
            return true;
        }
        return false;
    }

    public void p1(float f2) {
        this.P1 = f2;
    }

    public final void q0(View view, int i3) {
        if (view != null) {
            C6516gH2.y1(view, 524288);
            C6516gH2.y1(view, 262144);
            C6516gH2.y1(view, 1048576);
            int i4 = this.e2.get(i3, -1);
            if (i4 != -1) {
                C6516gH2.y1(view, i4);
                this.e2.delete(i3);
            }
        }
    }

    public void q1(boolean z) {
        if (this.E1 != z) {
            this.E1 = z;
            if (!z && this.J1 == 5) {
                c(4);
            }
            J1();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r() {
        super.r();
        this.T1 = null;
        this.L1 = null;
        this.Z1 = null;
    }

    public final G4 r0(int i3) {
        return new f(i3);
    }

    @HT1({HT1.a.Y})
    public void r1(boolean z) {
        this.E1 = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 MotionEvent motionEvent) {
        boolean z;
        View view;
        int i3;
        C7729lH2 c7729lH2;
        if (v.isShown() && this.G1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                d1();
            }
            if (this.Y1 == null) {
                this.Y1 = VelocityTracker.obtain();
            }
            this.Y1.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.c2 = false;
                    this.a2 = -1;
                    if (this.M1) {
                        this.M1 = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                this.b2 = y;
                if (this.J1 != 2 && a1(coordinatorLayout, x, y)) {
                    this.a2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    if (!Z0(coordinatorLayout, x, this.b2)) {
                        this.c2 = true;
                    }
                }
                if (this.a2 == -1 && !coordinatorLayout.G(v, x, this.b2)) {
                    z = true;
                } else {
                    z = false;
                }
                this.M1 = z;
            }
            if (!this.M1 && (c7729lH2 = this.L1) != null && c7729lH2.W(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference = this.W1;
            if (weakReference != null) {
                view = weakReference.get();
            } else {
                view = null;
            }
            if (actionMasked != 2 || view == null || this.M1 || this.J1 == 1 || coordinatorLayout.G(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.L1 == null || (i3 = this.b2) == -1 || Math.abs(i3 - motionEvent.getY()) <= this.L1.E()) {
                return false;
            }
            return true;
        }
        this.M1 = true;
        return false;
    }

    public final void s0(@InterfaceC5670cr1 Context context) {
        if (this.u1 == null) {
            return;
        }
        C4394Uc1 c4394Uc1 = new C4394Uc1(this.u1);
        this.e1 = c4394Uc1;
        c4394Uc1.i0(context);
        ColorStateList colorStateList = this.f1;
        if (colorStateList != null) {
            this.e1.y0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.e1.setTint(typedValue.data);
    }

    public void s1(@PK1 int i3) {
        this.h1 = i3;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean t(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, int i3) {
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.T1 == null) {
            this.c1 = coordinatorLayout.getResources().getDimensionPixelSize(C7025iN1.f.design_bottom_sheet_peek_height_min);
            C1(v);
            C6516gH2.I2(v, new C9489sQ0(v));
            this.T1 = new WeakReference<>(v);
            this.Z1 = new C5985e91(v);
            C4394Uc1 c4394Uc1 = this.e1;
            if (c4394Uc1 != null) {
                v.setBackground(c4394Uc1);
                C4394Uc1 c4394Uc12 = this.e1;
                float f2 = this.D1;
                if (f2 == -1.0f) {
                    f2 = v.getElevation();
                }
                c4394Uc12.x0(f2);
            } else {
                ColorStateList colorStateList = this.f1;
                if (colorStateList != null) {
                    C6516gH2.R1(v, colorStateList);
                }
            }
            J1();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.L1 == null) {
            this.L1 = C7729lH2.q(coordinatorLayout, this.f2);
        }
        int top = v.getTop();
        coordinatorLayout.N(v, i3);
        this.R1 = coordinatorLayout.getWidth();
        this.S1 = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.Q1 = height;
        int i4 = this.S1;
        int i5 = i4 - height;
        int i6 = this.s1;
        if (i5 < i6) {
            if (this.n1) {
                int i7 = this.h1;
                if (i7 != -1) {
                    i4 = Math.min(i4, i7);
                }
                this.Q1 = i4;
            } else {
                int i8 = i4 - i6;
                int i9 = this.h1;
                if (i9 != -1) {
                    i8 = Math.min(i8, i9);
                }
                this.Q1 = i8;
            }
        }
        this.z1 = Math.max(0, this.S1 - this.Q1);
        k0();
        i0();
        int i10 = this.J1;
        if (i10 == 3) {
            C6516gH2.k1(v, A0());
        } else if (i10 == 6) {
            C6516gH2.k1(v, this.A1);
        } else if (this.E1 && i10 == 5) {
            C6516gH2.k1(v, this.S1);
        } else if (i10 == 4) {
            C6516gH2.k1(v, this.C1);
        } else if (i10 == 1 || i10 == 2) {
            C6516gH2.k1(v, top - v.getTop());
        }
        L1(this.J1, false);
        this.W1 = new WeakReference<>(w0(v));
        for (int i11 = 0; i11 < this.X1.size(); i11++) {
            this.X1.get(i11).a(v);
        }
        return true;
    }

    public final void t0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(l0(), 1.0f);
        this.x1 = ofFloat;
        ofFloat.setDuration(500L);
        this.x1.addUpdateListener(new c());
    }

    public void t1(@PK1 int i3) {
        this.g1 = i3;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean u(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(z0(i3, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, this.g1, marginLayoutParams.width), z0(i5, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, this.h1, marginLayoutParams.height));
        return true;
    }

    @HT1({HT1.a.Y})
    @InterfaceC5056aJ2
    public void u0() {
        this.x1 = null;
    }

    public void u1(int i3) {
        v1(i3, false);
    }

    public void v0(int i3) {
        V v = this.T1.get();
        if (v != null && !this.X1.isEmpty()) {
            float o0 = o0(i3);
            for (int i4 = 0; i4 < this.X1.size(); i4++) {
                this.X1.get(i4).b(v, o0);
            }
        }
    }

    public final void v1(int i3, boolean z) {
        if (i3 == -1) {
            if (!this.b1) {
                this.b1 = true;
            } else {
                return;
            }
        } else if (!this.b1 && this.a1 == i3) {
            return;
        } else {
            this.b1 = false;
            this.a1 = Math.max(0, i3);
        }
        N1(z);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean w(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 View view, float f2, float f3) {
        WeakReference<View> weakReference;
        if (!X0() || (weakReference = this.W1) == null || view != weakReference.get() || ((this.J1 == 3 || this.I1) && !super.w(coordinatorLayout, v, view, f2, f3))) {
            return false;
        }
        return true;
    }

    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public View w0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View w0 = w0(viewGroup.getChildAt(i3));
                if (w0 != null) {
                    return w0;
                }
            }
        }
        return null;
    }

    public void w1(int i3) {
        this.X = i3;
    }

    public void x1(boolean z) {
        if (this.t1 != z) {
            this.t1 = z;
            L1(getState(), true);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void y(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 View view, int i3, int i4, @InterfaceC5670cr1 int[] iArr, int i5) {
        View view2;
        if (i5 != 1) {
            WeakReference<View> weakReference = this.W1;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (!X0() || view == view2) {
                int top = v.getTop();
                int i6 = top - i4;
                if (i4 > 0) {
                    if (!this.O1 && !this.H1 && view == view2 && view.canScrollVertically(1)) {
                        this.I1 = true;
                        return;
                    } else if (i6 < A0()) {
                        int A0 = top - A0();
                        iArr[1] = A0;
                        C6516gH2.k1(v, -A0);
                        A1(3);
                    } else if (this.G1) {
                        iArr[1] = i4;
                        C6516gH2.k1(v, -i4);
                        A1(1);
                    } else {
                        return;
                    }
                } else if (i4 < 0) {
                    boolean canScrollVertically = view.canScrollVertically(-1);
                    if (!this.O1 && !this.H1 && view == view2 && canScrollVertically) {
                        this.I1 = true;
                        return;
                    } else if (!canScrollVertically) {
                        if (i6 > this.C1 && !p0()) {
                            int i7 = top - this.C1;
                            iArr[1] = i7;
                            C6516gH2.k1(v, -i7);
                            A1(4);
                        } else if (!this.G1) {
                            return;
                        } else {
                            iArr[1] = i4;
                            C6516gH2.k1(v, -i4);
                            A1(1);
                        }
                    }
                }
                v0(v.getTop());
                this.N1 = i4;
                this.O1 = true;
                this.I1 = false;
            }
        }
    }

    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public C5985e91 y0() {
        return this.Z1;
    }

    public void y1(int i3) {
        this.Z0 = i3;
    }

    public final int z0(int i3, int i4, int i5, int i6) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, i4, i6);
        if (i5 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i5 = Math.min(size, i5);
            }
            return View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i5), 1073741824);
    }

    public void z1(boolean z) {
        this.F1 = z;
    }

    /* loaded from: classes3.dex */
    public class l {
        public int a;
        public boolean b;
        public final Runnable c;

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l.this.b = false;
                C7729lH2 c7729lH2 = BottomSheetBehavior.this.L1;
                if (c7729lH2 != null && c7729lH2.o(true)) {
                    l lVar = l.this;
                    lVar.c(lVar.a);
                    return;
                }
                l lVar2 = l.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.J1 == 2) {
                    bottomSheetBehavior.A1(lVar2.a);
                }
            }
        }

        public l() {
            this.c = new a();
        }

        public void c(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.T1;
            if (weakReference != null && weakReference.get() != null) {
                this.a = i;
                if (!this.b) {
                    BottomSheetBehavior.this.T1.get().postOnAnimation(this.c);
                    this.b = true;
                }
            }
        }

        public /* synthetic */ l(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public BottomSheetBehavior(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        super(context, attributeSet);
        int i3;
        this.X = 0;
        this.Y = true;
        this.Z = false;
        this.g1 = -1;
        this.h1 = -1;
        this.w1 = new l(this, null);
        this.B1 = 0.5f;
        this.D1 = -1.0f;
        this.G1 = true;
        this.H1 = true;
        this.J1 = 4;
        this.K1 = 4;
        this.P1 = 0.1f;
        this.X1 = new ArrayList<>();
        this.b2 = -1;
        this.e2 = new SparseIntArray();
        this.f2 = new e();
        this.d1 = context.getResources().getDimensionPixelSize(C7025iN1.f.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7025iN1.o.L0);
        int i4 = C7025iN1.o.P0;
        if (obtainStyledAttributes.hasValue(i4)) {
            this.f1 = C4297Tc1.a(context, obtainStyledAttributes, i4);
        }
        if (obtainStyledAttributes.hasValue(C7025iN1.o.i1)) {
            this.u1 = O22.e(context, attributeSet, C7025iN1.c.bottomSheetStyle, C2).m();
        }
        s0(context);
        t0();
        this.D1 = obtainStyledAttributes.getDimension(C7025iN1.o.O0, -1.0f);
        int i5 = C7025iN1.o.M0;
        if (obtainStyledAttributes.hasValue(i5)) {
            t1(obtainStyledAttributes.getDimensionPixelSize(i5, -1));
        }
        int i6 = C7025iN1.o.N0;
        if (obtainStyledAttributes.hasValue(i6)) {
            s1(obtainStyledAttributes.getDimensionPixelSize(i6, -1));
        }
        int i7 = C7025iN1.o.W0;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i7);
        if (peekValue != null && (i3 = peekValue.data) == -1) {
            u1(i3);
        } else {
            u1(obtainStyledAttributes.getDimensionPixelSize(i7, -1));
        }
        q1(obtainStyledAttributes.getBoolean(C7025iN1.o.V0, false));
        n1(obtainStyledAttributes.getBoolean(C7025iN1.o.a1, false));
        m1(obtainStyledAttributes.getBoolean(C7025iN1.o.T0, true));
        z1(obtainStyledAttributes.getBoolean(C7025iN1.o.Z0, false));
        j1(obtainStyledAttributes.getBoolean(C7025iN1.o.Q0, true));
        k1(obtainStyledAttributes.getBoolean(C7025iN1.o.R0, true));
        w1(obtainStyledAttributes.getInt(C7025iN1.o.X0, 0));
        o1(obtainStyledAttributes.getFloat(C7025iN1.o.U0, 0.5f));
        int i8 = C7025iN1.o.S0;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i8);
        if (peekValue2 != null && peekValue2.type == 16) {
            l1(peekValue2.data);
        } else {
            l1(obtainStyledAttributes.getDimensionPixelOffset(i8, 0));
        }
        y1(obtainStyledAttributes.getInt(C7025iN1.o.Y0, 500));
        this.k1 = obtainStyledAttributes.getBoolean(C7025iN1.o.e1, false);
        this.l1 = obtainStyledAttributes.getBoolean(C7025iN1.o.f1, false);
        this.m1 = obtainStyledAttributes.getBoolean(C7025iN1.o.g1, false);
        this.n1 = obtainStyledAttributes.getBoolean(C7025iN1.o.h1, true);
        this.o1 = obtainStyledAttributes.getBoolean(C7025iN1.o.b1, false);
        this.p1 = obtainStyledAttributes.getBoolean(C7025iN1.o.c1, false);
        this.q1 = obtainStyledAttributes.getBoolean(C7025iN1.o.d1, false);
        this.t1 = obtainStyledAttributes.getBoolean(C7025iN1.o.k1, true);
        obtainStyledAttributes.recycle();
        this.Y0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
