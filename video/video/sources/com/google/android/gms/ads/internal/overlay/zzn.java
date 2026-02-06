package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzddy;
import com.google.android.gms.internal.ads.zzdsd;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzn {
    public static final void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z, @InterfaceC11300zs1 zzdsd zzdsdVar) {
        Activity activity;
        zzaa zzaaVar;
        if (adOverlayInfoParcel.f1 == 4 && adOverlayInfoParcel.Z == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.Y;
            if (zzaVar != null) {
                zzaVar.y();
            }
            zzddy zzddyVar = adOverlayInfoParcel.p1;
            if (zzddyVar != null) {
                zzddyVar.X0();
            }
            Activity i = adOverlayInfoParcel.Y0.i();
            zzc zzcVar = adOverlayInfoParcel.X;
            if (zzcVar != null && zzcVar.e1 && i != null) {
                activity = i;
            } else {
                activity = context;
            }
            com.google.android.gms.ads.internal.zzv.m();
            zzad zzadVar = adOverlayInfoParcel.d1;
            if (zzcVar != null) {
                zzaaVar = zzcVar.d1;
            } else {
                zzaaVar = null;
            }
            zza.b(activity, zzcVar, zzadVar, zzaaVar, zzdsdVar, adOverlayInfoParcel.l1);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.Y);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.h1.Y0);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!PlatformVersion.j()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) zzbd.c().b(zzbcv.pd)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.v();
            com.google.android.gms.ads.internal.util.zzs.y(context, intent, zzdsdVar, adOverlayInfoParcel.l1);
            return;
        }
        com.google.android.gms.ads.internal.zzv.v();
        com.google.android.gms.ads.internal.util.zzs.u(context, intent);
    }
}
