package o;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class EC1 {
    public static final int a = 0;
    public static final int b = -1;
    public static final int c = -2;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    public static int a(Context context, String str) {
        String str2;
        if (Binder.getCallingPid() == Process.myPid()) {
            str2 = context.getPackageName();
        } else {
            str2 = null;
        }
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int b(Context context, String str, String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int c(Context context, String str, int i, int i2, String str2) {
        int e;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String f = C9534sd.f(str);
        if (f == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid == i2 && C2691Ct1.a(packageName, str2)) {
            e = C9534sd.a(context, i2, f, str2);
        } else {
            e = C9534sd.e(context, f, str2);
        }
        if (e == 0) {
            return 0;
        }
        return -2;
    }

    public static int d(Context context, String str) {
        return c(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
