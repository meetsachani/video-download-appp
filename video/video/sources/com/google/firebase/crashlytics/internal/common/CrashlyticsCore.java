package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.BuildConfig;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.UE;

/* loaded from: classes3.dex */
public class CrashlyticsCore {
    public static final String A = "initialization_marker";
    public static final String B = "crash_marker";
    public static final String s = "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin";
    public static final int t = 1024;
    public static final int u = 10;
    public static final String v = "com.crashlytics.RequireBuildId";
    public static final boolean w = true;
    public static final int x = 3;
    public static final String y = "com.crashlytics.on-demand.recorded-exceptions";
    public static final String z = "com.crashlytics.on-demand.dropped-exceptions";
    public final Context a;
    public final FirebaseApp b;
    public final DataCollectionArbiter c;
    public CrashlyticsFileMarker f;
    public CrashlyticsFileMarker g;
    public boolean h;
    public CrashlyticsController i;
    public final IdManager j;
    public final FileStore k;
    @InterfaceC5056aJ2
    public final BreadcrumbSource l;
    public final AnalyticsEventLogger m;
    public final ExecutorService n;

    /* renamed from: o  reason: collision with root package name */
    public final CrashlyticsBackgroundWorker f343o;
    public final CrashlyticsAppQualitySessionsSubscriber p;
    public final CrashlyticsNativeComponent q;
    public final RemoteConfigDeferredProxy r;
    public final long e = System.currentTimeMillis();
    public final OnDemandCounter d = new OnDemandCounter();

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, FileStore fileStore, ExecutorService executorService, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, RemoteConfigDeferredProxy remoteConfigDeferredProxy) {
        this.b = firebaseApp;
        this.c = dataCollectionArbiter;
        this.a = firebaseApp.n();
        this.j = idManager;
        this.q = crashlyticsNativeComponent;
        this.l = breadcrumbSource;
        this.m = analyticsEventLogger;
        this.n = executorService;
        this.k = fileStore;
        this.f343o = new CrashlyticsBackgroundWorker(executorService);
        this.p = crashlyticsAppQualitySessionsSubscriber;
        this.r = remoteConfigDeferredProxy;
    }

    public static String m() {
        return BuildConfig.d;
    }

    public static boolean n(String str, boolean z2) {
        if (!z2) {
            Logger.f().k("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            Log.e(Logger.c, UE.h);
            Log.e(Logger.c, ".     |  | ");
            Log.e(Logger.c, ".     |  |");
            Log.e(Logger.c, ".     |  |");
            Log.e(Logger.c, ".   \\ |  | /");
            Log.e(Logger.c, ".    \\    /");
            Log.e(Logger.c, ".     \\  /");
            Log.e(Logger.c, ".      \\/");
            Log.e(Logger.c, UE.h);
            Log.e(Logger.c, s);
            Log.e(Logger.c, UE.h);
            Log.e(Logger.c, ".      /\\");
            Log.e(Logger.c, ".     /  \\");
            Log.e(Logger.c, ".    /    \\");
            Log.e(Logger.c, ".   / |  | \\");
            Log.e(Logger.c, ".     |  |");
            Log.e(Logger.c, ".     |  |");
            Log.e(Logger.c, ".     |  |");
            Log.e(Logger.c, UE.h);
            return false;
        }
    }

    public final void d() {
        try {
            this.h = Boolean.TRUE.equals((Boolean) Utils.f(this.f343o.h(new Callable<Boolean>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore.4
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public Boolean call() throws Exception {
                    return Boolean.valueOf(CrashlyticsCore.this.i.u());
                }
            })));
        } catch (Exception unused) {
            this.h = false;
        }
    }

    @InterfaceC5670cr1
    public Task<Boolean> e() {
        return this.i.o();
    }

    public Task<Void> f() {
        return this.i.t();
    }

    public boolean g() {
        return this.h;
    }

    public boolean h() {
        return this.f.c();
    }

    public final Task<Void> i(SettingsProvider settingsProvider) {
        s();
        try {
            this.l.a(new BreadcrumbHandler() { // from class: o.UQ
                @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler
                public final void a(String str) {
                    CrashlyticsCore.this.o(str);
                }
            });
            this.i.W();
            if (!settingsProvider.b().b.a) {
                Logger.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.f(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.i.B(settingsProvider)) {
                Logger.f().m("Previous sessions could not be finalized.");
            }
            return this.i.c0(settingsProvider.a());
        } catch (Exception e) {
            Logger.f().e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return Tasks.f(e);
        } finally {
            r();
        }
    }

    public Task<Void> j(final SettingsProvider settingsProvider) {
        return Utils.h(this.n, new Callable<Task<Void>>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore.1
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Task<Void> call() throws Exception {
                return CrashlyticsCore.this.i(settingsProvider);
            }
        });
    }

    public final void k(final SettingsProvider settingsProvider) {
        Future<?> submit = this.n.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore.2
            @Override // java.lang.Runnable
            public void run() {
                CrashlyticsCore.this.i(settingsProvider);
            }
        });
        Logger.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Logger.f().e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            Logger.f().e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Logger.f().e("Crashlytics timed out during initialization.", e3);
        }
    }

    public CrashlyticsController l() {
        return this.i;
    }

    public void o(String str) {
        this.i.g0(System.currentTimeMillis() - this.e, str);
    }

    public void p(@InterfaceC5670cr1 Throwable th) {
        this.i.f0(Thread.currentThread(), th);
    }

    public void q(Throwable th) {
        Logger f = Logger.f();
        f.b("Recorded on-demand fatal events: " + this.d.b());
        Logger f2 = Logger.f();
        f2.b("Dropped on-demand fatal events: " + this.d.a());
        this.i.a0(y, Integer.toString(this.d.b()));
        this.i.a0(z, Integer.toString(this.d.a()));
        this.i.R(Thread.currentThread(), th);
    }

    public void r() {
        this.f343o.h(new Callable<Boolean>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore.3
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Boolean call() throws Exception {
                try {
                    boolean d = CrashlyticsCore.this.f.d();
                    if (!d) {
                        Logger.f().m("Initialization marker file was not properly removed.");
                    }
                    return Boolean.valueOf(d);
                } catch (Exception e) {
                    Logger.f().e("Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            }
        });
    }

    public void s() {
        this.f343o.b();
        this.f.a();
        Logger.f().k("Initialization marker file was created.");
    }

    public boolean t(AppData appData, SettingsProvider settingsProvider) {
        if (n(appData.b, CommonUtils.i(this.a, v, true))) {
            String clsuuid = new CLSUUID(this.j).toString();
            try {
                this.g = new CrashlyticsFileMarker(B, this.k);
                this.f = new CrashlyticsFileMarker(A, this.k);
                UserMetadata userMetadata = new UserMetadata(clsuuid, this.k, this.f343o);
                LogFileManager logFileManager = new LogFileManager(this.k);
                MiddleOutFallbackStrategy middleOutFallbackStrategy = new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10));
                this.r.b(userMetadata);
                this.i = new CrashlyticsController(this.a, this.f343o, this.j, this.c, this.k, this.g, appData, userMetadata, logFileManager, SessionReportingCoordinator.m(this.a, this.j, this.k, appData, logFileManager, userMetadata, middleOutFallbackStrategy, settingsProvider, this.d, this.p), this.q, this.m, this.p);
                boolean h = h();
                d();
                this.i.z(clsuuid, Thread.getDefaultUncaughtExceptionHandler(), settingsProvider);
                if (h && CommonUtils.d(this.a)) {
                    Logger.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    k(settingsProvider);
                    return false;
                }
                Logger.f().b("Successfully configured exception handler.");
                return true;
            } catch (Exception e) {
                Logger.f().e("Crashlytics was not started due to an exception during initialization", e);
                this.i = null;
                return false;
            }
        }
        throw new IllegalStateException(s);
    }

    public Task<Void> u() {
        return this.i.X();
    }

    public void v(@InterfaceC11300zs1 Boolean bool) {
        this.c.h(bool);
    }

    public void w(String str, String str2) {
        this.i.Y(str, str2);
    }

    public void x(Map<String, String> map) {
        this.i.Z(map);
    }

    public void y(String str, String str2) {
        this.i.a0(str, str2);
    }

    public void z(String str) {
        this.i.b0(str);
    }
}
