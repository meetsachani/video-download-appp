package com.google.android.gms.internal.ads;

import android.os.Build;

/* loaded from: classes2.dex */
public final class zzsd {
    public static final boolean a;

    static {
        boolean z = false;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            }
        }
        a = z;
    }
}
