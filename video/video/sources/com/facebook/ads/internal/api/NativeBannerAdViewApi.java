package com.facebook.ads.internal.api;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import o.InterfaceC11300zs1;

@Keep
/* loaded from: classes2.dex */
public interface NativeBannerAdViewApi {
    View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type);

    View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, @InterfaceC11300zs1 NativeAdViewAttributes nativeAdViewAttributes);
}
