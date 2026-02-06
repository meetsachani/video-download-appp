package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzehw implements zzdgi {
    public final Context a;
    public final zzdpd b;
    public final zzfcp c;
    public final VersionInfoParcel d;
    public final zzfbu e;
    public final InterfaceFutureC8411o11 f;
    public final zzcfb g;
    public final zzbjz h;
    public final boolean i;
    public final zzece j;
    public final zzdrx k;
    public final zzdsd l;

    public zzehw(Context context, zzdpd zzdpdVar, zzfcp zzfcpVar, VersionInfoParcel versionInfoParcel, zzfbu zzfbuVar, InterfaceFutureC8411o11 interfaceFutureC8411o11, zzcfb zzcfbVar, zzbjz zzbjzVar, boolean z, zzece zzeceVar, zzdrx zzdrxVar, zzdsd zzdsdVar) {
        this.a = context;
        this.b = zzdpdVar;
        this.c = zzfcpVar;
        this.d = versionInfoParcel;
        this.e = zzfbuVar;
        this.f = interfaceFutureC8411o11;
        this.g = zzcfbVar;
        this.h = zzbjzVar;
        this.i = z;
        this.j = zzeceVar;
        this.k = zzdrxVar;
        this.l = zzdsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgi
    @InterfaceC11300zs1
    public final zzfbu a() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzdgi
    public final void b(boolean z, Context context, zzcwg zzcwgVar) {
        zzbjz zzbjzVar;
        boolean z2;
        float f;
        zzece zzeceVar;
        zzdoi zzdoiVar = (zzdoi) zzgcy.q(this.f);
        try {
            zzfbu zzfbuVar = this.e;
            final zzcfb zzcfbVar = this.g;
            if (zzcfbVar.z0()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.b1)).booleanValue()) {
                    zzcfbVar = this.b.a(this.c.e, null, null);
                    zzbko.b(zzcfbVar, zzdoiVar.i());
                    final zzdph zzdphVar = new zzdph();
                    zzdphVar.a(this.a, zzcfbVar.U());
                    zzdpc l = zzdoiVar.l();
                    if (this.i) {
                        zzbjzVar = this.h;
                    } else {
                        zzbjzVar = null;
                    }
                    l.i(zzcfbVar, true, zzbjzVar, this.k.a());
                    zzcfbVar.M().f1(new zzcgr() { // from class: com.google.android.gms.internal.ads.zzehu
                        @Override // com.google.android.gms.internal.ads.zzcgr
                        public final void a(boolean z3, int i, String str, String str2) {
                            zzdph.this.b();
                            zzcfb zzcfbVar2 = zzcfbVar;
                            zzcfbVar2.e0();
                            zzcfbVar2.M().s();
                        }
                    });
                    zzcfbVar.M().v0(new zzcgs() { // from class: com.google.android.gms.internal.ads.zzehv
                        @Override // com.google.android.gms.internal.ads.zzcgs
                        public final void a() {
                            zzcfb.this.c0();
                        }
                    });
                    zzfbz zzfbzVar = zzfbuVar.s;
                    zzcfbVar.h1(zzfbzVar.b, zzfbzVar.a, null);
                }
            }
            zzcfb zzcfbVar2 = zzcfbVar;
            zzcfbVar2.l1(true);
            boolean z3 = this.i;
            boolean z4 = false;
            if (z3) {
                z2 = this.h.e(false);
            } else {
                z2 = false;
            }
            com.google.android.gms.ads.internal.zzv.v();
            boolean j = com.google.android.gms.ads.internal.util.zzs.j(this.a);
            if (z3) {
                z4 = this.h.d();
            }
            if (z3) {
                f = this.h.a();
            } else {
                f = 0.0f;
            }
            float f2 = f;
            zzfbu zzfbuVar2 = this.e;
            com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(z2, j, z4, f2, -1, z, zzfbuVar2.O, zzfbuVar2.P);
            if (zzcwgVar != null) {
                zzcwgVar.e();
            }
            com.google.android.gms.ads.internal.zzv.n();
            zzdfx j2 = zzdoiVar.j();
            int i = zzfbuVar2.Q;
            VersionInfoParcel versionInfoParcel = this.d;
            String str = zzfbuVar2.B;
            zzfbz zzfbzVar2 = zzfbuVar2.s;
            String str2 = zzfbzVar2.b;
            String str3 = zzfbzVar2.a;
            zzfcp zzfcpVar = this.c;
            if (zzfbuVar2.b()) {
                zzeceVar = this.j;
            } else {
                zzeceVar = null;
            }
            com.google.android.gms.ads.internal.overlay.zzn.a(context, new AdOverlayInfoParcel(null, j2, null, zzcfbVar2, i, versionInfoParcel, str, zzlVar, str2, str3, zzfcpVar.f, zzcwgVar, zzeceVar, zzcfbVar2.x()), true, this.l);
        } catch (zzcfn e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }
}
