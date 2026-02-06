package o;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import o.C10450wM2;

/* renamed from: o.wM2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10450wM2 {
    @Deprecated
    public static final int b = 0;
    public static final int c = 1;
    @Deprecated
    public static final int d = 1;
    public static final int e = 2;
    public final g a;

    /* renamed from: o.wM2$b */
    /* loaded from: classes.dex */
    public static class b extends a {
        public b(Window window, H92 h92) {
            super(window, h92);
        }

        @Override // o.C10450wM2.g
        public boolean f() {
            if ((this.b.getDecorView().getSystemUiVisibility() & 8192) != 0) {
                return true;
            }
            return false;
        }

        @Override // o.C10450wM2.g
        public void i(boolean z) {
            if (z) {
                q(67108864);
                n(Integer.MIN_VALUE);
                m(8192);
                return;
            }
            p(8192);
        }
    }

    /* renamed from: o.wM2$c */
    /* loaded from: classes.dex */
    public static class c extends b {
        public c(Window window, H92 h92) {
            super(window, h92);
        }

        @Override // o.C10450wM2.g
        public boolean e() {
            if ((this.b.getDecorView().getSystemUiVisibility() & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // o.C10450wM2.g
        public void h(boolean z) {
            if (z) {
                q(C10323vs.Q0);
                n(Integer.MIN_VALUE);
                m(16);
                return;
            }
            p(16);
        }
    }

    /* renamed from: o.wM2$e */
    /* loaded from: classes.dex */
    public static class e extends d {
        public e(Window window, C10450wM2 c10450wM2, H92 h92) {
            super(window, c10450wM2, h92);
        }

        @Override // o.C10450wM2.d, o.C10450wM2.g
        public int c() {
            return DM2.a(this.c);
        }

        @Override // o.C10450wM2.d, o.C10450wM2.g
        public void j(int i) {
            BM2.a(this.c, i);
        }

        public e(WindowInsetsController windowInsetsController, C10450wM2 c10450wM2, H92 h92) {
            super(windowInsetsController, c10450wM2, h92);
        }
    }

    /* renamed from: o.wM2$f */
    /* loaded from: classes.dex */
    public static class f extends e {
        public f(Window window, C10450wM2 c10450wM2, H92 h92) {
            super(window, c10450wM2, h92);
        }

        @Override // o.C10450wM2.d, o.C10450wM2.g
        public boolean e() {
            if ((C10936yM2.a(this.c) & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // o.C10450wM2.d, o.C10450wM2.g
        public boolean f() {
            if ((C10936yM2.a(this.c) & 8) != 0) {
                return true;
            }
            return false;
        }

        public f(WindowInsetsController windowInsetsController, C10450wM2 c10450wM2, H92 h92) {
            super(windowInsetsController, c10450wM2, h92);
        }
    }

    /* renamed from: o.wM2$h */
    /* loaded from: classes.dex */
    public interface h {
        void a(C10450wM2 c10450wM2, int i);
    }

    @Deprecated
    public C10450wM2(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new f(windowInsetsController, this, new H92(windowInsetsController));
        } else {
            this.a = new d(windowInsetsController, this, new H92(windowInsetsController));
        }
    }

    @Deprecated
    public static C10450wM2 l(WindowInsetsController windowInsetsController) {
        return new C10450wM2(windowInsetsController);
    }

    public void a(h hVar) {
        this.a.a(hVar);
    }

    public void b(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, FL2 fl2) {
        this.a.b(i, j, interpolator, cancellationSignal, fl2);
    }

    public int c() {
        return this.a.c();
    }

    public void d(int i) {
        this.a.d(i);
    }

    public boolean e() {
        return this.a.e();
    }

    public boolean f() {
        return this.a.f();
    }

    public void g(h hVar) {
        this.a.g(hVar);
    }

    public void h(boolean z) {
        this.a.h(z);
    }

    public void i(boolean z) {
        this.a.i(z);
    }

    public void j(int i) {
        this.a.j(i);
    }

    public void k(int i) {
        this.a.k(i);
    }

    /* renamed from: o.wM2$d */
    /* loaded from: classes.dex */
    public static class d extends g {
        public final C10450wM2 b;
        public final WindowInsetsController c;
        public final H92 d;
        public final C9654t62<h, WindowInsetsController.OnControllableInsetsChangedListener> e;
        public Window f;

        /* renamed from: o.wM2$d$a */
        /* loaded from: classes.dex */
        public class a implements WindowInsetsAnimationControlListener {
            public QL2 a = null;
            public final /* synthetic */ FL2 b;

            public a(FL2 fl2) {
                this.b = fl2;
            }

            public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                QL2 ql2;
                FL2 fl2 = this.b;
                if (windowInsetsAnimationController == null) {
                    ql2 = null;
                } else {
                    ql2 = this.a;
                }
                fl2.a(ql2);
            }

            public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                this.b.b(this.a);
            }

            public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
                QL2 ql2 = new QL2(windowInsetsAnimationController);
                this.a = ql2;
                this.b.c(ql2, i);
            }
        }

        public d(Window window, C10450wM2 c10450wM2, H92 h92) {
            this(C11179zM2.a(window), c10450wM2, h92);
            this.f = window;
        }

        public static /* synthetic */ void l(d dVar, h hVar, WindowInsetsController windowInsetsController, int i) {
            if (dVar.c == windowInsetsController) {
                hVar.a(dVar.b, i);
            }
        }

        @Override // o.C10450wM2.g
        public void a(final h hVar) {
            if (this.e.containsKey(hVar)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: o.EM2
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
                    C10450wM2.d.l(C10450wM2.d.this, hVar, windowInsetsController, i);
                }
            };
            this.e.put(hVar, onControllableInsetsChangedListener);
            L92.a(this.c, onControllableInsetsChangedListener);
        }

        @Override // o.C10450wM2.g
        public void b(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, FL2 fl2) {
            AM2.a(this.c, i, j, interpolator, cancellationSignal, new a(fl2));
        }

        @Override // o.C10450wM2.g
        public int c() {
            Window window = this.f;
            if (window != null) {
                Object tag = window.getDecorView().getTag(g.a);
                if (tag != null) {
                    return ((Integer) tag).intValue();
                }
                return 1;
            }
            return DM2.a(this.c);
        }

        @Override // o.C10450wM2.g
        public void d(int i) {
            if ((i & 8) != 0) {
                this.d.a();
            }
            N92.a(this.c, i & (-9));
        }

        @Override // o.C10450wM2.g
        public boolean e() {
            C10693xM2.a(this.c, 0, 0);
            if ((C10936yM2.a(this.c) & 16) == 0) {
                return false;
            }
            return true;
        }

        @Override // o.C10450wM2.g
        public boolean f() {
            C10693xM2.a(this.c, 0, 0);
            if ((C10936yM2.a(this.c) & 8) == 0) {
                return false;
            }
            return true;
        }

        @Override // o.C10450wM2.g
        public void g(h hVar) {
            WindowInsetsController.OnControllableInsetsChangedListener a2 = CM2.a(this.e.remove(hVar));
            if (a2 != null) {
                M92.a(this.c, a2);
            }
        }

        @Override // o.C10450wM2.g
        public void h(boolean z) {
            if (z) {
                if (this.f != null) {
                    m(16);
                }
                C10693xM2.a(this.c, 16, 16);
                return;
            }
            if (this.f != null) {
                n(16);
            }
            C10693xM2.a(this.c, 0, 16);
        }

        @Override // o.C10450wM2.g
        public void i(boolean z) {
            if (z) {
                if (this.f != null) {
                    m(8192);
                }
                C10693xM2.a(this.c, 8, 8);
                return;
            }
            if (this.f != null) {
                n(8192);
            }
            C10693xM2.a(this.c, 0, 8);
        }

        @Override // o.C10450wM2.g
        public void j(int i) {
            Window window = this.f;
            if (window != null) {
                window.getDecorView().setTag(g.a, Integer.valueOf(i));
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return;
                        }
                        n(2048);
                        m(4096);
                        return;
                    }
                    n(4096);
                    m(2048);
                    return;
                }
                n(6144);
                return;
            }
            BM2.a(this.c, i);
        }

        @Override // o.C10450wM2.g
        public void k(int i) {
            if ((i & 8) != 0) {
                this.d.b();
            }
            K92.a(this.c, i & (-9));
        }

        public void m(int i) {
            View decorView = this.f.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void n(int i) {
            View decorView = this.f.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public d(WindowInsetsController windowInsetsController, C10450wM2 c10450wM2, H92 h92) {
            this.e = new C9654t62<>();
            this.c = windowInsetsController;
            this.b = c10450wM2;
            this.d = h92;
        }
    }

    public C10450wM2(Window window, View view) {
        H92 h92 = new H92(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new f(window, this, h92);
        } else if (i >= 30) {
            this.a = new d(window, this, h92);
        } else if (i >= 26) {
            this.a = new c(window, h92);
        } else {
            this.a = new b(window, h92);
        }
    }

    /* renamed from: o.wM2$a */
    /* loaded from: classes.dex */
    public static class a extends g {
        public final Window b;
        public final H92 c;

        public a(Window window, H92 h92) {
            this.b = window;
            this.c = h92;
        }

        @Override // o.C10450wM2.g
        public int c() {
            Object tag = this.b.getDecorView().getTag(g.a);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // o.C10450wM2.g
        public void d(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    l(i2);
                }
            }
        }

        @Override // o.C10450wM2.g
        public void j(int i) {
            this.b.getDecorView().setTag(g.a, Integer.valueOf(i));
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    p(2048);
                    m(4096);
                    return;
                }
                p(4096);
                m(2048);
                return;
            }
            p(6144);
        }

        @Override // o.C10450wM2.g
        public void k(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    o(i2);
                }
            }
        }

        public final void l(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 8) {
                        return;
                    }
                    this.c.a();
                    return;
                }
                m(2);
                return;
            }
            m(4);
        }

        public void m(int i) {
            View decorView = this.b.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void n(int i) {
            this.b.addFlags(i);
        }

        public final void o(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 8) {
                        return;
                    }
                    this.c.b();
                    return;
                }
                p(2);
                return;
            }
            p(4);
            q(1024);
        }

        public void p(int i) {
            View decorView = this.b.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public void q(int i) {
            this.b.clearFlags(i);
        }

        @Override // o.C10450wM2.g
        public void a(h hVar) {
        }

        @Override // o.C10450wM2.g
        public void g(h hVar) {
        }

        @Override // o.C10450wM2.g
        public void b(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, FL2 fl2) {
        }
    }

    /* renamed from: o.wM2$g */
    /* loaded from: classes.dex */
    public static class g {
        public static final int a = 356039078;

        public int c() {
            return 1;
        }

        public boolean e() {
            return false;
        }

        public boolean f() {
            return false;
        }

        public void a(h hVar) {
        }

        public void d(int i) {
        }

        public void g(h hVar) {
        }

        public void h(boolean z) {
        }

        public void i(boolean z) {
        }

        public void j(int i) {
        }

        public void k(int i) {
        }

        public void b(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, FL2 fl2) {
        }
    }
}
