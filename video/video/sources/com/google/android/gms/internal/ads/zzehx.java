package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzehx implements zzedf {
    public final Context a;
    public final zzdpd b;
    public final zzdom c;
    public final zzfcp d;
    public final Executor e;
    public final VersionInfoParcel f;
    public final zzbjz g;
    public final boolean h = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.i9)).booleanValue();
    public final zzece i;
    public final zzdrx j;
    public final zzdsd k;

    public zzehx(Context context, VersionInfoParcel versionInfoParcel, zzfcp zzfcpVar, Executor executor, zzdom zzdomVar, zzdpd zzdpdVar, zzbjz zzbjzVar, zzece zzeceVar, zzdrx zzdrxVar, zzdsd zzdsdVar) {
        this.a = context;
        this.d = zzfcpVar;
        this.c = zzdomVar;
        this.e = executor;
        this.f = versionInfoParcel;
        this.b = zzdpdVar;
        this.g = zzbjzVar;
        this.i = zzeceVar;
        this.j = zzdrxVar;
        this.k = zzdsdVar;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 c(final zzehx zzehxVar, final zzfbu zzfbuVar, zzfcg zzfcgVar, zzdph zzdphVar, Object obj) {
        zzbcm zzbcmVar = zzbcv.t2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzehxVar.j.a().putLong(zzdrl.RENDERING_WEBVIEW_CREATION_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        zzdpd zzdpdVar = zzehxVar.b;
        zzfcp zzfcpVar = zzehxVar.d;
        final zzcfb a = zzdpdVar.a(zzfcpVar.e, zzfbuVar, zzfcgVar.b.b);
        a.R(zzfbuVar.W);
        Context context = zzehxVar.a;
        zzdphVar.a(context, a.U());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzehxVar.j.a().putLong(zzdrl.RENDERING_WEBVIEW_CREATION_END.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        zzcaf zzcafVar = new zzcaf();
        zzdom zzdomVar = zzehxVar.c;
        zzcrn zzcrnVar = new zzcrn(zzfcgVar, zzfbuVar, null);
        VersionInfoParcel versionInfoParcel = zzehxVar.f;
        zzbjz zzbjzVar = zzehxVar.g;
        boolean z = zzehxVar.h;
        zzece zzeceVar = zzehxVar.i;
        zzdrx zzdrxVar = zzehxVar.j;
        final zzdoi f = zzdomVar.f(zzcrnVar, new zzdoj(new zzehw(context, zzdpdVar, zzfcpVar, versionInfoParcel, zzfbuVar, zzcafVar, a, zzbjzVar, z, zzeceVar, zzdrxVar, zzehxVar.k), a));
        zzcafVar.c(f);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzdrxVar.a().putLong(zzdrl.RENDERING_AD_COMPONENT_CREATION_END.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        zzbko.b(a, f.i());
        f.b().c1(new zzcwn() { // from class: com.google.android.gms.internal.ads.zzehq
            @Override // com.google.android.gms.internal.ads.zzcwn
            public final void s() {
                zzcfb zzcfbVar = zzcfb.this;
                if (zzcfbVar.M() != null) {
                    zzcfbVar.M().s();
                }
            }
        }, zzcaa.g);
        zzdpc l = f.l();
        if (true != z) {
            zzbjzVar = null;
        }
        l.i(a, true, zzbjzVar, zzdrxVar.a());
        zzfbz zzfbzVar = zzfbuVar.s;
        String str = zzfbzVar.a;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z5)).booleanValue() && f.m().e(true)) {
            str = zzcgm.b(str, zzcgm.a(zzfbuVar));
        }
        f.l();
        return zzgcy.m(zzdpc.j(a, zzfbzVar.b, str, zzdrxVar.a()), new zzfur(zzehxVar) { // from class: com.google.android.gms.internal.ads.zzehr
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj2) {
                zzcfb zzcfbVar = a;
                if (zzfbuVar.M) {
                    zzcfbVar.W();
                }
                zzdoi zzdoiVar = f;
                zzcfbVar.e0();
                zzcfbVar.onPause();
                return zzdoiVar.k();
            }
        }, zzehxVar.e);
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
        zzgcf zzgcfVar = new zzgcf() { // from class: com.google.android.gms.internal.ads.zzehs
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzehx.c(zzehx.this, zzfbuVar, zzfcgVar, zzdphVar, obj);
            }
        };
        Executor executor = this.e;
        InterfaceFutureC8411o11 n = zzgcy.n(h, zzgcfVar, executor);
        n.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeht
            @Override // java.lang.Runnable
            public final void run() {
                zzdph.this.b();
            }
        }, executor);
        return n;
    }
}
