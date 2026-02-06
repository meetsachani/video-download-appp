package o;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.MessagingAnalytics;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: o.vM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10201vM {
    public static final String a = "ContextCompat";
    public static final Object b = new Object();
    public static final String c = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 4;

    /* renamed from: o.vM$a */
    /* loaded from: classes.dex */
    public static class a {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i) {
            return context.getDrawable(i);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: o.vM$b */
    /* loaded from: classes.dex */
    public static class b {
        public static int a(Context context, int i) {
            return context.getColor(i);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: o.vM$c */
    /* loaded from: classes.dex */
    public static class c {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: o.vM$d */
    /* loaded from: classes.dex */
    public static class d {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            if ((i & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, C10201vM.v(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }

        public static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: o.vM$e */
    /* loaded from: classes.dex */
    public static class e {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* renamed from: o.vM$f */
    /* loaded from: classes.dex */
    public static class f {
        public static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String b(Context context) {
            return context.getAttributionTag();
        }

        public static Display c(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Log.w(C10201vM.a, "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    /* renamed from: o.vM$g */
    /* loaded from: classes.dex */
    public static class g {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }

    /* renamed from: o.vM$h */
    /* loaded from: classes.dex */
    public static final class h {
        public static final HashMap<Class<?>, String> a;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            a = hashMap;
            hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
            hashMap.put(UsageStatsManager.class, "usagestats");
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, androidx.appcompat.widget.b.r);
            hashMap.put(AlarmManager.class, C3771Nr1.K0);
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, FirebaseAnalytics.Param.s);
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, MessagingAnalytics.b);
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vM$i */
    /* loaded from: classes.dex */
    public @interface i {
    }

    @JR1(expression = "context.startActivity(intent, options)")
    @Deprecated
    public static void A(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void B(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            d.b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static int a(Context context, String str) {
        C2691Ct1.e(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            if (C4551Vr1.q(context).a()) {
                return 0;
            }
            return -1;
        }
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static Context b(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.a(context, str);
        }
        return context;
    }

    public static Context c(Context context) {
        return c.a(context);
    }

    public static File d(File file) {
        synchronized (b) {
            try {
                if (!file.exists()) {
                    if (file.mkdirs()) {
                        return file;
                    }
                    Log.w(a, "Unable to create files subdir " + file.getPath());
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String e(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.b(context);
        }
        return null;
    }

    public static File f(Context context) {
        return a.a(context);
    }

    public static int g(Context context, int i2) {
        return b.a(context, i2);
    }

    public static ColorStateList h(Context context, int i2) {
        return C10231vT1.f(context.getResources(), i2, context.getTheme());
    }

    public static Context i(Context context) {
        C9637t21 a2 = C10612x21.a(context);
        if (Build.VERSION.SDK_INT <= 32 && !a2.j()) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            VJ.b(configuration, a2);
            return context.createConfigurationContext(configuration);
        }
        return context;
    }

    public static File j(Context context) {
        return c.b(context);
    }

    public static Display k(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.c(context);
        }
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable l(Context context, int i2) {
        return a.b(context, i2);
    }

    @JR1(expression = "context.getExternalCacheDirs()")
    @Deprecated
    public static File[] m(Context context) {
        return context.getExternalCacheDirs();
    }

    @JR1(expression = "context.getExternalFilesDirs(type)")
    @Deprecated
    public static File[] n(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor o(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.a(context);
        }
        return C6851hg0.a(new Handler(context.getMainLooper()));
    }

    public static File p(Context context) {
        return a.c(context);
    }

    @JR1(expression = "context.getObbDirs()")
    @Deprecated
    public static File[] q(Context context) {
        return context.getObbDirs();
    }

    public static String r(Context context, int i2) {
        return i(context).getString(i2);
    }

    public static <T> T s(Context context, Class<T> cls) {
        return (T) b.b(context, cls);
    }

    public static String t(Context context, Class<?> cls) {
        return b.c(context, cls);
    }

    public static boolean u(Context context) {
        return c.c(context);
    }

    public static String v(Context context) {
        String str = context.getApplicationContext().getPackageName() + c;
        if (EC1.d(context, str) != 0) {
            if (Build.VERSION.SDK_INT >= 29) {
                str = C9958uM.a(context) + c;
                if (EC1.d(context, str) == 0) {
                    return str;
                }
            }
            throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
        }
        return str;
    }

    public static Intent w(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i2) {
        return x(context, broadcastReceiver, intentFilter, null, null, i2);
    }

    public static Intent x(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) {
        int i3 = i2 & 1;
        if (i3 != 0 && (i2 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i3 != 0) {
            i2 |= 2;
        }
        int i4 = i2;
        int i5 = i4 & 2;
        if (i5 == 0 && (i4 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i5 != 0 && (i4 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            return g.a(context, broadcastReceiver, intentFilter, str, handler, i4);
        }
        if (i6 >= 26) {
            return d.a(context, broadcastReceiver, intentFilter, str, handler, i4);
        }
        if ((i4 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, v(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static boolean y(Context context, Intent[] intentArr) {
        return z(context, intentArr, null);
    }

    public static boolean z(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
