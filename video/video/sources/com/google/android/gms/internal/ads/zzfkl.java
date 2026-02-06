package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzfkl {
    public final Object a;
    public final long b;
    public final Clock c;
    public final long d = ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D)).longValue() * 1000;

    public zzfkl(Object obj, Clock clock) {
        this.a = obj;
        this.c = clock;
        this.b = clock.a();
    }

    public final long a() {
        return (this.d + Math.min(Math.max(((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y)).longValue(), -900000L), 10000L)) - (this.c.a() - this.b);
    }

    public final long b() {
        return this.b;
    }

    public final Object c() {
        return this.a;
    }

    public final boolean d() {
        if (this.c.a() >= this.b + this.d) {
            return true;
        }
        return false;
    }
}
