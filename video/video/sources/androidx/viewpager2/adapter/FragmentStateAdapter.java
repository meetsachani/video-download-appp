package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.j;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import o.ActivityC4864Yy0;
import o.C10907yF1;
import o.C3228Ie;
import o.C3406Jz0;
import o.C5484c51;
import o.C6516gH2;
import o.InterfaceC2526Bc2;
import o.KZ0;

/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.AbstractC0370h<C3406Jz0> implements InterfaceC2526Bc2 {
    public static final String l = "f#";
    public static final String m = "s#";
    public static final long n = 10000;
    public final f d;
    public final FragmentManager e;
    public final C5484c51<Fragment> f;
    public final C5484c51<Fragment.n> g;
    public final C5484c51<Integer> h;
    public FragmentMaxLifecycleEnforcer i;
    public boolean j;
    public boolean k;

    /* loaded from: classes.dex */
    public class FragmentMaxLifecycleEnforcer {
        public ViewPager2.j a;
        public RecyclerView.j b;
        public i c;
        public ViewPager2 d;
        public long e = -1;

        /* loaded from: classes.dex */
        public class a extends ViewPager2.j {
            public a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.j
            public void a(int i) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.j
            public void c(int i) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }
        }

        /* loaded from: classes.dex */
        public class b extends d {
            public b() {
                super(null);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.d, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                FragmentMaxLifecycleEnforcer.this.d(true);
            }
        }

        public FragmentMaxLifecycleEnforcer() {
        }

        public final ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public void b(RecyclerView recyclerView) {
            this.d = a(recyclerView);
            a aVar = new a();
            this.a = aVar;
            this.d.n(aVar);
            b bVar = new b();
            this.b = bVar;
            FragmentStateAdapter.this.F(bVar);
            i iVar = new i() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.i
                public void i(KZ0 kz0, f.a aVar2) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.c = iVar;
            FragmentStateAdapter.this.d.a(iVar);
        }

        public void c(RecyclerView recyclerView) {
            a(recyclerView).x(this.a);
            FragmentStateAdapter.this.I(this.b);
            FragmentStateAdapter.this.d.d(this.c);
            this.d = null;
        }

        public void d(boolean z) {
            int currentItem;
            Fragment h;
            boolean z2;
            if (!FragmentStateAdapter.this.c0() && this.d.getScrollState() == 0 && !FragmentStateAdapter.this.f.l() && FragmentStateAdapter.this.g() != 0 && (currentItem = this.d.getCurrentItem()) < FragmentStateAdapter.this.g()) {
                long h2 = FragmentStateAdapter.this.h(currentItem);
                if ((h2 != this.e || z) && (h = FragmentStateAdapter.this.f.h(h2)) != null && h.v0()) {
                    this.e = h2;
                    j u = FragmentStateAdapter.this.e.u();
                    Fragment fragment = null;
                    for (int i = 0; i < FragmentStateAdapter.this.f.w(); i++) {
                        long m = FragmentStateAdapter.this.f.m(i);
                        Fragment x = FragmentStateAdapter.this.f.x(i);
                        if (x.v0()) {
                            if (m != this.e) {
                                u.K(x, f.b.STARTED);
                            } else {
                                fragment = x;
                            }
                            if (m == this.e) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            x.n2(z2);
                        }
                    }
                    if (fragment != null) {
                        u.K(fragment, f.b.RESUMED);
                    }
                    if (!u.w()) {
                        u.o();
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ FrameLayout X;
        public final /* synthetic */ C3406Jz0 Y;

        public a(FrameLayout frameLayout, C3406Jz0 c3406Jz0) {
            this.X = frameLayout;
            this.Y = c3406Jz0;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.X.getParent() != null) {
                this.X.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.Y(this.Y);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends FragmentManager.m {
        public final /* synthetic */ Fragment a;
        public final /* synthetic */ FrameLayout b;

        public b(Fragment fragment, FrameLayout frameLayout) {
            this.a = fragment;
            this.b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public void m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.a) {
                fragmentManager.b2(this);
                FragmentStateAdapter.this.J(view, this.b);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.j = false;
            fragmentStateAdapter.O();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d extends RecyclerView.j {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i, int i2, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i, int i2, int i3) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i, int i2) {
            a();
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public FragmentStateAdapter(ActivityC4864Yy0 activityC4864Yy0) {
        this(activityC4864Yy0.W0(), activityC4864Yy0.b());
    }

    public static String M(String str, long j) {
        return str + j;
    }

    public static boolean Q(String str, String str2) {
        if (str.startsWith(str2) && str.length() > str2.length()) {
            return true;
        }
        return false;
    }

    public static long X(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public void A(RecyclerView recyclerView) {
        this.i.c(recyclerView);
        this.i = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public final void G(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public void J(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public boolean K(long j) {
        if (j >= 0 && j < g()) {
            return true;
        }
        return false;
    }

    public abstract Fragment L(int i);

    public final void N(int i) {
        long h = h(i);
        if (!this.f.e(h)) {
            Fragment L = L(i);
            L.m2(this.g.h(h));
            this.f.n(h, L);
        }
    }

    public void O() {
        if (this.k && !c0()) {
            C3228Ie<Long> c3228Ie = new C3228Ie();
            for (int i = 0; i < this.f.w(); i++) {
                long m2 = this.f.m(i);
                if (!K(m2)) {
                    c3228Ie.add(Long.valueOf(m2));
                    this.h.q(m2);
                }
            }
            if (!this.j) {
                this.k = false;
                for (int i2 = 0; i2 < this.f.w(); i2++) {
                    long m3 = this.f.m(i2);
                    if (!P(m3)) {
                        c3228Ie.add(Long.valueOf(m3));
                    }
                }
            }
            for (Long l2 : c3228Ie) {
                Z(l2.longValue());
            }
        }
    }

    public final boolean P(long j) {
        View n0;
        if (this.h.e(j)) {
            return true;
        }
        Fragment h = this.f.h(j);
        if (h != null && (n0 = h.n0()) != null && n0.getParent() != null) {
            return true;
        }
        return false;
    }

    public final Long R(int i) {
        Long l2 = null;
        for (int i2 = 0; i2 < this.h.w(); i2++) {
            if (this.h.x(i2).intValue() == i) {
                if (l2 == null) {
                    l2 = Long.valueOf(this.h.m(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: S */
    public final void x(C3406Jz0 c3406Jz0, int i) {
        long n2 = c3406Jz0.n();
        int id = c3406Jz0.S().getId();
        Long R = R(id);
        if (R != null && R.longValue() != n2) {
            Z(R.longValue());
            this.h.q(R.longValue());
        }
        this.h.n(n2, Integer.valueOf(id));
        N(i);
        FrameLayout S = c3406Jz0.S();
        if (C6516gH2.T0(S)) {
            if (S.getParent() == null) {
                S.addOnLayoutChangeListener(new a(S, c3406Jz0));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        O();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: T */
    public final C3406Jz0 z(ViewGroup viewGroup, int i) {
        return C3406Jz0.R(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: U */
    public final boolean B(C3406Jz0 c3406Jz0) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: V */
    public final void C(C3406Jz0 c3406Jz0) {
        Y(c3406Jz0);
        O();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: W */
    public final void E(C3406Jz0 c3406Jz0) {
        Long R = R(c3406Jz0.S().getId());
        if (R != null) {
            Z(R.longValue());
            this.h.q(R.longValue());
        }
    }

    public void Y(final C3406Jz0 c3406Jz0) {
        Fragment h = this.f.h(c3406Jz0.n());
        if (h != null) {
            FrameLayout S = c3406Jz0.S();
            View n0 = h.n0();
            if (!h.v0() && n0 != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (h.v0() && n0 == null) {
                b0(h, S);
                return;
            } else if (h.v0() && n0.getParent() != null) {
                if (n0.getParent() != S) {
                    J(n0, S);
                    return;
                }
                return;
            } else if (h.v0()) {
                J(n0, S);
                return;
            } else if (!c0()) {
                b0(h, S);
                j u = this.e.u();
                u.g(h, "f" + c3406Jz0.n()).K(h, f.b.STARTED).o();
                this.i.d(false);
                return;
            } else if (this.e.W0()) {
                return;
            } else {
                this.d.a(new i() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    @Override // androidx.lifecycle.i
                    public void i(KZ0 kz0, f.a aVar) {
                        if (!FragmentStateAdapter.this.c0()) {
                            kz0.b().d(this);
                            if (C6516gH2.T0(c3406Jz0.S())) {
                                FragmentStateAdapter.this.Y(c3406Jz0);
                            }
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void Z(long j) {
        ViewParent parent;
        Fragment h = this.f.h(j);
        if (h == null) {
            return;
        }
        if (h.n0() != null && (parent = h.n0().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!K(j)) {
            this.g.q(j);
        }
        if (!h.v0()) {
            this.f.q(j);
        } else if (c0()) {
            this.k = true;
        } else {
            if (h.v0() && K(j)) {
                this.g.n(j, this.e.P1(h));
            }
            this.e.u().x(h).o();
            this.f.q(j);
        }
    }

    @Override // o.InterfaceC2526Bc2
    public final Parcelable a() {
        Bundle bundle = new Bundle(this.f.w() + this.g.w());
        for (int i = 0; i < this.f.w(); i++) {
            long m2 = this.f.m(i);
            Fragment h = this.f.h(m2);
            if (h != null && h.v0()) {
                this.e.w1(bundle, M(l, m2), h);
            }
        }
        for (int i2 = 0; i2 < this.g.w(); i2++) {
            long m3 = this.g.m(i2);
            if (K(m3)) {
                bundle.putParcelable(M(m, m3), this.g.h(m3));
            }
        }
        return bundle;
    }

    public final void a0() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final c cVar = new c();
        this.d.a(new i() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.i
            public void i(KZ0 kz0, f.a aVar) {
                if (aVar == f.a.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    kz0.b().d(this);
                }
            }
        });
        handler.postDelayed(cVar, 10000L);
    }

    @Override // o.InterfaceC2526Bc2
    public final void b(Parcelable parcelable) {
        if (this.g.l() && this.f.l()) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            for (String str : bundle.keySet()) {
                if (Q(str, l)) {
                    this.f.n(X(str, l), this.e.F0(bundle, str));
                } else if (Q(str, m)) {
                    long X = X(str, m);
                    Fragment.n nVar = (Fragment.n) bundle.getParcelable(str);
                    if (K(X)) {
                        this.g.n(X, nVar);
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
            }
            if (!this.f.l()) {
                this.k = true;
                this.j = true;
                O();
                a0();
                return;
            }
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public final void b0(Fragment fragment, FrameLayout frameLayout) {
        this.e.x1(new b(fragment, frameLayout), false);
    }

    public boolean c0() {
        return this.e.e1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public long h(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public void w(RecyclerView recyclerView) {
        boolean z;
        if (this.i == null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.a(z);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.i = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.b(recyclerView);
    }

    public FragmentStateAdapter(Fragment fragment) {
        this(fragment.u(), fragment.b());
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, f fVar) {
        this.f = new C5484c51<>();
        this.g = new C5484c51<>();
        this.h = new C5484c51<>();
        this.j = false;
        this.k = false;
        this.e = fragmentManager;
        this.d = fVar;
        super.G(true);
    }
}
