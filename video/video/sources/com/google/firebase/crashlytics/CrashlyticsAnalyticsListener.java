package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import java.util.Locale;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class CrashlyticsAnalyticsListener implements AnalyticsConnector.AnalyticsConnectorListener {
    public static final String c = "_o";
    public static final String d = "name";
    public static final String e = "params";
    public static final String f = "clx";
    public AnalyticsEventReceiver a;
    public AnalyticsEventReceiver b;

    public static void b(@InterfaceC11300zs1 AnalyticsEventReceiver analyticsEventReceiver, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 Bundle bundle) {
        if (analyticsEventReceiver == null) {
            return;
        }
        analyticsEventReceiver.onEvent(str, bundle);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public void a(int i, @InterfaceC11300zs1 Bundle bundle) {
        String string;
        Logger.f().k(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            c(string, bundle2);
        }
    }

    public final void c(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Bundle bundle) {
        AnalyticsEventReceiver analyticsEventReceiver;
        if ("clx".equals(bundle.getString(c))) {
            analyticsEventReceiver = this.a;
        } else {
            analyticsEventReceiver = this.b;
        }
        b(analyticsEventReceiver, str, bundle);
    }

    public void d(@InterfaceC11300zs1 AnalyticsEventReceiver analyticsEventReceiver) {
        this.b = analyticsEventReceiver;
    }

    public void e(@InterfaceC11300zs1 AnalyticsEventReceiver analyticsEventReceiver) {
        this.a = analyticsEventReceiver;
    }
}
