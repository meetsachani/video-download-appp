package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzo {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Context c;
    public final zzdsi d;
    public final ExecutorService e;

    public zzo(Context context, zzdsi zzdsiVar, ExecutorService executorService) {
        this.c = context;
        this.d = zzdsiVar;
        this.e = executorService;
    }

    public static /* synthetic */ Object a(zzo zzoVar, AdRequest adRequest, zzp zzpVar) {
        QueryInfo.a(zzoVar.c, AdFormat.BANNER, adRequest, zzpVar);
        return Boolean.TRUE;
    }

    public static /* synthetic */ void b(zzo zzoVar, Object obj, Pair pair) {
        boolean z = false;
        if (obj instanceof WebView) {
            CookieManager a = com.google.android.gms.ads.internal.zzv.w().a(zzoVar.c);
            if (a != null) {
                z = a.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = zzoVar.a;
        Boolean valueOf = Boolean.valueOf(z);
        zzq zzqVar = (zzq) map.get(valueOf);
        if (zzqVar != null && !zzqVar.e()) {
            zzoVar.i(zzqVar, pair, true);
            return;
        }
        Map map2 = zzoVar.b;
        List list = (List) map2.get(valueOf);
        if (list == null) {
            list = new ArrayList();
            map2.put(valueOf, list);
        }
        list.add(pair);
    }

    public final synchronized void e() {
        h(true);
        h(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:15:0x0027, B:17:0x002d, B:19:0x003e, B:23:0x004c, B:26:0x006b, B:27:0x006f, B:29:0x0075, B:18:0x0036, B:14:0x0024), top: B:35:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:15:0x0027, B:17:0x002d, B:19:0x003e, B:23:0x004c, B:26:0x006b, B:27:0x006f, B:29:0x0075, B:18:0x0036, B:14:0x0024), top: B:35:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:15:0x0027, B:17:0x002d, B:19:0x003e, B:23:0x004c, B:26:0x006b, B:27:0x006f, B:29:0x0075, B:18:0x0036, B:14:0x0024), top: B:35:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f(final boolean z, zzq zzqVar) {
        Long l;
        final boolean z2;
        List<Pair> list;
        try {
            Map map = this.a;
            Boolean valueOf = Boolean.valueOf(z);
            zzq zzqVar2 = (zzq) map.get(valueOf);
            if (zzqVar2 != null) {
                if (!zzqVar2.e()) {
                    if (zzqVar2.b() != null) {
                        if (zzqVar.b() != null) {
                        }
                        if (zzqVar.b() == null) {
                            l = (Long) zzbfa.f.e();
                        } else {
                            l = (Long) zzbfa.g.e();
                        }
                        long longValue = l.longValue();
                        if (zzqVar.b() != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zzcaa.d.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzo.this.j(z, z2);
                            }
                        }, longValue, TimeUnit.SECONDS);
                        Map map2 = this.b;
                        list = (List) map2.get(valueOf);
                        map2.put(valueOf, new ArrayList());
                        if (list == null) {
                            for (Pair pair : list) {
                                i(zzqVar, pair, false);
                            }
                        }
                    }
                }
            }
            map.put(valueOf, zzqVar);
            if (zzqVar.b() == null) {
            }
            long longValue2 = l.longValue();
            if (zzqVar.b() != null) {
            }
            zzcaa.d.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
                @Override // java.lang.Runnable
                public final void run() {
                    zzo.this.j(z, z2);
                }
            }, longValue2, TimeUnit.SECONDS);
            Map map22 = this.b;
            list = (List) map22.get(valueOf);
            map22.put(valueOf, new ArrayList());
            if (list == null) {
            }
        } finally {
        }
    }

    public final synchronized void g(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(com.google.android.gms.ads.internal.zzv.d().a()));
        zzcaa.f.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // java.lang.Runnable
            public final void run() {
                zzo.b(zzo.this, obj, pair);
            }
        });
    }

    public final void h(final boolean z) {
        Map map = this.b;
        Boolean valueOf = Boolean.valueOf(z);
        if (!map.containsKey(valueOf)) {
            map.put(valueOf, new ArrayList());
            this.e.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
                @Override // java.lang.Runnable
                public final void run() {
                    zzo.this.j(z, false);
                }
            });
        }
    }

    public final void i(zzq zzqVar, Pair pair, boolean z) {
        boolean z2;
        zzqVar.d();
        QueryInfo b = zzqVar.b();
        if (b != null) {
            ((QueryInfoGenerationCallback) pair.first).b(b);
        } else {
            ((QueryInfoGenerationCallback) pair.first).a(zzqVar.c());
        }
        zzdsi zzdsiVar = this.d;
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair(FirebaseAnalytics.Param.b, AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        Pair pair6 = new Pair("lat_ms", Long.toString(com.google.android.gms.ads.internal.zzv.d().a() - ((Long) pair.second).longValue()));
        Pair pair7 = new Pair("sgpc_h", Boolean.toString(z));
        if (zzqVar.b() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzaa.d(zzdsiVar, null, "sgpcr", pair2, pair3, pair4, pair5, pair6, pair7, new Pair("sgpc_rs", Boolean.toString(z2)));
    }

    public final synchronized void j(boolean z, boolean z2) {
        Throwable th;
        Boolean valueOf;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            bundle.putBoolean("accept_3p_cookie", z);
            Map map = this.a;
            Boolean valueOf2 = Boolean.valueOf(z);
            zzq zzqVar = (zzq) map.get(valueOf2);
            int i = 0;
            if (z2 && zzqVar != null) {
                try {
                    i = zzqVar.a() + 1;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            zzq zzqVar2 = (zzq) map.get(valueOf2);
            if (zzqVar2 == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(zzqVar2.f());
            }
            final zzp zzpVar = new zzp(this, z, i, valueOf, this.d);
            final AdRequest p = new AdRequest.Builder().e(AdMobAdapter.class, bundle).p();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.sb)).booleanValue()) {
                this.e.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzo.a(zzo.this, p, zzpVar);
                    }
                });
            } else {
                QueryInfo.a(this.c, AdFormat.BANNER, p, zzpVar);
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }
}
