package o;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import o.TD0;

/* renamed from: o.yo1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11041yo1 {
    public static int a;

    /* renamed from: o.yo1$a */
    /* loaded from: classes3.dex */
    public class a implements NativeAd.OnNativeAdLoadedListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void a(NativeAd nativeAd) {
            Log.d("84548448", "onNativeAdLoaded: ");
            C11041yo1.b(this.a, nativeAd);
        }
    }

    /* renamed from: o.yo1$b */
    /* loaded from: classes3.dex */
    public class b extends AdListener {
        public final /* synthetic */ int X;

        public b(int i) {
            this.X = i;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void g(LoadAdError loadAdError) {
            Log.d("84548448", "onAdFailedToLoad: " + loadAdError.d() + TD0.a.Y0 + this.X);
            int i = this.X;
            if (i == 1) {
                c.a = null;
            } else if (i == 2) {
                c.b = null;
            } else if (i == 4) {
                c.d = null;
            } else if (i == 5) {
                c.e = null;
            } else {
                c.c = null;
            }
        }
    }

    /* renamed from: o.yo1$c */
    /* loaded from: classes3.dex */
    public static class c {
        public static NativeAd a;
        public static NativeAd b;
        public static NativeAd c;
        public static NativeAd d;
        public static NativeAd e;
    }

    public static void b(int i, NativeAd nativeAd) {
        if (i == 1) {
            NativeAd nativeAd2 = c.a;
            if (nativeAd2 != null) {
                nativeAd2.b();
            }
            c.a = nativeAd;
        } else if (i == 2) {
            NativeAd nativeAd3 = c.b;
            if (nativeAd3 != null) {
                nativeAd3.b();
            }
            c.b = nativeAd;
        } else if (i == 3) {
            NativeAd nativeAd4 = c.c;
            if (nativeAd4 != null) {
                nativeAd4.b();
            }
            c.c = nativeAd;
        } else if (i == 4) {
            NativeAd nativeAd5 = c.d;
            if (nativeAd5 != null) {
                nativeAd5.b();
            }
            c.d = nativeAd;
        } else {
            NativeAd nativeAd6 = c.e;
            if (nativeAd6 != null) {
                nativeAd6.b();
            }
            c.e = nativeAd;
        }
    }

    public String a() {
        String str = C2723Dd.T().get(a);
        if (a >= C2723Dd.T().size() - 1) {
            a = 0;
            return str;
        }
        a++;
        return str;
    }

    public final void c(Activity activity, int i) {
        AdLoader.Builder builder = new AdLoader.Builder(activity, C2723Dd.S());
        builder.d(new a(i));
        builder.e(new b(i)).a().b(new AdRequest.Builder().p());
    }

    public final void d(Activity activity, NativeAd nativeAd, FrameLayout frameLayout) {
        NativeAdView nativeAdView = (NativeAdView) activity.getLayoutInflater().inflate(R.layout.pre_small_native_custom_layout, (ViewGroup) null);
        try {
            if (C2723Dd.Q()) {
                nativeAdView.findViewById(R.id.adview_smallntv).setBackground(activity.getResources().getDrawable(R.drawable.native_border_bg));
            } else {
                nativeAdView.findViewById(R.id.adview_smallntv).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.g())));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextView textView = (TextView) nativeAdView.findViewById(R.id.ad_call_to_action_smallntv);
        textView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
        textView.setTextColor(Color.parseColor(C2723Dd.R()));
        TextView textView2 = (TextView) nativeAdView.findViewById(R.id.ad_headline_small_ntv);
        TextView textView3 = (TextView) nativeAdView.findViewById(R.id.ad_body_small_ntv);
        textView2.setTextColor(Color.parseColor(C2723Dd.M()));
        textView3.setTextColor(Color.parseColor(C2723Dd.M()));
        nativeAdView.findViewById(R.id.ad_text).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
        ((TextView) nativeAdView.findViewById(R.id.ad_text)).setTextColor(Color.parseColor(C2723Dd.R()));
        ImageView imageView = (ImageView) nativeAdView.findViewById(R.id.custom_image);
        MediaView mediaView = (MediaView) nativeAdView.findViewById(R.id.ad_media);
        if (C2723Dd.J()) {
            if (C2723Dd.U()) {
                if (!activity.isDestroyed() && !activity.isFinishing()) {
                    imageView.setVisibility(0);
                    mediaView.setVisibility(8);
                    com.bumptech.glide.a.D(activity).r(a()).C1(imageView);
                }
            } else {
                imageView.setVisibility(8);
                mediaView.setVisibility(0);
                nativeAdView.setMediaView(mediaView);
            }
        } else {
            imageView.setVisibility(8);
            mediaView.setVisibility(0);
            nativeAdView.setMediaView(mediaView);
        }
        nativeAdView.setHeadlineView(textView2);
        nativeAdView.setBodyView(textView3);
        nativeAdView.setCallToActionView(textView);
        if (nativeAd.i() != null) {
            textView2.setText(nativeAd.i());
        }
        if (nativeAd.f() != null) {
            textView3.setText(nativeAd.f());
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        if (nativeAd.g() != null) {
            textView.setText(nativeAd.g());
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        nativeAdView.setNativeAd(nativeAd);
        frameLayout.removeAllViews();
        frameLayout.addView(nativeAdView);
    }

    public final void e(Activity activity, NativeAd nativeAd, FrameLayout frameLayout) {
        NativeAdView nativeAdView = (NativeAdView) activity.getLayoutInflater().inflate(R.layout.pre_small_native_custom_layout, (ViewGroup) null);
        try {
            if (C2723Dd.Q()) {
                nativeAdView.findViewById(R.id.adview_smallntv).setBackground(activity.getResources().getDrawable(R.drawable.native_border_bg));
            } else {
                nativeAdView.findViewById(R.id.adview_smallntv).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.g())));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextView textView = (TextView) nativeAdView.findViewById(R.id.ad_call_to_action_smallntv);
        textView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
        textView.setTextColor(Color.parseColor(C2723Dd.R()));
        TextView textView2 = (TextView) nativeAdView.findViewById(R.id.ad_headline_small_ntv);
        TextView textView3 = (TextView) nativeAdView.findViewById(R.id.ad_body_small_ntv);
        textView2.setTextColor(Color.parseColor(C2723Dd.M()));
        textView3.setTextColor(Color.parseColor(C2723Dd.M()));
        nativeAdView.findViewById(R.id.ad_text).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
        ((TextView) nativeAdView.findViewById(R.id.ad_text)).setTextColor(Color.parseColor(C2723Dd.R()));
        nativeAdView.setHeadlineView(textView2);
        nativeAdView.setBodyView(textView3);
        nativeAdView.setCallToActionView(textView);
        ImageView imageView = (ImageView) nativeAdView.findViewById(R.id.custom_image);
        MediaView mediaView = (MediaView) nativeAdView.findViewById(R.id.ad_media);
        if (C2723Dd.J()) {
            if (C2723Dd.U()) {
                if (!activity.isDestroyed() && !activity.isFinishing()) {
                    imageView.setVisibility(0);
                    mediaView.setVisibility(8);
                    com.bumptech.glide.a.D(activity).r(a()).C1(imageView);
                }
            } else {
                imageView.setVisibility(8);
                mediaView.setVisibility(0);
                nativeAdView.setMediaView(mediaView);
            }
        } else {
            imageView.setVisibility(8);
            mediaView.setVisibility(0);
            nativeAdView.setMediaView(mediaView);
        }
        if (nativeAd.i() != null) {
            textView2.setText(nativeAd.i());
        }
        if (nativeAd.f() != null) {
            textView3.setText(nativeAd.f());
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        if (nativeAd.g() != null) {
            textView.setText(nativeAd.g());
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        nativeAdView.setNativeAd(nativeAd);
        frameLayout.removeAllViews();
        frameLayout.addView(nativeAdView);
    }

    public final void f(Activity activity, NativeAd nativeAd, FrameLayout frameLayout) {
        NativeAdView nativeAdView = (NativeAdView) activity.getLayoutInflater().inflate(R.layout.pre_small_native_custom_layout, (ViewGroup) null);
        try {
            if (C2723Dd.Q()) {
                nativeAdView.findViewById(R.id.adview_smallntv).setBackground(activity.getResources().getDrawable(R.drawable.native_border_bg));
            } else {
                nativeAdView.findViewById(R.id.adview_smallntv).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.g())));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextView textView = (TextView) nativeAdView.findViewById(R.id.ad_call_to_action_smallntv);
        textView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
        textView.setTextColor(Color.parseColor(C2723Dd.R()));
        TextView textView2 = (TextView) nativeAdView.findViewById(R.id.ad_headline_small_ntv);
        TextView textView3 = (TextView) nativeAdView.findViewById(R.id.ad_body_small_ntv);
        textView2.setTextColor(Color.parseColor(C2723Dd.M()));
        textView3.setTextColor(Color.parseColor(C2723Dd.M()));
        nativeAdView.findViewById(R.id.ad_text).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
        ((TextView) nativeAdView.findViewById(R.id.ad_text)).setTextColor(Color.parseColor(C2723Dd.R()));
        nativeAdView.setHeadlineView(textView2);
        nativeAdView.setBodyView(textView3);
        nativeAdView.setCallToActionView(textView);
        ImageView imageView = (ImageView) nativeAdView.findViewById(R.id.custom_image);
        MediaView mediaView = (MediaView) nativeAdView.findViewById(R.id.ad_media);
        if (C2723Dd.J()) {
            if (C2723Dd.U()) {
                if (!activity.isDestroyed() && !activity.isFinishing()) {
                    imageView.setVisibility(0);
                    mediaView.setVisibility(8);
                    com.bumptech.glide.a.D(activity).r(a()).C1(imageView);
                }
            } else {
                imageView.setVisibility(8);
                mediaView.setVisibility(0);
                nativeAdView.setMediaView(mediaView);
            }
        } else {
            imageView.setVisibility(8);
            mediaView.setVisibility(0);
            nativeAdView.setMediaView(mediaView);
        }
        if (nativeAd.i() != null) {
            textView2.setText(nativeAd.i());
        }
        if (nativeAd.f() != null) {
            textView3.setText(nativeAd.f());
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        if (nativeAd.g() != null) {
            textView.setText(nativeAd.g());
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        nativeAdView.setNativeAd(nativeAd);
        frameLayout.removeAllViews();
        frameLayout.addView(nativeAdView);
    }

    public final void g(Activity activity, NativeAd nativeAd, FrameLayout frameLayout) {
        NativeAdView nativeAdView = (NativeAdView) activity.getLayoutInflater().inflate(R.layout.pre_small_native_custom_layout, (ViewGroup) null);
        try {
            if (C2723Dd.Q()) {
                nativeAdView.findViewById(R.id.adview_smallntv).setBackground(activity.getResources().getDrawable(R.drawable.native_border_bg));
            } else {
                nativeAdView.findViewById(R.id.adview_smallntv).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.g())));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextView textView = (TextView) nativeAdView.findViewById(R.id.ad_call_to_action_smallntv);
        textView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
        textView.setTextColor(Color.parseColor(C2723Dd.R()));
        TextView textView2 = (TextView) nativeAdView.findViewById(R.id.ad_headline_small_ntv);
        TextView textView3 = (TextView) nativeAdView.findViewById(R.id.ad_body_small_ntv);
        textView2.setTextColor(Color.parseColor(C2723Dd.M()));
        textView3.setTextColor(Color.parseColor(C2723Dd.M()));
        nativeAdView.findViewById(R.id.ad_text).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
        ((TextView) nativeAdView.findViewById(R.id.ad_text)).setTextColor(Color.parseColor(C2723Dd.R()));
        nativeAdView.setHeadlineView(textView2);
        nativeAdView.setBodyView(textView3);
        nativeAdView.setCallToActionView(textView);
        ImageView imageView = (ImageView) nativeAdView.findViewById(R.id.custom_image);
        MediaView mediaView = (MediaView) nativeAdView.findViewById(R.id.ad_media);
        if (C2723Dd.J()) {
            if (C2723Dd.U()) {
                if (!activity.isDestroyed() && !activity.isFinishing()) {
                    imageView.setVisibility(0);
                    mediaView.setVisibility(8);
                    com.bumptech.glide.a.D(activity).r(a()).C1(imageView);
                }
            } else {
                imageView.setVisibility(8);
                mediaView.setVisibility(0);
                nativeAdView.setMediaView(mediaView);
            }
        } else {
            imageView.setVisibility(8);
            mediaView.setVisibility(0);
            nativeAdView.setMediaView(mediaView);
        }
        if (nativeAd.i() != null) {
            textView2.setText(nativeAd.i());
        }
        if (nativeAd.f() != null) {
            textView3.setText(nativeAd.f());
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        if (nativeAd.g() != null) {
            textView.setText(nativeAd.g());
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        nativeAdView.setNativeAd(nativeAd);
        frameLayout.removeAllViews();
        frameLayout.addView(nativeAdView);
    }

    public final void h(Activity activity, NativeAd nativeAd, FrameLayout frameLayout) {
        NativeAdView nativeAdView = (NativeAdView) activity.getLayoutInflater().inflate(R.layout.pre_small_native_custom_layout, (ViewGroup) null);
        try {
            if (C2723Dd.Q()) {
                nativeAdView.findViewById(R.id.adview_smallntv).setBackground(activity.getResources().getDrawable(R.drawable.native_border_bg));
            } else {
                nativeAdView.findViewById(R.id.adview_smallntv).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.g())));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextView textView = (TextView) nativeAdView.findViewById(R.id.ad_call_to_action_smallntv);
        textView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
        textView.setTextColor(Color.parseColor(C2723Dd.R()));
        TextView textView2 = (TextView) nativeAdView.findViewById(R.id.ad_headline_small_ntv);
        TextView textView3 = (TextView) nativeAdView.findViewById(R.id.ad_body_small_ntv);
        textView2.setTextColor(Color.parseColor(C2723Dd.M()));
        textView3.setTextColor(Color.parseColor(C2723Dd.M()));
        nativeAdView.findViewById(R.id.ad_text).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
        ((TextView) nativeAdView.findViewById(R.id.ad_text)).setTextColor(Color.parseColor(C2723Dd.R()));
        nativeAdView.setHeadlineView(textView2);
        nativeAdView.setBodyView(textView3);
        nativeAdView.setCallToActionView(textView);
        ImageView imageView = (ImageView) nativeAdView.findViewById(R.id.custom_image);
        MediaView mediaView = (MediaView) nativeAdView.findViewById(R.id.ad_media);
        if (C2723Dd.J()) {
            if (C2723Dd.U()) {
                if (!activity.isDestroyed() && !activity.isFinishing()) {
                    imageView.setVisibility(0);
                    mediaView.setVisibility(8);
                    com.bumptech.glide.a.D(activity).r(a()).C1(imageView);
                }
            } else {
                imageView.setVisibility(8);
                mediaView.setVisibility(0);
                nativeAdView.setMediaView(mediaView);
            }
        } else {
            imageView.setVisibility(8);
            mediaView.setVisibility(0);
            nativeAdView.setMediaView(mediaView);
        }
        if (nativeAd.i() != null) {
            textView2.setText(nativeAd.i());
        }
        if (nativeAd.f() != null) {
            textView3.setText(nativeAd.f());
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        if (nativeAd.g() != null) {
            textView.setText(nativeAd.g());
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        nativeAdView.setNativeAd(nativeAd);
        frameLayout.removeAllViews();
        frameLayout.addView(nativeAdView);
    }

    public void i(Activity activity) {
        if (C2723Dd.O() >= 1) {
            j(activity);
        }
        if (C2723Dd.O() >= 2) {
            k(activity);
        }
        if (C2723Dd.O() >= 3) {
            l(activity);
        }
        if (C2723Dd.O() >= 4) {
            m(activity);
        }
        if (C2723Dd.O() >= 5) {
            n(activity);
        }
    }

    public void j(Activity activity) {
        c(activity, 1);
    }

    public void k(Activity activity) {
        c(activity, 2);
    }

    public void l(Activity activity) {
        c(activity, 3);
    }

    public void m(Activity activity) {
        c(activity, 4);
    }

    public void n(Activity activity) {
        c(activity, 5);
    }

    public final void o(Activity activity, ShimmerFrameLayout shimmerFrameLayout, View view, FrameLayout frameLayout, int i) {
        NativeAd nativeAd;
        if (i == 1) {
            nativeAd = c.a;
        } else if (i == 2) {
            nativeAd = c.b;
        } else if (i == 4) {
            nativeAd = c.d;
        } else if (i == 5) {
            nativeAd = c.e;
        } else {
            nativeAd = c.c;
        }
        if (nativeAd != null) {
            shimmerFrameLayout.h();
            shimmerFrameLayout.setVisibility(8);
            view.setVisibility(0);
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (i == 1) {
                d(activity, nativeAd, frameLayout);
                c.a = null;
                j(activity);
                return;
            } else if (i == 2) {
                e(activity, nativeAd, frameLayout);
                c.b = null;
                k(activity);
                return;
            } else if (i == 4) {
                g(activity, nativeAd, frameLayout);
                c.d = null;
                m(activity);
                return;
            } else if (i == 5) {
                h(activity, nativeAd, frameLayout);
                c.e = null;
                n(activity);
                return;
            } else {
                f(activity, nativeAd, frameLayout);
                c.c = null;
                l(activity);
                return;
            }
        }
        if (C2723Dd.m() && C2723Dd.r()) {
            shimmerFrameLayout.h();
            shimmerFrameLayout.setVisibility(8);
            view.setVisibility(0);
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            AL1.d(activity, frameLayout);
        } else {
            shimmerFrameLayout.setVisibility(8);
            shimmerFrameLayout.g();
            view.setVisibility(8);
        }
        if (i == 1) {
            c.a = null;
            j(activity);
        }
        if (i == 2) {
            c.b = null;
            k(activity);
        }
        if (i == 4) {
            c.d = null;
            m(activity);
        }
        if (i == 5) {
            c.e = null;
            n(activity);
        }
        if (i == 3) {
            c.c = null;
            l(activity);
        }
    }

    public void p(Activity activity, ShimmerFrameLayout shimmerFrameLayout, View view, FrameLayout frameLayout) {
        if (C2723Dd.O() >= 1) {
            o(activity, shimmerFrameLayout, view, frameLayout, 1);
            return;
        }
        shimmerFrameLayout.h();
        shimmerFrameLayout.setVisibility(8);
        view.setVisibility(8);
        frameLayout.setVisibility(8);
    }

    public void q(Activity activity, ShimmerFrameLayout shimmerFrameLayout, View view, FrameLayout frameLayout) {
        if (C2723Dd.O() >= 2) {
            o(activity, shimmerFrameLayout, view, frameLayout, 2);
            return;
        }
        shimmerFrameLayout.h();
        shimmerFrameLayout.setVisibility(8);
        view.setVisibility(8);
        frameLayout.setVisibility(8);
    }

    public void r(Activity activity, ShimmerFrameLayout shimmerFrameLayout, View view, FrameLayout frameLayout) {
        if (C2723Dd.O() >= 3) {
            o(activity, shimmerFrameLayout, view, frameLayout, 3);
            return;
        }
        shimmerFrameLayout.h();
        shimmerFrameLayout.setVisibility(8);
        view.setVisibility(8);
        frameLayout.setVisibility(8);
    }

    public void s(Activity activity, ShimmerFrameLayout shimmerFrameLayout, View view, FrameLayout frameLayout) {
        if (C2723Dd.O() >= 4) {
            o(activity, shimmerFrameLayout, view, frameLayout, 4);
            return;
        }
        shimmerFrameLayout.h();
        shimmerFrameLayout.setVisibility(8);
        view.setVisibility(8);
        frameLayout.setVisibility(8);
    }

    public void t(Activity activity, ShimmerFrameLayout shimmerFrameLayout, View view, FrameLayout frameLayout) {
        if (C2723Dd.O() >= 5) {
            o(activity, shimmerFrameLayout, view, frameLayout, 5);
            return;
        }
        shimmerFrameLayout.h();
        shimmerFrameLayout.setVisibility(8);
        view.setVisibility(8);
        frameLayout.setVisibility(8);
    }
}
