package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.Logger;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class UnavailableAnalyticsEventLogger implements AnalyticsEventLogger {
    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void a(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 Bundle bundle) {
        Logger.f().b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}
