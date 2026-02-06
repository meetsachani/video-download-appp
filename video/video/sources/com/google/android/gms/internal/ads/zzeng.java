package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeng implements zzetv {
    public final Executor a;
    public final zzbzn b;

    public zzeng(Executor executor, zzbzn zzbznVar) {
        this.a = executor;
        this.b = zzbznVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.g3)).booleanValue()) {
            return zzgcy.h(new zzenh(null));
        }
        return zzgcy.m(this.b.l(), new zzfur() { // from class: com.google.android.gms.internal.ads.zzenf
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                if (true == arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new zzenh(arrayList);
            }
        }, this.a);
    }
}
