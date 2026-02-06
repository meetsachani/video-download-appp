package o;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.C2655Ck1;
import o.C9147r11;
import o.G12;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* loaded from: classes3.dex */
public abstract class X2 implements G12 {
    public static final C9147r11.a<G12.a> h = new a();
    public static final C9147r11.a<G12.a> i = new b();
    public static final C9147r11.a<G12.a> j;
    public static final C9147r11.a<G12.a> k;
    public static final C9147r11.a<G12.a> l;
    public static final C9147r11.a<G12.a> m;
    public static final C9147r11.a<G12.a> n;

    /* renamed from: o  reason: collision with root package name */
    public static final C9147r11.a<G12.a> f657o;
    public final C2655Ck1 a = new C2655Ck1();
    public final C2655Ck1.a b = new h();
    public final C2655Ck1.a c = new i();
    public final C2655Ck1.a d = new g();
    public final C2655Ck1.a e = new j();
    public final C9147r11<G12.a> f = new C9147r11<>();
    public volatile k g = new k(G12.b.NEW);

    /* loaded from: classes3.dex */
    public class a implements C9147r11.a<G12.a> {
        @Override // o.C9147r11.a
        /* renamed from: b */
        public void a(G12.a aVar) {
            aVar.c();
        }

        public String toString() {
            return "starting()";
        }
    }

    /* loaded from: classes3.dex */
    public class b implements C9147r11.a<G12.a> {
        @Override // o.C9147r11.a
        /* renamed from: b */
        public void a(G12.a aVar) {
            aVar.b();
        }

        public String toString() {
            return "running()";
        }
    }

    /* loaded from: classes3.dex */
    public class c implements C9147r11.a<G12.a> {
        public final /* synthetic */ G12.b a;

        public c(G12.b bVar) {
            this.a = bVar;
        }

