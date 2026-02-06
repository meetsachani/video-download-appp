package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;
import o.Ot2;

@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(ComponentContainer componentContainer) {
        return new FirebaseMessaging((FirebaseApp) componentContainer.a(FirebaseApp.class), (FirebaseInstanceIdInternal) componentContainer.a(FirebaseInstanceIdInternal.class), componentContainer.i(UserAgentPublisher.class), componentContainer.i(HeartBeatInfo.class), (FirebaseInstallationsApi) componentContainer.a(FirebaseInstallationsApi.class), (Ot2) componentContainer.a(Ot2.class), (Subscriber) componentContainer.a(Subscriber.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.h(FirebaseMessaging.class).h(LIBRARY_NAME).b(Dependency.m(FirebaseApp.class)).b(Dependency.i(FirebaseInstanceIdInternal.class)).b(Dependency.k(UserAgentPublisher.class)).b(Dependency.k(HeartBeatInfo.class)).b(Dependency.i(Ot2.class)).b(Dependency.m(FirebaseInstallationsApi.class)).b(Dependency.m(Subscriber.class)).f(new ComponentFactory() { // from class: o.St0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                return FirebaseMessagingRegistrar.a(componentContainer);
            }
        }).c().d(), LibraryVersionComponent.b(LIBRARY_NAME, BuildConfig.d));
    }
}
