package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC8148mw2;

/* loaded from: classes3.dex */
public class ConfigFetchHandler {
    public static final long j = TimeUnit.HOURS.toSeconds(12);
    @InterfaceC5056aJ2
    public static final int[] k = {2, 4, 8, 16, 32, 64, 128, 256};
    @InterfaceC5056aJ2
    public static final int l = 429;
    @InterfaceC5056aJ2
    public static final String m = "_fot";
    public static final String n = "X-Firebase-RC-Fetch-Type";
    public final FirebaseInstallationsApi a;
    public final Provider<AnalyticsConnector> b;
    public final Executor c;
    public final Clock d;
    public final Random e;
    public final ConfigCacheClient f;
    public final ConfigFetchHttpClient g;
    public final ConfigMetadataClient h;
    public final Map<String, String> i;

    /* loaded from: classes3.dex */
    public static class FetchResponse {
        public final Date a;
        public final int b;
        public final ConfigContainer c;
        @InterfaceC11300zs1
        public final String d;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface Status {
            public static final int E0 = 0;
            public static final int F0 = 1;
            public static final int G0 = 2;
        }

        public FetchResponse(Date date, int i, ConfigContainer configContainer, @InterfaceC11300zs1 String str) {
            this.a = date;
            this.b = i;
            this.c = configContainer;
            this.d = str;
        }

        public static FetchResponse a(Date date, ConfigContainer configContainer) {
            return new FetchResponse(date, 1, configContainer, null);
        }

        public static FetchResponse b(ConfigContainer configContainer, String str) {
            return new FetchResponse(configContainer.h(), 0, configContainer, str);
        }

        public static FetchResponse c(Date date) {
            return new FetchResponse(date, 2, null, null);
        }

        public Date d() {
            return this.a;
        }

        public ConfigContainer e() {
            return this.c;
        }

        @InterfaceC11300zs1
        public String f() {
            return this.d;
        }

        public int g() {
            return this.b;
        }
    }

    /* loaded from: classes3.dex */
    public enum FetchType {
        BASE("BASE"),
        REALTIME("REALTIME");
        
        public final String X;

        FetchType(String str) {
            this.X = str;
        }

        public String e() {
            return this.X;
        }
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider<AnalyticsConnector> provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigMetadataClient configMetadataClient, Map<String, String> map) {
        this.a = firebaseInstallationsApi;
        this.b = provider;
        this.c = executor;
        this.d = clock;
        this.e = random;
        this.f = configCacheClient;
        this.g = configFetchHttpClient;
        this.h = configMetadataClient;
        this.i = map;
    }

