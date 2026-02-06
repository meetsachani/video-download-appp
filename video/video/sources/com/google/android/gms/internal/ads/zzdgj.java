package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.C2531Be;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.UE;

/* loaded from: classes2.dex */
public final class zzdgj implements zzcxh, com.google.android.gms.ads.internal.overlay.zzr, zzcwn {
    public final Context X;
    @InterfaceC11300zs1
    public final zzcfb Y;
    public final VersionInfoParcel Y0;
    public final zzfbu Z;
    public final zzecy Z0;
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public zzeda a1;

    public zzdgj(Context context, @InterfaceC11300zs1 zzcfb zzcfbVar, zzfbu zzfbuVar, VersionInfoParcel versionInfoParcel, zzecy zzecyVar) {
        this.X = context;
        this.Y = zzcfbVar;
        this.Z = zzfbuVar;
        this.Y0 = versionInfoParcel;
        this.Z0 = zzecyVar;
    }

    private final boolean a() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z5)).booleanValue() && this.Z0.d()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void S7() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void V3() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void h5(int i) {
        this.a1 = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void o1() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void r4() {
        zzcfb zzcfbVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C5)).booleanValue() && (zzcfbVar = this.Y) != null) {
            if (this.a1 != null || a()) {
                if (this.a1 != null) {
                    zzcfbVar.q("onSdkImpression", new C2531Be());
                } else {
                    this.Z0.b();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void s() {
        zzcfb zzcfbVar;
        if (a()) {
            this.Z0.b();
        } else if (this.a1 != null && (zzcfbVar = this.Y) != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C5)).booleanValue()) {
                zzcfbVar.q("onSdkImpression", new C2531Be());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void s7() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void v() {
        zzcfb zzcfbVar;
        zzecx zzecxVar;
        zzecx zzecxVar2;
        zzecw zzecwVar;
        zzfbu zzfbuVar = this.Z;
        if (zzfbuVar.T && (zzcfbVar = this.Y) != null) {
            if (com.google.android.gms.ads.internal.zzv.c().f(this.X)) {
                if (a()) {
                    this.Z0.c();
                    return;
                }
                VersionInfoParcel versionInfoParcel = this.Y0;
                String str = versionInfoParcel.Y + UE.h + versionInfoParcel.Z;
                zzfcs zzfcsVar = zzfbuVar.V;
                String a = zzfcsVar.a();
                if (zzfcsVar.c() == 1) {
                    zzecwVar = zzecw.VIDEO;
                    zzecxVar2 = zzecx.DEFINED_BY_JAVASCRIPT;
                } else {
                    if (zzfbuVar.Y == 2) {
                        zzecxVar = zzecx.UNSPECIFIED;
                    } else {
                        zzecxVar = zzecx.BEGIN_TO_RENDER;
                    }
                    zzecxVar2 = zzecxVar;
                    zzecwVar = zzecw.HTML_DISPLAY;
                }
                zzeda d = com.google.android.gms.ads.internal.zzv.c().d(str, zzcfbVar.N(), "", "javascript", a, zzecxVar2, zzecwVar, zzfbuVar.l0);
                this.a1 = d;
                if (d != null) {
                    zzflb a2 = d.a();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y5)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.c().i(a2, zzcfbVar.N());
                        for (View view : zzcfbVar.i0()) {
                            com.google.android.gms.ads.internal.zzv.c().e(a2, view);
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzv.c().i(a2, zzcfbVar.U());
                    }
                    zzcfbVar.q0(this.a1);
                    com.google.android.gms.ads.internal.zzv.c().c(a2);
                    zzcfbVar.q("onSdkLoaded", new C2531Be());
                }
            }
        }
    }
}
