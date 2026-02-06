package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.NativeAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC2992Fs1;
import o.InterfaceC6184ey2;

@InterfaceC2992Fs1(InterfaceC2992Fs1.a.LOCAL)
@InterfaceC6184ey2
@Keep
/* loaded from: classes2.dex */
public class NativeAd extends NativeAdBase {
    private NativeAdApi mNativeAdApi;
    @InterfaceC11300zs1
    private NativeOptions mNativeOptions;

    @Keep
    /* loaded from: classes2.dex */
    public enum AdCreativeType {
        IMAGE,
        VIDEO,
        CAROUSEL,
        UNKNOWN
    }

    @Keep
    /* loaded from: classes2.dex */
    public static class NativeOptions {
        @InterfaceC11300zs1
        private Boolean mDisableFullScreen = null;
        @InterfaceC11300zs1
        private Boolean mHideMediaControls = null;
        @InterfaceC11300zs1
        private Boolean mUnMuteVolume = null;

        @InterfaceC11300zs1
        public Boolean getDisableFullScreen() {
            return this.mDisableFullScreen;
        }

        @InterfaceC11300zs1
        public Boolean getHideMediaControls() {
            return this.mHideMediaControls;
        }

        @InterfaceC11300zs1
        public Boolean getUnMuteVolume() {
            return this.mUnMuteVolume;
        }

        public NativeOptions setDisableFullScreen(Boolean bool) {
            this.mDisableFullScreen = bool;
            return this;
        }

        public NativeOptions setHideMediaControls(Boolean bool) {
            this.mHideMediaControls = bool;
            return this;
        }

        public NativeOptions setUnMuteVolume(Boolean bool) {
            this.mUnMuteVolume = bool;
            return this;
        }
    }

    public NativeAd(Context context, String str) {
        super(context, str);
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    public AdCreativeType getAdCreativeType() {
        return this.mNativeAdApi.getAdCreativeType();
    }

    public NativeAdApi getNativeAdApi() {
        return this.mNativeAdApi;
    }

    @InterfaceC11300zs1
    public NativeOptions getNativeOptions() {
        return this.mNativeOptions;
    }

    @Deprecated
    public VideoAutoplayBehavior getVideoAutoplayBehavior() {
        return this.mNativeAdApi.getVideoAutoplayBehavior();
    }

    public void registerViewForInteraction(View view, MediaView mediaView) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView);
    }

    public NativeAd(Context context, NativeAdBaseApi nativeAdBaseApi) {
        super(nativeAdBaseApi);
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, @InterfaceC11300zs1 MediaView mediaView2) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, mediaView2);
    }

    public NativeAd(Context context, NativeAdBase nativeAdBase) {
        super(context, nativeAdBase);
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context).createNativeAdApi(nativeAdBase, this, this.mNativeAdBaseApi);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, @InterfaceC11300zs1 List<View> list) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, list);
    }

    public NativeAd(Context context, NativeAdBase nativeAdBase, @InterfaceC11300zs1 NativeOptions nativeOptions) {
        super(context, nativeAdBase);
        this.mNativeOptions = nativeOptions;
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context).createNativeAdApi(nativeAdBase, this, this.mNativeAdBaseApi);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, @InterfaceC11300zs1 MediaView mediaView2, @InterfaceC11300zs1 List<View> list) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, mediaView2, list);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, @InterfaceC11300zs1 ImageView imageView) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, imageView);
    }

    public NativeAd(Context context, String str, @InterfaceC11300zs1 NativeOptions nativeOptions) {
        super(context, str);
        this.mNativeOptions = nativeOptions;
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, @InterfaceC11300zs1 ImageView imageView, @InterfaceC11300zs1 List<View> list) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, imageView, list);
    }

    public NativeAd(Context context, NativeAdBaseApi nativeAdBaseApi, @InterfaceC11300zs1 NativeOptions nativeOptions) {
        super(nativeAdBaseApi);
        this.mNativeOptions = nativeOptions;
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context).createNativeAdApi(this, this.mNativeAdBaseApi);
    }
}
