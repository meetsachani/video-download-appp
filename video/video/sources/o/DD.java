package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import o.C7025iN1;

/* loaded from: classes3.dex */
public class DD extends AbstractC3808Oc0 {
    public static final int n = 100;

    /* renamed from: o  reason: collision with root package name */
    public static final int f437o = 150;
    public static final float p = 0.8f;
    public final int e;
    public final int f;
    @InterfaceC5670cr1
    public final TimeInterpolator g;
    @InterfaceC5670cr1
    public final TimeInterpolator h;
    @InterfaceC11300zs1
    public EditText i;
    public final View.OnClickListener j;
    public final View.OnFocusChangeListener k;
    public AnimatorSet l;
    public ValueAnimator m;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DD.this.b.f0(true);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DD.this.b.f0(false);
        }
    }

    public DD(@InterfaceC5670cr1 com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.j = new View.OnClickListener() { // from class: o.yD
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DD.v(DD.this, view);
            }
        };
        this.k = new View.OnFocusChangeListener() { // from class: o.zD
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                r0.A(DD.this.E());
            }
        };
        Context context = aVar.getContext();
        int i = C7025iN1.c.motionDurationShort3;
        this.e = C9811tl1.f(context, i, 100);
        this.f = C9811tl1.f(aVar.getContext(), i, 150);
        this.g = C9811tl1.g(aVar.getContext(), C7025iN1.c.motionEasingLinearInterpolator, C5600ca.a);
        this.h = C9811tl1.g(aVar.getContext(), C7025iN1.c.motionEasingEmphasizedInterpolator, C5600ca.d);
    }

    public static /* synthetic */ void v(DD dd, View view) {
        EditText editText = dd.i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        dd.r();
    }

    public static /* synthetic */ void x(DD dd, ValueAnimator valueAnimator) {
        dd.getClass();
        dd.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(DD dd, ValueAnimator valueAnimator) {
        dd.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dd.d.setScaleX(floatValue);
        dd.d.setScaleY(floatValue);
    }

    public final void A(boolean z) {
        boolean z2;
        if (this.b.I() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
            }
        } else if (!z) {
            this.l.cancel();
            this.m.start();
            if (z2) {
                this.m.end();
            }
        }
    }

    public final ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.g);
        ofFloat.setDuration(this.e);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.AD
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DD.x(DD.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    public final ValueAnimator C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.CD
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DD.y(DD.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    public final void D() {
        ValueAnimator C = C();
        ValueAnimator B = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(C, B);
        this.l.addListener(new a());
        ValueAnimator B2 = B(1.0f, 0.0f);
        this.m = B2;
        B2.addListener(new b());
    }

    public final boolean E() {
        EditText editText = this.i;
        if (editText != null) {
            if ((editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3808Oc0
    public void a(@InterfaceC5670cr1 Editable editable) {
        if (this.b.y() != null) {
            return;
        }
        A(E());
    }

    @Override // o.AbstractC3808Oc0
    public int c() {
        return C7025iN1.m.clear_text_end_icon_content_description;
    }

    @Override // o.AbstractC3808Oc0
    public int d() {
        return C7025iN1.g.mtrl_ic_cancel;
    }

    @Override // o.AbstractC3808Oc0
    public View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // o.AbstractC3808Oc0
    public View.OnClickListener f() {
        return this.j;
    }

    @Override // o.AbstractC3808Oc0
    public View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // o.AbstractC3808Oc0
    public void n(@InterfaceC11300zs1 EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(E());
    }

    @Override // o.AbstractC3808Oc0
    public void q(boolean z) {
        if (this.b.y() == null) {
            return;
        }
        A(z);
    }

    @Override // o.AbstractC3808Oc0
    public void s() {
        D();
    }

    @Override // o.AbstractC3808Oc0
    public void u() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: o.BD
                @Override // java.lang.Runnable
                public final void run() {
                    DD.this.A(true);
                }
            });
        }
    }
}