        @Override // o.C9147r11.a
        /* renamed from: b */
        public void a(G12.a aVar) {
            aVar.e(this.a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 21);
            sb.append("terminated({from = ");
            sb.append(valueOf);
            sb.append("})");
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public class d implements C9147r11.a<G12.a> {
        public final /* synthetic */ G12.b a;

        public d(G12.b bVar) {
            this.a = bVar;
        }

        @Override // o.C9147r11.a
        /* renamed from: b */
        public void a(G12.a aVar) {
            aVar.d(this.a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19);
            sb.append("stopping({from = ");
            sb.append(valueOf);
            sb.append("})");
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public class e implements C9147r11.a<G12.a> {
        public final /* synthetic */ G12.b a;
        public final /* synthetic */ Throwable b;

        public e(X2 x2, G12.b bVar, Throwable th) {
            this.a = bVar;
            this.b = th;
        }

        @Override // o.C9147r11.a
        /* renamed from: b */
        public void a(G12.a aVar) {
            aVar.a(this.a, this.b);
        }

        public String toString() {
            String valueOf = String.valueOf(this.a);
            String valueOf2 = String.valueOf(this.b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 27 + valueOf2.length());
            sb.append("failed({from = ");
            sb.append(valueOf);
            sb.append(", cause = ");
            sb.append(valueOf2);
            sb.append("})");
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class f {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[G12.b.values().length];
            a = iArr;
            try {
                iArr[G12.b.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[G12.b.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[G12.b.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[G12.b.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[G12.b.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[G12.b.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class g extends C2655Ck1.a {
        public g() {
            super(X2.this.a);
        }

        @Override // o.C2655Ck1.a
        public boolean a() {
            if (X2.this.state().compareTo(G12.b.RUNNING) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public final class h extends C2655Ck1.a {
        public h() {
            super(X2.this.a);
        }

        @Override // o.C2655Ck1.a
        public boolean a() {
            if (X2.this.state() == G12.b.NEW) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public final class i extends C2655Ck1.a {
        public i() {
            super(X2.this.a);
        }

        @Override // o.C2655Ck1.a
        public boolean a() {
            if (X2.this.state().compareTo(G12.b.RUNNING) <= 0) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public final class j extends C2655Ck1.a {
        public j() {
            super(X2.this.a);
        }

        @Override // o.C2655Ck1.a
        public boolean a() {
            if (X2.this.state().compareTo(G12.b.TERMINATED) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public static final class k {
        public final G12.b a;
        public final boolean b;
        @MB
        public final Throwable c;

        public k(G12.b bVar) {
            this(bVar, false, null);
        }

        public G12.b a() {
            if (this.b && this.a == G12.b.STARTING) {
                return G12.b.STOPPING;
            }
            return this.a;
        }

        public Throwable b() {
            boolean z;
            G12.b bVar = this.a;
            if (bVar == G12.b.FAILED) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.x0(z, "failureCause() is only valid if the service has failed, service is %s", bVar);
            Throwable th = this.c;
            Objects.requireNonNull(th);
            return th;
        }

        public k(G12.b bVar, boolean z, @MB Throwable th) {
            C10664xF1.u(!z || bVar == G12.b.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", bVar);
            C10664xF1.y((th != null) == (bVar == G12.b.FAILED), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", bVar, th);
            this.a = bVar;
            this.b = z;
            this.c = th;
        }
    }

    static {
        G12.b bVar = G12.b.STARTING;
        j = w(bVar);
        G12.b bVar2 = G12.b.RUNNING;
        k = w(bVar2);
        l = x(G12.b.NEW);
        m = x(bVar);
        n = x(bVar2);
        f657o = x(G12.b.STOPPING);
    }

    public static C9147r11.a<G12.a> w(G12.b bVar) {
        return new d(bVar);
    }

    public static C9147r11.a<G12.a> x(G12.b bVar) {
        return new c(bVar);
    }

    @Override // o.G12
    public final void a(G12.a aVar, Executor executor) {
        this.f.b(aVar, executor);
    }

    @Override // o.G12
    public final void b(long j2, TimeUnit timeUnit) throws TimeoutException {
        if (this.a.r(this.d, j2, timeUnit)) {
            try {
                j(G12.b.RUNNING);
                return;
            } finally {
                this.a.D();
            }
        }
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(valueOf.length() + 50);
        sb.append("Timed out waiting for ");
        sb.append(valueOf);
        sb.append(" to reach the RUNNING state.");
        throw new TimeoutException(sb.toString());
    }

    @Override // o.G12
    public final void c(long j2, TimeUnit timeUnit) throws TimeoutException {
        if (this.a.r(this.e, j2, timeUnit)) {
            try {
                j(G12.b.TERMINATED);
                return;
            } finally {
                this.a.D();
            }
        }
        String valueOf = String.valueOf(this);
        String valueOf2 = String.valueOf(state());
        StringBuilder sb = new StringBuilder(valueOf.length() + 65 + valueOf2.length());
        sb.append("Timed out waiting for ");
        sb.append(valueOf);
        sb.append(" to reach a terminal state. Current state: ");
        sb.append(valueOf2);
        throw new TimeoutException(sb.toString());
    }

    @Override // o.G12
    public final void d() {
        this.a.q(this.e);
        try {
            j(G12.b.TERMINATED);
        } finally {
            this.a.D();
        }
    }

    @Override // o.G12
    @InterfaceC6181ey
    public final G12 e() {
        if (this.a.i(this.b)) {
            try {
                this.g = new k(G12.b.STARTING);
                q();
                m();
            } finally {
                try {
                    return this;
                } finally {
                }
            }
            return this;
        }
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(valueOf.length() + 33);
        sb.append("Service ");
        sb.append(valueOf);
        sb.append(" has already been started");
        throw new IllegalStateException(sb.toString());
    }

    @Override // o.G12
    public final void f() {
        this.a.q(this.d);
        try {
            j(G12.b.RUNNING);
        } finally {
            this.a.D();
        }
    }

    @Override // o.G12
    public final Throwable g() {
        return this.g.b();
    }

    @Override // o.G12
    @InterfaceC6181ey
    public final G12 h() {
        if (this.a.i(this.c)) {
            try {
                G12.b state = state();
                switch (f.a[state.ordinal()]) {
                    case 1:
                        this.g = new k(G12.b.TERMINATED);
                        s(G12.b.NEW);
                        break;
                    case 2:
                        G12.b bVar = G12.b.STARTING;
                        this.g = new k(bVar, true, null);
                        r(bVar);
                        l();
                        break;
                    case 3:
                        this.g = new k(G12.b.STOPPING);
                        r(G12.b.RUNNING);
                        n();
                        break;
                    case 4:
                    case 5:
                    case 6:
                        String valueOf = String.valueOf(state);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 45);
                        sb.append("isStoppable is incorrectly implemented, saw: ");
                        sb.append(valueOf);
                        throw new AssertionError(sb.toString());
                }
            } finally {
                try {
                    return this;
                } finally {
                }
            }
            return this;
        }
        return this;
    }

    @Override // o.G12
    public final boolean isRunning() {
        if (state() == G12.b.RUNNING) {
            return true;
        }
        return false;
    }

    @InterfaceC7980mF0("monitor")
    public final void j(G12.b bVar) {
        G12.b state = state();
        if (state != bVar) {
            if (state == G12.b.FAILED) {
                String valueOf = String.valueOf(this);
                String valueOf2 = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 56 + valueOf2.length());
                sb.append("Expected the service ");
                sb.append(valueOf);
                sb.append(" to be ");
                sb.append(valueOf2);
                sb.append(", but the service has FAILED");
                throw new IllegalStateException(sb.toString(), g());
            }
            String valueOf3 = String.valueOf(this);
            String valueOf4 = String.valueOf(bVar);
            String valueOf5 = String.valueOf(state);
            StringBuilder sb2 = new StringBuilder(valueOf3.length() + 38 + valueOf4.length() + valueOf5.length());
            sb2.append("Expected the service ");
            sb2.append(valueOf3);
            sb2.append(" to be ");
            sb2.append(valueOf4);
            sb2.append(", but was ");
            sb2.append(valueOf5);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public final void k() {
        if (!this.a.B()) {
            this.f.c();
        }
    }

    @InterfaceC6919hx0
    public abstract void m();

    @InterfaceC6919hx0
    public abstract void n();

    public final void o(G12.b bVar, Throwable th) {
        this.f.d(new e(this, bVar, th));
    }

    public final void p() {
        this.f.d(i);
    }

    public final void q() {
        this.f.d(h);
    }

    public final void r(G12.b bVar) {
        if (bVar == G12.b.STARTING) {
            this.f.d(j);
        } else if (bVar == G12.b.RUNNING) {
            this.f.d(k);
        } else {
            throw new AssertionError();
        }
    }

    public final void s(G12.b bVar) {
        switch (f.a[bVar.ordinal()]) {
            case 1:
                this.f.d(l);
                return;
            case 2:
                this.f.d(m);
                return;
            case 3:
                this.f.d(n);
                return;
            case 4:
                this.f.d(f657o);
                return;
            case 5:
            case 6:
                throw new AssertionError();
            default:
                return;
        }
    }

    @Override // o.G12
    public final G12.b state() {
        return this.g.a();
    }

    public final void t(Throwable th) {
        C10664xF1.E(th);
        this.a.g();
        try {
            G12.b state = state();
            int i2 = f.a[state.ordinal()];
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3 && i2 != 4) {
                    if (i2 != 5) {
                    }
                } else {
                    this.g = new k(G12.b.FAILED, false, th);
                    o(state, th);
                }
                return;
            }
            String valueOf = String.valueOf(state);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Failed while in state:");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString(), th);
        } finally {
            this.a.D();
            k();
        }
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf = String.valueOf(state());
        StringBuilder sb = new StringBuilder(simpleName.length() + 3 + valueOf.length());
        sb.append(simpleName);
        sb.append(" [");
        sb.append(valueOf);
        sb.append(C6566gU0.g);
        return sb.toString();
    }

    public final void u() {
        this.a.g();
        try {
            if (this.g.a == G12.b.STARTING) {
                if (this.g.b) {
                    this.g = new k(G12.b.STOPPING);
                    n();
                } else {
                    this.g = new k(G12.b.RUNNING);
                    p();
                }
                this.a.D();
                k();
                return;
            }
            String valueOf = String.valueOf(this.g.a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 43);
            sb.append("Cannot notifyStarted() when the service is ");
            sb.append(valueOf);
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            t(illegalStateException);
            throw illegalStateException;
        } catch (Throwable th) {
            this.a.D();
            k();
            throw th;
        }
    }

    public final void v() {
        this.a.g();
        try {
            G12.b state = state();
            switch (f.a[state.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    String valueOf = String.valueOf(state);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 43);
                    sb.append("Cannot notifyStopped() when the service is ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                case 2:
                case 3:
                case 4:
                    this.g = new k(G12.b.TERMINATED);
                    s(state);
                    break;
            }
        } finally {
            this.a.D();
            k();
        }
    }

    @InterfaceC6919hx0
    @InterfaceC4238Sm
    public void l() {
    }
}
