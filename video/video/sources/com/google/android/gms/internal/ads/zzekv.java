package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzekv implements com.google.android.gms.ads.internal.client.zza, zzddy {
    public com.google.android.gms.ads.internal.client.zzbh X;

    @Override // com.google.android.gms.internal.ads.zzddy
    public final synchronized void X0() {
        com.google.android.gms.ads.internal.client.zzbh zzbhVar = this.X;
        if (zzbhVar != null) {
            try {
                zzbhVar.b();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.h("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    public final synchronized void a(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.X = zzbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddy
    public final synchronized void t() {
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void y() {
        com.google.android.gms.ads.internal.client.zzbh zzbhVar = this.X;
        if (zzbhVar != null) {
            try {
                zzbhVar.b();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.h("Remote Exception at onAdClicked.", e);
            }
        }
    }
}
