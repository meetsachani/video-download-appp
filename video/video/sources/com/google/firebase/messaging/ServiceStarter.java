package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayDeque;
import java.util.Queue;
import o.C9273rY;
import o.InterfaceC10389w71;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC8710pF0;
import o.UE;

@KeepForSdk
/* loaded from: classes3.dex */
public class ServiceStarter {
    public static final int e = -1;
    @KeepForSdk
    public static final int f = 500;
    public static final int g = 404;
    public static final int h = 401;
    public static final int i = 402;
    public static final int j = 403;
    public static final String k = "com.google.firebase.MESSAGING_EVENT";
    public static final String l = "wrapped_intent";
    public static final String m = "this should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    public static ServiceStarter n;
    @InterfaceC8710pF0("this")
    @InterfaceC11300zs1
    public String a = null;
    public Boolean b = null;
    public Boolean c = null;
    public final Queue<Intent> d = new ArrayDeque();

    private ServiceStarter() {
    }

    public static synchronized ServiceStarter b() {
        ServiceStarter serviceStarter;
        synchronized (ServiceStarter.class) {
            try {
                if (n == null) {
                    n = new ServiceStarter();
                }
                serviceStarter = n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return serviceStarter;
    }

    @InterfaceC5056aJ2
    public static void g(ServiceStarter serviceStarter) {
        n = serviceStarter;
    }

    public final int a(Context context, Intent intent) {
        ComponentName startService;
        String f2 = f(context, intent);
        if (f2 != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + f2);
            }
            intent.setClassName(context.getPackageName(), f2);
        }
        try {
            if (e(context)) {
                startService = WakeLockHolder.j(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                return g;
            }
            return -1;
        } catch (IllegalStateException e2) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e2);
            return 402;
        } catch (SecurityException e3) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e3);
            return 401;
        }
    }

    @InterfaceC10389w71
    public Intent c() {
        return this.d.poll();
    }

    public boolean d(Context context) {
        boolean z;
        if (this.c == null) {
            if (context.checkCallingOrSelfPermission(C9273rY.b) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.c = Boolean.valueOf(z);
        }
        if (!this.b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.c.booleanValue();
    }

    public boolean e(Context context) {
        boolean z;
        if (this.b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.b = Boolean.valueOf(z);
        }
        if (!this.b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.b.booleanValue();
    }

    @InterfaceC11300zs1
    public final synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(UE.h)) {
                        this.a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.a = serviceInfo.name;
                    }
                    return this.a;
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + RemoteSettings.i + serviceInfo.name);
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @InterfaceC10389w71
    public int h(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.d.offer(intent);
        Intent intent2 = new Intent(k);
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
