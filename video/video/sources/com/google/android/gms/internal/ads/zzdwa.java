package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import o.C5445bv2;

/* loaded from: classes2.dex */
public final class zzdwa {
    public static final void a(Context context, ViewGroup viewGroup, AdView adView) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag(C5445bv2.w);
        f(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(adView);
        adView.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    public static final void b(Context context, ViewGroup viewGroup, NativeAd nativeAd) {
        String string;
        String string2;
        String string3;
        NativeAdView nativeAdView = new NativeAdView(context);
        nativeAdView.setTag("ad_view_tag");
        f(nativeAdView, -1, -1);
        viewGroup.addView(nativeAdView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        f(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        nativeAdView.addView(linearLayout);
        Resources f = com.google.android.gms.ads.internal.zzv.t().f();
        if (f == null) {
            string = "Headline";
        } else {
            string = f.getString(R.string.native_headline);
        }
        linearLayout.addView(c(context, string, "headline_header_tag"));
        View d = d(context, zzfvt.c(nativeAd.i()), "headline_tag");
        nativeAdView.setHeadlineView(d);
        linearLayout.addView(d);
        if (f == null) {
            string2 = "Body";
        } else {
            string2 = f.getString(R.string.native_body);
        }
        linearLayout.addView(c(context, string2, "body_header_tag"));
        View d2 = d(context, zzfvt.c(nativeAd.f()), "body_tag");
        nativeAdView.setBodyView(d2);
        linearLayout.addView(d2);
        if (f == null) {
            string3 = "Media View";
        } else {
            string3 = f.getString(R.string.native_media_view);
        }
        linearLayout.addView(c(context, string3, "media_view_header_tag"));
        MediaView mediaView = new MediaView(context);
        mediaView.setTag("media_view_tag");
        nativeAdView.setMediaView(mediaView);
        linearLayout.addView(mediaView);
        nativeAdView.setNativeAd(nativeAd);
    }

    public static TextView c(Context context, String str, String str2) {
        return e(context, str, 16973894, -9210245, 0.0f, str2);
    }

    public static TextView d(Context context, String str, String str2) {
        return e(context, str, 16973892, -16777216, 12.0f, str2);
    }

    public static TextView e(Context context, String str, int i, int i2, float f, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        f(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i);
        textView.setTextColor(i2);
        textView.setText(str);
        return textView;
    }

    public static void f(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i;
        layoutParams2.width = i2;
        view.setLayoutParams(layoutParams2);
    }
}
