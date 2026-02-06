package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.7C  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7C extends C1702hB {
    public InterfaceC1545ee A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A08(NativeAdLayout nativeAdLayout, C1673gi c1673gi, NativeAd nativeAd, C1137Vd c1137Vd) {
        C1367bk c1367bk = new C1367bk(c1673gi);
        MediaView mediaView = new MediaView(c1673gi);
        AdOptionsView adOptionsView = new AdOptionsView(c1673gi, nativeAd, nativeAdLayout);
        c1137Vd.A09(adOptionsView, 28);
        this.A00 = new F2(c1673gi, nativeAd, c1137Vd, UK.A0L(nativeAd.getInternalNativeAd()).A1C(), c1367bk, mediaView, adOptionsView);
        YB.A0N(nativeAdLayout, c1137Vd.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c1367bk, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.C1043Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
