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
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.SplashActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.MyApplication;

/* renamed from: o.wk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10537wk {
    public static boolean a = true;
    public static boolean b = false;
    public static String c = "";
    public static int d = 0;
    public static boolean e = false;
    public static FullScreenContentCallback f;
    public static C10643xA0 g;

    /* renamed from: o.wk$a */
    /* loaded from: classes3.dex */
    public class a extends FullScreenContentCallback {
        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void b() {
            C9291rd.d = false;
            C10537wk.b = false;
            MyApplication.Y0 = true;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void c(AdError adError) {
            Log.d("OpenAppAds12", "onAdFailedToShowFullScreenContent = " + adError.d());
            C10537wk.a = true;
            C9291rd.c = null;
            C9291rd.d = false;
            C10537wk.b = false;
            MyApplication.Y0 = false;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void e() {
            C9291rd.d = true;
            C10537wk.b = true;
        }
    }

    /* renamed from: o.wk$b */
    /* loaded from: classes3.dex */
    public class b extends AppOpenAd.AppOpenAdLoadCallback {
        public final /* synthetic */ Activity a;

        /* renamed from: o.wk$b$a */
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
            C9291rd.c = null;
            C9291rd.d = false;
            C10537wk.c(this.a);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: c */
        public void b(AppOpenAd appOpenAd) {
            C10537wk.a = true;
            C9291rd.c = appOpenAd;
            Log.d("OpenAppAds12", "onAdLoaded");
            appOpenAd.j(new a(FirebaseAnalytics.getInstance(this.a)));
            C10537wk.d = 0;
            if (C2723Dd.l().equals("Load")) {
                C10537wk.g.a();
                C10537wk.e();
                C9291rd.c.h(C10537wk.f);
                C9291rd.c.k(this.a);
            }
        }
    }

    public static void b() {
        try {
            if (C2723Dd.m0() != null && C2723Dd.m0().size() != 0 && C2723Dd.m0().size() != d) {
                e = true;
                String str = C2723Dd.m0().get(d);
                c = str;
                C2723Dd.K0(str);
                d++;
                return;
            }
            d = 0;
            e = false;
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static void c(Activity activity) {
        Log.d("OpenAppAds12", "appOpenAd OpenAppAds check");
        if (C2723Dd.l().equals("Load")) {
            g.b("AD Loading...");
        }
        b();
        if (!e) {
            a = true;
            C9291rd.c = null;
            C9291rd.d = false;
            if (C2723Dd.l().equals("Load")) {
                g.a();
                if (C2723Dd.m() && C2723Dd.c0()) {
                    SplashActivity.T1 = true;
                    AL1.e(activity);
                    return;
                }
                return;
            }
            return;
        }
        try {
            String n = C2723Dd.n();
            C9291rd.b = new b(activity);
            AdRequest p = new AdRequest.Builder().p();
            Log.d("OpenAppAds12", "app_open_id = " + n);
            AppOpenAd.f(activity, n, p, C9291rd.b);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void d(Activity activity) {
        Log.d("OpenAppAds12", "OpenAppAds_Show " + b);
        g = new C10643xA0(activity);
        if (!b) {
            if (C2723Dd.l().equals("Load")) {
                if (a) {
                    a = false;
                    c(activity);
                    return;
                }
                return;
            }
            try {
                if (!C9291rd.d) {
                    if (C9291rd.c != null) {
                        Log.d("OpenAppAds12", "appOpenAd 1 ");
                        e();
                        C9291rd.c.h(f);
                        C9291rd.c.k(activity);
                        Log.d("OpenAppAds12", "appOpenAd show ");
                    } else {
                        Log.d("OpenAppAds12", "QuizBackgroundAppOpenAdsShow ");
                        if (C2723Dd.m() && C2723Dd.c0()) {
                            SplashActivity.T1 = true;
                            AL1.e(activity);
                        }
                    }
                }
            } catch (NullPointerException e2) {
                e2.printStackTrace();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            if (a) {
                a = false;
                c(activity);
            }
        }
    }

    public static void e() {
        f = new a();
    }
}
