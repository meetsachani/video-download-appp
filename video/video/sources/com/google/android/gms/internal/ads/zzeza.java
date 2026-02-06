package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeza implements zzezl {
    @InterfaceC11300zs1
    public zzcuz a;

    @Override // com.google.android.gms.internal.ads.zzezl
    public final /* bridge */ /* synthetic */ InterfaceFutureC8411o11 a(zzezm zzezmVar, zzezk zzezkVar, @InterfaceC11300zs1 Object obj) {
        return c(zzezmVar, zzezkVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzezl
    @InterfaceC11300zs1
    /* renamed from: b */
    public final synchronized zzcuz f() {
        return this.a;
    }

    public final synchronized InterfaceFutureC8411o11 c(zzezm zzezmVar, zzezk zzezkVar, @InterfaceC11300zs1 zzcuz zzcuzVar) {
        zzcsb b;
        try {
            if (zzcuzVar != null) {
                this.a = zzcuzVar;
            } else {
                this.a = (zzcuz) zzezkVar.a(zzezmVar.b).h();
            }
            b = this.a.b();
        } catch (Throwable th) {
            throw th;
        }
        return b.h(b.i());
    }
}
