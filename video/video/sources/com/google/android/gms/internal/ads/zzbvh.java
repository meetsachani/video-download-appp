package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbvh extends zzbvf {
    public final Object a = new Object();
    public final Context b;
    @InterfaceC11300zs1
    public SharedPreferences c;
    public final zzbod d;
    public final VersionInfoParcel e;

    public zzbvh(Context context, zzbod zzbodVar, VersionInfoParcel versionInfoParcel) {
        this.b = context.getApplicationContext();
        this.e = versionInfoParcel;
        this.d = zzbodVar;
    }

    public static /* synthetic */ Void b(zzbvh zzbvhVar, JSONObject jSONObject) {
        zzbcm zzbcmVar = zzbcv.a;
        com.google.android.gms.ads.internal.client.zzbd.b();
        SharedPreferences a = zzbco.a(zzbvhVar.b);
        if (a != null) {
            SharedPreferences.Editor edit = a.edit();
            com.google.android.gms.ads.internal.client.zzbd.a();
            int i = zzbel.a;
            com.google.android.gms.ads.internal.client.zzbd.a().e(edit, 1, jSONObject);
            com.google.android.gms.ads.internal.client.zzbd.b();
            edit.commit();
            SharedPreferences sharedPreferences = zzbvhVar.c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzv.d().a()).apply();
                return null;
            }
            return null;
        }
        return null;
    }

    public static JSONObject c(Context context, VersionInfoParcel versionInfoParcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbev.b.e()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.X);
            jSONObject.put("mf", zzbev.c.e());
            jSONObject.put("cl", "756340629");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", GooglePlayServicesUtilLight.a);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", GooglePlayServicesUtilLight.a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final InterfaceFutureC8411o11 a() {
        synchronized (this.a) {
            try {
                if (this.c == null) {
                    this.c = this.b.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = this.c;
        long j = 0;
        if (sharedPreferences != null) {
            j = sharedPreferences.getLong("js_last_update", 0L);
        }
        if (com.google.android.gms.ads.internal.zzv.d().a() - j < ((Long) zzbev.d.e()).longValue()) {
            return zzgcy.h(null);
        }
        return zzgcy.m(this.d.c(c(this.b, this.e)), new zzfur() { // from class: com.google.android.gms.internal.ads.zzbvg
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                zzbvh.b(zzbvh.this, (JSONObject) obj);
                return null;
            }
        }, zzcaa.g);
    }
}
