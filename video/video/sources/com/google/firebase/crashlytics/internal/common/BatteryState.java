package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.Logger;

/* loaded from: classes3.dex */
class BatteryState {
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public final Float a;
    public final boolean b;

    public BatteryState(Float f, boolean z) {
        this.b = z;
        this.a = f;
    }

    public static BatteryState a(Context context) {
        boolean z = false;
        Float f = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = f(registerReceiver);
                f = d(registerReceiver);
            }
        } catch (IllegalStateException e2) {
            Logger.f().e("An error occurred getting battery state.", e2);
        }
        return new BatteryState(f, z);
    }

    public static Float d(Intent intent) {
        int intExtra = intent.getIntExtra(FirebaseAnalytics.Param.t, -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra != -1 && intExtra2 != -1) {
            return Float.valueOf(intExtra / intExtra2);
        }
        return null;
    }

    public static boolean f(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return true;
    }

    public Float b() {
        return this.a;
    }

    public int c() {
        Float f;
        if (this.b && (f = this.a) != null) {
            if (f.floatValue() < 0.99d) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    public boolean e() {
        return this.b;
    }
}
