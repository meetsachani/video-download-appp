package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzenc implements zzetv {
    public final zzgdj a;
    public final zzfcp b;
    public final zzbzr c;

    public zzenc(zzgdj zzgdjVar, zzfcp zzfcpVar, zzbzr zzbzrVar) {
        this.a = zzgdjVar;
        this.b = zzfcpVar;
        this.c = zzbzrVar;
    }

    public static /* synthetic */ zzend c(zzenc zzencVar) {
        return new zzend(zzencVar.b.j, zzencVar.c.l());
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzenb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenc.c(zzenc.this);
            }
        });
    }
}
