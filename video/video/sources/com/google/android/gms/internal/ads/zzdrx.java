package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.C2638Cg0;
import o.C3855Oo;
import o.C9755tW1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzdrx {
    public final ConcurrentHashMap a;
    public final zzbzr b;
    public final zzfcp c;
    public final String d;
    public final String e;
    public final com.google.android.gms.ads.internal.zzk f;
    public final Bundle g = new Bundle();
    public final Context h;

    public zzdrx(Context context, zzdsi zzdsiVar, zzbzr zzbzrVar, zzfcp zzfcpVar, String str, String str2, com.google.android.gms.ads.internal.zzk zzkVar) {
        ActivityManager.MemoryInfo h;
        String str3;
        ConcurrentHashMap c = zzdsiVar.c();
        this.a = c;
        this.b = zzbzrVar;
        this.c = zzfcpVar;
        this.d = str;
        this.e = str2;
        this.f = zzkVar;
        this.h = context;
        c.put(FirebaseAnalytics.Param.b, str2.toUpperCase(Locale.ROOT));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P9)).booleanValue()) {
            int p = zzkVar.p();
            int i = p - 1;
            if (p != 0) {
                if (i == 0) {
                    str3 = "1";
                } else if (i != 1) {
                    str3 = "na";
                } else {
                    str3 = C2638Cg0.Y4;
                }
                c.put("asv", str3);
            } else {
                throw null;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            d("rt_f", String.valueOf(runtime.freeMemory()));
            d("rt_m", String.valueOf(runtime.maxMemory()));
            d("rt_t", String.valueOf(runtime.totalMemory()));
            d("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzv.t().c()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y2)).booleanValue() && (h = com.google.android.gms.ads.internal.util.client.zzf.h(context)) != null) {
                d("mem_avl", String.valueOf(h.availMem));
                d("mem_tt", String.valueOf(h.totalMem));
                d("low_m", true != h.lowMemory ? "0" : "1");
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d7)).booleanValue()) {
            return;
        }
        int g = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.g(zzfcpVar) - 1;
        if (g != 0) {
            if (g != 1) {
                if (g != 2) {
                    if (g != 3) {
                        c.put("se", "r_both");
                    } else {
                        c.put("se", "r_adstring");
                    }
                } else {
                    c.put("se", "r_adinfo");
                }
            } else {
                c.put(C9755tW1.f875o, str);
                c.put("se", "query_g");
            }
            c.put("scar", "true");
            d("ragent", zzfcpVar.d.k1);
            d("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.b(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.c(zzfcpVar.d)));
            return;
        }
        c.put(C9755tW1.f875o, str);
        c.put("scar", C3855Oo.a);
    }

    public final Bundle a() {
        return this.g;
    }

    public final Map b() {
        return this.a;
    }

    public final void c() {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.yd)).booleanValue()) {
            if (true != this.c.p) {
                str = "0";
            } else {
                str = "1";
            }
            d("brr", str);
        }
    }

    public final void d(String str, @InterfaceC11300zs1 String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.a.put(str, str2);
        }
    }

    public final void e(zzfcg zzfcgVar) {
        String str;
        zzfcf zzfcfVar = zzfcgVar.b;
        List list = zzfcfVar.a;
        if (!list.isEmpty()) {
            int i = ((zzfbu) list.get(0)).b;
            d(FirebaseAnalytics.Param.b, zzfbu.a(i));
            if (i == 6) {
                ConcurrentHashMap concurrentHashMap = this.a;
                if (true != this.b.l()) {
                    str = "0";
                } else {
                    str = "1";
                }
                concurrentHashMap.put("as", str);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s2)).booleanValue()) {
            d("mwl", Integer.toString(list.size()));
        }
        d("gqi", zzfcfVar.b.b);
    }

    public final void f(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("cnt")) {
                d("network_coarse", Integer.toString(bundle.getInt("cnt")));
            }
            if (bundle.containsKey("gnt")) {
                d("network_fine", Integer.toString(bundle.getInt("gnt")));
            }
        }
    }
}
