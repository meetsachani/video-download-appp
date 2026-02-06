package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import o.InterfaceC10571ws1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class ConnectionTracker {
    public static final Object b = new Object();
    @InterfaceC10571ws1
    public static volatile ConnectionTracker c;
    @InterfaceC5056aJ2
    @InterfaceC5670cr1
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    private ConnectionTracker() {
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static ConnectionTracker b() {
        if (c == null) {
            synchronized (b) {
                try {
                    if (c == null) {
                        c = new ConnectionTracker();
                    }
                } finally {
                }
            }
        }
        ConnectionTracker connectionTracker = c;
        Preconditions.r(connectionTracker);
        return connectionTracker;
    }

    public static void f(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public static boolean h(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof zzt);
    }

    public static final boolean i(Context context, Intent intent, ServiceConnection serviceConnection, int i, @InterfaceC10571ws1 Executor executor) {
        boolean bindService;
        if (executor == null) {
            executor = null;
        }
        if (PlatformVersion.p() && executor != null) {
            bindService = context.bindService(intent, i, executor, serviceConnection);
            return bindService;
        }
        return context.bindService(intent, serviceConnection, i);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public boolean a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Intent intent, @InterfaceC5670cr1 ServiceConnection serviceConnection, int i) {
        return g(context, context.getClass().getName(), intent, serviceConnection, i, true, null);
    }

    @KeepForSdk
    public void c(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 ServiceConnection serviceConnection) {
        if (h(serviceConnection) && this.a.containsKey(serviceConnection)) {
            try {
                f(context, (ServiceConnection) this.a.get(serviceConnection));
                return;
            } finally {
                this.a.remove(serviceConnection);
            }
        }
        f(context, serviceConnection);
    }

    @KeepForSdk
    public void d(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 ServiceConnection serviceConnection) {
        try {
            c(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean e(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 Intent intent, @InterfaceC5670cr1 ServiceConnection serviceConnection, int i, @InterfaceC10571ws1 Executor executor) {
        return g(context, str, intent, serviceConnection, 4225, true, executor);
    }

    public final boolean g(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, @InterfaceC10571ws1 Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((Wrappers.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (h(serviceConnection)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.a.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean i2 = i(context, intent, serviceConnection, i, executor);
                if (!i2) {
                    return false;
                }
                return i2;
            } finally {
                this.a.remove(serviceConnection, serviceConnection);
            }
        }
        return i(context, intent, serviceConnection, i, executor);
    }
}
