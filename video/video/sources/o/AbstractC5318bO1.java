package o;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.AbstractC10398w92;

@InterfaceC5601ca0
@InterfaceC11149zF0
@InterfaceC4238Sm
/* renamed from: o.bO1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5318bO1 {
    public final a a;
    @MB
    public volatile Object b;

    /* renamed from: o.bO1$a */
    /* loaded from: classes3.dex */
    public static abstract class a {

        /* renamed from: o.bO1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0261a extends a {
            public final C6100ed2 a = C6100ed2.c();

            @Override // o.AbstractC5318bO1.a
            public long b() {
                return this.a.g(TimeUnit.MICROSECONDS);
            }

            @Override // o.AbstractC5318bO1.a
            public void c(long j) {
                if (j > 0) {
                    C5748dA2.k(j, TimeUnit.MICROSECONDS);
                }
            }
        }

        public static a a() {
            return new C0261a();
        }

        public abstract long b();

        public abstract void c(long j);
    }

    public AbstractC5318bO1(a aVar) {
        this.a = (a) C10664xF1.E(aVar);
    }

    public static void d(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "Requested permits (%s) must be positive", i);
    }

    public static AbstractC5318bO1 e(double d) {
        return h(d, a.a());
    }

    public static AbstractC5318bO1 f(double d, long j, TimeUnit timeUnit) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "warmupPeriod must not be negative: %s", j);
        return g(d, j, timeUnit, 3.0d, a.a());
    }

    @InterfaceC5299bJ2
    public static AbstractC5318bO1 g(double d, long j, TimeUnit timeUnit, double d2, a aVar) {
        AbstractC10398w92.c cVar = new AbstractC10398w92.c(aVar, j, timeUnit, d2);
        cVar.q(d);
        return cVar;
    }

    @InterfaceC5299bJ2
    public static AbstractC5318bO1 h(double d, a aVar) {
        AbstractC10398w92.b bVar = new AbstractC10398w92.b(aVar, 1.0d);
        bVar.q(d);
        return bVar;
    }

    @InterfaceC6181ey
    public double a() {
        return b(1);
    }

    @InterfaceC6181ey
    public double b(int i) {
        long n = n(i);
        this.a.c(n);
        return (n * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    public final boolean c(long j, long j2) {
        if (m(j) - j2 <= j) {
            return true;
        }
        return false;
    }

    public abstract double i();

    public abstract void j(double d, long j);

    public final double k() {
        double i;
        synchronized (l()) {
            i = i();
        }
        return i;
    }

    public final Object l() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 == null) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == null) {
                        obj = new Object();
                        this.b = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        return obj2;
    }

    public abstract long m(long j);

    public final long n(int i) {
        long o2;
        d(i);
        synchronized (l()) {
            o2 = o(i, this.a.b());
        }
        return o2;
    }

    public final long o(int i, long j) {
        return Math.max(p(i, j) - j, 0L);
    }

    public abstract long p(int i, long j);

    public final void q(double d) {
        boolean z;
        if (d > 0.0d && !Double.isNaN(d)) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "rate must be positive");
        synchronized (l()) {
            j(d, this.a.b());
        }
    }

    public boolean r() {
        return t(1, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean s(int i) {
        return t(i, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean t(int i, long j, TimeUnit timeUnit) {
        long max = Math.max(timeUnit.toMicros(j), 0L);
        d(i);
        synchronized (l()) {
            try {
                long b = this.a.b();
                if (!c(b, max)) {
                    return false;
                }
                this.a.c(o(i, b));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(k()));
    }

    public boolean u(long j, TimeUnit timeUnit) {
        return t(1, j, timeUnit);
    }
}
