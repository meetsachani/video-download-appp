package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzevj implements zzetv {
    public final zzgdj a;

    public zzevj(zzbbi zzbbiVar, zzgdj zzgdjVar, Context context) {
        this.a = zzgdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzevi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevk(new JSONObject());
            }
        });
    }
}
