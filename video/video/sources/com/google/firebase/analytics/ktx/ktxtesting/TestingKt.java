package com.google.firebase.analytics.ktx.ktxtesting;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.AnalyticsKt;
import o.C6562gT0;
import o.C7458kA2;
import o.FA0;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class TestingKt {
    public static final void a(@InterfaceC5670cr1 FirebaseAnalytics firebaseAnalytics, @InterfaceC5670cr1 FA0<C7458kA2> fa0) {
        C6562gT0.p(firebaseAnalytics, "analytics");
        C6562gT0.p(fa0, "block");
        synchronized (AnalyticsKt.c()) {
            FirebaseAnalytics a = AnalyticsKt.a();
            AnalyticsKt.e(firebaseAnalytics);
            fa0.invoke();
            AnalyticsKt.e(a);
        }
    }
}
