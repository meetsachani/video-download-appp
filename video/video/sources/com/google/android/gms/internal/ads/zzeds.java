package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeds implements zzdgi {
    public final VersionInfoParcel a;
    public final InterfaceFutureC8411o11 b;
    public final zzfbu c;
    public final zzcfb d;
    public final zzfcp e;
    public final zzbjz f;
    public final boolean g;
    public final zzece h;
    public final zzdsd i;

    public zzeds(VersionInfoParcel versionInfoParcel, InterfaceFutureC8411o11 interfaceFutureC8411o11, zzfbu zzfbuVar, zzcfb zzcfbVar, zzfcp zzfcpVar, boolean z, zzbjz zzbjzVar, zzece zzeceVar, zzdsd zzdsdVar) {
        this.a = versionInfoParcel;
        this.b = interfaceFutureC8411o11;
        this.c = zzfbuVar;
        this.d = zzcfbVar;
        this.e = zzfcpVar;
        this.g = z;
        this.f = zzbjzVar;
        this.h = zzeceVar;
        this.i = zzdsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgi
    @InterfaceC11300zs1
    public final zzfbu a() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzdgi
    public final void b(boolean z, Context context, zzcwg zzcwgVar) {
        boolean z2;
        boolean z3;
        float f;
        zzece zzeceVar;
        zzcoa zzcoaVar = (zzcoa) zzgcy.q(this.b);
        zzcfb zzcfbVar = this.d;
        zzcfbVar.l1(true);
        boolean z4 = this.g;
        if (z4) {
            z2 = this.f.e(true);
        } else {
            z2 = true;
        }
        if (z4) {
            z3 = this.f.d();
        } else {
            z3 = false;
        }
        boolean z5 = z3;
        if (z4) {
            f = this.f.a();
        } else {
            f = 0.0f;
        }
        float f2 = f;
        zzfbu zzfbuVar = this.c;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(z2, true, z5, f2, -1, z, zzfbuVar.O, false);
        if (zzcwgVar != null) {
            zzcwgVar.e();
        }
        com.google.android.gms.ads.internal.zzv.n();
        zzdfx i = zzcoaVar.i();
        int i2 = zzfbuVar.Q;
        if (i2 == -1) {
            com.google.android.gms.ads.internal.client.zzx zzxVar = this.e.j;
            if (zzxVar != null) {
                int i3 = zzxVar.X;
                if (i3 == 1) {
                    i2 = 7;
                } else if (i3 == 2) {
                    i2 = 6;
                }
            }
            int i4 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Error setting app open orientation; no targeting orientation available.");
        }
        VersionInfoParcel versionInfoParcel = this.a;
        String str = zzfbuVar.B;
        zzfbz zzfbzVar = zzfbuVar.s;
        String str2 = zzfbzVar.b;
        String str3 = zzfbzVar.a;
        zzfcp zzfcpVar = this.e;
        if (zzfbuVar.b()) {
            zzeceVar = this.h;
        } else {
            zzeceVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzn.a(context, new AdOverlayInfoParcel(null, i, null, zzcfbVar, i2, versionInfoParcel, str, zzlVar, str2, str3, zzfcpVar.f, zzcwgVar, zzeceVar, zzcfbVar.x()), true, this.i);
    }
}
