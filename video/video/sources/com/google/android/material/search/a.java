package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.C10920yI2;
import o.C4394Uc1;
import o.C5600ca;
import o.C7586ki0;
import o.C8854pq2;
import o.C9080qm1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.J9;

/* loaded from: classes3.dex */
public class a {
    public static final long j = 250;
    public static final long k = 500;
    public static final long l = 750;
    public static final long m = 250;
    public static final long n = 250;

    /* renamed from: o  reason: collision with root package name */
    public static final long f322o = 300;
    public static final long p = 75;
    public static final long q = 250;
    public static final long r = 100;
    @InterfaceC11300zs1
    public Animator d;
    @InterfaceC11300zs1
    public Animator e;
    public boolean f;
    public boolean g;
    public final Set<SearchBar.b> a = new LinkedHashSet();
    public final Set<AnimatorListenerAdapter> b = new LinkedHashSet();
    public final Set<AnimatorListenerAdapter> c = new LinkedHashSet();
    public boolean h = true;
    public Animator i = null;

    /* renamed from: com.google.android.material.search.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0128a extends AnimatorListenerAdapter {
        public C0128a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.k(new g() { // from class: o.eZ1
                @Override // com.google.android.material.search.a.g
                public final void a(SearchBar.b bVar) {
                    bVar.a();
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ View a;
        public final /* synthetic */ Animator b;

        public b(View view, Animator animator) {
            this.a = view;
            this.b = animator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.setVisibility(8);
            this.b.start();
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.i = null;
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ SearchBar a;

        public d(SearchBar searchBar) {
            this.a = searchBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.setVisibility(4);
        }
    }

