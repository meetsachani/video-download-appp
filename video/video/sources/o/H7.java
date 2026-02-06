package o;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C0376a;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hdhub.xdownload.anyvideo.bestdownloader.MyApplication;

/* loaded from: classes3.dex */
public class H7 {
    public static int a = 0;
    public static boolean b = false;
    public static boolean c = false;
    public static InterstitialAd d;
    public static com.facebook.ads.InterstitialAd e;
    public static int f;
    public static Activity g;
    public static int h;
    public static C10643xA0 i;

    /* loaded from: classes3.dex */
    public class a extends InterstitialAdLoadCallback {
        public final /* synthetic */ Activity a;

        /* renamed from: o.H7$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0186a implements OnPaidEventListener {
            public final /* synthetic */ FirebaseAnalytics a;

            public C0186a(FirebaseAnalytics firebaseAnalytics) {
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

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void a(@InterfaceC5670cr1 LoadAdError loadAdError) {
            Log.d("AdRequest_t121", "onAdFailedToLoad = " + loadAdError.d());
            H7.d(this.a);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: c */
        public void b(@InterfaceC5670cr1 InterstitialAd interstitialAd) {
            Log.d("AdRequest_t121", "onAdLoaded== " + C2723Dd.H());
            I7.b = true;
            H7.d = interstitialAd;
            if (C2723Dd.H().equals("Load")) {
                H7.i.a();
                I7.h(Boolean.FALSE);
                H7.d.k(this.a);
            }
            H7.k();
            interstitialAd.j(new C0186a(FirebaseAnalytics.getInstance(this.a)));
        }
    }

    /* loaded from: classes3.dex */
    public class b implements InterstitialAdListener {
        public final /* synthetic */ Activity a;

        public b(Activity activity) {
            this.a = activity;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(com.facebook.ads.Ad ad) {
            I7.h(Boolean.TRUE);
            MyApplication.Y0 = true;
            Log.d("Interstitialad12", "fb Interstitial ad clicked!");
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(com.facebook.ads.Ad ad) {
            Log.d("Interstitialad12", "fb Interstitial ad is loaded and ready to be displayed!");
            H7.f = 0;
            if (C2723Dd.H().equals("Load")) {
                Log.d("ads_type12", "ads_type = 7");
                H7.i.a();
                H7.e.show();
                I7.h(Boolean.FALSE);
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onError(com.facebook.ads.Ad ad, AdError adError) {
            Log.d("Interstitialad12", "fb Interstitial ad is onError = " + adError.getErrorMessage());
            H7.h(this.a);
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDismissed(com.facebook.ads.Ad ad) {
            I7.h(Boolean.TRUE);
            I7.a.a(true);
            Log.d("Interstitialad12", "fb Interstitial ad dismissed.");
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDisplayed(com.facebook.ads.Ad ad) {
            Log.d("Interstitialad12", "fb Interstitial ad displayed.");
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(com.facebook.ads.Ad ad) {
            Log.d("Interstitialad12", "fb Interstitial ad impression logged!");
        }
    }

    public static void d(Activity activity) {
        if (C2723Dd.H().equals("Load")) {
            i.b("AD Loading...");
        }
        j();
        if (!b) {
            I7.b = true;
            if (C2723Dd.k().equals("admob")) {
                h(activity);
                return;
            } else if (C2723Dd.H().equals("Load")) {
                i.a();
                i(activity);
                return;
            } else {
                return;
            }
        }
        String c2 = C2723Dd.c();
        AdRequest p = new AdRequest.Builder().p();
        d = null;
        InterstitialAd.f(activity, c2, p, new a(activity));
    }

    public static void e(Activity activity) {
        g = activity;
        i = new C10643xA0(activity);
        if (C2723Dd.H().equals("Load")) {
            if (I7.b) {
                I7.b = false;
                d(activity);
                return;
            }
            return;
        }
        if (d != null) {
            I7.h(Boolean.FALSE);
            MyApplication.Y0 = false;
            d.k(activity);
        } else {
            com.facebook.ads.InterstitialAd interstitialAd = e;
            if (interstitialAd != null && interstitialAd.isAdLoaded()) {
                I7.h(Boolean.FALSE);
                e.show();
            } else {
                i(activity);
            }
        }
        if (I7.b) {
            I7.b = false;
            d(activity);
        }
    }

    public static void f(Activity activity) {
        if (C2723Dd.H().equals("Load")) {
            h(activity);
            return;
        }
        com.facebook.ads.InterstitialAd interstitialAd = e;
        if (interstitialAd != null && interstitialAd.isAdLoaded()) {
            I7.h(Boolean.FALSE);
            e.show();
        } else if (d != null) {
            I7.h(Boolean.FALSE);
            d.k(activity);
        } else {
            i(activity);
        }
        h(activity);
    }

    public static void g() {
        try {
            if (C2723Dd.s0() != null && C2723Dd.s0().size() != 0 && C2723Dd.s0().size() != f) {
                c = true;
                C2723Dd.Z0(C2723Dd.s0().get(f));
                f++;
                return;
            }
            f = 0;
            c = false;
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static void h(Activity activity) {
        if (C2723Dd.H().equals("Load")) {
            i.b("AD Loading...");
        }
        g();
        if (!c) {
            if (C2723Dd.k().equals(C0376a.m1)) {
                d(activity);
                return;
            } else if (C2723Dd.H().equals("Load")) {
                i.a();
                i(activity);
                return;
            } else {
                return;
            }
        }
        String C = C2723Dd.C();
        e = null;
        e = new com.facebook.ads.InterstitialAd(activity, C);
        b bVar = new b(activity);
        com.facebook.ads.InterstitialAd interstitialAd = e;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(bVar).build());
    }

    public static void i(Activity activity) {
        if (C2723Dd.m()) {
            if (C2723Dd.c0()) {
                if (C2723Dd.I()) {
                    I7.h(Boolean.TRUE);
                    if (!C2723Dd.m0().isEmpty()) {
                        MyApplication.Y0 = true;
                    } else {
                        MyApplication.Y0 = false;
                    }
                    I7.a.a(true);
                    C5875di.c(activity);
                } else {
                    I7.h(Boolean.TRUE);
                    MyApplication.Y0 = false;
                    I7.a.a(true);
                }
                for (int i2 = 0; i2 < C2723Dd.a0(); i2++) {
                    AL1.e(activity);
                }
                return;
            }
            I7.a.a(true);
            return;
        }
        I7.a.a(true);
    }

    public static void j() {
        try {
            if (C2723Dd.n0() != null && C2723Dd.n0().size() != 0 && C2723Dd.n0().size() != a) {
                b = true;
                C2723Dd.z0(C2723Dd.n0().get(a));
                a++;
                return;
            }
            b = false;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void k() {
        d.h(new c());
    }

    /* loaded from: classes3.dex */
    public class c extends FullScreenContentCallback {
        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void a() {
            I7.h(Boolean.TRUE);
            MyApplication.Y0 = true;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void b() {
            I7.h(Boolean.TRUE);
            if (C2723Dd.G()) {
                if (C2723Dd.q() == H7.h) {
                    H7.h = 0;
                    H7.i(H7.g);
                    return;
                }
                H7.h++;
                I7.a.a(true);
                return;
            }
            I7.a.a(true);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void d() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void e() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void c(com.google.android.gms.ads.AdError adError) {
        }
    }
}
