package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.BuildIdInfo;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.ExecutorUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.inject.Deferred;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class FirebaseCrashlytics {
    public static final String b = "clx";
    public static final String c = "crash";
    public static final int d = 500;
    @InterfaceC5056aJ2
    public final CrashlyticsCore a;

    public FirebaseCrashlytics(@InterfaceC5670cr1 CrashlyticsCore crashlyticsCore) {
        this.a = crashlyticsCore;
    }

    @InterfaceC5670cr1
    public static FirebaseCrashlytics d() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.p().l(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    @InterfaceC11300zs1
    public static FirebaseCrashlytics e(@InterfaceC5670cr1 FirebaseApp firebaseApp, @InterfaceC5670cr1 FirebaseInstallationsApi firebaseInstallationsApi, @InterfaceC5670cr1 Deferred<CrashlyticsNativeComponent> deferred, @InterfaceC5670cr1 Deferred<AnalyticsConnector> deferred2, @InterfaceC5670cr1 Deferred<FirebaseRemoteConfigInterop> deferred3) {
        Context n = firebaseApp.n();
        String packageName = n.getPackageName();
        Logger f = Logger.f();
        f.g("Initializing Firebase Crashlytics " + CrashlyticsCore.m() + " for " + packageName);
        FileStore fileStore = new FileStore(n);
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
        IdManager idManager = new IdManager(n, packageName, firebaseInstallationsApi, dataCollectionArbiter);
        CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = new CrashlyticsNativeComponentDeferredProxy(deferred);
        AnalyticsDeferredProxy analyticsDeferredProxy = new AnalyticsDeferredProxy(deferred2);
        ExecutorService c2 = ExecutorUtils.c("Crashlytics Exception Handler");
        CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = new CrashlyticsAppQualitySessionsSubscriber(dataCollectionArbiter, fileStore);
        FirebaseSessionsDependencies.e(crashlyticsAppQualitySessionsSubscriber);
        final CrashlyticsCore crashlyticsCore = new CrashlyticsCore(firebaseApp, idManager, crashlyticsNativeComponentDeferredProxy, dataCollectionArbiter, analyticsDeferredProxy.e(), analyticsDeferredProxy.d(), fileStore, c2, crashlyticsAppQualitySessionsSubscriber, new RemoteConfigDeferredProxy(deferred3));
        String j = firebaseApp.s().j();
        String n2 = CommonUtils.n(n);
        List<BuildIdInfo> j2 = CommonUtils.j(n);
        Logger f2 = Logger.f();
        f2.b("Mapping file ID is: " + n2);
        for (BuildIdInfo buildIdInfo : j2) {
            Logger.f().b(String.format("Build id for %s on %s: %s", buildIdInfo.c(), buildIdInfo.a(), buildIdInfo.b()));
        }
        try {
            AppData a = AppData.a(n, idManager, j, n2, j2, new DevelopmentPlatformProvider(n));
            Logger f3 = Logger.f();
            f3.k("Installer package name is: " + a.d);
            ExecutorService c3 = ExecutorUtils.c("com.google.firebase.crashlytics.startup");
            final SettingsController l = SettingsController.l(n, j, idManager, new HttpRequestFactory(), a.f, a.g, fileStore, dataCollectionArbiter);
            l.p(c3).n(c3, new Continuation<Void, Object>() { // from class: com.google.firebase.crashlytics.FirebaseCrashlytics.1
                @Override // com.google.android.gms.tasks.Continuation
                public Object a(@InterfaceC5670cr1 Task<Void> task) throws Exception {
                    if (!task.v()) {
                        Logger.f().e("Error fetching settings.", task.q());
                        return null;
                    }
                    return null;
                }
            });
            final boolean t = crashlyticsCore.t(a, l);
            Tasks.d(c3, new Callable<Void>() { // from class: com.google.firebase.crashlytics.FirebaseCrashlytics.2
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public Void call() throws Exception {
                    if (t) {
                        crashlyticsCore.j(l);
                        return null;
                    }
                    return null;
                }
            });
            return new FirebaseCrashlytics(crashlyticsCore);
        } catch (PackageManager.NameNotFoundException e) {
            Logger.f().e("Error retrieving app package info.", e);
            return null;
        }
    }

    @InterfaceC5670cr1
    public Task<Boolean> a() {
        return this.a.e();
    }

    public void b() {
        this.a.f();
    }

    public boolean c() {
        return this.a.g();
    }

    public void f(@InterfaceC5670cr1 String str) {
        this.a.o(str);
    }

    public void g(@InterfaceC5670cr1 Throwable th) {
        if (th == null) {
            Logger.f().m("A null value was passed to recordException. Ignoring.");
        } else {
            this.a.p(th);
        }
    }

    public void h() {
        this.a.u();
    }

    public void i(@InterfaceC11300zs1 Boolean bool) {
        this.a.v(bool);
    }

    public void j(boolean z) {
        this.a.v(Boolean.valueOf(z));
    }

    public void k(@InterfaceC5670cr1 String str, double d2) {
        this.a.w(str, Double.toString(d2));
    }

    public void l(@InterfaceC5670cr1 String str, float f) {
        this.a.w(str, Float.toString(f));
    }

    public void m(@InterfaceC5670cr1 String str, int i) {
        this.a.w(str, Integer.toString(i));
    }

    public void n(@InterfaceC5670cr1 String str, long j) {
        this.a.w(str, Long.toString(j));
    }

    public void o(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        this.a.w(str, str2);
    }

    public void p(@InterfaceC5670cr1 String str, boolean z) {
        this.a.w(str, Boolean.toString(z));
    }

    public void q(@InterfaceC5670cr1 CustomKeysAndValues customKeysAndValues) {
        this.a.x(customKeysAndValues.a);
    }

    public void r(@InterfaceC5670cr1 String str) {
        this.a.z(str);
    }
}
