package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.C0376a;
import com.facebook.C2416z;
import com.facebook.S;
import com.facebook.internal.C2375u;
import com.facebook.internal.l0;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import o.C10219vQ1;
import o.C10763xf2;
import o.C6562gT0;
import o.C8077mf;
import o.C8319ne2;
import o.C9512sW1;
import o.C9545sf2;
import o.C9998uW1;
import o.EK;
import o.HB;
import o.InterfaceC9511sW0;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes2.dex */
public final class l0 {
    @NotNull
    public static final String b = "FacebookSDK";
    @NotNull
    public static final String c = "MD5";
    @NotNull
    public static final String d = "SHA-1";
    @NotNull
    public static final String e = "SHA-256";
    @NotNull
    public static final String f = "https";
    @NotNull
    public static final String g = "a2";
    @NotNull
    public static final String h = "UTF-8";
    public static final int i = 8192;
    public static final int j = 1800000;
    public static int l = 0;
    @Nullable
    public static Locale t = null;
    @NotNull
    public static final String u = ".+_cheets|cheets_.+";
    @NotNull
    public static final String v = "id,name,first_name,middle_name,last_name";
    @NotNull
    public static final String w = "id,name,profile_picture";
    @NotNull
    public static final l0 a = new l0();
    public static long m = -1;
    public static long n = -1;

    /* renamed from: o  reason: collision with root package name */
    public static long f115o = -1;
    @NotNull
    public static String p = "";
    @NotNull
    public static String q = "";
    @NotNull
    public static final String k = "NoCarrier";
    @NotNull
    public static String r = k;
    @Nullable
    public static String s = "";

    /* loaded from: classes2.dex */
    public interface a {
        void a(@Nullable JSONObject jSONObject);

        void b(@Nullable C2416z c2416z);
    }

