package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class CrashlyticsNativeComponentDeferredProxy implements CrashlyticsNativeComponent {
    public static final NativeSessionFileProvider c = new MissingNativeSessionFileProvider();
    public final Deferred<CrashlyticsNativeComponent> a;
    public final AtomicReference<CrashlyticsNativeComponent> b = new AtomicReference<>(null);

    /* loaded from: classes3.dex */
    public static final class MissingNativeSessionFileProvider implements NativeSessionFileProvider {
        private MissingNativeSessionFileProvider() {
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File a() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public CrashlyticsReport.ApplicationExitInfo b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File d() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File e() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File f() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File g() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File h() {
            return null;
        }
    }

    public CrashlyticsNativeComponentDeferredProxy(Deferred<CrashlyticsNativeComponent> deferred) {
        this.a = deferred;
        deferred.a(new Deferred.DeferredHandler() { // from class: o.VQ
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void a(Provider provider) {
                CrashlyticsNativeComponentDeferredProxy.f(CrashlyticsNativeComponentDeferredProxy.this, provider);
            }
        });
    }

    public static /* synthetic */ void f(CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy, Provider provider) {
        crashlyticsNativeComponentDeferredProxy.getClass();
        Logger.f().b("Crashlytics native component now available.");
        crashlyticsNativeComponentDeferredProxy.b.set((CrashlyticsNativeComponent) provider.get());
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    @InterfaceC5670cr1
    public NativeSessionFileProvider a(@InterfaceC5670cr1 String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.b.get();
        if (crashlyticsNativeComponent == null) {
            return c;
        }
        return crashlyticsNativeComponent.a(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean b() {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.b.get();
        if (crashlyticsNativeComponent != null && crashlyticsNativeComponent.b()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void c(@InterfaceC5670cr1 final String str, @InterfaceC5670cr1 final String str2, final long j, @InterfaceC5670cr1 final StaticSessionData staticSessionData) {
        Logger f = Logger.f();
        f.k("Deferring native open session: " + str);
        this.a.a(new Deferred.DeferredHandler() { // from class: o.WQ
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void a(Provider provider) {
                ((CrashlyticsNativeComponent) provider.get()).c(str, str2, j, staticSessionData);
            }
        });
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean d(@InterfaceC5670cr1 String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.b.get();
        if (crashlyticsNativeComponent != null && crashlyticsNativeComponent.d(str)) {
            return true;
        }
        return false;
    }
}
