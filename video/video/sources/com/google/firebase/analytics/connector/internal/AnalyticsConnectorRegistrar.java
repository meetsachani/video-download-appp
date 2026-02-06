package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.AnalyticsConnectorImpl;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import o.InterfaceC5670cr1;

@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    @InterfaceC5670cr1
    @KeepForSdk
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.h(AnalyticsConnector.class).b(Dependency.m(FirebaseApp.class)).b(Dependency.m(Context.class)).b(Dependency.m(Subscriber.class)).f(new ComponentFactory() { // from class: com.google.firebase.analytics.connector.internal.zzc
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                AnalyticsConnector j;
                j = AnalyticsConnectorImpl.j((FirebaseApp) componentContainer.a(FirebaseApp.class), (Context) componentContainer.a(Context.class), (Subscriber) componentContainer.a(Subscriber.class));
                return j;
            }
        }).e().d(), LibraryVersionComponent.b("fire-analytics", "21.5.0"));
    }
}
