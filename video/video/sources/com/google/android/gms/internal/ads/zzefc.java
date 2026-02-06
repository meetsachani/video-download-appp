package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzefc implements zzdgi {
    public final Context a;
    public final VersionInfoParcel b;
    public final InterfaceFutureC8411o11 c;
    public final zzfbu d;
    public final zzcfb e;
    public final zzfcp f;
    public final zzbjz g;
    public final boolean h;
    public final zzece i;
    public final zzdsd j;

    public zzefc(Context context, VersionInfoParcel versionInfoParcel, InterfaceFutureC8411o11 interfaceFutureC8411o11, zzfbu zzfbuVar, zzcfb zzcfbVar, zzfcp zzfcpVar, boolean z, zzbjz zzbjzVar, zzece zzeceVar, zzdsd zzdsdVar) {
        this.a = context;
        this.b = versionInfoParcel;
        this.c = interfaceFutureC8411o11;
        this.d = zzfbuVar;
        this.e = zzcfbVar;
        this.f = zzfcpVar;
        this.g = zzbjzVar;
        this.h = z;
        this.i = zzeceVar;
        this.j = zzdsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgi
    @InterfaceC11300zs1
    public final zzfbu a() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzdgi
    public final void b(boolean z, Context context, zzcwg zzcwgVar) {
        boolean z2;
        float f;
        zzece zzeceVar;
        zzdex zzdexVar = (zzdex) zzgcy.q(this.c);
        zzcfb zzcfbVar = this.e;
        zzcfbVar.l1(true);
        boolean z3 = this.h;
        boolean z4 = false;
        if (z3) {
            z2 = this.g.e(false);
        } else {
            z2 = false;
        }
        com.google.android.gms.ads.internal.zzv.v();
        boolean j = com.google.android.gms.ads.internal.util.zzs.j(this.a);
        if (z3) {
            z4 = this.g.d();
        }
        boolean z5 = z4;
        if (z3) {
            f = this.g.a();
        } else {
            f = 0.0f;
        }
        float f2 = f;
        zzfbu zzfbuVar = this.d;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(z2, j, z5, f2, -1, z, zzfbuVar.O, false);
        if (zzcwgVar != null) {
            zzcwgVar.e();
        }
        com.google.android.gms.ads.internal.zzv.n();
        zzdfx j2 = zzdexVar.j();
        int i = zzfbuVar.Q;
        VersionInfoParcel versionInfoParcel = this.b;
        String str = zzfbuVar.B;
        zzfbz zzfbzVar = zzfbuVar.s;
        String str2 = zzfbzVar.b;
        String str3 = zzfbzVar.a;
        zzfcp zzfcpVar = this.f;
        if (zzfbuVar.b()) {
            zzeceVar = this.i;
        } else {
            zzeceVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzn.a(context, new AdOverlayInfoParcel(null, j2, null, zzcfbVar, i, versionInfoParcel, str, zzlVar, str2, str3, zzfcpVar.f, zzcwgVar, zzeceVar, zzcfbVar.x()), true, this.j);
    }
}
