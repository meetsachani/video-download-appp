package com.facebook.ads.redexgen.X;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: com.facebook.ads.redexgen.X.4l  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04674l extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final C04714p A00;

    public C04674l(C04714p c04714p) {
        this.A00 = c04714p;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        boolean is5gNsa = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        this.A00.A07(is5gNsa ? 10 : 5);
    }
}
