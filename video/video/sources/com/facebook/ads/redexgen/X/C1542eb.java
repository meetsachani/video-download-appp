package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeBannerAd;

/* renamed from: com.facebook.ads.redexgen.X.eb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1542eb extends LinearLayout {
    public C1542eb(C1673gi c1673gi, NativeBannerAd nativeBannerAd, EnumC1138Ve enumC1138Ve, C1137Vd c1137Vd, AdOptionsView adOptionsView) {
        super(c1673gi);
        TextView textView = new TextView(getContext());
        c1137Vd.A08(textView);
        textView.setText(nativeBannerAd.getAdvertiserName());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        TextView textView2 = new TextView(getContext());
        c1137Vd.A06(textView2);
        textView2.setText(nativeBannerAd.getAdUntrimmedBodyText());
        textView2.setLines(enumC1138Ve == EnumC1138Ve.A07 ? 2 : 1);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        linearLayout.addView(textView, layoutParams);
        linearLayout.addView(adOptionsView, new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        addView(linearLayout, layoutParams2);
        addView(textView2, layoutParams2);
    }
}
