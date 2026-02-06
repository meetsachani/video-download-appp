package o;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

/* renamed from: o.yb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10987yb {
    public static ServiceInfo a(PackageManager packageManager, ComponentName componentName, PackageManager.ComponentInfoFlags componentInfoFlags) throws PackageManager.NameNotFoundException {
        ServiceInfo serviceInfo;
        serviceInfo = packageManager.getServiceInfo(componentName, componentInfoFlags);
        return serviceInfo;
    }

    public static PackageManager.ComponentInfoFlags b(long j) {
        PackageManager.ComponentInfoFlags of;
        of = PackageManager.ComponentInfoFlags.of(j);
        return of;
    }
}
