package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzfbh implements zzelh {
    public final Context a;
    public final Executor b;
    public final zzchb c;
    public final zzfax d;
    public final zzezl e;
    public final zzfch f;
    public final zzfhq g;
    public final zzfcn h;
    public InterfaceFutureC8411o11 i;

    public zzfbh(Context context, Executor executor, zzchb zzchbVar, zzezl zzezlVar, zzfax zzfaxVar, zzfcn zzfcnVar, zzfch zzfchVar) {
        this.a = context;
        this.b = executor;
        this.c = zzchbVar;
        this.e = zzezlVar;
        this.d = zzfaxVar;
        this.h = zzfcnVar;
        this.f = zzfchVar;
        this.g = zzchbVar.C();
    }

    @Override // com.google.android.gms.internal.ads.zzelh
    public final boolean a() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzelh
    public final boolean b(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzelf zzelfVar, zzelg zzelgVar) throws RemoteException {
        zzfhn zzfhnVar;
        zzbwe zzbweVar = new zzbwe(zzmVar, str);
        zzfaz zzfazVar = (zzfaz) zzelfVar;
        String str2 = zzbweVar.Y;
        if (str2 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Ad unit ID should not be null for rewarded video ad.");
            this.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfba
                @Override // java.lang.Runnable
                public final void run() {
                    zzfbh.this.d.C0(zzfdq.d(6, null, null));
                }
            });
            return false;
        }
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.i;
        if (interfaceFutureC8411o11 != null && !interfaceFutureC8411o11.isDone()) {
            return false;
        }
        if (((Boolean) zzbeo.c.e()).booleanValue()) {
            zzezl zzezlVar = this.e;
            if (zzezlVar.f() != null) {
                zzfhn g = ((zzdom) zzezlVar.f()).g();
                g.i(5);
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzbweVar.X;
                g.b(zzmVar2.k1);
                g.f(zzmVar2.h1);
                zzfhnVar = g;
                Context context = this.a;
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = zzbweVar.X;
                boolean z = zzmVar3.a1;
                zzfdm.a(context, z);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j9)).booleanValue() && z) {
                    this.c.p().p(true);
                }
                Bundle a = zzdrn.a(new Pair(zzdrl.PUBLIC_API_CALL.e(), Long.valueOf(zzmVar3.u1)), new Pair(zzdrl.DYNAMITE_ENTER.e(), Long.valueOf(com.google.android.gms.ads.internal.zzv.d().a())));
                zzfcn zzfcnVar = this.h;
                zzfcnVar.P(str2);
                zzfcnVar.O(com.google.android.gms.ads.internal.client.zzr.G0());
                zzfcnVar.h(zzmVar3);
                zzfcnVar.a(a);
                zzfcp j = zzfcnVar.j();
                zzfhc b = zzfhb.b(context, zzfhm.f(j), 5, zzmVar3);
                zzfbf zzfbfVar = new zzfbf(null);
                zzfbfVar.a = j;
                InterfaceFutureC8411o11 a2 = this.e.a(new zzezm(zzfbfVar, null), new zzezk() { // from class: com.google.android.gms.internal.ads.zzfbb
                    @Override // com.google.android.gms.internal.ads.zzezk
                    public final zzcuy a(zzezj zzezjVar) {
                        zzdol k;
                        k = zzfbh.this.k(zzezjVar);
                        return k;
                    }
                }, null);
                this.i = a2;
                zzgcy.r(a2, new zzfbe(this, zzelgVar, zzfhnVar, b, zzfbfVar), this.b);
                return true;
            }
        }
        zzfhnVar = null;
        Context context2 = this.a;
        com.google.android.gms.ads.internal.client.zzm zzmVar32 = zzbweVar.X;
        boolean z2 = zzmVar32.a1;
        zzfdm.a(context2, z2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j9)).booleanValue()) {
            this.c.p().p(true);
        }
        Bundle a3 = zzdrn.a(new Pair(zzdrl.PUBLIC_API_CALL.e(), Long.valueOf(zzmVar32.u1)), new Pair(zzdrl.DYNAMITE_ENTER.e(), Long.valueOf(com.google.android.gms.ads.internal.zzv.d().a())));
        zzfcn zzfcnVar2 = this.h;
        zzfcnVar2.P(str2);
        zzfcnVar2.O(com.google.android.gms.ads.internal.client.zzr.G0());
        zzfcnVar2.h(zzmVar32);
        zzfcnVar2.a(a3);
        zzfcp j2 = zzfcnVar2.j();
        zzfhc b2 = zzfhb.b(context2, zzfhm.f(j2), 5, zzmVar32);
        zzfbf zzfbfVar2 = new zzfbf(null);
        zzfbfVar2.a = j2;
        InterfaceFutureC8411o11 a22 = this.e.a(new zzezm(zzfbfVar2, null), new zzezk() { // from class: com.google.android.gms.internal.ads.zzfbb
            @Override // com.google.android.gms.internal.ads.zzezk
            public final zzcuy a(zzezj zzezjVar) {
                zzdol k;
                k = zzfbh.this.k(zzezjVar);
                return k;
            }
        }, null);
        this.i = a22;
        zzgcy.r(a22, new zzfbe(this, zzelgVar, zzfhnVar, b2, zzfbfVar2), this.b);
        return true;
    }

    public final void j(int i) {
        this.h.L().a(i);
    }

    public final zzdol k(zzezj zzezjVar) {
        zzdol m = this.c.m();
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.f(this.a);
        zzcvaVar.k(((zzfbf) zzezjVar).a);
        zzcvaVar.j(this.f);
        m.a(zzcvaVar.l());
        m.f(new zzdbp().q());
        return m;
    }
}
