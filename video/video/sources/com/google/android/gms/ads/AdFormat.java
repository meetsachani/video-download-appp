package com.google.android.gms.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);
    
    public final int X;

    AdFormat(int i) {
        this.X = i;
    }

    @InterfaceC11300zs1
    public static AdFormat e(int i) {
        AdFormat[] values;
        for (AdFormat adFormat : values()) {
            if (adFormat.g() == i) {
                return adFormat;
            }
        }
        return null;
    }

    public int g() {
        return this.X;
    }
}
