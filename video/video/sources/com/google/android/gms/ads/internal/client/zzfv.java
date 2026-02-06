package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController;

/* loaded from: classes2.dex */
public final class zzfv extends zzec {
    public final VideoController.VideoLifecycleCallbacks X;

    public zzfv(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.X = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void U3(boolean z) {
        this.X.b(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void d() {
        this.X.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void g() {
        this.X.c();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void h() {
        this.X.d();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void i() {
        this.X.e();
    }
}
