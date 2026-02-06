package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import o.HL1;
import o.RL2;

/* renamed from: o.pL2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8736pL2 {
    public static final boolean b = false;
    public static final String c = "WindowInsetsAnimCompat";
    public e a;

    /* renamed from: o.pL2$c */
    /* loaded from: classes.dex */
    public static class c extends e {
        public static final Interpolator f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        public static final Interpolator g = new C10061un0();
        public static final Interpolator h = new DecelerateInterpolator(1.5f);
        public static final Interpolator i = new AccelerateInterpolator(1.5f);

        /* renamed from: o.pL2$c$a */
        /* loaded from: classes.dex */
        public static class a implements View.OnApplyWindowInsetsListener {
            public static final int c = 160;
            public static final int d = 250;
            public final b a;
            public RL2 b;

            /* renamed from: o.pL2$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0317a implements ValueAnimator.AnimatorUpdateListener {
                public final /* synthetic */ C8736pL2 a;
                public final /* synthetic */ RL2 b;
                public final /* synthetic */ RL2 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ View e;

                public C0317a(C8736pL2 c8736pL2, RL2 rl2, RL2 rl22, int i, View view) {
                    this.a = c8736pL2;
                    this.b = rl2;
                    this.c = rl22;
                    this.d = i;
                    this.e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.i(valueAnimator.getAnimatedFraction());
                    c.o(this.e, c.s(this.b, this.c, this.a.d(), this.d), Collections.singletonList(this.a));
                }
            }

            /* renamed from: o.pL2$c$a$b */
            /* loaded from: classes.dex */
            public class b extends AnimatorListenerAdapter {
                public final /* synthetic */ C8736pL2 a;
                public final /* synthetic */ View b;

                public b(C8736pL2 c8736pL2, View view) {
                    this.a = c8736pL2;
                    this.b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.a.i(1.0f);
                    c.m(this.b, this.a);
                }
            }

            /* renamed from: o.pL2$c$a$c  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0318c implements Runnable {
                public final /* synthetic */ View X;
                public final /* synthetic */ C8736pL2 Y;
                public final /* synthetic */ ValueAnimator Y0;
                public final /* synthetic */ a Z;

                public RunnableC0318c(View view, C8736pL2 c8736pL2, a aVar, ValueAnimator valueAnimator) {
                    this.X = view;
                    this.Y = c8736pL2;
                    this.Z = aVar;
                    this.Y0 = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.p(this.X, this.Y, this.Z);
                    this.Y0.start();
                }
            }

            public a(View view, b bVar) {
                RL2 rl2;
                this.a = bVar;
                RL2 t0 = C6516gH2.t0(view);
                if (t0 != null) {
                    rl2 = new RL2.b(t0).a();
                } else {
                    rl2 = null;
                }
                this.b = rl2;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                long j;
                if (!view.isLaidOut()) {
                    this.b = RL2.M(windowInsets, view);
                    return c.q(view, windowInsets);
                }
                RL2 M = RL2.M(windowInsets, view);
                if (this.b == null) {
                    this.b = C6516gH2.t0(view);
                }
                if (this.b == null) {
                    this.b = M;
                    return c.q(view, windowInsets);
                }
                b r = c.r(view);
                if (r != null && Objects.equals(r.a, M)) {
                    return c.q(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                c.i(M, this.b, iArr, iArr2);
                int i = iArr[0];
                int i2 = iArr2[0];
                int i3 = i | i2;
                if (i3 == 0) {
                    this.b = M;
                    return c.q(view, windowInsets);
                }
                RL2 rl2 = this.b;
                Interpolator k = c.k(i, i2);
                if ((RL2.p.d() & i3) != 0) {
                    j = 160;
                } else {
                    j = 250;
                }
                C8736pL2 c8736pL2 = new C8736pL2(i3, k, j);
                c8736pL2.i(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c8736pL2.b());
                a j2 = c.j(M, rl2, i3);
                c.n(view, c8736pL2, M, false);
                duration.addUpdateListener(new C0317a(c8736pL2, M, rl2, i3, view));
                duration.addListener(new b(c8736pL2, view));
                ViewTreeObserver$OnPreDrawListenerC10826xv1.a(view, new RunnableC0318c(view, c8736pL2, j2, duration));
                this.b = M;
                return c.q(view, windowInsets);
            }
        }

        public c(int i2, Interpolator interpolator, long j) {
            super(i2, interpolator, j);
        }

        public static void i(RL2 rl2, RL2 rl22, int[] iArr, int[] iArr2) {
            boolean z;
            boolean z2;
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                C9246rQ0 f2 = rl2.f(i2);
                C9246rQ0 f3 = rl22.f(i2);
                int i3 = f2.a;
                int i4 = f3.a;
                if (i3 <= i4 && f2.b <= f3.b && f2.c <= f3.c && f2.d <= f3.d) {
                    z = false;
                } else {
                    z = true;
                }
                if (i3 >= i4 && f2.b >= f3.b && f2.c >= f3.c && f2.d >= f3.d) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z != z2) {
                    if (z) {
                        iArr[0] = iArr[0] | i2;
                    } else {
                        iArr2[0] = iArr2[0] | i2;
                    }
                }
            }
        }

        public static a j(RL2 rl2, RL2 rl22, int i2) {
            C9246rQ0 f2 = rl2.f(i2);
            C9246rQ0 f3 = rl22.f(i2);
            return new a(C9246rQ0.d(Math.min(f2.a, f3.a), Math.min(f2.b, f3.b), Math.min(f2.c, f3.c), Math.min(f2.d, f3.d)), C9246rQ0.d(Math.max(f2.a, f3.a), Math.max(f2.b, f3.b), Math.max(f2.c, f3.c), Math.max(f2.d, f3.d)));
        }

        public static Interpolator k(int i2, int i3) {
            if ((RL2.p.d() & i2) != 0) {
                return f;
            }
            if ((RL2.p.d() & i3) != 0) {
                return g;
            }
            if ((i2 & RL2.p.i()) != 0) {
                return h;
            }
            if ((RL2.p.i() & i3) != 0) {
                return i;
            }
            return null;
        }

        public static View.OnApplyWindowInsetsListener l(View view, b bVar) {
            return new a(view, bVar);
        }

        public static void m(View view, C8736pL2 c8736pL2) {
            b r = r(view);
            if (r != null) {
                r.b(c8736pL2);
                if (r.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    m(viewGroup.getChildAt(i2), c8736pL2);
                }
            }
        }

        public static void n(View view, C8736pL2 c8736pL2, RL2 rl2, boolean z) {
            b r = r(view);
            if (r != null) {
                r.a = rl2;
                if (!z) {
                    r.c(c8736pL2);
                    if (r.a() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    n(viewGroup.getChildAt(i2), c8736pL2, rl2, z);
                }
            }
        }

        public static void o(View view, RL2 rl2, List<C8736pL2> list) {
            b r = r(view);
            if (r != null) {
                rl2 = r.d(rl2, list);
                if (r.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    o(viewGroup.getChildAt(i2), rl2, list);
                }
            }
        }

        public static void p(View view, C8736pL2 c8736pL2, a aVar) {
            b r = r(view);
            if (r != null) {
                r.e(c8736pL2, aVar);
                if (r.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    p(viewGroup.getChildAt(i2), c8736pL2, aVar);
                }
            }
        }

        public static WindowInsets q(View view, WindowInsets windowInsets) {
            if (view.getTag(HL1.e.k0) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        public static b r(View view) {
            Object tag = view.getTag(HL1.e.t0);
            if (tag instanceof a) {
                return ((a) tag).a;
            }
            return null;
        }

        public static RL2 s(RL2 rl2, RL2 rl22, float f2, int i2) {
            RL2.b bVar = new RL2.b(rl2);
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i2 & i3) == 0) {
                    bVar.c(i3, rl2.f(i3));
                } else {
                    C9246rQ0 f3 = rl2.f(i3);
                    C9246rQ0 f4 = rl22.f(i3);
                    float f5 = 1.0f - f2;
                    bVar.c(i3, RL2.z(f3, (int) (((f3.a - f4.a) * f5) + 0.5d), (int) (((f3.b - f4.b) * f5) + 0.5d), (int) (((f3.c - f4.c) * f5) + 0.5d), (int) (((f3.d - f4.d) * f5) + 0.5d)));
                }
            }
            return bVar.a();
        }

        public static void t(View view, b bVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
            if (bVar != null) {
                onApplyWindowInsetsListener = l(view, bVar);
            } else {
                onApplyWindowInsetsListener = null;
            }
            view.setTag(HL1.e.t0, onApplyWindowInsetsListener);
            if (view.getTag(HL1.e.tag_compat_insets_dispatch) == null && view.getTag(HL1.e.k0) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
            }
        }
    }

    /* renamed from: o.pL2$e */
    /* loaded from: classes.dex */
    public static class e {
        public final int a;
        public float b;
        public final Interpolator c;
        public final long d;
        public float e = 1.0f;

        public e(int i, Interpolator interpolator, long j) {
            this.a = i;
            this.c = interpolator;
            this.d = j;
        }

        public float a() {
            return this.e;
        }

        public long b() {
            return this.d;
        }

        public float c() {
            return this.b;
        }

        public float d() {
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.b);
            }
            return this.b;
        }

        public Interpolator e() {
            return this.c;
        }

        public int f() {
            return this.a;
        }

        public void g(float f) {
            this.e = f;
        }

        public void h(float f) {
            this.b = f;
        }
    }

    public C8736pL2(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(i, interpolator, j);
        } else {
            this.a = new c(i, interpolator, j);
        }
    }

    public static void h(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.l(view, bVar);
        } else {
            c.t(view, bVar);
        }
    }

    public static C8736pL2 j(WindowInsetsAnimation windowInsetsAnimation) {
        return new C8736pL2(windowInsetsAnimation);
    }

    public float a() {
        return this.a.a();
    }

    public long b() {
        return this.a.b();
    }

    public float c() {
        return this.a.c();
    }

    public float d() {
        return this.a.d();
    }

    public Interpolator e() {
        return this.a.e();
    }

    public int f() {
        return this.a.f();
    }

    public void g(float f) {
        this.a.g(f);
    }

    public void i(float f) {
        this.a.h(f);
    }

    /* renamed from: o.pL2$d */
    /* loaded from: classes.dex */
    public static class d extends e {
        public final WindowInsetsAnimation f;

        /* renamed from: o.pL2$d$a */
        /* loaded from: classes.dex */
        public static class a extends WindowInsetsAnimation$Callback {
            public final b a;
            public List<C8736pL2> b;
            public ArrayList<C8736pL2> c;
            public final HashMap<WindowInsetsAnimation, C8736pL2> d;

            public a(b bVar) {
                super(bVar.a());
                this.d = new HashMap<>();
                this.a = bVar;
            }

            public final C8736pL2 a(WindowInsetsAnimation windowInsetsAnimation) {
                C8736pL2 c8736pL2 = this.d.get(windowInsetsAnimation);
                if (c8736pL2 == null) {
                    C8736pL2 j = C8736pL2.j(windowInsetsAnimation);
                    this.d.put(windowInsetsAnimation, j);
                    return j;
                }
                return c8736pL2;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.b(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.c(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<C8736pL2> arrayList = this.c;
                if (arrayList == null) {
                    ArrayList<C8736pL2> arrayList2 = new ArrayList<>(list.size());
                    this.c = arrayList2;
                    this.b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a = EL2.a(list.get(size));
                    C8736pL2 a2 = a(a);
                    a2.i(C11175zL2.a(a));
                    this.c.add(a2);
                }
                return this.a.d(RL2.L(windowInsets), this.b).K();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.a.e(a(windowInsetsAnimation), a.e(bounds)).d();
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds i(a aVar) {
            C9957uL2.a();
            return C9714tL2.a(aVar.a().h(), aVar.b().h());
        }

        public static C9246rQ0 j(WindowInsetsAnimation.Bounds bounds) {
            return C9246rQ0.g(BL2.a(bounds));
        }

        public static C9246rQ0 k(WindowInsetsAnimation.Bounds bounds) {
            return C9246rQ0.g(CL2.a(bounds));
        }

        public static void l(View view, b bVar) {
            a aVar;
            if (bVar != null) {
                aVar = new a(bVar);
            } else {
                aVar = null;
            }
            C9228rL2.a(view, aVar);
        }

        @Override // o.C8736pL2.e
        public float a() {
            return C10446wL2.a(this.f);
        }

        @Override // o.C8736pL2.e
        public long b() {
            return C8979qL2.a(this.f);
        }

        @Override // o.C8736pL2.e
        public float c() {
            return C11175zL2.a(this.f);
        }

        @Override // o.C8736pL2.e
        public float d() {
            return AL2.a(this.f);
        }

        @Override // o.C8736pL2.e
        public Interpolator e() {
            return C10689xL2.a(this.f);
        }

        @Override // o.C8736pL2.e
        public int f() {
            return C10200vL2.a(this.f);
        }

        @Override // o.C8736pL2.e
        public void g(float f) {
            DL2.a(this.f, f);
        }

        @Override // o.C8736pL2.e
        public void h(float f) {
            C10932yL2.a(this.f, f);
        }

        public d(int i, Interpolator interpolator, long j) {
            this(C9471sL2.a(i, interpolator, j));
        }
    }

    /* renamed from: o.pL2$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final C9246rQ0 a;
        public final C9246rQ0 b;

        public a(C9246rQ0 c9246rQ0, C9246rQ0 c9246rQ02) {
            this.a = c9246rQ0;
            this.b = c9246rQ02;
        }

        public static a e(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public C9246rQ0 a() {
            return this.a;
        }

        public C9246rQ0 b() {
            return this.b;
        }

        public a c(C9246rQ0 c9246rQ0) {
            return new a(RL2.z(this.a, c9246rQ0.a, c9246rQ0.b, c9246rQ0.c, c9246rQ0.d), RL2.z(this.b, c9246rQ0.a, c9246rQ0.b, c9246rQ0.c, c9246rQ0.d));
        }

        public WindowInsetsAnimation.Bounds d() {
            return d.i(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.a = d.k(bounds);
            this.b = d.j(bounds);
        }
    }

    public C8736pL2(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(windowInsetsAnimation);
        }
    }

    /* renamed from: o.pL2$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public static final int c = 0;
        public static final int d = 1;
        public RL2 a;
        public final int b;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: o.pL2$b$a */
        /* loaded from: classes.dex */
        public @interface a {
        }

        public b(int i) {
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public abstract RL2 d(RL2 rl2, List<C8736pL2> list);

        public void b(C8736pL2 c8736pL2) {
        }

        public void c(C8736pL2 c8736pL2) {
        }

        public a e(C8736pL2 c8736pL2, a aVar) {
            return aVar;
        }
    }
}
