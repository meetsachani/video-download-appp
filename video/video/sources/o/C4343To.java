package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.C0376a;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
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

/* renamed from: o.To  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4343To {
    public static Activity a = null;
    public static LinearLayout b = null;
    public static NativeAd c = null;
    public static String d = "";
    public static AdView e = null;
    public static int f = 0;
    public static boolean g = false;
    public static int h = 0;
    public static boolean i = false;
    public static boolean j = false;
    public static int k;
    public static NativeAdLayout l;
    public static NativeBannerAd m;
    public static int n;

    /* renamed from: o.To$a */
    /* loaded from: classes3.dex */
    public class a implements NativeAd.OnNativeAdLoadedListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ LinearLayout b;
        public final /* synthetic */ LinearLayout c;

        /* renamed from: o.To$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0230a implements OnPaidEventListener {
            public final /* synthetic */ FirebaseAnalytics a;

            public C0230a(FirebaseAnalytics firebaseAnalytics) {
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

        public a(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2) {
            this.a = activity;
            this.b = linearLayout;
            this.c = linearLayout2;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void a(NativeAd nativeAd) {
            Log.d("ArrayListId_bottom121", "admob Native ad to load ");
            nativeAd.z(new C0230a(FirebaseAnalytics.getInstance(this.a)));
            if (C4343To.c != null) {
                C4343To.c = null;
            }
            C4343To.c = nativeAd;
            if (C2723Dd.t().equals("Load") && C4343To.c != null) {
                NativeAdView nativeAdView = (NativeAdView) ((LayoutInflater) this.a.getSystemService("layout_inflater")).inflate(R.layout.admob_adver_nativebottom_banner_white, (ViewGroup) null);
                this.b.setVisibility(8);
                this.c.setVisibility(0);
                C4343To.n(C4343To.c, nativeAdView, false);
                Log.e("NativeFull_Show", "admob Native ad show : ");
                this.c.removeAllViews();
                this.c.addView(nativeAdView);
            }
        }
    }

    /* renamed from: o.To$b */
    /* loaded from: classes3.dex */
    public class b extends AdListener {
        public final /* synthetic */ Activity X;
        public final /* synthetic */ LinearLayout Y;
        public final /* synthetic */ LinearLayout Z;

        public b(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2) {
            this.X = activity;
            this.Y = linearLayout;
            this.Z = linearLayout2;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void g(LoadAdError loadAdError) {
            Log.e("ArrayListId_bottom121", "admob Native ad failed to load: " + loadAdError.d());
            if (C4343To.c != null) {
                C4343To.c = null;
            }
            C4343To.b(this.X, this.Y, this.Z);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void y() {
            I7.h(Boolean.TRUE);
            MyApplication.Y0 = false;
        }
    }

    /* renamed from: o.To$d */
    /* loaded from: classes3.dex */
    public class d extends VideoController.VideoLifecycleCallbacks {
        @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
        public void a() {
            super.a();
        }
    }

    public static void b(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2) {
        k();
        if (!g) {
            if (!C2723Dd.k().equals(C0376a.m1)) {
                h(activity, linearLayout, linearLayout2);
                return;
            } else if (C2723Dd.t().equals("Load")) {
                if (C2723Dd.m() && C2723Dd.h0()) {
                    linearLayout2.setVisibility(8);
                    linearLayout.setVisibility(0);
                    AL1.b(activity, linearLayout);
                    return;
                }
                linearLayout.setVisibility(8);
                linearLayout2.setVisibility(8);
                return;
            } else {
                return;
            }
        }
        d = "";
        String h2 = C2723Dd.h();
        d = h2;
        AdLoader a2 = new AdLoader.Builder(activity, h2).d(new a(activity, linearLayout2, linearLayout)).e(new b(activity, linearLayout, linearLayout2)).a();
        Log.e("ArrayListId_bottom", "admob Native ad to loading: ");
        a2.b(new AdRequest.Builder().p());
    }

    public static void c(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2) {
        d();
        if (!i) {
            if (!C2723Dd.k().equals(C0376a.m1)) {
                h(activity, linearLayout, linearLayout2);
                return;
            }
            linearLayout.setVisibility(8);
            linearLayout2.setVisibility(8);
            return;
        }
        Log.d("DHUHUSH", "Admob_banner_show: " + C2723Dd.d());
        AdView adView = new AdView(activity);
        e = adView;
        adView.setAdUnitId(C2723Dd.d());
        e.setAdSize(l(activity));
        linearLayout.removeAllViews();
        linearLayout.addView(e);
        if (C2723Dd.x()) {
            Bundle bundle = new Bundle();
            bundle.putString("collapsible", "bottom");
            e.d(new AdRequest.Builder().e(AdMobAdapter.class, bundle).p());
        } else {
            e.d(new AdRequest.Builder().p());
        }
        e.setAdListener(new e(linearLayout, linearLayout2, activity));
    }

    public static void d() {
        try {
            Log.d("ArrayListId_bottom", " false Utill pos  = " + h);
            if (C2723Dd.o0() != null && C2723Dd.o0().size() != 0 && C2723Dd.o0().size() != h) {
                i = true;
                Log.d("ArrayListId_bottom", " false Utill pos array id = " + C2723Dd.o0().get(h));
                C2723Dd.A0(C2723Dd.o0().get(h));
                h = h + 1;
                return;
            }
            i = false;
            Log.d("ArrayListId_bottom", "Utill pos array id null");
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static void e(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2) {
        if (c != null) {
            NativeAdView nativeAdView = (NativeAdView) ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.admob_adver_nativebottom_banner_white, (ViewGroup) null);
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            n(c, nativeAdView, false);
            Log.e("NativeFull_Show", "admob Native ad show : ");
            linearLayout.removeAllViews();
            linearLayout.addView(nativeAdView);
        } else {
            NativeBannerAd nativeBannerAd = m;
            if (nativeBannerAd != null && nativeBannerAd.isAdLoaded()) {
                Log.d("NativeFull_Show", "fb loaded ");
                linearLayout.setVisibility(0);
                linearLayout2.setVisibility(8);
                linearLayout.removeAllViews();
                m(m, activity, linearLayout);
            } else if (C2723Dd.m() && C2723Dd.h0()) {
                linearLayout2.setVisibility(8);
                linearLayout.setVisibility(0);
                AL1.b(activity, linearLayout);
            } else {
                linearLayout.setVisibility(8);
                linearLayout2.setVisibility(8);
            }
        }
        b(activity, linearLayout, linearLayout2);
    }

    public static void f(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2) {
        NativeBannerAd nativeBannerAd = m;
        if (nativeBannerAd != null && nativeBannerAd.isAdLoaded()) {
            Log.d("NativeFull_Show", "fb loaded ");
            linearLayout.setVisibility(0);
            linearLayout2.setVisibility(8);
            linearLayout.removeAllViews();
            m(m, activity, linearLayout);
        } else if (c != null) {
            if (C2723Dd.p0() != null && C2723Dd.p0().size() != 0) {
                Log.d("NativeFull_Show1_bottom", "admobNativeIds_array size " + C2723Dd.p0().size());
            }
            NativeAdView nativeAdView = (NativeAdView) ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.admob_adver_nativebottom_banner_white, (ViewGroup) null);
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            n(c, nativeAdView, false);
            Log.e("NativeFull_Show", "admob Native ad show : ");
            linearLayout.removeAllViews();
            linearLayout.addView(nativeAdView);
        } else if (C2723Dd.m() && C2723Dd.h0()) {
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            AL1.b(activity, linearLayout);
        } else {
            linearLayout.setVisibility(8);
            linearLayout2.setVisibility(8);
        }
        h(activity, linearLayout, linearLayout2);
    }

    public static void g() {
        try {
            if (C2723Dd.t0() != null && C2723Dd.t0().size() != 0 && C2723Dd.t0().size() != k) {
                j = true;
                C2723Dd.a1(C2723Dd.t0().get(k));
                k++;
                return;
            }
            k = 0;
            j = false;
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static void h(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2) {
        g();
        if (!j) {
            if (C2723Dd.k().equals(C0376a.m1)) {
                b(activity, linearLayout, linearLayout2);
                return;
            } else if (C2723Dd.t().equals("Load")) {
                if (C2723Dd.m() && C2723Dd.h0()) {
                    linearLayout2.setVisibility(8);
                    linearLayout.setVisibility(0);
                    AL1.b(activity, linearLayout);
                    return;
                }
                linearLayout.setVisibility(8);
                linearLayout2.setVisibility(8);
                return;
            } else {
                return;
            }
        }
        m = new NativeBannerAd(activity, C2723Dd.D());
        c cVar = new c(activity, linearLayout, linearLayout2);
        NativeBannerAd nativeBannerAd = m;
        nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(cVar).build());
    }

    public static String i() {
        String str = C2723Dd.T().get(n);
        if (n >= C2723Dd.T().size() - 1) {
            n = 0;
            return str;
        }
        n++;
        return str;
    }

    public static void j(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2) {
        a = activity;
        f = 0;
        h = 0;
        if (C2723Dd.W()) {
            int x0 = C2723Dd.x0();
            if (x0 % 2 == 0) {
                if (C2723Dd.k().equals(C0376a.m1)) {
                    if (C2723Dd.t().equals("Load")) {
                        h(activity, linearLayout, linearLayout2);
                    } else {
                        f(activity, linearLayout, linearLayout2);
                    }
                } else if (C2723Dd.u().equals("banner")) {
                    Log.d("NativeFull_Show", "banner= ");
                    linearLayout2.setVisibility(0);
                    c(activity, linearLayout, linearLayout2);
                } else if (C2723Dd.t().equals("Load")) {
                    b(activity, linearLayout, linearLayout2);
                } else {
                    e(activity, linearLayout, linearLayout2);
                }
            } else if (C2723Dd.m() && C2723Dd.h0()) {
                linearLayout2.setVisibility(8);
                linearLayout.setVisibility(0);
                AL1.b(activity, linearLayout);
            } else {
                linearLayout.setVisibility(8);
                linearLayout2.setVisibility(8);
            }
            C2723Dd.U1(x0 + 1);
        } else if (C2723Dd.k().equals(C0376a.m1)) {
            if (C2723Dd.t().equals("Load")) {
                h(activity, linearLayout, linearLayout2);
            } else {
                f(activity, linearLayout, linearLayout2);
            }
        } else if (C2723Dd.u().equals("banner")) {
            Log.d("NativeFull_Show", "banner= ");
            linearLayout2.setVisibility(0);
            c(activity, linearLayout, linearLayout2);
        } else if (C2723Dd.t().equals("Load")) {
            b(activity, linearLayout, linearLayout2);
        } else {
            e(activity, linearLayout, linearLayout2);
        }
    }

    public static void k() {
        try {
            Log.d("ArrayListId_bottom", " false Utill pos  = " + f);
            if (C2723Dd.p0() != null && C2723Dd.p0().size() != 0 && C2723Dd.p0().size() != f) {
                g = true;
                Log.d("ArrayListId_bottom", " false Utill pos array id = " + C2723Dd.p0().get(f));
                C2723Dd.E0(C2723Dd.p0().get(f));
                f = f + 1;
                return;
            }
            g = false;
            Log.d("ArrayListId_bottom", "Utill pos array id null");
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static AdSize l(Activity activity) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return AdSize.a(activity, (int) (displayMetrics.widthPixels / displayMetrics.density));
    }

    public static void m(NativeBannerAd nativeBannerAd, Context context, LinearLayout linearLayout) {
        nativeBannerAd.unregisterView();
        int i2 = 0;
        LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.premium_adver_fb_native_banner_bottom, (ViewGroup) l, false);
        b = linearLayout2;
        RelativeLayout relativeLayout = (RelativeLayout) linearLayout2.findViewById(R.id.ad_choices_container);
        AdOptionsView adOptionsView = new AdOptionsView(context, nativeBannerAd, l);
        relativeLayout.removeAllViews();
        relativeLayout.addView(adOptionsView, 0);
        TextView textView = (TextView) b.findViewById(R.id.native_ad_title);
        TextView textView2 = (TextView) b.findViewById(R.id.native_ad_social_context);
        TextView textView3 = (TextView) b.findViewById(R.id.native_ad_sponsored_label);
        MediaView mediaView = (MediaView) b.findViewById(R.id.native_icon_view);
        TextView textView4 = (TextView) b.findViewById(R.id.native_ad_call_to_action);
        textView4.setText(nativeBannerAd.getAdCallToAction());
        if (!nativeBannerAd.hasCallToAction()) {
            i2 = 4;
        }
        textView4.setVisibility(i2);
        textView.setText(nativeBannerAd.getAdvertiserName());
        textView2.setText(nativeBannerAd.getAdSocialContext());
        textView3.setText(nativeBannerAd.getSponsoredTranslation());
        List<View> arrayList = new ArrayList<>();
        arrayList.add(textView);
        arrayList.add(textView4);
        nativeBannerAd.registerViewForInteraction(b, mediaView, arrayList);
        linearLayout.addView(b);
    }

    public static void n(NativeAd nativeAd, NativeAdView nativeAdView, boolean z) {
        com.google.android.gms.ads.nativead.MediaView mediaView = (com.google.android.gms.ads.nativead.MediaView) nativeAdView.findViewById(R.id.ad_media);
        nativeAdView.setMediaView(mediaView);
        nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.ad_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(R.id.ad_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.ad_call_to_action));
        nativeAdView.setIconView(nativeAdView.findViewById(R.id.ad_app_icon));
        nativeAdView.setPriceView(nativeAdView.findViewById(R.id.ad_price));
        nativeAdView.setStarRatingView(nativeAdView.findViewById(R.id.ad_stars));
        nativeAdView.setStoreView(nativeAdView.findViewById(R.id.ad_store));
        nativeAdView.setAdvertiserView(nativeAdView.findViewById(R.id.ad_advertiser));
        ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.i());
        TextView textView = (TextView) nativeAdView.findViewById(R.id.ad_text);
        TextView textView2 = (TextView) nativeAdView.findViewById(R.id.ad_headline);
        TextView textView3 = (TextView) nativeAdView.findViewById(R.id.ad_body);
        ImageView imageView = (ImageView) nativeAdView.findViewById(R.id.custom_image);
        if (C2723Dd.J()) {
            if (C2723Dd.U()) {
                imageView.setVisibility(0);
                mediaView.setVisibility(8);
                com.bumptech.glide.a.D(a).r(i()).C1(imageView);
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
            textView2.setTextColor(Color.parseColor(C2723Dd.M()));
            textView3.setTextColor(Color.parseColor(C2723Dd.M()));
            nativeAdView.findViewById(R.id.native_bg).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.g())));
            nativeAdView.getCallToActionView().setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
            ((TextView) nativeAdView.getCallToActionView()).setTextColor(Color.parseColor(C2723Dd.R()));
            textView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
            textView.setTextColor(Color.parseColor(C2723Dd.R()));
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
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
        if (nativeAd.j() == null) {
            nativeAdView.getIconView().setVisibility(8);
        } else {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(nativeAd.j().a());
            nativeAdView.getIconView().setVisibility(0);
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

    /* renamed from: o.To$e */
    /* loaded from: classes3.dex */
    public class e extends AdListener {
        public final /* synthetic */ LinearLayout X;
        public final /* synthetic */ LinearLayout Y;
        public final /* synthetic */ Activity Z;

        public e(LinearLayout linearLayout, LinearLayout linearLayout2, Activity activity) {
            this.X = linearLayout;
            this.Y = linearLayout2;
            this.Z = activity;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void g(LoadAdError loadAdError) {
            Log.d("native_banner11", "onAdFailedToLoad = " + loadAdError.d());
            C4343To.c(this.Z, this.X, this.Y);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void k() {
            Log.d("native_banner11", "onAdLoaded = ");
            this.X.setVisibility(0);
            this.Y.setVisibility(8);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void y() {
            I7.h(Boolean.FALSE);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void e() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void n() {
        }
    }

    /* renamed from: o.To$c */
    /* loaded from: classes3.dex */
    public class c implements NativeAdListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ LinearLayout b;
        public final /* synthetic */ LinearLayout c;

        public c(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2) {
            this.a = activity;
            this.b = linearLayout;
            this.c = linearLayout2;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(com.facebook.ads.Ad ad) {
            I7.h(Boolean.TRUE);
            MyApplication.Y0 = false;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(com.facebook.ads.Ad ad) {
            Log.d("Facebook_Native_banner", "onAdLoaded: ");
            C4343To.k = 0;
            if (C2723Dd.t().equals("Load") && C4343To.m != null && C4343To.m.isAdLoaded()) {
                Log.d("NativeFull_Show", "fb loaded ");
                this.b.setVisibility(0);
                this.c.setVisibility(8);
                this.b.removeAllViews();
                C4343To.m(C4343To.m, this.a, this.b);
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onError(com.facebook.ads.Ad ad, AdError adError) {
            Log.d("Facebook_Native_banner", "onError: " + adError.getErrorMessage());
            C4343To.h(this.a, this.b, this.c);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(com.facebook.ads.Ad ad) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(com.facebook.ads.Ad ad) {
        }
    }
}
