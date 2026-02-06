package com.google.firebase.installations.ktx;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.messaging.FirebaseMessaging;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class InstallationsKt {
    @NotNull
    public static final FirebaseInstallations a(@NotNull Firebase firebase) {
        C6562gT0.p(firebase, "<this>");
        FirebaseInstallations u = FirebaseInstallations.u();
        C6562gT0.o(u, "getInstance()");
        return u;
    }

    @NotNull
    public static final FirebaseInstallations b(@NotNull Firebase firebase, @NotNull FirebaseApp firebaseApp) {
        C6562gT0.p(firebase, "<this>");
        C6562gT0.p(firebaseApp, FirebaseMessaging.r);
        FirebaseInstallations v = FirebaseInstallations.v(firebaseApp);
        C6562gT0.o(v, "getInstance(app)");
        return v;
    }
}
