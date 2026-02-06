package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class MediationConfiguration {
    @InterfaceC5670cr1
    public static final String c = "parameter";
    public final AdFormat a;
    public final Bundle b;

    public MediationConfiguration(@InterfaceC5670cr1 AdFormat adFormat, @InterfaceC5670cr1 Bundle bundle) {
        this.a = adFormat;
        this.b = bundle;
    }

    @InterfaceC5670cr1
    public AdFormat a() {
        return this.a;
    }

    @InterfaceC5670cr1
    public Bundle b() {
        return this.b;
    }
}
