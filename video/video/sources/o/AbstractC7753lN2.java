package o;

import androidx.work.ListenableWorker;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import o.TM2;

/* renamed from: o.lN2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7753lN2 {
    public static final long d = 30000;
    public static final long e = 18000000;
    public static final long f = 10000;
    public UUID a;
    public C8501oN2 b;
    public Set<String> c;

    /* renamed from: o.lN2$a */
    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends AbstractC7753lN2> {
        public C8501oN2 c;
        public Class<? extends ListenableWorker> e;
        public boolean a = false;
        public Set<String> d = new HashSet();
        public UUID b = UUID.randomUUID();

        public a(Class<? extends ListenableWorker> workerClass) {
            this.e = workerClass;
            this.c = new C8501oN2(this.b.toString(), workerClass.getName());
            a(workerClass.getName());
        }

        public final B a(String tag) {
            this.d.add(tag);
            return d();
        }

        public final W b() {
            boolean z;
            W c = c();
            XK xk = this.c.j;
            if (!xk.e() && !xk.f() && !xk.g() && !xk.h()) {
                z = false;
            } else {
                z = true;
            }
            if (this.c.q && z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.b = UUID.randomUUID();
            C8501oN2 c8501oN2 = new C8501oN2(this.c);
            this.c = c8501oN2;
            c8501oN2.a = this.b.toString();
            return c;
        }

        public abstract W c();

        public abstract B d();

        public final B e(long duration, TimeUnit timeUnit) {
            this.c.f826o = timeUnit.toMillis(duration);
            return d();
        }

        public final B f(Duration duration) {
            long millis;
            C8501oN2 c8501oN2 = this.c;
            millis = duration.toMillis();
            c8501oN2.f826o = millis;
            return d();
        }

        public final B g(EnumC11023yk backoffPolicy, long backoffDelay, TimeUnit timeUnit) {
            this.a = true;
            C8501oN2 c8501oN2 = this.c;
            c8501oN2.l = backoffPolicy;
            c8501oN2.e(timeUnit.toMillis(backoffDelay));
            return d();
        }

        public final B h(EnumC11023yk backoffPolicy, Duration duration) {
            long millis;
            this.a = true;
            C8501oN2 c8501oN2 = this.c;
            c8501oN2.l = backoffPolicy;
            millis = duration.toMillis();
            c8501oN2.e(millis);
            return d();
        }

        public final B i(XK constraints) {
            this.c.j = constraints;
            return d();
        }

        public B j(EnumC2505Aw1 policy) {
            C8501oN2 c8501oN2 = this.c;
            c8501oN2.q = true;
            c8501oN2.r = policy;
            return d();
        }

        public B k(long duration, TimeUnit timeUnit) {
            this.c.g = timeUnit.toMillis(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.g) {
                return d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public B l(Duration duration) {
            long millis;
            C8501oN2 c8501oN2 = this.c;
            millis = duration.toMillis();
            c8501oN2.g = millis;
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.g) {
                return d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final B m(int runAttemptCount) {
            this.c.k = runAttemptCount;
            return d();
        }

        public final B n(TM2.a state) {
            this.c.b = state;
            return d();
        }

        public final B o(androidx.work.b inputData) {
            this.c.e = inputData;
            return d();
        }

        public final B p(long periodStartTime, TimeUnit timeUnit) {
            this.c.n = timeUnit.toMillis(periodStartTime);
            return d();
        }

        public final B q(long scheduleRequestedAt, TimeUnit timeUnit) {
            this.c.p = timeUnit.toMillis(scheduleRequestedAt);
            return d();
        }
    }

    public AbstractC7753lN2(UUID id, C8501oN2 workSpec, Set<String> tags) {
        this.a = id;
        this.b = workSpec;
        this.c = tags;
    }

    public UUID a() {
        return this.a;
    }

    public String b() {
        return this.a.toString();
    }

    public Set<String> c() {
        return this.c;
    }

    public C8501oN2 d() {
        return this.b;
    }
}
