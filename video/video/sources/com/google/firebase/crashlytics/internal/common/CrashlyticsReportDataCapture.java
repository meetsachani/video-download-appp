package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.BuildConfig;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.UE;

/* loaded from: classes3.dex */
public class CrashlyticsReportDataCapture {
    public static final Map<String, Integer> g;
    public static final String h;
    public static final int i = 3;
    public static final int j = 4;
    public static final int k = 3;
    public static final String l = "0";
    public final Context a;
    public final IdManager b;
    public final AppData c;
    public final StackTraceTrimmingStrategy d;
    public final SettingsProvider e;
    public final ProcessDetailsProvider f = ProcessDetailsProvider.a;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        h = String.format(Locale.US, CrashlyticsController.A, BuildConfig.d);
    }

    public CrashlyticsReportDataCapture(Context context, IdManager idManager, AppData appData, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider) {
        this.a = context;
        this.b = idManager;
        this.c = appData;
        this.d = stackTraceTrimmingStrategy;
        this.e = settingsProvider;
    }

    public static long f(long j2) {
        if (j2 > 0) {
            return j2;
        }
        return 0L;
    }

    public static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails A(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return this.f.c(applicationExitInfo.e(), applicationExitInfo.d(), applicationExitInfo.c());
    }

    public final CrashlyticsReport.ApplicationExitInfo a(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list;
        if (this.e.b().b.c && this.c.c.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (BuildIdInfo buildIdInfo : this.c.c) {
                arrayList.add(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.a().d(buildIdInfo.c()).b(buildIdInfo.a()).c(buildIdInfo.b()).a());
            }
            list = Collections.unmodifiableList(arrayList);
        } else {
            list = null;
        }
        return CrashlyticsReport.ApplicationExitInfo.a().c(applicationExitInfo.c()).e(applicationExitInfo.e()).g(applicationExitInfo.g()).i(applicationExitInfo.i()).d(applicationExitInfo.d()).f(applicationExitInfo.f()).h(applicationExitInfo.h()).j(applicationExitInfo.j()).b(list).a();
    }

    public final CrashlyticsReport.Builder b() {
        return CrashlyticsReport.b().k(BuildConfig.d).g(this.c.a).h(this.b.a().c()).f(this.b.a().d()).d(this.c.f).e(this.c.g).j(4);
    }

    public CrashlyticsReport.Session.Event c(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        int i2 = this.a.getResources().getConfiguration().orientation;
        return CrashlyticsReport.Session.Event.a().g("anr").f(applicationExitInfo.i()).b(j(i2, a(applicationExitInfo))).c(l(i2)).a();
    }

    public CrashlyticsReport.Session.Event d(Throwable th, Thread thread, String str, long j2, int i2, int i3, boolean z) {
        int i4 = this.a.getResources().getConfiguration().orientation;
        return CrashlyticsReport.Session.Event.a().g(str).f(j2).b(k(i4, TrimmedThrowableData.a(th, this.d), thread, i2, i3, z)).c(l(i4)).a();
    }

    public CrashlyticsReport e(String str, long j2) {
        return b().l(t(str, j2)).a();
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage h() {
        return CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.a().b(0L).d(0L).c(this.c.e).e(this.c.b).a();
    }

    public final List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> i() {
        return Collections.singletonList(h());
    }

    public final CrashlyticsReport.Session.Event.Application j(int i2, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        boolean z;
        if (applicationExitInfo.c() != 100) {
            z = true;
        } else {
            z = false;
        }
        return CrashlyticsReport.Session.Event.Application.a().c(Boolean.valueOf(z)).d(A(applicationExitInfo)).h(i2).f(o(applicationExitInfo)).a();
    }

    public final CrashlyticsReport.Session.Event.Application k(int i2, TrimmedThrowableData trimmedThrowableData, Thread thread, int i3, int i4, boolean z) {
        Boolean bool;
        boolean z2;
        CrashlyticsReport.Session.Event.Application.ProcessDetails g2 = this.f.g(this.a);
        if (g2.b() > 0) {
            if (g2.b() != 100) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        return CrashlyticsReport.Session.Event.Application.a().c(bool).d(g2).b(this.f.f(this.a)).h(i2).f(p(trimmedThrowableData, thread, i3, i4, z)).a();
    }

    public final CrashlyticsReport.Session.Event.Device l(int i2) {
        Double d;
        BatteryState a = BatteryState.a(this.a);
        Float b = a.b();
        if (b != null) {
            d = Double.valueOf(b.doubleValue());
        } else {
            d = null;
        }
        int c = a.c();
        boolean o2 = CommonUtils.o(this.a);
        long f = f(CommonUtils.b(this.a) - CommonUtils.a(this.a));
        return CrashlyticsReport.Session.Event.Device.a().b(d).c(c).f(o2).e(i2).g(f).d(CommonUtils.c(Environment.getDataDirectory().getPath())).a();
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.Exception m(TrimmedThrowableData trimmedThrowableData, int i2, int i3) {
        return n(trimmedThrowableData, i2, i3, 0);
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.Exception n(TrimmedThrowableData trimmedThrowableData, int i2, int i3, int i4) {
        String str = trimmedThrowableData.b;
        String str2 = trimmedThrowableData.a;
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.c;
        int i5 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.d;
        if (i4 >= i3) {
            TrimmedThrowableData trimmedThrowableData3 = trimmedThrowableData2;
            while (trimmedThrowableData3 != null) {
                trimmedThrowableData3 = trimmedThrowableData3.d;
                i5++;
            }
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder d = CrashlyticsReport.Session.Event.Application.Execution.Exception.a().f(str).e(str2).c(r(stackTraceElementArr, i2)).d(i5);
        if (trimmedThrowableData2 != null && i5 == 0) {
            d.b(n(trimmedThrowableData2, i2, i3, i4 + 1));
        }
        return d.a();
    }

    public final CrashlyticsReport.Session.Event.Application.Execution o(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return CrashlyticsReport.Session.Event.Application.Execution.a().b(applicationExitInfo).e(w()).c(i()).a();
    }

    public final CrashlyticsReport.Session.Event.Application.Execution p(TrimmedThrowableData trimmedThrowableData, Thread thread, int i2, int i3, boolean z) {
        return CrashlyticsReport.Session.Event.Application.Execution.a().f(z(trimmedThrowableData, thread, i2, z)).d(m(trimmedThrowableData, i2, i3)).e(w()).c(i()).a();
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame q(StackTraceElement stackTraceElement, CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        long j2;
        long j3 = 0;
        if (stackTraceElement.isNativeMethod()) {
            j2 = Math.max(stackTraceElement.getLineNumber(), 0L);
        } else {
            j2 = 0;
        }
        String str = stackTraceElement.getClassName() + UE.h + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j3 = stackTraceElement.getLineNumber();
        }
        return builder.e(j2).f(str).b(fileName).d(j3).a();
    }

    public final List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> r(StackTraceElement[] stackTraceElementArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.a().c(i2)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final CrashlyticsReport.Session.Application s() {
        return CrashlyticsReport.Session.Application.a().e(this.b.f()).h(this.c.f).d(this.c.g).f(this.b.a().c()).b(this.c.h.d()).c(this.c.h.e()).a();
    }

    public final CrashlyticsReport.Session t(String str, long j2) {
        return CrashlyticsReport.Session.a().m(j2).j(str).h(h).b(s()).l(v()).e(u()).i(3).a();
    }

    public final CrashlyticsReport.Session.Device u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int g2 = g();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b = CommonUtils.b(this.a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean x = CommonUtils.x();
        int l2 = CommonUtils.l();
        String str = Build.MANUFACTURER;
        return CrashlyticsReport.Session.Device.a().b(g2).f(Build.MODEL).c(availableProcessors).h(b).d(blockCount).i(x).j(l2).e(str).g(Build.PRODUCT).a();
    }

    public final CrashlyticsReport.Session.OperatingSystem v() {
        return CrashlyticsReport.Session.OperatingSystem.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(CommonUtils.z()).a();
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.Signal w() {
        return CrashlyticsReport.Session.Event.Application.Execution.Signal.a().d("0").c("0").b(0L).a();
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.Thread x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.Thread y(Thread thread, StackTraceElement[] stackTraceElementArr, int i2) {
        return CrashlyticsReport.Session.Event.Application.Execution.Thread.a().d(thread.getName()).c(i2).b(r(stackTraceElementArr, i2)).a();
    }

    public final List<CrashlyticsReport.Session.Event.Application.Execution.Thread> z(TrimmedThrowableData trimmedThrowableData, Thread thread, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, trimmedThrowableData.c, i2));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.d.a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
