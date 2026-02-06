package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;

/* loaded from: classes3.dex */
public class RemoteConfigDeferredProxy {
    public final Deferred<FirebaseRemoteConfigInterop> a;

    public RemoteConfigDeferredProxy(Deferred<FirebaseRemoteConfigInterop> deferred) {
        this.a = deferred;
    }

    public static /* synthetic */ void a(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, Provider provider) {
        ((FirebaseRemoteConfigInterop) provider.get()).a(RemoteConfigComponent.p, crashlyticsRemoteConfigListener);
        Logger.f().b("Registering RemoteConfig Rollouts subscriber");
    }

    public void b(UserMetadata userMetadata) {
        if (userMetadata == null) {
            Logger.f().m("Didn't successfully register with UserMetadata for rollouts listener");
            return;
        }
        final CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener = new CrashlyticsRemoteConfigListener(userMetadata);
        this.a.a(new Deferred.DeferredHandler() { // from class: o.fR1
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void a(Provider provider) {
                RemoteConfigDeferredProxy.a(CrashlyticsRemoteConfigListener.this, provider);
            }
        });
    }
}
