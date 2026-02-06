package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.remoteconfig.BuildConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C2802Dx1;
import o.C3855Oo;
import o.InterfaceC5056aJ2;
import o.QV0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ConfigFetchHttpClient {
    public static final String h = "X-Goog-Api-Key";
    public static final String i = "ETag";
    public static final String j = "If-None-Match";
    public static final String k = "X-Android-Package";
    public static final String l = "X-Android-Cert";
    public static final String m = "X-Google-GFE-Can-Retry";
    public static final String n = "X-Goog-Firebase-Installations-Auth";

    /* renamed from: o  reason: collision with root package name */
    public static final String f390o = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    public static final Pattern p = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j2, long j3) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = f(str);
        this.e = str3;
        this.f = j2;
        this.g = j3;
    }

    public static ConfigContainer e(JSONObject jSONObject, Date date) throws FirebaseRemoteConfigClientException {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        String str;
        try {
            ConfigContainer.Builder e = ConfigContainer.l().e(date);
            JSONArray jSONArray2 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject(RemoteConfigConstants.ResponseFieldKey.h0);
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                e = e.c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray(RemoteConfigConstants.ResponseFieldKey.i0);
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                e = e.d(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject(RemoteConfigConstants.ResponseFieldKey.j0);
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                e = e.f(jSONObject3);
            }
            if (jSONObject.has("templateVersion")) {
                str = jSONObject.getString("templateVersion");
            } else {
                str = null;
            }
            if (str != null) {
                e.h(Long.parseLong(str));
            }
            try {
                jSONArray2 = jSONObject.getJSONArray(RemoteConfigConstants.ResponseFieldKey.m0);
            } catch (JSONException unused4) {
            }
            if (jSONArray2 != null) {
                e = e.g(jSONArray2);
            }
            return e.a();
        } catch (JSONException e2) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e2);
        }
    }

    public static String f(String str) {
        Matcher matcher = p.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public final boolean a(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    public final String b(long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f390o, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j2));
    }

    public final JSONObject c(String str, String str2, Map<String, String> map, Long l2) throws FirebaseRemoteConfigClientException {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(RemoteConfigConstants.RequestFieldKey.U, str);
            hashMap.put(RemoteConfigConstants.RequestFieldKey.V, str2);
            hashMap.put(RemoteConfigConstants.RequestFieldKey.W, this.b);
            Locale locale = this.a.getResources().getConfiguration().locale;
            hashMap.put(RemoteConfigConstants.RequestFieldKey.X, locale.getCountry());
            int i2 = Build.VERSION.SDK_INT;
            hashMap.put(RemoteConfigConstants.RequestFieldKey.Y, locale.toLanguageTag());
            hashMap.put(RemoteConfigConstants.RequestFieldKey.Z, Integer.toString(i2));
            hashMap.put(RemoteConfigConstants.RequestFieldKey.a0, TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    hashMap.put(RemoteConfigConstants.RequestFieldKey.c0, Long.toString(C2802Dx1.c(packageInfo)));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.a.getPackageName());
            hashMap.put(RemoteConfigConstants.RequestFieldKey.e0, BuildConfig.d);
            hashMap.put(RemoteConfigConstants.RequestFieldKey.f0, new JSONObject(map));
            if (l2 != null) {
                hashMap.put(RemoteConfigConstants.RequestFieldKey.g0, b(l2.longValue()));
            }
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
    }

    public HttpURLConnection d() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) new URL(i(this.d, this.e)).openConnection();
        } catch (IOException e) {
            throw new FirebaseRemoteConfigException(e.getMessage());
        }
    }

    @Keep
    public ConfigFetchHandler.FetchResponse fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l2, Date date) throws FirebaseRemoteConfigException {
        o(httpURLConnection, str3, str2, map2);
        try {
            try {
                n(httpURLConnection, c(str, str2, map, l2).toString().getBytes(QV0.q1));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpURLConnection.getHeaderField("ETag");
                    JSONObject h2 = h(httpURLConnection);
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused) {
                    }
                    ConfigContainer e = e(h2, date);
                    if (!a(h2)) {
                        return ConfigFetchHandler.FetchResponse.a(date, e);
                    }
                    return ConfigFetchHandler.FetchResponse.b(e, headerField);
                }
                throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
            } catch (IOException | JSONException e2) {
                throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e2);
            }
        } finally {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
        }
    }

    @InterfaceC5056aJ2
    public long g() {
        return this.f;
    }

    public final JSONObject h(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), QV0.q1));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb.append((char) read);
            } else {
                return new JSONObject(sb.toString());
            }
        }
    }

    public final String i(String str, String str2) {
        return String.format(RemoteConfigConstants.a, str, str2);
    }

    public final String j() {
        try {
            Context context = this.a;
            byte[] a = AndroidUtilsLight.a(context, context.getPackageName());
            if (a == null) {
                Log.e(FirebaseRemoteConfig.z, "Could not get fingerprint hash for package: " + this.a.getPackageName());
                return null;
            }
            return Hex.c(a, false);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(FirebaseRemoteConfig.z, "No such package: " + this.a.getPackageName(), e);
            return null;
        }
    }

    @InterfaceC5056aJ2
    public long k() {
        return this.g;
    }

    public final void l(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", j());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", C3855Oo.f);
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    public final void m(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    public final void n(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final void o(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.g));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        l(httpURLConnection, str2);
        m(httpURLConnection, map);
    }
}
