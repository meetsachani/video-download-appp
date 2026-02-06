package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzecy {
    public final Context a;
    public final VersionInfoParcel b;
    public final zzfbu c;
    @InterfaceC11300zs1
    public final zzcfb d;
    public final zzdsd e;
    @InterfaceC11300zs1
    public zzflm f;

    public zzecy(Context context, VersionInfoParcel versionInfoParcel, zzfbu zzfbuVar, @InterfaceC11300zs1 zzcfb zzcfbVar, zzdsd zzdsdVar) {
        this.a = context;
        this.b = versionInfoParcel;
        this.c = zzfbuVar;
        this.d = zzcfbVar;
        this.e = zzdsdVar;
    }

    public final synchronized void a(View view) {
        zzflm zzflmVar = this.f;
        if (zzflmVar != null) {
            com.google.android.gms.ads.internal.zzv.c().j(zzflmVar, view);
        }
    }

    public final synchronized void b() {
        zzcfb zzcfbVar;
        if (this.f != null && (zzcfbVar = this.d) != null) {
            zzcfbVar.q("onSdkImpression", zzfyf.d());
        }
    }

    public final synchronized void c() {
        zzcfb zzcfbVar;
        try {
            zzflm zzflmVar = this.f;
            if (zzflmVar != null && (zzcfbVar = this.d) != null) {
                for (View view : zzcfbVar.i0()) {
                    com.google.android.gms.ads.internal.zzv.c().j(zzflmVar, view);
                }
                zzcfbVar.q("onSdkLoaded", zzfyf.d());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d() {
        return this.f != null;
    }

    public final synchronized boolean e(boolean z) {
        zzcfb zzcfbVar;
        String str;
        zzfbu zzfbuVar = this.c;
        if (zzfbuVar.T) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w5)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z5)).booleanValue() && (zzcfbVar = this.d) != null) {
                    if (this.f != null) {
                        int i = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.g("Omid javascript session service already started for ad.");
                        return false;
                    } else if (!com.google.android.gms.ads.internal.zzv.c().f(this.a)) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.g("Unable to initialize omid.");
                        return false;
                    } else if (zzfbuVar.V.b()) {
                        zzflm k = com.google.android.gms.ads.internal.zzv.c().k(this.b, zzcfbVar.N(), true);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.A5)).booleanValue()) {
                            zzdsd zzdsdVar = this.e;
                            if (k != null) {
                                str = "1";
                            } else {
                                str = "0";
                            }
                            zzdsc a = zzdsdVar.a();
                            a.b("omid_js_session_success", str);
                            a.j();
                        }
                        if (k == null) {
                            int i3 = com.google.android.gms.ads.internal.util.zze.b;
                            com.google.android.gms.ads.internal.util.client.zzo.g("Unable to create javascript session service.");
                            return false;
                        }
                        int i4 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.f("Created omid javascript session service.");
                        this.f = k;
                        zzcfbVar.j1(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void f(zzcfs zzcfsVar) {
        zzcfb zzcfbVar;
        zzflm zzflmVar = this.f;
        if (zzflmVar != null && (zzcfbVar = this.d) != null) {
            com.google.android.gms.ads.internal.zzv.c().g(zzflmVar, zzcfsVar);
            this.f = null;
            zzcfbVar.j1(null);
        }
    }
}
