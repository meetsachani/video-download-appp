package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o.InterfaceC10571ws1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzegq extends zzegj {
    public final zzchb a;
    public final zzcva b;
    public final zzdbr c;
    public final zzegu d;
    @InterfaceC10571ws1
    public final zzfch e;
    public final zzedk f;

    public zzegq(zzchb zzchbVar, zzcva zzcvaVar, zzdbr zzdbrVar, @InterfaceC10571ws1 zzfch zzfchVar, zzegu zzeguVar, zzedk zzedkVar) {
        this.a = zzchbVar;
        this.b = zzcvaVar;
        this.c = zzdbrVar;
        this.e = zzfchVar;
        this.d = zzeguVar;
        this.f = zzedkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final InterfaceFutureC8411o11 c(zzfcp zzfcpVar, Bundle bundle, zzfbu zzfbuVar, zzfcg zzfcgVar) {
        zzfch zzfchVar;
        zzcva zzcvaVar = this.b;
        zzcvaVar.k(zzfcpVar);
        zzcvaVar.g(bundle);
        zzcvaVar.h(new zzcut(zzfcgVar, zzfbuVar, this.d));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q3)).booleanValue() && (zzfchVar = this.e) != null) {
            zzcvaVar.j(zzfchVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R3)).booleanValue()) {
            zzcvaVar.e(this.f);
        }
        zzdol m = this.a.m();
        m.a(zzcvaVar.l());
        m.f(this.c);
        zzcsb b = m.d().b();
        return b.h(b.i());
    }
}
