package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzets implements zzetv {
    public final zzgdj a;
    public final Context b;

    public zzets(zzgdj zzgdjVar, Context context) {
        this.a = zzgdjVar;
        this.b = context;
    }

    public static /* synthetic */ zzetr c(zzets zzetsVar) {
        zzbcm zzbcmVar = zzbcv.o6;
        return new zzetr(com.google.android.gms.ads.internal.util.zzad.b(zzetsVar.b, (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)));
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzetq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzets.c(zzets.this);
            }
        });
    }
}
