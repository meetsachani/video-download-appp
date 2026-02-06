package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.AbstractC3808Oc0;
import o.C10920yI2;
import o.C2581Bq1;
import o.C2872Ep2;
import o.C3220Ic;
import o.C4297Tc1;
import o.C4865Yy1;
import o.C4930Zm2;
import o.C5655cn2;
import o.C7025iN1;
import o.C7288jT;
import o.CL0;
import o.D60;
import o.DD;
import o.InterfaceC11300zs1;
import o.InterfaceC3329Je2;
import o.InterfaceC4698Xf2;
import o.InterfaceC5670cr1;
import o.K60;
import o.L70;
import o.PK1;
import o.PL0;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class a extends LinearLayout {
    public final TextInputLayout Y0;
    @InterfaceC5670cr1
    public final FrameLayout Z0;
    @InterfaceC5670cr1
    public final CheckableImageButton a1;
    public ColorStateList b1;
    public PorterDuff.Mode c1;
    public View.OnLongClickListener d1;
    @InterfaceC5670cr1
    public final CheckableImageButton e1;
    public final d f1;
    public int g1;
    public final LinkedHashSet<TextInputLayout.j> h1;
    public ColorStateList i1;
    public PorterDuff.Mode j1;
    public int k1;
    @InterfaceC5670cr1
    public ImageView.ScaleType l1;
    public View.OnLongClickListener m1;
    @InterfaceC11300zs1
    public CharSequence n1;
    @InterfaceC5670cr1
    public final TextView o1;
    public boolean p1;
    public EditText q1;
    @InterfaceC11300zs1
    public final AccessibilityManager r1;
    @InterfaceC11300zs1
    public AccessibilityManager.TouchExplorationStateChangeListener s1;
    public final TextWatcher t1;
    public final TextInputLayout.i u1;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0132a extends C5655cn2 {
        public C0132a() {
        }

        @Override // o.C5655cn2, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            a.this.o().a(editable);
        }

        @Override // o.C5655cn2, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            a.this.o().b(charSequence, i, i2, i3);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements TextInputLayout.i {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@InterfaceC5670cr1 TextInputLayout textInputLayout) {
            if (a.this.q1 == textInputLayout.getEditText()) {
                return;
            }
            if (a.this.q1 != null) {
                a.this.q1.removeTextChangedListener(a.this.t1);
                if (a.this.q1.getOnFocusChangeListener() == a.this.o().e()) {
                    a.this.q1.setOnFocusChangeListener(null);
                }
            }
            a.this.q1 = textInputLayout.getEditText();
            if (a.this.q1 != null) {
                a.this.q1.addTextChangedListener(a.this.t1);
            }
            a.this.o().n(a.this.q1);
            a aVar = a.this;
            aVar.m0(aVar.o());
        }
    }

    /* loaded from: classes3.dex */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            a.this.h();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a.this.R();
        }
    }

    /* loaded from: classes3.dex */
    public static class d {
        public final SparseArray<AbstractC3808Oc0> a = new SparseArray<>();
        public final a b;
        public final int c;
        public final int d;

        public d(a aVar, C2872Ep2 c2872Ep2) {
            this.b = aVar;
            this.c = c2872Ep2.u(C7025iN1.o.Kd, 0);
            this.d = c2872Ep2.u(C7025iN1.o.je, 0);
        }

        public final AbstractC3808Oc0 b(int i) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                return new L70(this.b);
                            }
                            throw new IllegalArgumentException("Invalid end icon mode: " + i);
                        }
                        return new DD(this.b);
                    }
                    return new C4865Yy1(this.b, this.d);
                }
                return new C2581Bq1(this.b);
            }
            return new C7288jT(this.b);
        }

        public AbstractC3808Oc0 c(int i) {
            AbstractC3808Oc0 abstractC3808Oc0 = this.a.get(i);
            if (abstractC3808Oc0 == null) {
                AbstractC3808Oc0 b = b(i);
                this.a.append(i, b);
                return b;
            }
            return abstractC3808Oc0;
        }
    }

    public a(TextInputLayout textInputLayout, C2872Ep2 c2872Ep2) {
        super(textInputLayout.getContext());
        this.g1 = 0;
        this.h1 = new LinkedHashSet<>();
        this.t1 = new C0132a();
        b bVar = new b();
        this.u1 = bVar;
        this.r1 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.Y0 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.Z0 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton k = k(this, from, C7025iN1.h.text_input_error_icon);
        this.a1 = k;
        CheckableImageButton k2 = k(frameLayout, from, C7025iN1.h.text_input_end_icon);
        this.e1 = k2;
        this.f1 = new d(this, c2872Ep2);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.o1 = appCompatTextView;
        E(c2872Ep2);
        D(c2872Ep2);
        F(c2872Ep2);
        frameLayout.addView(k2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(k);
        textInputLayout.j(bVar);
        addOnAttachStateChangeListener(new c());
    }

    public int A() {
        int measuredWidth;
        if (!I() && !J()) {
            measuredWidth = 0;
        } else {
            measuredWidth = this.e1.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.e1.getLayoutParams()).getMarginStart();
        }
        return getPaddingEnd() + this.o1.getPaddingEnd() + measuredWidth;
    }

    public void A0(boolean z) {
        if (this.g1 == 1) {
            this.e1.performClick();
            if (z) {
                this.e1.jumpDrawablesToCurrentState();
            }
        }
    }

    public TextView B() {
        return this.o1;
    }

    public final void B0() {
        int i;
        boolean z;
        FrameLayout frameLayout = this.Z0;
        int i2 = 8;
        if (this.e1.getVisibility() == 0 && !J()) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
        if (this.n1 != null && !this.p1) {
            z = false;
        } else {
            z = true;
        }
        if (I() || J() || !z) {
            i2 = 0;
        }
        setVisibility(i2);
    }

    public boolean C() {
        if (this.g1 != 0) {
            return true;
        }
        return false;
    }

    public final void C0() {
        boolean z;
        int i = 0;
        if (u() != null && this.Y0.U() && this.Y0.x0()) {
            z = true;
        } else {
            z = false;
        }
        CheckableImageButton checkableImageButton = this.a1;
        if (!z) {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        B0();
        D0();
        if (!C()) {
            this.Y0.J0();
        }
    }

    public final void D(C2872Ep2 c2872Ep2) {
        int i = C7025iN1.o.ke;
        if (!c2872Ep2.C(i)) {
            int i2 = C7025iN1.o.Od;
            if (c2872Ep2.C(i2)) {
                this.i1 = C4297Tc1.b(getContext(), c2872Ep2, i2);
            }
            int i3 = C7025iN1.o.Pd;
            if (c2872Ep2.C(i3)) {
                this.j1 = C10920yI2.t(c2872Ep2.o(i3, -1), null);
            }
        }
        int i4 = C7025iN1.o.Md;
        if (c2872Ep2.C(i4)) {
            Z(c2872Ep2.o(i4, 0));
            int i5 = C7025iN1.o.Jd;
            if (c2872Ep2.C(i5)) {
                V(c2872Ep2.x(i5));
            }
            T(c2872Ep2.a(C7025iN1.o.Id, true));
        } else if (c2872Ep2.C(i)) {
            int i6 = C7025iN1.o.le;
            if (c2872Ep2.C(i6)) {
                this.i1 = C4297Tc1.b(getContext(), c2872Ep2, i6);
            }
            int i7 = C7025iN1.o.me;
            if (c2872Ep2.C(i7)) {
                this.j1 = C10920yI2.t(c2872Ep2.o(i7, -1), null);
            }
            Z(c2872Ep2.a(i, false) ? 1 : 0);
            V(c2872Ep2.x(C7025iN1.o.ie));
        }
        Y(c2872Ep2.g(C7025iN1.o.Ld, getResources().getDimensionPixelSize(C7025iN1.f.mtrl_min_touch_target_size)));
        int i8 = C7025iN1.o.Nd;
        if (c2872Ep2.C(i8)) {
            c0(CL0.b(c2872Ep2.o(i8, -1)));
        }
    }

    public void D0() {
        int i;
        if (this.Y0.c1 == null) {
            return;
        }
        if (!I() && !J()) {
            i = this.Y0.c1.getPaddingEnd();
        } else {
            i = 0;
        }
        this.o1.setPaddingRelative(getContext().getResources().getDimensionPixelSize(C7025iN1.f.material_input_text_to_prefix_suffix_padding), this.Y0.c1.getPaddingTop(), i, this.Y0.c1.getPaddingBottom());
    }

    public final void E(C2872Ep2 c2872Ep2) {
        int i = C7025iN1.o.Ud;
        if (c2872Ep2.C(i)) {
            this.b1 = C4297Tc1.b(getContext(), c2872Ep2, i);
        }
        int i2 = C7025iN1.o.Vd;
        if (c2872Ep2.C(i2)) {
            this.c1 = C10920yI2.t(c2872Ep2.o(i2, -1), null);
        }
        int i3 = C7025iN1.o.Td;
        if (c2872Ep2.C(i3)) {
            h0(c2872Ep2.h(i3));
        }
        this.a1.setContentDescription(getResources().getText(C7025iN1.m.error_icon_content_description));
        this.a1.setImportantForAccessibility(2);
        this.a1.setClickable(false);
        this.a1.setPressable(false);
        this.a1.setCheckable(false);
        this.a1.setFocusable(false);
    }

    public final void E0() {
        int i;
        int visibility = this.o1.getVisibility();
        boolean z = false;
        if (this.n1 != null && !this.p1) {
            i = 0;
        } else {
            i = 8;
        }
        if (visibility != i) {
            AbstractC3808Oc0 o2 = o();
            if (i == 0) {
                z = true;
            }
            o2.q(z);
        }
        B0();
        this.o1.setVisibility(i);
        this.Y0.J0();
    }

    public final void F(C2872Ep2 c2872Ep2) {
        this.o1.setVisibility(8);
        this.o1.setId(C7025iN1.h.textinput_suffix_text);
        this.o1.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.o1.setAccessibilityLiveRegion(1);
        v0(c2872Ep2.u(C7025iN1.o.De, 0));
        int i = C7025iN1.o.Ee;
        if (c2872Ep2.C(i)) {
            w0(c2872Ep2.d(i));
        }
        u0(c2872Ep2.x(C7025iN1.o.Ce));
    }

    public boolean G() {
        return this.e1.a();
    }

    public boolean H() {
        if (C() && this.e1.isChecked()) {
            return true;
        }
        return false;
    }

    public boolean I() {
        if (this.Z0.getVisibility() == 0 && this.e1.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean J() {
        if (this.a1.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean K() {
        if (this.g1 == 1) {
            return true;
        }
        return false;
    }

    public void L(boolean z) {
        this.p1 = z;
        E0();
    }

    public void M() {
        C0();
        O();
        N();
        if (o().t()) {
            z0(this.Y0.x0());
        }
    }

    public void N() {
        CL0.d(this.Y0, this.e1, this.i1);
    }

    public void O() {
        CL0.d(this.Y0, this.a1, this.b1);
    }

    public void P(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        AbstractC3808Oc0 o2 = o();
        boolean z3 = true;
        if (o2.l() && (isChecked = this.e1.isChecked()) != o2.m()) {
            this.e1.setChecked(!isChecked);
            z2 = true;
        } else {
            z2 = false;
        }
        if (o2.j() && (isActivated = this.e1.isActivated()) != o2.k()) {
            S(!isActivated);
        } else {
            z3 = z2;
        }
        if (!z && !z3) {
            return;
        }
        N();
    }

    public void Q(@InterfaceC5670cr1 TextInputLayout.j jVar) {
        this.h1.remove(jVar);
    }

    public final void R() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.s1;
        if (touchExplorationStateChangeListener != null && (accessibilityManager = this.r1) != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
    }

    public void S(boolean z) {
        this.e1.setActivated(z);
    }

    public void T(boolean z) {
        this.e1.setCheckable(z);
    }

    public void U(@InterfaceC3329Je2 int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        V(charSequence);
    }

    public void V(@InterfaceC11300zs1 CharSequence charSequence) {
        if (n() != charSequence) {
            this.e1.setContentDescription(charSequence);
        }
    }

    public void W(@K60 int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C3220Ic.b(getContext(), i);
        } else {
            drawable = null;
        }
        X(drawable);
    }

    public void X(@InterfaceC11300zs1 Drawable drawable) {
        this.e1.setImageDrawable(drawable);
        if (drawable != null) {
            CL0.a(this.Y0, this.e1, this.i1, this.j1);
            N();
        }
    }

    public void Y(@PK1 int i) {
        if (i >= 0) {
            if (i != this.k1) {
                this.k1 = i;
                CL0.g(this.e1, i);
                CL0.g(this.a1, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void Z(int i) {
        boolean z;
        if (this.g1 == i) {
            return;
        }
        y0(o());
        int i2 = this.g1;
        this.g1 = i;
        l(i2);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        f0(z);
        AbstractC3808Oc0 o2 = o();
        W(v(o2));
        U(o2.c());
        T(o2.l());
        if (o2.i(this.Y0.getBoxBackgroundMode())) {
            x0(o2);
            a0(o2.f());
            EditText editText = this.q1;
            if (editText != null) {
                o2.n(editText);
                m0(o2);
            }
            CL0.a(this.Y0, this.e1, this.i1, this.j1);
            P(true);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.Y0.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
    }

    public void a0(@InterfaceC11300zs1 View.OnClickListener onClickListener) {
        CL0.h(this.e1, onClickListener, this.m1);
    }

    public void b0(@InterfaceC11300zs1 View.OnLongClickListener onLongClickListener) {
        this.m1 = onLongClickListener;
        CL0.i(this.e1, onLongClickListener);
    }

    public void c0(@InterfaceC5670cr1 ImageView.ScaleType scaleType) {
        this.l1 = scaleType;
        CL0.j(this.e1, scaleType);
        CL0.j(this.a1, scaleType);
    }

    public void d0(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.i1 != colorStateList) {
            this.i1 = colorStateList;
            CL0.a(this.Y0, this.e1, colorStateList, this.j1);
        }
    }

    public void e0(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        if (this.j1 != mode) {
            this.j1 = mode;
            CL0.a(this.Y0, this.e1, this.i1, mode);
        }
    }

    public void f0(boolean z) {
        int i;
        if (I() != z) {
            CheckableImageButton checkableImageButton = this.e1;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            B0();
            D0();
            this.Y0.J0();
        }
    }

    public void g(@InterfaceC5670cr1 TextInputLayout.j jVar) {
        this.h1.add(jVar);
    }

    public void g0(@K60 int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C3220Ic.b(getContext(), i);
        } else {
            drawable = null;
        }
        h0(drawable);
        O();
    }

    public final void h() {
        if (this.s1 != null && this.r1 != null && isAttachedToWindow()) {
            this.r1.addTouchExplorationStateChangeListener(this.s1);
        }
    }

    public void h0(@InterfaceC11300zs1 Drawable drawable) {
        this.a1.setImageDrawable(drawable);
        C0();
        CL0.a(this.Y0, this.a1, this.b1, this.c1);
    }

    public void i() {
        this.e1.performClick();
        this.e1.jumpDrawablesToCurrentState();
    }

    public void i0(@InterfaceC11300zs1 View.OnClickListener onClickListener) {
        CL0.h(this.a1, onClickListener, this.d1);
    }

    public void j() {
        this.h1.clear();
    }

    public void j0(@InterfaceC11300zs1 View.OnLongClickListener onLongClickListener) {
        this.d1 = onLongClickListener;
        CL0.i(this.a1, onLongClickListener);
    }

    public final CheckableImageButton k(ViewGroup viewGroup, LayoutInflater layoutInflater, @PL0 int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C7025iN1.k.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        CL0.e(checkableImageButton);
        if (C4297Tc1.k(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public void k0(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.b1 != colorStateList) {
            this.b1 = colorStateList;
            CL0.a(this.Y0, this.a1, colorStateList, this.c1);
        }
    }

    public final void l(int i) {
        Iterator<TextInputLayout.j> it = this.h1.iterator();
        while (it.hasNext()) {
            it.next().a(this.Y0, i);
        }
    }

    public void l0(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        if (this.c1 != mode) {
            this.c1 = mode;
            CL0.a(this.Y0, this.a1, this.b1, mode);
        }
    }

    @InterfaceC11300zs1
    public CheckableImageButton m() {
        if (J()) {
            return this.a1;
        }
        if (C() && I()) {
            return this.e1;
        }
        return null;
    }

    public final void m0(AbstractC3808Oc0 abstractC3808Oc0) {
        if (this.q1 != null) {
            if (abstractC3808Oc0.e() != null) {
                this.q1.setOnFocusChangeListener(abstractC3808Oc0.e());
            }
            if (abstractC3808Oc0.g() != null) {
                this.e1.setOnFocusChangeListener(abstractC3808Oc0.g());
            }
        }
    }

    @InterfaceC11300zs1
    public CharSequence n() {
        return this.e1.getContentDescription();
    }

    public void n0(@InterfaceC3329Je2 int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        o0(charSequence);
    }

    public AbstractC3808Oc0 o() {
        return this.f1.c(this.g1);
    }

    public void o0(@InterfaceC11300zs1 CharSequence charSequence) {
        this.e1.setContentDescription(charSequence);
    }

    @InterfaceC11300zs1
    public Drawable p() {
        return this.e1.getDrawable();
    }

    public void p0(@K60 int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C3220Ic.b(getContext(), i);
        } else {
            drawable = null;
        }
        q0(drawable);
    }

    public int q() {
        return this.k1;
    }

    public void q0(@InterfaceC11300zs1 Drawable drawable) {
        this.e1.setImageDrawable(drawable);
    }

    public int r() {
        return this.g1;
    }

    public void r0(boolean z) {
        if (z && this.g1 != 1) {
            Z(1);
        } else if (!z) {
            Z(0);
        }
    }

    @InterfaceC5670cr1
    public ImageView.ScaleType s() {
        return this.l1;
    }

    public void s0(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.i1 = colorStateList;
        CL0.a(this.Y0, this.e1, colorStateList, this.j1);
    }

    public CheckableImageButton t() {
        return this.e1;
    }

    public void t0(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        this.j1 = mode;
        CL0.a(this.Y0, this.e1, this.i1, mode);
    }

    public Drawable u() {
        return this.a1.getDrawable();
    }

    public void u0(@InterfaceC11300zs1 CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.n1 = charSequence2;
        this.o1.setText(charSequence);
        E0();
    }

    public final int v(AbstractC3808Oc0 abstractC3808Oc0) {
        int i = this.f1.c;
        if (i == 0) {
            return abstractC3808Oc0.d();
        }
        return i;
    }

    public void v0(@InterfaceC4698Xf2 int i) {
        C4930Zm2.D(this.o1, i);
    }

    @InterfaceC11300zs1
    public CharSequence w() {
        return this.e1.getContentDescription();
    }

    public void w0(@InterfaceC5670cr1 ColorStateList colorStateList) {
        this.o1.setTextColor(colorStateList);
    }

    @InterfaceC11300zs1
    public Drawable x() {
        return this.e1.getDrawable();
    }

    public final void x0(@InterfaceC5670cr1 AbstractC3808Oc0 abstractC3808Oc0) {
        abstractC3808Oc0.s();
        this.s1 = abstractC3808Oc0.h();
        h();
    }

    @InterfaceC11300zs1
    public CharSequence y() {
        return this.n1;
    }

    public final void y0(@InterfaceC5670cr1 AbstractC3808Oc0 abstractC3808Oc0) {
        R();
        this.s1 = null;
        abstractC3808Oc0.u();
    }

    @InterfaceC11300zs1
    public ColorStateList z() {
        return this.o1.getTextColors();
    }

    public final void z0(boolean z) {
        if (z && p() != null) {
            Drawable mutate = D60.r(p()).mutate();
            mutate.setTint(this.Y0.getErrorCurrentTextColors());
            this.e1.setImageDrawable(mutate);
            return;
        }
        CL0.a(this.Y0, this.e1, this.i1, this.j1);
    }
}
