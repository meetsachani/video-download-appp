package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzevv implements zzetv {
    public final zzgdj a;
    public final List b;

    public zzevv(zzbce zzbceVar, zzgdj zzgdjVar, List list) {
        this.a = zzgdjVar;
        this.b = list;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzevu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevw(zzevv.this.b);
            }
        });
    }
}
