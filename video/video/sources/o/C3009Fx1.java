package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;

/* renamed from: o.Fx1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3009Fx1 {
    public static final String a = "PackageManagerCompat";
    public static final String b = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    /* renamed from: o.Fx1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Fx1$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    public static boolean a(PackageManager packageManager) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            z = true;
        } else {
            z = false;
        }
        if (i < 30) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (b(packageManager) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z && (!z2 || !z3)) {
            return false;
        }
        return true;
    }

    public static String b(PackageManager packageManager) {
        String str = null;
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent(b).setData(Uri.fromParts("package", "com.example", null)), 0)) {
            String str2 = resolveInfo.activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    public static InterfaceFutureC8411o11<Integer> c(Context context) {
        ZS1<Integer> A = ZS1.A();
        if (!C9682tD2.a(context)) {
            A.v(0);
            Log.e(a, "User is in locked direct boot mode");
            return A;
        } else if (!a(context.getPackageManager())) {
            A.v(1);
            return A;
        } else {
            int i = context.getApplicationInfo().targetSdkVersion;
            if (i < 30) {
                A.v(0);
                Log.e(a, "Target SDK version below API 30");
                return A;
            }
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 2;
            int i4 = 4;
            if (i2 >= 31) {
                if (a.a(context)) {
                    if (i >= 31) {
                        i4 = 5;
                    }
                    A.v(Integer.valueOf(i4));
                    return A;
                }
                A.v(2);
                return A;
            } else if (i2 == 30) {
                if (a.a(context)) {
                    i3 = 4;
                }
                A.v(Integer.valueOf(i3));
                return A;
            } else {
                final ServiceConnectionC9435sC2 serviceConnectionC9435sC2 = new ServiceConnectionC9435sC2(context);
                A.h4(new Runnable() { // from class: o.Ex1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC9435sC2.this.b();
                    }
                }, Executors.newSingleThreadExecutor());
                serviceConnectionC9435sC2.a(A);
                return A;
            }
        }
    }
}
