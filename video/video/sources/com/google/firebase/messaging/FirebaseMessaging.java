package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.ProxyNotificationInitializer;
import com.google.firebase.messaging.RequestDeduplicator;
import com.google.firebase.messaging.Store;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;
import o.Ot2;

/* loaded from: classes3.dex */
public class FirebaseMessaging {

    /* renamed from: o  reason: collision with root package name */
    public static final String f371o = "FirebaseMessaging";
    public static final String p = "com.google.android.gms";
    public static final String q = "com.google.android.gcm.intent.SEND";
    public static final String r = "app";
    @Deprecated
    public static final String s = "FCM";
    public static final long t = 30;
    public static final long u = TimeUnit.HOURS.toSeconds(8);
    public static final String v = "";
    @InterfaceC8710pF0("FirebaseMessaging.class")
    public static Store w;
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    @SuppressLint({"FirebaseUnknownNullness"})
    public static Ot2 x;
    @InterfaceC8710pF0("FirebaseMessaging.class")
    @InterfaceC5056aJ2
    public static ScheduledExecutorService y;
    public final FirebaseApp a;
    @InterfaceC11300zs1
    public final FirebaseInstanceIdInternal b;
    public final FirebaseInstallationsApi c;
    public final Context d;
    public final GmsRpc e;
    public final RequestDeduplicator f;
    public final AutoInit g;
    public final Executor h;
    public final Executor i;
    public final Executor j;
    public final Task<TopicsSubscriber> k;
    public final Metadata l;
    @InterfaceC8710pF0("this")
    public boolean m;
    public final Application.ActivityLifecycleCallbacks n;

    /* loaded from: classes3.dex */
    public class AutoInit {
        public static final String f = "firebase_messaging_auto_init_enabled";
        public static final String g = "com.google.firebase.messaging";
        public static final String h = "auto_init";
        public final Subscriber a;
        @InterfaceC8710pF0("this")
        public boolean b;
        @InterfaceC8710pF0("this")
        @InterfaceC11300zs1
        public EventHandler<DataCollectionDefaultChange> c;
        @InterfaceC8710pF0("this")
        @InterfaceC11300zs1
        public Boolean d;

        public AutoInit(Subscriber subscriber) {
            this.a = subscriber;
        }

        public static /* synthetic */ void a(AutoInit autoInit, Event event) {
            if (autoInit.c()) {
                FirebaseMessaging.this.L();
            }
        }

