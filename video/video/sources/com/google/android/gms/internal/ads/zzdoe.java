package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

/* loaded from: classes2.dex */
public final class zzdoe implements zzbkn {
    public final zzcxa X;
    @InterfaceC11300zs1
    public final zzbwj Y;
    public final String Y0;
    public final String Z;

    public zzdoe(zzcxa zzcxaVar, zzfbu zzfbuVar) {
        this.X = zzcxaVar;
        this.Y = zzfbuVar.l;
        this.Z = zzfbuVar.j;
        this.Y0 = zzfbuVar.k;
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    @InterfaceC5940dy1
    public final void N0(@InterfaceC11300zs1 zzbwj zzbwjVar) {
        int i;
        String str;
        zzbwj zzbwjVar2 = this.Y;
        if (zzbwjVar2 != null) {
            zzbwjVar = zzbwjVar2;
        }
        if (zzbwjVar != null) {
            str = zzbwjVar.X;
            i = zzbwjVar.Y;
        } else {
            i = 1;
            str = "";
        }
        this.X.n1(new zzbvu(str, i), this.Z, this.Y0);
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final void b() {
        this.X.d();
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final void c() {
        this.X.e();
    }
}
