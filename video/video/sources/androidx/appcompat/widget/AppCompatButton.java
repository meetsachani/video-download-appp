package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import o.C10016uc;
import o.C11163zI2;
import o.C2578Bp2;
import o.C3705Nb;
import o.C3904Pc;
import o.C4930Zm2;
import o.C8112mn2;
import o.InterfaceC10984ya0;
import o.InterfaceC2981Fp2;
import o.InterfaceC3275Ip2;
import o.InterfaceC6117ei;
import o.OL1;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements InterfaceC2981Fp2, InterfaceC6117ei, InterfaceC3275Ip2, InterfaceC10984ya0 {
    public final C3705Nb Y0;
    public final C3904Pc Z0;
    public C10016uc a1;

    public AppCompatButton(Context context) {
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

    @Override // android.widget.TextView, o.InterfaceC6117ei
    public int getAutoSizeMaxTextSize() {
        if (C11163zI2.d) {
            return super.getAutoSizeMaxTextSize();
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            return c3904Pc.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, o.InterfaceC6117ei
    public int getAutoSizeMinTextSize() {
        if (C11163zI2.d) {
            return super.getAutoSizeMinTextSize();
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            return c3904Pc.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, o.InterfaceC6117ei
    public int getAutoSizeStepGranularity() {
        if (C11163zI2.d) {
            return super.getAutoSizeStepGranularity();
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            return c3904Pc.g();
        }
        return -1;
    }

    @Override // android.widget.TextView, o.InterfaceC6117ei
    public int[] getAutoSizeTextAvailableSizes() {
        if (C11163zI2.d) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            return c3904Pc.h();
        }
        return new int[0];
    }

    @Override // android.widget.TextView, o.InterfaceC6117ei
    public int getAutoSizeTextType() {
        if (C11163zI2.d) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc == null) {
            return 0;
        }
        return c3904Pc.i();
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null && !C11163zI2.d && c3904Pc.l()) {
            this.Z0.c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView, o.InterfaceC6117ei
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C11163zI2.d) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.t(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, o.InterfaceC6117ei
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C11163zI2.d) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.u(iArr, i);
        }
    }

    @Override // android.widget.TextView, o.InterfaceC6117ei
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C11163zI2.d) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.v(i);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4930Zm2.G(this, callback));
    }

    @Override // o.InterfaceC10984ya0
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.s(z);
        }
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
    public void setTextSize(int i, float f) {
        if (C11163zI2.d) {
            super.setTextSize(i, f);
            return;
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.A(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.o0);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C2578Bp2.b(context), attributeSet, i);
        C8112mn2.a(this, getContext());
        C3705Nb c3705Nb = new C3705Nb(this);
        this.Y0 = c3705Nb;
        c3705Nb.e(attributeSet, i);
        C3904Pc c3904Pc = new C3904Pc(this);
        this.Z0 = c3904Pc;
        c3904Pc.m(attributeSet, i);
        c3904Pc.b();
        getEmojiTextViewHelper().c(attributeSet, i);
    }
}
