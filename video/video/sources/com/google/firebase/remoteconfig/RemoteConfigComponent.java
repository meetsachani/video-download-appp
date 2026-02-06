package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.google.firebase.remoteconfig.internal.Personalization;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateFactory;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import o.C6515gH1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;

@KeepForSdk
/* loaded from: classes3.dex */
public class RemoteConfigComponent implements FirebaseRemoteConfigInterop {
    public static final String j = "activate";
    public static final String k = "fetch";
    public static final String l = "defaults";
    public static final long m = 60;
    public static final String n = "frc";

    /* renamed from: o  reason: collision with root package name */
    public static final String f388o = "settings";
    @InterfaceC5056aJ2
    public static final String p = "firebase";
    public static final Clock q = DefaultClock.d();
    public static final Random r = new Random();
    public static final Map<String, FirebaseRemoteConfig> s = new HashMap();
    @InterfaceC8710pF0("this")
    public final Map<String, FirebaseRemoteConfig> a;
    public final Context b;
    public final ScheduledExecutorService c;
    public final FirebaseApp d;
    public final FirebaseInstallationsApi e;
    public final FirebaseABTesting f;
    @InterfaceC11300zs1
    public final Provider<AnalyticsConnector> g;
    public final String h;
    @InterfaceC8710pF0("this")
    public Map<String, String> i;

    /* loaded from: classes3.dex */
    public static class GlobalBackgroundListener implements BackgroundDetector.BackgroundStateChangeListener {
        public static final AtomicReference<GlobalBackgroundListener> a = new AtomicReference<>();

        private GlobalBackgroundListener() {
        }

        public static void c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<GlobalBackgroundListener> atomicReference = a;
            if (atomicReference.get() == null) {
                GlobalBackgroundListener globalBackgroundListener = new GlobalBackgroundListener();
                if (C6515gH1.a(atomicReference, null, globalBackgroundListener)) {
                    BackgroundDetector.c(application);
                    BackgroundDetector.b().a(globalBackgroundListener);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void a(boolean z) {
            RemoteConfigComponent.q(z);
        }
    }

    public RemoteConfigComponent(Context context, @Blocking ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider<AnalyticsConnector> provider) {
        this(context, scheduledExecutorService, firebaseApp, firebaseInstallationsApi, firebaseABTesting, provider, true);
    }

    public static /* synthetic */ AnalyticsConnector b() {
        return null;
    }

    @InterfaceC5056aJ2
    public static ConfigMetadataClient k(Context context, String str, String str2) {
        return new ConfigMetadataClient(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, f388o), 0));
    }

    @InterfaceC11300zs1
    public static Personalization l(FirebaseApp firebaseApp, String str, Provider<AnalyticsConnector> provider) {
        if (p(firebaseApp) && str.equals(p)) {
            return new Personalization(provider);
        }
        return null;
    }

    public static boolean o(FirebaseApp firebaseApp, String str) {
        if (str.equals(p) && p(firebaseApp)) {
            return true;
        }
        return false;
    }

    public static boolean p(FirebaseApp firebaseApp) {
        return firebaseApp.r().equals(FirebaseApp.l);
    }

    public static synchronized void q(boolean z) {
        synchronized (RemoteConfigComponent.class) {
            for (FirebaseRemoteConfig firebaseRemoteConfig : s.values()) {
                firebaseRemoteConfig.F(z);
            }
        }
    }

    @Override // com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop
    public void a(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 RolloutsStateSubscriber rolloutsStateSubscriber) {
        e(str).x().e(rolloutsStateSubscriber);
    }

