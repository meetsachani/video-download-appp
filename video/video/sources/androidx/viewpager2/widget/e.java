package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;
import o.K9;

/* loaded from: classes.dex */
public final class e extends RecyclerView.u {
    public static final int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f65o = 1;
    public static final int p = 2;
    public static final int q = 3;
    public static final int r = 4;
    public static final int s = -1;
    public ViewPager2.j a;
    public final ViewPager2 b;
    public final RecyclerView c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public a g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public float b;
        public int c;

        public void a() {
            this.a = -1;
            this.b = 0.0f;
            this.c = 0;
        }
    }

    public e(ViewPager2 viewPager2) {
        this.b = viewPager2;
        RecyclerView recyclerView = viewPager2.h1;
        this.c = recyclerView;
        this.d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.g = new a();
        q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a(RecyclerView recyclerView, int i) {
        if ((this.e != 1 || this.f != 1) && i == 1) {
            s(false);
        } else if (l() && i == 2) {
            if (this.k) {
                e(2);
                this.j = true;
            }
        } else {
            if (l() && i == 0) {
                t();
                if (!this.k) {
                    int i2 = this.g.a;
                    if (i2 != -1) {
                        c(i2, 0.0f, 0);
                    }
                } else {
                    a aVar = this.g;
                    if (aVar.c == 0) {
                        int i3 = this.h;
                        int i4 = aVar.a;
                        if (i3 != i4) {
                            d(i4);
                        }
                    }
                }
                e(0);
                q();
            }
            if (this.e == 2 && i == 0 && this.l) {
                t();
                a aVar2 = this.g;
                if (aVar2.c == 0) {
                    int i5 = this.i;
                    int i6 = aVar2.a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        d(i6);
                    }
                    e(0);
                    q();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r5 == r3.b.k()) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        boolean z;
        this.k = true;
        t();
        if (this.j) {
            this.j = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if (i < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                i3 = this.g.a;
                this.i = i3;
                if (this.h != i3) {
                    d(i3);
                }
            }
            a aVar = this.g;
            if (aVar.c != 0) {
                i3 = aVar.a + 1;
                this.i = i3;
                if (this.h != i3) {
                }
            }
            i3 = this.g.a;
            this.i = i3;
            if (this.h != i3) {
            }
        } else if (this.e == 0) {
            int i4 = this.g.a;
            if (i4 == -1) {
                i4 = 0;
            }
            d(i4);
        }
        a aVar2 = this.g;
        int i5 = aVar2.a;
        if (i5 == -1) {
            i5 = 0;
        }
        c(i5, aVar2.b, aVar2.c);
        a aVar3 = this.g;
        int i6 = aVar3.a;
        int i7 = this.i;
        if ((i6 == i7 || i7 == -1) && aVar3.c == 0 && this.f != 1) {
            e(0);
            q();
        }
    }

    public final void c(int i, float f, int i2) {
        ViewPager2.j jVar = this.a;
        if (jVar != null) {
            jVar.b(i, f, i2);
        }
    }

    public final void d(int i) {
        ViewPager2.j jVar = this.a;
        if (jVar != null) {
            jVar.c(i);
        }
    }

    public final void e(int i) {
        if ((this.e != 3 || this.f != 0) && this.f != i) {
            this.f = i;
            ViewPager2.j jVar = this.a;
            if (jVar != null) {
                jVar.a(i);
            }
        }
    }

    public final int f() {
        return this.d.B2();
    }

    public double g() {
        t();
        a aVar = this.g;
        return aVar.a + aVar.b;
    }

    public int h() {
        return this.f;
    }

    public boolean i() {
        if (this.f == 1) {
            return true;
        }
        return false;
    }

    public boolean j() {
        return this.m;
    }

    public boolean k() {
        if (this.f == 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        int i = this.e;
        if (i == 1 || i == 4) {
            return true;
        }
        return false;
    }

    public void m() {
        this.e = 4;
        s(true);
    }

    public void n() {
        this.l = true;
    }

    public void o() {
        if (i() && !this.m) {
            return;
        }
        this.m = false;
        t();
        a aVar = this.g;
        if (aVar.c == 0) {
            int i = aVar.a;
            if (i != this.h) {
                d(i);
            }
            e(0);
            q();
            return;
        }
        e(2);
    }

    public void p(int i, boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.e = i2;
        boolean z2 = false;
        this.m = false;
        if (this.i != i) {
            z2 = true;
        }
        this.i = i;
        e(2);
        if (z2) {
            d(i);
        }
    }

    public final void q() {
        this.e = 0;
        this.f = 0;
        this.g.a();
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.m = false;
        this.l = false;
    }

    public void r(ViewPager2.j jVar) {
        this.a = jVar;
    }

    public final void s(boolean z) {
        int i;
        this.m = z;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        this.e = i;
        int i2 = this.i;
        if (i2 != -1) {
            this.h = i2;
            this.i = -1;
        } else if (this.h == -1) {
            this.h = f();
        }
        e(1);
    }

    public final void t() {
        int top;
        float f;
        a aVar = this.g;
        int B2 = this.d.B2();
        aVar.a = B2;
        if (B2 == -1) {
            aVar.a();
            return;
        }
        View O = this.d.O(B2);
        if (O == null) {
            aVar.a();
            return;
        }
        int n0 = this.d.n0(O);
        int y0 = this.d.y0(O);
        int B0 = this.d.B0(O);
        int T = this.d.T(O);
        ViewGroup.LayoutParams layoutParams = O.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            n0 += marginLayoutParams.leftMargin;
            y0 += marginLayoutParams.rightMargin;
            B0 += marginLayoutParams.topMargin;
            T += marginLayoutParams.bottomMargin;
        }
        int height = O.getHeight() + B0 + T;
        int width = O.getWidth() + n0 + y0;
        if (this.d.Q2() == 0) {
            top = (O.getLeft() - n0) - this.c.getPaddingLeft();
            if (this.b.k()) {
                top = -top;
            }
            height = width;
        } else {
            top = (O.getTop() - B0) - this.c.getPaddingTop();
        }
        int i = -top;
        aVar.c = i;
        if (i < 0) {
            if (new K9(this.d).d()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.c)));
        }
        if (height == 0) {
            f = 0.0f;
        } else {
            f = i / height;
        }
        aVar.b = f;
    }
}
