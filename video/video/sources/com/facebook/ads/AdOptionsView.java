package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.AdComponentFrameLayout;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import o.InterfaceC11300zs1;
import o.InterfaceC2992Fs1;

@InterfaceC2992Fs1(InterfaceC2992Fs1.a.X)
@Keep
/* loaded from: classes2.dex */
public class AdOptionsView extends AdComponentFrameLayout {
    private final AdOptionsViewApi mAdOptionsViewApi;

    @Keep
    /* loaded from: classes2.dex */
    public enum Orientation {
        HORIZONTAL,
        VERTICAL
    }

    public AdOptionsView(Context context, NativeAdBase nativeAdBase, @InterfaceC11300zs1 NativeAdLayout nativeAdLayout) {
        super(context);
        AdOptionsViewApi createAdOptionsView = DynamicLoaderFactory.makeLoader(context).createAdOptionsView(context, nativeAdBase, nativeAdLayout, this);
        this.mAdOptionsViewApi = createAdOptionsView;
        attachAdComponentViewApi(createAdOptionsView);
    }

    public void setIconColor(int i) {
        this.mAdOptionsViewApi.setIconColor(i);
    }

    public void setIconSizeDp(int i) {
        this.mAdOptionsViewApi.setIconSizeDp(i);
    }

    public void setOnAdClosedListener(AdClosedListener adClosedListener) {
        this.mAdOptionsViewApi.setOnAdClosedListener(adClosedListener);
    }

    public void setSingleIcon(boolean z) {
        this.mAdOptionsViewApi.setSingleIcon(z);
    }

    public AdOptionsView(Context context, NativeAdBase nativeAdBase, @InterfaceC11300zs1 NativeAdLayout nativeAdLayout, Orientation orientation, int i) {
        super(context);
        AdOptionsViewApi createAdOptionsView = DynamicLoaderFactory.makeLoader(context).createAdOptionsView(context, nativeAdBase, nativeAdLayout, orientation, i, this);
        this.mAdOptionsViewApi = createAdOptionsView;
        attachAdComponentViewApi(createAdOptionsView);
    }
}
