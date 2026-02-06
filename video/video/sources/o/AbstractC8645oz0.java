package o;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.f;

@Deprecated
/* renamed from: o.oz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8645oz0 extends AbstractC3694Mx1 {
    public static final String j = "FragmentPagerAdapter";
    public static final boolean k = false;
    @Deprecated
    public static final int l = 0;
    public static final int m = 1;
    public final FragmentManager e;
    public final int f;
    public androidx.fragment.app.j g;
    public Fragment h;
    public boolean i;

    @Deprecated
    public AbstractC8645oz0(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public static String x(int i, long j2) {
        return "android:switcher:" + i + ":" + j2;
    }

    @Override // o.AbstractC3694Mx1
    public void b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.g == null) {
            this.g = this.e.u();
        }
        this.g.r(fragment);
        if (fragment.equals(this.h)) {
            this.h = null;
        }
    }

    @Override // o.AbstractC3694Mx1
    public void d(ViewGroup viewGroup) {
        androidx.fragment.app.j jVar = this.g;
        if (jVar != null) {
            if (!this.i) {
                try {
                    this.i = true;
                    jVar.p();
                } finally {
                    this.i = false;
                }
            }
            this.g = null;
        }
    }

    @Override // o.AbstractC3694Mx1
    public Object j(ViewGroup viewGroup, int i) {
        if (this.g == null) {
            this.g = this.e.u();
        }
        long w = w(i);
        Fragment s0 = this.e.s0(x(viewGroup.getId(), w));
        if (s0 != null) {
            this.g.l(s0);
        } else {
            s0 = v(i);
            this.g.c(viewGroup.getId(), s0, x(viewGroup.getId(), w));
        }
        if (s0 != this.h) {
            s0.n2(false);
            if (this.f == 1) {
                this.g.K(s0, f.b.STARTED);
                return s0;
            }
            s0.y2(false);
        }
        return s0;
    }

    @Override // o.AbstractC3694Mx1
    public boolean k(View view, Object obj) {
        if (((Fragment) obj).n0() == view) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC3694Mx1
    public Parcelable o() {
        return null;
    }

    @Override // o.AbstractC3694Mx1
    public void q(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.n2(false);
                if (this.f == 1) {
                    if (this.g == null) {
                        this.g = this.e.u();
                    }
                    this.g.K(this.h, f.b.STARTED);
                } else {
                    this.h.y2(false);
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
            this.h = fragment;
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

    public long w(int i) {
        return i;
    }

    public AbstractC8645oz0(FragmentManager fragmentManager, int i) {
        this.g = null;
        this.h = null;
        this.e = fragmentManager;
        this.f = i;
    }

    @Override // o.AbstractC3694Mx1
    public void n(Parcelable parcelable, ClassLoader classLoader) {
    }
}
