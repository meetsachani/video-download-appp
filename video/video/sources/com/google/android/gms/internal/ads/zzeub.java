package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeub implements zzetv {
    public final Context a;
    public final zzgdj b;

    public zzeub(Context context, zzgdj zzgdjVar) {
        this.a = context;
        this.b = zzgdjVar;
    }

    public static /* synthetic */ zzeuc c(zzeub zzeubVar) {
        Context context = zzeubVar.a;
        return new zzeuc(zzbcf.b(context), zzbcf.a(context));
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        if (((Boolean) zzben.b.e()).booleanValue()) {
            return this.b.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzeua
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzeub.c(zzeub.this);
                }
            });
        }
        return zzgcy.h(new zzeuc(-1, -1));
    }
}
