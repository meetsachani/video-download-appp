package com.google.firebase.analytics.ktx;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.ktx.FirebaseKt;
import o.C6562gT0;
import o.C7458kA2;
import o.HA0;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC9150r20;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class AnalyticsKt {
    @Nullable
    public static volatile FirebaseAnalytics a;
    @NotNull
    public static final Object b = new Object();

    @InterfaceC11300zs1
    public static final FirebaseAnalytics a() {
        return a;
    }

    @NotNull
    public static final FirebaseAnalytics b(@InterfaceC5670cr1 Firebase firebase) {
        C6562gT0.p(firebase, "<this>");
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    a = FirebaseAnalytics.getInstance(FirebaseKt.c(Firebase.a).n());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = a;
        C6562gT0.m(firebaseAnalytics);
        return firebaseAnalytics;
    }

    @NotNull
    public static final Object c() {
        return b;
    }

    @InterfaceC9150r20(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public static final void d(@InterfaceC5670cr1 FirebaseAnalytics firebaseAnalytics, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 HA0<? super ParametersBuilder, C7458kA2> ha0) {
        C6562gT0.p(firebaseAnalytics, "<this>");
        C6562gT0.p(str, "name");
        C6562gT0.p(ha0, "block");
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        ha0.invoke(parametersBuilder);
        firebaseAnalytics.c(str, parametersBuilder.a());
    }

    public static final void e(@Nullable FirebaseAnalytics firebaseAnalytics) {
        a = firebaseAnalytics;
    }

    @InterfaceC9150r20(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public static final void f(@InterfaceC5670cr1 FirebaseAnalytics firebaseAnalytics, @InterfaceC5670cr1 HA0<? super ConsentBuilder, C7458kA2> ha0) {
        C6562gT0.p(firebaseAnalytics, "<this>");
        C6562gT0.p(ha0, "block");
        ConsentBuilder consentBuilder = new ConsentBuilder();
        ha0.invoke(consentBuilder);
        firebaseAnalytics.f(consentBuilder.a());
    }
}
