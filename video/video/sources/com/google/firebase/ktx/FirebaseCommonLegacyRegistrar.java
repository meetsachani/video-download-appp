package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import o.C7979mF;
import org.jetbrains.annotations.NotNull;

@Keep
/* loaded from: classes3.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<?>> getComponents() {
        return C7979mF.k(LibraryVersionComponent.b(LoggingKt.a, com.google.firebase.BuildConfig.d));
    }
}
