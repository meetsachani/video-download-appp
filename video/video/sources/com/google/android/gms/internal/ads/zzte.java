package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzte {
    public static Boolean a;

    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (Build.VERSION.SDK_INT >= 29) {
            Boolean bool = a;
            if (bool == null || !bool.booleanValue()) {
                return zztd.a(videoCapabilities, i, i2, d);
            }
            return 0;
        }
        return 0;
    }
}
