package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcpr implements zzcwn {
    @InterfaceC11300zs1
    public final zzcfb X;
    public final zzdsd Y;
    public final zzfbu Z;

    public zzcpr(@InterfaceC11300zs1 zzcfb zzcfbVar, zzdsd zzdsdVar, zzfbu zzfbuVar) {
        this.X = zzcfbVar;
        this.Y = zzdsdVar;
        this.Z = zzfbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void s() {
        zzcfb zzcfbVar;
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.fd)).booleanValue() && (zzcfbVar = this.X) != null) {
            if (true != com.google.android.gms.ads.internal.util.zzac.a(zzcfbVar.U())) {
                str = "0";
            } else {
                str = "1";
            }
            zzdsc a = this.Y.a();
            a.b("action", "hcp");
            a.b("hcp", str);
            a.c(this.Z);
            a.j();
        }
    }
}
