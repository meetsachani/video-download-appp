package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzerk implements zzetv {
    public final Context a;
    public final Intent b;

    public zzerk(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 60;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        com.google.android.gms.ads.internal.util.zze.k("HsdpMigrationSignal.produce");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.bd)).booleanValue()) {
            boolean z = false;
            try {
                if (this.b.resolveActivity(this.a.getPackageManager()) != null) {
                    com.google.android.gms.ads.internal.util.zze.k("HSDP intent is supported");
                    z = true;
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzv.t().x(e, "HsdpMigrationSignal.isHsdpMigrationSupported");
            }
            return zzgcy.h(new zzerl(Boolean.valueOf(z)));
        }
        return zzgcy.h(new zzerl(null));
    }
}
