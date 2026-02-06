package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcos extends zzcop {
    public final Context j;
    public final View k;
    @InterfaceC11300zs1
    public final zzcfb l;
    public final zzfbv m;
    public final zzcqv n;

    /* renamed from: o  reason: collision with root package name */
    public final zzdiz f254o;
    public final zzdea p;
    public final zzhfp q;
    public final Executor r;
    public com.google.android.gms.ads.internal.client.zzr s;

    public zzcos(zzcqw zzcqwVar, Context context, zzfbv zzfbvVar, View view, @InterfaceC11300zs1 zzcfb zzcfbVar, zzcqv zzcqvVar, zzdiz zzdizVar, zzdea zzdeaVar, zzhfp zzhfpVar, Executor executor) {
        super(zzcqwVar);
        this.j = context;
        this.k = view;
        this.l = zzcfbVar;
        this.m = zzfbvVar;
        this.n = zzcqvVar;
        this.f254o = zzdizVar;
        this.p = zzdeaVar;
        this.q = zzhfpVar;
        this.r = executor;
    }

    public static /* synthetic */ void q(zzcos zzcosVar) {
        zzbhr e = zzcosVar.f254o.e();
        if (e == null) {
            return;
        }
        try {
            e.N1((com.google.android.gms.ads.internal.client.zzbx) zzcosVar.q.b(), ObjectWrapper.V3(zzcosVar.j));
        } catch (RemoteException e2) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("RemoteException when notifyAdLoad is called", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqx
    public final void b() {
        this.r.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcor
            @Override // java.lang.Runnable
            public final void run() {
                zzcos.q(zzcos.this);
            }
        });
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.zzcop
    public final int i() {
        return this.a.b.b.d;
    }

    @Override // com.google.android.gms.internal.ads.zzcop
    public final int j() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e8)).booleanValue() && this.b.g0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.f8)).booleanValue()) {
                return 0;
            }
        }
        return this.a.b.b.c;
    }

    @Override // com.google.android.gms.internal.ads.zzcop
    public final View k() {
        return this.k;
    }

    @Override // com.google.android.gms.internal.ads.zzcop
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzea l() {
        try {
            return this.n.a();
        } catch (zzfcw unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcop
    public final zzfbv m() {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.s;
        if (zzrVar != null) {
            return zzfcv.b(zzrVar);
        }
        zzfbu zzfbuVar = this.b;
        if (zzfbuVar.c0) {
            for (String str : zzfbuVar.a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.k;
            return new zzfbv(view.getWidth(), view.getHeight(), false);
        }
        return (zzfbv) zzfbuVar.r.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcop
    public final zzfbv n() {
        return this.m;
    }

    @Override // com.google.android.gms.internal.ads.zzcop
    public final void o() {
        this.p.a();
    }

    @Override // com.google.android.gms.internal.ads.zzcop
    public final void p(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzcfb zzcfbVar;
        if (viewGroup != null && (zzcfbVar = this.l) != null) {
            zzcfbVar.b1(zzcgv.c(zzrVar));
            viewGroup.setMinimumHeight(zzrVar.Z);
            viewGroup.setMinimumWidth(zzrVar.a1);
            this.s = zzrVar;
        }
    }
}
