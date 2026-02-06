package com.facebook.ads.internal.api;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import o.InterfaceC11300zs1;
import o.InterfaceC2992Fs1;

@InterfaceC2992Fs1(InterfaceC2992Fs1.a.LOCAL)
@Keep
/* loaded from: classes2.dex */
public interface AudienceNetworkAdsApi {
    public static final int BANNER = 1;
    public static final int INTERSTITIAL = 2;
    public static final int NATIVE = 4;
    public static final int NATIVE_BANNER = 5;
    public static final int REWARDED_VIDEO = 6;
    public static final int UNKNOWN = 0;

    int getAdFormatForPlacement(String str);

    void initialize(Context context, @InterfaceC11300zs1 MultithreadedBundleWrapper multithreadedBundleWrapper, @InterfaceC11300zs1 AudienceNetworkAds.InitListener initListener);

    boolean isInitialized();

    void onContentProviderCreated(Context context);
}
