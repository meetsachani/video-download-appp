package com.google.firebase.components;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes3.dex */
public interface ComponentRegistrarProcessor {
    public static final ComponentRegistrarProcessor a = new ComponentRegistrarProcessor() { // from class: o.DI
        @Override // com.google.firebase.components.ComponentRegistrarProcessor
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List<Component<?>> a(ComponentRegistrar componentRegistrar);
}
