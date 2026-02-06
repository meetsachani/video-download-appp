package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeyx implements zzezl {
    public final zzfec a;
    public final Executor b;
    public final zzgcu c = new zzeyv(this);

    public zzeyx(zzfec zzfecVar, Executor executor) {
        this.a = zzfecVar;
        this.b = executor;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 b(zzeyx zzeyxVar, zzcuz zzcuzVar, zzezf zzezfVar) {
        zzfec zzfecVar = zzeyxVar.a;
        zzfem zzfemVar = zzezfVar.b;
        zzbvl zzbvlVar = zzezfVar.a;
        zzfel e = zzfecVar.e(zzfemVar);
        if (e != null && zzbvlVar != null) {
            zzgcy.r(zzcuzVar.b().g(zzbvlVar), zzeyxVar.c, zzeyxVar.b);
        }
        return zzgcy.h(new zzeyw(zzfemVar, zzbvlVar, e));
    }

    @Override // com.google.android.gms.internal.ads.zzezl
    public final /* bridge */ /* synthetic */ InterfaceFutureC8411o11 a(zzezm zzezmVar, zzezk zzezkVar, Object obj) {
        return c(zzezmVar, zzezkVar, null);
    }

    public final InterfaceFutureC8411o11 c(zzezm zzezmVar, zzezk zzezkVar, final zzcuz zzcuzVar) {
        zzfec zzfecVar = this.a;
        Executor executor = this.b;
        return (zzgcp) zzgcy.e((zzgcp) zzgcy.n(zzgcp.A(new zzezh(zzfecVar, zzcuzVar, executor).c()), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzeyt
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzeyx.b(zzeyx.this, zzcuzVar, (zzezf) obj);
            }
        }, executor), Exception.class, new zzeyu(this), executor);
    }

    @Override // com.google.android.gms.internal.ads.zzezl
    public final /* bridge */ /* synthetic */ Object f() {
        return null;
    }
}
