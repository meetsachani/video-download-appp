package com.google.firebase.crashlytics;

import com.google.firebase.Firebase;
import o.C6562gT0;
import o.C7458kA2;
import o.HA0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class FirebaseCrashlyticsKt {
    @NotNull
    public static final FirebaseCrashlytics a(@NotNull Firebase firebase) {
        C6562gT0.p(firebase, "<this>");
        FirebaseCrashlytics d = FirebaseCrashlytics.d();
        C6562gT0.o(d, "getInstance()");
        return d;
    }

    public static final void b(@NotNull FirebaseCrashlytics firebaseCrashlytics, @NotNull HA0<? super KeyValueBuilder, C7458kA2> ha0) {
        C6562gT0.p(firebaseCrashlytics, "<this>");
        C6562gT0.p(ha0, "init");
        ha0.invoke(new KeyValueBuilder(firebaseCrashlytics));
    }
}
