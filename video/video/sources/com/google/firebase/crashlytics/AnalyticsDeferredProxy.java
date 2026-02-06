package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
public class AnalyticsDeferredProxy {
    public final Deferred<AnalyticsConnector> a;
    public volatile AnalyticsEventLogger b;
    public volatile BreadcrumbSource c;
    @InterfaceC8710pF0("this")
    public final List<BreadcrumbHandler> d;

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred) {
        this(deferred, new DisabledBreadcrumbSource(), new UnavailableAnalyticsEventLogger());
    }

    public static /* synthetic */ void a(AnalyticsDeferredProxy analyticsDeferredProxy, Provider provider) {
        analyticsDeferredProxy.getClass();
        Logger.f().b("AnalyticsConnector now available.");
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) provider.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(analyticsConnector);
        CrashlyticsAnalyticsListener crashlyticsAnalyticsListener = new CrashlyticsAnalyticsListener();
        if (g(analyticsConnector, crashlyticsAnalyticsListener) != null) {
            Logger.f().b("Registered Firebase Analytics listener.");
            BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
            BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger, 500, TimeUnit.MILLISECONDS);
            synchronized (analyticsDeferredProxy) {
                try {
                    for (BreadcrumbHandler breadcrumbHandler : analyticsDeferredProxy.d) {
                        breadcrumbAnalyticsEventReceiver.a(breadcrumbHandler);
                    }
                    crashlyticsAnalyticsListener.d(breadcrumbAnalyticsEventReceiver);
                    crashlyticsAnalyticsListener.e(blockingAnalyticsEventLogger);
                    analyticsDeferredProxy.c = breadcrumbAnalyticsEventReceiver;
                    analyticsDeferredProxy.b = blockingAnalyticsEventLogger;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        Logger.f().m("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    public static /* synthetic */ void c(AnalyticsDeferredProxy analyticsDeferredProxy, BreadcrumbHandler breadcrumbHandler) {
        synchronized (analyticsDeferredProxy) {
            try {
                if (analyticsDeferredProxy.c instanceof DisabledBreadcrumbSource) {
                    analyticsDeferredProxy.d.add(breadcrumbHandler);
                }
                analyticsDeferredProxy.c.a(breadcrumbHandler);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @DeferredApi
    public static AnalyticsConnector.AnalyticsConnectorHandle g(@InterfaceC5670cr1 AnalyticsConnector analyticsConnector, @InterfaceC5670cr1 CrashlyticsAnalyticsListener crashlyticsAnalyticsListener) {
        AnalyticsConnector.AnalyticsConnectorHandle g = analyticsConnector.g("clx", crashlyticsAnalyticsListener);
        if (g == null) {
            Logger.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            AnalyticsConnector.AnalyticsConnectorHandle g2 = analyticsConnector.g("crash", crashlyticsAnalyticsListener);
            if (g2 != null) {
                Logger.f().m("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
            return g2;
        }
        return g;
    }

    public AnalyticsEventLogger d() {
        return new AnalyticsEventLogger() { // from class: o.H8
            @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
            public final void a(String str, Bundle bundle) {
                AnalyticsDeferredProxy.this.b.a(str, bundle);
            }
        };
    }

    public BreadcrumbSource e() {
        return new BreadcrumbSource() { // from class: o.G8
            @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
            public final void a(BreadcrumbHandler breadcrumbHandler) {
                AnalyticsDeferredProxy.c(AnalyticsDeferredProxy.this, breadcrumbHandler);
            }
        };
    }

    public final void f() {
        this.a.a(new Deferred.DeferredHandler() { // from class: o.I8
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void a(Provider provider) {
                AnalyticsDeferredProxy.a(AnalyticsDeferredProxy.this, provider);
            }
        });
    }

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred, @InterfaceC5670cr1 BreadcrumbSource breadcrumbSource, @InterfaceC5670cr1 AnalyticsEventLogger analyticsEventLogger) {
        this.a = deferred;
        this.c = breadcrumbSource;
        this.d = new ArrayList();
        this.b = analyticsEventLogger;
        f();
    }
}