    /* loaded from: classes3.dex */
    public class e extends AnimatorListenerAdapter {
        public e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.i = null;
        }
    }

    /* loaded from: classes3.dex */
    public class f extends AnimatorListenerAdapter {
        public final /* synthetic */ SearchBar a;

        public f(SearchBar searchBar) {
            this.a = searchBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.setVisibility(0);
            a.this.g = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.N0();
        }
    }

    /* loaded from: classes3.dex */
    public interface g {
        void a(SearchBar.b bVar);
    }

    public static /* synthetic */ void b(a aVar, SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z) {
        aVar.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(aVar.t(searchBar, view), aVar.o(searchBar, view, appBarLayout));
        animatorSet.addListener(new c());
        for (AnimatorListenerAdapter animatorListenerAdapter : aVar.b) {
            animatorSet.addListener(animatorListenerAdapter);
        }
        if (z) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        aVar.i = animatorSet;
    }

    public static /* synthetic */ void c(C4394Uc1 c4394Uc1, View view, ValueAnimator valueAnimator) {
        c4394Uc1.z0(1.0f - valueAnimator.getAnimatedFraction());
        view.setBackground(c4394Uc1);
        view.setAlpha(1.0f);
    }

    public boolean A(@InterfaceC5670cr1 AnimatorListenerAdapter animatorListenerAdapter) {
        return this.c.remove(animatorListenerAdapter);
    }

    public boolean B(@InterfaceC5670cr1 AnimatorListenerAdapter animatorListenerAdapter) {
        return this.b.remove(animatorListenerAdapter);
    }

    public boolean C(SearchBar.b bVar) {
        return this.a.remove(bVar);
    }

    public void D(boolean z) {
        this.h = z;
    }

    public void E(SearchBar searchBar, View view, @InterfaceC11300zs1 AppBarLayout appBarLayout, boolean z) {
        Animator animator;
        if (y() && (animator = this.i) != null) {
            animator.cancel();
        }
        this.g = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(l(searchBar, view, appBarLayout), s(searchBar));
        animatorSet.addListener(new e());
        for (AnimatorListenerAdapter animatorListenerAdapter : this.c) {
            animatorSet.addListener(animatorListenerAdapter);
        }
        if (z) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.i = animatorSet;
    }

    public void F(final SearchBar searchBar, final View view, @InterfaceC11300zs1 final AppBarLayout appBarLayout, final boolean z) {
        Animator animator;
        if (x() && (animator = this.i) != null) {
            animator.cancel();
        }
        this.f = true;
        view.setVisibility(4);
        view.post(new Runnable() { // from class: o.cZ1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.search.a.b(com.google.android.material.search.a.this, searchBar, view, appBarLayout, z);
            }
        });
    }

    public void G(SearchBar searchBar) {
        k(new g() { // from class: o.aZ1
            @Override // com.google.android.material.search.a.g
            public final void a(SearchBar.b bVar) {
                bVar.b();
            }
        });
        TextView textView = searchBar.getTextView();
        View centerView = searchBar.getCenterView();
        View f2 = C8854pq2.f(searchBar);
        final Animator v = v(textView, f2);
        v.addListener(new C0128a());
        this.d = v;
        textView.setAlpha(0.0f);
        if (f2 != null) {
            f2.setAlpha(0.0f);
        }
        if (centerView instanceof J9) {
            ((J9) centerView).a(new J9.a() { // from class: o.bZ1
                @Override // o.J9.a
                public final void a() {
                    v.start();
                }
            });
        } else if (centerView != null) {
            centerView.setAlpha(0.0f);
            centerView.setVisibility(0);
            Animator m2 = m(centerView);
            this.e = m2;
            m2.addListener(new b(centerView, v));
            m2.start();
        } else {
            v.start();
        }
    }

    public void H(SearchBar searchBar) {
        Animator animator = this.d;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.e;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView instanceof J9) {
            ((J9) centerView).b();
        }
        if (centerView != null) {
            centerView.setAlpha(0.0f);
        }
    }

    public void h(@InterfaceC5670cr1 AnimatorListenerAdapter animatorListenerAdapter) {
        this.c.add(animatorListenerAdapter);
    }

    public void i(@InterfaceC5670cr1 AnimatorListenerAdapter animatorListenerAdapter) {
        this.b.add(animatorListenerAdapter);
    }

    public void j(SearchBar.b bVar) {
        this.a.add(bVar);
    }

    public final void k(g gVar) {
        for (SearchBar.b bVar : this.a) {
            gVar.a(bVar);
        }
    }

    public final Animator l(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        return p(searchBar, view, appBarLayout).o(250L).e(new f(searchBar)).h();
    }

    public final Animator m(@InterfaceC11300zs1 View view) {
        long j2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(C9080qm1.f(view));
        TimeInterpolator timeInterpolator = C5600ca.a;
        ofFloat.setInterpolator(timeInterpolator);
        long j3 = 0;
        if (this.h) {
            j2 = 250;
        } else {
            j2 = 0;
        }
        ofFloat.setDuration(j2);
        if (this.h) {
            j3 = 500;
        }
        ofFloat.setStartDelay(j3);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(C9080qm1.f(view));
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(250L);
        ofFloat2.setStartDelay(750L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        return animatorSet;
    }

    public final List<View> n(View view) {
        boolean s = C10920yI2.s(view);
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((!s && (childAt instanceof ActionMenuView)) || (s && !(childAt instanceof ActionMenuView))) {
                    arrayList.add(childAt);
                }
            }
        }
        return arrayList;
    }

    public final Animator o(SearchBar searchBar, View view, @InterfaceC11300zs1 AppBarLayout appBarLayout) {
        return p(searchBar, view, appBarLayout).o(300L).e(new d(searchBar)).j();
    }

    public final C7586ki0 p(SearchBar searchBar, View view, @InterfaceC11300zs1 AppBarLayout appBarLayout) {
        int i;
        C7586ki0 m2 = new C7586ki0(searchBar, view).m(q(searchBar, view));
        if (appBarLayout != null) {
            i = appBarLayout.getTop();
        } else {
            i = 0;
        }
        return m2.n(i).c(n(view));
    }

    public final ValueAnimator.AnimatorUpdateListener q(SearchBar searchBar, final View view) {
        final C4394Uc1 r2 = C4394Uc1.r(view.getContext());
        r2.t0(searchBar.getCornerSize());
        r2.x0(searchBar.getElevation());
        return new ValueAnimator.AnimatorUpdateListener() { // from class: o.dZ1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.google.android.material.search.a.c(C4394Uc1.this, view, valueAnimator);
            }
        };
    }

    public final List<View> r(SearchBar searchBar) {
        List<View> k2 = C10920yI2.k(searchBar);
        if (searchBar.getCenterView() != null) {
            k2.remove(searchBar.getCenterView());
        }
        return k2;
    }

    public final Animator s(SearchBar searchBar) {
        List<View> r2 = r(searchBar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(C9080qm1.e(r2));
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(C5600ca.a);
        return ofFloat;
    }

    public final Animator t(SearchBar searchBar, final View view) {
        List<View> r2 = r(searchBar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(C9080qm1.e(r2));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.ZY1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(0.0f);
            }
        });
        ofFloat.setDuration(75L);
        ofFloat.setInterpolator(C5600ca.a);
        return ofFloat;
    }

    public final Animator u(@InterfaceC11300zs1 View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(C9080qm1.f(view));
        ofFloat.setInterpolator(C5600ca.a);
        ofFloat.setDuration(250L);
        return ofFloat;
    }

    public final Animator v(TextView textView, @InterfaceC11300zs1 View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(250L);
        animatorSet.play(w(textView));
        if (view != null) {
            animatorSet.play(u(view));
        }
        return animatorSet;
    }

    public final Animator w(TextView textView) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(C9080qm1.f(textView));
        ofFloat.setInterpolator(C5600ca.a);
        ofFloat.setDuration(250L);
        return ofFloat;
    }

    public boolean x() {
        return this.g;
    }

    public boolean y() {
        return this.f;
    }

    public boolean z() {
        return this.h;
    }
}
