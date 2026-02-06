package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.appcompat.widget.b;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbcm;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbdw;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzces;
import com.google.android.gms.internal.ads.zzcge;
import com.google.android.gms.internal.ads.zzcgu;
import com.google.android.gms.internal.ads.zzdpg;
import com.google.android.gms.internal.ads.zzdsc;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzfbu;
import com.google.android.gms.internal.ads.zzfbx;
import com.google.android.gms.internal.ads.zzfrl;
import com.google.android.gms.internal.ads.zzfun;
import com.google.android.gms.internal.ads.zzfvr;
import com.google.android.gms.internal.ads.zzfvt;
import com.google.android.gms.internal.ads.zzgcy;
import com.google.android.gms.internal.ads.zzhgl;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import o.C10229vT;
import o.C4500Ve2;
import o.C9811tl1;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;
import o.InterfaceFutureC8411o11;
import o.KD2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.helper.CookieUtil;

/* loaded from: classes2.dex */
public final class zzs {
    public static final zzfrl l = new zzf(Looper.getMainLooper());
    @InterfaceC8710pF0("userAgentLock")
    public String g;
    public volatile String h;
    public final AtomicReference a = new AtomicReference(null);
    public final AtomicReference b = new AtomicReference(null);
    public final AtomicReference c = new AtomicReference(new Bundle());
    public final AtomicBoolean d = new AtomicBoolean();
    public boolean e = true;
    public final Object f = new Object();
    public boolean i = false;
    public boolean j = false;
    public final Executor k = Executors.newSingleThreadExecutor();

