package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public interface TelemetryLoggingClient extends HasApiKey<TelemetryLoggingOptions> {
    @InterfaceC5670cr1
    @KeepForSdk
    Task<Void> a(@InterfaceC5670cr1 TelemetryData telemetryData);
}
