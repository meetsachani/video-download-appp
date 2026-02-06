package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzegm extends zzegj {
    public final zzchb a;
    public final zzcva b;
    public final zzeja c;
    public final zzdbr d;
    public final zzdgr e;
    public final zzcyq f;
    @InterfaceC11300zs1
    public final ViewGroup g;
    @InterfaceC11300zs1
    public final zzdaw h;
    public final zzegu i;
    public final zzedk j;

    public zzegm(zzchb zzchbVar, zzcva zzcvaVar, zzeja zzejaVar, zzdbr zzdbrVar, zzdgr zzdgrVar, zzcyq zzcyqVar, @InterfaceC11300zs1 ViewGroup viewGroup, @InterfaceC11300zs1 zzdaw zzdawVar, zzegu zzeguVar, zzedk zzedkVar) {
        this.a = zzchbVar;
        this.b = zzcvaVar;
        this.c = zzejaVar;
        this.d = zzdbrVar;
        this.e = zzdgrVar;
        this.f = zzcyqVar;
        this.g = viewGroup;
        this.h = zzdawVar;
        this.i = zzeguVar;
        this.j = zzedkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final InterfaceFutureC8411o11 c(zzfcp zzfcpVar, Bundle bundle, zzfbu zzfbuVar, zzfcg zzfcgVar) {
        zzcva zzcvaVar = this.b;
        zzcvaVar.k(zzfcpVar);
        zzcvaVar.g(bundle);
        zzcvaVar.h(new zzcut(zzfcgVar, zzfbuVar, this.i));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R3)).booleanValue()) {
            zzcvaVar.e(this.j);
        }
        zzcpt i = this.a.i();
        i.i(zzcvaVar.l());
        i.m(this.d);
        i.q(this.c);
        i.b(this.e);
        i.r(new zzcqp(this.f, this.h));
        i.c(new zzcom(this.g));
        zzcsb c = i.k().c();
        return c.h(c.i());
    }
}
