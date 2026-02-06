package com.google.android.gms.internal.consent_sdk;

import android.os.Build;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* loaded from: classes3.dex */
public final class zzcu {
    public static boolean a(boolean z) {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            if (!str.contains("generic") && !str.contains("emulator") && !Build.HARDWARE.contains(CommonUtils.c)) {
                return false;
            }
            return true;
        }
        return Build.DEVICE.startsWith("generic");
    }
}
