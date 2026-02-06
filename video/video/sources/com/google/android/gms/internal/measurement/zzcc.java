package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes3.dex */
public final class zzcc {
    public static final int a;
    public static final int b;

    static {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        a = 67108864;
        if (i2 >= 31) {
            i = 33554432;
        } else {
            i = 0;
        }
        b = i;
    }

    public static PendingIntent a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, 0, intent, i2);
    }
}
