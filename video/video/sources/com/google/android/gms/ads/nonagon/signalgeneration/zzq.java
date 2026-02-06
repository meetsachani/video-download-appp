package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzq {
    @InterfaceC11300zs1
    public final QueryInfo a;
    public final String b;
    public final long c;
    public final int d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public zzq(@InterfaceC11300zs1 QueryInfo queryInfo, String str, long j, int i) {
        this.a = queryInfo;
        this.b = str;
        this.c = j;
        this.d = i;
    }

    public final int a() {
        return this.d;
    }

    @InterfaceC11300zs1
    public final QueryInfo b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final void d() {
        this.e.set(true);
    }

    public final boolean e() {
        if (this.c <= com.google.android.gms.ads.internal.zzv.d().a()) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.e.get();
    }
}
