package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzedq implements zzedf {
    public final zzcod a;
    public final Context b;
    public final zzdpd c;
    public final zzfcp d;
    public final Executor e;
    public final VersionInfoParcel f;
    public final zzbjz g;
    public final boolean h = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.i9)).booleanValue();
    public final zzece i;
    public final zzdrx j;
    public final zzdsd k;

    public zzedq(zzcod zzcodVar, Context context, Executor executor, zzdpd zzdpdVar, zzfcp zzfcpVar, VersionInfoParcel versionInfoParcel, zzbjz zzbjzVar, zzece zzeceVar, zzdrx zzdrxVar, zzdsd zzdsdVar) {
        this.b = context;
        this.a = zzcodVar;
        this.e = executor;
        this.c = zzdpdVar;
        this.d = zzfcpVar;
        this.f = versionInfoParcel;
        this.g = zzbjzVar;
        this.i = zzeceVar;
        this.j = zzdrxVar;
        this.k = zzdsdVar;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 c(final zzedq zzedqVar, final zzfbu zzfbuVar, zzfcg zzfcgVar, zzdph zzdphVar, Object obj) {
        zzbcm zzbcmVar = zzbcv.t2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzedqVar.j.a().putLong(zzdrl.RENDERING_WEBVIEW_CREATION_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        zzdpd zzdpdVar = zzedqVar.c;
        zzfcp zzfcpVar = zzedqVar.d;
        final zzcfb a = zzdpdVar.a(zzfcpVar.e, zzfbuVar, zzfcgVar.b.b);
        a.R(zzfbuVar.W);
        zzdphVar.a(zzedqVar.b, a.U());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzedqVar.j.a().putLong(zzdrl.RENDERING_WEBVIEW_CREATION_END.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        zzcaf zzcafVar = new zzcaf();
        zzcod zzcodVar = zzedqVar.a;
        zzbjz zzbjzVar = null;
        zzcrn zzcrnVar = new zzcrn(zzfcgVar, zzfbuVar, null);
        VersionInfoParcel versionInfoParcel = zzedqVar.f;
        boolean z = zzedqVar.h;
        zzbjz zzbjzVar2 = zzedqVar.g;
        final zzcoa a2 = zzcodVar.a(zzcrnVar, new zzdfa(new zzeds(versionInfoParcel, zzcafVar, zzfbuVar, a, zzfcpVar, z, zzbjzVar2, zzedqVar.i, zzedqVar.k), a), new zzcob(zzfbuVar.a0));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzedqVar.j.a().putLong(zzdrl.RENDERING_AD_COMPONENT_CREATION_END.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        zzdpc j = a2.j();
        if (true == z) {
            zzbjzVar = zzbjzVar2;
        }
        zzdrx zzdrxVar = zzedqVar.j;
        j.i(a, false, zzbjzVar, zzdrxVar.a());
        zzcafVar.c(a2);
        a2.b().c1(new zzcwn() { // from class: com.google.android.gms.internal.ads.zzedo
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z5)).booleanValue() && a2.k().e(true)) {
            str = zzcgm.b(str, zzcgm.a(zzfbuVar));
        }
        a2.j();
        return zzgcy.m(zzdpc.j(a, zzfbzVar.b, str, zzdrxVar.a()), new zzfur(zzedqVar) { // from class: com.google.android.gms.internal.ads.zzedp
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj2) {
                zzcfb zzcfbVar = a;
                if (zzfbuVar.M) {
                    zzcfbVar.W();
                }
                zzcoa zzcoaVar = a2;
                zzcfbVar.e0();
                zzcfbVar.onPause();
                return zzcoaVar.h();
            }
        }, zzedqVar.e);
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
        zzgcf zzgcfVar = new zzgcf() { // from class: com.google.android.gms.internal.ads.zzedm
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzedq.c(zzedq.this, zzfbuVar, zzfcgVar, zzdphVar, obj);
            }
        };
        Executor executor = this.e;
        InterfaceFutureC8411o11 n = zzgcy.n(h, zzgcfVar, executor);
        n.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedn
            @Override // java.lang.Runnable
            public final void run() {
                zzdph.this.b();
            }
        }, executor);
        return n;
    }
}
