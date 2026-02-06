package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeot implements zzetv {
    public final zzgdj a;
    public final zzdpy b;
    public final String c;
    public final zzfcp d;

    public zzeot(zzgdj zzgdjVar, zzdpy zzdpyVar, zzfcp zzfcpVar, String str) {
        this.a = zzgdjVar;
        this.b = zzdpyVar;
        this.d = zzfcpVar;
        this.c = str;
    }

    public static /* synthetic */ zzeou c(zzeot zzeotVar) {
        zzfcp zzfcpVar = zzeotVar.d;
        zzdpy zzdpyVar = zzeotVar.b;
        return new zzeou(zzdpyVar.b(zzfcpVar.f, zzeotVar.c), zzdpyVar.a());
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzeos
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeot.c(zzeot.this);
            }
        });
    }
}
