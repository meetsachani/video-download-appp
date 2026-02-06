package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzemy implements zzetv {
    public final Context a;
    public final zzgdj b;

    public zzemy(zzgdj zzgdjVar, Context context) {
        this.b = zzgdjVar;
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ed)).booleanValue()) {
            return zzgcy.h(new zzemz(null, false));
        }
        final ContentResolver contentResolver = this.a.getContentResolver();
        if (contentResolver == null) {
            return zzgcy.h(new zzemz(null, false));
        }
        return this.b.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzemx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ContentResolver contentResolver2 = contentResolver;
                String string = Settings.Secure.getString(contentResolver2, "advertising_id");
                boolean z = false;
                if (Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1) {
                    z = true;
                }
                return new zzemz(string, z);
            }
        });
    }
}
