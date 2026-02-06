package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.BuildConfig;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ AbtComponent a(ComponentContainer componentContainer) {
        return new AbtComponent((Context) componentContainer.a(Context.class), componentContainer.i(AnalyticsConnector.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.h(AbtComponent.class).h(LIBRARY_NAME).b(Dependency.m(Context.class)).b(Dependency.k(AnalyticsConnector.class)).f(new ComponentFactory() { // from class: o.E3
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                return AbtRegistrar.a(componentContainer);
            }
        }).d(), LibraryVersionComponent.b(LIBRARY_NAME, BuildConfig.d));
    }
}
