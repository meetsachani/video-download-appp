package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.ServiceStarter;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.D6;
import o.InterfaceC5056aJ2;
import o.InterfaceC8710pF0;

@KeepForSdk
/* loaded from: classes3.dex */
public class FcmBroadcastProcessor {
    public static final String c = "rawData";
    public static final String d = "gcm.rawData64";
    public static final Object e = new Object();
    @InterfaceC8710pF0("lock")
    public static WithinAppServiceConnection f;
    public final Context a;
    public final Executor b;

    public FcmBroadcastProcessor(Context context) {
        this.a = context;
        this.b = new D6();
    }

    public static /* synthetic */ Task a(Context context, Intent intent, boolean z, Task task) {
        if (PlatformVersion.n() && ((Integer) task.r()).intValue() == 402) {
            return e(context, intent, z).n(new D6(), new Continuation() { // from class: o.Cn0
                @Override // com.google.android.gms.tasks.Continuation
                public final Object a(Task task2) {
                    return FcmBroadcastProcessor.d(task2);
                }
            });
        }
        return task;
    }

    public static /* synthetic */ Integer c(Task task) {
        return -1;
    }

    public static /* synthetic */ Integer d(Task task) {
        return 403;
    }

    public static Task<Integer> e(Context context, Intent intent, boolean z) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        WithinAppServiceConnection f2 = f(context, ServiceStarter.k);
        if (z) {
            if (ServiceStarter.b().e(context)) {
                WakeLockHolder.h(context, f2, intent);
            } else {
                f2.c(intent);
            }
            return Tasks.g(-1);
        }
        return f2.c(intent).n(new D6(), new Continuation() { // from class: o.Fn0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task) {
                return FcmBroadcastProcessor.c(task);
            }
        });
    }

    public static WithinAppServiceConnection f(Context context, String str) {
        WithinAppServiceConnection withinAppServiceConnection;
        synchronized (e) {
            try {
                if (f == null) {
                    f = new WithinAppServiceConnection(context, str);
                }
                withinAppServiceConnection = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return withinAppServiceConnection;
    }

    @InterfaceC5056aJ2
    public static void h() {
        synchronized (e) {
            f = null;
        }
    }

    @InterfaceC5056aJ2
    public static void i(WithinAppServiceConnection withinAppServiceConnection) {
        synchronized (e) {
            f = withinAppServiceConnection;
        }
    }

    @KeepForSdk
    public Task<Integer> g(Intent intent) {
        String stringExtra = intent.getStringExtra(d);
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(d);
        }
        return j(this.a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> j(final Context context, final Intent intent) {
        boolean z;
        final boolean z2 = false;
        if (PlatformVersion.n() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        } else {
            z = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z2 = true;
        }
        if (z && !z2) {
            return e(context, intent, z2);
        }
        return Tasks.d(this.b, new Callable() { // from class: o.Dn0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(ServiceStarter.b().h(context, intent));
                return valueOf;
            }
        }).p(this.b, new Continuation() { // from class: o.En0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task) {
                return FcmBroadcastProcessor.a(context, intent, z2, task);
            }
        });
    }

    public FcmBroadcastProcessor(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }
}
