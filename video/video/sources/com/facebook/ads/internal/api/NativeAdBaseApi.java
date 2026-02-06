package com.facebook.ads.internal.api;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.NativeAdBase;
import o.InterfaceC11300zs1;

@Keep
/* loaded from: classes2.dex */
public interface NativeAdBaseApi {
    NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase);

    void destroy();

    void downloadMedia();

    @InterfaceC11300zs1
    String getAdBodyText();

    @InterfaceC11300zs1
    String getAdCallToAction();

    @InterfaceC11300zs1
    NativeAdImageApi getAdChoicesIcon();

    @InterfaceC11300zs1
    String getAdChoicesImageUrl();

    @InterfaceC11300zs1
    String getAdChoicesLinkUrl();

    @InterfaceC11300zs1
    String getAdChoicesText();

    @InterfaceC11300zs1
    NativeAdImageApi getAdCoverImage();

    @InterfaceC11300zs1
    String getAdHeadline();

    @InterfaceC11300zs1
    NativeAdImageApi getAdIcon();

    @InterfaceC11300zs1
    String getAdLinkDescription();

    @InterfaceC11300zs1
    String getAdSocialContext();

    @InterfaceC11300zs1
    @Deprecated
    NativeAdRatingApi getAdStarRating();

    @InterfaceC11300zs1
    String getAdTranslation();

    @InterfaceC11300zs1
    String getAdUntrimmedBodyText();

    @InterfaceC11300zs1
    String getAdvertiserName();

    float getAspectRatio();

    @InterfaceC11300zs1
    String getId();

    String getPlacementId();

    @InterfaceC11300zs1
    Drawable getPreloadedIconViewDrawable();

    @InterfaceC11300zs1
    String getPromotedTranslation();

    @InterfaceC11300zs1
    String getSponsoredTranslation();

    boolean hasCallToAction();

    boolean isAdInvalidated();

    boolean isAdLoaded();

    void loadAd();

    void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig);

    void onCtaBroadcast();

    void setExtraHints(ExtraHints extraHints);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void unregisterView();
}
