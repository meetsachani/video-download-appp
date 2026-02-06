package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;
import o.C10977yY;
import o.InterfaceC11300zs1;
import o.UE;

/* loaded from: classes2.dex */
public final class zzdne implements zzbjw {
    @InterfaceC11300zs1
    public final zzbhk a;
    public final zzdns b;
    public final zzhfp c;

    public zzdne(zzdiz zzdizVar, zzdio zzdioVar, zzdns zzdnsVar, zzhfp zzhfpVar) {
        this.a = zzdizVar.c(zzdioVar.a());
        this.b = zzdnsVar;
        this.c = zzhfpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        String str = (String) map.get(C10977yY.n);
        try {
            this.a.T3((zzbha) this.c.b(), str);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Failed to call onCustomClick for asset " + str + UE.h, e);
        }
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        this.b.l("/nativeAdCustomClick", this);
    }
}
