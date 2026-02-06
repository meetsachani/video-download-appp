package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;
import o.IT1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
final class WakeLockHolder {
    public static final String a = "com.google.firebase.iid.WakeLockHolder.wakefulintent";
    public static final long b = TimeUnit.MINUTES.toMillis(1);
    public static final Object c = new Object();
    @InterfaceC8710pF0("WakeLockHolder.syncObject")
    public static WakeLock d;

    @IT1(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    public static void b(Intent intent, long j) {
        synchronized (c) {
            try {
                if (d != null) {
                    i(intent, true);
                    d.a(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC8710pF0("WakeLockHolder.syncObject")
    public static void c(Context context) {
        if (d == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            d = wakeLock;
            wakeLock.d(true);
        }
    }

    public static void d(@InterfaceC5670cr1 Intent intent) {
        synchronized (c) {
            try {
                if (d != null && f(intent)) {
                    i(intent, false);
                    d.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @IT1(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    public static void e(Context context) {
        synchronized (c) {
            c(context);
        }
    }

    @InterfaceC5056aJ2
    public static boolean f(@InterfaceC5670cr1 Intent intent) {
        return intent.getBooleanExtra(a, false);
    }

    @IT1(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    public static void g() {
        synchronized (c) {
            d = null;
        }
    }

    @SuppressLint({"TaskMainThread"})
    public static void h(Context context, WithinAppServiceConnection withinAppServiceConnection, final Intent intent) {
        synchronized (c) {
            try {
                c(context);
                boolean f = f(intent);
                i(intent, true);
                if (!f) {
                    d.a(b);
                }
                withinAppServiceConnection.c(intent).e(new OnCompleteListener() { // from class: com.google.firebase.messaging.m
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void a(Task task) {
                        WakeLockHolder.d(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(@InterfaceC5670cr1 Intent intent, boolean z) {
        intent.putExtra(a, z);
    }

    public static ComponentName j(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Intent intent) {
        synchronized (c) {
            try {
                c(context);
                boolean f = f(intent);
                i(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!f) {
                    d.a(b);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
