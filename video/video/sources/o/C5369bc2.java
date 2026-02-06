package o;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import o.C7025iN1;

@SuppressLint({"ViewConstructor"})
/* renamed from: o.bc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5369bc2 extends LinearLayout {
    public final TextInputLayout Y0;
    public final TextView Z0;
    @InterfaceC11300zs1
    public CharSequence a1;
    public final CheckableImageButton b1;
    public ColorStateList c1;
    public PorterDuff.Mode d1;
    public int e1;
    @InterfaceC5670cr1
    public ImageView.ScaleType f1;
    public View.OnLongClickListener g1;
    public boolean h1;

    public C5369bc2(TextInputLayout textInputLayout, C2872Ep2 c2872Ep2) {
        super(textInputLayout.getContext());
        this.Y0 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, JE0.b));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C7025iN1.k.design_text_input_start_icon, (ViewGroup) this, false);
        this.b1 = checkableImageButton;
        CL0.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.Z0 = appCompatTextView;
        j(c2872Ep2);
        i(c2872Ep2);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public void A(boolean z) {
        int i;
        if (l() != z) {
            CheckableImageButton checkableImageButton = this.b1;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            C();
            D();
        }
    }

    public void B(@InterfaceC5670cr1 C10861y4 c10861y4) {
        if (this.Z0.getVisibility() == 0) {
            c10861y4.F1(this.Z0);
            c10861y4.l2(this.Z0);
            return;
        }
        c10861y4.l2(this.b1);
    }

    public void C() {
        int paddingStart;
        EditText editText = this.Y0.c1;
        if (editText == null) {
            return;
        }
        if (l()) {
            paddingStart = 0;
        } else {
            paddingStart = editText.getPaddingStart();
        }
        this.Z0.setPaddingRelative(paddingStart, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C7025iN1.f.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void D() {
        int i;
        int i2 = 8;
        if (this.a1 != null && !this.h1) {
            i = 0;
        } else {
            i = 8;
        }
        if (this.b1.getVisibility() == 0 || i == 0) {
            i2 = 0;
        }
        setVisibility(i2);
        this.Z0.setVisibility(i);
        this.Y0.J0();
    }

    @InterfaceC11300zs1
    public CharSequence a() {
        return this.a1;
    }

    @InterfaceC11300zs1
    public ColorStateList b() {
        return this.Z0.getTextColors();
    }

    public int c() {
        int i;
        if (l()) {
            i = this.b1.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.b1.getLayoutParams()).getMarginEnd();
        } else {
            i = 0;
        }
        return getPaddingStart() + this.Z0.getPaddingStart() + i;
    }

    @InterfaceC5670cr1
    public TextView d() {
        return this.Z0;
    }

    @InterfaceC11300zs1
    public CharSequence e() {
        return this.b1.getContentDescription();
    }

    @InterfaceC11300zs1
    public Drawable f() {
        return this.b1.getDrawable();
    }

    public int g() {
        return this.e1;
    }

    @InterfaceC5670cr1
    public ImageView.ScaleType h() {
        return this.f1;
    }

    public final void i(C2872Ep2 c2872Ep2) {
        this.Z0.setVisibility(8);
        this.Z0.setId(C7025iN1.h.textinput_prefix_text);
        this.Z0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.Z0.setAccessibilityLiveRegion(1);
        p(c2872Ep2.u(C7025iN1.o.re, 0));
        int i = C7025iN1.o.se;
        if (c2872Ep2.C(i)) {
            q(c2872Ep2.d(i));
        }
        o(c2872Ep2.x(C7025iN1.o.qe));
    }

    public final void j(C2872Ep2 c2872Ep2) {
        if (C4297Tc1.k(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.b1.getLayoutParams()).setMarginEnd(0);
        }
        v(null);
        w(null);
        int i = C7025iN1.o.Ae;
        if (c2872Ep2.C(i)) {
            this.c1 = C4297Tc1.b(getContext(), c2872Ep2, i);
        }
        int i2 = C7025iN1.o.Be;
        if (c2872Ep2.C(i2)) {
            this.d1 = C10920yI2.t(c2872Ep2.o(i2, -1), null);
        }
        int i3 = C7025iN1.o.xe;
        if (c2872Ep2.C(i3)) {
            t(c2872Ep2.h(i3));
            int i4 = C7025iN1.o.we;
            if (c2872Ep2.C(i4)) {
                s(c2872Ep2.x(i4));
            }
            r(c2872Ep2.a(C7025iN1.o.ve, true));
        }
        u(c2872Ep2.g(C7025iN1.o.ye, getResources().getDimensionPixelSize(C7025iN1.f.mtrl_min_touch_target_size)));
        int i5 = C7025iN1.o.ze;
        if (c2872Ep2.C(i5)) {
            x(CL0.b(c2872Ep2.o(i5, -1)));
        }
    }

    public boolean k() {
        return this.b1.a();
    }

    public boolean l() {
        if (this.b1.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void m(boolean z) {
        this.h1 = z;
        D();
    }

    public void n() {
        CL0.d(this.Y0, this.b1, this.c1);
    }

    public void o(@InterfaceC11300zs1 CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.a1 = charSequence2;
        this.Z0.setText(charSequence);
        D();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C();
    }

    public void p(@InterfaceC4698Xf2 int i) {
        C4930Zm2.D(this.Z0, i);
    }

    public void q(@InterfaceC5670cr1 ColorStateList colorStateList) {
        this.Z0.setTextColor(colorStateList);
    }

    public void r(boolean z) {
        this.b1.setCheckable(z);
    }

    public void s(@InterfaceC11300zs1 CharSequence charSequence) {
        if (e() != charSequence) {
            this.b1.setContentDescription(charSequence);
        }
    }

    public void t(@InterfaceC11300zs1 Drawable drawable) {
        this.b1.setImageDrawable(drawable);
        if (drawable != null) {
            CL0.a(this.Y0, this.b1, this.c1, this.d1);
            A(true);
            n();
            return;
        }
        A(false);
        v(null);
        w(null);
        s(null);
    }

    public void u(@PK1 int i) {
        if (i >= 0) {
            if (i != this.e1) {
                this.e1 = i;
                CL0.g(this.b1, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void v(@InterfaceC11300zs1 View.OnClickListener onClickListener) {
        CL0.h(this.b1, onClickListener, this.g1);
    }

    public void w(@InterfaceC11300zs1 View.OnLongClickListener onLongClickListener) {
        this.g1 = onLongClickListener;
        CL0.i(this.b1, onLongClickListener);
    }

    public void x(@InterfaceC5670cr1 ImageView.ScaleType scaleType) {
        this.f1 = scaleType;
        CL0.j(this.b1, scaleType);
    }

    public void y(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.c1 != colorStateList) {
            this.c1 = colorStateList;
            CL0.a(this.Y0, this.b1, colorStateList, this.d1);
        }
    }

    public void z(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        if (this.d1 != mode) {
            this.d1 = mode;
            CL0.a(this.Y0, this.b1, this.c1, mode);
        }
    }
}
