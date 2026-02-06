package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.BuildConfig;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C3855Oo;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;
import o.Q32;
import o.QV0;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ConfigRealtimeHttpClient {
    @InterfaceC5056aJ2
    public static final int[] q = {2, 4, 8, 16, 32, 64, 128, 256};
    public static final Pattern r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public static final String s = "X-Goog-Api-Key";
    public static final String t = "X-Android-Package";
    public static final String u = "X-Android-Cert";
    public static final String v = "X-Google-GFE-Can-Retry";
    public static final String w = "X-Goog-Firebase-Installations-Auth";
    public static final String x = "X-Accept-Response-Streaming";
    @InterfaceC8710pF0("this")
    public final Set<ConfigUpdateListener> a;
    @InterfaceC8710pF0("this")
    public int c;
    public final ScheduledExecutorService g;
    public final ConfigFetchHandler h;
    public final FirebaseApp i;
    public final FirebaseInstallationsApi j;
    public ConfigCacheClient k;
    public final Context l;
    public final String m;
    public final ConfigMetadataClient p;
    public final int f = 8;
    @InterfaceC8710pF0("this")
    public boolean b = false;
    public final Random n = new Random();

    /* renamed from: o  reason: collision with root package name */
    public final Clock f392o = DefaultClock.d();
    @InterfaceC8710pF0("this")
    public boolean d = false;
    public boolean e = false;

    public ConfigRealtimeHttpClient(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, Set<ConfigUpdateListener> set, ConfigMetadataClient configMetadataClient, ScheduledExecutorService scheduledExecutorService) {
        this.a = set;
        this.g = scheduledExecutorService;
        this.c = Math.max(8 - configMetadataClient.j().b(), 1);
        this.i = firebaseApp;
        this.h = configFetchHandler;
        this.j = firebaseInstallationsApi;
        this.k = configCacheClient;
        this.l = context;
        this.m = str;
        this.p = configMetadataClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Task a(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task, Task task2) {
        Integer num;
        Throwable th;
        HttpURLConnection httpURLConnection;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        int responseCode;
        boolean r2;
        configRealtimeHttpClient.getClass();
        boolean z = true;
        try {
        } catch (IOException e) {
            e = e;
            httpURLConnection = null;
            num = null;
        } catch (Throwable th2) {
            num = null;
            th = th2;
            httpURLConnection = null;
        }
        if (task.v()) {
            configRealtimeHttpClient.y(true);
            httpURLConnection = (HttpURLConnection) task.r();
            try {
                responseCode = httpURLConnection.getResponseCode();
                num = Integer.valueOf(responseCode);
                if (responseCode == 200) {
                    try {
                        try {
                            configRealtimeHttpClient.v();
                            configRealtimeHttpClient.p.l();
                            configRealtimeHttpClient.B(httpURLConnection).h();
                        } catch (Throwable th3) {
                            th = th3;
                            configRealtimeHttpClient.g(httpURLConnection);
                            configRealtimeHttpClient.y(false);
                            if (num != null && !configRealtimeHttpClient.r(num.intValue())) {
                                z = false;
                            }
                            if (z) {
                                configRealtimeHttpClient.D(new Date(configRealtimeHttpClient.f392o.a()));
                            }
                            if (z && num.intValue() != 200) {
                                String format = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                                if (num.intValue() == 403) {
                                    format = configRealtimeHttpClient.t(httpURLConnection.getErrorStream());
                                }
                                configRealtimeHttpClient.u(new FirebaseRemoteConfigServerException(num.intValue(), format, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                            } else {
                                configRealtimeHttpClient.w();
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        Log.d(FirebaseRemoteConfig.z, "Exception connecting to real-time RC backend. Retrying the connection...", e);
                        configRealtimeHttpClient.g(httpURLConnection);
                        configRealtimeHttpClient.y(false);
                        if (num != null && !configRealtimeHttpClient.r(num.intValue())) {
                            z = false;
                        }
                        if (z) {
                            configRealtimeHttpClient.D(new Date(configRealtimeHttpClient.f392o.a()));
                        }
                        if (!z && num.intValue() != 200) {
                            String format2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                            if (num.intValue() == 403) {
                                format2 = configRealtimeHttpClient.t(httpURLConnection.getErrorStream());
                            }
                            firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(num.intValue(), format2, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                            configRealtimeHttpClient.u(firebaseRemoteConfigServerException);
                            return Tasks.g(null);
                        }
                        configRealtimeHttpClient.w();
                        return Tasks.g(null);
                    }
                }
                configRealtimeHttpClient.g(httpURLConnection);
                configRealtimeHttpClient.y(false);
                r2 = configRealtimeHttpClient.r(responseCode);
                if (r2) {
                    configRealtimeHttpClient.D(new Date(configRealtimeHttpClient.f392o.a()));
                }
            } catch (IOException e3) {
                e = e3;
                num = null;
            } catch (Throwable th4) {
                num = null;
                th = th4;
                configRealtimeHttpClient.g(httpURLConnection);
                configRealtimeHttpClient.y(false);
                if (num != null) {
                    z = false;
                }
                if (z) {
                }
                if (z) {
                }
                configRealtimeHttpClient.w();
                throw th;
            }
            if (!r2 && responseCode != 200) {
                String format3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                if (responseCode == 403) {
                    format3 = configRealtimeHttpClient.t(httpURLConnection.getErrorStream());
                }
                firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(responseCode, format3, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                configRealtimeHttpClient.u(firebaseRemoteConfigServerException);
                return Tasks.g(null);
            }
            configRealtimeHttpClient.w();
            return Tasks.g(null);
        }
        throw new IOException(task.q());
    }

    public static /* synthetic */ Task b(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task, Task task2, Task task3) {
        configRealtimeHttpClient.getClass();
        if (!task.v()) {
            return Tasks.f(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task.q()));
        }
        if (!task2.v()) {
            return Tasks.f(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task2.q()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) configRealtimeHttpClient.q().openConnection();
            configRealtimeHttpClient.A(httpURLConnection, (String) task2.r(), ((InstallationTokenResult) task.r()).b());
            return Tasks.g(httpURLConnection);
        } catch (IOException e) {
            return Tasks.f(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e));
        }
    }

    public static String k(String str) {
        Matcher matcher = r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    @SuppressLint({"VisibleForTests"})
    public void A(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod(Q32.j);
        x(httpURLConnection, str2);
        byte[] bytes = i(str).toString().getBytes(QV0.q1);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized ConfigAutoFetch B(HttpURLConnection httpURLConnection) {
        return new ConfigAutoFetch(httpURLConnection, this.h, this.k, this.a, new ConfigUpdateListener() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.2
            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public void a(@InterfaceC5670cr1 ConfigUpdate configUpdate) {
            }

            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public void b(@InterfaceC5670cr1 FirebaseRemoteConfigException firebaseRemoteConfigException) {
                ConfigRealtimeHttpClient.this.j();
                ConfigRealtimeHttpClient.this.u(firebaseRemoteConfigException);
            }
        }, this.g);
    }

    public void C() {
        s(0L);
    }

    public final void D(Date date) {
        int b = this.p.j().b() + 1;
        this.p.r(b, new Date(date.getTime() + o(b)));
    }

    @SuppressLint({"VisibleForTests", "DefaultLocale"})
    public void e() {
        if (!f()) {
            return;
        }
        if (new Date(this.f392o.a()).before(this.p.j().a())) {
            w();
            return;
        }
        final Task<HttpURLConnection> h = h();
        Tasks.m(h).n(this.g, new Continuation() { // from class: o.UJ
            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task) {
                return ConfigRealtimeHttpClient.a(ConfigRealtimeHttpClient.this, h, task);
            }
        });
    }

    public final synchronized boolean f() {
        boolean z;
        if (!this.a.isEmpty() && !this.b && !this.d) {
            if (!this.e) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public void g(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    public Task<HttpURLConnection> h() {
        final Task<InstallationTokenResult> c = this.j.c(false);
        final Task<String> id = this.j.getId();
        return Tasks.m(c, id).p(this.g, new Continuation() { // from class: o.TJ
            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task) {
                return ConfigRealtimeHttpClient.b(ConfigRealtimeHttpClient.this, c, id, task);
            }
        });
    }

    public final JSONObject i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("project", k(this.i.s().j()));
        hashMap.put("namespace", this.m);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.h.s()));
        hashMap.put(RemoteConfigConstants.RequestFieldKey.W, this.i.s().j());
        hashMap.put(RemoteConfigConstants.RequestFieldKey.e0, BuildConfig.d);
        hashMap.put(RemoteConfigConstants.RequestFieldKey.U, str);
        return new JSONObject(hashMap);
    }

    public final synchronized void j() {
        this.d = true;
    }

    @SuppressLint({"VisibleForTests"})
    public Date l() {
        return this.p.j().a();
    }

    public final String m() {
        try {
            Context context = this.l;
            byte[] a = AndroidUtilsLight.a(context, context.getPackageName());
            if (a == null) {
                Log.e(FirebaseRemoteConfig.z, "Could not get fingerprint hash for package: " + this.l.getPackageName());
                return null;
            }
            return Hex.c(a, false);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i(FirebaseRemoteConfig.z, "No such package: " + this.l.getPackageName());
            return null;
        }
    }

    @SuppressLint({"VisibleForTests"})
    public int n() {
        return this.p.j().b();
    }

    public final long o(int i) {
        int[] iArr = q;
        int length = iArr.length;
        if (i >= length) {
            i = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(iArr[i - 1]);
        return (millis / 2) + this.n.nextInt((int) millis);
    }

    public final String p(String str) {
        return String.format(RemoteConfigConstants.b, k(this.i.s().j()), str);
    }

    public final URL q() {
        try {
            return new URL(p(this.m));
        } catch (MalformedURLException unused) {
            Log.e(FirebaseRemoteConfig.z, "URL is malformed");
            return null;
        }
    }

    public final boolean r(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public final synchronized void s(long j) {
        try {
            if (!f()) {
                return;
            }
            int i = this.c;
            if (i > 0) {
                this.c = i - 1;
                this.g.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ConfigRealtimeHttpClient.this.e();
                    }
                }, j, TimeUnit.MILLISECONDS);
            } else if (!this.e) {
                u(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String t(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized void u(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        for (ConfigUpdateListener configUpdateListener : this.a) {
            configUpdateListener.b(firebaseRemoteConfigException);
        }
    }

    public final synchronized void v() {
        this.c = 8;
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized void w() {
        s(Math.max(0L, this.p.j().a().getTime() - new Date(this.f392o.a()).getTime()));
    }

    public final void x(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.i.s().i());
        httpURLConnection.setRequestProperty("X-Android-Package", this.l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", m());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", C3855Oo.f);
        httpURLConnection.setRequestProperty(x, "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    public final synchronized void y(boolean z) {
        this.b = z;
    }

    public void z(boolean z) {
        this.e = z;
    }
}
