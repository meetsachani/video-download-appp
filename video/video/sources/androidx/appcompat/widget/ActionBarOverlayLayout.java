package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import o.C10559wp1;
import o.C6516gH2;
import o.C9246rQ0;
import o.InterfaceC10070up1;
import o.InterfaceC10313vp1;
import o.InterfaceC10485wW;
import o.InterfaceC10728xW;
import o.InterfaceC9827tp1;
import o.OL1;
import o.RL2;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC10485wW, InterfaceC10313vp1, InterfaceC9827tp1, InterfaceC10070up1 {
    public static final String E1 = "ActionBarOverlayLayout";
    public static final int F1 = 600;
    public static final int[] G1 = {OL1.b.d, 16842841};
    public static final RL2 H1 = new RL2.b().h(C9246rQ0.d(0, 1, 0, 1)).a();
    public static final Rect I1 = new Rect();
    public final Runnable A1;
    public final Runnable B1;
    public final C10559wp1 C1;
    public final f D1;
    public int Y0;
    public int Z0;
    public ContentFrameLayout a1;
    public ActionBarContainer b1;
    public InterfaceC10728xW c1;
    public Drawable d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public int i1;
    public int j1;
    public final Rect k1;
    public final Rect l1;
    public final Rect m1;
    public final Rect n1;
    public final Rect o1;
    public final Rect p1;
    public final Rect q1;
    public final Rect r1;
    public RL2 s1;
    public RL2 t1;
    public RL2 u1;
    public RL2 v1;
    public d w1;
    public OverScroller x1;
    public ViewPropertyAnimator y1;
    public final AnimatorListenerAdapter z1;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.y1 = null;
            actionBarOverlayLayout.h1 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.y1 = null;
            actionBarOverlayLayout.h1 = false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.z();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.y1 = actionBarOverlayLayout.b1.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.z1);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.z();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.y1 = actionBarOverlayLayout.b1.animate().translationY(-ActionBarOverlayLayout.this.b1.getHeight()).setListener(ActionBarOverlayLayout.this.z1);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();

        void c(boolean z);

        void d();

        void e();

        void onWindowVisibilityChanged(int i);
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i, int i2) {
            super(i, i2);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends View {
        public f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public final void A(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(G1);
        boolean z = false;
        this.Y0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.d1 = drawable;
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        this.x1 = new OverScroller(context);
    }

    public boolean B() {
        return this.g1;
    }

    public boolean C() {
        return this.e1;
    }

    public final void D() {
        z();
        postDelayed(this.B1, 600L);
    }

    public final void E() {
        z();
        postDelayed(this.A1, 600L);
    }

    public void F() {
        if (this.a1 == null) {
            this.a1 = (ContentFrameLayout) findViewById(OL1.g.b);
            this.b1 = (ActionBarContainer) findViewById(OL1.g.c);
            this.c1 = y(findViewById(OL1.g.a));
        }
    }

    public final void G() {
        z();
        this.A1.run();
    }

    public final boolean H(float f2) {
        this.x1.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.x1.getFinalY() > this.b1.getHeight()) {
            return true;
        }
        return false;
    }

    public final void a() {
        z();
        this.B1.run();
    }

    @Override // o.InterfaceC10485wW
    public boolean b() {
        F();
        return this.c1.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        e eVar = (e) view.getLayoutParams();
        if (z) {
            int i = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i2 = rect.left;
            if (i != i2) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i2;
                z5 = true;
                if (z2) {
                    int i3 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                    int i4 = rect.top;
                    if (i3 != i4) {
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = i4;
                        z5 = true;
                    }
                }
                if (z4) {
                    int i5 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                    int i6 = rect.right;
                    if (i5 != i6) {
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i6;
                        z5 = true;
                    }
                }
                if (z3) {
                    int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    int i8 = rect.bottom;
                    if (i7 != i8) {
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i8;
                        return true;
                    }
                }
                return z5;
            }
        }
        z5 = false;
        if (z2) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z5;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // o.InterfaceC10485wW
    public boolean d() {
        F();
        return this.c1.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.d1 != null) {
            if (this.b1.getVisibility() == 0) {
                i = (int) (this.b1.getBottom() + this.b1.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.d1.setBounds(0, i, getWidth(), this.d1.getIntrinsicHeight() + i);
            this.d1.draw(canvas);
        }
    }

    @Override // o.InterfaceC10485wW
    public boolean e() {
        F();
        return this.c1.e();
    }

    @Override // o.InterfaceC10485wW
    public boolean f() {
        F();
        return this.c1.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // o.InterfaceC10485wW
    public void g(Menu menu, j.a aVar) {
        F();
        this.c1.g(menu, aVar);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.b1;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, o.InterfaceC10313vp1
    public int getNestedScrollAxes() {
        return this.C1.a();
    }

    @Override // o.InterfaceC10485wW
    public CharSequence getTitle() {
        F();
        return this.c1.getTitle();
    }

    @Override // o.InterfaceC10485wW
    public boolean h() {
        F();
        return this.c1.h();
    }

    @Override // o.InterfaceC10485wW
    public void i() {
        F();
        this.c1.i();
    }

    @Override // o.InterfaceC10485wW
    public boolean j() {
        F();
        return this.c1.j();
    }

    @Override // o.InterfaceC10485wW
    public boolean k() {
        F();
        return this.c1.k();
    }

    @Override // o.InterfaceC10485wW
    public void l(SparseArray<Parcelable> sparseArray) {
        F();
        this.c1.I(sparseArray);
    }

    @Override // o.InterfaceC10485wW
    public void m(int i) {
        F();
        if (i != 2) {
            if (i != 5) {
                if (i != 109) {
                    return;
                }
                setOverlayMode(true);
                return;
            }
            this.c1.S();
            return;
        }
        this.c1.z();
    }

    @Override // o.InterfaceC9827tp1
    public void n(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // o.InterfaceC9827tp1
    public void o(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        F();
        RL2 M = RL2.M(windowInsets, this);
        boolean c2 = c(this.b1, new Rect(M.p(), M.r(), M.q(), M.o()), true, true, false, true);
        C6516gH2.p(this, M, this.k1);
        Rect rect = this.k1;
        RL2 x = M.x(rect.left, rect.top, rect.right, rect.bottom);
        this.s1 = x;
        boolean z = true;
        if (!this.t1.equals(x)) {
            this.t1 = this.s1;
            c2 = true;
        }
        if (!this.l1.equals(this.k1)) {
            this.l1.set(this.k1);
        } else {
            z = c2;
        }
        if (z) {
            requestLayout();
        }
        return M.a().c().b().K();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A(getContext());
        C6516gH2.C1(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        F();
        measureChildWithMargins(this.b1, i, 0, i2, 0);
        e eVar = (e) this.b1.getLayoutParams();
        int max = Math.max(0, this.b1.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.b1.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.b1.getMeasuredState());
        if ((C6516gH2.H0(this) & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            measuredHeight = this.Y0;
            if (this.f1 && this.b1.getTabContainer() != null) {
                measuredHeight += this.Y0;
            }
        } else {
            measuredHeight = this.b1.getVisibility() != 8 ? this.b1.getMeasuredHeight() : 0;
        }
        this.m1.set(this.k1);
        this.u1 = this.s1;
        if (!this.e1 && !z && v()) {
            Rect rect = this.m1;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.u1 = this.u1.x(0, measuredHeight, 0, 0);
        } else {
            this.u1 = new RL2.b(this.u1).h(C9246rQ0.d(this.u1.p(), this.u1.r() + measuredHeight, this.u1.q(), this.u1.o())).a();
        }
        c(this.a1, this.m1, true, true, true, true);
        if (!this.v1.equals(this.u1)) {
            RL2 rl2 = this.u1;
            this.v1 = rl2;
            C6516gH2.q(this.a1, rl2);
        }
        measureChildWithMargins(this.a1, i, 0, i2, 0);
        e eVar2 = (e) this.a1.getLayoutParams();
        int max3 = Math.max(max, this.a1.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.a1.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.a1.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (this.g1 && z) {
            if (H(f3)) {
                a();
            } else {
                G();
            }
            this.h1 = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.i1 + i2;
        this.i1 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.C1.b(view, view2, i);
        this.i1 = getActionBarHideOffset();
        z();
        d dVar = this.w1;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != 0 && this.b1.getVisibility() == 0) {
            return this.g1;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public void onStopNestedScroll(View view) {
        if (this.g1 && !this.h1) {
            if (this.i1 <= this.b1.getHeight()) {
                E();
            } else {
                D();
            }
        }
        d dVar = this.w1;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        super.onWindowSystemUiVisibilityChanged(i);
        F();
        int i2 = this.j1 ^ i;
        this.j1 = i;
        boolean z2 = false;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        }
        d dVar = this.w1;
        if (dVar != null) {
            dVar.c(!z2);
            if (!z && z2) {
                this.w1.d();
            } else {
                this.w1.a();
            }
        }
        if ((i2 & 256) != 0 && this.w1 != null) {
            C6516gH2.C1(this);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.Z0 = i;
        d dVar = this.w1;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i);
        }
    }

    @Override // o.InterfaceC9827tp1
    public void p(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // o.InterfaceC10485wW
    public void q() {
        F();
        this.c1.D();
    }

    @Override // o.InterfaceC10485wW
    public void r(SparseArray<Parcelable> sparseArray) {
        F();
        this.c1.O(sparseArray);
    }

    @Override // o.InterfaceC10070up1
    public void s(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        t(view, i, i2, i3, i4, i5);
    }

    public void setActionBarHideOffset(int i) {
        z();
        this.b1.setTranslationY(-Math.max(0, Math.min(i, this.b1.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.w1 = dVar;
        if (getWindowToken() != null) {
            this.w1.onWindowVisibilityChanged(this.Z0);
            int i = this.j1;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C6516gH2.C1(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.g1) {
            this.g1 = z;
            if (!z) {
                z();
                setActionBarHideOffset(0);
            }
        }
    }

    @Override // o.InterfaceC10485wW
    public void setIcon(int i) {
        F();
        this.c1.setIcon(i);
    }

    @Override // o.InterfaceC10485wW
    public void setLogo(int i) {
        F();
        this.c1.setLogo(i);
    }

    public void setOverlayMode(boolean z) {
        this.e1 = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    @Override // o.InterfaceC10485wW
    public void setUiOptions(int i) {
    }

    @Override // o.InterfaceC10485wW
    public void setWindowCallback(Window.Callback callback) {
        F();
        this.c1.setWindowCallback(callback);
    }

    @Override // o.InterfaceC10485wW
    public void setWindowTitle(CharSequence charSequence) {
        F();
        this.c1.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // o.InterfaceC9827tp1
    public void t(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // o.InterfaceC9827tp1
    public boolean u(View view, View view2, int i, int i2) {
        if (i2 == 0 && onStartNestedScroll(view, view2, i)) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        C6516gH2.p(this.D1, H1, this.n1);
        return !this.n1.equals(I1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: w */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: x */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final InterfaceC10728xW y(View view) {
        if (view instanceof InterfaceC10728xW) {
            return (InterfaceC10728xW) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void z() {
        removeCallbacks(this.A1);
        removeCallbacks(this.B1);
        ViewPropertyAnimator viewPropertyAnimator = this.y1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Z0 = 0;
        this.k1 = new Rect();
        this.l1 = new Rect();
        this.m1 = new Rect();
        this.n1 = new Rect();
        this.o1 = new Rect();
        this.p1 = new Rect();
        this.q1 = new Rect();
        this.r1 = new Rect();
        RL2 rl2 = RL2.c;
        this.s1 = rl2;
        this.t1 = rl2;
        this.u1 = rl2;
        this.v1 = rl2;
        this.z1 = new a();
        this.A1 = new b();
        this.B1 = new c();
        A(context);
        this.C1 = new C10559wp1(this);
        f fVar = new f(context);
        this.D1 = fVar;
        addView(fVar);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // o.InterfaceC10485wW
    public void setIcon(Drawable drawable) {
        F();
        this.c1.setIcon(drawable);
    }
}
