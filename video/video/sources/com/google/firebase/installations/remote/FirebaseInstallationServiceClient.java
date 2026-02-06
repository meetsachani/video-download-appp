package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import o.C6566gU0;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.Q32;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class FirebaseInstallationServiceClient {
    public static final String A = "x-goog-api-key";
    public static final int B = 10000;
    public static final int D = 1;
    public static final String F = "a:";
    public static final String G = "Firebase-Installations";
    @VisibleForTesting
    public static final String H = "Invalid Expiration Timestamp.";
    public static final int e = 32768;
    public static final int f = 32769;
    public static final int g = 32770;
    public static final int h = 32771;
    public static final String i = "firebaseinstallations.googleapis.com";
    public static final String j = "projects/%s/installations";
    public static final String k = "projects/%s/installations/%s/authTokens:generate";
    public static final String l = "projects/%s/installations/%s";
    public static final String m = "v1";
    public static final String n = "FIS_v2";

    /* renamed from: o  reason: collision with root package name */
    public static final String f362o = "Content-Type";
    public static final String p = "Accept";
    public static final String q = "application/json";
    public static final String r = "Content-Encoding";
    public static final String s = "gzip";
    public static final String t = "Cache-Control";
    public static final String u = "no-cache";
    public static final String v = "fire-installations-id";
    public static final String w = "x-firebase-client";
    public static final String x = "X-Android-Package";
    public static final String y = "X-Android-Cert";
    public static final String z = "x-goog-fis-android-iid-migration-auth";
    public boolean a;
    public final Context b;
    public final Provider<HeartBeatController> c;
    public final RequestLimiter d = new RequestLimiter();
    public static final Pattern C = Pattern.compile("[0-9]+s");
    public static final Charset E = Charset.forName("UTF-8");

    public FirebaseInstallationServiceClient(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Provider<HeartBeatController> provider) {
        this.b = context;
        this.c = provider;
    }

    public static String a(@InterfaceC11300zs1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = C6566gU0.h + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    public static JSONObject b(@InterfaceC11300zs1 String str, @InterfaceC5670cr1 String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.W, str2);
            jSONObject.put("authVersion", n);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.e0, "a:17.2.0");
            return jSONObject;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.e0, "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static byte[] i(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    public static boolean j(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    public static void k() {
        Log.e(G, "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    public static void l(HttpURLConnection httpURLConnection, @InterfaceC11300zs1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 String str3) {
        String p2 = p(httpURLConnection);
        if (!TextUtils.isEmpty(p2)) {
            Log.w(G, p2);
            Log.w(G, a(str, str2, str3));
        }
    }

    @VisibleForTesting
    public static long n(String str) {
        Preconditions.b(C.matcher(str).matches(), H);
        if (str != null && str.length() != 0) {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    @InterfaceC11300zs1
    public static String p(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, E));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                bufferedReader.close();
                return null;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        } catch (IOException unused4) {
            return null;
        }
    }

    public static void t(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    @InterfaceC5670cr1
    public InstallationResponse d(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 String str2, @InterfaceC5670cr1 String str3, @InterfaceC5670cr1 String str4, @InterfaceC11300zs1 String str5) throws FirebaseInstallationsException {
        int responseCode;
        InstallationResponse o2;
        if (this.d.b()) {
            URL h2 = h(String.format(j, str3));
            for (int i2 = 0; i2 <= 1; i2++) {
                TrafficStats.setThreadStatsTag(f);
                HttpURLConnection m2 = m(h2, str);
                try {
                    m2.setRequestMethod(Q32.j);
                    m2.setDoOutput(true);
                    if (str5 != null) {
                        m2.addRequestProperty(z, str5);
                    }
                    r(m2, str2, str4);
                    responseCode = m2.getResponseCode();
                    this.d.f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    m2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (j(responseCode)) {
                    o2 = o(m2);
                } else {
                    l(m2, str4, str, str3);
                    if (responseCode != 429) {
                        if (responseCode < 500 || responseCode >= 600) {
                            k();
                            o2 = InstallationResponse.a().e(InstallationResponse.ResponseCode.BAD_CONFIG).a();
                        }
                        m2.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    } else {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                    }
                }
                m2.disconnect();
                TrafficStats.clearThreadStatsTag();
                return o2;
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @InterfaceC5670cr1
    public void e(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 String str3, @InterfaceC5670cr1 String str4) throws FirebaseInstallationsException {
        int responseCode;
        URL h2 = h(String.format(l, str3, str2));
        int i2 = 0;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(g);
            HttpURLConnection m2 = m(h2, str);
            try {
                m2.setRequestMethod("DELETE");
                m2.addRequestProperty("Authorization", "FIS_v2 " + str4);
                responseCode = m2.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th) {
                m2.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
            if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                l(m2, null, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    k();
                    throw new FirebaseInstallationsException("Bad config while trying to delete FID", FirebaseInstallationsException.Status.BAD_CONFIG);
                    break;
                }
                i2++;
                m2.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            m2.disconnect();
            TrafficStats.clearThreadStatsTag();
            return;
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @InterfaceC5670cr1
    public TokenResult f(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 String str3, @InterfaceC5670cr1 String str4) throws FirebaseInstallationsException {
        int responseCode;
        TokenResult q2;
        if (this.d.b()) {
            URL h2 = h(String.format(k, str3, str2));
            for (int i2 = 0; i2 <= 1; i2++) {
                TrafficStats.setThreadStatsTag(h);
                HttpURLConnection m2 = m(h2, str);
                try {
                    m2.setRequestMethod(Q32.j);
                    m2.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    m2.setDoOutput(true);
                    s(m2);
                    responseCode = m2.getResponseCode();
                    this.d.f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    m2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (j(responseCode)) {
                    q2 = q(m2);
                } else {
                    l(m2, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                k();
                                q2 = TokenResult.a().b(TokenResult.ResponseCode.BAD_CONFIG).a();
                            }
                            m2.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        }
                    } else {
                        q2 = TokenResult.a().b(TokenResult.ResponseCode.AUTH_ERROR).a();
                    }
                }
                m2.disconnect();
                TrafficStats.clearThreadStatsTag();
                return q2;
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    public final String g() {
        try {
            Context context = this.b;
            byte[] a = AndroidUtilsLight.a(context, context.getPackageName());
            if (a == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.b.getPackageName());
                return null;
            }
            return Hex.c(a, false);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("ContentValues", "No such package: " + this.b.getPackageName(), e2);
            return null;
        }
    }

    public final URL h(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", i, m, str));
        } catch (MalformedURLException e2) {
            throw new FirebaseInstallationsException(e2.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    public final HttpURLConnection m(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", u);
            httpURLConnection.addRequestProperty("X-Android-Package", this.b.getPackageName());
            HeartBeatController heartBeatController = this.c.get();
            if (heartBeatController != null) {
                try {
                    httpURLConnection.addRequestProperty(w, (String) Tasks.a(heartBeatController.a()));
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                } catch (ExecutionException e3) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e3);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", g());
            httpURLConnection.addRequestProperty(A, str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    public final InstallationResponse o(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, E));
        TokenResult.Builder a = TokenResult.a();
        InstallationResponse.Builder a2 = InstallationResponse.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a2.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a2.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a2.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a.d(n(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a2.b(a.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a2.e(InstallationResponse.ResponseCode.OK).a();
    }

    public final TokenResult q(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, E));
        TokenResult.Builder a = TokenResult.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a.d(n(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a.b(TokenResult.ResponseCode.OK).a();
    }

    public final void r(HttpURLConnection httpURLConnection, @InterfaceC11300zs1 String str, @InterfaceC5670cr1 String str2) throws IOException {
        t(httpURLConnection, i(b(str, str2)));
    }

    public final void s(HttpURLConnection httpURLConnection) throws IOException {
        t(httpURLConnection, i(c()));
    }
}
