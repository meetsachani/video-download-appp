package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import o.C10559wp1;
import o.C10861y4;
import o.C4717Xk1;
import o.C6516gH2;
import o.C7956m90;
import o.C8662p30;
import o.C9584sp1;
import o.E4;
import o.HL1;
import o.InterfaceC10070up1;
import o.InterfaceC8905q30;
import o.InterfaceC9092qp1;
import o.Q3;
import o.UY1;
import o.WY1;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC10070up1, InterfaceC9092qp1, WY1 {
    public static final int C1 = 250;
    public static final float D1 = 0.5f;
    public static final String E1 = "NestedScrollView";
    public static final int F1 = 250;
    public static final float G1 = 0.015f;
    public static final float H1 = 0.35f;
    public static final float J1 = 4.0f;
    public static final int K1 = -1;
    public final d A1;
    public C8662p30 B1;
    public final float Y0;
    public long Z0;
    public final Rect a1;
    public OverScroller b1;
    public EdgeEffect c1;
    public EdgeEffect d1;
    public UY1 e1;
    public int f1;
    public boolean g1;
    public boolean h1;
    public View i1;
    public boolean j1;
    public VelocityTracker k1;
    public boolean l1;
    public boolean m1;
    public int n1;
    public int o1;
    public int p1;
    public int q1;
    public final int[] r1;
    public final int[] s1;
    public int t1;
    public int u1;
    public f v1;
    public final C10559wp1 w1;
    public final C9584sp1 x1;
    public float y1;
    public e z1;
    public static final float I1 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final a L1 = new a();
    public static final int[] M1 = {16843130};

    /* loaded from: classes.dex */
    public static class a extends Q3 {
        @Override // o.Q3
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            E4.N(accessibilityEvent, nestedScrollView.getScrollX());
            E4.P(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // o.Q3
        public void g(View view, C10861y4 c10861y4) {
            int scrollRange;
            super.g(view, c10861y4);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c10861y4.k1(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                c10861y4.Z1(true);
                if (nestedScrollView.getScrollY() > 0) {
                    c10861y4.b(C10861y4.a.s);
                    c10861y4.b(C10861y4.a.D);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    c10861y4.b(C10861y4.a.r);
                    c10861y4.b(C10861y4.a.F);
                }
            }
        }

        @Override // o.Q3
        public boolean j(View view, int i, Bundle bundle) {
            if (super.j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i != 8192 && i != 16908344) {
                    if (i != 16908346) {
                        return false;
                    }
                } else {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.f0(0, max, true);
                    return true;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.f0(0, min, true);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static void a(View view, float f) {
            try {
                view.setFrameContentVelocity(f);
            } catch (LinkageError unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements InterfaceC8905q30 {
        public d() {
        }

        @Override // o.InterfaceC8905q30
        public boolean a(float f) {
            if (f == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.z((int) f);
            return true;
        }

        @Override // o.InterfaceC8905q30
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // o.InterfaceC8905q30
        public void c() {
            NestedScrollView.this.b1.abortAnimation();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* loaded from: classes.dex */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public int X;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.X + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.X);
        }

        public f(Parcel parcel) {
            super(parcel);
            this.X = parcel.readInt();
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public static boolean K(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && K((View) parent, view2)) {
            return true;
        }
        return false;
    }

    private UY1 getScrollFeedbackProvider() {
        if (this.e1 == null) {
            this.e1 = UY1.a(this);
        }
        return this.e1;
    }

    private static int l(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    public boolean A(int i) {
        boolean z;
        int childCount;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        Rect rect = this.a1;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.a1.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.a1;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.a1;
        return T(i, rect3.top, rect3.bottom);
    }

    public final float B(int i) {
        double log = Math.log((Math.abs(i) * 0.35f) / (this.Y0 * 0.015f));
        float f2 = I1;
        return (float) (this.Y0 * 0.015f * Math.exp((f2 / (f2 - 1.0d)) * log));
    }

    public final boolean C(int i, int i2) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    public final void D() {
        VelocityTracker velocityTracker = this.k1;
        if (velocityTracker == null) {
            this.k1 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void E() {
        this.b1 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.n1 = viewConfiguration.getScaledTouchSlop();
        this.o1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.p1 = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void F() {
        if (this.k1 == null) {
            this.k1 = VelocityTracker.obtain();
        }
    }

    public final void G(int i, int i2) {
        this.f1 = i;
        this.q1 = i2;
        d(2, 0);
    }

    public boolean H() {
        return this.l1;
    }

    public final boolean I(View view) {
        return !L(view, 0, getHeight());
    }

    public boolean J() {
        return this.m1;
    }

    public final boolean L(View view, int i, int i2) {
        view.getDrawingRect(this.a1);
        offsetDescendantRectToMyCoords(view, this.a1);
        if (this.a1.bottom + i >= getScrollY() && this.a1.top - i <= getScrollY() + i2) {
            return true;
        }
        return false;
    }

    public final void M(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.x1.e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public final void N(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.q1) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f1 = (int) motionEvent.getY(i);
            this.q1 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.k1;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean O(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i9;
        int i10;
        boolean z6;
        boolean z7;
        int i11;
        int overScrollMode = getOverScrollMode();
        if (computeHorizontalScrollRange() > computeHorizontalScrollExtent()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (overScrollMode != 0 && (overScrollMode != 1 || !z2)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (overScrollMode != 0 && (overScrollMode != 1 || !z3)) {
            z5 = false;
        } else {
            z5 = true;
        }
        int i12 = i3 + i;
        if (!z4) {
            i9 = 0;
        } else {
            i9 = i7;
        }
        int i13 = i4 + i2;
        if (!z5) {
            i10 = 0;
        } else {
            i10 = i8;
        }
        int i14 = -i9;
        int i15 = i9 + i5;
        int i16 = -i10;
        int i17 = i10 + i6;
        if (i12 > i15) {
            i12 = i15;
            z6 = true;
        } else if (i12 < i14) {
            z6 = true;
            i12 = i14;
        } else {
            z6 = false;
        }
        if (i13 > i17) {
            i13 = i17;
            z7 = true;
        } else if (i13 < i16) {
            z7 = true;
            i13 = i16;
        } else {
            z7 = false;
        }
        if (z7 && !b(1)) {
            int i18 = i12;
            this.b1.springBack(i18, i13, 0, 0, 0, getScrollRange());
            i11 = i18;
        } else {
            i11 = i12;
        }
        onOverScrolled(i11, i13, z6, z7);
        if (!z6 && !z7) {
            return false;
        }
        return true;
    }

    public boolean P(int i) {
        boolean z;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        if (z) {
            this.a1.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.a1;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.a1.top = getScrollY() - height;
            Rect rect2 = this.a1;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.a1;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return T(i, i2, i3);
    }

    public final void Q() {
        VelocityTracker velocityTracker = this.k1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.k1 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R(int i, float f2) {
        float j;
        int round;
        float width = f2 / getWidth();
        float height = i / getHeight();
        float f3 = 0.0f;
        if (C7956m90.d(this.c1) != 0.0f) {
            j = -C7956m90.j(this.c1, -height, width);
            if (C7956m90.d(this.c1) == 0.0f) {
                this.c1.onRelease();
            }
        } else {
            if (C7956m90.d(this.d1) != 0.0f) {
                j = C7956m90.j(this.d1, height, 1.0f - width);
                if (C7956m90.d(this.d1) == 0.0f) {
                    this.d1.onRelease();
                }
            }
            round = Math.round(f3 * getHeight());
            if (round != 0) {
                invalidate();
            }
            return round;
        }
        f3 = j;
        round = Math.round(f3 * getHeight());
        if (round != 0) {
        }
        return round;
    }

    public final void S(boolean z) {
        if (z) {
            d(2, 1);
        } else {
            g(1);
        }
        this.u1 = getScrollY();
        postInvalidateOnAnimation();
    }

    public final boolean T(int i, int i2, int i3) {
        boolean z;
        int i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        View y = y(z, i2, i3);
        if (y == null) {
            y = this;
        }
        if (i2 < scrollY || i3 > i5) {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            U(i4, 0, 1, true);
            z2 = true;
        }
        if (y != findFocus()) {
            y.requestFocus(i);
        }
        return z2;
    }

    public final int U(int i, int i2, int i3, boolean z) {
        return V(i, -1, null, i2, i3, z);
    }

    public int V(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            d(2, i4);
        }
        boolean z4 = false;
        if (f(0, i, this.s1, this.r1, i4)) {
            i6 = this.r1[1];
            i5 = i - this.s1[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        if (j() && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i7 = i5;
        if (O(0, i5, 0, scrollY, 0, scrollRange, 0, 0, true) && !b(i4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().c(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        int[] iArr = this.s1;
        iArr[1] = 0;
        a(0, scrollY2, 0, i7 - scrollY2, this.r1, i4, iArr);
        int i8 = i6 + this.r1[1];
        int i9 = i7 - this.s1[1];
        int i10 = scrollY + i9;
        if (i10 < 0) {
            if (z2) {
                C7956m90.j(this.c1, (-i9) / getHeight(), i3 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().b(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
                }
                if (!this.d1.isFinished()) {
                    this.d1.onRelease();
                }
            }
        } else if (i10 > scrollRange && z2) {
            C7956m90.j(this.d1, i9 / getHeight(), 1.0f - (i3 / getWidth()));
            if (motionEvent != null) {
                getScrollFeedbackProvider().b(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
            }
            if (!this.c1.isFinished()) {
                this.c1.onRelease();
            }
        }
        if (this.c1.isFinished() && this.d1.isFinished()) {
            z4 = z3;
        } else {
            postInvalidateOnAnimation();
        }
        if (z4 && i4 == 0 && (velocityTracker = this.k1) != null) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            g(i4);
            this.c1.onRelease();
            this.d1.onRelease();
        }
        return i8;
    }

    public final void W(View view) {
        view.getDrawingRect(this.a1);
        offsetDescendantRectToMyCoords(view, this.a1);
        int m = m(this.a1);
        if (m != 0) {
            scrollBy(0, m);
        }
    }

    public final boolean X(Rect rect, boolean z) {
        boolean z2;
        int m = m(rect);
        if (m != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, m);
                return z2;
            }
            Z(0, m);
        }
        return z2;
    }

    public final boolean Y(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        if (B(-i) < C7956m90.d(edgeEffect) * getHeight()) {
            return true;
        }
        return false;
    }

    public final void Z(int i, int i2) {
        b0(i, i2, 250, false);
    }

    @Override // o.InterfaceC9092qp1
    public void a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.x1.e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void a0(int i, int i2, int i3) {
        b0(i, i2, i3, false);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // o.InterfaceC8849pp1
    public boolean b(int i) {
        return this.x1.l(i);
    }

    public final void b0(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.Z0 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.b1;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
            S(z);
        } else {
            if (!this.b1.isFinished()) {
                c();
            }
            scrollBy(i, i2);
        }
        this.Z0 = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void c() {
        this.b1.abortAnimation();
        g(1);
    }

    public final void c0(int i, int i2) {
        e0(i, i2, 250, false);
    }

    @Override // android.view.View, o.WY1
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, o.WY1
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, o.WY1
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        int i;
        if (this.b1.isFinished()) {
            return;
        }
        this.b1.computeScrollOffset();
        int currY = this.b1.getCurrY();
        int q = q(currY - this.u1);
        this.u1 = currY;
        int[] iArr = this.s1;
        iArr[1] = 0;
        f(0, q, iArr, null, 1);
        int i2 = q - this.s1[1];
        int scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            c.a(this, Math.abs(this.b1.getCurrVelocity()));
        }
        if (i2 != 0) {
            int scrollY = getScrollY();
            O(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            i = scrollRange;
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.s1;
            iArr2[1] = 0;
            a(0, scrollY2, 0, i3, this.r1, 1, iArr2);
            i2 = i3 - this.s1[1];
        } else {
            i = scrollRange;
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && i > 0)) {
                if (i2 < 0) {
                    if (this.c1.isFinished()) {
                        this.c1.onAbsorb((int) this.b1.getCurrVelocity());
                    }
                } else if (this.d1.isFinished()) {
                    this.d1.onAbsorb((int) this.b1.getCurrVelocity());
                }
            }
            c();
        }
        if (!this.b1.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            g(1);
        }
    }

    @Override // android.view.View, o.WY1
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, o.WY1
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, o.WY1
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    @Override // o.InterfaceC8849pp1
    public boolean d(int i, int i2) {
        return this.x1.s(i, i2);
    }

    public final void d0(int i, int i2, int i3) {
        e0(i, i2, i3, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !x(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.x1.a(f2, f3, z);
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.x1.b(f2, f3);
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return f(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.x1.f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.c1.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            this.c1.setSize(width, height);
            if (this.c1.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (!this.d1.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i2 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.d1.setSize(width2, height2);
            if (this.d1.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // o.InterfaceC8849pp1
    public boolean e(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.x1.g(i, i2, i3, i4, iArr, i5);
    }

    public void e0(int i, int i2, int i3, boolean z) {
        b0(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    @Override // o.InterfaceC8849pp1
    public boolean f(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.x1.d(i, i2, iArr, iArr2, i3);
    }

    public void f0(int i, int i2, boolean z) {
        e0(i, i2, 250, z);
    }

    @Override // o.InterfaceC8849pp1
    public void g(int i) {
        this.x1.u(i);
    }

    public final boolean g0(MotionEvent motionEvent) {
        boolean z;
        if (C7956m90.d(this.c1) != 0.0f) {
            C7956m90.j(this.c1, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (C7956m90.d(this.d1) != 0.0f) {
            C7956m90.j(this.d1, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup, o.InterfaceC10313vp1
    public int getNestedScrollAxes() {
        return this.w1.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.y1 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.y1 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.y1;
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean hasNestedScrollingParent() {
        return b(0);
    }

    public boolean i(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && L(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.a1);
            offsetDescendantRectToMyCoords(findNextFocus, this.a1);
            U(m(this.a1), 0, 1, true);
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            U(maxScrollAmount, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && I(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean isNestedScrollingEnabled() {
        return this.x1.m();
    }

    public final boolean j() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    public int m(Rect rect) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i4 - verticalFadingEdgeLength;
        } else {
            i = i4;
        }
        int i5 = rect.bottom;
        if (i5 > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i;
            }
            return Math.min(i3, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || i5 >= i) {
            return 0;
        } else {
            if (rect.height() > height) {
                i2 = 0 - (i - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            return Math.max(i2, -getScrollY());
        }
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // o.InterfaceC9827tp1
    public void n(View view, View view2, int i, int i2) {
        this.w1.c(view, view2, i, i2);
        d(2, i2);
    }

    @Override // o.InterfaceC9827tp1
    public void o(View view, int i) {
        this.w1.e(view, i);
        g(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h1 = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        float f2;
        if (motionEvent.getAction() == 8 && !this.j1) {
            if (C4717Xk1.l(motionEvent, 2)) {
                f2 = motionEvent.getAxisValue(9);
                i = 9;
                i2 = (int) motionEvent.getX();
            } else if (C4717Xk1.l(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i2 = getWidth() / 2;
                i = 26;
                f2 = axisValue;
            } else {
                i = 0;
                i2 = 0;
                f2 = 0.0f;
            }
            if (f2 != 0.0f) {
                V(-((int) (f2 * getVerticalScrollFactorCompat())), i, motionEvent, i2, 1, C4717Xk1.l(motionEvent, 8194));
                if (i != 0) {
                    this.B1.g(motionEvent, i);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.j1) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6) {
                            N(motionEvent);
                        }
                    }
                } else {
                    int i2 = this.q1;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e(E1, "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f1) > this.n1 && (2 & getNestedScrollAxes()) == 0) {
                                this.j1 = true;
                                this.f1 = y;
                                F();
                                this.k1.addMovement(motionEvent);
                                this.t1 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.j1 = false;
            this.q1 = -1;
            Q();
            if (this.b1.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            g(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!C((int) motionEvent.getX(), y2)) {
                if (!g0(motionEvent) && this.b1.isFinished()) {
                    z = false;
                }
                this.j1 = z;
                Q();
            } else {
                this.f1 = y2;
                this.q1 = motionEvent.getPointerId(0);
                D();
                this.k1.addMovement(motionEvent);
                this.b1.computeScrollOffset();
                if (!g0(motionEvent) && this.b1.isFinished()) {
                    z = false;
                }
                this.j1 = z;
                d(2, 0);
            }
        }
        return this.j1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.g1 = false;
        View view = this.i1;
        if (view != null && K(view, this)) {
            W(this.i1);
        }
        this.i1 = null;
        if (!this.h1) {
            if (this.v1 != null) {
                scrollTo(getScrollX(), this.v1.X);
                this.v1 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int l = l(scrollY, paddingTop, i5);
            if (l != scrollY) {
                scrollTo(getScrollX(), l);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.h1 = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.l1 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!z) {
            dispatchNestedFling(0.0f, f3, true);
            z((int) f3);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        p(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        M(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public void onNestedScrollAccepted(View view, View view2, int i) {
        n(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || I(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.v1 = fVar;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.X = getScrollY();
        return fVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        e eVar = this.z1;
        if (eVar != null) {
            eVar.a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && L(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.a1);
            offsetDescendantRectToMyCoords(findFocus, this.a1);
            r(m(this.a1));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return u(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public void onStopNestedScroll(View view) {
        o(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        NestedScrollView nestedScrollView;
        ViewParent parent;
        F();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.t1 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.t1);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                N(motionEvent);
                                this.f1 = (int) motionEvent.getY(motionEvent.findPointerIndex(this.q1));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f1 = (int) motionEvent.getY(actionIndex);
                            this.q1 = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.j1 && getChildCount() > 0 && this.b1.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            postInvalidateOnAnimation();
                        }
                        w();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.q1);
                    if (findPointerIndex == -1) {
                        Log.e(E1, "Invalid pointerId=" + this.q1 + " in onTouchEvent");
                    } else {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        int i = this.f1 - y;
                        int R = i - R(i, motionEvent.getX(findPointerIndex));
                        if (!this.j1 && Math.abs(R) > this.n1) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.j1 = true;
                            R = R > 0 ? R - this.n1 : R + this.n1;
                        }
                        int i2 = R;
                        if (this.j1) {
                            nestedScrollView = this;
                            int V = nestedScrollView.V(i2, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            nestedScrollView.f1 = y - V;
                            nestedScrollView.t1 += V;
                        }
                    }
                }
                nestedScrollView = this;
            } else {
                nestedScrollView = this;
                VelocityTracker velocityTracker = nestedScrollView.k1;
                velocityTracker.computeCurrentVelocity(1000, nestedScrollView.p1);
                int yVelocity = (int) velocityTracker.getYVelocity(nestedScrollView.q1);
                if (Math.abs(yVelocity) >= nestedScrollView.o1) {
                    if (!v(yVelocity)) {
                        int i3 = -yVelocity;
                        float f2 = i3;
                        if (!dispatchNestedPreFling(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            z(i3);
                        }
                    }
                } else if (nestedScrollView.b1.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                w();
            }
        } else {
            nestedScrollView = this;
            if (getChildCount() == 0) {
                return false;
            }
            if (nestedScrollView.j1 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!nestedScrollView.b1.isFinished()) {
                c();
            }
            G((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = nestedScrollView.k1;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    @Override // o.InterfaceC9827tp1
    public void p(View view, int i, int i2, int[] iArr, int i3) {
        f(i, i2, iArr, null, i3);
    }

    public int q(int i) {
        int height = getHeight();
        if (i > 0 && C7956m90.d(this.c1) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * C7956m90.j(this.c1, ((-i) * 4.0f) / height, 0.5f));
            if (round != i) {
                this.c1.finish();
            }
            return i - round;
        } else if (i < 0 && C7956m90.d(this.d1) != 0.0f) {
            float f2 = height;
            int round2 = Math.round((f2 / 4.0f) * C7956m90.j(this.d1, (i * 4.0f) / f2, 0.5f));
            if (round2 != i) {
                this.d1.finish();
            }
            return i - round2;
        } else {
            return i;
        }
    }

    public final void r(int i) {
        if (i != 0) {
            if (this.m1) {
                Z(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.g1) {
            W(view2);
        } else {
            this.i1 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return X(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            Q();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.g1 = true;
        super.requestLayout();
    }

    @Override // o.InterfaceC10070up1
    public void s(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        M(i4, i5, iArr);
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int l = l(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int l2 = l(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (l != getScrollX() || l2 != getScrollY()) {
                super.scrollTo(l, l2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.l1) {
            this.l1 = z;
            requestLayout();
        }
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public void setNestedScrollingEnabled(boolean z) {
        this.x1.p(z);
    }

    public void setOnScrollChangeListener(e eVar) {
        this.z1 = eVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.m1 = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public boolean startNestedScroll(int i) {
        return d(i, 0);
    }

    @Override // android.view.View, o.InterfaceC9341rp1
    public void stopNestedScroll() {
        g(0);
    }

    @Override // o.InterfaceC9827tp1
    public void t(View view, int i, int i2, int i3, int i4, int i5) {
        M(i4, i5, null);
    }

    @Override // o.InterfaceC9827tp1
    public boolean u(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public final boolean v(int i) {
        if (C7956m90.d(this.c1) != 0.0f) {
            if (Y(this.c1, i)) {
                this.c1.onAbsorb(i);
                return true;
            }
            z(-i);
            return true;
        } else if (C7956m90.d(this.d1) != 0.0f) {
            int i2 = -i;
            if (Y(this.d1, i2)) {
                this.d1.onAbsorb(i2);
                return true;
            }
            z(i2);
            return true;
        } else {
            return false;
        }
    }

    public final void w() {
        this.q1 = -1;
        this.j1 = false;
        Q();
        g(0);
        this.c1.onRelease();
        this.d1.onRelease();
    }

    public boolean x(KeyEvent keyEvent) {
        this.a1.setEmpty();
        int i = 130;
        if (!k()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        if (keyCode != 92) {
                            if (keyCode != 93) {
                                if (keyCode != 122) {
                                    if (keyCode == 123) {
                                        P(130);
                                        return false;
                                    }
                                } else {
                                    P(33);
                                    return false;
                                }
                            } else {
                                return A(130);
                            }
                        } else {
                            return A(33);
                        }
                    } else {
                        if (keyEvent.isShiftPressed()) {
                            i = 33;
                        }
                        P(i);
                        return false;
                    }
                } else if (keyEvent.isAltPressed()) {
                    return A(130);
                } else {
                    return i(130);
                }
            } else if (keyEvent.isAltPressed()) {
                return A(33);
            } else {
                return i(33);
            }
        }
        return false;
    }

    public final View y(boolean z, int i, int i2) {
        boolean z2;
        boolean z3;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                if (i < top && bottom < i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (view == null) {
                    view = view2;
                    z4 = z2;
                } else {
                    if ((z && top < view.getTop()) || (!z && bottom > view.getBottom())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z4) {
                        if (z2) {
                            if (!z3) {
                            }
                            view = view2;
                        }
                    } else if (z2) {
                        view = view2;
                        z4 = true;
                    } else {
                        if (!z3) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    public void z(int i) {
        if (getChildCount() > 0) {
            this.b1.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            S(true);
            if (Build.VERSION.SDK_INT >= 35) {
                c.a(this, Math.abs(this.b1.getCurrVelocity()));
            }
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, HL1.a.f480o);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a1 = new Rect();
        this.g1 = true;
        this.h1 = false;
        this.i1 = null;
        this.j1 = false;
        this.m1 = true;
        this.q1 = -1;
        this.r1 = new int[2];
        this.s1 = new int[2];
        d dVar = new d();
        this.A1 = dVar;
        this.B1 = new C8662p30(getContext(), dVar);
        this.c1 = C7956m90.a(context, attributeSet);
        this.d1 = C7956m90.a(context, attributeSet);
        this.Y0 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        E();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M1, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.w1 = new C10559wp1(this);
        this.x1 = new C9584sp1(this);
        setNestedScrollingEnabled(true);
        C6516gH2.I1(this, L1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
