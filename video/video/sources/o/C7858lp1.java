package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import java.util.Objects;
import o.C2705Cy;
import o.C5734d70;
import o.C7025iN1;
import o.HT1;
import o.O22;
import o.OL1;

/* renamed from: o.lp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7858lp1 extends PY1 implements InterfaceC5015a91 {
    public static final int A1 = 1;
    public static final int[] x1 = {16842912};
    public static final int[] y1 = {-16842910};
    public static final int z1 = C7025iN1.n.Widget_Design_NavigationView;
    @InterfaceC5670cr1
    public final C5420bp1 f1;
    public final C5662cp1 g1;
    public d h1;
    public final int i1;
    public final int[] j1;
    public MenuInflater k1;
    public ViewTreeObserver.OnGlobalLayoutListener l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    @PK1
    public int q1;
    public final boolean r1;
    @PK1
    public final int s1;
    public final AbstractC7187j32 t1;
    public final C4889Zc1 u1;
    public final C5258b91 v1;
    public final C5734d70.e w1;

    /* renamed from: o.lp1$a */
    /* loaded from: classes3.dex */
    public class a extends C5734d70.h {
        public a() {
        }

        @Override // o.C5734d70.h, o.C5734d70.e
        public void a(@InterfaceC5670cr1 View view) {
            C7858lp1 c7858lp1 = C7858lp1.this;
            if (view == c7858lp1) {
                final C5258b91 c5258b91 = c7858lp1.v1;
                Objects.requireNonNull(c5258b91);
                view.post(new Runnable() { // from class: o.kp1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5258b91.this.e();
                    }
                });
            }
        }

        @Override // o.C5734d70.h, o.C5734d70.e
        public void b(@InterfaceC5670cr1 View view) {
            C7858lp1 c7858lp1 = C7858lp1.this;
            if (view == c7858lp1) {
                c7858lp1.v1.f();
                C7858lp1.this.z();
            }
        }
    }

    /* renamed from: o.lp1$c */
    /* loaded from: classes3.dex */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            C7858lp1 c7858lp1 = C7858lp1.this;
            c7858lp1.getLocationOnScreen(c7858lp1.j1);
            boolean z10 = true;
            if (C7858lp1.this.j1[1] == 0) {
                z = true;
            } else {
                z = false;
            }
            C7858lp1.this.g1.G(z);
            C7858lp1 c7858lp12 = C7858lp1.this;
            if (z && c7858lp12.y()) {
                z2 = true;
            } else {
                z2 = false;
            }
            c7858lp12.setDrawTopInsetForeground(z2);
            if (C7858lp1.this.getLayoutDirection() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (C7858lp1.this.j1[0] != 0 && C7858lp1.this.j1[0] + C7858lp1.this.getWidth() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            C7858lp1 c7858lp13 = C7858lp1.this;
            if (z4 && (!z3 ? c7858lp13.x() : c7858lp13.w())) {
                z5 = true;
            } else {
                z5 = false;
            }
            c7858lp13.setDrawLeftInsetForeground(z5);
            Activity a = DM.a(C7858lp1.this.getContext());
            if (a != null) {
                Rect a2 = FM2.a(a);
                if (a2.height() - C7858lp1.this.getHeight() == C7858lp1.this.j1[1]) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (Color.alpha(a.getWindow().getNavigationBarColor()) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                C7858lp1 c7858lp14 = C7858lp1.this;
                if (z6 && z7 && c7858lp14.v()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                c7858lp14.setDrawBottomInsetForeground(z8);
                if (a2.width() != C7858lp1.this.j1[0] && a2.width() - C7858lp1.this.getWidth() != C7858lp1.this.j1[0]) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                C7858lp1 c7858lp15 = C7858lp1.this;
                if (!z9 || (!z3 ? !c7858lp15.w() : !c7858lp15.x())) {
                    z10 = false;
                }
                c7858lp15.setDrawRightInsetForeground(z10);
            }
        }
    }

    /* renamed from: o.lp1$d */
    /* loaded from: classes3.dex */
    public interface d {
        boolean a(@InterfaceC5670cr1 MenuItem menuItem);
    }

    public C7858lp1(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        if (this.k1 == null) {
            this.k1 = new C9796th2(getContext());
        }
        return this.k1;
    }

    @InterfaceC11300zs1
    private ColorStateList o(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a2 = C3220Ic.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(OL1.b.J0, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a2.getDefaultColor();
        int[] iArr = y1;
        return new ColorStateList(new int[][]{iArr, x1, FrameLayout.EMPTY_STATE_SET}, new int[]{a2.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    public final void A(@PK1 int i, @PK1 int i2) {
        boolean z;
        if ((getParent() instanceof C5734d70) && (getLayoutParams() instanceof C5734d70.f)) {
            if ((this.q1 > 0 || this.r1) && (getBackground() instanceof C4394Uc1)) {
                if (Gravity.getAbsoluteGravity(((C5734d70.f) getLayoutParams()).a, getLayoutDirection()) == 3) {
                    z = true;
                } else {
                    z = false;
                }
                C4394Uc1 c4394Uc1 = (C4394Uc1) getBackground();
                O22.b o2 = c4394Uc1.getShapeAppearanceModel().w().o(this.q1);
                if (z) {
                    o2.K(0.0f);
                    o2.x(0.0f);
                } else {
                    o2.P(0.0f);
                    o2.C(0.0f);
                }
                O22 m = o2.m();
                c4394Uc1.setShapeAppearanceModel(m);
                this.t1.g(this, m);
                this.t1.f(this, new RectF(0.0f, 0.0f, i, i2));
                this.t1.i(this, true);
            }
        }
    }

    public void B(@InterfaceC5670cr1 View view) {
        this.g1.F(view);
    }

    @InterfaceC6181ey
    public final Pair<C5734d70, C5734d70.f> C() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof C5734d70) && (layoutParams instanceof C5734d70.f)) {
            return new Pair<>((C5734d70) parent, (C5734d70.f) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    public final void D() {
        this.l1 = new c();
        getViewTreeObserver().addOnGlobalLayoutListener(this.l1);
    }

    @Override // o.InterfaceC5015a91
    public void b() {
        C();
        this.u1.f();
        z();
    }

    @Override // o.InterfaceC5015a91
    public void d(@InterfaceC5670cr1 C8827pk c8827pk) {
        C();
        this.u1.j(c8827pk);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@InterfaceC5670cr1 Canvas canvas) {
        this.t1.e(canvas, new C2705Cy.a() { // from class: o.jp1
            @Override // o.C2705Cy.a
            public final void a(Canvas canvas2) {
                super/*android.view.View*/.dispatchDraw(canvas2);
            }
        });
    }

    @Override // o.InterfaceC5015a91
    public void e(@InterfaceC5670cr1 C8827pk c8827pk) {
        this.u1.l(c8827pk, ((C5734d70.f) C().second).a);
        if (this.r1) {
            this.q1 = C5600ca.c(0, this.s1, this.u1.a(c8827pk.b()));
            A(getWidth(), getHeight());
        }
    }

    @Override // o.InterfaceC5015a91
    public void f() {
        Pair<C5734d70, C5734d70.f> C = C();
        C5734d70 c5734d70 = (C5734d70) C.first;
        C8827pk c2 = this.u1.c();
        if (c2 != null && Build.VERSION.SDK_INT >= 34) {
            this.u1.h(c2, ((C5734d70.f) C.second).a, C6219f70.b(c5734d70, this), C6219f70.c(c5734d70));
            return;
        }
        c5734d70.f(this);
    }

    @InterfaceC5056aJ2
    public C4889Zc1 getBackHelper() {
        return this.u1;
    }

    @InterfaceC11300zs1
    public MenuItem getCheckedItem() {
        return this.g1.o();
    }

    @PK1
    public int getDividerInsetEnd() {
        return this.g1.p();
    }

    @PK1
    public int getDividerInsetStart() {
        return this.g1.q();
    }

    public int getHeaderCount() {
        return this.g1.r();
    }

    @InterfaceC11300zs1
    public Drawable getItemBackground() {
        return this.g1.t();
    }

    @InterfaceC9397s30
    public int getItemHorizontalPadding() {
        return this.g1.u();
    }

    @InterfaceC9397s30
    public int getItemIconPadding() {
        return this.g1.v();
    }

    @InterfaceC11300zs1
    public ColorStateList getItemIconTintList() {
        return this.g1.y();
    }

    public int getItemMaxLines() {
        return this.g1.w();
    }

    @InterfaceC11300zs1
    public ColorStateList getItemTextColor() {
        return this.g1.x();
    }

    @PK1
    public int getItemVerticalPadding() {
        return this.g1.z();
    }

    @InterfaceC5670cr1
    public Menu getMenu() {
        return this.f1;
    }

    @PK1
    public int getSubheaderInsetEnd() {
        return this.g1.A();
    }

    @PK1
    public int getSubheaderInsetStart() {
        return this.g1.B();
    }

    @Override // o.PY1
    @HT1({HT1.a.Y})
    public void h(@InterfaceC5670cr1 RL2 rl2) {
        this.g1.n(rl2);
    }

    public void n(@InterfaceC5670cr1 View view) {
        this.g1.m(view);
    }

    @Override // o.PY1, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4491Vc1.e(this);
        ViewParent parent = getParent();
        if ((parent instanceof C5734d70) && this.v1.b()) {
            C5734d70 c5734d70 = (C5734d70) parent;
            c5734d70.O(this.w1);
            c5734d70.a(this.w1);
            if (c5734d70.D(this)) {
                this.v1.e();
            }
        }
    }

    @Override // o.PY1, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.l1);
        ViewParent parent = getParent();
        if (parent instanceof C5734d70) {
            ((C5734d70) parent).O(this.w1);
        }
        this.v1.f();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i = View.MeasureSpec.makeMeasureSpec(this.i1, 1073741824);
            }
        } else {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.i1), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.a());
        this.f1.V(eVar.Z);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        eVar.Z = bundle;
        this.f1.X(bundle);
        return eVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A(i, i2);
    }

    @InterfaceC5670cr1
    public final Drawable p(@InterfaceC5670cr1 C2872Ep2 c2872Ep2) {
        return q(c2872Ep2, C4297Tc1.b(getContext(), c2872Ep2, C7025iN1.o.n9));
    }

    @InterfaceC5670cr1
    public final Drawable q(@InterfaceC5670cr1 C2872Ep2 c2872Ep2, @InterfaceC11300zs1 ColorStateList colorStateList) {
        C4394Uc1 c4394Uc1 = new C4394Uc1(O22.b(getContext(), c2872Ep2.u(C7025iN1.o.l9, 0), c2872Ep2.u(C7025iN1.o.m9, 0)).m());
        c4394Uc1.y0(colorStateList);
        return new InsetDrawable((Drawable) c4394Uc1, c2872Ep2.g(C7025iN1.o.q9, 0), c2872Ep2.g(C7025iN1.o.r9, 0), c2872Ep2.g(C7025iN1.o.p9, 0), c2872Ep2.g(C7025iN1.o.o9, 0));
    }

    public View r(int i) {
        return this.g1.s(i);
    }

    public final boolean s(@InterfaceC5670cr1 C2872Ep2 c2872Ep2) {
        if (!c2872Ep2.C(C7025iN1.o.l9) && !c2872Ep2.C(C7025iN1.o.m9)) {
            return false;
        }
        return true;
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.n1 = z;
    }

    public void setCheckedItem(@PL0 int i) {
        MenuItem findItem = this.f1.findItem(i);
        if (findItem != null) {
            this.g1.H((androidx.appcompat.view.menu.h) findItem);
        }
    }

    public void setDividerInsetEnd(@PK1 int i) {
        this.g1.I(i);
    }

    public void setDividerInsetStart(@PK1 int i) {
        this.g1.J(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C4491Vc1.d(this, f);
    }

    public void setEndInsetScrimEnabled(boolean z) {
        this.p1 = z;
    }

    @HT1({HT1.a.Y})
    @InterfaceC5056aJ2
    public void setForceCompatClippingEnabled(boolean z) {
        this.t1.h(this, z);
    }

    public void setItemBackground(@InterfaceC11300zs1 Drawable drawable) {
        this.g1.L(drawable);
    }

    public void setItemBackgroundResource(@K60 int i) {
        setItemBackground(getContext().getDrawable(i));
    }

    public void setItemHorizontalPadding(@InterfaceC9397s30 int i) {
        this.g1.N(i);
    }

    public void setItemHorizontalPaddingResource(@InterfaceC9154r30 int i) {
        this.g1.N(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(@InterfaceC9397s30 int i) {
        this.g1.O(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.g1.O(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(@InterfaceC9397s30 int i) {
        this.g1.P(i);
    }

    public void setItemIconTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.g1.Q(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.g1.R(i);
    }

    public void setItemTextAppearance(@InterfaceC4698Xf2 int i) {
        this.g1.S(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.g1.T(z);
    }

    public void setItemTextColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.g1.U(colorStateList);
    }

    public void setItemVerticalPadding(@PK1 int i) {
        this.g1.V(i);
    }

    public void setItemVerticalPaddingResource(@InterfaceC9154r30 int i) {
        this.g1.V(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(@InterfaceC11300zs1 d dVar) {
        this.h1 = dVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C5662cp1 c5662cp1 = this.g1;
        if (c5662cp1 != null) {
            c5662cp1.W(i);
        }
    }

    public void setStartInsetScrimEnabled(boolean z) {
        this.o1 = z;
    }

    public void setSubheaderInsetEnd(@PK1 int i) {
        this.g1.Y(i);
    }

    public void setSubheaderInsetStart(@PK1 int i) {
        this.g1.Z(i);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.m1 = z;
    }

    public View t(@BY0 int i) {
        return this.g1.D(i);
    }

    public void u(int i) {
        this.g1.b0(true);
        getMenuInflater().inflate(i, this.f1);
        this.g1.b0(false);
        this.g1.i(false);
    }

    public boolean v() {
        return this.n1;
    }

    public boolean w() {
        return this.p1;
    }

    public boolean x() {
        return this.o1;
    }

    public boolean y() {
        return this.m1;
    }

    public final void z() {
        if (this.r1 && this.q1 != 0) {
            this.q1 = 0;
            A(getWidth(), getHeight());
        }
    }

    /* renamed from: o.lp1$e */
    /* loaded from: classes3.dex */
    public static class e extends J {
        public static final Parcelable.Creator<e> CREATOR = new a();
        @InterfaceC11300zs1
        public Bundle Z;

        /* renamed from: o.lp1$e$a */
        /* loaded from: classes3.dex */
        public class a implements Parcelable.ClassLoaderCreator<e> {
            @Override // android.os.Parcelable.Creator
            @InterfaceC11300zs1
            /* renamed from: a */
            public e createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @InterfaceC5670cr1
            /* renamed from: b */
            public e createFromParcel(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @InterfaceC5670cr1
            /* renamed from: c */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(@InterfaceC5670cr1 Parcel parcel, @InterfaceC11300zs1 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = parcel.readBundle(classLoader);
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.Z);
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public C7858lp1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7858lp1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r5), attributeSet, i);
        ColorStateList o2;
        int i2;
        int i3 = z1;
        C5662cp1 c5662cp1 = new C5662cp1();
        this.g1 = c5662cp1;
        this.j1 = new int[2];
        this.m1 = true;
        this.n1 = true;
        this.o1 = true;
        this.p1 = true;
        this.q1 = 0;
        this.t1 = AbstractC7187j32.a(this);
        this.u1 = new C4889Zc1(this);
        this.v1 = new C5258b91(this);
        this.w1 = new a();
        Context context2 = getContext();
        C5420bp1 c5420bp1 = new C5420bp1(context2);
        this.f1 = c5420bp1;
        C2872Ep2 l = C7608kn2.l(context2, attributeSet, C7025iN1.o.S8, i, i3, new int[0]);
        int i4 = C7025iN1.o.U8;
        if (l.C(i4)) {
            setBackground(l.h(i4));
        }
        int g = l.g(C7025iN1.o.a9, 0);
        this.q1 = g;
        this.r1 = g == 0;
        this.s1 = getResources().getDimensionPixelSize(C7025iN1.f.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList g2 = Z60.g(background);
        if (background == null || g2 != null) {
            C4394Uc1 c4394Uc1 = new C4394Uc1(O22.e(context2, attributeSet, i, i3).m());
            if (g2 != null) {
                c4394Uc1.y0(g2);
            }
            c4394Uc1.i0(context2);
            setBackground(c4394Uc1);
        }
        int i5 = C7025iN1.o.b9;
        if (l.C(i5)) {
            setElevation(l.g(i5, 0));
        }
        setFitsSystemWindows(l.a(C7025iN1.o.V8, false));
        this.i1 = l.g(C7025iN1.o.W8, 0);
        int i6 = C7025iN1.o.A9;
        ColorStateList d2 = l.C(i6) ? l.d(i6) : null;
        int i7 = C7025iN1.o.D9;
        int u = l.C(i7) ? l.u(i7, 0) : 0;
        if (u == 0 && d2 == null) {
            d2 = o(16842808);
        }
        int i8 = C7025iN1.o.i9;
        if (l.C(i8)) {
            o2 = l.d(i8);
        } else {
            o2 = o(16842808);
        }
        int i9 = C7025iN1.o.s9;
        int u2 = l.C(i9) ? l.u(i9, 0) : 0;
        boolean a2 = l.a(C7025iN1.o.t9, true);
        int i10 = C7025iN1.o.h9;
        if (l.C(i10)) {
            setItemIconSize(l.g(i10, 0));
        }
        int i11 = C7025iN1.o.u9;
        ColorStateList d3 = l.C(i11) ? l.d(i11) : null;
        if (u2 == 0 && d3 == null) {
            d3 = o(16842806);
        }
        Drawable h = l.h(C7025iN1.o.e9);
        if (h == null && s(l)) {
            h = p(l);
            ColorStateList b2 = C4297Tc1.b(context2, l, C7025iN1.o.k9);
            if (b2 != null) {
                c5662cp1.M(new RippleDrawable(QU1.e(b2), null, q(l, null)));
            }
        }
        int i12 = C7025iN1.o.f9;
        if (l.C(i12)) {
            i2 = 0;
            setItemHorizontalPadding(l.g(i12, 0));
        } else {
            i2 = 0;
        }
        int i13 = C7025iN1.o.v9;
        if (l.C(i13)) {
            setItemVerticalPadding(l.g(i13, i2));
        }
        setDividerInsetStart(l.g(C7025iN1.o.Z8, i2));
        setDividerInsetEnd(l.g(C7025iN1.o.Y8, i2));
        setSubheaderInsetStart(l.g(C7025iN1.o.C9, i2));
        setSubheaderInsetEnd(l.g(C7025iN1.o.B9, i2));
        setTopInsetScrimEnabled(l.a(C7025iN1.o.E9, this.m1));
        setBottomInsetScrimEnabled(l.a(C7025iN1.o.X8, this.n1));
        setStartInsetScrimEnabled(l.a(C7025iN1.o.z9, this.o1));
        setEndInsetScrimEnabled(l.a(C7025iN1.o.c9, this.p1));
        int g3 = l.g(C7025iN1.o.g9, 0);
        setItemMaxLines(l.o(C7025iN1.o.j9, 1));
        c5420bp1.Y(new b());
        c5662cp1.K(1);
        c5662cp1.l(context2, c5420bp1);
        if (u != 0) {
            c5662cp1.a0(u);
        }
        c5662cp1.X(d2);
        c5662cp1.Q(o2);
        c5662cp1.W(getOverScrollMode());
        if (u2 != 0) {
            c5662cp1.S(u2);
        }
        c5662cp1.T(a2);
        c5662cp1.U(d3);
        c5662cp1.L(h);
        c5662cp1.O(g3);
        c5420bp1.b(c5662cp1);
        addView((View) c5662cp1.g(this));
        int i14 = C7025iN1.o.w9;
        if (l.C(i14)) {
            u(l.u(i14, 0));
        }
        int i15 = C7025iN1.o.d9;
        if (l.C(i15)) {
            t(l.u(i15, 0));
        }
        l.I();
        D();
    }

    public void setCheckedItem(@InterfaceC5670cr1 MenuItem menuItem) {
        MenuItem findItem = this.f1.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.g1.H((androidx.appcompat.view.menu.h) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    /* renamed from: o.lp1$b */
    /* loaded from: classes3.dex */
    public class b implements e.a {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            d dVar = C7858lp1.this.h1;
            if (dVar != null && dVar.a(menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }
}
