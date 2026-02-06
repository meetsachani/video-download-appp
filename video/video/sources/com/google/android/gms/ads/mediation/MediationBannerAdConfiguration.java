package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public class MediationBannerAdConfiguration extends MediationAdConfiguration {
    public final AdSize m;

    public MediationBannerAdConfiguration(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 Bundle bundle2, boolean z, @InterfaceC11300zs1 Location location, int i, int i2, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 AdSize adSize, @InterfaceC5670cr1 String str3) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.m = adSize;
    }

    @InterfaceC5670cr1
    public AdSize j() {
        return this.m;
    }
}
