package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzegk extends zzegj {
    public final zzchb a;
    public final zzcva b;
    public final zzdbr c;
    public final zzegu d;
    public final zzedk e;

    public zzegk(zzchb zzchbVar, zzcva zzcvaVar, zzdbr zzdbrVar, zzegu zzeguVar, zzedk zzedkVar) {
        this.a = zzchbVar;
        this.b = zzcvaVar;
        this.c = zzdbrVar;
        this.d = zzeguVar;
        this.e = zzedkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final InterfaceFutureC8411o11 c(zzfcp zzfcpVar, Bundle bundle, zzfbu zzfbuVar, zzfcg zzfcgVar) {
        zzcva zzcvaVar = this.b;
        zzcvaVar.k(zzfcpVar);
        zzcvaVar.g(bundle);
        zzcvaVar.h(new zzcut(zzfcgVar, zzfbuVar, this.d));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R3)).booleanValue()) {
            zzcvaVar.e(this.e);
        }
        zzcoc h = this.a.h();
        h.a(zzcvaVar.l());
        h.f(this.c);
        zzcsb b = h.d().b();
        return b.h(b.i());
    }
}
