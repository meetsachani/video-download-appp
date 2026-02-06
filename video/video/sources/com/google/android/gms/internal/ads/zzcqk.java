package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.C2531Be;
import o.InterfaceC11300zs1;
import o.UE;

/* loaded from: classes2.dex */
public final class zzcqk implements zzcxh, zzcwn {
    public final Context X;
    @InterfaceC11300zs1
    public final zzcfb Y;
    public final VersionInfoParcel Y0;
    public final zzfbu Z;
    @InterfaceC11300zs1
    public zzeda Z0;
    public boolean a1;
    public final zzecy b1;

    public zzcqk(Context context, @InterfaceC11300zs1 zzcfb zzcfbVar, zzfbu zzfbuVar, VersionInfoParcel versionInfoParcel, zzecy zzecyVar) {
        this.X = context;
        this.Y = zzcfbVar;
        this.Z = zzfbuVar;
        this.Y0 = versionInfoParcel;
        this.b1 = zzecyVar;
    }

    private final synchronized void a() {
        zzcfb zzcfbVar;
        zzecx zzecxVar;
        zzecx zzecxVar2;
        zzecw zzecwVar;
        try {
            zzfbu zzfbuVar = this.Z;
            if (zzfbuVar.T && (zzcfbVar = this.Y) != null) {
                if (com.google.android.gms.ads.internal.zzv.c().f(this.X)) {
                    VersionInfoParcel versionInfoParcel = this.Y0;
                    String str = versionInfoParcel.Y + UE.h + versionInfoParcel.Z;
                    zzfcs zzfcsVar = zzfbuVar.V;
                    String a = zzfcsVar.a();
                    if (zzfcsVar.c() == 1) {
                        zzecwVar = zzecw.VIDEO;
                        zzecxVar2 = zzecx.DEFINED_BY_JAVASCRIPT;
                    } else {
                        int i = zzfbuVar.e;
                        zzecw zzecwVar2 = zzecw.HTML_DISPLAY;
                        if (i == 1) {
                            zzecxVar = zzecx.ONE_PIXEL;
                        } else {
                            zzecxVar = zzecx.BEGIN_TO_RENDER;
                        }
                        zzecxVar2 = zzecxVar;
                        zzecwVar = zzecwVar2;
                    }
                    zzeda d = com.google.android.gms.ads.internal.zzv.c().d(str, zzcfbVar.N(), "", "javascript", a, zzecxVar2, zzecwVar, zzfbuVar.l0);
                    this.Z0 = d;
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
                        zzcfbVar.q0(this.Z0);
                        com.google.android.gms.ads.internal.zzv.c().c(a2);
                        this.a1 = true;
                        zzcfbVar.q("onSdkLoaded", new C2531Be());
                    }
                }
            }
        } finally {
        }
    }

    public final boolean b() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z5)).booleanValue() && this.b1.d()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final synchronized void s() {
        zzcfb zzcfbVar;
        if (b()) {
            this.b1.b();
            return;
        }
        if (!this.a1) {
            a();
        }
        if (this.Z.T && this.Z0 != null && (zzcfbVar = this.Y) != null) {
            zzcfbVar.q("onSdkImpression", new C2531Be());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void v() {
        if (b()) {
            this.b1.c();
        } else if (this.a1) {
        } else {
            a();
        }
    }
}
