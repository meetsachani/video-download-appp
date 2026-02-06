package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Locale;
import java.util.Map;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfkc {
    public final zzdsd a;
    public final String b;

    public zzfkc(zzdsd zzdsdVar, Context context) {
        CharSequence charSequence;
        this.a = zzdsdVar;
        zzfrl zzfrlVar = com.google.android.gms.ads.internal.util.zzs.l;
        try {
            charSequence = Wrappers.a(context).d(context.getPackageName());
        } catch (PackageManager.NameNotFoundException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Failed to get application name", e);
            charSequence = "";
        }
        this.b = charSequence.toString();
    }

    public final void a(int i, int i2, long j, zzfkk zzfkkVar) {
        zzdsc a = this.a.a();
        a.b("action", "cache_resize");
        a.b("cs_ts", Long.toString(j));
        a.b(FirebaseMessaging.r, this.b);
        a.b("orig_ma", Integer.toString(i));
        a.b("max_ads", Integer.toString(i2));
        a.b(FirebaseAnalytics.Param.b, zzfkkVar.a());
        a.b("ad_unit_id", zzfkkVar.b());
        a.j();
    }

    public final void b(int i, int i2, long j, @InterfaceC11300zs1 Long l, @InterfaceC11300zs1 String str, zzfkk zzfkkVar) {
        zzdsc a = this.a.a();
        a.b("plaac_ts", Long.toString(j));
        a.b(FirebaseMessaging.r, this.b);
        a.b(FirebaseAnalytics.Param.b, zzfkkVar.a());
        a.b("ad_unit_id", zzfkkVar.b());
        a.b("max_ads", Integer.toString(i));
        a.b("cache_size", Integer.toString(i2));
        a.b("action", "is_ad_available");
        if (l != null) {
            a.b("plaay_ts", Long.toString(l.longValue()));
        }
        if (str != null) {
            a.b("gqi", str);
        }
        a.j();
    }

    public final void c(long j, @InterfaceC11300zs1 String str, zzfkk zzfkkVar) {
        j(null, "pano_ts", j, -1, -1, str, zzfkkVar);
    }

    public final void d(long j, zzfkk zzfkkVar) {
        j(null, "paeo_ts", j, -1, -1, null, zzfkkVar);
    }

    public final void e(long j, zzfkk zzfkkVar) {
        j("poll_ad", "ppac_ts", j, -1, -1, null, zzfkkVar);
    }

    public final void f(long j, int i, int i2, @InterfaceC11300zs1 String str, zzfkk zzfkkVar) {
        zzdsc a = this.a.a();
        a.b("ppla_ts", Long.toString(j));
        a.b(FirebaseMessaging.r, this.b);
        a.b(FirebaseAnalytics.Param.b, zzfkkVar.a());
        a.b("ad_unit_id", zzfkkVar.b());
        a.b("max_ads", Integer.toString(i));
        a.b("cache_size", Integer.toString(i2));
        a.b("action", "poll_ad");
        if (str != null) {
            a.b("gqi", str);
        }
        a.j();
    }

    public final void g(long j, int i, int i2, String str, zzfkk zzfkkVar) {
        j("poll_ad", "psvroc_ts", j, i, i2, str, zzfkkVar);
    }

    public final void h(Map map, long j) {
        zzdsc a = this.a.a();
        a.b("action", "start_preload");
        a.b("sp_ts", Long.toString(j));
        a.b(FirebaseMessaging.r, this.b);
        for (AdFormat adFormat : map.keySet()) {
            String valueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            a.b(valueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        a.j();
    }

    public final void i(int i, long j, zzfkk zzfkkVar) {
        zzdsc a = this.a.a();
        a.b("action", "start_preload");
        a.b("sp_ts", Long.toString(j));
        a.b(FirebaseMessaging.r, this.b);
        a.b(FirebaseAnalytics.Param.b, zzfkkVar.a());
        a.b("ad_unit_id", zzfkkVar.b());
        a.b("max_ads", Integer.toString(i));
        a.j();
    }

    public final void j(@InterfaceC11300zs1 String str, String str2, long j, int i, int i2, @InterfaceC11300zs1 String str3, zzfkk zzfkkVar) {
        zzdsc a = this.a.a();
        a.b(str2, Long.toString(j));
        a.b(FirebaseMessaging.r, this.b);
        a.b("ad_unit_id", zzfkkVar.b());
        a.b(FirebaseAnalytics.Param.b, zzfkkVar.a());
        if (str != null) {
            a.b("action", str);
        }
        if (str3 != null) {
            a.b("gqi", str3);
        }
        if (i >= 0) {
            a.b("max_ads", Integer.toString(i));
        }
        if (i2 >= 0) {
            a.b("cache_size", Integer.toString(i2));
        }
        a.j();
    }
}