    public static /* synthetic */ Task a(ConfigFetchHandler configFetchHandler, Task task, Task task2, Date date, Map map, Task task3) {
        configFetchHandler.getClass();
        if (!task.v()) {
            return Tasks.f(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.q()));
        }
        if (!task2.v()) {
            return Tasks.f(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.q()));
        }
        return configFetchHandler.l((String) task.r(), ((InstallationTokenResult) task2.r()).b(), date, map);
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException
        */
    public static /* synthetic */ com.google.android.gms.tasks.Task c(com.google.firebase.remoteconfig.internal.ConfigFetchHandler r0, java.util.Date r1, com.google.android.gms.tasks.Task r2) {
        /*
            r0.y(r2, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHandler.c(com.google.firebase.remoteconfig.internal.ConfigFetchHandler, java.util.Date, com.google.android.gms.tasks.Task):com.google.android.gms.tasks.Task");
    }

    public final boolean f(long j2, Date date) {
        Date g = this.h.g();
        if (g.equals(ConfigMetadataClient.f)) {
            return false;
        }
        return date.before(new Date(g.getTime() + TimeUnit.SECONDS.toMillis(j2)));
    }

    public final FirebaseRemoteConfigServerException g(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int b = firebaseRemoteConfigServerException.b();
        if (b != 401) {
            if (b != 403) {
                if (b != 429) {
                    if (b != 500) {
                        switch (b) {
                            case InterfaceC8148mw2.g.j /* 502 */:
                            case InterfaceC8148mw2.g.k /* 503 */:
                            case InterfaceC8148mw2.g.l /* 504 */:
                                str = "The server is unavailable. Please try again later.";
                                break;
                            default:
                                str = "The server returned an unexpected error.";
                                break;
                        }
                    } else {
                        str = "There was an internal server error.";
                    }
                } else {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
            } else {
                str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            }
        } else {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        }
        int b2 = firebaseRemoteConfigServerException.b();
        return new FirebaseRemoteConfigServerException(b2, "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    public final String h(long j2) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2)));
    }

    public Task<FetchResponse> i() {
        return j(this.h.i());
    }

    public Task<FetchResponse> j(final long j2) {
        final HashMap hashMap = new HashMap(this.i);
        hashMap.put(n, FetchType.BASE.e() + RemoteSettings.i + 1);
        return this.f.f().p(this.c, new Continuation() { // from class: o.MJ
            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task) {
                Task m2;
                m2 = ConfigFetchHandler.this.m(task, j2, hashMap);
                return m2;
            }
        });
    }

    @InterfaceC10697xN2
    public final FetchResponse k(String str, String str2, Date date, Map<String, String> map) throws FirebaseRemoteConfigException {
        Date date2;
        try {
            date2 = date;
            try {
                FetchResponse fetch = this.g.fetch(this.g.d(), str, str2, t(), this.h.e(), map, q(), date2);
                if (fetch.e() != null) {
                    this.h.q(fetch.e().k());
                }
                if (fetch.f() != null) {
                    this.h.p(fetch.f());
                }
                this.h.k();
                return fetch;
            } catch (FirebaseRemoteConfigServerException e) {
                e = e;
                FirebaseRemoteConfigServerException firebaseRemoteConfigServerException = e;
                ConfigMetadataClient.BackoffMetadata w = w(firebaseRemoteConfigServerException.b(), date2);
                if (v(w, firebaseRemoteConfigServerException.b())) {
                    throw new FirebaseRemoteConfigFetchThrottledException(w.a().getTime());
                }
                throw g(firebaseRemoteConfigServerException);
            }
        } catch (FirebaseRemoteConfigServerException e2) {
            e = e2;
            date2 = date;
        }
    }

    public final Task<FetchResponse> l(String str, String str2, Date date, Map<String, String> map) {
        try {
            final FetchResponse k2 = k(str, str2, date, map);
            if (k2.g() != 0) {
                return Tasks.g(k2);
            }
            return this.f.k(k2.e()).x(this.c, new SuccessContinuation() { // from class: o.QJ
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task a(Object obj) {
                    Task g;
                    ConfigContainer configContainer = (ConfigContainer) obj;
                    g = Tasks.g(ConfigFetchHandler.FetchResponse.this);
                    return g;
                }
            });
        } catch (FirebaseRemoteConfigException e) {
            return Tasks.f(e);
        }
    }

    public final Task<FetchResponse> m(Task<ConfigContainer> task, long j2, final Map<String, String> map) {
        final ConfigFetchHandler configFetchHandler;
        Task p;
        final Date date = new Date(this.d.a());
        if (task.v() && f(j2, date)) {
            return Tasks.g(FetchResponse.c(date));
        }
        Date p2 = p(date);
        if (p2 != null) {
            p = Tasks.f(new FirebaseRemoteConfigFetchThrottledException(h(p2.getTime() - date.getTime()), p2.getTime()));
            configFetchHandler = this;
        } else {
            final Task<String> id = this.a.getId();
            final Task<InstallationTokenResult> c = this.a.c(false);
            configFetchHandler = this;
            p = Tasks.m(id, c).p(this.c, new Continuation() { // from class: o.NJ
                @Override // com.google.android.gms.tasks.Continuation
                public final Object a(Task task2) {
                    return ConfigFetchHandler.a(ConfigFetchHandler.this, id, c, date, map, task2);
                }
            });
        }
        return p.p(configFetchHandler.c, new Continuation() { // from class: o.OJ
            /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.firebase.remoteconfig.internal.ConfigFetchHandler.c(com.google.firebase.remoteconfig.internal.ConfigFetchHandler, java.util.Date, com.google.android.gms.tasks.Task):com.google.android.gms.tasks.Task
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
                	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
                Caused by: java.lang.NullPointerException
                */
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object a(com.google.android.gms.tasks.Task r3) {
                /*
                    r2 = this;
                    com.google.firebase.remoteconfig.internal.ConfigFetchHandler r0 = com.google.firebase.remoteconfig.internal.ConfigFetchHandler.this
                    java.util.Date r1 = r2
                    com.google.android.gms.tasks.Task r3 = com.google.firebase.remoteconfig.internal.ConfigFetchHandler.c(r0, r1, r3)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: o.OJ.a(com.google.android.gms.tasks.Task):java.lang.Object");
            }
        });
    }

    public Task<FetchResponse> n(FetchType fetchType, int i) {
        final HashMap hashMap = new HashMap(this.i);
        hashMap.put(n, fetchType.e() + RemoteSettings.i + i);
        return this.f.f().p(this.c, new Continuation() { // from class: o.PJ
            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task) {
                Task m2;
                m2 = ConfigFetchHandler.this.m(task, 0L, hashMap);
                return m2;
            }
        });
    }

    @InterfaceC5056aJ2
    public Provider<AnalyticsConnector> o() {
        return this.b;
    }

    @InterfaceC11300zs1
    public final Date p(Date date) {
        Date a = this.h.b().a();
        if (date.before(a)) {
            return a;
        }
        return null;
    }

    @InterfaceC10697xN2
    public final Long q() {
        AnalyticsConnector analyticsConnector = this.b.get();
        if (analyticsConnector == null) {
            return null;
        }
        return (Long) analyticsConnector.d(true).get(m);
    }

    public final long r(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = k;
        long millis = timeUnit.toMillis(iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + this.e.nextInt((int) millis);
    }

    public long s() {
        return this.h.h();
    }

    @InterfaceC10697xN2
    public final Map<String, String> t() {
        HashMap hashMap = new HashMap();
        AnalyticsConnector analyticsConnector = this.b.get();
        if (analyticsConnector != null) {
            for (Map.Entry<String, Object> entry : analyticsConnector.d(false).entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }

    public final boolean u(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    public final boolean v(ConfigMetadataClient.BackoffMetadata backoffMetadata, int i) {
        if (backoffMetadata.b() > 1 || i == 429) {
            return true;
        }
        return false;
    }

    public final ConfigMetadataClient.BackoffMetadata w(int i, Date date) {
        if (u(i)) {
            x(date);
        }
        return this.h.b();
    }

    public final void x(Date date) {
        int b = this.h.b().b() + 1;
        this.h.m(b, new Date(date.getTime() + r(b)));
    }

    public final void y(Task<FetchResponse> task, Date date) {
        if (task.v()) {
            this.h.t(date);
            return;
        }
        Exception q = task.q();
        if (q == null) {
            return;
        }
        if (q instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.h.u();
        } else {
            this.h.s();
        }
    }
}
