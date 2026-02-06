package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Random;

/* loaded from: classes2.dex */
public final class zzfjx {
    public final long a;
    public final long b;
    public long e;
    public long d = 5;
    public final Random f = new Random();
    public long c = 0;

    public zzfjx(long j, double d, long j2, double d2) {
        this.a = j;
        this.b = j2;
        c();
    }

    public final long a() {
        double d;
        long j;
        double d2 = this.e;
        return ((long) (d2 - (0.2d * d2))) + ((long) (this.f.nextDouble() * ((((long) (d2 + d)) - j) + 1)));
    }

    public final void b() {
        double d = this.e;
        this.e = Math.min((long) (d + d), this.b);
        this.c++;
    }

    public final void c() {
        this.e = this.a;
        this.c = 0L;
    }

    public final synchronized void d(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.a(z);
        this.d = i;
    }

    public final boolean e() {
        if (this.c > Math.max(this.d, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C)).intValue()) && this.e >= this.b) {
            return true;
        }
        return false;
    }
}
