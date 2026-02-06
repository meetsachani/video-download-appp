package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0375e {
    public static final boolean d = false;
    public static final String e = "ChildrenHelper";
    public final b a;
    public final a b = new a();
    public final List<View> c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* loaded from: classes.dex */
    public static class a {
        public static final int c = 64;
        public static final long d = Long.MIN_VALUE;
        public long a = 0;
        public a b;

        public void a(int i) {
            if (i >= 64) {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.a(i - 64);
                    return;
                }
                return;
            }
            this.a &= ~(1 << i);
        }

        public int b(int i) {
            a aVar = this.b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.a);
                }
                return Long.bitCount(this.a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.a & ((1 << i) - 1));
            } else {
                return aVar.b(i - 64) + Long.bitCount(this.a);
            }
        }

        public final void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public boolean d(int i) {
            if (i >= 64) {
                c();
                return this.b.d(i - 64);
            } else if ((this.a & (1 << i)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public void e(int i, boolean z) {
            boolean z2;
            if (i >= 64) {
                c();
                this.b.e(i - 64, z);
                return;
            }
            long j = this.a;
            if ((Long.MIN_VALUE & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j2 = (1 << i) - 1;
            this.a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (!z2 && this.b == null) {
                return;
            }
            c();
            this.b.e(0, z2);
        }

        public boolean f(int i) {
            boolean z;
            if (i >= 64) {
                c();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.a;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (~j);
            this.a = j3;
            long j4 = j - 1;
            this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        public void g() {
            this.a = 0L;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i) {
            if (i >= 64) {
                c();
                this.b.h(i - 64);
                return;
            }
            this.a |= 1 << i;
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    /* loaded from: classes.dex */
    public interface b {
        View a(int i);

        void addView(View view, int i);

        void b(View view);

        int c();

        RecyclerView.H d(View view);

        void e(int i);

        void f();

        int g(View view);

        void h(View view);

        void i(int i);

        void j(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    public C0375e(b bVar) {
        this.a = bVar;
    }

    public void a(View view, int i, boolean z) {
        int h;
        if (i < 0) {
            h = this.a.c();
        } else {
            h = h(i);
        }
        this.b.e(h, z);
        if (z) {
            l(view);
        }
        this.a.addView(view, h);
    }

    public void b(View view, boolean z) {
        a(view, -1, z);
    }

    public void c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int h;
        if (i < 0) {
            h = this.a.c();
        } else {
            h = h(i);
        }
        this.b.e(h, z);
        if (z) {
            l(view);
        }
        this.a.j(view, h, layoutParams);
    }

    public void d(int i) {
        int h = h(i);
        this.b.f(h);
        this.a.e(h);
    }

    public View e(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.c.get(i2);
            RecyclerView.H d2 = this.a.d(view);
            if (d2.p() == i && !d2.x() && !d2.z()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i) {
        return this.a.a(h(i));
    }

    public int g() {
        return this.a.c() - this.c.size();
    }

    public final int h(int i) {
        if (i < 0) {
            return -1;
        }
        int c = this.a.c();
        int i2 = i;
        while (i2 < c) {
            int b2 = i - (i2 - this.b.b(i2));
            if (b2 == 0) {
                while (this.b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public View i(int i) {
        return this.a.a(i);
    }

    public int j() {
        return this.a.c();
    }

    public void k(View view) {
        int g = this.a.g(view);
        if (g >= 0) {
            this.b.h(g);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public final void l(View view) {
        this.c.add(view);
        this.a.b(view);
    }

    public int m(View view) {
        int g = this.a.g(view);
        if (g == -1 || this.b.d(g)) {
            return -1;
        }
        return g - this.b.b(g);
    }

    public boolean n(View view) {
        return this.c.contains(view);
    }

    public void o() {
        this.b.g();
        for (int size = this.c.size() - 1; size >= 0; size--) {
            this.a.h(this.c.get(size));
            this.c.remove(size);
        }
        this.a.f();
    }

    public void p(View view) {
        int g = this.a.g(view);
        if (g < 0) {
            return;
        }
        if (this.b.f(g)) {
            t(view);
        }
        this.a.i(g);
    }

    public void q(int i) {
        int h = h(i);
        View a2 = this.a.a(h);
        if (a2 == null) {
            return;
        }
        if (this.b.f(h)) {
            t(a2);
        }
        this.a.i(h);
    }

    public boolean r(View view) {
        int g = this.a.g(view);
        if (g == -1) {
            t(view);
            return true;
        } else if (this.b.d(g)) {
            this.b.f(g);
            t(view);
            this.a.i(g);
            return true;
        } else {
            return false;
        }
    }

    public void s(View view) {
        int g = this.a.g(view);
        if (g >= 0) {
            if (this.b.d(g)) {
                this.b.a(g);
                t(view);
                return;
            }
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public final boolean t(View view) {
        if (this.c.remove(view)) {
            this.a.h(view);
            return true;
        }
        return false;
    }

    public String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
