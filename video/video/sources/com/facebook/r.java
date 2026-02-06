package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import o.C6562gT0;
import o.C9998uW1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public class r extends BroadcastReceiver {
    public void a(@NotNull String str, @NotNull String str2, @NotNull Bundle bundle) {
        C6562gT0.p(str, "appCallId");
        C6562gT0.p(str2, "action");
        C6562gT0.p(bundle, "extras");
    }

    public void b(@NotNull String str, @NotNull String str2, @NotNull Bundle bundle) {
        C6562gT0.p(str, "appCallId");
        C6562gT0.p(str2, "action");
        C6562gT0.p(bundle, "extras");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        C6562gT0.p(context, "context");
        C6562gT0.p(intent, C9998uW1.R);
        String stringExtra = intent.getStringExtra(com.facebook.internal.Z.J);
        String stringExtra2 = intent.getStringExtra(com.facebook.internal.Z.I);
        Bundle extras = intent.getExtras();
        if (stringExtra != null && stringExtra2 != null && extras != null) {
            com.facebook.internal.Z z = com.facebook.internal.Z.a;
            if (com.facebook.internal.Z.C(intent)) {
                a(stringExtra, stringExtra2, extras);
            } else {
                b(stringExtra, stringExtra2, extras);
            }
        }
    }
}
