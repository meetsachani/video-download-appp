package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public interface LifecycleFragment {
    @KeepForSdk
    void a(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 LifecycleCallback lifecycleCallback);

    @InterfaceC11300zs1
    @KeepForSdk
    <T extends LifecycleCallback> T c(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Class<T> cls);

    @KeepForSdk
    boolean e();

    @KeepForSdk
    boolean f();

    @InterfaceC11300zs1
    @KeepForSdk
    Activity g();

    @KeepForSdk
    void startActivityForResult(@InterfaceC5670cr1 Intent intent, int i);
}
