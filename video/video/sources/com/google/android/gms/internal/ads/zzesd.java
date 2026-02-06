package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzesd implements zzetv {
    @InterfaceC11300zs1
    public static String c;
    public final zzgdj a;
    public final Context b;

    public zzesd(zzgdj zzgdjVar, Context context) {
        this.a = zzgdjVar;
        this.b = context;
    }

    public static /* synthetic */ zzese c(zzesd zzesdVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w5)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.F5)).booleanValue()) {
                if (c == null) {
                    c = com.google.android.gms.ads.internal.zzv.c().a(zzesdVar.b);
                }
                return new zzese(c);
            }
            return new zzese(com.google.android.gms.ads.internal.zzv.c().a(zzesdVar.b));
        }
        return new zzese(null);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzesc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesd.c(zzesd.this);
            }
        });
    }
}
