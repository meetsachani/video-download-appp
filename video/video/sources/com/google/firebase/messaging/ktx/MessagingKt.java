package com.google.firebase.messaging.ktx;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import o.C6562gT0;
import o.C7458kA2;
import o.HA0;
import o.IR1;
import o.InterfaceC9150r20;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class MessagingKt {
    @NotNull
    public static final FirebaseMessaging a(@NotNull Firebase firebase) {
        C6562gT0.p(firebase, "<this>");
        FirebaseMessaging u = FirebaseMessaging.u();
        C6562gT0.o(u, "getInstance()");
        return u;
    }

    @InterfaceC9150r20(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @IR1(expression = "", imports = {}))
    @NotNull
    public static final RemoteMessage b(@NotNull String str, @NotNull HA0<? super RemoteMessage.Builder, C7458kA2> ha0) {
        C6562gT0.p(str, "to");
        C6562gT0.p(ha0, "init");
        RemoteMessage.Builder builder = new RemoteMessage.Builder(str);
        ha0.invoke(builder);
        RemoteMessage b = builder.b();
        C6562gT0.o(b, "builder.build()");
        return b;
    }
}
