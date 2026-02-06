package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import androidx.lifecycle.f;
import com.facebook.internal.C2356a;
import o.AbstractC5701cz0;
import o.C10355vz0;
import o.C10841xz0;
import o.C2513Az0;
import o.C4500Ve2;
import o.C6516gH2;
import o.HH2;
import o.XL1;

/* loaded from: classes.dex */
public class h {
    public static final String f = "FragmentManager";
    public static final String g = "state";
    public static final String h = "savedInstanceState";
    public static final String i = "registryState";
    public static final String j = "childFragmentManager";
    public static final String k = "viewState";
    public static final String l = "viewRegistryState";
    public static final String m = "arguments";
    public final f a;
    public final C10841xz0 b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View X;

        public a(View view) {
            this.X = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.X.removeOnAttachStateChangeListener(this);
            C6516gH2.C1(this.X);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.b.values().length];
            a = iArr;
            try {
                iArr[f.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[f.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public h(f fVar, C10841xz0 c10841xz0, Fragment fragment) {
        this.a = fVar;
        this.b = c10841xz0;
        this.c = fragment;
    }

    public void a() {
        Bundle bundle;
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.c);
        }
        Bundle bundle2 = this.c.Y;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(h);
        } else {
            bundle = null;
        }
        this.c.o1(bundle);
        this.a.a(this.c, bundle, false);
    }

    public void b() {
        Fragment v0 = FragmentManager.v0(this.c.C1);
        Fragment N = this.c.N();
        if (v0 != null && !v0.equals(N)) {
            Fragment fragment = this.c;
            C2513Az0.s(fragment, v0, fragment.t1);
        }
        int j2 = this.b.j(this.c);
        Fragment fragment2 = this.c;
        fragment2.C1.addView(fragment2.D1, j2);
    }

