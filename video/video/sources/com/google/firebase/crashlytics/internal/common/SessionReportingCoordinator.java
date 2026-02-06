package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import o.C5473c22;
import o.C5716d22;
import o.C5958e22;
import o.C6201f22;
import o.C6456g22;
import o.C6699h22;
import o.C6942i22;
import o.C7183j22;
import o.C8150mx0;
import o.C8393nx0;
import o.ES1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class SessionReportingCoordinator implements CrashlyticsLifecycleEvents {
    public static final String g = "crash";
    public static final String h = "error";
    public static final int i = 4;
    public static final int j = 8;
    public static final int k = 8192;
    public final CrashlyticsReportDataCapture a;
    public final CrashlyticsReportPersistence b;
    public final DataTransportCrashlyticsReportSender c;
    public final LogFileManager d;
    public final UserMetadata e;
    public final IdManager f;

    public SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, LogFileManager logFileManager, UserMetadata userMetadata, IdManager idManager) {
        this.a = crashlyticsReportDataCapture;
        this.b = crashlyticsReportPersistence;
        this.c = dataTransportCrashlyticsReportSender;
        this.d = logFileManager;
        this.e = userMetadata;
        this.f = idManager;
    }

    @ES1(api = 30)
    public static CrashlyticsReport.ApplicationExitInfo k(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream a = C5716d22.a(applicationExitInfo);
            if (a != null) {
                str = l(a);
            }
        } catch (IOException e) {
            Logger f = Logger.f();
            f.m("Could not get input trace in application exit info: " + C5958e22.a(applicationExitInfo) + " Error: " + e);
        }
        return CrashlyticsReport.ApplicationExitInfo.a().c(C6201f22.a(applicationExitInfo)).e(C6456g22.a(applicationExitInfo)).g(C8393nx0.a(applicationExitInfo)).i(C5473c22.a(applicationExitInfo)).d(C6699h22.a(applicationExitInfo)).f(C6942i22.a(applicationExitInfo)).h(C7183j22.a(applicationExitInfo)).j(str).a();
    }

    @InterfaceC5056aJ2
    @ES1(api = 19)
    public static String l(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
        }
    }

    public static SessionReportingCoordinator m(Context context, IdManager idManager, FileStore fileStore, AppData appData, LogFileManager logFileManager, UserMetadata userMetadata, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        return new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context, idManager, appData, stackTraceTrimmingStrategy, settingsProvider), new CrashlyticsReportPersistence(fileStore, settingsProvider, crashlyticsAppQualitySessionsSubscriber), DataTransportCrashlyticsReportSender.b(context, settingsProvider, onDemandCounter), logFileManager, userMetadata, idManager);
    }

    @InterfaceC5670cr1
    public static List<CrashlyticsReport.CustomAttribute> r(@InterfaceC5670cr1 Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(CrashlyticsReport.CustomAttribute.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: o.k22
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compareTo;
                compareTo = ((CrashlyticsReport.CustomAttribute) obj).b().compareTo(((CrashlyticsReport.CustomAttribute) obj2).b());
                return compareTo;
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    public Task<Void> A(@InterfaceC5670cr1 Executor executor) {
        return B(executor, null);
    }

    public Task<Void> B(@InterfaceC5670cr1 Executor executor, @InterfaceC11300zs1 String str) {
        boolean z;
        List<CrashlyticsReportWithSessionId> u = this.b.u();
        ArrayList arrayList = new ArrayList();
        for (CrashlyticsReportWithSessionId crashlyticsReportWithSessionId : u) {
            if (str == null || str.equals(crashlyticsReportWithSessionId.d())) {
                DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender = this.c;
                CrashlyticsReportWithSessionId n = n(crashlyticsReportWithSessionId);
                if (str != null) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(dataTransportCrashlyticsReportSender.c(n, z).n(executor, new Continuation() { // from class: o.l22
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object a(Task task) {
                        boolean u2;
                        u2 = SessionReportingCoordinator.this.u(task);
                        return Boolean.valueOf(u2);
                    }
                }));
            }
        }
        return Tasks.h(arrayList);
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsLifecycleEvents
    public void a(@InterfaceC5670cr1 String str, long j2) {
        this.b.y(this.a.e(str, j2));
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsLifecycleEvents
    public void b(String str) {
        this.e.q(str);
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsLifecycleEvents
    public void c(String str, String str2) {
        this.e.m(str, str2);
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsLifecycleEvents
    public void d(long j2, String str) {
        this.d.g(j2, str);
    }

    public final CrashlyticsReport.Session.Event g(CrashlyticsReport.Session.Event event) {
        return h(event, this.d, this.e);
    }

    public final CrashlyticsReport.Session.Event h(CrashlyticsReport.Session.Event event, LogFileManager logFileManager, UserMetadata userMetadata) {
        CrashlyticsReport.Session.Event.Builder h2 = event.h();
        String c = logFileManager.c();
        if (c != null) {
            h2.d(CrashlyticsReport.Session.Event.Log.a().b(c).a());
        } else {
            Logger.f().k("No log data to include with this event.");
        }
        List<CrashlyticsReport.CustomAttribute> r = r(userMetadata.f());
        List<CrashlyticsReport.CustomAttribute> r2 = r(userMetadata.g());
        if (!r.isEmpty() || !r2.isEmpty()) {
            h2.b(event.b().i().e(r).g(r2).a());
        }
        return h2.a();
    }

    public final CrashlyticsReport.Session.Event i(CrashlyticsReport.Session.Event event) {
        return j(h(event, this.d, this.e), this.e);
    }

    public final CrashlyticsReport.Session.Event j(CrashlyticsReport.Session.Event event, UserMetadata userMetadata) {
        List<CrashlyticsReport.Session.Event.RolloutAssignment> h2 = userMetadata.h();
        if (h2.isEmpty()) {
            return event;
        }
        CrashlyticsReport.Session.Event.Builder h3 = event.h();
        h3.e(CrashlyticsReport.Session.Event.RolloutsState.a().b(h2).a());
        return h3.a();
    }

    public final CrashlyticsReportWithSessionId n(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        if (crashlyticsReportWithSessionId.b().g() == null) {
            return CrashlyticsReportWithSessionId.a(crashlyticsReportWithSessionId.b().s(this.f.d()), crashlyticsReportWithSessionId.d(), crashlyticsReportWithSessionId.c());
        }
        return crashlyticsReportWithSessionId;
    }

    public void o(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 List<NativeSessionFile> list, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        Logger.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (NativeSessionFile nativeSessionFile : list) {
            CrashlyticsReport.FilesPayload.File f = nativeSessionFile.f();
            if (f != null) {
                arrayList.add(f);
            }
        }
        this.b.l(str, CrashlyticsReport.FilesPayload.a().b(Collections.unmodifiableList(arrayList)).a(), applicationExitInfo);
    }

    public void p(long j2, @InterfaceC11300zs1 String str) {
        this.b.k(str, j2);
    }

    @InterfaceC11300zs1
    @ES1(api = 30)
    public final ApplicationExitInfo q(String str, List<ApplicationExitInfo> list) {
        long q = this.b.q(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            ApplicationExitInfo a = C8150mx0.a(applicationExitInfo);
            if (C5473c22.a(a) < q) {
                return null;
            }
            if (C8393nx0.a(a) == 6) {
                return a;
            }
        }
        return null;
    }

    public boolean s() {
        return this.b.r();
    }

    public SortedSet<String> t() {
        return this.b.p();
    }

    public final boolean u(@InterfaceC5670cr1 Task<CrashlyticsReportWithSessionId> task) {
        if (task.v()) {
            CrashlyticsReportWithSessionId r = task.r();
            Logger f = Logger.f();
            f.b("Crashlytics report successfully enqueued to DataTransport: " + r.d());
            File c = r.c();
            if (c.delete()) {
                Logger f2 = Logger.f();
                f2.b("Deleted report file: " + c.getPath());
                return true;
            }
            Logger f3 = Logger.f();
            f3.m("Crashlytics could not delete report file: " + c.getPath());
            return true;
        }
        Logger.f().n("Crashlytics report could not be enqueued to DataTransport", task.q());
        return false;
    }

    public final void v(@InterfaceC5670cr1 Throwable th, @InterfaceC5670cr1 Thread thread, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, long j2, boolean z) {
        this.b.x(i(this.a.d(th, thread, str2, j2, 4, 8, z)), str, str2.equals("crash"));
    }

    public void w(@InterfaceC5670cr1 Throwable th, @InterfaceC5670cr1 Thread thread, @InterfaceC5670cr1 String str, long j2) {
        Logger f = Logger.f();
        f.k("Persisting fatal event for session " + str);
        v(th, thread, str, "crash", j2, true);
    }

    public void x(@InterfaceC5670cr1 Throwable th, @InterfaceC5670cr1 Thread thread, @InterfaceC5670cr1 String str, long j2) {
        Logger f = Logger.f();
        f.k("Persisting non-fatal event for session " + str);
        v(th, thread, str, "error", j2, false);
    }

    @ES1(api = 30)
    public void y(String str, List<ApplicationExitInfo> list, LogFileManager logFileManager, UserMetadata userMetadata) {
        ApplicationExitInfo q = q(str, list);
        if (q == null) {
            Logger f = Logger.f();
            f.k("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        CrashlyticsReport.Session.Event c = this.a.c(k(q));
        Logger f2 = Logger.f();
        f2.b("Persisting anr for session " + str);
        this.b.x(j(h(c, logFileManager, userMetadata), userMetadata), str, true);
    }

    public void z() {
        this.b.i();
    }
}
