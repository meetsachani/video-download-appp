package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzbca;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

/* loaded from: classes2.dex */
public final class zzdgn implements zzcvt, zzddd {
    public final zzbyf X;
    public final Context Y;
    @InterfaceC11300zs1
    public final View Y0;
    public final zzbyj Z;
    public String Z0;
    public final zzbca.zza.EnumC0104zza a1;

    public zzdgn(zzbyf zzbyfVar, Context context, zzbyj zzbyjVar, @InterfaceC11300zs1 View view, zzbca.zza.EnumC0104zza enumC0104zza) {
        this.X = zzbyfVar;
        this.Y = context;
        this.Z = zzbyjVar;
        this.Y0 = view;
        this.a1 = enumC0104zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void a() {
        this.X.b(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void c() {
        View view = this.Y0;
        if (view != null && this.Z0 != null) {
            this.Z.o(view.getContext(), this.Z0);
        }
        this.X.b(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void j() {
        String str;
        zzbca.zza.EnumC0104zza enumC0104zza = this.a1;
        if (enumC0104zza == zzbca.zza.EnumC0104zza.APP_OPEN) {
            return;
        }
        String d = this.Z.d(this.Y);
        this.Z0 = d;
        String valueOf = String.valueOf(d);
        if (enumC0104zza == zzbca.zza.EnumC0104zza.REWARD_BASED_VIDEO_AD) {
            str = "/Rewarded";
        } else {
            str = "/Interstitial";
        }
        this.Z0 = valueOf.concat(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    @InterfaceC5940dy1
    public final void k(zzbvx zzbvxVar, String str, String str2) {
        zzbyj zzbyjVar = this.Z;
        Context context = this.Y;
        if (zzbyjVar.p(context)) {
            try {
                zzbyjVar.l(context, zzbyjVar.b(context), this.X.a(), zzbvxVar.c(), zzbvxVar.b());
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.h("Remote Exception to get reward item.", e);
            }
        }
    }
}
