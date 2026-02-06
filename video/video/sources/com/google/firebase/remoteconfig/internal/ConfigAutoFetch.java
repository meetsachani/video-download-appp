package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigAutoFetch;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceC5056aJ2;
import o.InterfaceC8710pF0;
import o.QV0;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class ConfigAutoFetch {
    public static final int h = 3;
    public static final String i = "latestTemplateVersionNumber";
    public static final String j = "featureDisabled";
    @InterfaceC8710pF0("this")
    public final Set<ConfigUpdateListener> a;
    public final HttpURLConnection b;
    public final ConfigFetchHandler c;
    public final ConfigCacheClient d;
    public final ConfigUpdateListener e;
    public final ScheduledExecutorService f;
    public final Random g = new Random();

    public ConfigAutoFetch(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Set<ConfigUpdateListener> set, ConfigUpdateListener configUpdateListener, ScheduledExecutorService scheduledExecutorService) {
        this.b = httpURLConnection;
        this.c = configFetchHandler;
        this.d = configCacheClient;
        this.a = set;
        this.e = configUpdateListener;
        this.f = scheduledExecutorService;
    }

    public static /* synthetic */ Task a(ConfigAutoFetch configAutoFetch, Task task, Task task2, long j2, int i2, Task task3) {
        configAutoFetch.getClass();
        if (!task.v()) {
            return Tasks.f(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task.q()));
        }
        if (!task2.v()) {
            return Tasks.f(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task2.q()));
        }
        ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) task.r();
        ConfigContainer configContainer = (ConfigContainer) task2.r();
        if (!e(fetchResponse, j2).booleanValue()) {
            Log.d(FirebaseRemoteConfig.z, "Fetched template version is the same as SDK's current version. Retrying fetch.");
            configAutoFetch.b(i2, j2);
            return Tasks.g(null);
        } else if (fetchResponse.e() == null) {
            Log.d(FirebaseRemoteConfig.z, "The fetch succeeded, but the backend had no updates.");
            return Tasks.g(null);
        } else {
            if (configContainer == null) {
                configContainer = ConfigContainer.l().a();
            }
            Set<String> f = configContainer.f(fetchResponse.e());
            if (f.isEmpty()) {
                Log.d(FirebaseRemoteConfig.z, "Config was fetched, but no params changed.");
                return Tasks.g(null);
            }
            configAutoFetch.c(ConfigUpdate.a(f));
            return Tasks.g(null);
        }
    }

    public static Boolean e(ConfigFetchHandler.FetchResponse fetchResponse, long j2) {
        boolean z = false;
        if (fetchResponse.e() != null) {
            if (fetchResponse.e().k() >= j2) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (fetchResponse.g() == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final void b(final int i2, final long j2) {
        if (i2 == 0) {
            j(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_NOT_FETCHED));
            return;
        }
        this.f.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigAutoFetch.1
            @Override // java.lang.Runnable
            public void run() {
                ConfigAutoFetch.this.d(i2, j2);
            }
        }, this.g.nextInt(4), TimeUnit.SECONDS);
    }

    public final synchronized void c(ConfigUpdate configUpdate) {
        for (ConfigUpdateListener configUpdateListener : this.a) {
            configUpdateListener.a(configUpdate);
        }
    }

    @InterfaceC5056aJ2
    public synchronized Task<Void> d(int i2, final long j2) {
        final int i3 = i2 - 1;
        try {
            try {
                final Task<ConfigFetchHandler.FetchResponse> n = this.c.n(ConfigFetchHandler.FetchType.REALTIME, 3 - i3);
                final Task<ConfigContainer> f = this.d.f();
                return Tasks.m(n, f).p(this.f, new Continuation() { // from class: o.IJ
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object a(Task task) {
                        return ConfigAutoFetch.a(ConfigAutoFetch.this, n, f, j2, i3, task);
                    }
                });
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r5.has(com.google.firebase.remoteconfig.internal.ConfigAutoFetch.j) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        if (r5.getBoolean(com.google.firebase.remoteconfig.internal.ConfigAutoFetch.j) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        r9.e.b(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (g() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (r5.has(com.google.firebase.remoteconfig.internal.ConfigAutoFetch.i) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        r6 = r9.c.s();
        r4 = r5.getLong(com.google.firebase.remoteconfig.internal.ConfigAutoFetch.i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r4 <= r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        b(3, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, QV0.q1));
        loop0: while (true) {
            String str = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break loop0;
                }
                str = str + readLine;
                if (readLine.contains("}")) {
                    str = i(str);
                    if (!str.isEmpty()) {
                        try {
                            break;
                        } catch (JSONException e) {
                            j(new FirebaseRemoteConfigClientException("Unable to parse config update message.", e.getCause(), FirebaseRemoteConfigException.Code.CONFIG_UPDATE_MESSAGE_INVALID));
                            Log.e(FirebaseRemoteConfig.z, "Unable to parse latest config update message.", e);
                        }
                    }
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    public final synchronized boolean g() {
        return this.a.isEmpty();
    }

    @InterfaceC5056aJ2
    public void h() {
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                f(inputStream);
                inputStream.close();
            } catch (IOException e) {
                Log.d(FirebaseRemoteConfig.z, "Stream was cancelled due to an exception. Retrying the connection...", e);
            }
        } finally {
            this.b.disconnect();
        }
    }

    public final String i(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
            return "";
        }
        return str.substring(indexOf, lastIndexOf + 1);
    }

    public final synchronized void j(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        for (ConfigUpdateListener configUpdateListener : this.a) {
            configUpdateListener.b(firebaseRemoteConfigException);
        }
    }
}
