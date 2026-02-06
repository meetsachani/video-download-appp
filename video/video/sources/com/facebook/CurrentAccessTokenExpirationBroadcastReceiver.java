package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import o.C6562gT0;
import o.C9998uW1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        C6562gT0.p(context, "context");
        C6562gT0.p(intent, C9998uW1.R);
        if (C6562gT0.g(C2338g.h, intent.getAction())) {
            M m = M.a;
            if (M.N()) {
                C2338g.f.e().g();
            }
        }
    }
}
