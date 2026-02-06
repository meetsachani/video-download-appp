package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzg implements zza {
    public AnalyticsConnector.AnalyticsConnectorListener a;
    public AppMeasurementSdk b;
    public zzf c;

    public zzg(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.a = analyticsConnectorListener;
        this.b = appMeasurementSdk;
        zzf zzfVar = new zzf(this);
        this.c = zzfVar;
        this.b.s(zzfVar);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener a() {
        return this.a;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void b() {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void c(Set<String> set) {
    }
}
