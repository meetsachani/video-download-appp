package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzelo implements zzelh {
    public final zzfcn a;
    public final zzchb b;
    public final Context c;
    public final zzele d;
    public final zzfhq e;
    @InterfaceC11300zs1
    public zzcrm f;

    public zzelo(zzchb zzchbVar, Context context, zzele zzeleVar, zzfcn zzfcnVar) {
        this.b = zzchbVar;
        this.c = context;
        this.d = zzeleVar;
        this.a = zzfcnVar;
        this.e = zzchbVar.C();
        zzfcnVar.R(zzeleVar.d());
    }

    @Override // com.google.android.gms.internal.ads.zzelh
    public final boolean a() {
        zzcrm zzcrmVar = this.f;
        if (zzcrmVar != null && zzcrmVar.f()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzelh
    public final boolean b(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzelf zzelfVar, zzelg zzelgVar) throws RemoteException {
        com.google.android.gms.ads.internal.zzv.v();
        Context context = this.c;
        if (com.google.android.gms.ads.internal.util.zzs.i(context) && zzmVar.n1 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Failed to load the ad because app ID is missing.");
            this.b.b().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelj
                @Override // java.lang.Runnable
                public final void run() {
                    zzelo.this.d.a().C0(zzfdq.d(4, null, null));
                }
            });
            return false;
        } else if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Ad unit ID should not be null for NativeAdLoader.");
            this.b.b().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelk
                @Override // java.lang.Runnable
                public final void run() {
                    zzelo.this.d.a().C0(zzfdq.d(6, null, null));
                }
            });
            return false;
        } else {
            boolean z = zzmVar.a1;
            zzfdm.a(context, z);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j9)).booleanValue() && z) {
                this.b.p().p(true);
            }
            int i3 = ((zzeli) zzelfVar).a;
            long a = com.google.android.gms.ads.internal.zzv.d().a();
            String e = zzdrl.PUBLIC_API_CALL.e();
            Long valueOf = Long.valueOf(a);
            Bundle a2 = zzdrn.a(new Pair(e, valueOf), new Pair(zzdrl.DYNAMITE_ENTER.e(), valueOf));
            zzfcn zzfcnVar = this.a;
            zzfcnVar.h(zzmVar);
            zzfcnVar.a(a2);
            zzfcnVar.c(i3);
            zzfcp j = zzfcnVar.j();
            zzfhc b = zzfhb.b(context, zzfhm.f(j), 8, zzmVar);
            com.google.android.gms.ads.internal.client.zzcl zzclVar = j.n;
            if (zzclVar != null) {
                this.d.d().C(zzclVar);
            }
            zzchb zzchbVar = this.b;
            zzdgv l = zzchbVar.l();
            zzcva zzcvaVar = new zzcva();
            zzcvaVar.f(context);
            zzcvaVar.k(j);
            l.j(zzcvaVar.l());
            zzdbp zzdbpVar = new zzdbp();
            zzele zzeleVar = this.d;
            zzdbpVar.n(zzeleVar.d(), zzchbVar.b());
            l.n(zzdbpVar.q());
            l.b(zzeleVar.c());
            zzfhn zzfhnVar = null;
            l.c(new zzcom(null));
            zzdgw g = l.g();
            if (((Boolean) zzbeo.c.e()).booleanValue()) {
                zzfhnVar = g.e();
                zzfhnVar.i(8);
                zzfhnVar.b(zzmVar.k1);
                zzfhnVar.f(zzmVar.h1);
            }
            zzfhn zzfhnVar2 = zzfhnVar;
            zzchbVar.B().c(1);
            zzgdj c = zzffn.c();
            ScheduledExecutorService c2 = zzchbVar.c();
            zzcsb a3 = g.a();
            zzcrm zzcrmVar = new zzcrm(c, c2, a3.h(a3.i()));
            this.f = zzcrmVar;
            zzcrmVar.e(new zzeln(this, zzelgVar, zzfhnVar2, b, g));
            return true;
        }
    }
}
