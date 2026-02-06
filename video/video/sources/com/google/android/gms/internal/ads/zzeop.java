package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeop implements zzetv {
    public final zzgdj a;

    public zzeop(zzgdj zzgdjVar) {
        this.a = zzgdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeoo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeoq(com.google.android.gms.ads.internal.zzv.d().a() - com.google.android.gms.ads.internal.zzv.t().j().g().a());
            }
        });
    }
}
