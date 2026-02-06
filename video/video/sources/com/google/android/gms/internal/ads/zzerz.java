package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Callable;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzerz implements zzetv {
    public final zzgdj a;
    public final zzfcp b;
    @InterfaceC11300zs1
    public final PackageInfo c;
    public final com.google.android.gms.ads.internal.util.zzg d;

    public zzerz(zzgdj zzgdjVar, zzfcp zzfcpVar, @InterfaceC11300zs1 PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.a = zzgdjVar;
        this.b = zzfcpVar;
        this.c = packageInfo;
        this.d = zzgVar;
    }

    public static /* synthetic */ zzesa c(zzerz zzerzVar) {
        return new zzesa(zzerzVar.b, zzerzVar.c, zzerzVar.d);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzery
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerz.c(zzerz.this);
            }
        });
    }
}
