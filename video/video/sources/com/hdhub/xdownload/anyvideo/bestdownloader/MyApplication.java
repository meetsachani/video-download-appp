package com.hdhub.xdownload.anyvideo.bestdownloader;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o.C10537wk;
import o.C2723Dd;
import o.C2879Er1;
import o.C3086Gr1;
import o.C3710Nc0;
import o.C3771Nr1;
import o.C6747hE2;
import o.C9291rd;
import o.I7;
import o.TD0;

/* loaded from: classes3.dex */
public class MyApplication extends Application {
    public static boolean Y0 = false;
    public static final String Z = "downloadServiceID";
    public static boolean Z0 = false;
    public static boolean a1 = false;
    public static String b1 = "";
    public static MyApplication c1;
    public ExecutorService X = Executors.newFixedThreadPool(4);
    public int Y = 0;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyApplication.b1 = C3710Nc0.a(C3710Nc0.a);
            Log.d("de_encrypurl", "onCreate:decrypted " + MyApplication.b1);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Application.ActivityLifecycleCallbacks {

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public final /* synthetic */ Activity X;

            public a(Activity activity) {
                this.X = activity;
            }

            @Override // java.lang.Runnable
            public void run() {
                C10537wk.d(this.X);
            }
        }

        /* renamed from: com.hdhub.xdownload.anyvideo.bestdownloader.MyApplication$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0147b implements C6747hE2.g {
            public final /* synthetic */ Activity a;

            public C0147b(Activity activity) {
                this.a = activity;
            }

            @Override // o.C6747hE2.g
            public void a() {
                if (C6747hE2.g(this.a)) {
                    C6747hE2.a.dismiss();
                }
            }
        }

        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Log.d("App_Controller", "onActivityCreated");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Log.d("App_Controller", "onActivityDestroyed");
            if (MyApplication.this.Y == 0) {
                Log.d("App_Controller", "onActivityDestroyed 1 1 =");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Log.d("App_Controller", "onActivityPaused");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Log.d("Splash_app_open", "onActivityResumed  " + MyApplication.Y0);
            MyApplication.Y0 = MyApplication.Y0 ^ true;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Log.d("App_Controller", "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Log.d("Splash_app_open", "splash_open_boolean  " + MyApplication.Y0);
            Log.d("Splash_app_open", "fast_start_check  " + MyApplication.Z0);
            MyApplication.a1 = true;
            if (!C2723Dd.y() && MyApplication.Y0 && MyApplication.this.Y == 0) {
                if (!MyApplication.Z0) {
                    if (C6747hE2.g(activity)) {
                        new Handler().postDelayed(new a(activity), 100L);
                    } else {
                        Dialog dialog = C6747hE2.a;
                        if (dialog != null && dialog.isShowing()) {
                            return;
                        }
                        C6747hE2.e(activity);
                        C6747hE2.f(new C0147b(activity));
                    }
                } else if (C9291rd.d) {
                    if (!I7.d.booleanValue()) {
                        Log.d("fast_start", "fast_start 3 = " + MyApplication.Z0 + TD0.a.Y0 + I7.d);
                        if (I7.d.booleanValue()) {
                            MyApplication.Z0 = false;
                        } else {
                            I7.h(Boolean.TRUE);
                        }
                    } else {
                        I7.h(Boolean.TRUE);
                    }
                }
            }
            MyApplication.this.Y++;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Log.d("App_Controller", "onActivityStopped= " + MyApplication.this.Y);
            if (!C2723Dd.y()) {
                MyApplication myApplication = MyApplication.this;
                myApplication.Y--;
                if (MyApplication.this.Y == 0) {
                    Log.d("App_Controller", C3771Nr1.A.C);
                }
            }
        }
    }

    public static synchronized MyApplication f() {
        MyApplication myApplication;
        synchronized (MyApplication.class) {
            synchronized (MyApplication.class) {
                myApplication = c1;
            }
            return myApplication;
        }
        return myApplication;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void c() {
        registerActivityLifecycleCallbacks(new b());
    }

    public final void d() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel a2 = C3086Gr1.a(Z, "Download Notifications", 2);
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                C2879Er1.a(notificationManager, a2);
            }
        }
    }

    public void e() {
        this.X.execute(new a());
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        c1 = this;
        c();
        e();
        d();
    }
}
