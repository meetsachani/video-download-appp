package o;

import android.content.pm.PermissionInfo;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class GC1 {

    /* loaded from: classes.dex */
    public static class a {
        public static int a(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        public static int b(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public static int a(PermissionInfo permissionInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(permissionInfo);
        }
        return permissionInfo.protectionLevel & 15;
    }

    public static int b(PermissionInfo permissionInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(permissionInfo);
        }
        return permissionInfo.protectionLevel & (-16);
    }
}
