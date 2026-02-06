package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.FirebaseApp;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import o.C4467Uv0;
import o.C6562gT0;
import o.C7458kA2;
import o.HA0;
import o.IR1;
import o.InterfaceC3882Ov0;
import o.InterfaceC9150r20;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class RemoteConfigKt {
    @InterfaceC9150r20(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @IR1(expression = "", imports = {}))
    @NotNull
    public static final FirebaseRemoteConfigValue a(@NotNull FirebaseRemoteConfig firebaseRemoteConfig, @NotNull String str) {
        C6562gT0.p(firebaseRemoteConfig, "<this>");
        C6562gT0.p(str, "key");
        FirebaseRemoteConfigValue z = firebaseRemoteConfig.z(str);
        C6562gT0.o(z, "this.getValue(key)");
        return z;
    }

    @NotNull
    public static final InterfaceC3882Ov0<ConfigUpdate> b(@NotNull FirebaseRemoteConfig firebaseRemoteConfig) {
        C6562gT0.p(firebaseRemoteConfig, "<this>");
        return C4467Uv0.r(new RemoteConfigKt$configUpdates$1(firebaseRemoteConfig, null));
    }

    @InterfaceC9150r20(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @IR1(expression = "", imports = {}))
    public static /* synthetic */ void c(FirebaseRemoteConfig firebaseRemoteConfig) {
    }

    @NotNull
    public static final FirebaseRemoteConfig d(@NotNull Firebase firebase) {
        C6562gT0.p(firebase, "<this>");
        FirebaseRemoteConfig t = FirebaseRemoteConfig.t();
        C6562gT0.o(t, "getInstance()");
        return t;
    }

    @NotNull
    public static final FirebaseRemoteConfig e(@NotNull Firebase firebase, @NotNull FirebaseApp firebaseApp) {
        C6562gT0.p(firebase, "<this>");
        C6562gT0.p(firebaseApp, FirebaseMessaging.r);
        FirebaseRemoteConfig u = FirebaseRemoteConfig.u(firebaseApp);
        C6562gT0.o(u, "getInstance(app)");
        return u;
    }

    @NotNull
    public static final FirebaseRemoteConfigSettings f(@NotNull HA0<? super FirebaseRemoteConfigSettings.Builder, C7458kA2> ha0) {
        C6562gT0.p(ha0, "init");
        FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
        ha0.invoke(builder);
        FirebaseRemoteConfigSettings c = builder.c();
        C6562gT0.o(c, "builder.build()");
        return c;
    }
}
