package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1$registration$1;
import o.AI1;
import o.C10217vQ;
import o.C11128zA;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class RemoteConfigKt$configUpdates$1$registration$1 implements ConfigUpdateListener {
    public final /* synthetic */ FirebaseRemoteConfig a;
    public final /* synthetic */ AI1<ConfigUpdate> b;

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteConfigKt$configUpdates$1$registration$1(FirebaseRemoteConfig firebaseRemoteConfig, AI1<? super ConfigUpdate> ai1) {
        this.a = firebaseRemoteConfig;
        this.b = ai1;
    }

    public static final void d(AI1 ai1, ConfigUpdate configUpdate) {
        C6562gT0.p(ai1, "$$this$callbackFlow");
        C6562gT0.p(configUpdate, "$configUpdate");
        C11128zA.m0(ai1, configUpdate);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void a(@NotNull final ConfigUpdate configUpdate) {
        C6562gT0.p(configUpdate, "configUpdate");
        FirebaseRemoteConfig firebaseRemoteConfig = this.a;
        final AI1<ConfigUpdate> ai1 = this.b;
        firebaseRemoteConfig.D(new Runnable() { // from class: o.hR1
            @Override // java.lang.Runnable
            public final void run() {
                RemoteConfigKt$configUpdates$1$registration$1.d(AI1.this, configUpdate);
            }
        });
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void b(@NotNull FirebaseRemoteConfigException firebaseRemoteConfigException) {
        C6562gT0.p(firebaseRemoteConfigException, "error");
        C10217vQ.c(this.b, "Error listening for config updates.", firebaseRemoteConfigException);
    }
}
