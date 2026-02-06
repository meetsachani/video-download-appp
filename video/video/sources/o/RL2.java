package o;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class RL2 {
    public static final String b = "WindowInsetsCompat";
    public static final RL2 c;
    public final n a;

    /* loaded from: classes.dex */
    public static class a {
        public static Field a;
        public static Field b;
        public static Field c;
        public static boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                Log.w(RL2.b, "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        public static RL2 a(View view) {
            if (d && view.isAttachedToWindow()) {
                try {
                    Object obj = a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) b.get(obj);
                        Rect rect2 = (Rect) c.get(obj);
                        if (rect != null && rect2 != null) {
                            RL2 a2 = new b().f(C9246rQ0.e(rect)).h(C9246rQ0.e(rect2)).a();
                            a2.H(a2);
                            a2.d(view.getRootView());
                            return a2;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w(RL2.b, "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {
        public e() {
        }

        @Override // o.RL2.g
        public void d(int i, C9246rQ0 c9246rQ0) {
            C5311bM2.a(this.c, q.a(i), c9246rQ0.h());
        }

        @Override // o.RL2.g
        public void e(int i, C9246rQ0 c9246rQ0) {
            C5796dM2.a(this.c, q.a(i), c9246rQ0.h());
        }

        @Override // o.RL2.g
        public void k(int i, boolean z) {
            C5553cM2.a(this.c, q.a(i), z);
        }

        public e(RL2 rl2) {
            super(rl2);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends e {
        public f() {
        }

        @Override // o.RL2.e, o.RL2.g
        public void d(int i, C9246rQ0 c9246rQ0) {
            C5311bM2.a(this.c, r.a(i), c9246rQ0.h());
        }

        @Override // o.RL2.e, o.RL2.g
        public void e(int i, C9246rQ0 c9246rQ0) {
            C5796dM2.a(this.c, r.a(i), c9246rQ0.h());
        }

        @Override // o.RL2.e, o.RL2.g
        public void k(int i, boolean z) {
            C5553cM2.a(this.c, r.a(i), z);
        }

        public f(RL2 rl2) {
            super(rl2);
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public final RL2 a;
        public C9246rQ0[] b;

        public g() {
            this(new RL2((RL2) null));
        }

        public final void a() {
            C9246rQ0[] c9246rQ0Arr = this.b;
            if (c9246rQ0Arr != null) {
                C9246rQ0 c9246rQ0 = c9246rQ0Arr[p.e(1)];
                C9246rQ0 c9246rQ02 = this.b[p.e(2)];
                if (c9246rQ02 == null) {
                    c9246rQ02 = this.a.f(2);
                }
                if (c9246rQ0 == null) {
                    c9246rQ0 = this.a.f(1);
                }
                i(C9246rQ0.b(c9246rQ0, c9246rQ02));
                C9246rQ0 c9246rQ03 = this.b[p.e(16)];
                if (c9246rQ03 != null) {
                    h(c9246rQ03);
                }
                C9246rQ0 c9246rQ04 = this.b[p.e(32)];
                if (c9246rQ04 != null) {
                    f(c9246rQ04);
                }
                C9246rQ0 c9246rQ05 = this.b[p.e(64)];
                if (c9246rQ05 != null) {
                    j(c9246rQ05);
                }
            }
        }

        public RL2 b() {
            a();
            return this.a;
        }

        public void d(int i, C9246rQ0 c9246rQ0) {
            if (this.b == null) {
                this.b = new C9246rQ0[10];
            }
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.b[p.e(i2)] = c9246rQ0;
                }
            }
        }

        public void e(int i, C9246rQ0 c9246rQ0) {
            if (i != 8) {
                return;
            }
            throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
        }

        public g(RL2 rl2) {
            this.a = rl2;
        }

        public void c(C10130v40 c10130v40) {
        }

        public void f(C9246rQ0 c9246rQ0) {
        }

        public void g(C9246rQ0 c9246rQ0) {
        }

        public void h(C9246rQ0 c9246rQ0) {
        }

        public void i(C9246rQ0 c9246rQ0) {
        }

        public void j(C9246rQ0 c9246rQ0) {
        }

        public void k(int i, boolean z) {
        }
    }

    /* loaded from: classes.dex */
    public static class j extends i {
        public j(RL2 rl2, WindowInsets windowInsets) {
            super(rl2, windowInsets);
        }

        @Override // o.RL2.n
        public RL2 a() {
            return RL2.L(C6281fM2.a(this.c));
        }

        @Override // o.RL2.h, o.RL2.n
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (Objects.equals(this.c, jVar.c) && Objects.equals(this.g, jVar.g) && h.C(this.h, jVar.h)) {
                return true;
            }
            return false;
        }

        @Override // o.RL2.n
        public C10130v40 f() {
            return C10130v40.j(C6038eM2.a(this.c));
        }

        @Override // o.RL2.n
        public int hashCode() {
            return this.c.hashCode();
        }

        public j(RL2 rl2, j jVar) {
            super(rl2, jVar);
        }
    }

    /* loaded from: classes.dex */
    public static class l extends k {
        public static final RL2 s = RL2.L(C8010mM2.a());

        public l(RL2 rl2, WindowInsets windowInsets) {
            super(rl2, windowInsets);
        }

        @Override // o.RL2.h, o.RL2.n
        public C9246rQ0 g(int i) {
            return C9246rQ0.g(C7749lM2.a(this.c, q.a(i)));
        }

        @Override // o.RL2.h, o.RL2.n
        public C9246rQ0 h(int i) {
            return C9246rQ0.g(C7506kM2.a(this.c, q.a(i)));
        }

        @Override // o.RL2.h, o.RL2.n
        public boolean q(int i) {
            return C8253nM2.a(this.c, q.a(i));
        }

        public l(RL2 rl2, l lVar) {
            super(rl2, lVar);
        }

        @Override // o.RL2.h, o.RL2.n
        public final void d(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static class m extends l {
        public static final RL2 t = RL2.L(C8010mM2.a());

        public m(RL2 rl2, WindowInsets windowInsets) {
            super(rl2, windowInsets);
        }

        @Override // o.RL2.l, o.RL2.h, o.RL2.n
        public C9246rQ0 g(int i) {
            return C9246rQ0.g(C7749lM2.a(this.c, r.a(i)));
        }

        @Override // o.RL2.l, o.RL2.h, o.RL2.n
        public C9246rQ0 h(int i) {
            return C9246rQ0.g(C7506kM2.a(this.c, r.a(i)));
        }

        @Override // o.RL2.l, o.RL2.h, o.RL2.n
        public boolean q(int i) {
            return C8253nM2.a(this.c, r.a(i));
        }

        public m(RL2 rl2, m mVar) {
            super(rl2, mVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class o {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 4;
        public static final int d = 8;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        public static int a() {
            return 15;
        }
    }

    /* loaded from: classes.dex */
    public static final class p {
        public static final int a = 1;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 4;
        public static final int e = 8;
        public static final int f = 16;
        public static final int g = 32;
        public static final int h = 64;
        public static final int i = 128;
        public static final int j = 256;
        public static final int k = 512;
        public static final int l = 512;
        public static final int m = 10;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        public static int a() {
            return -1;
        }

        public static int b() {
            return 4;
        }

        public static int c() {
            return 128;
        }

        public static int d() {
            return 8;
        }

        public static int e(int i2) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return 1;
                }
                if (i2 == 4) {
                    return 2;
                }
                if (i2 != 8) {
                    if (i2 == 16) {
                        return 4;
                    }
                    if (i2 != 32) {
                        if (i2 != 64) {
                            if (i2 != 128) {
                                if (i2 == 256) {
                                    return 8;
                                }
                                if (i2 == 512) {
                                    return 9;
                                }
                                throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i2);
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 3;
            }
            return 0;
        }

        public static int f() {
            return 32;
        }

        public static int g() {
            return 2;
        }

        public static int h() {
            return 1;
        }

        public static int i() {
            return 519;
        }

        public static int j() {
            return 16;
        }

        public static int k() {
            return 512;
        }

        public static int l() {
            return 64;
        }
    }

    /* loaded from: classes.dex */
    public static final class q {
        private q() {
        }

        public static int a(int i) {
            int a;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 4) {
                                if (i3 != 8) {
                                    if (i3 != 16) {
                                        if (i3 != 32) {
                                            if (i3 != 64) {
                                                if (i3 == 128) {
                                                    a = C9961uM2.a();
                                                }
                                            } else {
                                                a = C9718tM2.a();
                                            }
                                        } else {
                                            a = C9475sM2.a();
                                        }
                                    } else {
                                        a = C9232rM2.a();
                                    }
                                } else {
                                    a = J92.a();
                                }
                            } else {
                                a = C8983qM2.a();
                            }
                        } else {
                            a = C8740pM2.a();
                        }
                    } else {
                        a = C8497oM2.a();
                    }
                    i2 |= a;
                }
            }
            return i2;
        }
    }

    /* loaded from: classes.dex */
    public static final class r {
        private r() {
        }

        public static int a(int i) {
            int a;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 4) {
                                if (i3 != 8) {
                                    if (i3 != 16) {
                                        if (i3 != 32) {
                                            if (i3 != 64) {
                                                if (i3 != 128) {
                                                    if (i3 == 512) {
                                                        a = C10204vM2.a();
                                                    }
                                                } else {
                                                    a = C9961uM2.a();
                                                }
                                            } else {
                                                a = C9718tM2.a();
                                            }
                                        } else {
                                            a = C9475sM2.a();
                                        }
                                    } else {
                                        a = C9232rM2.a();
                                    }
                                } else {
                                    a = J92.a();
                                }
                            } else {
                                a = C8983qM2.a();
                            }
                        } else {
                            a = C8740pM2.a();
                        }
                    } else {
                        a = C8497oM2.a();
                    }
                    i2 |= a;
                }
            }
            return i2;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            c = m.t;
        } else if (i2 >= 30) {
            c = l.s;
        } else {
            c = n.b;
        }
    }

    public RL2(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            this.a = new m(this, windowInsets);
        } else if (i2 >= 30) {
            this.a = new l(this, windowInsets);
        } else if (i2 >= 29) {
            this.a = new k(this, windowInsets);
        } else if (i2 >= 28) {
            this.a = new j(this, windowInsets);
        } else {
            this.a = new i(this, windowInsets);
        }
    }

    public static RL2 L(WindowInsets windowInsets) {
        return M(windowInsets, null);
    }

    public static RL2 M(WindowInsets windowInsets, View view) {
        RL2 rl2 = new RL2((WindowInsets) C10907yF1.l(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            rl2.H(C6516gH2.t0(view));
            rl2.d(view.getRootView());
            rl2.J(view.getWindowSystemUiVisibility());
        }
        return rl2;
    }

    public static C9246rQ0 z(C9246rQ0 c9246rQ0, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, c9246rQ0.a - i2);
        int max2 = Math.max(0, c9246rQ0.b - i3);
        int max3 = Math.max(0, c9246rQ0.c - i4);
        int max4 = Math.max(0, c9246rQ0.d - i5);
        if (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) {
            return c9246rQ0;
        }
        return C9246rQ0.d(max, max2, max3, max4);
    }

    public boolean A() {
        return this.a.o();
    }

    public boolean B() {
        return this.a.p();
    }

    public boolean C(int i2) {
        return this.a.q(i2);
    }

    @Deprecated
    public RL2 D(int i2, int i3, int i4, int i5) {
        return new b(this).h(C9246rQ0.d(i2, i3, i4, i5)).a();
    }

    @Deprecated
    public RL2 E(Rect rect) {
        return new b(this).h(C9246rQ0.e(rect)).a();
    }

    public void F(C9246rQ0[] c9246rQ0Arr) {
        this.a.r(c9246rQ0Arr);
    }

    public void G(C9246rQ0 c9246rQ0) {
        this.a.s(c9246rQ0);
    }

    public void H(RL2 rl2) {
        this.a.t(rl2);
    }

    public void I(C9246rQ0 c9246rQ0) {
        this.a.u(c9246rQ0);
    }

    public void J(int i2) {
        this.a.v(i2);
    }

    public WindowInsets K() {
        n nVar = this.a;
        if (nVar instanceof h) {
            return ((h) nVar).c;
        }
        return null;
    }

    @Deprecated
    public RL2 a() {
        return this.a.a();
    }

    @Deprecated
    public RL2 b() {
        return this.a.b();
    }

    @Deprecated
    public RL2 c() {
        return this.a.c();
    }

    public void d(View view) {
        this.a.d(view);
    }

    public C10130v40 e() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RL2)) {
            return false;
        }
        return C2691Ct1.a(this.a, ((RL2) obj).a);
    }

    public C9246rQ0 f(int i2) {
        return this.a.g(i2);
    }

    public C9246rQ0 g(int i2) {
        return this.a.h(i2);
    }

    @Deprecated
    public C9246rQ0 h() {
        return this.a.i();
    }

    public int hashCode() {
        n nVar = this.a;
        if (nVar == null) {
            return 0;
        }
        return nVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.a.j().d;
    }

    @Deprecated
    public int j() {
        return this.a.j().a;
    }

    @Deprecated
    public int k() {
        return this.a.j().c;
    }

    @Deprecated
    public int l() {
        return this.a.j().b;
    }

    @Deprecated
    public C9246rQ0 m() {
        return this.a.j();
    }

    @Deprecated
    public C9246rQ0 n() {
        return this.a.k();
    }

    @Deprecated
    public int o() {
        return this.a.l().d;
    }

    @Deprecated
    public int p() {
        return this.a.l().a;
    }

    @Deprecated
    public int q() {
        return this.a.l().c;
    }

    @Deprecated
    public int r() {
        return this.a.l().b;
    }

    @Deprecated
    public C9246rQ0 s() {
        return this.a.l();
    }

    @Deprecated
    public C9246rQ0 t() {
        return this.a.m();
    }

    public boolean u() {
        C9246rQ0 f2 = f(p.a());
        C9246rQ0 c9246rQ0 = C9246rQ0.e;
        if (f2.equals(c9246rQ0) && g(p.a() ^ p.d()).equals(c9246rQ0) && e() == null) {
            return false;
        }
        return true;
    }

    @Deprecated
    public boolean v() {
        return !this.a.j().equals(C9246rQ0.e);
    }

    @Deprecated
    public boolean w() {
        return !this.a.l().equals(C9246rQ0.e);
    }

    public RL2 x(int i2, int i3, int i4, int i5) {
        return this.a.n(i2, i3, i4, i5);
    }

    public RL2 y(C9246rQ0 c9246rQ0) {
        return x(c9246rQ0.a, c9246rQ0.b, c9246rQ0.c, c9246rQ0.d);
    }

    /* loaded from: classes.dex */
    public static class c extends g {
        public static Field e = null;
        public static boolean f = false;
        public static Constructor<WindowInsets> g = null;
        public static boolean h = false;
        public WindowInsets c;
        public C9246rQ0 d;

        public c() {
            this.c = l();
        }

        private static WindowInsets l() {
            if (!f) {
                try {
                    e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i(RL2.b, "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i(RL2.b, "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!h) {
                try {
                    g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i(RL2.b, "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                h = true;
            }
            Constructor<WindowInsets> constructor = g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i(RL2.b, "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // o.RL2.g
        public RL2 b() {
            a();
            RL2 L = RL2.L(this.c);
            L.F(this.b);
            L.I(this.d);
            return L;
        }

        @Override // o.RL2.g
        public void g(C9246rQ0 c9246rQ0) {
            this.d = c9246rQ0;
        }

        @Override // o.RL2.g
        public void i(C9246rQ0 c9246rQ0) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(c9246rQ0.a, c9246rQ0.b, c9246rQ0.c, c9246rQ0.d);
            }
        }

        public c(RL2 rl2) {
            super(rl2);
            this.c = rl2.K();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends g {
        public final WindowInsets.Builder c;

        public d() {
            this.c = C5068aM2.a();
        }

        @Override // o.RL2.g
        public RL2 b() {
            a();
            RL2 L = RL2.L(VL2.a(this.c));
            L.F(this.b);
            return L;
        }

        @Override // o.RL2.g
        public void c(C10130v40 c10130v40) {
            DisplayCutout displayCutout;
            WindowInsets.Builder builder = this.c;
            if (c10130v40 != null) {
                displayCutout = c10130v40.i();
            } else {
                displayCutout = null;
            }
            YL2.a(builder, displayCutout);
        }

        @Override // o.RL2.g
        public void f(C9246rQ0 c9246rQ0) {
            WL2.a(this.c, c9246rQ0.h());
        }

        @Override // o.RL2.g
        public void g(C9246rQ0 c9246rQ0) {
            TL2.a(this.c, c9246rQ0.h());
        }

        @Override // o.RL2.g
        public void h(C9246rQ0 c9246rQ0) {
            UL2.a(this.c, c9246rQ0.h());
        }

        @Override // o.RL2.g
        public void i(C9246rQ0 c9246rQ0) {
            SL2.a(this.c, c9246rQ0.h());
        }

        @Override // o.RL2.g
        public void j(C9246rQ0 c9246rQ0) {
            XL2.a(this.c, c9246rQ0.h());
        }

        public d(RL2 rl2) {
            super(rl2);
            WindowInsets.Builder a;
            WindowInsets K = rl2.K();
            if (K != null) {
                a = ZL2.a(K);
            } else {
                a = C5068aM2.a();
            }
            this.c = a;
        }
    }

    /* loaded from: classes.dex */
    public static class i extends h {

        /* renamed from: o  reason: collision with root package name */
        public C9246rQ0 f597o;

        public i(RL2 rl2, WindowInsets windowInsets) {
            super(rl2, windowInsets);
            this.f597o = null;
        }

        @Override // o.RL2.n
        public RL2 b() {
            return RL2.L(this.c.consumeStableInsets());
        }

        @Override // o.RL2.n
        public RL2 c() {
            return RL2.L(this.c.consumeSystemWindowInsets());
        }

        @Override // o.RL2.n
        public final C9246rQ0 j() {
            if (this.f597o == null) {
                this.f597o = C9246rQ0.d(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.f597o;
        }

        @Override // o.RL2.n
        public boolean o() {
            return this.c.isConsumed();
        }

        @Override // o.RL2.n
        public void u(C9246rQ0 c9246rQ0) {
            this.f597o = c9246rQ0;
        }

        public i(RL2 rl2, i iVar) {
            super(rl2, iVar);
            this.f597o = null;
            this.f597o = iVar.f597o;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends n {
        public static final int i = 6;
        public static boolean j = false;
        public static Method k;
        public static Class<?> l;
        public static Field m;
        public static Field n;
        public final WindowInsets c;
        public C9246rQ0[] d;
        public C9246rQ0 e;
        public RL2 f;
        public C9246rQ0 g;
        public int h;

        public h(RL2 rl2, WindowInsets windowInsets) {
            super(rl2);
            this.e = null;
            this.c = windowInsets;
        }

        private static void B() {
            try {
                k = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                l = cls;
                m = cls.getDeclaredField("mVisibleInsets");
                n = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                m.setAccessible(true);
                n.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e(RL2.b, "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            j = true;
        }

        public static boolean C(int i2, int i3) {
            if ((i2 & 6) == (i3 & 6)) {
                return true;
            }
            return false;
        }

        private C9246rQ0 w(int i2, boolean z) {
            C9246rQ0 c9246rQ0 = C9246rQ0.e;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    c9246rQ0 = C9246rQ0.b(c9246rQ0, x(i3, z));
                }
            }
            return c9246rQ0;
        }

        private C9246rQ0 y() {
            RL2 rl2 = this.f;
            if (rl2 != null) {
                return rl2.m();
            }
            return C9246rQ0.e;
        }

        private C9246rQ0 z(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!j) {
                    B();
                }
                Method method = k;
                if (method != null && l != null && m != null) {
                    try {
                        Object invoke = method.invoke(view, null);
                        if (invoke == null) {
                            Log.w(RL2.b, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) m.get(n.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return C9246rQ0.e(rect);
                    } catch (ReflectiveOperationException e) {
                        Log.e(RL2.b, "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        public boolean A(int i2) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 8 && i2 != 128) {
                    return true;
                }
            }
            return !x(i2, false).equals(C9246rQ0.e);
        }

        @Override // o.RL2.n
        public void d(View view) {
            C9246rQ0 z = z(view);
            if (z == null) {
                z = C9246rQ0.e;
            }
            s(z);
        }

        @Override // o.RL2.n
        public void e(RL2 rl2) {
            rl2.H(this.f);
            rl2.G(this.g);
            rl2.J(this.h);
        }

        @Override // o.RL2.n
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            h hVar = (h) obj;
            if (!Objects.equals(this.g, hVar.g) || !C(this.h, hVar.h)) {
                return false;
            }
            return true;
        }

        @Override // o.RL2.n
        public C9246rQ0 g(int i2) {
            return w(i2, false);
        }

        @Override // o.RL2.n
        public C9246rQ0 h(int i2) {
            return w(i2, true);
        }

        @Override // o.RL2.n
        public final C9246rQ0 l() {
            if (this.e == null) {
                this.e = C9246rQ0.d(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // o.RL2.n
        public RL2 n(int i2, int i3, int i4, int i5) {
            b bVar = new b(RL2.L(this.c));
            bVar.h(RL2.z(l(), i2, i3, i4, i5));
            bVar.f(RL2.z(j(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // o.RL2.n
        public boolean p() {
            return this.c.isRound();
        }

        @Override // o.RL2.n
        public boolean q(int i2) {
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i2 & i3) != 0 && !A(i3)) {
                    return false;
                }
            }
            return true;
        }

        @Override // o.RL2.n
        public void r(C9246rQ0[] c9246rQ0Arr) {
            this.d = c9246rQ0Arr;
        }

        @Override // o.RL2.n
        public void s(C9246rQ0 c9246rQ0) {
            this.g = c9246rQ0;
        }

        @Override // o.RL2.n
        public void t(RL2 rl2) {
            this.f = rl2;
        }

        @Override // o.RL2.n
        public void v(int i2) {
            this.h = i2;
        }

        public C9246rQ0 x(int i2, boolean z) {
            int i3;
            C10130v40 f;
            if (i2 != 1) {
                C9246rQ0 c9246rQ0 = null;
                if (i2 != 2) {
                    if (i2 != 8) {
                        if (i2 != 16) {
                            if (i2 != 32) {
                                if (i2 != 64) {
                                    if (i2 != 128) {
                                        return C9246rQ0.e;
                                    }
                                    RL2 rl2 = this.f;
                                    if (rl2 != null) {
                                        f = rl2.e();
                                    } else {
                                        f = f();
                                    }
                                    if (f != null) {
                                        return C9246rQ0.d(f.e(), f.g(), f.f(), f.d());
                                    }
                                    return C9246rQ0.e;
                                }
                                return m();
                            }
                            return i();
                        }
                        return k();
                    }
                    C9246rQ0[] c9246rQ0Arr = this.d;
                    if (c9246rQ0Arr != null) {
                        c9246rQ0 = c9246rQ0Arr[p.e(8)];
                    }
                    if (c9246rQ0 != null) {
                        return c9246rQ0;
                    }
                    C9246rQ0 l2 = l();
                    C9246rQ0 y = y();
                    int i4 = l2.d;
                    if (i4 > y.d) {
                        return C9246rQ0.d(0, 0, 0, i4);
                    }
                    C9246rQ0 c9246rQ02 = this.g;
                    if (c9246rQ02 != null && !c9246rQ02.equals(C9246rQ0.e) && (i3 = this.g.d) > y.d) {
                        return C9246rQ0.d(0, 0, 0, i3);
                    }
                    return C9246rQ0.e;
                } else if (z) {
                    C9246rQ0 y2 = y();
                    C9246rQ0 j2 = j();
                    return C9246rQ0.d(Math.max(y2.a, j2.a), 0, Math.max(y2.c, j2.c), Math.max(y2.d, j2.d));
                } else if ((this.h & 2) != 0) {
                    return C9246rQ0.e;
                } else {
                    C9246rQ0 l3 = l();
                    RL2 rl22 = this.f;
                    if (rl22 != null) {
                        c9246rQ0 = rl22.m();
                    }
                    int i5 = l3.d;
                    if (c9246rQ0 != null) {
                        i5 = Math.min(i5, c9246rQ0.d);
                    }
                    return C9246rQ0.d(l3.a, 0, l3.c, i5);
                }
            } else if (z) {
                return C9246rQ0.d(0, Math.max(y().b, l().b), 0, 0);
            } else {
                if ((this.h & 4) != 0) {
                    return C9246rQ0.e;
                }
                return C9246rQ0.d(0, l().b, 0, 0);
            }
        }

        public h(RL2 rl2, h hVar) {
            this(rl2, new WindowInsets(hVar.c));
        }
    }

    /* loaded from: classes.dex */
    public static class k extends j {
        public C9246rQ0 p;
        public C9246rQ0 q;
        public C9246rQ0 r;

        public k(RL2 rl2, WindowInsets windowInsets) {
            super(rl2, windowInsets);
            this.p = null;
            this.q = null;
            this.r = null;
        }

        @Override // o.RL2.n
        public C9246rQ0 i() {
            if (this.q == null) {
                this.q = C9246rQ0.g(C7022iM2.a(this.c));
            }
            return this.q;
        }

        @Override // o.RL2.n
        public C9246rQ0 k() {
            if (this.p == null) {
                this.p = C9246rQ0.g(C7263jM2.a(this.c));
            }
            return this.p;
        }

        @Override // o.RL2.n
        public C9246rQ0 m() {
            if (this.r == null) {
                this.r = C9246rQ0.g(C6536gM2.a(this.c));
            }
            return this.r;
        }

        @Override // o.RL2.h, o.RL2.n
        public RL2 n(int i, int i2, int i3, int i4) {
            return RL2.L(C6779hM2.a(this.c, i, i2, i3, i4));
        }

        public k(RL2 rl2, k kVar) {
            super(rl2, kVar);
            this.p = null;
            this.q = null;
            this.r = null;
        }

        @Override // o.RL2.i, o.RL2.n
        public void u(C9246rQ0 c9246rQ0) {
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final g a;

        public b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.a = new f();
            } else if (i >= 30) {
                this.a = new e();
            } else if (i >= 29) {
                this.a = new d();
            } else {
                this.a = new c();
            }
        }

        public RL2 a() {
            return this.a.b();
        }

        public b b(C10130v40 c10130v40) {
            this.a.c(c10130v40);
            return this;
        }

        public b c(int i, C9246rQ0 c9246rQ0) {
            this.a.d(i, c9246rQ0);
            return this;
        }

        public b d(int i, C9246rQ0 c9246rQ0) {
            this.a.e(i, c9246rQ0);
            return this;
        }

        @Deprecated
        public b e(C9246rQ0 c9246rQ0) {
            this.a.f(c9246rQ0);
            return this;
        }

        @Deprecated
        public b f(C9246rQ0 c9246rQ0) {
            this.a.g(c9246rQ0);
            return this;
        }

        @Deprecated
        public b g(C9246rQ0 c9246rQ0) {
            this.a.h(c9246rQ0);
            return this;
        }

        @Deprecated
        public b h(C9246rQ0 c9246rQ0) {
            this.a.i(c9246rQ0);
            return this;
        }

        @Deprecated
        public b i(C9246rQ0 c9246rQ0) {
            this.a.j(c9246rQ0);
            return this;
        }

        public b j(int i, boolean z) {
            this.a.k(i, z);
            return this;
        }

        public b(RL2 rl2) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.a = new f(rl2);
            } else if (i >= 30) {
                this.a = new e(rl2);
            } else if (i >= 29) {
                this.a = new d(rl2);
            } else {
                this.a = new c(rl2);
            }
        }
    }

    public RL2(RL2 rl2) {
        if (rl2 != null) {
            n nVar = rl2.a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34 && (nVar instanceof m)) {
                this.a = new m(this, (m) nVar);
            } else if (i2 >= 30 && (nVar instanceof l)) {
                this.a = new l(this, (l) nVar);
            } else if (i2 >= 29 && (nVar instanceof k)) {
                this.a = new k(this, (k) nVar);
            } else if (i2 >= 28 && (nVar instanceof j)) {
                this.a = new j(this, (j) nVar);
            } else if (nVar instanceof i) {
                this.a = new i(this, (i) nVar);
            } else if (nVar instanceof h) {
                this.a = new h(this, (h) nVar);
            } else {
                this.a = new n(this);
            }
            nVar.e(this);
            return;
        }
        this.a = new n(this);
    }

    /* loaded from: classes.dex */
    public static class n {
        public static final RL2 b = new b().a().a().b().c();
        public final RL2 a;

        public n(RL2 rl2) {
            this.a = rl2;
        }

        public RL2 a() {
            return this.a;
        }

        public RL2 b() {
            return this.a;
        }

        public RL2 c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (p() == nVar.p() && o() == nVar.o() && C2691Ct1.a(l(), nVar.l()) && C2691Ct1.a(j(), nVar.j()) && C2691Ct1.a(f(), nVar.f())) {
                return true;
            }
            return false;
        }

        public C10130v40 f() {
            return null;
        }

        public C9246rQ0 g(int i) {
            return C9246rQ0.e;
        }

        public C9246rQ0 h(int i) {
            if ((i & 8) == 0) {
                return C9246rQ0.e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return C2691Ct1.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        public C9246rQ0 i() {
            return l();
        }

        public C9246rQ0 j() {
            return C9246rQ0.e;
        }

        public C9246rQ0 k() {
            return l();
        }

        public C9246rQ0 l() {
            return C9246rQ0.e;
        }

        public C9246rQ0 m() {
            return l();
        }

        public RL2 n(int i, int i2, int i3, int i4) {
            return b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i) {
            return true;
        }

        public void d(View view) {
        }

        public void e(RL2 rl2) {
        }

        public void r(C9246rQ0[] c9246rQ0Arr) {
        }

        public void s(C9246rQ0 c9246rQ0) {
        }

        public void t(RL2 rl2) {
        }

        public void u(C9246rQ0 c9246rQ0) {
        }

        public void v(int i) {
        }
    }
}
