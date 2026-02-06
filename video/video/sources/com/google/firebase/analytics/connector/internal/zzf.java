package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzf implements AppMeasurementSdk.OnEventListener {
    public final /* synthetic */ zzg a;

    public zzf(zzg zzgVar) {
        this.a = zzgVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzil
    public final void a(String str, String str2, Bundle bundle, long j) {
        AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener;
        if (str != null && zzb.l(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            analyticsConnectorListener = this.a.a;
            analyticsConnectorListener.a(3, bundle2);
        }
    }
}
