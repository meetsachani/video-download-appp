package com.google.firebase.tracing;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.tracing.ComponentMonitor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ComponentMonitor implements ComponentRegistrarProcessor {
    public static /* synthetic */ Object b(String str, Component component, ComponentContainer componentContainer) {
        try {
            FirebaseTrace.b(str);
            return component.k().a(componentContainer);
        } finally {
            FirebaseTrace.a();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List<Component<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final Component<?> component : componentRegistrar.getComponents()) {
            final String l = component.l();
            if (l != null) {
                component = component.z(new ComponentFactory() { // from class: o.CI
                    @Override // com.google.firebase.components.ComponentFactory
                    public final Object a(ComponentContainer componentContainer) {
                        return ComponentMonitor.b(l, component, componentContainer);
                    }
                });
            }
            arrayList.add(component);
        }
        return arrayList;
    }
}
