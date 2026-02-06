package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.FullScreenContentCallback;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbe extends zzcr {
    @InterfaceC11300zs1
    public final FullScreenContentCallback X;

    public zzbe(@InterfaceC11300zs1 FullScreenContentCallback fullScreenContentCallback) {
        this.X = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void D0(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.X;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.c(zzeVar.m0());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void b() {
        FullScreenContentCallback fullScreenContentCallback = this.X;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.a();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void c() {
        FullScreenContentCallback fullScreenContentCallback = this.X;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.b();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void d() {
        FullScreenContentCallback fullScreenContentCallback = this.X;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.d();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void e() {
        FullScreenContentCallback fullScreenContentCallback = this.X;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.e();
        }
    }
}
