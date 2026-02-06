package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;
import java.util.concurrent.Callable;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzcuw {
    public final zzfgt a;
    public final VersionInfoParcel b;
    public final ApplicationInfo c;
    public final String d;
    public final List e;
    public final PackageInfo f;
    public final zzhfp g;
    public final String h;
    public final zzety i;
    public final com.google.android.gms.ads.internal.util.zzg j;
    public final zzfcp k;
    public final int l;
    public final zzdbj m;

    public zzcuw(zzfgt zzfgtVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, @InterfaceC11300zs1 PackageInfo packageInfo, zzhfp zzhfpVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzety zzetyVar, zzfcp zzfcpVar, zzdbj zzdbjVar, int i) {
        this.a = zzfgtVar;
        this.b = versionInfoParcel;
        this.c = applicationInfo;
        this.d = str;
        this.e = list;
        this.f = packageInfo;
        this.g = zzhfpVar;
        this.h = str2;
        this.i = zzetyVar;
        this.j = zzgVar;
        this.k = zzfcpVar;
        this.m = zzdbjVar;
        this.l = i;
    }

    public static /* synthetic */ zzbvl a(zzcuw zzcuwVar, InterfaceFutureC8411o11 interfaceFutureC8411o11, Bundle bundle) {
        zzcuv zzcuvVar = (zzcuv) interfaceFutureC8411o11.get();
        Bundle bundle2 = zzcuvVar.a;
        String str = (String) ((InterfaceFutureC8411o11) zzcuwVar.g.b()).get();
        boolean z = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.h7)).booleanValue() && zzcuwVar.j.M()) {
            z = true;
        }
        boolean z2 = z;
        String str2 = zzcuwVar.h;
        PackageInfo packageInfo = zzcuwVar.f;
        List list = zzcuwVar.e;
        String str3 = zzcuwVar.d;
        return new zzbvl(bundle2, zzcuwVar.b, zzcuwVar.c, str3, list, packageInfo, str, str2, null, null, z2, zzcuwVar.k.a(), bundle, zzcuvVar.b, zzcuwVar.l);
    }

    public final InterfaceFutureC8411o11 b(Bundle bundle) {
        boolean z;
        this.m.a();
        zzfgn zzfgnVar = zzfgn.SIGNALS;
        zzcuv zzcuvVar = new zzcuv(new Bundle(), new Bundle());
        if (this.l == 2) {
            z = true;
        } else {
            z = false;
        }
        return zzfgd.c(this.i.a(zzcuvVar, bundle, z), zzfgnVar, this.a).a();
    }

    public final InterfaceFutureC8411o11 c() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue()) {
            Bundle bundle2 = this.k.s;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final InterfaceFutureC8411o11 b = b(bundle);
        return this.a.a(zzfgn.REQUEST_PARCEL, b, (InterfaceFutureC8411o11) this.g.b()).a(new Callable() { // from class: com.google.android.gms.internal.ads.zzcuu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcuw.a(zzcuw.this, b, bundle);
            }
        }).a();
    }
}
