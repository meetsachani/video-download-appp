package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import o.InterfaceC10697xN2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ProxyNotificationPreferences {
    public static final String a = "com.google.firebase.messaging";

    private ProxyNotificationPreferences() {
    }

    public static SharedPreferences a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    @InterfaceC10697xN2
    public static boolean b(Context context) {
        return a(context).getBoolean("proxy_notification_initialized", false);
    }

    @InterfaceC10697xN2
    public static void c(Context context, boolean z) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.putBoolean("proxy_notification_initialized", z);
        edit.apply();
    }
}
