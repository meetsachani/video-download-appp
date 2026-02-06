package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbca;
import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeyr implements zzezl {
    public final zzezl a;
    public final zzezl b;
    public final zzfey c;
    public final String d;
    public zzcuz e;
    public final Executor f;

    public zzeyr(zzezl zzezlVar, zzezl zzezlVar2, zzfey zzfeyVar, String str, Executor executor) {
        this.a = zzezlVar;
        this.b = zzezlVar2;
        this.c = zzfeyVar;
        this.d = str;
        this.f = executor;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 c(final zzeyr zzeyrVar, zzezm zzezmVar, zzeyq zzeyqVar, zzezk zzezkVar, zzcuz zzcuzVar, zzeyw zzeywVar) {
        if (zzeywVar != null) {
            zzeyq zzeyqVar2 = new zzeyq(zzeyqVar.a, zzeyqVar.b, zzeyqVar.c, zzeyqVar.d, zzeyqVar.e, zzeyqVar.f, zzeywVar.a);
            zzfel zzfelVar = zzeywVar.c;
            if (zzfelVar != null) {
                zzeyrVar.e = null;
                zzeyrVar.c.f(zzeyqVar2);
                return zzeyrVar.g(zzfelVar, zzezmVar);
            }
            zzfey zzfeyVar = zzeyrVar.c;
            InterfaceFutureC8411o11 a = zzfeyVar.a(zzeyqVar2);
            if (a != null) {
                zzeyrVar.e = null;
                return zzgcy.n(a, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzeyn
                    @Override // com.google.android.gms.internal.ads.zzgcf
                    public final InterfaceFutureC8411o11 b(Object obj) {
                        return zzeyr.d(zzeyr.this, (zzfev) obj);
                    }
                }, zzeyrVar.f);
            }
            zzfeyVar.f(zzeyqVar2);
            zzezmVar = new zzezm(zzezmVar.b, zzeywVar.b);
        }
        InterfaceFutureC8411o11 c = ((zzezb) zzeyrVar.a).c(zzezmVar, zzezkVar, zzcuzVar);
        zzeyrVar.e = zzcuzVar;
        return c;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 d(zzeyr zzeyrVar, zzfev zzfevVar) {
        zzfel zzfelVar;
        zzfex zzfexVar;
        if (zzfevVar != null && (zzfelVar = zzfevVar.a) != null && (zzfexVar = zzfevVar.b) != null) {
            zzbca.zzb.zzc D2 = zzbca.zzb.D2();
            zzbca.zzb.zza.C0107zza G2 = zzbca.zzb.zza.G2();
            G2.d2(zzbca.zzb.zzd.IN_MEMORY);
            G2.f2(zzbca.zzb.zze.z2());
            D2.Z1(G2);
            zzfelVar.a.b().c().r0(D2.V1());
            return zzeyrVar.g(zzfelVar, ((zzeyq) zzfexVar).b);
        }
        throw new zzdwf(1, "Empty prefetch");
    }

    @Override // com.google.android.gms.internal.ads.zzezl
    public final /* bridge */ /* synthetic */ InterfaceFutureC8411o11 a(zzezm zzezmVar, zzezk zzezkVar, Object obj) {
        return e(zzezmVar, zzezkVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzezl
    /* renamed from: b */
    public final synchronized zzcuz f() {
        return this.e;
    }

    public final synchronized InterfaceFutureC8411o11 e(final zzezm zzezmVar, final zzezk zzezkVar, zzcuz zzcuzVar) {
        zzcuy a = zzezkVar.a(zzezmVar.b);
        a.o(new zzeys(this.d));
        final zzcuz zzcuzVar2 = (zzcuz) a.h();
        zzcuzVar2.e();
        zzcuzVar2.e();
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzcuzVar2.e().d;
        if (zzmVar.n1 == null && zzmVar.s1 == null) {
            zzfcp e = zzcuzVar2.e();
            com.google.android.gms.ads.internal.client.zzm zzmVar2 = e.d;
            String str = e.f;
            com.google.android.gms.ads.internal.client.zzx zzxVar = e.j;
            Executor executor = this.f;
            final zzeyq zzeyqVar = new zzeyq(zzezkVar, zzezmVar, zzmVar2, str, executor, zzxVar, null);
            return (zzgcp) zzgcy.n(zzgcp.A(((zzeyx) this.b).c(zzezmVar, zzezkVar, zzcuzVar2)), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzeyo
                @Override // com.google.android.gms.internal.ads.zzgcf
                public final InterfaceFutureC8411o11 b(Object obj) {
                    return zzeyr.c(zzeyr.this, zzezmVar, zzeyqVar, zzezkVar, zzcuzVar2, (zzeyw) obj);
                }
            }, executor);
        }
        this.e = zzcuzVar2;
        return ((zzezb) this.a).c(zzezmVar, zzezkVar, zzcuzVar2);
    }

    public final InterfaceFutureC8411o11 g(zzfel zzfelVar, zzezm zzezmVar) {
        zzcuz zzcuzVar = zzfelVar.a;
        this.e = zzcuzVar;
        if (zzfelVar.c != null) {
            if (zzcuzVar.d() != null) {
                zzfelVar.c.f().n(zzfelVar.a.d());
            }
            return zzgcy.h(zzfelVar.c);
        }
        zzcuzVar.b().k(zzfelVar.b);
        return ((zzezb) this.a).c(zzezmVar, null, zzfelVar.a);
    }
}
