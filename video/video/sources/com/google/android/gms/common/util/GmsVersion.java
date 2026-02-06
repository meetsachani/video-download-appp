package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes2.dex */
public final class GmsVersion {
    @KeepForSdk
    public static final int a = 4100000;
    @KeepForSdk
    public static final int b = 4300000;
    @KeepForSdk
    public static final int c = 4400000;
    @KeepForSdk
    public static final int d = 5000000;
    @KeepForSdk
    public static final int e = 6000000;
    @KeepForSdk
    public static final int f = 7000000;
    @KeepForSdk
    public static final int g = 7200000;
    @KeepForSdk
    public static final int h = 7500000;
    @KeepForSdk
    public static final int i = 7800000;
    @KeepForSdk
    public static final int j = 8000000;

    private GmsVersion() {
    }

    @KeepForSdk
    public static boolean a(int i2) {
        return i2 >= 3200000;
    }
}
