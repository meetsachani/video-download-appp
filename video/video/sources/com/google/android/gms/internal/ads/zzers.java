package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzers implements zzetv {
    public final zzgdj a;

    public zzers(zzgdj zzgdjVar) {
        this.a = zzgdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzerr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", com.google.android.gms.ads.internal.zzv.t().c());
                return new zzert(bundle);
            }
        });
    }
}
