package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import o.InterfaceC5670cr1;

@Deprecated
/* loaded from: classes2.dex */
public class MediaView extends FrameLayout {
    public MediaView(@InterfaceC5670cr1 Context context) {
        super(context);
    }

    public void setImageScaleType(@InterfaceC5670cr1 ImageView.ScaleType scaleType) {
    }

    public void setMediaContent(@InterfaceC5670cr1 MediaContent mediaContent) {
    }

    public MediaView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public MediaView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
