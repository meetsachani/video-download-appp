package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class Common {
    @InterfaceC5670cr1
    @KeepForSdk
    public static final Api.ClientKey<zah> a;
    @InterfaceC5670cr1
    @KeepForSdk
    public static final Api<Api.ApiOptions.NoOptions> b;
    public static final Api.AbstractClientBuilder<zah, Api.ApiOptions.NoOptions> c;
    public static final zae d;

    static {
        Api.ClientKey<zah> clientKey = new Api.ClientKey<>();
        a = clientKey;
        zab zabVar = new zab();
        c = zabVar;
        b = new Api<>("Common.API", zabVar, clientKey);
        d = new zae();
    }
}