        public synchronized void b() {
            try {
                if (this.b) {
                    return;
                }
                Boolean d = d();
                this.d = d;
                if (d == null) {
                    EventHandler<DataCollectionDefaultChange> eventHandler = new EventHandler() { // from class: com.google.firebase.messaging.g
                        @Override // com.google.firebase.events.EventHandler
                        public final void a(Event event) {
                            FirebaseMessaging.AutoInit.a(FirebaseMessaging.AutoInit.this, event);
                        }
                    };
                    this.c = eventHandler;
                    this.a.a(DataCollectionDefaultChange.class, eventHandler);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized boolean c() {
            boolean A;
            try {
                b();
                Boolean bool = this.d;
                if (bool != null) {
                    A = bool.booleanValue();
                } else {
                    A = FirebaseMessaging.this.a.A();
                }
            } catch (Throwable th) {
                throw th;
            }
            return A;
        }

        @InterfaceC11300zs1
        public final Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context n = FirebaseMessaging.this.a.n();
            SharedPreferences sharedPreferences = n.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains(h)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(h, false));
            }
            try {
                PackageManager packageManager = n.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(n.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(f)) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean(f));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public synchronized void e(boolean z) {
            try {
                b();
                EventHandler<DataCollectionDefaultChange> eventHandler = this.c;
                if (eventHandler != null) {
                    this.a.d(DataCollectionDefaultChange.class, eventHandler);
                    this.c = null;
                }
                SharedPreferences.Editor edit = FirebaseMessaging.this.a.n().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean(h, z);
                edit.apply();
                if (z) {
                    FirebaseMessaging.this.L();
                }
                this.d = Boolean.valueOf(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, @InterfaceC11300zs1 FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, @InterfaceC11300zs1 Ot2 ot2, Subscriber subscriber) {
        this(firebaseApp, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, ot2, subscriber, new Metadata(firebaseApp.n()));
    }

    @InterfaceC11300zs1
    public static Ot2 A() {
        return x;
    }

    public static /* synthetic */ void a(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.getClass();
        try {
            taskCompletionSource.c(firebaseMessaging.n());
        } catch (Exception e) {
            taskCompletionSource.b(e);
        }
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.getClass();
        try {
            firebaseMessaging.b.b(Metadata.c(firebaseMessaging.a), s);
            taskCompletionSource.c(null);
        } catch (Exception e) {
            taskCompletionSource.b(e);
        }
    }

    public static /* synthetic */ void d(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.getClass();
        try {
            Tasks.a(firebaseMessaging.e.c());
            v(firebaseMessaging.d).d(firebaseMessaging.w(), Metadata.c(firebaseMessaging.a));
            taskCompletionSource.c(null);
        } catch (Exception e) {
            taskCompletionSource.b(e);
        }
    }

    public static /* synthetic */ void e(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.C()) {
            firebaseMessaging.L();
        }
    }

    public static /* synthetic */ Task f(FirebaseMessaging firebaseMessaging, String str, Store.Token token, String str2) {
        v(firebaseMessaging.d).g(firebaseMessaging.w(), str, str2, firebaseMessaging.l.a());
        if (token == null || !str2.equals(token.a)) {
            firebaseMessaging.B(str2);
        }
        return Tasks.g(str2);
    }

    @InterfaceC5670cr1
    @Keep
    public static synchronized FirebaseMessaging getInstance(@InterfaceC5670cr1 FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) firebaseApp.l(FirebaseMessaging.class);
            Preconditions.s(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static /* synthetic */ void k(FirebaseMessaging firebaseMessaging, TopicsSubscriber topicsSubscriber) {
        if (firebaseMessaging.C()) {
            topicsSubscriber.q();
        }
    }

    @InterfaceC5056aJ2
    public static synchronized void o() {
        synchronized (FirebaseMessaging.class) {
            w = null;
        }
    }

    public static void p() {
        x = null;
    }

    @InterfaceC5670cr1
    public static synchronized FirebaseMessaging u() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(FirebaseApp.p());
        }
        return firebaseMessaging;
    }

    @InterfaceC5670cr1
    public static synchronized Store v(Context context) {
        Store store;
        synchronized (FirebaseMessaging.class) {
            try {
                if (w == null) {
                    w = new Store(context);
                }
                store = w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return store;
    }

    public final void B(String str) {
        if (FirebaseApp.l.equals(this.a.r())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.a.r());
            }
            Intent intent = new Intent(FirebaseMessagingService.f1);
            intent.putExtra("token", str);
            new FcmBroadcastProcessor(this.d).g(intent);
        }
    }

    public boolean C() {
        return this.g.c();
    }

    @InterfaceC5056aJ2
    public boolean D() {
        return this.l.g();
    }

    public boolean E() {
        return ProxyNotificationInitializer.d(this.d);
    }

    @Deprecated
    public void F(@InterfaceC5670cr1 RemoteMessage remoteMessage) {
        if (!TextUtils.isEmpty(remoteMessage.x1())) {
            Intent intent = new Intent(q);
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra(r, PendingIntent.getBroadcast(this.d, 0, intent2, 67108864));
            intent.setPackage("com.google.android.gms");
            remoteMessage.M1(intent);
            this.d.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void G(boolean z) {
        this.g.e(z);
    }

    public void H(boolean z) {
        MessagingAnalytics.B(z);
    }

    @InterfaceC5670cr1
    public Task<Void> I(boolean z) {
        return ProxyNotificationInitializer.e(this.h, this.d, z);
    }

    public synchronized void J(boolean z) {
        this.m = z;
    }

    public final synchronized void K() {
        if (!this.m) {
            N(0L);
        }
    }

    public final void L() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.b;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.a();
        } else if (O(y())) {
            K();
        }
    }

    @InterfaceC5670cr1
    @SuppressLint({"TaskMainThread"})
    public Task<Void> M(@InterfaceC5670cr1 final String str) {
        return this.k.w(new SuccessContinuation() { // from class: com.google.firebase.messaging.b
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task a(Object obj) {
                Task r2;
                r2 = ((TopicsSubscriber) obj).r(str);
                return r2;
            }
        });
    }

    public synchronized void N(long j) {
        s(new SyncTask(this, Math.min(Math.max(30L, 2 * j), u)), j);
        this.m = true;
    }

    @InterfaceC5056aJ2
    public boolean O(@InterfaceC11300zs1 Store.Token token) {
        if (token != null && !token.b(this.l.a())) {
            return false;
        }
        return true;
    }

    @InterfaceC5670cr1
    @SuppressLint({"TaskMainThread"})
    public Task<Void> P(@InterfaceC5670cr1 final String str) {
        return this.k.w(new SuccessContinuation() { // from class: com.google.firebase.messaging.e
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task a(Object obj) {
                Task u2;
                u2 = ((TopicsSubscriber) obj).u(str);
                return u2;
            }
        });
    }

    public String n() throws IOException {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.b;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) Tasks.a(firebaseInstanceIdInternal.c());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final Store.Token y2 = y();
        if (!O(y2)) {
            return y2.a;
        }
        final String c = Metadata.c(this.a);
        try {
            return (String) Tasks.a(this.f.b(c, new RequestDeduplicator.GetTokenRequest() { // from class: com.google.firebase.messaging.f
                @Override // com.google.firebase.messaging.RequestDeduplicator.GetTokenRequest
                public final Task start() {
                    Task x2;
                    x2 = r0.e.f().x(r0.j, new SuccessContinuation() { // from class: com.google.firebase.messaging.c
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        public final Task a(Object obj) {
                            return FirebaseMessaging.f(FirebaseMessaging.this, r2, r3, (String) obj);
                        }
                    });
                    return x2;
                }
            }));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    @InterfaceC5670cr1
    public Task<Void> q() {
        if (this.b != null) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.h.execute(new Runnable() { // from class: o.Qt0
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.c(FirebaseMessaging.this, taskCompletionSource);
                }
            });
            return taskCompletionSource.a();
        } else if (y() == null) {
            return Tasks.g(null);
        } else {
            final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            FcmExecutors.f().execute(new Runnable() { // from class: o.Rt0
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.d(FirebaseMessaging.this, taskCompletionSource2);
                }
            });
            return taskCompletionSource2.a();
        }
    }

