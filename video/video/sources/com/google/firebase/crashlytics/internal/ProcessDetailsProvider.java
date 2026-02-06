package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.appcompat.widget.b;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C10662xF;
import o.C6562gT0;
import o.C8222nF;
import o.C8466oF;
import o.InterfaceC8289nW0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ProcessDetailsProvider {
    @NotNull
    public static final ProcessDetailsProvider a = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    public static /* synthetic */ CrashlyticsReport.Session.Event.Application.ProcessDetails e(ProcessDetailsProvider processDetailsProvider, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return processDetailsProvider.d(str, i, i2, z);
    }

    @InterfaceC8289nW0
    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails a(@NotNull String str) {
        C6562gT0.p(str, "processName");
        return e(this, str, 0, 0, false, 14, null);
    }

    @InterfaceC8289nW0
    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails b(@NotNull String str, int i) {
        C6562gT0.p(str, "processName");
        return e(this, str, i, 0, false, 12, null);
    }

    @InterfaceC8289nW0
    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails c(@NotNull String str, int i, int i2) {
        C6562gT0.p(str, "processName");
        return e(this, str, i, i2, false, 8, null);
    }

    @InterfaceC8289nW0
    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails d(@NotNull String str, int i, int i2, boolean z) {
        C6562gT0.p(str, "processName");
        CrashlyticsReport.Session.Event.Application.ProcessDetails a2 = CrashlyticsReport.Session.Event.Application.ProcessDetails.a().e(str).d(i).c(i2).b(z).a();
        C6562gT0.o(a2, "builder()\n      .setProc…ltProcess)\n      .build()");
        return a2;
    }

    @NotNull
    public final List<CrashlyticsReport.Session.Event.Application.ProcessDetails> f(@NotNull Context context) {
        ActivityManager activityManager;
        C6562gT0.p(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService(b.r);
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = C8222nF.H();
        }
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : C10662xF.v2(list)) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C8466oF.b0(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(CrashlyticsReport.Session.Event.Application.ProcessDetails.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(C6562gT0.g(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails g(@NotNull Context context) {
        Object obj;
        C6562gT0.p(context, "context");
        int myPid = Process.myPid();
        Iterator<T> it = f(context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((CrashlyticsReport.Session.Event.Application.ProcessDetails) obj).c() == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
        if (processDetails == null) {
            return e(this, h(), myPid, 0, false, 12, null);
        }
        return processDetails;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        r0 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String h() {
        String processName;
        String myProcessName;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            myProcessName = Process.myProcessName();
            C6562gT0.o(myProcessName, "{\n      Process.myProcessName()\n    }");
            return myProcessName;
        } else if (i < 28 || processName == null) {
            return "";
        } else {
            return processName;
        }
    }
}
