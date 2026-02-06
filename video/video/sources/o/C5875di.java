package o;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hdhub.xdownload.anyvideo.bestdownloader.MyApplication;

/* renamed from: o.di  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5875di {
    public static AppOpenAd a = null;
    public static int b = 0;
    public static boolean c = false;
    public static String d = "";
    public static AppOpenAd.AppOpenAdLoadCallback e;

    /* renamed from: o.di$a */
    /* loaded from: classes3.dex */
    public class a extends FullScreenContentCallback {
        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void b() {
            C9291rd.d = false;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void c(AdError adError) {
            Log.d("OpenAppAds12", "onAdFailedToShowFullScreenContent = " + adError.d());
            C5875di.a = null;
            C9291rd.d = false;
            MyApplication.Y0 = false;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void e() {
            Log.d("OpenAppAds12", "onAdShowedFullScreenContent = ");
            C9291rd.d = true;
        }
    }

    /* renamed from: o.di$b */
    /* loaded from: classes3.dex */
    public class b extends AppOpenAd.AppOpenAdLoadCallback {
        public final /* synthetic */ Activity a;

        /* renamed from: o.di$b$a */
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

        public b(Activity activity) {
            this.a = activity;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void a(LoadAdError loadAdError) {
            Log.d("OpenAppAds12", "onAdFailedToLoad = " + loadAdError.d());
            C5875di.a = null;
            C5875di.b(this.a);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: c */
        public void b(AppOpenAd appOpenAd) {
            C5875di.a = appOpenAd;
            Log.d("OpenAppAds12", "onAdLoaded");
            appOpenAd.j(new a(FirebaseAnalytics.getInstance(this.a)));
            C5875di.b = 0;
        }
    }

    public static void a() {
        try {
            if (C2723Dd.m0() != null && C2723Dd.m0().size() != 0 && C2723Dd.m0().size() != b) {
                c = true;
                String str = C2723Dd.m0().get(b);
                d = str;
                C2723Dd.K0(str);
                b++;
                return;
            }
            b = 0;
            c = false;
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static void b(Activity activity) {
        Log.d("OpenAppAds12", "appOpenAd OpenAppAds check");
        a();
        if (!c) {
            a = null;
            return;
        }
        try {
            String n = C2723Dd.n();
            e = new b(activity);
            AppOpenAd.f(activity, n, new AdRequest.Builder().p(), e);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void c(Activity activity) {
        Log.d("OpenAppAds12", "OpenAppAds_Show " + C9291rd.d);
        try {
            if (!C9291rd.d && a != null) {
                Log.d("OpenAppAds12", "appOpenAd 1 ");
                a.h(new a());
                a.k(activity);
                Log.d("OpenAppAds12", "appOpenAd show ");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        b(activity);
    }
}
