package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzd implements AppMeasurementSdk.OnEventListener {
    public final /* synthetic */ zze a;

    public zzd(zze zzeVar) {
        this.a = zzeVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzil
    public final void a(String str, String str2, Bundle bundle, long j) {
        AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener;
        if (!this.a.a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("events", zzb.c(str2));
        analyticsConnectorListener = this.a.b;
        analyticsConnectorListener.a(2, bundle2);
    }
}
