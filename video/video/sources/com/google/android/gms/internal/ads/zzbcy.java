package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import o.BU0;
import o.C2638Cg0;

/* loaded from: classes2.dex */
public final class zzbcy {
    public final String a = (String) zzbep.a.e();
    public final Map b;
    public final Context c;
    public final String d;

    public zzbcy(Context context, String str) {
        String packageName;
        Object obj;
        this.c = context;
        this.d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", C2638Cg0.Z4);
        linkedHashMap.put(BU0.f, Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzv.v();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzs.Y());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put(FirebaseMessaging.r, packageName);
        com.google.android.gms.ads.internal.zzv.v();
        if (true == com.google.android.gms.ads.internal.util.zzs.f(context)) {
            obj = "1";
        } else {
            obj = "0";
        }
        linkedHashMap.put("is_lite_sdk", obj);
        Future b = com.google.android.gms.ads.internal.zzv.r().b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbvp) b.get()).j));
            linkedHashMap.put("network_fine", Integer.toString(((zzbvp) b.get()).k));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Fb)).booleanValue()) {
            Map map = this.b;
            com.google.android.gms.ads.internal.zzv.v();
            map.put("is_bstar", true != com.google.android.gms.ads.internal.util.zzs.c(context) ? "0" : "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.J9)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C2)).booleanValue() && !zzfvt.d(com.google.android.gms.ads.internal.zzv.t().o())) {
                this.b.put("plugin", com.google.android.gms.ads.internal.zzv.t().o());
            }
        }
    }

    public final Context a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final Map d() {
        return this.b;
    }
}
