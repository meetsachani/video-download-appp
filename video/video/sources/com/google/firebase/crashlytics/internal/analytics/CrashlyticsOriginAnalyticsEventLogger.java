package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class CrashlyticsOriginAnalyticsEventLogger implements AnalyticsEventLogger {
    public static final String b = "clx";
    @InterfaceC5670cr1
    public final AnalyticsConnector a;

    public CrashlyticsOriginAnalyticsEventLogger(@InterfaceC5670cr1 AnalyticsConnector analyticsConnector) {
        this.a = analyticsConnector;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void a(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 Bundle bundle) {
        this.a.b("clx", str, bundle);
    }
}
