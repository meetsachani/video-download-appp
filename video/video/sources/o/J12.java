package o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.C2655Ck1;
import o.C9147r11;
import o.C9724tO0;
import o.G12;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* loaded from: classes3.dex */
public final class J12 implements K12 {
    public static final Logger c = Logger.getLogger(J12.class.getName());
    public static final C9147r11.a<d> d = new a();
    public static final C9147r11.a<d> e = new b();
    public final g a;
    public final AbstractC5317bO0<G12> b;

    /* loaded from: classes3.dex */
    public class a implements C9147r11.a<d> {
        @Override // o.C9147r11.a
        /* renamed from: b */
        public void a(d dVar) {
            dVar.b();
        }

        public String toString() {
            return "healthy()";
        }
    }

    /* loaded from: classes3.dex */
    public class b implements C9147r11.a<d> {
        @Override // o.C9147r11.a
        /* renamed from: b */
        public void a(d dVar) {
            dVar.c();
        }

        public String toString() {
            return "stopped()";
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends Throwable {
        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends X2 {
        public e() {
        }

        @Override // o.X2
        public void m() {
            u();
        }

        @Override // o.X2
        public void n() {
            v();
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends G12.a {
        public final G12 a;
        public final WeakReference<g> b;

        public f(G12 g12, WeakReference<g> weakReference) {
            this.a = g12;
            this.b = weakReference;
        }

        @Override // o.G12.a
        public void a(G12.b bVar, Throwable th) {
            g gVar = this.b.get();
            if (gVar != null) {
                if (!(this.a instanceof e)) {
                    Logger logger = J12.c;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(this.a);
                    String valueOf2 = String.valueOf(bVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 34 + valueOf2.length());
                    sb.append("Service ");
                    sb.append(valueOf);
                    sb.append(" has failed in the ");
                    sb.append(valueOf2);
                    sb.append(" state.");
                    logger.log(level, sb.toString(), th);
                }
                gVar.n(this.a, bVar, G12.b.FAILED);
            }
        }

        @Override // o.G12.a
        public void b() {
            g gVar = this.b.get();
            if (gVar != null) {
                gVar.n(this.a, G12.b.STARTING, G12.b.RUNNING);
            }
        }

        @Override // o.G12.a
        public void c() {
            g gVar = this.b.get();
            if (gVar != null) {
                gVar.n(this.a, G12.b.NEW, G12.b.STARTING);
                if (!(this.a instanceof e)) {
                    J12.c.log(Level.FINE, "Starting {0}.", this.a);
                }
            }
        }

        @Override // o.G12.a
        public void d(G12.b bVar) {
            g gVar = this.b.get();
            if (gVar != null) {
                gVar.n(this.a, bVar, G12.b.STOPPING);
            }
        }

        @Override // o.G12.a
        public void e(G12.b bVar) {
            g gVar = this.b.get();
            if (gVar != null) {
                if (!(this.a instanceof e)) {
                    J12.c.log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[]{this.a, bVar});
                }
                gVar.n(this.a, bVar, G12.b.TERMINATED);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class g {
        public final C2655Ck1 a = new C2655Ck1();
        @InterfaceC7980mF0("monitor")
        public final InterfaceC8660p22<G12.b, G12> b;
        @InterfaceC7980mF0("monitor")
        public final InterfaceC2467Am1<G12.b> c;
        @InterfaceC7980mF0("monitor")
        public final Map<G12, C6100ed2> d;
        @InterfaceC7980mF0("monitor")
        public boolean e;
        @InterfaceC7980mF0("monitor")
        public boolean f;
        public final int g;
        public final C2655Ck1.a h;
        public final C2655Ck1.a i;
        public final C9147r11<d> j;

        /* loaded from: classes3.dex */
        public class a implements YA0<Map.Entry<G12, Long>, Long> {
            public a(g gVar) {
            }

            @Override // o.YA0
            /* renamed from: a */
            public Long apply(Map.Entry<G12, Long> entry) {
                return entry.getValue();
            }
        }

        /* loaded from: classes3.dex */
        public class b implements C9147r11.a<d> {
            public final /* synthetic */ G12 a;

            public b(g gVar, G12 g12) {
                this.a = g12;
            }

            @Override // o.C9147r11.a
            /* renamed from: b */
            public void a(d dVar) {
                dVar.a(this.a);
            }

            public String toString() {
                String valueOf = String.valueOf(this.a);
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append("failed({service=");
                sb.append(valueOf);
                sb.append("})");
                return sb.toString();
            }
        }

        /* loaded from: classes3.dex */
        public final class c extends C2655Ck1.a {
            public c() {
                super(g.this.a);
            }

            @Override // o.C2655Ck1.a
            @InterfaceC7980mF0("ServiceManagerState.this.monitor")
            public boolean a() {
                int w4 = g.this.c.w4(G12.b.RUNNING);
                g gVar = g.this;
                if (w4 != gVar.g && !gVar.c.contains(G12.b.STOPPING) && !g.this.c.contains(G12.b.TERMINATED) && !g.this.c.contains(G12.b.FAILED)) {
                    return false;
                }
                return true;
            }
        }

        /* loaded from: classes3.dex */
        public final class d extends C2655Ck1.a {
            public d() {
                super(g.this.a);
            }

            @Override // o.C2655Ck1.a
            @InterfaceC7980mF0("ServiceManagerState.this.monitor")
            public boolean a() {
                if (g.this.c.w4(G12.b.TERMINATED) + g.this.c.w4(G12.b.FAILED) == g.this.g) {
                    return true;
                }
                return false;
            }
        }

        public g(TN0<G12> tn0) {
            InterfaceC8660p22<G12.b, G12> a2 = AbstractC10301vm1.c(G12.b.class).g().a();
            this.b = a2;
            this.c = a2.Q();
            this.d = C7935m81.b0();
            this.h = new c();
            this.i = new d();
            this.j = new C9147r11<>();
            this.g = tn0.size();
            a2.e0(G12.b.NEW, tn0);
        }

        public void a(d dVar, Executor executor) {
            this.j.b(dVar, executor);
        }

        public void b() {
            this.a.q(this.h);
            try {
                f();
            } finally {
                this.a.D();
            }
        }

        public void c(long j, TimeUnit timeUnit) throws TimeoutException {
            this.a.g();
            try {
                if (this.a.N(this.h, j, timeUnit)) {
                    f();
                    return;
                }
                String valueOf = String.valueOf(C10547wm1.n(this.b, C7985mG1.n(AbstractC9481sO0.U(G12.b.NEW, G12.b.STARTING))));
                StringBuilder sb = new StringBuilder(valueOf.length() + 93);
                sb.append("Timeout waiting for the services to become healthy. The following services have not started: ");
                sb.append(valueOf);
                throw new TimeoutException(sb.toString());
            } finally {
                this.a.D();
            }
        }

        public void d() {
            this.a.q(this.i);
            this.a.D();
        }

        public void e(long j, TimeUnit timeUnit) throws TimeoutException {
            this.a.g();
            try {
                if (this.a.N(this.i, j, timeUnit)) {
                    return;
                }
                String valueOf = String.valueOf(C10547wm1.n(this.b, C7985mG1.q(C7985mG1.n(EnumSet.of(G12.b.TERMINATED, G12.b.FAILED)))));
                StringBuilder sb = new StringBuilder(valueOf.length() + 83);
                sb.append("Timeout waiting for the services to stop. The following services have not stopped: ");
                sb.append(valueOf);
                throw new TimeoutException(sb.toString());
            } finally {
                this.a.D();
            }
        }

        @InterfaceC7980mF0("monitor")
        public void f() {
            InterfaceC2467Am1<G12.b> interfaceC2467Am1 = this.c;
            G12.b bVar = G12.b.RUNNING;
            if (interfaceC2467Am1.w4(bVar) == this.g) {
                return;
            }
            String valueOf = String.valueOf(C10547wm1.n(this.b, C7985mG1.q(C7985mG1.m(bVar))));
            StringBuilder sb = new StringBuilder(valueOf.length() + 79);
            sb.append("Expected to be healthy after starting. The following services are not running: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }

        public void g() {
            C10664xF1.h0(!this.a.B(), "It is incorrect to execute listeners with the monitor held.");
            this.j.c();
        }

        public void h(G12 g12) {
            this.j.d(new b(this, g12));
        }

        public void i() {
            this.j.d(J12.d);
        }

        public void j() {
            this.j.d(J12.e);
        }

        public void k() {
            this.a.g();
            try {
                if (!this.f) {
                    this.e = true;
                    return;
                }
                ArrayList q = C10608x11.q();
                AbstractC6237fB2<G12> it = l().values().iterator();
                while (it.hasNext()) {
                    G12 next = it.next();
                    if (next.state() != G12.b.NEW) {
                        q.add(next);
                    }
                }
                String valueOf = String.valueOf(q);
                StringBuilder sb = new StringBuilder(valueOf.length() + 89);
                sb.append("Services started transitioning asynchronously before the ServiceManager was constructed: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } finally {
                this.a.D();
            }
        }

        public C9724tO0<G12.b, G12> l() {
            C9724tO0.a K = C9724tO0.K();
            this.a.g();
            try {
                for (Map.Entry<G12.b, G12> entry : this.b.r()) {
                    if (!(entry.getValue() instanceof e)) {
                        K.g(entry);
                    }
                }
                this.a.D();
                return K.a();
            } catch (Throwable th) {
                this.a.D();
                throw th;
            }
        }

        public AbstractC6044eO0<G12, Long> m() {
            this.a.g();
            try {
                ArrayList u = C10608x11.u(this.d.size());
                for (Map.Entry<G12, C6100ed2> entry : this.d.entrySet()) {
                    G12 key = entry.getKey();
                    C6100ed2 value = entry.getValue();
                    if (!value.i() && !(key instanceof e)) {
                        u.add(C7935m81.O(key, Long.valueOf(value.g(TimeUnit.MILLISECONDS))));
                    }
                }
                this.a.D();
                Collections.sort(u, AbstractC10587ww1.z().D(new a(this)));
                return AbstractC6044eO0.f(u);
            } catch (Throwable th) {
                this.a.D();
                throw th;
            }
        }

        public void n(G12 g12, G12.b bVar, G12.b bVar2) {
            boolean z;
            C10664xF1.E(g12);
            if (bVar != bVar2) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.d(z);
            this.a.g();
            try {
                this.f = true;
                if (this.e) {
                    C10664xF1.B0(this.b.remove(bVar, g12), "Service %s not at the expected location in the state map %s", g12, bVar);
                    C10664xF1.B0(this.b.put(bVar2, g12), "Service %s in the state map unexpectedly at %s", g12, bVar2);
                    C6100ed2 c6100ed2 = this.d.get(g12);
                    if (c6100ed2 == null) {
                        c6100ed2 = C6100ed2.c();
                        this.d.put(g12, c6100ed2);
                    }
                    G12.b bVar3 = G12.b.RUNNING;
                    if (bVar2.compareTo(bVar3) >= 0 && c6100ed2.i()) {
                        c6100ed2.l();
                        if (!(g12 instanceof e)) {
                            J12.c.log(Level.FINE, "Started {0} in {1}.", new Object[]{g12, c6100ed2});
                        }
                    }
                    G12.b bVar4 = G12.b.FAILED;
                    if (bVar2 == bVar4) {
                        h(g12);
                    }
                    if (this.c.w4(bVar3) == this.g) {
                        i();
                    } else if (this.c.w4(G12.b.TERMINATED) + this.c.w4(bVar4) == this.g) {
                        j();
                    }
                }
                this.a.D();
                g();
            } catch (Throwable th) {
                this.a.D();
                g();
                throw th;
            }
        }

        public void o(G12 g12) {
            this.a.g();
            try {
                if (this.d.get(g12) == null) {
                    this.d.put(g12, C6100ed2.c());
                }
            } finally {
                this.a.D();
            }
        }
    }

    public J12(Iterable<? extends G12> iterable) {
        boolean z;
        AbstractC5317bO0<G12> D = AbstractC5317bO0.D(iterable);
        if (D.isEmpty()) {
            c.log(Level.WARNING, "ServiceManager configured with no services.  Is your application configured properly?", (Throwable) new c(null));
            D = AbstractC5317bO0.M(new e(null));
        }
        g gVar = new g(D);
        this.a = gVar;
        this.b = D;
        WeakReference weakReference = new WeakReference(gVar);
        AbstractC6237fB2<G12> it = D.iterator();
        while (it.hasNext()) {
            G12 next = it.next();
            next.a(new f(next, weakReference), C3645Mk1.c());
            if (next.state() == G12.b.NEW) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.u(z, "Can only manage NEW services, %s", next);
        }
        this.a.k();
    }

    public void e(d dVar, Executor executor) {
        this.a.a(dVar, executor);
    }

    public void f() {
        this.a.b();
    }

    public void g(long j, TimeUnit timeUnit) throws TimeoutException {
        this.a.c(j, timeUnit);
    }

    public void h() {
        this.a.d();
    }

    public void i(long j, TimeUnit timeUnit) throws TimeoutException {
        this.a.e(j, timeUnit);
    }

    public boolean j() {
        AbstractC6237fB2<G12> it = this.b.iterator();
        while (it.hasNext()) {
            if (!it.next().isRunning()) {
                return false;
            }
        }
        return true;
    }

    @Override // o.K12
    /* renamed from: k */
    public C9724tO0<G12.b, G12> a() {
        return this.a.l();
    }

    @InterfaceC6181ey
    public J12 l() {
        boolean z;
        AbstractC6237fB2<G12> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().state() == G12.b.NEW) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.x0(z, "Not all services are NEW, cannot start %s", this);
        }
        AbstractC6237fB2<G12> it2 = this.b.iterator();
        while (it2.hasNext()) {
            G12 next = it2.next();
            try {
                this.a.o(next);
                next.e();
            } catch (IllegalStateException e2) {
                Logger logger = c;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(next);
                StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                sb.append("Unable to start Service ");
                sb.append(valueOf);
                logger.log(level, sb.toString(), (Throwable) e2);
            }
        }
        return this;
    }

    public AbstractC6044eO0<G12, Long> m() {
        return this.a.m();
    }

    @InterfaceC6181ey
    public J12 n() {
        AbstractC6237fB2<G12> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().h();
        }
        return this;
    }

    public String toString() {
        return C3743Nk1.b(J12.class).f("services", C7232jF.d(this.b, C7985mG1.q(C7985mG1.o(e.class)))).toString();
    }

    /* loaded from: classes3.dex */
    public static abstract class d {
        public void b() {
        }

        public void c() {
        }

        public void a(G12 g12) {
        }
    }
}
