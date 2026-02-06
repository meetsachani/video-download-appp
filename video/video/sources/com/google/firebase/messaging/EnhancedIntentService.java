package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.messaging.WithinAppServiceBinder;
import java.util.concurrent.ExecutorService;
import o.D6;
import o.InterfaceC10389w71;
import o.InterfaceC2591Bt;
import o.InterfaceC5056aJ2;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes3.dex */
public abstract class EnhancedIntentService extends Service {
    public static final long a1 = 20;
    public static final String b1 = "EnhancedIntentService";
    public Binder Y;
    public int Y0;
    @InterfaceC5056aJ2
    public final ExecutorService X = FcmExecutors.e();
    public final Object Z = new Object();
    public int Z0 = 0;

    public static /* synthetic */ void a(EnhancedIntentService enhancedIntentService, Intent intent, TaskCompletionSource taskCompletionSource) {
        enhancedIntentService.getClass();
        try {
            enhancedIntentService.f(intent);
        } finally {
            taskCompletionSource.c(null);
        }
    }

    public final void d(Intent intent) {
        if (intent != null) {
            WakeLockHolder.d(intent);
        }
        synchronized (this.Z) {
            try {
                int i = this.Z0 - 1;
                this.Z0 = i;
                if (i == 0) {
                    i(this.Y0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Intent e(Intent intent) {
        return intent;
    }

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    @InterfaceC10389w71
    public final Task<Void> h(final Intent intent) {
        if (g(intent)) {
            return Tasks.g(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.X.execute(new Runnable() { // from class: o.cd0
            @Override // java.lang.Runnable
            public final void run() {
                EnhancedIntentService.a(EnhancedIntentService.this, intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.a();
    }

    public boolean i(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(b1, 3)) {
                Log.d(b1, "Service received bind request");
            }
            if (this.Y == null) {
                this.Y = new WithinAppServiceBinder(new WithinAppServiceBinder.IntentHandler() { // from class: com.google.firebase.messaging.EnhancedIntentService.1
                    @Override // com.google.firebase.messaging.WithinAppServiceBinder.IntentHandler
                    @KeepForSdk
                    public Task<Void> a(Intent intent2) {
                        return EnhancedIntentService.this.h(intent2);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.Y;
    }

    @Override // android.app.Service
    @InterfaceC2591Bt
    public void onDestroy() {
        this.X.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.Z) {
            this.Y0 = i2;
            this.Z0++;
        }
        Intent e = e(intent);
        if (e == null) {
            d(intent);
            return 2;
        }
        Task<Void> h = h(e);
        if (h.u()) {
            d(intent);
            return 2;
        }
        h.f(new D6(), new OnCompleteListener() { // from class: o.bd0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void a(Task task) {
                EnhancedIntentService.this.d(intent);
            }
        });
        return 3;
    }
}
