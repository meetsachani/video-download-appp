package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzeju extends com.google.android.gms.ads.internal.client.zzbs {
    public final Context X;
    public final zzchb Y;
    @InterfaceC5056aJ2
    public final zzdix Y0;
    @InterfaceC5056aJ2
    public final zzfcn Z;
    public com.google.android.gms.ads.internal.client.zzbk Z0;

    public zzeju(zzchb zzchbVar, Context context, String str) {
        zzfcn zzfcnVar = new zzfcn();
        this.Z = zzfcnVar;
        this.Y0 = new zzdix();
        this.Y = zzchbVar;
        zzfcnVar.P(str);
        this.X = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void B2(zzbhe zzbheVar) {
        this.Y0.a(zzbheVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void E7(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        this.Z.v(zzcpVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void K3(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.Z0 = zzbkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void L7(PublisherAdViewOptions publisherAdViewOptions) {
        this.Z.g(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void M2(zzbfv zzbfvVar) {
        this.Z.d(zzbfvVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void N7(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.Z.N(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void W2(zzbmp zzbmpVar) {
        this.Y0.d(zzbmpVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void Y3(String str, zzbhn zzbhnVar, @InterfaceC11300zs1 zzbhk zzbhkVar) {
        this.Y0.c(str, zzbhnVar, zzbhkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final com.google.android.gms.ads.internal.client.zzbq d() {
        zzdiz g = this.Y0.g();
        ArrayList i = g.i();
        zzfcn zzfcnVar = this.Z;
        zzfcnVar.e(i);
        zzfcnVar.f(g.h());
        if (zzfcnVar.D() == null) {
            zzfcnVar.O(com.google.android.gms.ads.internal.client.zzr.E0());
        }
        return new zzejv(this.X, this.Y, zzfcnVar, g, this.Z0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void n7(zzbhr zzbhrVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.Y0.e(zzbhrVar);
        this.Z.O(zzrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void p7(zzbhh zzbhhVar) {
        this.Y0.b(zzbhhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void q7(zzbhu zzbhuVar) {
        this.Y0.f(zzbhuVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void v4(zzbmg zzbmgVar) {
        this.Z.S(zzbmgVar);
    }
}
