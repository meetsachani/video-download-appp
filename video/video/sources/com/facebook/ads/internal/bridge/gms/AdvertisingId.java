package com.facebook.ads.internal.bridge.gms;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import o.InterfaceC11300zs1;
import o.InterfaceC2992Fs1;

@InterfaceC2992Fs1(InterfaceC2992Fs1.a.LOCAL)
@Keep
/* loaded from: classes2.dex */
public class AdvertisingId {
    private final String mId;
    private final boolean mLimitAdTracking;

    public AdvertisingId(String str, boolean z) {
        this.mId = str;
        this.mLimitAdTracking = z;
    }

    @InterfaceC11300zs1
    @SuppressLint({"CatchGeneralException"})
    public static AdvertisingId getAdvertisingIdInfoDirectly(Context context) {
        try {
            AdvertisingIdClient.Info a = AdvertisingIdClient.a(context);
            if (a != null) {
                return new AdvertisingId(a.a(), a.b());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getId() {
        return this.mId;
    }

    public boolean isLimitAdTracking() {
        return this.mLimitAdTracking;
    }
}
