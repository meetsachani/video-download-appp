package com.hdhub.xdownload.anyvideo.bestdownloader.Activity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.C0376a;
import com.facebook.M;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.appevents.C2327q;
import com.facebook.b0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.IntroScreen.StartActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.SplashActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.MyApplication;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C10537wk;
import o.C11041yo1;
import o.C11284zo1;
import o.C2723Dd;
import o.C4343To;
import o.C5036aE2;
import o.C5875di;
import o.C6251fF0;
import o.C6747hE2;
import o.C8284nU1;
import o.C9291rd;
import o.FT1;
import o.G7;
import o.H7;
import o.I7;
import o.InterfaceC11230zb;
import o.InterfaceC11302zt;
import o.InterfaceC3386Jt;
import o.InterfaceC5670cr1;
import o.LH1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class SplashActivity extends ActivityC3020Gb {
    public static final String R1 = "SheetDemo";
    public static Dialog S1 = null;
    public static boolean T1 = false;
    public static ArrayList<String> U1 = new ArrayList<>();
    public static boolean V1 = false;
    public static ArrayList<G7> W1;
    public TextView E1;
    public FirebaseRemoteConfig F1;
    public String Q1;
    public final String C1 = "checkedInstallReferrerCheck1122";
    public final Executor D1 = Executors.newSingleThreadExecutor();
    public List<String> G1 = new ArrayList();
    public List<String> H1 = new ArrayList();
    public List<String> I1 = new ArrayList();
    public List<String> J1 = new ArrayList();
    public List<String> K1 = new ArrayList();
    public List<String> L1 = new ArrayList();
    public List<String> M1 = new ArrayList();
    public List<String> N1 = new ArrayList();
    public List<String> O1 = new ArrayList();
    public boolean P1 = false;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ String X;
        public final /* synthetic */ String Y;

        public a(String str, String str2) {
            this.X = str;
            this.Y = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.X.equals("forcly_update")) {
                SplashActivity.S1.dismiss();
                SplashActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.Y)));
                SplashActivity.this.finish();
            } else if (this.X.equals("alert_msg")) {
                SplashActivity.S1.dismiss();
                SplashActivity.this.finishAffinity();
            } else {
                SplashActivity.S1.dismiss();
                SplashActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.Y)));
                SplashActivity.this.finish();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* loaded from: classes3.dex */
        public class a implements C9291rd.b {
            public a() {
            }

            @Override // o.C9291rd.b
            public void a(boolean z) {
                if (C2723Dd.l().equals("PreLoad")) {
                    C10537wk.c(SplashActivity.this);
                }
                SplashActivity.this.V1();
                MyApplication.Z0 = false;
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9291rd.c(SplashActivity.this, new a(), new boolean[0]);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AbstractC2891Eu1 {
        public c(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            SplashActivity.this.finish();
            System.exit(0);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements InstallReferrerStateListener {
        public final /* synthetic */ InstallReferrerClient a;

        public d(InstallReferrerClient installReferrerClient) {
            this.a = installReferrerClient;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void a(int i) {
            Log.i("Check123", "referrerUrl = 6 = " + i);
            if (i != 0) {
                return;
            }
            Log.i("Check123", "referrerUrl = 7");
            try {
                ReferrerDetails b = this.a.b();
                String b2 = b.b();
                long c = b.c();
                long a = b.a();
                C2723Dd.A1(b2);
                Log.i("Check123", "RUrl = " + b2);
                Log.i("Check123", "referrerClickTime = " + c);
                Log.i("Check123", "appInstallTime = " + a);
                b.b();
                SplashActivity.this.getPreferences(0).edit().putBoolean("checkedInstallReferrerCheck1122", true).commit();
                this.a.a();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void b() {
        }
    }

    /* loaded from: classes3.dex */
    public class e implements C6747hE2.g {
        public e() {
        }

        @Override // o.C6747hE2.g
        public void a() {
            if (C6747hE2.g(SplashActivity.this)) {
                C6747hE2.a.dismiss();
                try {
                    SplashActivity.this.X1();
                } catch (Exception unused) {
                }
                SplashActivity.this.Q1();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements OnCompleteListener<Void> {
        public f() {
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void a(@InterfaceC5670cr1 Task<Void> task) {
        }
    }

    /* loaded from: classes3.dex */
    public class g implements InterfaceC3386Jt<LH1> {
        public g() {
        }

        @Override // o.InterfaceC3386Jt
        public void a(InterfaceC11302zt<LH1> interfaceC11302zt, Throwable th) {
            SplashActivity.this.S1();
        }

        @Override // o.InterfaceC3386Jt
        public void b(InterfaceC11302zt<LH1> interfaceC11302zt, FT1<LH1> ft1) {
            if (ft1.g()) {
                C2723Dd.F1(ft1.a().l());
                C2723Dd.W0(ft1.a().c());
                C2723Dd.T0(ft1.a().b());
                Log.d("CHECKKSS", "getStateName: " + C2723Dd.i0());
                Log.d("CHECKKSS", "getCountryNme: " + C2723Dd.z());
                Log.d("CHECKKSS", "getCityName: " + C2723Dd.w());
            }
            SplashActivity.this.S1();
        }
    }

    /* loaded from: classes3.dex */
    public class h implements OnCompleteListener<Boolean> {
        public h() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(28:8|9|10|11|12|13|(3:15|(2:18|16)|19)(1:97)|20|21|(3:23|(2:26|24)|27)(1:92)|28|(13:35|36|(2:38|(1:40)(1:83))(1:84)|41|(1:45)|47|48|49|50|51|52|53|(2:60|(2:62|63)(1:(2:69|(2:74|(2:76|77)(2:78|79))(2:72|73))(2:67|68)))(2:57|58))|85|(2:87|(1:89)(1:90))(1:91)|36|(0)(0)|41|(2:43|45)|47|48|49|50|51|52|53|(1:55)|60|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0707, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0708, code lost:
            r0.printStackTrace();
            r0 = null;
         */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0553 A[Catch: Exception -> 0x04b6, JSONException -> 0x04b9, TryCatch #4 {JSONException -> 0x04b9, blocks: (B:9:0x01e9, B:19:0x03d0, B:28:0x03f5, B:30:0x045b, B:32:0x0463, B:35:0x046c, B:47:0x0527, B:49:0x0553, B:51:0x0559, B:54:0x06ac, B:56:0x06dc, B:58:0x06e2, B:52:0x05cb, B:53:0x063c, B:40:0x04be, B:42:0x0511, B:44:0x051b, B:45:0x0520, B:46:0x0524), top: B:108:0x01e9 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x063c A[Catch: Exception -> 0x04b6, JSONException -> 0x04b9, TryCatch #4 {JSONException -> 0x04b9, blocks: (B:9:0x01e9, B:19:0x03d0, B:28:0x03f5, B:30:0x045b, B:32:0x0463, B:35:0x046c, B:47:0x0527, B:49:0x0553, B:51:0x0559, B:54:0x06ac, B:56:0x06dc, B:58:0x06e2, B:52:0x05cb, B:53:0x063c, B:40:0x04be, B:42:0x0511, B:44:0x051b, B:45:0x0520, B:46:0x0524), top: B:108:0x01e9 }] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x072f A[Catch: Exception -> 0x04b6, JSONException -> 0x0704, TryCatch #1 {JSONException -> 0x0704, blocks: (B:61:0x06ef, B:63:0x06ff, B:69:0x070c, B:73:0x071c, B:76:0x072f, B:80:0x0741, B:81:0x074a, B:84:0x0754, B:85:0x076c, B:87:0x0772, B:88:0x0778, B:68:0x0708, B:89:0x077e, B:90:0x0783, B:91:0x0784, B:92:0x0789, B:95:0x078d), top: B:105:0x0037 }] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x073b  */
        @Override // com.google.android.gms.tasks.OnCompleteListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(@InterfaceC5670cr1 Task<Boolean> task) {
            String str = "reeltimer";
            if (task.v()) {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(SplashActivity.this.F1.y("data"));
                        try {
                            if (jSONObject.optString("package_name").equals(SplashActivity.this.getPackageName())) {
                                JSONObject optJSONObject = jSONObject.optJSONObject("addata");
                                String string = optJSONObject.getString(C2723Dd.s0);
                                String string2 = optJSONObject.getString("ads_type");
                                String string3 = optJSONObject.getString("bottom_ads_type");
                                String string4 = optJSONObject.getString(C2723Dd.K);
                                String string5 = optJSONObject.getString(C2723Dd.g);
                                String string6 = optJSONObject.getString(C2723Dd.V);
                                String string7 = optJSONObject.getString(C2723Dd.Z);
                                boolean z = optJSONObject.getBoolean(C2723Dd.y);
                                boolean z2 = optJSONObject.getBoolean(C2723Dd.q);
                                boolean z3 = optJSONObject.getBoolean(C2723Dd.W);
                                int i = optJSONObject.getInt("ads_click");
                                int i2 = optJSONObject.getInt("back_click");
                                int i3 = optJSONObject.getInt("native_by_page");
                                int i4 = optJSONObject.getInt("intro_show");
                                boolean z4 = optJSONObject.getBoolean("collapse_banner");
                                JSONObject optJSONObject2 = jSONObject.optJSONObject("maintenance");
                                boolean z5 = optJSONObject2.getBoolean("maintenance");
                                String string8 = optJSONObject2.getString("version_name");
                                String string9 = optJSONObject2.getString("version_code");
                                String string10 = optJSONObject2.getString("app_msg");
                                String string11 = optJSONObject2.getString("update_url");
                                boolean z6 = optJSONObject2.getBoolean("update_coming_soon");
                                boolean z7 = optJSONObject2.getBoolean(C2723Dd.p);
                                boolean z8 = optJSONObject2.getBoolean("is_update");
                                boolean z9 = optJSONObject2.getBoolean("forcly_update");
                                JSONObject optJSONObject3 = jSONObject.optJSONObject("other");
                                String string12 = optJSONObject3.getString(C2723Dd.s);
                                String string13 = optJSONObject3.getString("bodytxtcolor");
                                String string14 = optJSONObject3.getString("admob_native_btn_color");
                                String string15 = optJSONObject3.getString("admob_native_btn_text_color");
                                String string16 = optJSONObject3.getString("admob_native_bg_color");
                                JSONArray optJSONArray = optJSONObject3.optJSONArray(C2723Dd.b);
                                String string17 = optJSONObject3.getString(C0376a.A1);
                                String string18 = optJSONObject3.getString("appliction_token");
                                String string19 = optJSONObject3.getString(C2723Dd.X);
                                boolean z10 = optJSONObject3.getBoolean("firebaseanalytics");
                                boolean z11 = optJSONObject3.getBoolean("is_quiz_show");
                                boolean z12 = optJSONObject3.getBoolean("is_big_native_quiz");
                                boolean z13 = optJSONObject3.getBoolean("is_small_native_quiz");
                                boolean z14 = optJSONObject3.getBoolean(C2723Dd.B);
                                int i5 = optJSONObject3.getInt(C2723Dd.m0);
                                int i6 = optJSONObject3.getInt(C2723Dd.o0);
                                int i7 = optJSONObject3.getInt(C2723Dd.p0);
                                boolean z15 = optJSONObject3.getBoolean(C2723Dd.n0);
                                boolean z16 = optJSONObject3.getBoolean(C2723Dd.q0);
                                int i8 = optJSONObject3.getInt(C2723Dd.r0);
                                JSONObject optJSONObject4 = jSONObject.optJSONObject("moreoption");
                                int i9 = optJSONObject4.getInt("other_quiz_open_count");
                                boolean z17 = optJSONObject4.getBoolean("other_inter_by_quiz_show");
                                int i10 = optJSONObject4.getInt("other_quiz_click");
                                int i11 = optJSONObject4.getInt("other_back_quiz_click");
                                int i12 = optJSONObject4.getInt(C2723Dd.U);
                                boolean z18 = optJSONObject4.getBoolean("btn1");
                                boolean z19 = optJSONObject4.getBoolean("btn2");
                                boolean z20 = optJSONObject4.getBoolean("btn3");
                                boolean z21 = optJSONObject4.getBoolean("btn4");
                                try {
                                    boolean z22 = optJSONObject4.getBoolean("btn5");
                                    JSONArray optJSONArray2 = optJSONObject4.optJSONArray("ntvimage");
                                    String string20 = optJSONObject4.getString("image_sheet_url");
                                    String string21 = optJSONObject4.getString("video_sheet_url");
                                    String string22 = optJSONObject4.getString("name_sheet_url");
                                    String string23 = optJSONObject4.getString(C2723Dd.i0);
                                    String string24 = optJSONObject4.getString(C2723Dd.j0);
                                    int i13 = optJSONObject4.getInt(C2723Dd.T);
                                    int i14 = optJSONObject4.getInt("reeltimer");
                                    boolean z23 = optJSONObject4.getBoolean(C2723Dd.l0);
                                    boolean z24 = optJSONObject4.getBoolean("m_app");
                                    boolean z25 = optJSONObject4.getBoolean("ads_reel");
                                    boolean z26 = optJSONObject4.getBoolean(C2723Dd.f441o);
                                    boolean z27 = optJSONObject4.getBoolean("other_link_close_appopen_show");
                                    boolean z28 = optJSONObject4.getBoolean("other_is_quiz_show");
                                    String string25 = optJSONObject4.getString("other_ads_type");
                                    String string26 = optJSONObject4.getString("other_bottom_ads_type");
                                    String string27 = optJSONObject4.getString("other_ads_show_type");
                                    String string28 = optJSONObject4.getString("other_native_ads_type");
                                    String string29 = optJSONObject4.getString("other_inter_ads_type");
                                    String string30 = optJSONObject4.getString("other_bottom_show_type");
                                    boolean z29 = optJSONObject4.getBoolean("other_one_by_one");
                                    boolean z30 = optJSONObject4.getBoolean("other_border_show");
                                    boolean z31 = optJSONObject4.getBoolean("other_collapse_banner");
                                    int i15 = optJSONObject4.getInt("other_first_click");
                                    int i16 = optJSONObject4.getInt("other_back_click");
                                    int i17 = optJSONObject4.getInt("other_native_by_page");
                                    int i18 = optJSONObject4.getInt("other_intro_show");
                                    String string31 = optJSONObject4.getString(C2723Dd.h);
                                    String string32 = optJSONObject4.getString("other_admob_native_btn_color");
                                    String string33 = optJSONObject4.getString("other_admob_native_btn_text_color");
                                    String string34 = optJSONObject4.getString("other_admob_native_bg_color");
                                    String string35 = optJSONObject4.getString("first_uri");
                                    String string36 = optJSONObject4.getString("secound_uri");
                                    String string37 = optJSONObject4.getString("third_uri");
                                    String string38 = optJSONObject4.getString("state");
                                    SplashActivity.this.getSharedPreferences("mysession", 0).edit().putBoolean("bb1", z18).apply();
                                    SplashActivity.this.getSharedPreferences("mysession", 0).edit().putBoolean("bb2", z19).apply();
                                    SplashActivity.this.getSharedPreferences("mysession", 0).edit().putBoolean("bb3", z20).apply();
                                    SplashActivity.this.getSharedPreferences("mysession", 0).edit().putBoolean("bb4", z21).apply();
                                    SplashActivity.this.getSharedPreferences("mysession", 0).edit().putBoolean("bb5", z22).apply();
                                    SplashActivity.this.getSharedPreferences("mysession", 0).edit().putBoolean("isreel", z25).apply();
                                    SplashActivity.this.getSharedPreferences("mysession", 0).edit().putInt("reeltimer", i14).apply();
                                    C2723Dd.l1(i8);
                                    C2723Dd.X0(z16);
                                    C2723Dd.r1(z23);
                                    C2723Dd.i1(i12);
                                    C2723Dd.c1(string20);
                                    C2723Dd.H1(string21);
                                    C2723Dd.h1(string22);
                                    C2723Dd.B1(string23);
                                    C2723Dd.G1(string24);
                                    C2723Dd.p1(string);
                                    try {
                                        if (optJSONArray2 != null) {
                                            for (int i19 = 0; i19 < optJSONArray2.length(); i19++) {
                                                SplashActivity.U1.add(optJSONArray2.optString(i19));
                                            }
                                        } else {
                                            Log.d("getfirebaseid", "admobInterstitialIdArray is null");
                                        }
                                        C2723Dd.q1(SplashActivity.U1);
                                        ArrayList arrayList = new ArrayList();
                                        try {
                                            if (optJSONArray != null) {
                                                for (int i20 = 0; i20 < optJSONArray.length(); i20++) {
                                                    arrayList.add(optJSONArray.optString(i20));
                                                }
                                            } else {
                                                Log.d("getfirebaseid", "admobInterstitialIdArray is null");
                                            }
                                            C2723Dd.S1(arrayList);
                                            SplashActivity.this.a2(optJSONObject);
                                            String e2 = SplashActivity.this.e2(C2723Dd.d0());
                                            String Y1 = SplashActivity.Y1(C2723Dd.d0());
                                            String d2 = SplashActivity.this.d2(C2723Dd.d0());
                                            Log.i("referrerUrl123", "facebook_user: " + Y1);
                                            Log.i("referrerUrl123", "newstring: " + d2);
                                            Log.i("referrerUrl123", "newstring: " + e2);
                                            if (!d2.equals(string37) && !Y1.equals(string35) && !string36.equals(e2)) {
                                                C2723Dd.H0(string2);
                                                C2723Dd.I0(string4);
                                                C2723Dd.m1(string5);
                                                C2723Dd.e1(string6);
                                                C2723Dd.Q0(string3);
                                                C2723Dd.R0(string7);
                                                C2723Dd.U0(z4);
                                                C2723Dd.J0(z11);
                                                C2723Dd.f1(z);
                                                C2723Dd.j1(string13);
                                                C2723Dd.k1(string14);
                                                C2723Dd.o1(string15);
                                                C2723Dd.n1(z14);
                                                C2723Dd.D0(string16);
                                                C2723Dd.F0(i);
                                                C2723Dd.M0(i2);
                                                C2723Dd.s1(i3);
                                                C2723Dd.C1(i4);
                                                C2723Dd.t1(z3);
                                                C2723Dd.g1(false);
                                                C2723Dd.d1(z15);
                                                C2723Dd.x1(i5);
                                                C2723Dd.w1(i6);
                                                C2723Dd.N0(i7);
                                                SplashActivity.W1 = new ArrayList();
                                                if (!C2723Dd.J()) {
                                                    if (C2723Dd.U()) {
                                                        SplashActivity.W1.add(new G7("🔥 हॉट & प्राइवेट क्लिप्स", "अपनी पसंदीदा वीडियो को बिना किसी झंझट के गुप्त रूप से डाउनलोड करें 😉", R.drawable.ad_logo, R.drawable.ad_banner));
                                                        SplashActivity.W1.add(new G7("💋 सीक्रेट वीडियो सेवर", "वीडियो सेव करें… बिल्कुल चुपचाप, बिना कोई निशान छोड़े 😏", R.drawable.ad_logo2, R.drawable.ad_banner2));
                                                        SplashActivity.W1.add(new G7("✨ सेक्सी मीडिया डाउनलोडर", "आपके हॉट मोमेंट्स… अब सुरक्षित और तेज़ डाउनलोड में 😍", R.drawable.ad_logo3, R.drawable.ad_banner3));
                                                        SplashActivity.W1.add(new G7("😈 स्टेल्थ मोड डाउनलोड", "चाहे जितना हॉट कंटेंट हो, डाउनलोड करें पूरी प्राइवेसी के साथ 😉🔥", R.drawable.ad_logo4, R.drawable.ad_banner4));
                                                        SplashActivity.W1.add(new G7("💘 प्राइवेट HD डाउनलोडर", "हाई-क्वालिटी वीडियो डाउनलोड करें… बस एक टच में 😉✨", R.drawable.ad_logo5, R.drawable.ad_banner5));
                                                        SplashActivity.W1.add(new G7("🔐 हॉट मीडिया वॉल्ट", "अपनी निजी वीडियो को लॉक कर के रखें… सिर्फ आपके लिए 😎💋", R.drawable.ad_logo, R.drawable.ad_banner));
                                                        SplashActivity.W1.add(new G7("🔥 HD सेक्सी वीडियो सेवर", "हॉट वीडियो तेज़ी से डाउनलोड करें, बिना किसी लिमिट के 😍🔥", R.drawable.ad_logo2, R.drawable.ad_banner2));
                                                    } else {
                                                        SplashActivity.W1.add(new G7("Exclusive Adult Clips!", "Download your favorite 18+ videos privately & securely.", R.drawable.ad_logo, R.drawable.ad_banner));
                                                        SplashActivity.W1.add(new G7("Private Video Saver", "Save mature content discreetly with fast HD downloads.", R.drawable.ad_logo2, R.drawable.ad_banner2));
                                                        SplashActivity.W1.add(new G7("Adult Zone Downloader", "Instantly grab 18+ videos and keep them safe offline.", R.drawable.ad_logo3, R.drawable.ad_banner3));
                                                        SplashActivity.W1.add(new G7("Stealth Mode Download", "Download adult content anonymously with one tap.", R.drawable.ad_logo4, R.drawable.ad_banner4));
                                                        SplashActivity.W1.add(new G7("Premium 18+ Downloader", "Fast, private, and secure downloads for mature videos.", R.drawable.ad_logo5, R.drawable.ad_banner5));
                                                        SplashActivity.W1.add(new G7("Hidden Video Vault", "Save adult videos into your private encrypted space.", R.drawable.ad_logo, R.drawable.ad_banner));
                                                        SplashActivity.W1.add(new G7("Adult HD Video Saver", "Download mature content in high quality without limits.", R.drawable.ad_logo2, R.drawable.ad_banner2));
                                                    }
                                                } else {
                                                    SplashActivity.W1.add(new G7("Exclusive Adult Clips!", "Download your favorite 18+ videos privately & securely.", R.drawable.ad_logo, R.drawable.ad_banner));
                                                    SplashActivity.W1.add(new G7("Private Video Saver", "Save mature content discreetly with fast HD downloads.", R.drawable.ad_logo2, R.drawable.ad_banner2));
                                                    SplashActivity.W1.add(new G7("Adult Zone Downloader", "Instantly grab 18+ videos and keep them safe offline.", R.drawable.ad_logo3, R.drawable.ad_banner3));
                                                    SplashActivity.W1.add(new G7("Stealth Mode Download", "Download adult content anonymously with one tap.", R.drawable.ad_logo4, R.drawable.ad_banner4));
                                                    SplashActivity.W1.add(new G7("Premium 18+ Downloader", "Fast, private, and secure downloads for mature videos.", R.drawable.ad_logo5, R.drawable.ad_banner5));
                                                    SplashActivity.W1.add(new G7("Hidden Video Vault", "Save adult videos into your private encrypted space.", R.drawable.ad_logo, R.drawable.ad_banner));
                                                    SplashActivity.W1.add(new G7("Adult HD Video Saver", "Download mature content in high quality without limits.", R.drawable.ad_logo2, R.drawable.ad_banner2));
                                                }
                                                C2723Dd.G0(SplashActivity.W1);
                                                C2723Dd.D1(i13);
                                                C2723Dd.Y0(z2);
                                                C2723Dd.V0(z7);
                                                C2723Dd.v1(string12);
                                                FirebaseAnalytics.getInstance(SplashActivity.this).e(z10);
                                                C2723Dd.y1(string19);
                                                C2723Dd.z1(z26);
                                                C2723Dd.E1(z13);
                                                C2723Dd.O0(z12);
                                                if (!string17.isEmpty() && !string18.isEmpty()) {
                                                    SplashActivity.this.W1(string17, string18);
                                                }
                                                Log.d("GETDATAA", "onComplete: ");
                                                PackageInfo packageInfo = SplashActivity.this.getPackageManager().getPackageInfo(SplashActivity.this.getPackageName(), 0);
                                                float parseFloat = Float.parseFloat(string8);
                                                float parseFloat2 = Float.parseFloat(packageInfo.versionName);
                                                if (!z9 && parseFloat > parseFloat2) {
                                                    SplashActivity.this.R1(string10, string11, "forcly_update");
                                                    return;
                                                } else if (!z5) {
                                                    Log.d("alert_msg", "alert_msg");
                                                    SplashActivity.this.R1(string10, string11, "alert_msg");
                                                    return;
                                                } else if (z8 && parseFloat > parseFloat2) {
                                                    SplashActivity.this.R1(string10, string11, "update");
                                                    return;
                                                } else if (Integer.parseInt(string9) == packageInfo.versionCode && z6) {
                                                    C2723Dd.V0(true);
                                                    SplashActivity.this.startActivity(new Intent(SplashActivity.this, ComingSoonScreen.class));
                                                    SplashActivity.this.finish();
                                                    return;
                                                } else if (C2723Dd.y()) {
                                                    SplashActivity.this.V1();
                                                    return;
                                                } else {
                                                    SplashActivity.this.U1();
                                                    return;
                                                }
                                            }
                                            C2723Dd.H0(string25);
                                            C2723Dd.I0(string27);
                                            C2723Dd.m1(string28);
                                            C2723Dd.e1(string29);
                                            C2723Dd.Q0(string26);
                                            C2723Dd.R0(string30);
                                            C2723Dd.U0(z31);
                                            C2723Dd.J0(z28);
                                            C2723Dd.f1(z27);
                                            C2723Dd.j1(string31);
                                            C2723Dd.k1(string32);
                                            C2723Dd.o1(string33);
                                            C2723Dd.n1(z30);
                                            C2723Dd.D0(string34);
                                            C2723Dd.F0(i15);
                                            C2723Dd.M0(i16);
                                            C2723Dd.s1(i17);
                                            C2723Dd.C1(i18);
                                            C2723Dd.t1(z29);
                                            C2723Dd.d1(z17);
                                            C2723Dd.x1(i9);
                                            C2723Dd.w1(i10);
                                            C2723Dd.N0(i11);
                                            List asList = Arrays.asList(string38.split(","));
                                            if (z24) {
                                                if (asList.contains(C2723Dd.i0())) {
                                                    C2723Dd.g1(false);
                                                } else {
                                                    C2723Dd.g1(z24);
                                                }
                                            } else {
                                                C2723Dd.g1(z24);
                                            }
                                            SplashActivity.W1 = new ArrayList();
                                            if (!C2723Dd.J()) {
                                            }
                                            C2723Dd.G0(SplashActivity.W1);
                                            C2723Dd.D1(i13);
                                            C2723Dd.Y0(z2);
                                            C2723Dd.V0(z7);
                                            C2723Dd.v1(string12);
                                            FirebaseAnalytics.getInstance(SplashActivity.this).e(z10);
                                            C2723Dd.y1(string19);
                                            C2723Dd.z1(z26);
                                            C2723Dd.E1(z13);
                                            C2723Dd.O0(z12);
                                            if (!string17.isEmpty()) {
                                                SplashActivity.this.W1(string17, string18);
                                            }
                                            Log.d("GETDATAA", "onComplete: ");
                                            PackageInfo packageInfo2 = SplashActivity.this.getPackageManager().getPackageInfo(SplashActivity.this.getPackageName(), 0);
                                            float parseFloat3 = Float.parseFloat(string8);
                                            float parseFloat22 = Float.parseFloat(packageInfo2.versionName);
                                            if (!z9) {
                                            }
                                            if (!z5) {
                                            }
                                        } catch (Exception e) {
                                            throw new RuntimeException(e);
                                        }
                                    } catch (Exception e3) {
                                        throw new RuntimeException(e3);
                                    }
                                } catch (JSONException e4) {
                                    e = e4;
                                    str = "GETDATAA";
                                    e.printStackTrace();
                                    Log.d(str, "Failer: ");
                                    SplashActivity splashActivity = SplashActivity.this;
                                    Toast.makeText(splashActivity, "Something Went Wrong" + e.getMessage(), 0).show();
                                }
                            } else {
                                Toast.makeText(SplashActivity.this, "Wrong Package Name", 0).show();
                            }
                        } catch (JSONException e5) {
                            e = e5;
                        }
                    } catch (Exception e6) {
                        throw new RuntimeException(e6);
                    }
                } catch (JSONException e7) {
                    e = e7;
                    str = "GETDATAA";
                }
            } else {
                Log.d("GETDATAA", "Failer121: ");
                Toast.makeText(SplashActivity.this, "Something Went Wrong", 0).show();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class i implements M.b {
        public i() {
        }

        @Override // com.facebook.M.b
        public void a() {
            M.k0(true);
            M.g0(true);
            M.j0(true);
            M.l();
            M.k0(true);
            M.j(b0.APP_EVENTS);
            C2327q.w(SplashActivity.this).h();
        }
    }

    /* loaded from: classes3.dex */
    public class j implements DialogInterface.OnCancelListener {
        public final /* synthetic */ String X;

        public j(String str) {
            this.X = str;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (!this.X.equals("alert_msg")) {
                SplashActivity.this.U1();
            } else {
                SplashActivity.this.finishAffinity();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SplashActivity.S1.dismiss();
            SplashActivity.this.U1();
        }
    }

    public static String Y1(String str) {
        int indexOf = str.indexOf(38);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        return "";
    }

    public final void P1() {
        String str;
        InterfaceC11230zb interfaceC11230zb = (InterfaceC11230zb) new C8284nU1.b().c("http://ip-api.com/json/").b(C6251fF0.f()).f().g(InterfaceC11230zb.class);
        if (this.P1 && !this.Q1.isEmpty()) {
            str = this.Q1;
        } else {
            str = "?fields=61439";
        }
        interfaceC11230zb.a(str).g3(new g());
    }

    public final void Q1() {
        if (!C2723Dd.w().isEmpty() && !C2723Dd.i0().isEmpty() && !C2723Dd.z().isEmpty()) {
            S1();
        } else {
            P1();
        }
    }

    public final void R1(String str, String str2, String str3) {
        Dialog dialog = new Dialog(this);
        S1 = dialog;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        S1.setContentView(S1.getLayoutInflater().inflate(R.layout.dialog_maintance, (ViewGroup) null));
        S1.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        S1.setCancelable(true);
        S1.setCanceledOnTouchOutside(false);
        TextView textView = (TextView) S1.findViewById(R.id.txt_ok);
        TextView textView2 = (TextView) S1.findViewById(R.id.txt_cancel);
        ((TextView) S1.findViewById(R.id.txt_msg)).setText(str);
        S1.setOnCancelListener(new j(str3));
        if (str3.equals("alert_msg")) {
            textView.setText("Ok");
            textView2.setVisibility(8);
        } else if (str3.equals("forcly_update")) {
            textView.setText("Update");
            textView2.setVisibility(8);
        } else {
            textView.setText("Update");
            textView2.setVisibility(0);
        }
        textView2.setOnClickListener(new k());
        textView.setOnClickListener(new a(str3, str2));
        S1.show();
    }

    public final void S1() {
        Log.d("GETDATAA", "FirebaseSetUp: ");
        this.F1 = FirebaseRemoteConfig.t();
        this.F1.E(new FirebaseRemoteConfigSettings.Builder().g(0L).c());
        this.F1.G(R.xml.default_config);
        this.F1.o().d(this, new h());
    }

    public final void T1() {
        C5875di.b(this);
        if (C2723Dd.P().equals("PreLoad")) {
            if (C2723Dd.k().equals("admob")) {
                C11284zo1.a(this, null, null, true);
                if (C2723Dd.A()) {
                    new C11041yo1().i(this);
                }
            } else {
                AudienceNetworkAds.initialize(this);
                C11284zo1.d(this, null, null, true);
            }
        }
        if (C2723Dd.t().equals("PreLoad")) {
            if (C2723Dd.k().equals("admob")) {
                if (!C2723Dd.u().equals("banner")) {
                    C4343To.b(this, null, null);
                }
            } else {
                AudienceNetworkAds.initialize(this);
                C4343To.h(this, null, null);
            }
        }
        if (C2723Dd.H().equals("PreLoad")) {
            if (C2723Dd.k().equals("admob")) {
                I7.f(this);
                H7.d(this);
                return;
            }
            AudienceNetworkAds.initialize(this);
            I7.k(this);
            H7.h(this);
        }
    }

    public final void U1() {
        if (!C2723Dd.y()) {
            T1();
        }
        new Handler().postDelayed(new b(), 1000L);
    }

    public final void V1() {
        if (C2723Dd.c0()) {
            MyApplication.Y0 = T1;
        } else {
            MyApplication.Y0 = false;
        }
        if (C2723Dd.y()) {
            startActivity(new Intent(this, ComingSoonScreen.class));
            finish();
            return;
        }
        if (C2723Dd.J()) {
            V1 = true;
            startActivity(new Intent(this, HomeActivity.class));
        } else {
            V1 = false;
            if (C2723Dd.f0() == 0) {
                startActivity(new Intent(this, MainActivity.class));
            } else {
                startActivity(new Intent(this, StartActivity.class));
            }
        }
        finish();
    }

    public final void W1(String str, String str2) {
        M.h0(str);
        M.m0(str2);
        M.Y(this, new i());
    }

    public void X1() {
        Log.d("Check123", "referrerUrl = 2");
        if (getPreferences(0).getBoolean("checkedInstallReferrerCheck1122", false)) {
            Log.d("Check123", "referrerUrl = 3");
            return;
        }
        Log.d("Check123", "referrerUrl = 4");
        final InstallReferrerClient a2 = InstallReferrerClient.d(this).a();
        this.D1.execute(new Runnable() { // from class: o.Pa2
            @Override // java.lang.Runnable
            public final void run() {
                SplashActivity.this.Z1(a2);
            }
        });
    }

    public void Z1(InstallReferrerClient installReferrerClient) {
        Log.d("Check123", "referrerUrl = 5");
        installReferrerClient.e(new d(installReferrerClient));
    }

    public final void a2(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("interstitial_id");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("native_id");
        JSONArray optJSONArray3 = jSONObject.optJSONArray("app_open_id");
        JSONArray optJSONArray4 = jSONObject.optJSONArray("back_interstitial_id");
        JSONArray optJSONArray5 = jSONObject.optJSONArray("bottom_native_id");
        JSONArray optJSONArray6 = jSONObject.optJSONArray("banner_id");
        JSONArray optJSONArray7 = jSONObject.optJSONArray("fb_interstitial_id");
        JSONArray optJSONArray8 = jSONObject.optJSONArray("fb_native_id");
        JSONArray optJSONArray9 = jSONObject.optJSONArray("fb_native_banner_id");
        try {
            if (optJSONArray3 != null) {
                for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                    this.I1.add(optJSONArray3.optString(i2));
                }
            } else {
                Log.d("getfirebaseid", "admobInterstitialIdArray is null");
            }
            try {
                if (optJSONArray4 != null) {
                    for (int i3 = 0; i3 < optJSONArray4.length(); i3++) {
                        this.J1.add(optJSONArray4.optString(i3));
                    }
                } else {
                    Log.d("getfirebaseid", "admobInterstitialIdArray is null");
                }
                try {
                    if (optJSONArray != null) {
                        for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                            this.H1.add(optJSONArray.optString(i4));
                        }
                    } else {
                        Log.d("getfirebaseid", "admobInterstitialIdArray is null");
                    }
                    try {
                        if (optJSONArray2 != null) {
                            for (int i5 = 0; i5 < optJSONArray2.length(); i5++) {
                                this.G1.add(optJSONArray2.optString(i5));
                            }
                        } else {
                            Log.d("getfirebaseid", "admobInterstitialIdArray is null");
                        }
                        try {
                            if (optJSONArray5 != null) {
                                for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                                    this.L1.add(optJSONArray5.optString(i6));
                                    Log.d("getfirebaseid", "bottom id list get:----" + this.L1.get(i6));
                                }
                            } else {
                                Log.d("getfirebaseid", "elsee:----");
                            }
                            try {
                                if (optJSONArray6 != null) {
                                    for (int i7 = 0; i7 < optJSONArray6.length(); i7++) {
                                        this.K1.add(optJSONArray6.optString(i7));
                                    }
                                } else {
                                    Log.d("getfirebaseid", "admobInterstitialIdArray is null");
                                }
                                try {
                                    if (optJSONArray7 != null) {
                                        for (int i8 = 0; i8 < optJSONArray7.length(); i8++) {
                                            this.M1.add(optJSONArray7.optString(i8));
                                        }
                                    } else {
                                        Log.d("getfirebaseid", "admobInterstitialIdArray is null");
                                    }
                                    try {
                                        if (optJSONArray8 != null) {
                                            for (int i9 = 0; i9 < optJSONArray8.length(); i9++) {
                                                this.O1.add(optJSONArray8.optString(i9));
                                            }
                                        } else {
                                            Log.d("getfirebaseid", "admobInterstitialIdArray is null");
                                        }
                                        try {
                                            if (optJSONArray9 != null) {
                                                for (int i10 = 0; i10 < optJSONArray9.length(); i10++) {
                                                    this.N1.add(optJSONArray9.optString(i10));
                                                }
                                            } else {
                                                Log.d("getfirebaseid", "admobInterstitialIdArray is null");
                                            }
                                            C2723Dd.J1(this.I1);
                                            C2723Dd.N1(this.H1);
                                            C2723Dd.K1(this.J1);
                                            C2723Dd.O1(this.G1);
                                            C2723Dd.M1(this.L1);
                                            C2723Dd.L1(this.K1);
                                            C2723Dd.P1(this.M1);
                                            C2723Dd.R1(this.O1);
                                            C2723Dd.Q1(this.N1);
                                        } catch (Exception e2) {
                                            throw new RuntimeException(e2);
                                        }
                                    } catch (Exception e3) {
                                        throw new RuntimeException(e3);
                                    }
                                } catch (Exception e4) {
                                    throw new RuntimeException(e4);
                                }
                            } catch (Exception e5) {
                                throw new RuntimeException(e5);
                            }
                        } catch (Exception e6) {
                            throw new RuntimeException(e6);
                        }
                    } catch (Exception e7) {
                        throw new RuntimeException(e7);
                    }
                } catch (Exception e8) {
                    throw new RuntimeException(e8);
                }
            } catch (Exception e9) {
                throw new RuntimeException(e9);
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void b2() {
        C6747hE2.e(this);
        C6747hE2.f(new e());
    }

    public final void c2(JSONObject jSONObject, String str, List<String> list) throws Exception {
        list.clear();
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            list.add(jSONArray.getString(i2));
        }
    }

    public String d2(String str) {
        return str.split("=", 2)[0];
    }

    public String e2(String str) {
        String str2;
        String[] split = str.split("=", 2);
        if (split.length > 1 && (str2 = split[1]) != null) {
            return str2;
        }
        return "";
    }

    public final void f2() {
        try {
            FirebaseMessaging.u().M("video_call").e(new f());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        Signature[] signatureArr;
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_splash);
        MyApplication.Z0 = true;
        try {
            X1();
        } catch (Exception unused) {
        }
        try {
            for (Signature signature : getPackageManager().getPackageInfo(getPackageName(), 64).signatures) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                messageDigest.update(signature.toByteArray());
                Log.d("KeyHash:", Base64.encodeToString(messageDigest.digest(), 0));
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused2) {
        }
        if (C6747hE2.g(this)) {
            f2();
            Q1();
        } else {
            b2();
        }
        R().d(this, new c(true));
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onResume() {
        super.onResume();
        C5036aE2.s(this, getClass().getSimpleName(), getClass().getSimpleName());
    }
}
