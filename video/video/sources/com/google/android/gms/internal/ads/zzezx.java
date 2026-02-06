package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzezx implements zzelh {
    public final Context a;
    public final Executor b;
    public final zzchb c;
    public final zzekr d;
    public final zzfax e;
    @InterfaceC11300zs1
    public zzbdq f;
    public final zzfhq g;
    public final zzfcn h;
    public InterfaceFutureC8411o11 i;

    public zzezx(Context context, Executor executor, zzchb zzchbVar, zzekr zzekrVar, zzfax zzfaxVar, zzfcn zzfcnVar) {
        this.a = context;
        this.b = executor;
        this.c = zzchbVar;
        this.d = zzekrVar;
        this.h = zzfcnVar;
        this.e = zzfaxVar;
        this.g = zzchbVar.C();
    }

    @Override // com.google.android.gms.internal.ads.zzelh
    public final boolean a() {
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.i;
        if (interfaceFutureC8411o11 != null && !interfaceFutureC8411o11.isDone()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzelh
    public final boolean b(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzelf zzelfVar, zzelg zzelgVar) {
        zzdga e;
        zzfhn zzfhnVar;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Ad unit ID should not be null for interstitial ad.");
            this.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezr
                @Override // java.lang.Runnable
                public final void run() {
                    zzezx.this.d.C0(zzfdq.d(6, null, null));
                }
            });
            return false;
        } else if (a()) {
            return false;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j9)).booleanValue() && zzmVar.a1) {
                this.c.p().p(true);
            }
            com.google.android.gms.ads.internal.client.zzr zzrVar = ((zzezq) zzelfVar).a;
            Bundle a = zzdrn.a(new Pair(zzdrl.PUBLIC_API_CALL.e(), Long.valueOf(zzmVar.u1)), new Pair(zzdrl.DYNAMITE_ENTER.e(), Long.valueOf(com.google.android.gms.ads.internal.zzv.d().a())));
            zzfcn zzfcnVar = this.h;
            zzfcnVar.P(str);
            zzfcnVar.O(zzrVar);
            zzfcnVar.h(zzmVar);
            zzfcnVar.a(a);
            Context context = this.a;
            zzfcp j = zzfcnVar.j();
            zzfhc b = zzfhb.b(context, zzfhm.f(j), 4, zzmVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x8)).booleanValue()) {
                zzdfz k = this.c.k();
                zzcva zzcvaVar = new zzcva();
                zzcvaVar.f(context);
                zzcvaVar.k(j);
                k.l(zzcvaVar.l());
                zzdbp zzdbpVar = new zzdbp();
                zzekr zzekrVar = this.d;
                Executor executor = this.b;
                zzdbpVar.m(zzekrVar, executor);
                zzdbpVar.n(zzekrVar, executor);
                k.p(zzdbpVar.q());
                k.s(new zzeja(this.f));
                e = k.e();
            } else {
                zzdbp zzdbpVar2 = new zzdbp();
                zzfax zzfaxVar = this.e;
                if (zzfaxVar != null) {
                    Executor executor2 = this.b;
                    zzdbpVar2.h(zzfaxVar, executor2);
                    zzdbpVar2.i(zzfaxVar, executor2);
                    zzdbpVar2.e(zzfaxVar, executor2);
                }
                zzdfz k2 = this.c.k();
                zzcva zzcvaVar2 = new zzcva();
                zzcvaVar2.f(context);
                zzcvaVar2.k(j);
                k2.l(zzcvaVar2.l());
                zzekr zzekrVar2 = this.d;
                Executor executor3 = this.b;
                zzdbpVar2.m(zzekrVar2, executor3);
                zzdbpVar2.h(zzekrVar2, executor3);
                zzdbpVar2.i(zzekrVar2, executor3);
                zzdbpVar2.e(zzekrVar2, executor3);
                zzdbpVar2.d(zzekrVar2, executor3);
                zzdbpVar2.o(zzekrVar2, executor3);
                zzdbpVar2.n(zzekrVar2, executor3);
                zzdbpVar2.l(zzekrVar2, executor3);
                zzdbpVar2.f(zzekrVar2, executor3);
                k2.p(zzdbpVar2.q());
                k2.s(new zzeja(this.f));
                e = k2.e();
            }
            zzdga zzdgaVar = e;
            if (((Boolean) zzbeo.c.e()).booleanValue()) {
                zzfhnVar = zzdgaVar.d();
                zzfhnVar.i(4);
                zzfhnVar.b(zzmVar.k1);
                zzfhnVar.f(zzmVar.h1);
            } else {
                zzfhnVar = null;
            }
            zzfhn zzfhnVar2 = zzfhnVar;
            zzcsb a2 = zzdgaVar.a();
            InterfaceFutureC8411o11 h = a2.h(a2.i());
            this.i = h;
            zzgcy.r(h, new zzezw(this, zzelgVar, zzfhnVar2, b, zzdgaVar), this.b);
            return true;
        }
    }

    public final void i(zzbdq zzbdqVar) {
        this.f = zzbdqVar;
    }
}
