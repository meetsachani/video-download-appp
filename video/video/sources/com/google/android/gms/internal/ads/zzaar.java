package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import o.ES1;

@ES1(26)
/* loaded from: classes2.dex */
final class zzaar {
    public static boolean a(Context context) {
        Display display;
        boolean isHdr;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display != null) {
            isHdr = display.isHdr();
            if (isHdr) {
                for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
