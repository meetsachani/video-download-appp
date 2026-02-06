package com.google.android.exoplayer2.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.exoplayer2.ui.g;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC11300zs1;

@Deprecated
/* loaded from: classes2.dex */
public final class j {
    public static final long D = 2000;
    public static final long E = 250;
    public static final long F = 250;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;
    public static final int K = 4;
    public boolean A;
    public boolean B;
    public final com.google.android.exoplayer2.ui.i a;
    @InterfaceC11300zs1
    public final View b;
    @InterfaceC11300zs1
    public final ViewGroup c;
    @InterfaceC11300zs1
    public final ViewGroup d;
    @InterfaceC11300zs1
    public final ViewGroup e;
    @InterfaceC11300zs1
    public final ViewGroup f;
    @InterfaceC11300zs1
    public final ViewGroup g;
    @InterfaceC11300zs1
    public final ViewGroup h;
    @InterfaceC11300zs1
    public final ViewGroup i;
    @InterfaceC11300zs1
    public final View j;
    @InterfaceC11300zs1
    public final View k;
    public final AnimatorSet l;
    public final AnimatorSet m;
    public final AnimatorSet n;

    /* renamed from: o  reason: collision with root package name */
    public final AnimatorSet f175o;
    public final AnimatorSet p;
    public final ValueAnimator q;
    public final ValueAnimator r;
    public final Runnable s = new Runnable() { // from class: o.ig2
        @Override // java.lang.Runnable
        public final void run() {
            com.google.android.exoplayer2.ui.j.this.Z();
        }
    };
    public final Runnable t = new Runnable() { // from class: o.og2
        @Override // java.lang.Runnable
        public final void run() {
            com.google.android.exoplayer2.ui.j.this.D();
        }
    };
    public final Runnable u = new Runnable() { // from class: o.pg2
        @Override // java.lang.Runnable
        public final void run() {
            com.google.android.exoplayer2.ui.j.this.H();
        }
    };
    public final Runnable v = new Runnable() { // from class: o.qg2
        @Override // java.lang.Runnable
        public final void run() {
            com.google.android.exoplayer2.ui.j.this.G();
        }
    };
    public final Runnable w = new Runnable() { // from class: o.rg2
        @Override // java.lang.Runnable
        public final void run() {
            com.google.android.exoplayer2.ui.j.this.E();
        }
    };
    public final View.OnLayoutChangeListener x = new View.OnLayoutChangeListener() { // from class: o.sg2
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            com.google.android.exoplayer2.ui.j.this.O(view, i2, i3, i4, i5, i6, i7, i8, i9);
        }
    };
    public boolean C = true;
    public int z = 0;
    public final List<View> y = new ArrayList();

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (j.this.b != null) {
                j.this.b.setVisibility(4);
            }
            if (j.this.c != null) {
                j.this.c.setVisibility(4);
            }
            if (j.this.e != null) {
                j.this.e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if ((j.this.j instanceof com.google.android.exoplayer2.ui.c) && !j.this.A) {
                ((com.google.android.exoplayer2.ui.c) j.this.j).i(250L);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 0;
            if (j.this.b != null) {
                j.this.b.setVisibility(0);
            }
            if (j.this.c != null) {
                j.this.c.setVisibility(0);
            }
            if (j.this.e != null) {
                ViewGroup viewGroup = j.this.e;
                if (!j.this.A) {
                    i = 4;
                }
                viewGroup.setVisibility(i);
            }
            if ((j.this.j instanceof com.google.android.exoplayer2.ui.c) && !j.this.A) {
                ((com.google.android.exoplayer2.ui.c) j.this.j).t(250L);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ com.google.android.exoplayer2.ui.i a;

        public c(com.google.android.exoplayer2.ui.i iVar) {
            this.a = iVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.W(1);
            if (j.this.B) {
                this.a.post(j.this.s);
                j.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.W(3);
        }
    }

    /* loaded from: classes2.dex */
    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ com.google.android.exoplayer2.ui.i a;

        public d(com.google.android.exoplayer2.ui.i iVar) {
            this.a = iVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.W(2);
            if (j.this.B) {
                this.a.post(j.this.s);
                j.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.W(3);
        }
    }

    /* loaded from: classes2.dex */
    public class e extends AnimatorListenerAdapter {
        public final /* synthetic */ com.google.android.exoplayer2.ui.i a;

        public e(com.google.android.exoplayer2.ui.i iVar) {
            this.a = iVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.W(2);
            if (j.this.B) {
                this.a.post(j.this.s);
                j.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.W(3);
        }
    }

    /* loaded from: classes2.dex */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.W(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.W(4);
        }
    }

    /* loaded from: classes2.dex */
    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.W(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.W(4);
        }
    }

    /* loaded from: classes2.dex */
    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (j.this.f != null) {
                j.this.f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (j.this.h != null) {
                j.this.h.setVisibility(0);
                j.this.h.setTranslationX(j.this.h.getWidth());
                j.this.h.scrollTo(j.this.h.getWidth(), 0);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (j.this.h != null) {
                j.this.h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (j.this.f != null) {
                j.this.f.setVisibility(0);
            }
        }
    }

    public j(com.google.android.exoplayer2.ui.i iVar) {
        this.a = iVar;
        this.b = iVar.findViewById(g.C0102g.h0);
        this.c = (ViewGroup) iVar.findViewById(g.C0102g.c0);
        this.e = (ViewGroup) iVar.findViewById(g.C0102g.r0);
        ViewGroup viewGroup = (ViewGroup) iVar.findViewById(g.C0102g.a0);
        this.d = viewGroup;
        this.i = (ViewGroup) iVar.findViewById(g.C0102g.Q0);
        View findViewById = iVar.findViewById(g.C0102g.D0);
        this.j = findViewById;
        this.f = (ViewGroup) iVar.findViewById(g.C0102g.Z);
        this.g = (ViewGroup) iVar.findViewById(g.C0102g.k0);
        this.h = (ViewGroup) iVar.findViewById(g.C0102g.l0);
        View findViewById2 = iVar.findViewById(g.C0102g.v0);
        this.k = findViewById2;
        View findViewById3 = iVar.findViewById(g.C0102g.u0);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: o.tg2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.google.android.exoplayer2.ui.j.this.Q(view);
                }
            });
            findViewById3.setOnClickListener(new View.OnClickListener() { // from class: o.tg2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.google.android.exoplayer2.ui.j.this.Q(view);
                }
            });
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.ug2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.google.android.exoplayer2.ui.j.d(com.google.android.exoplayer2.ui.j.this, valueAnimator);
            }
        });
        ofFloat.addListener(new a());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.jg2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.google.android.exoplayer2.ui.j.g(com.google.android.exoplayer2.ui.j.this, valueAnimator);
            }
        });
        ofFloat2.addListener(new b());
        Resources resources = iVar.getResources();
        int i2 = g.d.F;
        float dimension = resources.getDimension(i2) - resources.getDimension(g.d.K);
        float dimension2 = resources.getDimension(i2);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(iVar));
        animatorSet.play(ofFloat).with(K(0.0f, dimension, findViewById)).with(K(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(iVar));
        animatorSet2.play(K(dimension, dimension2, findViewById)).with(K(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(iVar));
        animatorSet3.play(ofFloat).with(K(0.0f, dimension2, findViewById)).with(K(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f175o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(ofFloat2).with(K(dimension, 0.0f, findViewById)).with(K(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(ofFloat2).with(K(dimension2, 0.0f, findViewById)).with(K(dimension2, 0.0f, viewGroup));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.q = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.mg2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.google.android.exoplayer2.ui.j.b(com.google.android.exoplayer2.ui.j.this, valueAnimator);
            }
        });
        ofFloat3.addListener(new h());
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.ng2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.google.android.exoplayer2.ui.j.m(com.google.android.exoplayer2.ui.j.this, valueAnimator);
            }
        });
        ofFloat4.addListener(new i());
    }

    public static int B(@InterfaceC11300zs1 View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return width;
    }

    public static ObjectAnimator K(float f2, float f3, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f2, f3);
    }

    public static /* synthetic */ void b(j jVar, ValueAnimator valueAnimator) {
        jVar.getClass();
        jVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void d(j jVar, ValueAnimator valueAnimator) {
        jVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = jVar.b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = jVar.c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = jVar.e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    public static /* synthetic */ void g(j jVar, ValueAnimator valueAnimator) {
        jVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = jVar.b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = jVar.c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = jVar.e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    public static /* synthetic */ void m(j jVar, ValueAnimator valueAnimator) {
        jVar.getClass();
        jVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static int z(@InterfaceC11300zs1 View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return height;
    }

    public boolean A(@InterfaceC11300zs1 View view) {
        if (view != null && this.y.contains(view)) {
            return true;
        }
        return false;
    }

    public void C() {
        int i2 = this.z;
        if (i2 != 3 && i2 != 2) {
            S();
            if (!this.C) {
                E();
            } else if (this.z == 1) {
                H();
            } else {
                D();
            }
        }
    }

    public final void D() {
        this.n.start();
    }

    public final void E() {
        W(2);
    }

    public void F() {
        int i2 = this.z;
        if (i2 != 3 && i2 != 2) {
            S();
            E();
        }
    }

    public final void G() {
        this.l.start();
        R(this.u, 2000L);
    }

    public final void H() {
        this.m.start();
    }

    public boolean I() {
        return this.C;
    }

    public boolean J() {
        if (this.z == 0 && this.a.e0()) {
            return true;
        }
        return false;
    }

    public void L() {
        this.a.addOnLayoutChangeListener(this.x);
    }

    public void M() {
        this.a.removeOnLayoutChangeListener(this.x);
    }

    public void N(boolean z, int i2, int i3, int i4, int i5) {
        View view = this.b;
        if (view != null) {
            view.layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    public final void O(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        boolean b0 = b0();
        if (this.A != b0) {
            this.A = b0;
            view.post(new Runnable() { // from class: o.kg2
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.ui.j.this.a0();
                }
            });
        }
        if (i4 - i2 != i8 - i6) {
            z = true;
        } else {
            z = false;
        }
        if (!this.A && z) {
            view.post(new Runnable() { // from class: o.lg2
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.ui.j.this.P();
                }
            });
        }
    }

    public final void P() {
        int i2;
        if (this.f != null && this.g != null) {
            int width = (this.a.getWidth() - this.a.getPaddingLeft()) - this.a.getPaddingRight();
            while (true) {
                if (this.g.getChildCount() <= 1) {
                    break;
                }
                int childCount = this.g.getChildCount() - 2;
                View childAt = this.g.getChildAt(childCount);
                this.g.removeViewAt(childCount);
                this.f.addView(childAt, 0);
            }
            View view = this.k;
            if (view != null) {
                view.setVisibility(8);
            }
            int B = B(this.i);
            int childCount2 = this.f.getChildCount() - 1;
            for (int i3 = 0; i3 < childCount2; i3++) {
                B += B(this.f.getChildAt(i3));
            }
            if (B > width) {
                View view2 = this.k;
                if (view2 != null) {
                    view2.setVisibility(0);
                    B += B(this.k);
                }
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = this.f.getChildAt(i4);
                    B -= B(childAt2);
                    arrayList.add(childAt2);
                    if (B <= width) {
                        break;
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f.removeViews(0, arrayList.size());
                    for (i2 = 0; i2 < arrayList.size(); i2++) {
                        this.g.addView((View) arrayList.get(i2), this.g.getChildCount() - 1);
                    }
                    return;
                }
                return;
            }
            ViewGroup viewGroup = this.h;
            if (viewGroup != null && viewGroup.getVisibility() == 0 && !this.r.isStarted()) {
                this.q.cancel();
                this.r.start();
            }
        }
    }

    public final void Q(View view) {
        T();
        if (view.getId() == g.C0102g.v0) {
            this.q.start();
        } else if (view.getId() == g.C0102g.u0) {
            this.r.start();
        }
    }

    public final void R(Runnable runnable, long j) {
        if (j >= 0) {
            this.a.postDelayed(runnable, j);
        }
    }

    public void S() {
        this.a.removeCallbacks(this.w);
        this.a.removeCallbacks(this.t);
        this.a.removeCallbacks(this.v);
        this.a.removeCallbacks(this.u);
    }

    public void T() {
        if (this.z != 3) {
            S();
            int showTimeoutMs = this.a.getShowTimeoutMs();
            if (showTimeoutMs > 0) {
                if (!this.C) {
                    R(this.w, showTimeoutMs);
                } else if (this.z == 1) {
                    R(this.u, 2000L);
                } else {
                    R(this.v, showTimeoutMs);
                }
            }
        }
    }

    public void U(boolean z) {
        this.C = z;
    }

    public void V(@InterfaceC11300zs1 View view, boolean z) {
        if (view == null) {
            return;
        }
        if (!z) {
            view.setVisibility(8);
            this.y.remove(view);
            return;
        }
        if (this.A && X(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.y.add(view);
    }

    public final void W(int i2) {
        int i3 = this.z;
        this.z = i2;
        if (i2 == 2) {
            this.a.setVisibility(8);
        } else if (i3 == 2) {
            this.a.setVisibility(0);
        }
        if (i3 != i2) {
            this.a.f0();
        }
    }

    public final boolean X(View view) {
        int id = view.getId();
        if (id != g.C0102g.a0 && id != g.C0102g.C0 && id != g.C0102g.t0 && id != g.C0102g.G0 && id != g.C0102g.H0 && id != g.C0102g.m0 && id != g.C0102g.n0) {
            return false;
        }
        return true;
    }

    public void Y() {
        if (!this.a.e0()) {
            this.a.setVisibility(0);
            this.a.p0();
            this.a.k0();
        }
        Z();
    }

    public final void Z() {
        if (!this.C) {
            W(0);
            T();
            return;
        }
        int i2 = this.z;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        return;
                    }
                } else {
                    this.B = true;
                }
            } else {
                this.p.start();
            }
        } else {
            this.f175o.start();
        }
        T();
    }

    public final void a0() {
        int i2;
        int i3;
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            if (this.A) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            viewGroup.setVisibility(i3);
        }
        if (this.j != null) {
            int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(g.d.O);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.j.setLayoutParams(marginLayoutParams);
            }
            View view = this.j;
            if (view instanceof com.google.android.exoplayer2.ui.c) {
                com.google.android.exoplayer2.ui.c cVar = (com.google.android.exoplayer2.ui.c) view;
                if (this.A) {
                    cVar.j(true);
                } else {
                    int i4 = this.z;
                    if (i4 == 1) {
                        cVar.j(false);
                    } else if (i4 != 3) {
                        cVar.s();
                    }
                }
            }
        }
        for (View view2 : this.y) {
            if (this.A && X(view2)) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
    }

    public final boolean b0() {
        int i2;
        int i3;
        int width = (this.a.getWidth() - this.a.getPaddingLeft()) - this.a.getPaddingRight();
        int height = (this.a.getHeight() - this.a.getPaddingBottom()) - this.a.getPaddingTop();
        int B = B(this.c);
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            i2 = viewGroup.getPaddingLeft() + this.c.getPaddingRight();
        } else {
            i2 = 0;
        }
        int i4 = B - i2;
        int z = z(this.c);
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 != null) {
            i3 = viewGroup2.getPaddingTop() + this.c.getPaddingBottom();
        } else {
            i3 = 0;
        }
        int max = Math.max(i4, B(this.i) + B(this.k));
        int z2 = (z - i3) + (z(this.d) * 2);
        if (width > max && height > z2) {
            return false;
        }
        return true;
    }

    public final void y(float f2) {
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            this.h.setTranslationX((int) (viewGroup.getWidth() * (1.0f - f2)));
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f2);
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f2);
        }
    }
}
