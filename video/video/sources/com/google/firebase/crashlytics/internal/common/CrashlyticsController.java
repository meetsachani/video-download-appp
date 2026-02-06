package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonConstants;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import o.BU0;
import o.C7889lx0;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class CrashlyticsController {
    public static final String A = "Crashlytics Android SDK/%s";
    public static final String B = "com.crashlytics.version-control-info";
    public static final String C = "version-control-info.textproto";
    public static final String D = "META-INF/";
    public static final String t = "fatal";
    public static final String u = "timestamp";
    public static final String v = "_ae";
    public static final String w = ".ae";
    public static final FilenameFilter x = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.c
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean startsWith;
            startsWith = str.startsWith(CrashlyticsController.w);
            return startsWith;
        }
    };
    public static final String y = "native-sessions";
    public static final int z = 1;
    public final Context a;
    public final DataCollectionArbiter b;
    public final CrashlyticsFileMarker c;
    public final UserMetadata d;
    public final CrashlyticsBackgroundWorker e;
    public final IdManager f;
    public final FileStore g;
    public final AppData h;
    public final LogFileManager i;
    public final CrashlyticsNativeComponent j;
    public final AnalyticsEventLogger k;
    public final CrashlyticsAppQualitySessionsSubscriber l;
    public final SessionReportingCoordinator m;
    public CrashlyticsUncaughtExceptionHandler n;

    /* renamed from: o  reason: collision with root package name */
    public SettingsProvider f342o = null;
    public final TaskCompletionSource<Boolean> p = new TaskCompletionSource<>();
    public final TaskCompletionSource<Boolean> q = new TaskCompletionSource<>();
    public final TaskCompletionSource<Void> r = new TaskCompletionSource<>();
    public final AtomicBoolean s = new AtomicBoolean(false);

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass4 implements SuccessContinuation<Boolean, Void> {
        public final /* synthetic */ Task a;

        public AnonymousClass4(Task task) {
            this.a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @InterfaceC5670cr1
        /* renamed from: b */
        public Task<Void> a(@InterfaceC11300zs1 final Boolean bool) throws Exception {
            return CrashlyticsController.this.e.i(new Callable<Task<Void>>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4.1
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public Task<Void> call() throws Exception {
                    if (!bool.booleanValue()) {
                        Logger.f().k("Deleting cached crash reports...");
                        CrashlyticsController.s(CrashlyticsController.this.O());
                        CrashlyticsController.this.m.z();
                        CrashlyticsController.this.r.e(null);
                        return Tasks.g(null);
                    }
                    Logger.f().b("Sending cached crash reports...");
                    CrashlyticsController.this.b.c(bool.booleanValue());
                    final Executor c = CrashlyticsController.this.e.c();
                    return AnonymousClass4.this.a.x(c, new SuccessContinuation<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4.1.1
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        @InterfaceC5670cr1
                        /* renamed from: b */
                        public Task<Void> a(@InterfaceC11300zs1 Settings settings) throws Exception {
                            if (settings != null) {
                                CrashlyticsController.this.Q();
                                CrashlyticsController.this.m.A(c);
                                CrashlyticsController.this.r.e(null);
                                return Tasks.g(null);
                            }
                            Logger.f().m("Received null app settings at app startup. Cannot send cached reports");
                            return Tasks.g(null);
                        }
                    });
                }
            });
        }
    }

    public CrashlyticsController(Context context, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        this.a = context;
        this.e = crashlyticsBackgroundWorker;
        this.f = idManager;
        this.b = dataCollectionArbiter;
        this.g = fileStore;
        this.c = crashlyticsFileMarker;
        this.h = appData;
        this.d = userMetadata;
        this.i = logFileManager;
        this.j = crashlyticsNativeComponent;
        this.k = analyticsEventLogger;
        this.l = crashlyticsAppQualitySessionsSubscriber;
        this.m = sessionReportingCoordinator;
    }

    public static boolean C() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static long F() {
        return I(System.currentTimeMillis());
    }

    @InterfaceC5670cr1
    public static List<NativeSessionFile> G(NativeSessionFileProvider nativeSessionFileProvider, String str, FileStore fileStore, byte[] bArr) {
        File p = fileStore.p(str, UserMetadata.h);
        File p2 = fileStore.p(str, "keys");
        File p3 = fileStore.p(str, UserMetadata.k);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BytesBackedNativeSessionFile("logs_file", "logs", bArr));
        arrayList.add(new FileBackedNativeSessionFile("crash_meta_file", "metadata", nativeSessionFileProvider.e()));
        arrayList.add(new FileBackedNativeSessionFile("session_meta_file", SettingsJsonConstants.b, nativeSessionFileProvider.h()));
        arrayList.add(new FileBackedNativeSessionFile("app_meta_file", FirebaseMessaging.r, nativeSessionFileProvider.f()));
        arrayList.add(new FileBackedNativeSessionFile("device_meta_file", "device", nativeSessionFileProvider.a()));
        arrayList.add(new FileBackedNativeSessionFile("os_meta_file", BU0.f, nativeSessionFileProvider.g()));
        arrayList.add(T(nativeSessionFileProvider));
        arrayList.add(new FileBackedNativeSessionFile("user_meta_file", "user", p));
        arrayList.add(new FileBackedNativeSessionFile("keys_file", "keys", p2));
        arrayList.add(new FileBackedNativeSessionFile("rollouts_file", "rollouts", p3));
        return arrayList;
    }

    public static long I(long j) {
        return j / 1000;
    }

    public static boolean S(String str, File file, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        if (file == null || !file.exists()) {
            Logger f = Logger.f();
            f.m("No minidump data found for session " + str);
        }
        if (applicationExitInfo == null) {
            Logger f2 = Logger.f();
            f2.g("No Tombstones data found for session " + str);
        }
        if ((file == null || !file.exists()) && applicationExitInfo == null) {
            return true;
        }
        return false;
    }

    public static NativeSessionFile T(NativeSessionFileProvider nativeSessionFileProvider) {
        File d = nativeSessionFileProvider.d();
        if (d != null && d.exists()) {
            return new FileBackedNativeSessionFile("minidump_file", "minidump", d);
        }
        return new BytesBackedNativeSessionFile("minidump_file", "minidump", new byte[]{0});
    }

    public static byte[] V(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static StaticSessionData.AppData p(IdManager idManager, AppData appData) {
        return StaticSessionData.AppData.b(idManager.f(), appData.f, appData.g, idManager.a().c(), DeliveryMechanism.e(appData.d).g(), appData.h);
    }

    public static StaticSessionData.DeviceData q(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return StaticSessionData.DeviceData.c(CommonUtils.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.b(context), statFs.getBlockCount() * statFs.getBlockSize(), CommonUtils.x(), CommonUtils.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    public static StaticSessionData.OsData r() {
        return StaticSessionData.OsData.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.z());
    }

    public static void s(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    public final void A(String str) {
        Logger f = Logger.f();
        f.k("Finalizing native report for session " + str);
        NativeSessionFileProvider a = this.j.a(str);
        File d = a.d();
        CrashlyticsReport.ApplicationExitInfo b = a.b();
        if (S(str, d, b)) {
            Logger.f().m("No native core present");
            return;
        }
        long lastModified = d.lastModified();
        LogFileManager logFileManager = new LogFileManager(this.g, str);
        File j = this.g.j(str);
        if (!j.isDirectory()) {
            Logger.f().m("Couldn't create directory to store native session files, aborting.");
            return;
        }
        y(lastModified);
        List<NativeSessionFile> G = G(a, str, this.g, logFileManager.b());
        NativeSessionFileGzipper.b(j, G);
        Logger.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.m.o(str, G, b);
        logFileManager.a();
    }

    public boolean B(SettingsProvider settingsProvider) {
        this.e.b();
        if (N()) {
            Logger.f().m("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Logger.f().k("Finalizing previously open sessions.");
        try {
            w(true, settingsProvider);
            Logger.f().k("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            Logger.f().e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final Context D() {
        return this.a;
    }

    @InterfaceC11300zs1
    public final String E() {
        SortedSet<String> t2 = this.m.t();
        if (!t2.isEmpty()) {
            return t2.first();
        }
        return null;
    }

    public final InputStream H(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            Logger.f().m("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream == null) {
            Logger.f().g("No version control information found");
            return null;
        }
        return resourceAsStream;
    }

    public UserMetadata J() {
        return this.d;
    }

    public String K() throws IOException {
        InputStream H = H("META-INF/version-control-info.textproto");
        if (H == null) {
            return null;
        }
        Logger.f().b("Read version control info");
        return Base64.encodeToString(V(H), 0);
    }

    public void L(@InterfaceC5670cr1 SettingsProvider settingsProvider, @InterfaceC5670cr1 Thread thread, @InterfaceC5670cr1 Throwable th) {
        M(settingsProvider, thread, th, false);
    }

    public synchronized void M(@InterfaceC5670cr1 final SettingsProvider settingsProvider, @InterfaceC5670cr1 final Thread thread, @InterfaceC5670cr1 final Throwable th, final boolean z2) {
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Logger f = Logger.f();
            f.b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
            final long currentTimeMillis = System.currentTimeMillis();
            try {
                Utils.f(this.e.i(new Callable<Task<Void>>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2
                    @Override // java.util.concurrent.Callable
                    /* renamed from: a */
                    public Task<Void> call() throws Exception {
                        long I = CrashlyticsController.I(currentTimeMillis);
                        final String E = CrashlyticsController.this.E();
                        if (E == null) {
                            Logger.f().d("Tried to write a fatal exception while no session was open.");
                            return Tasks.g(null);
                        }
                        CrashlyticsController.this.c.a();
                        CrashlyticsController.this.m.w(th, thread, E, I);
                        CrashlyticsController.this.y(currentTimeMillis);
                        CrashlyticsController.this.v(settingsProvider);
                        CrashlyticsController.this.x(new CLSUUID(CrashlyticsController.this.f).toString(), Boolean.valueOf(z2));
                        if (!CrashlyticsController.this.b.d()) {
                            return Tasks.g(null);
                        }
                        final Executor c = CrashlyticsController.this.e.c();
                        return settingsProvider.a().x(c, new SuccessContinuation<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2.1
                            @Override // com.google.android.gms.tasks.SuccessContinuation
                            @InterfaceC5670cr1
                            /* renamed from: b */
                            public Task<Void> a(@InterfaceC11300zs1 Settings settings) throws Exception {
                                String str = null;
                                if (settings != null) {
                                    Task Q = CrashlyticsController.this.Q();
                                    SessionReportingCoordinator sessionReportingCoordinator = CrashlyticsController.this.m;
                                    Executor executor = c;
                                    if (z2) {
                                        str = E;
                                    }
                                    return Tasks.i(Q, sessionReportingCoordinator.B(executor, str));
                                }
                                Logger.f().m("Received null app settings, cannot send reports at crash time.");
                                return Tasks.g(null);
                            }
                        });
                    }
                }));
            } catch (TimeoutException unused) {
                Logger.f().d("Cannot send reports. Timed out while fetching settings.");
            } catch (Exception e) {
                Logger.f().e("Error handling uncaught exception", e);
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public boolean N() {
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.n;
        if (crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.a()) {
            return true;
        }
        return false;
    }

    public List<File> O() {
        return this.g.g(x);
    }

    public final Task<Void> P(final long j) {
        if (C()) {
            Logger.f().m("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.g(null);
        }
        Logger.f().b("Logging app exception event to Firebase Analytics");
        return Tasks.d(new ScheduledThreadPoolExecutor(1), new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.8
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Void call() throws Exception {
                Bundle bundle = new Bundle();
                bundle.putInt(CrashlyticsController.t, 1);
                bundle.putLong("timestamp", j);
                CrashlyticsController.this.k.a("_ae", bundle);
                return null;
            }
        });
    }

    public final Task<Void> Q() {
        ArrayList arrayList = new ArrayList();
        for (File file : O()) {
            try {
                arrayList.add(P(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                Logger f = Logger.f();
                f.m("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.h(arrayList);
    }

    public void R(Thread thread, Throwable th) {
        SettingsProvider settingsProvider = this.f342o;
        if (settingsProvider == null) {
            Logger.f().m("settingsProvider not set");
        } else {
            M(settingsProvider, thread, th, true);
        }
    }

    public void U(final String str) {
        this.e.h(new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.7
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Void call() throws Exception {
                CrashlyticsController.this.x(str, Boolean.FALSE);
                return null;
            }
        });
    }

    public void W() {
        try {
            String K = K();
            if (K != null) {
                a0(B, K);
                Logger.f().g("Saved version control info");
            }
        } catch (IOException e) {
            Logger.f().n("Unable to save version control info", e);
        }
    }

    public Task<Void> X() {
        this.q.e(Boolean.TRUE);
        return this.r.a();
    }

    public void Y(String str, String str2) {
        try {
            this.d.m(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.a;
            if (context != null && CommonUtils.v(context)) {
                throw e;
            }
            Logger.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void Z(Map<String, String> map) {
        this.d.n(map);
    }

    public void a0(String str, String str2) {
        try {
            this.d.o(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.a;
            if (context != null && CommonUtils.v(context)) {
                throw e;
            }
            Logger.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void b0(String str) {
        this.d.q(str);
    }

    @SuppressLint({"TaskMainThread"})
    public Task<Void> c0(Task<Settings> task) {
        if (!this.m.s()) {
            Logger.f().k("No crash reports are available to be sent.");
            this.p.e(Boolean.FALSE);
            return Tasks.g(null);
        }
        Logger.f().k("Crash reports are available to be sent.");
        return d0().w(new AnonymousClass4(task));
    }

    public final Task<Boolean> d0() {
        if (this.b.d()) {
            Logger.f().b("Automatic data collection is enabled. Allowing upload.");
            this.p.e(Boolean.FALSE);
            return Tasks.g(Boolean.TRUE);
        }
        Logger.f().b("Automatic data collection is disabled.");
        Logger.f().k("Notifying that unsent reports are available.");
        this.p.e(Boolean.TRUE);
        Task<TContinuationResult> w2 = this.b.j().w(new SuccessContinuation<Void, Boolean>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.3
            @Override // com.google.android.gms.tasks.SuccessContinuation
            @InterfaceC5670cr1
            /* renamed from: b */
            public Task<Boolean> a(@InterfaceC11300zs1 Void r1) throws Exception {
                return Tasks.g(Boolean.TRUE);
            }
        });
        Logger.f().b("Waiting for send/deleteUnsentReports to be called.");
        return Utils.i(w2, this.q.a());
    }

    public final void e0(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            List<ApplicationExitInfo> a = C7889lx0.a((ActivityManager) this.a.getSystemService(androidx.appcompat.widget.b.r), null, 0, 0);
            if (a.size() != 0) {
                this.m.y(str, a, new LogFileManager(this.g, str), UserMetadata.j(str, this.g, this.e));
                return;
            }
            Logger f = Logger.f();
            f.k("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        Logger f2 = Logger.f();
        f2.k("ANR feature enabled, but device is API " + i);
    }

    public void f0(@InterfaceC5670cr1 final Thread thread, @InterfaceC5670cr1 final Throwable th) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.e.g(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.6
            @Override // java.lang.Runnable
            public void run() {
                if (!CrashlyticsController.this.N()) {
                    long I = CrashlyticsController.I(currentTimeMillis);
                    String E = CrashlyticsController.this.E();
                    if (E == null) {
                        Logger.f().m("Tried to write a non-fatal exception while no session was open.");
                    } else {
                        CrashlyticsController.this.m.x(th, thread, E, I);
                    }
                }
            }
        });
    }

    public void g0(final long j, final String str) {
        this.e.h(new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.5
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Void call() throws Exception {
                if (!CrashlyticsController.this.N()) {
                    CrashlyticsController.this.i.g(j, str);
                    return null;
                }
                return null;
            }
        });
    }

    @InterfaceC5670cr1
    public Task<Boolean> o() {
        if (!this.s.compareAndSet(false, true)) {
            Logger.f().m("checkForUnsentReports should only be called once per execution.");
            return Tasks.g(Boolean.FALSE);
        }
        return this.p.a();
    }

    public Task<Void> t() {
        this.q.e(Boolean.FALSE);
        return this.r.a();
    }

    public boolean u() {
        if (!this.c.c()) {
            String E = E();
            if (E != null && this.j.d(E)) {
                return true;
            }
            return false;
        }
        Logger.f().k("Found previous crash marker.");
        this.c.d();
        return true;
    }

    public void v(SettingsProvider settingsProvider) {
        w(false, settingsProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(boolean z2, SettingsProvider settingsProvider) {
        String str;
        ArrayList arrayList = new ArrayList(this.m.t());
        if (arrayList.size() <= z2) {
            Logger.f().k("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z2 ? 1 : 0);
        if (settingsProvider.b().b.b) {
            e0(str2);
        } else {
            Logger.f().k("ANR feature disabled.");
        }
        if (this.j.d(str2)) {
            A(str2);
        }
        if (z2 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.l.e(null);
            str = null;
        }
        this.m.p(F(), str);
    }

    public final void x(String str, Boolean bool) {
        long F = F();
        Logger f = Logger.f();
        f.b("Opening a new session with ID " + str);
        this.j.c(str, String.format(Locale.US, A, CrashlyticsCore.m()), F, StaticSessionData.b(p(this.f, this.h), r(), q(this.a)));
        if (bool.booleanValue() && str != null) {
            this.d.p(str);
        }
        this.i.e(str);
        this.l.e(str);
        this.m.a(str, F);
    }

    public final void y(long j) {
        try {
            FileStore fileStore = this.g;
            if (fileStore.f(w + j).createNewFile()) {
                return;
            }
            throw new IOException("Create new file failed.");
        } catch (IOException e) {
            Logger.f().n("Could not create app exception marker file.", e);
        }
    }

    public void z(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsProvider settingsProvider) {
        this.f342o = settingsProvider;
        U(str);
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.1
            @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener
            public void a(@InterfaceC5670cr1 SettingsProvider settingsProvider2, @InterfaceC5670cr1 Thread thread, @InterfaceC5670cr1 Throwable th) {
                CrashlyticsController.this.L(settingsProvider2, thread, th);
            }
        }, settingsProvider, uncaughtExceptionHandler, this.j);
        this.n = crashlyticsUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
    }
}
