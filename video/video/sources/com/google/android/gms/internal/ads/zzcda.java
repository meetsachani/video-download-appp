package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzcda extends com.google.android.gms.ads.internal.util.zzb {
    public final zzcbw c;
    public final zzcdi d;
    public final String e;
    public final String[] f;

    public zzcda(zzcbw zzcbwVar, zzcdi zzcdiVar, String str, String[] strArr) {
        this.c = zzcbwVar;
        this.d = zzcdiVar;
        this.e = str;
        this.f = strArr;
        com.google.android.gms.ads.internal.zzv.a().e(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void a() {
        try {
            this.d.x(this.e, this.f);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.l.post(new zzccz(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final InterfaceFutureC8411o11 b() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.i2)).booleanValue() && (this.d instanceof zzcdr)) {
            return zzcaa.f.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzccy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(r0.d.y(r0.e, r0.f, zzcda.this));
                    return valueOf;
                }
            });
        }
        return super.b();
    }

    public final String e() {
        return this.e;
    }
}
