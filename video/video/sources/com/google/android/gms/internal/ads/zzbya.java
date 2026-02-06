package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzbya {
    public final Clock a;
    public final zzbxy b;

    public zzbya(Clock clock, zzbxy zzbxyVar) {
        this.a = clock;
        this.b = zzbxyVar;
    }

    public static zzbya a(Context context) {
        return zzbyk.b(context).a();
    }

    public final void b(int i, long j) {
        this.b.a(i, j);
    }

    public final void c(com.google.android.gms.ads.internal.client.zzfr zzfrVar) {
        this.b.a(-1, this.a.a());
    }

    public final void d() {
        this.b.a(-1, this.a.a());
    }
}
