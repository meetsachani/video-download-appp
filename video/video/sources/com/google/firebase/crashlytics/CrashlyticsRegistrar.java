package com.google.firebase.crashlytics;

import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final String a = "fire-cls";

    static {
        FirebaseSessionsDependencies.a.a(SessionSubscriber.Name.CRASHLYTICS);
    }

    public final FirebaseCrashlytics b(ComponentContainer componentContainer) {
        return FirebaseCrashlytics.e((FirebaseApp) componentContainer.a(FirebaseApp.class), (FirebaseInstallationsApi) componentContainer.a(FirebaseInstallationsApi.class), componentContainer.k(CrashlyticsNativeComponent.class), componentContainer.k(AnalyticsConnector.class), componentContainer.k(FirebaseRemoteConfigInterop.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.h(FirebaseCrashlytics.class).h(a).b(Dependency.m(FirebaseApp.class)).b(Dependency.m(FirebaseInstallationsApi.class)).b(Dependency.b(CrashlyticsNativeComponent.class)).b(Dependency.b(AnalyticsConnector.class)).b(Dependency.b(FirebaseRemoteConfigInterop.class)).f(new ComponentFactory() { // from class: o.XQ
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                FirebaseCrashlytics b;
                b = CrashlyticsRegistrar.this.b(componentContainer);
                return b;
            }
        }).e().d(), LibraryVersionComponent.b(a, BuildConfig.d));
    }
}
