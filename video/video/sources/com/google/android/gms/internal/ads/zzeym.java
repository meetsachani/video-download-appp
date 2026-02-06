package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeym implements zzezl {
    public zzcuz a;
    public final Executor b = zzgdq.c();

    @Override // com.google.android.gms.internal.ads.zzezl
    public final /* bridge */ /* synthetic */ InterfaceFutureC8411o11 a(zzezm zzezmVar, zzezk zzezkVar, @InterfaceC11300zs1 Object obj) {
        return c(zzezmVar, zzezkVar, null);
    }

    public final zzcuz b() {
        return this.a;
    }

    public final InterfaceFutureC8411o11 c(zzezm zzezmVar, zzezk zzezkVar, @InterfaceC11300zs1 zzcuz zzcuzVar) {
        zzcuy a = zzezkVar.a(zzezmVar.b);
        a.u(new zzezp(true));
        zzcuz zzcuzVar2 = (zzcuz) a.h();
        this.a = zzcuzVar2;
        final zzcsb b = zzcuzVar2.b();
        final zzfel zzfelVar = new zzfel();
        zzgcp A = zzgcp.A(b.i());
        zzgcf zzgcfVar = new zzgcf(this) { // from class: com.google.android.gms.internal.ads.zzeyk
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                zzfcg zzfcgVar = (zzfcg) obj;
                zzfelVar.b = zzfcgVar;
                Iterator it = zzfcgVar.b.a.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        for (String str : ((zzfbu) it.next()).a) {
                            if (!str.contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return b.h(zzgcy.h(zzfcgVar));
                    }
                }
                return zzgcy.h(null);
            }
        };
        Executor executor = this.b;
        return (zzgcp) zzgcy.m((zzgcp) zzgcy.n(A, zzgcfVar, executor), new zzfur() { // from class: com.google.android.gms.internal.ads.zzeyl
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                zzfel zzfelVar2 = zzfel.this;
                zzfelVar2.c = (zzcqx) obj;
                return zzfelVar2;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzezl
    public final /* synthetic */ Object f() {
        return this.a;
    }
}
