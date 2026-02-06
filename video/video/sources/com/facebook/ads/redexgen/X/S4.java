package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.api.NativeAdViewApi;

/* loaded from: assets/audience_network/classes2.dex */
public final class S4 implements NativeAdViewApi {
    public static View A00(C1673gi c1673gi, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C1137Vd c1137Vd = (C1137Vd) nativeAdViewAttributes.getInternalAttributes();
        UK internalNativeAd = UK.A0L(nativeAd.getInternalNativeAd());
        internalNativeAd.A1h(EnumC1138Ve.A00(type.getEnumCode()));
        internalNativeAd.A1g(c1137Vd);
        C7C c7c = new C7C();
        NativeAdLayout mediumRectTemplateLayout = new NativeAdLayout(c1673gi, c7c);
        c7c.A08(mediumRectTemplateLayout, c1673gi, nativeAd, c1137Vd);
        mediumRectTemplateLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (XX.A02 * type.getHeight())));
        return mediumRectTemplateLayout;
    }

    public static View A01(C1673gi c1673gi, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        UK A0L = UK.A0L(nativeAd.getInternalNativeAd());
        C1137Vd c1137Vd = (C1137Vd) nativeAdViewAttributes.getInternalAttributes();
        A0L.A1h(EnumC1138Ve.A0B);
        A0L.A1g(c1137Vd);
        C7C c7c = new C7C();
        NativeAdLayout nativeAdLayout = new NativeAdLayout(c1673gi, c7c);
        c7c.A08(nativeAdLayout, c1673gi, nativeAd, c1137Vd);
        return nativeAdLayout;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd) {
        return render(context, nativeAd, (NativeAdViewAttributes) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
        return render(context, nativeAd, type, null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        try {
            return A00(C1046Rp.A03(context), nativeAd, type, nativeAdViewAttributes);
        } catch (Throwable th) {
            return Z4.A00(C1046Rp.A03(context), th);
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        C1673gi contextWrapper;
        try {
            if (context instanceof C1673gi) {
                contextWrapper = (C1673gi) context;
            } else {
                contextWrapper = C1046Rp.A03(context);
            }
            return A01(contextWrapper, nativeAd, nativeAdViewAttributes);
        } catch (Throwable th) {
            return Z4.A00(C1046Rp.A03(context), th);
        }
    }
}
