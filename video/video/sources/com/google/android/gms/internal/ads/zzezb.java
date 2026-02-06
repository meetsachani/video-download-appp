package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzezb implements zzezl {
    public final zzezl a;
    @InterfaceC11300zs1
    public zzcuz b;

    public zzezb(zzezl zzezlVar) {
        this.a = zzezlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezl
    public final /* bridge */ /* synthetic */ InterfaceFutureC8411o11 a(zzezm zzezmVar, zzezk zzezkVar, @InterfaceC11300zs1 Object obj) {
        return c(zzezmVar, zzezkVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzezl
    @InterfaceC11300zs1
    /* renamed from: b */
    public final synchronized zzcuz f() {
        return this.b;
    }

    public final synchronized InterfaceFutureC8411o11 c(zzezm zzezmVar, zzezk zzezkVar, @InterfaceC11300zs1 zzcuz zzcuzVar) {
        zzbvl zzbvlVar;
        this.b = zzcuzVar;
        if (zzcuzVar != null && (zzbvlVar = zzezmVar.a) != null) {
            zzcsb b = zzcuzVar.b();
            return b.h(b.j(zzgcy.h(zzbvlVar)));
        }
        return ((zzeza) this.a).c(zzezmVar, zzezkVar, zzcuzVar);
    }
}
