package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import o.C10201vM;
import o.C10559wp1;
import o.C6516gH2;
import o.C8168n11;
import o.C9432sC;
import o.C9584sp1;
import o.IC;
import o.InterfaceC10070up1;
import o.InterfaceC10313vp1;
import o.InterfaceC8849pp1;
import o.InterfaceC9092qp1;
import o.InterfaceC9341rp1;
import o.InterfaceC9827tp1;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC10070up1, InterfaceC9827tp1, InterfaceC9092qp1, InterfaceC8849pp1, InterfaceC10313vp1, InterfaceC9341rp1 {
    public static final int O1 = 0;
    public static final int P1 = 1;
    public static final int Q1 = -1;
    public static final int R1 = 40;
    public static final int S1 = 56;
    public static final String T1 = "SwipeRefreshLayout";
    public static final int U1 = 255;
    public static final int V1 = 76;
    public static final float W1 = 2.0f;
    public static final int X1 = -1;
    public static final float Y1 = 0.5f;
    public static final float Z1 = 0.8f;
    public static final int a2 = 150;
    public static final int b2 = 300;
    public static final int c2 = 200;
    public static final int d2 = 200;
    public static final int e2 = 64;
    public static final int[] f2 = {16842766};
    public IC A1;
    public Animation B1;
    public Animation C1;
    public Animation D1;
    public Animation E1;
    public Animation F1;
    public boolean G1;
    public int H1;
    public boolean I1;
    public i J1;
    public boolean K1;
    public Animation.AnimationListener L1;
    public final Animation M1;
    public final Animation N1;
    public View Y0;
    public j Z0;
    public boolean a1;
    public int b1;
    public float c1;
    public float d1;
    public final C10559wp1 e1;
    public final C9584sp1 f1;
    public final int[] g1;
    public final int[] h1;
    public final int[] i1;
    public boolean j1;
    public int k1;
    public int l1;
    public float m1;
    public float n1;
    public boolean o1;
    public int p1;
    public boolean q1;
    public boolean r1;
    public final DecelerateInterpolator s1;
    public C9432sC t1;
    public int u1;
    public int v1;
    public float w1;
    public int x1;
    public int y1;
    public int z1;

    /* loaded from: classes.dex */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.a1) {
                swipeRefreshLayout.A1.setAlpha(255);
                SwipeRefreshLayout.this.A1.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.G1 && (jVar = swipeRefreshLayout2.Z0) != null) {
                    jVar.a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.l1 = swipeRefreshLayout3.t1.getTop();
                return;
            }
            swipeRefreshLayout.x();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class b extends Animation {
        public b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* loaded from: classes.dex */
    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* loaded from: classes.dex */
    public class d extends Animation {
        public final /* synthetic */ int X;
        public final /* synthetic */ int Y;

        public d(int i, int i2) {
            this.X = i;
            this.Y = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            IC ic = SwipeRefreshLayout.this.A1;
            int i = this.X;
            ic.setAlpha((int) (i + ((this.Y - i) * f)));
        }
    }

    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.q1) {
                swipeRefreshLayout.F(null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class f extends Animation {
        public f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            int i;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.I1) {
                i = swipeRefreshLayout.y1 - Math.abs(swipeRefreshLayout.x1);
            } else {
                i = swipeRefreshLayout.y1;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.v1;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i2 + ((int) ((i - i2) * f))) - swipeRefreshLayout2.t1.getTop());
            SwipeRefreshLayout.this.A1.u(1.0f - f);
        }
    }

    /* loaded from: classes.dex */
    public class g extends Animation {
        public g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.v(f);
        }
    }

    /* loaded from: classes.dex */
    public class h extends Animation {
        public h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.w1;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.v(f);
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        boolean a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* loaded from: classes.dex */
    public interface j {
        void a();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private void setColorViewAlpha(int i2) {
        this.t1.getBackground().setAlpha(i2);
        this.A1.setAlpha(i2);
    }

    private void w(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.p1) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.p1 = motionEvent.getPointerId(i2);
        }
    }

    public final void A(boolean z, boolean z2) {
        if (this.a1 != z) {
            this.G1 = z2;
            k();
            this.a1 = z;
            if (z) {
                c(this.l1, this.L1);
            } else {
                F(this.L1);
            }
        }
    }

    public final Animation B(int i2, int i3) {
        d dVar = new d(i2, i3);
        dVar.setDuration(300L);
        this.t1.c(null);
        this.t1.clearAnimation();
        this.t1.startAnimation(dVar);
        return dVar;
    }

    public final void C(float f3) {
        float f4 = this.n1;
        int i2 = this.b1;
        if (f3 - f4 > i2 && !this.o1) {
            this.m1 = f4 + i2;
            this.o1 = true;
            this.A1.setAlpha(76);
        }
    }

    public final void D() {
        this.E1 = B(this.A1.getAlpha(), 255);
    }

    public final void E() {
        this.D1 = B(this.A1.getAlpha(), 76);
    }

    public void F(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.C1 = cVar;
        cVar.setDuration(150L);
        this.t1.c(animationListener);
        this.t1.clearAnimation();
        this.t1.startAnimation(this.C1);
    }

    public final void G(int i2, Animation.AnimationListener animationListener) {
        this.v1 = i2;
        this.w1 = this.t1.getScaleX();
        h hVar = new h();
        this.F1 = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.t1.c(animationListener);
        }
        this.t1.clearAnimation();
        this.t1.startAnimation(this.F1);
    }

    public final void H(Animation.AnimationListener animationListener) {
        this.t1.setVisibility(0);
        this.A1.setAlpha(255);
        b bVar = new b();
        this.B1 = bVar;
        bVar.setDuration(this.k1);
        if (animationListener != null) {
            this.t1.c(animationListener);
        }
        this.t1.clearAnimation();
        this.t1.startAnimation(this.B1);
    }

    @Override // o.InterfaceC9092qp1
    public void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        if (i6 == 0) {
            this.f1.e(i2, i3, i4, i5, iArr, i6, iArr2);
        }
    }

    @Override // o.InterfaceC8849pp1
    public boolean b(int i2) {
        if (i2 == 0 && hasNestedScrollingParent()) {
            return true;
        }
        return false;
    }

    public final void c(int i2, Animation.AnimationListener animationListener) {
        this.v1 = i2;
        this.M1.reset();
        this.M1.setDuration(200L);
        this.M1.setInterpolator(this.s1);
        if (animationListener != null) {
            this.t1.c(animationListener);
        }
        this.t1.clearAnimation();
        this.t1.startAnimation(this.M1);
    }

    @Override // o.InterfaceC8849pp1
    public boolean d(int i2, int i3) {
        if (i3 == 0 && startNestedScroll(i2)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean dispatchNestedFling(float f3, float f4, boolean z) {
        return this.f1.a(f3, f4, z);
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean dispatchNestedPreFling(float f3, float f4) {
        return this.f1.b(f3, f4);
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f1.c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f1.f(i2, i3, i4, i5, iArr);
    }

    @Override // o.InterfaceC8849pp1
    public boolean e(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        if (i6 == 0 && this.f1.g(i2, i3, i4, i5, iArr, i6)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC8849pp1
    public boolean f(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        if (i4 == 0 && dispatchNestedPreScroll(i2, i3, iArr, iArr2)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC8849pp1
    public void g(int i2) {
        if (i2 == 0) {
            stopNestedScroll();
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.u1;
        if (i4 >= 0) {
            if (i3 == i2 - 1) {
                return i4;
            }
            if (i3 >= i4) {
                return i3 + 1;
            }
            return i3;
        }
        return i3;
    }

    @Override // android.view.ViewGroup, o.InterfaceC10313vp1
    public int getNestedScrollAxes() {
        return this.e1.a();
    }

    public int getProgressCircleDiameter() {
        return this.H1;
    }

    public int getProgressViewEndOffset() {
        return this.y1;
    }

    public int getProgressViewStartOffset() {
        return this.x1;
    }

    public final void h(int i2, Animation.AnimationListener animationListener) {
        if (this.q1) {
            G(i2, animationListener);
            return;
        }
        this.v1 = i2;
        this.N1.reset();
        this.N1.setDuration(200L);
        this.N1.setInterpolator(this.s1);
        if (animationListener != null) {
            this.t1.c(animationListener);
        }
        this.t1.clearAnimation();
        this.t1.startAnimation(this.N1);
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean hasNestedScrollingParent() {
        return this.f1.k();
    }

    public boolean i() {
        i iVar = this.J1;
        if (iVar != null) {
            return iVar.a(this, this.Y0);
        }
        View view = this.Y0;
        if (view instanceof ListView) {
            return C8168n11.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean isNestedScrollingEnabled() {
        return this.f1.m();
    }

    public final void j() {
        this.t1 = new C9432sC(getContext());
        IC ic = new IC(getContext());
        this.A1 = ic;
        ic.E(1);
        this.t1.setImageDrawable(this.A1);
        this.t1.setVisibility(8);
        addView(this.t1);
    }

    public final void k() {
        if (this.Y0 == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.t1)) {
                    this.Y0 = childAt;
                    return;
                }
            }
        }
    }

    public final void l(float f3) {
        e eVar;
        if (f3 > this.c1) {
            A(true, true);
            return;
        }
        this.a1 = false;
        this.A1.B(0.0f, 0.0f);
        if (!this.q1) {
            eVar = new e();
        } else {
            eVar = null;
        }
        h(this.l1, eVar);
        this.A1.t(false);
    }

    public final boolean m(Animation animation) {
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC9827tp1
    public void n(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // o.InterfaceC9827tp1
    public void o(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        k();
        int actionMasked = motionEvent.getActionMasked();
        if (this.r1 && actionMasked == 0) {
            this.r1 = false;
        }
        if (!isEnabled() || this.r1 || i() || this.a1 || this.j1) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            w(motionEvent);
                        }
                    }
                } else {
                    int i2 = this.p1;
                    if (i2 == -1) {
                        Log.e(T1, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    C(motionEvent.getY(findPointerIndex));
                }
            }
            this.o1 = false;
            this.p1 = -1;
        } else {
            setTargetOffsetTopAndBottom(this.x1 - this.t1.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.p1 = pointerId;
            this.o1 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.n1 = motionEvent.getY(findPointerIndex2);
        }
        return this.o1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.Y0 == null) {
                k();
            }
            View view = this.Y0;
            if (view == null) {
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            int measuredWidth2 = this.t1.getMeasuredWidth();
            int measuredHeight2 = this.t1.getMeasuredHeight();
            int i6 = measuredWidth / 2;
            int i7 = measuredWidth2 / 2;
            int i8 = this.l1;
            this.t1.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.Y0 == null) {
            k();
        }
        View view = this.Y0;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.t1.measure(View.MeasureSpec.makeMeasureSpec(this.H1, 1073741824), View.MeasureSpec.makeMeasureSpec(this.H1, 1073741824));
            this.u1 = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.t1) {
                    this.u1 = i4;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public boolean onNestedFling(View view, float f3, float f4, boolean z) {
        return dispatchNestedFling(f3, f4, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public boolean onNestedPreFling(View view, float f3, float f4) {
        return dispatchNestedPreFling(f3, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f3 = this.d1;
            if (f3 > 0.0f) {
                float f4 = i3;
                if (f4 > f3) {
                    iArr[1] = (int) f3;
                    this.d1 = 0.0f;
                } else {
                    this.d1 = f3 - f4;
                    iArr[1] = i3;
                }
                r(this.d1);
            }
        }
        if (this.I1 && i3 > 0 && this.d1 == 0.0f && Math.abs(i3 - iArr[1]) > 0) {
            this.t1.setVisibility(8);
        }
        int[] iArr2 = this.g1;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        s(view, i2, i3, i4, i5, 0, this.i1);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.e1.b(view, view2, i2);
        startNestedScroll(i2 & 2);
        this.d1 = 0.0f;
        this.j1 = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.X);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.a1);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if (isEnabled() && !this.r1 && !this.a1 && (i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public void onStopNestedScroll(View view) {
        this.e1.d(view);
        this.j1 = false;
        float f3 = this.d1;
        if (f3 > 0.0f) {
            l(f3);
            this.d1 = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.r1 && actionMasked == 0) {
            this.r1 = false;
        }
        if (!isEnabled() || this.r1 || i() || this.a1 || this.j1) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            w(motionEvent);
                        }
                    } else {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            Log.e(T1, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        this.p1 = motionEvent.getPointerId(actionIndex);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.p1);
                    if (findPointerIndex < 0) {
                        Log.e(T1, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y = motionEvent.getY(findPointerIndex);
                    C(y);
                    if (this.o1) {
                        float f3 = (y - this.m1) * 0.5f;
                        if (f3 <= 0.0f) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        r(f3);
                    }
                }
            } else {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.p1);
                if (findPointerIndex2 < 0) {
                    Log.e(T1, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.o1) {
                    this.o1 = false;
                    l((motionEvent.getY(findPointerIndex2) - this.m1) * 0.5f);
                }
                this.p1 = -1;
                return false;
            }
        } else {
            this.p1 = motionEvent.getPointerId(0);
            this.o1 = false;
        }
        return true;
    }

    @Override // o.InterfaceC9827tp1
    public void p(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    public boolean q() {
        return this.a1;
    }

    public final void r(float f3) {
        this.A1.t(true);
        float min = Math.min(1.0f, Math.abs(f3 / this.c1));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f3) - this.c1;
        int i2 = this.z1;
        if (i2 <= 0) {
            if (this.I1) {
                i2 = this.y1 - this.x1;
            } else {
                i2 = this.y1;
            }
        }
        float f4 = i2;
        double max2 = Math.max(0.0f, Math.min(abs, f4 * 2.0f) / f4) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i3 = this.x1 + ((int) ((f4 * min) + (f4 * pow * 2.0f)));
        if (this.t1.getVisibility() != 0) {
            this.t1.setVisibility(0);
        }
        if (!this.q1) {
            this.t1.setScaleX(1.0f);
            this.t1.setScaleY(1.0f);
        }
        if (this.q1) {
            setAnimationProgress(Math.min(1.0f, f3 / this.c1));
        }
        if (f3 < this.c1) {
            if (this.A1.getAlpha() > 76 && !m(this.D1)) {
                E();
            }
        } else if (this.A1.getAlpha() < 255 && !m(this.E1)) {
            D();
        }
        this.A1.B(0.0f, Math.min(0.8f, max * 0.8f));
        this.A1.u(Math.min(1.0f, max));
        this.A1.y((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i3 - this.l1);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.Y0;
        if (view != null && !C6516gH2.c1(view)) {
            if (!this.K1 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(z);
                return;
            }
            return;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // o.InterfaceC10070up1
    public void s(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        int i7;
        if (i6 == 0) {
            int i8 = iArr[1];
            a(i2, i3, i4, i5, this.h1, i6, iArr);
            int i9 = i5 - (iArr[1] - i8);
            if (i9 == 0) {
                i7 = i5 + this.h1[1];
            } else {
                i7 = i9;
            }
            if (i7 < 0 && !i()) {
                float abs = this.d1 + Math.abs(i7);
                this.d1 = abs;
                r(abs);
                iArr[1] = iArr[1] + i9;
            }
        }
    }

    public void setAnimationProgress(float f3) {
        this.t1.setScaleX(f3);
        this.t1.setScaleY(f3);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        k();
        this.A1.x(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = C10201vM.g(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.c1 = i2;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            x();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.K1 = z;
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public void setNestedScrollingEnabled(boolean z) {
        this.f1.p(z);
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.J1 = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.Z0 = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.t1.setBackgroundColor(i2);
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(C10201vM.g(getContext(), i2));
    }

    public void setRefreshing(boolean z) {
        int i2;
        if (z && this.a1 != z) {
            this.a1 = z;
            if (!this.I1) {
                i2 = this.y1 + this.x1;
            } else {
                i2 = this.y1;
            }
            setTargetOffsetTopAndBottom(i2 - this.l1);
            this.G1 = false;
            H(this.L1);
            return;
        }
        A(z, false);
    }

    public void setSize(int i2) {
        if (i2 != 0 && i2 != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i2 == 0) {
            this.H1 = (int) (displayMetrics.density * 56.0f);
        } else {
            this.H1 = (int) (displayMetrics.density * 40.0f);
        }
        this.t1.setImageDrawable(null);
        this.A1.E(i2);
        this.t1.setImageDrawable(this.A1);
    }

    public void setSlingshotDistance(int i2) {
        this.z1 = i2;
    }

    public void setTargetOffsetTopAndBottom(int i2) {
        this.t1.bringToFront();
        C6516gH2.k1(this.t1, i2);
        this.l1 = this.t1.getTop();
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean startNestedScroll(int i2) {
        return this.f1.r(i2);
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public void stopNestedScroll() {
        this.f1.t();
    }

    @Override // o.InterfaceC9827tp1
    public void t(View view, int i2, int i3, int i4, int i5, int i6) {
        s(view, i2, i3, i4, i5, i6, this.i1);
    }

    @Override // o.InterfaceC9827tp1
    public boolean u(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            return onStartNestedScroll(view, view2, i2);
        }
        return false;
    }

    public void v(float f3) {
        int i2 = this.v1;
        setTargetOffsetTopAndBottom((i2 + ((int) ((this.x1 - i2) * f3))) - this.t1.getTop());
    }

    public void x() {
        this.t1.clearAnimation();
        this.A1.stop();
        this.t1.setVisibility(8);
        setColorViewAlpha(255);
        if (this.q1) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.x1 - this.l1);
        }
        this.l1 = this.t1.getTop();
    }

    public void y(boolean z, int i2) {
        this.y1 = i2;
        this.q1 = z;
        this.t1.invalidate();
    }

    public void z(boolean z, int i2, int i3) {
        this.q1 = z;
        this.x1 = i2;
        this.y1 = i3;
        this.I1 = true;
        x();
        this.a1 = false;
    }

    /* loaded from: classes.dex */
    public static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();
        public final boolean X;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public k[] newArray(int i) {
                return new k[i];
            }
        }

        public k(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.X = z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.X ? (byte) 1 : (byte) 0);
        }

        public k(Parcel parcel) {
            super(parcel);
            this.X = parcel.readByte() != 0;
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a1 = false;
        this.c1 = -1.0f;
        this.g1 = new int[2];
        this.h1 = new int[2];
        this.i1 = new int[2];
        this.p1 = -1;
        this.u1 = -1;
        this.L1 = new a();
        this.M1 = new f();
        this.N1 = new g();
        this.b1 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.k1 = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.s1 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.H1 = (int) (displayMetrics.density * 40.0f);
        j();
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.y1 = i2;
        this.c1 = i2;
        this.e1 = new C10559wp1(this);
        this.f1 = new C9584sp1(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.H1;
        this.l1 = i3;
        this.x1 = i3;
        v(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
}