    public static int A(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i > 0) {
            int i2 = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
            return 60000;
        }
        return 60000;
    }

    @InterfaceC11300zs1
    public static Bundle B(Context context) throws RemoteException {
        try {
            return Wrappers.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.l("Error getting metadata", e);
            return null;
        }
    }

    public static String C(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            if (!TextUtils.isEmpty(string)) {
                if (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) {
                    return string;
                }
                return "";
            }
            return "";
        }
        return "";
    }

    public static boolean D(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static final void E(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static final void F(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final String G(final Context context, String str) {
        String str2;
        String str3;
        if (str != null) {
            try {
                zzcg a = zzcg.a();
                if (TextUtils.isEmpty(a.a)) {
                    if (ClientLibraryUtils.c()) {
                        str3 = (String) zzcd.a(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzce
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Context context2 = context;
                                SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                String string = sharedPreferences.getString("user_agent", "");
                                if (TextUtils.isEmpty(string)) {
                                    zze.k("User agent is not initialized on Google Play Services. Initializing.");
                                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                                    SharedPreferencesUtils.a(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                                    return defaultUserAgent;
                                }
                                zze.k("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                        });
                    } else {
                        final Context i = GooglePlayServicesUtilLight.i(context);
                        str3 = (String) zzcd.a(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcf
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                SharedPreferences sharedPreferences;
                                Context context2 = i;
                                Context context3 = context;
                                boolean z = false;
                                if (context2 != null) {
                                    zze.k("Attempting to read user agent from Google Play Services.");
                                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                } else {
                                    zze.k("Attempting to read user agent from local cache.");
                                    sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                    z = true;
                                }
                                String string = sharedPreferences.getString("user_agent", "");
                                if (TextUtils.isEmpty(string)) {
                                    zze.k("Reading user agent from WebSettings");
                                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context3);
                                    if (z) {
                                        sharedPreferences.edit().putString("user_agent", defaultUserAgent).apply();
                                        zze.k("Persisting user agent.");
                                    }
                                    return defaultUserAgent;
                                }
                                return string;
                            }
                        });
                    }
                    a.a = str3;
                }
                str2 = a.a;
            } catch (Exception unused) {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = WebSettings.getDefaultUserAgent(context);
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = X();
            }
            String str4 = str2 + " (Mobile; " + str;
            try {
                if (Wrappers.a(context).g()) {
                    str4 = str4 + ";aia";
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzv.t().x(e, "AdUtil.getUserAgent");
            }
            return str4.concat(C9811tl1.d);
        }
        return X();
    }

    public static List J() {
        zzbcm zzbcmVar = zzbcv.a;
        List<String> b = com.google.android.gms.ads.internal.client.zzbd.a().b();
        ArrayList arrayList = new ArrayList();
        for (String str : b) {
            for (String str2 : zzfvr.b(zzfun.c(',')).d(str)) {
                try {
                    arrayList.add(Long.valueOf(str2));
                } catch (NumberFormatException unused) {
                    zze.k("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static void N(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzcaa.a.execute(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean U(View view) {
        Activity activity;
        View rootView = view.getRootView();
        WindowManager.LayoutParams layoutParams = null;
        if (rootView != null) {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity != null) {
                    return false;
                }
                Window window = activity.getWindow();
                if (window != null) {
                    layoutParams = window.getAttributes();
                }
                if (layoutParams == null || (layoutParams.flags & 524288) == 0) {
                    return false;
                }
                return true;
            }
        }
        activity = null;
        if (activity != null) {
        }
    }

    public static final void V(Context context, Intent intent) {
        Bundle bundle;
        if (intent == null) {
            return;
        }
        if (intent.getExtras() != null) {
            bundle = intent.getExtras();
        } else {
            bundle = new Bundle();
        }
        bundle.putBinder(C10229vT.d, null);
        bundle.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(bundle);
    }

    public static final String W(Context context) throws RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return C(B(context));
    }

    public static final String X() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(C4500Ve2.b);
            sb.append(str);
        }
        sb.append(CookieUtil.b);
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append(CookieUtil.b);
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String Y() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + C4500Ve2.b + str2;
    }

    @InterfaceC11300zs1
    public static final Integer Z(Context context) {
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    @InterfaceC11300zs1
    public static final zzbr a(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(newInstance instanceof IBinder)) {
                int i = zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            if (queryLocalInterface instanceof zzbr) {
                return (zzbr) queryLocalInterface;
            }
            return new zzbp(iBinder);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final DisplayMetrics a0(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final boolean b(Context context, String str) {
        Context a = zzbvv.a(context);
        if (Wrappers.a(a).b(str, a.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    public static final int[] b0() {
        return new int[]{0, 0};
    }

    public static final boolean c(Context context) {
        try {
            return DeviceProperties.b(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final Map c0(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
    }

    public static final boolean d(String str) {
        if (!com.google.android.gms.ads.internal.util.client.zzl.k()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s5)).booleanValue()) {
            return false;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.u5);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.t5);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final long d0(View view) {
        float f;
        int i;
        float f2 = Float.MAX_VALUE;
        ViewParent viewParent = view;
        do {
            f = 0.0f;
            if (!(viewParent instanceof View)) {
                break;
            }
            View view2 = viewParent;
            f2 = Math.min(f2, view2.getAlpha());
            i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            viewParent = view2.getParent();
        } while (i > 0);
        if (f2 >= 0.0f) {
            f = f2;
        }
        return Math.round(f * 100.0f);
    }

    public static final boolean e(Context context) {
        KeyguardManager z;
        if (context == null || (z = z(context)) == null || !z.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    @InterfaceC11300zs1
    public static final WebResourceResponse e0(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzv.v().I(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).b(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            int i = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public static final boolean f(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error loading class.", th);
            com.google.android.gms.ads.internal.zzv.t().x(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final String f0() {
        Resources f = com.google.android.gms.ads.internal.zzv.t().f();
        if (f != null) {
            return f.getString(R.string.s7);
        }
        return "Test Ad";
    }

    public static final boolean g() {
        int myUid = Process.myUid();
        if (myUid != 0 && myUid != 1000) {
            return false;
        }
        return true;
    }

    public static final boolean h(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(b.r);
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        if (powerManager.isScreenOn()) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean i(Context context) {
        try {
            Bundle B = B(context);
            String string = B.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(C(B))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean j(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void k(View view, int i, MotionEvent motionEvent) {
        String str;
        int i2;
        int i3;
        int i4;
        String str2;
        zzfbu F;
        zzfbx I;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view2.getContext().getPackageName();
            if (view2 instanceof zzdpg) {
                view2 = ((zzdpg) view2).getChildAt(0);
            }
            if (!(view2 instanceof com.google.android.gms.ads.formats.zzj) && !(view2 instanceof NativeAdView)) {
                str = "UNKNOWN";
                i2 = 0;
            } else {
                str = "NATIVE";
                i2 = 1;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i4 = rect.width();
                i3 = rect.height();
            } else {
                i3 = 0;
                i4 = 0;
            }
            com.google.android.gms.ads.internal.zzv.v();
            long d0 = d0(view2);
            view2.getLocationOnScreen(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            String str3 = "none";
            if (!(view2 instanceof zzcge) || (I = ((zzcge) view2).I()) == null) {
                str2 = "none";
            } else {
                str2 = I.b;
                view2.setContentDescription(str2 + ":" + view2.hashCode());
            }
            if ((view2 instanceof zzces) && (F = ((zzces) view2).F()) != null) {
                str = zzfbu.a(F.b);
                i2 = F.e;
                str3 = F.E;
            }
            String format = String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i4), Integer.valueOf(i3), Long.valueOf(d0), Integer.toString(i, 2));
            int i7 = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.f(format);
        } catch (Exception e) {
            int i8 = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder l(Context context) {
        com.google.android.gms.ads.internal.zzv.w();
        return new AlertDialog.Builder(context, 16974374);
    }

    public static final void m(Context context, String str, String str2) {
        new zzbw(context, str, str2, null, null).b();
    }

    public static final void n(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) zzbfe.b.e()).booleanValue()) {
                    CrashUtils.a(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final boolean o(@InterfaceC11300zs1 zzfbu zzfbuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Bd)).booleanValue() && zzfbuVar != null && zzfbuVar.e == 4) {
            return true;
        }
        return false;
    }

    public static final int p(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String concat = "Could not parse value:".concat(e.toString());
            int i = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g(concat);
            return 0;
        }
    }

    @InterfaceC11300zs1
    public static final Map q(Uri uri) {
        String encodedQuery;
        String decode;
        if (uri == null) {
            return null;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q)).booleanValue()) {
            HashMap hashMap = new HashMap();
            if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
                int i = 0;
                while (true) {
                    int indexOf = encodedQuery.indexOf(38, i);
                    int length = encodedQuery.length();
                    if (indexOf != -1) {
                        length = indexOf;
                    }
                    int indexOf2 = encodedQuery.indexOf(61, i);
                    if (indexOf2 > length || indexOf2 == -1) {
                        indexOf2 = length;
                    }
                    String decode2 = Uri.decode(encodedQuery.substring(i, indexOf2));
                    if (indexOf2 == length) {
                        decode = "";
                    } else {
                        decode = Uri.decode(encodedQuery.substring(indexOf2 + 1, length));
                    }
                    hashMap.put(decode2, decode);
                    if (indexOf == -1) {
                        break;
                    }
                    i = indexOf + 1;
                }
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap2.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap2;
    }

    public static final int[] r(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window != null && (findViewById = window.findViewById(16908290)) != null) {
            return new int[]{findViewById.getWidth(), findViewById.getHeight()};
        }
        return b0();
    }

    public static final int[] s(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] b0 = (window == null || (findViewById = window.findViewById(16908290)) == null) ? b0() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzbb.b().g(activity, b0[0]), com.google.android.gms.ads.internal.client.zzbb.b().g(activity, b0[1])};
    }

    public static final boolean t(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z;
        if (com.google.android.gms.ads.internal.zzv.v().e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || U(view)) {
            z = true;
        } else {
            z = false;
        }
        long d0 = d0(view);
        if (view.getVisibility() != 0 || !view.isShown() || ((powerManager != null && !powerManager.isScreenOn()) || !z)) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y1)).booleanValue() && !view.getLocalVisibleRect(new Rect()) && !view.getGlobalVisibleRect(new Rect())) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Sa)).booleanValue()) {
            if (d0 < ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ua)).intValue()) {
                return false;
            }
        }
        return true;
    }

    public static final void u(Context context, Intent intent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.pb)).booleanValue()) {
            try {
                F(context, intent);
                return;
            } catch (SecurityException e) {
                int i = zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.h("", e);
                com.google.android.gms.ads.internal.zzv.t().x(e, "AdUtil.startActivityWithUnknownContext");
                return;
            }
        }
        F(context, intent);
    }

    public static final void v(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            V(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            int i = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            int i2 = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("No browser is found.", e);
        }
    }

    public static final int[] w(Activity activity) {
        int[] r = r(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzbb.b().g(activity, r[0]), com.google.android.gms.ads.internal.client.zzbb.b().g(activity, r[1])};
    }

    public static final boolean x(View view, Context context) {
        PowerManager powerManager;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            powerManager = (PowerManager) applicationContext.getSystemService("power");
        } else {
            powerManager = null;
        }
        return t(view, powerManager, z(context));
    }

    public static final void y(Context context, Intent intent, @InterfaceC11300zs1 zzdsd zzdsdVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.pd)).booleanValue() && (context instanceof zzcgu)) {
            try {
                Uri data = intent.getData();
                if (data != null && data.toString() != null) {
                    if (data.toString().matches((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.rd))) {
                        ((zzcgu) context).c(intent, 236);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.qd)).booleanValue() && zzdsdVar != null) {
                            zzdsc a = zzdsdVar.a();
                            a.b("action", "hila");
                            a.b("gqi", zzfvt.c(str));
                            a.i();
                            return;
                        }
                        return;
                    }
                }
                u(context, intent);
                return;
            } catch (ActivityNotFoundException e) {
                e = e;
                int i = zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Error occurred while starting activity for result", e);
                com.google.android.gms.ads.internal.zzv.t().x(e, "AdUtil.startActivityForResult");
                u(context, intent);
                return;
            } catch (SecurityException e2) {
                e = e2;
                int i2 = zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Error occurred while starting activity for result", e);
                com.google.android.gms.ads.internal.zzv.t().x(e, "AdUtil.startActivityForResult");
                u(context, intent);
                return;
            } catch (Exception e3) {
                int i3 = zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Error occurred while starting activity for result", e3);
                com.google.android.gms.ads.internal.zzv.t().x(e3, "AdUtil.startActivityForResult");
                u(context, intent);
                return;
            }
        }
        u(context, intent);
    }

    @InterfaceC11300zs1
    public static KeyguardManager z(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    public final InterfaceFutureC8411o11 H(final Uri uri) {
        return zzgcy.j(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfrl zzfrlVar = zzs.l;
                com.google.android.gms.ads.internal.zzv.v();
                return zzs.q(uri);
            }
        }, this.k);
    }

    public final String I(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Bb)).booleanValue()) {
            if (this.h != null) {
                return this.h;
            }
            this.h = G(context, str);
            return this.h;
        }
        synchronized (this.f) {
            try {
                String str2 = this.g;
                if (str2 != null) {
                    return str2;
                }
                String G = G(context, str);
                this.g = G;
                return G;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void M(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int A = A(i);
        int i2 = zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("HTTP timeout: " + A + " milliseconds.");
        httpURLConnection.setConnectTimeout(A);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(A);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", I(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void O(final Context context, @InterfaceC11300zs1 final String str, String str2, Bundle bundle, boolean z) {
        com.google.android.gms.ads.internal.zzv.v();
        bundle.putString("device", Y());
        zzbcm zzbcmVar = zzbcv.a;
        bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbd.a().a()));
        if (bundle.isEmpty()) {
            int i = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Empty or null bundle.");
        } else {
            final String str3 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Qa);
            if (!this.d.getAndSet(true)) {
                this.c.set(zzad.a(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        zzs.this.c.set(zzad.b(context, str3));
                    }
                }));
            }
            bundle.putAll((Bundle) this.c.get());
        }
        com.google.android.gms.ads.internal.client.zzbb.b();
        com.google.android.gms.ads.internal.util.client.zzf.C(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final com.google.android.gms.ads.internal.util.client.zzt w(String str4) {
                zzfrl zzfrlVar = zzs.l;
                com.google.android.gms.ads.internal.zzv.v();
                zzs.m(context, str, str4);
                return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
            }
        });
    }

    public final boolean P(String str) {
        zzbcm zzbcmVar = zzbcv.s0;
        return D(str, this.a, (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar));
    }

    public final boolean Q(String str) {
        zzbcm zzbcmVar = zzbcv.t0;
        return D(str, this.b, (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean R(Context context) {
        if (this.j) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbcv.a(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ob)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            KD2.a(context.getApplicationContext(), new zzp(this, null), intentFilter, 4);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(this, null), intentFilter);
        }
        this.j = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean S(Context context) {
        if (this.i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbcv.a(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ob)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            KD2.a(context.getApplicationContext(), new zzq(this, null), intentFilter, 4);
        } else {
            context.getApplicationContext().registerReceiver(new zzq(this, null), intentFilter);
        }
        this.i = true;
        return true;
    }

    public final int T(Context context, Uri uri) {
        if (context == null) {
            zze.k("Trying to open chrome custom tab on a null context");
            return 3;
        } else if (!(context instanceof Activity)) {
            E(context, uri);
            return 2;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q4)).booleanValue()) {
                C10229vT d = new C10229vT.i(com.google.android.gms.ads.internal.zzv.j().d()).d();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c5)).booleanValue()) {
                    com.google.android.gms.ads.internal.client.zzbb.b();
                    if (com.google.android.gms.ads.internal.util.client.zzf.x()) {
                        return 5;
                    }
                }
                d.a.setPackage(zzhgl.a(context));
                d.t(context, uri);
                return 5;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O4)).booleanValue()) {
                zzbdw zzbdwVar = new zzbdw();
                zzbdwVar.e(new zzo(this, zzbdwVar, context, uri));
                zzbdwVar.b((Activity) context);
                return 5;
            }
            E(context, uri);
            return 9;
        }
    }
}
