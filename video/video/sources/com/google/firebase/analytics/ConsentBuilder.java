package com.google.firebase.analytics;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import o.InterfaceC11300zs1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ConsentBuilder {
    @Nullable
    public FirebaseAnalytics.ConsentStatus a;
    @Nullable
    public FirebaseAnalytics.ConsentStatus b;
    @Nullable
    public FirebaseAnalytics.ConsentStatus c;
    @Nullable
    public FirebaseAnalytics.ConsentStatus d;

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
        FirebaseAnalytics.ConsentStatus consentStatus3 = this.c;
        if (consentStatus3 != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_USER_DATA, consentStatus3);
        }
        FirebaseAnalytics.ConsentStatus consentStatus4 = this.d;
        if (consentStatus4 != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_PERSONALIZATION, consentStatus4);
        }
        return linkedHashMap;
    }

    @InterfaceC11300zs1
    public final FirebaseAnalytics.ConsentStatus b() {
        return this.d;
    }

    @InterfaceC11300zs1
    public final FirebaseAnalytics.ConsentStatus c() {
        return this.a;
    }

    @InterfaceC11300zs1
    public final FirebaseAnalytics.ConsentStatus d() {
        return this.c;
    }

    @InterfaceC11300zs1
    public final FirebaseAnalytics.ConsentStatus e() {
        return this.b;
    }

    public final void f(@Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.d = consentStatus;
    }

    public final void g(@Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.a = consentStatus;
    }

    public final void h(@Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.c = consentStatus;
    }

    public final void i(@Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.b = consentStatus;
    }
}
