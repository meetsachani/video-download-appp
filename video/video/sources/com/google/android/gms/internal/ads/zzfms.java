package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* loaded from: classes2.dex */
public final class zzfms {
    public static UiModeManager a;

    public static zzflh a() {
        UiModeManager uiModeManager = a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType != 1) {
                if (currentModeType != 4) {
                    return zzflh.OTHER;
                }
                return zzflh.CTV;
            }
            return zzflh.MOBILE;
        }
        return zzflh.OTHER;
    }

    public static void b(Context context) {
        if (context != null) {
            a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
