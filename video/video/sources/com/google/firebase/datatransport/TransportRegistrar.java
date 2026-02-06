package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import o.C11298zs;
import o.Ot2;
import o.Ut2;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ Ot2 a(ComponentContainer componentContainer) {
        Ut2.f((Context) componentContainer.a(Context.class));
        return Ut2.c().h(C11298zs.k);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.h(Ot2.class).h(LIBRARY_NAME).b(Dependency.m(Context.class)).f(new ComponentFactory() { // from class: o.Tt2
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                return TransportRegistrar.a(componentContainer);
            }
        }).d(), LibraryVersionComponent.b(LIBRARY_NAME, BuildConfig.d));
    }
}
