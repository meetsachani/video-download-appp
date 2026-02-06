package com.google.firebase.analytics.ktx;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.InterfaceC9150r20;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC9150r20(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
/* loaded from: classes3.dex */
public final class ConsentBuilder {
    @Nullable
    public FirebaseAnalytics.ConsentStatus a;
    @Nullable
    public FirebaseAnalytics.ConsentStatus b;

    @NotNull
    public final Map<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FirebaseAnalytics.ConsentStatus consentStatus = this.a;
        if (consentStatus != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_STORAGE, consentStatus);
        }
        FirebaseAnalytics.ConsentStatus consentStatus2 = this.b;
        if (consentStatus2 != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, consentStatus2);
        }
        return linkedHashMap;
    }

    @InterfaceC11300zs1
    public final FirebaseAnalytics.ConsentStatus b() {
        return this.a;
    }

    @InterfaceC11300zs1
    public final FirebaseAnalytics.ConsentStatus c() {
        return this.b;
    }

    public final void d(@Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.a = consentStatus;
    }

    public final void e(@Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.b = consentStatus;
    }
}
