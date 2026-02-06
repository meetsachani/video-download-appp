package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbnz {
    public final Context b;
    public final String c;
    public final VersionInfoParcel d;
    @InterfaceC11300zs1
    public final zzfhq e;
    public final com.google.android.gms.ads.internal.util.zzbd f;
    public final com.google.android.gms.ads.internal.util.zzbd g;
    @InterfaceC11300zs1
    public zzbny h;
    public final Object a = new Object();
    public int i = 1;

    public zzbnz(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbd zzbdVar, com.google.android.gms.ads.internal.util.zzbd zzbdVar2, @InterfaceC11300zs1 zzfhq zzfhqVar) {
        this.c = str;
        this.b = context.getApplicationContext();
        this.d = versionInfoParcel;
        this.e = zzfhqVar;
        this.f = zzbdVar;
        this.g = zzbdVar2;
    }

    public static /* synthetic */ void g(zzbnz zzbnzVar, zzbmu zzbmuVar) {
        if (zzbmuVar.i()) {
            zzbnzVar.i = 1;
        }
    }

    public static /* synthetic */ void h(zzbnz zzbnzVar, zzavl zzavlVar, zzbny zzbnyVar) {
        long a = com.google.android.gms.ads.internal.zzv.d().a();
        ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > Before createJavascriptEngine");
            zzbnc zzbncVar = new zzbnc(zzbnzVar.b, zzbnzVar.d, null, null);
            com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbncVar.g1(new zzbnf(zzbnzVar, arrayList, a, zzbnyVar, zzbncVar));
            com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbncVar.x0("/jsLoaded", new zzbnk(zzbnzVar, a, zzbnyVar, zzbncVar));
            com.google.android.gms.ads.internal.util.zzby zzbyVar = new com.google.android.gms.ads.internal.util.zzby();
            zzbnl zzbnlVar = new zzbnl(zzbnzVar, null, zzbncVar, zzbyVar);
            zzbyVar.b(zzbnlVar);
            com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbncVar.x0("/requestReload", zzbnlVar);
            String str = zzbnzVar.c;
            com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
            if (str.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbncVar.r0(str);
                com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (str.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbncVar.S(str);
                com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbncVar.f0(str);
                com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzs.l.postDelayed(new zzbnn(zzbnzVar, zzbnyVar, zzbncVar, arrayList, a), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d)).intValue());
        } catch (Throwable th) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error creating webview.", th);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V7)).booleanValue()) {
                zzbnyVar.d(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.X7)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.t().w(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbnyVar.c();
                return;
            }
            com.google.android.gms.ads.internal.zzv.t().x(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbnyVar.c();
        }
    }

    public static /* synthetic */ void i(zzbnz zzbnzVar, zzbny zzbnyVar, final zzbmu zzbmuVar, ArrayList arrayList, long j) {
        com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (zzbnzVar.a) {
            try {
                com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (zzbnyVar.a() != -1 && zzbnyVar.a() != 1) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V7)).booleanValue()) {
                        zzbnyVar.d(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        zzbnyVar.c();
                    }
                    zzgdj zzgdjVar = zzcaa.f;
                    Objects.requireNonNull(zzbmuVar);
                    zzgdjVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbne
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbmu.this.c();
                        }
                    });
                    String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c));
                    int a = zzbnyVar.a();
                    int i = zzbnzVar.i;
                    String valueOf2 = String.valueOf(arrayList.get(0));
                    long a2 = com.google.android.gms.ads.internal.zzv.d().a() - j;
                    com.google.android.gms.ads.internal.util.zze.k("Could not receive /jsLoaded in " + valueOf + " ms. JS engine session reference status(onEngLoadedTimeout) is " + a + ". Update status(onEngLoadedTimeout) is " + i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + valueOf2 + " ms. Total latency(onEngLoadedTimeout) is " + a2 + " ms. Rejecting.");
                    com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzbnt b(@InterfaceC11300zs1 zzavl zzavlVar) {
        com.google.android.gms.ads.internal.util.zze.k("getEngine: Trying to acquire lock");
        Object obj = this.a;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.util.zze.k("getEngine: Lock acquired");
                com.google.android.gms.ads.internal.util.zze.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    com.google.android.gms.ads.internal.util.zze.k("refreshIfDestroyed: Lock acquired");
                    zzbny zzbnyVar = this.h;
                    if (zzbnyVar != null && this.i == 0) {
                        zzbnyVar.f(new zzcaj() { // from class: com.google.android.gms.internal.ads.zzbnh
                            @Override // com.google.android.gms.internal.ads.zzcaj
                            public final void b(Object obj2) {
                                zzbnz.g(zzbnz.this, (zzbmu) obj2);
                            }
                        }, new zzcah() { // from class: com.google.android.gms.internal.ads.zzbni
                            @Override // com.google.android.gms.internal.ads.zzcah
                            public final void a() {
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.k("refreshIfDestroyed: Lock released");
        zzbny zzbnyVar2 = this.h;
        if (zzbnyVar2 != null && zzbnyVar2.a() != -1) {
            int i = this.i;
            if (i == 0) {
                com.google.android.gms.ads.internal.util.zze.k("getEngine (NO_UPDATE): Lock released");
                return this.h.g();
            } else if (i == 1) {
                this.i = 2;
                d(null);
                com.google.android.gms.ads.internal.util.zze.k("getEngine (PENDING_UPDATE): Lock released");
                return this.h.g();
            } else {
                com.google.android.gms.ads.internal.util.zze.k("getEngine (UPDATING): Lock released");
                return this.h.g();
            }
        }
        this.i = 2;
        this.h = d(null);
        com.google.android.gms.ads.internal.util.zze.k("getEngine (NULL or REJECTED): Lock released");
        return this.h.g();
    }

    public final zzbny d(@InterfaceC11300zs1 zzavl zzavlVar) {
        zzfhc a = zzfhb.a(this.b, 6);
        a.i();
        final zzbny zzbnyVar = new zzbny(this.g);
        com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        zzcaa.f.execute(new Runnable(null, zzbnyVar) { // from class: com.google.android.gms.internal.ads.zzbnj
            public final /* synthetic */ zzbny Y;

            {
                this.Y = zzbnyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbnz.h(zzbnz.this, null, this.Y);
            }
        });
        com.google.android.gms.ads.internal.util.zze.k("loadNewJavascriptEngine: Promise created");
        zzbnyVar.f(new zzbno(this, zzbnyVar, a), new zzbnp(this, zzbnyVar, a));
        return zzbnyVar;
    }
}
