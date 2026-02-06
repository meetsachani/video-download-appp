package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import o.OL1;

/* renamed from: o.Mb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3607Mb extends AutoCompleteTextView implements InterfaceC2981Fp2, InterfaceC10984ya0, InterfaceC3275Ip2 {
    public static final int[] b1 = {16843126};
    public final C3705Nb Y0;
    public final C3904Pc Z0;
    public final C9773tc a1;

    public C3607Mb(Context context) {
        this(context, null);
    }

    public void a(C9773tc c9773tc) {
        KeyListener keyListener = getKeyListener();
        if (c9773tc.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a = c9773tc.a(keyListener);
            if (a != keyListener) {
                super.setKeyListener(a);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override // o.InterfaceC10984ya0
    public boolean b() {
        return this.a1.c();
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4930Zm2.F(super.getCustomSelectionActionModeCallback());
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.a1.e(C10259vc.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4930Zm2.G(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C3220Ic.b(getContext(), i));
    }

    @Override // o.InterfaceC10984ya0
    public void setEmojiCompatEnabled(boolean z) {
        this.a1.f(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.a1.a(keyListener));
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.q(context, i);
        }
    }

    public C3607Mb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.S);
    }

    public C3607Mb(Context context, AttributeSet attributeSet, int i) {
        super(C2578Bp2.b(context), attributeSet, i);
        C8112mn2.a(this, getContext());
        C2872Ep2 G = C2872Ep2.G(getContext(), attributeSet, b1, i, 0);
        if (G.C(0)) {
            setDropDownBackgroundDrawable(G.h(0));
        }
        G.I();
        C3705Nb c3705Nb = new C3705Nb(this);
        this.Y0 = c3705Nb;
        c3705Nb.e(attributeSet, i);
        C3904Pc c3904Pc = new C3904Pc(this);
        this.Z0 = c3904Pc;
        c3904Pc.m(attributeSet, i);
        c3904Pc.b();
        C9773tc c9773tc = new C9773tc(this);
        this.a1 = c9773tc;
        c9773tc.d(attributeSet, i);
        a(c9773tc);
    }
}
