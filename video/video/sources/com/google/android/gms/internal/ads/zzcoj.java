package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcoj extends zzcqx {
    @InterfaceC11300zs1
    public final zzcfb j;
    public final int k;
    public final Context l;
    public final zzcnx m;
    public final zzdgi n;

    /* renamed from: o  reason: collision with root package name */
    public final zzddc f253o;
    public final zzcwg p;
    public final boolean q;
    public final zzbzr r;
    public boolean s;

    public zzcoj(zzcqw zzcqwVar, Context context, @InterfaceC11300zs1 zzcfb zzcfbVar, int i, zzcnx zzcnxVar, zzdgi zzdgiVar, zzddc zzddcVar, zzcwg zzcwgVar, zzbzr zzbzrVar) {
        super(zzcqwVar);
        this.s = false;
        this.j = zzcfbVar;
        this.l = context;
        this.k = i;
        this.m = zzcnxVar;
        this.n = zzdgiVar;
        this.f253o = zzddcVar;
        this.p = zzcwgVar;
        this.q = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.H5)).booleanValue();
        this.r = zzbzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqx
    public final void a() {
        super.a();
        zzcfb zzcfbVar = this.j;
        if (zzcfbVar != null) {
            zzcfbVar.destroy();
        }
    }

    public final int i() {
        return this.k;
    }

    public final void j(zzbah zzbahVar) {
        zzcfb zzcfbVar = this.j;
        if (zzcfbVar != null) {
            zzcfbVar.V0(zzbahVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r5 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Activity activity, zzbau zzbauVar, boolean z) throws RemoteException {
        Activity activity2;
        zzcfb zzcfbVar;
        zzfbu F;
        if (activity == null) {
            activity2 = this.l;
        }
        boolean z2 = this.q;
        if (z2) {
            this.f253o.b();
        }
        com.google.android.gms.ads.internal.zzv.v();
        zzdgi zzdgiVar = this.n;
        if (!com.google.android.gms.ads.internal.util.zzs.o(zzdgiVar.a())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q0)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.v();
                if (com.google.android.gms.ads.internal.util.zzs.h(activity2)) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.p.f();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R0)).booleanValue()) {
                        new zzfoi(activity2.getApplicationContext(), com.google.android.gms.ads.internal.zzv.z().b()).a(this.a.b.b.b);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ic)).booleanValue() && (zzcfbVar = this.j) != null && (F = zzcfbVar.F()) != null && F.r0 && F.s0 != this.r.a()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("The app open consent form has been shown.");
            this.p.k1(zzfdq.d(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.s) {
            int i3 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("App open interstitial ad is already visible.");
            this.p.k1(zzfdq.d(10, null, null));
        }
        if (!this.s) {
            try {
                zzdgiVar.b(z, activity2, this.p);
                if (z2) {
                    this.f253o.a();
                }
                this.s = true;
            } catch (zzdgh e) {
                this.p.k(e);
            }
        }
    }

    public final void l(long j, int i) {
        this.m.a(j, i);
    }
}
