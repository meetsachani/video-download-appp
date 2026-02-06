package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import o.OL1;

/* renamed from: o.Vb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4485Vb extends CheckBox implements InterfaceC3177Hp2, InterfaceC2981Fp2, InterfaceC10984ya0, InterfaceC3275Ip2 {
    public final C4883Zb Y0;
    public final C3705Nb Z0;
    public final C3904Pc a1;
    public C10016uc b1;

    public C4485Vb(Context context) {
        this(context, null);
    }

    private C10016uc getEmojiTextViewHelper() {
        if (this.b1 == null) {
            this.b1 = new C10016uc(this);
        }
        return this.b1;
    }

    @Override // o.InterfaceC10984ya0
    public boolean b() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3705Nb c3705Nb = this.Z0;
        if (c3705Nb != null) {
            c3705Nb.b();
        }
        C3904Pc c3904Pc = this.a1;
        if (c3904Pc != null) {
            c3904Pc.b();
        }
    }

    @Override // o.InterfaceC2981Fp2
    public ColorStateList getSupportBackgroundTintList() {
        C3705Nb c3705Nb = this.Z0;
        if (c3705Nb != null) {
            return c3705Nb.c();
        }
        return null;
    }

    @Override // o.InterfaceC2981Fp2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3705Nb c3705Nb = this.Z0;
        if (c3705Nb != null) {
            return c3705Nb.d();
        }
        return null;
    }

    @Override // o.InterfaceC3177Hp2
    public ColorStateList getSupportButtonTintList() {
        C4883Zb c4883Zb = this.Y0;
        if (c4883Zb != null) {
            return c4883Zb.b();
        }
        return null;
    }

    @Override // o.InterfaceC3177Hp2
    public PorterDuff.Mode getSupportButtonTintMode() {
        C4883Zb c4883Zb = this.Y0;
        if (c4883Zb != null) {
            return c4883Zb.c();
        }
        return null;
    }

    @Override // o.InterfaceC3275Ip2
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.a1.j();
    }

    @Override // o.InterfaceC3275Ip2
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.a1.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3705Nb c3705Nb = this.Z0;
        if (c3705Nb != null) {
            c3705Nb.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3705Nb c3705Nb = this.Z0;
        if (c3705Nb != null) {
            c3705Nb.g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C4883Zb c4883Zb = this.Y0;
        if (c4883Zb != null) {
            c4883Zb.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3904Pc c3904Pc = this.a1;
        if (c3904Pc != null) {
            c3904Pc.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3904Pc c3904Pc = this.a1;
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
        C3705Nb c3705Nb = this.Z0;
        if (c3705Nb != null) {
            c3705Nb.i(colorStateList);
        }
    }

    @Override // o.InterfaceC2981Fp2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3705Nb c3705Nb = this.Z0;
        if (c3705Nb != null) {
            c3705Nb.j(mode);
        }
    }

    @Override // o.InterfaceC3177Hp2
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C4883Zb c4883Zb = this.Y0;
        if (c4883Zb != null) {
            c4883Zb.f(colorStateList);
        }
    }

    @Override // o.InterfaceC3177Hp2
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C4883Zb c4883Zb = this.Y0;
        if (c4883Zb != null) {
            c4883Zb.g(mode);
        }
    }

    @Override // o.InterfaceC3275Ip2
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.a1.w(colorStateList);
        this.a1.b();
    }

    @Override // o.InterfaceC3275Ip2
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.a1.x(mode);
        this.a1.b();
    }

    public C4485Vb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.v0);
    }

    public C4485Vb(Context context, AttributeSet attributeSet, int i) {
        super(C2578Bp2.b(context), attributeSet, i);
        C8112mn2.a(this, getContext());
        C4883Zb c4883Zb = new C4883Zb(this);
        this.Y0 = c4883Zb;
        c4883Zb.d(attributeSet, i);
        C3705Nb c3705Nb = new C3705Nb(this);
        this.Z0 = c3705Nb;
        c3705Nb.e(attributeSet, i);
        C3904Pc c3904Pc = new C3904Pc(this);
        this.a1 = c3904Pc;
        c3904Pc.m(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C3220Ic.b(getContext(), i));
    }
}
