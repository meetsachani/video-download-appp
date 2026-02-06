package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdvn implements com.google.android.gms.ads.internal.overlay.zzr, zzcgr {
    public final Context X;
    public final VersionInfoParcel Y;
    public zzcfb Y0;
    public zzdvc Z;
    public boolean Z0;
    public boolean a1;
    public long b1;
    @InterfaceC11300zs1
    public com.google.android.gms.ads.internal.client.zzdk c1;
    public boolean d1;

    public zzdvn(Context context, VersionInfoParcel versionInfoParcel) {
        this.X = context;
        this.Y = versionInfoParcel;
    }

    public static /* synthetic */ void c(zzdvn zzdvnVar, String str) {
        JSONObject f = zzdvnVar.Z.f();
        if (!TextUtils.isEmpty(str)) {
            try {
                f.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        zzdvnVar.Y0.u("window.inspectorInfo", f.toString());
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void S7() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void V3() {
    }

    @Override // com.google.android.gms.internal.ads.zzcgr
    public final synchronized void a(boolean z, int i, String str, String str2) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.k("Ad inspector loaded.");
            this.Z0 = true;
            f("");
            return;
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("Ad inspector failed to load.");
        try {
            zzbzn t = com.google.android.gms.ads.internal.zzv.t();
            t.x(new Exception("Failed to load UI. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.c1;
            if (zzdkVar != null) {
                zzdkVar.U2(zzfdq.d(17, null, null));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.d1 = true;
        this.Y0.destroy();
    }

    @InterfaceC11300zs1
    public final Activity b() {
        zzcfb zzcfbVar = this.Y0;
        if (zzcfbVar != null && !zzcfbVar.L()) {
            return this.Y0.i();
        }
        return null;
    }

    public final void d(zzdvc zzdvcVar) {
        this.Z = zzdvcVar;
    }

    public final synchronized void e(com.google.android.gms.ads.internal.client.zzdk zzdkVar, zzbkq zzbkqVar, zzbkj zzbkjVar, zzbjx zzbjxVar) {
        if (!g(zzdkVar)) {
            return;
        }
        try {
            com.google.android.gms.ads.internal.zzv.b();
            zzcfb a = zzcfo.a(this.X, zzcgv.a(), "", false, false, null, null, this.Y, null, null, null, zzbbt.a(), null, null, null, null, null);
            this.Y0 = a;
            zzcgt M = a.M();
            if (M == null) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Failed to obtain a web view for the ad inspector");
                try {
                    com.google.android.gms.ads.internal.zzv.t().x(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                    zzdkVar.U2(zzfdq.d(17, "Failed to obtain a web view for the ad inspector", null));
                    return;
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.zzv.t().x(e, "InspectorUi.openInspector 3");
                    return;
                }
            }
            this.c1 = zzdkVar;
            Context context = this.X;
            M.e1(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbkqVar, null, new zzbkp(context), zzbkjVar, zzbjxVar, null);
            M.f1(this);
            this.Y0.loadUrl((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.k9));
            com.google.android.gms.ads.internal.zzv.n();
            com.google.android.gms.ads.internal.overlay.zzn.a(context, new AdOverlayInfoParcel(this, this.Y0, 1, this.Y), true, null);
            this.b1 = com.google.android.gms.ads.internal.zzv.d().a();
        } catch (zzcfn e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Failed to obtain a web view for the ad inspector", e2);
            try {
                com.google.android.gms.ads.internal.zzv.t().x(e2, "InspectorUi.openInspector 0");
                zzdkVar.U2(zzfdq.d(17, "Failed to obtain a web view for the ad inspector", null));
            } catch (RemoteException e3) {
                com.google.android.gms.ads.internal.zzv.t().x(e3, "InspectorUi.openInspector 1");
            }
        }
    }

    public final synchronized void f(final String str) {
        if (this.Z0 && this.a1) {
            zzcaa.f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvm
                @Override // java.lang.Runnable
                public final void run() {
                    zzdvn.c(zzdvn.this, str);
                }
            });
        }
    }

    public final synchronized boolean g(com.google.android.gms.ads.internal.client.zzdk zzdkVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j9)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Ad inspector had an internal error.");
            try {
                zzdkVar.U2(zzfdq.d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        } else if (this.Z == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Ad inspector had an internal error.");
            try {
                com.google.android.gms.ads.internal.zzv.t().x(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzdkVar.U2(zzfdq.d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        } else {
            if (!this.Z0 && !this.a1) {
                if (com.google.android.gms.ads.internal.zzv.d().a() >= this.b1 + ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.m9)).intValue()) {
                    return true;
                }
            }
            int i3 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Ad inspector cannot be opened because it is already open.");
            try {
                zzdkVar.U2(zzfdq.d(19, null, null));
            } catch (RemoteException unused3) {
            }
            return false;
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void h5(int i) {
        this.Y0.destroy();
        if (!this.d1) {
            com.google.android.gms.ads.internal.util.zze.k("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.c1;
            if (zzdkVar != null) {
                try {
                    zzdkVar.U2(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.a1 = false;
        this.Z0 = false;
        this.b1 = 0L;
        this.d1 = false;
        this.c1 = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void o1() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void r4() {
        this.a1 = true;
        f("");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void s7() {
    }
}
