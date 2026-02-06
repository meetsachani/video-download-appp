package o;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: o.sd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9534sd {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;

    /* renamed from: o.sd$a */
    /* loaded from: classes.dex */
    public static class a {
        public static <T> T a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        public static int c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        public static String d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* renamed from: o.sd$b */
    /* loaded from: classes.dex */
    public static class b {
        public static int a(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        public static String b(Context context) {
            return context.getOpPackageName();
        }

        public static AppOpsManager c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int a(Context context, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager c2 = b.c(context);
            int a2 = b.a(c2, str, Binder.getCallingUid(), str2);
            if (a2 != 0) {
                return a2;
            }
            return b.a(c2, str, i, b.b(context));
        }
        return e(context, str, str2);
    }

    public static int b(Context context, String str, int i, String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOp(str, i, str2);
    }

    public static int c(Context context, String str, int i, String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i, str2);
    }

    public static int d(Context context, String str, String str2) {
        return a.b((AppOpsManager) a.a(context, AppOpsManager.class), str, str2);
    }

    public static int e(Context context, String str, String str2) {
        return a.c((AppOpsManager) a.a(context, AppOpsManager.class), str, str2);
    }

    public static String f(String str) {
        return a.d(str);
    }
}
