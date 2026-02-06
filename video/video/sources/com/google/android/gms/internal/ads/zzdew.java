package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzdew extends zzcqx {
    public final Context j;
    public final WeakReference k;
    public final zzddc l;
    public final zzdgi m;
    public final zzcrs n;

    /* renamed from: o  reason: collision with root package name */
    public final zzfoi f261o;
    public final zzcwg p;
    public final zzbzr q;
    public boolean r;

    public zzdew(zzcqw zzcqwVar, Context context, @InterfaceC10571ws1 zzcfb zzcfbVar, zzddc zzddcVar, zzdgi zzdgiVar, zzcrs zzcrsVar, zzfoi zzfoiVar, zzcwg zzcwgVar, zzbzr zzbzrVar) {
        super(zzcqwVar);
        this.r = false;
        this.j = context;
        this.k = new WeakReference(zzcfbVar);
        this.l = zzddcVar;
        this.m = zzdgiVar;
        this.n = zzcrsVar;
        this.f261o = zzfoiVar;
        this.p = zzcwgVar;
        this.q = zzbzrVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfb zzcfbVar = (zzcfb) this.k.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R6)).booleanValue()) {
                if (!this.r && zzcfbVar != null) {
                    zzcaa.f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdev
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

    public final boolean i() {
        return this.n.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.Context] */
    public final boolean j(boolean z, @InterfaceC10571ws1 Activity activity) {
        zzfbu F;
        zzddc zzddcVar = this.l;
        zzddcVar.b();
        com.google.android.gms.ads.internal.zzv.v();
        zzdgi zzdgiVar = this.m;
        if (!com.google.android.gms.ads.internal.util.zzs.o(zzdgiVar.a())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q0)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.v();
                if (com.google.android.gms.ads.internal.util.zzs.h(this.j)) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    this.p.f();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R0)).booleanValue()) {
                        this.f261o.a(this.a.b.b.b);
                    }
                    return false;
                }
            }
        }
        zzcfb zzcfbVar = (zzcfb) this.k.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ic)).booleanValue() && zzcfbVar != null && (F = zzcfbVar.F()) != null && F.r0 && F.s0 != this.q.a()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("The interstitial consent form has been shown.");
            this.p.k1(zzfdq.d(12, "The consent form has already been shown.", null));
        } else {
            if (this.r) {
                int i3 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("The interstitial ad has been shown.");
                this.p.k1(zzfdq.d(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.r) {
                if (activity == null) {
                    activity2 = this.j;
                }
                try {
                    zzdgiVar.b(z, activity2, this.p);
                    zzddcVar.a();
                    this.r = true;
                    return true;
                } catch (zzdgh e) {
                    this.p.k(e);
                }
            }
        }
        return false;
    }
}
