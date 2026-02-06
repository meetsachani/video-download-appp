package o;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C0376a;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hdhub.xdownload.anyvideo.bestdownloader.MyApplication;
import o.C6747hE2;

/* loaded from: classes3.dex */
public class I7 {
    public static f a = null;
    public static boolean b = true;
    public static InterstitialAd c;
    public static com.google.android.gms.ads.interstitial.InterstitialAd k;
    public static C10643xA0 m;
    public static Boolean d = Boolean.FALSE;
    public static int e = 0;
    public static boolean f = false;
    public static boolean g = false;
    public static int h = 0;
    public static int i = 0;
    public static int j = 0;
    public static int l = 0;

    /* loaded from: classes3.dex */
    public class a implements C6747hE2.g {
        public final /* synthetic */ Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // o.C6747hE2.g
        public void a() {
            if (C6747hE2.g(this.a)) {
                C6747hE2.a.dismiss();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements C6747hE2.g {
        public final /* synthetic */ Activity a;

        public b(Activity activity) {
            this.a = activity;
        }

        @Override // o.C6747hE2.g
        public void a() {
            if (C6747hE2.g(this.a)) {
                C6747hE2.a.dismiss();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c extends InterstitialAdLoadCallback {
        public final /* synthetic */ Activity a;

        /* loaded from: classes3.dex */
        public class a implements OnPaidEventListener {
            public final /* synthetic */ FirebaseAnalytics a;

            public a(FirebaseAnalytics firebaseAnalytics) {
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

        public c(Activity activity) {
            this.a = activity;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void a(@InterfaceC5670cr1 LoadAdError loadAdError) {
            Log.d("AdRequest_t121", "onAdFailedToLoad = " + loadAdError.d());
            I7.f(this.a);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: c */
        public void b(@InterfaceC5670cr1 com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
            Log.d("AdRequest_t121", "onAdLoaded== " + C2723Dd.H());
            I7.b = true;
            I7.k = interstitialAd;
            if (C2723Dd.H().equals("Load")) {
                I7.h(Boolean.FALSE);
                I7.k.k(this.a);
                I7.m.a();
            }
            I7.p(this.a);
            interstitialAd.j(new a(FirebaseAnalytics.getInstance(this.a)));
        }
    }

    /* loaded from: classes3.dex */
    public interface f {
        void a(boolean z);
    }

    public static void f(Activity activity) {
        if (C2723Dd.H().equals("Load")) {
            m.b("AD Loading...");
        }
        n();
        if (!f) {
            b = true;
            if (C2723Dd.k().equals("admob")) {
                k(activity);
                return;
            } else if (C2723Dd.H().equals("Load")) {
                m.a();
                m(activity);
                return;
            } else {
                return;
            }
        }
        String e2 = C2723Dd.e();
        AdRequest p = new AdRequest.Builder().p();
        k = null;
        com.google.android.gms.ads.interstitial.InterstitialAd.f(activity, e2, p, new c(activity));
    }

    public static void g(Activity activity) {
        if (C2723Dd.H().equals("Load")) {
            if (b) {
                b = false;
                f(activity);
                return;
            }
            return;
        }
        if (k != null) {
            h(Boolean.FALSE);
            k.k(activity);
        } else {
            InterstitialAd interstitialAd = c;
            if (interstitialAd != null && interstitialAd.isAdLoaded()) {
                h(Boolean.FALSE);
                c.show();
            } else {
                m(activity);
            }
        }
        if (b) {
            b = false;
            f(activity);
        }
    }

    public static void h(Boolean bool) {
        if (bool.booleanValue()) {
            C9291rd.d = false;
            MyApplication.Z0 = false;
            d = Boolean.TRUE;
            return;
        }
        C9291rd.d = true;
        d = Boolean.FALSE;
        MyApplication.Z0 = true;
    }

    public static void i(Activity activity, f fVar) {
        if (C6747hE2.g(activity)) {
            a = fVar;
            if (l == C2723Dd.p()) {
                l = 0;
                H7.a = 0;
                if (C2723Dd.W()) {
                    int o2 = C2723Dd.o();
                    if (o2 % 2 == 0) {
                        if (C2723Dd.k().equals("admob")) {
                            H7.e(activity);
                        } else {
                            H7.f(activity);
                        }
                    } else {
                        m(activity);
                    }
                    C2723Dd.L0(o2 + 1);
                    return;
                } else if (C2723Dd.k().equals("admob")) {
                    H7.e(activity);
                    return;
                } else {
                    H7.f(activity);
                    return;
                }
            }
            MyApplication.Y0 = false;
            l++;
            a.a(true);
            return;
        }
        C6747hE2.e(activity);
        C6747hE2.f(new b(activity));
    }

    public static void j(Activity activity) {
        if (C2723Dd.H().equals("Load")) {
            k(activity);
            return;
        }
        InterstitialAd interstitialAd = c;
        if (interstitialAd != null && interstitialAd.isAdLoaded()) {
            h(Boolean.FALSE);
            c.show();
        } else if (k != null) {
            h(Boolean.FALSE);
            k.k(activity);
        } else {
            m(activity);
        }
        k(activity);
    }

    public static void k(Activity activity) {
        if (C2723Dd.H().equals("Load")) {
            m.b("AD Loading...");
        }
        l();
        if (!g) {
            if (C2723Dd.k().equals(C0376a.m1)) {
                f(activity);
                return;
            } else if (C2723Dd.H().equals("Load")) {
                m.a();
                m(activity);
                return;
            } else {
                return;
            }
        }
        String C = C2723Dd.C();
        c = null;
        c = new InterstitialAd(activity, C);
        e eVar = new e(activity);
        InterstitialAd interstitialAd = c;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(eVar).build());
    }

    public static void l() {
        try {
            if (C2723Dd.s0() != null && !C2723Dd.s0().isEmpty() && C2723Dd.s0().size() != h) {
                g = true;
                C2723Dd.Z0(C2723Dd.s0().get(h));
                h++;
                return;
            }
            h = 0;
            g = false;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void m(Activity activity) {
        if (C2723Dd.m()) {
            if (C2723Dd.c0()) {
                if (C2723Dd.I()) {
                    h(Boolean.TRUE);
                    if (!C2723Dd.m0().isEmpty()) {
                        MyApplication.Y0 = false;
                    } else {
                        MyApplication.Y0 = true;
                    }
                    a.a(true);
                    C5875di.c(activity);
                } else {
                    h(Boolean.TRUE);
                    MyApplication.Y0 = true;
                    a.a(true);
                }
                for (int i2 = 0; i2 < C2723Dd.a0(); i2++) {
                    AL1.e(activity);
                }
                return;
            }
            a.a(true);
            return;
        }
        a.a(true);
    }

    public static void n() {
        try {
            if (C2723Dd.q0() != null && C2723Dd.q0().size() != 0 && C2723Dd.q0().size() != e) {
                f = true;
                C2723Dd.B0(C2723Dd.q0().get(e));
                e++;
                return;
            }
            f = false;
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static void o(Activity activity, f fVar, boolean... zArr) {
        if (C6747hE2.g(activity)) {
            m = new C10643xA0(activity);
            a = fVar;
            if (i == C2723Dd.i()) {
                i = 0;
                e = 0;
                if (C2723Dd.W()) {
                    int b2 = C2723Dd.b();
                    if (b2 % 2 == 0) {
                        if (C2723Dd.k().equals("admob")) {
                            g(activity);
                        } else {
                            j(activity);
                        }
                    } else {
                        m(activity);
                    }
                    C2723Dd.y0(b2 + 1);
                    return;
                } else if (C2723Dd.k().equals("admob")) {
                    g(activity);
                    return;
                } else {
                    j(activity);
                    return;
                }
            }
            MyApplication.Y0 = false;
            i++;
            a.a(true);
            return;
        }
        C6747hE2.e(activity);
        C6747hE2.f(new a(activity));
    }

    public static void p(Activity activity) {
        k.h(new d(activity));
    }

    /* loaded from: classes3.dex */
    public class d extends FullScreenContentCallback {
        public final /* synthetic */ Activity f;

        public d(Activity activity) {
            this.f = activity;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void a() {
            I7.h(Boolean.TRUE);
            MyApplication.Y0 = true;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void b() {
            I7.h(Boolean.TRUE);
            if (C2723Dd.G()) {
                if (C2723Dd.Z() == I7.j) {
                    I7.j = 0;
                    I7.m(this.f);
                    return;
                }
                I7.j++;
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
        public void c(AdError adError) {
        }
    }

    /* loaded from: classes3.dex */
    public class e implements InterstitialAdListener {
        public final /* synthetic */ Activity a;

        public e(Activity activity) {
            this.a = activity;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(com.facebook.ads.Ad ad) {
            I7.h(Boolean.TRUE);
            MyApplication.Y0 = true;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(com.facebook.ads.Ad ad) {
            I7.h = 0;
            Log.d("Interstitialad12", "fb Interstitial ad is loaded and ready to be displayed!");
            if (C2723Dd.H().equals("Load")) {
                Log.d("ads_type12", "ads_type = 7");
                I7.m.a();
                I7.h(Boolean.FALSE);
                I7.c.show();
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
            I7.k(this.a);
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDismissed(com.facebook.ads.Ad ad) {
            MyApplication.Z0 = false;
            I7.a.a(true);
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDisplayed(com.facebook.ads.Ad ad) {
            Log.d("Interstitialad12", "fb Interstitial ad displayed.");
            I7.h(Boolean.TRUE);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(com.facebook.ads.Ad ad) {
        }
    }
}