    public void c() {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.c);
        }
        Fragment fragment = this.c;
        Fragment fragment2 = fragment.c1;
        h hVar = null;
        if (fragment2 != null) {
            h o2 = this.b.o(fragment2.a1);
            if (o2 != null) {
                Fragment fragment3 = this.c;
                fragment3.d1 = fragment3.c1.a1;
                fragment3.c1 = null;
                hVar = o2;
            } else {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.c1 + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.d1;
            if (str != null && (hVar = this.b.o(str)) == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.d1 + " that does not belong to this FragmentManager!");
            }
        }
        if (hVar != null) {
            hVar.m();
        }
        Fragment fragment4 = this.c;
        fragment4.p1 = fragment4.o1.K0();
        Fragment fragment5 = this.c;
        fragment5.r1 = fragment5.o1.N0();
        this.a.g(this.c, false);
        this.c.p1();
        this.a.b(this.c, false);
    }

    public int d() {
        k.c.a aVar;
        Fragment fragment = this.c;
        if (fragment.o1 == null) {
            return fragment.X;
        }
        int i2 = this.e;
        int i3 = b.a[fragment.N1.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        i2 = Math.min(i2, -1);
                    } else {
                        i2 = Math.min(i2, 0);
                    }
                } else {
                    i2 = Math.min(i2, 1);
                }
            } else {
                i2 = Math.min(i2, 5);
            }
        }
        Fragment fragment2 = this.c;
        if (fragment2.j1) {
            if (fragment2.k1) {
                i2 = Math.max(this.e, 2);
                View view = this.c.D1;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = this.e < 4 ? Math.min(i2, fragment2.X) : Math.min(i2, 1);
            }
        }
        if (!this.c.g1) {
            i2 = Math.min(i2, 1);
        }
        Fragment fragment3 = this.c;
        ViewGroup viewGroup = fragment3.C1;
        if (viewGroup != null) {
            aVar = k.r(viewGroup, fragment3.O()).p(this);
        } else {
            aVar = null;
        }
        if (aVar == k.c.a.ADDING) {
            i2 = Math.min(i2, 6);
        } else if (aVar == k.c.a.REMOVING) {
            i2 = Math.max(i2, 3);
        } else {
            Fragment fragment4 = this.c;
            if (fragment4.h1) {
                if (fragment4.y0()) {
                    i2 = Math.min(i2, 1);
                } else {
                    i2 = Math.min(i2, -1);
                }
            }
        }
        Fragment fragment5 = this.c;
        if (fragment5.E1 && fragment5.X < 5) {
            i2 = Math.min(i2, 4);
        }
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i2 + " for " + this.c);
        }
        return i2;
    }

    public void e() {
        Bundle bundle;
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.c);
        }
        Bundle bundle2 = this.c.Y;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(h);
        } else {
            bundle = null;
        }
        Fragment fragment = this.c;
        if (!fragment.L1) {
            this.a.h(fragment, bundle, false);
            this.c.s1(bundle);
            this.a.c(this.c, bundle, false);
            return;
        }
        fragment.X = 1;
        fragment.Z1();
    }

    public void f() {
        Bundle bundle;
        String str;
        if (this.c.j1) {
            return;
        }
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
        }
        Bundle bundle2 = this.c.Y;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(h);
        } else {
            bundle = null;
        }
        LayoutInflater y1 = this.c.y1(bundle);
        Fragment fragment = this.c;
        ViewGroup viewGroup2 = fragment.C1;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i2 = fragment.t1;
            if (i2 != 0) {
                if (i2 != -1) {
                    viewGroup = (ViewGroup) fragment.o1.E0().d(this.c.t1);
                    if (viewGroup == null) {
                        Fragment fragment2 = this.c;
                        if (!fragment2.l1) {
                            try {
                                str = fragment2.Y().getResourceName(this.c.t1);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.c.t1) + " (" + str + ") for fragment " + this.c);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        C2513Az0.r(this.c, viewGroup);
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.c + " for a container view with no id");
                }
            }
        }
        Fragment fragment3 = this.c;
        fragment3.C1 = viewGroup;
        fragment3.u1(y1, viewGroup, bundle);
        if (this.c.D1 != null) {
            if (FragmentManager.X0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.c);
            }
            this.c.D1.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.c;
            fragment4.D1.setTag(XL1.c.a, fragment4);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment5 = this.c;
            if (fragment5.v1) {
                fragment5.D1.setVisibility(8);
            }
            if (C6516gH2.T0(this.c.D1)) {
                C6516gH2.C1(this.c.D1);
            } else {
                View view = this.c.D1;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.c.L1();
            f fVar = this.a;
            Fragment fragment6 = this.c;
            fVar.m(fragment6, fragment6.D1, bundle, false);
            int visibility = this.c.D1.getVisibility();
            this.c.q2(this.c.D1.getAlpha());
            Fragment fragment7 = this.c;
            if (fragment7.C1 != null && visibility == 0) {
                View findFocus = fragment7.D1.findFocus();
                if (findFocus != null) {
                    this.c.k2(findFocus);
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.c);
                    }
                }
                this.c.D1.setAlpha(0.0f);
            }
        }
        this.c.X = 2;
    }

    public void g() {
        boolean z;
        Fragment f2;
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        boolean z2 = true;
        if (fragment.h1 && !fragment.y0()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Fragment fragment2 = this.c;
            if (!fragment2.i1) {
                this.b.C(fragment2.a1, null);
            }
        }
        if (!z && !this.b.q().u(this.c)) {
            String str = this.c.d1;
            if (str != null && (f2 = this.b.f(str)) != null && f2.x1) {
                this.c.c1 = f2;
            }
            this.c.X = 0;
            return;
        }
        AbstractC5701cz0<?> abstractC5701cz0 = this.c.p1;
        if (abstractC5701cz0 instanceof HH2) {
            z2 = this.b.q().q();
        } else if (abstractC5701cz0.g() instanceof Activity) {
            z2 = true ^ ((Activity) abstractC5701cz0.g()).isChangingConfigurations();
        }
        if ((z && !this.c.i1) || z2) {
            this.b.q().h(this.c);
        }
        this.c.v1();
        this.a.d(this.c, false);
        for (h hVar : this.b.l()) {
            if (hVar != null) {
                Fragment k2 = hVar.k();
                if (this.c.a1.equals(k2.d1)) {
                    k2.c1 = this.c;
                    k2.d1 = null;
                }
            }
        }
        Fragment fragment3 = this.c;
        String str2 = fragment3.d1;
        if (str2 != null) {
            fragment3.c1 = this.b.f(str2);
        }
        this.b.t(this);
    }

    public void h() {
        View view;
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.c);
        }
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.C1;
        if (viewGroup != null && (view = fragment.D1) != null) {
            viewGroup.removeView(view);
        }
        this.c.w1();
        this.a.n(this.c, false);
        Fragment fragment2 = this.c;
        fragment2.C1 = null;
        fragment2.D1 = null;
        fragment2.P1 = null;
        fragment2.Q1.r(null);
        this.c.k1 = false;
    }

    public void i() {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.c);
        }
        this.c.x1();
        this.a.e(this.c, false);
        Fragment fragment = this.c;
        fragment.X = -1;
        fragment.p1 = null;
        fragment.r1 = null;
        fragment.o1 = null;
        if ((fragment.h1 && !fragment.y0()) || this.b.q().u(this.c)) {
            if (FragmentManager.X0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.c);
            }
            this.c.s0();
        }
    }

    public void j() {
        Bundle bundle;
        Fragment fragment = this.c;
        if (fragment.j1 && fragment.k1 && !fragment.m1) {
            if (FragmentManager.X0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
            }
            Bundle bundle2 = this.c.Y;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(h);
            } else {
                bundle = null;
            }
            Fragment fragment2 = this.c;
            fragment2.u1(fragment2.y1(bundle), null, bundle);
            View view = this.c.D1;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.c;
                fragment3.D1.setTag(XL1.c.a, fragment3);
                Fragment fragment4 = this.c;
                if (fragment4.v1) {
                    fragment4.D1.setVisibility(8);
                }
                this.c.L1();
                f fVar = this.a;
                Fragment fragment5 = this.c;
                fVar.m(fragment5, fragment5.D1, bundle, false);
                this.c.X = 2;
            }
        }
    }

    public Fragment k() {
        return this.c;
    }

    public final boolean l(View view) {
        if (view == this.c.D1) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.c.D1) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.d) {
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z = false;
            while (true) {
                int d = d();
                Fragment fragment = this.c;
                int i2 = fragment.X;
                if (d != i2) {
                    if (d > i2) {
                        switch (i2 + 1) {
                            case 0:
                                c();
                                continue;
                            case 1:
                                e();
                                continue;
                            case 2:
                                j();
                                f();
                                continue;
                            case 3:
                                a();
                                continue;
                            case 4:
                                if (fragment.D1 != null && (viewGroup3 = fragment.C1) != null) {
                                    k.r(viewGroup3, fragment.O()).f(k.c.b.h(this.c.D1.getVisibility()), this);
                                }
                                this.c.X = 4;
                                continue;
                            case 5:
                                u();
                                continue;
                            case 6:
                                fragment.X = 6;
                                continue;
                            case 7:
                                p();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i2 - 1) {
                            case -1:
                                i();
                                continue;
                            case 0:
                                if (fragment.i1 && this.b.r(fragment.a1) == null) {
                                    this.b.C(this.c.a1, r());
                                }
                                g();
                                continue;
                            case 1:
                                h();
                                this.c.X = 1;
                                continue;
                            case 2:
                                fragment.k1 = false;
                                fragment.X = 2;
                                continue;
                            case 3:
                                if (FragmentManager.X0(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.c);
                                }
                                Fragment fragment2 = this.c;
                                if (fragment2.i1) {
                                    this.b.C(fragment2.a1, r());
                                } else if (fragment2.D1 != null && fragment2.Z == null) {
                                    s();
                                }
                                Fragment fragment3 = this.c;
                                if (fragment3.D1 != null && (viewGroup2 = fragment3.C1) != null) {
                                    k.r(viewGroup2, fragment3.O()).h(this);
                                }
                                this.c.X = 3;
                                continue;
                            case 4:
                                v();
                                continue;
                            case 5:
                                fragment.X = 5;
                                continue;
                            case 6:
                                n();
                                continue;
                            default:
                                continue;
                        }
                    }
                    z = true;
                } else {
                    if (!z && i2 == -1 && fragment.h1 && !fragment.y0() && !this.c.i1) {
                        if (FragmentManager.X0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.c);
                        }
                        this.b.q().h(this.c);
                        this.b.t(this);
                        if (FragmentManager.X0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.c);
                        }
                        this.c.s0();
                    }
                    Fragment fragment4 = this.c;
                    if (fragment4.J1) {
                        if (fragment4.D1 != null && (viewGroup = fragment4.C1) != null) {
                            k r = k.r(viewGroup, fragment4.O());
                            if (this.c.v1) {
                                r.g(this);
                            } else {
                                r.i(this);
                            }
                        }
                        Fragment fragment5 = this.c;
                        FragmentManager fragmentManager = fragment5.o1;
                        if (fragmentManager != null) {
                            fragmentManager.V0(fragment5);
                        }
                        Fragment fragment6 = this.c;
                        fragment6.J1 = false;
                        fragment6.X0(fragment6.v1);
                        this.c.q1.Q();
                    }
                    this.d = false;
                    return;
                }
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public void n() {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.c);
        }
        this.c.D1();
        this.a.f(this.c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.c.Y;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (this.c.Y.getBundle(h) == null) {
                this.c.Y.putBundle(h, new Bundle());
            }
            Fragment fragment = this.c;
            fragment.Z = fragment.Y.getSparseParcelableArray(k);
            Fragment fragment2 = this.c;
            fragment2.Y0 = fragment2.Y.getBundle(l);
            C10355vz0 c10355vz0 = (C10355vz0) this.c.Y.getParcelable("state");
            if (c10355vz0 != null) {
                Fragment fragment3 = this.c;
                fragment3.d1 = c10355vz0.g1;
                fragment3.e1 = c10355vz0.h1;
                Boolean bool = fragment3.Z0;
                if (bool != null) {
                    fragment3.F1 = bool.booleanValue();
                    this.c.Z0 = null;
                } else {
                    fragment3.F1 = c10355vz0.i1;
                }
            }
            Fragment fragment4 = this.c;
            if (!fragment4.F1) {
                fragment4.E1 = true;
            }
        }
    }

    public void p() {
        String str;
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.c);
        }
        View D = this.c.D();
        if (D != null && l(D)) {
            boolean requestFocus = D.requestFocus();
            if (FragmentManager.X0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(D);
                sb.append(C4500Ve2.b);
                if (requestFocus) {
                    str = C2356a.U;
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(this.c);
                sb.append(" resulting in focused view ");
                sb.append(this.c.D1.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.c.k2(null);
        this.c.H1();
        this.a.i(this.c, false);
        this.b.C(this.c.a1, null);
        Fragment fragment = this.c;
        fragment.Y = null;
        fragment.Z = null;
        fragment.Y0 = null;
    }

    public Fragment.n q() {
        if (this.c.X > -1) {
            return new Fragment.n(r());
        }
        return null;
    }

    public Bundle r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.c;
        if (fragment.X == -1 && (bundle = fragment.Y) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new C10355vz0(this.c));
        if (this.c.X > -1) {
            Bundle bundle3 = new Bundle();
            this.c.I1(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle(h, bundle3);
            }
            this.a.j(this.c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.c.S1.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle(i, bundle4);
            }
            Bundle M1 = this.c.q1.M1();
            if (!M1.isEmpty()) {
                bundle2.putBundle(j, M1);
            }
            if (this.c.D1 != null) {
                s();
            }
            SparseArray<Parcelable> sparseArray = this.c.Z;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray(k, sparseArray);
            }
            Bundle bundle5 = this.c.Y0;
            if (bundle5 != null) {
                bundle2.putBundle(l, bundle5);
            }
        }
        Bundle bundle6 = this.c.b1;
        if (bundle6 != null) {
            bundle2.putBundle(m, bundle6);
        }
        return bundle2;
    }

    public void s() {
        if (this.c.D1 != null) {
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + this.c + " with view " + this.c.D1);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.c.D1.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.c.Z = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.c.P1.f(bundle);
            if (!bundle.isEmpty()) {
                this.c.Y0 = bundle;
            }
        }
    }

    public void t(int i2) {
        this.e = i2;
    }

    public void u() {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.c);
        }
        this.c.J1();
        this.a.k(this.c, false);
    }

    public void v() {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.c);
        }
        this.c.K1();
        this.a.l(this.c, false);
    }

    public h(f fVar, C10841xz0 c10841xz0, ClassLoader classLoader, e eVar, Bundle bundle) {
        this.a = fVar;
        this.b = c10841xz0;
        Fragment a2 = ((C10355vz0) bundle.getParcelable("state")).a(eVar, classLoader);
        this.c = a2;
        a2.Y = bundle;
        Bundle bundle2 = bundle.getBundle(m);
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a2.f2(bundle2);
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public h(f fVar, C10841xz0 c10841xz0, Fragment fragment, Bundle bundle) {
        this.a = fVar;
        this.b = c10841xz0;
        this.c = fragment;
        fragment.Z = null;
        fragment.Y0 = null;
        fragment.n1 = 0;
        fragment.k1 = false;
        fragment.g1 = false;
        Fragment fragment2 = fragment.c1;
        fragment.d1 = fragment2 != null ? fragment2.a1 : null;
        fragment.c1 = null;
        fragment.Y = bundle;
        fragment.b1 = bundle.getBundle(m);
    }
}
