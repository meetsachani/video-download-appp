package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import o.C4490Vc0;

/* renamed from: o.u82  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9905u82<R> implements InterfaceC5334bS1, U82, InterfaceC6806hT1 {
    public static final String F = "Glide";
    public int A;
    public int B;
    public boolean C;
    public RuntimeException D;
    public int a;
    public final String b;
    public final AbstractC2428Ac2 c;
    public final Object d;
    public final InterfaceC7529kS1<R> e;
    public final InterfaceC6304fS1 f;
    public final Context g;
    public final com.bumptech.glide.c h;
    public final Object i;
    public final Class<R> j;
    public final AbstractC2962Fl<?> k;
    public final int l;
    public final int m;
    public final EnumC10672xH1 n;

    /* renamed from: o  reason: collision with root package name */
    public final InterfaceC2856El2<R> f882o;
    public final List<InterfaceC7529kS1<R>> p;
    public final InterfaceC9109qt2<? super R> q;
    public final Executor r;
    public InterfaceC5580cT1<R> s;
    public C4490Vc0.d t;
    public long u;
    public volatile C4490Vc0 v;
    public a w;
    public Drawable x;
    public Drawable y;
    public Drawable z;
    public static final String E = "GlideRequest";
    public static final boolean G = Log.isLoggable(E, 2);

    /* renamed from: o.u82$a */
    /* loaded from: classes.dex */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public C9905u82(Context context, com.bumptech.glide.c cVar, Object obj, Object obj2, Class<R> cls, AbstractC2962Fl<?> abstractC2962Fl, int i, int i2, EnumC10672xH1 enumC10672xH1, InterfaceC2856El2<R> interfaceC2856El2, InterfaceC7529kS1<R> interfaceC7529kS1, List<InterfaceC7529kS1<R>> list, InterfaceC6304fS1 interfaceC6304fS1, C4490Vc0 c4490Vc0, InterfaceC9109qt2<? super R> interfaceC9109qt2, Executor executor) {
        this.b = G ? String.valueOf(super.hashCode()) : null;
        this.c = AbstractC2428Ac2.a();
        this.d = obj;
        this.g = context;
        this.h = cVar;
        this.i = obj2;
        this.j = cls;
        this.k = abstractC2962Fl;
        this.l = i;
        this.m = i2;
        this.n = enumC10672xH1;
        this.f882o = interfaceC2856El2;
        this.e = interfaceC7529kS1;
        this.p = list;
        this.f = interfaceC6304fS1;
        this.v = c4490Vc0;
        this.q = interfaceC9109qt2;
        this.r = executor;
        this.w = a.PENDING;
        if (this.D == null && cVar.g().b(b.d.class)) {
            this.D = new RuntimeException("Glide request origin trace");
        }
    }

    public static int v(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return i;
        }
        return Math.round(f * i);
    }

    public static <R> C9905u82<R> y(Context context, com.bumptech.glide.c cVar, Object obj, Object obj2, Class<R> cls, AbstractC2962Fl<?> abstractC2962Fl, int i, int i2, EnumC10672xH1 enumC10672xH1, InterfaceC2856El2<R> interfaceC2856El2, InterfaceC7529kS1<R> interfaceC7529kS1, List<InterfaceC7529kS1<R>> list, InterfaceC6304fS1 interfaceC6304fS1, C4490Vc0 c4490Vc0, InterfaceC9109qt2<? super R> interfaceC9109qt2, Executor executor) {
        return new C9905u82<>(context, cVar, obj, obj2, cls, abstractC2962Fl, i, i2, enumC10672xH1, interfaceC2856El2, interfaceC7529kS1, list, interfaceC6304fS1, c4490Vc0, interfaceC9109qt2, executor);
    }

    public final void A(InterfaceC5580cT1<R> interfaceC5580cT1, R r, GU gu, boolean z) {
        boolean z2;
        boolean z3;
        boolean s = s();
        this.w = a.COMPLETE;
        this.s = interfaceC5580cT1;
        if (this.h.h() <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + gu + " for " + this.i + " with size [" + this.A + "x" + this.B + "] in " + C5965e41.a(this.u) + " ms");
        }
        x();
        boolean z4 = true;
        this.C = true;
        try {
            List<InterfaceC7529kS1<R>> list = this.p;
            if (list != null) {
                z2 = false;
                for (InterfaceC7529kS1<R> interfaceC7529kS1 : list) {
                    R r2 = r;
                    GU gu2 = gu;
                    boolean a2 = interfaceC7529kS1.a(r2, this.i, this.f882o, gu2, s) | z2;
                    if (interfaceC7529kS1 instanceof AbstractC4805Yi0) {
                        z3 = z;
                        a2 |= ((AbstractC4805Yi0) interfaceC7529kS1).d(r2, this.i, this.f882o, gu2, s, z3);
                    } else {
                        z3 = z;
                    }
                    gu = gu2;
                    z = z3;
                    z2 = a2;
                    r = r2;
                }
            } else {
                z2 = false;
            }
            R r3 = r;
            GU gu3 = gu;
            InterfaceC7529kS1<R> interfaceC7529kS12 = this.e;
            if (interfaceC7529kS12 == null || !interfaceC7529kS12.a(r3, this.i, this.f882o, gu3, s)) {
                z4 = false;
            }
            if (!(z4 | z2)) {
                this.f882o.o(r3, this.q.a(gu3, s));
            }
            this.C = false;
            C5034aE0.g(E, this.a);
        } catch (Throwable th) {
            this.C = false;
            throw th;
        }
    }

    public final void B() {
        Drawable drawable;
        if (!l()) {
            return;
        }
        if (this.i == null) {
            drawable = q();
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = p();
        }
        if (drawable == null) {
            drawable = r();
        }
        this.f882o.m(drawable);
    }

    @Override // o.InterfaceC5334bS1
    public boolean a() {
        boolean z;
        synchronized (this.d) {
            if (this.w == a.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC6806hT1
    public void b(InterfaceC5580cT1<?> interfaceC5580cT1, GU gu, boolean z) {
        Object obj;
        String str;
        this.c.c();
        InterfaceC5580cT1<?> interfaceC5580cT12 = null;
        try {
            synchronized (this.d) {
                try {
                    this.t = null;
                    if (interfaceC5580cT1 == null) {
                        c(new TD0("Expected to receive a Resource<R> with an object of " + this.j + " inside, but instead got null."));
                        return;
                    }
                    Object obj2 = interfaceC5580cT1.get();
                    try {
                        if (obj2 != null && this.j.isAssignableFrom(obj2.getClass())) {
                            if (!m()) {
                                this.s = null;
                                this.w = a.COMPLETE;
                                C5034aE0.g(E, this.a);
                                this.v.l(interfaceC5580cT1);
                            }
                            A(interfaceC5580cT1, obj2, gu, z);
                            return;
                        }
                        this.s = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.j);
                        sb.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb.append(obj);
                        sb.append("{");
                        sb.append(obj2);
                        sb.append("} inside Resource{");
                        sb.append(interfaceC5580cT1);
                        sb.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb.append(str);
                        c(new TD0(sb.toString()));
                        this.v.l(interfaceC5580cT1);
                    } catch (Throwable th) {
                        interfaceC5580cT12 = interfaceC5580cT1;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC5580cT12 != null) {
                this.v.l(interfaceC5580cT12);
            }
            throw th3;
        }
    }

    @Override // o.InterfaceC6806hT1
    public void c(TD0 td0) {
        z(td0, 5);
    }

    @Override // o.InterfaceC5334bS1
    public void clear() {
        synchronized (this.d) {
            try {
                j();
                this.c.c();
                a aVar = this.w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                n();
                InterfaceC5580cT1<R> interfaceC5580cT1 = this.s;
                if (interfaceC5580cT1 != null) {
                    this.s = null;
                } else {
                    interfaceC5580cT1 = null;
                }
                if (k()) {
                    this.f882o.k(r());
                }
                C5034aE0.g(E, this.a);
                this.w = aVar2;
                if (interfaceC5580cT1 != null) {
                    this.v.l(interfaceC5580cT1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.U82
    public void d(int i, int i2) {
        EnumC10672xH1 enumC10672xH1;
        AbstractC4994a40 F2;
        Map<Class<?>, InterfaceC5675cs2<?>> V;
        boolean l0;
        boolean g0;
        C5448bw1 L;
        boolean d0;
        boolean X;
        boolean W;
        boolean K;
        Executor executor;
        C9905u82<R> c9905u82 = this;
        c9905u82.c.c();
        Object obj = c9905u82.d;
        synchronized (obj) {
            try {
                try {
                    boolean z = G;
                    if (z) {
                        c9905u82.u("Got onSizeReady in " + C5965e41.a(c9905u82.u));
                    }
                    if (c9905u82.w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        c9905u82.w = aVar;
                        float T = c9905u82.k.T();
                        c9905u82.A = v(i, T);
                        c9905u82.B = v(i2, T);
                        if (z) {
                            c9905u82.u("finished setup for calling load in " + C5965e41.a(c9905u82.u));
                        }
                        try {
                            C4490Vc0 c4490Vc0 = c9905u82.v;
                            com.bumptech.glide.c cVar = c9905u82.h;
                            try {
                                Object obj2 = c9905u82.i;
                                InterfaceC6575gX0 S = c9905u82.k.S();
                                try {
                                    int i3 = c9905u82.A;
                                    int i4 = c9905u82.B;
                                    Class<?> R = c9905u82.k.R();
                                    Class<R> cls = c9905u82.j;
                                    try {
                                        enumC10672xH1 = c9905u82.n;
                                        F2 = c9905u82.k.F();
                                        V = c9905u82.k.V();
                                        l0 = c9905u82.k.l0();
                                        g0 = c9905u82.k.g0();
                                        L = c9905u82.k.L();
                                        d0 = c9905u82.k.d0();
                                        X = c9905u82.k.X();
                                        W = c9905u82.k.W();
                                        K = c9905u82.k.K();
                                        executor = c9905u82.r;
                                        c9905u82 = obj;
                                    } catch (Throwable th) {
                                        th = th;
                                        c9905u82 = obj;
                                    }
                                    try {
                                        c9905u82.t = c4490Vc0.g(cVar, obj2, S, i3, i4, R, cls, enumC10672xH1, F2, V, l0, g0, L, d0, X, W, K, c9905u82, executor);
                                        if (c9905u82.w != aVar) {
                                            c9905u82.t = null;
                                        }
                                        if (z) {
                                            c9905u82.u("finished onSizeReady in " + C5965e41.a(c9905u82.u));
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c9905u82 = obj;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                c9905u82 = obj;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c9905u82 = obj;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    c9905u82 = obj;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    @Override // o.InterfaceC5334bS1
    public boolean e() {
        boolean z;
        synchronized (this.d) {
            if (this.w == a.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // o.InterfaceC6806hT1
    public Object f() {
        this.c.c();
        return this.d;
    }

    @Override // o.InterfaceC5334bS1
    public boolean g() {
        boolean z;
        synchronized (this.d) {
            if (this.w == a.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // o.InterfaceC5334bS1
    public boolean h(InterfaceC5334bS1 interfaceC5334bS1) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        AbstractC2962Fl<?> abstractC2962Fl;
        EnumC10672xH1 enumC10672xH1;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        AbstractC2962Fl<?> abstractC2962Fl2;
        EnumC10672xH1 enumC10672xH12;
        int i6;
        if (!(interfaceC5334bS1 instanceof C9905u82)) {
            return false;
        }
        synchronized (this.d) {
            try {
                i = this.l;
                i2 = this.m;
                obj = this.i;
                cls = this.j;
                abstractC2962Fl = this.k;
                enumC10672xH1 = this.n;
                List<InterfaceC7529kS1<R>> list = this.p;
                if (list != null) {
                    i3 = list.size();
                } else {
                    i3 = 0;
                }
            } finally {
            }
        }
        C9905u82 c9905u82 = (C9905u82) interfaceC5334bS1;
        synchronized (c9905u82.d) {
            try {
                i4 = c9905u82.l;
                i5 = c9905u82.m;
                obj2 = c9905u82.i;
                cls2 = c9905u82.j;
                abstractC2962Fl2 = c9905u82.k;
                enumC10672xH12 = c9905u82.n;
                List<InterfaceC7529kS1<R>> list2 = c9905u82.p;
                if (list2 != null) {
                    i6 = list2.size();
                } else {
                    i6 = 0;
                }
            } finally {
            }
        }
        if (i != i4 || i2 != i5 || !SD2.d(obj, obj2) || !cls.equals(cls2) || !SD2.c(abstractC2962Fl, abstractC2962Fl2) || enumC10672xH1 != enumC10672xH12 || i3 != i6) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC5334bS1
    public void i() {
        int i;
        synchronized (this.d) {
            try {
                j();
                this.c.c();
                this.u = C5965e41.b();
                Object obj = this.i;
                if (obj == null) {
                    if (SD2.x(this.l, this.m)) {
                        this.A = this.l;
                        this.B = this.m;
                    }
                    if (q() == null) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    z(new TD0("Received null model"), i);
                    return;
                }
                a aVar = this.w;
                a aVar2 = a.RUNNING;
                if (aVar != aVar2) {
                    if (aVar == a.COMPLETE) {
                        b(this.s, GU.MEMORY_CACHE, false);
                        return;
                    }
                    o(obj);
                    this.a = C5034aE0.b(E);
                    a aVar3 = a.WAITING_FOR_SIZE;
                    this.w = aVar3;
                    if (SD2.x(this.l, this.m)) {
                        d(this.l, this.m);
                    } else {
                        this.f882o.h(this);
                    }
                    a aVar4 = this.w;
                    if ((aVar4 == aVar2 || aVar4 == aVar3) && l()) {
                        this.f882o.i(r());
                    }
                    if (G) {
                        u("finished run method in " + C5965e41.a(this.u));
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot restart a running request");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC5334bS1
    public boolean isRunning() {
        boolean z;
        synchronized (this.d) {
            try {
                a aVar = this.w;
                if (aVar != a.RUNNING && aVar != a.WAITING_FOR_SIZE) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    public final void j() {
        if (!this.C) {
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final boolean k() {
        InterfaceC6304fS1 interfaceC6304fS1 = this.f;
        if (interfaceC6304fS1 != null && !interfaceC6304fS1.d(this)) {
            return false;
        }
        return true;
    }

    public final boolean l() {
        InterfaceC6304fS1 interfaceC6304fS1 = this.f;
        if (interfaceC6304fS1 != null && !interfaceC6304fS1.j(this)) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        InterfaceC6304fS1 interfaceC6304fS1 = this.f;
        if (interfaceC6304fS1 != null && !interfaceC6304fS1.c(this)) {
            return false;
        }
        return true;
    }

    public final void n() {
        j();
        this.c.c();
        this.f882o.e(this);
        C4490Vc0.d dVar = this.t;
        if (dVar != null) {
            dVar.a();
            this.t = null;
        }
    }

    public final void o(Object obj) {
        List<InterfaceC7529kS1<R>> list = this.p;
        if (list != null) {
            for (InterfaceC7529kS1<R> interfaceC7529kS1 : list) {
                if (interfaceC7529kS1 instanceof AbstractC4805Yi0) {
                    ((AbstractC4805Yi0) interfaceC7529kS1).c(obj);
                }
            }
        }
    }

    public final Drawable p() {
        if (this.x == null) {
            Drawable H = this.k.H();
            this.x = H;
            if (H == null && this.k.G() > 0) {
                this.x = t(this.k.G());
            }
        }
        return this.x;
    }

    @Override // o.InterfaceC5334bS1
    public void pause() {
        synchronized (this.d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Drawable q() {
        if (this.z == null) {
            Drawable I = this.k.I();
            this.z = I;
            if (I == null && this.k.J() > 0) {
                this.z = t(this.k.J());
            }
        }
        return this.z;
    }

    public final Drawable r() {
        if (this.y == null) {
            Drawable O = this.k.O();
            this.y = O;
            if (O == null && this.k.P() > 0) {
                this.y = t(this.k.P());
            }
        }
        return this.y;
    }

    public final boolean s() {
        InterfaceC6304fS1 interfaceC6304fS1 = this.f;
        if (interfaceC6304fS1 != null && interfaceC6304fS1.getRoot().a()) {
            return false;
        }
        return true;
    }

    public final Drawable t(int i) {
        Resources.Theme theme;
        if (this.k.U() != null) {
            theme = this.k.U();
        } else {
            theme = this.g.getTheme();
        }
        return H60.a(this.g, i, theme);
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.d) {
            obj = this.i;
            cls = this.j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + C6566gU0.g;
    }

    public final void u(String str) {
        Log.v(E, str + " this: " + this.b);
    }

    public final void w() {
        InterfaceC6304fS1 interfaceC6304fS1 = this.f;
        if (interfaceC6304fS1 != null) {
            interfaceC6304fS1.f(this);
        }
    }

    public final void x() {
        InterfaceC6304fS1 interfaceC6304fS1 = this.f;
        if (interfaceC6304fS1 != null) {
            interfaceC6304fS1.b(this);
        }
    }

    public final void z(TD0 td0, int i) {
        boolean z;
        this.c.c();
        synchronized (this.d) {
            try {
                td0.l(this.D);
                int h = this.h.h();
                if (h <= i) {
                    Log.w("Glide", "Load failed for [" + this.i + "] with dimensions [" + this.A + "x" + this.B + C6566gU0.g, td0);
                    if (h <= 4) {
                        td0.h("Glide");
                    }
                }
                this.t = null;
                this.w = a.FAILED;
                w();
                boolean z2 = true;
                this.C = true;
                List<InterfaceC7529kS1<R>> list = this.p;
                if (list != null) {
                    z = false;
                    for (InterfaceC7529kS1<R> interfaceC7529kS1 : list) {
                        z |= interfaceC7529kS1.b(td0, this.i, this.f882o, s());
                    }
                } else {
                    z = false;
                }
                InterfaceC7529kS1<R> interfaceC7529kS12 = this.e;
                if (interfaceC7529kS12 == null || !interfaceC7529kS12.b(td0, this.i, this.f882o, s())) {
                    z2 = false;
                }
                if (!(z | z2)) {
                    B();
                }
                this.C = false;
                C5034aE0.g(E, this.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