    @InterfaceC9511sW0
    public static final long A(@NotNull Uri uri) {
        C6562gT0.p(uri, "contentUri");
        Cursor cursor = null;
        try {
            com.facebook.M m2 = com.facebook.M.a;
            cursor = com.facebook.M.n().getContentResolver().query(uri, null, null, null, null);
            if (cursor == null) {
                return 0L;
            }
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            long j2 = cursor.getLong(columnIndex);
            cursor.close();
            return j2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Locale B() {
        Locale O = O();
        if (O == null) {
            Locale locale = Locale.getDefault();
            C6562gT0.o(locale, "getDefault()");
            return locale;
        }
        return O;
    }

    public static final boolean B0(File file, String str) {
        return Pattern.matches(C9512sW1.b, str);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final JSONObject D() {
        if (SQ.e(l0.class)) {
            return null;
        }
        try {
            com.facebook.M m2 = com.facebook.M.a;
            String string = com.facebook.M.n().getSharedPreferences(com.facebook.M.x, 0).getString(com.facebook.M.I, null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            SQ.c(th, l0.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String F(@Nullable String str) {
        com.facebook.M m2 = com.facebook.M.a;
        String z = com.facebook.M.z();
        if (str != null) {
            if (C6562gT0.g(str, com.facebook.M.P)) {
                return C9545sf2.z2(z, com.facebook.M.Q, "fb.gg", false, 4, null);
            }
            if (C6562gT0.g(str, com.facebook.M.O)) {
                return C9545sf2.z2(z, com.facebook.M.Q, com.facebook.M.S, false, 4, null);
            }
        }
        return z;
    }

    @InterfaceC9511sW0
    public static final void G0(@Nullable Runnable runnable) {
        try {
            com.facebook.M m2 = com.facebook.M.a;
            com.facebook.M.y().execute(runnable);
        } catch (Exception unused) {
        }
    }

    @InterfaceC9511sW0
    public static final void H(@NotNull final String str, @NotNull final a aVar) {
        C6562gT0.p(str, C9998uW1.m);
        C6562gT0.p(aVar, "callback");
        b0 b0Var = b0.a;
        JSONObject a2 = b0.a(str);
        if (a2 != null) {
            aVar.a(a2);
            return;
        }
        S.b bVar = new S.b() { // from class: com.facebook.internal.j0
            @Override // com.facebook.S.b
            public final void a(com.facebook.Y y) {
                l0.I(l0.a.this, str, y);
            }
        };
        com.facebook.S G = a.G(str);
        G.l0(bVar);
        G.n();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String H0(@Nullable JSONObject jSONObject, @Nullable String str) {
        if (jSONObject == null) {
            return "";
        }
        String optString = jSONObject.optString(str, "");
        C6562gT0.o(optString, "response.optString(propertyName, \"\")");
        return optString;
    }

    public static final void I(a aVar, String str, com.facebook.Y y) {
        C6562gT0.p(aVar, "$callback");
        C6562gT0.p(str, "$accessToken");
        C6562gT0.p(y, "response");
        if (y.g() != null) {
            aVar.b(y.g().q());
            return;
        }
        b0 b0Var = b0.a;
        JSONObject k2 = y.k();
        if (k2 != null) {
            b0.b(str, k2);
            aVar.a(y.k());
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @InterfaceC9511sW0
    public static final void I0(@NotNull JSONObject jSONObject, @Nullable C2358c c2358c, @Nullable String str, boolean z, @NotNull Context context) throws JSONException {
        C6562gT0.p(jSONObject, "params");
        C6562gT0.p(context, "context");
        C2375u c2375u = C2375u.a;
        C2375u.b bVar = C2375u.b.ServiceUpdateCompliance;
        if (!C2375u.g(bVar)) {
            jSONObject.put("anon_id", str);
        }
        jSONObject.put("application_tracking_enabled", !z);
        com.facebook.M m2 = com.facebook.M.a;
        jSONObject.put("advertiser_id_collection_enabled", com.facebook.M.m());
        if (c2358c != null) {
            if (C2375u.g(bVar)) {
                a.c(jSONObject, c2358c, str, context);
            }
            if (c2358c.j() != null) {
                if (C2375u.g(bVar)) {
                    a.d(jSONObject, c2358c, context);
                } else {
                    jSONObject.put("attribution", c2358c.j());
                }
            }
            if (c2358c.h() != null) {
                jSONObject.put(com.facebook.p0.g, c2358c.h());
                jSONObject.put("advertiser_tracking_enabled", !c2358c.l());
            }
            if (!c2358c.l()) {
                com.facebook.appevents.Q q2 = com.facebook.appevents.Q.a;
                String f2 = com.facebook.appevents.Q.f();
                if (f2.length() != 0) {
                    jSONObject.put("ud", f2);
                }
            }
            if (c2358c.i() != null) {
                jSONObject.put("installer_package", c2358c.i());
            }
        }
    }

    @InterfaceC9511sW0
    public static final void J0(@NotNull JSONObject jSONObject, @NotNull Context context) throws JSONException {
        Locale locale;
        String language;
        int i2;
        Display display;
        DisplayManager displayManager;
        String country;
        PackageInfo packageInfo;
        C6562gT0.p(jSONObject, "params");
        C6562gT0.p(context, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(g);
        a.D0(context);
        String packageName = context.getPackageName();
        int i3 = 0;
        int i4 = -1;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo == null) {
            return;
        }
        i4 = packageInfo.versionCode;
        s = packageInfo.versionName;
        jSONArray.put(packageName);
        jSONArray.put(i4);
        jSONArray.put(s);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        t = locale;
        StringBuilder sb = new StringBuilder();
        Locale locale2 = t;
        String str = "";
        if (locale2 == null || (language = locale2.getLanguage()) == null) {
            language = "";
        }
        sb.append(language);
        sb.append('_');
        Locale locale3 = t;
        if (locale3 != null && (country = locale3.getCountry()) != null) {
            str = country;
        }
        sb.append(str);
        jSONArray.put(sb.toString());
        jSONArray.put(p);
        jSONArray.put(r);
        double d2 = 0.0d;
        try {
            Object systemService = context.getSystemService("display");
            display = null;
            if (systemService instanceof DisplayManager) {
                displayManager = (DisplayManager) systemService;
            } else {
                displayManager = null;
            }
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            }
        } catch (Exception unused3) {
        }
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            int i5 = displayMetrics.widthPixels;
            try {
                i3 = displayMetrics.heightPixels;
                d2 = displayMetrics.density;
            } catch (Exception unused4) {
            }
            i2 = i3;
            i3 = i5;
            jSONArray.put(i3);
            jSONArray.put(i2);
            jSONArray.put(new DecimalFormat("#.##").format(d2));
            jSONArray.put(a.A0());
            jSONArray.put(n);
            jSONArray.put(f115o);
            jSONArray.put(q);
            jSONObject.put(EK.k, jSONArray.toString());
        }
        i2 = 0;
        jSONArray.put(i3);
        jSONArray.put(i2);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        jSONArray.put(a.A0());
        jSONArray.put(n);
        jSONArray.put(f115o);
        jSONArray.put(q);
        jSONObject.put(EK.k, jSONArray.toString());
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String K(@Nullable Context context) {
        m0 m0Var = m0.a;
        m0.s(context, "context");
        com.facebook.M m2 = com.facebook.M.a;
        return com.facebook.M.o();
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Method L(@NotNull Class<?> cls, @NotNull String str, @NotNull Class<?>... clsArr) {
        C6562gT0.p(cls, "clazz");
        C6562gT0.p(str, "methodName");
        C6562gT0.p(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Method M(@NotNull String str, @NotNull String str2, @NotNull Class<?>... clsArr) {
        C6562gT0.p(str, "className");
        C6562gT0.p(str2, "methodName");
        C6562gT0.p(clsArr, "parameterTypes");
        try {
            Class<?> cls = Class.forName(str);
            C6562gT0.o(cls, "clazz");
            return L(cls, str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Locale O() {
        try {
            com.facebook.M m2 = com.facebook.M.a;
            return com.facebook.M.n().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Object P(@NotNull JSONObject jSONObject, @Nullable String str, @Nullable String str2) throws JSONException {
        C6562gT0.p(jSONObject, "jsonObject");
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt != null && !(opt instanceof JSONObject) && !(opt instanceof JSONArray)) {
            if (str2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(str2, opt);
                return jSONObject2;
            }
            throw new C2416z("Got an unexpected non-JSON object.");
        }
        return opt;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String P0(@NotNull String str) {
        C6562gT0.p(str, "key");
        return a.T("SHA-1", str);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String Q(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String Q0(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "bytes");
        return a.U("SHA-1", bArr);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String R0(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return a.T(e, str);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String S0(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return a.U(e, bArr);
    }

    @InterfaceC9511sW0
    public static final boolean T0(@Nullable String str, @Nullable String str2) {
        boolean z;
        boolean z2;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (str2 != null && str2.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z && z2) {
            return true;
        }
        if (z || z2) {
            return false;
        }
        return C6562gT0.g(str, str2);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final JSONArray U0(@Nullable JSONObject jSONObject, @Nullable String str) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optJSONArray(str);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Object V(@Nullable Object obj, @NotNull Method method, @NotNull Object... objArr) {
        C6562gT0.p(method, "method");
        C6562gT0.p(objArr, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final JSONObject V0(@Nullable JSONObject jSONObject, @Nullable String str) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optJSONObject(str);
    }

    public static final boolean W() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            C8319ne2 c8319ne2 = C8319ne2.a;
            com.facebook.M m2 = com.facebook.M.a;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{com.facebook.M.o()}, 1));
            C6562gT0.o(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context n2 = com.facebook.M.n();
            PackageManager packageManager = n2.getPackageManager();
            String packageName = n2.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            C6562gT0.o(queryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (C6562gT0.g(packageName, resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final void W0(@NotNull Parcel parcel, @Nullable Map<String, String> map) {
        C6562gT0.p(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    @InterfaceC9511sW0
    public static /* synthetic */ void X() {
    }

    @InterfaceC9511sW0
    public static final void X0(@NotNull Parcel parcel, @Nullable Map<String, String> map) {
        C6562gT0.p(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    @InterfaceC9511sW0
    public static final boolean Y(@NotNull Context context) {
        AutofillManager a2;
        C6562gT0.p(context, "context");
        if (Build.VERSION.SDK_INT < 26 || (a2 = g0.a(context.getSystemService(f0.a()))) == null || !h0.a(a2) || !i0.a(a2)) {
            return false;
        }
        return true;
    }

    @InterfaceC9511sW0
    public static final boolean Z(@NotNull Context context) {
        C6562gT0.p(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null) {
            C6562gT0.o(str, "DEVICE");
            if (new C10219vQ1(u).m(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @InterfaceC9511sW0
    public static final boolean a0(@Nullable Uri uri) {
        if (uri != null && C9545sf2.c2("content", uri.getScheme(), true)) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    public static final boolean b0(@Nullable C0376a c0376a) {
        if (c0376a != null && C6562gT0.g(c0376a, C0376a.g1.i())) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    public static final boolean c0() {
        if (SQ.e(l0.class)) {
            return false;
        }
        try {
            JSONObject D = D();
            if (D == null) {
                return false;
            }
            try {
                JSONArray jSONArray = D.getJSONArray(com.facebook.M.I);
                int length = jSONArray.length();
                if (length > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        String string = jSONArray.getString(i2);
                        C6562gT0.o(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        C6562gT0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (C6562gT0.g(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i3 >= length) {
                            break;
                        }
                        i2 = i3;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            SQ.c(th, l0.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final boolean d0(@Nullable Uri uri) {
        if (uri != null && C9545sf2.c2("file", uri.getScheme(), true)) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    public static final <T> boolean e(@Nullable T t2, @Nullable T t3) {
        if (t2 == null) {
            if (t3 == null) {
                return true;
            }
            return false;
        }
        return C6562gT0.g(t2, t3);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final JSONObject f(@NotNull String str) {
        C6562gT0.p(str, C9998uW1.m);
        b0 b0Var = b0.a;
        JSONObject a2 = b0.a(str);
        if (a2 != null) {
            return a2;
        }
        com.facebook.Y l2 = a.G(str).l();
        if (l2.g() != null) {
            return null;
        }
        return l2.k();
    }

    @InterfaceC9511sW0
    public static final boolean f0(@Nullable String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Uri g(@Nullable String str, @Nullable String str2, @Nullable Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        C6562gT0.o(build, "builder.build()");
        return build;
    }

    @InterfaceC9511sW0
    public static final boolean g0(@Nullable Collection<?> collection) {
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    @InterfaceC9511sW0
    public static final boolean h0(@Nullable Uri uri) {
        if (uri != null) {
            if (C9545sf2.c2("http", uri.getScheme(), true) || C9545sf2.c2("https", uri.getScheme(), true) || C9545sf2.c2("fbstaging", uri.getScheme(), true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @InterfaceC9511sW0
    public static final void i(@NotNull Context context) {
        C6562gT0.p(context, "context");
        try {
            l0 l0Var = a;
            l0Var.h(context, com.facebook.M.Q);
            l0Var.h(context, ".facebook.com");
            l0Var.h(context, "https://facebook.com");
            l0Var.h(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Set<String> i0(@NotNull JSONArray jSONArray) throws JSONException {
        C6562gT0.p(jSONArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        if (length > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                String string = jSONArray.getString(i2);
                C6562gT0.o(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return hashSet;
    }

    @InterfaceC9511sW0
    public static final void j(@Nullable Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<String> j0(@NotNull JSONArray jSONArray) throws JSONException {
        C6562gT0.p(jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(jSONArray.getString(i2));
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return arrayList;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String k(@Nullable String str, @Nullable String str2) {
        if (f0(str)) {
            return str2;
        }
        return str;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Map<String, String> k0(@NotNull String str) {
        C6562gT0.p(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C6562gT0.o(next, "key");
                String string = jSONObject.getString(next);
                C6562gT0.o(string, "jsonObject.getString(key)");
                hashMap.put(next, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    @InterfaceC9511sW0
    public static final void l0(@Nullable String str, @Nullable Exception exc) {
        com.facebook.M m2 = com.facebook.M.a;
        if (com.facebook.M.K() && str != null && exc != null) {
            Log.d(str, exc.getClass().getSimpleName() + ": " + ((Object) exc.getMessage()));
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final HashSet<String> m(@Nullable JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            HashSet<String> hashSet = new HashSet<>();
            int length = jSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    String string = jSONArray.getString(i2);
                    C6562gT0.o(string, "jsonArray.getString(i)");
                    hashSet.add(string);
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return hashSet;
        }
        return null;
    }

    @InterfaceC9511sW0
    public static final void m0(@Nullable String str, @Nullable String str2) {
        com.facebook.M m2 = com.facebook.M.a;
        if (com.facebook.M.K() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<String> n(@NotNull JSONArray jSONArray) {
        C6562gT0.p(jSONArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    String string = jSONArray.getString(i2);
                    C6562gT0.o(string, "jsonArray.getString(i)");
                    arrayList.add(string);
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    @InterfaceC9511sW0
    public static final void n0(@Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        com.facebook.M m2 = com.facebook.M.a;
        if (com.facebook.M.K() && !f0(str)) {
            Log.d(str, str2, th);
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Map<String, Object> o(@NotNull JSONObject jSONObject) {
        int length;
        C6562gT0.p(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jSONObject.names();
        if (names != null && (length = names.length()) > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                try {
                    String string = names.getString(i2);
                    C6562gT0.o(string, "keys.getString(i)");
                    Object obj = jSONObject.get(string);
                    if (obj instanceof JSONObject) {
                        obj = o((JSONObject) obj);
                    }
                    C6562gT0.o(obj, "value");
                    hashMap.put(string, obj);
                } catch (JSONException unused) {
                }
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return hashMap;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String o0(@NotNull Map<String, String> map) {
        C6562gT0.p(map, "map");
        String str = "";
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            str = jSONObject.toString();
        } catch (JSONException unused) {
        }
        C6562gT0.o(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        return str;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Map<String, String> p(@NotNull JSONObject jSONObject) {
        C6562gT0.p(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                C6562gT0.o(next, "key");
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String p0(@NotNull String str) {
        C6562gT0.p(str, "key");
        return a.T("MD5", str);
    }

    @InterfaceC9511sW0
    public static final int q(@Nullable InputStream inputStream, @NotNull OutputStream outputStream) throws IOException {
        C6562gT0.p(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i2 = 0;
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i2 += read;
                }
                bufferedInputStream2.close();
                if (inputStream == null) {
                    return i2;
                }
                inputStream.close();
                return i2;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @InterfaceC9511sW0
    public static final boolean q0(@NotNull Context context) {
        C6562gT0.p(context, "context");
        return Y(context);
    }

    @InterfaceC9511sW0
    public static final void r(@Nullable URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Bundle r0(@Nullable String str) {
        Bundle bundle = new Bundle();
        if (!f0(str)) {
            if (str != null) {
                Object[] array = C10763xf2.o5(str, new String[]{"&"}, false, 0, 6, null).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    int length = strArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i2 + 1;
                        Object[] array2 = C10763xf2.o5(strArr[i2], new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
                        if (array2 != null) {
                            String[] strArr2 = (String[]) array2;
                            try {
                                if (strArr2.length == 2) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                                } else if (strArr2.length == 1) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                                }
                            } catch (UnsupportedEncodingException e2) {
                                l0(b, e2);
                            }
                            i2 = i3;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return bundle;
    }

    @InterfaceC9511sW0
    public static final void s0(@NotNull Bundle bundle, @Nullable String str, @Nullable List<String> list) {
        C6562gT0.p(bundle, "b");
        if (list != null) {
            bundle.putString(str, TextUtils.join(",", list));
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String t(int i2) {
        String bigInteger = new BigInteger(i2 * 5, new Random()).toString(32);
        C6562gT0.o(bigInteger, "BigInteger(length * 5, r).toString(32)");
        return bigInteger;
    }

    @InterfaceC9511sW0
    public static final boolean t0(@NotNull Bundle bundle, @Nullable String str, @Nullable Object obj) {
        C6562gT0.p(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, ((JSONArray) obj).toString());
            return true;
        } else if (obj instanceof JSONObject) {
            bundle.putString(str, ((JSONObject) obj).toString());
            return true;
        } else {
            return false;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String u(@Nullable Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        C6562gT0.o(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    @InterfaceC9511sW0
    public static final void u0(@NotNull Bundle bundle, @Nullable String str, @Nullable String str2) {
        C6562gT0.p(bundle, "b");
        if (!f0(str2)) {
            bundle.putString(str, str2);
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String v(@NotNull Context context) {
        C6562gT0.p(context, "context");
        try {
            com.facebook.M m2 = com.facebook.M.a;
            String p2 = com.facebook.M.p();
            if (p2 != null) {
                return p2;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i2 = applicationInfo.labelRes;
            if (i2 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i2);
            C6562gT0.o(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    @InterfaceC9511sW0
    public static final void v0(@NotNull Bundle bundle, @Nullable String str, @Nullable Uri uri) {
        C6562gT0.p(bundle, "b");
        if (uri != null) {
            u0(bundle, str, uri.toString());
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String w() {
        com.facebook.M m2 = com.facebook.M.a;
        Context n2 = com.facebook.M.n();
        if (n2 == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = n2.getPackageManager().getPackageInfo(n2.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Map<String, String> w0(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (readInt > 0) {
            int i2 = 0;
            do {
                i2++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (readString != null && readString2 != null) {
                    hashMap.put(readString, readString2);
                    continue;
                }
            } while (i2 < readInt);
            return hashMap;
        }
        return hashMap;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String x0(@Nullable InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader = null;
            }
        } catch (Throwable th3) {
            bufferedInputStream = null;
            th = th3;
            inputStreamReader = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read != -1) {
                    sb.append(cArr, 0, read);
                } else {
                    String sb2 = sb.toString();
                    C6562gT0.o(sb2, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                    j(bufferedInputStream);
                    j(inputStreamReader);
                    return sb2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            j(bufferedInputStream);
            j(inputStreamReader);
            throw th;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Date y(@Nullable Bundle bundle, @Nullable String str, @NotNull Date date) {
        long parseLong;
        C6562gT0.p(date, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else if (!(obj instanceof String)) {
            return null;
        } else {
            try {
                parseLong = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (parseLong == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date(date.getTime() + (parseLong * 1000));
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Map<String, String> y0(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (readInt > 0) {
            int i2 = 0;
            do {
                i2++;
                hashMap.put(parcel.readString(), parcel.readString());
            } while (i2 < readInt);
            return hashMap;
        }
        return hashMap;
    }

    public final int A0() {
        int i2 = l;
        if (i2 > 0) {
            return i2;
        }
        try {
            File[] listFiles = new File(C9512sW1.c).listFiles(new FilenameFilter() { // from class: com.facebook.internal.k0
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    boolean B0;
                    B0 = l0.B0(file, str);
                    return B0;
                }
            });
            if (listFiles != null) {
                l = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (l <= 0) {
            l = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return l;
    }

    public final String C() {
        C0376a i2 = C0376a.g1.i();
        if (i2 != null && i2.s() != null) {
            return i2.s();
        }
        return C0376a.m1;
    }

    public final void C0(Context context) {
        if (C6562gT0.g(r, k)) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService != null) {
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    C6562gT0.o(networkOperatorName, "telephonyManager.networkOperatorName");
                    r = networkOperatorName;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            } catch (Exception unused) {
            }
        }
    }

    public final void D0(Context context) {
        if (m != -1 && System.currentTimeMillis() - m < 1800000) {
            return;
        }
        m = System.currentTimeMillis();
        E0();
        C0(context);
        F0();
        z0();
    }

    @NotNull
    public final String E() {
        return q;
    }

    public final void E0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            C6562gT0.o(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
            p = displayName;
            String id = timeZone.getID();
            C6562gT0.o(id, "tz.id");
            q = id;
        } catch (AssertionError | Exception unused) {
        }
    }

    public final void F0() {
        try {
            if (s()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                n = statFs.getBlockCount() * statFs.getBlockSize();
            }
            n = l(n);
        } catch (Exception unused) {
        }
    }

    public final com.facebook.S G(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", N(C()));
        bundle.putString("access_token", str);
        com.facebook.S I = com.facebook.S.n.I(null, null);
        I.r0(bundle);
        I.q0(com.facebook.Z.GET);
        return I;
    }

    @Nullable
    public final Locale J() {
        return t;
    }

    public final void K0(long j2) {
        f115o = j2;
    }

    public final void L0(@NotNull String str) {
        C6562gT0.p(str, "<set-?>");
        r = str;
    }

    public final void M0(@NotNull String str) {
        C6562gT0.p(str, "<set-?>");
        q = str;
    }

    public final String N(String str) {
        if (C6562gT0.g(str, com.facebook.M.O)) {
            return w;
        }
        return v;
    }

    public final void N0(@Nullable Locale locale) {
        t = locale;
    }

    public final void O0(@Nullable String str) {
        s = str;
    }

    @Nullable
    public final String R() {
        return s;
    }

    public final String S(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        C6562gT0.o(digest, "digest");
        int length = digest.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = digest[i2];
            i2++;
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString(b2 & C8077mf.q));
        }
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "builder.toString()");
        return sb2;
    }

    public final String T(String str, String str2) {
        Charset charset = HB.b;
        if (str2 != null) {
            byte[] bytes = str2.getBytes(charset);
            C6562gT0.o(bytes, "(this as java.lang.String).getBytes(charset)");
            return U(str, bytes);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String U(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            C6562gT0.o(messageDigest, "hash");
            return S(messageDigest, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final void c(JSONObject jSONObject, C2358c c2358c, String str, Context context) {
        if (Build.VERSION.SDK_INT >= 31 && e0(context)) {
            if (!c2358c.l()) {
                jSONObject.put("anon_id", str);
                return;
            }
            return;
        }
        jSONObject.put("anon_id", str);
    }

    public final void d(JSONObject jSONObject, C2358c c2358c, Context context) {
        if (Build.VERSION.SDK_INT >= 31 && e0(context)) {
            if (!c2358c.l()) {
                jSONObject.put("attribution", c2358c.j());
                return;
            }
            return;
        }
        jSONObject.put("attribution", c2358c.j());
    }

    public final boolean e0(Context context) {
        Method M = M("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (M == null) {
            return false;
        }
        Object V = V(null, M, context);
        if (!(V instanceof Integer) || !C6562gT0.g(V, 0)) {
            return false;
        }
        return true;
    }

    public final void h(Context context, String str) {
        int i2;
        boolean z;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        Object[] array = C10763xf2.o5(cookie, new String[]{";"}, false, 0, 6, null).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i3 = 0;
            while (i3 < length) {
                String str2 = strArr[i3];
                i3++;
                Object[] array2 = C10763xf2.o5(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
                if (array2 != null) {
                    String[] strArr2 = (String[]) array2;
                    if (strArr2.length > 0) {
                        String str3 = strArr2[0];
                        int length2 = str3.length() - 1;
                        int i4 = 0;
                        boolean z2 = false;
                        while (i4 <= length2) {
                            if (!z2) {
                                i2 = i4;
                            } else {
                                i2 = length2;
                            }
                            if (C6562gT0.t(str3.charAt(i2), 32) <= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z2) {
                                if (!z) {
                                    z2 = true;
                                } else {
                                    i4++;
                                }
                            } else if (!z) {
                                break;
                            } else {
                                length2--;
                            }
                        }
                        cookieManager.setCookie(str, C6562gT0.C(str3.subSequence(i4, length2 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            cookieManager.removeExpiredCookie();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final long l(double d2) {
        return Math.round(d2 / 1.073741824E9d);
    }

    public final boolean s() {
        return C6562gT0.g("mounted", Environment.getExternalStorageState());
    }

    public final long x() {
        return f115o;
    }

    @NotNull
    public final String z() {
        return r;
    }

    public final void z0() {
        try {
            if (s()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f115o = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            f115o = l(f115o);
        } catch (Exception unused) {
        }
    }
}
