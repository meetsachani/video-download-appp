package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: o.Kd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3420Kd {
    public static final String a = "AppVersionSignature";
    public static final ConcurrentMap<String, InterfaceC6575gX0> b = new ConcurrentHashMap();

    public static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(a, "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }

    public static String b(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    public static InterfaceC6575gX0 c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, InterfaceC6575gX0> concurrentMap = b;
        InterfaceC6575gX0 interfaceC6575gX0 = concurrentMap.get(packageName);
        if (interfaceC6575gX0 == null) {
            InterfaceC6575gX0 d = d(context);
            InterfaceC6575gX0 putIfAbsent = concurrentMap.putIfAbsent(packageName, d);
            if (putIfAbsent == null) {
                return d;
            }
            return putIfAbsent;
        }
        return interfaceC6575gX0;
    }

    public static InterfaceC6575gX0 d(Context context) {
        return new C7874lt1(b(a(context)));
    }

    public static void e() {
        b.clear();
    }
}
