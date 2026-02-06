package o;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: o.bI1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5294bI1 {
    public static final String a = AbstractC6949i41.f("ProcessUtils");

    public static String a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, C5294bI1.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            AbstractC6949i41.c().a(a, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(androidx.appcompat.widget.b.r);
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    public static boolean b(Context context, androidx.work.a configuration) {
        String a2 = a(context);
        if (!TextUtils.isEmpty(configuration.c())) {
            return TextUtils.equals(a2, configuration.c());
        }
        return TextUtils.equals(a2, context.getApplicationInfo().processName);
    }
}
