package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public final class RootTelemetryConfigManager {
    @InterfaceC11300zs1
    public static RootTelemetryConfigManager b;
    public static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    @InterfaceC11300zs1
    public RootTelemetryConfiguration a;

    private RootTelemetryConfigManager() {
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static synchronized RootTelemetryConfigManager b() {
        RootTelemetryConfigManager rootTelemetryConfigManager;
        synchronized (RootTelemetryConfigManager.class) {
            try {
                if (b == null) {
                    b = new RootTelemetryConfigManager();
                }
                rootTelemetryConfigManager = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rootTelemetryConfigManager;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public RootTelemetryConfiguration a() {
        return this.a;
    }

    @InterfaceC5056aJ2
    public final synchronized void c(@InterfaceC11300zs1 RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.a = c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.a;
        if (rootTelemetryConfiguration2 != null && rootTelemetryConfiguration2.d0() >= rootTelemetryConfiguration.d0()) {
            return;
        }
        this.a = rootTelemetryConfiguration;
    }
}
