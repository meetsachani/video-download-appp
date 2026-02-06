package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzdww implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;

    public zzdww(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
        this.d = zzhgeVar4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x004d, code lost:
        if (java.lang.Integer.toString(r6).equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.b(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.c(r2.d))) != false) goto L9;
     */
    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object b() {
        InterfaceFutureC8411o11 I2;
        final zzavl zzavlVar = (zzavl) this.a.b();
        final Context a = ((zzchi) this.b).a();
        zzfcp a2 = ((zzcvk) this.c).a();
        long longValue = ((Long) this.d.b()).longValue();
        zzgdj c = zzffn.c();
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.X2)).intValue();
        if (intValue != -1) {
        }
        if (com.google.android.gms.ads.internal.zzv.d().a() - longValue < ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Z2)).intValue()) {
            I2 = c.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzavl.this.c().c(a);
                }
            });
            zzhgd.b(I2);
            return I2;
        }
        I2 = c.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzavl.this.c().a(a);
            }
        });
        zzhgd.b(I2);
        return I2;
    }
}
