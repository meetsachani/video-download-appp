package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzero implements zzetv {
    public final zzgdj a;
    public final zzdvc b;

    public zzero(zzgdj zzgdjVar, zzdvc zzdvcVar) {
        this.a = zzgdjVar;
        this.b = zzdvcVar;
    }

    public static /* synthetic */ zzerp c(zzero zzeroVar) {
        zzdvc zzdvcVar = zzeroVar.b;
        return new zzerp(zzdvcVar.d(), zzdvcVar.s(), com.google.android.gms.ads.internal.zzv.y().l(), zzdvcVar.q(), zzdvcVar.t());
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzern
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzero.c(zzero.this);
            }
        });
    }
}
