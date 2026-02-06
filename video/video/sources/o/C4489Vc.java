package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: o.Vc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4489Vc extends ToggleButton implements InterfaceC2981Fp2, InterfaceC10984ya0, InterfaceC3275Ip2 {
    public final C3705Nb Y0;
    public final C3904Pc Z0;
    public C10016uc a1;

    public C4489Vc(Context context) {
        this(context, null);
    }

    private C10016uc getEmojiTextViewHelper() {
        if (this.a1 == null) {
            this.a1 = new C10016uc(this);
        }
        return this.a1;
    }

    @Override // o.InterfaceC10984ya0
    public boolean b() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.b();
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.b();
        }
    }

    @Override // o.InterfaceC2981Fp2
    public ColorStateList getSupportBackgroundTintList() {
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            return c3705Nb.c();
        }
        return null;
    }

    @Override // o.InterfaceC2981Fp2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            return c3705Nb.d();
        }
        return null;
    }

    @Override // o.InterfaceC3275Ip2
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.Z0.j();
    }

    @Override // o.InterfaceC3275Ip2
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.Z0.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.p();
        }
    }

    @Override // o.InterfaceC10984ya0
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // o.InterfaceC2981Fp2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.i(colorStateList);
        }
    }

    @Override // o.InterfaceC2981Fp2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.j(mode);
        }
    }

    @Override // o.InterfaceC3275Ip2
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.Z0.w(colorStateList);
        this.Z0.b();
    }

    @Override // o.InterfaceC3275Ip2
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.Z0.x(mode);
        this.Z0.b();
    }

    public C4489Vc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public C4489Vc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8112mn2.a(this, getContext());
        C3705Nb c3705Nb = new C3705Nb(this);
        this.Y0 = c3705Nb;
        c3705Nb.e(attributeSet, i);
        C3904Pc c3904Pc = new C3904Pc(this);
        this.Z0 = c3904Pc;
        c3904Pc.m(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }
}
