package o;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import o.C5128ad0;
import o.C6126ek0;
import o.FE1;
import o.InterfaceC5877di1;
import o.Y30;
import o.ZV;

/* renamed from: o.Vc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4490Vc0 implements InterfaceC4684Xc0, InterfaceC5877di1.a, C5128ad0.a {
    public static final int j = 150;
    public final C7296jV0 a;
    public final C4888Zc0 b;
    public final InterfaceC5877di1 c;
    public final b d;
    public final C9259rT1 e;
    public final c f;
    public final a g;
    public final W4 h;
    public static final String i = "Engine";
    public static final boolean k = Log.isLoggable(i, 2);

    /* renamed from: o.Vc0$a */
    /* loaded from: classes.dex */
    public static class a {
        public final ZV.e a;
        public final FE1.a<ZV<?>> b = C6126ek0.e(150, new C0236a());
        public int c;

        /* renamed from: o.Vc0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0236a implements C6126ek0.d<ZV<?>> {
            public C0236a() {
            }

            @Override // o.C6126ek0.d
            /* renamed from: b */
            public ZV<?> a() {
                a aVar = a.this;
                return new ZV<>(aVar.a, aVar.b);
            }
        }

        public a(ZV.e eVar) {
            this.a = eVar;
        }

        public <R> ZV<R> a(com.bumptech.glide.c cVar, Object obj, C4781Yc0 c4781Yc0, InterfaceC6575gX0 interfaceC6575gX0, int i, int i2, Class<?> cls, Class<R> cls2, EnumC10672xH1 enumC10672xH1, AbstractC4994a40 abstractC4994a40, Map<Class<?>, InterfaceC5675cs2<?>> map, boolean z, boolean z2, boolean z3, C5448bw1 c5448bw1, ZV.b<R> bVar) {
            ZV zv = (ZV) C10175vF1.e(this.b.a());
            int i3 = this.c;
            this.c = i3 + 1;
            return zv.t(cVar, obj, c4781Yc0, interfaceC6575gX0, i, i2, cls, cls2, enumC10672xH1, abstractC4994a40, map, z, z2, z3, c5448bw1, bVar, i3);
        }
    }

    /* renamed from: o.Vc0$b */
    /* loaded from: classes.dex */
    public static class b {
        public final UD0 a;
        public final UD0 b;
        public final UD0 c;
        public final UD0 d;
        public final InterfaceC4684Xc0 e;
        public final C5128ad0.a f;
        public final FE1.a<C4587Wc0<?>> g = C6126ek0.e(150, new a());

        /* renamed from: o.Vc0$b$a */
        /* loaded from: classes.dex */
        public class a implements C6126ek0.d<C4587Wc0<?>> {
            public a() {
            }

            @Override // o.C6126ek0.d
            /* renamed from: b */
            public C4587Wc0<?> a() {
                b bVar = b.this;
                return new C4587Wc0<>(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g);
            }
        }

        public b(UD0 ud0, UD0 ud02, UD0 ud03, UD0 ud04, InterfaceC4684Xc0 interfaceC4684Xc0, C5128ad0.a aVar) {
            this.a = ud0;
            this.b = ud02;
            this.c = ud03;
            this.d = ud04;
            this.e = interfaceC4684Xc0;
            this.f = aVar;
        }

        public <R> C4587Wc0<R> a(InterfaceC6575gX0 interfaceC6575gX0, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C4587Wc0) C10175vF1.e(this.g.a())).l(interfaceC6575gX0, z, z2, z3, z4);
        }

        public void b() {
            C8325ng0.d(this.a);
            C8325ng0.d(this.b);
            C8325ng0.d(this.c);
            C8325ng0.d(this.d);
        }
    }

    /* renamed from: o.Vc0$c */
    /* loaded from: classes.dex */
    public static class c implements ZV.e {
        public final Y30.a a;
        public volatile Y30 b;

        public c(Y30.a aVar) {
            this.a = aVar;
        }

        @Override // o.ZV.e
        public Y30 a() {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            this.b = this.a.build();
                        }
                        if (this.b == null) {
                            this.b = new Z30();
                        }
                    } finally {
                    }
                }
            }
            return this.b;
        }

        public synchronized void b() {
            if (this.b == null) {
                return;
            }
            this.b.clear();
        }
    }

    /* renamed from: o.Vc0$d */
    /* loaded from: classes.dex */
    public class d {
        public final C4587Wc0<?> a;
        public final InterfaceC6806hT1 b;

        public d(InterfaceC6806hT1 interfaceC6806hT1, C4587Wc0<?> c4587Wc0) {
            this.b = interfaceC6806hT1;
            this.a = c4587Wc0;
        }

        public void a() {
            synchronized (C4490Vc0.this) {
                this.a.s(this.b);
            }
        }
    }

    public C4490Vc0(InterfaceC5877di1 interfaceC5877di1, Y30.a aVar, UD0 ud0, UD0 ud02, UD0 ud03, UD0 ud04, boolean z) {
        this(interfaceC5877di1, aVar, ud0, ud02, ud03, ud04, null, null, null, null, null, null, z);
    }

    public static void k(String str, long j2, InterfaceC6575gX0 interfaceC6575gX0) {
        Log.v(i, str + " in " + C5965e41.a(j2) + "ms, key: " + interfaceC6575gX0);
    }

    @Override // o.InterfaceC5877di1.a
    public void a(InterfaceC5580cT1<?> interfaceC5580cT1) {
        this.e.a(interfaceC5580cT1, true);
    }

    @Override // o.C5128ad0.a
    public void b(InterfaceC6575gX0 interfaceC6575gX0, C5128ad0<?> c5128ad0) {
        this.h.d(interfaceC6575gX0);
        if (c5128ad0.d()) {
            this.c.f(interfaceC6575gX0, c5128ad0);
        } else {
            this.e.a(c5128ad0, false);
        }
    }

    @Override // o.InterfaceC4684Xc0
    public synchronized void c(C4587Wc0<?> c4587Wc0, InterfaceC6575gX0 interfaceC6575gX0) {
        this.a.e(interfaceC6575gX0, c4587Wc0);
    }

    @Override // o.InterfaceC4684Xc0
    public synchronized void d(C4587Wc0<?> c4587Wc0, InterfaceC6575gX0 interfaceC6575gX0, C5128ad0<?> c5128ad0) {
        if (c5128ad0 != null) {
            try {
                if (c5128ad0.d()) {
                    this.h.a(interfaceC6575gX0, c5128ad0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.e(interfaceC6575gX0, c4587Wc0);
    }

    public void e() {
        this.f.a().clear();
    }

    public final C5128ad0<?> f(InterfaceC6575gX0 interfaceC6575gX0) {
        InterfaceC5580cT1<?> h = this.c.h(interfaceC6575gX0);
        if (h == null) {
            return null;
        }
        if (h instanceof C5128ad0) {
            return (C5128ad0) h;
        }
        return new C5128ad0<>(h, true, true, interfaceC6575gX0, this);
    }

    public <R> d g(com.bumptech.glide.c cVar, Object obj, InterfaceC6575gX0 interfaceC6575gX0, int i2, int i3, Class<?> cls, Class<R> cls2, EnumC10672xH1 enumC10672xH1, AbstractC4994a40 abstractC4994a40, Map<Class<?>, InterfaceC5675cs2<?>> map, boolean z, boolean z2, C5448bw1 c5448bw1, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC6806hT1 interfaceC6806hT1, Executor executor) {
        long b2 = k ? C5965e41.b() : 0L;
        C4781Yc0 a2 = this.b.a(obj, interfaceC6575gX0, i2, i3, map, cls, cls2, c5448bw1);
        synchronized (this) {
            try {
                C5128ad0<?> j2 = j(a2, z3, b2);
                if (j2 == null) {
                    return n(cVar, obj, interfaceC6575gX0, i2, i3, cls, cls2, enumC10672xH1, abstractC4994a40, map, z, z2, c5448bw1, z3, z4, z5, z6, interfaceC6806hT1, executor, a2, b2);
                }
                interfaceC6806hT1.b(j2, GU.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C5128ad0<?> h(InterfaceC6575gX0 interfaceC6575gX0) {
        C5128ad0<?> e = this.h.e(interfaceC6575gX0);
        if (e != null) {
            e.b();
        }
        return e;
    }

    public final C5128ad0<?> i(InterfaceC6575gX0 interfaceC6575gX0) {
        C5128ad0<?> f = f(interfaceC6575gX0);
        if (f != null) {
            f.b();
            this.h.a(interfaceC6575gX0, f);
        }
        return f;
    }

    public final C5128ad0<?> j(C4781Yc0 c4781Yc0, boolean z, long j2) {
        if (!z) {
            return null;
        }
        C5128ad0<?> h = h(c4781Yc0);
        if (h != null) {
            if (k) {
                k("Loaded resource from active resources", j2, c4781Yc0);
            }
            return h;
        }
        C5128ad0<?> i2 = i(c4781Yc0);
        if (i2 == null) {
            return null;
        }
        if (k) {
            k("Loaded resource from cache", j2, c4781Yc0);
        }
        return i2;
    }

    public void l(InterfaceC5580cT1<?> interfaceC5580cT1) {
        if (interfaceC5580cT1 instanceof C5128ad0) {
            ((C5128ad0) interfaceC5580cT1).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public void m() {
        this.d.b();
        this.f.b();
        this.h.h();
    }

    public final <R> d n(com.bumptech.glide.c cVar, Object obj, InterfaceC6575gX0 interfaceC6575gX0, int i2, int i3, Class<?> cls, Class<R> cls2, EnumC10672xH1 enumC10672xH1, AbstractC4994a40 abstractC4994a40, Map<Class<?>, InterfaceC5675cs2<?>> map, boolean z, boolean z2, C5448bw1 c5448bw1, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC6806hT1 interfaceC6806hT1, Executor executor, C4781Yc0 c4781Yc0, long j2) {
        C4587Wc0<?> a2 = this.a.a(c4781Yc0, z6);
        if (a2 != null) {
            a2.a(interfaceC6806hT1, executor);
            if (k) {
                k("Added to existing load", j2, c4781Yc0);
            }
            return new d(interfaceC6806hT1, a2);
        }
        C4587Wc0<R> a3 = this.d.a(c4781Yc0, z3, z4, z5, z6);
        ZV<R> a4 = this.g.a(cVar, obj, c4781Yc0, interfaceC6575gX0, i2, i3, cls, cls2, enumC10672xH1, abstractC4994a40, map, z, z2, z6, c5448bw1, a3);
        this.a.d(c4781Yc0, a3);
        a3.a(interfaceC6806hT1, executor);
        a3.t(a4);
        if (k) {
            k("Started new load", j2, c4781Yc0);
        }
        return new d(interfaceC6806hT1, a3);
    }

    public C4490Vc0(InterfaceC5877di1 interfaceC5877di1, Y30.a aVar, UD0 ud0, UD0 ud02, UD0 ud03, UD0 ud04, C7296jV0 c7296jV0, C4888Zc0 c4888Zc0, W4 w4, b bVar, a aVar2, C9259rT1 c9259rT1, boolean z) {
        this.c = interfaceC5877di1;
        c cVar = new c(aVar);
        this.f = cVar;
        W4 w42 = w4 == null ? new W4(z) : w4;
        this.h = w42;
        w42.g(this);
        this.b = c4888Zc0 == null ? new C4888Zc0() : c4888Zc0;
        this.a = c7296jV0 == null ? new C7296jV0() : c7296jV0;
        this.d = bVar == null ? new b(ud0, ud02, ud03, ud04, this, this) : bVar;
        this.g = aVar2 == null ? new a(cVar) : aVar2;
        this.e = c9259rT1 == null ? new C9259rT1() : c9259rT1;
        interfaceC5877di1.g(this);
    }
}
