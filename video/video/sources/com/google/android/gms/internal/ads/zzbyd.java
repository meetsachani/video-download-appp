package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbyd extends zzbyk {
    public final Clock b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;
    public final zzhge f;
    public final zzhge g;
    public final zzhge h;
    public final zzhge i;
    public final zzhge j;

    public zzbyd(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbyj zzbyjVar) {
        this.b = clock;
        zzhfv a = zzhfw.a(context);
        this.c = a;
        zzhfv a2 = zzhfw.a(zzgVar);
        this.d = a2;
        this.e = zzhfu.c(new zzbxx(a, a2));
        zzhfv a3 = zzhfw.a(clock);
        this.f = a3;
        zzhfv a4 = zzhfw.a(zzbyjVar);
        this.g = a4;
        zzhge c = zzhfu.c(new zzbxz(a3, a2, a4));
        this.h = c;
        zzbyb zzbybVar = new zzbyb(a3, c);
        this.i = zzbybVar;
        this.j = zzhfu.c(new zzbyp(a, zzbybVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final zzbya a() {
        return new zzbya(this.b, (zzbxy) this.h.b());
    }
}
