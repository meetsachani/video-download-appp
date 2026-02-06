package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.component.AbtComponent;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

@Keep
/* loaded from: classes3.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static /* synthetic */ RemoteConfigComponent a(Qualified qualified, ComponentContainer componentContainer) {
        return new RemoteConfigComponent((Context) componentContainer.a(Context.class), (ScheduledExecutorService) componentContainer.g(qualified), (FirebaseApp) componentContainer.a(FirebaseApp.class), (FirebaseInstallationsApi) componentContainer.a(FirebaseInstallationsApi.class), ((AbtComponent) componentContainer.a(AbtComponent.class)).b("frc"), componentContainer.i(AnalyticsConnector.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        final Qualified a = Qualified.a(Blocking.class, ScheduledExecutorService.class);
        return Arrays.asList(Component.i(RemoteConfigComponent.class, FirebaseRemoteConfigInterop.class).h(LIBRARY_NAME).b(Dependency.m(Context.class)).b(Dependency.l(a)).b(Dependency.m(FirebaseApp.class)).b(Dependency.m(FirebaseInstallationsApi.class)).b(Dependency.m(AbtComponent.class)).b(Dependency.k(AnalyticsConnector.class)).f(new ComponentFactory() { // from class: o.iR1
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                return RemoteConfigRegistrar.a(Qualified.this, componentContainer);
            }
        }).e().d(), LibraryVersionComponent.b(LIBRARY_NAME, BuildConfig.d));
    }
}
