package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzec extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final zzei a;

    public zzec(zzei zzeiVar) {
        this.a = zzeiVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i = 5;
        if (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) {
            z = true;
        } else {
            z = false;
        }
        zzei zzeiVar = this.a;
        if (true == z) {
            i = 10;
        }
        zzeiVar.h(i);
    }
}