    @InterfaceC5670cr1
    public boolean r() {
        return MessagingAnalytics.a();
    }

    @SuppressLint({"ThreadPoolCreation"})
    public void s(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (y == null) {
                    y = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                y.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context t() {
        return this.d;
    }

    public final String w() {
        if (FirebaseApp.l.equals(this.a.r())) {
            return "";
        }
        return this.a.t();
    }

    @InterfaceC5670cr1
    public Task<String> x() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.b;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.c();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.h.execute(new Runnable() { // from class: o.Pt0
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.a(FirebaseMessaging.this, taskCompletionSource);
            }
        });
        return taskCompletionSource.a();
    }

    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public Store.Token y() {
        return v(this.d).e(w(), Metadata.c(this.a));
    }

    public Task<TopicsSubscriber> z() {
        return this.k;
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, @InterfaceC11300zs1 FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, @InterfaceC11300zs1 Ot2 ot2, Subscriber subscriber, Metadata metadata) {
        this(firebaseApp, firebaseInstanceIdInternal, firebaseInstallationsApi, ot2, subscriber, metadata, new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi), FcmExecutors.h(), FcmExecutors.d(), FcmExecutors.c());
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, @InterfaceC11300zs1 FirebaseInstanceIdInternal firebaseInstanceIdInternal, FirebaseInstallationsApi firebaseInstallationsApi, @InterfaceC11300zs1 Ot2 ot2, Subscriber subscriber, Metadata metadata, GmsRpc gmsRpc, Executor executor, Executor executor2, Executor executor3) {
        this.m = false;
        x = ot2;
        this.a = firebaseApp;
        this.b = firebaseInstanceIdInternal;
        this.c = firebaseInstallationsApi;
        this.g = new AutoInit(subscriber);
        Context n = firebaseApp.n();
        this.d = n;
        FcmLifecycleCallbacks fcmLifecycleCallbacks = new FcmLifecycleCallbacks();
        this.n = fcmLifecycleCallbacks;
        this.l = metadata;
        this.i = executor;
        this.e = gmsRpc;
        this.f = new RequestDeduplicator(executor);
        this.h = executor2;
        this.j = executor3;
        Context n2 = firebaseApp.n();
        if (n2 instanceof Application) {
            ((Application) n2).registerActivityLifecycleCallbacks(fcmLifecycleCallbacks);
        } else {
            Log.w("FirebaseMessaging", "Context " + n2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.d(new FirebaseInstanceIdInternal.NewTokenListener() { // from class: o.Mt0
                @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
                public final void a(String str) {
                    FirebaseMessaging.this.B(str);
                }
            });
        }
        executor2.execute(new Runnable() { // from class: o.Nt0
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.e(FirebaseMessaging.this);
            }
        });
        Task<TopicsSubscriber> f = TopicsSubscriber.f(this, metadata, gmsRpc, n, FcmExecutors.i());
        this.k = f;
        f.l(executor2, new OnSuccessListener() { // from class: com.google.firebase.messaging.d
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void a(Object obj) {
                FirebaseMessaging.k(FirebaseMessaging.this, (TopicsSubscriber) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: o.Ot0
            @Override // java.lang.Runnable
            public final void run() {
                ProxyNotificationInitializer.c(FirebaseMessaging.this.d);
            }
        });
    }
}
