package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbyc {
    public Context a;
    public Clock b;
    public com.google.android.gms.ads.internal.util.zzg c;
    public zzbyj d;

    private zzbyc() {
        throw null;
    }

    public final zzbyc a(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.c = zzgVar;
        return this;
    }

    public final zzbyc b(Context context) {
        context.getClass();
        this.a = context;
        return this;
    }

    public final zzbyc c(Clock clock) {
        clock.getClass();
        this.b = clock;
        return this;
    }

    public final zzbyc d(zzbyj zzbyjVar) {
        this.d = zzbyjVar;
        return this;
    }

    public final zzbyk e() {
        zzhgd.c(this.a, Context.class);
        zzhgd.c(this.b, Clock.class);
        zzhgd.c(this.c, com.google.android.gms.ads.internal.util.zzg.class);
        zzhgd.c(this.d, zzbyj.class);
        return new zzbyd(this.a, this.b, this.c, this.d);
    }

    public /* synthetic */ zzbyc(zzbye zzbyeVar) {
    }
}
