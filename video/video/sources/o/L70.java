package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.CheckableImageButton;
import o.C7025iN1;

/* loaded from: classes3.dex */
public class L70 extends AbstractC3808Oc0 {
    public static final int s = 50;
    public static final int t = 67;
    public final int e;
    public final int f;
    @InterfaceC5670cr1
    public final TimeInterpolator g;
    @InterfaceC11300zs1
    public AutoCompleteTextView h;
    public final View.OnClickListener i;
    public final View.OnFocusChangeListener j;
    public final AccessibilityManager.TouchExplorationStateChangeListener k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public long f528o;
    @InterfaceC11300zs1
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            L70.this.r();
            L70.this.r.start();
        }
    }

    public L70(@InterfaceC5670cr1 com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.i = new View.OnClickListener() { // from class: o.H70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L70.this.J();
            }
        };
        this.j = new View.OnFocusChangeListener() { // from class: o.I70
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                L70.y(L70.this, view, z);
            }
        };
        this.k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: o.J70
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                L70.w(L70.this, z);
            }
        };
        this.f528o = Long.MAX_VALUE;
        Context context = aVar.getContext();
        int i = C7025iN1.c.motionDurationShort3;
        this.f = C9811tl1.f(context, i, 67);
        this.e = C9811tl1.f(aVar.getContext(), i, 50);
        this.g = C9811tl1.g(aVar.getContext(), C7025iN1.c.motionEasingLinearInterpolator, C5600ca.a);
    }

    public static /* synthetic */ void A(L70 l70) {
        l70.K();
        l70.H(false);
    }

    @InterfaceC5670cr1
    public static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private void F() {
        this.r = E(this.f, 0.0f, 1.0f);
        ValueAnimator E = E(this.e, 1.0f, 0.0f);
        this.q = E;
        E.addListener(new a());
    }

    public static /* synthetic */ void v(L70 l70) {
        boolean isPopupShowing = l70.h.isPopupShowing();
        l70.H(isPopupShowing);
        l70.m = isPopupShowing;
    }

    public static /* synthetic */ void w(L70 l70, boolean z) {
        int i;
        AutoCompleteTextView autoCompleteTextView = l70.h;
        if (autoCompleteTextView != null && !K90.a(autoCompleteTextView)) {
            CheckableImageButton checkableImageButton = l70.d;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            checkableImageButton.setImportantForAccessibility(i);
        }
    }

    public static /* synthetic */ void x(L70 l70, ValueAnimator valueAnimator) {
        l70.getClass();
        l70.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(L70 l70, View view, boolean z) {
        l70.l = z;
        l70.r();
        if (!z) {
            l70.H(false);
            l70.m = false;
        }
    }

    public static /* synthetic */ boolean z(L70 l70, View view, MotionEvent motionEvent) {
        l70.getClass();
        if (motionEvent.getAction() == 1) {
            if (l70.G()) {
                l70.m = false;
            }
            l70.J();
            l70.K();
        }
        return false;
    }

    public final ValueAnimator E(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.g);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.E70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                L70.x(L70.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    public final boolean G() {
        long uptimeMillis = SystemClock.uptimeMillis() - this.f528o;
        if (uptimeMillis >= 0 && uptimeMillis <= 300) {
            return false;
        }
        return true;
    }

    public final void H(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void I() {
        this.h.setOnTouchListener(new View.OnTouchListener() { // from class: o.F70
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return L70.z(L70.this, view, motionEvent);
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: o.G70
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                L70.A(L70.this);
            }
        });
        this.h.setThreshold(0);
    }

    public final void J() {
        if (this.h == null) {
            return;
        }
        if (G()) {
            this.m = false;
        }
        if (!this.m) {
            H(!this.n);
            if (this.n) {
                this.h.requestFocus();
                this.h.showDropDown();
                return;
            }
            this.h.dismissDropDown();
            return;
        }
        this.m = false;
    }

    public final void K() {
        this.m = true;
        this.f528o = SystemClock.uptimeMillis();
    }

    @Override // o.AbstractC3808Oc0
    public void a(Editable editable) {
        if (this.p.isTouchExplorationEnabled() && K90.a(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new Runnable() { // from class: o.K70
            @Override // java.lang.Runnable
            public final void run() {
                L70.v(L70.this);
            }
        });
    }

    @Override // o.AbstractC3808Oc0
    public int c() {
        return C7025iN1.m.exposed_dropdown_menu_content_description;
    }

    @Override // o.AbstractC3808Oc0
    public int d() {
        return C7025iN1.g.mtrl_dropdown_arrow;
    }

    @Override // o.AbstractC3808Oc0
    public View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // o.AbstractC3808Oc0
    public View.OnClickListener f() {
        return this.i;
    }

    @Override // o.AbstractC3808Oc0
    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // o.AbstractC3808Oc0
    public boolean i(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC3808Oc0
    public boolean j() {
        return true;
    }

    @Override // o.AbstractC3808Oc0
    public boolean k() {
        return this.l;
    }

    @Override // o.AbstractC3808Oc0
    public boolean l() {
        return true;
    }

    @Override // o.AbstractC3808Oc0
    public boolean m() {
        return this.n;
    }

    @Override // o.AbstractC3808Oc0
    public void n(@InterfaceC11300zs1 EditText editText) {
        this.h = D(editText);
        I();
        this.a.setErrorIconDrawable((Drawable) null);
        if (!K90.a(editText) && this.p.isTouchExplorationEnabled()) {
            this.d.setImportantForAccessibility(2);
        }
        this.a.setEndIconVisible(true);
    }

    @Override // o.AbstractC3808Oc0
    public void o(View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
        if (!K90.a(this.h)) {
            c10861y4.k1(Spinner.class.getName());
        }
        if (c10861y4.K0()) {
            c10861y4.C1(null);
        }
    }

    @Override // o.AbstractC3808Oc0
    @SuppressLint({"WrongConstant"})
    public void p(View view, @InterfaceC5670cr1 AccessibilityEvent accessibilityEvent) {
        boolean z;
        if (this.p.isEnabled() && !K90.a(this.h)) {
            if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing()) {
                z = true;
            } else {
                z = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z) {
                J();
                K();
            }
        }
    }

    @Override // o.AbstractC3808Oc0
    public void s() {
        F();
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // o.AbstractC3808Oc0
    public boolean t() {
        return true;
    }

    @Override // o.AbstractC3808Oc0
    @SuppressLint({"ClickableViewAccessibility"})
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }
}
