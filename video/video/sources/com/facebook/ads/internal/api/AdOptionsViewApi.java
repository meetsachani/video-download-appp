package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import com.facebook.ads.AdClosedListener;
import o.InterfaceC6184ey2;

@InterfaceC6184ey2
@Keep
/* loaded from: classes2.dex */
public interface AdOptionsViewApi extends AdComponentViewApiProvider {
    void setIconColor(int i);

    void setIconSizeDp(int i);

    void setOnAdClosedListener(AdClosedListener adClosedListener);

    void setSingleIcon(boolean z);
}
