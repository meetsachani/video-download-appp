package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeyg implements zzelh {
    public final Context a;
    public final Executor b;
    public final zzchb c;
    public final zzekr d;
    public final zzekv e;
    public final ViewGroup f;
    @InterfaceC11300zs1
    public zzbdq g;
    public final zzcyq h;
    public final zzfhq i;
    public final zzdaw j;
    public final zzfcn k;
    @InterfaceC11300zs1
    public InterfaceFutureC8411o11 l;
    public boolean m;
    @InterfaceC11300zs1
    public com.google.android.gms.ads.internal.client.zze n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public zzelg f276o;

    public zzeyg(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzr zzrVar, zzchb zzchbVar, zzekr zzekrVar, zzekv zzekvVar, zzfcn zzfcnVar, zzdaw zzdawVar) {
        this.a = context;
        this.b = executor;
        this.c = zzchbVar;
        this.d = zzekrVar;
        this.e = zzekvVar;
        this.k = zzfcnVar;
        this.h = zzchbVar.j();
        this.i = zzchbVar.C();
        this.f = new FrameLayout(context);
        this.j = zzdawVar;
        zzfcnVar.O(zzrVar);
        this.m = true;
        this.n = null;
        this.f276o = null;
    }

    @Override // com.google.android.gms.internal.ads.zzelh
    public final boolean a() {
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.l;
        if (interfaceFutureC8411o11 != null && !interfaceFutureC8411o11.isDone()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzelh
    public final boolean b(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, @InterfaceC11300zs1 zzelf zzelfVar, zzelg zzelgVar) throws RemoteException {
        zzcpu k;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Ad unit ID should not be null for banner ad.");
            this.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeye
                @Override // java.lang.Runnable
                public final void run() {
                    zzeyg.this.d.C0(zzfdq.d(6, null, null));
                }
            });
            return false;
        }
        if (a()) {
            if (!this.k.s()) {
                this.m = true;
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j9)).booleanValue() && zzmVar.a1) {
                this.c.p().p(true);
            }
            Bundle a = zzdrn.a(new Pair(zzdrl.PUBLIC_API_CALL.e(), Long.valueOf(zzmVar.u1)), new Pair(zzdrl.DYNAMITE_ENTER.e(), Long.valueOf(com.google.android.gms.ads.internal.zzv.d().a())));
            zzfcn zzfcnVar = this.k;
            zzfcnVar.P(str);
            zzfcnVar.h(zzmVar);
            zzfcnVar.a(a);
            Context context = this.a;
            zzfcp j = zzfcnVar.j();
            zzfhc b = zzfhb.b(context, zzfhm.f(j), 3, zzmVar);
            zzfhn zzfhnVar = null;
            if (((Boolean) zzbfb.d.e()).booleanValue() && zzfcnVar.D().f1) {
                zzekr zzekrVar = this.d;
                if (zzekrVar != null) {
                    zzekrVar.C0(zzfdq.d(7, null, null));
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.v8)).booleanValue()) {
                    zzcpt i2 = this.c.i();
                    zzcva zzcvaVar = new zzcva();
                    zzcvaVar.f(context);
                    zzcvaVar.k(j);
                    i2.i(zzcvaVar.l());
                    zzdbp zzdbpVar = new zzdbp();
                    zzekr zzekrVar2 = this.d;
                    Executor executor = this.b;
                    zzdbpVar.m(zzekrVar2, executor);
                    zzdbpVar.n(zzekrVar2, executor);
                    i2.m(zzdbpVar.q());
                    i2.q(new zzeja(this.g));
                    i2.b(new zzdgr(zzdiz.h, null));
                    i2.r(new zzcqp(this.h, this.j));
                    i2.c(new zzcom(this.f));
                    k = i2.k();
                } else {
                    zzcpt i3 = this.c.i();
                    zzcva zzcvaVar2 = new zzcva();
                    zzcvaVar2.f(context);
                    zzcvaVar2.k(j);
                    i3.i(zzcvaVar2.l());
                    zzdbp zzdbpVar2 = new zzdbp();
                    zzekr zzekrVar3 = this.d;
                    Executor executor2 = this.b;
                    zzdbpVar2.m(zzekrVar3, executor2);
                    zzdbpVar2.d(zzekrVar3, executor2);
                    zzdbpVar2.d(this.e, executor2);
                    zzdbpVar2.o(zzekrVar3, executor2);
                    zzdbpVar2.g(zzekrVar3, executor2);
                    zzdbpVar2.h(zzekrVar3, executor2);
                    zzdbpVar2.i(zzekrVar3, executor2);
                    zzdbpVar2.e(zzekrVar3, executor2);
                    zzdbpVar2.n(zzekrVar3, executor2);
                    zzdbpVar2.l(zzekrVar3, executor2);
                    i3.m(zzdbpVar2.q());
                    i3.q(new zzeja(this.g));
                    i3.b(new zzdgr(zzdiz.h, null));
                    i3.r(new zzcqp(this.h, this.j));
                    i3.c(new zzcom(this.f));
                    k = i3.k();
                }
                if (((Boolean) zzbeo.c.e()).booleanValue()) {
                    zzfhnVar = k.e();
                    zzfhnVar.i(3);
                    zzfhnVar.b(zzmVar.k1);
                    zzfhnVar.f(zzmVar.h1);
                }
                this.f276o = zzelgVar;
                zzcsb c = k.c();
                InterfaceFutureC8411o11 h = c.h(c.i());
                this.l = h;
                zzgcy.r(h, new zzeyf(this, zzfhnVar, b, k), this.b);
                return true;
            }
        }
        return false;
    }

    public final ViewGroup c() {
        return this.f;
    }

    public final zzfcn f() {
        return this.k;
    }

    public final void l() {
        this.h.n1(this.j.a());
    }

    public final void m() {
        this.h.t1(this.j.b());
    }

    public final void n(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.e.a(zzbhVar);
    }

    public final void o(zzcyk zzcykVar) {
        this.h.c1(zzcykVar, this.b);
    }

    public final void p(zzbdq zzbdqVar) {
        this.g = zzbdqVar;
    }

    public final void q() {
        synchronized (this) {
            try {
                InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.l;
                if (interfaceFutureC8411o11 != null && interfaceFutureC8411o11.isDone()) {
                    try {
                        zzcop zzcopVar = (zzcop) this.l.get();
                        this.l = null;
                        ViewGroup viewGroup = this.f;
                        viewGroup.removeAllViews();
                        zzcopVar.k();
                        ViewParent parent = zzcopVar.k().getParent();
                        if (parent instanceof ViewGroup) {
                            String str = "";
                            if (zzcopVar.c() != null) {
                                str = zzcopVar.c().g();
                            }
                            int i = com.google.android.gms.ads.internal.util.zze.b;
                            com.google.android.gms.ads.internal.util.client.zzo.g("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                            ((ViewGroup) parent).removeView(zzcopVar.k());
                        }
                        zzbcm zzbcmVar = zzbcv.v8;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
                            zzdae e = zzcopVar.e();
                            e.a(this.d);
                            e.c(this.e);
                        }
                        viewGroup.addView(zzcopVar.k());
                        zzelg zzelgVar = this.f276o;
                        if (zzelgVar != null) {
                            zzelgVar.c(zzcopVar);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
                            Executor executor = this.b;
                            final zzekr zzekrVar = this.d;
                            Objects.requireNonNull(zzekrVar);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzekr.this.v();
                                }
                            });
                        }
                        if (zzcopVar.i() >= 0) {
                            this.m = false;
                            zzcyq zzcyqVar = this.h;
                            zzcyqVar.n1(zzcopVar.i());
                            zzcyqVar.t1(zzcopVar.j());
                        } else {
                            this.m = true;
                            this.h.n1(zzcopVar.j());
                        }
                    } catch (InterruptedException e2) {
                        e = e2;
                        t();
                        com.google.android.gms.ads.internal.util.zze.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.m = true;
                        this.h.a();
                    } catch (ExecutionException e3) {
                        e = e3;
                        t();
                        com.google.android.gms.ads.internal.util.zze.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.m = true;
                        this.h.a();
                    }
                } else if (this.l != null) {
                    com.google.android.gms.ads.internal.util.zze.k("Show timer went off but there is an ongoing ad request.");
                    this.m = true;
                } else {
                    com.google.android.gms.ads.internal.util.zze.k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.m = true;
                    this.h.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean s() {
        ViewParent parent = this.f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzv.v();
        return com.google.android.gms.ads.internal.util.zzs.x(view, view.getContext());
    }

    public final void t() {
        this.l = null;
        final com.google.android.gms.ads.internal.client.zze zzeVar = this.n;
        this.n = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.v8)).booleanValue() && zzeVar != null) {
            this.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyc
                @Override // java.lang.Runnable
                public final void run() {
                    zzeyg.this.d.C0(zzeVar);
                }
            });
        }
        zzelg zzelgVar = this.f276o;
        if (zzelgVar != null) {
            zzelgVar.a();
        }
    }
}
