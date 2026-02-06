package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceFutureC8411o11;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzetb implements zzetv {
    public static final zzetc k = new zzetc(new JSONArray().toString(), new Bundle());
    public static final /* synthetic */ int l = 0;
    public final zzgdj a;
    public final ScheduledExecutorService b;
    public final zzejn c;
    public final Context d;
    public final zzfcp e;
    public final zzejj f;
    public final zzdpt g;
    public final zzduj h;
    public final int i;
    public final String j;

    public zzetb(zzgdj zzgdjVar, ScheduledExecutorService scheduledExecutorService, String str, zzejn zzejnVar, Context context, zzfcp zzfcpVar, zzejj zzejjVar, zzdpt zzdptVar, zzduj zzdujVar, int i) {
        this.a = zzgdjVar;
        this.b = scheduledExecutorService;
        this.j = str;
        this.c = zzejnVar;
        this.d = context;
        this.e = zzfcpVar;
        this.f = zzejjVar;
        this.g = zzdptVar;
        this.h = zzdujVar;
        this.i = i;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 c(zzetb zzetbVar) {
        String str;
        final Bundle bundle;
        zzetb zzetbVar2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.jb)).booleanValue()) {
            str = zzetbVar.e.f.toLowerCase(Locale.ROOT);
        } else {
            str = zzetbVar.e.f;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P1)).booleanValue()) {
            bundle = zzetbVar.h.a();
        } else {
            bundle = new Bundle();
        }
        final ArrayList arrayList = new ArrayList();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Y1)).booleanValue()) {
            zzejn zzejnVar = zzetbVar.c;
            for (Map.Entry entry : ((zzfyf) zzejnVar.b(zzetbVar.j, str)).entrySet()) {
                String str2 = (String) entry.getKey();
                zzetb zzetbVar3 = zzetbVar;
                arrayList.add(zzetbVar3.g(str2, (List) entry.getValue(), zzetbVar.f(str2), true, true));
                zzetbVar = zzetbVar3;
            }
            zzetbVar2 = zzetbVar;
            zzetbVar2.i(arrayList, zzejnVar.c());
        } else {
            zzetbVar2 = zzetbVar;
            zzetbVar2.i(arrayList, zzetbVar2.c.a(zzetbVar2.j, str));
        }
        return zzgcy.b(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.zzesw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = zzetb.l;
                JSONArray jSONArray = new JSONArray();
                for (InterfaceFutureC8411o11 interfaceFutureC8411o11 : arrayList) {
                    if (((JSONObject) interfaceFutureC8411o11.get()) != null) {
                        jSONArray.put(interfaceFutureC8411o11.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzetc(jSONArray.toString(), bundle);
            }
        }, zzetbVar2.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(3:5|6|(2:8|(2:10|11)(1:13))(3:14|(1:16)|(2:18|(2:20|21)(2:22|23))(2:24|25))))|26|27|6|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        com.google.android.gms.ads.internal.util.zze.l("Couldn't create RTB adapter : ", r0);
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ InterfaceFutureC8411o11 d(final zzetb zzetbVar, String str, final List list, final Bundle bundle, boolean z, boolean z2) {
        final zzbrk zzbrkVar;
        zzbrk b;
        final zzcaf zzcafVar = new zzcaf();
        if (z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q1)).booleanValue()) {
                zzejj zzejjVar = zzetbVar.f;
                zzejjVar.b(str);
                b = zzejjVar.a(str);
                zzbrkVar = b;
                if (zzbrkVar != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.G1)).booleanValue()) {
                        zzejq.W7(str, zzcafVar);
                        return zzcafVar;
                    }
                    throw null;
                }
                final zzejq zzejqVar = new zzejq(str, zzbrkVar, zzcafVar, com.google.android.gms.ads.internal.zzv.d().b());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.L1)).booleanValue()) {
                    zzetbVar.b.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeta
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzejq.this.c();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.E1)).longValue(), TimeUnit.MILLISECONDS);
                }
                if (z) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.S1)).booleanValue()) {
                        zzetbVar.a.f0(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesx
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzetb.e(zzetb.this, zzbrkVar, bundle, list, zzejqVar, zzcafVar);
                            }
                        });
                        return zzcafVar;
                    }
                    zzetbVar.h(zzbrkVar, bundle, list, zzejqVar);
                    return zzcafVar;
                }
                zzejqVar.f();
                return zzcafVar;
            }
        }
        b = zzetbVar.g.b(str);
        zzbrkVar = b;
        if (zzbrkVar != null) {
        }
    }

    public static /* synthetic */ void e(zzetb zzetbVar, zzbrk zzbrkVar, Bundle bundle, List list, zzejq zzejqVar, zzcaf zzcafVar) {
        try {
            zzetbVar.h(zzbrkVar, bundle, list, zzejqVar);
        } catch (RemoteException e) {
            zzcafVar.d(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        if (this.i == 2) {
            return zzgcy.h(k);
        }
        zzfcp zzfcpVar = this.e;
        if (zzfcpVar.r) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R1)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.b(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.c(zzfcpVar.d)))) {
                return zzgcy.h(k);
            }
        }
        return zzgcy.k(new zzgce() { // from class: com.google.android.gms.internal.ads.zzesv
            @Override // com.google.android.gms.internal.ads.zzgce
            public final InterfaceFutureC8411o11 a() {
                return zzetb.c(zzetb.this);
            }
        }, this.a);
    }

    @InterfaceC11300zs1
    public final Bundle f(String str) {
        Bundle bundle = this.e.d.h1;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    public final zzgcp g(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzgce zzgceVar = new zzgce() { // from class: com.google.android.gms.internal.ads.zzesy
            @Override // com.google.android.gms.internal.ads.zzgce
            public final InterfaceFutureC8411o11 a() {
                return zzetb.d(zzetb.this, str, list, bundle, z, z2);
            }
        };
        zzgdj zzgdjVar = this.a;
        zzgcp A = zzgcp.A(zzgcy.k(zzgceVar, zzgdjVar));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.L1)).booleanValue()) {
            A = (zzgcp) zzgcy.o(A, ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.E1)).longValue(), TimeUnit.MILLISECONDS, this.b);
        }
        return (zzgcp) zzgcy.e(A, Throwable.class, new zzfur() { // from class: com.google.android.gms.internal.ads.zzesz
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                int i = zzetb.l;
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                String str2 = str;
                com.google.android.gms.ads.internal.util.client.zzo.d("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.md)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.t().w(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                com.google.android.gms.ads.internal.zzv.t().x(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, zzgdjVar);
    }

    public final void h(zzbrk zzbrkVar, Bundle bundle, @InterfaceC5670cr1 List list, zzejq zzejqVar) throws RemoteException {
        zzbrkVar.x5(ObjectWrapper.V3(this.d), this.j, bundle, (Bundle) list.get(0), this.e.e, zzejqVar);
    }

    public final void i(List list, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzejr zzejrVar = (zzejr) entry.getValue();
            String str = zzejrVar.a;
            list.add(g(str, Collections.singletonList(zzejrVar.e), f(str), zzejrVar.b, zzejrVar.c));
        }
    }
}
