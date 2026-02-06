package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.messaging.MessagingAnalytics;
import com.google.firebase.provider.FirebaseInitProvider;
import com.google.firebase.tracing.ComponentMonitor;
import com.google.firebase.tracing.FirebaseTrace;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.C2531Be;
import o.C2555Bk;
import o.C6515gH1;
import o.C6566gU0;
import o.C9682tD2;
import o.C9998uW1;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
public class FirebaseApp {
    public static final String k = "FirebaseApp";
    @InterfaceC5670cr1
    public static final String l = "[DEFAULT]";
    public static final Object m = new Object();
    @InterfaceC8710pF0("LOCK")
    public static final Map<String, FirebaseApp> n = new C2531Be();
    public final Context a;
    public final String b;
    public final FirebaseOptions c;
    public final ComponentRuntime d;
    public final Lazy<DataCollectionConfigStorage> g;
    public final Provider<DefaultHeartBeatController> h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final List<BackgroundStateChangeListener> i = new CopyOnWriteArrayList();
    public final List<FirebaseAppLifecycleListener> j = new CopyOnWriteArrayList();

    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void a(boolean z);
    }

    @TargetApi(14)
    /* loaded from: classes3.dex */
    public static class GlobalBackgroundStateListener implements BackgroundDetector.BackgroundStateChangeListener {
        public static AtomicReference<GlobalBackgroundStateListener> a = new AtomicReference<>();

        private GlobalBackgroundStateListener() {
        }

        public static void c(Context context) {
            if (PlatformVersion.c() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    GlobalBackgroundStateListener globalBackgroundStateListener = new GlobalBackgroundStateListener();
                    if (C6515gH1.a(a, null, globalBackgroundStateListener)) {
                        BackgroundDetector.c(application);
                        BackgroundDetector.b().a(globalBackgroundStateListener);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void a(boolean z) {
            synchronized (FirebaseApp.m) {
                try {
                    Iterator it = new ArrayList(FirebaseApp.n.values()).iterator();
                    while (it.hasNext()) {
                        FirebaseApp firebaseApp = (FirebaseApp) it.next();
                        if (firebaseApp.e.get()) {
                            firebaseApp.D(z);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @TargetApi(24)
    /* loaded from: classes3.dex */
    public static class UserUnlockReceiver extends BroadcastReceiver {
        public static AtomicReference<UserUnlockReceiver> b = new AtomicReference<>();
        public final Context a;

        public UserUnlockReceiver(Context context) {
            this.a = context;
        }

        public static void b(Context context) {
            if (b.get() == null) {
                UserUnlockReceiver userUnlockReceiver = new UserUnlockReceiver(context);
                if (C6515gH1.a(b, null, userUnlockReceiver)) {
                    context.registerReceiver(userUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.m) {
                try {
                    for (FirebaseApp firebaseApp : FirebaseApp.n.values()) {
                        firebaseApp.v();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    public FirebaseApp(final Context context, String str, FirebaseOptions firebaseOptions) {
        this.a = (Context) Preconditions.r(context);
        this.b = Preconditions.l(str);
        this.c = (FirebaseOptions) Preconditions.r(firebaseOptions);
        StartupTime b = FirebaseInitProvider.b();
        FirebaseTrace.b(MessagingAnalytics.a);
        FirebaseTrace.b(ComponentDiscovery.c);
        List<Provider<ComponentRegistrar>> c = ComponentDiscovery.d(context, ComponentDiscoveryService.class).c();
        FirebaseTrace.a();
        FirebaseTrace.b("Runtime");
        ComponentRuntime.Builder f = ComponentRuntime.p(UiExecutor.INSTANCE).d(c).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(Component.y(context, Context.class, new Class[0])).b(Component.y(this, FirebaseApp.class, new Class[0])).b(Component.y(firebaseOptions, FirebaseOptions.class, new Class[0])).f(new ComponentMonitor());
        if (C9682tD2.a(context) && FirebaseInitProvider.c()) {
            f.b(Component.y(b, StartupTime.class, new Class[0]));
        }
        ComponentRuntime e = f.e();
        this.d = e;
        FirebaseTrace.a();
        this.g = new Lazy<>(new Provider() { // from class: o.At0
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return FirebaseApp.b(FirebaseApp.this, context);
            }
        });
        this.h = e.i(DefaultHeartBeatController.class);
        g(new BackgroundStateChangeListener() { // from class: o.Bt0
            @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
            public final void a(boolean z) {
                FirebaseApp.a(FirebaseApp.this, z);
            }
        });
        FirebaseTrace.a();
    }

    public static String C(@InterfaceC5670cr1 String str) {
        return str.trim();
    }

    public static /* synthetic */ void a(FirebaseApp firebaseApp, boolean z) {
        if (!z) {
            firebaseApp.h.get().h();
        } else {
            firebaseApp.getClass();
        }
    }

    public static /* synthetic */ DataCollectionConfigStorage b(FirebaseApp firebaseApp, Context context) {
        return new DataCollectionConfigStorage(context, firebaseApp.t(), (Publisher) firebaseApp.d.a(Publisher.class));
    }

    @InterfaceC5056aJ2
    public static void j() {
        synchronized (m) {
            n.clear();
        }
    }

    public static List<String> m() {
        ArrayList arrayList = new ArrayList();
        synchronized (m) {
            try {
                for (FirebaseApp firebaseApp : n.values()) {
                    arrayList.add(firebaseApp.r());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @InterfaceC5670cr1
    public static List<FirebaseApp> o(@InterfaceC5670cr1 Context context) {
        ArrayList arrayList;
        synchronized (m) {
            arrayList = new ArrayList(n.values());
        }
        return arrayList;
    }

    @InterfaceC5670cr1
    public static FirebaseApp p() {
        FirebaseApp firebaseApp;
        synchronized (m) {
            try {
                firebaseApp = n.get(l);
                if (firebaseApp != null) {
                    firebaseApp.h.get().h();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return firebaseApp;
    }

    @InterfaceC5670cr1
    public static FirebaseApp q(@InterfaceC5670cr1 String str) {
        FirebaseApp firebaseApp;
        List<String> m2;
        String str2;
        synchronized (m) {
            try {
                firebaseApp = n.get(C(str));
                if (firebaseApp != null) {
                    firebaseApp.h.get().h();
                } else {
                    if (m().isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(C6566gU0.h, m2);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
            } finally {
            }
        }
        return firebaseApp;
    }

    @KeepForSdk
    public static String u(String str, FirebaseOptions firebaseOptions) {
        return Base64Utils.f(str.getBytes(Charset.defaultCharset())) + C2555Bk.p1 + Base64Utils.f(firebaseOptions.j().getBytes(Charset.defaultCharset()));
    }

    @InterfaceC11300zs1
    public static FirebaseApp x(@InterfaceC5670cr1 Context context) {
        synchronized (m) {
            try {
                if (n.containsKey(l)) {
                    return p();
                }
                FirebaseOptions h = FirebaseOptions.h(context);
                if (h == null) {
                    Log.w(k, "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return y(context, h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC5670cr1
    public static FirebaseApp y(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 FirebaseOptions firebaseOptions) {
        return z(context, firebaseOptions, l);
    }

    @InterfaceC5670cr1
    public static FirebaseApp z(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 FirebaseOptions firebaseOptions, @InterfaceC5670cr1 String str) {
        FirebaseApp firebaseApp;
        GlobalBackgroundStateListener.c(context);
        String C = C(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (m) {
            Map<String, FirebaseApp> map = n;
            Preconditions.y(!map.containsKey(C), "FirebaseApp name " + C + " already exists!");
            Preconditions.s(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, C, firebaseOptions);
            map.put(C, firebaseApp);
        }
        firebaseApp.v();
        return firebaseApp;
    }

    @KeepForSdk
    public boolean A() {
        i();
        return this.g.get().b();
    }

    @InterfaceC5056aJ2
    @KeepForSdk
    public boolean B() {
        return l.equals(r());
    }

    public final void D(boolean z) {
        Log.d(k, "Notifying background state change listeners.");
        for (BackgroundStateChangeListener backgroundStateChangeListener : this.i) {
            backgroundStateChangeListener.a(z);
        }
    }

    public final void E() {
        for (FirebaseAppLifecycleListener firebaseAppLifecycleListener : this.j) {
            firebaseAppLifecycleListener.a(this.b, this.c);
        }
    }

    @KeepForSdk
    public void F(BackgroundStateChangeListener backgroundStateChangeListener) {
        i();
        this.i.remove(backgroundStateChangeListener);
    }

    @KeepForSdk
    public void G(@InterfaceC5670cr1 FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        i();
        Preconditions.r(firebaseAppLifecycleListener);
        this.j.remove(firebaseAppLifecycleListener);
    }

    public void H(boolean z) {
        i();
        if (this.e.compareAndSet(!z, z)) {
            boolean d = BackgroundDetector.b().d();
            if (z && d) {
                D(true);
            } else if (!z && d) {
                D(false);
            }
        }
    }

    @KeepForSdk
    public void I(Boolean bool) {
        i();
        this.g.get().e(bool);
    }

    @KeepForSdk
    @Deprecated
    public void J(boolean z) {
        I(Boolean.valueOf(z));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        return this.b.equals(((FirebaseApp) obj).r());
    }

    @KeepForSdk
    public void g(BackgroundStateChangeListener backgroundStateChangeListener) {
        i();
        if (this.e.get() && BackgroundDetector.b().d()) {
            backgroundStateChangeListener.a(true);
        }
        this.i.add(backgroundStateChangeListener);
    }

    @KeepForSdk
    public void h(@InterfaceC5670cr1 FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        i();
        Preconditions.r(firebaseAppLifecycleListener);
        this.j.add(firebaseAppLifecycleListener);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public final void i() {
        Preconditions.y(!this.f.get(), "FirebaseApp was deleted");
    }

    public void k() {
        if (!this.f.compareAndSet(false, true)) {
            return;
        }
        synchronized (m) {
            n.remove(this.b);
        }
        E();
    }

    @KeepForSdk
    public <T> T l(Class<T> cls) {
        i();
        return (T) this.d.a(cls);
    }

    @InterfaceC5670cr1
    public Context n() {
        i();
        return this.a;
    }

    @InterfaceC5670cr1
    public String r() {
        i();
        return this.b;
    }

    @InterfaceC5670cr1
    public FirebaseOptions s() {
        i();
        return this.c;
    }

    @KeepForSdk
    public String t() {
        return Base64Utils.f(r().getBytes(Charset.defaultCharset())) + C2555Bk.p1 + Base64Utils.f(s().j().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return Objects.d(this).a("name", this.b).a(C9998uW1.m0, this.c).toString();
    }

    public final void v() {
        if (!C9682tD2.a(this.a)) {
            Log.i(k, "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + r());
            UserUnlockReceiver.b(this.a);
            return;
        }
        Log.i(k, "Device unlocked: initializing all Firebase APIs for app " + r());
        this.d.u(B());
        this.h.get().h();
    }

    @HT1({HT1.a.Z0})
    @InterfaceC5056aJ2
    public void w() {
        this.d.t();
    }
}
