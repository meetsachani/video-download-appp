package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeo extends zzcd {
    public final /* synthetic */ PreloadCallback X;
    public final /* synthetic */ zzet Y;

    public zzeo(zzet zzetVar, PreloadCallback preloadCallback) {
        this.X = preloadCallback;
        this.Y = zzetVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void S2(zzfp zzfpVar) {
        PreloadConfiguration k = zzet.k(this.Y, zzfpVar);
        if (k != null) {
            this.X.a(k);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void z1(zzfp zzfpVar) {
        PreloadConfiguration k = zzet.k(this.Y, zzfpVar);
        if (k != null) {
            this.X.b(k);
        }
    }
}
