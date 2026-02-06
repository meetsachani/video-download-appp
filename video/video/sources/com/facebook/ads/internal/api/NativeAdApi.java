package com.facebook.ads.internal.api;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.VideoAutoplayBehavior;
import java.util.List;
import o.InterfaceC11300zs1;

@Keep
/* loaded from: classes2.dex */
public interface NativeAdApi {
    NativeAd.AdCreativeType getAdCreativeType();

    VideoAutoplayBehavior getVideoAutoplayBehavior();

    void registerViewForInteraction(View view, MediaView mediaView);

    void registerViewForInteraction(View view, MediaView mediaView, @InterfaceC11300zs1 ImageView imageView);

    void registerViewForInteraction(View view, MediaView mediaView, @InterfaceC11300zs1 ImageView imageView, @InterfaceC11300zs1 List<View> list);

    void registerViewForInteraction(View view, MediaView mediaView, @InterfaceC11300zs1 MediaView mediaView2);

    void registerViewForInteraction(View view, MediaView mediaView, @InterfaceC11300zs1 MediaView mediaView2, @InterfaceC11300zs1 List<View> list);

    void registerViewForInteraction(View view, MediaView mediaView, @InterfaceC11300zs1 List<View> list);
}
