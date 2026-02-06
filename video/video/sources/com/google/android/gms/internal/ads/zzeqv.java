package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeqv implements zzetv {
    public final zzgdj a;

    public zzeqv(zzgdj zzgdjVar) {
        this.a = zzgdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzequ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeqw(com.google.android.gms.ads.internal.zzv.y().b(), com.google.android.gms.ads.internal.zzv.y().m());
            }
        });
    }
}
