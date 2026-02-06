package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import o.C10201vM;
import o.C10907yF1;
import o.C4146Ro;
import o.C4394Uc1;
import o.C4491Vc1;
import o.C5600ca;
import o.C5798dN0;
import o.C7025iN1;
import o.C7069ia;
import o.C9076ql1;
import o.C9536sd1;
import o.C9811tl1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC6946i32;
import o.N22;
import o.O22;
import o.QU1;

/* loaded from: classes3.dex */
public class a {
    public static final long D = 100;
    public static final long E = 100;
    public static final int F = 0;
    public static final int G = 1;
    public static final int H = 2;
    public static final float I = 1.5f;
    public static final float J = 0.0f;
    public static final float K = 0.4f;
    public static final float L = 0.4f;
    public static final float M = 1.0f;
    public static final float N = 1.0f;
    public static final float O = 1.0f;
    public static final float P = 0.0f;
    public static final float Q = 0.0f;
    @InterfaceC11300zs1
    public ViewTreeObserver.OnPreDrawListener B;
    @InterfaceC11300zs1
    public O22 a;
    @InterfaceC11300zs1
    public C4394Uc1 b;
    @InterfaceC11300zs1
    public Drawable c;
    @InterfaceC11300zs1
    public C4146Ro d;
    @InterfaceC11300zs1
    public Drawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;
    public int k;
    @InterfaceC11300zs1
    public StateListAnimator l;
    @InterfaceC11300zs1
    public Animator m;
    @InterfaceC11300zs1
    public C9076ql1 n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public C9076ql1 f321o;
    public int q;
    public ArrayList<Animator.AnimatorListener> s;
    public ArrayList<Animator.AnimatorListener> t;
    public ArrayList<f> u;
    public final FloatingActionButton v;
    public final N22 w;
    public static final TimeInterpolator C = C5600ca.c;
    public static final int R = C7025iN1.c.motionDurationLong2;
    public static final int S = C7025iN1.c.motionEasingEmphasizedInterpolator;
    public static final int T = C7025iN1.c.motionDurationMedium1;
    public static final int U = C7025iN1.c.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] V = {16842919, 16842910};
    public static final int[] W = {16843623, 16842908, 16842910};
    public static final int[] X = {16842908, 16842910};
    public static final int[] Y = {16843623, 16842910};
    public static final int[] Z = {16842910};
    public static final int[] a0 = new int[0];
    public boolean g = true;
    public float p = 1.0f;
    public int r = 0;
    public final Rect x = new Rect();
    public final RectF y = new RectF();
    public final RectF z = new RectF();
    public final Matrix A = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0127a extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ g c;

        public C0127a(boolean z, g gVar) {
            this.b = z;
            this.c = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i;
            a.this.r = 0;
            a.this.m = null;
            if (!this.a) {
                FloatingActionButton floatingActionButton = a.this.v;
                boolean z = this.b;
                if (z) {
                    i = 8;
                } else {
                    i = 4;
                }
                floatingActionButton.b(i, z);
                g gVar = this.c;
                if (gVar != null) {
                    gVar.b();
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.v.b(0, this.b);
            a.this.r = 1;
            a.this.m = animator;
            this.a = false;
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ g b;

        public b(boolean z, g gVar) {
            this.a = z;
            this.b = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.r = 0;
            a.this.m = null;
            g gVar = this.b;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.v.b(0, this.a);
            a.this.r = 2;
            a.this.m = animator;
        }
    }

    /* loaded from: classes3.dex */
    public class c extends C9536sd1 {
        public c() {
        }

        @Override // o.C9536sd1, android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, @InterfaceC5670cr1 Matrix matrix, @InterfaceC5670cr1 Matrix matrix2) {
            a.this.p = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements TypeEvaluator<Float> {
        public final FloatEvaluator a = new FloatEvaluator();

        public d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends C4394Uc1 {
        public e(O22 o22) {
            super(o22);
        }

        @Override // o.C4394Uc1, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public interface f {
        void a();

        void b();
    }

    /* loaded from: classes3.dex */
    public interface g {
        void a();

        void b();
    }

    public a(FloatingActionButton floatingActionButton, N22 n22) {
        this.v = floatingActionButton;
        this.w = n22;
    }

    public static /* synthetic */ void a(a aVar, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Matrix matrix, ValueAnimator valueAnimator) {
        aVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        aVar.v.setAlpha(C5600ca.b(f2, f3, 0.0f, 0.2f, floatValue));
        aVar.v.setScaleX(C5600ca.a(f4, f5, floatValue));
        aVar.v.setScaleY(C5600ca.a(f6, f5, floatValue));
        aVar.p = C5600ca.a(f7, f8, floatValue);
        aVar.h(C5600ca.a(f7, f8, floatValue), matrix);
        aVar.v.setImageMatrix(matrix);
    }

    public void A(ColorStateList colorStateList, @InterfaceC11300zs1 PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        C4394Uc1 n = n();
        this.b = n;
        n.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        this.b.i0(this.v.getContext());
        if (i > 0) {
            this.d = j(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) C10907yF1.l(this.d), (Drawable) C10907yF1.l(this.b)});
        } else {
            this.d = null;
            drawable = this.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(QU1.e(colorStateList2), drawable, null);
        this.c = rippleDrawable;
        this.e = rippleDrawable;
    }

    public boolean B() {
        if (this.v.getVisibility() == 0) {
            if (this.r != 1) {
                return false;
            }
            return true;
        } else if (this.r == 2) {
            return false;
        } else {
            return true;
        }
    }

    public boolean C() {
        if (this.v.getVisibility() != 0) {
            if (this.r != 2) {
                return false;
            }
            return true;
        } else if (this.r == 1) {
            return false;
        } else {
            return true;
        }
    }

    public void D() {
        C4394Uc1 c4394Uc1 = this.b;
        if (c4394Uc1 != null) {
            C4491Vc1.f(this.v, c4394Uc1);
        }
    }

    public void E() {
        g0();
    }

    public void F() {
        ViewTreeObserver viewTreeObserver = this.v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.B;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.B = null;
        }
    }

    public void G() {
        if (this.v.isEnabled()) {
            this.v.setElevation(this.h);
            if (this.v.isPressed()) {
                this.v.setTranslationZ(this.j);
                return;
            } else if (!this.v.isFocused() && !this.v.isHovered()) {
                this.v.setTranslationZ(0.0f);
                return;
            } else {
                this.v.setTranslationZ(this.i);
                return;
            }
        }
        this.v.setElevation(0.0f);
        this.v.setTranslationZ(0.0f);
    }

    public void H(float f2, float f3, float f4) {
        if (this.v.getStateListAnimator() == this.l) {
            StateListAnimator l = l(f2, f3, f4);
            this.l = l;
            this.v.setStateListAnimator(l);
        }
        if (c0()) {
            g0();
        }
    }

    public void I(@InterfaceC5670cr1 Rect rect) {
        C10907yF1.m(this.e, "Didn't initialize content background");
        if (c0()) {
            this.w.a(new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.w.a(this.e);
    }

    public void J() {
        ArrayList<f> arrayList = this.u;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void K() {
        ArrayList<f> arrayList = this.u;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void L(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void M(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.s;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void N(@InterfaceC5670cr1 f fVar) {
        ArrayList<f> arrayList = this.u;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(fVar);
    }

    public void O(@InterfaceC11300zs1 ColorStateList colorStateList) {
        C4394Uc1 c4394Uc1 = this.b;
        if (c4394Uc1 != null) {
            c4394Uc1.setTintList(colorStateList);
        }
        C4146Ro c4146Ro = this.d;
        if (c4146Ro != null) {
            c4146Ro.d(colorStateList);
        }
    }

    public void P(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        C4394Uc1 c4394Uc1 = this.b;
        if (c4394Uc1 != null) {
            c4394Uc1.setTintMode(mode);
        }
    }

    public final void Q(float f2) {
        if (this.h != f2) {
            this.h = f2;
            H(f2, this.i, this.j);
        }
    }

    public void R(boolean z) {
        this.f = z;
    }

    public final void S(@InterfaceC11300zs1 C9076ql1 c9076ql1) {
        this.f321o = c9076ql1;
    }

    public final void T(float f2) {
        if (this.i != f2) {
            this.i = f2;
            H(this.h, f2, this.j);
        }
    }

    public final void U(float f2) {
        this.p = f2;
        Matrix matrix = this.A;
        h(f2, matrix);
        this.v.setImageMatrix(matrix);
    }

    public final void V(int i) {
        if (this.q != i) {
            this.q = i;
            f0();
        }
    }

    public void W(int i) {
        this.k = i;
    }

    public final void X(float f2) {
        if (this.j != f2) {
            this.j = f2;
            H(this.h, this.i, f2);
        }
    }

    public void Y(@InterfaceC11300zs1 ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(QU1.e(colorStateList));
        } else if (drawable != null) {
            drawable.setTintList(QU1.e(colorStateList));
        }
    }

    public void Z(boolean z) {
        this.g = z;
        g0();
    }

    public final void a0(@InterfaceC5670cr1 O22 o22) {
        this.a = o22;
        C4394Uc1 c4394Uc1 = this.b;
        if (c4394Uc1 != null) {
            c4394Uc1.setShapeAppearanceModel(o22);
        }
        Drawable drawable = this.c;
        if (drawable instanceof InterfaceC6946i32) {
            ((InterfaceC6946i32) drawable).setShapeAppearanceModel(o22);
        }
        C4146Ro c4146Ro = this.d;
        if (c4146Ro != null) {
            c4146Ro.g(o22);
        }
    }

    public final void b0(@InterfaceC11300zs1 C9076ql1 c9076ql1) {
        this.n = c9076ql1;
    }

    public boolean c0() {
        if (!this.w.c() && !z()) {
            return false;
        }
        return true;
    }

    public final boolean d0() {
        if (this.v.isLaidOut() && !this.v.isInEditMode()) {
            return true;
        }
        return false;
    }

    public void e(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        if (this.t == null) {
            this.t = new ArrayList<>();
        }
        this.t.add(animatorListener);
    }

    public void e0(@InterfaceC11300zs1 g gVar, boolean z) {
        boolean z2;
        AnimatorSet k;
        a aVar;
        float f2;
        float f3;
        if (!C()) {
            Animator animator = this.m;
            if (animator != null) {
                animator.cancel();
            }
            if (this.n == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (d0()) {
                if (this.v.getVisibility() != 0) {
                    float f4 = 0.0f;
                    this.v.setAlpha(0.0f);
                    FloatingActionButton floatingActionButton = this.v;
                    if (z2) {
                        f2 = 0.4f;
                    } else {
                        f2 = 0.0f;
                    }
                    floatingActionButton.setScaleY(f2);
                    FloatingActionButton floatingActionButton2 = this.v;
                    if (z2) {
                        f3 = 0.4f;
                    } else {
                        f3 = 0.0f;
                    }
                    floatingActionButton2.setScaleX(f3);
                    if (z2) {
                        f4 = 0.4f;
                    }
                    U(f4);
                }
                C9076ql1 c9076ql1 = this.n;
                if (c9076ql1 != null) {
                    k = i(c9076ql1, 1.0f, 1.0f, 1.0f);
                    aVar = this;
                } else {
                    k = k(1.0f, 1.0f, 1.0f, R, S);
                    aVar = this;
                }
                k.addListener(new b(z, gVar));
                ArrayList<Animator.AnimatorListener> arrayList = aVar.s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        k.addListener(it.next());
                    }
                }
                k.start();
                return;
            }
            this.v.b(0, z);
            this.v.setAlpha(1.0f);
            this.v.setScaleY(1.0f);
            this.v.setScaleX(1.0f);
            U(1.0f);
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    public void f(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        if (this.s == null) {
            this.s = new ArrayList<>();
        }
        this.s.add(animatorListener);
    }

    public final void f0() {
        U(this.p);
    }

    public void g(@InterfaceC5670cr1 f fVar) {
        if (this.u == null) {
            this.u = new ArrayList<>();
        }
        this.u.add(fVar);
    }

    public final void g0() {
        Rect rect = this.x;
        t(rect);
        I(rect);
        this.w.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void h(float f2, @InterfaceC5670cr1 Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.v.getDrawable();
        if (drawable != null && this.q != 0) {
            RectF rectF = this.y;
            RectF rectF2 = this.z;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int i = this.q;
            rectF2.set(0.0f, 0.0f, i, i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.q;
            matrix.postScale(f2, f2, i2 / 2.0f, i2 / 2.0f);
        }
    }

    public void h0(float f2) {
        C4394Uc1 c4394Uc1 = this.b;
        if (c4394Uc1 != null) {
            c4394Uc1.x0(f2);
        }
    }

    @InterfaceC5670cr1
    public final AnimatorSet i(@InterfaceC5670cr1 C9076ql1 c9076ql1, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.v, View.ALPHA, f2);
        c9076ql1.h("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.v, View.SCALE_X, f3);
        c9076ql1.h("scale").a(ofFloat2);
        i0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.v, View.SCALE_Y, f3);
        c9076ql1.h("scale").a(ofFloat3);
        i0(ofFloat3);
        arrayList.add(ofFloat3);
        h(f4, this.A);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.v, new C5798dN0(), new c(), new Matrix(this.A));
        c9076ql1.h("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C7069ia.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final void i0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    @InterfaceC5670cr1
    public C4146Ro j(int i, ColorStateList colorStateList) {
        Context context = this.v.getContext();
        C4146Ro c4146Ro = new C4146Ro((O22) C10907yF1.l(this.a));
        c4146Ro.f(C10201vM.g(context, C7025iN1.e.design_fab_stroke_top_outer_color), C10201vM.g(context, C7025iN1.e.design_fab_stroke_top_inner_color), C10201vM.g(context, C7025iN1.e.design_fab_stroke_end_inner_color), C10201vM.g(context, C7025iN1.e.design_fab_stroke_end_outer_color));
        c4146Ro.e(i);
        c4146Ro.d(colorStateList);
        return c4146Ro;
    }

    public final AnimatorSet k(final float f2, final float f3, final float f4, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float alpha = this.v.getAlpha();
        final float scaleX = this.v.getScaleX();
        final float scaleY = this.v.getScaleY();
        final float f5 = this.p;
        final Matrix matrix = new Matrix(this.A);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.Jv0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.google.android.material.floatingactionbutton.a.a(com.google.android.material.floatingactionbutton.a.this, alpha, f2, scaleX, f3, scaleY, f5, f4, matrix, valueAnimator);
            }
        });
        arrayList.add(ofFloat);
        C7069ia.a(animatorSet, arrayList);
        animatorSet.setDuration(C9811tl1.f(this.v.getContext(), i, this.v.getContext().getResources().getInteger(C7025iN1.i.material_motion_duration_long_1)));
        animatorSet.setInterpolator(C9811tl1.g(this.v.getContext(), i2, C5600ca.b));
        return animatorSet;
    }

    @InterfaceC5670cr1
    public final StateListAnimator l(float f2, float f3, float f4) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(V, m(f2, f4));
        stateListAnimator.addState(W, m(f2, f3));
        stateListAnimator.addState(X, m(f2, f3));
        stateListAnimator.addState(Y, m(f2, f3));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.v, "elevation", f2).setDuration(0L));
        if (Build.VERSION.SDK_INT <= 24) {
            FloatingActionButton floatingActionButton = this.v;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.v, View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C);
        stateListAnimator.addState(Z, animatorSet);
        stateListAnimator.addState(a0, m(0.0f, 0.0f));
        return stateListAnimator;
    }

    @InterfaceC5670cr1
    public final Animator m(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.v, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.v, View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(C);
        return animatorSet;
    }

    public C4394Uc1 n() {
        return new e((O22) C10907yF1.l(this.a));
    }

    @InterfaceC11300zs1
    public final Drawable o() {
        return this.e;
    }

    public float p() {
        return this.v.getElevation();
    }

    public boolean q() {
        return this.f;
    }

    @InterfaceC11300zs1
    public final C9076ql1 r() {
        return this.f321o;
    }

    public float s() {
        return this.i;
    }

    public void t(@InterfaceC5670cr1 Rect rect) {
        float f2;
        if (this.w.c()) {
            int x = x();
            if (this.g) {
                f2 = p() + this.j;
            } else {
                f2 = 0.0f;
            }
            int max = Math.max(x, (int) Math.ceil(f2));
            int max2 = Math.max(x, (int) Math.ceil(f2 * 1.5f));
            rect.set(max, max2, max, max2);
        } else if (z()) {
            int sizeDimension = (this.k - this.v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    public float u() {
        return this.j;
    }

    @InterfaceC11300zs1
    public final O22 v() {
        return this.a;
    }

    @InterfaceC11300zs1
    public final C9076ql1 w() {
        return this.n;
    }

    public int x() {
        if (!this.f) {
            return 0;
        }
        return Math.max((this.k - this.v.getSizeDimension()) / 2, 0);
    }

    public void y(@InterfaceC11300zs1 g gVar, boolean z) {
        int i;
        a aVar;
        AnimatorSet k;
        if (!B()) {
            Animator animator = this.m;
            if (animator != null) {
                animator.cancel();
            }
            if (d0()) {
                C9076ql1 c9076ql1 = this.f321o;
                if (c9076ql1 != null) {
                    k = i(c9076ql1, 0.0f, 0.0f, 0.0f);
                    aVar = this;
                } else {
                    aVar = this;
                    k = aVar.k(0.0f, 0.4f, 0.4f, T, U);
                }
                k.addListener(new C0127a(z, gVar));
                ArrayList<Animator.AnimatorListener> arrayList = aVar.t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        k.addListener(it.next());
                    }
                }
                k.start();
                return;
            }
            FloatingActionButton floatingActionButton = this.v;
            if (z) {
                i = 8;
            } else {
                i = 4;
            }
            floatingActionButton.b(i, z);
            if (gVar != null) {
                gVar.b();
            }
        }
    }

    public final boolean z() {
        if (this.f && this.v.getSizeDimension() < this.k) {
            return true;
        }
        return false;
    }
}
