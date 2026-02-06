package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import o.C7025iN1;

/* renamed from: o.wP0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10460wP0 {
    public static final int C = 217;
    public static final int D = 167;
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 0;
    public static final int I = 1;
    public static final int J = 2;
    @InterfaceC11300zs1
    public ColorStateList A;
    public Typeface B;
    public final int a;
    public final int b;
    public final int c;
    @InterfaceC5670cr1
    public final TimeInterpolator d;
    @InterfaceC5670cr1
    public final TimeInterpolator e;
    @InterfaceC5670cr1
    public final TimeInterpolator f;
    public final Context g;
    @InterfaceC5670cr1
    public final TextInputLayout h;
    public LinearLayout i;
    public int j;
    public FrameLayout k;
    @InterfaceC11300zs1
    public Animator l;
    public final float m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f903o;
    @InterfaceC11300zs1
    public CharSequence p;
    public boolean q;
    @InterfaceC11300zs1
    public TextView r;
    @InterfaceC11300zs1
    public CharSequence s;
    public int t;
    public int u;
    @InterfaceC11300zs1
    public ColorStateList v;
    public CharSequence w;
    public boolean x;
    @InterfaceC11300zs1
    public TextView y;
    public int z;

    /* renamed from: o.wP0$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;
        public final /* synthetic */ TextView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ TextView d;

        public a(int i, TextView textView, int i2, TextView textView2) {
            this.a = i;
            this.b = textView;
            this.c = i2;
            this.d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C10460wP0.this.n = this.a;
            C10460wP0.this.l = null;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.c == 1 && C10460wP0.this.r != null) {
                    C10460wP0.this.r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(0);
                this.d.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: o.wP0$b */
    /* loaded from: classes3.dex */
    public class b extends View.AccessibilityDelegate {
        public b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = C10460wP0.this.h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public C10460wP0(@InterfaceC5670cr1 TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(C7025iN1.f.design_textinput_caption_translate_y);
        int i = C7025iN1.c.motionDurationShort4;
        this.a = C9811tl1.f(context, i, 217);
        this.b = C9811tl1.f(context, C7025iN1.c.motionDurationMedium4, 167);
        this.c = C9811tl1.f(context, i, 167);
        int i2 = C7025iN1.c.motionEasingEmphasizedDecelerateInterpolator;
        this.d = C9811tl1.g(context, i2, C5600ca.d);
        TimeInterpolator timeInterpolator = C5600ca.a;
        this.e = C9811tl1.g(context, i2, timeInterpolator);
        this.f = C9811tl1.g(context, C7025iN1.c.motionEasingLinearInterpolator, timeInterpolator);
    }

    public void A() {
        this.p = null;
        h();
        if (this.n == 1) {
            if (this.x && !TextUtils.isEmpty(this.w)) {
                this.f903o = 2;
            } else {
                this.f903o = 0;
            }
        }
        X(this.n, this.f903o, U(this.r, ""));
    }

    public void B() {
        h();
        int i = this.n;
        if (i == 2) {
            this.f903o = 0;
        }
        X(i, this.f903o, U(this.y, ""));
    }

    public final boolean C(int i) {
        if (i == 1 && this.r != null && !TextUtils.isEmpty(this.p)) {
            return true;
        }
        return false;
    }

    public final boolean D(int i) {
        if (i == 2 && this.y != null && !TextUtils.isEmpty(this.w)) {
            return true;
        }
        return false;
    }

    public boolean E(int i) {
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public boolean F() {
        return this.q;
    }

    public boolean G() {
        return this.x;
    }

    public void H(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.i == null) {
            return;
        }
        if (E(i) && (frameLayout = this.k) != null) {
            frameLayout.removeView(textView);
        } else {
            this.i.removeView(textView);
        }
        int i2 = this.j - 1;
        this.j = i2;
        T(this.i, i2);
    }

    public final void I(int i, int i2) {
        TextView n;
        TextView n2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (n2 = n(i2)) != null) {
            n2.setVisibility(0);
            n2.setAlpha(1.0f);
        }
        if (i != 0 && (n = n(i)) != null) {
            n.setVisibility(4);
            if (i == 1) {
                n.setText((CharSequence) null);
            }
        }
        this.n = i2;
    }

    public void J(int i) {
        this.t = i;
        TextView textView = this.r;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i);
        }
    }

    public void K(@InterfaceC11300zs1 CharSequence charSequence) {
        this.s = charSequence;
        TextView textView = this.r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void L(boolean z) {
        if (this.q == z) {
            return;
        }
        h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.g);
            this.r = appCompatTextView;
            appCompatTextView.setId(C7025iN1.h.textinput_error);
            this.r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.r.setTypeface(typeface);
            }
            M(this.u);
            N(this.v);
            K(this.s);
            J(this.t);
            this.r.setVisibility(4);
            e(this.r, 0);
        } else {
            A();
            H(this.r, 0);
            this.r = null;
            this.h.K0();
            this.h.W0();
        }
        this.q = z;
    }

    public void M(@InterfaceC4698Xf2 int i) {
        this.u = i;
        TextView textView = this.r;
        if (textView != null) {
            this.h.w0(textView, i);
        }
    }

    public void N(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.v = colorStateList;
        TextView textView = this.r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void O(@InterfaceC4698Xf2 int i) {
        this.z = i;
        TextView textView = this.y;
        if (textView != null) {
            C4930Zm2.D(textView, i);
        }
    }

    public void P(boolean z) {
        if (this.x == z) {
            return;
        }
        h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.g);
            this.y = appCompatTextView;
            appCompatTextView.setId(C7025iN1.h.textinput_helper_text);
            this.y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.y.setTypeface(typeface);
            }
            this.y.setVisibility(4);
            this.y.setAccessibilityLiveRegion(1);
            O(this.z);
            Q(this.A);
            e(this.y, 1);
            this.y.setAccessibilityDelegate(new b());
        } else {
            B();
            H(this.y, 1);
            this.y = null;
            this.h.K0();
            this.h.W0();
        }
        this.x = z;
    }

    public void Q(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.y;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void R(@InterfaceC11300zs1 TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void S(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            R(this.r, typeface);
            R(this.y, typeface);
        }
    }

    public final void T(@InterfaceC5670cr1 ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean U(@InterfaceC11300zs1 TextView textView, @InterfaceC5670cr1 CharSequence charSequence) {
        if (this.h.isLaidOut() && this.h.isEnabled()) {
            if (this.f903o != this.n || textView == null || !TextUtils.equals(textView.getText(), charSequence)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void V(CharSequence charSequence) {
        h();
        this.p = charSequence;
        this.r.setText(charSequence);
        int i = this.n;
        if (i != 1) {
            this.f903o = 1;
        }
        X(i, this.f903o, U(this.r, charSequence));
    }

    public void W(CharSequence charSequence) {
        h();
        this.w = charSequence;
        this.y.setText(charSequence);
        int i = this.n;
        if (i != 2) {
            this.f903o = 2;
        }
        X(i, this.f903o, U(this.y, charSequence));
    }

    public final void X(int i, int i2, boolean z) {
        C10460wP0 c10460wP0;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.l = animatorSet;
            ArrayList arrayList = new ArrayList();
            c10460wP0 = this;
            c10460wP0.i(arrayList, this.x, this.y, 2, i, i2);
            c10460wP0.i(arrayList, c10460wP0.q, c10460wP0.r, 1, i, i2);
            C7069ia.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, n(i), i, n(i2)));
            animatorSet.start();
        } else {
            c10460wP0 = this;
            I(i, i2);
        }
        c10460wP0.h.K0();
        c10460wP0.h.Q0(z);
        c10460wP0.h.W0();
    }

    public void e(TextView textView, int i) {
        if (this.i == null && this.k == null) {
            LinearLayout linearLayout = new LinearLayout(this.g);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            this.h.addView(this.i, -1, -2);
            this.k = new FrameLayout(this.g);
            this.i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.h.getEditText() != null) {
                f();
            }
        }
        if (E(i)) {
            this.k.setVisibility(0);
            this.k.addView(textView);
        } else {
            this.i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.j++;
    }

    public void f() {
        if (g()) {
            EditText editText = this.h.getEditText();
            boolean k = C4297Tc1.k(this.g);
            LinearLayout linearLayout = this.i;
            int i = C7025iN1.f.material_helper_text_font_1_3_padding_horizontal;
            linearLayout.setPaddingRelative(x(k, i, editText.getPaddingStart()), x(k, C7025iN1.f.material_helper_text_font_1_3_padding_top, this.g.getResources().getDimensionPixelSize(C7025iN1.f.material_helper_text_default_padding_top)), x(k, i, editText.getPaddingEnd()), 0);
        }
    }

    public final boolean g() {
        if (this.i != null && this.h.getEditText() != null) {
            return true;
        }
        return false;
    }

    public void h() {
        Animator animator = this.l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void i(@InterfaceC5670cr1 List<Animator> list, boolean z, @InterfaceC11300zs1 TextView textView, int i, int i2, int i3) {
        boolean z2;
        if (textView != null && z) {
            if (i != i3 && i != i2) {
                return;
            }
            if (i3 == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            ObjectAnimator j = j(textView, z2);
            if (i == i3 && i2 != 0) {
                j.setStartDelay(this.c);
            }
            list.add(j);
            if (i3 == i && i2 != 0) {
                ObjectAnimator k = k(textView);
                k.setStartDelay(this.c);
                list.add(k);
            }
        }
    }

    public final ObjectAnimator j(TextView textView, boolean z) {
        float f;
        int i;
        TimeInterpolator timeInterpolator;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
        if (z) {
            i = this.b;
        } else {
            i = this.c;
        }
        ofFloat.setDuration(i);
        if (z) {
            timeInterpolator = this.e;
        } else {
            timeInterpolator = this.f;
        }
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    public final ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.m, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(this.d);
        return ofFloat;
    }

    public boolean l() {
        return C(this.n);
    }

    public boolean m() {
        return C(this.f903o);
    }

    @InterfaceC11300zs1
    public final TextView n(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.y;
        }
        return this.r;
    }

    public int o() {
        return this.t;
    }

    @InterfaceC11300zs1
    public CharSequence p() {
        return this.s;
    }

    @InterfaceC11300zs1
    public CharSequence q() {
        return this.p;
    }

    @JF
    public int r() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @InterfaceC11300zs1
    public ColorStateList s() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence t() {
        return this.w;
    }

    @InterfaceC11300zs1
    public View u() {
        return this.y;
    }

    @InterfaceC11300zs1
    public ColorStateList v() {
        TextView textView = this.y;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    @JF
    public int w() {
        TextView textView = this.y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int x(boolean z, @InterfaceC9154r30 int i, int i2) {
        if (z) {
            return this.g.getResources().getDimensionPixelSize(i);
        }
        return i2;
    }

    public boolean y() {
        return D(this.n);
    }

    public boolean z() {
        return D(this.f903o);
    }
}
