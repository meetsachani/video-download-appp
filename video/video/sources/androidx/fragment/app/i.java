package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f;
import java.util.ArrayList;
import o.AbstractC3694Mx1;

@Deprecated
/* loaded from: classes.dex */
public abstract class i extends AbstractC3694Mx1 {
    public static final String l = "FragmentStatePagerAdapt";
    public static final boolean m = false;
    @Deprecated
    public static final int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f33o = 1;
    public final FragmentManager e;
    public final int f;
    public j g;
    public ArrayList<Fragment.n> h;
    public ArrayList<Fragment> i;
    public Fragment j;
    public boolean k;

    @Deprecated
    public i(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // o.AbstractC3694Mx1
    public void b(ViewGroup viewGroup, int i, Object obj) {
        Fragment.n nVar;
        Fragment fragment = (Fragment) obj;
        if (this.g == null) {
            this.g = this.e.u();
        }
        while (this.h.size() <= i) {
            this.h.add(null);
        }
        ArrayList<Fragment.n> arrayList = this.h;
        if (fragment.v0()) {
            nVar = this.e.P1(fragment);
        } else {
            nVar = null;
        }
        arrayList.set(i, nVar);
        this.i.set(i, null);
        this.g.x(fragment);
        if (fragment.equals(this.j)) {
            this.j = null;
        }
    }

    @Override // o.AbstractC3694Mx1
    public void d(ViewGroup viewGroup) {
        j jVar = this.g;
        if (jVar != null) {
            if (!this.k) {
                try {
                    this.k = true;
                    jVar.p();
                } finally {
                    this.k = false;
                }
            }
            this.g = null;
        }
    }

    @Override // o.AbstractC3694Mx1
    public Object j(ViewGroup viewGroup, int i) {
        Fragment.n nVar;
        Fragment fragment;
        if (this.i.size() > i && (fragment = this.i.get(i)) != null) {
            return fragment;
        }
        if (this.g == null) {
            this.g = this.e.u();
        }
        Fragment v = v(i);
        if (this.h.size() > i && (nVar = this.h.get(i)) != null) {
            v.m2(nVar);
        }
        while (this.i.size() <= i) {
            this.i.add(null);
        }
        v.n2(false);
        if (this.f == 0) {
            v.y2(false);
        }
        this.i.set(i, v);
        this.g.b(viewGroup.getId(), v);
        if (this.f == 1) {
            this.g.K(v, f.b.STARTED);
        }
        return v;
    }

    @Override // o.AbstractC3694Mx1
    public boolean k(View view, Object obj) {
        if (((Fragment) obj).n0() == view) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC3694Mx1
    public void n(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.h.clear();
            this.i.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.h.add((Fragment.n) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment F0 = this.e.F0(bundle, str);
                    if (F0 != null) {
                        while (this.i.size() <= parseInt) {
                            this.i.add(null);
                        }
                        F0.n2(false);
                        this.i.set(parseInt, F0);
                    } else {
                        Log.w(l, "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // o.AbstractC3694Mx1
    public Parcelable o() {
        Bundle bundle;
        if (this.h.size() > 0) {
            bundle = new Bundle();
            Fragment.n[] nVarArr = new Fragment.n[this.h.size()];
            this.h.toArray(nVarArr);
            bundle.putParcelableArray("states", nVarArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.i.size(); i++) {
            Fragment fragment = this.i.get(i);
            if (fragment != null && fragment.v0()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.e.w1(bundle, "f" + i, fragment);
            }
        }
        return bundle;
    }

    @Override // o.AbstractC3694Mx1
    public void q(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.j;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.n2(false);
                if (this.f == 1) {
                    if (this.g == null) {
                        this.g = this.e.u();
                    }
                    this.g.K(this.j, f.b.STARTED);
                } else {
                    this.j.y2(false);
                }
            }
            fragment.n2(true);
            if (this.f == 1) {
                if (this.g == null) {
                    this.g = this.e.u();
                }
                this.g.K(fragment, f.b.RESUMED);
            } else {
                fragment.y2(true);
            }
            this.j = fragment;
        }
    }

    @Override // o.AbstractC3694Mx1
    public void t(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract Fragment v(int i);

    public i(FragmentManager fragmentManager, int i) {
        this.g = null;
        this.h = new ArrayList<>();
        this.i = new ArrayList<>();
        this.j = null;
        this.e = fragmentManager;
        this.f = i;
    }
}
