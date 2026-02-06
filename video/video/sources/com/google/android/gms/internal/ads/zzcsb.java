package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzcsb {
    public final zzdxu a;
    public final zzfcp b;
    public final zzfgt c;
    public final zzclb d;
    public final zzehb e;
    public final zzdbf f;
    @InterfaceC11300zs1
    public zzfcg g;
    public final zzdzc h;
    public final zzcuw i;
    public final Executor j;
    public final zzdyn k;
    public final zzedk l;

    public zzcsb(zzdxu zzdxuVar, zzfcp zzfcpVar, zzfgt zzfgtVar, zzclb zzclbVar, zzehb zzehbVar, zzdbf zzdbfVar, @InterfaceC11300zs1 zzfcg zzfcgVar, zzdzc zzdzcVar, zzcuw zzcuwVar, Executor executor, zzdyn zzdynVar, zzedk zzedkVar) {
        this.a = zzdxuVar;
        this.b = zzfcpVar;
        this.c = zzfgtVar;
        this.d = zzclbVar;
        this.e = zzehbVar;
        this.f = zzdbfVar;
        this.g = zzfcgVar;
        this.h = zzdzcVar;
        this.i = zzcuwVar;
        this.j = executor;
        this.k = zzdynVar;
        this.l = zzedkVar;
    }

    public static /* synthetic */ zzfcg d(zzcsb zzcsbVar, zzfcg zzfcgVar) {
        zzcsbVar.d.a(zzfcgVar);
        return zzfcgVar;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 e(zzcsb zzcsbVar, zzfej zzfejVar, zzbvl zzbvlVar) {
        zzbvlVar.d1 = zzfejVar;
        return zzcsbVar.h.e(zzbvlVar);
    }

    public final com.google.android.gms.ads.internal.client.zze a(Throwable th) {
        return zzfdq.b(th, this.l);
    }

    public final zzdbf c() {
        return this.f;
    }

    public final InterfaceFutureC8411o11 f(final zzfej zzfejVar) {
        zzffz a = this.c.b(zzfgn.GET_CACHE_KEY, this.i.c()).f(new zzgcf() { // from class: com.google.android.gms.internal.ads.zzcrx
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzcsb.e(zzcsb.this, zzfejVar, (zzbvl) obj);
            }
        }).a();
        zzgcy.r(a, new zzcrz(this), this.j);
        return a;
    }

    public final InterfaceFutureC8411o11 g(zzbvl zzbvlVar) {
        zzffz a = this.c.b(zzfgn.NOTIFY_CACHE_HIT, this.h.f(zzbvlVar)).a();
        zzgcy.r(a, new zzcsa(this), this.j);
        return a;
    }

    public final InterfaceFutureC8411o11 h(InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        zzfgj f = this.c.b(zzfgn.RENDERER, interfaceFutureC8411o11).e(new zzffx() { // from class: com.google.android.gms.internal.ads.zzcrw
            @Override // com.google.android.gms.internal.ads.zzffx
            public final Object b(Object obj) {
                zzfcg zzfcgVar = (zzfcg) obj;
                zzcsb.d(zzcsb.this, zzfcgVar);
                return zzfcgVar;
            }
        }).f(this.e);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O5)).booleanValue()) {
            f = f.i(((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P5)).intValue(), TimeUnit.SECONDS);
        }
        return f.a();
    }

    public final InterfaceFutureC8411o11 i() {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.b.d;
        if (zzmVar.s1 == null && zzmVar.n1 == null) {
            return j(this.i.c());
        }
        zzfgt zzfgtVar = this.c;
        zzdxu zzdxuVar = this.a;
        return zzfgd.c(zzdxuVar.e(), zzfgn.PRELOADED_LOADER, zzfgtVar).a();
    }

    public final InterfaceFutureC8411o11 j(InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        zzfcg zzfcgVar = this.g;
        if (zzfcgVar != null) {
            zzfgt zzfgtVar = this.c;
            return zzfgd.c(zzgcy.h(zzfcgVar), zzfgn.SERVER_TRANSACTION, zzfgtVar).a();
        }
        com.google.android.gms.ads.internal.zzv.g().j();
        zzfgj b = this.c.b(zzfgn.SERVER_TRANSACTION, interfaceFutureC8411o11);
        final zzdyn zzdynVar = this.k;
        Objects.requireNonNull(zzdynVar);
        return b.f(new zzgcf() { // from class: com.google.android.gms.internal.ads.zzcry
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzdyn.this.a((zzbvl) obj);
            }
        }).a();
    }

    public final void k(zzfcg zzfcgVar) {
        this.g = zzfcgVar;
    }
}
