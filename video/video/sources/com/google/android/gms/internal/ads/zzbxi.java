package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbxi extends zzbws {
    @InterfaceC11300zs1
    public FullScreenContentCallback X;
    public OnUserEarnedRewardListener Y;

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void W(int i) {
    }

    public final void W7(@InterfaceC11300zs1 FullScreenContentCallback fullScreenContentCallback) {
        this.X = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void X3(com.google.android.gms.ads.internal.client.zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.X;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.c(zzeVar.m0());
        }
    }

    public final void X7(OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.Y = onUserEarnedRewardListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void d() {
        FullScreenContentCallback fullScreenContentCallback = this.X;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void e() {
        FullScreenContentCallback fullScreenContentCallback = this.X;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void g() {
        FullScreenContentCallback fullScreenContentCallback = this.X;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void j() {
        FullScreenContentCallback fullScreenContentCallback = this.X;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void x1(zzbwn zzbwnVar) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.Y;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.f(new zzbxa(zzbwnVar));
        }
    }
}
