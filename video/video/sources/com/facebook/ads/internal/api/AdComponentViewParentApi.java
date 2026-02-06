package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.Keep;
import o.InterfaceC6184ey2;

@InterfaceC6184ey2
@Keep
/* loaded from: classes2.dex */
public interface AdComponentViewParentApi extends AdComponentView {
    void bringChildToFront(View view);

    void onAttachedToWindow();

    void onDetachedFromWindow();

    void onMeasure(int i, int i2);

    void onVisibilityChanged(View view, int i);

    void setMeasuredDimension(int i, int i2);
}
