package o;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
import o.S9;

@Deprecated
/* renamed from: o.up2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10071up2 {
    public static final long e = Long.MAX_VALUE;
    public static final long f = 9223372036854775806L;
    public static final long g = 8589934592L;
    @InterfaceC8710pF0("this")
    public long a;
    @InterfaceC8710pF0("this")
    public long b;
    @InterfaceC8710pF0("this")
    public long c;
    public final ThreadLocal<Long> d = new ThreadLocal<>();

    public C10071up2(long j) {
        h(j);
    }

    public static long g(long j) {
        return (j * 1000000) / 90000;
    }

    public static long j(long j) {
        return (j * 90000) / 1000000;
    }

    public static long k(long j) {
        return j(j) % 8589934592L;
    }

    public synchronized long a(long j) {
        if (j == C10323vs.b) {
            return C10323vs.b;
        }
        try {
            if (!f()) {
                long j2 = this.a;
                if (j2 == f) {
                    j2 = ((Long) C9542sf.g(this.d.get())).longValue();
                }
                this.b = j2 - j;
                notifyAll();
            }
            this.c = j;
            return j + this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long b(long j) {
        if (j == C10323vs.b) {
            return C10323vs.b;
        }
        try {
            long j2 = this.c;
            if (j2 != C10323vs.b) {
                long j3 = j(j2);
                long j4 = (S9.c.M + j3) / 8589934592L;
                long j5 = ((j4 - 1) * 8589934592L) + j;
                j += j4 * 8589934592L;
                if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                    j = j5;
                }
            }
            return a(g(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long c() {
        long j;
        j = this.a;
        if (j == Long.MAX_VALUE || j == f) {
            j = C10323vs.b;
        }
        return j;
    }

    public synchronized long d() {
        long c;
        try {
            long j = this.c;
            if (j != C10323vs.b) {
                c = j + this.b;
            } else {
                c = c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public synchronized long e() {
        return this.b;
    }

    public synchronized boolean f() {
        boolean z;
        if (this.b != C10323vs.b) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized void h(long j) {
        long j2;
        this.a = j;
        if (j == Long.MAX_VALUE) {
            j2 = 0;
        } else {
            j2 = -9223372036854775807L;
        }
        this.b = j2;
        this.c = C10323vs.b;
    }

    public synchronized void i(boolean z, long j, long j2) throws InterruptedException, TimeoutException {
        boolean z2;
        boolean z3;
        try {
            if (this.a == f) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9542sf.i(z2);
            if (f()) {
                return;
            }
            if (z) {
                this.d.set(Long.valueOf(j));
            } else {
                long j3 = 0;
                long j4 = j2;
                while (!f()) {
                    if (j2 == 0) {
                        wait();
                    } else {
                        if (j4 > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        C9542sf.i(z3);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        wait(j4);
                        j3 += SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (j3 >= j2 && !f()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j2 + " milliseconds");
                        }
                        j4 = j2 - j3;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
