package o;

import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.bumptech.glide.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import o.C5103aW;
import o.C6126ek0;
import o.FE1;
import o.InterfaceC10233vU;
import o.JQ1;

/* loaded from: classes.dex */
public class ZV<R> implements InterfaceC10233vU.a, Runnable, Comparable<ZV<?>>, C6126ek0.f {
    public static final String D1 = "DecodeJob";
    public static final C4274Sv1<Supplier<Integer>> E1 = C4274Sv1.f("glide_thread_priority_override");
    public volatile boolean A1;
    public volatile boolean B1;
    public boolean C1;
    public final e Y0;
    public final FE1.a<ZV<?>> Z0;
    public com.bumptech.glide.c c1;
    public InterfaceC6575gX0 d1;
    public EnumC10672xH1 e1;
    public C4781Yc0 f1;
    public int g1;
    public int h1;
    public AbstractC4994a40 i1;
    public C5448bw1 j1;
    public b<R> k1;
    public int l1;
    public h m1;
    public g n1;
    public long o1;
    public boolean p1;
    public Object q1;
    public com.bumptech.glide.d r1;
    public Supplier<Integer> s1;
    public Thread t1;
    public InterfaceC6575gX0 u1;
    public InterfaceC6575gX0 v1;
    public Object w1;
    public GU x1;
    public InterfaceC9990uU<?> y1;
    public volatile InterfaceC10233vU z1;
    public final WV<R> X = new WV<>();
    public final List<Throwable> Y = new ArrayList();
    public final AbstractC2428Ac2 Z = AbstractC2428Ac2.a();
    public final d<?> a1 = new d<>();
    public final f b1 = new f();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[EnumC9770tb0.values().length];
            c = iArr;
            try {
                iArr[EnumC9770tb0.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[EnumC9770tb0.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h.values().length];
            b = iArr2;
            try {
                iArr2[h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b<R> {
        void b(InterfaceC5580cT1<R> interfaceC5580cT1, GU gu, boolean z);

        void c(TD0 td0);

        void d(ZV<?> zv);
    }

    /* loaded from: classes.dex */
    public final class c<Z> implements C5103aW.a<Z> {
        public final GU a;

        public c(GU gu) {
            this.a = gu;
        }

        @Override // o.C5103aW.a
        public InterfaceC5580cT1<Z> a(InterfaceC5580cT1<Z> interfaceC5580cT1) {
            return ZV.this.B(this.a, interfaceC5580cT1);
        }
    }

    /* loaded from: classes.dex */
    public static class d<Z> {
        public InterfaceC6575gX0 a;
        public InterfaceC8037mT1<Z> b;
        public C10859y31<Z> c;

        public void a() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public void b(e eVar, C5448bw1 c5448bw1) {
            C5034aE0.a("DecodeJob.encode");
            try {
                eVar.a().a(this.a, new C9261rU(this.b, this.c, c5448bw1));
            } finally {
                this.c.f();
                C5034aE0.f();
            }
        }

        public boolean c() {
            if (this.c != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <X> void d(InterfaceC6575gX0 interfaceC6575gX0, InterfaceC8037mT1<X> interfaceC8037mT1, C10859y31<X> c10859y31) {
            this.a = interfaceC6575gX0;
            this.b = interfaceC8037mT1;
            this.c = c10859y31;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        Y30 a();
    }

    /* loaded from: classes.dex */
    public static class f {
        public boolean a;
        public boolean b;
        public boolean c;

        public final boolean a(boolean z) {
            if ((this.c || z || this.b) && this.a) {
                return true;
            }
            return false;
        }

        public synchronized boolean b() {
            this.b = true;
            return a(false);
        }

        public synchronized boolean c() {
            this.c = true;
            return a(false);
        }

        public synchronized boolean d(boolean z) {
            this.a = true;
            return a(z);
        }

        public synchronized void e() {
            this.b = false;
            this.a = false;
            this.c = false;
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* loaded from: classes.dex */
    public enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public ZV(e eVar, FE1.a<ZV<?>> aVar) {
        this.Y0 = eVar;
        this.Z0 = aVar;
    }

    public final void A() {
        if (this.b1.c()) {
            D();
        }
    }

    public <Z> InterfaceC5580cT1<Z> B(GU gu, InterfaceC5580cT1<Z> interfaceC5580cT1) {
        InterfaceC5580cT1<Z> interfaceC5580cT12;
        InterfaceC5675cs2<Z> interfaceC5675cs2;
        EnumC9770tb0 enumC9770tb0;
        InterfaceC6575gX0 c9012qU;
        Class<?> cls = interfaceC5580cT1.get().getClass();
        InterfaceC8037mT1<Z> interfaceC8037mT1 = null;
        if (gu != GU.RESOURCE_DISK_CACHE) {
            InterfaceC5675cs2<Z> s = this.X.s(cls);
            interfaceC5675cs2 = s;
            interfaceC5580cT12 = s.a(this.c1, interfaceC5580cT1, this.g1, this.h1);
        } else {
            interfaceC5580cT12 = interfaceC5580cT1;
            interfaceC5675cs2 = null;
        }
        if (!interfaceC5580cT1.equals(interfaceC5580cT12)) {
            interfaceC5580cT1.a();
        }
        if (this.X.w(interfaceC5580cT12)) {
            interfaceC8037mT1 = this.X.n(interfaceC5580cT12);
            enumC9770tb0 = interfaceC8037mT1.a(this.j1);
        } else {
            enumC9770tb0 = EnumC9770tb0.NONE;
        }
        InterfaceC8037mT1 interfaceC8037mT12 = interfaceC8037mT1;
        if (this.i1.d(!this.X.y(this.u1), gu, enumC9770tb0)) {
            if (interfaceC8037mT12 != null) {
                int i = a.c[enumC9770tb0.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        c9012qU = new C6563gT1(this.X.b(), this.u1, this.d1, this.g1, this.h1, interfaceC5675cs2, cls, this.j1);
                    } else {
                        throw new IllegalArgumentException("Unknown strategy: " + enumC9770tb0);
                    }
                } else {
                    c9012qU = new C9012qU(this.u1, this.d1);
                }
                C10859y31 c2 = C10859y31.c(interfaceC5580cT12);
                this.a1.d(c9012qU, interfaceC8037mT12, c2);
                return c2;
            }
            throw new JQ1.d(interfaceC5580cT12.get().getClass());
        }
        return interfaceC5580cT12;
    }

    public void C(boolean z) {
        if (this.b1.d(z)) {
            D();
        }
    }

    public final void D() {
        this.b1.e();
        this.a1.a();
        this.X.a();
        this.A1 = false;
        this.c1 = null;
        this.d1 = null;
        this.j1 = null;
        this.e1 = null;
        this.f1 = null;
        this.k1 = null;
        this.m1 = null;
        this.z1 = null;
        this.t1 = null;
        this.u1 = null;
        this.w1 = null;
        this.x1 = null;
        this.y1 = null;
        this.o1 = 0L;
        this.B1 = false;
        this.q1 = null;
        this.Y.clear();
        this.Z0.b(this);
    }

    public final void E(g gVar) {
        this.n1 = gVar;
        this.k1.d(this);
    }

    public final void F() {
        if (this.r1.b(b.f.class)) {
            Supplier<Integer> supplier = this.s1;
            if (supplier != null && supplier.get() != null) {
                try {
                    Process.setThreadPriority(Process.myTid(), 9);
                    return;
                } catch (IllegalArgumentException | SecurityException e2) {
                    this.s1 = null;
                    if (Log.isLoggable(D1, 2)) {
                        Log.v(D1, "Failed to set thread priority; using default priority for any subsequent jobs.", e2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
    }

    public final void G() {
        this.t1 = Thread.currentThread();
        this.o1 = C5965e41.b();
        boolean z = false;
        while (!this.B1 && this.z1 != null && !(z = this.z1.a())) {
            this.m1 = q(this.m1);
            this.z1 = p();
            if (this.m1 == h.SOURCE) {
                E(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.m1 == h.FINISHED || this.B1) && !z) {
            y();
        }
    }

    public final <Data, ResourceType> InterfaceC5580cT1<R> H(Data data, GU gu, O11<Data, ResourceType, R> o11) throws TD0 {
        C5448bw1 r = r(gu);
        com.bumptech.glide.load.data.a<Data> l = this.c1.i().l(data);
        try {
            return o11.b(l, r, this.g1, this.h1, new c(gu));
        } finally {
            l.b();
        }
    }

    public final void I() {
        int i = a.a[this.n1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    o();
                    return;
                }
                throw new IllegalStateException("Unrecognized run reason: " + this.n1);
            }
            G();
            return;
        }
        this.m1 = q(h.INITIALIZE);
        this.z1 = p();
        G();
    }

    public final void J() {
        Throwable th;
        this.Z.c();
        if (this.A1) {
            if (this.Y.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.Y;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.A1 = true;
    }

    public boolean K() {
        h q = q(h.INITIALIZE);
        if (q != h.RESOURCE_CACHE && q != h.DATA_CACHE) {
            return false;
        }
        return true;
    }

    @Override // o.C6126ek0.f
    public AbstractC2428Ac2 e() {
        return this.Z;
    }

    @Override // o.InterfaceC10233vU.a
    public void g(InterfaceC6575gX0 interfaceC6575gX0, Exception exc, InterfaceC9990uU<?> interfaceC9990uU, GU gu) {
        interfaceC9990uU.b();
        TD0 td0 = new TD0("Fetching data failed", exc);
        td0.k(interfaceC6575gX0, gu, interfaceC9990uU.a());
        this.Y.add(td0);
        if (Thread.currentThread() != this.t1) {
            E(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            G();
        }
    }

    @Override // o.InterfaceC10233vU.a
    public void h(InterfaceC6575gX0 interfaceC6575gX0, Object obj, InterfaceC9990uU<?> interfaceC9990uU, GU gu, InterfaceC6575gX0 interfaceC6575gX02) {
        this.u1 = interfaceC6575gX0;
        this.w1 = obj;
        this.y1 = interfaceC9990uU;
        this.x1 = gu;
        this.v1 = interfaceC6575gX02;
        boolean z = false;
        if (interfaceC6575gX0 != this.X.c().get(0)) {
            z = true;
        }
        this.C1 = z;
        if (Thread.currentThread() != this.t1) {
            E(g.DECODE_DATA);
            return;
        }
        C5034aE0.a("DecodeJob.decodeFromRetrievedData");
        try {
            o();
        } finally {
            C5034aE0.f();
        }
    }

    @Override // o.InterfaceC10233vU.a
    public void i() {
        E(g.SWITCH_TO_SOURCE_SERVICE);
    }

    public void j() {
        this.B1 = true;
        InterfaceC10233vU interfaceC10233vU = this.z1;
        if (interfaceC10233vU != null) {
            interfaceC10233vU.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: l */
    public int compareTo(ZV<?> zv) {
        int s = s() - zv.s();
        if (s == 0) {
            return this.l1 - zv.l1;
        }
        return s;
    }

    public final <Data> InterfaceC5580cT1<R> m(InterfaceC9990uU<?> interfaceC9990uU, Data data, GU gu) throws TD0 {
        if (data == null) {
            interfaceC9990uU.b();
            return null;
        }
        try {
            long b2 = C5965e41.b();
            InterfaceC5580cT1<R> n = n(data, gu);
            if (Log.isLoggable(D1, 2)) {
                u("Decoded result " + n, b2);
            }
            return n;
        } finally {
            interfaceC9990uU.b();
        }
    }

    public final <Data> InterfaceC5580cT1<R> n(Data data, GU gu) throws TD0 {
        return H(data, gu, (O11<Data, ?, R>) this.X.h(data.getClass()));
    }

    public final void o() {
        Supplier<Integer> supplier;
        if (Log.isLoggable(D1, 2)) {
            long j = this.o1;
            v("Retrieved data", j, "data: " + this.w1 + ", cache key: " + this.u1 + ", fetcher: " + this.y1);
        }
        InterfaceC5580cT1<R> interfaceC5580cT1 = null;
        if (this.r1.b(b.f.class) && (supplier = this.s1) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), this.s1.get().intValue());
            } catch (IllegalArgumentException | SecurityException e2) {
                this.s1 = null;
                if (Log.isLoggable(D1, 2)) {
                    Log.v(D1, "Failed to set thread priority; using default priority for any subsequent jobs.", e2);
                }
            }
        }
        try {
            interfaceC5580cT1 = m(this.y1, this.w1, this.x1);
        } catch (TD0 e3) {
            e3.j(this.v1, this.x1);
            this.Y.add(e3);
        }
        if (interfaceC5580cT1 != null) {
            x(interfaceC5580cT1, this.x1, this.C1);
        } else {
            G();
        }
    }

    public final InterfaceC10233vU p() {
        int i = a.b[this.m1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: " + this.m1);
                }
                return new C8547oa2(this.X, this);
            }
            return new C8769pU(this.X, this);
        }
        return new C6308fT1(this.X, this);
    }

    public final h q(h hVar) {
        int i = a.b[hVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    if (i == 5) {
                        if (this.i1.b()) {
                            return h.RESOURCE_CACHE;
                        }
                        return q(h.RESOURCE_CACHE);
                    }
                    throw new IllegalArgumentException("Unrecognized stage: " + hVar);
                }
                return h.FINISHED;
            } else if (this.p1) {
                return h.FINISHED;
            } else {
                return h.SOURCE;
            }
        } else if (this.i1.a()) {
            return h.DATA_CACHE;
        } else {
            return q(h.DATA_CACHE);
        }
    }

    public final C5448bw1 r(GU gu) {
        boolean z;
        C5448bw1 c5448bw1 = this.j1;
        if (Build.VERSION.SDK_INT < 26) {
            return c5448bw1;
        }
        if (gu != GU.RESOURCE_DISK_CACHE && !this.X.x()) {
            z = false;
        } else {
            z = true;
        }
        C4274Sv1<Boolean> c4274Sv1 = C10138v60.k;
        Boolean bool = (Boolean) c5448bw1.c(c4274Sv1);
        if (bool != null && (!bool.booleanValue() || z)) {
            return c5448bw1;
        }
        C5448bw1 c5448bw12 = new C5448bw1();
        c5448bw12.d(this.j1);
        c5448bw12.f(c4274Sv1, Boolean.valueOf(z));
        return c5448bw12;
    }

    @Override // java.lang.Runnable
    public void run() {
        C5034aE0.d("DecodeJob#run(reason=%s, model=%s)", this.n1, this.q1);
        InterfaceC9990uU<?> interfaceC9990uU = this.y1;
        try {
            try {
                if (this.B1) {
                    y();
                    if (interfaceC9990uU != null) {
                        interfaceC9990uU.b();
                    }
                    C5034aE0.f();
                    return;
                }
                I();
                if (interfaceC9990uU != null) {
                    interfaceC9990uU.b();
                }
                C5034aE0.f();
            } catch (C3484Kt e2) {
                throw e2;
            }
        }
    }

    public final int s() {
        return this.e1.ordinal();
    }

    public ZV<R> t(com.bumptech.glide.c cVar, Object obj, C4781Yc0 c4781Yc0, InterfaceC6575gX0 interfaceC6575gX0, int i, int i2, Class<?> cls, Class<R> cls2, EnumC10672xH1 enumC10672xH1, AbstractC4994a40 abstractC4994a40, Map<Class<?>, InterfaceC5675cs2<?>> map, boolean z, boolean z2, boolean z3, C5448bw1 c5448bw1, b<R> bVar, int i3) {
        this.X.v(cVar, obj, interfaceC6575gX0, i, i2, abstractC4994a40, cls, cls2, enumC10672xH1, c5448bw1, map, z, z2, this.Y0);
        this.c1 = cVar;
        this.d1 = interfaceC6575gX0;
        this.e1 = enumC10672xH1;
        this.f1 = c4781Yc0;
        this.g1 = i;
        this.h1 = i2;
        this.i1 = abstractC4994a40;
        this.p1 = z3;
        this.j1 = c5448bw1;
        this.k1 = bVar;
        this.l1 = i3;
        this.n1 = g.INITIALIZE;
        this.q1 = obj;
        this.r1 = cVar.g();
        this.s1 = (Supplier) c5448bw1.c(E1);
        return this;
    }

    public final void u(String str, long j) {
        v(str, j, null);
    }

    public final void v(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C5965e41.a(j));
        sb.append(", load key: ");
        sb.append(this.f1);
        if (str2 != null) {
            str3 = C6566gU0.h + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v(D1, sb.toString());
    }

    public final void w(InterfaceC5580cT1<R> interfaceC5580cT1, GU gu, boolean z) {
        if (this.r1.b(b.f.class)) {
            F();
        }
        J();
        this.k1.b(interfaceC5580cT1, gu, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(InterfaceC5580cT1<R> interfaceC5580cT1, GU gu, boolean z) {
        C10859y31 c10859y31;
        C5034aE0.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (interfaceC5580cT1 instanceof DP0) {
                ((DP0) interfaceC5580cT1).initialize();
            }
            if (this.a1.c()) {
                interfaceC5580cT1 = C10859y31.c(interfaceC5580cT1);
                c10859y31 = interfaceC5580cT1;
            } else {
                c10859y31 = 0;
            }
            w(interfaceC5580cT1, gu, z);
            this.m1 = h.ENCODE;
            if (this.a1.c()) {
                this.a1.b(this.Y0, this.j1);
            }
            if (c10859y31 != 0) {
                c10859y31.f();
            }
            z();
            C5034aE0.f();
        } catch (Throwable th) {
            C5034aE0.f();
            throw th;
        }
    }

    public final void y() {
        if (this.r1.b(b.f.class)) {
            F();
        }
        J();
        this.k1.c(new TD0("Failed to load resource", new ArrayList(this.Y)));
        A();
    }

    public final void z() {
        if (this.b1.b()) {
            D();
        }
    }
}
