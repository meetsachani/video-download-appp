package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzema implements zzetv {
    public final zzgdj a;
    public final zzfcp b;
    public final int c;

    public zzema(zzgdj zzgdjVar, zzfcp zzfcpVar, zzfde zzfdeVar, int i) {
        this.a = zzgdjVar;
        this.b = zzfcpVar;
        this.c = i;
    }

    public static /* synthetic */ zzemb c(zzema zzemaVar) {
        boolean equals;
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.i7)).booleanValue()) {
            zzfcp zzfcpVar = zzemaVar.b;
            if (zzemaVar.c != 2) {
                String c = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.c(zzfcpVar.d);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j7)).booleanValue()) {
                    equals = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.k7)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.b(c));
                } else {
                    equals = Objects.equals(c, "requester_type_2");
                }
                if (equals) {
                    str = zzfde.a();
                }
            }
        }
        return new zzemb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzema.c(zzema.this);
            }
        });
    }
}
