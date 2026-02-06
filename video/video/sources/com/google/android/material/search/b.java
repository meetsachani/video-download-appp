package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchView;
import java.util.Objects;
import o.C10538wk0;
import o.C10739xZ1;
import o.C10920yI2;
import o.C10947yP1;
import o.C10967yU1;
import o.C4003Qc1;
import o.C5491c70;
import o.C5600ca;
import o.C8827pk;
import o.C8854pq2;
import o.C9080qm1;
import o.C9806tk0;
import o.D60;
import o.ES1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC6181ey;

/* loaded from: classes3.dex */
public class b {
    public static final long A = 83;
    public static final long B = 0;
    public static final long C = 250;
    public static final float D = 0.95f;
    public static final long E = 350;
    public static final long F = 150;
    public static final long G = 300;
    public static final long q = 300;
    public static final long r = 50;
    public static final long s = 250;
    public static final long t = 150;
    public static final long u = 75;
    public static final long v = 300;
    public static final long w = 100;
    public static final long x = 250;
    public static final long y = 42;
    public static final long z = 0;
    public final SearchView a;
    public final View b;
    public final ClippableRoundedCornerLayout c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final Toolbar f;
    public final Toolbar g;
    public final LinearLayout h;
    public final TextView i;
    public final EditText j;
    public final ImageButton k;
    public final View l;
    public final TouchObserverFrameLayout m;
    public final C4003Qc1 n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public AnimatorSet f323o;
    public SearchBar p;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!b.this.a.x()) {
                b.this.a.K();
            }
            b.this.a.setTransitionState(SearchView.d.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.c.setVisibility(0);
            b.this.p.N0();
        }
    }

    /* renamed from: com.google.android.material.search.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0129b extends AnimatorListenerAdapter {
        public C0129b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.c.setVisibility(8);
            if (!b.this.a.x()) {
                b.this.a.t();
            }
            b.this.a.setTransitionState(SearchView.d.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.a.setTransitionState(SearchView.d.HIDING);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!b.this.a.x()) {
                b.this.a.K();
            }
            b.this.a.setTransitionState(SearchView.d.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.c.setVisibility(0);
            b.this.a.setTransitionState(SearchView.d.SHOWING);
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.c.setVisibility(8);
            if (!b.this.a.x()) {
                b.this.a.t();
            }
            b.this.a.setTransitionState(SearchView.d.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.a.setTransitionState(SearchView.d.HIDING);
        }
    }

    /* loaded from: classes3.dex */
    public class e extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;

        public e(boolean z) {
            this.a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            float f;
            b bVar = b.this;
            if (this.a) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            bVar.d0(f);
            b.this.j.setAlpha(1.0f);
            if (b.this.p != null) {
                b.this.p.getTextView().setAlpha(1.0f);
            }
            b.this.j.setClipBounds(null);
            b.this.c.a();
            if (!this.a) {
                b.this.n.j();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            float f;
            b bVar = b.this;
            if (this.a) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            bVar.d0(f);
        }
    }

    public b(SearchView searchView) {
        this.a = searchView;
        this.b = searchView.Y0;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.Z0;
        this.c = clippableRoundedCornerLayout;
        this.d = searchView.c1;
        this.e = searchView.d1;
        this.f = searchView.e1;
        this.g = searchView.f1;
        this.i = searchView.g1;
        this.j = searchView.i1;
        this.k = searchView.j1;
        this.l = searchView.k1;
        this.m = searchView.l1;
        this.h = searchView.h1;
        this.n = new C4003Qc1(clippableRoundedCornerLayout);
    }

    public static float[] Z(float f, float[] fArr, float f2) {
        return new float[]{C5600ca.a(f, fArr[0], f2), C5600ca.a(f, fArr[1], f2), C5600ca.a(f, fArr[2], f2), C5600ca.a(f, fArr[3], f2), C5600ca.a(f, fArr[4], f2), C5600ca.a(f, fArr[5], f2), C5600ca.a(f, fArr[6], f2), C5600ca.a(f, fArr[7], f2)};
    }

    public static /* synthetic */ void a(b bVar) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = bVar.c;
        clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
        AnimatorSet R = bVar.R(true);
        R.addListener(new c());
        R.start();
    }

    public static float[] a0(float[] fArr, float[] fArr2) {
        return new float[]{Math.max(fArr[0], fArr2[0]), Math.max(fArr[1], fArr2[1]), Math.max(fArr[2], fArr2[2]), Math.max(fArr[3], fArr2[3]), Math.max(fArr[4], fArr2[4]), Math.max(fArr[5], fArr2[5]), Math.max(fArr[6], fArr2[6]), Math.max(fArr[7], fArr2[7])};
    }

    public static /* synthetic */ void b(b bVar, ValueAnimator valueAnimator) {
        bVar.j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        bVar.p.getTextView().setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void c(b bVar, Rect rect, ValueAnimator valueAnimator) {
        bVar.getClass();
        rect.right = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        bVar.j.setClipBounds(rect);
    }

    public static /* synthetic */ void d(b bVar) {
        AnimatorSet J = bVar.J(true);
        J.addListener(new a());
        J.start();
    }

    public static /* synthetic */ void g(b bVar, float f, float[] fArr, Rect rect, ValueAnimator valueAnimator) {
        bVar.getClass();
        bVar.c.c(rect, Z(f, fArr, valueAnimator.getAnimatedFraction()));
    }

    public final AnimatorSet A(boolean z2) {
        long j;
        AnimatorSet animatorSet = new AnimatorSet();
        q(animatorSet);
        if (z2) {
            j = 300;
        } else {
            j = 250;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(C10967yU1.a(z2, C5600ca.b));
        return animatorSet;
    }

    public final AnimatorSet B(boolean z2) {
        long j;
        AnimatorSet animatorSet = new AnimatorSet();
        r(animatorSet);
        o(animatorSet);
        if (z2) {
            j = 300;
        } else {
            j = 250;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(C10967yU1.a(z2, C5600ca.b));
        return animatorSet;
    }

    public final Animator C(boolean z2) {
        long j;
        long j2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z2) {
            j = 50;
        } else {
            j = 42;
        }
        ofFloat.setDuration(j);
        if (z2) {
            j2 = 250;
        } else {
            j2 = 0;
        }
        ofFloat.setStartDelay(j2);
        ofFloat.setInterpolator(C10967yU1.a(z2, C5600ca.a));
        ofFloat.addUpdateListener(C9080qm1.f(this.k));
        return ofFloat;
    }

    public final Animator D(boolean z2) {
        long j;
        long j2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z2) {
            j = 150;
        } else {
            j = 83;
        }
        ofFloat.setDuration(j);
        if (z2) {
            j2 = 75;
        } else {
            j2 = 0;
        }
        ofFloat.setStartDelay(j2);
        ofFloat.setInterpolator(C10967yU1.a(z2, C5600ca.a));
        ofFloat.addUpdateListener(C9080qm1.f(this.l, this.m));
        return ofFloat;
    }

    public final Animator E(boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(D(z2), G(z2), F(z2));
        return animatorSet;
    }

    public final Animator F(boolean z2) {
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.95f, 1.0f);
        if (z2) {
            j = 300;
        } else {
            j = 250;
        }
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(C10967yU1.a(z2, C5600ca.b));
        ofFloat.addUpdateListener(C9080qm1.h(this.m));
        return ofFloat;
    }

    public final Animator G(boolean z2) {
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat((this.m.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        if (z2) {
            j = 300;
        } else {
            j = 250;
        }
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(C10967yU1.a(z2, C5600ca.b));
        ofFloat.addUpdateListener(C9080qm1.p(this.l));
        return ofFloat;
    }

    public final Animator H(boolean z2) {
        Toolbar toolbar = this.g;
        return S(z2, toolbar, K(toolbar), L());
    }

    public final Animator I(boolean z2) {
        return T(z2, this.j);
    }

    public final AnimatorSet J(boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f323o == null) {
            animatorSet.playTogether(A(z2), B(z2));
        }
        animatorSet.playTogether(O(z2), N(z2), C(z2), E(z2), M(z2), H(z2), y(z2), I(z2), P(z2), Q(z2));
        animatorSet.addListener(new e(z2));
        return animatorSet;
    }

    public final int K(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        int W = W(this.p);
        if (C10920yI2.s(this.p)) {
            return W - marginEnd;
        }
        return ((W + this.p.getWidth()) + marginEnd) - this.a.getWidth();
    }

    public final int L() {
        return (X(this.p) + (this.p.getHeight() / 2)) - (this.e.getTop() + (this.e.getHeight() / 2));
    }

    public final Animator M(boolean z2) {
        FrameLayout frameLayout = this.d;
        return S(z2, frameLayout, K(frameLayout), L());
    }

    public final Animator N(boolean z2) {
        long j;
        Rect p = this.n.p();
        Rect o2 = this.n.o();
        if (p == null) {
            p = C10920yI2.d(this.a);
        }
        if (o2 == null) {
            o2 = C10920yI2.c(this.c, this.p);
        }
        final Rect rect = new Rect(o2);
        final float cornerSize = this.p.getCornerSize();
        final float[] a0 = a0(this.c.getCornerRadii(), this.n.n());
        ValueAnimator ofObject = ValueAnimator.ofObject(new C10947yP1(rect), o2, p);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.zZ1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.google.android.material.search.b.g(com.google.android.material.search.b.this, cornerSize, a0, rect, valueAnimator);
            }
        });
        if (z2) {
            j = 300;
        } else {
            j = 250;
        }
        ofObject.setDuration(j);
        ofObject.setInterpolator(C10967yU1.a(z2, C5600ca.b));
        return ofObject;
    }

    public final Animator O(boolean z2) {
        TimeInterpolator timeInterpolator;
        long j;
        long j2;
        if (z2) {
            timeInterpolator = C5600ca.a;
        } else {
            timeInterpolator = C5600ca.b;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z2) {
            j = 300;
        } else {
            j = 250;
        }
        ofFloat.setDuration(j);
        if (z2) {
            j2 = 100;
        } else {
            j2 = 0;
        }
        ofFloat.setStartDelay(j2);
        ofFloat.setInterpolator(C10967yU1.a(z2, timeInterpolator));
        ofFloat.addUpdateListener(C9080qm1.f(this.b));
        return ofFloat;
    }

    public final Animator P(boolean z2) {
        return T(z2, this.i);
    }

    public final AnimatorSet Q(boolean z2) {
        long j;
        AnimatorSet animatorSet = new AnimatorSet();
        v(animatorSet);
        t(animatorSet);
        if (z2) {
            j = 300;
        } else {
            j = 250;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(C10967yU1.a(z2, C5600ca.a));
        return animatorSet;
    }

    public final AnimatorSet R(boolean z2) {
        long j;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(V());
        q(animatorSet);
        animatorSet.setInterpolator(C10967yU1.a(z2, C5600ca.b));
        if (z2) {
            j = 350;
        } else {
            j = 300;
        }
        animatorSet.setDuration(j);
        return animatorSet;
    }

    public final Animator S(boolean z2, View view, int i, int i2) {
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(i, 0.0f);
        ofFloat.addUpdateListener(C9080qm1.n(view));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(i2, 0.0f);
        ofFloat2.addUpdateListener(C9080qm1.p(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        if (z2) {
            j = 300;
        } else {
            j = 250;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(C10967yU1.a(z2, C5600ca.b));
        return animatorSet;
    }

    public final Animator T(boolean z2, View view) {
        TextView placeholderTextView = this.p.getPlaceholderTextView();
        if (TextUtils.isEmpty(placeholderTextView.getText()) || z2) {
            placeholderTextView = this.p.getTextView();
        }
        return S(z2, view, W(placeholderTextView) - (view.getLeft() + this.h.getLeft()), L());
    }

    public final int U(@InterfaceC11300zs1 View view, @InterfaceC5670cr1 View view2) {
        if (view == null) {
            int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
            int paddingStart = this.p.getPaddingStart();
            int W = W(this.p);
            if (C10920yI2.s(this.p)) {
                return (((W + this.p.getWidth()) + marginStart) - paddingStart) - this.a.getRight();
            }
            return (W - marginStart) + paddingStart;
        }
        return W(view) - W(view2);
    }

    public final Animator V() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c.getHeight(), 0.0f);
        ofFloat.addUpdateListener(C9080qm1.p(this.c));
        return ofFloat;
    }

    public final int W(@InterfaceC5670cr1 View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.a.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    public final int X(@InterfaceC5670cr1 View view) {
        int top = view.getTop();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.a.getParent(); parent = parent.getParent()) {
            top += ((View) parent).getTop();
        }
        return top;
    }

    @InterfaceC6181ey
    public AnimatorSet Y() {
        if (this.p != null) {
            return k0();
        }
        return l0();
    }

    @InterfaceC11300zs1
    public C8827pk b0() {
        return this.n.c();
    }

    public final void c0(float f) {
        ActionMenuView b;
        if (this.a.B() && (b = C8854pq2.b(this.f)) != null) {
            b.setAlpha(f);
        }
    }

    public final void d0(float f) {
        this.k.setAlpha(f);
        this.l.setAlpha(f);
        this.m.setAlpha(f);
        c0(f);
    }

    public final void e0(Drawable drawable) {
        if (drawable instanceof C5491c70) {
            ((C5491c70) drawable).s(1.0f);
        }
        if (drawable instanceof C9806tk0) {
            ((C9806tk0) drawable).a(1.0f);
        }
    }

    public final void f0(Toolbar toolbar) {
        ActionMenuView b = C8854pq2.b(toolbar);
        if (b != null) {
            for (int i = 0; i < b.getChildCount(); i++) {
                View childAt = b.getChildAt(i);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    public void g0(SearchBar searchBar) {
        this.p = searchBar;
    }

    public final void h0() {
        Menu menu = this.g.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (this.p.getMenuResId() != -1 && this.a.B()) {
            this.g.y(this.p.getMenuResId());
            f0(this.g);
            this.g.setVisibility(0);
            return;
        }
        this.g.setVisibility(8);
    }

    public void i0() {
        if (this.p != null) {
            m0();
        } else {
            n0();
        }
    }

    public void j0(@InterfaceC5670cr1 C8827pk c8827pk) {
        this.n.v(c8827pk, this.p);
    }

    public final AnimatorSet k0() {
        if (this.a.x()) {
            this.a.t();
        }
        AnimatorSet J = J(false);
        J.addListener(new C0129b());
        J.start();
        return J;
    }

    public final AnimatorSet l0() {
        if (this.a.x()) {
            this.a.t();
        }
        AnimatorSet R = R(false);
        R.addListener(new d());
        R.start();
        return R;
    }

    public final void m0() {
        if (this.a.x()) {
            this.a.K();
        }
        this.a.setTransitionState(SearchView.d.SHOWING);
        h0();
        this.j.setText(this.p.getText());
        EditText editText = this.j;
        editText.setSelection(editText.getText().length());
        this.c.setVisibility(4);
        this.c.post(new Runnable() { // from class: o.BZ1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.search.b.d(com.google.android.material.search.b.this);
            }
        });
    }

    public final void n0() {
        if (this.a.x()) {
            final SearchView searchView = this.a;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new Runnable() { // from class: o.EZ1
                @Override // java.lang.Runnable
                public final void run() {
                    SearchView.this.K();
                }
            }, 150L);
        }
        this.c.setVisibility(4);
        this.c.post(new Runnable() { // from class: o.FZ1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.search.b.a(com.google.android.material.search.b.this);
            }
        });
    }

    public final void o(AnimatorSet animatorSet) {
        ActionMenuView b = C8854pq2.b(this.f);
        if (b == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(U(C8854pq2.b(this.p), b), 0.0f);
        ofFloat.addUpdateListener(C9080qm1.n(b));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(L(), 0.0f);
        ofFloat2.addUpdateListener(C9080qm1.p(b));
        animatorSet.playTogether(ofFloat, ofFloat2);
    }

    @ES1(34)
    public void o0(@InterfaceC5670cr1 C8827pk c8827pk) {
        if (c8827pk.b() > 0.0f) {
            C4003Qc1 c4003Qc1 = this.n;
            SearchBar searchBar = this.p;
            c4003Qc1.x(c8827pk, searchBar, searchBar.getCornerSize());
            AnimatorSet animatorSet = this.f323o;
            if (animatorSet != null) {
                animatorSet.setCurrentPlayTime(c8827pk.b() * ((float) this.f323o.getDuration()));
                return;
            }
            if (this.a.x()) {
                this.a.t();
            }
            if (!this.a.y()) {
                return;
            }
            AnimatorSet A2 = A(false);
            this.f323o = A2;
            A2.start();
            this.f323o.pause();
        }
    }

    public final void p(AnimatorSet animatorSet, final ImageButton imageButton) {
        SearchBar searchBar = this.p;
        if (searchBar != null && searchBar.getNavigationIcon() == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.GZ1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    imageButton.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(ofFloat);
        }
    }

    public final void q(AnimatorSet animatorSet) {
        ImageButton e2 = C8854pq2.e(this.f);
        if (e2 == null) {
            return;
        }
        Drawable q2 = D60.q(e2.getDrawable());
        if (this.a.y()) {
            s(animatorSet, q2);
            u(animatorSet, q2);
            p(animatorSet, e2);
            return;
        }
        e0(q2);
    }

    public final void r(AnimatorSet animatorSet) {
        ImageButton e2 = C8854pq2.e(this.f);
        if (e2 == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(U(C8854pq2.e(this.p), e2), 0.0f);
        ofFloat.addUpdateListener(C9080qm1.n(e2));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(L(), 0.0f);
        ofFloat2.addUpdateListener(C9080qm1.p(e2));
        animatorSet.playTogether(ofFloat, ofFloat2);
    }

    public final void s(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof C5491c70) {
            final C5491c70 c5491c70 = (C5491c70) drawable;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.AZ1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C5491c70.this.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(ofFloat);
        }
    }

    public final void t(AnimatorSet animatorSet) {
        if (this.p != null && TextUtils.equals(this.j.getText(), this.p.getText())) {
            final Rect rect = new Rect(0, 0, this.j.getWidth(), this.j.getHeight());
            ValueAnimator ofInt = ValueAnimator.ofInt(this.p.getTextView().getWidth(), this.j.getWidth());
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.yZ1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    com.google.android.material.search.b.c(com.google.android.material.search.b.this, rect, valueAnimator);
                }
            });
            animatorSet.playTogether(ofInt);
        }
    }

    public final void u(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof C9806tk0) {
            final C9806tk0 c9806tk0 = (C9806tk0) drawable;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.CZ1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C9806tk0.this.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(ofFloat);
        }
    }

    public final void v(AnimatorSet animatorSet) {
        if (this.p != null && !TextUtils.equals(this.j.getText(), this.p.getText())) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.DZ1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    com.google.android.material.search.b.b(com.google.android.material.search.b.this, valueAnimator);
                }
            });
            animatorSet.playTogether(ofFloat);
        }
    }

    @ES1(34)
    public void w() {
        this.n.i(this.p);
        AnimatorSet animatorSet = this.f323o;
        if (animatorSet != null) {
            C10739xZ1.a(animatorSet);
        }
        this.f323o = null;
    }

    @ES1(34)
    public void x() {
        this.n.m(Y().getTotalDuration(), this.p);
        if (this.f323o != null) {
            B(false).start();
            this.f323o.resume();
        }
        this.f323o = null;
    }

    public final Animator y(boolean z2) {
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z2) {
            j = 300;
        } else {
            j = 250;
        }
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(C10967yU1.a(z2, C5600ca.b));
        if (this.a.B()) {
            ofFloat.addUpdateListener(new C10538wk0(C8854pq2.b(this.g), C8854pq2.b(this.f)));
        }
        return ofFloat;
    }

    public C4003Qc1 z() {
        return this.n;
    }
}
