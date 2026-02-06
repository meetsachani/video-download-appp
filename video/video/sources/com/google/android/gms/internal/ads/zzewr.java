package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzewr implements zzetv {
    public final zzgdj a;

    public zzewr(zzgdj zzgdjVar) {
        this.a = zzgdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzewq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] split;
                HashMap hashMap = new HashMap();
                String str = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Z);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.a0)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            hashMap.put(str2, com.google.android.gms.ads.internal.util.zzcj.a(str2));
                        }
                    }
                }
                return new zzews(hashMap);
            }
        });
    }
}
