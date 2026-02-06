package com.google.android.gms.ads.internal.util.client;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.b;
import com.facebook.internal.l0;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzfnr;
import com.google.android.gms.internal.ads.zzfrl;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.messaging.GmsRpc;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import o.BU0;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceMenuC9553sh2;
import o.UE;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzf {
    public static final Handler b = new zzfrl(Looper.getMainLooper());
    public static final String c = AdView.class.getName();
    public static final String d = InterstitialAd.class.getName();
    public static final String e = AdManagerAdView.class.getName();
    public static final String f = AdManagerInterstitialAd.class.getName();
    public static final String g = zzfnr.class.getName();
    public static final String h = AdLoader.class.getName();
    public float a = -1.0f;

    public static final boolean A() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static final int B(DisplayMetrics displayMetrics, int i) {
        return Math.round(i / displayMetrics.density);
    }

    public static final void C(Context context, @InterfaceC11300zs1 String str, String str2, Bundle bundle, boolean z, zze zzeVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString(BU0.f, Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString(GmsRpc.w, applicationContext.getPackageName());
        if (str == null) {
            str = GoogleApiAvailabilityLight.i().b(context) + ".251815200";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzeVar.w(appendQueryParameter.toString());
    }

    public static final int D(Context context, int i) {
        return v(context.getResources().getDisplayMetrics(), i);
    }

    @InterfaceC11300zs1
    public static final String E(Context context) {
        String string;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            string = null;
        } else {
            string = Settings.Secure.getString(contentResolver, "android_id");
        }
        return a((string == null || x()) ? "emulator" : "emulator", "MD5");
    }

    @InterfaceC11300zs1
    public static String a(String str, String str2) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static final void e(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, @InterfaceC11300zs1 String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int D = D(context, 3);
        int i3 = zzrVar.a1;
        int i4 = zzrVar.Z;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(i3 - D, i4 - D, 17));
        viewGroup.addView(frameLayout, i3, i4);
    }

    public static int f(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context != null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && (configuration = resources.getConfiguration()) != null) {
                int i2 = configuration.orientation;
                if (i == 0) {
                    i = i2;
                }
                if (i == i2) {
                    return Math.round(displayMetrics.heightPixels / displayMetrics.density);
                }
                return Math.round(displayMetrics.widthPixels / displayMetrics.density);
            }
            return -1;
        }
        return -1;
    }

    @InterfaceC11300zs1
    public static ActivityManager.MemoryInfo h(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService(b.r)) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (NullPointerException unused) {
            zzo.g("Error retrieving the memory information.");
            return memoryInfo;
        }
    }

    public static AdSize i(Context context, int i, int i2, int i3) {
        int round;
        int f2 = f(context, i3);
        if (f2 == -1) {
            return AdSize.s;
        }
        int min = Math.min(90, Math.round(f2 * 0.15f));
        if (i > 655) {
            round = Math.round((i / 728.0f) * 90.0f);
        } else if (i > 632) {
            round = 81;
        } else if (i > 526) {
            round = Math.round((i / 468.0f) * 60.0f);
        } else if (i > 432) {
            round = 68;
        } else {
            round = Math.round((i / 320.0f) * 50.0f);
        }
        return new AdSize(i, Math.max(Math.min(round, min), 50));
    }

    public static Object j(Map map, Object obj, Object obj2) {
        if (map.containsKey(obj)) {
            return map.get(obj);
        }
        return obj2;
    }

    public static String k() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    @InterfaceC11300zs1
    public static String l(String str) {
        return a(str, "MD5");
    }

    @InterfaceC11300zs1
    public static String m(String str) {
        return a(str, l0.e);
    }

    @InterfaceC5056aJ2
    public static boolean u(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbfe.d.e());
    }

    public static final int v(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public static final String w(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i < stackTraceElementArr.length) {
                StackTraceElement stackTraceElement = stackTraceElementArr[i2];
                String className = stackTraceElement.getClassName();
                if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!c.equalsIgnoreCase(className) && !d.equalsIgnoreCase(className) && !e.equalsIgnoreCase(className) && !f.equalsIgnoreCase(className) && !g.equalsIgnoreCase(className) && !h.equalsIgnoreCase(className))) {
                    i2 = i;
                }
            } else {
                str2 = null;
                break;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, UE.h);
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i3 = 2; i3 > 0 && stringTokenizer.hasMoreElements(); i3--) {
                    sb.append(UE.h);
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean x() {
        boolean booleanValue = ((Boolean) zzbd.c().b(zzbcv.Jb)).booleanValue();
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            if (str.contains("generic") || str.contains("emulator")) {
                return true;
            }
            if (booleanValue && Build.HARDWARE.contains(CommonUtils.c)) {
                return true;
            }
            return false;
        }
        return Build.DEVICE.startsWith("generic");
    }

    public static final boolean y(Context context, int i) {
        if (GoogleApiAvailabilityLight.i().k(context, i) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean z(Context context) {
        int k = GoogleApiAvailabilityLight.i().k(context, GooglePlayServicesUtilLight.a);
        if (k != 0 && k != 2) {
            return false;
        }
        return true;
    }

    public final JSONArray b(Collection collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : collection) {
            c(jSONArray, obj);
        }
        return jSONArray;
    }

    public final void c(JSONArray jSONArray, @InterfaceC11300zs1 Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(o((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(p((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(b((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(n((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    public final void d(JSONObject jSONObject, String str, @InterfaceC11300zs1 Object obj) throws JSONException {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) zzbd.c().b(zzbcv.p)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, o((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, p((Map) obj));
        } else if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), b((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, b(Arrays.asList((Object[]) obj)));
        } else {
            int i = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    numArr = new Integer[0];
                } else {
                    int length = iArr.length;
                    Integer[] numArr2 = new Integer[length];
                    while (i < length) {
                        numArr2[i] = Integer.valueOf(iArr[i]);
                        i++;
                    }
                    numArr = numArr2;
                }
                jSONObject.put(str, n(numArr));
            } else if (obj instanceof double[]) {
                double[] dArr2 = (double[]) obj;
                if (dArr2 == null) {
                    dArr = new Double[0];
                } else {
                    int length2 = dArr2.length;
                    Double[] dArr3 = new Double[length2];
                    while (i < length2) {
                        dArr3[i] = Double.valueOf(dArr2[i]);
                        i++;
                    }
                    dArr = dArr3;
                }
                jSONObject.put(str, n(dArr));
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    lArr = new Long[0];
                } else {
                    int length3 = jArr.length;
                    Long[] lArr2 = new Long[length3];
                    while (i < length3) {
                        lArr2[i] = Long.valueOf(jArr[i]);
                        i++;
                    }
                    lArr = lArr2;
                }
                jSONObject.put(str, n(lArr));
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    boolArr = new Boolean[0];
                } else {
                    int length4 = zArr.length;
                    Boolean[] boolArr2 = new Boolean[length4];
                    while (i < length4) {
                        boolArr2[i] = Boolean.valueOf(zArr[i]);
                        i++;
                    }
                    boolArr = boolArr2;
                }
                jSONObject.put(str, n(boolArr));
            } else {
                jSONObject.put(str, obj);
            }
        }
    }

    public final int g(Context context, int i) {
        if (this.a < 0.0f) {
            synchronized (this) {
                try {
                    if (this.a < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.a = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i / this.a);
    }

    @InterfaceC5056aJ2
    public final JSONArray n(Object[] objArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            c(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject o(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            d(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject p(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                d(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e2) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e2.getMessage())));
        }
    }

    public final JSONObject q(@InterfaceC11300zs1 Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return o(bundle);
            } catch (JSONException e2) {
                zzo.e("Error converting Bundle to JSON", e2);
            }
        }
        return null;
    }

    public final void r(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        if (str2 != null) {
            zzo.g(str2);
        }
        e(viewGroup, zzrVar, str, InterfaceMenuC9553sh2.c, -16777216);
    }

    public final void s(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, @InterfaceC11300zs1 String str) {
        e(viewGroup, zzrVar, "Ads by Google", -16777216, -1);
    }

    public final void t(Context context, @InterfaceC11300zs1 String str, String str2, Bundle bundle, boolean z) {
        C(context, str, "gmob-apps", bundle, true, new zze() { // from class: com.google.android.gms.ads.internal.util.client.zzc
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final zzt w(String str3) {
                new zzd(zzf.this, str3).start();
                return zzt.SUCCESS;
            }
        });
    }
}
