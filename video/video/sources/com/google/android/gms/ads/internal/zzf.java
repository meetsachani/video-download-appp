package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbcm;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbon;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzdsc;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzfhb;
import com.google.android.gms.internal.ads.zzfhc;
import com.google.android.gms.internal.ads.zzfhq;
import com.google.android.gms.internal.ads.zzgcf;
import com.google.android.gms.internal.ads.zzgcy;
import com.google.android.gms.internal.ads.zzgdj;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;
import o.InterfaceFutureC8411o11;
import org.json.JSONObject;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzf {
    public Context a;
    public long b = 0;

    public static /* synthetic */ InterfaceFutureC8411o11 a(zzf zzfVar, Long l, zzdsd zzdsdVar, zzfhc zzfhcVar, zzfhq zzfhqVar, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzv.t().j().h0(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                f(zzdsdVar, "cld_s", zzv.d().b() - l.longValue());
            }
        }
        String optString = jSONObject.optString("errorMessage", "");
        if (!TextUtils.isEmpty(optString)) {
            zzfhcVar.Q(optString);
        }
        zzfhcVar.c(optBoolean);
        zzfhqVar.c(zzfhcVar.m());
        return zzgcy.h(null);
    }

    public static final void f(zzdsd zzdsdVar, String str, long j) {
        if (zzdsdVar != null) {
            if (((Boolean) zzbd.c().b(zzbcv.Uc)).booleanValue()) {
                zzdsc a = zzdsdVar.a();
                a.b("action", "lat_init");
                a.b(str, Long.toString(j));
                a.j();
            }
        }
    }

    public final void c(Context context, VersionInfoParcel versionInfoParcel, String str, @InterfaceC11300zs1 Runnable runnable, zzfhq zzfhqVar, @InterfaceC11300zs1 zzdsd zzdsdVar, @InterfaceC11300zs1 Long l, boolean z) {
        d(context, versionInfoParcel, true, null, str, null, runnable, zzfhqVar, zzdsdVar, l, z);
    }

    @InterfaceC5056aJ2
    public final void d(Context context, VersionInfoParcel versionInfoParcel, boolean z, @InterfaceC11300zs1 zzbzh zzbzhVar, String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 Runnable runnable, final zzfhq zzfhqVar, @InterfaceC11300zs1 final zzdsd zzdsdVar, @InterfaceC11300zs1 final Long l, boolean z2) {
        zzfhc zzfhcVar;
        Exception exc;
        JSONObject jSONObject;
        InterfaceFutureC8411o11 c;
        zzgcf zzgcfVar;
        PackageInfo f;
        if (zzv.d().b() - this.b < 5000) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Not retrying to fetch app settings");
            return;
        }
        this.b = zzv.d().b();
        if (zzbzhVar != null && !TextUtils.isEmpty(zzbzhVar.c())) {
            if (zzv.d().a() - zzbzhVar.a() <= ((Long) zzbd.c().b(zzbcv.t4)).longValue() && zzbzhVar.i()) {
                return;
            }
        }
        if (context == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i3 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("App settings could not be fetched. Required parameters missing");
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.a = applicationContext;
            final zzfhc a = zzfhb.a(context, 4);
            a.i();
            zzbon a2 = zzv.k().a(this.a, versionInfoParcel, zzfhqVar);
            zzboh zzbohVar = zzbok.b;
            zzbod a3 = a2.a("google.afma.config.fetchAppSettings", zzbohVar, zzbohVar);
            try {
                jSONObject = new JSONObject();
            } catch (Exception e) {
                e = e;
                zzfhcVar = a;
            }
            try {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                zzbcm zzbcmVar = zzbcv.a;
                jSONObject.put("experiment_ids", TextUtils.join(",", zzbd.a().a()));
                jSONObject.put("js", versionInfoParcel.X);
                if (((Boolean) zzbd.c().b(zzbcv.O9)).booleanValue()) {
                    jSONObject.put("inspector_enabled", z2);
                }
                try {
                    ApplicationInfo applicationInfo = this.a.getApplicationInfo();
                    if (applicationInfo != null && (f = Wrappers.a(context).f(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", f.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.k("Error fetching PackageInfo.");
                }
                c = a3.c(jSONObject);
                try {
                    zzgcfVar = new zzgcf() { // from class: com.google.android.gms.ads.internal.zzd
                        @Override // com.google.android.gms.internal.ads.zzgcf
                        public final InterfaceFutureC8411o11 b(Object obj) {
                            return zzf.a(zzf.this, l, zzdsdVar, a, zzfhqVar, (JSONObject) obj);
                        }
                    };
                    zzfhcVar = a;
                } catch (Exception e2) {
                    e = e2;
                    zzfhcVar = a;
                }
            } catch (Exception e3) {
                exc = e3;
                zzfhcVar = a;
                int i4 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Error requesting application settings", exc);
                zzfhcVar.f(exc);
                zzfhcVar.c(false);
                zzfhqVar.c(zzfhcVar.m());
            }
            try {
                zzgdj zzgdjVar = zzcaa.g;
                InterfaceFutureC8411o11 n = zzgcy.n(c, zzgcfVar, zzgdjVar);
                if (runnable != null) {
                    c.h4(runnable, zzgdjVar);
                }
                if (l != null) {
                    c.h4(new Runnable() { // from class: com.google.android.gms.ads.internal.zze
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzf zzfVar = zzf.this;
                            zzf.f(zzdsdVar, "cld_r", zzv.d().b() - l.longValue());
                        }
                    }, zzgdjVar);
                }
                if (((Boolean) zzbd.c().b(zzbcv.W7)).booleanValue()) {
                    zzcad.b(n, "ConfigLoader.maybeFetchNewAppSettings");
                } else {
                    zzcad.a(n, "ConfigLoader.maybeFetchNewAppSettings");
                }
            } catch (Exception e4) {
                e = e4;
                exc = e;
                int i42 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Error requesting application settings", exc);
                zzfhcVar.f(exc);
                zzfhcVar.c(false);
                zzfhqVar.c(zzfhcVar.m());
            }
        }
    }

    public final void e(Context context, VersionInfoParcel versionInfoParcel, String str, zzbzh zzbzhVar, zzfhq zzfhqVar, boolean z) {
        String str2;
        if (zzbzhVar != null) {
            str2 = zzbzhVar.b();
        } else {
            str2 = null;
        }
        d(context, versionInfoParcel, false, zzbzhVar, str2, str, null, zzfhqVar, null, null, z);
    }
}
