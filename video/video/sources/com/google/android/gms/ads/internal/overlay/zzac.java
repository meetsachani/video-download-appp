package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzazn;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbtk;
import com.google.android.gms.internal.ads.zzddy;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzac extends zzbtk implements zzazn {
    public final AdOverlayInfoParcel X;
    public final Activity Y;
    public final boolean a1;
    public boolean Z = false;
    public boolean Y0 = false;
    public boolean Z0 = false;
    public boolean b1 = false;
    public boolean c1 = false;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.b5)).booleanValue() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzac(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        this.X = adOverlayInfoParcel;
        this.Y = activity;
        if (!((Boolean) zzbd.c().b(zzbcv.W4)).booleanValue()) {
            if (!((Boolean) zzbd.c().b(zzbcv.X4)).booleanValue()) {
            }
        }
        zzc zzcVar = adOverlayInfoParcel.X;
        if (zzcVar != null && zzcVar.e1) {
            if (Build.MANUFACTURER.matches((String) zzbd.c().b(zzbcv.Z4))) {
                if (Build.MODEL.matches((String) zzbd.c().b(zzbcv.a5))) {
                    z = true;
                }
            }
        }
        this.a1 = z;
    }

    public static /* synthetic */ void X7(zzac zzacVar) {
        if (zzacVar.b1) {
            zzacVar.Y.finish();
        }
    }

    private final synchronized void c() {
        try {
            if (!this.Y0) {
                zzr zzrVar = this.X.Z;
                if (zzrVar != null) {
                    zzrVar.h5(4);
                }
                this.Y0 = true;
                if (this.a1) {
                    if (((Boolean) zzbd.c().b(zzbcv.b5)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.f().e(this);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void G5(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void K2(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzazn
    public final void O0(boolean z) {
        if (z) {
            if (this.c1) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.b("Foregrounded: finishing activity from LauncherOverlay");
                this.Y.finish();
                return;
            }
            return;
        }
        this.c1 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final boolean P() throws RemoteException {
        if (((Boolean) zzbd.c().b(zzbcv.X4)).booleanValue() && this.a1 && this.b1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void b0(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void h1(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.Z);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void i() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void m() throws RemoteException {
        if (this.Y.isFinishing()) {
            c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void n3(@InterfaceC11300zs1 Bundle bundle) {
        zzr zzrVar;
        if (((Boolean) zzbd.c().b(zzbcv.h9)).booleanValue() && !this.Z0) {
            this.Y.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.X;
        if (adOverlayInfoParcel == null) {
            this.Y.finish();
        } else if (z) {
            this.Y.finish();
        } else {
            if (bundle == null) {
                com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.Y;
                if (zzaVar != null) {
                    zzaVar.y();
                }
                zzddy zzddyVar = adOverlayInfoParcel.p1;
                if (zzddyVar != null) {
                    zzddyVar.X0();
                }
                Activity activity = this.Y;
                if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzrVar = adOverlayInfoParcel.Z) != null) {
                    zzrVar.r4();
                }
            }
            if (this.a1) {
                if (((Boolean) zzbd.c().b(zzbcv.b5)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.f().c(this);
                }
            }
            Activity activity2 = this.Y;
            zzc zzcVar = adOverlayInfoParcel.X;
            zzad zzadVar = adOverlayInfoParcel.d1;
            com.google.android.gms.ads.internal.zzv.m();
            if (!zza.b(activity2, zzcVar, zzadVar, zzcVar.d1, null, "")) {
                activity2.finish();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void p() throws RemoteException {
        this.b1 = false;
        zzr zzrVar = this.X.Z;
        if (zzrVar != null) {
            zzrVar.S7();
        }
        if (this.Y.isFinishing()) {
            c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void q() throws RemoteException {
        zzr zzrVar = this.X.Z;
        if (zzrVar != null) {
            zzrVar.o1();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void r() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void t() throws RemoteException {
        if (this.Y.isFinishing()) {
            c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void v() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void x() throws RemoteException {
        if (this.Z) {
            com.google.android.gms.ads.internal.util.zze.k("LauncherOverlay finishing activity");
            this.Y.finish();
            return;
        }
        this.Z = true;
        this.b1 = true;
        zzr zzrVar = this.X.Z;
        if (zzrVar != null) {
            zzrVar.s7();
        }
        if (this.a1) {
            if (((Boolean) zzbd.c().b(zzbcv.W4)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzs.l.postDelayed(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzab
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzac.X7(zzac.this);
                    }
                }, ((Integer) zzbd.c().b(zzbcv.Y4)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void y() throws RemoteException {
        this.Z0 = true;
    }
}
