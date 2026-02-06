package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzw extends zzm {
    public zzw(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzm, com.google.android.gms.internal.ads.zzbtl
    public final void n3(@InterfaceC11300zs1 Bundle bundle) {
        com.google.android.gms.ads.internal.util.zze.k("AdOverlayParcel is null or does not contain valid overlay type.");
        this.q1 = 4;
        this.X.finish();
    }
}
