package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzefd implements zzedf {
    public final Context a;
    public final zzdpd b;
    public final zzdga c;
    public final zzfcp d;
    public final Executor e;
    public final VersionInfoParcel f;
    public final zzbjz g;
    public final boolean h = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.i9)).booleanValue();
    public final zzece i;
    public final zzdrx j;
    public final zzdsd k;

    public zzefd(Context context, VersionInfoParcel versionInfoParcel, zzfcp zzfcpVar, Executor executor, zzdga zzdgaVar, zzdpd zzdpdVar, zzbjz zzbjzVar, zzece zzeceVar, zzdrx zzdrxVar, zzdsd zzdsdVar) {
        this.a = context;
        this.d = zzfcpVar;
        this.c = zzdgaVar;
        this.e = executor;
        this.f = versionInfoParcel;
        this.b = zzdpdVar;
        this.g = zzbjzVar;
        this.i = zzeceVar;
        this.j = zzdrxVar;
        this.k = zzdsdVar;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 c(final zzefd zzefdVar, final zzfbu zzfbuVar, zzfcg zzfcgVar, zzdph zzdphVar, Object obj) {
        zzbjz zzbjzVar;
        zzbcm zzbcmVar = zzbcv.t2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzefdVar.j.a().putLong(zzdrl.RENDERING_WEBVIEW_CREATION_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        zzdpd zzdpdVar = zzefdVar.b;
        zzfcp zzfcpVar = zzefdVar.d;
        final zzcfb a = zzdpdVar.a(zzfcpVar.e, zzfbuVar, zzfcgVar.b.b);
        a.R(zzfbuVar.W);
        Context context = zzefdVar.a;
        zzdphVar.a(context, a.U());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzefdVar.j.a().putLong(zzdrl.RENDERING_WEBVIEW_CREATION_END.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        zzcaf zzcafVar = new zzcaf();
        zzdga zzdgaVar = zzefdVar.c;
        zzcrn zzcrnVar = new zzcrn(zzfcgVar, zzfbuVar, null);
        VersionInfoParcel versionInfoParcel = zzefdVar.f;
        boolean z = zzefdVar.h;
        zzbjz zzbjzVar2 = zzefdVar.g;
        final zzdex c = zzdgaVar.c(zzcrnVar, new zzdfa(new zzefc(context, versionInfoParcel, zzcafVar, zzfbuVar, a, zzfcpVar, z, zzbjzVar2, zzefdVar.i, zzefdVar.k), a));
        zzcafVar.c(c);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzefdVar.j.a().putLong(zzdrl.RENDERING_AD_COMPONENT_CREATION_END.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        c.b().c1(new zzcwn() { // from class: com.google.android.gms.internal.ads.zzefa
            @Override // com.google.android.gms.internal.ads.zzcwn
            public final void s() {
                zzcfb zzcfbVar = zzcfb.this;
                if (zzcfbVar.M() != null) {
                    zzcfbVar.M().s();
                }
            }
        }, zzcaa.g);
        zzfbz zzfbzVar = zzfbuVar.s;
        String str = zzfbzVar.a;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z5)).booleanValue() && c.l().e(true)) {
            str = zzcgm.b(str, zzcgm.a(zzfbuVar));
        }
        zzdpc k = c.k();
        if (true != z) {
            zzbjzVar = null;
        } else {
            zzbjzVar = zzbjzVar2;
        }
        zzdrx zzdrxVar = zzefdVar.j;
        k.i(a, true, zzbjzVar, zzdrxVar.a());
        c.k();
        return zzgcy.m(zzdpc.j(a, zzfbzVar.b, str, zzdrxVar.a()), new zzfur(zzefdVar) { // from class: com.google.android.gms.internal.ads.zzefb
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj2) {
                zzcfb zzcfbVar = a;
                if (zzfbuVar.M) {
                    zzcfbVar.W();
                }
                zzdex zzdexVar = c;
                zzcfbVar.e0();
                zzcfbVar.onPause();
                return zzdexVar.i();
            }
        }, zzefdVar.e);
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
        final zzdph zzdphVar = new zzdph();
        InterfaceFutureC8411o11 h = zzgcy.h(null);
        zzgcf zzgcfVar = new zzgcf() { // from class: com.google.android.gms.internal.ads.zzeey
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzefd.c(zzefd.this, zzfbuVar, zzfcgVar, zzdphVar, obj);
            }
        };
        Executor executor = this.e;
        InterfaceFutureC8411o11 n = zzgcy.n(h, zzgcfVar, executor);
        n.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeez
            @Override // java.lang.Runnable
            public final void run() {
                zzdph.this.b();
            }
        }, executor);
        return n;
    }
}
