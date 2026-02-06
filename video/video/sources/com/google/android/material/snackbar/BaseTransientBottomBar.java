package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o.BR0;
import o.BY0;
import o.C10861y4;
import o.C10920yI2;
import o.C4297Tc1;
import o.C4394Uc1;
import o.C5600ca;
import o.C6516gH2;
import o.C6597gd1;
import o.C7025iN1;
import o.C7608kn2;
import o.C9179r91;
import o.C9811tl1;
import o.D60;
import o.ES1;
import o.FM2;
import o.HT1;
import o.InterfaceC10336vu1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC8494oM;
import o.JF;
import o.O22;
import o.PL0;
import o.Q3;
import o.RL2;

/* loaded from: classes3.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = -2;
    public static final int D = -1;
    public static final int E = 0;
    public static final int F = 250;
    public static final int G = 180;
    public static final int I = 150;
    public static final int J = 75;
    public static final float M = 0.8f;
    public static final int O = 0;
    public static final int P = 1;
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    @InterfaceC5670cr1
    public final ViewGroup g;
    public final Context h;
    @InterfaceC5670cr1
    public final w i;
    @InterfaceC5670cr1
    public final InterfaceC8494oM j;
    public int k;
    public boolean l;
    @InterfaceC11300zs1
    public q m;
    public boolean n;
    @ES1(29)

    /* renamed from: o  reason: collision with root package name */
    public final Runnable f324o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public List<s<B>> w;
    public Behavior x;
    @InterfaceC11300zs1
    public final AccessibilityManager y;
    @InterfaceC5670cr1
    public a.b z;
    public static final TimeInterpolator H = C5600ca.b;
    public static final TimeInterpolator K = C5600ca.a;
    public static final TimeInterpolator L = C5600ca.d;
    public static final int[] Q = {C7025iN1.c.snackbarStyle};
    public static final String R = BaseTransientBottomBar.class.getSimpleName();
    @InterfaceC5670cr1
    public static final Handler N = new Handler(Looper.getMainLooper(), new h());

    /* loaded from: classes3.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {
        @InterfaceC5670cr1
        public final t p1 = new t(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean O(View view) {
            return this.p1.a(view);
        }

        public final void d0(@InterfaceC5670cr1 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.p1.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean s(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 MotionEvent motionEvent) {
            this.p1.b(coordinatorLayout, view, motionEvent);
            return super.s(coordinatorLayout, view, motionEvent);
        }
    }

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.X(this.a);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@InterfaceC5670cr1 ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes3.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@InterfaceC5670cr1 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.i.setScaleX(floatValue);
            BaseTransientBottomBar.this.i.setScaleY(floatValue);
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Y();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.j.a(BaseTransientBottomBar.this.c - BaseTransientBottomBar.this.a, BaseTransientBottomBar.this.a);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@InterfaceC5670cr1 ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* loaded from: classes3.dex */
    public class f extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;

        public f(int i) {
            this.a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.X(this.a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.j.b(0, BaseTransientBottomBar.this.b);
        }
    }

    /* loaded from: classes3.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@InterfaceC5670cr1 ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@InterfaceC5670cr1 Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                ((BaseTransientBottomBar) message.obj).O(message.arg1);
                return true;
            }
            ((BaseTransientBottomBar) message.obj).m0();
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.i != null && baseTransientBottomBar.h != null) {
                int height = (FM2.a(BaseTransientBottomBar.this.h).height() - BaseTransientBottomBar.this.M()) + ((int) BaseTransientBottomBar.this.i.getTranslationY());
                if (height >= BaseTransientBottomBar.this.t) {
                    BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                    baseTransientBottomBar2.u = baseTransientBottomBar2.t;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.i.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.R, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
                baseTransientBottomBar3.u = baseTransientBottomBar3.t;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.t - height;
                BaseTransientBottomBar.this.i.requestLayout();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class j implements InterfaceC10336vu1 {
        public j() {
        }

        @Override // o.InterfaceC10336vu1
        @InterfaceC5670cr1
        public RL2 a(View view, @InterfaceC5670cr1 RL2 rl2) {
            BaseTransientBottomBar.this.p = rl2.o();
            BaseTransientBottomBar.this.q = rl2.p();
            BaseTransientBottomBar.this.r = rl2.q();
            BaseTransientBottomBar.this.s0();
            return rl2;
        }
    }

    /* loaded from: classes3.dex */
    public class k extends Q3 {
        public k() {
        }

        @Override // o.Q3
        public void g(View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.a(1048576);
            c10861y4.s1(true);
        }

        @Override // o.Q3
        public boolean j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                BaseTransientBottomBar.this.z();
                return true;
            }
            return super.j(view, i, bundle);
        }
    }

    /* loaded from: classes3.dex */
    public class l implements a.b {
        public l() {
        }

        @Override // com.google.android.material.snackbar.a.b
        public void a(int i) {
            Handler handler = BaseTransientBottomBar.N;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.a.b
        public void show() {
            Handler handler = BaseTransientBottomBar.N;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* loaded from: classes3.dex */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.X(3);
        }
    }

    /* loaded from: classes3.dex */
    public class n implements SwipeDismissBehavior.c {
        public n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(@InterfaceC5670cr1 View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.A(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i) {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    return;
                }
                com.google.android.material.snackbar.a.c().k(BaseTransientBottomBar.this.z);
                return;
            }
            com.google.android.material.snackbar.a.c().l(BaseTransientBottomBar.this.z);
        }
    }

    /* loaded from: classes3.dex */
    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVar = BaseTransientBottomBar.this.i;
            if (wVar == null) {
                return;
            }
            if (wVar.getParent() != null) {
                BaseTransientBottomBar.this.i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.o0();
            } else {
                BaseTransientBottomBar.this.q0();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class p extends AnimatorListenerAdapter {
        public p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Y();
        }
    }

    /* loaded from: classes3.dex */
    public static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        @InterfaceC5670cr1
        public final WeakReference<BaseTransientBottomBar> X;
        @InterfaceC5670cr1
        public final WeakReference<View> Y;

        public q(@InterfaceC5670cr1 BaseTransientBottomBar baseTransientBottomBar, @InterfaceC5670cr1 View view) {
            this.X = new WeakReference<>(baseTransientBottomBar);
            this.Y = new WeakReference<>(view);
        }

        public static q a(@InterfaceC5670cr1 BaseTransientBottomBar baseTransientBottomBar, @InterfaceC5670cr1 View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (view.isAttachedToWindow()) {
                C10920yI2.b(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        @InterfaceC11300zs1
        public View b() {
            return this.Y.get();
        }

        public void c() {
            if (this.Y.get() != null) {
                this.Y.get().removeOnAttachStateChangeListener(this);
                C10920yI2.u(this.Y.get(), this);
            }
            this.Y.clear();
            this.X.clear();
        }

        public final boolean d() {
            if (this.X.get() == null) {
                c();
                return true;
            }
            return false;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d() && this.X.get().n) {
                this.X.get().Z();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            C10920yI2.b(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            C10920yI2.u(view, this);
        }
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface r {
    }

    /* loaded from: classes3.dex */
    public static abstract class s<B> {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;

        @HT1({HT1.a.Y})
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface a {
        }

        public void a(B b2, int i) {
        }

        public void b(B b2) {
        }
    }

    @HT1({HT1.a.Y})
    /* loaded from: classes3.dex */
    public static class t {
        public a.b a;

        public t(@InterfaceC5670cr1 SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.Z(0.1f);
            swipeDismissBehavior.W(0.6f);
            swipeDismissBehavior.a0(0);
        }

        public boolean a(View view) {
            return view instanceof w;
        }

        public void b(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    com.google.android.material.snackbar.a.c().l(this.a);
                }
            } else if (coordinatorLayout.G(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                com.google.android.material.snackbar.a.c().k(this.a);
            }
        }

        public void c(@InterfaceC5670cr1 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.a = baseTransientBottomBar.z;
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface u extends InterfaceC8494oM {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    @BR0(from = -2)
    /* loaded from: classes3.dex */
    public @interface v {
    }

    @HT1({HT1.a.Y})
    /* loaded from: classes3.dex */
    public static class w extends FrameLayout {
        public static final View.OnTouchListener j1 = new a();
        @InterfaceC11300zs1
        public BaseTransientBottomBar<?> Y0;
        @InterfaceC11300zs1
        public O22 Z0;
        public int a1;
        public final float b1;
        public final float c1;
        public final int d1;
        public final int e1;
        public ColorStateList f1;
        public PorterDuff.Mode g1;
        @InterfaceC11300zs1
        public Rect h1;
        public boolean i1;

        /* loaded from: classes3.dex */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public w(@InterfaceC5670cr1 Context context) {
            this(context, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.Y0 = baseTransientBottomBar;
        }

        public void c(ViewGroup viewGroup) {
            this.i1 = true;
            viewGroup.addView(this);
            this.i1 = false;
        }

        @InterfaceC5670cr1
        public final Drawable d() {
            int v = C9179r91.v(this, C7025iN1.c.colorSurface, C7025iN1.c.colorOnSurface, getBackgroundOverlayColorAlpha());
            O22 o22 = this.Z0;
            Drawable y = o22 != null ? BaseTransientBottomBar.y(v, o22) : BaseTransientBottomBar.x(v, getResources());
            if (this.f1 != null) {
                Drawable r = D60.r(y);
                r.setTintList(this.f1);
                return r;
            }
            return D60.r(y);
        }

        public final void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.h1 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.c1;
        }

        public int getAnimationMode() {
            return this.a1;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.b1;
        }

        public int getMaxInlineActionWidth() {
            return this.e1;
        }

        public int getMaxWidth() {
            return this.d1;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.Y0;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.U();
            }
            requestApplyInsets();
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.Y0;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.V();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.Y0;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.W();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.d1 > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.d1;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setAnimationMode(int i) {
            this.a1 = i;
        }

        @Override // android.view.View
        public void setBackground(@InterfaceC11300zs1 Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@InterfaceC11300zs1 Drawable drawable) {
            if (drawable != null && this.f1 != null) {
                drawable = D60.r(drawable.mutate());
                drawable.setTintList(this.f1);
                drawable.setTintMode(this.g1);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
            this.f1 = colorStateList;
            if (getBackground() != null) {
                Drawable r = D60.r(getBackground().mutate());
                r.setTintList(colorStateList);
                r.setTintMode(this.g1);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
            this.g1 = mode;
            if (getBackground() != null) {
                Drawable r = D60.r(getBackground().mutate());
                r.setTintMode(mode);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.i1 && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                e((ViewGroup.MarginLayoutParams) layoutParams);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.Y0;
                if (baseTransientBottomBar != null) {
                    baseTransientBottomBar.s0();
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@InterfaceC11300zs1 View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener;
            if (onClickListener != null) {
                onTouchListener = null;
            } else {
                onTouchListener = j1;
            }
            setOnTouchListener(onTouchListener);
            super.setOnClickListener(onClickListener);
        }

        public w(@InterfaceC5670cr1 Context context, AttributeSet attributeSet) {
            super(C6597gd1.d(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C7025iN1.o.kc);
            int i = C7025iN1.o.rc;
            if (obtainStyledAttributes.hasValue(i)) {
                setElevation(obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.a1 = obtainStyledAttributes.getInt(C7025iN1.o.nc, 0);
            if (obtainStyledAttributes.hasValue(C7025iN1.o.tc) || obtainStyledAttributes.hasValue(C7025iN1.o.uc)) {
                this.Z0 = O22.e(context2, attributeSet, 0, 0).m();
            }
            this.b1 = obtainStyledAttributes.getFloat(C7025iN1.o.oc, 1.0f);
            setBackgroundTintList(C4297Tc1.a(context2, obtainStyledAttributes, C7025iN1.o.pc));
            setBackgroundTintMode(C10920yI2.t(obtainStyledAttributes.getInt(C7025iN1.o.qc, -1), PorterDuff.Mode.SRC_IN));
            this.c1 = obtainStyledAttributes.getFloat(C7025iN1.o.mc, 1.0f);
            this.d1 = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.lc, -1);
            this.e1 = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.sc, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(j1);
            setFocusable(true);
            if (getBackground() == null) {
                setBackground(d());
            }
        }
    }

    public BaseTransientBottomBar(@InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 InterfaceC8494oM interfaceC8494oM) {
        this(viewGroup.getContext(), viewGroup, view, interfaceC8494oM);
    }

    @InterfaceC5670cr1
    public static GradientDrawable x(@JF int i2, @InterfaceC5670cr1 Resources resources) {
        float dimension = resources.getDimension(C7025iN1.f.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }

    @InterfaceC5670cr1
    public static C4394Uc1 y(@JF int i2, @InterfaceC5670cr1 O22 o22) {
        C4394Uc1 c4394Uc1 = new C4394Uc1(o22);
        c4394Uc1.y0(ColorStateList.valueOf(i2));
        return c4394Uc1;
    }

    public void A(int i2) {
        com.google.android.material.snackbar.a.c().b(this.z, i2);
    }

    public final ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.d);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    @InterfaceC11300zs1
    public View C() {
        q qVar = this.m;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public int D() {
        return this.i.getAnimationMode();
    }

    public Behavior E() {
        return this.x;
    }

    @InterfaceC5670cr1
    public Context F() {
        return this.h;
    }

    public int G() {
        return this.k;
    }

    @InterfaceC5670cr1
    public SwipeDismissBehavior<? extends View> H() {
        return new Behavior();
    }

    public final ValueAnimator I(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    @BY0
    public int J() {
        if (N()) {
            return C7025iN1.k.mtrl_layout_snackbar;
        }
        return C7025iN1.k.design_layout_snackbar;
    }

    public final int K() {
        int height = this.i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    @InterfaceC5670cr1
    public View L() {
        return this.i;
    }

    public final int M() {
        int[] iArr = new int[2];
        this.i.getLocationInWindow(iArr);
        return iArr[1] + this.i.getHeight();
    }

    public boolean N() {
        TypedArray obtainStyledAttributes = this.h.obtainStyledAttributes(Q);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            return false;
        }
        return true;
    }

    public final void O(int i2) {
        if (j0() && this.i.getVisibility() == 0) {
            v(i2);
        } else {
            X(i2);
        }
    }

    public boolean P() {
        return this.n;
    }

    public boolean Q() {
        return this.l;
    }

    public boolean R() {
        return com.google.android.material.snackbar.a.c().e(this.z);
    }

    public boolean S() {
        return com.google.android.material.snackbar.a.c().f(this.z);
    }

    public final boolean T() {
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        if ((layoutParams instanceof CoordinatorLayout.g) && (((CoordinatorLayout.g) layoutParams).f() instanceof SwipeDismissBehavior)) {
            return true;
        }
        return false;
    }

    public void U() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i2;
        if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = this.i.getRootWindowInsets()) != null) {
            mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
            i2 = mandatorySystemGestureInsets.bottom;
            this.t = i2;
            s0();
        }
    }

    public void V() {
        if (S()) {
            N.post(new m());
        }
    }

    public void W() {
        if (this.v) {
            n0();
            this.v = false;
        }
    }

    public void X(int i2) {
        com.google.android.material.snackbar.a.c().i(this.z);
        List<s<B>> list = this.w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.w.get(size).a(this, i2);
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public void Y() {
        com.google.android.material.snackbar.a.c().j(this.z);
        List<s<B>> list = this.w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.w.get(size).b(this);
            }
        }
    }

    public final void Z() {
        this.s = w();
        s0();
    }

    @InterfaceC5670cr1
    public B a0(@InterfaceC11300zs1 s<B> sVar) {
        List<s<B>> list;
        if (sVar == null || (list = this.w) == null) {
            return this;
        }
        list.remove(sVar);
        return this;
    }

    @InterfaceC5670cr1
    public B b0(@PL0 int i2) {
        View findViewById = this.g.findViewById(i2);
        if (findViewById != null) {
            return c0(findViewById);
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + i2);
    }

    @InterfaceC5670cr1
    public B c0(@InterfaceC11300zs1 View view) {
        q a2;
        q qVar = this.m;
        if (qVar != null) {
            qVar.c();
        }
        if (view == null) {
            a2 = null;
        } else {
            a2 = q.a(this, view);
        }
        this.m = a2;
        return this;
    }

    public void d0(boolean z) {
        this.n = z;
    }

    @InterfaceC5670cr1
    public B e0(int i2) {
        this.i.setAnimationMode(i2);
        return this;
    }

    @InterfaceC5670cr1
    public B f0(Behavior behavior) {
        this.x = behavior;
        return this;
    }

    @InterfaceC5670cr1
    public B g0(int i2) {
        this.k = i2;
        return this;
    }

    @InterfaceC5670cr1
    public B h0(boolean z) {
        this.l = z;
        return this;
    }

    public final void i0(CoordinatorLayout.g gVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.x;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = H();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).d0(this);
        }
        swipeDismissBehavior.X(new n());
        gVar.q(swipeDismissBehavior);
        if (C() == null) {
            gVar.g = 80;
        }
    }

    public boolean j0() {
        AccessibilityManager accessibilityManager = this.y;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean k0() {
        if (this.t > 0 && !this.l && T()) {
            return true;
        }
        return false;
    }

    public void l0() {
        com.google.android.material.snackbar.a.c().n(G(), this.z);
    }

    public final void m0() {
        if (this.i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                i0((CoordinatorLayout.g) layoutParams);
            }
            this.i.c(this.g);
            Z();
            this.i.setVisibility(4);
        }
        if (this.i.isLaidOut()) {
            n0();
        } else {
            this.v = true;
        }
    }

    public final void n0() {
        if (j0()) {
            u();
            return;
        }
        if (this.i.getParent() != null) {
            this.i.setVisibility(0);
        }
        Y();
    }

    public final void o0() {
        ValueAnimator B2 = B(0.0f, 1.0f);
        ValueAnimator I2 = I(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(B2, I2);
        animatorSet.setDuration(this.a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    public final void p0(int i2) {
        ValueAnimator B2 = B(1.0f, 0.0f);
        B2.setDuration(this.b);
        B2.addListener(new a(i2));
        B2.start();
    }

    public final void q0() {
        int K2 = K();
        this.i.setTranslationY(K2);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(K2, 0);
        valueAnimator.setInterpolator(this.e);
        valueAnimator.setDuration(this.c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e());
        valueAnimator.start();
    }

    public final void r0(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, K());
        valueAnimator.setInterpolator(this.e);
        valueAnimator.setDuration(this.c);
        valueAnimator.addListener(new f(i2));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    public final void s0() {
        int i2;
        boolean z;
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(R, "Unable to update margins because layout params are not MarginLayoutParams");
        } else if (this.i.h1 == null) {
            Log.w(R, "Unable to update margins because original view margins are not set");
        } else if (this.i.getParent() != null) {
            if (C() != null) {
                i2 = this.s;
            } else {
                i2 = this.p;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i3 = this.i.h1.bottom + i2;
            int i4 = this.i.h1.left + this.q;
            int i5 = this.i.h1.right + this.r;
            int i6 = this.i.h1.top;
            if (marginLayoutParams.bottomMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5 && marginLayoutParams.topMargin == i6) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                marginLayoutParams.bottomMargin = i3;
                marginLayoutParams.leftMargin = i4;
                marginLayoutParams.rightMargin = i5;
                marginLayoutParams.topMargin = i6;
                this.i.requestLayout();
            }
            if ((z || this.u != this.t) && Build.VERSION.SDK_INT >= 29 && k0()) {
                this.i.removeCallbacks(this.f324o);
                this.i.post(this.f324o);
            }
        }
    }

    @InterfaceC5670cr1
    public B t(@InterfaceC11300zs1 s<B> sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.w == null) {
            this.w = new ArrayList();
        }
        this.w.add(sVar);
        return this;
    }

    public void u() {
        this.i.post(new o());
    }

    public final void v(int i2) {
        if (this.i.getAnimationMode() == 1) {
            p0(i2);
        } else {
            r0(i2);
        }
    }

    public final int w() {
        if (C() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        C().getLocationOnScreen(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.g.getHeight()) - i2;
    }

    public void z() {
        A(3);
    }

    public BaseTransientBottomBar(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 InterfaceC8494oM interfaceC8494oM) {
        this.n = false;
        this.f324o = new i();
        this.z = new l();
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (interfaceC8494oM != null) {
            this.g = viewGroup;
            this.j = interfaceC8494oM;
            this.h = context;
            C7608kn2.a(context);
            w wVar = (w) LayoutInflater.from(context).inflate(J(), viewGroup, false);
            this.i = wVar;
            wVar.setBaseTransientBottomBar(this);
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                snackbarContentLayout.c(wVar.getActionTextColorAlpha());
                snackbarContentLayout.setMaxInlineActionWidth(wVar.getMaxInlineActionWidth());
            }
            wVar.addView(view);
            wVar.setAccessibilityLiveRegion(1);
            wVar.setImportantForAccessibility(1);
            wVar.setFitsSystemWindows(true);
            C6516gH2.l2(wVar, new j());
            C6516gH2.I1(wVar, new k());
            this.y = (AccessibilityManager) context.getSystemService("accessibility");
            int i2 = C7025iN1.c.motionDurationLong2;
            this.c = C9811tl1.f(context, i2, 250);
            this.a = C9811tl1.f(context, i2, 150);
            this.b = C9811tl1.f(context, C7025iN1.c.motionDurationMedium1, 75);
            int i3 = C7025iN1.c.motionEasingEmphasizedInterpolator;
            this.d = C9811tl1.g(context, i3, K);
            this.f = C9811tl1.g(context, i3, L);
            this.e = C9811tl1.g(context, i3, H);
            return;
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
    }
}
