package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC4253Sp2;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzckb extends com.google.android.gms.ads.internal.client.zzcx {
    public final Context X;
    public final VersionInfoParcel Y;
    public final zzedh Y0;
    public final zzdpt Z;
    public final zzejn Z0;
    public final zzduh a1;
    public final zzbyj b1;
    public final zzdpy c1;
    public final zzdvc d1;
    public final zzbfo e1;
    public final zzfhq f1;
    public final zzfdl g1;
    public final zzcti h1;
    public final zzdsd i1;
    public boolean j1 = false;
    public final Long k1 = Long.valueOf(com.google.android.gms.ads.internal.zzv.d().b());

    @InterfaceC5056aJ2
    public zzckb(Context context, VersionInfoParcel versionInfoParcel, zzdpt zzdptVar, zzedh zzedhVar, zzejn zzejnVar, zzduh zzduhVar, zzbyj zzbyjVar, zzdpy zzdpyVar, zzdvc zzdvcVar, zzbfo zzbfoVar, zzfhq zzfhqVar, zzfdl zzfdlVar, zzcti zzctiVar, zzdsd zzdsdVar) {
        this.X = context;
        this.Y = versionInfoParcel;
        this.Z = zzdptVar;
        this.Y0 = zzedhVar;
        this.Z0 = zzejnVar;
        this.a1 = zzduhVar;
        this.b1 = zzbyjVar;
        this.c1 = zzdpyVar;
        this.d1 = zzdvcVar;
        this.e1 = zzbfoVar;
        this.f1 = zzfhqVar;
        this.g1 = zzfdlVar;
        this.h1 = zzctiVar;
        this.i1 = zzdsdVar;
    }

    public static /* synthetic */ void X7(zzckb zzckbVar, Runnable runnable) {
        Preconditions.k("Adapters must be initialized on the main thread.");
        Map e = com.google.android.gms.ads.internal.zzv.t().j().g().e();
        if (!e.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.h("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (zzckbVar.Z.d()) {
                HashMap hashMap = new HashMap();
                for (zzbpf zzbpfVar : e.values()) {
                    for (zzbpe zzbpeVar : zzbpfVar.a) {
                        String str = zzbpeVar.b;
                        for (String str2 : zzbpeVar.a) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((List) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        zzedi a = zzckbVar.Y0.a(str3, jSONObject);
                        if (a != null) {
                            zzfdn zzfdnVar = (zzfdn) a.b;
                            if (!zzfdnVar.c() && zzfdnVar.b()) {
                                zzfdnVar.o(zzckbVar.X, (zzeex) a.c, (List) entry.getValue());
                                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                                com.google.android.gms.ads.internal.util.client.zzo.b("Initialized rewarded video mediation adapter " + str3);
                            }
                        }
                    } catch (zzfcw e2) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.h("Failed to initialize rewarded video mediation adapter \"" + str3 + AbstractC4253Sp2.b.x1, e2);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void B4(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.J9)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.t().A(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void D6(float f) {
        com.google.android.gms.ads.internal.zzv.x().d(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void I4(com.google.android.gms.ads.internal.client.zzdk zzdkVar) throws RemoteException {
        this.d1.i(zzdkVar, zzdvb.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void P6(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.o1(iObjectWrapper);
        if (context == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
        zzauVar.n(str);
        zzauVar.o(this.Y.X);
        zzauVar.r();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void Q3(String str) {
        Context context = this.X;
        zzbcv.a(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l4)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.e().c(context, this.Y, str, null, this.f1, null, null, this.d1.r());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void T7(boolean z) {
        com.google.android.gms.ads.internal.zzv.x().c(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void b6(zzbpl zzbplVar) throws RemoteException {
        this.g1.f(zzbplVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized float d() {
        return com.google.android.gms.ads.internal.zzv.x().a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.ads.internal.client.zzcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d3(@InterfaceC11300zs1 String str, IObjectWrapper iObjectWrapper) {
        String W;
        String str2;
        Runnable runnable;
        Context context = this.X;
        zzbcv.a(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s4)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzv.v();
                W = com.google.android.gms.ads.internal.util.zzs.W(context);
            } catch (RemoteException | RuntimeException e) {
                com.google.android.gms.ads.internal.zzv.t().x(e, "NonagonMobileAdsSettingManager_AppId");
            }
            boolean z = true;
            if (true != TextUtils.isEmpty(W)) {
                str2 = str;
            } else {
                str2 = W;
            }
            if (TextUtils.isEmpty(str2)) {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l4)).booleanValue();
                zzbcm zzbcmVar = zzbcv.e1;
                boolean booleanValue2 = booleanValue | ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
                    final Runnable runnable2 = (Runnable) ObjectWrapper.o1(iObjectWrapper);
                    runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcka
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzgdj zzgdjVar = zzcaa.f;
                            final zzckb zzckbVar = zzckb.this;
                            final Runnable runnable3 = runnable2;
                            zzgdjVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzckb.X7(zzckb.this, runnable3);
                                }
                            });
                        }
                    };
                } else {
                    runnable = null;
                    z = booleanValue2;
                }
                Runnable runnable3 = runnable;
                if (z) {
                    com.google.android.gms.ads.internal.zzv.e().c(this.X, this.Y, str2, runnable3, this.f1, this.i1, this.k1, this.d1.r());
                    return;
                }
                return;
            }
            return;
        }
        W = "";
        boolean z2 = true;
        if (true != TextUtils.isEmpty(W)) {
        }
        if (TextUtils.isEmpty(str2)) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String e() {
        return this.Y.X;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List g() throws RemoteException {
        return this.a1.g();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void i() {
        this.a1.q();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void k() {
        if (this.j1) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Mobile ads is initialized already.");
            return;
        }
        Context context = this.X;
        zzbcv.a(context);
        com.google.android.gms.ads.internal.zzv.t().v(context, this.Y);
        this.h1.c();
        com.google.android.gms.ads.internal.zzv.g().i(context);
        this.j1 = true;
        this.a1.r();
        this.Z0.f();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.n4)).booleanValue()) {
            this.c1.f();
        }
        this.d1.h();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y9)).booleanValue()) {
            zzcaa.a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjw
                @Override // java.lang.Runnable
                public final void run() {
                    zzckb.this.y();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.lb)).booleanValue()) {
            zzcaa.a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjz
                @Override // java.lang.Runnable
                public final void run() {
                    zzckb.this.e1.a(new zzbun());
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l3)).booleanValue()) {
            zzcaa.a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjx
                @Override // java.lang.Runnable
                public final void run() {
                    zzfdt.b(zzckb.this.X, true);
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q4)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R4)).booleanValue()) {
                zzcaa.a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjy
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.ads.internal.zzv.j().g(r0.X, zzckb.this.i1);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void n0(boolean z) throws RemoteException {
        try {
            Context context = this.X;
            zzfrq.a(context).c(z);
            if (!z) {
                try {
                    if (!context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                        throw new IOException("Failed to remove query_info_shared_prefs");
                    }
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.zzv.t().x(e, "clearStorageOnGpidPubDisable_scar");
                }
            }
        } catch (IOException e2) {
            throw new RemoteException(e2.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized boolean q() {
        return com.google.android.gms.ads.internal.zzv.x().e();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void r0(String str) {
        this.Z0.g(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void u4(zzbmb zzbmbVar) throws RemoteException {
        this.a1.s(zzbmbVar);
    }

    @InterfaceC5056aJ2
    public final void y() {
        if (com.google.android.gms.ads.internal.zzv.t().j().K()) {
            String i = com.google.android.gms.ads.internal.zzv.t().j().i();
            if (!com.google.android.gms.ads.internal.zzv.y().j(this.X, i, this.Y.X)) {
                com.google.android.gms.ads.internal.zzv.t().j().f0(false);
                com.google.android.gms.ads.internal.zzv.t().j().j0("");
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void y1(com.google.android.gms.ads.internal.client.zzfr zzfrVar) throws RemoteException {
        this.b1.n(this.X, zzfrVar);
    }
}
