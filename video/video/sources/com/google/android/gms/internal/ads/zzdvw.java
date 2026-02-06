package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdvw extends AdListener {
    public final /* synthetic */ String X;
    public final /* synthetic */ zzdvz Y;

    public zzdvw(zzdvz zzdvzVar, String str) {
        this.X = str;
        this.Y = zzdvzVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void g(LoadAdError loadAdError) {
        String f8;
        zzdvz zzdvzVar = this.Y;
        f8 = zzdvz.f8(loadAdError);
        zzdvzVar.g8(f8, this.X);
    }
}
