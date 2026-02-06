package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzegh extends zzegj {
    public final zzchb a;
    public final zzdgr b;
    public final zzcva c;
    public final zzdbr d;
    public final zzegu e;
    public final zzedk f;

    public zzegh(zzchb zzchbVar, zzdgr zzdgrVar, zzcva zzcvaVar, zzdbr zzdbrVar, zzegu zzeguVar, zzedk zzedkVar) {
        this.a = zzchbVar;
        this.b = zzdgrVar;
        this.c = zzcvaVar;
        this.d = zzdbrVar;
        this.e = zzeguVar;
        this.f = zzedkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final InterfaceFutureC8411o11 c(zzfcp zzfcpVar, Bundle bundle, zzfbu zzfbuVar, zzfcg zzfcgVar) {
        zzcva zzcvaVar = this.c;
        zzcvaVar.k(zzfcpVar);
        zzcvaVar.g(bundle);
        zzcvaVar.h(new zzcut(zzfcgVar, zzfbuVar, this.e));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R3)).booleanValue()) {
            zzcvaVar.e(this.f);
        }
        zzdgv l = this.a.l();
        l.j(zzcvaVar.l());
        l.n(this.d);
        l.b(this.b);
        l.c(new zzcom(null));
        zzcsb a = l.g().a();
        return a.h(a.i());
    }
}
