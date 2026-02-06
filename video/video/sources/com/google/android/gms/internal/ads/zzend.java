package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o.C10901yE;

/* loaded from: classes2.dex */
public final class zzend implements zzetu {
    public final com.google.android.gms.ads.internal.client.zzx a;
    public final boolean b;

    public zzend(com.google.android.gms.ads.internal.client.zzx zzxVar, boolean z) {
        this.a = zzxVar;
        this.b = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.G5)).booleanValue()) {
            bundle.putBoolean("app_switched", this.b);
        }
        com.google.android.gms.ads.internal.client.zzx zzxVar = this.a;
        if (zzxVar != null) {
            int i = zzxVar.X;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", C10901yE.l);
            }
        }
    }
}
