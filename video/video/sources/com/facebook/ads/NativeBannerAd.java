package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeBannerAdApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC2992Fs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC6184ey2;

@InterfaceC2992Fs1(InterfaceC2992Fs1.a.X)
@InterfaceC6184ey2
@Keep
/* loaded from: classes2.dex */
public class NativeBannerAd extends NativeAdBase {
    private final NativeBannerAdApi mNativeBannerAdApi;

    public NativeBannerAd(Context context, String str) {
        super(context, str);
        this.mNativeBannerAdApi = DynamicLoaderFactory.makeLoader(context).createNativeBannerAdApi(this, this.mNativeAdBaseApi);
    }

    public void registerViewForInteraction(View view, MediaView mediaView) {
        Preconditions.checkIsOnMainThread();
        this.mNativeBannerAdApi.registerViewForInteraction(view, mediaView);
    }

    @InterfaceC5056aJ2
    public NativeBannerAd(Context context, NativeAdBaseApi nativeAdBaseApi) {
        super(nativeAdBaseApi);
        this.mNativeBannerAdApi = DynamicLoaderFactory.makeLoader(context).createNativeBannerAdApi(this, this.mNativeAdBaseApi);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, @InterfaceC11300zs1 List<View> list) {
        Preconditions.checkIsOnMainThread();
        this.mNativeBannerAdApi.registerViewForInteraction(view, mediaView, list);
    }

    public void registerViewForInteraction(View view, ImageView imageView) {
        Preconditions.checkIsOnMainThread();
        this.mNativeBannerAdApi.registerViewForInteraction(view, imageView);
    }

    public void registerViewForInteraction(View view, ImageView imageView, @InterfaceC11300zs1 List<View> list) {
        Preconditions.checkIsOnMainThread();
        this.mNativeBannerAdApi.registerViewForInteraction(view, imageView, list);
    }
}
