package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import o.C10122v20;
import o.C10534wj0;
import o.C10907yF1;
import o.C10920yI2;
import o.C10991yc;
import o.C4297Tc1;
import o.C6516gH2;
import o.C6597gd1;
import o.C7025iN1;
import o.C7608kn2;
import o.C8333ni0;
import o.C9038qc;
import o.C9076ql1;
import o.D60;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC2981Fp2;
import o.InterfaceC3373Jp2;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC5917ds2;
import o.InterfaceC6826ha;
import o.InterfaceC6946i32;
import o.InterfaceC7829li0;
import o.InterfaceC9154r30;
import o.JF;
import o.K60;
import o.N22;
import o.O22;
import o.PK1;
import o.PL0;
import o.YI2;

/* loaded from: classes3.dex */
public class FloatingActionButton extends YI2 implements InterfaceC2981Fp2, InterfaceC3373Jp2, InterfaceC7829li0, InterfaceC6946i32, CoordinatorLayout.b {
    public static final String p1 = "com.google.android.material.floatingactionbutton.FloatingActionButton";
    public static final String q1 = "FloatingActionButton";
    public static final String r1 = "expandableWidgetHelper";
    public static final int s1 = C7025iN1.n.Widget_Design_FloatingActionButton;
    public static final int t1 = 1;
    public static final int u1 = 0;
    public static final int v1 = -1;
    public static final int w1 = 0;
    public static final int x1 = 470;
    @InterfaceC11300zs1
    public ColorStateList Z0;
    @InterfaceC11300zs1
    public PorterDuff.Mode a1;
    @InterfaceC11300zs1
    public ColorStateList b1;
    @InterfaceC11300zs1
    public PorterDuff.Mode c1;
    @InterfaceC11300zs1
    public ColorStateList d1;
    public int e1;
    public int f1;
    public int g1;
    public int h1;
    public int i1;
    public boolean j1;
    public final Rect k1;
    public final Rect l1;
    @InterfaceC5670cr1
    public final C10991yc m1;
    @InterfaceC5670cr1
    public final C8333ni0 n1;
    public com.google.android.material.floatingactionbutton.a o1;

