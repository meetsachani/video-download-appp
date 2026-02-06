package com.google.android.gms.common.internal;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class TelemetryLogging {
    private TelemetryLogging() {
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static TelemetryLoggingClient a(@InterfaceC5670cr1 Context context) {
        return b(context, TelemetryLoggingOptions.Y);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static TelemetryLoggingClient b(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TelemetryLoggingOptions telemetryLoggingOptions) {
        return new com.google.android.gms.common.internal.service.zao(context, telemetryLoggingOptions);
    }
}
