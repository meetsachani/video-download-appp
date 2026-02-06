package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.appcompat.widget.b;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C10662xF;
import o.C6562gT0;
import o.C8222nF;
import o.C8466oF;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ProcessDetailsProvider {
    @NotNull
    public static final ProcessDetailsProvider a = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    public static /* synthetic */ ProcessDetails b(ProcessDetailsProvider processDetailsProvider, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return processDetailsProvider.a(str, i, i2, z);
    }

    public final ProcessDetails a(String str, int i, int i2, boolean z) {
        return new ProcessDetails(str, i, i2, z);
    }

    @NotNull
    public final List<ProcessDetails> c(@NotNull Context context) {
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
            String str2 = runningAppProcessInfo.processName;
            C6562gT0.o(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new ProcessDetails(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, C6562gT0.g(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    @NotNull
    public final ProcessDetails d(@NotNull Context context) {
        Object obj;
        C6562gT0.p(context, "context");
        int myPid = Process.myPid();
        Iterator<T> it = c(context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ProcessDetails) obj).h() == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ProcessDetails processDetails = (ProcessDetails) obj;
        if (processDetails == null) {
            return b(this, e(), myPid, 0, false, 12, null);
        }
        return processDetails;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = android.app.Application.getProcessName();
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String e() {
        String processName;
        String myProcessName;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            myProcessName = Process.myProcessName();
            C6562gT0.o(myProcessName, "myProcessName()");
            return myProcessName;
        } else if (i >= 28 && processName != null) {
            return processName;
        } else {
            String a2 = ProcessUtils.a();
            if (a2 != null) {
                return a2;
            }
            return "";
        }
    }
}
