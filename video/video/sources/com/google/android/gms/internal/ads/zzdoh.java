package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzdoh extends zzcqx {
    public final Context j;
    public final WeakReference k;
    public final zzdgi l;
    public final zzddc m;
    public final zzcwg n;

    /* renamed from: o  reason: collision with root package name */
    public final zzcxn f269o;
    public final zzcrs p;
    public final zzbwn q;
    public final zzfoi r;
    public final zzfci s;
    public boolean t;

    public zzdoh(zzcqw zzcqwVar, Context context, @InterfaceC11300zs1 zzcfb zzcfbVar, zzdgi zzdgiVar, zzddc zzddcVar, zzcwg zzcwgVar, zzcxn zzcxnVar, zzcrs zzcrsVar, zzfbu zzfbuVar, zzfoi zzfoiVar, zzfci zzfciVar) {
        super(zzcqwVar);
        String str;
        int i;
        this.t = false;
        this.j = context;
        this.l = zzdgiVar;
        this.k = new WeakReference(zzcfbVar);
        this.m = zzddcVar;
        this.n = zzcwgVar;
        this.f269o = zzcxnVar;
        this.p = zzcrsVar;
        this.r = zzfoiVar;
        zzbwj zzbwjVar = zzfbuVar.l;
        if (zzbwjVar != null) {
            str = zzbwjVar.X;
        } else {
            str = "";
        }
        if (zzbwjVar != null) {
            i = zzbwjVar.Y;
        } else {
            i = 1;
        }
        this.q = new zzbxh(str, i);
        this.s = zzfciVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfb zzcfbVar = (zzcfb) this.k.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R6)).booleanValue()) {
                if (!this.t && zzcfbVar != null) {
                    zzcaa.f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdog
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcfb.this.destroy();
                        }
                    });
                }
            } else if (zzcfbVar != null) {
                zzcfbVar.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final Bundle i() {
        return this.f269o.n1();
    }

    public final zzbwn j() {
        return this.q;
    }

    public final zzfci k() {
        return this.s;
    }

    public final boolean l() {
        return this.p.a();
    }

    public final boolean m() {
        return this.t;
    }

    public final boolean n() {
        zzcfb zzcfbVar = (zzcfb) this.k.get();
        if (zzcfbVar != null && !zzcfbVar.z0()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.content.Context] */
    public final boolean o(boolean z, @InterfaceC11300zs1 Activity activity) {
        com.google.android.gms.ads.internal.zzv.v();
        zzdgi zzdgiVar = this.l;
        if (!com.google.android.gms.ads.internal.util.zzs.o(zzdgiVar.a())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q0)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.v();
                if (com.google.android.gms.ads.internal.util.zzs.h(this.j)) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.n.f();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R0)).booleanValue()) {
                        this.r.a(this.a.b.b.b);
                    }
                    return false;
                }
            }
        }
        if (this.t) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("The rewarded ad have been showed.");
            this.n.k1(zzfdq.d(10, null, null));
            return false;
        }
        this.t = true;
        zzddc zzddcVar = this.m;
        zzddcVar.b();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.j;
        }
        try {
            zzdgiVar.b(z, activity2, this.n);
            zzddcVar.a();
            return true;
        } catch (zzdgh e) {
            this.n.k(e);
            return false;
        }
    }
}
