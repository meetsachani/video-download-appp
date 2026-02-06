package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import o.InterfaceC5670cr1;

@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public class StatsUtils {
    @InterfaceC5670cr1
    @KeepForSdk
    public static String a(@InterfaceC5670cr1 PowerManager.WakeLock wakeLock, @InterfaceC5670cr1 String str) {
        String valueOf = String.valueOf((Process.myPid() << 32) | System.identityHashCode(wakeLock));
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        return String.valueOf(valueOf).concat(String.valueOf(str));
    }
}
