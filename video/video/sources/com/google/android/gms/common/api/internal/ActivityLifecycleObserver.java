package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.annotation.KeepForSdk;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class ActivityLifecycleObserver {
    @InterfaceC5670cr1
    @KeepForSdk
    public static final ActivityLifecycleObserver a(@InterfaceC5670cr1 Activity activity) {
        return new zab(zaa.m(activity));
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public abstract ActivityLifecycleObserver b(@InterfaceC5670cr1 Runnable runnable);
}
