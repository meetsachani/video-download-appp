package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import o.OL1;

/* renamed from: o.sc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9530sc extends EditText implements InterfaceC2981Fp2, InterfaceC6669gv1, InterfaceC10984ya0, InterfaceC3275Ip2 {
    public final C3705Nb Y0;
    public final C3904Pc Z0;
    public final C3807Oc a1;
    public final C5413bn2 b1;
    public final C9773tc c1;
    public a d1;

    /* renamed from: o.sc$a */
    /* loaded from: classes.dex */
    public class a {
        public a() {
        }

        public TextClassifier a() {
            return C9530sc.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            C9530sc.super.setTextClassifier(textClassifier);
        }
    }

    public C9530sc(Context context) {
        this(context, null);
    }

    private a getSuperCaller() {
        if (this.d1 == null) {
            this.d1 = new a();
        }
        return this.d1;
    }

    @Override // o.InterfaceC6669gv1
    public KL a(KL kl) {
        return this.b1.a(this, kl);
    }

    @Override // o.InterfaceC10984ya0
    public boolean b() {
        return this.c1.c();
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

    public void e(C9773tc c9773tc) {
        KeyListener keyListener = getKeyListener();
        if (c9773tc.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a2 = c9773tc.a(keyListener);
            if (a2 != keyListener) {
                super.setKeyListener(a2);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C3807Oc c3807Oc;
        if (Build.VERSION.SDK_INT < 28 && (c3807Oc = this.a1) != null) {
            return c3807Oc.a();
        }
        return getSuperCaller().a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] m0;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.Z0.r(this, onCreateInputConnection, editorInfo);
        InputConnection a2 = C10259vc.a(onCreateInputConnection, editorInfo, this);
        if (a2 != null && Build.VERSION.SDK_INT <= 30 && (m0 = C6516gH2.m0(this)) != null) {
            N90.i(editorInfo, m0);
            a2 = C6295fQ0.d(this, a2, editorInfo);
        }
        return this.c1.e(a2, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C3122Hc.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (C3122Hc.b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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

    @Override // o.InterfaceC10984ya0
    public void setEmojiCompatEnabled(boolean z) {
        this.c1.f(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c1.a(keyListener));
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

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C3807Oc c3807Oc;
        if (Build.VERSION.SDK_INT < 28 && (c3807Oc = this.a1) != null) {
            c3807Oc.b(textClassifier);
        } else {
            getSuperCaller().b(textClassifier);
        }
    }

    public C9530sc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.t1);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public C9530sc(Context context, AttributeSet attributeSet, int i) {
        super(C2578Bp2.b(context), attributeSet, i);
        C8112mn2.a(this, getContext());
        C3705Nb c3705Nb = new C3705Nb(this);
        this.Y0 = c3705Nb;
        c3705Nb.e(attributeSet, i);
        C3904Pc c3904Pc = new C3904Pc(this);
        this.Z0 = c3904Pc;
        c3904Pc.m(attributeSet, i);
        c3904Pc.b();
        this.a1 = new C3807Oc(this);
        this.b1 = new C5413bn2();
        C9773tc c9773tc = new C9773tc(this);
        this.c1 = c9773tc;
        c9773tc.d(attributeSet, i);
        e(c9773tc);
    }
}
