package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import o.OL1;

/* renamed from: o.Xb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4679Xb extends CheckedTextView implements InterfaceC3079Gp2, InterfaceC2981Fp2, InterfaceC10984ya0, InterfaceC3275Ip2 {
    public final C4776Yb Y0;
    public final C3705Nb Z0;
    public final C3904Pc a1;
    public C10016uc b1;

    public C4679Xb(Context context) {
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

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3904Pc c3904Pc = this.a1;
        if (c3904Pc != null) {
            c3904Pc.b();
        }
        C3705Nb c3705Nb = this.Z0;
        if (c3705Nb != null) {
            c3705Nb.b();
        }
        C4776Yb c4776Yb = this.Y0;
        if (c4776Yb != null) {
            c4776Yb.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4930Zm2.F(super.getCustomSelectionActionModeCallback());
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

    @Override // o.InterfaceC3079Gp2
    public ColorStateList getSupportCheckMarkTintList() {
        C4776Yb c4776Yb = this.Y0;
        if (c4776Yb != null) {
            return c4776Yb.b();
        }
        return null;
    }

    @Override // o.InterfaceC3079Gp2
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C4776Yb c4776Yb = this.Y0;
        if (c4776Yb != null) {
            return c4776Yb.c();
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C10259vc.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C4776Yb c4776Yb = this.Y0;
        if (c4776Yb != null) {
            c4776Yb.e();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4930Zm2.G(this, callback));
    }

    @Override // o.InterfaceC10984ya0
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
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

    @Override // o.InterfaceC3079Gp2
    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C4776Yb c4776Yb = this.Y0;
        if (c4776Yb != null) {
            c4776Yb.f(colorStateList);
        }
    }

    @Override // o.InterfaceC3079Gp2
    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C4776Yb c4776Yb = this.Y0;
        if (c4776Yb != null) {
            c4776Yb.g(mode);
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3904Pc c3904Pc = this.a1;
        if (c3904Pc != null) {
            c3904Pc.q(context, i);
        }
    }

    public C4679Xb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.w0);
    }

    public C4679Xb(Context context, AttributeSet attributeSet, int i) {
        super(C2578Bp2.b(context), attributeSet, i);
        C8112mn2.a(this, getContext());
        C3904Pc c3904Pc = new C3904Pc(this);
        this.a1 = c3904Pc;
        c3904Pc.m(attributeSet, i);
        c3904Pc.b();
        C3705Nb c3705Nb = new C3705Nb(this);
        this.Z0 = c3705Nb;
        c3705Nb.e(attributeSet, i);
        C4776Yb c4776Yb = new C4776Yb(this);
        this.Y0 = c4776Yb;
        c4776Yb.d(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C3220Ic.b(getContext(), i));
    }
}
