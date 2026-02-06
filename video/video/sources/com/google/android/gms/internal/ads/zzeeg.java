package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeeg implements zzedf {
    public final zzcpu a;
    public final Context b;
    public final zzdpd c;
    public final zzfcp d;
    public final Executor e;
    public final zzfur f;
    public final zzdrx g;

    public zzeeg(zzcpu zzcpuVar, Context context, Executor executor, zzdpd zzdpdVar, zzfcp zzfcpVar, zzfur zzfurVar, zzdrx zzdrxVar) {
        this.b = context;
        this.a = zzcpuVar;
        this.e = executor;
        this.c = zzdpdVar;
        this.d = zzfcpVar;
        this.f = zzfurVar;
        this.g = zzdrxVar;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 c(final zzeeg zzeegVar, zzfcg zzfcgVar, zzfbu zzfbuVar, Object obj) {
        View zzdpgVar;
        zzbcm zzbcmVar = zzbcv.t2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzeegVar.g.a().putLong(zzdrl.RENDERING_WEBVIEW_CREATION_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        Context context = zzeegVar.b;
        com.google.android.gms.ads.internal.client.zzr a = zzfcv.a(context, zzfbuVar.u);
        final zzcfb a2 = zzeegVar.c.a(a, zzfbuVar, zzfcgVar.b.b);
        a2.R(zzfbuVar.W);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e8)).booleanValue() && zzfbuVar.g0) {
            zzdpgVar = zzcqj.a(context, a2.U(), zzfbuVar);
        } else {
            zzdpgVar = new zzdpg(context, a2.U(), (com.google.android.gms.ads.internal.util.zzau) zzeegVar.f.apply(zzfbuVar));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzeegVar.g.a().putLong(zzdrl.RENDERING_WEBVIEW_CREATION_END.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        final zzcoq a3 = zzeegVar.a.a(new zzcrn(zzfcgVar, zzfbuVar, null), new zzcow(zzdpgVar, a2, new zzcqv() { // from class: com.google.android.gms.internal.ads.zzeea
            @Override // com.google.android.gms.internal.ads.zzcqv
            public final com.google.android.gms.ads.internal.client.zzea a() {
                return zzcfb.this.r();
            }
        }, zzfcv.b(a)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzeegVar.g.a().putLong(zzdrl.RENDERING_AD_COMPONENT_CREATION_END.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        zzdpc j = a3.j();
        zzdrx zzdrxVar = zzeegVar.g;
        j.i(a2, false, null, zzdrxVar.a());
        zzcwl b = a3.b();
        zzcwn zzcwnVar = new zzcwn() { // from class: com.google.android.gms.internal.ads.zzeeb
            @Override // com.google.android.gms.internal.ads.zzcwn
            public final void s() {
                zzcfb zzcfbVar = zzcfb.this;
                if (zzcfbVar.M() != null) {
                    zzcfbVar.M().s();
                }
            }
        };
        zzgdj zzgdjVar = zzcaa.g;
        b.c1(zzcwnVar, zzgdjVar);
        zzfbz zzfbzVar = zzfbuVar.s;
        String str = zzfbzVar.a;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z5)).booleanValue() && a3.k().e(true)) {
            str = zzcgm.b(str, zzcgm.a(zzfbuVar));
        }
        a3.j();
        InterfaceFutureC8411o11 j2 = zzdpc.j(a2, zzfbzVar.b, str, zzdrxVar.a());
        if (zzfbuVar.M) {
            j2.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeec
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfb.this.W();
                }
            }, zzeegVar.e);
        }
        j2.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeed
            @Override // java.lang.Runnable
            public final void run() {
                zzeeg.d(zzeeg.this, a2);
            }
        }, zzeegVar.e);
        return zzgcy.m(j2, new zzfur() { // from class: com.google.android.gms.internal.ads.zzeee
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj2) {
                return zzcoq.this.h();
            }
        }, zzgdjVar);
    }

    public static /* synthetic */ void d(zzeeg zzeegVar, zzcfb zzcfbVar) {
        zzcfbVar.e0();
        zzfcp zzfcpVar = zzeegVar.d;
        zzcgd r = zzcfbVar.r();
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzfcpVar.a;
        if (zzfwVar != null && r != null) {
            r.a8(zzfwVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.v1)).booleanValue() && !zzcfbVar.isAttachedToWindow()) {
            zzcfbVar.onPause();
            zzcfbVar.g0(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedf
    public final boolean a(zzfcg zzfcgVar, zzfbu zzfbuVar) {
        zzfbz zzfbzVar = zzfbuVar.s;
        if (zzfbzVar != null && zzfbzVar.a != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzedf
    public final InterfaceFutureC8411o11 b(final zzfcg zzfcgVar, final zzfbu zzfbuVar) {
        return zzgcy.n(zzgcy.h(null), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzeef
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzeeg.c(zzeeg.this, zzfcgVar, zzfbuVar, obj);
            }
        }, this.e);
    }
}
