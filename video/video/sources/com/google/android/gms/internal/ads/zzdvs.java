package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdvs extends AdListener {
    public final /* synthetic */ String X;
    public final /* synthetic */ AdView Y;
    public final /* synthetic */ zzdvz Y0;
    public final /* synthetic */ String Z;

    public zzdvs(zzdvz zzdvzVar, String str, AdView adView, String str2) {
        this.X = str;
        this.Y = adView;
        this.Z = str2;
        this.Y0 = zzdvzVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void g(LoadAdError loadAdError) {
        String f8;
        zzdvz zzdvzVar = this.Y0;
        f8 = zzdvz.f8(loadAdError);
        zzdvzVar.g8(f8, this.Z);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void k() {
        this.Y0.a8(this.X, this.Y, this.Z);
    }
}