    @InterfaceC5056aJ2
    public synchronized FirebaseRemoteConfig d(FirebaseApp firebaseApp, String str, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        RemoteConfigComponent remoteConfigComponent;
        String str2;
        FirebaseABTesting firebaseABTesting2;
        try {
            try {
                if (!this.a.containsKey(str)) {
                    Context context = this.b;
                    if (o(firebaseApp, str)) {
                        firebaseABTesting2 = firebaseABTesting;
                    } else {
                        firebaseABTesting2 = null;
                    }
                    remoteConfigComponent = this;
                    str2 = str;
                    FirebaseRemoteConfig firebaseRemoteConfig = new FirebaseRemoteConfig(context, firebaseApp, firebaseInstallationsApi, firebaseABTesting2, executor, configCacheClient, configCacheClient2, configCacheClient3, configFetchHandler, configGetParameterHandler, configMetadataClient, m(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient2, this.b, str, configMetadataClient), rolloutsStateSubscriptionsHandler);
                    firebaseRemoteConfig.J();
                    remoteConfigComponent.a.put(str2, firebaseRemoteConfig);
                    s.put(str2, firebaseRemoteConfig);
                } else {
                    remoteConfigComponent = this;
                    str2 = str;
                }
                return remoteConfigComponent.a.get(str2);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @InterfaceC5056aJ2
    @KeepForSdk
    public synchronized FirebaseRemoteConfig e(String str) {
        Throwable th;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ConfigCacheClient f = f(str, k);
            ConfigCacheClient f2 = f(str, j);
            ConfigCacheClient f3 = f(str, l);
            ConfigMetadataClient k2 = k(this.b, this.h, str);
            ConfigGetParameterHandler j2 = j(f2, f3);
            final Personalization l2 = l(this.d, str, this.g);
            if (l2 != null) {
                try {
                    j2.b(new BiConsumer() { // from class: o.cR1
                        @Override // com.google.android.gms.common.util.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            Personalization.this.a((String) obj, (ConfigContainer) obj2);
                        }
                    });
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            return d(this.d, str, this.e, this.f, this.c, f, f2, f3, h(str, f, k2), j2, k2, n(f2, j2));
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final ConfigCacheClient f(String str, String str2) {
        return ConfigCacheClient.j(this.c, ConfigStorageClient.d(this.b, String.format("%s_%s_%s_%s.json", "frc", this.h, str, str2)));
    }

    public FirebaseRemoteConfig g() {
        return e(p);
    }

    @InterfaceC5056aJ2
    public synchronized ConfigFetchHandler h(String str, ConfigCacheClient configCacheClient, ConfigMetadataClient configMetadataClient) {
        FirebaseInstallationsApi firebaseInstallationsApi;
        Provider<AnalyticsConnector> provider;
        try {
            firebaseInstallationsApi = this.e;
            if (p(this.d)) {
                provider = this.g;
            } else {
                provider = new Provider() { // from class: o.eR1
                    @Override // com.google.firebase.inject.Provider
                    public final Object get() {
                        return RemoteConfigComponent.b();
                    }
                };
            }
        } catch (Throwable th) {
            throw th;
        }
        return new ConfigFetchHandler(firebaseInstallationsApi, provider, this.c, q, r, configCacheClient, i(this.d.s().i(), str, configMetadataClient), configMetadataClient, this.i);
    }

    @InterfaceC5056aJ2
    public ConfigFetchHttpClient i(String str, String str2, ConfigMetadataClient configMetadataClient) {
        return new ConfigFetchHttpClient(this.b, this.d.s().j(), str, str2, configMetadataClient.c(), configMetadataClient.c());
    }

    public final ConfigGetParameterHandler j(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        return new ConfigGetParameterHandler(this.c, configCacheClient, configCacheClient2);
    }

    public synchronized ConfigRealtimeHandler m(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, ConfigMetadataClient configMetadataClient) {
        return new ConfigRealtimeHandler(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, str, configMetadataClient, this.c);
    }

    public final RolloutsStateSubscriptionsHandler n(ConfigCacheClient configCacheClient, ConfigGetParameterHandler configGetParameterHandler) {
        return new RolloutsStateSubscriptionsHandler(configCacheClient, RolloutsStateFactory.a(configGetParameterHandler), this.c);
    }

    @InterfaceC5056aJ2
    public synchronized void r(Map<String, String> map) {
        this.i = map;
    }

    @InterfaceC5056aJ2
    public RemoteConfigComponent(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider<AnalyticsConnector> provider, boolean z) {
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = firebaseApp;
        this.e = firebaseInstallationsApi;
        this.f = firebaseABTesting;
        this.g = provider;
        this.h = firebaseApp.s().j();
        GlobalBackgroundListener.c(context);
        if (z) {
            Tasks.d(scheduledExecutorService, new Callable() { // from class: o.dR1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return RemoteConfigComponent.this.g();
                }
            });
        }
    }
}
