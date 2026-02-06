package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executor;
import o.InterfaceC10571ws1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public abstract class zzexc implements zzelh {
    public final Context a;
    public final Executor b;
    public final zzchb c;
    public final zzexs d;
    public final zzezl e;
    public final VersionInfoParcel f;
    public final ViewGroup g;
    public final zzfhq h;
    public final zzfcn i;
    @InterfaceC10571ws1
    public InterfaceFutureC8411o11 j;

    public zzexc(Context context, Executor executor, zzchb zzchbVar, zzezl zzezlVar, zzexs zzexsVar, zzfcn zzfcnVar, VersionInfoParcel versionInfoParcel) {
        this.a = context;
        this.b = executor;
        this.c = zzchbVar;
        this.e = zzezlVar;
        this.d = zzexsVar;
        this.i = zzfcnVar;
        this.f = versionInfoParcel;
        this.g = new FrameLayout(context);
        this.h = zzchbVar.C();
    }

    @Override // com.google.android.gms.internal.ads.zzelh
    public final boolean a() {
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.j;
        if (interfaceFutureC8411o11 != null && !interfaceFutureC8411o11.isDone()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzelh
    public final synchronized boolean b(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzelf zzelfVar, zzelg zzelgVar) throws RemoteException {
        Throwable th;
        boolean z;
        zzfhn zzfhnVar;
        zzcnz zzcnzVar;
        try {
            try {
                if (!zzmVar.B0()) {
                    if (((Boolean) zzbet.d.e()).booleanValue()) {
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.xb)).booleanValue()) {
                                z = true;
                                if (this.f.Z >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.yb)).intValue() || !z) {
                                    Preconditions.k("loadAd must be called on the main UI thread.");
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    z = false;
                    if (this.f.Z >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.yb)).intValue()) {
                    }
                    Preconditions.k("loadAd must be called on the main UI thread.");
                }
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.d("Ad unit ID should not be null for app open ad.");
                    this.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeww
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzexc.this.d.C0(zzfdq.d(6, null, null));
                        }
                    });
                    return false;
                } else if (this.j != null) {
                    return false;
                } else {
                    if (((Boolean) zzbeo.c.e()).booleanValue() && (zzcnzVar = (zzcnz) this.e.f()) != null) {
                        zzfhn g = zzcnzVar.g();
                        g.i(7);
                        g.b(zzmVar.k1);
                        g.f(zzmVar.h1);
                        zzfhnVar = g;
                    } else {
                        zzfhnVar = null;
                    }
                    Context context = this.a;
                    boolean z2 = zzmVar.a1;
                    zzfdm.a(context, z2);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j9)).booleanValue() && z2) {
                        this.c.p().p(true);
                    }
                    Bundle a = zzdrn.a(new Pair(zzdrl.PUBLIC_API_CALL.e(), Long.valueOf(zzmVar.u1)), new Pair(zzdrl.DYNAMITE_ENTER.e(), Long.valueOf(com.google.android.gms.ads.internal.zzv.d().a())));
                    zzfcn zzfcnVar = this.i;
                    zzfcnVar.P(str);
                    zzfcnVar.O(com.google.android.gms.ads.internal.client.zzr.B0());
                    zzfcnVar.h(zzmVar);
                    zzfcnVar.a(a);
                    zzfcp j = zzfcnVar.j();
                    zzfhc b = zzfhb.b(context, zzfhm.f(j), 7, zzmVar);
                    zzexa zzexaVar = new zzexa(null);
                    zzexaVar.a = j;
                    InterfaceFutureC8411o11 a2 = this.e.a(new zzezm(zzexaVar, null), new zzezk() { // from class: com.google.android.gms.internal.ads.zzewx
                        @Override // com.google.android.gms.internal.ads.zzezk
                        public final zzcuy a(zzezj zzezjVar) {
                            zzcuy m;
                            m = zzexc.this.m(zzezjVar);
                            return m;
                        }
                    }, null);
                    this.j = a2;
                    zzgcy.r(a2, new zzewz(this, zzelgVar, zzfhnVar, b, zzexaVar), this.b);
                    return true;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public abstract zzcuy e(zzcom zzcomVar, zzcvc zzcvcVar, zzdbr zzdbrVar);

    public final void l(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.i.Q(zzxVar);
    }

    public final synchronized zzcuy m(zzezj zzezjVar) {
        zzexa zzexaVar = (zzexa) zzezjVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w8)).booleanValue()) {
            zzcom zzcomVar = new zzcom(this.g);
            zzcva zzcvaVar = new zzcva();
            zzcvaVar.f(this.a);
            zzcvaVar.k(zzexaVar.a);
            zzcvc l = zzcvaVar.l();
            zzdbp zzdbpVar = new zzdbp();
            zzexs zzexsVar = this.d;
            Executor executor = this.b;
            zzdbpVar.f(zzexsVar, executor);
            zzdbpVar.o(zzexsVar, executor);
            return e(zzcomVar, l, zzdbpVar.q());
        }
        zzexs a = zzexs.a(this.d);
        zzdbp zzdbpVar2 = new zzdbp();
        Executor executor2 = this.b;
        zzdbpVar2.e(a, executor2);
        zzdbpVar2.j(a, executor2);
        zzdbpVar2.k(a, executor2);
        zzdbpVar2.l(a, executor2);
        zzdbpVar2.f(a, executor2);
        zzdbpVar2.o(a, executor2);
        zzdbpVar2.p(a);
        zzcom zzcomVar2 = new zzcom(this.g);
        zzcva zzcvaVar2 = new zzcva();
        zzcvaVar2.f(this.a);
        zzcvaVar2.k(zzexaVar.a);
        return e(zzcomVar2, zzcvaVar2.l(), zzdbpVar2.q());
    }
}
