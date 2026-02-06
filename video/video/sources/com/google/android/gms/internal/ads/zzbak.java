package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbak extends zzbat {
    @InterfaceC11300zs1
    public FullScreenContentCallback X;

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void D0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.X;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.c(zzeVar.m0());
        }
    }

    public final void W7(@InterfaceC11300zs1 FullScreenContentCallback fullScreenContentCallback) {
        this.X = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void b() {
        FullScreenContentCallback fullScreenContentCallback = this.X;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void c() {
        FullScreenContentCallback fullScreenContentCallback = this.X;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void d() {
        FullScreenContentCallback fullScreenContentCallback = this.X;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void e() {
        FullScreenContentCallback fullScreenContentCallback = this.X;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.e();
        }
    }
}
