package o;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.AbstractC6433g0;
import o.C3743Nk1;
import o.ConcurrentMapC6443g21;

@InterfaceC6086ea0
@InterfaceC10420wF0(emulated = true)
/* renamed from: o.bt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5434bt<K, V> {
    public static final int q = 16;
    public static final int r = 4;
    public static final int s = 0;
    public static final int t = 0;
    public static final InterfaceC8331nh2<? extends AbstractC6433g0.b> u = C8818ph2.d(new a());
    public static final C8620ot v = new C8620ot(0, 0, 0, 0, 0, 0);
    public static final InterfaceC8331nh2<AbstractC6433g0.b> w = new b();
    public static final AbstractC10799xo2 x = new c();
    public static final Logger y = Logger.getLogger(C5434bt.class.getName());
    public static final int z = -1;
    public FK2<? super K, ? super V> f;
    public ConcurrentMapC6443g21.t g;
    public ConcurrentMapC6443g21.t h;
    public AbstractC6843he0<Object> l;
    public AbstractC6843he0<Object> m;
    public InterfaceC8759pR1<? super K, ? super V> n;

    /* renamed from: o  reason: collision with root package name */
    public AbstractC10799xo2 f699o;
    public boolean a = true;
    public int b = -1;
    public int c = -1;
    public long d = -1;
    public long e = -1;
    public long i = -1;
    public long j = -1;
    public long k = -1;
    public InterfaceC8331nh2<? extends AbstractC6433g0.b> p = u;

    /* renamed from: o.bt$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC8331nh2<AbstractC6433g0.b> {
        @Override // o.InterfaceC8331nh2
        /* renamed from: a */
        public AbstractC6433g0.b get() {
            return new AbstractC6433g0.a();
        }
    }

    /* renamed from: o.bt$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC10799xo2 {
        @Override // o.AbstractC10799xo2
        public long a() {
            return 0L;
        }
    }

    /* renamed from: o.bt$e */
    /* loaded from: classes3.dex */
    public enum e implements FK2<Object, Object> {
        INSTANCE;

        @Override // o.FK2
        public int e(Object obj, Object obj2) {
            return 1;
        }
    }

    @QB
    public static C5434bt<Object, Object> D() {
        return new C5434bt<>();
    }

    @QB
    @InterfaceC11149zF0
    public static C5434bt<Object, Object> h(String str) {
        return i(C5676ct.e(str));
    }

    @QB
    @InterfaceC11149zF0
    public static C5434bt<Object, Object> i(C5676ct c5676ct) {
        return c5676ct.f().A();
    }

    @InterfaceC11149zF0
    public C5434bt<K, V> A() {
        this.a = false;
        return this;
    }

    public C5434bt<K, V> B(long j) {
        boolean z2;
        boolean z3;
        boolean z4;
        long j2 = this.d;
        boolean z5 = false;
        if (j2 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.s0(z2, "maximum size was already set to %s", j2);
        long j3 = this.e;
        if (j3 == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C10664xF1.s0(z3, "maximum weight was already set to %s", j3);
        if (this.f == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        C10664xF1.h0(z4, "maximum size can not be combined with weigher");
        if (j >= 0) {
            z5 = true;
        }
        C10664xF1.e(z5, "maximum size must not be negative");
        this.d = j;
        return this;
    }

    @InterfaceC11149zF0
    public C5434bt<K, V> C(long j) {
        boolean z2;
        boolean z3;
        long j2 = this.e;
        boolean z4 = false;
        if (j2 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.s0(z2, "maximum weight was already set to %s", j2);
        long j3 = this.d;
        if (j3 == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C10664xF1.s0(z3, "maximum size was already set to %s", j3);
        if (j >= 0) {
            z4 = true;
        }
        C10664xF1.e(z4, "maximum weight must not be negative");
        this.e = j;
        return this;
    }

    public C5434bt<K, V> E() {
        this.p = w;
        return this;
    }

    @InterfaceC11149zF0
    public C5434bt<K, V> F(long j, TimeUnit timeUnit) {
        boolean z2;
        C10664xF1.E(timeUnit);
        long j2 = this.k;
        boolean z3 = false;
        if (j2 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.s0(z2, "refresh was already set to %s ns", j2);
        if (j > 0) {
            z3 = true;
        }
        C10664xF1.t(z3, "duration must be positive: %s %s", j, timeUnit);
        this.k = timeUnit.toNanos(j);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @QB
    public <K1 extends K, V1 extends V> C5434bt<K1, V1> G(InterfaceC8759pR1<? super K1, ? super V1> interfaceC8759pR1) {
        boolean z2;
        if (this.n == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.g0(z2);
        this.n = (InterfaceC8759pR1) C10664xF1.E(interfaceC8759pR1);
        return this;
    }

    public C5434bt<K, V> H(ConcurrentMapC6443g21.t tVar) {
        boolean z2;
        ConcurrentMapC6443g21.t tVar2 = this.g;
        if (tVar2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.x0(z2, "Key strength was already set to %s", tVar2);
        this.g = (ConcurrentMapC6443g21.t) C10664xF1.E(tVar);
        return this;
    }

    public C5434bt<K, V> I(ConcurrentMapC6443g21.t tVar) {
        boolean z2;
        ConcurrentMapC6443g21.t tVar2 = this.h;
        if (tVar2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.x0(z2, "Value strength was already set to %s", tVar2);
        this.h = (ConcurrentMapC6443g21.t) C10664xF1.E(tVar);
        return this;
    }

    @InterfaceC11149zF0
    public C5434bt<K, V> J() {
        return I(ConcurrentMapC6443g21.t.Y);
    }

    public C5434bt<K, V> K(AbstractC10799xo2 abstractC10799xo2) {
        boolean z2;
        if (this.f699o == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.g0(z2);
        this.f699o = (AbstractC10799xo2) C10664xF1.E(abstractC10799xo2);
        return this;
    }

    @InterfaceC11149zF0
    public C5434bt<K, V> L(AbstractC6843he0<Object> abstractC6843he0) {
        boolean z2;
        AbstractC6843he0<Object> abstractC6843he02 = this.m;
        if (abstractC6843he02 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.x0(z2, "value equivalence was already set to %s", abstractC6843he02);
        this.m = (AbstractC6843he0) C10664xF1.E(abstractC6843he0);
        return this;
    }

    @InterfaceC11149zF0
    public C5434bt<K, V> M() {
        return H(ConcurrentMapC6443g21.t.Z);
    }

    @InterfaceC11149zF0
    public C5434bt<K, V> N() {
        return I(ConcurrentMapC6443g21.t.Z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC11149zF0
    public <K1 extends K, V1 extends V> C5434bt<K1, V1> O(FK2<? super K1, ? super V1> fk2) {
        boolean z2;
        boolean z3 = false;
        if (this.f == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.g0(z2);
        if (this.a) {
            long j = this.d;
            if (j == -1) {
                z3 = true;
            }
            C10664xF1.s0(z3, "weigher can not be combined with maximum size", j);
        }
        this.f = (FK2) C10664xF1.E(fk2);
        return this;
    }

    @QB
    public <K1 extends K, V1 extends V> InterfaceC4951Zs<K1, V1> a() {
        d();
        c();
        return new ConcurrentMapC6443g21.o(this);
    }

    @QB
    public <K1 extends K, V1 extends V> Y11<K1, V1> b(AbstractC8133mt<? super K1, V1> abstractC8133mt) {
        d();
        return new ConcurrentMapC6443g21.n(this, abstractC8133mt);
    }

    public final void c() {
        boolean z2;
        if (this.k == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.h0(z2, "refreshAfterWrite requires a LoadingCache");
    }

    public final void d() {
        boolean z2 = false;
        if (this.f == null) {
            if (this.e == -1) {
                z2 = true;
            }
            C10664xF1.h0(z2, "maximumWeight requires weigher");
        } else if (this.a) {
            if (this.e != -1) {
                z2 = true;
            }
            C10664xF1.h0(z2, "weigher requires maximumWeight");
        } else if (this.e == -1) {
            y.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public C5434bt<K, V> e(int i) {
        boolean z2;
        int i2 = this.c;
        boolean z3 = false;
        if (i2 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.n0(z2, "concurrency level was already set to %s", i2);
        if (i > 0) {
            z3 = true;
        }
        C10664xF1.d(z3);
        this.c = i;
        return this;
    }

    public C5434bt<K, V> f(long j, TimeUnit timeUnit) {
        boolean z2;
        long j2 = this.j;
        boolean z3 = false;
        if (j2 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.s0(z2, "expireAfterAccess was already set to %s ns", j2);
        if (j >= 0) {
            z3 = true;
        }
        C10664xF1.t(z3, "duration cannot be negative: %s %s", j, timeUnit);
        this.j = timeUnit.toNanos(j);
        return this;
    }

    public C5434bt<K, V> g(long j, TimeUnit timeUnit) {
        boolean z2;
        long j2 = this.i;
        boolean z3 = false;
        if (j2 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.s0(z2, "expireAfterWrite was already set to %s ns", j2);
        if (j >= 0) {
            z3 = true;
        }
        C10664xF1.t(z3, "duration cannot be negative: %s %s", j, timeUnit);
        this.i = timeUnit.toNanos(j);
        return this;
    }

    public int j() {
        int i = this.c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    public long k() {
        long j = this.j;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    public long l() {
        long j = this.i;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    public int m() {
        int i = this.b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    public AbstractC6843he0<Object> n() {
        return (AbstractC6843he0) C3743Nk1.a(this.l, o().g());
    }

    public ConcurrentMapC6443g21.t o() {
        return (ConcurrentMapC6443g21.t) C3743Nk1.a(this.g, ConcurrentMapC6443g21.t.X);
    }

    public long p() {
        if (this.i == 0 || this.j == 0) {
            return 0L;
        }
        if (this.f == null) {
            return this.d;
        }
        return this.e;
    }

    public long q() {
        long j = this.k;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    public <K1 extends K, V1 extends V> InterfaceC8759pR1<K1, V1> r() {
        return (InterfaceC8759pR1) C3743Nk1.a(this.n, d.INSTANCE);
    }

    public InterfaceC8331nh2<? extends AbstractC6433g0.b> s() {
        return this.p;
    }

    public AbstractC10799xo2 t(boolean z2) {
        AbstractC10799xo2 abstractC10799xo2 = this.f699o;
        if (abstractC10799xo2 != null) {
            return abstractC10799xo2;
        }
        if (z2) {
            return AbstractC10799xo2.b();
        }
        return x;
    }

    public String toString() {
        C3743Nk1.b c2 = C3743Nk1.c(this);
        int i = this.b;
        if (i != -1) {
            c2.d("initialCapacity", i);
        }
        int i2 = this.c;
        if (i2 != -1) {
            c2.d("concurrencyLevel", i2);
        }
        long j = this.d;
        if (j != -1) {
            c2.e("maximumSize", j);
        }
        long j2 = this.e;
        if (j2 != -1) {
            c2.e("maximumWeight", j2);
        }
        long j3 = this.i;
        if (j3 != -1) {
            StringBuilder sb = new StringBuilder(22);
            sb.append(j3);
            sb.append("ns");
            c2.f("expireAfterWrite", sb.toString());
        }
        long j4 = this.j;
        if (j4 != -1) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append(j4);
            sb2.append("ns");
            c2.f("expireAfterAccess", sb2.toString());
        }
        ConcurrentMapC6443g21.t tVar = this.g;
        if (tVar != null) {
            c2.f("keyStrength", C8077mf.g(tVar.toString()));
        }
        ConcurrentMapC6443g21.t tVar2 = this.h;
        if (tVar2 != null) {
            c2.f("valueStrength", C8077mf.g(tVar2.toString()));
        }
        if (this.l != null) {
            c2.s("keyEquivalence");
        }
        if (this.m != null) {
            c2.s("valueEquivalence");
        }
        if (this.n != null) {
            c2.s("removalListener");
        }
        return c2.toString();
    }

    public AbstractC6843he0<Object> u() {
        return (AbstractC6843he0) C3743Nk1.a(this.m, v().g());
    }

    public ConcurrentMapC6443g21.t v() {
        return (ConcurrentMapC6443g21.t) C3743Nk1.a(this.h, ConcurrentMapC6443g21.t.X);
    }

    public <K1 extends K, V1 extends V> FK2<K1, V1> w() {
        return (FK2) C3743Nk1.a(this.f, e.INSTANCE);
    }

    public C5434bt<K, V> x(int i) {
        boolean z2;
        int i2 = this.b;
        boolean z3 = false;
        if (i2 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.n0(z2, "initial capacity was already set to %s", i2);
        if (i >= 0) {
            z3 = true;
        }
        C10664xF1.d(z3);
        this.b = i;
        return this;
    }

    public boolean y() {
        if (this.p == w) {
            return true;
        }
        return false;
    }

    @InterfaceC11149zF0
    public C5434bt<K, V> z(AbstractC6843he0<Object> abstractC6843he0) {
        boolean z2;
        AbstractC6843he0<Object> abstractC6843he02 = this.l;
        if (abstractC6843he02 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.x0(z2, "key equivalence was already set to %s", abstractC6843he02);
        this.l = (AbstractC6843he0) C10664xF1.E(abstractC6843he0);
        return this;
    }

    /* renamed from: o.bt$a */
    /* loaded from: classes3.dex */
    public class a implements AbstractC6433g0.b {
        @Override // o.AbstractC6433g0.b
        public C8620ot f() {
            return C5434bt.v;
        }

        @Override // o.AbstractC6433g0.b
        public void c() {
        }

        @Override // o.AbstractC6433g0.b
        public void a(int i) {
        }

        @Override // o.AbstractC6433g0.b
        public void b(int i) {
        }

        @Override // o.AbstractC6433g0.b
        public void d(long j) {
        }

        @Override // o.AbstractC6433g0.b
        public void e(long j) {
        }
    }

    /* renamed from: o.bt$d */
    /* loaded from: classes3.dex */
    public enum d implements InterfaceC8759pR1<Object, Object> {
        INSTANCE;

        @Override // o.InterfaceC8759pR1
        public void e(C9737tR1<Object, Object> c9737tR1) {
        }
    }
}
