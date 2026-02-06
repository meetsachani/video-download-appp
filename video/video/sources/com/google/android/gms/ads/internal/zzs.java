package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbeh;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
final class zzs {
    public final Context a;
    public final String b;
    public final Map c = new TreeMap();
    public String d;
    public String e;
    public final String f;

    public zzs(Context context, String str) {
        String concat;
        this.a = context.getApplicationContext();
        this.b = str;
        String packageName = context.getPackageName();
        try {
            concat = packageName + "-" + Wrappers.a(context).f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Unable to get package version name for reporting", e);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f = concat;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public final Map e() {
        return this.c;
    }

    public final void f(com.google.android.gms.ads.internal.client.zzm zzmVar, VersionInfoParcel versionInfoParcel) {
        Bundle bundle;
        this.d = zzmVar.e1.X;
        Bundle bundle2 = zzmVar.h1;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(AdMobAdapter.class.getName());
        } else {
            bundle = null;
        }
        if (bundle != null) {
            String str = (String) zzbeh.c.e();
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    this.e = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.c.put(str2.substring(4), bundle.getString(str2));
                }
            }
            Map map = this.c;
            map.put("SDKVersion", versionInfoParcel.X);
            if (((Boolean) zzbeh.a.e()).booleanValue()) {
                Bundle b = zzad.b(this.a, (String) zzbeh.b.e());
                for (String str3 : b.keySet()) {
                    map.put(str3, b.get(str3).toString());
                }
            }
        }
    }
}
