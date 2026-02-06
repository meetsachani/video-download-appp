package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoController;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzej extends zzbc {
    public final /* synthetic */ zzek Z;

    public zzej(zzek zzekVar) {
        this.Z = zzekVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbc, com.google.android.gms.ads.AdListener
    public final void g(LoadAdError loadAdError) {
        VideoController videoController;
        zzek zzekVar = this.Z;
        videoController = zzekVar.d;
        videoController.m(zzekVar.n());
        super.g(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbc, com.google.android.gms.ads.AdListener
    public final void k() {
        VideoController videoController;
        zzek zzekVar = this.Z;
        videoController = zzekVar.d;
        videoController.m(zzekVar.n());
        super.k();
    }
}
