package com.google.firebase.remoteconfig.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import o.C8222nF;
import o.IR1;
import o.InterfaceC9150r20;
import org.jetbrains.annotations.NotNull;

@InterfaceC9150r20(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @IR1(expression = "", imports = {}))
@Keep
/* loaded from: classes3.dex */
public final class FirebaseRemoteConfigKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<?>> getComponents() {
        return C8222nF.H();
    }
}
