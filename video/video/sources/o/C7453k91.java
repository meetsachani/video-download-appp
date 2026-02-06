package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.C7025iN1;

/* renamed from: o.k91  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7453k91 extends CardView implements Checkable, InterfaceC6946i32 {
    public static final int[] m1 = {16842911};
    public static final int[] n1 = {16842912};
    public static final int[] o1 = {C7025iN1.c.state_dragged};
    public static final int p1 = C7025iN1.n.Widget_MaterialComponents_CardView;
    public static final String q1 = "MaterialCardView";
    public static final String r1 = "androidx.cardview.widget.CardView";
    public static final int s1 = 8388659;
    public static final int t1 = 8388691;
    public static final int u1 = 8388661;
    public static final int v1 = 8388693;
    @InterfaceC5670cr1
    public final C7957m91 h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public b l1;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.k91$a */
    /* loaded from: classes3.dex */
    public @interface a {
    }

    /* renamed from: o.k91$b */
    /* loaded from: classes3.dex */
    public interface b {
        void a(C7453k91 c7453k91, boolean z);
    }

    public C7453k91(Context context) {
        this(context, null);
    }

    @InterfaceC5670cr1
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.h1.j().getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    @InterfaceC5670cr1
    public ColorStateList getCardBackgroundColor() {
        return this.h1.k();
    }

    @InterfaceC5670cr1
    public ColorStateList getCardForegroundColor() {
        return this.h1.l();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @InterfaceC11300zs1
    public Drawable getCheckedIcon() {
        return this.h1.m();
    }

    public int getCheckedIconGravity() {
        return this.h1.n();
    }

    @InterfaceC9397s30
    public int getCheckedIconMargin() {
        return this.h1.o();
    }

    @InterfaceC9397s30
    public int getCheckedIconSize() {
        return this.h1.p();
    }

    @InterfaceC11300zs1
    public ColorStateList getCheckedIconTint() {
        return this.h1.q();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.h1.A().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.h1.A().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.h1.A().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.h1.A().top;
    }

    @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.h1.u();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.h1.s();
    }

    public ColorStateList getRippleColor() {
        return this.h1.v();
    }

    @Override // o.InterfaceC6946i32
    @InterfaceC5670cr1
    public O22 getShapeAppearanceModel() {
        return this.h1.w();
    }

    @JF
    @Deprecated
    public int getStrokeColor() {
        return this.h1.x();
    }

    @InterfaceC11300zs1
    public ColorStateList getStrokeColorStateList() {
        return this.h1.y();
    }

    @InterfaceC9397s30
    public int getStrokeWidth() {
        return this.h1.z();
    }

    @Override // androidx.cardview.widget.CardView
    public void h(int i, int i2, int i3, int i4) {
        this.h1.Z(i, i2, i3, i4);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.j1;
    }

    public final void j() {
        if (Build.VERSION.SDK_INT > 26) {
            this.h1.i();
        }
    }

    public boolean k() {
        C7957m91 c7957m91 = this.h1;
        if (c7957m91 != null && c7957m91.D()) {
            return true;
        }
        return false;
    }

    public boolean l() {
        return this.k1;
    }

    public void m(int i, int i2, int i3, int i4) {
        super.h(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h1.d0();
        C4491Vc1.f(this, this.h1.j());
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (k()) {
            View.mergeDrawableStates(onCreateDrawableState, m1);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, n1);
        }
        if (l()) {
            View.mergeDrawableStates(onCreateDrawableState, o1);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@InterfaceC5670cr1 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(r1);
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@InterfaceC5670cr1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(r1);
        accessibilityNodeInfo.setCheckable(k());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.h1.H(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.i1) {
            if (!this.h1.C()) {
                Log.i(q1, "Setting a custom background is not supported.");
                this.h1.I(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@JF int i) {
        this.h1.J(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.h1.f0();
    }

    public void setCardForegroundColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.h1.K(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.h1.L(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.j1 != z) {
            toggle();
        }
    }

    public void setCheckedIcon(@InterfaceC11300zs1 Drawable drawable) {
        this.h1.O(drawable);
    }

    public void setCheckedIconGravity(int i) {
        if (this.h1.n() != i) {
            this.h1.P(i);
        }
    }

    public void setCheckedIconMargin(@InterfaceC9397s30 int i) {
        this.h1.Q(i);
    }

    public void setCheckedIconMarginResource(@InterfaceC9154r30 int i) {
        if (i != -1) {
            this.h1.Q(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(@K60 int i) {
        this.h1.O(C3220Ic.b(getContext(), i));
    }

    public void setCheckedIconSize(@InterfaceC9397s30 int i) {
        this.h1.R(i);
    }

    public void setCheckedIconSizeResource(@InterfaceC9154r30 int i) {
        if (i != 0) {
            this.h1.R(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.h1.S(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        C7957m91 c7957m91 = this.h1;
        if (c7957m91 != null) {
            c7957m91.d0();
        }
    }

    public void setDragged(boolean z) {
        if (this.k1 != z) {
            this.k1 = z;
            refreshDrawableState();
            j();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.h1.h0();
    }

    public void setOnCheckedChangeListener(@InterfaceC11300zs1 b bVar) {
        this.l1 = bVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.h1.h0();
        this.h1.e0();
    }

    public void setProgress(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
        this.h1.U(f);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.h1.T(f);
    }

    public void setRippleColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.h1.V(colorStateList);
    }

    public void setRippleColorResource(@InterfaceC6509gG int i) {
        this.h1.V(C3220Ic.a(getContext(), i));
    }

    @Override // o.InterfaceC6946i32
    public void setShapeAppearanceModel(@InterfaceC5670cr1 O22 o22) {
        setClipToOutline(o22.v(getBoundsAsRectF()));
        this.h1.W(o22);
    }

    public void setStrokeColor(@JF int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(@InterfaceC9397s30 int i) {
        this.h1.Y(i);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.h1.h0();
        this.h1.e0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (k() && isEnabled()) {
            this.j1 = !this.j1;
            refreshDrawableState();
            j();
            this.h1.N(this.j1, true);
            b bVar = this.l1;
            if (bVar != null) {
                bVar.a(this, this.j1);
            }
        }
    }

    public C7453k91(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.materialCardViewStyle);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.h1.J(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.h1.X(colorStateList);
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7453k91(Context context, AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r4), attributeSet, i);
        int i2 = p1;
        this.j1 = false;
        this.k1 = false;
        this.i1 = true;
        TypedArray k = C7608kn2.k(getContext(), attributeSet, C7025iN1.o.t6, i, i2, new int[0]);
        C7957m91 c7957m91 = new C7957m91(this, attributeSet, i, i2);
        this.h1 = c7957m91;
        c7957m91.J(super.getCardBackgroundColor());
        c7957m91.Z(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c7957m91.G(k);
        k.recycle();
    }
}
