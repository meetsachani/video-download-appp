package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.S;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.C4500Ve2;
import o.InterfaceC8710pF0;
import o.InterfaceFutureC8411o11;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzduh {
    public final Context f;
    public final WeakReference g;
    public final zzdpt h;
    public final Executor i;
    public final Executor j;
    public final ScheduledExecutorService k;
    public final zzdso l;
    public final VersionInfoParcel m;

    /* renamed from: o  reason: collision with root package name */
    public final zzdcx f272o;
    public final zzfhq p;
    public boolean a = false;
    public boolean b = false;
    @InterfaceC8710pF0("this")
    public boolean c = false;
    public final zzcaf e = new zzcaf();
    public final Map n = new ConcurrentHashMap();
    public boolean q = true;
    public final long d = com.google.android.gms.ads.internal.zzv.d().b();

    public zzduh(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdpt zzdptVar, ScheduledExecutorService scheduledExecutorService, zzdso zzdsoVar, VersionInfoParcel versionInfoParcel, zzdcx zzdcxVar, zzfhq zzfhqVar) {
        this.h = zzdptVar;
        this.f = context;
        this.g = weakReference;
        this.i = executor2;
        this.k = scheduledExecutorService;
        this.j = executor;
        this.l = zzdsoVar;
        this.m = versionInfoParcel;
        this.f272o = zzdcxVar;
        this.p = zzfhqVar;
        v("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* synthetic */ Object f(zzduh zzduhVar, zzfhc zzfhcVar) {
        zzduhVar.e.c(Boolean.TRUE);
        zzfhcVar.c(true);
        zzduhVar.p.c(zzfhcVar.m());
        return null;
    }

    public static /* synthetic */ void i(zzduh zzduhVar, Object obj, zzcaf zzcafVar, String str, long j, zzfhc zzfhcVar) {
        synchronized (obj) {
            try {
                if (!zzcafVar.isDone()) {
                    zzduhVar.v(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzv.d().b() - j));
                    zzduhVar.l.b(str, "timeout");
                    zzduhVar.f272o.u(str, "timeout");
                    zzfhq zzfhqVar = zzduhVar.p;
                    zzfhcVar.Q("Timeout");
                    zzfhcVar.c(false);
                    zzfhqVar.c(zzfhcVar.m());
                    zzcafVar.c(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void j(zzduh zzduhVar) {
        zzduhVar.l.e();
        zzduhVar.f272o.d();
        zzduhVar.b = true;
    }

    public static /* synthetic */ void l(zzduh zzduhVar) {
        synchronized (zzduhVar) {
            try {
                if (zzduhVar.c) {
                    return;
                }
                zzduhVar.v("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzv.d().b() - zzduhVar.d));
                zzduhVar.l.b("com.google.android.gms.ads.MobileAds", "timeout");
                zzduhVar.f272o.u("com.google.android.gms.ads.MobileAds", "timeout");
                zzduhVar.e.d(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void m(zzduh zzduhVar, String str, zzbly zzblyVar, zzfdn zzfdnVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzblyVar.e();
                    return;
                }
                Context context = (Context) zzduhVar.g.get();
                if (context == null) {
                    context = zzduhVar.f;
                }
                zzfdnVar.n(context, zzblyVar, list);
            } catch (RemoteException e) {
                throw new zzfwa(e);
            } catch (zzfcw unused) {
                zzblyVar.u("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException e2) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("", e2);
        }
    }

    public static /* bridge */ /* synthetic */ void o(zzduh zzduhVar, String str) {
        final zzduh zzduhVar2 = zzduhVar;
        Context context = zzduhVar2.f;
        int i = 5;
        final zzfhc a = zzfhb.a(context, 5);
        a.i();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzfhc a2 = zzfhb.a(context, i);
                a2.i();
                a2.p0(next);
                final Object obj = new Object();
                final zzcaf zzcafVar = new zzcaf();
                InterfaceFutureC8411o11 o2 = zzgcy.o(zzcafVar, ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.a2)).longValue(), TimeUnit.SECONDS, zzduhVar2.k);
                zzduhVar2.l.c(next);
                zzduhVar2.f272o.Q(next);
                final long b = com.google.android.gms.ads.internal.zzv.d().b();
                o2.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzduh.i(zzduh.this, obj, zzcafVar, next, b, a2);
                    }
                }, zzduhVar2.i);
                arrayList.add(o2);
                try {
                } catch (JSONException e) {
                    e = e;
                    zzduhVar2 = zzduhVar;
                }
                try {
                    final zzdug zzdugVar = new zzdug(zzduhVar, obj, next, b, a2, zzcafVar);
                    zzduhVar2 = zzduhVar;
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    final ArrayList arrayList2 = new ArrayList();
                    if (optJSONObject != null) {
                        try {
                            JSONArray jSONArray = optJSONObject.getJSONArray("data");
                            int i2 = 0;
                            while (i2 < jSONArray.length()) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                String optString = jSONObject2.optString(S.A, "");
                                JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                                Bundle bundle = new Bundle();
                                if (optJSONObject2 != null) {
                                    Iterator<String> keys2 = optJSONObject2.keys();
                                    while (keys2.hasNext()) {
                                        String next2 = keys2.next();
                                        bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                        jSONArray = jSONArray;
                                    }
                                }
                                JSONArray jSONArray2 = jSONArray;
                                arrayList2.add(new zzbme(optString, bundle));
                                i2++;
                                jSONArray = jSONArray2;
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    zzduhVar2.v(next, false, "", 0);
                    try {
                        final zzfdn c = zzduhVar2.h.c(next, new JSONObject());
                        zzduhVar2.j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduc
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzduh.m(zzduh.this, next, zzdugVar, c, arrayList2);
                            }
                        });
                    } catch (zzfcw e2) {
                        try {
                            String str2 = "Failed to create Adapter.";
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.kd)).booleanValue()) {
                                str2 = "Failed to create Adapter." + C4500Ve2.b + e2.getMessage();
                            }
                            zzdugVar.u(str2);
                        } catch (RemoteException e3) {
                            int i3 = com.google.android.gms.ads.internal.util.zze.b;
                            com.google.android.gms.ads.internal.util.client.zzo.e("", e3);
                        }
                    }
                    i = 5;
                } catch (JSONException e4) {
                    e = e4;
                    zzduhVar2 = zzduhVar;
                    com.google.android.gms.ads.internal.util.zze.l("Malformed CLD response", e);
                    zzduhVar2.f272o.w("MalformedJson");
                    zzduhVar2.l.a("MalformedJson");
                    zzduhVar2.e.d(e);
                    com.google.android.gms.ads.internal.zzv.t().x(e, "AdapterInitializer.updateAdapterStatus");
                    zzfhq zzfhqVar = zzduhVar2.p;
                    a.f(e);
                    a.c(false);
                    zzfhqVar.c(a.m());
                }
            }
            zzgcy.a(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.zzdty
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzduh.f(zzduh.this, a);
                    return null;
                }
            }, zzduhVar2.i);
        } catch (JSONException e5) {
            e = e5;
            com.google.android.gms.ads.internal.util.zze.l("Malformed CLD response", e);
            zzduhVar2.f272o.w("MalformedJson");
            zzduhVar2.l.a("MalformedJson");
            zzduhVar2.e.d(e);
            com.google.android.gms.ads.internal.zzv.t().x(e, "AdapterInitializer.updateAdapterStatus");
            zzfhq zzfhqVar2 = zzduhVar2.p;
            a.f(e);
            a.c(false);
            zzfhqVar2.c(a.m());
        }
    }

    public final List g() {
        ArrayList arrayList = new ArrayList();
        Map map = this.n;
        for (String str : map.keySet()) {
            zzblu zzbluVar = (zzblu) map.get(str);
            arrayList.add(new zzblu(str, zzbluVar.Y, zzbluVar.Z, zzbluVar.Y0));
        }
        return arrayList;
    }

    public final void q() {
        this.q = false;
    }

    public final void r() {
        if (!((Boolean) zzbfb.a.e()).booleanValue()) {
            if (this.m.Z >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Z1)).intValue() && this.q) {
                if (!this.a) {
                    synchronized (this) {
                        try {
                            if (this.a) {
                                return;
                            }
                            this.l.f();
                            this.f272o.e();
                            zzcaf zzcafVar = this.e;
                            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdud
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzduh.j(zzduh.this);
                                }
                            };
                            Executor executor = this.i;
                            zzcafVar.h4(runnable, executor);
                            this.a = true;
                            InterfaceFutureC8411o11 u = u();
                            this.k.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzduh.l(zzduh.this);
                                }
                            }, ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.b2)).longValue(), TimeUnit.SECONDS);
                            zzgcy.r(u, new zzduf(this), executor);
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return;
            }
        }
        if (!this.a) {
            v("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.e.c(Boolean.FALSE);
            this.a = true;
            this.b = true;
        }
    }

    public final void s(final zzbmb zzbmbVar) {
        this.e.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdua
            @Override // java.lang.Runnable
            public final void run() {
                zzduh zzduhVar = zzduh.this;
                try {
                    zzbmbVar.K0(zzduhVar.g());
                } catch (RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.e("", e);
                }
            }
        }, this.j);
    }

    public final boolean t() {
        return this.b;
    }

    public final synchronized InterfaceFutureC8411o11 u() {
        String c = com.google.android.gms.ads.internal.zzv.t().j().g().c();
        if (!TextUtils.isEmpty(c)) {
            return zzgcy.h(c);
        }
        final zzcaf zzcafVar = new zzcaf();
        com.google.android.gms.ads.internal.zzv.t().j().Y(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtz
            @Override // java.lang.Runnable
            public final void run() {
                r0.i.execute(new Runnable(zzduh.this, zzcafVar) { // from class: com.google.android.gms.internal.ads.zzdub
                    public final /* synthetic */ zzcaf X;

                    {
                        this.X = r2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String c2 = com.google.android.gms.ads.internal.zzv.t().j().g().c();
                        boolean isEmpty = TextUtils.isEmpty(c2);
                        zzcaf zzcafVar2 = this.X;
                        if (!isEmpty) {
                            zzcafVar2.c(c2);
                        } else {
                            zzcafVar2.d(new Exception());
                        }
                    }
                });
            }
        });
        return zzcafVar;
    }

    public final void v(String str, boolean z, String str2, int i) {
        this.n.put(str, new zzblu(str, z, i, str2));
    }
}
