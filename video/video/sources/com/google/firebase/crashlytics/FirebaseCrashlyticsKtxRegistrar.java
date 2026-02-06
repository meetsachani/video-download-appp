package com.google.firebase.crashlytics;

import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import o.C8222nF;
import o.C9516sY;
import org.jetbrains.annotations.NotNull;

@Keep
/* loaded from: classes3.dex */
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<?>> getComponents() {
        return C8222nF.H();
    }
}
