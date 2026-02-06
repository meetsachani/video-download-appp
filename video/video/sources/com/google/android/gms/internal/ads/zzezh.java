package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
final class zzezh {
    public final zzfec a;
    public final zzcuz b;
    public final Executor c;
    public zzezf d;

    public zzezh(zzfec zzfecVar, zzcuz zzcuzVar, Executor executor) {
        this.a = zzfecVar;
        this.b = zzcuzVar;
        this.c = executor;
    }

    public final InterfaceFutureC8411o11 c() {
        InterfaceFutureC8411o11 interfaceFutureC8411o11;
        zzezf zzezfVar = this.d;
        if (zzezfVar == null) {
            if (!((Boolean) zzbfc.a.e()).booleanValue()) {
                zzezf zzezfVar2 = new zzezf(null, e(), null);
                this.d = zzezfVar2;
                interfaceFutureC8411o11 = zzgcy.h(zzezfVar2);
            } else {
                zzgcp A = zzgcp.A(this.b.b().f(this.a.a()));
                zzeze zzezeVar = new zzeze(this);
                Executor executor = this.c;
                interfaceFutureC8411o11 = (zzgcp) zzgcy.e((zzgcp) zzgcy.m(A, zzezeVar, executor), zzdyq.class, new zzezd(this), executor);
            }
            return zzgcy.m(interfaceFutureC8411o11, new zzfur() { // from class: com.google.android.gms.internal.ads.zzezc
                @Override // com.google.android.gms.internal.ads.zzfur
                public final Object apply(Object obj) {
                    return (zzezf) obj;
                }
            }, this.c);
        }
        return zzgcy.h(zzezfVar);
    }

    @Deprecated
    public final zzfem e() {
        zzfcp e = this.b.e();
        return this.a.b(e.d, e.f, e.j);
    }
}
