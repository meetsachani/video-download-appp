package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import o.C10071up2;
import o.C10323vs;
import o.InterfaceC8710pF0;
import o.S9;

/* loaded from: classes2.dex */
public final class zzer {
    @InterfaceC8710pF0("this")
    public long a;
    @InterfaceC8710pF0("this")
    public long b;
    @InterfaceC8710pF0("this")
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public zzer(long j) {
        i(0L);
    }

    public static long g(long j) {
        return zzeu.P(j, 1000000L, 90000L, RoundingMode.DOWN);
    }

    public static long h(long j) {
        return zzeu.P(j, 90000L, 1000000L, RoundingMode.DOWN);
    }

    public final synchronized long a(long j) {
        if (j == C10323vs.b) {
            return C10323vs.b;
        }
        try {
            if (!j()) {
                long j2 = this.a;
                if (j2 == C10071up2.f) {
                    Long l = (Long) this.d.get();
                    if (l != null) {
                        j2 = l.longValue();
                    } else {
                        throw null;
                    }
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

    public final synchronized long b(long j) {
        if (j == C10323vs.b) {
            return C10323vs.b;
        }
        try {
            long j2 = this.c;
            if (j2 != C10323vs.b) {
                long h = h(j2);
                long j3 = (S9.c.M + h) / 8589934592L;
                long j4 = (((-1) + j3) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (Math.abs(j4 - h) < Math.abs(j - h)) {
                    j = j4;
                }
            }
            return a(g(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j) {
        if (j == C10323vs.b) {
            return C10323vs.b;
        }
        try {
            long j2 = this.c;
            if (j2 != C10323vs.b) {
                long h = h(j2);
                long j3 = h / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j += (j3 + 1) * 8589934592L;
                if (j4 >= h) {
                    j = j4;
                }
            }
            return a(g(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d() {
        long j = this.a;
        return (j == Long.MAX_VALUE || j == C10071up2.f) ? C10323vs.b : j;
    }

    public final synchronized long e() {
        long j;
        try {
            j = this.c;
        } catch (Throwable th) {
            throw th;
        }
        return j != C10323vs.b ? j + this.b : d();
    }

    public final synchronized long f() {
        return this.b;
    }

    public final synchronized void i(long j) {
        this.a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = C10323vs.b;
    }

    public final synchronized boolean j() {
        return this.b != C10323vs.b;
    }
}
