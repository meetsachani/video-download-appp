package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzego extends zzegj {
    public final zzchb a;
    public final zzcva b;
    public final zzeja c;
    public final zzdbr d;
    public final zzegu e;
    public final zzedk f;

    public zzego(zzchb zzchbVar, zzcva zzcvaVar, zzeja zzejaVar, zzdbr zzdbrVar, zzegu zzeguVar, zzedk zzedkVar) {
        this.a = zzchbVar;
        this.b = zzcvaVar;
        this.c = zzejaVar;
        this.d = zzdbrVar;
        this.e = zzeguVar;
        this.f = zzedkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final InterfaceFutureC8411o11 c(zzfcp zzfcpVar, Bundle bundle, zzfbu zzfbuVar, zzfcg zzfcgVar) {
        zzcva zzcvaVar = this.b;
        zzcvaVar.k(zzfcpVar);
        zzcvaVar.g(bundle);
        zzcvaVar.h(new zzcut(zzfcgVar, zzfbuVar, this.e));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R3)).booleanValue()) {
            zzcvaVar.e(this.f);
        }
        zzdfz k = this.a.k();
        k.l(zzcvaVar.l());
        k.p(this.d);
        k.s(this.c);
        zzcsb a = k.e().a();
        return a.h(a.i());
    }
}
