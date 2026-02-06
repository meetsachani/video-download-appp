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

/* renamed from: o.rd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9291rd {
    public static b a = null;
    public static AppOpenAd.AppOpenAdLoadCallback b = null;
    public static AppOpenAd c = null;
    public static boolean d = true;
    public static String e = "";
    public static boolean f = false;
    public static int g;

    /* renamed from: o.rd$a */
    /* loaded from: classes3.dex */
    public class a extends AppOpenAd.AppOpenAdLoadCallback {
        public final /* synthetic */ Activity a;

        /* renamed from: o.rd$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0337a extends FullScreenContentCallback {
            public C0337a() {
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void b() {
                C9291rd.d = false;
                C9291rd.c = null;
                C9291rd.a.a(true);
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void c(AdError adError) {
                C9291rd.c = null;
                C9291rd.a.a(true);
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void e() {
                C9291rd.d = true;
            }
        }

        /* renamed from: o.rd$a$b */
        /* loaded from: classes3.dex */
        public class b implements OnPaidEventListener {
            public final /* synthetic */ FirebaseAnalytics a;

            public b(FirebaseAnalytics firebaseAnalytics) {
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
        public void a(LoadAdError loadAdError) {
            Log.d("ADSShoww", "onAdFailedToLoad: " + loadAdError.d());
            C9291rd.c = null;
            C9291rd.d = false;
            C9291rd.d(this.a);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: c */
        public void b(AppOpenAd appOpenAd) {
            Log.d("ADSShoww", "onAdLoaded: ");
            C9291rd.c = appOpenAd;
            C9291rd.d = false;
            C9291rd.g = 0;
            if (C2723Dd.l().equals("Load")) {
                S11.b();
            }
            C9291rd.c.h(new C0337a());
            C9291rd.c.k(this.a);
            appOpenAd.j(new b(FirebaseAnalytics.getInstance(this.a)));
        }
    }

    /* renamed from: o.rd$b */
    /* loaded from: classes3.dex */
    public interface b {
        void a(boolean z);
    }

    public static void b() {
        try {
            if (C2723Dd.m0() != null && C2723Dd.m0().size() != 0 && C2723Dd.m0().size() != g) {
                f = true;
                String str = C2723Dd.m0().get(g);
                e = str;
                C2723Dd.K0(str);
                g++;
                return;
            }
            g = 0;
            f = false;
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static void c(Activity activity, b bVar, boolean... zArr) {
        a = bVar;
        d(activity);
    }

    public static void d(Activity activity) {
        if (C2723Dd.l().equals("Load")) {
            S11.a(activity);
        }
        b();
        if (!f) {
            S11.b();
            if (C2723Dd.m()) {
                SplashActivity.T1 = true;
                a.a(true);
                AL1.e(activity);
                return;
            }
            a.a(true);
            return;
        }
        try {
            Log.d("ADSShoww", "getApp_open_id: " + C2723Dd.n());
            String n = C2723Dd.n();
            b = new a(activity);
            AppOpenAd.f(activity, n, new AdRequest.Builder().p(), b);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
