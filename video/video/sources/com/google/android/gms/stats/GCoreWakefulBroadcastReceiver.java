package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class GCoreWakefulBroadcastReceiver extends WakefulBroadcastReceiver {
    @KeepForSdk
    public static boolean d(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 Intent intent) {
        if (intent == null) {
            return false;
        }
        return WakefulBroadcastReceiver.b(intent);
    }
}
