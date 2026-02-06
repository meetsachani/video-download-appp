package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzerd implements zzetv {
    public final zzgdj a;
    public final zzfcp b;

    public zzerd(zzgdj zzgdjVar, zzfcp zzfcpVar) {
        this.a = zzgdjVar;
        this.b = zzfcpVar;
    }

    public static /* synthetic */ zzere c(zzerd zzerdVar) {
        return new zzere("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.c(zzerdVar.b.d)));
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzerc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerd.c(zzerd.this);
            }
        });
    }
}
