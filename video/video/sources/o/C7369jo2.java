package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import o.AbstractC8244nK1;

/* renamed from: o.jo2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7369jo2 extends JQ {
    public final double Y0;
    public final long Z0;
    public Duration a1;

    /* renamed from: o.jo2$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC8244nK1.a<C7369jo2, b> {
        public double m = Double.MAX_VALUE;

        @Override // o.AbstractC8244nK1.a
        public /* bridge */ /* synthetic */ XJ0 j0() {
            return super.j0();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [o.jo2$b, o.s3] */
        @Override // o.AbstractC8244nK1.a
        public /* bridge */ /* synthetic */ b k0(XJ0 xj0) {
            return super.k0(xj0);
        }

        @Override // o.XK0
        /* renamed from: m0 */
        public C7369jo2 get() throws IOException {
            return new C7369jo2(this);
        }

        public double n0() {
            return this.m;
        }

        public b o0(long j, Duration duration) {
            long millis;
            Objects.requireNonNull(duration, "duration");
            millis = C9470sL1.a(duration).toMillis();
            q0((millis / 1000.0d) * j);
            return (b) c();
        }

        public b p0(long j, ChronoUnit chronoUnit) {
            Duration duration;
            duration = chronoUnit.getDuration();
            o0(j, duration);
            return (b) c();
        }

        public final b q0(double d) {
            if (d > 0.0d) {
                this.m = d;
                return (b) c();
            }
            throw new IllegalArgumentException("Bandwidth " + d + " must be > 0.");
        }

        public void r0(long j) {
            q0(j);
        }
    }

    public static b n() {
        return new b();
    }

    public static long t(long j, long j2, double d) {
        if (j <= 0 || d <= 0.0d || j2 == 0) {
            return 0L;
        }
        long j3 = (long) (((j / d) * 1000.0d) - j2);
        if (j3 <= 0) {
            return 0L;
        }
        return j3;
    }

    @Override // o.AbstractC8244nK1
    public void d(int i) throws IOException {
        s();
    }

    public final long o() {
        long currentTimeMillis = (System.currentTimeMillis() - this.Z0) / 1000;
        if (currentTimeMillis == 0) {
            return k();
        }
        return k() / currentTimeMillis;
    }

    public double p() {
        return this.Y0;
    }

    public final long q() {
        return t(k(), System.currentTimeMillis() - this.Z0, this.Y0);
    }

    public Duration r() {
        return this.a1;
    }

    public final void s() throws InterruptedIOException {
        ChronoUnit chronoUnit;
        Duration plus;
        long q = q();
        if (q > 0) {
            Duration duration = this.a1;
            chronoUnit = ChronoUnit.MILLIS;
            plus = duration.plus(q, chronoUnit);
            this.a1 = plus;
            try {
                TimeUnit.MILLISECONDS.sleep(q);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException("Thread aborted");
            }
        }
    }

    public String toString() {
        return "ThrottledInputStream[bytesRead=" + k() + ", maxBytesPerSec=" + this.Y0 + ", bytesPerSec=" + o() + ", totalSleepDuration=" + this.a1 + ']';
    }

    public C7369jo2(b bVar) throws IOException {
        super(bVar);
        Duration duration;
        this.Z0 = System.currentTimeMillis();
        duration = Duration.ZERO;
        this.a1 = duration;
        if (bVar.m > 0.0d) {
            this.Y0 = bVar.m;
            return;
        }
        throw new IllegalArgumentException("Bandwidth " + bVar.m + " is invalid.");
    }
}
