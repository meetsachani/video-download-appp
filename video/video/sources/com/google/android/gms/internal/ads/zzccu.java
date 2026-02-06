package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzccu implements zzbjw {
    public final zzdlu a;

    public zzccu(zzdlu zzdluVar) {
        this.a = zzdluVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        zzcbw zzcbwVar = (zzcbw) obj;
        String str = (String) map.get("action");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Action missing from video GMSG.");
        } else if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("src missing from video GMSG.");
                return;
            }
            zzdlu zzdluVar = this.a;
            Bundle bundle = new Bundle();
            bundle.putString("mediaUrl", str2);
            zzdluVar.a.c(bundle);
        }
    }
}
