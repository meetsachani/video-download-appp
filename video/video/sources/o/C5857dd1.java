package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import o.C7025iN1;

/* renamed from: o.dd1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5857dd1 extends C6367fj2 {
    public static final int n2 = C7025iN1.n.Widget_Material3_CompoundButton_MaterialSwitch;
    public static final int[] o2 = {C7025iN1.c.state_with_icon};
    @InterfaceC11300zs1
    public Drawable a2;
    @InterfaceC11300zs1
    public Drawable b2;
    @PK1
    public int c2;
    @InterfaceC11300zs1
    public Drawable d2;
    @InterfaceC11300zs1
    public Drawable e2;
    @InterfaceC11300zs1
    public ColorStateList f2;
    @InterfaceC11300zs1
    public ColorStateList g2;
    @InterfaceC5670cr1
    public PorterDuff.Mode h2;
    @InterfaceC11300zs1
    public ColorStateList i2;
    @InterfaceC11300zs1
    public ColorStateList j2;
    @InterfaceC5670cr1
    public PorterDuff.Mode k2;
    public int[] l2;
    public int[] m2;

    public C5857dd1(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public static void u(@InterfaceC11300zs1 Drawable drawable, @InterfaceC11300zs1 ColorStateList colorStateList, @InterfaceC5670cr1 int[] iArr, @InterfaceC5670cr1 int[] iArr2, float f) {
        if (drawable != null && colorStateList != null) {
            drawable.setTint(C9205rG.j(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
        }
    }

    @Override // o.C6367fj2
    @InterfaceC11300zs1
    public Drawable getThumbDrawable() {
        return this.a2;
    }

    @InterfaceC11300zs1
    public Drawable getThumbIconDrawable() {
        return this.b2;
    }

    @PK1
    public int getThumbIconSize() {
        return this.c2;
    }

    @InterfaceC11300zs1
    public ColorStateList getThumbIconTintList() {
        return this.g2;
    }

    @InterfaceC5670cr1
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.h2;
    }

    @Override // o.C6367fj2
    @InterfaceC11300zs1
    public ColorStateList getThumbTintList() {
        return this.f2;
    }

    @InterfaceC11300zs1
    public Drawable getTrackDecorationDrawable() {
        return this.e2;
    }

    @InterfaceC11300zs1
    public ColorStateList getTrackDecorationTintList() {
        return this.j2;
    }

    @InterfaceC5670cr1
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.k2;
    }

    @Override // o.C6367fj2
    @InterfaceC11300zs1
    public Drawable getTrackDrawable() {
        return this.d2;
    }

    @Override // o.C6367fj2
    @InterfaceC11300zs1
    public ColorStateList getTrackTintList() {
        return this.i2;
    }

    @Override // android.view.View
    public void invalidate() {
        v();
        super.invalidate();
    }

    @Override // o.C6367fj2, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.b2 != null) {
            View.mergeDrawableStates(onCreateDrawableState, o2);
        }
        this.l2 = Z60.j(onCreateDrawableState);
        this.m2 = Z60.f(onCreateDrawableState);
        return onCreateDrawableState;
    }

    public final void s() {
        this.a2 = Z60.c(this.a2, this.f2, getThumbTintMode());
        this.b2 = Z60.c(this.b2, this.g2, this.h2);
        v();
        Drawable drawable = this.a2;
        Drawable drawable2 = this.b2;
        int i = this.c2;
        super.setThumbDrawable(Z60.b(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    @Override // o.C6367fj2
    public void setThumbDrawable(@InterfaceC11300zs1 Drawable drawable) {
        this.a2 = drawable;
        s();
    }

    public void setThumbIconDrawable(@InterfaceC11300zs1 Drawable drawable) {
        this.b2 = drawable;
        s();
    }

    public void setThumbIconResource(@K60 int i) {
        setThumbIconDrawable(C3220Ic.b(getContext(), i));
    }

    public void setThumbIconSize(@PK1 int i) {
        if (this.c2 != i) {
            this.c2 = i;
            s();
        }
    }

    public void setThumbIconTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.g2 = colorStateList;
        s();
    }

    public void setThumbIconTintMode(@InterfaceC5670cr1 PorterDuff.Mode mode) {
        this.h2 = mode;
        s();
    }

    @Override // o.C6367fj2
    public void setThumbTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.f2 = colorStateList;
        s();
    }

    @Override // o.C6367fj2
    public void setThumbTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        s();
    }

    public void setTrackDecorationDrawable(@InterfaceC11300zs1 Drawable drawable) {
        this.e2 = drawable;
        t();
    }

    public void setTrackDecorationResource(@K60 int i) {
        setTrackDecorationDrawable(C3220Ic.b(getContext(), i));
    }

    public void setTrackDecorationTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.j2 = colorStateList;
        t();
    }

    public void setTrackDecorationTintMode(@InterfaceC5670cr1 PorterDuff.Mode mode) {
        this.k2 = mode;
        t();
    }

    @Override // o.C6367fj2
    public void setTrackDrawable(@InterfaceC11300zs1 Drawable drawable) {
        this.d2 = drawable;
        t();
    }

    @Override // o.C6367fj2
    public void setTrackTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.i2 = colorStateList;
        t();
    }

    @Override // o.C6367fj2
    public void setTrackTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        t();
    }

    public final void t() {
        this.d2 = Z60.c(this.d2, this.i2, getTrackTintMode());
        this.e2 = Z60.c(this.e2, this.j2, this.k2);
        v();
        Drawable drawable = this.d2;
        if (drawable != null && this.e2 != null) {
            drawable = new LayerDrawable(new Drawable[]{this.d2, this.e2});
        } else if (drawable == null) {
            drawable = this.e2;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    public final void v() {
        if (this.f2 != null || this.g2 != null || this.i2 != null || this.j2 != null) {
            float thumbPosition = getThumbPosition();
            ColorStateList colorStateList = this.f2;
            if (colorStateList != null) {
                u(this.a2, colorStateList, this.l2, this.m2, thumbPosition);
            }
            ColorStateList colorStateList2 = this.g2;
            if (colorStateList2 != null) {
                u(this.b2, colorStateList2, this.l2, this.m2, thumbPosition);
            }
            ColorStateList colorStateList3 = this.i2;
            if (colorStateList3 != null) {
                u(this.d2, colorStateList3, this.l2, this.m2, thumbPosition);
            }
            ColorStateList colorStateList4 = this.j2;
            if (colorStateList4 != null) {
                u(this.e2, colorStateList4, this.l2, this.m2, thumbPosition);
            }
        }
    }

    public C5857dd1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.materialSwitchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5857dd1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r4), attributeSet, i);
        int i2 = n2;
        this.c2 = -1;
        Context context2 = getContext();
        this.a2 = super.getThumbDrawable();
        this.f2 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.d2 = super.getTrackDrawable();
        this.i2 = super.getTrackTintList();
        super.setTrackTintList(null);
        C2872Ep2 l = C7608kn2.l(context2, attributeSet, C7025iN1.o.l7, i, i2, new int[0]);
        this.b2 = l.h(C7025iN1.o.m7);
        this.c2 = l.g(C7025iN1.o.n7, -1);
        this.g2 = l.d(C7025iN1.o.o7);
        int o3 = l.o(C7025iN1.o.p7, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.h2 = C10920yI2.t(o3, mode);
        this.e2 = l.h(C7025iN1.o.q7);
        this.j2 = l.d(C7025iN1.o.r7);
        this.k2 = C10920yI2.t(l.o(C7025iN1.o.s7, -1), mode);
        l.I();
        setEnforceSwitchWidth(false);
        s();
        t();
    }
}
