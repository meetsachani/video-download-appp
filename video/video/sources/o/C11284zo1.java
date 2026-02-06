package o;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.facebook.C0376a;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hdhub.xdownload.anyvideo.bestdownloader.MyApplication;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.zo1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11284zo1 {
    public static Activity a;
    public static NativeAd f;
    public static com.google.android.gms.ads.nativead.NativeAd g;
    public static NativeAdLayout h;
    public static NativeAdListener i;
    public static Boolean b = Boolean.TRUE;
    public static int c = 0;
    public static boolean d = true;
    public static String e = "";
    public static int j = 0;
    public static boolean k = false;
    public static boolean l = false;
    public static int m = 0;
    public static int n = 0;

    /* renamed from: o.zo1$a */
    /* loaded from: classes3.dex */
    public class a implements NativeAd.OnNativeAdLoadedListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ LinearLayout c;
        public final /* synthetic */ LinearLayout d;

        /* renamed from: o.zo1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0362a implements OnPaidEventListener {
            public final /* synthetic */ FirebaseAnalytics a;

            public C0362a(FirebaseAnalytics firebaseAnalytics) {
                this.a = firebaseAnalytics;
            }

            @Override // com.google.android.gms.ads.OnPaidEventListener
            public void a(AdValue adValue) {
                String a = adValue.a();
                Bundle bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.c, "Google Ad Manager");
                bundle.putString(FirebaseAnalytics.Param.i, a);
                bundle.putDouble("value", adValue.c() / 1000000.0d);
                this.a.c(FirebaseAnalytics.Event.a, bundle);
            }
        }

        public a(Activity activity, boolean z, LinearLayout linearLayout, LinearLayout linearLayout2) {
            this.a = activity;
            this.b = z;
            this.c = linearLayout;
            this.d = linearLayout2;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void a(com.google.android.gms.ads.nativead.NativeAd nativeAd) {
            NativeAdView nativeAdView;
            Log.d("NativeCHECK", "onNativeAdLoaded: ");
            nativeAd.z(new C0362a(FirebaseAnalytics.getInstance(this.a)));
            C11284zo1.d = true;
            if (C11284zo1.g != null) {
                C11284zo1.g = null;
            }
            C11284zo1.g = nativeAd;
            C11284zo1.j = 0;
            if (C2723Dd.P().equals("Load") && C11284zo1.g != null) {
                LayoutInflater layoutInflater = (LayoutInflater) this.a.getSystemService("layout_inflater");
                if (this.b) {
                    nativeAdView = (NativeAdView) layoutInflater.inflate(R.layout.admob_big_native_full_ad, (ViewGroup) null);
                } else {
                    nativeAdView = (NativeAdView) layoutInflater.inflate(R.layout.admob_native_custom_ad, (ViewGroup) null);
                }
                this.c.setVisibility(8);
                this.d.setVisibility(0);
                C11284zo1.j(C11284zo1.g, nativeAdView, this.b);
                this.d.removeAllViews();
                this.d.addView(nativeAdView);
                J7.b.put(Integer.valueOf(J7.a), nativeAdView);
            }
        }
    }

    /* renamed from: o.zo1$b */
    /* loaded from: classes3.dex */
    public class b extends AdListener {
        public final /* synthetic */ Activity X;
        public final /* synthetic */ LinearLayout Y;
        public final /* synthetic */ boolean Y0;
        public final /* synthetic */ LinearLayout Z;

        public b(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2, boolean z) {
            this.X = activity;
            this.Y = linearLayout;
            this.Z = linearLayout2;
            this.Y0 = z;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void g(LoadAdError loadAdError) {
            Log.d("NativeCHECK", "onAdFailedToLoad: " + loadAdError.d());
            if (C11284zo1.g != null) {
                C11284zo1.g = null;
            }
            C11284zo1.a(this.X, this.Y, this.Z, this.Y0);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void y() {
            MyApplication.Y0 = false;
        }
    }

    /* renamed from: o.zo1$d */
    /* loaded from: classes3.dex */
    public class d extends VideoController.VideoLifecycleCallbacks {
        @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
        public void a() {
            super.a();
        }
    }

    public static void a(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2, boolean z) {
        i();
        if (!k) {
            d = true;
            if (!C2723Dd.k().equals(C0376a.m1)) {
                d(activity, linearLayout, linearLayout2, z);
                return;
            } else if (C2723Dd.P().equals("Load")) {
                if (C2723Dd.m() && C2723Dd.r()) {
                    linearLayout.setVisibility(0);
                    linearLayout2.setVisibility(8);
                    AL1.f(activity, linearLayout, z);
                    return;
                }
                linearLayout.setVisibility(8);
                linearLayout2.setVisibility(8);
                return;
            } else {
                return;
            }
        }
        e = "";
        String f2 = C2723Dd.f();
        e = f2;
        new AdLoader.Builder(activity, f2).d(new a(activity, z, linearLayout2, linearLayout)).e(new b(activity, linearLayout, linearLayout2, z)).a().b(new AdRequest.Builder().p());
    }

    public static void b(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2, boolean z) {
        LinearLayout linearLayout3;
        NativeAdView nativeAdView;
        if (C2723Dd.P().equals("Load")) {
            if (d) {
                d = false;
                a(activity, linearLayout, linearLayout2, z);
                return;
            }
            return;
        }
        if (g != null) {
            LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService("layout_inflater");
            if (z) {
                nativeAdView = (NativeAdView) layoutInflater.inflate(R.layout.admob_big_native_full_ad, (ViewGroup) null);
            } else {
                nativeAdView = (NativeAdView) layoutInflater.inflate(R.layout.admob_native_custom_ad, (ViewGroup) null);
            }
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            j(g, nativeAdView, z);
            linearLayout.removeAllViews();
            linearLayout.addView(nativeAdView);
            J7.b.put(Integer.valueOf(J7.a), nativeAdView);
        } else {
            com.facebook.ads.NativeAd nativeAd = f;
            if (nativeAd != null && nativeAd.isAdLoaded()) {
                linearLayout.removeAllViews();
                LayoutInflater from = LayoutInflater.from(activity);
                if (z) {
                    linearLayout3 = (LinearLayout) from.inflate(R.layout.premium_adver_fb_native_full, (ViewGroup) h, false);
                } else {
                    linearLayout3 = (LinearLayout) from.inflate(R.layout.premium_adver_fb_native_custom, (ViewGroup) h, false);
                }
                linearLayout.addView(linearLayout3);
                J7.b.put(Integer.valueOf(J7.a), linearLayout3);
                g(activity, f, linearLayout, linearLayout2, linearLayout3);
            } else if (C2723Dd.m() && C2723Dd.r()) {
                linearLayout.setVisibility(0);
                linearLayout2.setVisibility(8);
                AL1.f(activity, linearLayout, z);
            } else {
                linearLayout.setVisibility(8);
                linearLayout2.setVisibility(8);
            }
        }
        if (d) {
            d = false;
            a(activity, linearLayout, linearLayout2, z);
        }
    }

    public static void c(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2, Boolean bool) {
        b = bool;
        a = activity;
        j = 0;
        if (c == C2723Dd.V()) {
            c = 0;
            if (C2723Dd.W()) {
                int s = C2723Dd.s();
                if (s % 2 == 0) {
                    if (C2723Dd.k().equals(C0376a.m1)) {
                        f(activity, linearLayout, linearLayout2, bool.booleanValue());
                    } else {
                        b(activity, linearLayout, linearLayout2, bool.booleanValue());
                    }
                } else if (C2723Dd.m() && C2723Dd.r()) {
                    linearLayout.setVisibility(0);
                    linearLayout2.setVisibility(8);
                    AL1.f(activity, linearLayout, bool.booleanValue());
                } else {
                    linearLayout.setVisibility(8);
                    linearLayout2.setVisibility(8);
                }
                C2723Dd.P0(s + 1);
                return;
            } else if (C2723Dd.k().equals(C0376a.m1)) {
                f(activity, linearLayout, linearLayout2, bool.booleanValue());
                return;
            } else {
                b(activity, linearLayout, linearLayout2, bool.booleanValue());
                return;
            }
        }
        c++;
        linearLayout2.setVisibility(8);
        linearLayout.setVisibility(8);
    }

    public static void d(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2, boolean z) {
        e();
        if (!l) {
            if (C2723Dd.k().equals(C0376a.m1)) {
                a(activity, linearLayout, linearLayout2, z);
                return;
            } else if (C2723Dd.P().equals("Load")) {
                if (C2723Dd.m() && C2723Dd.r()) {
                    linearLayout.setVisibility(0);
                    linearLayout2.setVisibility(8);
                    AL1.f(activity, linearLayout, z);
                    return;
                }
                linearLayout.setVisibility(8);
                linearLayout2.setVisibility(8);
                return;
            } else {
                return;
            }
        }
        f = new com.facebook.ads.NativeAd(activity, C2723Dd.E());
        i = new c(activity, linearLayout, linearLayout2, z);
        if (!f.isAdLoaded()) {
            com.facebook.ads.NativeAd nativeAd = f;
            nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(i).build());
        }
    }

    public static void e() {
        try {
            if (C2723Dd.u0() != null && C2723Dd.u0().size() != 0 && C2723Dd.u0().size() != m) {
                l = true;
                C2723Dd.b1(C2723Dd.u0().get(m));
                m++;
                return;
            }
            m = 0;
            l = false;
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static void f(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2, boolean z) {
        NativeAdView nativeAdView;
        LinearLayout linearLayout3;
        if (C2723Dd.P().equals("Load")) {
            d(activity, linearLayout, linearLayout2, z);
            return;
        }
        com.facebook.ads.NativeAd nativeAd = f;
        if (nativeAd != null && nativeAd.isAdLoaded()) {
            linearLayout.removeAllViews();
            LayoutInflater from = LayoutInflater.from(activity);
            if (z) {
                linearLayout3 = (LinearLayout) from.inflate(R.layout.premium_adver_fb_native_full, (ViewGroup) h, false);
            } else {
                linearLayout3 = (LinearLayout) from.inflate(R.layout.premium_adver_fb_native_custom, (ViewGroup) h, false);
            }
            linearLayout.addView(linearLayout3);
            J7.b.put(Integer.valueOf(J7.a), linearLayout3);
            g(activity, f, linearLayout, linearLayout2, linearLayout3);
        } else if (g != null) {
            LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService("layout_inflater");
            if (z) {
                nativeAdView = (NativeAdView) layoutInflater.inflate(R.layout.admob_big_native_full_ad, (ViewGroup) null);
            } else {
                nativeAdView = (NativeAdView) layoutInflater.inflate(R.layout.admob_native_custom_ad, (ViewGroup) null);
            }
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            j(g, nativeAdView, z);
            linearLayout.removeAllViews();
            linearLayout.addView(nativeAdView);
            J7.b.put(Integer.valueOf(J7.a), nativeAdView);
        } else if (C2723Dd.m() && C2723Dd.r()) {
            linearLayout.setVisibility(8);
            linearLayout2.setVisibility(0);
            AL1.f(activity, linearLayout2, z);
        } else {
            linearLayout.setVisibility(8);
            linearLayout2.setVisibility(8);
        }
        d(activity, linearLayout, linearLayout2, z);
    }

    public static void g(Activity activity, com.facebook.ads.NativeAd nativeAd, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        linearLayout2.setVisibility(8);
        int i2 = 0;
        linearLayout.setVisibility(0);
        nativeAd.unregisterView();
        LinearLayout linearLayout4 = (LinearLayout) linearLayout3.findViewById(R.id.ad_choices_container);
        AdOptionsView adOptionsView = new AdOptionsView(activity, nativeAd, h);
        linearLayout4.removeAllViews();
        linearLayout4.addView(adOptionsView, 0);
        MediaView mediaView = (MediaView) linearLayout3.findViewById(R.id.native_ad_icon);
        TextView textView = (TextView) linearLayout3.findViewById(R.id.native_ad_title);
        MediaView mediaView2 = (MediaView) linearLayout3.findViewById(R.id.native_ad_media);
        TextView textView2 = (TextView) linearLayout3.findViewById(R.id.native_ad_social_context);
        TextView textView3 = (TextView) linearLayout3.findViewById(R.id.native_ad_body);
        TextView textView4 = (TextView) linearLayout3.findViewById(R.id.native_ad_sponsored_label);
        TextView textView5 = (TextView) linearLayout3.findViewById(R.id.native_ad_call_to_action);
        LinearLayout linearLayout5 = (LinearLayout) linearLayout3.findViewById(R.id.native_bg);
        try {
            if (C2723Dd.Q()) {
                linearLayout5.setBackground(activity.getResources().getDrawable(R.drawable.native_border_bg));
            } else {
                linearLayout5.setBackground(activity.getResources().getDrawable(R.drawable.fb_ad_bg));
            }
            textView.setText(nativeAd.getAdvertiserName());
            textView3.setText(nativeAd.getAdBodyText());
            textView2.setText(nativeAd.getAdSocialContext());
            if (!nativeAd.hasCallToAction()) {
                i2 = 4;
            }
            textView5.setVisibility(i2);
            textView5.setText(nativeAd.getAdCallToAction());
            textView4.setText(nativeAd.getSponsoredTranslation());
            List<View> arrayList = new ArrayList<>();
            arrayList.add(textView);
            arrayList.add(textView5);
            nativeAd.registerViewForInteraction(linearLayout3, mediaView2, mediaView, arrayList);
        } catch (Resources.NotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String h() {
        String str = C2723Dd.T().get(n);
        if (n >= C2723Dd.T().size() - 1) {
            n = 0;
            return str;
        }
        n++;
        return str;
    }

    public static void i() {
        try {
            if (C2723Dd.r0() != null && C2723Dd.r0().size() != 0 && C2723Dd.r0().size() != j) {
                k = true;
                C2723Dd.C0(C2723Dd.r0().get(j));
                j++;
                return;
            }
            k = false;
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static void j(com.google.android.gms.ads.nativead.NativeAd nativeAd, NativeAdView nativeAdView, boolean z) {
        com.google.android.gms.ads.nativead.MediaView mediaView = (com.google.android.gms.ads.nativead.MediaView) nativeAdView.findViewById(R.id.ad_media);
        nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.ad_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(R.id.ad_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.ad_call_to_action));
        nativeAdView.setIconView(nativeAdView.findViewById(R.id.ad_app_icon));
        nativeAdView.setPriceView(nativeAdView.findViewById(R.id.ad_price));
        nativeAdView.setStarRatingView(nativeAdView.findViewById(R.id.ad_stars));
        nativeAdView.setStoreView(nativeAdView.findViewById(R.id.ad_store));
        nativeAdView.setAdvertiserView(nativeAdView.findViewById(R.id.ad_advertiser));
        ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.i());
        ImageView imageView = (ImageView) nativeAdView.findViewById(R.id.custom_image);
        if (C2723Dd.J()) {
            if (C2723Dd.U()) {
                imageView.setVisibility(0);
                mediaView.setVisibility(8);
                com.bumptech.glide.a.D(a).r(h()).C1(imageView);
            } else {
                imageView.setVisibility(8);
                mediaView.setVisibility(0);
                nativeAdView.setMediaView(mediaView);
                nativeAdView.getMediaView().setMediaContent(nativeAd.l());
            }
        } else {
            imageView.setVisibility(8);
            mediaView.setVisibility(0);
            nativeAdView.setMediaView(mediaView);
            nativeAdView.getMediaView().setMediaContent(nativeAd.l());
        }
        try {
            if (C2723Dd.Q()) {
                nativeAdView.findViewById(R.id.native_bg).setBackground(a.getResources().getDrawable(R.drawable.native_border_bg));
            } else {
                nativeAdView.findViewById(R.id.native_bg).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.g())));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            ((TextView) nativeAdView.findViewById(R.id.ad_body)).setTextColor(Color.parseColor(C2723Dd.M()));
            ((TextView) nativeAdView.findViewById(R.id.ad_headline)).setTextColor(Color.parseColor(C2723Dd.M()));
            nativeAdView.findViewById(R.id.ad_text).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
            ((TextView) nativeAdView.findViewById(R.id.ad_text)).setTextColor(Color.parseColor(C2723Dd.R()));
            nativeAdView.getCallToActionView().setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
            ((TextView) nativeAdView.getCallToActionView()).setTextColor(Color.parseColor(C2723Dd.R()));
        } catch (NullPointerException e3) {
            e3.printStackTrace();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        if (nativeAd.f() == null) {
            nativeAdView.getBodyView().setVisibility(4);
        } else {
            nativeAdView.getBodyView().setVisibility(0);
            ((TextView) nativeAdView.getBodyView()).setText(nativeAd.f());
        }
        if (nativeAd.g() == null) {
            nativeAdView.getCallToActionView().setVisibility(4);
        } else {
            nativeAdView.getCallToActionView().setVisibility(0);
            ((TextView) nativeAdView.getCallToActionView()).setText(nativeAd.g());
        }
        if (z) {
            if (nativeAd.j() == null) {
                nativeAdView.getIconView().setVisibility(8);
            } else {
                ((ImageView) nativeAdView.getIconView()).setImageDrawable(nativeAd.j().a());
                nativeAdView.getIconView().setVisibility(0);
            }
        } else {
            nativeAdView.getIconView().setVisibility(8);
        }
        if (nativeAd.n() == null) {
            nativeAdView.getPriceView().setVisibility(8);
        } else {
            nativeAdView.getPriceView().setVisibility(0);
            ((TextView) nativeAdView.getPriceView()).setText(nativeAd.n());
        }
        if (nativeAd.q() == null) {
            nativeAdView.getStoreView().setVisibility(4);
        } else {
            nativeAdView.getStoreView().setVisibility(0);
            ((TextView) nativeAdView.getStoreView()).setText(nativeAd.q());
        }
        if (nativeAd.p() != null) {
            ((RatingBar) nativeAdView.getStarRatingView()).setRating(nativeAd.p().floatValue());
            if (z) {
                nativeAdView.getStarRatingView().setVisibility(8);
            } else {
                nativeAdView.getStarRatingView().setVisibility(0);
            }
        } else if (z) {
            nativeAdView.getStarRatingView().setVisibility(8);
        } else {
            nativeAdView.getStarRatingView().setVisibility(8);
        }
        if (nativeAd.e() != null) {
            ((TextView) nativeAdView.getAdvertiserView()).setText(nativeAd.e());
            if (z) {
                nativeAdView.getAdvertiserView().setVisibility(8);
            } else {
                nativeAdView.getAdvertiserView().setVisibility(0);
            }
        } else if (z) {
            nativeAdView.getAdvertiserView().setVisibility(8);
        } else {
            nativeAdView.getAdvertiserView().setVisibility(8);
        }
        nativeAdView.setNativeAd(nativeAd);
        if (nativeAd.l().c()) {
            nativeAd.l().getVideoController().j(new d());
        } else {
            mediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    /* renamed from: o.zo1$c */
    /* loaded from: classes3.dex */
    public class c implements NativeAdListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ LinearLayout b;
        public final /* synthetic */ LinearLayout c;
        public final /* synthetic */ boolean d;

        public c(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2, boolean z) {
            this.a = activity;
            this.b = linearLayout;
            this.c = linearLayout2;
            this.d = z;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(com.facebook.ads.Ad ad) {
            I7.h(Boolean.FALSE);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(com.facebook.ads.Ad ad) {
            com.facebook.ads.NativeAd nativeAd;
            LinearLayout linearLayout;
            Log.d("SHOWADSID", "FBonAdLoaded: ");
            C11284zo1.m = 0;
            if (C2723Dd.P().equals("Load") && (nativeAd = C11284zo1.f) != null && nativeAd.isAdLoaded()) {
                this.b.removeAllViews();
                LayoutInflater from = LayoutInflater.from(this.a);
                if (this.d) {
                    linearLayout = (LinearLayout) from.inflate(R.layout.premium_adver_fb_native_full, (ViewGroup) C11284zo1.h, false);
                } else {
                    linearLayout = (LinearLayout) from.inflate(R.layout.premium_adver_fb_native_custom, (ViewGroup) C11284zo1.h, false);
                }
                this.b.addView(linearLayout);
                J7.b.put(Integer.valueOf(J7.a), linearLayout);
                C11284zo1.g(this.a, C11284zo1.f, this.b, this.c, linearLayout);
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onError(com.facebook.ads.Ad ad, AdError adError) {
            Log.d("SHOWADSID", "FBonError: " + adError.getErrorMessage());
            C11284zo1.d(this.a, this.b, this.c, this.d);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(com.facebook.ads.Ad ad) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(com.facebook.ads.Ad ad) {
        }
    }
}
