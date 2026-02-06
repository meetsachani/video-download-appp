package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzcfo {
    public static final zzcfb a(final Context context, final zzcgv zzcgvVar, final String str, final boolean z, final boolean z2, @InterfaceC11300zs1 final zzavl zzavlVar, @InterfaceC11300zs1 final zzbec zzbecVar, final VersionInfoParcel versionInfoParcel, @InterfaceC11300zs1 zzbdk zzbdkVar, @InterfaceC11300zs1 final com.google.android.gms.ads.internal.zzn zznVar, @InterfaceC11300zs1 final com.google.android.gms.ads.internal.zza zzaVar, final zzbbt zzbbtVar, @InterfaceC11300zs1 final zzfbu zzfbuVar, @InterfaceC11300zs1 final zzfbx zzfbxVar, @InterfaceC11300zs1 final zzece zzeceVar, @InterfaceC11300zs1 final zzfct zzfctVar, @InterfaceC11300zs1 final zzdsd zzdsdVar) throws zzcfn {
        zzbcv.a(context);
        try {
            zzfvu zzfvuVar = new zzfvu(context, zzcgvVar, str, z, z2, zzavlVar, zzbecVar, versionInfoParcel, null, zznVar, zzaVar, zzbbtVar, zzfbuVar, zzfbxVar, zzfctVar, zzdsdVar, zzeceVar) { // from class: com.google.android.gms.internal.ads.zzcfm
                public final /* synthetic */ Context X;
                public final /* synthetic */ zzcgv Y;
                public final /* synthetic */ boolean Y0;
                public final /* synthetic */ String Z;
                public final /* synthetic */ boolean Z0;
                public final /* synthetic */ zzavl a1;
                public final /* synthetic */ zzbec b1;
                public final /* synthetic */ VersionInfoParcel c1;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzn d1;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza e1;
                public final /* synthetic */ zzbbt f1;
                public final /* synthetic */ zzfbu g1;
                public final /* synthetic */ zzfbx h1;
                public final /* synthetic */ zzfct i1;
                public final /* synthetic */ zzdsd j1;
                public final /* synthetic */ zzece k1;

                {
                    this.d1 = zznVar;
                    this.e1 = zzaVar;
                    this.f1 = zzbbtVar;
                    this.g1 = zzfbuVar;
                    this.h1 = zzfbxVar;
                    this.i1 = zzfctVar;
                    this.j1 = zzdsdVar;
                    this.k1 = zzeceVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfvu
                public final Object a() {
                    zzcgv zzcgvVar2 = this.Y;
                    String str2 = this.Z;
                    boolean z3 = this.Y0;
                    zzbbt zzbbtVar2 = this.f1;
                    boolean z4 = this.Z0;
                    zzavl zzavlVar2 = this.a1;
                    zzfbu zzfbuVar2 = this.g1;
                    zzbec zzbecVar2 = this.b1;
                    com.google.android.gms.ads.internal.zzn zznVar2 = this.d1;
                    zzfbx zzfbxVar2 = this.h1;
                    Context context2 = this.X;
                    VersionInfoParcel versionInfoParcel2 = this.c1;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.e1;
                    zzfct zzfctVar2 = this.i1;
                    zzdsd zzdsdVar2 = this.j1;
                    zzece zzeceVar2 = this.k1;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzcga.X1;
                        zzcft zzcftVar = new zzcft(new zzcga(new zzcgu(context2), zzcgvVar2, str2, z3, z4, zzavlVar2, zzbecVar2, versionInfoParcel2, null, zznVar2, zzaVar2, zzbbtVar2, zzfbuVar2, zzfbxVar2, zzfctVar2), zzdsdVar2);
                        zzcftVar.setWebViewClient(com.google.android.gms.ads.internal.zzv.w().c(zzcftVar, zzbbtVar2, z4, zzeceVar2));
                        zzcftVar.setWebChromeClient(new zzcfa(zzcftVar));
                        return zzcftVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object a = zzfvuVar.a();
            StrictMode.setThreadPolicy(threadPolicy);
            return (zzcfb) a;
        } catch (Throwable th) {
            throw new zzcfn("Webview initialization failed.", th);
        }
    }
}
