package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzerw implements zzetu {
    public final zzfbt a;

    public zzerw(zzfbt zzfbtVar) {
        this.a = zzfbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzcuv zzcuvVar = (zzcuv) obj;
        zzfbt zzfbtVar = this.a;
        if (zzfbtVar != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.kc)).booleanValue()) {
                Bundle bundle = zzcuvVar.a;
                bundle.putBoolean("render_in_browser", zzfbtVar.d());
                bundle.putBoolean("disable_ml", zzfbtVar.c());
            }
        }
    }
}
