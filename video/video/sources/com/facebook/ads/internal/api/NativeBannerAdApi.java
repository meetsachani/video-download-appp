package com.facebook.ads.internal.api;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.facebook.ads.MediaView;
import java.util.List;
import o.InterfaceC11300zs1;

@Keep
/* loaded from: classes2.dex */
public interface NativeBannerAdApi {
    void registerViewForInteraction(View view, ImageView imageView);

    void registerViewForInteraction(View view, ImageView imageView, @InterfaceC11300zs1 List<View> list);

    void registerViewForInteraction(View view, MediaView mediaView);

    void registerViewForInteraction(View view, MediaView mediaView, @InterfaceC11300zs1 List<View> list);
}
