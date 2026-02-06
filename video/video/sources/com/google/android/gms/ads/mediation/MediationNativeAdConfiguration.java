package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbfv;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    @InterfaceC11300zs1
    public final zzbfv m;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, @InterfaceC11300zs1 Location location, int i, int i2, @InterfaceC11300zs1 String str2, String str3, @InterfaceC11300zs1 zzbfv zzbfvVar) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.m = zzbfvVar;
    }

    @InterfaceC5670cr1
    public NativeAdOptions j() {
        return zzbfv.m0(this.m);
    }
}
