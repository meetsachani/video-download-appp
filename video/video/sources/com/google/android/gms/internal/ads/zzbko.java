package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbko implements zzbjw {
    public final zzbkn a;

    public zzbko(zzbkn zzbknVar) {
        this.a = zzbknVar;
    }

    public static void b(zzcfb zzcfbVar, zzbkn zzbknVar) {
        zzcfbVar.r1("/reward", new zzbko(zzbknVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzbwj zzbwjVar = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzbwjVar = new zzbwj(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.h("Unable to parse reward amount.", e);
            }
            this.a.N0(zzbwjVar);
        } else if ("video_start".equals(str)) {
            this.a.c();
        } else if ("video_complete".equals(str)) {
            this.a.b();
        }
    }
}