    /* loaded from: classes3.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean N(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 FloatingActionButton floatingActionButton, @InterfaceC5670cr1 Rect rect) {
            return super.i(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean P() {
            return super.P();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean S(CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 FloatingActionButton floatingActionButton, View view) {
            return super.p(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean T(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 FloatingActionButton floatingActionButton, int i) {
            return super.t(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void U(boolean z) {
            super.U(z);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        @InterfaceC5056aJ2
        public /* bridge */ /* synthetic */ void V(b bVar) {
            super.V(bVar);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void o(@InterfaceC5670cr1 CoordinatorLayout.g gVar) {
            super.o(gVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes3.dex */
    public class a implements a.g {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.a.g
        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.a.g
        public void b() {
            this.a.a(FloatingActionButton.this);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    /* loaded from: classes3.dex */
    public class c implements N22 {
        public c() {
        }

        @Override // o.N22
        public void a(@InterfaceC11300zs1 Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // o.N22
        public void b(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.k1.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.h1, i2 + FloatingActionButton.this.h1, i3 + FloatingActionButton.this.h1, i4 + FloatingActionButton.this.h1);
        }

        @Override // o.N22
        public boolean c() {
            return FloatingActionButton.this.j1;
        }

        @Override // o.N22
        public float d() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface d {
    }

    /* loaded from: classes3.dex */
    public class e<T extends FloatingActionButton> implements a.f {
        @InterfaceC5670cr1
        public final InterfaceC5917ds2<T> a;

        public e(@InterfaceC5670cr1 InterfaceC5917ds2<T> interfaceC5917ds2) {
            this.a = interfaceC5917ds2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.a.f
        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.a.f
        public void b() {
            this.a.a(FloatingActionButton.this);
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if ((obj instanceof e) && ((e) obj).a.equals(this.a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public FloatingActionButton(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    private com.google.android.material.floatingactionbutton.a getImpl() {
        if (this.o1 == null) {
            this.o1 = new com.google.android.material.floatingactionbutton.a(this, new c());
        }
        return this.o1;
    }

    @InterfaceC11300zs1
    public final a.g A(@InterfaceC11300zs1 b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    @Override // o.InterfaceC8090mi0
    public boolean a() {
        return this.n1.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public void e(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void f(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    public void g(@InterfaceC5670cr1 InterfaceC5917ds2<? extends FloatingActionButton> interfaceC5917ds2) {
        getImpl().g(new e(interfaceC5917ds2));
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return p1;
    }

    @Override // android.view.View
    @InterfaceC11300zs1
    public ColorStateList getBackgroundTintList() {
        return this.Z0;
    }

    @Override // android.view.View
    @InterfaceC11300zs1
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.a1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @InterfaceC5670cr1
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().p();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().s();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().u();
    }

    @InterfaceC11300zs1
    public Drawable getContentBackground() {
        return getImpl().o();
    }

    @PK1
    public int getCustomSize() {
        return this.g1;
    }

    @Override // o.InterfaceC7829li0
    public int getExpandedComponentIdHint() {
        return this.n1.b();
    }

    @InterfaceC11300zs1
    public C9076ql1 getHideMotionSpec() {
        return getImpl().r();
    }

    @JF
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.d1;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @InterfaceC11300zs1
    public ColorStateList getRippleColorStateList() {
        return this.d1;
    }

    @Override // o.InterfaceC6946i32
    @InterfaceC5670cr1
    public O22 getShapeAppearanceModel() {
        return (O22) C10907yF1.l(getImpl().v());
    }

    @InterfaceC11300zs1
    public C9076ql1 getShowMotionSpec() {
        return getImpl().w();
    }

    public int getSize() {
        return this.f1;
    }

    public int getSizeDimension() {
        return k(this.f1);
    }

    @Override // o.InterfaceC2981Fp2
    @InterfaceC11300zs1
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // o.InterfaceC2981Fp2
    @InterfaceC11300zs1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // o.InterfaceC3373Jp2
    @InterfaceC11300zs1
    public ColorStateList getSupportImageTintList() {
        return this.b1;
    }

    @Override // o.InterfaceC3373Jp2
    @InterfaceC11300zs1
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.c1;
    }

    public boolean getUseCompatPadding() {
        return this.j1;
    }

    public void h() {
        setCustomSize(0);
    }

    @Deprecated
    public boolean i(@InterfaceC5670cr1 Rect rect) {
        if (!isLaidOut()) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        r(rect);
        return true;
    }

    public void j(@InterfaceC5670cr1 Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        r(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
    }

    public final int k(int i) {
        int i2 = this.g1;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(C7025iN1.f.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(C7025iN1.f.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return k(1);
        } else {
            return k(0);
        }
    }

    public final void l(@InterfaceC5670cr1 Rect rect) {
        j(rect);
        int i = -this.o1.x();
        rect.inset(i, i);
    }

    public void m() {
        n(null);
    }

    public void n(@InterfaceC11300zs1 b bVar) {
        o(bVar, true);
    }

    public void o(@InterfaceC11300zs1 b bVar, boolean z) {
        getImpl().y(A(bVar), z);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().D();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().F();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.h1 = (sizeDimension - this.i1) / 2;
        getImpl().g0();
        int min = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.k1;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C10534wj0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C10534wj0 c10534wj0 = (C10534wj0) parcelable;
        super.onRestoreInstanceState(c10534wj0.a());
        this.n1.d((Bundle) C10907yF1.l(c10534wj0.Z.get(r1)));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        C10534wj0 c10534wj0 = new C10534wj0(onSaveInstanceState);
        c10534wj0.Z.put(r1, this.n1.e());
        return c10534wj0;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@InterfaceC5670cr1 MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            l(this.l1);
            if (!this.l1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean p() {
        return getImpl().B();
    }

    public boolean q() {
        return getImpl().C();
    }

    public final void r(@InterfaceC5670cr1 Rect rect) {
        int i = rect.left;
        Rect rect2 = this.k1;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void s() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.b1;
        if (colorStateList == null) {
            D60.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.c1;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C9038qc.e(colorForState, mode));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i(q1, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i(q1, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i(q1, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.Z0 != colorStateList) {
            this.Z0 = colorStateList;
            getImpl().O(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        if (this.a1 != mode) {
            this.a1 = mode;
            getImpl().P(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().Q(f);
    }

    public void setCompatElevationResource(@InterfaceC9154r30 int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().T(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(@InterfaceC9154r30 int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().X(f);
    }

    public void setCompatPressedTranslationZResource(@InterfaceC9154r30 int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(@PK1 int i) {
        if (i >= 0) {
            if (i != this.g1) {
                this.g1 = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().h0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().q()) {
            getImpl().R(z);
            requestLayout();
        }
    }

    @Override // o.InterfaceC8090mi0
    public boolean setExpanded(boolean z) {
        return this.n1.f(z);
    }

    @Override // o.InterfaceC7829li0
    public void setExpandedComponentIdHint(@PL0 int i) {
        this.n1.g(i);
    }

    public void setHideMotionSpec(@InterfaceC11300zs1 C9076ql1 c9076ql1) {
        getImpl().S(c9076ql1);
    }

    public void setHideMotionSpecResource(@InterfaceC6826ha int i) {
        setHideMotionSpec(C9076ql1.d(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@InterfaceC11300zs1 Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().f0();
            if (this.b1 != null) {
                s();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@K60 int i) {
        this.m1.i(i);
        s();
    }

    public void setMaxImageSize(int i) {
        this.i1 = i;
        getImpl().V(i);
    }

    public void setRippleColor(@JF int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().J();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().J();
    }

    @HT1({HT1.a.Y})
    @InterfaceC5056aJ2
    public void setShadowPaddingEnabled(boolean z) {
        getImpl().Z(z);
    }

    @Override // o.InterfaceC6946i32
    public void setShapeAppearanceModel(@InterfaceC5670cr1 O22 o22) {
        getImpl().a0(o22);
    }

    public void setShowMotionSpec(@InterfaceC11300zs1 C9076ql1 c9076ql1) {
        getImpl().b0(c9076ql1);
    }

    public void setShowMotionSpecResource(@InterfaceC6826ha int i) {
        setShowMotionSpec(C9076ql1.d(getContext(), i));
    }

    public void setSize(int i) {
        this.g1 = 0;
        if (i != this.f1) {
            this.f1 = i;
            requestLayout();
        }
    }

    @Override // o.InterfaceC2981Fp2
    public void setSupportBackgroundTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // o.InterfaceC2981Fp2
    public void setSupportBackgroundTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // o.InterfaceC3373Jp2
    public void setSupportImageTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.b1 != colorStateList) {
            this.b1 = colorStateList;
            s();
        }
    }

    @Override // o.InterfaceC3373Jp2
    public void setSupportImageTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        if (this.c1 != mode) {
            this.c1 = mode;
            s();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().K();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().K();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().K();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.j1 != z) {
            this.j1 = z;
            getImpl().E();
        }
    }

    @Override // o.YI2, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void t(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        getImpl().L(animatorListener);
    }

    public void u(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        getImpl().M(animatorListener);
    }

    public void v(@InterfaceC5670cr1 InterfaceC5917ds2<? extends FloatingActionButton> interfaceC5917ds2) {
        getImpl().N(new e(interfaceC5917ds2));
    }

    public boolean w() {
        return getImpl().q();
    }

    public void x() {
        y(null);
    }

    public void y(@InterfaceC11300zs1 b bVar) {
        z(bVar, true);
    }

    public void z(@InterfaceC11300zs1 b bVar, boolean z) {
        getImpl().e0(A(bVar), z);
    }

    /* loaded from: classes3.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        public static final boolean Y0 = true;
        public Rect X;
        public b Y;
        public boolean Z;

        public BaseBehavior() {
            this.Z = true;
        }

        private static boolean Q(@InterfaceC5670cr1 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                return ((CoordinatorLayout.g) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: N */
        public boolean i(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 FloatingActionButton floatingActionButton, @InterfaceC5670cr1 Rect rect) {
            Rect rect2 = floatingActionButton.k1;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final boolean O(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 FloatingActionButton floatingActionButton) {
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) floatingActionButton.getLayoutParams();
            if (!this.Z || gVar.e() != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return true;
            }
            return false;
        }

        public boolean P() {
            return this.Z;
        }

        public final void R(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.k1;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.g gVar = (CoordinatorLayout.g) floatingActionButton.getLayoutParams();
                int i2 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) gVar).rightMargin) {
                    i = rect.right;
                } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) gVar).leftMargin) {
                    i = -rect.left;
                } else {
                    i = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) gVar).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    C6516gH2.k1(floatingActionButton, i2);
                }
                if (i != 0) {
                    C6516gH2.j1(floatingActionButton, i);
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: S */
        public boolean p(CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                W(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (Q(view)) {
                X(view, floatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: T */
        public boolean t(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 FloatingActionButton floatingActionButton, int i) {
            List<View> w = coordinatorLayout.w(floatingActionButton);
            int size = w.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = w.get(i2);
                if (view instanceof AppBarLayout) {
                    if (W(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (Q(view) && X(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.N(floatingActionButton, i);
            R(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void U(boolean z) {
            this.Z = z;
        }

        @InterfaceC5056aJ2
        public void V(b bVar) {
            this.Y = bVar;
        }

        public final boolean W(CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 AppBarLayout appBarLayout, @InterfaceC5670cr1 FloatingActionButton floatingActionButton) {
            if (O(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.X == null) {
                this.X = new Rect();
            }
            Rect rect = this.X;
            C10122v20.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.o(this.Y, false);
                return true;
            }
            floatingActionButton.z(this.Y, false);
            return true;
        }

        public final boolean X(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 FloatingActionButton floatingActionButton) {
            if (O(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.o(this.Y, false);
                return true;
            }
            floatingActionButton.z(this.Y, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void o(@InterfaceC5670cr1 CoordinatorLayout.g gVar) {
            if (gVar.h == 0) {
                gVar.h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7025iN1.o.b4);
            this.Z = obtainStyledAttributes.getBoolean(C7025iN1.o.c4, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.floatingActionButtonStyle);
    }

    public void setRippleColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.d1 != colorStateList) {
            this.d1 = colorStateList;
            getImpl().Y(this.d1);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FloatingActionButton(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r4), attributeSet, i);
        int i2 = s1;
        this.k1 = new Rect();
        this.l1 = new Rect();
        Context context2 = getContext();
        TypedArray k = C7608kn2.k(context2, attributeSet, C7025iN1.o.J3, i, i2, new int[0]);
        this.Z0 = C4297Tc1.a(context2, k, C7025iN1.o.L3);
        this.a1 = C10920yI2.t(k.getInt(C7025iN1.o.M3, -1), null);
        this.d1 = C4297Tc1.a(context2, k, C7025iN1.o.W3);
        this.f1 = k.getInt(C7025iN1.o.R3, -1);
        this.g1 = k.getDimensionPixelSize(C7025iN1.o.Q3, 0);
        this.e1 = k.getDimensionPixelSize(C7025iN1.o.N3, 0);
        float dimension = k.getDimension(C7025iN1.o.O3, 0.0f);
        float dimension2 = k.getDimension(C7025iN1.o.T3, 0.0f);
        float dimension3 = k.getDimension(C7025iN1.o.V3, 0.0f);
        this.j1 = k.getBoolean(C7025iN1.o.a4, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C7025iN1.f.mtrl_fab_min_touch_target);
        setMaxImageSize(k.getDimensionPixelSize(C7025iN1.o.U3, 0));
        C9076ql1 c2 = C9076ql1.c(context2, k, C7025iN1.o.Z3);
        C9076ql1 c3 = C9076ql1.c(context2, k, C7025iN1.o.S3);
        O22 m = O22.g(context2, attributeSet, i, i2, O22.n).m();
        boolean z = k.getBoolean(C7025iN1.o.P3, false);
        setEnabled(k.getBoolean(C7025iN1.o.K3, true));
        k.recycle();
        C10991yc c10991yc = new C10991yc(this);
        this.m1 = c10991yc;
        c10991yc.g(attributeSet, i);
        this.n1 = new C8333ni0(this);
        getImpl().a0(m);
        getImpl().A(this.Z0, this.a1, this.d1, this.e1);
        getImpl().W(dimensionPixelSize);
        getImpl().Q(dimension);
        getImpl().T(dimension2);
        getImpl().X(dimension3);
        getImpl().b0(c2);
        getImpl().S(c3);
        getImpl().R(z);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
