package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzele {
    public final zzdiz a;
    public final zzekr b;
    public final zzcvw c;

    public zzele(zzdiz zzdizVar, zzdsd zzdsdVar) {
        this.a = zzdizVar;
        final zzekr zzekrVar = new zzekr(zzdsdVar);
        this.b = zzekrVar;
        final zzbmp g = zzdizVar.g();
        this.c = new zzcvw() { // from class: com.google.android.gms.internal.ads.zzeld
            @Override // com.google.android.gms.internal.ads.zzcvw
            public final void C0(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzekr.this.C0(zzeVar);
                zzbmp zzbmpVar = g;
                if (zzbmpVar != null) {
                    try {
                        zzbmpVar.G(zzeVar);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
                    }
                }
                if (zzbmpVar != null) {
                    try {
                        zzbmpVar.E(zzeVar.X);
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final zzcvw a() {
        return this.c;
    }

    public final zzcxh b() {
        return this.b;
    }

    public final zzdgr c() {
        return new zzdgr(this.a, this.b.g());
    }

    public final zzekr d() {
        return this.b;
    }

    public final void e(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.b.q(zzbkVar);
    }
}
